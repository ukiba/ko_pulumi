package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object appintegrations:
  object AppintegrationsFunctions:
    /** Use this data source to get information on an existing AppIntegrations Event Integration. */
    inline def getEventIntegration(args: Endofunction[com.pulumi.aws.appintegrations.inputs.GetEventIntegrationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.appintegrations.outputs.GetEventIntegrationResult] =
      val argsBuilder = com.pulumi.aws.appintegrations.inputs.GetEventIntegrationArgs.builder
      com.pulumi.aws.appintegrations.AppintegrationsFunctions.getEventIntegration(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information on an existing AppIntegrations Event Integration. */
    inline def getEventIntegrationPlain(args: Endofunction[com.pulumi.aws.appintegrations.inputs.GetEventIntegrationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appintegrations.outputs.GetEventIntegrationResult] =
      val argsBuilder = com.pulumi.aws.appintegrations.inputs.GetEventIntegrationPlainArgs.builder
      com.pulumi.aws.appintegrations.AppintegrationsFunctions.getEventIntegrationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Provides an Amazon AppIntegrations Data Integration resource. */
  inline def DataIntegration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appintegrations.DataIntegrationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appintegrations.DataIntegrationArgs.builder
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
    com.pulumi.aws.appintegrations.DataIntegration(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
