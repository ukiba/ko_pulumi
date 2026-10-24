package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object cosmosdb:
  /** Manages a CosmosDB (formally DocumentDB) Account. */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.AccountArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.AccountArgs.builder
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
    com.pulumi.azure.cosmosdb.Account(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Cassandra Cluster.
   * 
   * &gt; **Note:** In order for the `Azure Managed Instances for Apache Cassandra` to work properly the product requires the `Azure Cosmos DB` Application ID to be present and working in your tenant. If the `Azure Cosmos DB` Application ID is missing in your environment you will need to have an administrator of your tenant run the following command to add the `Azure Cosmos DB` Application ID to your tenant:
   * 
   * ## Import
   * 
   * Cassandra Clusters can be imported using the `resource id`, e.g.
   * 
   * ```sh
   * \$ pulumi import azure:cosmosdb/cassandraCluster:CassandraCluster example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.DocumentDB/cassandraClusters/cluster1
   * ```
   */
  def CassandraCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.CassandraClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.CassandraClusterArgs.builder
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
    com.pulumi.azure.cosmosdb.CassandraCluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Cassandra Datacenter.
   * 
   * &gt; **Note:** In order for the `Azure Managed Instances for Apache Cassandra` to work properly the product requires the `Azure Cosmos DB` Application ID to be present and working in your tenant. If the `Azure Cosmos DB` Application ID is missing in your environment you will need to have an administrator of your tenant run the following command to add the `Azure Cosmos DB` Application ID to your tenant:
   * 
   * ## Import
   * 
   * Cassandra Datacenters can be imported using the `resource id`, e.g.
   * 
   * ```sh
   * \$ pulumi import azure:cosmosdb/cassandraDatacenter:CassandraDatacenter example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.DocumentDB/cassandraClusters/cluster1/dataCenters/dc1
   * ```
   */
  def CassandraDatacenter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.CassandraDatacenterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.CassandraDatacenterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.CassandraDatacenter(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Cassandra KeySpace within a Cosmos DB Account. */
  def CassandraKeyspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.CassandraKeyspaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.CassandraKeyspaceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.CassandraKeyspace(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Cassandra Table within a Cosmos DB Cassandra Keyspace. */
  def CassandraTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.CassandraTableArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.CassandraTableArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.CassandraTable(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object CosmosdbFunctions:
    /** Use this data source to access information about an existing CosmosDB (formally DocumentDB) Account. */
    inline def getAccount(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GetAccountArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.cosmosdb.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GetAccountArgs.builder
      com.pulumi.azure.cosmosdb.CosmosdbFunctions.getAccount(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing CosmosDB (formally DocumentDB) Account. */
    inline def getAccountPlain(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GetAccountPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cosmosdb.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GetAccountPlainArgs.builder
      com.pulumi.azure.cosmosdb.CosmosdbFunctions.getAccountPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Cosmos DB Mongo Database. */
    inline def getMongoDatabase(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GetMongoDatabaseArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.cosmosdb.outputs.GetMongoDatabaseResult] =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GetMongoDatabaseArgs.builder
      com.pulumi.azure.cosmosdb.CosmosdbFunctions.getMongoDatabase(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Cosmos DB Mongo Database. */
    inline def getMongoDatabasePlain(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GetMongoDatabasePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cosmosdb.outputs.GetMongoDatabaseResult] =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GetMongoDatabasePlainArgs.builder
      com.pulumi.azure.cosmosdb.CosmosdbFunctions.getMongoDatabasePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about Cosmos DB Restorable Database Accounts. */
    inline def getRestorableDatabaseAccounts(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GetRestorableDatabaseAccountsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.cosmosdb.outputs.GetRestorableDatabaseAccountsResult] =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GetRestorableDatabaseAccountsArgs.builder
      com.pulumi.azure.cosmosdb.CosmosdbFunctions.getRestorableDatabaseAccounts(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about Cosmos DB Restorable Database Accounts. */
    inline def getRestorableDatabaseAccountsPlain(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GetRestorableDatabaseAccountsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cosmosdb.outputs.GetRestorableDatabaseAccountsResult] =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GetRestorableDatabaseAccountsPlainArgs.builder
      com.pulumi.azure.cosmosdb.CosmosdbFunctions.getRestorableDatabaseAccountsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing CosmosDB SQL Database. */
    inline def getSqlDatabase(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GetSqlDatabaseArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.cosmosdb.outputs.GetSqlDatabaseResult] =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GetSqlDatabaseArgs.builder
      com.pulumi.azure.cosmosdb.CosmosdbFunctions.getSqlDatabase(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing CosmosDB SQL Database. */
    inline def getSqlDatabasePlain(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GetSqlDatabasePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cosmosdb.outputs.GetSqlDatabaseResult] =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GetSqlDatabasePlainArgs.builder
      com.pulumi.azure.cosmosdb.CosmosdbFunctions.getSqlDatabasePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Cosmos DB SQL Role Definition. */
    inline def getSqlRoleDefinition(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GetSqlRoleDefinitionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.cosmosdb.outputs.GetSqlRoleDefinitionResult] =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GetSqlRoleDefinitionArgs.builder
      com.pulumi.azure.cosmosdb.CosmosdbFunctions.getSqlRoleDefinition(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Cosmos DB SQL Role Definition. */
    inline def getSqlRoleDefinitionPlain(args: Endofunction[com.pulumi.azure.cosmosdb.inputs.GetSqlRoleDefinitionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.cosmosdb.outputs.GetSqlRoleDefinitionResult] =
      val argsBuilder = com.pulumi.azure.cosmosdb.inputs.GetSqlRoleDefinitionPlainArgs.builder
      com.pulumi.azure.cosmosdb.CosmosdbFunctions.getSqlRoleDefinitionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages a Gremlin Database within a Cosmos DB Account. */
  def GremlinDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.GremlinDatabaseArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.GremlinDatabaseArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.GremlinDatabase(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Gremlin Graph within a Cosmos DB Account. */
  def GremlinGraph(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.GremlinGraphArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.GremlinGraphArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.GremlinGraph(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a MongoDB Cluster using vCore Architecture. */
  @deprecated("azure.cosmosdb/mongocluster.MongoCluster has been deprecated in favor of azure.mongocluster/mongocluster.MongoCluster") def MongoCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.MongoClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.MongoClusterArgs.builder
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
    com.pulumi.azure.cosmosdb.MongoCluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Mongo Collection within a Cosmos DB Account. */
  def MongoCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.MongoCollectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.MongoCollectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.MongoCollection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Mongo Database within a Cosmos DB Account. */
  def MongoDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.MongoDatabaseArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.MongoDatabaseArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.MongoDatabase(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Cosmos DB Mongo Role Definition. */
  def MongoRoleDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.MongoRoleDefinitionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.cosmosdb.MongoRoleDefinitionArgs.builder
    com.pulumi.azure.cosmosdb.MongoRoleDefinition(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Cosmos DB Mongo User Definition. */
  def MongoUserDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.MongoUserDefinitionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.cosmosdb.MongoUserDefinitionArgs.builder
    com.pulumi.azure.cosmosdb.MongoUserDefinition(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Cosmos DB for PostgreSQL Cluster. */
  def PostgresqlCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.PostgresqlClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.PostgresqlClusterArgs.builder
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
    com.pulumi.azure.cosmosdb.PostgresqlCluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Sets a Coordinator Configuration value on Azure Cosmos DB for PostgreSQL Cluster. */
  def PostgresqlCoordinatorConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.PostgresqlCoordinatorConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.PostgresqlCoordinatorConfigurationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.PostgresqlCoordinatorConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Cosmos DB for PostgreSQL Firewall Rule. */
  def PostgresqlFirewallRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.PostgresqlFirewallRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.PostgresqlFirewallRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.PostgresqlFirewallRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Sets a Node Configuration value on Azure Cosmos DB for PostgreSQL Cluster. */
  def PostgresqlNodeConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.PostgresqlNodeConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.PostgresqlNodeConfigurationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.PostgresqlNodeConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Cosmos DB for PostgreSQL Role. */
  def PostgresqlRole(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.PostgresqlRoleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.PostgresqlRoleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.PostgresqlRole(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a SQL Container within a Cosmos DB Account. */
  def SqlContainer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.SqlContainerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.SqlContainerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.SqlContainer(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a SQL Database within a Cosmos DB Account. */
  def SqlDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.SqlDatabaseArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.SqlDatabaseArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.SqlDatabase(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a SQL Dedicated Gateway within a Cosmos DB Account. */
  def SqlDedicatedGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.SqlDedicatedGatewayArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.cosmosdb.SqlDedicatedGatewayArgs.builder
    com.pulumi.azure.cosmosdb.SqlDedicatedGateway(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an SQL User Defined Function. */
  def SqlFunction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.SqlFunctionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.SqlFunctionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.SqlFunction(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Cosmos DB SQL Role Assignment. */
  def SqlRoleAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.SqlRoleAssignmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.SqlRoleAssignmentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.SqlRoleAssignment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Cosmos DB SQL Role Definition. */
  def SqlRoleDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.SqlRoleDefinitionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.SqlRoleDefinitionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.SqlRoleDefinition(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a SQL Stored Procedure within a Cosmos DB Account SQL Database. */
  def SqlStoredProcedure(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.SqlStoredProcedureArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.SqlStoredProcedureArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.SqlStoredProcedure(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an SQL Trigger. */
  def SqlTrigger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.SqlTriggerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.SqlTriggerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.SqlTrigger(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Table within a Cosmos DB Account. */
  def Table(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.cosmosdb.TableArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.cosmosdb.TableArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.cosmosdb.Table(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
