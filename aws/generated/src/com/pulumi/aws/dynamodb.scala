package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object dynamodb:
  /**
   * Resource for managing an AWS DynamoDB Table Export. Terraform will wait until the Table export reaches a status of `COMPLETED` or `FAILED`.
   *  
   *  See the [AWS Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/S3DataExport.HowItWorks.html) for more information on how this process works.
   *  
   *  &gt; **TIP:** Point-in-time Recovery must be enabled on the target DynamoDB Table.
   *  
   *  &gt; **NOTE:** Once a AWS DynamoDB Table Export has been created it is immutable. The AWS API does not delete this resource. When you run destroy the provider will remove the resource from the Terraform state, no exported data will be deleted.
   */
  def TableExport(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dynamodb.TableExportArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.dynamodb.TableExportArgs.builder
    
    com.pulumi.aws.dynamodb.TableExport(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.dynamodb.TableArgs.Builder)
    /**
     * @param attributes Set of nested attribute definitions. Only required for `hashKey` and `rangeKey` attributes. See below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableAttributeArgs.Builder]*):
        com.pulumi.aws.dynamodb.TableArgs.Builder =
      def argsBuilder = com.pulumi.aws.dynamodb.inputs.TableAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

    /**
     * @param globalSecondaryIndexes Describe a GSI for the table; subject to the normal limits on the number of GSIs, projected attributes, etc. See below.
     * @return builder
     */
    def globalSecondaryIndexes(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableGlobalSecondaryIndexArgs.Builder]*):
        com.pulumi.aws.dynamodb.TableArgs.Builder =
      def argsBuilder = com.pulumi.aws.dynamodb.inputs.TableGlobalSecondaryIndexArgs.builder
      builder.globalSecondaryIndexes(args.map(_(argsBuilder).build)*)

    /**
     * @param globalTableWitness Witness Region in a Multi-Region Strong Consistency deployment. **Note** This must be used alongside a single `replica` with `consistencyMode` set to `STRONG`. Other combinations will fail to provision. See below.
     * @return builder
     */
    def globalTableWitness(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableGlobalTableWitnessArgs.Builder]):
        com.pulumi.aws.dynamodb.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableGlobalTableWitnessArgs.builder
      builder.globalTableWitness(args(argsBuilder).build)

    /**
     * @param importTable Import Amazon S3 data into a new table. See below.
     * @return builder
     */
    def importTable(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableImportTableArgs.Builder]):
        com.pulumi.aws.dynamodb.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableImportTableArgs.builder
      builder.importTable(args(argsBuilder).build)

    /**
     * @param localSecondaryIndexes Describe an LSI on the table; these can only be allocated _at creation_ so you cannot change this definition after you have created the resource. See below.
     * @return builder
     */
    def localSecondaryIndexes(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableLocalSecondaryIndexArgs.Builder]*):
        com.pulumi.aws.dynamodb.TableArgs.Builder =
      def argsBuilder = com.pulumi.aws.dynamodb.inputs.TableLocalSecondaryIndexArgs.builder
      builder.localSecondaryIndexes(args.map(_(argsBuilder).build)*)

    /**
     * @param onDemandThroughput Sets the maximum number of read and write units for the specified on-demand table. See below.
     * @return builder
     */
    def onDemandThroughput(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableOnDemandThroughputArgs.Builder]):
        com.pulumi.aws.dynamodb.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableOnDemandThroughputArgs.builder
      builder.onDemandThroughput(args(argsBuilder).build)

    /**
     * @param pointInTimeRecovery Enable point-in-time recovery options. See below.
     * @return builder
     */
    def pointInTimeRecovery(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TablePointInTimeRecoveryArgs.Builder]):
        com.pulumi.aws.dynamodb.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TablePointInTimeRecoveryArgs.builder
      builder.pointInTimeRecovery(args(argsBuilder).build)

    /**
     * @param replicas Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. See below.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableReplicaArgs.Builder]*):
        com.pulumi.aws.dynamodb.TableArgs.Builder =
      def argsBuilder = com.pulumi.aws.dynamodb.inputs.TableReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

    /**
     * @param serverSideEncryption Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS-owned Customer Master Key if this argument isn&#39;t specified. Must be supplied for cross-region restores. See below.
     * @return builder
     */
    def serverSideEncryption(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableServerSideEncryptionArgs.Builder]):
        com.pulumi.aws.dynamodb.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableServerSideEncryptionArgs.builder
      builder.serverSideEncryption(args(argsBuilder).build)

    /**
     * @param ttl Configuration block for TTL. See below.
     * @return builder
     */
    def ttl(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableTtlArgs.Builder]):
        com.pulumi.aws.dynamodb.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableTtlArgs.builder
      builder.ttl(args(argsBuilder).build)

    /**
     * @param warmThroughput Sets the number of warm read and write units for the specified table. See below.
     * @return builder
     */
    def warmThroughput(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableWarmThroughputArgs.Builder]):
        com.pulumi.aws.dynamodb.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableWarmThroughputArgs.builder
      builder.warmThroughput(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dynamodb.GlobalTableArgs.Builder)
    /**
     * @param replicas Underlying DynamoDB Table. At least 1 replica must be defined. See below.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalTableReplicaArgs.Builder]*):
        com.pulumi.aws.dynamodb.GlobalTableArgs.Builder =
      def argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalTableReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  /**
   * Provides a DynamoDB table item resource
   *  
   *  &gt; **Note:** This resource is not meant to be used for managing large amounts of data in your table, it is not designed to scale.
   *    You should perform **regular backups** of all data in the table, see [AWS docs for more](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/BackupRestore.html).
   */
  def TableItem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dynamodb.TableItemArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.dynamodb.TableItemArgs.builder
    
    com.pulumi.aws.dynamodb.TableItem(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Enables a [Kinesis streaming destination](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/kds.html) for data replication of a DynamoDB table. */
  def KinesisStreamingDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dynamodb.KinesisStreamingDestinationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.dynamodb.KinesisStreamingDestinationArgs.builder
    
    com.pulumi.aws.dynamodb.KinesisStreamingDestination(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an individual DynamoDB resource tag. This resource should only be used in cases where DynamoDB resources are created outside the provider (e.g., Table replicas in other regions).
   *  
   *  &gt; **NOTE:** This tagging resource should not be combined with the resource for managing the parent resource. For example, using `aws.dynamodb.Table` and `aws.dynamodb.Tag` to manage tags of the same DynamoDB Table in the same region will cause a perpetual difference where the `awsDynamodbCluster` resource will try to remove the tag being added by the `aws.dynamodb.Tag` resource.
   *  
   *  &gt; **NOTE:** This tagging resource does not use the provider `ignoreTags` configuration.
   */
  def Tag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dynamodb.TagArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.dynamodb.TagArgs.builder
    
    com.pulumi.aws.dynamodb.Tag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.dynamodb.GlobalSecondaryIndexArgs.Builder)
    /**
     * @param keySchemas Set of nested attribute definitions.
     *  At least 1 element defining a `HASH` is required.
     *  All elements with the `keyType` of `HASH` must precede elements with `keyType` of `RANGE`.
     *  Changing any values in `keySchema` will re-create the resource.
     *  See `keySchema` below.
     * @return builder
     */
    def keySchemas(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexKeySchemaArgs.Builder]*):
        com.pulumi.aws.dynamodb.GlobalSecondaryIndexArgs.Builder =
      def argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexKeySchemaArgs.builder
      builder.keySchemas(args.map(_(argsBuilder).build)*)

    /**
     * @param onDemandThroughput Sets the maximum number of read and write units for the index.
     *  See `onDemandThroughput` below.
     *  Only valid if the table&#39;s `billingMode` is `PAY_PER_REQUEST`.
     * @return builder
     */
    def onDemandThroughput(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexOnDemandThroughputArgs.Builder]):
        com.pulumi.aws.dynamodb.GlobalSecondaryIndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexOnDemandThroughputArgs.builder
      builder.onDemandThroughput(args(argsBuilder).build)

    /**
     * @param projection Describes which attributes from the table are represented in the index.
     *  See `projection` below.
     * @return builder
     */
    def projection(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexProjectionArgs.Builder]):
        com.pulumi.aws.dynamodb.GlobalSecondaryIndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexProjectionArgs.builder
      builder.projection(args(argsBuilder).build)

    /**
     * @param provisionedThroughput Provisioned throughput for the index.
     *  See `provisionedThroughput` below.
     *  Required if the table&#39;s `billingMode` is `PROVISIONED`.
     * @return builder
     */
    def provisionedThroughput(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexProvisionedThroughputArgs.Builder]):
        com.pulumi.aws.dynamodb.GlobalSecondaryIndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexProvisionedThroughputArgs.builder
      builder.provisionedThroughput(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexTimeoutsArgs.Builder]):
        com.pulumi.aws.dynamodb.GlobalSecondaryIndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param warmThroughput Sets the number of warm read and write units for this index.
     *  See `warmThroughput` below.
     * @return builder
     */
    def warmThroughput(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexWarmThroughputArgs.Builder]):
        com.pulumi.aws.dynamodb.GlobalSecondaryIndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexWarmThroughputArgs.builder
      builder.warmThroughput(args(argsBuilder).build)

  /**
   * Provides a DynamoDB table resource.
   *  
   *  &gt; **Note:** It is recommended to use [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) for `readCapacity` and/or `writeCapacity` if there&#39;s `autoscaling policy` attached to the table.
   *  
   *  &gt; **Note:** When using aws.dynamodb.TableReplica with this resource, use `lifecycle` `ignoreChanges` for `replica`, _e.g._, `lifecycle { ignoreChanges = [replica] }`.
   *  
   *  &gt; **Note:** If autoscaling creates drift for your `globalSecondaryIndex` blocks and/or more granular `lifecycle` management for GSIs, we recommend using the new **experimental** resource `aws.dynamodb.GlobalSecondaryIndex`.
   *  
   *  ## DynamoDB Table attributes
   *  
   *  Only define attributes on the table object that are going to be used as:
   *  
   *  * Table hash key or range key
   *  * LSI or GSI hash key or range key
   *  
   *  The DynamoDB API expects attribute structure (name and type) to be passed along when creating or updating GSI/LSIs or creating the initial table. In these cases it expects the Hash / Range keys to be provided. Because these get re-used in numerous places (i.e the table&#39;s range key could be a part of one or more GSIs), they are stored on the table object to prevent duplication and increase consistency. If you add attributes here that are not used in these scenarios it can cause an infinite loop in planning.
   *  
   *  &gt; **Note:** When using the `aws.dynamodb.GlobalSecondaryIndex` resource, you do not need to define the attributes for externally managed GSIs in the `aws.dynamodb.Table` resource.
   */
  def Table(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dynamodb.TableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dynamodb.TableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.dynamodb.Table(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS DynamoDB Resource Policy. */
  def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dynamodb.ResourcePolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.dynamodb.ResourcePolicyArgs.builder
    
    com.pulumi.aws.dynamodb.ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * !&gt; The resource type `aws.dynamodb.GlobalSecondaryIndex` is an experimental feature. The schema or behavior may change without notice, and it is not subject to the backwards compatibility guarantee of the provider.
   *  
   *  &gt; The resource type `aws.dynamodb.GlobalSecondaryIndex` can be enabled by setting the environment variable `TF_AWS_EXPERIMENT_dynamodb_global_secondary_index` to any value. If not enabled, use of `aws.dynamodb.GlobalSecondaryIndex` will result in an error when running Terraform.
   *  
   *  &gt; Please provide feedback, positive or negative, at https://github.com/hashicorp/terraform-provider-aws/issues/45640. User feedback will determine if this experiment is a success.
   *  
   *  !&gt; **WARNING:** Do not combine `aws.dynamodb.GlobalSecondaryIndex` resources in conjunction with `globalSecondaryIndex` on `aws.dynamodb.Table`. Doing so may cause conflicts, perpertual differences, and Global Secondary Indexes being overwritten.
   */
  def GlobalSecondaryIndex(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dynamodb.GlobalSecondaryIndexArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.dynamodb.GlobalSecondaryIndexArgs.builder
    
    com.pulumi.aws.dynamodb.GlobalSecondaryIndex(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type DynamodbFunctions = com.pulumi.aws.dynamodb.DynamodbFunctions
  object DynamodbFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.dynamodb.DynamodbFunctions.*
  extension (self: DynamodbFunctions.type)
    /** Provides information about a DynamoDB table. */
    def getTable(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GetTableArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.dynamodb.outputs.GetTableResult] =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GetTableArgs.builder
      com.pulumi.aws.dynamodb.DynamodbFunctions.getTable(args(argsBuilder).build)

    /** Provides information about a DynamoDB table. */
    def getTablePlain(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GetTablePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.dynamodb.outputs.GetTableResult] =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GetTablePlainArgs.builder
      com.pulumi.aws.dynamodb.DynamodbFunctions.getTablePlain(args(argsBuilder).build)

    /** Data source for retrieving a value from an AWS DynamoDB table. */
    def getTableItem(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GetTableItemArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.dynamodb.outputs.GetTableItemResult] =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GetTableItemArgs.builder
      com.pulumi.aws.dynamodb.DynamodbFunctions.getTableItem(args(argsBuilder).build)

    /** Data source for retrieving a value from an AWS DynamoDB table. */
    def getTableItemPlain(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GetTableItemPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.dynamodb.outputs.GetTableItemResult] =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GetTableItemPlainArgs.builder
      com.pulumi.aws.dynamodb.DynamodbFunctions.getTableItemPlain(args(argsBuilder).build)

    /** Returns a list of all AWS DynamoDB table names in a region. */
    def getTables(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GetTablesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.dynamodb.outputs.GetTablesResult] =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GetTablesArgs.builder
      com.pulumi.aws.dynamodb.DynamodbFunctions.getTables(args(argsBuilder).build)

    /** Returns a list of all AWS DynamoDB table names in a region. */
    def getTablesPlain(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GetTablesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.dynamodb.outputs.GetTablesResult] =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GetTablesPlainArgs.builder
      com.pulumi.aws.dynamodb.DynamodbFunctions.getTablesPlain(args(argsBuilder).build)

  /**
   * Manages [DynamoDB Global Tables V1 (version 2017.11.29)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V1.html). These are layered on top of existing DynamoDB Tables.
   *  
   *  &gt; **NOTE:** To instead manage [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html), use the `aws.dynamodb.Table` resource `replica` configuration block.
   *  
   *  &gt; Note: There are many restrictions before you can properly create DynamoDB Global Tables in multiple regions. See the [AWS DynamoDB Global Table Requirements](http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables_reqs_bestpractices.html) for more information.
   */
  def GlobalTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dynamodb.GlobalTableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dynamodb.GlobalTableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.dynamodb.GlobalTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.dynamodb.TableExportArgs.Builder)
    def incrementalExportSpecification(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableExportIncrementalExportSpecificationArgs.Builder]):
        com.pulumi.aws.dynamodb.TableExportArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableExportIncrementalExportSpecificationArgs.builder
      builder.incrementalExportSpecification(args(argsBuilder).build)

  /** Provides a DynamoDB contributor insights resource */
  def ContributorInsights(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dynamodb.ContributorInsightsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.dynamodb.ContributorInsightsArgs.builder
    
    com.pulumi.aws.dynamodb.ContributorInsights(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a DynamoDB table replica resource for [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html).
   *  
   *  &gt; **Note:** Use `lifecycle` `ignoreChanges` for `replica` in the associated aws.dynamodb.Table configuration.
   *  
   *  &gt; **Note:** Do not use the `replica` configuration block of aws.dynamodb.Table together with this resource as the two configuration options are mutually exclusive.
   */
  def TableReplica(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dynamodb.TableReplicaArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dynamodb.TableReplicaArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.dynamodb.TableReplica(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.dynamodb.inputs.GetTableArgs.Builder)
    def serverSideEncryption(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GetTableServerSideEncryptionArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.GetTableArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GetTableServerSideEncryptionArgs.builder
      builder.serverSideEncryption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dynamodb.inputs.TableImportTableInputFormatOptionsArgs.Builder)
    /**
     * @param csv This block contains the processing options for the CSV file being imported:
     * @return builder
     */
    def csv(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableImportTableInputFormatOptionsCsvArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.TableImportTableInputFormatOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableImportTableInputFormatOptionsCsvArgs.builder
      builder.csv(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexState.Builder)
    /**
     * @param keySchemas Set of nested attribute definitions.
     *  At least 1 element defining a `HASH` is required.
     *  All elements with the `keyType` of `HASH` must precede elements with `keyType` of `RANGE`.
     *  Changing any values in `keySchema` will re-create the resource.
     *  See `keySchema` below.
     * @return builder
     */
    def keySchemas(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexKeySchemaArgs.Builder]*):
        com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexState.Builder =
      def argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexKeySchemaArgs.builder
      builder.keySchemas(args.map(_(argsBuilder).build)*)

    /**
     * @param onDemandThroughput Sets the maximum number of read and write units for the index.
     *  See `onDemandThroughput` below.
     *  Only valid if the table&#39;s `billingMode` is `PAY_PER_REQUEST`.
     * @return builder
     */
    def onDemandThroughput(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexOnDemandThroughputArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexState.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexOnDemandThroughputArgs.builder
      builder.onDemandThroughput(args(argsBuilder).build)

    /**
     * @param projection Describes which attributes from the table are represented in the index.
     *  See `projection` below.
     * @return builder
     */
    def projection(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexProjectionArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexState.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexProjectionArgs.builder
      builder.projection(args(argsBuilder).build)

    /**
     * @param provisionedThroughput Provisioned throughput for the index.
     *  See `provisionedThroughput` below.
     *  Required if the table&#39;s `billingMode` is `PROVISIONED`.
     * @return builder
     */
    def provisionedThroughput(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexProvisionedThroughputArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexState.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexProvisionedThroughputArgs.builder
      builder.provisionedThroughput(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexTimeoutsArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexState.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param warmThroughput Sets the number of warm read and write units for this index.
     *  See `warmThroughput` below.
     * @return builder
     */
    def warmThroughput(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexWarmThroughputArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexState.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexWarmThroughputArgs.builder
      builder.warmThroughput(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dynamodb.inputs.TableState.Builder)
    /**
     * @param attributes Set of nested attribute definitions. Only required for `hashKey` and `rangeKey` attributes. See below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableAttributeArgs.Builder]*):
        com.pulumi.aws.dynamodb.inputs.TableState.Builder =
      def argsBuilder = com.pulumi.aws.dynamodb.inputs.TableAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

    /**
     * @param globalSecondaryIndexes Describe a GSI for the table; subject to the normal limits on the number of GSIs, projected attributes, etc. See below.
     * @return builder
     */
    def globalSecondaryIndexes(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableGlobalSecondaryIndexArgs.Builder]*):
        com.pulumi.aws.dynamodb.inputs.TableState.Builder =
      def argsBuilder = com.pulumi.aws.dynamodb.inputs.TableGlobalSecondaryIndexArgs.builder
      builder.globalSecondaryIndexes(args.map(_(argsBuilder).build)*)

    /**
     * @param globalTableWitness Witness Region in a Multi-Region Strong Consistency deployment. **Note** This must be used alongside a single `replica` with `consistencyMode` set to `STRONG`. Other combinations will fail to provision. See below.
     * @return builder
     */
    def globalTableWitness(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableGlobalTableWitnessArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableGlobalTableWitnessArgs.builder
      builder.globalTableWitness(args(argsBuilder).build)

    /**
     * @param importTable Import Amazon S3 data into a new table. See below.
     * @return builder
     */
    def importTable(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableImportTableArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableImportTableArgs.builder
      builder.importTable(args(argsBuilder).build)

    /**
     * @param localSecondaryIndexes Describe an LSI on the table; these can only be allocated _at creation_ so you cannot change this definition after you have created the resource. See below.
     * @return builder
     */
    def localSecondaryIndexes(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableLocalSecondaryIndexArgs.Builder]*):
        com.pulumi.aws.dynamodb.inputs.TableState.Builder =
      def argsBuilder = com.pulumi.aws.dynamodb.inputs.TableLocalSecondaryIndexArgs.builder
      builder.localSecondaryIndexes(args.map(_(argsBuilder).build)*)

    /**
     * @param onDemandThroughput Sets the maximum number of read and write units for the specified on-demand table. See below.
     * @return builder
     */
    def onDemandThroughput(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableOnDemandThroughputArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableOnDemandThroughputArgs.builder
      builder.onDemandThroughput(args(argsBuilder).build)

    /**
     * @param pointInTimeRecovery Enable point-in-time recovery options. See below.
     * @return builder
     */
    def pointInTimeRecovery(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TablePointInTimeRecoveryArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TablePointInTimeRecoveryArgs.builder
      builder.pointInTimeRecovery(args(argsBuilder).build)

    /**
     * @param replicas Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. See below.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableReplicaArgs.Builder]*):
        com.pulumi.aws.dynamodb.inputs.TableState.Builder =
      def argsBuilder = com.pulumi.aws.dynamodb.inputs.TableReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

    /**
     * @param serverSideEncryption Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS-owned Customer Master Key if this argument isn&#39;t specified. Must be supplied for cross-region restores. See below.
     * @return builder
     */
    def serverSideEncryption(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableServerSideEncryptionArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableServerSideEncryptionArgs.builder
      builder.serverSideEncryption(args(argsBuilder).build)

    /**
     * @param ttl Configuration block for TTL. See below.
     * @return builder
     */
    def ttl(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableTtlArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableTtlArgs.builder
      builder.ttl(args(argsBuilder).build)

    /**
     * @param warmThroughput Sets the number of warm read and write units for the specified table. See below.
     * @return builder
     */
    def warmThroughput(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableWarmThroughputArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableWarmThroughputArgs.builder
      builder.warmThroughput(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dynamodb.inputs.TableGlobalSecondaryIndexArgs.Builder)
    /**
     * @param keySchemas Configuration block(s) for the key schema. Mutually exclusive with `hashKey` and `rangeKey`. Required if `hashKey` is not specified. Supports multi-attribute keys for the [Multi-Attribute Keys design pattern](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.DesignPattern.MultiAttributeKeys.html). See below.
     * @return builder
     */
    def keySchemas(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableGlobalSecondaryIndexKeySchemaArgs.Builder]*):
        com.pulumi.aws.dynamodb.inputs.TableGlobalSecondaryIndexArgs.Builder =
      def argsBuilder = com.pulumi.aws.dynamodb.inputs.TableGlobalSecondaryIndexKeySchemaArgs.builder
      builder.keySchemas(args.map(_(argsBuilder).build)*)

    /**
     * @param onDemandThroughput Sets the maximum number of read and write units for the specified on-demand index. See below.
     * @return builder
     */
    def onDemandThroughput(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableGlobalSecondaryIndexOnDemandThroughputArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.TableGlobalSecondaryIndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableGlobalSecondaryIndexOnDemandThroughputArgs.builder
      builder.onDemandThroughput(args(argsBuilder).build)

    /**
     * @param warmThroughput Sets the number of warm read and write units for this index. See below.
     * @return builder
     */
    def warmThroughput(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableGlobalSecondaryIndexWarmThroughputArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.TableGlobalSecondaryIndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableGlobalSecondaryIndexWarmThroughputArgs.builder
      builder.warmThroughput(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dynamodb.inputs.GlobalTableState.Builder)
    /**
     * @param replicas Underlying DynamoDB Table. At least 1 replica must be defined. See below.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalTableReplicaArgs.Builder]*):
        com.pulumi.aws.dynamodb.inputs.GlobalTableState.Builder =
      def argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalTableReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.dynamodb.inputs.TableImportTableArgs.Builder)
    /**
     * @param inputFormatOptions Describe the format options for the data that was imported into the target table.
     *  There is one value, `csv`.
     *  See below.
     * @return builder
     */
    def inputFormatOptions(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableImportTableInputFormatOptionsArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.TableImportTableArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableImportTableInputFormatOptionsArgs.builder
      builder.inputFormatOptions(args(argsBuilder).build)

    /**
     * @param s3BucketSource Values for the S3 bucket the source file is imported from.
     *  See below.
     * @return builder
     */
    def s3BucketSource(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableImportTableS3BucketSourceArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.TableImportTableArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableImportTableS3BucketSourceArgs.builder
      builder.s3BucketSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dynamodb.inputs.TableExportState.Builder)
    def incrementalExportSpecification(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableExportIncrementalExportSpecificationArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.TableExportState.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableExportIncrementalExportSpecificationArgs.builder
      builder.incrementalExportSpecification(args(argsBuilder).build)
