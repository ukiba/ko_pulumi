package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object keyspaces:
  extension (builder: com.pulumi.aws.keyspaces.TableArgs.Builder)
    /**
     * @param capacitySpecification Specifies the read/write throughput capacity mode for the table.
     * @return builder
     */
    def capacitySpecification(args: Endofunction[com.pulumi.aws.keyspaces.inputs.TableCapacitySpecificationArgs.Builder]):
        com.pulumi.aws.keyspaces.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.keyspaces.inputs.TableCapacitySpecificationArgs.builder
      builder.capacitySpecification(args(argsBuilder).build)

    /**
     * @param clientSideTimestamps Enables client-side timestamps for the table. By default, the setting is disabled.
     * @return builder
     */
    def clientSideTimestamps(args: Endofunction[com.pulumi.aws.keyspaces.inputs.TableClientSideTimestampsArgs.Builder]):
        com.pulumi.aws.keyspaces.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.keyspaces.inputs.TableClientSideTimestampsArgs.builder
      builder.clientSideTimestamps(args(argsBuilder).build)

    /**
     * @param comment A description of the table.
     * @return builder
     */
    def comment(args: Endofunction[com.pulumi.aws.keyspaces.inputs.TableCommentArgs.Builder]):
        com.pulumi.aws.keyspaces.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.keyspaces.inputs.TableCommentArgs.builder
      builder.comment(args(argsBuilder).build)

    /**
     * @param encryptionSpecification Specifies how the encryption key for encryption at rest is managed for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html).
     * @return builder
     */
    def encryptionSpecification(args: Endofunction[com.pulumi.aws.keyspaces.inputs.TableEncryptionSpecificationArgs.Builder]):
        com.pulumi.aws.keyspaces.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.keyspaces.inputs.TableEncryptionSpecificationArgs.builder
      builder.encryptionSpecification(args(argsBuilder).build)

    /**
     * @param pointInTimeRecovery Specifies if point-in-time recovery is enabled or disabled for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html).
     * @return builder
     */
    def pointInTimeRecovery(args: Endofunction[com.pulumi.aws.keyspaces.inputs.TablePointInTimeRecoveryArgs.Builder]):
        com.pulumi.aws.keyspaces.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.keyspaces.inputs.TablePointInTimeRecoveryArgs.builder
      builder.pointInTimeRecovery(args(argsBuilder).build)

    /**
     * @param schemaDefinition Describes the schema of the table.
     * @return builder
     */
    def schemaDefinition(args: Endofunction[com.pulumi.aws.keyspaces.inputs.TableSchemaDefinitionArgs.Builder]):
        com.pulumi.aws.keyspaces.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.keyspaces.inputs.TableSchemaDefinitionArgs.builder
      builder.schemaDefinition(args(argsBuilder).build)

    /**
     * @param ttl Enables Time to Live custom settings for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html).
     * @return builder
     */
    def ttl(args: Endofunction[com.pulumi.aws.keyspaces.inputs.TableTtlArgs.Builder]):
        com.pulumi.aws.keyspaces.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.keyspaces.inputs.TableTtlArgs.builder
      builder.ttl(args(argsBuilder).build)

  /**
   * Provides a Keyspaces Table.
   *  
   *  More information about Keyspaces tables can be found in the [Keyspaces Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/working-with-tables.html).
   */
  def Table(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.keyspaces.TableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.keyspaces.TableArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.keyspaces.Table(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.keyspaces.KeyspaceArgs.Builder)
    /**
     * @param replicationSpecification The replication specification of the keyspace.
     * @return builder
     */
    def replicationSpecification(args: Endofunction[com.pulumi.aws.keyspaces.inputs.KeyspaceReplicationSpecificationArgs.Builder]):
        com.pulumi.aws.keyspaces.KeyspaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.keyspaces.inputs.KeyspaceReplicationSpecificationArgs.builder
      builder.replicationSpecification(args(argsBuilder).build)

  /**
   * Provides a Keyspaces Keyspace.
   *  
   *  More information about keyspaces can be found in the [Keyspaces User Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/what-is-keyspaces.html).
   */
  def Keyspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.keyspaces.KeyspaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.keyspaces.KeyspaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.keyspaces.Keyspace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.keyspaces.inputs.TableState.Builder)
    /**
     * @param capacitySpecification Specifies the read/write throughput capacity mode for the table.
     * @return builder
     */
    def capacitySpecification(args: Endofunction[com.pulumi.aws.keyspaces.inputs.TableCapacitySpecificationArgs.Builder]):
        com.pulumi.aws.keyspaces.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.keyspaces.inputs.TableCapacitySpecificationArgs.builder
      builder.capacitySpecification(args(argsBuilder).build)

    /**
     * @param clientSideTimestamps Enables client-side timestamps for the table. By default, the setting is disabled.
     * @return builder
     */
    def clientSideTimestamps(args: Endofunction[com.pulumi.aws.keyspaces.inputs.TableClientSideTimestampsArgs.Builder]):
        com.pulumi.aws.keyspaces.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.keyspaces.inputs.TableClientSideTimestampsArgs.builder
      builder.clientSideTimestamps(args(argsBuilder).build)

    /**
     * @param comment A description of the table.
     * @return builder
     */
    def comment(args: Endofunction[com.pulumi.aws.keyspaces.inputs.TableCommentArgs.Builder]):
        com.pulumi.aws.keyspaces.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.keyspaces.inputs.TableCommentArgs.builder
      builder.comment(args(argsBuilder).build)

    /**
     * @param encryptionSpecification Specifies how the encryption key for encryption at rest is managed for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html).
     * @return builder
     */
    def encryptionSpecification(args: Endofunction[com.pulumi.aws.keyspaces.inputs.TableEncryptionSpecificationArgs.Builder]):
        com.pulumi.aws.keyspaces.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.keyspaces.inputs.TableEncryptionSpecificationArgs.builder
      builder.encryptionSpecification(args(argsBuilder).build)

    /**
     * @param pointInTimeRecovery Specifies if point-in-time recovery is enabled or disabled for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html).
     * @return builder
     */
    def pointInTimeRecovery(args: Endofunction[com.pulumi.aws.keyspaces.inputs.TablePointInTimeRecoveryArgs.Builder]):
        com.pulumi.aws.keyspaces.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.keyspaces.inputs.TablePointInTimeRecoveryArgs.builder
      builder.pointInTimeRecovery(args(argsBuilder).build)

    /**
     * @param schemaDefinition Describes the schema of the table.
     * @return builder
     */
    def schemaDefinition(args: Endofunction[com.pulumi.aws.keyspaces.inputs.TableSchemaDefinitionArgs.Builder]):
        com.pulumi.aws.keyspaces.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.keyspaces.inputs.TableSchemaDefinitionArgs.builder
      builder.schemaDefinition(args(argsBuilder).build)

    /**
     * @param ttl Enables Time to Live custom settings for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html).
     * @return builder
     */
    def ttl(args: Endofunction[com.pulumi.aws.keyspaces.inputs.TableTtlArgs.Builder]):
        com.pulumi.aws.keyspaces.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.keyspaces.inputs.TableTtlArgs.builder
      builder.ttl(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.keyspaces.inputs.KeyspaceState.Builder)
    /**
     * @param replicationSpecification The replication specification of the keyspace.
     * @return builder
     */
    def replicationSpecification(args: Endofunction[com.pulumi.aws.keyspaces.inputs.KeyspaceReplicationSpecificationArgs.Builder]):
        com.pulumi.aws.keyspaces.inputs.KeyspaceState.Builder =
      val argsBuilder = com.pulumi.aws.keyspaces.inputs.KeyspaceReplicationSpecificationArgs.builder
      builder.replicationSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.keyspaces.inputs.TableSchemaDefinitionArgs.Builder)
    /**
     * @param clusteringKeys The columns that are part of the clustering key of the table.
     * @return builder
     */
    def clusteringKeys(args: Endofunction[com.pulumi.aws.keyspaces.inputs.TableSchemaDefinitionClusteringKeyArgs.Builder]*):
        com.pulumi.aws.keyspaces.inputs.TableSchemaDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.keyspaces.inputs.TableSchemaDefinitionClusteringKeyArgs.builder
      builder.clusteringKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param columns The regular columns of the table.
     * @return builder
     */
    def columns(args: Endofunction[com.pulumi.aws.keyspaces.inputs.TableSchemaDefinitionColumnArgs.Builder]*):
        com.pulumi.aws.keyspaces.inputs.TableSchemaDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.keyspaces.inputs.TableSchemaDefinitionColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

    /**
     * @param partitionKeys The columns that are part of the partition key of the table .
     * @return builder
     */
    def partitionKeys(args: Endofunction[com.pulumi.aws.keyspaces.inputs.TableSchemaDefinitionPartitionKeyArgs.Builder]*):
        com.pulumi.aws.keyspaces.inputs.TableSchemaDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.keyspaces.inputs.TableSchemaDefinitionPartitionKeyArgs.builder
      builder.partitionKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param staticColumns The columns that have been defined as `STATIC`. Static columns store values that are shared by all rows in the same partition.
     * @return builder
     */
    def staticColumns(args: Endofunction[com.pulumi.aws.keyspaces.inputs.TableSchemaDefinitionStaticColumnArgs.Builder]*):
        com.pulumi.aws.keyspaces.inputs.TableSchemaDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.keyspaces.inputs.TableSchemaDefinitionStaticColumnArgs.builder
      builder.staticColumns(args.map(_(argsBuilder).build)*)
