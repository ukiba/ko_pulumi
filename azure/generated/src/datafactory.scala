package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object datafactory:
  /** Manage a Data Factory Service Principal credential resource. These resources are used by Data Factory to access data sources. */
  def CredentialServicePrincipal(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.CredentialServicePrincipalArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.CredentialServicePrincipalArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.CredentialServicePrincipal(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manage a Data Factory User Assigned Managed Identity credential resource. These resources are used by Data Factory to access data sources. */
  def CredentialUserManagedIdentity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.CredentialUserManagedIdentityArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.CredentialUserManagedIdentityArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.CredentialUserManagedIdentity(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Dataset inside an Azure Data Factory. This is a generic resource that supports all different Dataset Types. */
  def CustomDataset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.CustomDatasetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.CustomDatasetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.CustomDataset(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a Customer Managed Key for a Data Factory.
   * 
   * &gt; **Note:** The Customer Managed Key cannot be removed from the Data Factory once added. To remove the Customer Managed Key delete and recreate the parent Data Factory.
   */
  def CustomerManagedKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.CustomerManagedKeyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.datafactory.CustomerManagedKeyArgs.builder
    com.pulumi.azure.datafactory.CustomerManagedKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Data Flow inside an Azure Data Factory. */
  def DataFlow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DataFlowArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DataFlowArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DataFlow(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object DatafactoryFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Azure Data Factory (Version 2). */
    inline def getFactory(args: Endofunction[com.pulumi.azure.datafactory.inputs.GetFactoryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.datafactory.outputs.GetFactoryResult] =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.GetFactoryArgs.builder
      com.pulumi.azure.datafactory.DatafactoryFunctions.getFactory(args(argsBuilder).build)

    /** Use this data source to access information about an existing Azure Data Factory (Version 2). */
    inline def getFactoryPlain(args: Endofunction[com.pulumi.azure.datafactory.inputs.GetFactoryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.datafactory.outputs.GetFactoryResult] =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.GetFactoryPlainArgs.builder
      com.pulumi.azure.datafactory.DatafactoryFunctions.getFactoryPlain(args(argsBuilder).build)

    /** Use this data source to access information about a trigger schedule in Azure Data Factory. */
    inline def getTriggerSchedule(args: Endofunction[com.pulumi.azure.datafactory.inputs.GetTriggerScheduleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.datafactory.outputs.GetTriggerScheduleResult] =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.GetTriggerScheduleArgs.builder
      com.pulumi.azure.datafactory.DatafactoryFunctions.getTriggerSchedule(args(argsBuilder).build)

    /** Use this data source to access information about a trigger schedule in Azure Data Factory. */
    inline def getTriggerSchedulePlain(args: Endofunction[com.pulumi.azure.datafactory.inputs.GetTriggerSchedulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.datafactory.outputs.GetTriggerScheduleResult] =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.GetTriggerSchedulePlainArgs.builder
      com.pulumi.azure.datafactory.DatafactoryFunctions.getTriggerSchedulePlain(args(argsBuilder).build)

    /** Use this data source to access information about all existing trigger schedules in Azure Data Factory. */
    inline def getTriggerSchedules(args: Endofunction[com.pulumi.azure.datafactory.inputs.GetTriggerSchedulesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.datafactory.outputs.GetTriggerSchedulesResult] =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.GetTriggerSchedulesArgs.builder
      com.pulumi.azure.datafactory.DatafactoryFunctions.getTriggerSchedules(args(argsBuilder).build)

    /** Use this data source to access information about all existing trigger schedules in Azure Data Factory. */
    inline def getTriggerSchedulesPlain(args: Endofunction[com.pulumi.azure.datafactory.inputs.GetTriggerSchedulesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.datafactory.outputs.GetTriggerSchedulesResult] =
      val argsBuilder = com.pulumi.azure.datafactory.inputs.GetTriggerSchedulesPlainArgs.builder
      com.pulumi.azure.datafactory.DatafactoryFunctions.getTriggerSchedulesPlain(args(argsBuilder).build)

  /** Manages an Azure Blob Dataset inside an Azure Data Factory. */
  def DatasetAzureBlob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetAzureBlobArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetAzureBlobArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetAzureBlob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Azure SQL Table Dataset inside an Azure Data Factory. */
  def DatasetAzureSqlTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetAzureSqlTableArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetAzureSqlTableArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetAzureSqlTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Data Factory Binary Dataset inside an Azure Data Factory. */
  def DatasetBinary(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetBinaryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetBinaryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetBinary(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Azure Cosmos DB SQL API Dataset inside an Azure Data Factory. */
  def DatasetCosmosDBApi(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetCosmosDBApiArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetCosmosDBApiArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetCosmosDBApi(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Azure Delimited Text Dataset inside an Azure Data Factory. */
  def DatasetDelimitedText(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetDelimitedTextArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetDelimitedTextArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetDelimitedText(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Azure HTTP Dataset inside an Azure Data Factory. */
  def DatasetHttp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetHttpArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetHttpArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetHttp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Azure JSON Dataset inside an Azure Data Factory. */
  def DatasetJson(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetJsonArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetJsonArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetJson(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a MySQL Dataset inside a Azure Data Factory. */
  def DatasetMysql(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetMysqlArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetMysqlArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetMysql(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Azure Parquet Dataset inside an Azure Data Factory. */
  def DatasetParquet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetParquetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetParquetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetParquet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a PostgreSQL Dataset inside a Azure Data Factory. */
  def DatasetPostgresql(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetPostgresqlArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetPostgresqlArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetPostgresql(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Snowflake Dataset inside an Azure Data Factory. */
  def DatasetSnowflake(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetSnowflakeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetSnowflakeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetSnowflake(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a SQL Server Table Dataset inside a Azure Data Factory. */
  def DatasetSqlServerTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.DatasetSqlServerTableArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.DatasetSqlServerTableArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.DatasetSqlServerTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Azure Data Factory (Version 2). */
  def Factory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.FactoryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.FactoryArgs.builder
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
    com.pulumi.azure.datafactory.Factory(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Flowlet Data Flow inside an Azure Data Factory. */
  def FlowletDataFlow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.FlowletDataFlowArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.FlowletDataFlowArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.FlowletDataFlow(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Data Factory Azure Integration Runtime. */
  def IntegrationRuntimeRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.IntegrationRuntimeRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.IntegrationRuntimeRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.IntegrationRuntimeRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Data Factory Self-hosted Integration Runtime. */
  def IntegrationRuntimeSelfHosted(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.IntegrationRuntimeSelfHostedArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.IntegrationRuntimeSelfHostedArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.IntegrationRuntimeSelfHosted(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Data Factory Azure-SSIS Integration Runtime. */
  def IntegrationRuntimeSsis(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.IntegrationRuntimeSsisArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.IntegrationRuntimeSsis(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linked Service (connection) between a resource and Azure Data Factory. This is a generic resource that supports all different Linked Service Types. */
  def LinkedCustomService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedCustomServiceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedCustomServiceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedCustomService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linked Service (connection) between an Azure Blob Storage Account and Azure Data Factory. */
  def LinkedServiceAzureBlobStorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceAzureBlobStorageArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceAzureBlobStorageArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceAzureBlobStorage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linked Service (connection) between Azure Databricks and Azure Data Factory. */
  def LinkedServiceAzureDatabricks(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceAzureDatabricksArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceAzureDatabricksArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceAzureDatabricks(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linked Service (connection) between a SFTP Server and Azure Data Factory. */
  def LinkedServiceAzureFileStorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceAzureFileStorageArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceAzureFileStorageArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceAzureFileStorage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linked Service (connection) between an Azure Function and Azure Data Factory. */
  def LinkedServiceAzureFunction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceAzureFunctionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceAzureFunctionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceAzureFunction(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linked Service (connection) between Azure Search Service and Azure Data Factory. */
  def LinkedServiceAzureSearch(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceAzureSearchArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceAzureSearchArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceAzureSearch(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linked Service (connection) between Azure SQL Database and Azure Data Factory. */
  def LinkedServiceAzureSqlDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceAzureSqlDatabaseArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceAzureSqlDatabaseArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceAzureSqlDatabase(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linked Service (connection) between an Azure Table Storage and Azure Data Factory. */
  def LinkedServiceAzureTableStorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceAzureTableStorageArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceAzureTableStorageArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceAzureTableStorage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linked Service (connection) between a CosmosDB and Azure Data Factory using SQL API. */
  def LinkedServiceCosmosDb(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceCosmosDbArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceCosmosDbArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceCosmosDb(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a Linked Service (connection) between a CosmosDB and Azure Data Factory using Mongo API.
   * 
   * &gt; **Note:** All arguments including the client secret will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
   */
  def LinkedServiceCosmosDbMongoApi(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceCosmosDbMongoApiArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceCosmosDbMongoApiArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceCosmosDbMongoApi(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linked Service (connection) between Data Lake Storage Gen2 and Azure Data Factory. */
  def LinkedServiceDataLakeStorageGen2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceDataLakeStorageGen2Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceDataLakeStorageGen2Args.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceDataLakeStorageGen2(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linked Service (connection) between Key Vault and Azure Data Factory. */
  def LinkedServiceKeyVault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceKeyVaultArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceKeyVaultArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceKeyVault(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linked Service (connection) between a Kusto Cluster and Azure Data Factory. */
  def LinkedServiceKusto(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceKustoArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceKustoArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceKusto(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linked Service (connection) between MySQL and Azure Data Factory. */
  def LinkedServiceMysql(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceMysqlArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceMysqlArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceMysql(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a Linked Service (connection) between a Database and Azure Data Factory through OData protocol.
   * 
   * &gt; **Note:** All arguments including the connectionString will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
   */
  def LinkedServiceOdata(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceOdataArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceOdataArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceOdata(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a Linked Service (connection) between a Database and Azure Data Factory through ODBC protocol.
   * 
   * &gt; **Note:** All arguments including the connectionString will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
   */
  def LinkedServiceOdbc(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceOdbcArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceOdbcArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceOdbc(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linked Service (connection) between PostgreSQL and Azure Data Factory. */
  def LinkedServicePostgresql(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServicePostgresqlArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServicePostgresqlArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServicePostgresql(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linked Service (connection) between a SFTP Server and Azure Data Factory. */
  def LinkedServiceSftp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceSftpArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceSftpArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceSftp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linked Service (connection) between Snowflake and Azure Data Factory. */
  def LinkedServiceSnowflake(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceSnowflakeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceSnowflakeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceSnowflake(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a Linked Service (connection) between Azure SQL Managed Instance and Azure Data Factory.
   * 
   * &gt; **Note:** All arguments including the connectionString will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
   */
  def LinkedServiceSqlManagedInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceSqlManagedInstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceSqlManagedInstanceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceSqlManagedInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linked Service (connection) between a SQL Server and Azure Data Factory. */
  def LinkedServiceSqlServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceSqlServerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceSqlServerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceSqlServer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linked Service (connection) between Synapse and Azure Data Factory. */
  def LinkedServiceSynapse(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceSynapseArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceSynapseArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceSynapse(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linked Service (connection) between a Web Server and Azure Data Factory. */
  def LinkedServiceWeb(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.LinkedServiceWebArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.LinkedServiceWebArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.LinkedServiceWeb(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Data Factory Managed Private Endpoint. */
  def ManagedPrivateEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.ManagedPrivateEndpointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.ManagedPrivateEndpointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.ManagedPrivateEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Pipeline inside a Azure Data Factory. */
  def Pipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.PipelineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.PipelineArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.Pipeline(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Blob Event Trigger inside an Azure Data Factory. */
  def TriggerBlobEvent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.TriggerBlobEventArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.TriggerBlobEventArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.TriggerBlobEvent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Custom Event Trigger inside an Azure Data Factory. */
  def TriggerCustomEvent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.TriggerCustomEventArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.TriggerCustomEventArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.TriggerCustomEvent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Trigger Schedule inside a Azure Data Factory. */
  def TriggerSchedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.TriggerScheduleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.TriggerScheduleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.TriggerSchedule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Tumbling Window Trigger inside an Azure Data Factory. */
  def TriggerTumblingWindow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datafactory.TriggerTumblingWindowArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datafactory.TriggerTumblingWindowArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datafactory.TriggerTumblingWindow(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
