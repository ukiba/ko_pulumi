package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object loganalytics:
  /**
   * &gt; **Note:** Log Analytics Clusters are subject to 14-day soft delete policy. Clusters created with the same resource group &amp; name as a previously deleted cluster will be recovered rather than creating anew.
   * 
   * Manages a Log Analytics Cluster.
   */
  inline def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.ClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.loganalytics.ClusterArgs.builder
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
    com.pulumi.azure.loganalytics.Cluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Log Analytics Cluster Customer Managed Key. */
  inline def ClusterCustomerManagedKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.ClusterCustomerManagedKeyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.loganalytics.ClusterCustomerManagedKeyArgs.builder
    com.pulumi.azure.loganalytics.ClusterCustomerManagedKey(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Log Analytics Data Export Rule. */
  inline def DataExportRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.DataExportRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.loganalytics.DataExportRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.loganalytics.DataExportRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Log Analytics Windows Event DataSource. */
  inline def DataSourceWindowsEvent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.DataSourceWindowsEventArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.loganalytics.DataSourceWindowsEventArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.loganalytics.DataSourceWindowsEvent(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Log Analytics (formally Operational Insights) Windows Performance Counter DataSource. */
  inline def DataSourceWindowsPerformanceCounter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.DataSourceWindowsPerformanceCounterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.loganalytics.DataSourceWindowsPerformanceCounterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.loganalytics.DataSourceWindowsPerformanceCounter(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Log Analytics Linked Service. */
  inline def LinkedService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.LinkedServiceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.loganalytics.LinkedServiceArgs.builder
    com.pulumi.azure.loganalytics.LinkedService(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Log Analytics Linked Storage Account. */
  inline def LinkedStorageAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.LinkedStorageAccountArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.loganalytics.LinkedStorageAccountArgs.builder
    com.pulumi.azure.loganalytics.LinkedStorageAccount(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object LoganalyticsFunctions:
    /** Use this data source to access information about an existing Log Analytics Workspace Table. */
    inline def getWorkspaceTable(args: Endofunction[com.pulumi.azure.loganalytics.inputs.GetWorkspaceTableArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.loganalytics.outputs.GetWorkspaceTableResult] =
      val argsBuilder = com.pulumi.azure.loganalytics.inputs.GetWorkspaceTableArgs.builder
      com.pulumi.azure.loganalytics.LoganalyticsFunctions.getWorkspaceTable(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Log Analytics Workspace Table. */
    inline def getWorkspaceTablePlain(args: Endofunction[com.pulumi.azure.loganalytics.inputs.GetWorkspaceTablePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.loganalytics.outputs.GetWorkspaceTableResult] =
      val argsBuilder = com.pulumi.azure.loganalytics.inputs.GetWorkspaceTablePlainArgs.builder
      com.pulumi.azure.loganalytics.LoganalyticsFunctions.getWorkspaceTablePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages a Log Analytics Query Pack. */
  inline def QueryPack(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.QueryPackArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.loganalytics.QueryPackArgs.builder
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
    com.pulumi.azure.loganalytics.QueryPack(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Log Analytics (formally Operational Insights) Saved Search. */
  inline def SavedSearch(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.SavedSearchArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.loganalytics.SavedSearchArgs.builder
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
    com.pulumi.azure.loganalytics.SavedSearch(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Log Analytics Storage Insights resource. */
  inline def StorageInsights(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.StorageInsightsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.loganalytics.StorageInsightsArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.loganalytics.StorageInsights(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Table in a Log Analytics (formally Operational Insights) Workspace.
   * 
   * &gt; **Note:** This resource does not create or destroy tables. This resource is used to update attributes (currently only retention_in_days) of the tables created when a Log Analytics Workspace is created. Deleting an azure.loganalytics.WorkspaceTable resource will not delete the table. Instead, the table&#39;s retentionInDays field will be set to the value of azure.operationalinsights.AnalyticsWorkspace retention_in_days
   */
  inline def WorkspaceTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.WorkspaceTableArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.loganalytics.WorkspaceTableArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.loganalytics.WorkspaceTable(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Custom Log Table in a Log Analytics (formally Operational Insights) Workspace. */
  inline def WorkspaceTableCustomLog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.WorkspaceTableCustomLogArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.loganalytics.WorkspaceTableCustomLogArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.loganalytics.WorkspaceTableCustomLog(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Microsoft Table in a Log Analytics (formally Operational Insights) Workspace. */
  inline def WorkspaceTableMicrosoft(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.loganalytics.WorkspaceTableMicrosoftArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.loganalytics.WorkspaceTableMicrosoftArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.loganalytics.WorkspaceTableMicrosoft(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
