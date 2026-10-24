package jp.ukiba.ko_pulumi
package azure

object cosmosdb_ext:
  extension (builder: com.pulumi.azure.cosmosdb.AccountArgs.Builder)
    /**
     * @param analyticalStorage An `analyticalStorage` block as defined below.
     * @return builder
     */
    def analyticalStorage(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountAnalyticalStorageArgs.Builder]):
        com.pulumi.azure.cosmosdb.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountAnalyticalStorageArgs.builder
      builder.analyticalStorage(args(argsBuilder).build)

    def backup(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountBackupArgs.Builder]):
        com.pulumi.azure.cosmosdb.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    def capabilities(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountCapabilityArgs.Builder]*):
        com.pulumi.azure.cosmosdb.AccountArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountCapabilityArgs.builder
      builder.capabilities(args.map(_(argsBuilder).build)*)

    /**
     * @param capacity A `capacity` block as defined below.
     * @return builder
     */
    def capacity(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountCapacityArgs.Builder]):
        com.pulumi.azure.cosmosdb.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountCapacityArgs.builder
      builder.capacity(args(argsBuilder).build)

    def consistencyPolicy(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountConsistencyPolicyArgs.Builder]):
        com.pulumi.azure.cosmosdb.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountConsistencyPolicyArgs.builder
      builder.consistencyPolicy(args(argsBuilder).build)

    def corsRule(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountCorsRuleArgs.Builder]):
        com.pulumi.azure.cosmosdb.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountCorsRuleArgs.builder
      builder.corsRule(args(argsBuilder).build)

    def geoLocations(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountGeoLocationArgs.Builder]*):
        com.pulumi.azure.cosmosdb.AccountArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountGeoLocationArgs.builder
      builder.geoLocations(args.map(_(argsBuilder).build)*)

    def identity(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.cosmosdb.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def restore(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountRestoreArgs.Builder]):
        com.pulumi.azure.cosmosdb.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountRestoreArgs.builder
      builder.restore(args(argsBuilder).build)

    def virtualNetworkRules(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountVirtualNetworkRuleArgs.Builder]*):
        com.pulumi.azure.cosmosdb.AccountArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountVirtualNetworkRuleArgs.builder
      builder.virtualNetworkRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.CassandraClusterArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.CassandraClusterIdentityArgs.Builder]):
        com.pulumi.azure.cosmosdb.CassandraClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.CassandraClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cosmosdb.CassandraKeyspaceArgs.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.CassandraKeyspaceAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.CassandraKeyspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.CassandraKeyspaceAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cosmosdb.CassandraTableArgs.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual terraform destroy-apply.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.CassandraTableAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.CassandraTableArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.CassandraTableAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

    /**
     * @param schema A `schema` block as defined below.
     * @return builder
     */
    def schema(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.CassandraTableSchemaArgs.Builder]):
        com.pulumi.azure.cosmosdb.CassandraTableArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.CassandraTableSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cosmosdb.GremlinDatabaseArgs.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GremlinDatabaseAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.GremlinDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GremlinDatabaseAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cosmosdb.GremlinGraphArgs.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual terraform destroy-apply. Requires `partitionKeyPath` to be set.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GremlinGraphAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.GremlinGraphArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GremlinGraphAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

    /**
     * @param conflictResolutionPolicy A `conflictResolutionPolicy` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def conflictResolutionPolicy(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GremlinGraphConflictResolutionPolicyArgs.Builder]):
        com.pulumi.azure.cosmosdb.GremlinGraphArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GremlinGraphConflictResolutionPolicyArgs.builder
      builder.conflictResolutionPolicy(args(argsBuilder).build)

    /**
     * @param indexPolicy The configuration of the indexing policy. One or more `indexPolicy` blocks as defined below.
     * @return builder
     */
    def indexPolicy(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GremlinGraphIndexPolicyArgs.Builder]):
        com.pulumi.azure.cosmosdb.GremlinGraphArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GremlinGraphIndexPolicyArgs.builder
      builder.indexPolicy(args(argsBuilder).build)

    /**
     * @param uniqueKeys One or more `uniqueKey` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def uniqueKeys(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GremlinGraphUniqueKeyArgs.Builder]*):
        com.pulumi.azure.cosmosdb.GremlinGraphArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.GremlinGraphUniqueKeyArgs.builder
      builder.uniqueKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.MongoClusterArgs.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoClusterCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.cosmosdb.MongoClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoClusterCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as detailed below.
     * 
     * &gt; **Note:** When adding or removing `identity`, a resource recreation will be triggered.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoClusterIdentityArgs.Builder]):
        com.pulumi.azure.cosmosdb.MongoClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param restore A `restore` block as defined below. Required when `createMode` is set to `PointInTimeRestore`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** When `PointInTimeRestore` is enabled, service API will also assign a value to `sourceServerId`. The user has to explicitly set this property in the Terraform configuration or handle it using `ignoreChanges`.
     * @return builder
     */
    def restore(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoClusterRestoreArgs.Builder]):
        com.pulumi.azure.cosmosdb.MongoClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoClusterRestoreArgs.builder
      builder.restore(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cosmosdb.MongoCollectionArgs.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual terraform destroy-apply.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoCollectionAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.MongoCollectionArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoCollectionAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

    /**
     * @param indices One or more `index` blocks as defined below.
     * @return builder
     */
    def indices(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoCollectionIndexArgs.Builder]*):
        com.pulumi.azure.cosmosdb.MongoCollectionArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoCollectionIndexArgs.builder
      builder.indices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.MongoDatabaseArgs.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoDatabaseAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.MongoDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoDatabaseAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cosmosdb.MongoRoleDefinitionArgs.Builder)
    /**
     * @param privileges A `privilege` block as defined below.
     * @return builder
     */
    def privileges(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoRoleDefinitionPrivilegeArgs.Builder]*):
        com.pulumi.azure.cosmosdb.MongoRoleDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoRoleDefinitionPrivilegeArgs.builder
      builder.privileges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.PostgresqlClusterArgs.Builder)
    /**
     * @param maintenanceWindow A `maintenanceWindow` block as defined below.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.PostgresqlClusterMaintenanceWindowArgs.Builder]):
        com.pulumi.azure.cosmosdb.PostgresqlClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.PostgresqlClusterMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cosmosdb.SqlContainerArgs.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.SqlContainerAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.SqlContainerArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.SqlContainerAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

    /**
     * @param conflictResolutionPolicy A `conflictResolutionPolicy` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def conflictResolutionPolicy(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.SqlContainerConflictResolutionPolicyArgs.Builder]):
        com.pulumi.azure.cosmosdb.SqlContainerArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.SqlContainerConflictResolutionPolicyArgs.builder
      builder.conflictResolutionPolicy(args(argsBuilder).build)

    /**
     * @param indexingPolicy An `indexingPolicy` block as defined below.
     * @return builder
     */
    def indexingPolicy(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyArgs.Builder]):
        com.pulumi.azure.cosmosdb.SqlContainerArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyArgs.builder
      builder.indexingPolicy(args(argsBuilder).build)

    /**
     * @param uniqueKeys One or more `uniqueKey` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def uniqueKeys(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.SqlContainerUniqueKeyArgs.Builder]*):
        com.pulumi.azure.cosmosdb.SqlContainerArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.SqlContainerUniqueKeyArgs.builder
      builder.uniqueKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.SqlDatabaseArgs.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.SqlDatabaseAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.SqlDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.SqlDatabaseAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cosmosdb.SqlRoleDefinitionArgs.Builder)
    /**
     * @param permissions A `permissions` block as defined below.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.SqlRoleDefinitionPermissionArgs.Builder]*):
        com.pulumi.azure.cosmosdb.SqlRoleDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.SqlRoleDefinitionPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.TableArgs.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.TableAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.TableArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.TableAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.AccountRestoreArgs.Builder)
    /**
     * @param databases A `database` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def databases(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountRestoreDatabaseArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.AccountRestoreArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountRestoreDatabaseArgs.builder
      builder.databases(args.map(_(argsBuilder).build)*)

    /**
     * @param gremlinDatabases One or more `gremlinDatabase` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def gremlinDatabases(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountRestoreGremlinDatabaseArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.AccountRestoreArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountRestoreGremlinDatabaseArgs.builder
      builder.gremlinDatabases(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.AccountState.Builder)
    /**
     * @param analyticalStorage An `analyticalStorage` block as defined below.
     * @return builder
     */
    def analyticalStorage(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountAnalyticalStorageArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountAnalyticalStorageArgs.builder
      builder.analyticalStorage(args(argsBuilder).build)

    def backup(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountBackupArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    def capabilities(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountCapabilityArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.AccountState.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountCapabilityArgs.builder
      builder.capabilities(args.map(_(argsBuilder).build)*)

    /**
     * @param capacity A `capacity` block as defined below.
     * @return builder
     */
    def capacity(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountCapacityArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountCapacityArgs.builder
      builder.capacity(args(argsBuilder).build)

    def consistencyPolicy(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountConsistencyPolicyArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountConsistencyPolicyArgs.builder
      builder.consistencyPolicy(args(argsBuilder).build)

    def corsRule(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountCorsRuleArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountCorsRuleArgs.builder
      builder.corsRule(args(argsBuilder).build)

    def geoLocations(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountGeoLocationArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.AccountState.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountGeoLocationArgs.builder
      builder.geoLocations(args.map(_(argsBuilder).build)*)

    def identity(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def restore(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountRestoreArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountRestoreArgs.builder
      builder.restore(args(argsBuilder).build)

    def virtualNetworkRules(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.AccountVirtualNetworkRuleArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.AccountState.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.AccountVirtualNetworkRuleArgs.builder
      builder.virtualNetworkRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.CassandraClusterState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.CassandraClusterIdentityArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.CassandraClusterState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.CassandraClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.CassandraKeyspaceState.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.CassandraKeyspaceAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.CassandraKeyspaceState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.CassandraKeyspaceAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.CassandraTableSchemaArgs.Builder)
    /**
     * @param clusterKeys One or more `clusterKey` blocks as defined below.
     * @return builder
     */
    def clusterKeys(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.CassandraTableSchemaClusterKeyArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.CassandraTableSchemaArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.CassandraTableSchemaClusterKeyArgs.builder
      builder.clusterKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param columns One or more `column` blocks as defined below.
     * @return builder
     */
    def columns(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.CassandraTableSchemaColumnArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.CassandraTableSchemaArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.CassandraTableSchemaColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

    /**
     * @param partitionKeys One or more `partitionKey` blocks as defined below.
     * @return builder
     */
    def partitionKeys(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.CassandraTableSchemaPartitionKeyArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.CassandraTableSchemaArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.CassandraTableSchemaPartitionKeyArgs.builder
      builder.partitionKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.CassandraTableState.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual terraform destroy-apply.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.CassandraTableAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.CassandraTableState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.CassandraTableAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

    /**
     * @param schema A `schema` block as defined below.
     * @return builder
     */
    def schema(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.CassandraTableSchemaArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.CassandraTableState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.CassandraTableSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.GremlinDatabaseState.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GremlinDatabaseAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.GremlinDatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GremlinDatabaseAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.GremlinGraphIndexPolicyArgs.Builder)
    /**
     * @param compositeIndices One or more `compositeIndex` blocks as defined below.
     * @return builder
     */
    def compositeIndices(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GremlinGraphIndexPolicyCompositeIndexArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.GremlinGraphIndexPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.GremlinGraphIndexPolicyCompositeIndexArgs.builder
      builder.compositeIndices(args.map(_(argsBuilder).build)*)

    /**
     * @param spatialIndices One or more `spatialIndex` blocks as defined below.
     * @return builder
     */
    def spatialIndices(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GremlinGraphIndexPolicySpatialIndexArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.GremlinGraphIndexPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.GremlinGraphIndexPolicySpatialIndexArgs.builder
      builder.spatialIndices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.GremlinGraphIndexPolicyCompositeIndexArgs.Builder)
    /**
     * @param indices One or more `index` blocks as defined below.
     * @return builder
     */
    def indices(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GremlinGraphIndexPolicyCompositeIndexIndexArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.GremlinGraphIndexPolicyCompositeIndexArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.GremlinGraphIndexPolicyCompositeIndexIndexArgs.builder
      builder.indices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.GremlinGraphState.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual terraform destroy-apply. Requires `partitionKeyPath` to be set.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GremlinGraphAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.GremlinGraphState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GremlinGraphAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

    /**
     * @param conflictResolutionPolicy A `conflictResolutionPolicy` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def conflictResolutionPolicy(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GremlinGraphConflictResolutionPolicyArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.GremlinGraphState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GremlinGraphConflictResolutionPolicyArgs.builder
      builder.conflictResolutionPolicy(args(argsBuilder).build)

    /**
     * @param indexPolicy The configuration of the indexing policy. One or more `indexPolicy` blocks as defined below.
     * @return builder
     */
    def indexPolicy(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GremlinGraphIndexPolicyArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.GremlinGraphState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GremlinGraphIndexPolicyArgs.builder
      builder.indexPolicy(args(argsBuilder).build)

    /**
     * @param uniqueKeys One or more `uniqueKey` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def uniqueKeys(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GremlinGraphUniqueKeyArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.GremlinGraphState.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.GremlinGraphUniqueKeyArgs.builder
      builder.uniqueKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.MongoClusterState.Builder)
    /**
     * @param connectionStrings One or more `connectionStrings` blocks as defined below.
     * @return builder
     */
    def connectionStrings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoClusterConnectionStringArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.MongoClusterState.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoClusterConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoClusterCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.MongoClusterState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoClusterCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as detailed below.
     * 
     * &gt; **Note:** When adding or removing `identity`, a resource recreation will be triggered.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoClusterIdentityArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.MongoClusterState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param restore A `restore` block as defined below. Required when `createMode` is set to `PointInTimeRestore`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** When `PointInTimeRestore` is enabled, service API will also assign a value to `sourceServerId`. The user has to explicitly set this property in the Terraform configuration or handle it using `ignoreChanges`.
     * @return builder
     */
    def restore(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoClusterRestoreArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.MongoClusterState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoClusterRestoreArgs.builder
      builder.restore(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.MongoCollectionState.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual terraform destroy-apply.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoCollectionAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.MongoCollectionState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoCollectionAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

    /**
     * @param indices One or more `index` blocks as defined below.
     * @return builder
     */
    def indices(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoCollectionIndexArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.MongoCollectionState.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoCollectionIndexArgs.builder
      builder.indices(args.map(_(argsBuilder).build)*)

    /**
     * @param systemIndexes One or more `systemIndexes` blocks as defined below.
     * @return builder
     */
    def systemIndexes(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoCollectionSystemIndexArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.MongoCollectionState.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoCollectionSystemIndexArgs.builder
      builder.systemIndexes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.MongoDatabaseState.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoDatabaseAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.MongoDatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoDatabaseAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.MongoRoleDefinitionPrivilegeArgs.Builder)
    /**
     * @param resource A `resource` block as defined below.
     * @return builder
     */
    def resource(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoRoleDefinitionPrivilegeResourceArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.MongoRoleDefinitionPrivilegeArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoRoleDefinitionPrivilegeResourceArgs.builder
      builder.resource(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.MongoRoleDefinitionState.Builder)
    /**
     * @param privileges A `privilege` block as defined below.
     * @return builder
     */
    def privileges(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoRoleDefinitionPrivilegeArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.MongoRoleDefinitionState.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoRoleDefinitionPrivilegeArgs.builder
      builder.privileges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.PostgresqlClusterState.Builder)
    /**
     * @param maintenanceWindow A `maintenanceWindow` block as defined below.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.PostgresqlClusterMaintenanceWindowArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.PostgresqlClusterState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.PostgresqlClusterMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    /**
     * @param servers A `servers` block as defined below.
     * @return builder
     */
    def servers(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.PostgresqlClusterServerArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.PostgresqlClusterState.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.PostgresqlClusterServerArgs.builder
      builder.servers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyArgs.Builder)
    /**
     * @param compositeIndices One or more `compositeIndex` blocks as defined below.
     * @return builder
     */
    def compositeIndices(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyCompositeIndexArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyCompositeIndexArgs.builder
      builder.compositeIndices(args.map(_(argsBuilder).build)*)

    /**
     * @param excludedPaths One or more `excludedPath` blocks as defined below. Either `includedPath` or `excludedPath` must contain the `path` `&#47;&#42;`
     * @return builder
     */
    def excludedPaths(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyExcludedPathArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyExcludedPathArgs.builder
      builder.excludedPaths(args.map(_(argsBuilder).build)*)

    /**
     * @param includedPaths One or more `includedPath` blocks as defined below. Either `includedPath` or `excludedPath` must contain the `path` `&#47;&#42;`
     * @return builder
     */
    def includedPaths(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyIncludedPathArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyIncludedPathArgs.builder
      builder.includedPaths(args.map(_(argsBuilder).build)*)

    /**
     * @param spatialIndices One or more `spatialIndex` blocks as defined below.
     * @return builder
     */
    def spatialIndices(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicySpatialIndexArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicySpatialIndexArgs.builder
      builder.spatialIndices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyCompositeIndexArgs.Builder)
    /**
     * @param indices One or more `index` blocks as defined below.
     * @return builder
     */
    def indices(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyCompositeIndexIndexArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyCompositeIndexArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyCompositeIndexIndexArgs.builder
      builder.indices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.SqlContainerState.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.SqlContainerAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.SqlContainerState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.SqlContainerAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

    /**
     * @param conflictResolutionPolicy A `conflictResolutionPolicy` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def conflictResolutionPolicy(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.SqlContainerConflictResolutionPolicyArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.SqlContainerState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.SqlContainerConflictResolutionPolicyArgs.builder
      builder.conflictResolutionPolicy(args(argsBuilder).build)

    /**
     * @param indexingPolicy An `indexingPolicy` block as defined below.
     * @return builder
     */
    def indexingPolicy(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.SqlContainerState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyArgs.builder
      builder.indexingPolicy(args(argsBuilder).build)

    /**
     * @param uniqueKeys One or more `uniqueKey` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def uniqueKeys(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.SqlContainerUniqueKeyArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.SqlContainerState.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.SqlContainerUniqueKeyArgs.builder
      builder.uniqueKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.SqlDatabaseState.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.SqlDatabaseAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.SqlDatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.SqlDatabaseAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.SqlRoleDefinitionState.Builder)
    /**
     * @param permissions A `permissions` block as defined below.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.SqlRoleDefinitionPermissionArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.SqlRoleDefinitionState.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.SqlRoleDefinitionPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.TableState.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.TableAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.TableAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)
