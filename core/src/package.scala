package jp.ukiba

import com.pulumi.core.{Output, Either as PEither}

import scala.jdk.CollectionConverters.*
import scala.jdk.OptionConverters.*
import scala.jdk.FunctionConverters.*
import java.util.{Optional as JOptional, List as JList, Map as JMap}

/** Enhances pulumi-java */
package object ko_pulumi:
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
    private def propagateLogicalName(name: String) = Some(name)
    object PropagateLogicalNameAll extends KoPulumiConf(
      propagateLogicalName,
      propagateLogicalName,
      propagateLogicalName,
    )

  object syntax:
    object all:
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
            case 0 => throw IllegalArgumentException(s"Expected single element: no element")
            case n => throw IllegalArgumentException(s"Expected single element: $n elements")

      // reduce the need to describe the conversions between the Scala and Java/Pulumi types
      given [A] => Conversion[Option[A], JOptional[A]] = _.toJava
      given [A] => Conversion[JOptional[A], Option[A]] = _.toScala

      given [A] => Conversion[Seq[A], JList[A]] = _.asJava
      given [A] => Conversion[JList[A], Seq[A]] = _.asScala.toSeq // immutable

      given [K, V] => Conversion[Map[K, V], JMap[K, V]] = _.asJava
      given [K, V] => Conversion[JMap[K, V], Map[K, V]] = _.asScala.toMap // immutable

      // convert Output[String] to Output[JList[String]]
      // for com.pulumi.ec2.InstanceArgs.builder.vpcSecurityGroupIds
      given [A] => Conversion[Output[A], Output[JList[A]]] = _.map(a => JList.of(a))

      // convert IterableOnce[Output[String] | String] to Output[JList[String, String]]
/*
      given [V <: Matchable] => Conversion[IterableOnce[Output[V] | V], Output[JList[V]]] = list =>
        val builder = Output.ListBuilder[V]()
        list.iterator.foreach: outputOrValue =>
          outputOrValue match
            case output: Output[?] => builder.add(output.asInstanceOf[Output[V]])
            case value             => builder.add(value .asInstanceOf[V])
        builder.build()
*/

      // convert Map[String, Output[String] | String] to Output[JMap[String, String]]
      // for com.pulumi.aws.lambda.inputs.FunctionEnvironmentArgs.Builder.variables
      given [V <: Matchable] => Conversion[Map[String, Output[V] | V], Output[JMap[String, V]]] = map =>
        val builder = Output.MapBuilder[V]()
        map.foreach: (key, outputOrValue) =>
          outputOrValue match
            case output: Output[?] => builder.put(key, output.asInstanceOf[Output[V]])
            case value             => builder.put(key, value .asInstanceOf[V])
        builder.build()

      given [A, B] => Conversion[Either[A, B], PEither[A, B]] = _ match
        case Left(left)   => PEither.ofLeft(left)
        case Right(right) => PEither.ofRight(right)

  import syntax.all.*

  // helper to transform builder.build.tags to be passed to builder.tags
  def transformOptOutputMap[A, B](orig: JOptional[Output[JMap[A, B]]], fn: Map[A, B] => Map[A, B]):
      Output[JMap[A, B]] =
    orig.toScala match
      case Some(output) => output.map(value => fn(value.asScala.toMap).asJava)
      case None         => Output.of(fn(Map.empty).asJava)
