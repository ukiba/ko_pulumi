package jp.ukiba.ko_pulumi
package azure

object stack_ext:
  extension (builder: com.pulumi.azure.stack.HciClusterArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.stack.inputs.HciClusterIdentityArgs.Builder]):
        com.pulumi.azure.stack.HciClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.stack.HciDeploymentSettingArgs.Builder)
    /**
     * @param scaleUnits One or more `scaleUnit` blocks as defined below. Changing this forces a new Stack HCI Deployment Setting to be created.
     * @return builder
     */
    def scaleUnits(args: Endofunction[com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitArgs.Builder]*):
        com.pulumi.azure.stack.HciDeploymentSettingArgs.Builder =
      def argsBuilder = com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitArgs.builder
      builder.scaleUnits(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.stack.HciLogicalNetworkArgs.Builder)
    /**
     * @param subnet A `subnet` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def subnet(args: Endofunction[com.pulumi.azure.stack.inputs.HciLogicalNetworkSubnetArgs.Builder]):
        com.pulumi.azure.stack.HciLogicalNetworkArgs.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciLogicalNetworkSubnetArgs.builder
      builder.subnet(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.stack.HciMarketplaceGalleryImageArgs.Builder)
    /**
     * @param identifier An `identifier` block as defined below. Changing this forces a new Azure Stack HCI Marketplace Gallery Image to be created.
     * @return builder
     */
    def identifier(args: Endofunction[com.pulumi.azure.stack.inputs.HciMarketplaceGalleryImageIdentifierArgs.Builder]):
        com.pulumi.azure.stack.HciMarketplaceGalleryImageArgs.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciMarketplaceGalleryImageIdentifierArgs.builder
      builder.identifier(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.stack.HciNetworkInterfaceArgs.Builder)
    /**
     * @param ipConfiguration An `ipConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def ipConfiguration(args: Endofunction[com.pulumi.azure.stack.inputs.HciNetworkInterfaceIpConfigurationArgs.Builder]):
        com.pulumi.azure.stack.HciNetworkInterfaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciNetworkInterfaceIpConfigurationArgs.builder
      builder.ipConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.stack.inputs.HciClusterState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.stack.inputs.HciClusterIdentityArgs.Builder]):
        com.pulumi.azure.stack.inputs.HciClusterState.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

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

  extension (builder: com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitInfrastructureNetworkArgs.Builder)
    /**
     * @param ipPools One or more `ipPool` blocks as defined below. Changing this forces a new Stack HCI Deployment Setting to be created.
     * @return builder
     */
    def ipPools(args: Endofunction[com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitInfrastructureNetworkIpPoolArgs.Builder]*):
        com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitInfrastructureNetworkArgs.Builder =
      def argsBuilder = com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitInfrastructureNetworkIpPoolArgs.builder
      builder.ipPools(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.stack.inputs.HciDeploymentSettingState.Builder)
    /**
     * @param scaleUnits One or more `scaleUnit` blocks as defined below. Changing this forces a new Stack HCI Deployment Setting to be created.
     * @return builder
     */
    def scaleUnits(args: Endofunction[com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitArgs.Builder]*):
        com.pulumi.azure.stack.inputs.HciDeploymentSettingState.Builder =
      def argsBuilder = com.pulumi.azure.stack.inputs.HciDeploymentSettingScaleUnitArgs.builder
      builder.scaleUnits(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.stack.inputs.HciLogicalNetworkState.Builder)
    /**
     * @param subnet A `subnet` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def subnet(args: Endofunction[com.pulumi.azure.stack.inputs.HciLogicalNetworkSubnetArgs.Builder]):
        com.pulumi.azure.stack.inputs.HciLogicalNetworkState.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciLogicalNetworkSubnetArgs.builder
      builder.subnet(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.stack.inputs.HciLogicalNetworkSubnetArgs.Builder)
    /**
     * @param ipPools One or more `ipPool` block as defined above. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** If `ipPool` is not specified, it will be assigned by the server. If you experience a diff you may need to add this to `ignoreChanges`.
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

  extension (builder: com.pulumi.azure.stack.inputs.HciMarketplaceGalleryImageState.Builder)
    /**
     * @param identifier An `identifier` block as defined below. Changing this forces a new Azure Stack HCI Marketplace Gallery Image to be created.
     * @return builder
     */
    def identifier(args: Endofunction[com.pulumi.azure.stack.inputs.HciMarketplaceGalleryImageIdentifierArgs.Builder]):
        com.pulumi.azure.stack.inputs.HciMarketplaceGalleryImageState.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciMarketplaceGalleryImageIdentifierArgs.builder
      builder.identifier(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.stack.inputs.HciNetworkInterfaceState.Builder)
    /**
     * @param ipConfiguration An `ipConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def ipConfiguration(args: Endofunction[com.pulumi.azure.stack.inputs.HciNetworkInterfaceIpConfigurationArgs.Builder]):
        com.pulumi.azure.stack.inputs.HciNetworkInterfaceState.Builder =
      val argsBuilder = com.pulumi.azure.stack.inputs.HciNetworkInterfaceIpConfigurationArgs.builder
      builder.ipConfiguration(args(argsBuilder).build)
