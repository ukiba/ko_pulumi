package jp.ukiba.ko_pulumi
package azure

object datafactory_ext:
  extension (builder: com.pulumi.azure.datafactory.CredentialServicePrincipalArgs.Builder)
    /**
     * @param servicePrincipalKey A `servicePrincipalKey` block as defined below.
     * @return builder
     */
    inline def servicePrincipalKey(args: Endofunction[com.pulumi.azure.datafactory.inputs.CredentialServicePrincipalServicePrincipalKeyArgs.Builder]):
        com.pulumi.azure.datafactory.CredentialServicePrincipalArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.CredentialServicePrincipalServicePrincipalKeyArgs.builder
      builder.servicePrincipalKey(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.CustomDatasetArgs.Builder)
    /**
     * @param linkedService A `linkedService` block as defined below.
     * @return builder
     */
    inline def linkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.CustomDatasetLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.CustomDatasetArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.CustomDatasetLinkedServiceArgs.builder
      builder.linkedService(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.DataFlowArgs.Builder)
    /**
     * @param sinks One or more `sink` blocks as defined below.
     * @return builder
     */
    inline def sinks(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSinkArgs.Builder]*):
        com.pulumi.azure.datafactory.DataFlowArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSinkArgs.builder
      builder.sinks(args.map(_(argsBuilder).build)*)

    /**
     * @param sources One or more `source` blocks as defined below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSourceArgs.Builder]*):
        com.pulumi.azure.datafactory.DataFlowArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

    /**
     * @param transformations One or more `transformation` blocks as defined below.
     * @return builder
     */
    inline def transformations(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowTransformationArgs.Builder]*):
        com.pulumi.azure.datafactory.DataFlowArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowTransformationArgs.builder
      builder.transformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.DatasetAzureBlobArgs.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetAzureBlobSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetAzureBlobArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetAzureBlobSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.DatasetAzureSqlTableArgs.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetAzureSqlTableSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetAzureSqlTableArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetAzureSqlTableSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.DatasetBinaryArgs.Builder)
    /**
     * @param azureBlobStorageLocation A `azureBlobStorageLocation` block as defined below.
     * @return builder
     */
    inline def azureBlobStorageLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetBinaryAzureBlobStorageLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetBinaryArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetBinaryAzureBlobStorageLocationArgs.builder
      builder.azureBlobStorageLocation(args(argsBuilder).build)

    /**
     * @param compression A `compression` block as defined below.
     * @return builder
     */
    inline def compression(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetBinaryCompressionArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetBinaryArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetBinaryCompressionArgs.builder
      builder.compression(args(argsBuilder).build)

    /**
     * @param httpServerLocation A `httpServerLocation` block as defined below.
     * @return builder
     */
    inline def httpServerLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetBinaryHttpServerLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetBinaryArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetBinaryHttpServerLocationArgs.builder
      builder.httpServerLocation(args(argsBuilder).build)

    /**
     * @param sftpServerLocation A `sftpServerLocation` block as defined below.
     * @return builder
     */
    inline def sftpServerLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetBinarySftpServerLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetBinaryArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetBinarySftpServerLocationArgs.builder
      builder.sftpServerLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.DatasetCosmosDBApiArgs.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetCosmosDBApiSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetCosmosDBApiArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetCosmosDBApiSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.DatasetDelimitedTextArgs.Builder)
    /**
     * @param azureBlobFsLocation An `azureBlobFsLocation` block as defined below.
     * @return builder
     */
    inline def azureBlobFsLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextAzureBlobFsLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetDelimitedTextArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextAzureBlobFsLocationArgs.builder
      builder.azureBlobFsLocation(args(argsBuilder).build)

    /**
     * @param azureBlobStorageLocation An `azureBlobStorageLocation` block as defined below.
     * @return builder
     */
    inline def azureBlobStorageLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextAzureBlobStorageLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetDelimitedTextArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextAzureBlobStorageLocationArgs.builder
      builder.azureBlobStorageLocation(args(argsBuilder).build)

    /**
     * @param httpServerLocation A `httpServerLocation` block as defined below.
     * 
     * The following supported arguments are specific to Delimited Text Dataset:
     * @return builder
     */
    inline def httpServerLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextHttpServerLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetDelimitedTextArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextHttpServerLocationArgs.builder
      builder.httpServerLocation(args(argsBuilder).build)

    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetDelimitedTextArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.DatasetHttpArgs.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetHttpSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetHttpArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetHttpSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.DatasetJsonArgs.Builder)
    /**
     * @param azureBlobStorageLocation A `azureBlobStorageLocation` block as defined below.
     * 
     * The following supported arguments are specific to Delimited Text Dataset:
     * @return builder
     */
    inline def azureBlobStorageLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetJsonAzureBlobStorageLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetJsonArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetJsonAzureBlobStorageLocationArgs.builder
      builder.azureBlobStorageLocation(args(argsBuilder).build)

    /**
     * @param httpServerLocation A `httpServerLocation` block as defined below.
     * @return builder
     */
    inline def httpServerLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetJsonHttpServerLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetJsonArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetJsonHttpServerLocationArgs.builder
      builder.httpServerLocation(args(argsBuilder).build)

    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetJsonSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetJsonArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetJsonSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.DatasetMysqlArgs.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetMysqlSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetMysqlArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetMysqlSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.DatasetParquetArgs.Builder)
    /**
     * @param azureBlobFsLocation A `azureBlobFsLocation` block as defined below.
     * @return builder
     */
    inline def azureBlobFsLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetParquetAzureBlobFsLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetParquetArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetParquetAzureBlobFsLocationArgs.builder
      builder.azureBlobFsLocation(args(argsBuilder).build)

    /**
     * @param azureBlobStorageLocation A `azureBlobStorageLocation` block as defined below.
     * 
     * The following supported arguments are specific to Parquet Dataset:
     * @return builder
     */
    inline def azureBlobStorageLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetParquetAzureBlobStorageLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetParquetArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetParquetAzureBlobStorageLocationArgs.builder
      builder.azureBlobStorageLocation(args(argsBuilder).build)

    /**
     * @param httpServerLocation A `httpServerLocation` block as defined below.
     * @return builder
     */
    inline def httpServerLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetParquetHttpServerLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetParquetArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetParquetHttpServerLocationArgs.builder
      builder.httpServerLocation(args(argsBuilder).build)

    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetParquetSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetParquetArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetParquetSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.DatasetPostgresqlArgs.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetPostgresqlSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetPostgresqlArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetPostgresqlSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.DatasetSnowflakeArgs.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetSnowflakeSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetSnowflakeArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetSnowflakeSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.DatasetSqlServerTableArgs.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetSqlServerTableSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetSqlServerTableArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetSqlServerTableSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.FactoryArgs.Builder)
    /**
     * @param githubConfiguration A `githubConfiguration` block as defined below.
     * @return builder
     */
    inline def githubConfiguration(args: Endofunction[com.pulumi.azure.datafactory.inputs.FactoryGithubConfigurationArgs.Builder]):
        com.pulumi.azure.datafactory.FactoryArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FactoryGithubConfigurationArgs.builder
      builder.githubConfiguration(args(argsBuilder).build)

    /**
     * @param globalParameters A list of `globalParameter` blocks as defined above.
     * @return builder
     */
    inline def globalParameters(args: Endofunction[com.pulumi.azure.datafactory.inputs.FactoryGlobalParameterArgs.Builder]*):
        com.pulumi.azure.datafactory.FactoryArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.FactoryGlobalParameterArgs.builder
      builder.globalParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.datafactory.inputs.FactoryIdentityArgs.Builder]):
        com.pulumi.azure.datafactory.FactoryArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FactoryIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param vstsConfiguration A `vstsConfiguration` block as defined below.
     * @return builder
     */
    inline def vstsConfiguration(args: Endofunction[com.pulumi.azure.datafactory.inputs.FactoryVstsConfigurationArgs.Builder]):
        com.pulumi.azure.datafactory.FactoryArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FactoryVstsConfigurationArgs.builder
      builder.vstsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.FlowletDataFlowArgs.Builder)
    /**
     * @param sinks One or more `sink` blocks as defined below.
     * @return builder
     */
    inline def sinks(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkArgs.Builder]*):
        com.pulumi.azure.datafactory.FlowletDataFlowArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkArgs.builder
      builder.sinks(args.map(_(argsBuilder).build)*)

    /**
     * @param sources One or more `source` blocks as defined below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceArgs.Builder]*):
        com.pulumi.azure.datafactory.FlowletDataFlowArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

    /**
     * @param transformations One or more `transformation` blocks as defined below.
     * @return builder
     */
    inline def transformations(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationArgs.Builder]*):
        com.pulumi.azure.datafactory.FlowletDataFlowArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationArgs.builder
      builder.transformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.IntegrationRuntimeSelfHostedArgs.Builder)
    /**
     * @param rbacAuthorizations A `rbacAuthorization` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def rbacAuthorizations(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSelfHostedRbacAuthorizationArgs.Builder]*):
        com.pulumi.azure.datafactory.IntegrationRuntimeSelfHostedArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSelfHostedRbacAuthorizationArgs.builder
      builder.rbacAuthorizations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder)
    /**
     * @param catalogInfo A `catalogInfo` block as defined below.
     * @return builder
     */
    inline def catalogInfo(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCatalogInfoArgs.Builder]):
        com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCatalogInfoArgs.builder
      builder.catalogInfo(args(argsBuilder).build)

    /**
     * @param copyComputeScale One `copyComputeScale` block as defined below.
     * @return builder
     */
    inline def copyComputeScale(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCopyComputeScaleArgs.Builder]):
        com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCopyComputeScaleArgs.builder
      builder.copyComputeScale(args(argsBuilder).build)

    /**
     * @param customSetupScript A `customSetupScript` block as defined below.
     * @return builder
     */
    inline def customSetupScript(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCustomSetupScriptArgs.Builder]):
        com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCustomSetupScriptArgs.builder
      builder.customSetupScript(args(argsBuilder).build)

    /**
     * @param expressCustomSetup An `expressCustomSetup` block as defined below.
     * @return builder
     */
    inline def expressCustomSetup(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupArgs.Builder]):
        com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupArgs.builder
      builder.expressCustomSetup(args(argsBuilder).build)

    /**
     * @param expressVnetIntegration A `expressVnetIntegration` block as defined below.
     * @return builder
     */
    inline def expressVnetIntegration(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressVnetIntegrationArgs.Builder]):
        com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressVnetIntegrationArgs.builder
      builder.expressVnetIntegration(args(argsBuilder).build)

    /**
     * @param packageStores One or more `packageStore` block as defined below.
     * @return builder
     */
    inline def packageStores(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisPackageStoreArgs.Builder]*):
        com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisPackageStoreArgs.builder
      builder.packageStores(args.map(_(argsBuilder).build)*)

    /**
     * @param pipelineExternalComputeScale One `pipelineExternalComputeScale` block as defined below.
     * @return builder
     */
    inline def pipelineExternalComputeScale(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisPipelineExternalComputeScaleArgs.Builder]):
        com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisPipelineExternalComputeScaleArgs.builder
      builder.pipelineExternalComputeScale(args(argsBuilder).build)

    /**
     * @param proxy A `proxy` block as defined below.
     * @return builder
     */
    inline def proxy(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisProxyArgs.Builder]):
        com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisProxyArgs.builder
      builder.proxy(args(argsBuilder).build)

    /**
     * @param vnetIntegration A `vnetIntegration` block as defined below.
     * @return builder
     */
    inline def vnetIntegration(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisVnetIntegrationArgs.Builder]):
        com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisVnetIntegrationArgs.builder
      builder.vnetIntegration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedCustomServiceArgs.Builder)
    /**
     * @param integrationRuntime An `integrationRuntime` block as defined below.
     * @return builder
     */
    inline def integrationRuntime(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedCustomServiceIntegrationRuntimeArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedCustomServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedCustomServiceIntegrationRuntimeArgs.builder
      builder.integrationRuntime(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceAzureBlobStorageArgs.Builder)
    /**
     * @return builder
     * @deprecated the `keyVaultSasToken` property has been deprecated in favour of the `sasTokenLinkedKeyVaultKey` property and will be removed in v5.0 of the AzureRM Provider
     */
    @deprecated("the `keyVaultSasToken` property has been deprecated in favour of the `sasTokenLinkedKeyVaultKey` property and will be removed in v5.0 of the AzureRM Provider") inline def keyVaultSasToken(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageKeyVaultSasTokenArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceAzureBlobStorageArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageKeyVaultSasTokenArgs.builder
      builder.keyVaultSasToken(args(argsBuilder).build)

    /**
     * @param sasTokenLinkedKeyVaultKey A `sasTokenLinkedKeyVaultKey` block as defined below. Use this argument to store SAS Token in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. A `sasUri` is required.
     * @return builder
     */
    inline def sasTokenLinkedKeyVaultKey(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageSasTokenLinkedKeyVaultKeyArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceAzureBlobStorageArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageSasTokenLinkedKeyVaultKeyArgs.builder
      builder.sasTokenLinkedKeyVaultKey(args(argsBuilder).build)

    inline def servicePrincipalLinkedKeyVaultKey(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageServicePrincipalLinkedKeyVaultKeyArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceAzureBlobStorageArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageServicePrincipalLinkedKeyVaultKeyArgs.builder
      builder.servicePrincipalLinkedKeyVaultKey(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceAzureDatabricksArgs.Builder)
    /**
     * @param instancePool Leverages an instance pool within the linked ADB instance as one `instancePool` block defined below.
     * @return builder
     */
    inline def instancePool(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksInstancePoolArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceAzureDatabricksArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksInstancePoolArgs.builder
      builder.instancePool(args(argsBuilder).build)

    /**
     * @param keyVaultPassword Authenticate to ADB via Azure Key Vault Linked Service as defined in the `keyVaultPassword` block below.
     * @return builder
     */
    inline def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceAzureDatabricksArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

    /**
     * @param newClusterConfig Creates new clusters within the linked ADB instance as defined in the `newClusterConfig` block below.
     * @return builder
     */
    inline def newClusterConfig(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksNewClusterConfigArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceAzureDatabricksArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksNewClusterConfigArgs.builder
      builder.newClusterConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceAzureFileStorageArgs.Builder)
    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store Azure File Storage password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    inline def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFileStorageKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceAzureFileStorageArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFileStorageKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceAzureFunctionArgs.Builder)
    /**
     * @param keyVaultKey A `keyVaultKey` block as defined below. Use this Argument to store the system key of the Azure Function in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. Exactly one of either `key` or `keyVaultKey` is required.
     * @return builder
     */
    inline def keyVaultKey(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFunctionKeyVaultKeyArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceAzureFunctionArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFunctionKeyVaultKeyArgs.builder
      builder.keyVaultKey(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceAzureSqlDatabaseArgs.Builder)
    /**
     * @param keyVaultConnectionString A `keyVaultConnectionString` block as defined below. Use this argument to store Azure SQL Database connection string in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. Exactly one of either `connectionString` or `keyVaultConnectionString` is required.
     * @return builder
     */
    inline def keyVaultConnectionString(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseKeyVaultConnectionStringArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceAzureSqlDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseKeyVaultConnectionStringArgs.builder
      builder.keyVaultConnectionString(args(argsBuilder).build)

    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store SQL Server password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    inline def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceAzureSqlDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceOdataArgs.Builder)
    /**
     * @param basicAuthentication A `basicAuthentication` block as defined below.
     * @return builder
     */
    inline def basicAuthentication(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceOdataBasicAuthenticationArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceOdataArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceOdataBasicAuthenticationArgs.builder
      builder.basicAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceOdbcArgs.Builder)
    /**
     * @param basicAuthentication A `basicAuthentication` block as defined below.
     * @return builder
     */
    inline def basicAuthentication(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceOdbcBasicAuthenticationArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceOdbcArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceOdbcBasicAuthenticationArgs.builder
      builder.basicAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceSftpArgs.Builder)
    /**
     * @param keyVaultPasswords A `keyVaultPassword` block as defined below.
     * 
     * &gt; **Note:** Either `password` or `keyVaultPassword` is required when `authenticationType` is set to `Basic`.
     * @return builder
     */
    inline def keyVaultPasswords(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPasswordArgs.Builder]*):
        com.pulumi.azure.datafactory.LinkedServiceSftpArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPasswordArgs.builder
      builder.keyVaultPasswords(args.map(_(argsBuilder).build)*)

    /**
     * @param keyVaultPrivateKeyContentBase64 A `keyVaultPrivateKeyContentBase64` block as defined below.
     * @return builder
     */
    inline def keyVaultPrivateKeyContentBase64(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPrivateKeyContentBase64Args.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceSftpArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPrivateKeyContentBase64Args.builder
      builder.keyVaultPrivateKeyContentBase64(args(argsBuilder).build)

    /**
     * @param keyVaultPrivateKeyPassphrase A `keyVaultPrivateKeyPassphrase` block as defined below.
     * 
     * &gt; **Note:** One of `privateKeyContentBase64` or `privateKeyPath` (or their Key Vault equivalent) is required when `authenticationType` is set to `SshPublicKey`.
     * @return builder
     */
    inline def keyVaultPrivateKeyPassphrase(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPrivateKeyPassphraseArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceSftpArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPrivateKeyPassphraseArgs.builder
      builder.keyVaultPrivateKeyPassphrase(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceSnowflakeArgs.Builder)
    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store Snowflake password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    inline def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSnowflakeKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceSnowflakeArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSnowflakeKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceSqlManagedInstanceArgs.Builder)
    /**
     * @param keyVaultConnectionString A `keyVaultConnectionString` block as defined below. Use this argument to store SQL Managed Instance connection string in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. Exactly one of either `connectionString` or `keyVaultConnectionString` is required.
     * @return builder
     */
    inline def keyVaultConnectionString(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceKeyVaultConnectionStringArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceSqlManagedInstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceKeyVaultConnectionStringArgs.builder
      builder.keyVaultConnectionString(args(argsBuilder).build)

    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store SQL Managed Instance password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    inline def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceSqlManagedInstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceSqlServerArgs.Builder)
    /**
     * @param keyVaultConnectionString A `keyVaultConnectionString` block as defined below. Use this argument to store SQL Server connection string in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. Exactly one of either `connectionString` or `keyVaultConnectionString` is required.
     * @return builder
     */
    inline def keyVaultConnectionString(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerKeyVaultConnectionStringArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceSqlServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerKeyVaultConnectionStringArgs.builder
      builder.keyVaultConnectionString(args(argsBuilder).build)

    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store SQL Server password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    inline def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceSqlServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceSynapseArgs.Builder)
    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store Synapse password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    inline def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSynapseKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceSynapseArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSynapseKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.TriggerBlobEventArgs.Builder)
    /**
     * @param pipelines One or more `pipeline` blocks as defined below.
     * @return builder
     */
    inline def pipelines(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerBlobEventPipelineArgs.Builder]*):
        com.pulumi.azure.datafactory.TriggerBlobEventArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerBlobEventPipelineArgs.builder
      builder.pipelines(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.TriggerCustomEventArgs.Builder)
    /**
     * @param pipelines One or more `pipeline` blocks as defined below.
     * @return builder
     */
    inline def pipelines(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerCustomEventPipelineArgs.Builder]*):
        com.pulumi.azure.datafactory.TriggerCustomEventArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerCustomEventPipelineArgs.builder
      builder.pipelines(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.TriggerScheduleArgs.Builder)
    /**
     * @param pipelines A `pipeline` block as defined below.
     * @return builder
     */
    inline def pipelines(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerSchedulePipelineArgs.Builder]*):
        com.pulumi.azure.datafactory.TriggerScheduleArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerSchedulePipelineArgs.builder
      builder.pipelines(args.map(_(argsBuilder).build)*)

    /**
     * @param schedule A `schedule` block as defined below, which further specifies the recurrence schedule for the trigger. A schedule is capable of limiting or increasing the number of trigger executions specified by the `frequency` and `interval` properties.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerScheduleScheduleArgs.Builder]):
        com.pulumi.azure.datafactory.TriggerScheduleArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerScheduleScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.TriggerTumblingWindowArgs.Builder)
    /**
     * @param pipeline A `pipeline` block as defined below.
     * @return builder
     */
    inline def pipeline(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowPipelineArgs.Builder]):
        com.pulumi.azure.datafactory.TriggerTumblingWindowArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowPipelineArgs.builder
      builder.pipeline(args(argsBuilder).build)

    /**
     * @param retry A `retry` block as defined below.
     * @return builder
     */
    inline def retry(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowRetryArgs.Builder]):
        com.pulumi.azure.datafactory.TriggerTumblingWindowArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowRetryArgs.builder
      builder.retry(args(argsBuilder).build)

    /**
     * @param triggerDependencies One or more `triggerDependency` block as defined below.
     * @return builder
     */
    inline def triggerDependencies(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowTriggerDependencyArgs.Builder]*):
        com.pulumi.azure.datafactory.TriggerTumblingWindowArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowTriggerDependencyArgs.builder
      builder.triggerDependencies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.CredentialServicePrincipalState.Builder)
    /**
     * @param servicePrincipalKey A `servicePrincipalKey` block as defined below.
     * @return builder
     */
    inline def servicePrincipalKey(args: Endofunction[com.pulumi.azure.datafactory.inputs.CredentialServicePrincipalServicePrincipalKeyArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.CredentialServicePrincipalState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.CredentialServicePrincipalServicePrincipalKeyArgs.builder
      builder.servicePrincipalKey(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.CustomDatasetState.Builder)
    /**
     * @param linkedService A `linkedService` block as defined below.
     * @return builder
     */
    inline def linkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.CustomDatasetLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.CustomDatasetState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.CustomDatasetLinkedServiceArgs.builder
      builder.linkedService(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.DataFlowSinkArgs.Builder)
    /**
     * @param dataset A `dataset` block as defined below.
     * @return builder
     */
    inline def dataset(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSinkDatasetArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowSinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSinkDatasetArgs.builder
      builder.dataset(args(argsBuilder).build)

    /**
     * @param flowlet A `flowlet` block as defined below.
     * @return builder
     */
    inline def flowlet(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSinkFlowletArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowSinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSinkFlowletArgs.builder
      builder.flowlet(args(argsBuilder).build)

    /**
     * @param linkedService A `linkedService` block as defined below.
     * @return builder
     */
    inline def linkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSinkLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowSinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSinkLinkedServiceArgs.builder
      builder.linkedService(args(argsBuilder).build)

    /**
     * @param rejectedLinkedService A `rejectedLinkedService` block as defined below.
     * @return builder
     */
    inline def rejectedLinkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSinkRejectedLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowSinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSinkRejectedLinkedServiceArgs.builder
      builder.rejectedLinkedService(args(argsBuilder).build)

    /**
     * @param schemaLinkedService A `schemaLinkedService` block as defined below.
     * @return builder
     */
    inline def schemaLinkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSinkSchemaLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowSinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSinkSchemaLinkedServiceArgs.builder
      builder.schemaLinkedService(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.DataFlowSourceArgs.Builder)
    /**
     * @param dataset A `dataset` block as defined below.
     * @return builder
     */
    inline def dataset(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSourceDatasetArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSourceDatasetArgs.builder
      builder.dataset(args(argsBuilder).build)

    /**
     * @param flowlet A `flowlet` block as defined below.
     * @return builder
     */
    inline def flowlet(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSourceFlowletArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSourceFlowletArgs.builder
      builder.flowlet(args(argsBuilder).build)

    /**
     * @param linkedService A `linkedService` block as defined below.
     * @return builder
     */
    inline def linkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSourceLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSourceLinkedServiceArgs.builder
      builder.linkedService(args(argsBuilder).build)

    /**
     * @param rejectedLinkedService A `rejectedLinkedService` block as defined below.
     * @return builder
     */
    inline def rejectedLinkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSourceRejectedLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSourceRejectedLinkedServiceArgs.builder
      builder.rejectedLinkedService(args(argsBuilder).build)

    /**
     * @param schemaLinkedService A `schemaLinkedService` block as defined below.
     * @return builder
     */
    inline def schemaLinkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSourceSchemaLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSourceSchemaLinkedServiceArgs.builder
      builder.schemaLinkedService(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.DataFlowState.Builder)
    /**
     * @param sinks One or more `sink` blocks as defined below.
     * @return builder
     */
    inline def sinks(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSinkArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DataFlowState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSinkArgs.builder
      builder.sinks(args.map(_(argsBuilder).build)*)

    /**
     * @param sources One or more `source` blocks as defined below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSourceArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DataFlowState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

    /**
     * @param transformations One or more `transformation` blocks as defined below.
     * @return builder
     */
    inline def transformations(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowTransformationArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DataFlowState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowTransformationArgs.builder
      builder.transformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.DataFlowTransformationArgs.Builder)
    /**
     * @param dataset A `dataset` block as defined below.
     * @return builder
     */
    inline def dataset(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowTransformationDatasetArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowTransformationArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowTransformationDatasetArgs.builder
      builder.dataset(args(argsBuilder).build)

    /**
     * @param flowlet A `flowlet` block as defined below.
     * @return builder
     */
    inline def flowlet(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowTransformationFlowletArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowTransformationArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowTransformationFlowletArgs.builder
      builder.flowlet(args(argsBuilder).build)

    /**
     * @param linkedService A `linkedService` block as defined below.
     * @return builder
     */
    inline def linkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowTransformationLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowTransformationArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowTransformationLinkedServiceArgs.builder
      builder.linkedService(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetAzureBlobState.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetAzureBlobSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetAzureBlobState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetAzureBlobSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetAzureSqlTableState.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetAzureSqlTableSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetAzureSqlTableState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetAzureSqlTableSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetBinaryState.Builder)
    /**
     * @param azureBlobStorageLocation A `azureBlobStorageLocation` block as defined below.
     * @return builder
     */
    inline def azureBlobStorageLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetBinaryAzureBlobStorageLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetBinaryState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetBinaryAzureBlobStorageLocationArgs.builder
      builder.azureBlobStorageLocation(args(argsBuilder).build)

    /**
     * @param compression A `compression` block as defined below.
     * @return builder
     */
    inline def compression(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetBinaryCompressionArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetBinaryState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetBinaryCompressionArgs.builder
      builder.compression(args(argsBuilder).build)

    /**
     * @param httpServerLocation A `httpServerLocation` block as defined below.
     * @return builder
     */
    inline def httpServerLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetBinaryHttpServerLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetBinaryState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetBinaryHttpServerLocationArgs.builder
      builder.httpServerLocation(args(argsBuilder).build)

    /**
     * @param sftpServerLocation A `sftpServerLocation` block as defined below.
     * @return builder
     */
    inline def sftpServerLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetBinarySftpServerLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetBinaryState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetBinarySftpServerLocationArgs.builder
      builder.sftpServerLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetCosmosDBApiState.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetCosmosDBApiSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetCosmosDBApiState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetCosmosDBApiSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextState.Builder)
    /**
     * @param azureBlobFsLocation An `azureBlobFsLocation` block as defined below.
     * @return builder
     */
    inline def azureBlobFsLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextAzureBlobFsLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextAzureBlobFsLocationArgs.builder
      builder.azureBlobFsLocation(args(argsBuilder).build)

    /**
     * @param azureBlobStorageLocation An `azureBlobStorageLocation` block as defined below.
     * @return builder
     */
    inline def azureBlobStorageLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextAzureBlobStorageLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextAzureBlobStorageLocationArgs.builder
      builder.azureBlobStorageLocation(args(argsBuilder).build)

    /**
     * @param httpServerLocation A `httpServerLocation` block as defined below.
     * 
     * The following supported arguments are specific to Delimited Text Dataset:
     * @return builder
     */
    inline def httpServerLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextHttpServerLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextHttpServerLocationArgs.builder
      builder.httpServerLocation(args(argsBuilder).build)

    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetHttpState.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetHttpSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetHttpState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetHttpSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetJsonState.Builder)
    /**
     * @param azureBlobStorageLocation A `azureBlobStorageLocation` block as defined below.
     * 
     * The following supported arguments are specific to Delimited Text Dataset:
     * @return builder
     */
    inline def azureBlobStorageLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetJsonAzureBlobStorageLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetJsonState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetJsonAzureBlobStorageLocationArgs.builder
      builder.azureBlobStorageLocation(args(argsBuilder).build)

    /**
     * @param httpServerLocation A `httpServerLocation` block as defined below.
     * @return builder
     */
    inline def httpServerLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetJsonHttpServerLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetJsonState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetJsonHttpServerLocationArgs.builder
      builder.httpServerLocation(args(argsBuilder).build)

    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetJsonSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetJsonState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetJsonSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetMysqlState.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetMysqlSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetMysqlState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetMysqlSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetParquetState.Builder)
    /**
     * @param azureBlobFsLocation A `azureBlobFsLocation` block as defined below.
     * @return builder
     */
    inline def azureBlobFsLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetParquetAzureBlobFsLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetParquetState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetParquetAzureBlobFsLocationArgs.builder
      builder.azureBlobFsLocation(args(argsBuilder).build)

    /**
     * @param azureBlobStorageLocation A `azureBlobStorageLocation` block as defined below.
     * 
     * The following supported arguments are specific to Parquet Dataset:
     * @return builder
     */
    inline def azureBlobStorageLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetParquetAzureBlobStorageLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetParquetState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetParquetAzureBlobStorageLocationArgs.builder
      builder.azureBlobStorageLocation(args(argsBuilder).build)

    /**
     * @param httpServerLocation A `httpServerLocation` block as defined below.
     * @return builder
     */
    inline def httpServerLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetParquetHttpServerLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetParquetState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetParquetHttpServerLocationArgs.builder
      builder.httpServerLocation(args(argsBuilder).build)

    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetParquetSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetParquetState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetParquetSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetPostgresqlState.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetPostgresqlSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetPostgresqlState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetPostgresqlSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetSnowflakeState.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetSnowflakeSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetSnowflakeState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetSnowflakeSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetSqlServerTableState.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    inline def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetSqlServerTableSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetSqlServerTableState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetSqlServerTableSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.FactoryState.Builder)
    /**
     * @param githubConfiguration A `githubConfiguration` block as defined below.
     * @return builder
     */
    inline def githubConfiguration(args: Endofunction[com.pulumi.azure.datafactory.inputs.FactoryGithubConfigurationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FactoryState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FactoryGithubConfigurationArgs.builder
      builder.githubConfiguration(args(argsBuilder).build)

    /**
     * @param globalParameters A list of `globalParameter` blocks as defined above.
     * @return builder
     */
    inline def globalParameters(args: Endofunction[com.pulumi.azure.datafactory.inputs.FactoryGlobalParameterArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.FactoryState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.FactoryGlobalParameterArgs.builder
      builder.globalParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.datafactory.inputs.FactoryIdentityArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FactoryState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FactoryIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param vstsConfiguration A `vstsConfiguration` block as defined below.
     * @return builder
     */
    inline def vstsConfiguration(args: Endofunction[com.pulumi.azure.datafactory.inputs.FactoryVstsConfigurationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FactoryState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FactoryVstsConfigurationArgs.builder
      builder.vstsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkArgs.Builder)
    /**
     * @param dataset A `dataset` block as defined below.
     * @return builder
     */
    inline def dataset(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkDatasetArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkDatasetArgs.builder
      builder.dataset(args(argsBuilder).build)

    /**
     * @param flowlet A `flowlet` block as defined below.
     * @return builder
     */
    inline def flowlet(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkFlowletArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkFlowletArgs.builder
      builder.flowlet(args(argsBuilder).build)

    /**
     * @param linkedService A `linkedService` block as defined below.
     * @return builder
     */
    inline def linkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkLinkedServiceArgs.builder
      builder.linkedService(args(argsBuilder).build)

    /**
     * @param rejectedLinkedService A `rejectedLinkedService` block as defined below.
     * @return builder
     */
    inline def rejectedLinkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkRejectedLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkRejectedLinkedServiceArgs.builder
      builder.rejectedLinkedService(args(argsBuilder).build)

    /**
     * @param schemaLinkedService A `schemaLinkedService` block as defined below.
     * @return builder
     */
    inline def schemaLinkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkSchemaLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkSchemaLinkedServiceArgs.builder
      builder.schemaLinkedService(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceArgs.Builder)
    /**
     * @param dataset A `dataset` block as defined below.
     * @return builder
     */
    inline def dataset(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceDatasetArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceDatasetArgs.builder
      builder.dataset(args(argsBuilder).build)

    /**
     * @param flowlet A `flowlet` block as defined below.
     * @return builder
     */
    inline def flowlet(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceFlowletArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceFlowletArgs.builder
      builder.flowlet(args(argsBuilder).build)

    /**
     * @param linkedService A `linkedService` block as defined below.
     * @return builder
     */
    inline def linkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceLinkedServiceArgs.builder
      builder.linkedService(args(argsBuilder).build)

    /**
     * @param rejectedLinkedService A `rejectedLinkedService` block as defined below.
     * @return builder
     */
    inline def rejectedLinkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceRejectedLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceRejectedLinkedServiceArgs.builder
      builder.rejectedLinkedService(args(argsBuilder).build)

    /**
     * @param schemaLinkedService A `schemaLinkedService` block as defined below.
     * @return builder
     */
    inline def schemaLinkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceSchemaLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceSchemaLinkedServiceArgs.builder
      builder.schemaLinkedService(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.FlowletDataFlowState.Builder)
    /**
     * @param sinks One or more `sink` blocks as defined below.
     * @return builder
     */
    inline def sinks(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkArgs.builder
      builder.sinks(args.map(_(argsBuilder).build)*)

    /**
     * @param sources One or more `source` blocks as defined below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

    /**
     * @param transformations One or more `transformation` blocks as defined below.
     * @return builder
     */
    inline def transformations(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationArgs.builder
      builder.transformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationArgs.Builder)
    /**
     * @param dataset A `dataset` block as defined below.
     * @return builder
     */
    inline def dataset(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationDatasetArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationDatasetArgs.builder
      builder.dataset(args(argsBuilder).build)

    /**
     * @param flowlet A `flowlet` block as defined below.
     * @return builder
     */
    inline def flowlet(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationFlowletArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationFlowletArgs.builder
      builder.flowlet(args(argsBuilder).build)

    /**
     * @param linkedService A `linkedService` block as defined below.
     * @return builder
     */
    inline def linkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationLinkedServiceArgs.builder
      builder.linkedService(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSelfHostedState.Builder)
    /**
     * @param rbacAuthorizations A `rbacAuthorization` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def rbacAuthorizations(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSelfHostedRbacAuthorizationArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSelfHostedState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSelfHostedRbacAuthorizationArgs.builder
      builder.rbacAuthorizations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupArgs.Builder)
    /**
     * @param commandKeys One or more `commandKey` blocks as defined below.
     * @return builder
     */
    inline def commandKeys(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupCommandKeyArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupCommandKeyArgs.builder
      builder.commandKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param components One or more `component` blocks as defined below.
     * @return builder
     */
    inline def components(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupComponentArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupComponentArgs.builder
      builder.components(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupCommandKeyArgs.Builder)
    /**
     * @param keyVaultPassword A `keyVaultSecretReference` block as defined below.
     * @return builder
     */
    inline def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupCommandKeyKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupCommandKeyArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupCommandKeyKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupComponentArgs.Builder)
    /**
     * @param keyVaultLicense A `keyVaultSecretReference` block as defined below.
     * @return builder
     */
    inline def keyVaultLicense(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupComponentKeyVaultLicenseArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupComponentArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupComponentKeyVaultLicenseArgs.builder
      builder.keyVaultLicense(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisState.Builder)
    /**
     * @param catalogInfo A `catalogInfo` block as defined below.
     * @return builder
     */
    inline def catalogInfo(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCatalogInfoArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCatalogInfoArgs.builder
      builder.catalogInfo(args(argsBuilder).build)

    /**
     * @param copyComputeScale One `copyComputeScale` block as defined below.
     * @return builder
     */
    inline def copyComputeScale(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCopyComputeScaleArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCopyComputeScaleArgs.builder
      builder.copyComputeScale(args(argsBuilder).build)

    /**
     * @param customSetupScript A `customSetupScript` block as defined below.
     * @return builder
     */
    inline def customSetupScript(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCustomSetupScriptArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCustomSetupScriptArgs.builder
      builder.customSetupScript(args(argsBuilder).build)

    /**
     * @param expressCustomSetup An `expressCustomSetup` block as defined below.
     * @return builder
     */
    inline def expressCustomSetup(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupArgs.builder
      builder.expressCustomSetup(args(argsBuilder).build)

    /**
     * @param expressVnetIntegration A `expressVnetIntegration` block as defined below.
     * @return builder
     */
    inline def expressVnetIntegration(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressVnetIntegrationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressVnetIntegrationArgs.builder
      builder.expressVnetIntegration(args(argsBuilder).build)

    /**
     * @param packageStores One or more `packageStore` block as defined below.
     * @return builder
     */
    inline def packageStores(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisPackageStoreArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisPackageStoreArgs.builder
      builder.packageStores(args.map(_(argsBuilder).build)*)

    /**
     * @param pipelineExternalComputeScale One `pipelineExternalComputeScale` block as defined below.
     * @return builder
     */
    inline def pipelineExternalComputeScale(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisPipelineExternalComputeScaleArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisPipelineExternalComputeScaleArgs.builder
      builder.pipelineExternalComputeScale(args(argsBuilder).build)

    /**
     * @param proxy A `proxy` block as defined below.
     * @return builder
     */
    inline def proxy(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisProxyArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisProxyArgs.builder
      builder.proxy(args(argsBuilder).build)

    /**
     * @param vnetIntegration A `vnetIntegration` block as defined below.
     * @return builder
     */
    inline def vnetIntegration(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisVnetIntegrationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisVnetIntegrationArgs.builder
      builder.vnetIntegration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedCustomServiceState.Builder)
    /**
     * @param integrationRuntime An `integrationRuntime` block as defined below.
     * @return builder
     */
    inline def integrationRuntime(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedCustomServiceIntegrationRuntimeArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedCustomServiceState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedCustomServiceIntegrationRuntimeArgs.builder
      builder.integrationRuntime(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageState.Builder)
    /**
     * @return builder
     * @deprecated the `keyVaultSasToken` property has been deprecated in favour of the `sasTokenLinkedKeyVaultKey` property and will be removed in v5.0 of the AzureRM Provider
     */
    @deprecated("the `keyVaultSasToken` property has been deprecated in favour of the `sasTokenLinkedKeyVaultKey` property and will be removed in v5.0 of the AzureRM Provider") inline def keyVaultSasToken(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageKeyVaultSasTokenArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageKeyVaultSasTokenArgs.builder
      builder.keyVaultSasToken(args(argsBuilder).build)

    /**
     * @param sasTokenLinkedKeyVaultKey A `sasTokenLinkedKeyVaultKey` block as defined below. Use this argument to store SAS Token in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. A `sasUri` is required.
     * @return builder
     */
    inline def sasTokenLinkedKeyVaultKey(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageSasTokenLinkedKeyVaultKeyArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageSasTokenLinkedKeyVaultKeyArgs.builder
      builder.sasTokenLinkedKeyVaultKey(args(argsBuilder).build)

    inline def servicePrincipalLinkedKeyVaultKey(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageServicePrincipalLinkedKeyVaultKeyArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageServicePrincipalLinkedKeyVaultKeyArgs.builder
      builder.servicePrincipalLinkedKeyVaultKey(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksState.Builder)
    /**
     * @param instancePool Leverages an instance pool within the linked ADB instance as one `instancePool` block defined below.
     * @return builder
     */
    inline def instancePool(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksInstancePoolArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksInstancePoolArgs.builder
      builder.instancePool(args(argsBuilder).build)

    /**
     * @param keyVaultPassword Authenticate to ADB via Azure Key Vault Linked Service as defined in the `keyVaultPassword` block below.
     * @return builder
     */
    inline def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

    /**
     * @param newClusterConfig Creates new clusters within the linked ADB instance as defined in the `newClusterConfig` block below.
     * @return builder
     */
    inline def newClusterConfig(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksNewClusterConfigArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksNewClusterConfigArgs.builder
      builder.newClusterConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFileStorageState.Builder)
    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store Azure File Storage password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    inline def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFileStorageKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFileStorageState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFileStorageKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFunctionState.Builder)
    /**
     * @param keyVaultKey A `keyVaultKey` block as defined below. Use this Argument to store the system key of the Azure Function in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. Exactly one of either `key` or `keyVaultKey` is required.
     * @return builder
     */
    inline def keyVaultKey(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFunctionKeyVaultKeyArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFunctionState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFunctionKeyVaultKeyArgs.builder
      builder.keyVaultKey(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseState.Builder)
    /**
     * @param keyVaultConnectionString A `keyVaultConnectionString` block as defined below. Use this argument to store Azure SQL Database connection string in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. Exactly one of either `connectionString` or `keyVaultConnectionString` is required.
     * @return builder
     */
    inline def keyVaultConnectionString(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseKeyVaultConnectionStringArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseKeyVaultConnectionStringArgs.builder
      builder.keyVaultConnectionString(args(argsBuilder).build)

    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store SQL Server password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    inline def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceOdataState.Builder)
    /**
     * @param basicAuthentication A `basicAuthentication` block as defined below.
     * @return builder
     */
    inline def basicAuthentication(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceOdataBasicAuthenticationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceOdataState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceOdataBasicAuthenticationArgs.builder
      builder.basicAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceOdbcState.Builder)
    /**
     * @param basicAuthentication A `basicAuthentication` block as defined below.
     * @return builder
     */
    inline def basicAuthentication(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceOdbcBasicAuthenticationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceOdbcState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceOdbcBasicAuthenticationArgs.builder
      builder.basicAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceSftpState.Builder)
    /**
     * @param keyVaultPasswords A `keyVaultPassword` block as defined below.
     * 
     * &gt; **Note:** Either `password` or `keyVaultPassword` is required when `authenticationType` is set to `Basic`.
     * @return builder
     */
    inline def keyVaultPasswords(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPasswordArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.LinkedServiceSftpState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPasswordArgs.builder
      builder.keyVaultPasswords(args.map(_(argsBuilder).build)*)

    /**
     * @param keyVaultPrivateKeyContentBase64 A `keyVaultPrivateKeyContentBase64` block as defined below.
     * @return builder
     */
    inline def keyVaultPrivateKeyContentBase64(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPrivateKeyContentBase64Args.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceSftpState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPrivateKeyContentBase64Args.builder
      builder.keyVaultPrivateKeyContentBase64(args(argsBuilder).build)

    /**
     * @param keyVaultPrivateKeyPassphrase A `keyVaultPrivateKeyPassphrase` block as defined below.
     * 
     * &gt; **Note:** One of `privateKeyContentBase64` or `privateKeyPath` (or their Key Vault equivalent) is required when `authenticationType` is set to `SshPublicKey`.
     * @return builder
     */
    inline def keyVaultPrivateKeyPassphrase(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPrivateKeyPassphraseArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceSftpState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPrivateKeyPassphraseArgs.builder
      builder.keyVaultPrivateKeyPassphrase(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceSnowflakeState.Builder)
    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store Snowflake password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    inline def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSnowflakeKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceSnowflakeState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSnowflakeKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceState.Builder)
    /**
     * @param keyVaultConnectionString A `keyVaultConnectionString` block as defined below. Use this argument to store SQL Managed Instance connection string in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. Exactly one of either `connectionString` or `keyVaultConnectionString` is required.
     * @return builder
     */
    inline def keyVaultConnectionString(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceKeyVaultConnectionStringArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceKeyVaultConnectionStringArgs.builder
      builder.keyVaultConnectionString(args(argsBuilder).build)

    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store SQL Managed Instance password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    inline def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerState.Builder)
    /**
     * @param keyVaultConnectionString A `keyVaultConnectionString` block as defined below. Use this argument to store SQL Server connection string in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. Exactly one of either `connectionString` or `keyVaultConnectionString` is required.
     * @return builder
     */
    inline def keyVaultConnectionString(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerKeyVaultConnectionStringArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerKeyVaultConnectionStringArgs.builder
      builder.keyVaultConnectionString(args(argsBuilder).build)

    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store SQL Server password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    inline def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceSynapseState.Builder)
    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store Synapse password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    inline def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSynapseKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceSynapseState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSynapseKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.TriggerBlobEventState.Builder)
    /**
     * @param pipelines One or more `pipeline` blocks as defined below.
     * @return builder
     */
    inline def pipelines(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerBlobEventPipelineArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.TriggerBlobEventState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerBlobEventPipelineArgs.builder
      builder.pipelines(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.TriggerCustomEventState.Builder)
    /**
     * @param pipelines One or more `pipeline` blocks as defined below.
     * @return builder
     */
    inline def pipelines(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerCustomEventPipelineArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.TriggerCustomEventState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerCustomEventPipelineArgs.builder
      builder.pipelines(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.TriggerScheduleScheduleArgs.Builder)
    /**
     * @param monthlies A `monthly` block as documented below, which specifies the days of the month on which the trigger is scheduled. The value can be specified only with a monthly frequency.
     * @return builder
     */
    inline def monthlies(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerScheduleScheduleMonthlyArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.TriggerScheduleScheduleArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerScheduleScheduleMonthlyArgs.builder
      builder.monthlies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.TriggerScheduleState.Builder)
    /**
     * @param pipelines A `pipeline` block as defined below.
     * @return builder
     */
    inline def pipelines(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerSchedulePipelineArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.TriggerScheduleState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerSchedulePipelineArgs.builder
      builder.pipelines(args.map(_(argsBuilder).build)*)

    /**
     * @param schedule A `schedule` block as defined below, which further specifies the recurrence schedule for the trigger. A schedule is capable of limiting or increasing the number of trigger executions specified by the `frequency` and `interval` properties.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerScheduleScheduleArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.TriggerScheduleState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerScheduleScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowState.Builder)
    /**
     * @param pipeline A `pipeline` block as defined below.
     * @return builder
     */
    inline def pipeline(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowPipelineArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowPipelineArgs.builder
      builder.pipeline(args(argsBuilder).build)

    /**
     * @param retry A `retry` block as defined below.
     * @return builder
     */
    inline def retry(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowRetryArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowRetryArgs.builder
      builder.retry(args(argsBuilder).build)

    /**
     * @param triggerDependencies One or more `triggerDependency` block as defined below.
     * @return builder
     */
    inline def triggerDependencies(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowTriggerDependencyArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowTriggerDependencyArgs.builder
      builder.triggerDependencies(args.map(_(argsBuilder).build)*)
