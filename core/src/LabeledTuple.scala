package jp.ukiba.ko_pulumi

import scala.quoted.*
import scala.reflect.NameTransformer

/** To be used with methods that create resources and return them as tuple */
object LabeledTuple:
  /**
   * It would be neat if [[labeled]] returned [[NamedTuple]], but [[NamedTuple]] fields cannot be imported.
   * Thus we have to implement [[Selectable]].  Call site references its `val`s.
  */
  class Wrapper(val tup: Tuple, val indices: Map[String, Int]) extends Selectable:
    def selectDynamic(name: String): Any = tup.productElement(indices(NameTransformer.decode(name)))

  extension (inline tpl: Tuple)
    /**
     * Converts a tuple expression with identifiers into a Selectable wrapper
     * whose structural refinement members are named after the identifiers,
     * allowing the following code
     *
     *     val w = (foo, bar).labeled
     *     import w.{foo, bar => bar2}
     */
    transparent inline def labeled: Wrapper = ${ labeledImpl('tpl) }

  private def labeledImpl(tplExpr: Expr[Tuple])(using Quotes): Expr[Wrapper] =
    import quotes.reflect.*

    def strip(term: Term): Term =
      term match
        case Inlined(_, _, body) => strip(body)
        case Typed(body, _)      => strip(body)
        case Block(Nil, body)    => strip(body)
        case _                   => term

    val values: List[Term] =
      val term = tplExpr.asTerm
      val stripped = strip(term)
      if stripped.tpe =:= TypeRepr.of[EmptyTuple] then
        report.errorAndAbort(s".labeled expects non-empty tuple expression:\n${term.show}")
      else if !(stripped.tpe <:< TypeRepr.of[Tuple]) then
        report.errorAndAbort(s".labeled expects tuple expression:\n${term.show}")
      else
        stripped match
          case Apply(fun, args) if args.nonEmpty && {
              val method = fun match { case TypeApply(f, _) => f; case f => f }
              method.symbol.name == "apply" && method.symbol.owner.fullName.matches("scala\\.Tuple\\d+\\$?")
            } => args
          case _ => report.errorAndAbort(s".labeled expects tuple expression:\n${term.show}")

    val labels: List[String] = values.map: term =>
      strip(term) match
        case Ident(name)     => name
        case Select(_, name) => name  // label for `obj.foo` is `foo`
        case _ => report.errorAndAbort(s".labeled accepts only identifiers or selections:\n${term.show}")

    // the order is non-deterministic but should be enough for error message
    val duplicatedLabels = labels.groupMapReduce(identity)(_ => 1)(_ + _)
        .collect { case (label, n) if n > 1 => label }
    if duplicatedLabels.nonEmpty then
      report.errorAndAbort(s"duplicate tuple labels: ${duplicatedLabels.mkString(", ")}")

    // Wrapper { def label1: A1; def label2: A2; ... }
    val refined = labels.zip(values.map(_.tpe.widen))
        .foldLeft[TypeRepr](TypeRepr.of[Wrapper]):
          case (acc, (name, info)) => Refinement(acc, name, info)

    val pairExprs = labels.zipWithIndex.map: (name, idx) =>
      Expr.ofTuple((Expr(name), Expr(idx)))
    val indicesExpr: Expr[Map[String, Int]] =
      '{ Map[String, Int](${ Varargs(pairExprs) }*) }

    refined.asType match
      case '[t] =>
        '{ new Wrapper($tplExpr, $indicesExpr).asInstanceOf[t & Wrapper] }

  extension (inline wrapper: Wrapper)
    /**
     * Prefixes every refinement label,
     * allowing the following code
     *
     *     val w = (foo, bar).labeled.prefixed("my-")
     *     import w.*  // or import w.{`my-foo`, `my-bar`}
     */
    transparent inline def prefixed(inline prefix: String): Wrapper =
      ${ prefixedImpl('wrapper, 'prefix) }

  private def prefixedImpl(wrapperExpr: Expr[Wrapper], prefixExpr: Expr[String])
      (using Quotes): Expr[Wrapper] =
    import quotes.reflect.*

    val prefix = prefixExpr.valueOrAbort

    // Refinement is right-nested in the source, but Scala 3 represents nesting
    // with the outermost wrapper at the top; `extractRefinement(parent) :+ ...`
    // restores declaration order.
    def extractRefinement(tpe: TypeRepr): List[(String, TypeRepr)] = tpe match
      case Refinement(parent, name, info) =>
        extractRefinement(parent) :+ (name -> info)
      case _ => Nil

    val tpe = wrapperExpr.asTerm.tpe.widen.dealias
    val members = extractRefinement(tpe)

    if members.isEmpty then
      report.errorAndAbort(
        s".prefixed expects a Wrapper with at least one structural refinement:\n${tpe.show}\n" +
        "This usually means the type was widened to Wrapper somewhere upstream " +
        "(a type ascription on the left hand side, a method return type, or a generic container element type)."
      )

    val prefixedRefined = members.foldLeft[TypeRepr](TypeRepr.of[Wrapper]):
      case (acc, (name, info)) => Refinement(acc, prefix + name, info)

    val pairExprs = members.zipWithIndex.map:
      case ((name, _), idx) => Expr.ofTuple((Expr(prefix + name), Expr(idx)))
    val newIndicesExpr: Expr[Map[String, Int]] =
      '{ Map[String, Int](${ Varargs(pairExprs) }*) }

    prefixedRefined.asType match
      case '[t] =>
        '{ new Wrapper($wrapperExpr.tup, $newIndicesExpr).asInstanceOf[t & Wrapper] }
