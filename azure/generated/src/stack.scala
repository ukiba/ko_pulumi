package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object stack:
  /** Manages an Azure Stack HCI Logical Network. */
  def HciLogicalNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.stack.HciLogicalNetworkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.stack.HciLogicalNetworkArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.stack.HciLogicalNetwork(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.stack.HciNetworkInterfaceArgs.Builder)
    /**
     * @param ipConfiguration An `ipConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def ipConfiguration(args: Endofunction[com.pulumi.azure.stack.inputs.HciNetworkInterfaceIpConfigurationArgs.Builder]):
        com.pulumi.azure.stack.HciNetworkInterfaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciNetworkInterfaceIpConfigurationArgs.builder
      builder.ipConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.stack.HciNetworkInterfaceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Azure Stack HCI Network Interface. */
  def HciNetworkInterface(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.stack.HciNetworkInterfaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.stack.HciNetworkInterfaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.stack.HciNetworkInterface(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.stack.HciLogicalNetworkArgs.Builder)
    /**
     * @param subnet A `subnet` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def subnet(args: Endofunction[com.pulumi.azure.stack.inputs.HciLogicalNetworkSubnetArgs.Builder]):
        com.pulumi.azure.stack.HciLogicalNetworkArgs.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciLogicalNetworkSubnetArgs.builder
      builder.subnet(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.stack.HciLogicalNetworkArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.stack.HciClusterArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.stack.inputs.HciClusterIdentityArgs.Builder]):
        com.pulumi.azure.stack.HciClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.stack.HciClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Azure Stack HCI Virtual Hard Disk. */
  def HciVirtualHardDisk(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.stack.HciVirtualHardDiskArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.stack.HciVirtualHardDiskArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.stack.HciVirtualHardDisk(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Stack HCI Extension. */
  def HciExtension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.stack.HciExtensionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.stack.HciExtensionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.stack.HciExtension(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.stack.HciMarketplaceGalleryImageArgs.Builder)
    /**
     * @param identifier An `identifier` block as defined below. Changing this forces a new Azure Stack HCI Marketplace Gallery Image to be created.
     * @return builder
     */
    def identifier(args: Endofunction[com.pulumi.azure.stack.inputs.HciMarketplaceGalleryImageIdentifierArgs.Builder]):
        com.pulumi.azure.stack.HciMarketplaceGalleryImageArgs.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciMarketplaceGalleryImageIdentifierArgs.builder
      builder.identifier(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.stack.HciMarketplaceGalleryImageArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.stack.HciDeploymentSettingArgs.Builder)
    /**
     * @param scaleUnits One or more `scaleUnit` blocks as defined below. Changing this forces a new Stack HCI Deployment Setting to be created.
     * @return builder
     */
    def scaleUnits(args: Endofunction[com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitArgs.Builder]*):
        com.pulumi.azure.stack.HciDeploymentSettingArgs.Builder =
      def argsBuilder = com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitArgs.builder
      builder.scaleUnits(args.map(_(argsBuilder).build)*)

  /**
   * Manages an Azure Stack HCI Cluster.
   * 
   *  ## Import
   * 
   *  Azure Stack HCI Clusters can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:stack/hciCluster:HciCluster example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.AzureStackHCI/clusters/cluster1
   *  ```
   */
  def HciCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.stack.HciClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.stack.HciClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.stack.HciCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object StackFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Azure Stack HCI Cluster instance. */
    inline def getHciCluster(args: Endofunction[com.pulumi.azure.stack.inputs.GetHciClusterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.stack.outputs.GetHciClusterResult] =
      val argsBuilder = com.pulumi.azure.stack.inputs.GetHciClusterArgs.builder
      com.pulumi.azure.stack.StackFunctions.getHciCluster(args(argsBuilder).build)

    /** Use this data source to access information about an existing Azure Stack HCI Cluster instance. */
    inline def getHciClusterPlain(args: Endofunction[com.pulumi.azure.stack.inputs.GetHciClusterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.stack.outputs.GetHciClusterResult] =
      val argsBuilder = com.pulumi.azure.stack.inputs.GetHciClusterPlainArgs.builder
      com.pulumi.azure.stack.StackFunctions.getHciClusterPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Stack HCI Storage Path. */
    inline def getHciStoragePath(args: Endofunction[com.pulumi.azure.stack.inputs.GetHciStoragePathArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.stack.outputs.GetHciStoragePathResult] =
      val argsBuilder = com.pulumi.azure.stack.inputs.GetHciStoragePathArgs.builder
      com.pulumi.azure.stack.StackFunctions.getHciStoragePath(args(argsBuilder).build)

    /** Use this data source to access information about an existing Stack HCI Storage Path. */
    inline def getHciStoragePathPlain(args: Endofunction[com.pulumi.azure.stack.inputs.GetHciStoragePathPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.stack.outputs.GetHciStoragePathResult] =
      val argsBuilder = com.pulumi.azure.stack.inputs.GetHciStoragePathPlainArgs.builder
      com.pulumi.azure.stack.StackFunctions.getHciStoragePathPlain(args(argsBuilder).build)

  /**
   * Manages a Stack HCI Deployment Setting.
   * 
   *  &gt; **Note:** Completion of the prerequisites of deploying the Azure Stack HCI in your environment is outside the scope of this document. For more details refer to the [Azure Stack HCI deployment sequence](https://learn.microsoft.com/en-us/azure-stack/hci/deploy/deployment-introduction#deployment-sequence). If you encounter issues completing the prerequisites, we&#39;d recommend opening a ticket with Microsoft Support.
   * 
   *  &gt; **Note:** During the deployment process, the service will generate additional resources, including a new Arc Bridge Appliance and a Custom Location containing several Stack HCI Storage Paths. The provider will attempt to remove these resources on the deletion or recreation of `azure.stack.HciDeploymentSetting`.
   * 
   *  ## Import
   * 
   *  Stack HCI Deployment Settings can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:stack/hciDeploymentSetting:HciDeploymentSetting example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.AzureStackHCI/clusters/clus1/deploymentSettings/default
   *  ```
   */
  def HciDeploymentSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.stack.HciDeploymentSettingArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.stack.HciDeploymentSettingArgs.builder
    com.pulumi.azure.stack.HciDeploymentSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Azure Stack HCI Marketplace Gallery Image.
   * 
   *  ## Import
   * 
   *  Azure Stack HCI Marketplace Gallery Images can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:stack/hciMarketplaceGalleryImage:HciMarketplaceGalleryImage example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.AzureStackHCI/marketplaceGalleryImages/image1
   *  ```
   */
  def HciMarketplaceGalleryImage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.stack.HciMarketplaceGalleryImageArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.stack.HciMarketplaceGalleryImageArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.stack.HciMarketplaceGalleryImage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.stack.inputs.HciDeploymentSettingState.Builder)
    /**
     * @param scaleUnits One or more `scaleUnit` blocks as defined below. Changing this forces a new Stack HCI Deployment Setting to be created.
     * @return builder
     */
    def scaleUnits(args: Endofunction[com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitArgs.Builder]*):
        com.pulumi.azure.stack.inputs.HciDeploymentSettingState.Builder =
      def argsBuilder = com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitArgs.builder
      builder.scaleUnits(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.stack.inputs.HciClusterState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.stack.inputs.HciClusterIdentityArgs.Builder]):
        com.pulumi.azure.stack.inputs.HciClusterState.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.stack.inputs.HciClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.stack.inputs.HciLogicalNetworkSubnetArgs.Builder)
    /**
     * @param ipPools One or more `ipPool` block as defined above. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** If `ipPool` is not specified, it will be assigned by the server. If you experience a diff you may need to add this to `ignoreChanges`.
     * @return builder
     */
    def ipPools(args: Endofunction[com.pulumi.azure.stack.inputs.HciLogicalNetworkSubnetIpPoolArgs.Builder]*):
        com.pulumi.azure.stack.inputs.HciLogicalNetworkSubnetArgs.Builder =
      def argsBuilder = com.pulumi.azure.stack.inputs.HciLogicalNetworkSubnetIpPoolArgs.builder
      builder.ipPools(args.map(_(argsBuilder).build)*)

    /**
     * @param routes A `route` block as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    def routes(args: Endofunction[com.pulumi.azure.stack.inputs.HciLogicalNetworkSubnetRouteArgs.Builder]*):
        com.pulumi.azure.stack.inputs.HciLogicalNetworkSubnetArgs.Builder =
      def argsBuilder = com.pulumi.azure.stack.inputs.HciLogicalNetworkSubnetRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitHostNetworkArgs.Builder)
    /**
     * @param intents One or more `intent` blocks as defined below. Changing this forces a new Stack HCI Deployment Setting to be created.
     * @return builder
     */
    def intents(args: Endofunction[com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitHostNetworkIntentArgs.Builder]*):
        com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitHostNetworkArgs.Builder =
      def argsBuilder = com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitHostNetworkIntentArgs.builder
      builder.intents(args.map(_(argsBuilder).build)*)

    /**
     * @param storageNetworks One or more `storageNetwork` blocks as defined below. Changing this forces a new Stack HCI Deployment Setting to be created.
     * @return builder
     */
    def storageNetworks(args: Endofunction[com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitHostNetworkStorageNetworkArgs.Builder]*):
        com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitHostNetworkArgs.Builder =
      def argsBuilder = com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitHostNetworkStorageNetworkArgs.builder
      builder.storageNetworks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitInfrastructureNetworkArgs.Builder)
    /**
     * @param ipPools One or more `ipPool` blocks as defined below. Changing this forces a new Stack HCI Deployment Setting to be created.
     * @return builder
     */
    def ipPools(args: Endofunction[com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitInfrastructureNetworkIpPoolArgs.Builder]*):
        com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitInfrastructureNetworkArgs.Builder =
      def argsBuilder = com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitInfrastructureNetworkIpPoolArgs.builder
      builder.ipPools(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.stack.inputs.HciLogicalNetworkState.Builder)
    /**
     * @param subnet A `subnet` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def subnet(args: Endofunction[com.pulumi.azure.stack.inputs.HciLogicalNetworkSubnetArgs.Builder]):
        com.pulumi.azure.stack.inputs.HciLogicalNetworkState.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciLogicalNetworkSubnetArgs.builder
      builder.subnet(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.stack.inputs.HciLogicalNetworkState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.stack.inputs.HciNetworkInterfaceState.Builder)
    /**
     * @param ipConfiguration An `ipConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def ipConfiguration(args: Endofunction[com.pulumi.azure.stack.inputs.HciNetworkInterfaceIpConfigurationArgs.Builder]):
        com.pulumi.azure.stack.inputs.HciNetworkInterfaceState.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciNetworkInterfaceIpConfigurationArgs.builder
      builder.ipConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.stack.inputs.HciNetworkInterfaceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitHostNetworkIntentArgs.Builder)
    /**
     * @param adapterPropertyOverride A `adapterPropertyOverride` block as defined above. Changing this forces a new Stack HCI Deployment Setting to be created.
     * @return builder
     */
    def adapterPropertyOverride(args: Endofunction[com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitHostNetworkIntentAdapterPropertyOverrideArgs.Builder]):
        com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitHostNetworkIntentArgs.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitHostNetworkIntentAdapterPropertyOverrideArgs.builder
      builder.adapterPropertyOverride(args(argsBuilder).build)

    /**
     * @param qosPolicyOverride A `qosPolicyOverride` block as defined below. Changing this forces a new Stack HCI Deployment Setting to be created.
     * @return builder
     */
    def qosPolicyOverride(args: Endofunction[com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitHostNetworkIntentQosPolicyOverrideArgs.Builder]):
        com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitHostNetworkIntentArgs.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitHostNetworkIntentQosPolicyOverrideArgs.builder
      builder.qosPolicyOverride(args(argsBuilder).build)

    /**
     * @param virtualSwitchConfigurationOverride A `virtualSwitchConfigurationOverride` block as defined below. Changing this forces a new Stack HCI Deployment Setting to be created.
     * @return builder
     */
    def virtualSwitchConfigurationOverride(args: Endofunction[com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitHostNetworkIntentVirtualSwitchConfigurationOverrideArgs.Builder]):
        com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitHostNetworkIntentArgs.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitHostNetworkIntentVirtualSwitchConfigurationOverrideArgs.builder
      builder.virtualSwitchConfigurationOverride(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitArgs.Builder)
    /**
     * @param cluster A `cluster` block as defined above. Changing this forces a new Stack HCI Deployment Setting to be created.
     * @return builder
     */
    def cluster(args: Endofunction[com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitClusterArgs.Builder]):
        com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitArgs.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitClusterArgs.builder
      builder.cluster(args(argsBuilder).build)

    /**
     * @param hostNetwork A `hostNetwork` block as defined above. Changing this forces a new Stack HCI Deployment Setting to be created.
     * @return builder
     */
    def hostNetwork(args: Endofunction[com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitHostNetworkArgs.Builder]):
        com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitArgs.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitHostNetworkArgs.builder
      builder.hostNetwork(args(argsBuilder).build)

    /**
     * @param infrastructureNetworks One or more `infrastructureNetwork` blocks as defined above. Changing this forces a new Stack HCI Deployment Setting to be created.
     * @return builder
     */
    def infrastructureNetworks(args: Endofunction[com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitInfrastructureNetworkArgs.Builder]*):
        com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitArgs.Builder =
      def argsBuilder = com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitInfrastructureNetworkArgs.builder
      builder.infrastructureNetworks(args.map(_(argsBuilder).build)*)

    /**
     * @param optionalService A `optionalService` block as defined above. Changing this forces a new Stack HCI Deployment Setting to be created.
     * @return builder
     */
    def optionalService(args: Endofunction[com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitOptionalServiceArgs.Builder]):
        com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitArgs.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitOptionalServiceArgs.builder
      builder.optionalService(args(argsBuilder).build)

    /**
     * @param physicalNodes One or more `physicalNode` blocks as defined above. Changing this forces a new Stack HCI Deployment Setting to be created.
     * @return builder
     */
    def physicalNodes(args: Endofunction[com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitPhysicalNodeArgs.Builder]*):
        com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitArgs.Builder =
      def argsBuilder = com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitPhysicalNodeArgs.builder
      builder.physicalNodes(args.map(_(argsBuilder).build)*)

    /**
     * @param storage A `storage` block as defined below. Changing this forces a new Stack HCI Deployment Setting to be created.
     * @return builder
     */
    def storage(args: Endofunction[com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitStorageArgs.Builder]):
        com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitArgs.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitStorageArgs.builder
      builder.storage(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.stack.inputs.HciMarketplaceGalleryImageState.Builder)
    /**
     * @param identifier An `identifier` block as defined below. Changing this forces a new Azure Stack HCI Marketplace Gallery Image to be created.
     * @return builder
     */
    def identifier(args: Endofunction[com.pulumi.azure.stack.inputs.HciMarketplaceGalleryImageIdentifierArgs.Builder]):
        com.pulumi.azure.stack.inputs.HciMarketplaceGalleryImageState.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciMarketplaceGalleryImageIdentifierArgs.builder
      builder.identifier(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.stack.inputs.HciMarketplaceGalleryImageState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Azure Stack HCI Storage Path. */
  def HciStoragePath(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.stack.HciStoragePathArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.stack.HciStoragePathArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.stack.HciStoragePath(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
