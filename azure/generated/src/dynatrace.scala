package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object dynatrace:
  object DynatraceFunctions:
    /** Use this data source to access information about an existing Dynatrace Monitor. */
    inline def getMonitor(args: Endofunction[com.pulumi.azure.dynatrace.inputs.GetMonitorArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.dynatrace.outputs.GetMonitorResult] =
      val argsBuilder = com.pulumi.azure.dynatrace.inputs.GetMonitorArgs.builder
      com.pulumi.azure.dynatrace.DynatraceFunctions.getMonitor(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Dynatrace Monitor. */
    inline def getMonitorPlain(args: Endofunction[com.pulumi.azure.dynatrace.inputs.GetMonitorPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.dynatrace.outputs.GetMonitorResult] =
      val argsBuilder = com.pulumi.azure.dynatrace.inputs.GetMonitorPlainArgs.builder
      com.pulumi.azure.dynatrace.DynatraceFunctions.getMonitorPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages a Dynatrace monitor. */
  inline def Monitor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.dynatrace.MonitorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dynatrace.MonitorArgs.builder
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
    com.pulumi.azure.dynatrace.Monitor(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages Dynatrace tag rules. */
  inline def TagRules(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.dynatrace.TagRulesArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dynatrace.TagRulesArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dynatrace.TagRules(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
