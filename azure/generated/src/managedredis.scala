package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object managedredis:
  /**
   * Manages a Managed Redis Access Policy Assignment.
   * 
   * ## Import
   * 
   * Managed Redis Access Policy Assignments can be imported using the `resource id`, e.g.
   * 
   * ```sh
   * \$ pulumi import azure:managedredis/accessPolicyAssignment:AccessPolicyAssignment example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Cache/redisEnterprise/redis1/databases/default/accessPolicyAssignments/00000000-0000-0000-0000-000000000000
   * ```
   */
  inline def AccessPolicyAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.managedredis.AccessPolicyAssignmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.managedredis.AccessPolicyAssignmentArgs.builder
    com.pulumi.azure.managedredis.AccessPolicyAssignment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages Managed Redis Geo-Replication by linking and unlinking databases in a geo-replication group.
   * 
   * &gt; **Note:** This resource manages the geo-replication group membership for Managed Redis databases. All databases to be linked must have `geoReplicationGroupName` provided with the same value. Linking will [discard cache data and cause temporary outage](https://learn.microsoft.com/azure/redis/how-to-active-geo-replication#add-an-existing-instance-to-an-active-geo-replication-group).
   */
  inline def GeoReplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.managedredis.GeoReplicationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.managedredis.GeoReplicationArgs.builder
    com.pulumi.azure.managedredis.GeoReplication(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a [Managed Redis](https://learn.microsoft.com/azure/redis/overview). This resource supersedes azure.redis.EnterpriseCluster and azure.redis.EnterpriseDatabase resources. Please refer to the migration guide for more information on migrating from Redis Enterprise to Managed Redis: [Migrating from Redis Enterprise to Managed Redis](https://learn.microsoft.com/azure/redis/migrate/migrate-overview). */
  inline def ManagedRedis(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.managedredis.ManagedRedisArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.managedredis.ManagedRedisArgs.builder
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
    com.pulumi.azure.managedredis.ManagedRedis(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object ManagedredisFunctions:
    /** Use this data source to access information about an existing Managed Redis instance. */
    inline def get(args: Endofunction[com.pulumi.azure.managedredis.inputs.GetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.managedredis.outputs.GetResult] =
      val argsBuilder = com.pulumi.azure.managedredis.inputs.GetArgs.builder
      com.pulumi.azure.managedredis.ManagedredisFunctions.get(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Managed Redis instance. */
    inline def getPlain(args: Endofunction[com.pulumi.azure.managedredis.inputs.GetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.managedredis.outputs.GetResult] =
      val argsBuilder = com.pulumi.azure.managedredis.inputs.GetPlainArgs.builder
      com.pulumi.azure.managedredis.ManagedredisFunctions.getPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Managed Redis Access Policy Assignment. */
    inline def getAccessPolicyAssignment(args: Endofunction[com.pulumi.azure.managedredis.inputs.GetAccessPolicyAssignmentArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.managedredis.outputs.GetAccessPolicyAssignmentResult] =
      val argsBuilder = com.pulumi.azure.managedredis.inputs.GetAccessPolicyAssignmentArgs.builder
      com.pulumi.azure.managedredis.ManagedredisFunctions.getAccessPolicyAssignment(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Managed Redis Access Policy Assignment. */
    inline def getAccessPolicyAssignmentPlain(args: Endofunction[com.pulumi.azure.managedredis.inputs.GetAccessPolicyAssignmentPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.managedredis.outputs.GetAccessPolicyAssignmentResult] =
      val argsBuilder = com.pulumi.azure.managedredis.inputs.GetAccessPolicyAssignmentPlainArgs.builder
      com.pulumi.azure.managedredis.ManagedredisFunctions.getAccessPolicyAssignmentPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
