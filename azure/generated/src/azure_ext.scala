package jp.ukiba.ko_pulumi
package azure

object azure_ext:
  extension (builder: com.pulumi.azure.ProviderArgs.Builder)
    /**
     * @return builder
     * @deprecated This block has been deprecated and will be removed in version 5.0 of the AzureRM provider. Please use the `enhancedValidation` block inside the `features` block instead.
     */
    @deprecated("This block has been deprecated and will be removed in version 5.0 of the AzureRM provider. Please use the `enhancedValidation` block inside the `features` block instead.") inline def enhancedValidation(args: Endofunction[com.pulumi.azure.inputs.ProviderEnhancedValidationArgs.Builder]):
        com.pulumi.azure.ProviderArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderEnhancedValidationArgs.builder
      builder.enhancedValidation(args(argsBuilder).build)

    inline def features(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder]):
        com.pulumi.azure.ProviderArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesArgs.builder
      builder.features(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder)
    inline def apiManagement(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesApiManagementArgs.Builder]):
        com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesApiManagementArgs.builder
      builder.apiManagement(args(argsBuilder).build)

    inline def appConfiguration(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesAppConfigurationArgs.Builder]):
        com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesAppConfigurationArgs.builder
      builder.appConfiguration(args(argsBuilder).build)

    inline def applicationInsights(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesApplicationInsightsArgs.Builder]):
        com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesApplicationInsightsArgs.builder
      builder.applicationInsights(args(argsBuilder).build)

    inline def cognitiveAccount(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesCognitiveAccountArgs.Builder]):
        com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesCognitiveAccountArgs.builder
      builder.cognitiveAccount(args(argsBuilder).build)

    inline def databricksWorkspace(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesDatabricksWorkspaceArgs.Builder]):
        com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesDatabricksWorkspaceArgs.builder
      builder.databricksWorkspace(args(argsBuilder).build)

    inline def enhancedValidation(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesEnhancedValidationArgs.Builder]):
        com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesEnhancedValidationArgs.builder
      builder.enhancedValidation(args(argsBuilder).build)

    inline def keyVault(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesKeyVaultArgs.Builder]):
        com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesKeyVaultArgs.builder
      builder.keyVault(args(argsBuilder).build)

    inline def logAnalyticsWorkspace(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesLogAnalyticsWorkspaceArgs.Builder]):
        com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesLogAnalyticsWorkspaceArgs.builder
      builder.logAnalyticsWorkspace(args(argsBuilder).build)

    inline def machineLearning(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesMachineLearningArgs.Builder]):
        com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesMachineLearningArgs.builder
      builder.machineLearning(args(argsBuilder).build)

    inline def managedDisk(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesManagedDiskArgs.Builder]):
        com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesManagedDiskArgs.builder
      builder.managedDisk(args(argsBuilder).build)

    inline def netapp(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesNetappArgs.Builder]):
        com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesNetappArgs.builder
      builder.netapp(args(argsBuilder).build)

    inline def postgresqlFlexibleServer(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesPostgresqlFlexibleServerArgs.Builder]):
        com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesPostgresqlFlexibleServerArgs.builder
      builder.postgresqlFlexibleServer(args(argsBuilder).build)

    inline def recoveryService(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesRecoveryServiceArgs.Builder]):
        com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesRecoveryServiceArgs.builder
      builder.recoveryService(args(argsBuilder).build)

    inline def recoveryServicesVaults(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesRecoveryServicesVaultsArgs.Builder]):
        com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesRecoveryServicesVaultsArgs.builder
      builder.recoveryServicesVaults(args(argsBuilder).build)

    inline def resourceGroup(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesResourceGroupArgs.Builder]):
        com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesResourceGroupArgs.builder
      builder.resourceGroup(args(argsBuilder).build)

    inline def servicebus(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesServicebusArgs.Builder]):
        com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesServicebusArgs.builder
      builder.servicebus(args(argsBuilder).build)

    inline def storage(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesStorageArgs.Builder]):
        com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesStorageArgs.builder
      builder.storage(args(argsBuilder).build)

    inline def subscription(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesSubscriptionArgs.Builder]):
        com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesSubscriptionArgs.builder
      builder.subscription(args(argsBuilder).build)

    inline def templateDeployment(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesTemplateDeploymentArgs.Builder]):
        com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesTemplateDeploymentArgs.builder
      builder.templateDeployment(args(argsBuilder).build)

    inline def virtualMachine(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesVirtualMachineArgs.Builder]):
        com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesVirtualMachineArgs.builder
      builder.virtualMachine(args(argsBuilder).build)

    inline def virtualMachineScaleSet(args: Endofunction[com.pulumi.azure.inputs.ProviderFeaturesVirtualMachineScaleSetArgs.Builder]):
        com.pulumi.azure.inputs.ProviderFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.azure.inputs.ProviderFeaturesVirtualMachineScaleSetArgs.builder
      builder.virtualMachineScaleSet(args(argsBuilder).build)
