package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object loganalytics:
  /** Manages a Log Analytics Cluster Customer Managed Key. */
  def ClusterCustomerManagedKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.ClusterCustomerManagedKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.loganalytics.ClusterCustomerManagedKeyArgs.builder
    com.pulumi.azure.loganalytics.ClusterCustomerManagedKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Log Analytics (formally Operational Insights) Windows Performance Counter DataSource. */
  def DataSourceWindowsPerformanceCounter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.DataSourceWindowsPerformanceCounterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.loganalytics.DataSourceWindowsPerformanceCounterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.loganalytics.DataSourceWindowsPerformanceCounter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Log Analytics Data Export Rule. */
  def DataExportRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.DataExportRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.loganalytics.DataExportRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.loganalytics.DataExportRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Note:** Log Analytics Clusters are subject to 14-day soft delete policy. Clusters created with the same resource group &amp; name as a previously deleted cluster will be recovered rather than creating anew.
   * 
   *  Manages a Log Analytics Cluster.
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.loganalytics.ClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.loganalytics.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Custom Log Table in a Log Analytics (formally Operational Insights) Workspace. */
  def WorkspaceTableCustomLog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.WorkspaceTableCustomLogArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.loganalytics.WorkspaceTableCustomLogArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.loganalytics.WorkspaceTableCustomLog(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.loganalytics.ClusterArgs.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Log Analytics Cluster to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.loganalytics.inputs.ClusterIdentityArgs.Builder]):
        com.pulumi.azure.loganalytics.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.loganalytics.inputs.ClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.loganalytics.ClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Log Analytics Windows Event DataSource. */
  def DataSourceWindowsEvent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.DataSourceWindowsEventArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.loganalytics.DataSourceWindowsEventArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.loganalytics.DataSourceWindowsEvent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.loganalytics.WorkspaceTableCustomLogArgs.Builder)
    /**
     * @param columns One or more `column` blocks as defined below.
     * @return builder
     */
    def columns(args: Endofunction[com.pulumi.azure.loganalytics.inputs.WorkspaceTableCustomLogColumnArgs.Builder]*):
        com.pulumi.azure.loganalytics.WorkspaceTableCustomLogArgs.Builder =
      def argsBuilder = com.pulumi.azure.loganalytics.inputs.WorkspaceTableCustomLogColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

  /** Manages a Log Analytics Linked Service. */
  def LinkedService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.LinkedServiceArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.loganalytics.LinkedServiceArgs.builder
    com.pulumi.azure.loganalytics.LinkedService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Table in a Log Analytics (formally Operational Insights) Workspace.
   * 
   *  &gt; **Note:** This resource does not create or destroy tables. This resource is used to update attributes (currently only retention_in_days) of the tables created when a Log Analytics Workspace is created. Deleting an azure.loganalytics.WorkspaceTable resource will not delete the table. Instead, the table&#39;s retentionInDays field will be set to the value of azure.operationalinsights.AnalyticsWorkspace retention_in_days
   */
  def WorkspaceTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.WorkspaceTableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.loganalytics.WorkspaceTableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.loganalytics.WorkspaceTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Log Analytics Storage Insights resource. */
  def StorageInsights(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.StorageInsightsArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.loganalytics.StorageInsightsArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.loganalytics.StorageInsights(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type LoganalyticsFunctions = com.pulumi.azure.loganalytics.LoganalyticsFunctions
  object LoganalyticsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.loganalytics.LoganalyticsFunctions.*
  extension (self: LoganalyticsFunctions.type)
    /** Use this data source to access information about an existing Log Analytics Workspace Table. */
    def getWorkspaceTable(args: Endofunction[com.pulumi.azure.loganalytics.inputs.GetWorkspaceTableArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.loganalytics.outputs.GetWorkspaceTableResult] =
      val argsBuilder = com.pulumi.azure.loganalytics.inputs.GetWorkspaceTableArgs.builder
      com.pulumi.azure.loganalytics.LoganalyticsFunctions.getWorkspaceTable(args(argsBuilder).build)

    /** Use this data source to access information about an existing Log Analytics Workspace Table. */
    def getWorkspaceTablePlain(args: Endofunction[com.pulumi.azure.loganalytics.inputs.GetWorkspaceTablePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.loganalytics.outputs.GetWorkspaceTableResult] =
      val argsBuilder = com.pulumi.azure.loganalytics.inputs.GetWorkspaceTablePlainArgs.builder
      com.pulumi.azure.loganalytics.LoganalyticsFunctions.getWorkspaceTablePlain(args(argsBuilder).build)

  /** Manages a Log Analytics Query Pack. */
  def QueryPack(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.QueryPackArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.loganalytics.QueryPackArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.loganalytics.QueryPack(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.loganalytics.inputs.ClusterState.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Log Analytics Cluster to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.loganalytics.inputs.ClusterIdentityArgs.Builder]):
        com.pulumi.azure.loganalytics.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.loganalytics.inputs.ClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.loganalytics.inputs.ClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.loganalytics.inputs.WorkspaceTableCustomLogState.Builder)
    /**
     * @param columns One or more `column` blocks as defined below.
     * @return builder
     */
    def columns(args: Endofunction[com.pulumi.azure.loganalytics.inputs.WorkspaceTableCustomLogColumnArgs.Builder]*):
        com.pulumi.azure.loganalytics.inputs.WorkspaceTableCustomLogState.Builder =
      def argsBuilder = com.pulumi.azure.loganalytics.inputs.WorkspaceTableCustomLogColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

    /**
     * @param standardColumns One or more `standardColumn` blocks as defined below.
     * @return builder
     */
    def standardColumns(args: Endofunction[com.pulumi.azure.loganalytics.inputs.WorkspaceTableCustomLogStandardColumnArgs.Builder]*):
        com.pulumi.azure.loganalytics.inputs.WorkspaceTableCustomLogState.Builder =
      def argsBuilder = com.pulumi.azure.loganalytics.inputs.WorkspaceTableCustomLogStandardColumnArgs.builder
      builder.standardColumns(args.map(_(argsBuilder).build)*)

  /** Manages a Log Analytics (formally Operational Insights) Saved Search. */
  def SavedSearch(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.SavedSearchArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.loganalytics.SavedSearchArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.loganalytics.SavedSearch(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Log Analytics Linked Storage Account. */
  def LinkedStorageAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.LinkedStorageAccountArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.loganalytics.LinkedStorageAccountArgs.builder
    com.pulumi.azure.loganalytics.LinkedStorageAccount(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
