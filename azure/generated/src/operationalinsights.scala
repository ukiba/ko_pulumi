package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object operationalinsights:
  /** Manages a Log Analytics (formally Operational Insights) Solution. */
  def AnalyticsSolution(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.operationalinsights.AnalyticsSolutionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.operationalinsights.AnalyticsSolutionArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.operationalinsights.AnalyticsSolution(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Log Analytics (formally Operational Insights) Workspace. */
  def AnalyticsWorkspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs.builder
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
    com.pulumi.azure.operationalinsights.AnalyticsWorkspace(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object OperationalinsightsFunctions:
    /** Use this data source to access information about an existing Log Analytics (formally Operational Insights) Workspace. */
    inline def getAnalyticsWorkspace(args: Endofunction[com.pulumi.azure.operationalinsights.inputs.GetAnalyticsWorkspaceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.operationalinsights.outputs.GetAnalyticsWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.operationalinsights.inputs.GetAnalyticsWorkspaceArgs.builder
      com.pulumi.azure.operationalinsights.OperationalinsightsFunctions.getAnalyticsWorkspace(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Log Analytics (formally Operational Insights) Workspace. */
    inline def getAnalyticsWorkspacePlain(args: Endofunction[com.pulumi.azure.operationalinsights.inputs.GetAnalyticsWorkspacePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.operationalinsights.outputs.GetAnalyticsWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.operationalinsights.inputs.GetAnalyticsWorkspacePlainArgs.builder
      com.pulumi.azure.operationalinsights.OperationalinsightsFunctions.getAnalyticsWorkspacePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages a Log Analytics Query Pack Query. */
  def QueryPackQuery(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.operationalinsights.QueryPackQueryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.operationalinsights.QueryPackQueryArgs.builder
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
    com.pulumi.azure.operationalinsights.QueryPackQuery(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
