package jp.ukiba.ko_pulumi

import scala.quoted.*

/** Intended to help calling a function to create resources and get names that match the resource names */
object NamedTupleMacro:
  extension (inline tpl: Tuple)
    /**
     * Converts a tuple expression with identifiers into a named tuple,
     * allowing the following code
     *
     *     val namedTuple = (foo, bar).named
     *     import namedTuple.{foo, bar => bar2}
     */
    transparent inline def named: NamedTuple.AnyNamedTuple = ${ namedImpl('tpl) }

  private def namedImpl(tplExpr: Expr[Tuple])(using Quotes): Expr[NamedTuple.AnyNamedTuple] =
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
        report.errorAndAbort(s".named expects non-empty tuple expression:\n${term.show}")
      else if !(stripped.tpe <:< TypeRepr.of[Tuple]) then
        report.errorAndAbort(s".named expects tuple expression:\n${term.show}")
      else
        stripped match
          case Apply(fun, args) if args.nonEmpty && {
              val method = fun match { case TypeApply(f, _) => f; case f => f }
              method.symbol.name == "apply" && method.symbol.owner.fullName.matches("scala\\.Tuple\\d+\\$?")
            } => args
          case _ => report.errorAndAbort(s".named expects tuple expression:\n${term.show}")

    val labels: List[String] = values.map: term =>
      strip(term) match
        case Ident(name)     => name
        case Select(_, name) => name  // label for `obj.foo` is `foo`
        case stripped => report.errorAndAbort(s".named accepts only identifiers or selections:\n${term.show}")

    // the order is non-deterministic; should be enough for error message
    val duplicatedLabels = labels.groupMapReduce(identity)(_ => 1)(_ + _)
        .collect { case (label, n) if n > 1 => label }
    if duplicatedLabels.nonEmpty then
      report.errorAndAbort(s"duplicate tuple labels: ${duplicatedLabels.mkString(", ")}")

    def tupleType(elems: List[TypeRepr]): TypeRepr =
      elems.foldRight(TypeRepr.of[EmptyTuple]): (head, tail) =>
        AppliedType(TypeRepr.of[*:], List(head, tail))

    val namesTpe : TypeRepr = tupleType(labels.map(label => ConstantType(StringConstant(label))))
    val valuesTpe: TypeRepr = tupleType(values.map(_.tpe.widen))

    namesTpe.asType match
      case '[names] =>
        valuesTpe.asType match
          case '[values] =>
            '{ $tplExpr.asInstanceOf[scala.NamedTuple.NamedTuple[names & Tuple, values & Tuple]] }

  extension (inline tpl: NamedTuple.AnyNamedTuple)
    /**
     * Prefixes the names of a named tuple,
     * allowing the following code
     *
     *     (foo, bar).named.prefixed("my-")
     */
    transparent inline def prefixed(inline prefix: String): NamedTuple.AnyNamedTuple =
      ${ prefixedImpl('tpl, 'prefix) }

  private def prefixedImpl(tplExpr: Expr[NamedTuple.AnyNamedTuple], prefixExpr: Expr[String])
      (using Quotes): Expr[NamedTuple.AnyNamedTuple] =
    import quotes.reflect.*

    val prefix = prefixExpr.valueOrAbort

    def stripTupleBound(t: TypeRepr): TypeRepr = t.dealias match
      case AndType(left, right) if right =:= TypeRepr.of[Tuple] => left .dealias
      case AndType(left, right) if left  =:= TypeRepr.of[Tuple] => right.dealias
      case other => other

    def tupleLabels(tpe0: TypeRepr): List[String] =
      stripTupleBound(tpe0) match
        case tpe if tpe =:= TypeRepr.of[EmptyTuple] => Nil
        case AppliedType(_, List(ConstantType(StringConstant(label)), tail)) =>
          label :: tupleLabels(tail)
        case other => report.errorAndAbort(s"expected named tuple label tuple:\n${other.show}")

    def tupleType(elems: List[TypeRepr]): TypeRepr =  // duplicated because this needs quotes
      elems.foldRight(TypeRepr.of[EmptyTuple]): (head, tail) =>
        head.asType match
          case '[h] =>
            tail.asType match
              case '[t] => TypeRepr.of[h *: (t & Tuple)]

    val tplTpe = tplExpr.asTerm.tpe.widen.dealias
    tplTpe match
      case AppliedType(cons, List(namesArg, valuesArg)) =>
        val labels = tupleLabels(namesArg)
        val prefixedNamesTpe =
          tupleType(labels.map(l => ConstantType(StringConstant(prefix + l))))
        cons.appliedTo(List(prefixedNamesTpe, valuesArg)).asType match
          case '[t] => '{ $tplExpr.asInstanceOf[t & scala.NamedTuple.AnyNamedTuple] }
      case _ =>
        report.errorAndAbort(s".prefixed expects a NamedTuple[N, V] type:\n${tplTpe.show}\n" +
          "This usually means the type was widened to AnyNamedTuple somewhere upstream " +
          "(a type ascription on the left hand side, a method return type, or a generic container element type).")
