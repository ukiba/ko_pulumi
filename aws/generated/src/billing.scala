package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object billing:
  object BillingFunctions:
    /** Provides details about an AWS Billing Views. */
    inline def getViews(args: Endofunction[com.pulumi.aws.billing.inputs.GetViewsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.billing.outputs.GetViewsResult] =
      val argsBuilder = com.pulumi.aws.billing.inputs.GetViewsArgs.builder
      com.pulumi.aws.billing.BillingFunctions.getViews(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about an AWS Billing Views. */
    inline def getViewsPlain(args: Endofunction[com.pulumi.aws.billing.inputs.GetViewsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.billing.outputs.GetViewsResult] =
      val argsBuilder = com.pulumi.aws.billing.inputs.GetViewsPlainArgs.builder
      com.pulumi.aws.billing.BillingFunctions.getViewsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages an AWS Billing View. */
  inline def View(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.billing.ViewArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)
