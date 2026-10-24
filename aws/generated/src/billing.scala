package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object billing:
  object BillingFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides details about an AWS Billing Views. */
    inline def getViews(args: Endofunction[com.pulumi.aws.billing.inputs.GetViewsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.billing.outputs.GetViewsResult] =
      val argsBuilder = com.pulumi.aws.billing.inputs.GetViewsArgs.builder
      com.pulumi.aws.billing.BillingFunctions.getViews(args(argsBuilder).build)

    /** Provides details about an AWS Billing Views. */
    inline def getViewsPlain(args: Endofunction[com.pulumi.aws.billing.inputs.GetViewsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.billing.outputs.GetViewsResult] =
      val argsBuilder = com.pulumi.aws.billing.inputs.GetViewsPlainArgs.builder
      com.pulumi.aws.billing.BillingFunctions.getViewsPlain(args(argsBuilder).build)

  /** Manages an AWS Billing View. */
  def View(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.billing.ViewArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.billing.ViewArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.billing.View(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
