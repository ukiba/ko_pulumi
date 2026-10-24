package jp.ukiba.ko_pulumi
package azure

object kusto_ext:
  extension (builder: com.pulumi.azure.kusto.AttachedDatabaseConfigurationArgs.Builder)
    /**
     * @param sharing A `sharing` block as defined below.
     * @return builder
     */
    def sharing(args: Endofunction[com.pulumi.azure.kusto.inputs.AttachedDatabaseConfigurationSharingArgs.Builder]):
        com.pulumi.azure.kusto.AttachedDatabaseConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.kusto.inputs.AttachedDatabaseConfigurationSharingArgs.builder
      builder.sharing(args(argsBuilder).build)

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
    @deprecated("`languageExtensions` has been deprecated in favour of `languageExtension` and will be removed in v5.0 of the AzureRM provider") def languageExtensions(args: Endofunction[com.pulumi.azure.kusto.inputs.ClusterLanguageExtensionArgs.Builder]*):
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
    @deprecated("The `virtualNetworkConfiguration` block has been deprecated as it is no longer supported by Azure and will be removed in v5.0 of the AzureRM Provider - for more information see https://techcommunity.microsoft.com/blog/azuredataexplorer/deprecation-of-virtual-network-injection-for-azure-data-explorer/4198192") def virtualNetworkConfiguration(args: Endofunction[com.pulumi.azure.kusto.inputs.ClusterVirtualNetworkConfigurationArgs.Builder]):
        com.pulumi.azure.kusto.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.kusto.inputs.ClusterVirtualNetworkConfigurationArgs.builder
      builder.virtualNetworkConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.kusto.inputs.AttachedDatabaseConfigurationState.Builder)
    /**
     * @param sharing A `sharing` block as defined below.
     * @return builder
     */
    def sharing(args: Endofunction[com.pulumi.azure.kusto.inputs.AttachedDatabaseConfigurationSharingArgs.Builder]):
        com.pulumi.azure.kusto.inputs.AttachedDatabaseConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.kusto.inputs.AttachedDatabaseConfigurationSharingArgs.builder
      builder.sharing(args(argsBuilder).build)

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
    @deprecated("`languageExtensions` has been deprecated in favour of `languageExtension` and will be removed in v5.0 of the AzureRM provider") def languageExtensions(args: Endofunction[com.pulumi.azure.kusto.inputs.ClusterLanguageExtensionArgs.Builder]*):
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
    @deprecated("The `virtualNetworkConfiguration` block has been deprecated as it is no longer supported by Azure and will be removed in v5.0 of the AzureRM Provider - for more information see https://techcommunity.microsoft.com/blog/azuredataexplorer/deprecation-of-virtual-network-injection-for-azure-data-explorer/4198192") def virtualNetworkConfiguration(args: Endofunction[com.pulumi.azure.kusto.inputs.ClusterVirtualNetworkConfigurationArgs.Builder]):
        com.pulumi.azure.kusto.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.kusto.inputs.ClusterVirtualNetworkConfigurationArgs.builder
      builder.virtualNetworkConfiguration(args(argsBuilder).build)
