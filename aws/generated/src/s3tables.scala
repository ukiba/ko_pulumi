package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object s3tables:
  extension (builder: com.pulumi.aws.s3tables.TableArgs.Builder)
    /**
     * @param encryptionConfiguration A single table bucket encryption configuration object.
     *  See `encryptionConfiguration` below.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.s3tables.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param maintenanceConfiguration A single table bucket maintenance configuration object.
     *  See `maintenanceConfiguration` below.
     * @return builder
     */
    def maintenanceConfiguration(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableMaintenanceConfigurationArgs.Builder]):
        com.pulumi.aws.s3tables.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableMaintenanceConfigurationArgs.builder
      builder.maintenanceConfiguration(args(argsBuilder).build)

    /**
     * @param metadata Contains details about the table metadata. This configuration specifies the metadata format and schema for the table. Currently only supports Iceberg format.
     *  See `metadata` below.
     * @return builder
     */
    def metadata(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableMetadataArgs.Builder]):
        com.pulumi.aws.s3tables.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

  /** Resource for managing an Amazon S3 Tables Table Bucket. */
  def TableBucket(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3tables.TableBucketArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3tables.TableBucketArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.s3tables.TableBucket(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an Amazon S3 Tables Table Policy. */
  def TablePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3tables.TablePolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3tables.TablePolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.s3tables.TablePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an Amazon S3 Tables Namespace. */
  def Namespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3tables.NamespaceArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3tables.NamespaceArgs.builder
    
    com.pulumi.aws.s3tables.Namespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.s3tables.TableReplicationArgs.Builder)
    /**
     * @param rule Replication rules. See Rule below for more details.
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableReplicationRuleArgs.Builder]):
        com.pulumi.aws.s3tables.TableReplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableReplicationRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  /** Resource for managing an Amazon S3 Tables Table. */
  def Table(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3tables.TableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3tables.TableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.s3tables.Table(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages Amazon S3 Tables Table Replication configuration. */
  def TableReplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3tables.TableReplicationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3tables.TableReplicationArgs.builder
    
    com.pulumi.aws.s3tables.TableReplication(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages Amazon S3 Tables Table Bucket Replication configuration. */
  def TableBucketReplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3tables.TableBucketReplicationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3tables.TableBucketReplicationArgs.builder
    
    com.pulumi.aws.s3tables.TableBucketReplication(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.s3tables.TableBucketArgs.Builder)
    /**
     * @param encryptionConfiguration A single table bucket encryption configuration object.
     *  See `encryptionConfiguration` below.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableBucketEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.s3tables.TableBucketArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableBucketEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param maintenanceConfiguration A single table bucket maintenance configuration object.
     *  See `maintenanceConfiguration` below.
     * @return builder
     */
    def maintenanceConfiguration(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableBucketMaintenanceConfigurationArgs.Builder]):
        com.pulumi.aws.s3tables.TableBucketArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableBucketMaintenanceConfigurationArgs.builder
      builder.maintenanceConfiguration(args(argsBuilder).build)

  /** Resource for managing an Amazon S3 Tables Table Bucket Policy. */
  def TableBucketPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3tables.TableBucketPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3tables.TableBucketPolicyArgs.builder
    
    com.pulumi.aws.s3tables.TableBucketPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.s3tables.TableBucketReplicationArgs.Builder)
    /**
     * @param rule Replication rules. See Rule below for more details.
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableBucketReplicationRuleArgs.Builder]):
        com.pulumi.aws.s3tables.TableBucketReplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableBucketReplicationRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3tables.inputs.TableBucketReplicationRuleArgs.Builder)
    /**
     * @param destinations Replication destination. See Destination below for more details.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableBucketReplicationRuleDestinationArgs.Builder]*):
        com.pulumi.aws.s3tables.inputs.TableBucketReplicationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3tables.inputs.TableBucketReplicationRuleDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3tables.inputs.TableState.Builder)
    /**
     * @param encryptionConfiguration A single table bucket encryption configuration object.
     *  See `encryptionConfiguration` below.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.s3tables.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param maintenanceConfiguration A single table bucket maintenance configuration object.
     *  See `maintenanceConfiguration` below.
     * @return builder
     */
    def maintenanceConfiguration(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableMaintenanceConfigurationArgs.Builder]):
        com.pulumi.aws.s3tables.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableMaintenanceConfigurationArgs.builder
      builder.maintenanceConfiguration(args(argsBuilder).build)

    /**
     * @param metadata Contains details about the table metadata. This configuration specifies the metadata format and schema for the table. Currently only supports Iceberg format.
     *  See `metadata` below.
     * @return builder
     */
    def metadata(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableMetadataArgs.Builder]):
        com.pulumi.aws.s3tables.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3tables.inputs.TableReplicationState.Builder)
    /**
     * @param rule Replication rules. See Rule below for more details.
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableReplicationRuleArgs.Builder]):
        com.pulumi.aws.s3tables.inputs.TableReplicationState.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableReplicationRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3tables.inputs.TableBucketReplicationState.Builder)
    /**
     * @param rule Replication rules. See Rule below for more details.
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableBucketReplicationRuleArgs.Builder]):
        com.pulumi.aws.s3tables.inputs.TableBucketReplicationState.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableBucketReplicationRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3tables.inputs.TableMaintenanceConfigurationArgs.Builder)
    /**
     * @param icebergCompaction A single Iceberg compaction settings object.
     *  See `icebergCompaction` below.
     * @return builder
     */
    def icebergCompaction(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableMaintenanceConfigurationIcebergCompactionArgs.Builder]):
        com.pulumi.aws.s3tables.inputs.TableMaintenanceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableMaintenanceConfigurationIcebergCompactionArgs.builder
      builder.icebergCompaction(args(argsBuilder).build)

    /**
     * @param icebergSnapshotManagement A single Iceberg snapshot management settings object.
     *  See `icebergSnapshotManagement` below.
     * @return builder
     */
    def icebergSnapshotManagement(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableMaintenanceConfigurationIcebergSnapshotManagementArgs.Builder]):
        com.pulumi.aws.s3tables.inputs.TableMaintenanceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableMaintenanceConfigurationIcebergSnapshotManagementArgs.builder
      builder.icebergSnapshotManagement(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3tables.inputs.TableMetadataIcebergSchemaArgs.Builder)
    /**
     * @param fields List of schema fields for the Iceberg table. Each field defines a column in the table schema.
     *  See `field` below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableMetadataIcebergSchemaFieldArgs.Builder]*):
        com.pulumi.aws.s3tables.inputs.TableMetadataIcebergSchemaArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3tables.inputs.TableMetadataIcebergSchemaFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3tables.inputs.TableBucketMaintenanceConfigurationArgs.Builder)
    /**
     * @param icebergUnreferencedFileRemoval A single Iceberg unreferenced file removal settings object.
     *  See `icebergUnreferencedFileRemoval` below.
     * @return builder
     */
    def icebergUnreferencedFileRemoval(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableBucketMaintenanceConfigurationIcebergUnreferencedFileRemovalArgs.Builder]):
        com.pulumi.aws.s3tables.inputs.TableBucketMaintenanceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableBucketMaintenanceConfigurationIcebergUnreferencedFileRemovalArgs.builder
      builder.icebergUnreferencedFileRemoval(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3tables.inputs.TableMetadataIcebergArgs.Builder)
    /**
     * @param schema Schema configuration for the Iceberg table.
     *  See `schema` below.
     * @return builder
     */
    def schema(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableMetadataIcebergSchemaArgs.Builder]):
        com.pulumi.aws.s3tables.inputs.TableMetadataIcebergArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableMetadataIcebergSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3tables.inputs.TableMaintenanceConfigurationIcebergSnapshotManagementArgs.Builder)
    /**
     * @param settings Settings object for snapshot management.
     *  See `iceberg_snapshot_management.settings` below.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableMaintenanceConfigurationIcebergSnapshotManagementSettingsArgs.Builder]):
        com.pulumi.aws.s3tables.inputs.TableMaintenanceConfigurationIcebergSnapshotManagementArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableMaintenanceConfigurationIcebergSnapshotManagementSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3tables.inputs.TableReplicationRuleArgs.Builder)
    /**
     * @param destinations Replication destination. See Destination below for more details.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableReplicationRuleDestinationArgs.Builder]*):
        com.pulumi.aws.s3tables.inputs.TableReplicationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3tables.inputs.TableReplicationRuleDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3tables.inputs.TableBucketMaintenanceConfigurationIcebergUnreferencedFileRemovalArgs.Builder)
    /**
     * @param settings Settings object for unreferenced file removal.
     *  See `iceberg_unreferenced_file_removal.settings` below.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableBucketMaintenanceConfigurationIcebergUnreferencedFileRemovalSettingsArgs.Builder]):
        com.pulumi.aws.s3tables.inputs.TableBucketMaintenanceConfigurationIcebergUnreferencedFileRemovalArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableBucketMaintenanceConfigurationIcebergUnreferencedFileRemovalSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3tables.inputs.TableMaintenanceConfigurationIcebergCompactionArgs.Builder)
    /**
     * @param settings Settings object for compaction.
     *  See `iceberg_compaction.settings` below.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableMaintenanceConfigurationIcebergCompactionSettingsArgs.Builder]):
        com.pulumi.aws.s3tables.inputs.TableMaintenanceConfigurationIcebergCompactionArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableMaintenanceConfigurationIcebergCompactionSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3tables.inputs.TableMetadataArgs.Builder)
    /**
     * @param iceberg Contains details about the metadata for an Iceberg table. This block defines the schema structure for the Apache Iceberg table format.
     *  See `iceberg` below.
     * @return builder
     */
    def iceberg(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableMetadataIcebergArgs.Builder]):
        com.pulumi.aws.s3tables.inputs.TableMetadataArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableMetadataIcebergArgs.builder
      builder.iceberg(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3tables.inputs.TableBucketState.Builder)
    /**
     * @param encryptionConfiguration A single table bucket encryption configuration object.
     *  See `encryptionConfiguration` below.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableBucketEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.s3tables.inputs.TableBucketState.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableBucketEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param maintenanceConfiguration A single table bucket maintenance configuration object.
     *  See `maintenanceConfiguration` below.
     * @return builder
     */
    def maintenanceConfiguration(args: Endofunction[com.pulumi.aws.s3tables.inputs.TableBucketMaintenanceConfigurationArgs.Builder]):
        com.pulumi.aws.s3tables.inputs.TableBucketState.Builder =
      val argsBuilder = com.pulumi.aws.s3tables.inputs.TableBucketMaintenanceConfigurationArgs.builder
      builder.maintenanceConfiguration(args(argsBuilder).build)
