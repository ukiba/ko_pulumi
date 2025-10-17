package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object operationalinsights:
  /** Manages a Log Analytics (formally Operational Insights) Solution. */
  def AnalyticsSolution(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.operationalinsights.AnalyticsSolutionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.operationalinsights.AnalyticsSolutionArgs.Builder)
    /**
     * @param plan A `plan` block as documented below.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionPlanArgs.Builder]):
        com.pulumi.azure.operationalinsights.AnalyticsSolutionArgs.Builder =
      val argsBuilder = com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionPlanArgs.builder
      builder.plan(args(argsBuilder).build)

  /** Manages a Log Analytics (formally Operational Insights) Workspace. */
  def AnalyticsWorkspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.operationalinsights.inputs.AnalyticsWorkspaceIdentityArgs.Builder]):
        com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.operationalinsights.inputs.AnalyticsWorkspaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  object OperationalinsightsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Log Analytics (formally Operational Insights) Workspace. */
    inline def getAnalyticsWorkspace(args: Endofunction[com.pulumi.azure.operationalinsights.inputs.GetAnalyticsWorkspaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.operationalinsights.outputs.GetAnalyticsWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.operationalinsights.inputs.GetAnalyticsWorkspaceArgs.builder
      com.pulumi.azure.operationalinsights.OperationalinsightsFunctions.getAnalyticsWorkspace(args(argsBuilder).build)

    /** Use this data source to access information about an existing Log Analytics (formally Operational Insights) Workspace. */
    inline def getAnalyticsWorkspacePlain(args: Endofunction[com.pulumi.azure.operationalinsights.inputs.GetAnalyticsWorkspacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.operationalinsights.outputs.GetAnalyticsWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.operationalinsights.inputs.GetAnalyticsWorkspacePlainArgs.builder
      com.pulumi.azure.operationalinsights.OperationalinsightsFunctions.getAnalyticsWorkspacePlain(args(argsBuilder).build)

  /** Manages a Log Analytics Query Pack Query. */
  def QueryPackQuery(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.operationalinsights.QueryPackQueryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionState.Builder)
    /**
     * @param plan A `plan` block as documented below.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionPlanArgs.Builder]):
        com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionState.Builder =
      val argsBuilder = com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionPlanArgs.builder
      builder.plan(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.operationalinsights.inputs.AnalyticsWorkspaceState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.operationalinsights.inputs.AnalyticsWorkspaceIdentityArgs.Builder]):
        com.pulumi.azure.operationalinsights.inputs.AnalyticsWorkspaceState.Builder =
      val argsBuilder = com.pulumi.azure.operationalinsights.inputs.AnalyticsWorkspaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
