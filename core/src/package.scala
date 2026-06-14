package jp.ukiba.ko_pulumi

import com.pulumi.core.{Output, Either as PEither}

import scala.jdk.CollectionConverters.*
import scala.jdk.OptionConverters.*
import scala.jdk.FunctionConverters.*
import scala.annotation.targetName
import scala.util.NotGiven
import java.util.{Optional as JOptional, List as JList, Map as JMap, Collections as JCollections}

// Enhances pulumi-java for Scala

type Endofunction[A] = Function1[A, A]  // TODO this does not belong here

case class KoPulumiConf(
  defaultProtect: Boolean = false,

  // logicalName is the first argument to resource class constructor
  logicalName2physicalName: String => Option[String] = _ => None,
  logicalName2tagName     : String => Option[String] = _ => None,

  // avoid com.pulumi.exceptions.MissingRequiredPropertyException: Missing required property 'family when constructing 'TaskDefinitionArgs'
  logicalName2ecsTaskDefinitionFamily: String => Option[String] = _ => None,  // TODO maybe factor out to aws
)

object KoPulumiConf:
  private def propagateLogicalName(name: String) = Some(name)
  val PropagateLogicalNameAll = KoPulumiConf(
    logicalName2physicalName            = propagateLogicalName,
    logicalName2tagName                 = propagateLogicalName,
    logicalName2ecsTaskDefinitionFamily = propagateLogicalName,
  )

