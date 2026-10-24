package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object dynatrace:
  object DynatraceFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Dynatrace Monitor. */
    inline def getMonitor(args: Endofunction[com.pulumi.azure.dynatrace.inputs.GetMonitorArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.dynatrace.outputs.GetMonitorResult] =
      val argsBuilder = com.pulumi.azure.dynatrace.inputs.GetMonitorArgs.builder
      com.pulumi.azure.dynatrace.DynatraceFunctions.getMonitor(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dynatrace Monitor. */
    inline def getMonitorPlain(args: Endofunction[com.pulumi.azure.dynatrace.inputs.GetMonitorPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.dynatrace.outputs.GetMonitorResult] =
      val argsBuilder = com.pulumi.azure.dynatrace.inputs.GetMonitorPlainArgs.builder
      com.pulumi.azure.dynatrace.DynatraceFunctions.getMonitorPlain(args(argsBuilder).build)

  /** Manages a Dynatrace monitor. */
  def Monitor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dynatrace.MonitorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def TagRules(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dynatrace.TagRulesArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dynatrace.TagRulesArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dynatrace.TagRules(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
