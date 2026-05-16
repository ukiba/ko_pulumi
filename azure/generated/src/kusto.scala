package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object kusto:
  /** Manages a Kusto Cluster Principal Assignment. */
  def ClusterPrincipalAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.kusto.ClusterPrincipalAssignmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.kusto.ClusterPrincipalAssignmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.kusto.ClusterPrincipalAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Kusto (also known as Azure Data Explorer) EventHub Data Connection */
  def EventhubDataConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.kusto.EventhubDataConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.kusto.EventhubDataConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.kusto.EventhubDataConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Customer Managed Key for a Kusto Cluster. */
  def ClusterCustomerManagedKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.kusto.ClusterCustomerManagedKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.kusto.ClusterCustomerManagedKeyArgs.builder
    com.pulumi.azure.kusto.ClusterCustomerManagedKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Kusto (also known as Azure Data Explorer) Attached Database Configuration */
  def AttachedDatabaseConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.kusto.AttachedDatabaseConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.kusto.AttachedDatabaseConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.kusto.AttachedDatabaseConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Kusto (also known as Azure Data Explorer) Database
   * 
   *  !&gt; **Note:** To mitigate the possibility of accidental data loss it is highly recommended that you use the `preventDestroy` lifecycle argument in your configuration file for this resource. For more information on the `preventDestroy` lifecycle argument please see the terraform documentation.
   */
  def Database(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.kusto.DatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.kusto.DatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.kusto.Database(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Managed Private Endpoint for a Kusto Cluster. */
  def ClusterManagedPrivateEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.kusto.ClusterManagedPrivateEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.kusto.ClusterManagedPrivateEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.kusto.ClusterManagedPrivateEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Kusto (also known as Azure Data Explorer) Cluster */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.kusto.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.kusto.ClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.kusto.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Kusto (also known as Azure Data Explorer) Event Grid Data Connection */
  def EventGridDataConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.kusto.EventGridDataConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.kusto.EventGridDataConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.kusto.EventGridDataConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object KustoFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Kusto (also known as Azure Data Explorer) Cluster */
    inline def getCluster(args: Endofunction[com.pulumi.azure.kusto.inputs.GetClusterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.kusto.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.azure.kusto.inputs.GetClusterArgs.builder
      com.pulumi.azure.kusto.KustoFunctions.getCluster(args(argsBuilder).build)

    /** Use this data source to access information about an existing Kusto (also known as Azure Data Explorer) Cluster */
    inline def getClusterPlain(args: Endofunction[com.pulumi.azure.kusto.inputs.GetClusterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.kusto.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.azure.kusto.inputs.GetClusterPlainArgs.builder
      com.pulumi.azure.kusto.KustoFunctions.getClusterPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Kusto Database */
    inline def getDatabase(args: Endofunction[com.pulumi.azure.kusto.inputs.GetDatabaseArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.kusto.outputs.GetDatabaseResult] =
      val argsBuilder = com.pulumi.azure.kusto.inputs.GetDatabaseArgs.builder
      com.pulumi.azure.kusto.KustoFunctions.getDatabase(args(argsBuilder).build)

    /** Use this data source to access information about an existing Kusto Database */
    inline def getDatabasePlain(args: Endofunction[com.pulumi.azure.kusto.inputs.GetDatabasePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.kusto.outputs.GetDatabaseResult] =
      val argsBuilder = com.pulumi.azure.kusto.inputs.GetDatabasePlainArgs.builder
      com.pulumi.azure.kusto.KustoFunctions.getDatabasePlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.kusto.ClusterArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.kusto.inputs.ClusterIdentityArgs.Builder]):
        com.pulumi.azure.kusto.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.kusto.inputs.ClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param languageExtension A `languageExtension` block as defined below.
     * @return builder
     */
    def languageExtension(args: Endofunction[com.pulumi.azure.kusto.inputs.ClusterLanguageExtensionArgs.Builder]*):
        com.pulumi.azure.kusto.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.kusto.inputs.ClusterLanguageExtensionArgs.builder
      builder.languageExtension(args.map(_(argsBuilder).build)*)

    /**
     * @return builder
     * @deprecated `languageExtensions` has been deprecated in favour of `languageExtension` and will be removed in v5.0 of the AzureRM provider
     */
    @deprecated def languageExtensions(args: Endofunction[com.pulumi.azure.kusto.inputs.ClusterLanguageExtensionArgs.Builder]*):
        com.pulumi.azure.kusto.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.kusto.inputs.ClusterLanguageExtensionArgs.builder
      builder.languageExtensions(args.map(_(argsBuilder).build)*)

    /**
     * @param optimizedAutoScale An `optimizedAutoScale` block as defined below.
     * @return builder
     */
    def optimizedAutoScale(args: Endofunction[com.pulumi.azure.kusto.inputs.ClusterOptimizedAutoScaleArgs.Builder]):
        com.pulumi.azure.kusto.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.kusto.inputs.ClusterOptimizedAutoScaleArgs.builder
      builder.optimizedAutoScale(args(argsBuilder).build)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.kusto.inputs.ClusterSkuArgs.Builder]):
        com.pulumi.azure.kusto.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.kusto.inputs.ClusterSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    /**
     * @return builder
     * @deprecated The `virtualNetworkConfiguration` block has been deprecated as it is no longer supported by Azure and will be removed in v5.0 of the AzureRM Provider - for more information see https://techcommunity.microsoft.com/blog/azuredataexplorer/deprecation-of-virtual-network-injection-for-azure-data-explorer/4198192
     */
    @deprecated def virtualNetworkConfiguration(args: Endofunction[com.pulumi.azure.kusto.inputs.ClusterVirtualNetworkConfigurationArgs.Builder]):
        com.pulumi.azure.kusto.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.kusto.inputs.ClusterVirtualNetworkConfigurationArgs.builder
      builder.virtualNetworkConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.kusto.ClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Kusto (also known as Azure Data Explorer) Database Principal Assignment. */
  def DatabasePrincipalAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.kusto.DatabasePrincipalAssignmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.kusto.DatabasePrincipalAssignmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.kusto.DatabasePrincipalAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Kusto (also known as Azure Data Explorer) IotHub Data Connection */
  def IotHubDataConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.kusto.IotHubDataConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.kusto.IotHubDataConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.kusto.IotHubDataConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.kusto.AttachedDatabaseConfigurationArgs.Builder)
    /**
     * @param sharing A `sharing` block as defined below.
     * @return builder
     */
    def sharing(args: Endofunction[com.pulumi.azure.kusto.inputs.AttachedDatabaseConfigurationSharingArgs.Builder]):
        com.pulumi.azure.kusto.AttachedDatabaseConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.kusto.inputs.AttachedDatabaseConfigurationSharingArgs.builder
      builder.sharing(args(argsBuilder).build)

  /** Manages a Kusto Script. */
  def Script(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.kusto.ScriptArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.kusto.ScriptArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.kusto.Script(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Kusto / Cosmos Database Data Connection. */
  def CosmosdbDataConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.kusto.CosmosdbDataConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.kusto.CosmosdbDataConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.kusto.CosmosdbDataConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.kusto.inputs.ClusterState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.kusto.inputs.ClusterIdentityArgs.Builder]):
        com.pulumi.azure.kusto.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.kusto.inputs.ClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param languageExtension A `languageExtension` block as defined below.
     * @return builder
     */
    def languageExtension(args: Endofunction[com.pulumi.azure.kusto.inputs.ClusterLanguageExtensionArgs.Builder]*):
        com.pulumi.azure.kusto.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.azure.kusto.inputs.ClusterLanguageExtensionArgs.builder
      builder.languageExtension(args.map(_(argsBuilder).build)*)

    /**
     * @return builder
     * @deprecated `languageExtensions` has been deprecated in favour of `languageExtension` and will be removed in v5.0 of the AzureRM provider
     */
    @deprecated def languageExtensions(args: Endofunction[com.pulumi.azure.kusto.inputs.ClusterLanguageExtensionArgs.Builder]*):
        com.pulumi.azure.kusto.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.azure.kusto.inputs.ClusterLanguageExtensionArgs.builder
      builder.languageExtensions(args.map(_(argsBuilder).build)*)

    /**
     * @param optimizedAutoScale An `optimizedAutoScale` block as defined below.
     * @return builder
     */
    def optimizedAutoScale(args: Endofunction[com.pulumi.azure.kusto.inputs.ClusterOptimizedAutoScaleArgs.Builder]):
        com.pulumi.azure.kusto.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.kusto.inputs.ClusterOptimizedAutoScaleArgs.builder
      builder.optimizedAutoScale(args(argsBuilder).build)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.kusto.inputs.ClusterSkuArgs.Builder]):
        com.pulumi.azure.kusto.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.kusto.inputs.ClusterSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    /**
     * @return builder
     * @deprecated The `virtualNetworkConfiguration` block has been deprecated as it is no longer supported by Azure and will be removed in v5.0 of the AzureRM Provider - for more information see https://techcommunity.microsoft.com/blog/azuredataexplorer/deprecation-of-virtual-network-injection-for-azure-data-explorer/4198192
     */
    @deprecated def virtualNetworkConfiguration(args: Endofunction[com.pulumi.azure.kusto.inputs.ClusterVirtualNetworkConfigurationArgs.Builder]):
        com.pulumi.azure.kusto.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.kusto.inputs.ClusterVirtualNetworkConfigurationArgs.builder
      builder.virtualNetworkConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.kusto.inputs.ClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.kusto.inputs.AttachedDatabaseConfigurationState.Builder)
    /**
     * @param sharing A `sharing` block as defined below.
     * @return builder
     */
    def sharing(args: Endofunction[com.pulumi.azure.kusto.inputs.AttachedDatabaseConfigurationSharingArgs.Builder]):
        com.pulumi.azure.kusto.inputs.AttachedDatabaseConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.kusto.inputs.AttachedDatabaseConfigurationSharingArgs.builder
      builder.sharing(args(argsBuilder).build)
