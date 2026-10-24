package jp.ukiba.ko_pulumi
package aws

object glue_ext:
  extension (builder: com.pulumi.aws.glue.CatalogArgs.Builder)
    /**
     * @param catalogProperties Configuration block of properties for the catalog. See `catalogProperties` Block below.
     * @return builder
     */
    inline def catalogProperties(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogCatalogPropertiesArgs.Builder]):
        com.pulumi.aws.glue.CatalogArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogCatalogPropertiesArgs.builder
      builder.catalogProperties(args(argsBuilder).build)

    /**
     * @param createDatabaseDefaultPermissions List of default permissions on databases for principals. See `createDatabaseDefaultPermissions` Block below.
     * @return builder
     */
    inline def createDatabaseDefaultPermissions(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogCreateDatabaseDefaultPermissionArgs.Builder]*):
        com.pulumi.aws.glue.CatalogArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogCreateDatabaseDefaultPermissionArgs.builder
      builder.createDatabaseDefaultPermissions(args.map(_(argsBuilder).build)*)

    /**
     * @param createTableDefaultPermissions List of default permissions on tables for principals. See `createTableDefaultPermissions` Block below.
     * @return builder
     */
    inline def createTableDefaultPermissions(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogCreateTableDefaultPermissionArgs.Builder]*):
        com.pulumi.aws.glue.CatalogArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogCreateTableDefaultPermissionArgs.builder
      builder.createTableDefaultPermissions(args.map(_(argsBuilder).build)*)

    /**
     * @param federatedCatalog Configuration block for a federated catalog. See `federatedCatalog` Block below.
     * @return builder
     */
    inline def federatedCatalog(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogFederatedCatalogArgs.Builder]):
        com.pulumi.aws.glue.CatalogArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogFederatedCatalogArgs.builder
      builder.federatedCatalog(args(argsBuilder).build)

    /**
     * @param targetRedshiftCatalog Configuration block for a target Redshift catalog. See `targetRedshiftCatalog` Block below.
     * @return builder
     */
    inline def targetRedshiftCatalog(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTargetRedshiftCatalogArgs.Builder]):
        com.pulumi.aws.glue.CatalogArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTargetRedshiftCatalogArgs.builder
      builder.targetRedshiftCatalog(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTimeoutsArgs.Builder]):
        com.pulumi.aws.glue.CatalogArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.CatalogDatabaseArgs.Builder)
    /**
     * @param createTableDefaultPermissions Creates a set of default permissions on the table for principals. See `createTableDefaultPermission` Block below.
     * @return builder
     */
    inline def createTableDefaultPermissions(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogDatabaseCreateTableDefaultPermissionArgs.Builder]*):
        com.pulumi.aws.glue.CatalogDatabaseArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogDatabaseCreateTableDefaultPermissionArgs.builder
      builder.createTableDefaultPermissions(args.map(_(argsBuilder).build)*)

    /**
     * @param federatedDatabase Configuration block that references an entity outside the AWS Glue Data Catalog. See `federatedDatabase` Block below.
     * @return builder
     */
    inline def federatedDatabase(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogDatabaseFederatedDatabaseArgs.Builder]):
        com.pulumi.aws.glue.CatalogDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogDatabaseFederatedDatabaseArgs.builder
      builder.federatedDatabase(args(argsBuilder).build)

    /**
     * @param targetDatabase Configuration block for a target database for resource linking. See `targetDatabase` Block below.
     * @return builder
     */
    inline def targetDatabase(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogDatabaseTargetDatabaseArgs.Builder]):
        com.pulumi.aws.glue.CatalogDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogDatabaseTargetDatabaseArgs.builder
      builder.targetDatabase(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.CatalogTableArgs.Builder)
    /**
     * @param openTableFormatInput Configuration block for open table formats. See `openTableFormatInput` below.
     * @return builder
     */
    inline def openTableFormatInput(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputArgs.Builder]):
        com.pulumi.aws.glue.CatalogTableArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputArgs.builder
      builder.openTableFormatInput(args(argsBuilder).build)

    /**
     * @param partitionIndices Configuration block for a maximum of 3 partition indexes. See `partitionIndex` below.
     * @return builder
     */
    inline def partitionIndices(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTablePartitionIndexArgs.Builder]*):
        com.pulumi.aws.glue.CatalogTableArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogTablePartitionIndexArgs.builder
      builder.partitionIndices(args.map(_(argsBuilder).build)*)

    /**
     * @param partitionKeys Configuration block of columns by which the table is partitioned. Only primitive types are supported as partition keys. See `partitionKeys` below.
     * @return builder
     */
    inline def partitionKeys(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTablePartitionKeyArgs.Builder]*):
        com.pulumi.aws.glue.CatalogTableArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogTablePartitionKeyArgs.builder
      builder.partitionKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param storageDescriptor Configuration block for information about the physical storage of this table. For more information, refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor). See `storageDescriptor` below.
     * @return builder
     */
    inline def storageDescriptor(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorArgs.Builder]):
        com.pulumi.aws.glue.CatalogTableArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorArgs.builder
      builder.storageDescriptor(args(argsBuilder).build)

    /**
     * @param targetTable Configuration block of a target table for resource linking. See `targetTable` below.
     * @return builder
     */
    inline def targetTable(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableTargetTableArgs.Builder]):
        com.pulumi.aws.glue.CatalogTableArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableTargetTableArgs.builder
      builder.targetTable(args(argsBuilder).build)

    /**
     * @param viewDefinition Structure that contains all the information that defines the view, including the dialect or dialects for the view, and the query. See `viewDefinition` below.
     * @return builder
     */
    inline def viewDefinition(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableViewDefinitionArgs.Builder]):
        com.pulumi.aws.glue.CatalogTableArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableViewDefinitionArgs.builder
      builder.viewDefinition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.CatalogTableOptimizerArgs.Builder)
    /**
     * @param configuration Configuration block that defines the table optimizer settings. See `configuration` Block for additional details.
     * @return builder
     */
    inline def configuration(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationArgs.Builder]):
        com.pulumi.aws.glue.CatalogTableOptimizerArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.ClassifierArgs.Builder)
    /**
     * @param csvClassifier Classifier for CSV content. Defined below.
     * @return builder
     */
    inline def csvClassifier(args: Endofunction[com.pulumi.aws.glue.inputs.ClassifierCsvClassifierArgs.Builder]):
        com.pulumi.aws.glue.ClassifierArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ClassifierCsvClassifierArgs.builder
      builder.csvClassifier(args(argsBuilder).build)

    /**
     * @param grokClassifier Classifier that uses grok patterns. Defined below.
     * @return builder
     */
    inline def grokClassifier(args: Endofunction[com.pulumi.aws.glue.inputs.ClassifierGrokClassifierArgs.Builder]):
        com.pulumi.aws.glue.ClassifierArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ClassifierGrokClassifierArgs.builder
      builder.grokClassifier(args(argsBuilder).build)

    /**
     * @param jsonClassifier Classifier for JSON content. Defined below.
     * @return builder
     */
    inline def jsonClassifier(args: Endofunction[com.pulumi.aws.glue.inputs.ClassifierJsonClassifierArgs.Builder]):
        com.pulumi.aws.glue.ClassifierArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ClassifierJsonClassifierArgs.builder
      builder.jsonClassifier(args(argsBuilder).build)

    /**
     * @param xmlClassifier Classifier for XML content. Defined below.
     * @return builder
     */
    inline def xmlClassifier(args: Endofunction[com.pulumi.aws.glue.inputs.ClassifierXmlClassifierArgs.Builder]):
        com.pulumi.aws.glue.ClassifierArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ClassifierXmlClassifierArgs.builder
      builder.xmlClassifier(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.ConnectionArgs.Builder)
    /**
     * @param authenticationConfiguration Configuration block for authentication options. See `authenticationConfiguration` below.
     * @return builder
     */
    inline def authenticationConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.ConnectionAuthenticationConfigurationArgs.Builder]):
        com.pulumi.aws.glue.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ConnectionAuthenticationConfigurationArgs.builder
      builder.authenticationConfiguration(args(argsBuilder).build)

    /**
     * @param physicalConnectionRequirements Map of physical connection requirements, such as VPC and SecurityGroup. See `physicalConnectionRequirements` below.
     * @return builder
     */
    inline def physicalConnectionRequirements(args: Endofunction[com.pulumi.aws.glue.inputs.ConnectionPhysicalConnectionRequirementsArgs.Builder]):
        com.pulumi.aws.glue.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ConnectionPhysicalConnectionRequirementsArgs.builder
      builder.physicalConnectionRequirements(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.CrawlerArgs.Builder)
    /**
     * @param catalogTargets List of nested AWS Glue Data Catalog target arguments. See `catalogTarget` below.
     * @return builder
     */
    inline def catalogTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerCatalogTargetArgs.Builder]*):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerCatalogTargetArgs.builder
      builder.catalogTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param deltaTargets List of nested Delta Lake target arguments. See `deltaTarget` below.
     * @return builder
     */
    inline def deltaTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerDeltaTargetArgs.Builder]*):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerDeltaTargetArgs.builder
      builder.deltaTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param dynamodbTargets List of nested DynamoDB target arguments. See `dynamodbTarget` below.
     * @return builder
     */
    inline def dynamodbTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerDynamodbTargetArgs.Builder]*):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerDynamodbTargetArgs.builder
      builder.dynamodbTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param hudiTargets List of nested Hudi target arguments. See `hudiTarget` below.
     * @return builder
     */
    inline def hudiTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerHudiTargetArgs.Builder]*):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerHudiTargetArgs.builder
      builder.hudiTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param icebergTargets List of nested Iceberg target arguments. See `icebergTarget` below.
     * @return builder
     */
    inline def icebergTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerIcebergTargetArgs.Builder]*):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerIcebergTargetArgs.builder
      builder.icebergTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param jdbcTargets List of nested JDBC target arguments. See `jdbcTarget` below.
     * @return builder
     */
    inline def jdbcTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerJdbcTargetArgs.Builder]*):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerJdbcTargetArgs.builder
      builder.jdbcTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param lakeFormationConfiguration Lake Formation configuration settings for the crawler. See `lakeFormationConfiguration` below.
     * @return builder
     */
    inline def lakeFormationConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerLakeFormationConfigurationArgs.Builder]):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CrawlerLakeFormationConfigurationArgs.builder
      builder.lakeFormationConfiguration(args(argsBuilder).build)

    /**
     * @param lineageConfiguration Data lineage configuration settings for the crawler. See `lineageConfiguration` below.
     * @return builder
     */
    inline def lineageConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerLineageConfigurationArgs.Builder]):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CrawlerLineageConfigurationArgs.builder
      builder.lineageConfiguration(args(argsBuilder).build)

    /**
     * @param mongodbTargets List of nested MongoDB target arguments. See `mongodbTarget` below.
     * @return builder
     */
    inline def mongodbTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerMongodbTargetArgs.Builder]*):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerMongodbTargetArgs.builder
      builder.mongodbTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param recrawlPolicy Policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run. See `recrawlPolicy` below.
     * @return builder
     */
    inline def recrawlPolicy(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerRecrawlPolicyArgs.Builder]):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CrawlerRecrawlPolicyArgs.builder
      builder.recrawlPolicy(args(argsBuilder).build)

    /**
     * @param s3Targets List of nested Amazon S3 target arguments. See `s3Target` below.
     * @return builder
     */
    inline def s3Targets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerS3TargetArgs.Builder]*):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerS3TargetArgs.builder
      builder.s3Targets(args.map(_(argsBuilder).build)*)

    /**
     * @param schemaChangePolicy Policy for the crawler&#39;s update and deletion behavior. See `schemaChangePolicy` below.
     * @return builder
     */
    inline def schemaChangePolicy(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerSchemaChangePolicyArgs.Builder]):
        com.pulumi.aws.glue.CrawlerArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CrawlerSchemaChangePolicyArgs.builder
      builder.schemaChangePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.DataCatalogEncryptionSettingsArgs.Builder)
    /**
     * @param dataCatalogEncryptionSettings Security configuration to set. see `dataCatalogEncryptionSettings` Block.
     * @return builder
     */
    inline def dataCatalogEncryptionSettings(args: Endofunction[com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs.Builder]):
        com.pulumi.aws.glue.DataCatalogEncryptionSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs.builder
      builder.dataCatalogEncryptionSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.DataQualityRulesetArgs.Builder)
    /**
     * @param targetTable Configuration block specifying a target table associated with the data quality ruleset. See `targetTable` Block below.
     * @return builder
     */
    inline def targetTable(args: Endofunction[com.pulumi.aws.glue.inputs.DataQualityRulesetTargetTableArgs.Builder]):
        com.pulumi.aws.glue.DataQualityRulesetArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.DataQualityRulesetTargetTableArgs.builder
      builder.targetTable(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.JobArgs.Builder)
    /**
     * @param command Command of the job. Defined below.
     * @return builder
     */
    inline def command(args: Endofunction[com.pulumi.aws.glue.inputs.JobCommandArgs.Builder]):
        com.pulumi.aws.glue.JobArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.JobCommandArgs.builder
      builder.command(args(argsBuilder).build)

    /**
     * @param executionProperty Execution property of the job. Defined below.
     * @return builder
     */
    inline def executionProperty(args: Endofunction[com.pulumi.aws.glue.inputs.JobExecutionPropertyArgs.Builder]):
        com.pulumi.aws.glue.JobArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.JobExecutionPropertyArgs.builder
      builder.executionProperty(args(argsBuilder).build)

    /**
     * @param notificationProperty Notification property of the job. Defined below.
     * @return builder
     */
    inline def notificationProperty(args: Endofunction[com.pulumi.aws.glue.inputs.JobNotificationPropertyArgs.Builder]):
        com.pulumi.aws.glue.JobArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.JobNotificationPropertyArgs.builder
      builder.notificationProperty(args(argsBuilder).build)

    /**
     * @param sourceControlDetails Details for a source control configuration for a job, allowing synchronization of job artifacts to or from a remote repository. Defined below.
     * @return builder
     */
    inline def sourceControlDetails(args: Endofunction[com.pulumi.aws.glue.inputs.JobSourceControlDetailsArgs.Builder]):
        com.pulumi.aws.glue.JobArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.JobSourceControlDetailsArgs.builder
      builder.sourceControlDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.MLTransformArgs.Builder)
    /**
     * @param inputRecordTables List of AWS Glue table definitions used by the transform. See `inputRecordTables`.
     * @return builder
     */
    inline def inputRecordTables(args: Endofunction[com.pulumi.aws.glue.inputs.MLTransformInputRecordTableArgs.Builder]*):
        com.pulumi.aws.glue.MLTransformArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.MLTransformInputRecordTableArgs.builder
      builder.inputRecordTables(args.map(_(argsBuilder).build)*)

    /**
     * @param parameters Algorithmic parameters that are specific to the transform type used. Conditionally dependent on the transform type. See `parameters`.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.glue.inputs.MLTransformParametersArgs.Builder]):
        com.pulumi.aws.glue.MLTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.MLTransformParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.PartitionArgs.Builder)
    /**
     * @param storageDescriptor Storage descriptor object containing information about the physical storage of this table. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor) for a full explanation of this object.
     * @return builder
     */
    inline def storageDescriptor(args: Endofunction[com.pulumi.aws.glue.inputs.PartitionStorageDescriptorArgs.Builder]):
        com.pulumi.aws.glue.PartitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.PartitionStorageDescriptorArgs.builder
      builder.storageDescriptor(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.PartitionIndexArgs.Builder)
    /**
     * @param partitionIndex Configuration block for a partition index. See `partitionIndex` Block below.
     * @return builder
     */
    inline def partitionIndex(args: Endofunction[com.pulumi.aws.glue.inputs.PartitionIndexPartitionIndexArgs.Builder]):
        com.pulumi.aws.glue.PartitionIndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.PartitionIndexPartitionIndexArgs.builder
      builder.partitionIndex(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.SecurityConfigurationArgs.Builder)
    /**
     * @param encryptionConfiguration Configuration block containing encryption configuration. Detailed below.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.glue.SecurityConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.TriggerArgs.Builder)
    /**
     * @param actions List of actions initiated by this trigger when it fires. See `actions` below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.aws.glue.inputs.TriggerActionArgs.Builder]*):
        com.pulumi.aws.glue.TriggerArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.TriggerActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param eventBatchingConditions Batch condition that must be met (specified number of events received or batch time window expired) before EventBridge event trigger fires. See `eventBatchingCondition`.
     * @return builder
     */
    inline def eventBatchingConditions(args: Endofunction[com.pulumi.aws.glue.inputs.TriggerEventBatchingConditionArgs.Builder]*):
        com.pulumi.aws.glue.TriggerArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.TriggerEventBatchingConditionArgs.builder
      builder.eventBatchingConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param predicate Predicate to specify when the new trigger should fire. Required when trigger type is `CONDITIONAL`. See `predicate` below.
     * @return builder
     */
    inline def predicate(args: Endofunction[com.pulumi.aws.glue.inputs.TriggerPredicateArgs.Builder]):
        com.pulumi.aws.glue.TriggerArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.TriggerPredicateArgs.builder
      builder.predicate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.UserDefinedFunctionArgs.Builder)
    /**
     * @param resourceUris Configuration block for Resource URIs. See `resourceUris` Block below for more details.
     * @return builder
     */
    inline def resourceUris(args: Endofunction[com.pulumi.aws.glue.inputs.UserDefinedFunctionResourceUriArgs.Builder]*):
        com.pulumi.aws.glue.UserDefinedFunctionArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.UserDefinedFunctionResourceUriArgs.builder
      builder.resourceUris(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogCatalogPropertiesArgs.Builder)
    /**
     * @param dataLakeAccessProperties Configuration block for data lake access properties. See `dataLakeAccessProperties` Block below.
     * @return builder
     */
    inline def dataLakeAccessProperties(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogCatalogPropertiesDataLakeAccessPropertiesArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogCatalogPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogCatalogPropertiesDataLakeAccessPropertiesArgs.builder
      builder.dataLakeAccessProperties(args(argsBuilder).build)

    /**
     * @param icebergOptimizationProperties Configuration block for Iceberg optimization properties. See `icebergOptimizationProperties` Block below.
     * @return builder
     */
    inline def icebergOptimizationProperties(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogCatalogPropertiesIcebergOptimizationPropertiesArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogCatalogPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogCatalogPropertiesIcebergOptimizationPropertiesArgs.builder
      builder.icebergOptimizationProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogCreateDatabaseDefaultPermissionArgs.Builder)
    /**
     * @param principal Principal who is granted permissions. See `principal` Block below.
     * @return builder
     */
    inline def principal(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogCreateDatabaseDefaultPermissionPrincipalArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogCreateDatabaseDefaultPermissionArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogCreateDatabaseDefaultPermissionPrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogCreateTableDefaultPermissionArgs.Builder)
    /**
     * @param principal Principal who is granted permissions. See `principal` Block below.
     * @return builder
     */
    inline def principal(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogCreateTableDefaultPermissionPrincipalArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogCreateTableDefaultPermissionArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogCreateTableDefaultPermissionPrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogDatabaseCreateTableDefaultPermissionArgs.Builder)
    /**
     * @param principal Principal who is granted permissions.. See `principal` Block below.
     * @return builder
     */
    inline def principal(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogDatabaseCreateTableDefaultPermissionPrincipalArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogDatabaseCreateTableDefaultPermissionArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogDatabaseCreateTableDefaultPermissionPrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogDatabaseState.Builder)
    /**
     * @param createTableDefaultPermissions Creates a set of default permissions on the table for principals. See `createTableDefaultPermission` Block below.
     * @return builder
     */
    inline def createTableDefaultPermissions(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogDatabaseCreateTableDefaultPermissionArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CatalogDatabaseState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogDatabaseCreateTableDefaultPermissionArgs.builder
      builder.createTableDefaultPermissions(args.map(_(argsBuilder).build)*)

    /**
     * @param federatedDatabase Configuration block that references an entity outside the AWS Glue Data Catalog. See `federatedDatabase` Block below.
     * @return builder
     */
    inline def federatedDatabase(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogDatabaseFederatedDatabaseArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogDatabaseState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogDatabaseFederatedDatabaseArgs.builder
      builder.federatedDatabase(args(argsBuilder).build)

    /**
     * @param targetDatabase Configuration block for a target database for resource linking. See `targetDatabase` Block below.
     * @return builder
     */
    inline def targetDatabase(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogDatabaseTargetDatabaseArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogDatabaseState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogDatabaseTargetDatabaseArgs.builder
      builder.targetDatabase(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogState.Builder)
    /**
     * @param catalogProperties Configuration block of properties for the catalog. See `catalogProperties` Block below.
     * @return builder
     */
    inline def catalogProperties(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogCatalogPropertiesArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogCatalogPropertiesArgs.builder
      builder.catalogProperties(args(argsBuilder).build)

    /**
     * @param createDatabaseDefaultPermissions List of default permissions on databases for principals. See `createDatabaseDefaultPermissions` Block below.
     * @return builder
     */
    inline def createDatabaseDefaultPermissions(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogCreateDatabaseDefaultPermissionArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CatalogState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogCreateDatabaseDefaultPermissionArgs.builder
      builder.createDatabaseDefaultPermissions(args.map(_(argsBuilder).build)*)

    /**
     * @param createTableDefaultPermissions List of default permissions on tables for principals. See `createTableDefaultPermissions` Block below.
     * @return builder
     */
    inline def createTableDefaultPermissions(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogCreateTableDefaultPermissionArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CatalogState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogCreateTableDefaultPermissionArgs.builder
      builder.createTableDefaultPermissions(args.map(_(argsBuilder).build)*)

    /**
     * @param federatedCatalog Configuration block for a federated catalog. See `federatedCatalog` Block below.
     * @return builder
     */
    inline def federatedCatalog(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogFederatedCatalogArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogFederatedCatalogArgs.builder
      builder.federatedCatalog(args(argsBuilder).build)

    /**
     * @param targetRedshiftCatalog Configuration block for a target Redshift catalog. See `targetRedshiftCatalog` Block below.
     * @return builder
     */
    inline def targetRedshiftCatalog(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTargetRedshiftCatalogArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTargetRedshiftCatalogArgs.builder
      builder.targetRedshiftCatalog(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTimeoutsArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputArgs.Builder)
    /**
     * @param icebergInput Configuration block for iceberg table config. See `icebergInput` below.
     * @return builder
     */
    inline def icebergInput(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputArgs.builder
      builder.icebergInput(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputArgs.Builder)
    /**
     * @param icebergTableInput Configuration parameters, including table properties and metadata specifications. See `icebergTableInput` below.
     * @return builder
     */
    inline def icebergTableInput(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputArgs.builder
      builder.icebergTableInput(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputArgs.Builder)
    /**
     * @param partitionSpec Partitioning specification that defines how the Iceberg table data will be organized and partitioned for optimal query performance. See `partitionSpec` below.
     * @return builder
     */
    inline def partitionSpec(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputPartitionSpecArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputPartitionSpecArgs.builder
      builder.partitionSpec(args(argsBuilder).build)

    /**
     * @param schema Schema definition that specifies the structure, field types, and metadata for the Iceberg table. See `schema` below.
     * @return builder
     */
    inline def schema(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputSchemaArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

    /**
     * @param sortOrder Sort order specification that defines how data should be ordered within each partition to optimize query performance. See `sortOrder` below.
     * @return builder
     */
    inline def sortOrder(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputSortOrderArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputSortOrderArgs.builder
      builder.sortOrder(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputPartitionSpecArgs.Builder)
    /**
     * @param fields List of partition fields that define how the table data should be partitioned. See `partition_spec.fields` below.
     * @return builder
     */
    inline def fields(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputPartitionSpecFieldArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputPartitionSpecArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputPartitionSpecFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputSchemaArgs.Builder)
    /**
     * @param fields List of field definitions that make up the table schema. See `schema.fields` below.
     * @return builder
     */
    inline def fields(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputSchemaFieldArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputSchemaArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputSchemaFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputSortOrderArgs.Builder)
    /**
     * @param fields List of fields and their sort directions that define the ordering criteria for the Iceberg table data. See `sort_order.fields` below.
     * @return builder
     */
    inline def fields(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputSortOrderFieldArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputSortOrderArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputIcebergInputIcebergTableInputSortOrderFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationArgs.Builder)
    /**
     * @param compactionConfiguration Configuration block for a compaction optimizer. See `compactionConfiguration` Block for additional details.
     * @return builder
     */
    inline def compactionConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationCompactionConfigurationArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationCompactionConfigurationArgs.builder
      builder.compactionConfiguration(args(argsBuilder).build)

    /**
     * @param orphanFileDeletionConfiguration Configuration block for an orphan file deletion optimizer. See `orphanFileDeletionConfiguration` Block for additional details.
     * @return builder
     */
    inline def orphanFileDeletionConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationOrphanFileDeletionConfigurationArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationOrphanFileDeletionConfigurationArgs.builder
      builder.orphanFileDeletionConfiguration(args(argsBuilder).build)

    /**
     * @param retentionConfiguration Configuration block for a snapshot retention optimizer. See `retentionConfiguration` Block for additional details.
     * @return builder
     */
    inline def retentionConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationRetentionConfigurationArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationRetentionConfigurationArgs.builder
      builder.retentionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationCompactionConfigurationArgs.Builder)
    /**
     * @param icebergConfiguration Configuration for an Iceberg compaction optimizer. See `configuration.compaction_configuration.iceberg_configuration` Block for additional details.
     * @return builder
     */
    inline def icebergConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationCompactionConfigurationIcebergConfigurationArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationCompactionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationCompactionConfigurationIcebergConfigurationArgs.builder
      builder.icebergConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationOrphanFileDeletionConfigurationArgs.Builder)
    /**
     * @param icebergConfiguration Configuration for an Iceberg orphan file deletion optimizer. See `configuration.orphan_file_deletion_configuration.iceberg_configuration` Block for additional details.
     * @return builder
     */
    inline def icebergConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationOrphanFileDeletionConfigurationIcebergConfigurationArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationOrphanFileDeletionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationOrphanFileDeletionConfigurationIcebergConfigurationArgs.builder
      builder.icebergConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationRetentionConfigurationArgs.Builder)
    /**
     * @param icebergConfiguration Configuration for an Iceberg snapshot retention optimizer. See `configuration.retention_configuration.iceberg_configuration` Block for additional details.
     * @return builder
     */
    inline def icebergConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationRetentionConfigurationIcebergConfigurationArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationRetentionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationRetentionConfigurationIcebergConfigurationArgs.builder
      builder.icebergConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableOptimizerState.Builder)
    /**
     * @param configuration Configuration block that defines the table optimizer settings. See `configuration` Block for additional details.
     * @return builder
     */
    inline def configuration(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableOptimizerState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOptimizerConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableState.Builder)
    /**
     * @param openTableFormatInput Configuration block for open table formats. See `openTableFormatInput` below.
     * @return builder
     */
    inline def openTableFormatInput(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableOpenTableFormatInputArgs.builder
      builder.openTableFormatInput(args(argsBuilder).build)

    /**
     * @param partitionIndices Configuration block for a maximum of 3 partition indexes. See `partitionIndex` below.
     * @return builder
     */
    inline def partitionIndices(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTablePartitionIndexArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CatalogTableState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogTablePartitionIndexArgs.builder
      builder.partitionIndices(args.map(_(argsBuilder).build)*)

    /**
     * @param partitionKeys Configuration block of columns by which the table is partitioned. Only primitive types are supported as partition keys. See `partitionKeys` below.
     * @return builder
     */
    inline def partitionKeys(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTablePartitionKeyArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CatalogTableState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogTablePartitionKeyArgs.builder
      builder.partitionKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param storageDescriptor Configuration block for information about the physical storage of this table. For more information, refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor). See `storageDescriptor` below.
     * @return builder
     */
    inline def storageDescriptor(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorArgs.builder
      builder.storageDescriptor(args(argsBuilder).build)

    /**
     * @param targetTable Configuration block of a target table for resource linking. See `targetTable` below.
     * @return builder
     */
    inline def targetTable(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableTargetTableArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableTargetTableArgs.builder
      builder.targetTable(args(argsBuilder).build)

    /**
     * @param viewDefinition Structure that contains all the information that defines the view, including the dialect or dialects for the view, and the query. See `viewDefinition` below.
     * @return builder
     */
    inline def viewDefinition(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableViewDefinitionArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableViewDefinitionArgs.builder
      builder.viewDefinition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorArgs.Builder)
    /**
     * @param columns Configuration block for columns in the table. See `columns` below.
     * @return builder
     */
    inline def columns(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorColumnArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

    /**
     * @param schemaReference Object that references a schema stored in the AWS Glue Schema Registry. When creating a table, you can pass an empty list of columns for the schema, and instead use a schema reference. See Schema Reference below.
     * @return builder
     */
    inline def schemaReference(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSchemaReferenceArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSchemaReferenceArgs.builder
      builder.schemaReference(args(argsBuilder).build)

    /**
     * @param serDeInfo Configuration block for serialization and deserialization (&#34;SerDe&#34;) information. See `serDeInfo` below.
     * @return builder
     */
    inline def serDeInfo(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSerDeInfoArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSerDeInfoArgs.builder
      builder.serDeInfo(args(argsBuilder).build)

    /**
     * @param skewedInfo Configuration block with information about values that appear very frequently in a column (skewed values). See `skewedInfo` below.
     * @return builder
     */
    inline def skewedInfo(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSkewedInfoArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSkewedInfoArgs.builder
      builder.skewedInfo(args(argsBuilder).build)

    /**
     * @param sortColumns Configuration block for the sort order of each bucket in the table. See `sortColumns` below.
     * @return builder
     */
    inline def sortColumns(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSortColumnArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSortColumnArgs.builder
      builder.sortColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSchemaReferenceArgs.Builder)
    /**
     * @param schemaId Configuration block that contains schema identity fields. Either this or the `schemaVersionId` has to be provided. See `schemaId` below.
     * @return builder
     */
    inline def schemaId(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSchemaReferenceSchemaIdArgs.Builder]):
        com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSchemaReferenceArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSchemaReferenceSchemaIdArgs.builder
      builder.schemaId(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CatalogTableViewDefinitionArgs.Builder)
    /**
     * @param representations List of structures that contains the dialect of the view, and the query that defines the view. See `representations` below.
     * @return builder
     */
    inline def representations(args: Endofunction[com.pulumi.aws.glue.inputs.CatalogTableViewDefinitionRepresentationArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CatalogTableViewDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CatalogTableViewDefinitionRepresentationArgs.builder
      builder.representations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.glue.inputs.ClassifierState.Builder)
    /**
     * @param csvClassifier Classifier for CSV content. Defined below.
     * @return builder
     */
    inline def csvClassifier(args: Endofunction[com.pulumi.aws.glue.inputs.ClassifierCsvClassifierArgs.Builder]):
        com.pulumi.aws.glue.inputs.ClassifierState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ClassifierCsvClassifierArgs.builder
      builder.csvClassifier(args(argsBuilder).build)

    /**
     * @param grokClassifier Classifier that uses grok patterns. Defined below.
     * @return builder
     */
    inline def grokClassifier(args: Endofunction[com.pulumi.aws.glue.inputs.ClassifierGrokClassifierArgs.Builder]):
        com.pulumi.aws.glue.inputs.ClassifierState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ClassifierGrokClassifierArgs.builder
      builder.grokClassifier(args(argsBuilder).build)

    /**
     * @param jsonClassifier Classifier for JSON content. Defined below.
     * @return builder
     */
    inline def jsonClassifier(args: Endofunction[com.pulumi.aws.glue.inputs.ClassifierJsonClassifierArgs.Builder]):
        com.pulumi.aws.glue.inputs.ClassifierState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ClassifierJsonClassifierArgs.builder
      builder.jsonClassifier(args(argsBuilder).build)

    /**
     * @param xmlClassifier Classifier for XML content. Defined below.
     * @return builder
     */
    inline def xmlClassifier(args: Endofunction[com.pulumi.aws.glue.inputs.ClassifierXmlClassifierArgs.Builder]):
        com.pulumi.aws.glue.inputs.ClassifierState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ClassifierXmlClassifierArgs.builder
      builder.xmlClassifier(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.ConnectionAuthenticationConfigurationArgs.Builder)
    /**
     * @param basicAuthenticationCredentials Basic authentication credentials. See `basicAuthenticationCredentials` below.
     * @return builder
     */
    inline def basicAuthenticationCredentials(args: Endofunction[com.pulumi.aws.glue.inputs.ConnectionAuthenticationConfigurationBasicAuthenticationCredentialsArgs.Builder]):
        com.pulumi.aws.glue.inputs.ConnectionAuthenticationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ConnectionAuthenticationConfigurationBasicAuthenticationCredentialsArgs.builder
      builder.basicAuthenticationCredentials(args(argsBuilder).build)

    /**
     * @param oauth2Properties OAuth2 properties. See `oauth2Properties` below.
     * @return builder
     */
    inline def oauth2Properties(args: Endofunction[com.pulumi.aws.glue.inputs.ConnectionAuthenticationConfigurationOauth2PropertiesArgs.Builder]):
        com.pulumi.aws.glue.inputs.ConnectionAuthenticationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ConnectionAuthenticationConfigurationOauth2PropertiesArgs.builder
      builder.oauth2Properties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.ConnectionAuthenticationConfigurationOauth2PropertiesArgs.Builder)
    /**
     * @param authorizationCodeProperties Authorization code properties. See `authorizationCodeProperties` below.
     * @return builder
     */
    inline def authorizationCodeProperties(args: Endofunction[com.pulumi.aws.glue.inputs.ConnectionAuthenticationConfigurationOauth2PropertiesAuthorizationCodePropertiesArgs.Builder]):
        com.pulumi.aws.glue.inputs.ConnectionAuthenticationConfigurationOauth2PropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ConnectionAuthenticationConfigurationOauth2PropertiesAuthorizationCodePropertiesArgs.builder
      builder.authorizationCodeProperties(args(argsBuilder).build)

    /**
     * @param oauth2ClientApplication OAuth2 client application details. See `oauth2ClientApplication` below.
     * @return builder
     */
    inline def oauth2ClientApplication(args: Endofunction[com.pulumi.aws.glue.inputs.ConnectionAuthenticationConfigurationOauth2PropertiesOauth2ClientApplicationArgs.Builder]):
        com.pulumi.aws.glue.inputs.ConnectionAuthenticationConfigurationOauth2PropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ConnectionAuthenticationConfigurationOauth2PropertiesOauth2ClientApplicationArgs.builder
      builder.oauth2ClientApplication(args(argsBuilder).build)

    /**
     * @param oauth2Credentials OAuth2 credentials. See `oauth2Credentials` below.
     * @return builder
     */
    inline def oauth2Credentials(args: Endofunction[com.pulumi.aws.glue.inputs.ConnectionAuthenticationConfigurationOauth2PropertiesOauth2CredentialsArgs.Builder]):
        com.pulumi.aws.glue.inputs.ConnectionAuthenticationConfigurationOauth2PropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ConnectionAuthenticationConfigurationOauth2PropertiesOauth2CredentialsArgs.builder
      builder.oauth2Credentials(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.ConnectionState.Builder)
    /**
     * @param authenticationConfiguration Configuration block for authentication options. See `authenticationConfiguration` below.
     * @return builder
     */
    inline def authenticationConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.ConnectionAuthenticationConfigurationArgs.Builder]):
        com.pulumi.aws.glue.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ConnectionAuthenticationConfigurationArgs.builder
      builder.authenticationConfiguration(args(argsBuilder).build)

    /**
     * @param physicalConnectionRequirements Map of physical connection requirements, such as VPC and SecurityGroup. See `physicalConnectionRequirements` below.
     * @return builder
     */
    inline def physicalConnectionRequirements(args: Endofunction[com.pulumi.aws.glue.inputs.ConnectionPhysicalConnectionRequirementsArgs.Builder]):
        com.pulumi.aws.glue.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.ConnectionPhysicalConnectionRequirementsArgs.builder
      builder.physicalConnectionRequirements(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.CrawlerState.Builder)
    /**
     * @param catalogTargets List of nested AWS Glue Data Catalog target arguments. See `catalogTarget` below.
     * @return builder
     */
    inline def catalogTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerCatalogTargetArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerCatalogTargetArgs.builder
      builder.catalogTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param deltaTargets List of nested Delta Lake target arguments. See `deltaTarget` below.
     * @return builder
     */
    inline def deltaTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerDeltaTargetArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerDeltaTargetArgs.builder
      builder.deltaTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param dynamodbTargets List of nested DynamoDB target arguments. See `dynamodbTarget` below.
     * @return builder
     */
    inline def dynamodbTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerDynamodbTargetArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerDynamodbTargetArgs.builder
      builder.dynamodbTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param hudiTargets List of nested Hudi target arguments. See `hudiTarget` below.
     * @return builder
     */
    inline def hudiTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerHudiTargetArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerHudiTargetArgs.builder
      builder.hudiTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param icebergTargets List of nested Iceberg target arguments. See `icebergTarget` below.
     * @return builder
     */
    inline def icebergTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerIcebergTargetArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerIcebergTargetArgs.builder
      builder.icebergTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param jdbcTargets List of nested JDBC target arguments. See `jdbcTarget` below.
     * @return builder
     */
    inline def jdbcTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerJdbcTargetArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerJdbcTargetArgs.builder
      builder.jdbcTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param lakeFormationConfiguration Lake Formation configuration settings for the crawler. See `lakeFormationConfiguration` below.
     * @return builder
     */
    inline def lakeFormationConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerLakeFormationConfigurationArgs.Builder]):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CrawlerLakeFormationConfigurationArgs.builder
      builder.lakeFormationConfiguration(args(argsBuilder).build)

    /**
     * @param lineageConfiguration Data lineage configuration settings for the crawler. See `lineageConfiguration` below.
     * @return builder
     */
    inline def lineageConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerLineageConfigurationArgs.Builder]):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CrawlerLineageConfigurationArgs.builder
      builder.lineageConfiguration(args(argsBuilder).build)

    /**
     * @param mongodbTargets List of nested MongoDB target arguments. See `mongodbTarget` below.
     * @return builder
     */
    inline def mongodbTargets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerMongodbTargetArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerMongodbTargetArgs.builder
      builder.mongodbTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param recrawlPolicy Policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run. See `recrawlPolicy` below.
     * @return builder
     */
    inline def recrawlPolicy(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerRecrawlPolicyArgs.Builder]):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CrawlerRecrawlPolicyArgs.builder
      builder.recrawlPolicy(args(argsBuilder).build)

    /**
     * @param s3Targets List of nested Amazon S3 target arguments. See `s3Target` below.
     * @return builder
     */
    inline def s3Targets(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerS3TargetArgs.Builder]*):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.CrawlerS3TargetArgs.builder
      builder.s3Targets(args.map(_(argsBuilder).build)*)

    /**
     * @param schemaChangePolicy Policy for the crawler&#39;s update and deletion behavior. See `schemaChangePolicy` below.
     * @return builder
     */
    inline def schemaChangePolicy(args: Endofunction[com.pulumi.aws.glue.inputs.CrawlerSchemaChangePolicyArgs.Builder]):
        com.pulumi.aws.glue.inputs.CrawlerState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.CrawlerSchemaChangePolicyArgs.builder
      builder.schemaChangePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs.Builder)
    /**
     * @param connectionPasswordEncryption When connection password protection is enabled, the Data Catalog uses a customer-provided key to encrypt the password as part of CreateConnection or UpdateConnection and store it in the ENCRYPTED_PASSWORD field in the connection properties. You can enable catalog encryption or only password encryption. see `connectionPasswordEncryption` Block.
     * @return builder
     */
    inline def connectionPasswordEncryption(args: Endofunction[com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionArgs.Builder]):
        com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionArgs.builder
      builder.connectionPasswordEncryption(args(argsBuilder).build)

    /**
     * @param encryptionAtRest Encryption-at-rest configuration for the Data Catalog. see `encryptionAtRest` Block.
     * @return builder
     */
    inline def encryptionAtRest(args: Endofunction[com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestArgs.Builder]):
        com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestArgs.builder
      builder.encryptionAtRest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsState.Builder)
    /**
     * @param dataCatalogEncryptionSettings Security configuration to set. see `dataCatalogEncryptionSettings` Block.
     * @return builder
     */
    inline def dataCatalogEncryptionSettings(args: Endofunction[com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs.Builder]):
        com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs.builder
      builder.dataCatalogEncryptionSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.DataQualityRulesetState.Builder)
    /**
     * @param targetTable Configuration block specifying a target table associated with the data quality ruleset. See `targetTable` Block below.
     * @return builder
     */
    inline def targetTable(args: Endofunction[com.pulumi.aws.glue.inputs.DataQualityRulesetTargetTableArgs.Builder]):
        com.pulumi.aws.glue.inputs.DataQualityRulesetState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.DataQualityRulesetTargetTableArgs.builder
      builder.targetTable(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.GetScriptArgs.Builder)
    /**
     * @param dagEdges List of the edges in the DAG. Defined below.
     * @return builder
     */
    inline def dagEdges(args: Endofunction[com.pulumi.aws.glue.inputs.GetScriptDagEdgeArgs.Builder]*):
        com.pulumi.aws.glue.inputs.GetScriptArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.GetScriptDagEdgeArgs.builder
      builder.dagEdges(args.map(_(argsBuilder).build)*)

    /**
     * @param dagNodes List of the nodes in the DAG. Defined below.
     * @return builder
     */
    inline def dagNodes(args: Endofunction[com.pulumi.aws.glue.inputs.GetScriptDagNodeArgs.Builder]*):
        com.pulumi.aws.glue.inputs.GetScriptArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.GetScriptDagNodeArgs.builder
      builder.dagNodes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.glue.inputs.GetScriptDagNode.Builder)
    /**
     * @param args Nested configuration an argument or property of a node. Defined below.
     * @return builder
     */
    inline def args(args: Endofunction[com.pulumi.aws.glue.inputs.GetScriptDagNodeArg.Builder]*):
        com.pulumi.aws.glue.inputs.GetScriptDagNode.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.GetScriptDagNodeArg.builder
      builder.args(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.glue.inputs.GetScriptDagNodeArgs.Builder)
    /**
     * @param args Nested configuration an argument or property of a node. Defined below.
     * @return builder
     */
    inline def args(args: Endofunction[com.pulumi.aws.glue.inputs.GetScriptDagNodeArgArgs.Builder]*):
        com.pulumi.aws.glue.inputs.GetScriptDagNodeArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.GetScriptDagNodeArgArgs.builder
      builder.args(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.glue.inputs.GetScriptPlainArgs.Builder)
    /**
     * @param dagEdges List of the edges in the DAG. Defined below.
     * @return builder
     */
    inline def dagEdges(args: Endofunction[com.pulumi.aws.glue.inputs.GetScriptDagEdge.Builder]*):
        com.pulumi.aws.glue.inputs.GetScriptPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.GetScriptDagEdge.builder
      builder.dagEdges(args.map(_(argsBuilder).build)*)

    /**
     * @param dagNodes List of the nodes in the DAG. Defined below.
     * @return builder
     */
    inline def dagNodes(args: Endofunction[com.pulumi.aws.glue.inputs.GetScriptDagNode.Builder]*):
        com.pulumi.aws.glue.inputs.GetScriptPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.GetScriptDagNode.builder
      builder.dagNodes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.glue.inputs.JobState.Builder)
    /**
     * @param command Command of the job. Defined below.
     * @return builder
     */
    inline def command(args: Endofunction[com.pulumi.aws.glue.inputs.JobCommandArgs.Builder]):
        com.pulumi.aws.glue.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.JobCommandArgs.builder
      builder.command(args(argsBuilder).build)

    /**
     * @param executionProperty Execution property of the job. Defined below.
     * @return builder
     */
    inline def executionProperty(args: Endofunction[com.pulumi.aws.glue.inputs.JobExecutionPropertyArgs.Builder]):
        com.pulumi.aws.glue.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.JobExecutionPropertyArgs.builder
      builder.executionProperty(args(argsBuilder).build)

    /**
     * @param notificationProperty Notification property of the job. Defined below.
     * @return builder
     */
    inline def notificationProperty(args: Endofunction[com.pulumi.aws.glue.inputs.JobNotificationPropertyArgs.Builder]):
        com.pulumi.aws.glue.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.JobNotificationPropertyArgs.builder
      builder.notificationProperty(args(argsBuilder).build)

    /**
     * @param sourceControlDetails Details for a source control configuration for a job, allowing synchronization of job artifacts to or from a remote repository. Defined below.
     * @return builder
     */
    inline def sourceControlDetails(args: Endofunction[com.pulumi.aws.glue.inputs.JobSourceControlDetailsArgs.Builder]):
        com.pulumi.aws.glue.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.JobSourceControlDetailsArgs.builder
      builder.sourceControlDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.MLTransformParametersArgs.Builder)
    /**
     * @param findMatchesParameters Parameters for the find matches algorithm. See `findMatchesParameters`.
     * @return builder
     */
    inline def findMatchesParameters(args: Endofunction[com.pulumi.aws.glue.inputs.MLTransformParametersFindMatchesParametersArgs.Builder]):
        com.pulumi.aws.glue.inputs.MLTransformParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.MLTransformParametersFindMatchesParametersArgs.builder
      builder.findMatchesParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.MLTransformState.Builder)
    /**
     * @param inputRecordTables List of AWS Glue table definitions used by the transform. See `inputRecordTables`.
     * @return builder
     */
    inline def inputRecordTables(args: Endofunction[com.pulumi.aws.glue.inputs.MLTransformInputRecordTableArgs.Builder]*):
        com.pulumi.aws.glue.inputs.MLTransformState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.MLTransformInputRecordTableArgs.builder
      builder.inputRecordTables(args.map(_(argsBuilder).build)*)

    /**
     * @param parameters Algorithmic parameters that are specific to the transform type used. Conditionally dependent on the transform type. See `parameters`.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.glue.inputs.MLTransformParametersArgs.Builder]):
        com.pulumi.aws.glue.inputs.MLTransformState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.MLTransformParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

    /**
     * @param schemas Object that represents the schema that this transform accepts. See `schema`.
     * @return builder
     */
    inline def schemas(args: Endofunction[com.pulumi.aws.glue.inputs.MLTransformSchemaArgs.Builder]*):
        com.pulumi.aws.glue.inputs.MLTransformState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.MLTransformSchemaArgs.builder
      builder.schemas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.glue.inputs.PartitionIndexState.Builder)
    /**
     * @param partitionIndex Configuration block for a partition index. See `partitionIndex` Block below.
     * @return builder
     */
    inline def partitionIndex(args: Endofunction[com.pulumi.aws.glue.inputs.PartitionIndexPartitionIndexArgs.Builder]):
        com.pulumi.aws.glue.inputs.PartitionIndexState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.PartitionIndexPartitionIndexArgs.builder
      builder.partitionIndex(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.PartitionState.Builder)
    /**
     * @param storageDescriptor Storage descriptor object containing information about the physical storage of this table. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor) for a full explanation of this object.
     * @return builder
     */
    inline def storageDescriptor(args: Endofunction[com.pulumi.aws.glue.inputs.PartitionStorageDescriptorArgs.Builder]):
        com.pulumi.aws.glue.inputs.PartitionState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.PartitionStorageDescriptorArgs.builder
      builder.storageDescriptor(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.PartitionStorageDescriptorArgs.Builder)
    /**
     * @param columns List of the `columns` in the table.
     * @return builder
     */
    inline def columns(args: Endofunction[com.pulumi.aws.glue.inputs.PartitionStorageDescriptorColumnArgs.Builder]*):
        com.pulumi.aws.glue.inputs.PartitionStorageDescriptorArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.PartitionStorageDescriptorColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

    /**
     * @param serDeInfo Serialization/deserialization (SerDe) information.
     * @return builder
     */
    inline def serDeInfo(args: Endofunction[com.pulumi.aws.glue.inputs.PartitionStorageDescriptorSerDeInfoArgs.Builder]):
        com.pulumi.aws.glue.inputs.PartitionStorageDescriptorArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.PartitionStorageDescriptorSerDeInfoArgs.builder
      builder.serDeInfo(args(argsBuilder).build)

    /**
     * @param skewedInfo Information about values that appear very frequently in a column (skewed values).
     * @return builder
     */
    inline def skewedInfo(args: Endofunction[com.pulumi.aws.glue.inputs.PartitionStorageDescriptorSkewedInfoArgs.Builder]):
        com.pulumi.aws.glue.inputs.PartitionStorageDescriptorArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.PartitionStorageDescriptorSkewedInfoArgs.builder
      builder.skewedInfo(args(argsBuilder).build)

    /**
     * @param sortColumns List of `sortColumns` objects specifying the sort order of each bucket in the table.
     * @return builder
     */
    inline def sortColumns(args: Endofunction[com.pulumi.aws.glue.inputs.PartitionStorageDescriptorSortColumnArgs.Builder]*):
        com.pulumi.aws.glue.inputs.PartitionStorageDescriptorArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.PartitionStorageDescriptorSortColumnArgs.builder
      builder.sortColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationArgs.Builder)
    /**
     * @param cloudwatchEncryption `cloudwatchEncryption` block as described below, which contains encryption configuration for CloudWatch.
     * @return builder
     */
    inline def cloudwatchEncryption(args: Endofunction[com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionArgs.Builder]):
        com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionArgs.builder
      builder.cloudwatchEncryption(args(argsBuilder).build)

    /**
     * @param jobBookmarksEncryption `jobBookmarksEncryption` block as described below, which contains encryption configuration for job bookmarks.
     * @return builder
     */
    inline def jobBookmarksEncryption(args: Endofunction[com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionArgs.Builder]):
        com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionArgs.builder
      builder.jobBookmarksEncryption(args(argsBuilder).build)

    /**
     * @param s3Encryption `s3Encryption` block as described below, which contains encryption configuration for S3 data.
     * @return builder
     */
    inline def s3Encryption(args: Endofunction[com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationS3EncryptionArgs.Builder]):
        com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationS3EncryptionArgs.builder
      builder.s3Encryption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.SecurityConfigurationState.Builder)
    /**
     * @param encryptionConfiguration Configuration block containing encryption configuration. Detailed below.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.glue.inputs.SecurityConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.TriggerActionArgs.Builder)
    /**
     * @param notificationProperty Configuration properties of a job run notification. See `notificationProperty` details below.
     * @return builder
     */
    inline def notificationProperty(args: Endofunction[com.pulumi.aws.glue.inputs.TriggerActionNotificationPropertyArgs.Builder]):
        com.pulumi.aws.glue.inputs.TriggerActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.TriggerActionNotificationPropertyArgs.builder
      builder.notificationProperty(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.TriggerPredicateArgs.Builder)
    /**
     * @param conditions List of the conditions that determine when the trigger will fire. See `conditions`.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.aws.glue.inputs.TriggerPredicateConditionArgs.Builder]*):
        com.pulumi.aws.glue.inputs.TriggerPredicateArgs.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.TriggerPredicateConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.glue.inputs.TriggerState.Builder)
    /**
     * @param actions List of actions initiated by this trigger when it fires. See `actions` below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.aws.glue.inputs.TriggerActionArgs.Builder]*):
        com.pulumi.aws.glue.inputs.TriggerState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.TriggerActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param eventBatchingConditions Batch condition that must be met (specified number of events received or batch time window expired) before EventBridge event trigger fires. See `eventBatchingCondition`.
     * @return builder
     */
    inline def eventBatchingConditions(args: Endofunction[com.pulumi.aws.glue.inputs.TriggerEventBatchingConditionArgs.Builder]*):
        com.pulumi.aws.glue.inputs.TriggerState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.TriggerEventBatchingConditionArgs.builder
      builder.eventBatchingConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param predicate Predicate to specify when the new trigger should fire. Required when trigger type is `CONDITIONAL`. See `predicate` below.
     * @return builder
     */
    inline def predicate(args: Endofunction[com.pulumi.aws.glue.inputs.TriggerPredicateArgs.Builder]):
        com.pulumi.aws.glue.inputs.TriggerState.Builder =
      val argsBuilder = com.pulumi.aws.glue.inputs.TriggerPredicateArgs.builder
      builder.predicate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.glue.inputs.UserDefinedFunctionState.Builder)
    /**
     * @param resourceUris Configuration block for Resource URIs. See `resourceUris` Block below for more details.
     * @return builder
     */
    inline def resourceUris(args: Endofunction[com.pulumi.aws.glue.inputs.UserDefinedFunctionResourceUriArgs.Builder]*):
        com.pulumi.aws.glue.inputs.UserDefinedFunctionState.Builder =
      def argsBuilder = com.pulumi.aws.glue.inputs.UserDefinedFunctionResourceUriArgs.builder
      builder.resourceUris(args.map(_(argsBuilder).build)*)
