package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object cosmosdb:
  /** Sets a Coordinator Configuration value on Azure Cosmos DB for PostgreSQL Cluster. */
  def PostgresqlCoordinatorConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.PostgresqlCoordinatorConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.PostgresqlCoordinatorConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.PostgresqlCoordinatorConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Cosmos DB for PostgreSQL Role. */
  def PostgresqlRole(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.PostgresqlRoleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.PostgresqlRoleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.PostgresqlRole(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.cosmosdb.TableArgs.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     *  &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.TableAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.TableArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.TableAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

  /** Manages an Azure Cosmos DB for PostgreSQL Cluster. */
  def PostgresqlCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.PostgresqlClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.PostgresqlClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.cosmosdb.PostgresqlCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.cosmosdb.CassandraKeyspaceArgs.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     *  &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.CassandraKeyspaceAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.CassandraKeyspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.CassandraKeyspaceAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cosmosdb.SqlDatabaseArgs.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     *  &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.SqlDatabaseAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.SqlDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.SqlDatabaseAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

  /** Manages a MongoDB Cluster using vCore Architecture. */
  @deprecated() def MongoCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.MongoClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.MongoClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.cosmosdb.MongoCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Cassandra Table within a Cosmos DB Cassandra Keyspace. */
  def CassandraTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.CassandraTableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.CassandraTableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.CassandraTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.cosmosdb.SqlContainerArgs.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     *  &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
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

  extension (builder: com.pulumi.azure.cosmosdb.GremlinDatabaseArgs.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     *  &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GremlinDatabaseAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.GremlinDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GremlinDatabaseAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

  /** Manages an SQL Trigger. */
  def SqlTrigger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.SqlTriggerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.SqlTriggerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.SqlTrigger(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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
     *  &gt; **Note:** When adding or removing `identity`, a resource recreation will be triggered.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoClusterIdentityArgs.Builder]):
        com.pulumi.azure.cosmosdb.MongoClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param restore A `restore` block as defined below. Required when `createMode` is set to `PointInTimeRestore`. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** When `PointInTimeRestore` is enabled, service API will also assign a value to `sourceServerId`. The user has to explicitly set this property in the Terraform configuration or handle it using `ignoreChanges`.
     * @return builder
     */
    def restore(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoClusterRestoreArgs.Builder]):
        com.pulumi.azure.cosmosdb.MongoClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoClusterRestoreArgs.builder
      builder.restore(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.cosmosdb.MongoClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.cosmosdb.AccountArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an SQL User Defined Function. */
  def SqlFunction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.SqlFunctionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.SqlFunctionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.SqlFunction(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Table within a Cosmos DB Account. */
  def Table(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.TableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.TableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.Table(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Mongo Collection within a Cosmos DB Account. */
  def MongoCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.MongoCollectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.MongoCollectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.MongoCollection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Sets a Node Configuration value on Azure Cosmos DB for PostgreSQL Cluster. */
  def PostgresqlNodeConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.PostgresqlNodeConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.PostgresqlNodeConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.PostgresqlNodeConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.cosmosdb.CassandraTableArgs.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual terraform destroy-apply.
     * 
     *  &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
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

  /** Manages a Cosmos DB SQL Role Definition. */
  def SqlRoleDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.SqlRoleDefinitionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.SqlRoleDefinitionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.SqlRoleDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a CosmosDB (formally DocumentDB) Account. */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.AccountArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.AccountArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.cosmosdb.Account(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Cassandra KeySpace within a Cosmos DB Account. */
  def CassandraKeyspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.CassandraKeyspaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.CassandraKeyspaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.CassandraKeyspace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.cosmosdb.GremlinGraphArgs.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual terraform destroy-apply. Requires `partitionKeyPath` to be set.
     * 
     *  &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
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

  extension (builder: com.pulumi.azure.cosmosdb.PostgresqlClusterArgs.Builder)
    /**
     * @param maintenanceWindow A `maintenanceWindow` block as defined below.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.PostgresqlClusterMaintenanceWindowArgs.Builder]):
        com.pulumi.azure.cosmosdb.PostgresqlClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.PostgresqlClusterMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.cosmosdb.PostgresqlClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.cosmosdb.MongoRoleDefinitionArgs.Builder)
    /**
     * @param privileges A `privilege` block as defined below.
     * @return builder
     */
    def privileges(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoRoleDefinitionPrivilegeArgs.Builder]*):
        com.pulumi.azure.cosmosdb.MongoRoleDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoRoleDefinitionPrivilegeArgs.builder
      builder.privileges(args.map(_(argsBuilder).build)*)

  /** Manages a Cosmos DB Mongo Role Definition. */
  def MongoRoleDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.MongoRoleDefinitionArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.cosmosdb.MongoRoleDefinitionArgs.builder
    com.pulumi.azure.cosmosdb.MongoRoleDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a SQL Container within a Cosmos DB Account. */
  def SqlContainer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.SqlContainerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.SqlContainerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.SqlContainer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type CosmosdbFunctions = com.pulumi.azure.cosmosdb.CosmosdbFunctions
  object CosmosdbFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.cosmosdb.CosmosdbFunctions.*
  extension (self: CosmosdbFunctions.type)
    /** Use this data source to access information about an existing CosmosDB (formally DocumentDB) Account. */
    def getAccount(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GetAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.cosmosdb.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GetAccountArgs.builder
      com.pulumi.azure.cosmosdb.CosmosdbFunctions.getAccount(args(argsBuilder).build)

    /** Use this data source to access information about an existing CosmosDB (formally DocumentDB) Account. */
    def getAccountPlain(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GetAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cosmosdb.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GetAccountPlainArgs.builder
      com.pulumi.azure.cosmosdb.CosmosdbFunctions.getAccountPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Cosmos DB Mongo Database. */
    def getMongoDatabase(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GetMongoDatabaseArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.cosmosdb.outputs.GetMongoDatabaseResult] =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GetMongoDatabaseArgs.builder
      com.pulumi.azure.cosmosdb.CosmosdbFunctions.getMongoDatabase(args(argsBuilder).build)

    /** Use this data source to access information about an existing Cosmos DB Mongo Database. */
    def getMongoDatabasePlain(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GetMongoDatabasePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cosmosdb.outputs.GetMongoDatabaseResult] =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GetMongoDatabasePlainArgs.builder
      com.pulumi.azure.cosmosdb.CosmosdbFunctions.getMongoDatabasePlain(args(argsBuilder).build)

    /** Use this data source to access information about Cosmos DB Restorable Database Accounts. */
    def getRestorableDatabaseAccounts(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GetRestorableDatabaseAccountsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.cosmosdb.outputs.GetRestorableDatabaseAccountsResult] =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GetRestorableDatabaseAccountsArgs.builder
      com.pulumi.azure.cosmosdb.CosmosdbFunctions.getRestorableDatabaseAccounts(args(argsBuilder).build)

    /** Use this data source to access information about Cosmos DB Restorable Database Accounts. */
    def getRestorableDatabaseAccountsPlain(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GetRestorableDatabaseAccountsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cosmosdb.outputs.GetRestorableDatabaseAccountsResult] =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GetRestorableDatabaseAccountsPlainArgs.builder
      com.pulumi.azure.cosmosdb.CosmosdbFunctions.getRestorableDatabaseAccountsPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing CosmosDB SQL Database. */
    def getSqlDatabase(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GetSqlDatabaseArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.cosmosdb.outputs.GetSqlDatabaseResult] =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GetSqlDatabaseArgs.builder
      com.pulumi.azure.cosmosdb.CosmosdbFunctions.getSqlDatabase(args(argsBuilder).build)

    /** Use this data source to access information about an existing CosmosDB SQL Database. */
    def getSqlDatabasePlain(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GetSqlDatabasePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cosmosdb.outputs.GetSqlDatabaseResult] =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GetSqlDatabasePlainArgs.builder
      com.pulumi.azure.cosmosdb.CosmosdbFunctions.getSqlDatabasePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Cosmos DB SQL Role Definition. */
    def getSqlRoleDefinition(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GetSqlRoleDefinitionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.cosmosdb.outputs.GetSqlRoleDefinitionResult] =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GetSqlRoleDefinitionArgs.builder
      com.pulumi.azure.cosmosdb.CosmosdbFunctions.getSqlRoleDefinition(args(argsBuilder).build)

    /** Use this data source to access information about an existing Cosmos DB SQL Role Definition. */
    def getSqlRoleDefinitionPlain(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GetSqlRoleDefinitionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cosmosdb.outputs.GetSqlRoleDefinitionResult] =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GetSqlRoleDefinitionPlainArgs.builder
      com.pulumi.azure.cosmosdb.CosmosdbFunctions.getSqlRoleDefinitionPlain(args(argsBuilder).build)

  /** Manages a Gremlin Graph within a Cosmos DB Account. */
  def GremlinGraph(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.GremlinGraphArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.GremlinGraphArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.GremlinGraph(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.cosmosdb.CassandraClusterArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.CassandraClusterIdentityArgs.Builder]):
        com.pulumi.azure.cosmosdb.CassandraClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.CassandraClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.cosmosdb.CassandraClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a SQL Stored Procedure within a Cosmos DB Account SQL Database. */
  def SqlStoredProcedure(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.SqlStoredProcedureArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.SqlStoredProcedureArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.SqlStoredProcedure(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Cosmos DB for PostgreSQL Firewall Rule. */
  def PostgresqlFirewallRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.PostgresqlFirewallRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.PostgresqlFirewallRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.PostgresqlFirewallRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a SQL Dedicated Gateway within a Cosmos DB Account. */
  def SqlDedicatedGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.SqlDedicatedGatewayArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.cosmosdb.SqlDedicatedGatewayArgs.builder
    com.pulumi.azure.cosmosdb.SqlDedicatedGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.cosmosdb.MongoCollectionArgs.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual terraform destroy-apply.
     * 
     *  &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
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

  /**
   * Manages a Cassandra Datacenter.
   * 
   *  &gt; **Note:** In order for the `Azure Managed Instances for Apache Cassandra` to work properly the product requires the `Azure Cosmos DB` Application ID to be present and working in your tenant. If the `Azure Cosmos DB` Application ID is missing in your environment you will need to have an administrator of your tenant run the following command to add the `Azure Cosmos DB` Application ID to your tenant:
   * 
   *  ## Import
   * 
   *  Cassandra Datacenters can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:cosmosdb/cassandraDatacenter:CassandraDatacenter example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.DocumentDB/cassandraClusters/cluster1/dataCenters/dc1
   *  ```
   */
  def CassandraDatacenter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.CassandraDatacenterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.CassandraDatacenterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.CassandraDatacenter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.cosmosdb.MongoDatabaseArgs.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     *  &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoDatabaseAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.MongoDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoDatabaseAutoscaleSettingsArgs.builder
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

  /** Manages a Cosmos DB SQL Role Assignment. */
  def SqlRoleAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.SqlRoleAssignmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.SqlRoleAssignmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.SqlRoleAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Gremlin Database within a Cosmos DB Account. */
  def GremlinDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.GremlinDatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.GremlinDatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.GremlinDatabase(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Cassandra Cluster.
   * 
   *  &gt; **Note:** In order for the `Azure Managed Instances for Apache Cassandra` to work properly the product requires the `Azure Cosmos DB` Application ID to be present and working in your tenant. If the `Azure Cosmos DB` Application ID is missing in your environment you will need to have an administrator of your tenant run the following command to add the `Azure Cosmos DB` Application ID to your tenant:
   * 
   *  ## Import
   * 
   *  Cassandra Clusters can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:cosmosdb/cassandraCluster:CassandraCluster example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.DocumentDB/cassandraClusters/cluster1
   *  ```
   */
  def CassandraCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.CassandraClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.CassandraClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.cosmosdb.CassandraCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Cosmos DB Mongo User Definition. */
  def MongoUserDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.MongoUserDefinitionArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.cosmosdb.MongoUserDefinitionArgs.builder
    com.pulumi.azure.cosmosdb.MongoUserDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.SqlDatabaseState.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     *  &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
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

  extension (builder: com.pulumi.azure.cosmosdb.inputs.MongoDatabaseState.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     *  &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoDatabaseAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.MongoDatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoDatabaseAutoscaleSettingsArgs.builder
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

  extension (builder: com.pulumi.azure.cosmosdb.inputs.MongoRoleDefinitionState.Builder)
    /**
     * @param privileges A `privilege` block as defined below.
     * @return builder
     */
    def privileges(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoRoleDefinitionPrivilegeArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.MongoRoleDefinitionState.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoRoleDefinitionPrivilegeArgs.builder
      builder.privileges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.GremlinGraphState.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual terraform destroy-apply. Requires `partitionKeyPath` to be set.
     * 
     *  &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
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

  extension (builder: com.pulumi.azure.cosmosdb.inputs.TableState.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     *  &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.TableAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.TableAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.SqlContainerState.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     *  &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
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

  extension (builder: com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyCompositeIndexArgs.Builder)
    /**
     * @param indices One or more `index` blocks as defined below.
     * @return builder
     */
    def indices(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyCompositeIndexIndexArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyCompositeIndexArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyCompositeIndexIndexArgs.builder
      builder.indices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.MongoCollectionState.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual terraform destroy-apply.
     * 
     *  &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.cosmosdb.inputs.AccountState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.cosmosdb.inputs.GremlinDatabaseState.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     *  &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GremlinDatabaseAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.GremlinDatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GremlinDatabaseAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.CassandraClusterState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.CassandraClusterIdentityArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.CassandraClusterState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.CassandraClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.cosmosdb.inputs.CassandraClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.cosmosdb.inputs.GremlinGraphIndexPolicyCompositeIndexArgs.Builder)
    /**
     * @param indices One or more `index` blocks as defined below.
     * @return builder
     */
    def indices(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GremlinGraphIndexPolicyCompositeIndexIndexArgs.Builder]*):
        com.pulumi.azure.cosmosdb.inputs.GremlinGraphIndexPolicyCompositeIndexArgs.Builder =
      def argsBuilder = com.pulumi.azure.cosmosdb.inputs.GremlinGraphIndexPolicyCompositeIndexIndexArgs.builder
      builder.indices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cosmosdb.inputs.CassandraKeyspaceState.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     *  &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * @return builder
     */
    def autoscaleSettings(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.CassandraKeyspaceAutoscaleSettingsArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.CassandraKeyspaceState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.CassandraKeyspaceAutoscaleSettingsArgs.builder
      builder.autoscaleSettings(args(argsBuilder).build)

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.cosmosdb.inputs.PostgresqlClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

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
     *  &gt; **Note:** When adding or removing `identity`, a resource recreation will be triggered.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoClusterIdentityArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.MongoClusterState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param restore A `restore` block as defined below. Required when `createMode` is set to `PointInTimeRestore`. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** When `PointInTimeRestore` is enabled, service API will also assign a value to `sourceServerId`. The user has to explicitly set this property in the Terraform configuration or handle it using `ignoreChanges`.
     * @return builder
     */
    def restore(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoClusterRestoreArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.MongoClusterState.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoClusterRestoreArgs.builder
      builder.restore(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.cosmosdb.inputs.MongoClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.cosmosdb.inputs.CassandraTableState.Builder)
    /**
     * @param autoscaleSettings An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual terraform destroy-apply.
     * 
     *  &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
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

  extension (builder: com.pulumi.azure.cosmosdb.inputs.MongoRoleDefinitionPrivilegeArgs.Builder)
    /**
     * @param resource A `resource` block as defined below.
     * @return builder
     */
    def resource(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.MongoRoleDefinitionPrivilegeResourceArgs.Builder]):
        com.pulumi.azure.cosmosdb.inputs.MongoRoleDefinitionPrivilegeArgs.Builder =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.MongoRoleDefinitionPrivilegeResourceArgs.builder
      builder.resource(args(argsBuilder).build)

  /** Manages a SQL Database within a Cosmos DB Account. */
  def SqlDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.SqlDatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.SqlDatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.SqlDatabase(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Mongo Database within a Cosmos DB Account. */
  def MongoDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.MongoDatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.MongoDatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.MongoDatabase(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
