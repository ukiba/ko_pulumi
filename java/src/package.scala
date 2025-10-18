package jp.ukiba

import com.pulumi.core.{Output, Either as PEither}

import scala.jdk.CollectionConverters.*
import scala.jdk.OptionConverters.*
import scala.jdk.FunctionConverters.*
import java.util.{Optional as JOptional, List as JList, Map as JMap}

/** Enhances pulumi-java */
package object ko_pulumi:
  import scala.language.implicitConversions

  // TODO this does not belong here
  type Endofunction[A] = Function1[A, A]

  case class KoPulumiConf(
    // logicalName is the first argument to resource class constructor
    logicalName2pysicalName: String => Option[String] = _ => None,
    logicalName2tagName    : String => Option[String] = _ => None,

    // avoid com.pulumi.exceptions.MissingRequiredPropertyException: Missing required property 'family when constructing 'TaskDefinitionArgs'
    logicalName2ecsTaskDefinitionFamily: String => Option[String] = _ => None,
  )

  object KoPulumiConf:
    private def applyName(name: String) = Some(name)
    object Full extends KoPulumiConf(
      applyName,
      applyName,
      applyName,
    )

  object syntax:
    // familiar method names for Output
    extension [A](output: Output[A])
      def flatMap[B](f: A => Output[B]): Output[B] = output.apply     (f.asJava)
      def map    [B](f: A => B)        : Output[B] = output.applyValue(f.asJava)
      def foreach[B](f: A => B)        : Unit      = output.applyValue(f.asJava)

    // TODO: this probably doesn't belong here
    extension [A](value: A)
      /**
       * Discards a value.
       * Intended to be used with `-Wnonunit-statement` compiler option
       * to enable `A pure expression does nothing in statement position` warning.
       * The method name `void` follows `cats` library.
       */
      inline def void: Unit = ()

    extension [A](list: JList[A])
      // the same name as fs2.Stream.CompileOps.onlyOrError
      def onlyOrError: A =
        list.size match
          case 1 => list.get(0)
          case 0 => throw IllegalArgumentException("Expected single element: no element")
          case n => throw IllegalArgumentException(s"Expected single element: $n elements")
  import syntax.*

  // reduce the need to describe the conversions between the Scala and Java/Pulumi types
  given [A] => Conversion[Option[A], JOptional[A]] = _.toJava
  given [A] => Conversion[JOptional[A], Option[A]] = _.toScala

  given [A] => Conversion[Seq[A], JList[A]] = _.asJava
  given [A] => Conversion[JList[A], Seq[A]] = _.asScala.toSeq // immutable

  given [K, V] => Conversion[Map[K, V], JMap[K, V]] = _.asJava
  given [K, V] => Conversion[JMap[K, V], Map[K, V]] = _.asScala.toMap // immutable

  // convert Output[String] to Output[JList[String]]
  // for ec2.InstanceArgs.builder.vpcSecurityGroupIds
  given [A] => Conversion[Output[A], Output[JList[A]]] = _.map(a => Seq(a))

  given [A, B] => Conversion[Either[A, B], PEither[A, B]] = _ match
    case Left(left)   => PEither.ofLeft(left)
    case Right(right) => PEither.ofRight(right)
/* alternate syntax
  given [A, B] => Conversion[Either[A, B], PEither[A, B]]:
    def apply(either: Either[A, B]) = either match
      case Left(left)   => PEither.ofLeft(left)
      case Right(right) => PEither.ofRight(right)
*/