object syntax:
  trait LowPriorityImplicits:
    // convert Seq[Output[String] | String] to Output[JList[String]]
    given [A <: Matchable] => NotGiven[A <:< Output[?]]  // compile error when A is Output
        => Conversion[IterableOnce[Output[A] | A], Output[JList[A]]] = seq =>
      val builder = Output.ListBuilder[A]()
      seq.iterator.foreach: outputOrValue =>
        outputOrValue match
          case output: Output[?] => builder.add(output.asInstanceOf[Output[A]])
          case value             => builder.add(value .asInstanceOf[A])
      builder.build()

    // convert Map[String, Output[String] | String] to Output[JMap[String, String]]
    // e.g., for com.pulumi.aws.lambda.inputs.FunctionEnvironmentArgs.Builder.variables and similar
    given [V <: Matchable] => NotGiven[V <:< Output[?]]  // compile error when V is Output
        => Conversion[Map[String, Output[V] | V], Output[JMap[String, V]]] = map =>
      val builder = Output.MapBuilder[V]()
      map.foreach: (key, outputOrValue) =>
        outputOrValue match
          case output: Output[?] => builder.put(key, output.asInstanceOf[Output[V]])
          case value             => builder.put(key, value .asInstanceOf[V])
      builder.build()

  object all extends LowPriorityImplicits:
    // methods for "for comprehension" with Output
    extension [A](output: Output[A])
      def flatMap[B](f: A => Output[B]): Output[B] = output.apply     (f.asJava)
      def map    [B](f: A => B)        : Output[B] = output.applyValue(f.asJava)

      // foreach is not implemented (not needed when `yield` is always used)
      // since Pulumi doesn't guarantee the evaluation when the result of `apply` is discarded
      //
      // withFilter is not implemented: filtering has no meaning for Output (a value can't be dropped),
      // so `if` guards and refutable patterns in a for-comprehension are intentionally a compile error.

    // TODO: this probably doesn't belong here
    /* commented out for now (not sure this needs to exist)
    extension [A](value: A)
      /**
       * Discards a value.
       * Intended to be used with `-Wnonunit-statement` compiler option
       * to enable `A pure expression does nothing in statement position` warning.
       * The method name `void` follows `cats` library.
       */
      inline def void: Unit = ()

      inline def asLeft [B]: Either[A, B] = Left (value)
      inline def asRight[B]: Either[B, A] = Right(value)
    */

    extension [A](list: JList[A])
      // the same name as fs2.Stream.CompileOps.onlyOrError
      def onlyOrError: A =
        list.size match
          case 1 => list.get(0)
          case 0 => throw IllegalArgumentException(s"Expected single element: no element")
          case n => throw IllegalArgumentException(s"Expected single element: $n elements")

    extension [K <: AnyRef, V](ite: IterableOnce[(K, V)])
      def toIdentityOrderedMap = IdentityOrderedMap.from(ite)

    // reduce the need to describe the conversions between the Scala and Java/Pulumi types
    given [A] => Conversion[Option[A], JOptional[A]] = _.toJava
    given [A] => Conversion[JOptional[A], Option[A]] = _.toScala

    given [A] => Conversion[Seq[A], JList[A]] = _.asJava
    given [A] => Conversion[JList[A], Seq[A]] = _.asScala.toSeq // immutable

    // Conversion[Map[K, V], JMap[K, V]] is not implemented
    // since it will conflict with Conversion[Map[String, Output[V]], Output[JMap[String, V]]]
    given [K, V] => Conversion[JMap[K, V], Map[K, V]] = _.asScala.toMap // immutable

    // conversion in Output domain
    @targetName("given_Conversion_OutputOption_OutputJOptional")
    given [A] => Conversion[Output[Option[A]], Output[JOptional[A]]] = _.map(_.toJava)

    @targetName("given_Conversion_OutputSeq_OutputJList")
    given [A] => Conversion[Output[Seq[A]], Output[JList[A]]] = _.map(_.asJava)

    @targetName("given_Conversion_OutputMap_OutputJMap")
    given [K, V] => Conversion[Output[Map[K, V]], Output[JMap[K, V]]] = _.map(_.asJava)

    // Wrap a single Output[A] as a 1-element Output[JList[A]].
    // Intentionally broad: only fires when none of the more-specific conversions
    // above (Output[Seq[A]], IterableOnce[Output[A] | A], identity Output[JList[A]])
    // match — i.e. when the call site genuinely has one value and the builder
    // wants a list. Common for: vpcSecurityGroupIds, cidrBlocks, securityGroups,
    // ListenerRule values, ECS securityGroups, and similar single-element list inputs.
    @targetName("given_Conversion_Output_OutputJList")
    given [A] => Conversion[Output[A], Output[JList[A]]] = _.map: a =>
      JCollections.singletonList(a)  // JList.of(a) throws when a is null

    // convert Seq[Output[A]] to Output[JList[A]].
    @targetName("given_Conversion_SeqOutput_OutputJList")
    given [A] => Conversion[IterableOnce[Output[A]], Output[JList[A]]] = seq =>
      val builder = Output.ListBuilder[A]()
      seq.iterator.foreach: output =>
        builder.add(output)
      builder.build()

    // convert Map[String, Output[V]] to Output[JMap[String, V]].
    // Kept more specific than the union conversion in LowPriorityImplicits (see above):
    // a homogeneous Map[String, Output[V]] resolves here with V pinned exactly.
    @targetName("given_Conversion_MapOutput_OutputJMap")
    given [V] => Conversion[Map[String, Output[V]], Output[JMap[String, V]]] = map =>
      val builder = Output.MapBuilder[V]()
      map.foreach: (key, output) =>
        builder.put(key, output)
      builder.build()

    given [A, B] => Conversion[Either[A, B], PEither[A, B]] = _ match
      case Left(left)   => PEither.ofLeft(left)
      case Right(right) => PEither.ofRight(right)

    // convert Output[Left[String], Nothing] to Output[PEither[String, PolicyDocumentArgs]]
    // for com.pulumi.aws.s3.BucketPolicyArgs.policy and similar
    @targetName("given_Conversion_OutputLeft_OutputEither")
    given [A, B] => Conversion[Output[Left[A, B]], Output[PEither[A, B]]] =
      _.map(left => PEither.ofLeft(left.value))

    @targetName("given_Conversion_OutputRight_OutputEither")
    given [A, B] => Conversion[Output[Right[A, B]], Output[PEither[A, B]]] =
      _.map(right => PEither.ofRight(right.value))

import syntax.all.*

// helper to transform builder.build.tags to be passed to builder.tags
def transformOptOutputMap[A, B](orig: JOptional[Output[JMap[A, B]]], fn: Map[A, B] => Map[A, B]):
    Output[JMap[A, B]] =
  orig.toScala match
    case Some(output) => output.map(value => fn(value.asScala.toMap).asJava)
    case None         => Output.of(fn(Map.empty).asJava)

// com.pulumi.aws.inspector.ResourceGroupArgs.tags returns
// Output<Map<String,String>> rather than
// Optional<Output<Map<String,String>>> unlike other tags method
def transformOptOutputMap[A, B](orig: Output[JMap[A, B]], fn: Map[A, B] => Map[A, B]):
    Output[JMap[A, B]] =
  orig.map(value => fn(value.asScala.toMap).asJava)
