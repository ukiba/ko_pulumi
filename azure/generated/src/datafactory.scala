package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object datafactory:
  extension (builder: com.pulumi.azure.datafactory.LinkedServiceOdataArgs.Builder)
    /**
     * @param basicAuthentication A `basicAuthentication` block as defined below.
     * @return builder
     */
    def basicAuthentication(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceOdataBasicAuthenticationArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceOdataArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceOdataBasicAuthenticationArgs.builder
      builder.basicAuthentication(args(argsBuilder).build)

  /** Manages a Linked Service (connection) between Synapse and Azure Data Factory. */
  def LinkedServiceSynapse(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceSynapseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceSynapseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceSynapse(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.DatasetBinaryArgs.Builder)
    /**
     * @param azureBlobStorageLocation A `azureBlobStorageLocation` block as defined below.
     * @return builder
     */
    def azureBlobStorageLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetBinaryAzureBlobStorageLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetBinaryArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetBinaryAzureBlobStorageLocationArgs.builder
      builder.azureBlobStorageLocation(args(argsBuilder).build)

    /**
     * @param compression A `compression` block as defined below.
     * @return builder
     */
    def compression(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetBinaryCompressionArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetBinaryArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetBinaryCompressionArgs.builder
      builder.compression(args(argsBuilder).build)

    /**
     * @param httpServerLocation A `httpServerLocation` block as defined below.
     * @return builder
     */
    def httpServerLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetBinaryHttpServerLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetBinaryArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetBinaryHttpServerLocationArgs.builder
      builder.httpServerLocation(args(argsBuilder).build)

    /**
     * @param sftpServerLocation A `sftpServerLocation` block as defined below.
     * @return builder
     */
    def sftpServerLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetBinarySftpServerLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetBinaryArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetBinarySftpServerLocationArgs.builder
      builder.sftpServerLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.FlowletDataFlowArgs.Builder)
    /**
     * @param sinks One or more `sink` blocks as defined below.
     * @return builder
     */
    def sinks(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkArgs.Builder]*):
        com.pulumi.azure.datafactory.FlowletDataFlowArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkArgs.builder
      builder.sinks(args.map(_(argsBuilder).build)*)

    /**
     * @param sources One or more `source` blocks as defined below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceArgs.Builder]*):
        com.pulumi.azure.datafactory.FlowletDataFlowArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

    /**
     * @param transformations One or more `transformation` blocks as defined below.
     * @return builder
     */
    def transformations(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationArgs.Builder]*):
        com.pulumi.azure.datafactory.FlowletDataFlowArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationArgs.builder
      builder.transformations(args.map(_(argsBuilder).build)*)

  /** Manages a Linked Service (connection) between Azure SQL Database and Azure Data Factory. */
  def LinkedServiceAzureSqlDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceAzureSqlDatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceAzureSqlDatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceAzureSqlDatabase(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.DataFlowArgs.Builder)
    /**
     * @param sinks One or more `sink` blocks as defined below.
     * @return builder
     */
    def sinks(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSinkArgs.Builder]*):
        com.pulumi.azure.datafactory.DataFlowArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSinkArgs.builder
      builder.sinks(args.map(_(argsBuilder).build)*)

    /**
     * @param sources One or more `source` blocks as defined below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSourceArgs.Builder]*):
        com.pulumi.azure.datafactory.DataFlowArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

    /**
     * @param transformations One or more `transformation` blocks as defined below.
     * @return builder
     */
    def transformations(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowTransformationArgs.Builder]*):
        com.pulumi.azure.datafactory.DataFlowArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowTransformationArgs.builder
      builder.transformations(args.map(_(argsBuilder).build)*)

  /** Manages a Linked Service (connection) between MySQL and Azure Data Factory. */
  def LinkedServiceMysql(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceMysqlArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceMysqlArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceMysql(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Snowflake Dataset inside an Azure Data Factory. */
  def DatasetSnowflake(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetSnowflakeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetSnowflakeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetSnowflake(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Tumbling Window Trigger inside an Azure Data Factory. */
  def TriggerTumblingWindow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.TriggerTumblingWindowArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.TriggerTumblingWindowArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.TriggerTumblingWindow(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manage a Data Factory Service Principal credential resource. These resources are used by Data Factory to access data sources. */
  def CredentialServicePrincipal(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.CredentialServicePrincipalArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.CredentialServicePrincipalArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.CredentialServicePrincipal(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure HTTP Dataset inside an Azure Data Factory. */
  def DatasetHttp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetHttpArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetHttpArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetHttp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceSftpArgs.Builder)
    /**
     * @param keyVaultPasswords A `keyVaultPassword` block as defined below.
     * 
     *  &gt; **Note:** Either `password` or `keyVaultPassword` is required when `authenticationType` is set to `Basic`.
     * @return builder
     */
    def keyVaultPasswords(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPasswordArgs.Builder]*):
        com.pulumi.azure.datafactory.LinkedServiceSftpArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPasswordArgs.builder
      builder.keyVaultPasswords(args.map(_(argsBuilder).build)*)

    /**
     * @param keyVaultPrivateKeyContentBase64 A `keyVaultPrivateKeyContentBase64` block as defined below.
     * @return builder
     */
    def keyVaultPrivateKeyContentBase64(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPrivateKeyContentBase64Args.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceSftpArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPrivateKeyContentBase64Args.builder
      builder.keyVaultPrivateKeyContentBase64(args(argsBuilder).build)

    /**
     * @param keyVaultPrivateKeyPassphrase A `keyVaultPrivateKeyPassphrase` block as defined below.
     * 
     *  &gt; **Note:** One of `privateKeyContentBase64` or `privateKeyPath` (or their Key Vault equivalent) is required when `authenticationType` is set to `SshPublicKey`.
     * @return builder
     */
    def keyVaultPrivateKeyPassphrase(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPrivateKeyPassphraseArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceSftpArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPrivateKeyPassphraseArgs.builder
      builder.keyVaultPrivateKeyPassphrase(args(argsBuilder).build)

  /** Manages a Linked Service (connection) between a Kusto Cluster and Azure Data Factory. */
  def LinkedServiceKusto(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceKustoArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceKustoArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceKusto(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Pipeline inside a Azure Data Factory. */
  def Pipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.PipelineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.PipelineArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.Pipeline(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Data Flow inside an Azure Data Factory. */
  def DataFlow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DataFlowArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DataFlowArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DataFlow(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.TriggerScheduleArgs.Builder)
    /**
     * @param pipelines A `pipeline` block as defined below.
     * @return builder
     */
    def pipelines(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerSchedulePipelineArgs.Builder]*):
        com.pulumi.azure.datafactory.TriggerScheduleArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerSchedulePipelineArgs.builder
      builder.pipelines(args.map(_(argsBuilder).build)*)

    /**
     * @param schedule A `schedule` block as defined below, which further specifies the recurrence schedule for the trigger. A schedule is capable of limiting or increasing the number of trigger executions specified by the `frequency` and `interval` properties.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerScheduleScheduleArgs.Builder]):
        com.pulumi.azure.datafactory.TriggerScheduleArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerScheduleScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  /** Manages a Linked Service (connection) between a SFTP Server and Azure Data Factory. */
  def LinkedServiceAzureFileStorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceAzureFileStorageArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceAzureFileStorageArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceAzureFileStorage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Linked Service (connection) between an Azure Table Storage and Azure Data Factory. */
  def LinkedServiceAzureTableStorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceAzureTableStorageArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceAzureTableStorageArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceAzureTableStorage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Linked Service (connection) between a SFTP Server and Azure Data Factory. */
  def LinkedServiceSftp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceSftpArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceSftpArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceSftp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.TriggerCustomEventArgs.Builder)
    /**
     * @param pipelines One or more `pipeline` blocks as defined below.
     * @return builder
     */
    def pipelines(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerCustomEventPipelineArgs.Builder]*):
        com.pulumi.azure.datafactory.TriggerCustomEventArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerCustomEventPipelineArgs.builder
      builder.pipelines(args.map(_(argsBuilder).build)*)

  /** Manage a Data Factory User Assigned Managed Identity credential resource. These resources are used by Data Factory to access data sources. */
  def CredentialUserManagedIdentity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.CredentialUserManagedIdentityArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.CredentialUserManagedIdentityArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.CredentialUserManagedIdentity(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Data Factory Azure Integration Runtime. */
  def IntegrationRuntimeRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.IntegrationRuntimeRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.IntegrationRuntimeRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.IntegrationRuntimeRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Blob Event Trigger inside an Azure Data Factory. */
  def TriggerBlobEvent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.TriggerBlobEventArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.TriggerBlobEventArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.TriggerBlobEvent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceAzureBlobStorageArgs.Builder)
    /**
     * @return builder
     * @deprecated the `keyVaultSasToken` property has been deprecated in favour of the `sasTokenLinkedKeyVaultKey` property and will be removed in v5.0 of the AzureRM Provider
     */
    @deprecated def keyVaultSasToken(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageKeyVaultSasTokenArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceAzureBlobStorageArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageKeyVaultSasTokenArgs.builder
      builder.keyVaultSasToken(args(argsBuilder).build)

    /**
     * @param sasTokenLinkedKeyVaultKey A `sasTokenLinkedKeyVaultKey` block as defined below. Use this argument to store SAS Token in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. A `sasUri` is required.
     * @return builder
     */
    def sasTokenLinkedKeyVaultKey(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageSasTokenLinkedKeyVaultKeyArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceAzureBlobStorageArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageSasTokenLinkedKeyVaultKeyArgs.builder
      builder.sasTokenLinkedKeyVaultKey(args(argsBuilder).build)

    def servicePrincipalLinkedKeyVaultKey(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageServicePrincipalLinkedKeyVaultKeyArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceAzureBlobStorageArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageServicePrincipalLinkedKeyVaultKeyArgs.builder
      builder.servicePrincipalLinkedKeyVaultKey(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.CustomDatasetArgs.Builder)
    /**
     * @param linkedService A `linkedService` block as defined below.
     * @return builder
     */
    def linkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.CustomDatasetLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.CustomDatasetArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.CustomDatasetLinkedServiceArgs.builder
      builder.linkedService(args(argsBuilder).build)

  /** Manages an Azure Blob Dataset inside an Azure Data Factory. */
  def DatasetAzureBlob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetAzureBlobArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetAzureBlobArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetAzureBlob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.DatasetCosmosDBApiArgs.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetCosmosDBApiSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetCosmosDBApiArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetCosmosDBApiSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.DatasetParquetArgs.Builder)
    /**
     * @param azureBlobFsLocation A `azureBlobFsLocation` block as defined below.
     * @return builder
     */
    def azureBlobFsLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetParquetAzureBlobFsLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetParquetArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetParquetAzureBlobFsLocationArgs.builder
      builder.azureBlobFsLocation(args(argsBuilder).build)

    /**
     * @param azureBlobStorageLocation A `azureBlobStorageLocation` block as defined below.
     * 
     *  The following supported arguments are specific to Parquet Dataset:
     * @return builder
     */
    def azureBlobStorageLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetParquetAzureBlobStorageLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetParquetArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetParquetAzureBlobStorageLocationArgs.builder
      builder.azureBlobStorageLocation(args(argsBuilder).build)

    /**
     * @param httpServerLocation A `httpServerLocation` block as defined below.
     * @return builder
     */
    def httpServerLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetParquetHttpServerLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetParquetArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetParquetHttpServerLocationArgs.builder
      builder.httpServerLocation(args(argsBuilder).build)

    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetParquetSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetParquetArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetParquetSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  /** Manages a Linked Service (connection) between a Web Server and Azure Data Factory. */
  def LinkedServiceWeb(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceWebArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceWebArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceWeb(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Linked Service (connection) between Azure Search Service and Azure Data Factory. */
  def LinkedServiceAzureSearch(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceAzureSearchArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceAzureSearchArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceAzureSearch(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a SQL Server Table Dataset inside a Azure Data Factory. */
  def DatasetSqlServerTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetSqlServerTableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetSqlServerTableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetSqlServerTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Linked Service (connection) between Azure SQL Managed Instance and Azure Data Factory.
   * 
   *  &gt; **Note:** All arguments including the connectionString will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
   */
  def LinkedServiceSqlManagedInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceSqlManagedInstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceSqlManagedInstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceSqlManagedInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Custom Event Trigger inside an Azure Data Factory. */
  def TriggerCustomEvent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.TriggerCustomEventArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.TriggerCustomEventArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.TriggerCustomEvent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.TriggerTumblingWindowArgs.Builder)
    /**
     * @param pipeline A `pipeline` block as defined below.
     * @return builder
     */
    def pipeline(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowPipelineArgs.Builder]):
        com.pulumi.azure.datafactory.TriggerTumblingWindowArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowPipelineArgs.builder
      builder.pipeline(args(argsBuilder).build)

    /**
     * @param retry A `retry` block as defined below.
     * @return builder
     */
    def retry(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowRetryArgs.Builder]):
        com.pulumi.azure.datafactory.TriggerTumblingWindowArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowRetryArgs.builder
      builder.retry(args(argsBuilder).build)

    /**
     * @param triggerDependencies One or more `triggerDependency` block as defined below.
     * @return builder
     */
    def triggerDependencies(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowTriggerDependencyArgs.Builder]*):
        com.pulumi.azure.datafactory.TriggerTumblingWindowArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowTriggerDependencyArgs.builder
      builder.triggerDependencies(args.map(_(argsBuilder).build)*)

  /** Manages a Flowlet Data Flow inside an Azure Data Factory. */
  def FlowletDataFlow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.FlowletDataFlowArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.FlowletDataFlowArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.FlowletDataFlow(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Linked Service (connection) between Key Vault and Azure Data Factory. */
  def LinkedServiceKeyVault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceKeyVaultArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceKeyVaultArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceKeyVault(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Linked Service (connection) between Data Lake Storage Gen2 and Azure Data Factory. */
  def LinkedServiceDataLakeStorageGen2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceDataLakeStorageGen2Args.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceDataLakeStorageGen2Args.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceDataLakeStorageGen2(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.FactoryArgs.Builder)
    /**
     * @param githubConfiguration A `githubConfiguration` block as defined below.
     * @return builder
     */
    def githubConfiguration(args: Endofunction[com.pulumi.azure.datafactory.inputs.FactoryGithubConfigurationArgs.Builder]):
        com.pulumi.azure.datafactory.FactoryArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FactoryGithubConfigurationArgs.builder
      builder.githubConfiguration(args(argsBuilder).build)

    /**
     * @param globalParameters A list of `globalParameter` blocks as defined above.
     * @return builder
     */
    def globalParameters(args: Endofunction[com.pulumi.azure.datafactory.inputs.FactoryGlobalParameterArgs.Builder]*):
        com.pulumi.azure.datafactory.FactoryArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.FactoryGlobalParameterArgs.builder
      builder.globalParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.datafactory.inputs.FactoryIdentityArgs.Builder]):
        com.pulumi.azure.datafactory.FactoryArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FactoryIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param vstsConfiguration A `vstsConfiguration` block as defined below.
     * @return builder
     */
    def vstsConfiguration(args: Endofunction[com.pulumi.azure.datafactory.inputs.FactoryVstsConfigurationArgs.Builder]):
        com.pulumi.azure.datafactory.FactoryArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FactoryVstsConfigurationArgs.builder
      builder.vstsConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.datafactory.FactoryArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Azure Data Factory (Version 2). */
  def Factory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.FactoryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.FactoryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.datafactory.Factory(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.CredentialServicePrincipalArgs.Builder)
    /**
     * @param servicePrincipalKey A `servicePrincipalKey` block as defined below.
     * @return builder
     */
    def servicePrincipalKey(args: Endofunction[com.pulumi.azure.datafactory.inputs.CredentialServicePrincipalServicePrincipalKeyArgs.Builder]):
        com.pulumi.azure.datafactory.CredentialServicePrincipalArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.CredentialServicePrincipalServicePrincipalKeyArgs.builder
      builder.servicePrincipalKey(args(argsBuilder).build)

  /** Manages a Linked Service (connection) between Azure Databricks and Azure Data Factory. */
  def LinkedServiceAzureDatabricks(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceAzureDatabricksArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceAzureDatabricksArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceAzureDatabricks(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceAzureFileStorageArgs.Builder)
    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store Azure File Storage password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFileStorageKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceAzureFileStorageArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFileStorageKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceSynapseArgs.Builder)
    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store Synapse password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSynapseKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceSynapseArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSynapseKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  /**
   * Manages a Linked Service (connection) between a CosmosDB and Azure Data Factory using Mongo API.
   * 
   *  &gt; **Note:** All arguments including the client secret will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
   */
  def LinkedServiceCosmosDbMongoApi(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceCosmosDbMongoApiArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceCosmosDbMongoApiArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceCosmosDbMongoApi(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.DatasetDelimitedTextArgs.Builder)
    /**
     * @param azureBlobFsLocation An `azureBlobFsLocation` block as defined below.
     * @return builder
     */
    def azureBlobFsLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextAzureBlobFsLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetDelimitedTextArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextAzureBlobFsLocationArgs.builder
      builder.azureBlobFsLocation(args(argsBuilder).build)

    /**
     * @param azureBlobStorageLocation An `azureBlobStorageLocation` block as defined below.
     * @return builder
     */
    def azureBlobStorageLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextAzureBlobStorageLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetDelimitedTextArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextAzureBlobStorageLocationArgs.builder
      builder.azureBlobStorageLocation(args(argsBuilder).build)

    /**
     * @param httpServerLocation A `httpServerLocation` block as defined below.
     * 
     *  The following supported arguments are specific to Delimited Text Dataset:
     * @return builder
     */
    def httpServerLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextHttpServerLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetDelimitedTextArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextHttpServerLocationArgs.builder
      builder.httpServerLocation(args(argsBuilder).build)

    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetDelimitedTextArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceAzureDatabricksArgs.Builder)
    /**
     * @param instancePool Leverages an instance pool within the linked ADB instance as one `instancePool` block defined below.
     * @return builder
     */
    def instancePool(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksInstancePoolArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceAzureDatabricksArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksInstancePoolArgs.builder
      builder.instancePool(args(argsBuilder).build)

    /**
     * @param keyVaultPassword Authenticate to ADB via Azure Key Vault Linked Service as defined in the `keyVaultPassword` block below.
     * @return builder
     */
    def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceAzureDatabricksArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

    /**
     * @param newClusterConfig Creates new clusters within the linked ADB instance as defined in the `newClusterConfig` block below.
     * @return builder
     */
    def newClusterConfig(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksNewClusterConfigArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceAzureDatabricksArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksNewClusterConfigArgs.builder
      builder.newClusterConfig(args(argsBuilder).build)

  /** Manages a Trigger Schedule inside a Azure Data Factory. */
  def TriggerSchedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.TriggerScheduleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.TriggerScheduleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.TriggerSchedule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a MySQL Dataset inside a Azure Data Factory. */
  def DatasetMysql(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetMysqlArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetMysqlArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetMysql(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Linked Service (connection) between a Database and Azure Data Factory through OData protocol.
   * 
   *  &gt; **Note:** All arguments including the connectionString will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
   */
  def LinkedServiceOdata(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceOdataArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceOdataArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceOdata(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.IntegrationRuntimeSelfHostedArgs.Builder)
    /**
     * @param rbacAuthorizations A `rbacAuthorization` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def rbacAuthorizations(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSelfHostedRbacAuthorizationArgs.Builder]*):
        com.pulumi.azure.datafactory.IntegrationRuntimeSelfHostedArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSelfHostedRbacAuthorizationArgs.builder
      builder.rbacAuthorizations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.LinkedCustomServiceArgs.Builder)
    /**
     * @param integrationRuntime An `integrationRuntime` block as defined below.
     * @return builder
     */
    def integrationRuntime(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedCustomServiceIntegrationRuntimeArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedCustomServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedCustomServiceIntegrationRuntimeArgs.builder
      builder.integrationRuntime(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.TriggerBlobEventArgs.Builder)
    /**
     * @param pipelines One or more `pipeline` blocks as defined below.
     * @return builder
     */
    def pipelines(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerBlobEventPipelineArgs.Builder]*):
        com.pulumi.azure.datafactory.TriggerBlobEventArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerBlobEventPipelineArgs.builder
      builder.pipelines(args.map(_(argsBuilder).build)*)

  /** Manages a Linked Service (connection) between a resource and Azure Data Factory. This is a generic resource that supports all different Linked Service Types. */
  def LinkedCustomService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedCustomServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedCustomServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedCustomService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Linked Service (connection) between an Azure Function and Azure Data Factory. */
  def LinkedServiceAzureFunction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceAzureFunctionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceAzureFunctionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceAzureFunction(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Linked Service (connection) between an Azure Blob Storage Account and Azure Data Factory. */
  def LinkedServiceAzureBlobStorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceAzureBlobStorageArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceAzureBlobStorageArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceAzureBlobStorage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.DatasetSqlServerTableArgs.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetSqlServerTableSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetSqlServerTableArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetSqlServerTableSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceOdbcArgs.Builder)
    /**
     * @param basicAuthentication A `basicAuthentication` block as defined below.
     * @return builder
     */
    def basicAuthentication(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceOdbcBasicAuthenticationArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceOdbcArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceOdbcBasicAuthenticationArgs.builder
      builder.basicAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.DatasetJsonArgs.Builder)
    /**
     * @param azureBlobStorageLocation A `azureBlobStorageLocation` block as defined below.
     * 
     *  The following supported arguments are specific to Delimited Text Dataset:
     * @return builder
     */
    def azureBlobStorageLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetJsonAzureBlobStorageLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetJsonArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetJsonAzureBlobStorageLocationArgs.builder
      builder.azureBlobStorageLocation(args(argsBuilder).build)

    /**
     * @param httpServerLocation A `httpServerLocation` block as defined below.
     * @return builder
     */
    def httpServerLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetJsonHttpServerLocationArgs.Builder]):
        com.pulumi.azure.datafactory.DatasetJsonArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetJsonHttpServerLocationArgs.builder
      builder.httpServerLocation(args(argsBuilder).build)

    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetJsonSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetJsonArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetJsonSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.DatasetAzureBlobArgs.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetAzureBlobSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetAzureBlobArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetAzureBlobSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  /** Manages a PostgreSQL Dataset inside a Azure Data Factory. */
  def DatasetPostgresql(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetPostgresqlArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetPostgresqlArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetPostgresql(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.DatasetSnowflakeArgs.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetSnowflakeSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetSnowflakeArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetSnowflakeSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  /**
   * Manages a Customer Managed Key for a Data Factory.
   * 
   *  &gt; **Note:** The Customer Managed Key cannot be removed from the Data Factory once added. To remove the Customer Managed Key delete and recreate the parent Data Factory.
   */
  def CustomerManagedKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.CustomerManagedKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.datafactory.CustomerManagedKeyArgs.builder
    com.pulumi.azure.datafactory.CustomerManagedKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type DatafactoryFunctions = com.pulumi.azure.datafactory.DatafactoryFunctions
  object DatafactoryFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.datafactory.DatafactoryFunctions.*
  extension (self: DatafactoryFunctions.type)
    /** Use this data source to access information about an existing Azure Data Factory (Version 2). */
    def getFactory(args: Endofunction[com.pulumi.azure.datafactory.inputs.GetFactoryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.datafactory.outputs.GetFactoryResult] =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.GetFactoryArgs.builder
      com.pulumi.azure.datafactory.DatafactoryFunctions.getFactory(args(argsBuilder).build)

    /** Use this data source to access information about an existing Azure Data Factory (Version 2). */
    def getFactoryPlain(args: Endofunction[com.pulumi.azure.datafactory.inputs.GetFactoryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.datafactory.outputs.GetFactoryResult] =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.GetFactoryPlainArgs.builder
      com.pulumi.azure.datafactory.DatafactoryFunctions.getFactoryPlain(args(argsBuilder).build)

    /** Use this data source to access information about a trigger schedule in Azure Data Factory. */
    def getTriggerSchedule(args: Endofunction[com.pulumi.azure.datafactory.inputs.GetTriggerScheduleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.datafactory.outputs.GetTriggerScheduleResult] =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.GetTriggerScheduleArgs.builder
      com.pulumi.azure.datafactory.DatafactoryFunctions.getTriggerSchedule(args(argsBuilder).build)

    /** Use this data source to access information about a trigger schedule in Azure Data Factory. */
    def getTriggerSchedulePlain(args: Endofunction[com.pulumi.azure.datafactory.inputs.GetTriggerSchedulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.datafactory.outputs.GetTriggerScheduleResult] =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.GetTriggerSchedulePlainArgs.builder
      com.pulumi.azure.datafactory.DatafactoryFunctions.getTriggerSchedulePlain(args(argsBuilder).build)

    /** Use this data source to access information about all existing trigger schedules in Azure Data Factory. */
    def getTriggerSchedules(args: Endofunction[com.pulumi.azure.datafactory.inputs.GetTriggerSchedulesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.datafactory.outputs.GetTriggerSchedulesResult] =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.GetTriggerSchedulesArgs.builder
      com.pulumi.azure.datafactory.DatafactoryFunctions.getTriggerSchedules(args(argsBuilder).build)

    /** Use this data source to access information about all existing trigger schedules in Azure Data Factory. */
    def getTriggerSchedulesPlain(args: Endofunction[com.pulumi.azure.datafactory.inputs.GetTriggerSchedulesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.datafactory.outputs.GetTriggerSchedulesResult] =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.GetTriggerSchedulesPlainArgs.builder
      com.pulumi.azure.datafactory.DatafactoryFunctions.getTriggerSchedulesPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder)
    /**
     * @param catalogInfo A `catalogInfo` block as defined below.
     * @return builder
     */
    def catalogInfo(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCatalogInfoArgs.Builder]):
        com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCatalogInfoArgs.builder
      builder.catalogInfo(args(argsBuilder).build)

    /**
     * @param copyComputeScale One `copyComputeScale` block as defined below.
     * @return builder
     */
    def copyComputeScale(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCopyComputeScaleArgs.Builder]):
        com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCopyComputeScaleArgs.builder
      builder.copyComputeScale(args(argsBuilder).build)

    /**
     * @param customSetupScript A `customSetupScript` block as defined below.
     * @return builder
     */
    def customSetupScript(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCustomSetupScriptArgs.Builder]):
        com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCustomSetupScriptArgs.builder
      builder.customSetupScript(args(argsBuilder).build)

    /**
     * @param expressCustomSetup An `expressCustomSetup` block as defined below.
     * @return builder
     */
    def expressCustomSetup(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupArgs.Builder]):
        com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupArgs.builder
      builder.expressCustomSetup(args(argsBuilder).build)

    /**
     * @param expressVnetIntegration A `expressVnetIntegration` block as defined below.
     * @return builder
     */
    def expressVnetIntegration(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressVnetIntegrationArgs.Builder]):
        com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressVnetIntegrationArgs.builder
      builder.expressVnetIntegration(args(argsBuilder).build)

    /**
     * @param packageStores One or more `packageStore` block as defined below.
     * @return builder
     */
    def packageStores(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisPackageStoreArgs.Builder]*):
        com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisPackageStoreArgs.builder
      builder.packageStores(args.map(_(argsBuilder).build)*)

    /**
     * @param pipelineExternalComputeScale One `pipelineExternalComputeScale` block as defined below.
     * @return builder
     */
    def pipelineExternalComputeScale(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisPipelineExternalComputeScaleArgs.Builder]):
        com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisPipelineExternalComputeScaleArgs.builder
      builder.pipelineExternalComputeScale(args(argsBuilder).build)

    /**
     * @param proxy A `proxy` block as defined below.
     * @return builder
     */
    def proxy(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisProxyArgs.Builder]):
        com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisProxyArgs.builder
      builder.proxy(args(argsBuilder).build)

    /**
     * @param vnetIntegration A `vnetIntegration` block as defined below.
     * @return builder
     */
    def vnetIntegration(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisVnetIntegrationArgs.Builder]):
        com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisVnetIntegrationArgs.builder
      builder.vnetIntegration(args(argsBuilder).build)

  /** Manages an Azure Delimited Text Dataset inside an Azure Data Factory. */
  def DatasetDelimitedText(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetDelimitedTextArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetDelimitedTextArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetDelimitedText(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Linked Service (connection) between PostgreSQL and Azure Data Factory. */
  def LinkedServicePostgresql(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServicePostgresqlArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServicePostgresqlArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServicePostgresql(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Data Factory Managed Private Endpoint. */
  def ManagedPrivateEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.ManagedPrivateEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.ManagedPrivateEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.ManagedPrivateEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Dataset inside an Azure Data Factory. This is a generic resource that supports all different Dataset Types. */
  def CustomDataset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.CustomDatasetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.CustomDatasetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.CustomDataset(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceSnowflakeArgs.Builder)
    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store Snowflake password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSnowflakeKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceSnowflakeArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSnowflakeKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  /** Manages an Azure Parquet Dataset inside an Azure Data Factory. */
  def DatasetParquet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetParquetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetParquetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetParquet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceSqlManagedInstanceArgs.Builder)
    /**
     * @param keyVaultConnectionString A `keyVaultConnectionString` block as defined below. Use this argument to store SQL Managed Instance connection string in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. Exactly one of either `connectionString` or `keyVaultConnectionString` is required.
     * @return builder
     */
    def keyVaultConnectionString(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceKeyVaultConnectionStringArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceSqlManagedInstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceKeyVaultConnectionStringArgs.builder
      builder.keyVaultConnectionString(args(argsBuilder).build)

    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store SQL Managed Instance password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceSqlManagedInstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceAzureSqlDatabaseArgs.Builder)
    /**
     * @param keyVaultConnectionString A `keyVaultConnectionString` block as defined below. Use this argument to store Azure SQL Database connection string in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. Exactly one of either `connectionString` or `keyVaultConnectionString` is required.
     * @return builder
     */
    def keyVaultConnectionString(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseKeyVaultConnectionStringArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceAzureSqlDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseKeyVaultConnectionStringArgs.builder
      builder.keyVaultConnectionString(args(argsBuilder).build)

    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store SQL Server password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceAzureSqlDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  /** Manages a Data Factory Binary Dataset inside an Azure Data Factory. */
  def DatasetBinary(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetBinaryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetBinaryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetBinary(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Data Factory Azure-SSIS Integration Runtime. */
  def IntegrationRuntimeSsis(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.IntegrationRuntimeSsis(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceSqlServerArgs.Builder)
    /**
     * @param keyVaultConnectionString A `keyVaultConnectionString` block as defined below. Use this argument to store SQL Server connection string in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. Exactly one of either `connectionString` or `keyVaultConnectionString` is required.
     * @return builder
     */
    def keyVaultConnectionString(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerKeyVaultConnectionStringArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceSqlServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerKeyVaultConnectionStringArgs.builder
      builder.keyVaultConnectionString(args(argsBuilder).build)

    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store SQL Server password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceSqlServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.DatasetPostgresqlArgs.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetPostgresqlSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetPostgresqlArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetPostgresqlSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  /** Manages an Azure Cosmos DB SQL API Dataset inside an Azure Data Factory. */
  def DatasetCosmosDBApi(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetCosmosDBApiArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetCosmosDBApiArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetCosmosDBApi(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure JSON Dataset inside an Azure Data Factory. */
  def DatasetJson(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetJsonArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetJsonArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetJson(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.DatasetAzureSqlTableArgs.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetAzureSqlTableSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetAzureSqlTableArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetAzureSqlTableSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  /** Manages an Azure SQL Table Dataset inside an Azure Data Factory. */
  def DatasetAzureSqlTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetAzureSqlTableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetAzureSqlTableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetAzureSqlTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Linked Service (connection) between a CosmosDB and Azure Data Factory using SQL API. */
  def LinkedServiceCosmosDb(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceCosmosDbArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceCosmosDbArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceCosmosDb(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Data Factory Self-hosted Integration Runtime. */
  def IntegrationRuntimeSelfHosted(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.IntegrationRuntimeSelfHostedArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.IntegrationRuntimeSelfHostedArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.IntegrationRuntimeSelfHosted(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.LinkedServiceAzureFunctionArgs.Builder)
    /**
     * @param keyVaultKey A `keyVaultKey` block as defined below. Use this Argument to store the system key of the Azure Function in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. Exactly one of either `key` or `keyVaultKey` is required.
     * @return builder
     */
    def keyVaultKey(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFunctionKeyVaultKeyArgs.Builder]):
        com.pulumi.azure.datafactory.LinkedServiceAzureFunctionArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFunctionKeyVaultKeyArgs.builder
      builder.keyVaultKey(args(argsBuilder).build)

  /** Manages a Linked Service (connection) between a SQL Server and Azure Data Factory. */
  def LinkedServiceSqlServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceSqlServerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceSqlServerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceSqlServer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Linked Service (connection) between a Database and Azure Data Factory through ODBC protocol.
   * 
   *  &gt; **Note:** All arguments including the connectionString will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
   */
  def LinkedServiceOdbc(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceOdbcArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceOdbcArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceOdbc(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.DatasetHttpArgs.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetHttpSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetHttpArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetHttpSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  /** Manages a Linked Service (connection) between Snowflake and Azure Data Factory. */
  def LinkedServiceSnowflake(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceSnowflakeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceSnowflakeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceSnowflake(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkArgs.Builder)
    /**
     * @param dataset A `dataset` block as defined below.
     * @return builder
     */
    def dataset(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkDatasetArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkDatasetArgs.builder
      builder.dataset(args(argsBuilder).build)

    /**
     * @param flowlet A `flowlet` block as defined below.
     * @return builder
     */
    def flowlet(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkFlowletArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkFlowletArgs.builder
      builder.flowlet(args(argsBuilder).build)

    /**
     * @param linkedService A `linkedService` block as defined below.
     * @return builder
     */
    def linkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkLinkedServiceArgs.builder
      builder.linkedService(args(argsBuilder).build)

    /**
     * @param rejectedLinkedService A `rejectedLinkedService` block as defined below.
     * @return builder
     */
    def rejectedLinkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkRejectedLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkRejectedLinkedServiceArgs.builder
      builder.rejectedLinkedService(args(argsBuilder).build)

    /**
     * @param schemaLinkedService A `schemaLinkedService` block as defined below.
     * @return builder
     */
    def schemaLinkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkSchemaLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkSchemaLinkedServiceArgs.builder
      builder.schemaLinkedService(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageState.Builder)
    /**
     * @return builder
     * @deprecated the `keyVaultSasToken` property has been deprecated in favour of the `sasTokenLinkedKeyVaultKey` property and will be removed in v5.0 of the AzureRM Provider
     */
    @deprecated def keyVaultSasToken(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageKeyVaultSasTokenArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageKeyVaultSasTokenArgs.builder
      builder.keyVaultSasToken(args(argsBuilder).build)

    /**
     * @param sasTokenLinkedKeyVaultKey A `sasTokenLinkedKeyVaultKey` block as defined below. Use this argument to store SAS Token in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. A `sasUri` is required.
     * @return builder
     */
    def sasTokenLinkedKeyVaultKey(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageSasTokenLinkedKeyVaultKeyArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageSasTokenLinkedKeyVaultKeyArgs.builder
      builder.sasTokenLinkedKeyVaultKey(args(argsBuilder).build)

    def servicePrincipalLinkedKeyVaultKey(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageServicePrincipalLinkedKeyVaultKeyArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageServicePrincipalLinkedKeyVaultKeyArgs.builder
      builder.servicePrincipalLinkedKeyVaultKey(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.TriggerCustomEventState.Builder)
    /**
     * @param pipelines One or more `pipeline` blocks as defined below.
     * @return builder
     */
    def pipelines(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerCustomEventPipelineArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.TriggerCustomEventState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerCustomEventPipelineArgs.builder
      builder.pipelines(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupComponentArgs.Builder)
    /**
     * @param keyVaultLicense A `keyVaultSecretReference` block as defined below.
     * @return builder
     */
    def keyVaultLicense(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupComponentKeyVaultLicenseArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupComponentArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupComponentKeyVaultLicenseArgs.builder
      builder.keyVaultLicense(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFunctionState.Builder)
    /**
     * @param keyVaultKey A `keyVaultKey` block as defined below. Use this Argument to store the system key of the Azure Function in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. Exactly one of either `key` or `keyVaultKey` is required.
     * @return builder
     */
    def keyVaultKey(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFunctionKeyVaultKeyArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFunctionState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFunctionKeyVaultKeyArgs.builder
      builder.keyVaultKey(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowState.Builder)
    /**
     * @param pipeline A `pipeline` block as defined below.
     * @return builder
     */
    def pipeline(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowPipelineArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowPipelineArgs.builder
      builder.pipeline(args(argsBuilder).build)

    /**
     * @param retry A `retry` block as defined below.
     * @return builder
     */
    def retry(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowRetryArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowRetryArgs.builder
      builder.retry(args(argsBuilder).build)

    /**
     * @param triggerDependencies One or more `triggerDependency` block as defined below.
     * @return builder
     */
    def triggerDependencies(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowTriggerDependencyArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerTumblingWindowTriggerDependencyArgs.builder
      builder.triggerDependencies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSelfHostedState.Builder)
    /**
     * @param rbacAuthorizations A `rbacAuthorization` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def rbacAuthorizations(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSelfHostedRbacAuthorizationArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSelfHostedState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSelfHostedRbacAuthorizationArgs.builder
      builder.rbacAuthorizations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetCosmosDBApiState.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetCosmosDBApiSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetCosmosDBApiState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetCosmosDBApiSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.DataFlowTransformationArgs.Builder)
    /**
     * @param dataset A `dataset` block as defined below.
     * @return builder
     */
    def dataset(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowTransformationDatasetArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowTransformationArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowTransformationDatasetArgs.builder
      builder.dataset(args(argsBuilder).build)

    /**
     * @param flowlet A `flowlet` block as defined below.
     * @return builder
     */
    def flowlet(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowTransformationFlowletArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowTransformationArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowTransformationFlowletArgs.builder
      builder.flowlet(args(argsBuilder).build)

    /**
     * @param linkedService A `linkedService` block as defined below.
     * @return builder
     */
    def linkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowTransformationLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowTransformationArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowTransformationLinkedServiceArgs.builder
      builder.linkedService(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.DataFlowState.Builder)
    /**
     * @param sinks One or more `sink` blocks as defined below.
     * @return builder
     */
    def sinks(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSinkArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DataFlowState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSinkArgs.builder
      builder.sinks(args.map(_(argsBuilder).build)*)

    /**
     * @param sources One or more `source` blocks as defined below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSourceArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DataFlowState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

    /**
     * @param transformations One or more `transformation` blocks as defined below.
     * @return builder
     */
    def transformations(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowTransformationArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DataFlowState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowTransformationArgs.builder
      builder.transformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetAzureSqlTableState.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetAzureSqlTableSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetAzureSqlTableState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetAzureSqlTableSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.CredentialServicePrincipalState.Builder)
    /**
     * @param servicePrincipalKey A `servicePrincipalKey` block as defined below.
     * @return builder
     */
    def servicePrincipalKey(args: Endofunction[com.pulumi.azure.datafactory.inputs.CredentialServicePrincipalServicePrincipalKeyArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.CredentialServicePrincipalState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.CredentialServicePrincipalServicePrincipalKeyArgs.builder
      builder.servicePrincipalKey(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetPostgresqlState.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetPostgresqlSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetPostgresqlState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetPostgresqlSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupArgs.Builder)
    /**
     * @param commandKeys One or more `commandKey` blocks as defined below.
     * @return builder
     */
    def commandKeys(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupCommandKeyArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupCommandKeyArgs.builder
      builder.commandKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param components One or more `component` blocks as defined below.
     * @return builder
     */
    def components(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupComponentArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupComponentArgs.builder
      builder.components(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceSnowflakeState.Builder)
    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store Snowflake password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSnowflakeKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceSnowflakeState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSnowflakeKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.TriggerScheduleScheduleArgs.Builder)
    /**
     * @param monthlies A `monthly` block as documented below, which specifies the days of the month on which the trigger is scheduled. The value can be specified only with a monthly frequency.
     * @return builder
     */
    def monthlies(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerScheduleScheduleMonthlyArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.TriggerScheduleScheduleArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerScheduleScheduleMonthlyArgs.builder
      builder.monthlies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerState.Builder)
    /**
     * @param keyVaultConnectionString A `keyVaultConnectionString` block as defined below. Use this argument to store SQL Server connection string in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. Exactly one of either `connectionString` or `keyVaultConnectionString` is required.
     * @return builder
     */
    def keyVaultConnectionString(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerKeyVaultConnectionStringArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerKeyVaultConnectionStringArgs.builder
      builder.keyVaultConnectionString(args(argsBuilder).build)

    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store SQL Server password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSqlServerKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetJsonState.Builder)
    /**
     * @param azureBlobStorageLocation A `azureBlobStorageLocation` block as defined below.
     * 
     *  The following supported arguments are specific to Delimited Text Dataset:
     * @return builder
     */
    def azureBlobStorageLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetJsonAzureBlobStorageLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetJsonState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetJsonAzureBlobStorageLocationArgs.builder
      builder.azureBlobStorageLocation(args(argsBuilder).build)

    /**
     * @param httpServerLocation A `httpServerLocation` block as defined below.
     * @return builder
     */
    def httpServerLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetJsonHttpServerLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetJsonState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetJsonHttpServerLocationArgs.builder
      builder.httpServerLocation(args(argsBuilder).build)

    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetJsonSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetJsonState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetJsonSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceOdataState.Builder)
    /**
     * @param basicAuthentication A `basicAuthentication` block as defined below.
     * @return builder
     */
    def basicAuthentication(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceOdataBasicAuthenticationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceOdataState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceOdataBasicAuthenticationArgs.builder
      builder.basicAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetHttpState.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetHttpSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetHttpState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetHttpSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextState.Builder)
    /**
     * @param azureBlobFsLocation An `azureBlobFsLocation` block as defined below.
     * @return builder
     */
    def azureBlobFsLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextAzureBlobFsLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextAzureBlobFsLocationArgs.builder
      builder.azureBlobFsLocation(args(argsBuilder).build)

    /**
     * @param azureBlobStorageLocation An `azureBlobStorageLocation` block as defined below.
     * @return builder
     */
    def azureBlobStorageLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextAzureBlobStorageLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextAzureBlobStorageLocationArgs.builder
      builder.azureBlobStorageLocation(args(argsBuilder).build)

    /**
     * @param httpServerLocation A `httpServerLocation` block as defined below.
     * 
     *  The following supported arguments are specific to Delimited Text Dataset:
     * @return builder
     */
    def httpServerLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextHttpServerLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextHttpServerLocationArgs.builder
      builder.httpServerLocation(args(argsBuilder).build)

    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceSynapseState.Builder)
    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store Synapse password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSynapseKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceSynapseState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSynapseKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetAzureBlobState.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetAzureBlobSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetAzureBlobState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetAzureBlobSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.FlowletDataFlowState.Builder)
    /**
     * @param sinks One or more `sink` blocks as defined below.
     * @return builder
     */
    def sinks(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkArgs.builder
      builder.sinks(args.map(_(argsBuilder).build)*)

    /**
     * @param sources One or more `source` blocks as defined below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

    /**
     * @param transformations One or more `transformation` blocks as defined below.
     * @return builder
     */
    def transformations(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationArgs.builder
      builder.transformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupCommandKeyArgs.Builder)
    /**
     * @param keyVaultPassword A `keyVaultSecretReference` block as defined below.
     * @return builder
     */
    def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupCommandKeyKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupCommandKeyArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupCommandKeyKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.DataFlowSourceArgs.Builder)
    /**
     * @param dataset A `dataset` block as defined below.
     * @return builder
     */
    def dataset(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSourceDatasetArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSourceDatasetArgs.builder
      builder.dataset(args(argsBuilder).build)

    /**
     * @param flowlet A `flowlet` block as defined below.
     * @return builder
     */
    def flowlet(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSourceFlowletArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSourceFlowletArgs.builder
      builder.flowlet(args(argsBuilder).build)

    /**
     * @param linkedService A `linkedService` block as defined below.
     * @return builder
     */
    def linkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSourceLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSourceLinkedServiceArgs.builder
      builder.linkedService(args(argsBuilder).build)

    /**
     * @param rejectedLinkedService A `rejectedLinkedService` block as defined below.
     * @return builder
     */
    def rejectedLinkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSourceRejectedLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSourceRejectedLinkedServiceArgs.builder
      builder.rejectedLinkedService(args(argsBuilder).build)

    /**
     * @param schemaLinkedService A `schemaLinkedService` block as defined below.
     * @return builder
     */
    def schemaLinkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSourceSchemaLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSourceSchemaLinkedServiceArgs.builder
      builder.schemaLinkedService(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetBinaryState.Builder)
    /**
     * @param azureBlobStorageLocation A `azureBlobStorageLocation` block as defined below.
     * @return builder
     */
    def azureBlobStorageLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetBinaryAzureBlobStorageLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetBinaryState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetBinaryAzureBlobStorageLocationArgs.builder
      builder.azureBlobStorageLocation(args(argsBuilder).build)

    /**
     * @param compression A `compression` block as defined below.
     * @return builder
     */
    def compression(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetBinaryCompressionArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetBinaryState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetBinaryCompressionArgs.builder
      builder.compression(args(argsBuilder).build)

    /**
     * @param httpServerLocation A `httpServerLocation` block as defined below.
     * @return builder
     */
    def httpServerLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetBinaryHttpServerLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetBinaryState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetBinaryHttpServerLocationArgs.builder
      builder.httpServerLocation(args(argsBuilder).build)

    /**
     * @param sftpServerLocation A `sftpServerLocation` block as defined below.
     * @return builder
     */
    def sftpServerLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetBinarySftpServerLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetBinaryState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetBinarySftpServerLocationArgs.builder
      builder.sftpServerLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.FactoryState.Builder)
    /**
     * @param githubConfiguration A `githubConfiguration` block as defined below.
     * @return builder
     */
    def githubConfiguration(args: Endofunction[com.pulumi.azure.datafactory.inputs.FactoryGithubConfigurationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FactoryState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FactoryGithubConfigurationArgs.builder
      builder.githubConfiguration(args(argsBuilder).build)

    /**
     * @param globalParameters A list of `globalParameter` blocks as defined above.
     * @return builder
     */
    def globalParameters(args: Endofunction[com.pulumi.azure.datafactory.inputs.FactoryGlobalParameterArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.FactoryState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.FactoryGlobalParameterArgs.builder
      builder.globalParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.datafactory.inputs.FactoryIdentityArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FactoryState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FactoryIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param vstsConfiguration A `vstsConfiguration` block as defined below.
     * @return builder
     */
    def vstsConfiguration(args: Endofunction[com.pulumi.azure.datafactory.inputs.FactoryVstsConfigurationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FactoryState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FactoryVstsConfigurationArgs.builder
      builder.vstsConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.datafactory.inputs.FactoryState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisState.Builder)
    /**
     * @param catalogInfo A `catalogInfo` block as defined below.
     * @return builder
     */
    def catalogInfo(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCatalogInfoArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCatalogInfoArgs.builder
      builder.catalogInfo(args(argsBuilder).build)

    /**
     * @param copyComputeScale One `copyComputeScale` block as defined below.
     * @return builder
     */
    def copyComputeScale(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCopyComputeScaleArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCopyComputeScaleArgs.builder
      builder.copyComputeScale(args(argsBuilder).build)

    /**
     * @param customSetupScript A `customSetupScript` block as defined below.
     * @return builder
     */
    def customSetupScript(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCustomSetupScriptArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCustomSetupScriptArgs.builder
      builder.customSetupScript(args(argsBuilder).build)

    /**
     * @param expressCustomSetup An `expressCustomSetup` block as defined below.
     * @return builder
     */
    def expressCustomSetup(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupArgs.builder
      builder.expressCustomSetup(args(argsBuilder).build)

    /**
     * @param expressVnetIntegration A `expressVnetIntegration` block as defined below.
     * @return builder
     */
    def expressVnetIntegration(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressVnetIntegrationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressVnetIntegrationArgs.builder
      builder.expressVnetIntegration(args(argsBuilder).build)

    /**
     * @param packageStores One or more `packageStore` block as defined below.
     * @return builder
     */
    def packageStores(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisPackageStoreArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisPackageStoreArgs.builder
      builder.packageStores(args.map(_(argsBuilder).build)*)

    /**
     * @param pipelineExternalComputeScale One `pipelineExternalComputeScale` block as defined below.
     * @return builder
     */
    def pipelineExternalComputeScale(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisPipelineExternalComputeScaleArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisPipelineExternalComputeScaleArgs.builder
      builder.pipelineExternalComputeScale(args(argsBuilder).build)

    /**
     * @param proxy A `proxy` block as defined below.
     * @return builder
     */
    def proxy(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisProxyArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisProxyArgs.builder
      builder.proxy(args(argsBuilder).build)

    /**
     * @param vnetIntegration A `vnetIntegration` block as defined below.
     * @return builder
     */
    def vnetIntegration(args: Endofunction[com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisVnetIntegrationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisVnetIntegrationArgs.builder
      builder.vnetIntegration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.CustomDatasetState.Builder)
    /**
     * @param linkedService A `linkedService` block as defined below.
     * @return builder
     */
    def linkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.CustomDatasetLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.CustomDatasetState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.CustomDatasetLinkedServiceArgs.builder
      builder.linkedService(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationArgs.Builder)
    /**
     * @param dataset A `dataset` block as defined below.
     * @return builder
     */
    def dataset(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationDatasetArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationDatasetArgs.builder
      builder.dataset(args(argsBuilder).build)

    /**
     * @param flowlet A `flowlet` block as defined below.
     * @return builder
     */
    def flowlet(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationFlowletArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationFlowletArgs.builder
      builder.flowlet(args(argsBuilder).build)

    /**
     * @param linkedService A `linkedService` block as defined below.
     * @return builder
     */
    def linkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowTransformationLinkedServiceArgs.builder
      builder.linkedService(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.TriggerBlobEventState.Builder)
    /**
     * @param pipelines One or more `pipeline` blocks as defined below.
     * @return builder
     */
    def pipelines(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerBlobEventPipelineArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.TriggerBlobEventState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerBlobEventPipelineArgs.builder
      builder.pipelines(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.TriggerScheduleState.Builder)
    /**
     * @param pipelines A `pipeline` block as defined below.
     * @return builder
     */
    def pipelines(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerSchedulePipelineArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.TriggerScheduleState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerSchedulePipelineArgs.builder
      builder.pipelines(args.map(_(argsBuilder).build)*)

    /**
     * @param schedule A `schedule` block as defined below, which further specifies the recurrence schedule for the trigger. A schedule is capable of limiting or increasing the number of trigger executions specified by the `frequency` and `interval` properties.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.azure.datafactory.inputs.TriggerScheduleScheduleArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.TriggerScheduleState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.TriggerScheduleScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetSqlServerTableState.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetSqlServerTableSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetSqlServerTableState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetSqlServerTableSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetParquetState.Builder)
    /**
     * @param azureBlobFsLocation A `azureBlobFsLocation` block as defined below.
     * @return builder
     */
    def azureBlobFsLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetParquetAzureBlobFsLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetParquetState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetParquetAzureBlobFsLocationArgs.builder
      builder.azureBlobFsLocation(args(argsBuilder).build)

    /**
     * @param azureBlobStorageLocation A `azureBlobStorageLocation` block as defined below.
     * 
     *  The following supported arguments are specific to Parquet Dataset:
     * @return builder
     */
    def azureBlobStorageLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetParquetAzureBlobStorageLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetParquetState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetParquetAzureBlobStorageLocationArgs.builder
      builder.azureBlobStorageLocation(args(argsBuilder).build)

    /**
     * @param httpServerLocation A `httpServerLocation` block as defined below.
     * @return builder
     */
    def httpServerLocation(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetParquetHttpServerLocationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DatasetParquetState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetParquetHttpServerLocationArgs.builder
      builder.httpServerLocation(args(argsBuilder).build)

    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetParquetSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetParquetState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetParquetSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.DataFlowSinkArgs.Builder)
    /**
     * @param dataset A `dataset` block as defined below.
     * @return builder
     */
    def dataset(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSinkDatasetArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowSinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSinkDatasetArgs.builder
      builder.dataset(args(argsBuilder).build)

    /**
     * @param flowlet A `flowlet` block as defined below.
     * @return builder
     */
    def flowlet(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSinkFlowletArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowSinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSinkFlowletArgs.builder
      builder.flowlet(args(argsBuilder).build)

    /**
     * @param linkedService A `linkedService` block as defined below.
     * @return builder
     */
    def linkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSinkLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowSinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSinkLinkedServiceArgs.builder
      builder.linkedService(args(argsBuilder).build)

    /**
     * @param rejectedLinkedService A `rejectedLinkedService` block as defined below.
     * @return builder
     */
    def rejectedLinkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSinkRejectedLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowSinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSinkRejectedLinkedServiceArgs.builder
      builder.rejectedLinkedService(args(argsBuilder).build)

    /**
     * @param schemaLinkedService A `schemaLinkedService` block as defined below.
     * @return builder
     */
    def schemaLinkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.DataFlowSinkSchemaLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.DataFlowSinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.DataFlowSinkSchemaLinkedServiceArgs.builder
      builder.schemaLinkedService(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceState.Builder)
    /**
     * @param keyVaultConnectionString A `keyVaultConnectionString` block as defined below. Use this argument to store SQL Managed Instance connection string in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. Exactly one of either `connectionString` or `keyVaultConnectionString` is required.
     * @return builder
     */
    def keyVaultConnectionString(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceKeyVaultConnectionStringArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceKeyVaultConnectionStringArgs.builder
      builder.keyVaultConnectionString(args(argsBuilder).build)

    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store SQL Managed Instance password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSqlManagedInstanceKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceSftpState.Builder)
    /**
     * @param keyVaultPasswords A `keyVaultPassword` block as defined below.
     * 
     *  &gt; **Note:** Either `password` or `keyVaultPassword` is required when `authenticationType` is set to `Basic`.
     * @return builder
     */
    def keyVaultPasswords(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPasswordArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.LinkedServiceSftpState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPasswordArgs.builder
      builder.keyVaultPasswords(args.map(_(argsBuilder).build)*)

    /**
     * @param keyVaultPrivateKeyContentBase64 A `keyVaultPrivateKeyContentBase64` block as defined below.
     * @return builder
     */
    def keyVaultPrivateKeyContentBase64(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPrivateKeyContentBase64Args.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceSftpState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPrivateKeyContentBase64Args.builder
      builder.keyVaultPrivateKeyContentBase64(args(argsBuilder).build)

    /**
     * @param keyVaultPrivateKeyPassphrase A `keyVaultPrivateKeyPassphrase` block as defined below.
     * 
     *  &gt; **Note:** One of `privateKeyContentBase64` or `privateKeyPath` (or their Key Vault equivalent) is required when `authenticationType` is set to `SshPublicKey`.
     * @return builder
     */
    def keyVaultPrivateKeyPassphrase(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPrivateKeyPassphraseArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceSftpState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceSftpKeyVaultPrivateKeyPassphraseArgs.builder
      builder.keyVaultPrivateKeyPassphrase(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksState.Builder)
    /**
     * @param instancePool Leverages an instance pool within the linked ADB instance as one `instancePool` block defined below.
     * @return builder
     */
    def instancePool(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksInstancePoolArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksInstancePoolArgs.builder
      builder.instancePool(args(argsBuilder).build)

    /**
     * @param keyVaultPassword Authenticate to ADB via Azure Key Vault Linked Service as defined in the `keyVaultPassword` block below.
     * @return builder
     */
    def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

    /**
     * @param newClusterConfig Creates new clusters within the linked ADB instance as defined in the `newClusterConfig` block below.
     * @return builder
     */
    def newClusterConfig(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksNewClusterConfigArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureDatabricksNewClusterConfigArgs.builder
      builder.newClusterConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceOdbcState.Builder)
    /**
     * @param basicAuthentication A `basicAuthentication` block as defined below.
     * @return builder
     */
    def basicAuthentication(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceOdbcBasicAuthenticationArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceOdbcState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceOdbcBasicAuthenticationArgs.builder
      builder.basicAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceArgs.Builder)
    /**
     * @param dataset A `dataset` block as defined below.
     * @return builder
     */
    def dataset(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceDatasetArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceDatasetArgs.builder
      builder.dataset(args(argsBuilder).build)

    /**
     * @param flowlet A `flowlet` block as defined below.
     * @return builder
     */
    def flowlet(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceFlowletArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceFlowletArgs.builder
      builder.flowlet(args(argsBuilder).build)

    /**
     * @param linkedService A `linkedService` block as defined below.
     * @return builder
     */
    def linkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceLinkedServiceArgs.builder
      builder.linkedService(args(argsBuilder).build)

    /**
     * @param rejectedLinkedService A `rejectedLinkedService` block as defined below.
     * @return builder
     */
    def rejectedLinkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceRejectedLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceRejectedLinkedServiceArgs.builder
      builder.rejectedLinkedService(args(argsBuilder).build)

    /**
     * @param schemaLinkedService A `schemaLinkedService` block as defined below.
     * @return builder
     */
    def schemaLinkedService(args: Endofunction[com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceSchemaLinkedServiceArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceSchemaLinkedServiceArgs.builder
      builder.schemaLinkedService(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedCustomServiceState.Builder)
    /**
     * @param integrationRuntime An `integrationRuntime` block as defined below.
     * @return builder
     */
    def integrationRuntime(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedCustomServiceIntegrationRuntimeArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedCustomServiceState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedCustomServiceIntegrationRuntimeArgs.builder
      builder.integrationRuntime(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFileStorageState.Builder)
    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store Azure File Storage password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFileStorageKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFileStorageState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureFileStorageKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetSnowflakeState.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetSnowflakeSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetSnowflakeState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetSnowflakeSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseState.Builder)
    /**
     * @param keyVaultConnectionString A `keyVaultConnectionString` block as defined below. Use this argument to store Azure SQL Database connection string in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. Exactly one of either `connectionString` or `keyVaultConnectionString` is required.
     * @return builder
     */
    def keyVaultConnectionString(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseKeyVaultConnectionStringArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseKeyVaultConnectionStringArgs.builder
      builder.keyVaultConnectionString(args(argsBuilder).build)

    /**
     * @param keyVaultPassword A `keyVaultPassword` block as defined below. Use this argument to store SQL Server password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * @return builder
     */
    def keyVaultPassword(args: Endofunction[com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseKeyVaultPasswordArgs.Builder]):
        com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseKeyVaultPasswordArgs.builder
      builder.keyVaultPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datafactory.inputs.DatasetMysqlState.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetMysqlSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.inputs.DatasetMysqlState.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetMysqlSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datafactory.DatasetMysqlArgs.Builder)
    /**
     * @param schemaColumns A `schemaColumn` block as defined below.
     * @return builder
     */
    def schemaColumns(args: Endofunction[com.pulumi.azure.datafactory.inputs.DatasetMysqlSchemaColumnArgs.Builder]*):
        com.pulumi.azure.datafactory.DatasetMysqlArgs.Builder =
      def argsBuilder = com.pulumi.azure.datafactory.inputs.DatasetMysqlSchemaColumnArgs.builder
      builder.schemaColumns(args.map(_(argsBuilder).build)*)
