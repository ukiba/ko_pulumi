package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object operationalinsights:
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

  /** Manages a Log Analytics (formally Operational Insights) Workspace. */
  def AnalyticsWorkspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.operationalinsights.AnalyticsWorkspace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.operationalinsights.AnalyticsSolutionArgs.Builder)
    /**
     * @param plan A `plan` block as documented below.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionPlanArgs.Builder]):
        com.pulumi.azure.operationalinsights.AnalyticsSolutionArgs.Builder =
      val argsBuilder = com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.operationalinsights.AnalyticsSolutionArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.operationalinsights.inputs.AnalyticsWorkspaceIdentityArgs.Builder]):
        com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.operationalinsights.inputs.AnalyticsWorkspaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Log Analytics Query Pack Query. */
  def QueryPackQuery(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.operationalinsights.QueryPackQueryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.operationalinsights.QueryPackQueryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.operationalinsights.QueryPackQuery(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.operationalinsights.inputs.AnalyticsWorkspaceState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.operationalinsights.inputs.AnalyticsWorkspaceIdentityArgs.Builder]):
        com.pulumi.azure.operationalinsights.inputs.AnalyticsWorkspaceState.Builder =
      val argsBuilder = com.pulumi.azure.operationalinsights.inputs.AnalyticsWorkspaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.operationalinsights.inputs.AnalyticsWorkspaceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionState.Builder)
    /**
     * @param plan A `plan` block as documented below.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionPlanArgs.Builder]):
        com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionState.Builder =
      val argsBuilder = com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Log Analytics (formally Operational Insights) Solution. */
  def AnalyticsSolution(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.operationalinsights.AnalyticsSolutionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.operationalinsights.AnalyticsSolutionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.operationalinsights.AnalyticsSolution(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
