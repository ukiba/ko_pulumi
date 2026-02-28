package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object glue:
  type GlueFunctions = com.pulumi.aws.glue.GlueFunctions
  object GlueFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.glue.GlueFunctions.*
  extension (self: GlueFunctions.type)
    /** This data source can be used to fetch information about an AWS Glue Data Catalog Table. */
    def getCatalogTable(args: Endofunction[com.pulumi.aws.glue.inputs.GetCatalogTableArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.glue.outputs.GetCatalogTableResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetCatalogTableArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getCatalogTable(args(argsBuilder).build)

    /** This data source can be used to fetch information about an AWS Glue Data Catalog Table. */
    def getCatalogTablePlain(args: Endofunction[com.pulumi.aws.glue.inputs.GetCatalogTablePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.glue.outputs.GetCatalogTableResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetCatalogTablePlainArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getCatalogTablePlain(args(argsBuilder).build)

    /** This data source can be used to fetch information about a specific Glue Connection. */
    def getConnection(args: Endofunction[com.pulumi.aws.glue.inputs.GetConnectionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.glue.outputs.GetConnectionResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetConnectionArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getConnection(args(argsBuilder).build)

    /** This data source can be used to fetch information about a specific Glue Connection. */
    def getConnectionPlain(args: Endofunction[com.pulumi.aws.glue.inputs.GetConnectionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.glue.outputs.GetConnectionResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetConnectionPlainArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getConnectionPlain(args(argsBuilder).build)

    /** This data source can be used to fetch information about AWS Glue Data Catalog Encryption Settings. */
    def getDataCatalogEncryptionSettings(args: Endofunction[com.pulumi.aws.glue.inputs.GetDataCatalogEncryptionSettingsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.glue.outputs.GetDataCatalogEncryptionSettingsResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetDataCatalogEncryptionSettingsArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getDataCatalogEncryptionSettings(args(argsBuilder).build)

    /** This data source can be used to fetch information about AWS Glue Data Catalog Encryption Settings. */
    def getDataCatalogEncryptionSettingsPlain(args: Endofunction[com.pulumi.aws.glue.inputs.GetDataCatalogEncryptionSettingsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.glue.outputs.GetDataCatalogEncryptionSettingsResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetDataCatalogEncryptionSettingsPlainArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getDataCatalogEncryptionSettingsPlain(args(argsBuilder).build)

    /** Data source for managing an AWS Glue Registry. */
    def getRegistry(args: Endofunction[com.pulumi.aws.glue.inputs.GetRegistryArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.glue.outputs.GetRegistryResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetRegistryArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getRegistry(args(argsBuilder).build)

    /** Data source for managing an AWS Glue Registry. */
    def getRegistryPlain(args: Endofunction[com.pulumi.aws.glue.inputs.GetRegistryPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.glue.outputs.GetRegistryResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetRegistryPlainArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getRegistryPlain(args(argsBuilder).build)

    /** Use this data source to generate a Glue script from a Directed Acyclic Graph (DAG). */
    def getScript(args: Endofunction[com.pulumi.aws.glue.inputs.GetScriptArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.glue.outputs.GetScriptResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetScriptArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getScript(args(argsBuilder).build)

    /** Use this data source to generate a Glue script from a Directed Acyclic Graph (DAG). */
    def getScriptPlain(args: Endofunction[com.pulumi.aws.glue.inputs.GetScriptPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.glue.outputs.GetScriptResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetScriptPlainArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getScriptPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.CrawlerArgs.Builder)
    /**
     * @param catalogTargets List of nested AWS Glue Data Catalog target arguments. See Catalog Target below.
     * @return builder
     */
    def catalogTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerCatalogTargetArgs.Builder]*):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerCatalogTargetArgs.builder
      builder.catalogTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param deltaTargets List of nested Delta Lake target arguments. See Delta Target below.
     * @return builder
     */
    def deltaTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerDeltaTargetArgs.Builder]*):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerDeltaTargetArgs.builder
      builder.deltaTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param dynamodbTargets List of nested DynamoDB target arguments. See Dynamodb Target below.
     * @return builder
     */
    def dynamodbTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerDynamodbTargetArgs.Builder]*):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerDynamodbTargetArgs.builder
      builder.dynamodbTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param hudiTargets List of nested Hudi target arguments. See Iceberg Target below.
     * @return builder
     */
    def hudiTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerHudiTargetArgs.Builder]*):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerHudiTargetArgs.builder
      builder.hudiTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param icebergTargets List of nested Iceberg target arguments. See Iceberg Target below.
     * @return builder
     */
    def icebergTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerIcebergTargetArgs.Builder]*):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerIcebergTargetArgs.builder
      builder.icebergTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param jdbcTargets List of nested JDBC target arguments. See JDBC Target below.
     * @return builder
     */
    def jdbcTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerJdbcTargetArgs.Builder]*):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerJdbcTargetArgs.builder
      builder.jdbcTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param lakeFormationConfiguration Specifies Lake Formation configuration settings for the crawler. See Lake Formation Configuration below.
     * @return builder
     */
    def lakeFormationConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerLakeFormationConfigurationArgs.Builder]):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CrawlerLakeFormationConfigurationArgs.builder
      builder.lakeFormationConfiguration(args(argsBuilder).build)

    /**
     * @param lineageConfiguration Specifies data lineage configuration settings for the crawler. See Lineage Configuration below.
     * @return builder
     */
    def lineageConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerLineageConfigurationArgs.Builder]):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CrawlerLineageConfigurationArgs.builder
      builder.lineageConfiguration(args(argsBuilder).build)

    /**
     * @param mongodbTargets List of nested MongoDB target arguments. See MongoDB Target below.
     * @return builder
     */
    def mongodbTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerMongodbTargetArgs.Builder]*):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerMongodbTargetArgs.builder
      builder.mongodbTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param recrawlPolicy A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.. See Recrawl Policy below.
     * @return builder
     */
    def recrawlPolicy(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerRecrawlPolicyArgs.Builder]):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CrawlerRecrawlPolicyArgs.builder
      builder.recrawlPolicy(args(argsBuilder).build)

    /**
     * @param s3Targets List of nested Amazon S3 target arguments. See S3 Target below.
     * @return builder
     */
    def s3Targets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerS3TargetArgs.Builder]*):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerS3TargetArgs.builder
      builder.s3Targets(args.map(_(argsBuilder).build)*)

    /**
     * @param schemaChangePolicy Policy for the crawler&#39;s update and deletion behavior. See Schema Change Policy below.
     * @return builder
     */
    def schemaChangePolicy(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerSchemaChangePolicyArgs.Builder]):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CrawlerSchemaChangePolicyArgs.builder
      builder.schemaChangePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.DataQualityRulesetArgs.Builder)
    /**
     * @param targetTable A Configuration block specifying a target table associated with the data quality ruleset. See `targetTable` below.
     * @return builder
     */
    def targetTable(args: Endofunction[com.pulumi.aws.glue.inputs.DataQualityRulesetTargetTableArgs.Builder]):
        com.pulumi.aws.glue.DataQualityRulesetArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.DataQualityRulesetTargetTableArgs.builder
      builder.targetTable(args(argsBuilder).build)

  /** Provides a Glue Catalog Database Resource. You can refer to the [Glue Developer Guide](http://docs.aws.amazon.com/glue/latest/dg/populate-data-catalog.html) for a full explanation of the Glue Data Catalog functionality */
  def CatalogDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glue.CatalogDatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.CatalogDatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.glue.CatalogDatabase(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Glue ML Transform resource. */
  def MLTransform(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glue.MLTransformArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.MLTransformArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.glue.MLTransform(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Glue Schema resource. */
  def Schema(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glue.SchemaArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.SchemaArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.glue.Schema(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.glue.DataCatalogEncryptionSettingsArgs.Builder)
    /**
     * @param dataCatalogEncryptionSettings The security configuration to set. see Data Catalog Encryption Settings.
     * @return builder
     */
    def dataCatalogEncryptionSettings(args: Endofunction[com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs.Builder]):
        com.pulumi.aws.glue.DataCatalogEncryptionSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs.builder
      builder.dataCatalogEncryptionSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.CatalogTableArgs.Builder)
    /**
     * @param openTableFormatInput Configuration block for open table formats. See `openTableFormatInput` below.
     * @return builder
     */
    def openTableFormatInput(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputArgs.Builder]):
        com.pulumi.aws.glue.CatalogTableArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputArgs.builder
      builder.openTableFormatInput(args(argsBuilder).build)

    /**
     * @param partitionIndices Configuration block for a maximum of 3 partition indexes. See `partitionIndex` below.
     * @return builder
     */
    def partitionIndices(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTablePartitionIndexArgs.Builder]*):
        com.pulumi.aws.glue.CatalogTableArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogTablePartitionIndexArgs.builder
      builder.partitionIndices(args.map(_(argsBuilder).build)*)

    /**
     * @param partitionKeys Configuration block of columns by which the table is partitioned. Only primitive types are supported as partition keys. See `partitionKeys` below.
     * @return builder
     */
    def partitionKeys(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTablePartitionKeyArgs.Builder]*):
        com.pulumi.aws.glue.CatalogTableArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogTablePartitionKeyArgs.builder
      builder.partitionKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param storageDescriptor Configuration block for information about the physical storage of this table. For more information, refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor). See `storageDescriptor` below.
     * @return builder
     */
    def storageDescriptor(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorArgs.Builder]):
        com.pulumi.aws.glue.CatalogTableArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorArgs.builder
      builder.storageDescriptor(args(argsBuilder).build)

    /**
     * @param targetTable Configuration block of a target table for resource linking. See `targetTable` below.
     * @return builder
     */
    def targetTable(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableTargetTableArgs.Builder]):
        com.pulumi.aws.glue.CatalogTableArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableTargetTableArgs.builder
      builder.targetTable(args(argsBuilder).build)

  /**
   * Provides a Glue Job resource.
   *  
   *  &gt; Glue functionality, such as monitoring and logging of jobs, is typically managed with the `defaultArguments` argument. See the [Special Parameters Used by AWS Glue](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html) topic in the Glue developer guide for additional information.
   */
  def Job(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glue.JobArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.JobArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.glue.Job(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.glue.JobArgs.Builder)
    /**
     * @param command The command of the job. Defined below.
     * @return builder
     */
    def command(args: Endofunction[com.pulumi.aws.glue.inputs.JobCommandArgs.Builder]):
        com.pulumi.aws.glue.JobArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.JobCommandArgs.builder
      builder.command(args(argsBuilder).build)

    /**
     * @param executionProperty Execution property of the job. Defined below.
     * @return builder
     */
    def executionProperty(args: Endofunction[com.pulumi.aws.glue.inputs.JobExecutionPropertyArgs.Builder]):
        com.pulumi.aws.glue.JobArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.JobExecutionPropertyArgs.builder
      builder.executionProperty(args(argsBuilder).build)

    /**
     * @param notificationProperty Notification property of the job. Defined below.
     * @return builder
     */
    def notificationProperty(args: Endofunction[com.pulumi.aws.glue.inputs.JobNotificationPropertyArgs.Builder]):
        com.pulumi.aws.glue.JobArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.JobNotificationPropertyArgs.builder
      builder.notificationProperty(args(argsBuilder).build)

    /**
     * @param sourceControlDetails The details for a source control configuration for a job, allowing synchronization of job artifacts to or from a remote repository. Defined below.
     * @return builder
     */
    def sourceControlDetails(args: Endofunction[com.pulumi.aws.glue.inputs.JobSourceControlDetailsArgs.Builder]):
        com.pulumi.aws.glue.JobArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.JobSourceControlDetailsArgs.builder
      builder.sourceControlDetails(args(argsBuilder).build)

  /**
   * 
   */
  def PartitionIndex(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glue.PartitionIndexArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.glue.PartitionIndexArgs.builder
    
    com.pulumi.aws.glue.PartitionIndex(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Glue Data Catalog Encryption Settings resource. */
  def DataCatalogEncryptionSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glue.DataCatalogEncryptionSettingsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.glue.DataCatalogEncryptionSettingsArgs.builder
    
    com.pulumi.aws.glue.DataCatalogEncryptionSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Glue resource policy. Only one can exist per region. */
  def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glue.ResourcePolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.glue.ResourcePolicyArgs.builder
    
    com.pulumi.aws.glue.ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.glue.CatalogTableOptimizerArgs.Builder)
    /**
     * @param configuration A configuration block that defines the table optimizer settings. See Configuration for additional details.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationArgs.Builder]):
        com.pulumi.aws.glue.CatalogTableOptimizerArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  /** Provides a Glue Data Quality Ruleset Resource. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/glue-data-quality.html) for a full explanation of the Glue Data Quality Ruleset functionality */
  def DataQualityRuleset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glue.DataQualityRulesetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.DataQualityRulesetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.glue.DataQualityRuleset(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.glue.SecurityConfigurationArgs.Builder)
    /**
     * @param encryptionConfiguration Configuration block containing encryption configuration. Detailed below.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.glue.SecurityConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.CatalogDatabaseArgs.Builder)
    /**
     * @param createTableDefaultPermissions Creates a set of default permissions on the table for principals. See `createTableDefaultPermission` below.
     * @return builder
     */
    def createTableDefaultPermissions(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogDatabaseCreateTableDefaultPermissionArgs.Builder]*):
        com.pulumi.aws.glue.CatalogDatabaseArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogDatabaseCreateTableDefaultPermissionArgs.builder
      builder.createTableDefaultPermissions(args.map(_(argsBuilder).build)*)

    /**
     * @param federatedDatabase Configuration block that references an entity outside the AWS Glue Data Catalog. See `federatedDatabase` below.
     * @return builder
     */
    def federatedDatabase(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogDatabaseFederatedDatabaseArgs.Builder]):
        com.pulumi.aws.glue.CatalogDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogDatabaseFederatedDatabaseArgs.builder
      builder.federatedDatabase(args(argsBuilder).build)

    /**
     * @param targetDatabase Configuration block for a target database for resource linking. See `targetDatabase` below.
     * @return builder
     */
    def targetDatabase(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogDatabaseTargetDatabaseArgs.Builder]):
        com.pulumi.aws.glue.CatalogDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogDatabaseTargetDatabaseArgs.builder
      builder.targetDatabase(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.ConnectionArgs.Builder)
    /**
     * @param physicalConnectionRequirements Map of physical connection requirements, such as VPC and SecurityGroup. See `physicalConnectionRequirements` Block for details.
     * @return builder
     */
    def physicalConnectionRequirements(args: Endofunction[com.pulumi.aws.glue.inputs.ConnectionPhysicalConnectionRequirementsArgs.Builder]):
        com.pulumi.aws.glue.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ConnectionPhysicalConnectionRequirementsArgs.builder
      builder.physicalConnectionRequirements(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.PartitionArgs.Builder)
    /**
     * @param storageDescriptor A storage descriptor object containing information about the physical storage of this table. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor) for a full explanation of this object.
     * @return builder
     */
    def storageDescriptor(args: Endofunction[com.pulumi.aws.glue.inputs.PartitionStorageDescriptorArgs.Builder]):
        com.pulumi.aws.glue.PartitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.PartitionStorageDescriptorArgs.builder
      builder.storageDescriptor(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.ClassifierArgs.Builder)
    /**
     * @param csvClassifier A classifier for CSV content. Defined below.
     * @return builder
     */
    def csvClassifier(args: Endofunction[com.pulumi.aws.glue.inputs.ClassifierCsvClassifierArgs.Builder]):
        com.pulumi.aws.glue.ClassifierArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ClassifierCsvClassifierArgs.builder
      builder.csvClassifier(args(argsBuilder).build)

    /**
     * @param grokClassifier A classifier that uses grok patterns. Defined below.
     * @return builder
     */
    def grokClassifier(args: Endofunction[com.pulumi.aws.glue.inputs.ClassifierGrokClassifierArgs.Builder]):
        com.pulumi.aws.glue.ClassifierArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ClassifierGrokClassifierArgs.builder
      builder.grokClassifier(args(argsBuilder).build)

    /**
     * @param jsonClassifier A classifier for JSON content. Defined below.
     * @return builder
     */
    def jsonClassifier(args: Endofunction[com.pulumi.aws.glue.inputs.ClassifierJsonClassifierArgs.Builder]):
        com.pulumi.aws.glue.ClassifierArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ClassifierJsonClassifierArgs.builder
      builder.jsonClassifier(args(argsBuilder).build)

    /**
     * @param xmlClassifier A classifier for XML content. Defined below.
     * @return builder
     */
    def xmlClassifier(args: Endofunction[com.pulumi.aws.glue.inputs.ClassifierXmlClassifierArgs.Builder]):
        com.pulumi.aws.glue.ClassifierArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ClassifierXmlClassifierArgs.builder
      builder.xmlClassifier(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.TriggerArgs.Builder)
    /**
     * @param actions List of actions initiated by this trigger when it fires. See Actions Below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.aws.glue.inputs.TriggerActionArgs.Builder]*):
        com.pulumi.aws.glue.TriggerArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.TriggerActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param eventBatchingConditions Batch condition that must be met (specified number of events received or batch time window expired) before EventBridge event trigger fires. See Event Batching Condition.
     * @return builder
     */
    def eventBatchingConditions(args: Endofunction[com.pulumi.aws.glue.inputs.TriggerEventBatchingConditionArgs.Builder]*):
        com.pulumi.aws.glue.TriggerArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.TriggerEventBatchingConditionArgs.builder
      builder.eventBatchingConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param predicate A predicate to specify when the new trigger should fire. Required when trigger type is `CONDITIONAL`. See Predicate Below.
     * @return builder
     */
    def predicate(args: Endofunction[com.pulumi.aws.glue.inputs.TriggerPredicateArgs.Builder]):
        com.pulumi.aws.glue.TriggerArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.TriggerPredicateArgs.builder
      builder.predicate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.PartitionIndexArgs.Builder)
    /**
     * @param partitionIndex Configuration block for a partition index. See `partitionIndex` below.
     * @return builder
     */
    def partitionIndex(args: Endofunction[com.pulumi.aws.glue.inputs.PartitionIndexPartitionIndexArgs.Builder]):
        com.pulumi.aws.glue.PartitionIndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.PartitionIndexPartitionIndexArgs.builder
      builder.partitionIndex(args(argsBuilder).build)

  /** Manages a Glue Trigger resource. */
  def Trigger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glue.TriggerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.TriggerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.glue.Trigger(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Glue Connection resource. */
  def Connection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glue.ConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.ConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.glue.Connection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Glue Development Endpoint resource. */
  def DevEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glue.DevEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.DevEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.glue.DevEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Glue Crawler. More information can be found in the [AWS Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html) */
  def Crawler(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glue.CrawlerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.CrawlerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.glue.Crawler(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Glue Partition Resource. */
  def Partition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glue.PartitionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.glue.PartitionArgs.builder
    
    com.pulumi.aws.glue.Partition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Glue Catalog Table Optimizer. */
  def CatalogTableOptimizer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glue.CatalogTableOptimizerArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.glue.CatalogTableOptimizerArgs.builder
    
    com.pulumi.aws.glue.CatalogTableOptimizer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Glue User Defined Function Resource. */
  def UserDefinedFunction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glue.UserDefinedFunctionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.UserDefinedFunctionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.glue.UserDefinedFunction(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.glue.UserDefinedFunctionArgs.Builder)
    /**
     * @param resourceUris The configuration block for Resource URIs. See resource uris below for more details.
     * @return builder
     */
    def resourceUris(args: Endofunction[com.pulumi.aws.glue.inputs.UserDefinedFunctionResourceUriArgs.Builder]*):
        com.pulumi.aws.glue.UserDefinedFunctionArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.UserDefinedFunctionResourceUriArgs.builder
      builder.resourceUris(args.map(_(argsBuilder).build)*)

  /** Manages a Glue Security Configuration. */
  def SecurityConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glue.SecurityConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.SecurityConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.glue.SecurityConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Glue Registry resource. */
  def Registry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glue.RegistryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.RegistryArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.glue.Registry(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Glue Catalog Table Resource. You can refer to the [Glue Developer Guide](http://docs.aws.amazon.com/glue/latest/dg/populate-data-catalog.html) for a full explanation of the Glue Data Catalog functionality. */
  def CatalogTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glue.CatalogTableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.CatalogTableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.glue.CatalogTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Glue Classifier resource.
   *  
   *  &gt; **NOTE:** It is only valid to create one type of classifier (CSV, grok, JSON, or XML). Changing classifier types will recreate the classifier.
   */
  def Classifier(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glue.ClassifierArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.ClassifierArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.glue.Classifier(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Glue Workflow resource.
   *  The workflow graph (DAG) can be build using the `aws.glue.Trigger` resource.
   *  See the example below for creating a graph with four nodes (two triggers and two jobs).
   */
  def Workflow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.glue.WorkflowArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.WorkflowArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.glue.Workflow(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.glue.MLTransformArgs.Builder)
    /**
     * @param inputRecordTables A list of AWS Glue table definitions used by the transform. see Input Record Tables.
     * @return builder
     */
    def inputRecordTables(args: Endofunction[com.pulumi.aws.glue.inputs.MLTransformInputRecordTableArgs.Builder]*):
        com.pulumi.aws.glue.MLTransformArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.MLTransformInputRecordTableArgs.builder
      builder.inputRecordTables(args.map(_(argsBuilder).build)*)

    /**
     * @param parameters The algorithmic parameters that are specific to the transform type used. Conditionally dependent on the transform type. see Parameters.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.glue.inputs.MLTransformParametersArgs.Builder]):
        com.pulumi.aws.glue.MLTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.MLTransformParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.MLTransformParametersArgs.Builder)
    /**
     * @param findMatchesParameters The parameters for the find matches algorithm. see Find Matches Parameters.
     * @return builder
     */
    def findMatchesParameters(args: Endofunction[com.pulumi.aws.glue.inputs.MLTransformParametersFindMatchesParametersArgs.Builder]):
        com.pulumi.aws.glue.inputs.MLTransformParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.MLTransformParametersFindMatchesParametersArgs.builder
      builder.findMatchesParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogDatabaseCreateTableDefaultPermissionArgs.Builder)
    /**
     * @param principal The principal who is granted permissions.. See `principal` below.
     * @return builder
     */
    def principal(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogDatabaseCreateTableDefaultPermissionPrincipalArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogDatabaseCreateTableDefaultPermissionArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogDatabaseCreateTableDefaultPermissionPrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationArgs.Builder)
    def cloudwatchEncryption(args: Endofunction[com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionArgs.Builder]):
        com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionArgs.builder
      builder.cloudwatchEncryption(args(argsBuilder).build)

    def jobBookmarksEncryption(args: Endofunction[com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionArgs.Builder]):
        com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionArgs.builder
      builder.jobBookmarksEncryption(args(argsBuilder).build)

    /**
     * @param s3Encryption A ` s3Encryption  ` block as described below, which contains encryption configuration for S3 data.
     * @return builder
     */
    def s3Encryption(args: Endofunction[com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationS3EncryptionArgs.Builder]):
        com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationS3EncryptionArgs.builder
      builder.s3Encryption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.UserDefinedFunctionState.Builder)
    /**
     * @param resourceUris The configuration block for Resource URIs. See resource uris below for more details.
     * @return builder
     */
    def resourceUris(args: Endofunction[com.pulumi.aws.glue.inputs.UserDefinedFunctionResourceUriArgs.Builder]*):
        com.pulumi.aws.glue.inputs.UserDefinedFunctionState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.UserDefinedFunctionResourceUriArgs.builder
      builder.resourceUris(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSchemaReferenceArgs.Builder)
    /**
     * @param schemaId Configuration block that contains schema identity fields. Either this or the `schemaVersionId` has to be provided. See `schemaId` below.
     * @return builder
     */
    def schemaId(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSchemaReferenceSchemaIdArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSchemaReferenceArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSchemaReferenceSchemaIdArgs.builder
      builder.schemaId(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CrawlerState.Builder)
    /**
     * @param catalogTargets List of nested AWS Glue Data Catalog target arguments. See Catalog Target below.
     * @return builder
     */
    def catalogTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerCatalogTargetArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerCatalogTargetArgs.builder
      builder.catalogTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param deltaTargets List of nested Delta Lake target arguments. See Delta Target below.
     * @return builder
     */
    def deltaTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerDeltaTargetArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerDeltaTargetArgs.builder
      builder.deltaTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param dynamodbTargets List of nested DynamoDB target arguments. See Dynamodb Target below.
     * @return builder
     */
    def dynamodbTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerDynamodbTargetArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerDynamodbTargetArgs.builder
      builder.dynamodbTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param hudiTargets List of nested Hudi target arguments. See Iceberg Target below.
     * @return builder
     */
    def hudiTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerHudiTargetArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerHudiTargetArgs.builder
      builder.hudiTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param icebergTargets List of nested Iceberg target arguments. See Iceberg Target below.
     * @return builder
     */
    def icebergTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerIcebergTargetArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerIcebergTargetArgs.builder
      builder.icebergTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param jdbcTargets List of nested JDBC target arguments. See JDBC Target below.
     * @return builder
     */
    def jdbcTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerJdbcTargetArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerJdbcTargetArgs.builder
      builder.jdbcTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param lakeFormationConfiguration Specifies Lake Formation configuration settings for the crawler. See Lake Formation Configuration below.
     * @return builder
     */
    def lakeFormationConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerLakeFormationConfigurationArgs.Builder]):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CrawlerLakeFormationConfigurationArgs.builder
      builder.lakeFormationConfiguration(args(argsBuilder).build)

    /**
     * @param lineageConfiguration Specifies data lineage configuration settings for the crawler. See Lineage Configuration below.
     * @return builder
     */
    def lineageConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerLineageConfigurationArgs.Builder]):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CrawlerLineageConfigurationArgs.builder
      builder.lineageConfiguration(args(argsBuilder).build)

    /**
     * @param mongodbTargets List of nested MongoDB target arguments. See MongoDB Target below.
     * @return builder
     */
    def mongodbTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerMongodbTargetArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerMongodbTargetArgs.builder
      builder.mongodbTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param recrawlPolicy A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.. See Recrawl Policy below.
     * @return builder
     */
    def recrawlPolicy(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerRecrawlPolicyArgs.Builder]):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CrawlerRecrawlPolicyArgs.builder
      builder.recrawlPolicy(args(argsBuilder).build)

    /**
     * @param s3Targets List of nested Amazon S3 target arguments. See S3 Target below.
     * @return builder
     */
    def s3Targets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerS3TargetArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerS3TargetArgs.builder
      builder.s3Targets(args.map(_(argsBuilder).build)*)

    /**
     * @param schemaChangePolicy Policy for the crawler&#39;s update and deletion behavior. See Schema Change Policy below.
     * @return builder
     */
    def schemaChangePolicy(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerSchemaChangePolicyArgs.Builder]):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CrawlerSchemaChangePolicyArgs.builder
      builder.schemaChangePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.SecurityConfigurationState.Builder)
    /**
     * @param encryptionConfiguration Configuration block containing encryption configuration. Detailed below.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.glue.inputs.SecurityConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.GetScriptArgs.Builder)
    /**
     * @param dagEdges List of the edges in the DAG. Defined below.
     * @return builder
     */
    def dagEdges(args: Endofunction[com.pulumi.aws.glue.inputs.GetScriptDagEdgeArgs.Builder]*):
        com.pulumi.aws.glue.inputs.GetScriptArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.GetScriptDagEdgeArgs.builder
      builder.dagEdges(args.map(_(argsBuilder).build)*)

    /**
     * @param dagNodes List of the nodes in the DAG. Defined below.
     * @return builder
     */
    def dagNodes(args: Endofunction[com.pulumi.aws.glue.inputs.GetScriptDagNodeArgs.Builder]*):
        com.pulumi.aws.glue.inputs.GetScriptArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.GetScriptDagNodeArgs.builder
      builder.dagNodes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableState.Builder)
    /**
     * @param openTableFormatInput Configuration block for open table formats. See `openTableFormatInput` below.
     * @return builder
     */
    def openTableFormatInput(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputArgs.builder
      builder.openTableFormatInput(args(argsBuilder).build)

    /**
     * @param partitionIndices Configuration block for a maximum of 3 partition indexes. See `partitionIndex` below.
     * @return builder
     */
    def partitionIndices(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTablePartitionIndexArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CatalogTableState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogTablePartitionIndexArgs.builder
      builder.partitionIndices(args.map(_(argsBuilder).build)*)

    /**
     * @param partitionKeys Configuration block of columns by which the table is partitioned. Only primitive types are supported as partition keys. See `partitionKeys` below.
     * @return builder
     */
    def partitionKeys(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTablePartitionKeyArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CatalogTableState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogTablePartitionKeyArgs.builder
      builder.partitionKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param storageDescriptor Configuration block for information about the physical storage of this table. For more information, refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor). See `storageDescriptor` below.
     * @return builder
     */
    def storageDescriptor(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorArgs.builder
      builder.storageDescriptor(args(argsBuilder).build)

    /**
     * @param targetTable Configuration block of a target table for resource linking. See `targetTable` below.
     * @return builder
     */
    def targetTable(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableTargetTableArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableTargetTableArgs.builder
      builder.targetTable(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationOrphanFileDeletionConfigurationArgs.Builder)
    /**
     * @param icebergConfiguration The configuration for an Iceberg orphan file deletion optimizer.
     * @return builder
     */
    def icebergConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationOrphanFileDeletionConfigurationIcebergConfigurationArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationOrphanFileDeletionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationOrphanFileDeletionConfigurationIcebergConfigurationArgs.builder
      builder.icebergConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.PartitionStorageDescriptorArgs.Builder)
    /**
     * @param columns A list of the Columns in the table.
     * @return builder
     */
    def columns(args: Endofunction[com.pulumi.aws.glue.inputs.PartitionStorageDescriptorColumnArgs.Builder]*):
        com.pulumi.aws.glue.inputs.PartitionStorageDescriptorArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.PartitionStorageDescriptorColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

    /**
     * @param serDeInfo Serialization/deserialization (SerDe) information.
     * @return builder
     */
    def serDeInfo(args: Endofunction[com.pulumi.aws.glue.inputs.PartitionStorageDescriptorSerDeInfoArgs.Builder]):
        com.pulumi.aws.glue.inputs.PartitionStorageDescriptorArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.PartitionStorageDescriptorSerDeInfoArgs.builder
      builder.serDeInfo(args(argsBuilder).build)

    /**
     * @param skewedInfo Information about values that appear very frequently in a column (skewed values).
     * @return builder
     */
    def skewedInfo(args: Endofunction[com.pulumi.aws.glue.inputs.PartitionStorageDescriptorSkewedInfoArgs.Builder]):
        com.pulumi.aws.glue.inputs.PartitionStorageDescriptorArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.PartitionStorageDescriptorSkewedInfoArgs.builder
      builder.skewedInfo(args(argsBuilder).build)

    /**
     * @param sortColumns A list of Order objects specifying the sort order of each bucket in the table.
     * @return builder
     */
    def sortColumns(args: Endofunction[com.pulumi.aws.glue.inputs.PartitionStorageDescriptorSortColumnArgs.Builder]*):
        com.pulumi.aws.glue.inputs.PartitionStorageDescriptorArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.PartitionStorageDescriptorSortColumnArgs.builder
      builder.sortColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.glue.inputs.GetScriptDagNodeArgs.Builder)
    /**
     * @param args Nested configuration an argument or property of a node. Defined below.
     * @return builder
     */
    def args(args: Endofunction[com.pulumi.aws.glue.inputs.GetScriptDagNodeArgArgs.Builder]*):
        com.pulumi.aws.glue.inputs.GetScriptDagNodeArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.GetScriptDagNodeArgArgs.builder
      builder.args(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.glue.inputs.TriggerState.Builder)
    /**
     * @param actions List of actions initiated by this trigger when it fires. See Actions Below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.aws.glue.inputs.TriggerActionArgs.Builder]*):
        com.pulumi.aws.glue.inputs.TriggerState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.TriggerActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param eventBatchingConditions Batch condition that must be met (specified number of events received or batch time window expired) before EventBridge event trigger fires. See Event Batching Condition.
     * @return builder
     */
    def eventBatchingConditions(args: Endofunction[com.pulumi.aws.glue.inputs.TriggerEventBatchingConditionArgs.Builder]*):
        com.pulumi.aws.glue.inputs.TriggerState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.TriggerEventBatchingConditionArgs.builder
      builder.eventBatchingConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param predicate A predicate to specify when the new trigger should fire. Required when trigger type is `CONDITIONAL`. See Predicate Below.
     * @return builder
     */
    def predicate(args: Endofunction[com.pulumi.aws.glue.inputs.TriggerPredicateArgs.Builder]):
        com.pulumi.aws.glue.inputs.TriggerState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.TriggerPredicateArgs.builder
      builder.predicate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorArgs.Builder)
    /**
     * @param columns Configuration block for columns in the table. See `columns` below.
     * @return builder
     */
    def columns(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorColumnArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

    /**
     * @param schemaReference Object that references a schema stored in the AWS Glue Schema Registry. When creating a table, you can pass an empty list of columns for the schema, and instead use a schema reference. See Schema Reference below.
     * @return builder
     */
    def schemaReference(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSchemaReferenceArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSchemaReferenceArgs.builder
      builder.schemaReference(args(argsBuilder).build)

    /**
     * @param serDeInfo Configuration block for serialization and deserialization (&#34;SerDe&#34;) information. See `serDeInfo` below.
     * @return builder
     */
    def serDeInfo(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSerDeInfoArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSerDeInfoArgs.builder
      builder.serDeInfo(args(argsBuilder).build)

    /**
     * @param skewedInfo Configuration block with information about values that appear very frequently in a column (skewed values). See `skewedInfo` below.
     * @return builder
     */
    def skewedInfo(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSkewedInfoArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSkewedInfoArgs.builder
      builder.skewedInfo(args(argsBuilder).build)

    /**
     * @param sortColumns Configuration block for the sort order of each bucket in the table. See `sortColumns` below.
     * @return builder
     */
    def sortColumns(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSortColumnArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSortColumnArgs.builder
      builder.sortColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.glue.inputs.ClassifierState.Builder)
    /**
     * @param csvClassifier A classifier for CSV content. Defined below.
     * @return builder
     */
    def csvClassifier(args: Endofunction[com.pulumi.aws.glue.inputs.ClassifierCsvClassifierArgs.Builder]):
        com.pulumi.aws.glue.inputs.ClassifierState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ClassifierCsvClassifierArgs.builder
      builder.csvClassifier(args(argsBuilder).build)

    /**
     * @param grokClassifier A classifier that uses grok patterns. Defined below.
     * @return builder
     */
    def grokClassifier(args: Endofunction[com.pulumi.aws.glue.inputs.ClassifierGrokClassifierArgs.Builder]):
        com.pulumi.aws.glue.inputs.ClassifierState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ClassifierGrokClassifierArgs.builder
      builder.grokClassifier(args(argsBuilder).build)

    /**
     * @param jsonClassifier A classifier for JSON content. Defined below.
     * @return builder
     */
    def jsonClassifier(args: Endofunction[com.pulumi.aws.glue.inputs.ClassifierJsonClassifierArgs.Builder]):
        com.pulumi.aws.glue.inputs.ClassifierState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ClassifierJsonClassifierArgs.builder
      builder.jsonClassifier(args(argsBuilder).build)

    /**
     * @param xmlClassifier A classifier for XML content. Defined below.
     * @return builder
     */
    def xmlClassifier(args: Endofunction[com.pulumi.aws.glue.inputs.ClassifierXmlClassifierArgs.Builder]):
        com.pulumi.aws.glue.inputs.ClassifierState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ClassifierXmlClassifierArgs.builder
      builder.xmlClassifier(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.MLTransformState.Builder)
    /**
     * @param inputRecordTables A list of AWS Glue table definitions used by the transform. see Input Record Tables.
     * @return builder
     */
    def inputRecordTables(args: Endofunction[com.pulumi.aws.glue.inputs.MLTransformInputRecordTableArgs.Builder]*):
        com.pulumi.aws.glue.inputs.MLTransformState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.MLTransformInputRecordTableArgs.builder
      builder.inputRecordTables(args.map(_(argsBuilder).build)*)

    /**
     * @param parameters The algorithmic parameters that are specific to the transform type used. Conditionally dependent on the transform type. see Parameters.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.glue.inputs.MLTransformParametersArgs.Builder]):
        com.pulumi.aws.glue.inputs.MLTransformState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.MLTransformParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

    /**
     * @param schemas The object that represents the schema that this transform accepts. see Schema.
     * @return builder
     */
    def schemas(args: Endofunction[com.pulumi.aws.glue.inputs.MLTransformSchemaArgs.Builder]*):
        com.pulumi.aws.glue.inputs.MLTransformState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.MLTransformSchemaArgs.builder
      builder.schemas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.glue.inputs.TriggerActionArgs.Builder)
    /**
     * @param notificationProperty Specifies configuration properties of a job run notification. See Notification Property details below.
     * @return builder
     */
    def notificationProperty(args: Endofunction[com.pulumi.aws.glue.inputs.TriggerActionNotificationPropertyArgs.Builder]):
        com.pulumi.aws.glue.inputs.TriggerActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.TriggerActionNotificationPropertyArgs.builder
      builder.notificationProperty(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogDatabaseState.Builder)
    /**
     * @param createTableDefaultPermissions Creates a set of default permissions on the table for principals. See `createTableDefaultPermission` below.
     * @return builder
     */
    def createTableDefaultPermissions(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogDatabaseCreateTableDefaultPermissionArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CatalogDatabaseState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogDatabaseCreateTableDefaultPermissionArgs.builder
      builder.createTableDefaultPermissions(args.map(_(argsBuilder).build)*)

    /**
     * @param federatedDatabase Configuration block that references an entity outside the AWS Glue Data Catalog. See `federatedDatabase` below.
     * @return builder
     */
    def federatedDatabase(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogDatabaseFederatedDatabaseArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogDatabaseState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogDatabaseFederatedDatabaseArgs.builder
      builder.federatedDatabase(args(argsBuilder).build)

    /**
     * @param targetDatabase Configuration block for a target database for resource linking. See `targetDatabase` below.
     * @return builder
     */
    def targetDatabase(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogDatabaseTargetDatabaseArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogDatabaseState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogDatabaseTargetDatabaseArgs.builder
      builder.targetDatabase(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.PartitionState.Builder)
    /**
     * @param storageDescriptor A storage descriptor object containing information about the physical storage of this table. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor) for a full explanation of this object.
     * @return builder
     */
    def storageDescriptor(args: Endofunction[com.pulumi.aws.glue.inputs.PartitionStorageDescriptorArgs.Builder]):
        com.pulumi.aws.glue.inputs.PartitionState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.PartitionStorageDescriptorArgs.builder
      builder.storageDescriptor(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.ConnectionState.Builder)
    /**
     * @param physicalConnectionRequirements Map of physical connection requirements, such as VPC and SecurityGroup. See `physicalConnectionRequirements` Block for details.
     * @return builder
     */
    def physicalConnectionRequirements(args: Endofunction[com.pulumi.aws.glue.inputs.ConnectionPhysicalConnectionRequirementsArgs.Builder]):
        com.pulumi.aws.glue.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ConnectionPhysicalConnectionRequirementsArgs.builder
      builder.physicalConnectionRequirements(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationArgs.Builder)
    /**
     * @param orphanFileDeletionConfiguration The configuration block for an orphan file deletion optimizer. See Orphan File Deletion Configuration for additional details.
     * @return builder
     */
    def orphanFileDeletionConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationOrphanFileDeletionConfigurationArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationOrphanFileDeletionConfigurationArgs.builder
      builder.orphanFileDeletionConfiguration(args(argsBuilder).build)

    /**
     * @param retentionConfiguration The configuration block for a snapshot retention optimizer. See Retention Configuration for additional details.
     * @return builder
     */
    def retentionConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationRetentionConfigurationArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationRetentionConfigurationArgs.builder
      builder.retentionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs.Builder)
    /**
     * @param connectionPasswordEncryption When connection password protection is enabled, the Data Catalog uses a customer-provided key to encrypt the password as part of CreateConnection or UpdateConnection and store it in the ENCRYPTED_PASSWORD field in the connection properties. You can enable catalog encryption or only password encryption. see Connection Password Encryption.
     * @return builder
     */
    def connectionPasswordEncryption(args: Endofunction[com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionArgs.Builder]):
        com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionArgs.builder
      builder.connectionPasswordEncryption(args(argsBuilder).build)

    /**
     * @param encryptionAtRest Specifies the encryption-at-rest configuration for the Data Catalog. see Encryption At Rest.
     * @return builder
     */
    def encryptionAtRest(args: Endofunction[com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestArgs.Builder]):
        com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestArgs.builder
      builder.encryptionAtRest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.TriggerPredicateArgs.Builder)
    /**
     * @param conditions A list of the conditions that determine when the trigger will fire. See Conditions.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.glue.inputs.TriggerPredicateConditionArgs.Builder]*):
        com.pulumi.aws.glue.inputs.TriggerPredicateArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.TriggerPredicateConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableOptimizerState.Builder)
    /**
     * @param configuration A configuration block that defines the table optimizer settings. See Configuration for additional details.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableOptimizerState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.DataQualityRulesetState.Builder)
    /**
     * @param targetTable A Configuration block specifying a target table associated with the data quality ruleset. See `targetTable` below.
     * @return builder
     */
    def targetTable(args: Endofunction[com.pulumi.aws.glue.inputs.DataQualityRulesetTargetTableArgs.Builder]):
        com.pulumi.aws.glue.inputs.DataQualityRulesetState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.DataQualityRulesetTargetTableArgs.builder
      builder.targetTable(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationRetentionConfigurationArgs.Builder)
    /**
     * @param icebergConfiguration The configuration for an Iceberg snapshot retention optimizer.
     * @return builder
     */
    def icebergConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationRetentionConfigurationIcebergConfigurationArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationRetentionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationRetentionConfigurationIcebergConfigurationArgs.builder
      builder.icebergConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputArgs.Builder)
    /**
     * @param icebergInput Configuration block for iceberg table config. See `icebergInput` below.
     * @return builder
     */
    def icebergInput(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputArgs.builder
      builder.icebergInput(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.PartitionIndexState.Builder)
    /**
     * @param partitionIndex Configuration block for a partition index. See `partitionIndex` below.
     * @return builder
     */
    def partitionIndex(args: Endofunction[com.pulumi.aws.glue.inputs.PartitionIndexPartitionIndexArgs.Builder]):
        com.pulumi.aws.glue.inputs.PartitionIndexState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.PartitionIndexPartitionIndexArgs.builder
      builder.partitionIndex(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.JobState.Builder)
    /**
     * @param command The command of the job. Defined below.
     * @return builder
     */
    def command(args: Endofunction[com.pulumi.aws.glue.inputs.JobCommandArgs.Builder]):
        com.pulumi.aws.glue.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.JobCommandArgs.builder
      builder.command(args(argsBuilder).build)

    /**
     * @param executionProperty Execution property of the job. Defined below.
     * @return builder
     */
    def executionProperty(args: Endofunction[com.pulumi.aws.glue.inputs.JobExecutionPropertyArgs.Builder]):
        com.pulumi.aws.glue.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.JobExecutionPropertyArgs.builder
      builder.executionProperty(args(argsBuilder).build)

    /**
     * @param notificationProperty Notification property of the job. Defined below.
     * @return builder
     */
    def notificationProperty(args: Endofunction[com.pulumi.aws.glue.inputs.JobNotificationPropertyArgs.Builder]):
        com.pulumi.aws.glue.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.JobNotificationPropertyArgs.builder
      builder.notificationProperty(args(argsBuilder).build)

    /**
     * @param sourceControlDetails The details for a source control configuration for a job, allowing synchronization of job artifacts to or from a remote repository. Defined below.
     * @return builder
     */
    def sourceControlDetails(args: Endofunction[com.pulumi.aws.glue.inputs.JobSourceControlDetailsArgs.Builder]):
        com.pulumi.aws.glue.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.JobSourceControlDetailsArgs.builder
      builder.sourceControlDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsState.Builder)
    /**
     * @param dataCatalogEncryptionSettings The security configuration to set. see Data Catalog Encryption Settings.
     * @return builder
     */
    def dataCatalogEncryptionSettings(args: Endofunction[com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs.Builder]):
        com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs.builder
      builder.dataCatalogEncryptionSettings(args(argsBuilder).build)
