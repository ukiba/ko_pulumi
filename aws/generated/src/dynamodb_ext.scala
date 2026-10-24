package jp.ukiba.ko_pulumi
package aws

object dynamodb_ext:
  extension (builder: com.pulumi.aws.dynamodb.GlobalSecondaryIndexArgs.Builder)
    /**
     * @param keySchemas Set of nested attribute definitions.
     * At least 1 element defining a `HASH` is required.
     * All elements with the `keyType` of `HASH` must precede elements with `keyType` of `RANGE`.
     * Changing any values in `keySchema` will re-create the resource.
     * See `keySchema` below.
     * @return builder
     */
    def keySchemas(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexKeySchemaArgs.Builder]*):
        com.pulumi.aws.dynamodb.GlobalSecondaryIndexArgs.Builder =
      def argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexKeySchemaArgs.builder
      builder.keySchemas(args.map(_(argsBuilder).build)*)

    /**
     * @param onDemandThroughput Sets the maximum number of read and write units for the index.
     * See `onDemandThroughput` below.
     * Only valid if the table&#39;s `billingMode` is `PAY_PER_REQUEST`.
     * @return builder
     */
    def onDemandThroughput(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexOnDemandThroughputArgs.Builder]):
        com.pulumi.aws.dynamodb.GlobalSecondaryIndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexOnDemandThroughputArgs.builder
      builder.onDemandThroughput(args(argsBuilder).build)

    /**
     * @param projection Describes which attributes from the table are represented in the index.
     * See `projection` below.
     * @return builder
     */
    def projection(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexProjectionArgs.Builder]):
        com.pulumi.aws.dynamodb.GlobalSecondaryIndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexProjectionArgs.builder
      builder.projection(args(argsBuilder).build)

    /**
     * @param provisionedThroughput Provisioned throughput for the index.
     * See `provisionedThroughput` below.
     * Required if the table&#39;s `billingMode` is `PROVISIONED`.
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
     * See `warmThroughput` below.
     * @return builder
     */
    def warmThroughput(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexWarmThroughputArgs.Builder]):
        com.pulumi.aws.dynamodb.GlobalSecondaryIndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexWarmThroughputArgs.builder
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

  extension (builder: com.pulumi.aws.dynamodb.TableExportArgs.Builder)
    def incrementalExportSpecification(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableExportIncrementalExportSpecificationArgs.Builder]):
        com.pulumi.aws.dynamodb.TableExportArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableExportIncrementalExportSpecificationArgs.builder
      builder.incrementalExportSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dynamodb.inputs.GetTableArgs.Builder)
    def serverSideEncryption(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GetTableServerSideEncryptionArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.GetTableArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GetTableServerSideEncryptionArgs.builder
      builder.serverSideEncryption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dynamodb.inputs.GetTablePlainArgs.Builder)
    def serverSideEncryption(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GetTableServerSideEncryption.Builder]):
        com.pulumi.aws.dynamodb.inputs.GetTablePlainArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GetTableServerSideEncryption.builder
      builder.serverSideEncryption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexState.Builder)
    /**
     * @param keySchemas Set of nested attribute definitions.
     * At least 1 element defining a `HASH` is required.
     * All elements with the `keyType` of `HASH` must precede elements with `keyType` of `RANGE`.
     * Changing any values in `keySchema` will re-create the resource.
     * See `keySchema` below.
     * @return builder
     */
    def keySchemas(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexKeySchemaArgs.Builder]*):
        com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexState.Builder =
      def argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexKeySchemaArgs.builder
      builder.keySchemas(args.map(_(argsBuilder).build)*)

    /**
     * @param onDemandThroughput Sets the maximum number of read and write units for the index.
     * See `onDemandThroughput` below.
     * Only valid if the table&#39;s `billingMode` is `PAY_PER_REQUEST`.
     * @return builder
     */
    def onDemandThroughput(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexOnDemandThroughputArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexState.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexOnDemandThroughputArgs.builder
      builder.onDemandThroughput(args(argsBuilder).build)

    /**
     * @param projection Describes which attributes from the table are represented in the index.
     * See `projection` below.
     * @return builder
     */
    def projection(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexProjectionArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexState.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexProjectionArgs.builder
      builder.projection(args(argsBuilder).build)

    /**
     * @param provisionedThroughput Provisioned throughput for the index.
     * See `provisionedThroughput` below.
     * Required if the table&#39;s `billingMode` is `PROVISIONED`.
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
     * See `warmThroughput` below.
     * @return builder
     */
    def warmThroughput(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexWarmThroughputArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexState.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GlobalSecondaryIndexWarmThroughputArgs.builder
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

  extension (builder: com.pulumi.aws.dynamodb.inputs.TableExportState.Builder)
    def incrementalExportSpecification(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableExportIncrementalExportSpecificationArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.TableExportState.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableExportIncrementalExportSpecificationArgs.builder
      builder.incrementalExportSpecification(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.dynamodb.inputs.TableImportTableArgs.Builder)
    /**
     * @param inputFormatOptions Describe the format options for the data that was imported into the target table.
     * There is one value, `csv`.
     * See below.
     * @return builder
     */
    def inputFormatOptions(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableImportTableInputFormatOptionsArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.TableImportTableArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableImportTableInputFormatOptionsArgs.builder
      builder.inputFormatOptions(args(argsBuilder).build)

    /**
     * @param s3BucketSource Values for the S3 bucket the source file is imported from.
     * See below.
     * @return builder
     */
    def s3BucketSource(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableImportTableS3BucketSourceArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.TableImportTableArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableImportTableS3BucketSourceArgs.builder
      builder.s3BucketSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dynamodb.inputs.TableImportTableInputFormatOptionsArgs.Builder)
    /**
     * @param csv This block contains the processing options for the CSV file being imported:
     * @return builder
     */
    def csv(args: Endofunction[com.pulumi.aws.dynamodb.inputs.TableImportTableInputFormatOptionsCsvArgs.Builder]):
        com.pulumi.aws.dynamodb.inputs.TableImportTableInputFormatOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.TableImportTableInputFormatOptionsCsvArgs.builder
      builder.csv(args(argsBuilder).build)

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
