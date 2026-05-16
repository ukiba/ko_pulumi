package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object managedredis:
  /** Manages a [Managed Redis](https://learn.microsoft.com/azure/redis/overview). This resource supersedes azure.redis.EnterpriseCluster and azure.redis.EnterpriseDatabase resources. Please refer to the migration guide for more information on migrating from Redis Enterprise to Managed Redis: [Migrating from Redis Enterprise to Managed Redis](https://learn.microsoft.com/azure/redis/migrate/migrate-overview). */
  def ManagedRedis(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.managedredis.ManagedRedisArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.managedredis.ManagedRedisArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.managedredis.ManagedRedis(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages Managed Redis Geo-Replication by linking and unlinking databases in a geo-replication group.
   * 
   *  &gt; **Note:** This resource manages the geo-replication group membership for Managed Redis databases. All databases to be linked must have `geoReplicationGroupName` provided with the same value. Linking will [discard cache data and cause temporary outage](https://learn.microsoft.com/azure/redis/how-to-active-geo-replication#add-an-existing-instance-to-an-active-geo-replication-group).
   */
  def GeoReplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.managedredis.GeoReplicationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.managedredis.GeoReplicationArgs.builder
    com.pulumi.azure.managedredis.GeoReplication(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.managedredis.ManagedRedisArgs.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.managedredis.inputs.ManagedRedisCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.managedredis.ManagedRedisArgs.Builder =
      val argsBuilder = com.pulumi.azure.managedredis.inputs.ManagedRedisCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param defaultDatabase A `defaultDatabase` block as defined below.
     * 
     *  &gt; **Note:** `defaultDatabase` is Required when creating a new Managed Redis.
     * 
     *  &gt; **Note:** A `defaultDatabase` can be deleted or recreated in-place but most properties will trigger an entire cluster replacement if changed. Data will be lost and Managed Redis will be unavailable during recreation.
     * @return builder
     */
    def defaultDatabase(args: Endofunction[com.pulumi.azure.managedredis.inputs.ManagedRedisDefaultDatabaseArgs.Builder]):
        com.pulumi.azure.managedredis.ManagedRedisArgs.Builder =
      val argsBuilder = com.pulumi.azure.managedredis.inputs.ManagedRedisDefaultDatabaseArgs.builder
      builder.defaultDatabase(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.managedredis.inputs.ManagedRedisIdentityArgs.Builder]):
        com.pulumi.azure.managedredis.ManagedRedisArgs.Builder =
      val argsBuilder = com.pulumi.azure.managedredis.inputs.ManagedRedisIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.managedredis.ManagedRedisArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages a Managed Redis Access Policy Assignment.
   * 
   *  ## Import
   * 
   *  Managed Redis Access Policy Assignments can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:managedredis/accessPolicyAssignment:AccessPolicyAssignment example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Cache/redisEnterprise/redis1/databases/default/accessPolicyAssignments/00000000-0000-0000-0000-000000000000
   *  ```
   */
  def AccessPolicyAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.managedredis.AccessPolicyAssignmentArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.managedredis.AccessPolicyAssignmentArgs.builder
    com.pulumi.azure.managedredis.AccessPolicyAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object ManagedredisFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Managed Redis instance. */
    inline def get(args: Endofunction[com.pulumi.azure.managedredis.inputs.GetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.managedredis.outputs.GetResult] =
      val argsBuilder = com.pulumi.azure.managedredis.inputs.GetArgs.builder
      com.pulumi.azure.managedredis.ManagedredisFunctions.get(args(argsBuilder).build)

    /** Use this data source to access information about an existing Managed Redis instance. */
    inline def getPlain(args: Endofunction[com.pulumi.azure.managedredis.inputs.GetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.managedredis.outputs.GetResult] =
      val argsBuilder = com.pulumi.azure.managedredis.inputs.GetPlainArgs.builder
      com.pulumi.azure.managedredis.ManagedredisFunctions.getPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Managed Redis Access Policy Assignment. */
    inline def getAccessPolicyAssignment(args: Endofunction[com.pulumi.azure.managedredis.inputs.GetAccessPolicyAssignmentArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.managedredis.outputs.GetAccessPolicyAssignmentResult] =
      val argsBuilder = com.pulumi.azure.managedredis.inputs.GetAccessPolicyAssignmentArgs.builder
      com.pulumi.azure.managedredis.ManagedredisFunctions.getAccessPolicyAssignment(args(argsBuilder).build)

    /** Use this data source to access information about an existing Managed Redis Access Policy Assignment. */
    inline def getAccessPolicyAssignmentPlain(args: Endofunction[com.pulumi.azure.managedredis.inputs.GetAccessPolicyAssignmentPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.managedredis.outputs.GetAccessPolicyAssignmentResult] =
      val argsBuilder = com.pulumi.azure.managedredis.inputs.GetAccessPolicyAssignmentPlainArgs.builder
      com.pulumi.azure.managedredis.ManagedredisFunctions.getAccessPolicyAssignmentPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.managedredis.inputs.ManagedRedisState.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.managedredis.inputs.ManagedRedisCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.managedredis.inputs.ManagedRedisState.Builder =
      val argsBuilder = com.pulumi.azure.managedredis.inputs.ManagedRedisCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param defaultDatabase A `defaultDatabase` block as defined below.
     * 
     *  &gt; **Note:** `defaultDatabase` is Required when creating a new Managed Redis.
     * 
     *  &gt; **Note:** A `defaultDatabase` can be deleted or recreated in-place but most properties will trigger an entire cluster replacement if changed. Data will be lost and Managed Redis will be unavailable during recreation.
     * @return builder
     */
    def defaultDatabase(args: Endofunction[com.pulumi.azure.managedredis.inputs.ManagedRedisDefaultDatabaseArgs.Builder]):
        com.pulumi.azure.managedredis.inputs.ManagedRedisState.Builder =
      val argsBuilder = com.pulumi.azure.managedredis.inputs.ManagedRedisDefaultDatabaseArgs.builder
      builder.defaultDatabase(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.managedredis.inputs.ManagedRedisIdentityArgs.Builder]):
        com.pulumi.azure.managedredis.inputs.ManagedRedisState.Builder =
      val argsBuilder = com.pulumi.azure.managedredis.inputs.ManagedRedisIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.managedredis.inputs.ManagedRedisState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.managedredis.inputs.ManagedRedisDefaultDatabaseArgs.Builder)
    /**
     * @param modules A `module` block as defined below. Refer to [the modules documentation](https://learn.microsoft.com/azure/redis/redis-modules) to learn more.
     * @return builder
     */
    def modules(args: Endofunction[com.pulumi.azure.managedredis.inputs.ManagedRedisDefaultDatabaseModuleArgs.Builder]*):
        com.pulumi.azure.managedredis.inputs.ManagedRedisDefaultDatabaseArgs.Builder =
      def argsBuilder = com.pulumi.azure.managedredis.inputs.ManagedRedisDefaultDatabaseModuleArgs.builder
      builder.modules(args.map(_(argsBuilder).build)*)
