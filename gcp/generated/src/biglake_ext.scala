package jp.ukiba.ko_pulumi
package gcp

object biglake_ext:
  extension (builder: com.pulumi.gcp.biglake.DatabaseArgs.Builder)
    /**
     * @param hiveOptions Options of a Hive database.
     * Structure is documented below.
     * @return builder
     */
    def hiveOptions(args: Endofunction[com.pulumi.gcp.biglake.inputs.DatabaseHiveOptionsArgs.Builder]):
        com.pulumi.gcp.biglake.DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.DatabaseHiveOptionsArgs.builder
      builder.hiveOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.HiveCatalogIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveCatalogIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.HiveCatalogIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveCatalogIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.HiveCatalogIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveCatalogIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.HiveCatalogIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveCatalogIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.HiveDatabaseIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveDatabaseIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.HiveDatabaseIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveDatabaseIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.HiveDatabaseIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveDatabaseIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.HiveDatabaseIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveDatabaseIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.HiveTableArgs.Builder)
    /**
     * @param partitionKeys Partition keys of the table.
     * Structure is documented below.
     * @return builder
     */
    def partitionKeys(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTablePartitionKeyArgs.Builder]*):
        com.pulumi.gcp.biglake.HiveTableArgs.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTablePartitionKeyArgs.builder
      builder.partitionKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param storageDescriptor Storage descriptor of the table.
     * Structure is documented below.
     * @return builder
     */
    def storageDescriptor(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorArgs.Builder]):
        com.pulumi.gcp.biglake.HiveTableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorArgs.builder
      builder.storageDescriptor(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.HiveTableIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.HiveTableIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.HiveTableIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.HiveTableIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergCatalogArgs.Builder)
    /**
     * @param federatedCatalogOptions Options for a CATALOG_TYPE_FEDERATED catalog. Required when catalogType
     * is CATALOG_TYPE_FEDERATED.
     * Structure is documented below.
     * @return builder
     */
    def federatedCatalogOptions(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergCatalogArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsArgs.builder
      builder.federatedCatalogOptions(args(argsBuilder).build)

    /**
     * @param restrictedLocationsConfig Configuration for the additional GCS locations that are permitted for use
     * by resources within this catalog.
     * Structure is documented below.
     * @return builder
     */
    def restrictedLocationsConfig(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogRestrictedLocationsConfigArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergCatalogArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogRestrictedLocationsConfigArgs.builder
      builder.restrictedLocationsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergTableArgs.Builder)
    /**
     * @param partitionSpec The partition spec of the table.
     * Structure is documented below.
     * @return builder
     */
    def partitionSpec(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTablePartitionSpecArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergTableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTablePartitionSpecArgs.builder
      builder.partitionSpec(args(argsBuilder).build)

    /**
     * @param schema The schema of the table.
     * Structure is documented below.
     * @return builder
     */
    def schema(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableSchemaArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergTableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

    /**
     * @param sortOrder The sort order of the table.
     * Structure is documented below.
     * @return builder
     */
    def sortOrder(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableSortOrderArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergTableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableSortOrderArgs.builder
      builder.sortOrder(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergTableIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergTableIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergTableIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergTableIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.TableArgs.Builder)
    /**
     * @param hiveOptions Options of a Hive table.
     * Structure is documented below.
     * @return builder
     */
    def hiveOptions(args: Endofunction[com.pulumi.gcp.biglake.inputs.TableHiveOptionsArgs.Builder]):
        com.pulumi.gcp.biglake.TableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.TableHiveOptionsArgs.builder
      builder.hiveOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.DatabaseState.Builder)
    /**
     * @param hiveOptions Options of a Hive database.
     * Structure is documented below.
     * @return builder
     */
    def hiveOptions(args: Endofunction[com.pulumi.gcp.biglake.inputs.DatabaseHiveOptionsArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.DatabaseState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.DatabaseHiveOptionsArgs.builder
      builder.hiveOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.HiveCatalogIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveCatalogIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.HiveCatalogIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveCatalogIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.HiveCatalogIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveCatalogIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.HiveCatalogIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveCatalogIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.HiveCatalogState.Builder)
    /**
     * @param replicas Output only. The replicas for the catalog metadata.
     * Structure is documented below.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveCatalogReplicaArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.HiveCatalogState.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.HiveCatalogReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.biglake.inputs.HiveDatabaseIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveDatabaseIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.HiveDatabaseIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveDatabaseIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.HiveDatabaseIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveDatabaseIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.HiveDatabaseIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveDatabaseIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.HiveTableIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.HiveTableIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.HiveTableIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.HiveTableIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.HiveTableState.Builder)
    /**
     * @param partitionKeys Partition keys of the table.
     * Structure is documented below.
     * @return builder
     */
    def partitionKeys(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTablePartitionKeyArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.HiveTableState.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTablePartitionKeyArgs.builder
      builder.partitionKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param storageDescriptor Storage descriptor of the table.
     * Structure is documented below.
     * @return builder
     */
    def storageDescriptor(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.HiveTableState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorArgs.builder
      builder.storageDescriptor(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorArgs.Builder)
    /**
     * @param columns Specifies the columns of the table (the schema).
     * Structure is documented below.
     * @return builder
     */
    def columns(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorColumnArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

    /**
     * @param serdeInfo Serialization and deserialization information.
     * Structure is documented below.
     * @return builder
     */
    def serdeInfo(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSerdeInfoArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSerdeInfoArgs.builder
      builder.serdeInfo(args(argsBuilder).build)

    /**
     * @param skewedInfo Table data skew information.
     * Structure is documented below.
     * @return builder
     */
    def skewedInfo(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSkewedInfoArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSkewedInfoArgs.builder
      builder.skewedInfo(args(argsBuilder).build)

    /**
     * @param sortCols Sort order of the data in each bucket.
     * Structure is documented below.
     * @return builder
     */
    def sortCols(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSortColArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSortColArgs.builder
      builder.sortCols(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSkewedInfoArgs.Builder)
    /**
     * @param skewedColValues The skewed column values.
     * Structure is documented below.
     * @return builder
     */
    def skewedColValues(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSkewedInfoSkewedColValueArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSkewedInfoArgs.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSkewedInfoSkewedColValueArgs.builder
      builder.skewedColValues(args.map(_(argsBuilder).build)*)

    /**
     * @param skewedKeyValuesLocations The skewed key values locations.
     * Structure is documented below.
     * @return builder
     */
    def skewedKeyValuesLocations(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSkewedInfoSkewedKeyValuesLocationArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSkewedInfoArgs.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSkewedInfoSkewedKeyValuesLocationArgs.builder
      builder.skewedKeyValuesLocations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsArgs.Builder)
    /**
     * @param glueCatalogInfo Configuration for an AWS Glue remote catalog. Exactly one of
     * unityCatalogInfo or glueCatalogInfo must be specified.
     * Structure is documented below.
     * @return builder
     */
    def glueCatalogInfo(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsGlueCatalogInfoArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsGlueCatalogInfoArgs.builder
      builder.glueCatalogInfo(args(argsBuilder).build)

    /**
     * @param refreshOptions Configuration for metadata synchronization from the remote catalog.
     * Structure is documented below.
     * @return builder
     */
    def refreshOptions(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshOptionsArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshOptionsArgs.builder
      builder.refreshOptions(args(argsBuilder).build)

    /**
     * @param refreshStatuses (Output)
     * Output only. The status of the most recent metadata refresh.
     * Structure is documented below.
     * @return builder
     */
    def refreshStatuses(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshStatusArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshStatusArgs.builder
      builder.refreshStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param unityCatalogInfo Configuration for a Databricks Unity Catalog remote catalog. Exactly
     * one of unityCatalogInfo or glueCatalogInfo must be specified.
     * Structure is documented below.
     * @return builder
     */
    def unityCatalogInfo(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsUnityCatalogInfoArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsUnityCatalogInfoArgs.builder
      builder.unityCatalogInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshOptionsArgs.Builder)
    /**
     * @param refreshSchedule Schedule for periodic metadata refresh.
     * Structure is documented below.
     * @return builder
     */
    def refreshSchedule(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshOptionsRefreshScheduleArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshOptionsRefreshScheduleArgs.builder
      builder.refreshSchedule(args(argsBuilder).build)

    /**
     * @param refreshScope Scope of metadata to synchronize from the remote catalog.
     * Structure is documented below.
     * @return builder
     */
    def refreshScope(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshOptionsRefreshScopeArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshOptionsRefreshScopeArgs.builder
      builder.refreshScope(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshStatusArgs.Builder)
    /**
     * @param statuses Output only. The error result of the last failed refresh, if any.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshStatusStatusArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshStatusStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergCatalogIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergCatalogIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergCatalogState.Builder)
    /**
     * @param federatedCatalogOptions Options for a CATALOG_TYPE_FEDERATED catalog. Required when catalogType
     * is CATALOG_TYPE_FEDERATED.
     * Structure is documented below.
     * @return builder
     */
    def federatedCatalogOptions(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsArgs.builder
      builder.federatedCatalogOptions(args(argsBuilder).build)

    /**
     * @param replicas Output only. The replicas for the catalog metadata.
     * Structure is documented below.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogReplicaArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogState.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

    /**
     * @param restrictedLocationsConfig Configuration for the additional GCS locations that are permitted for use
     * by resources within this catalog.
     * Structure is documented below.
     * @return builder
     */
    def restrictedLocationsConfig(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogRestrictedLocationsConfigArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogRestrictedLocationsConfigArgs.builder
      builder.restrictedLocationsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergTableIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergTableIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergTableIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergTableIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergTablePartitionSpecArgs.Builder)
    /**
     * @param fields Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTablePartitionSpecFieldArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.IcebergTablePartitionSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTablePartitionSpecFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergTableSchemaArgs.Builder)
    /**
     * @param fields Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableSchemaFieldArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.IcebergTableSchemaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableSchemaFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergTableSortOrderArgs.Builder)
    /**
     * @param fields Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableSortOrderFieldArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.IcebergTableSortOrderArgs.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableSortOrderFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergTableState.Builder)
    /**
     * @param partitionSpec The partition spec of the table.
     * Structure is documented below.
     * @return builder
     */
    def partitionSpec(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTablePartitionSpecArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergTableState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTablePartitionSpecArgs.builder
      builder.partitionSpec(args(argsBuilder).build)

    /**
     * @param schema The schema of the table.
     * Structure is documented below.
     * @return builder
     */
    def schema(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableSchemaArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergTableState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

    /**
     * @param sortOrder The sort order of the table.
     * Structure is documented below.
     * @return builder
     */
    def sortOrder(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableSortOrderArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergTableState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableSortOrderArgs.builder
      builder.sortOrder(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.TableHiveOptionsArgs.Builder)
    /**
     * @param storageDescriptor Stores physical storage information on the data.
     * Structure is documented below.
     * @return builder
     */
    def storageDescriptor(args: Endofunction[com.pulumi.gcp.biglake.inputs.TableHiveOptionsStorageDescriptorArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.TableHiveOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.TableHiveOptionsStorageDescriptorArgs.builder
      builder.storageDescriptor(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.TableHiveOptionsStorageDescriptorArgs.Builder)
    /**
     * @param serdeInfo Serializer and deserializer information.
     * Structure is documented below.
     * @return builder
     */
    def serdeInfo(args: Endofunction[com.pulumi.gcp.biglake.inputs.TableHiveOptionsStorageDescriptorSerdeInfoArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.TableHiveOptionsStorageDescriptorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.TableHiveOptionsStorageDescriptorSerdeInfoArgs.builder
      builder.serdeInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.TableState.Builder)
    /**
     * @param hiveOptions Options of a Hive table.
     * Structure is documented below.
     * @return builder
     */
    def hiveOptions(args: Endofunction[com.pulumi.gcp.biglake.inputs.TableHiveOptionsArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.TableHiveOptionsArgs.builder
      builder.hiveOptions(args(argsBuilder).build)
