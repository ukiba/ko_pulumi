package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object redis:
  /**
   * A Google Cloud Redis Cluster instance.
   * 
   * To get more information about Cluster, see:
   * 
   * * [API documentation](https://cloud.google.com/memorystore/docs/cluster/reference/rest/v1/projects.locations.clusters)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/memorystore/docs/cluster/)
   * 
   * &gt; **Note:** For [Multiple VPC Networking](https://cloud.google.com/memorystore/docs/cluster/about-multiple-vpc-networking) if you want to use
   * [User-registered PSC Connections](https://cloud.google.com/memorystore/docs/cluster/about-multiple-vpc-networking#psc_connection_types),
   * then please use `gcp.redis.ClusterUserCreatedConnections` resource.
   * 
   * For [Cross Region Replication](https://cloud.google.com/memorystore/docs/cluster/about-cross-region-replication), please follow the instructions below for performing certain update and failover (switchover and detach) operations
   * 
   * **Cross Region Replication**
   * 
   * **Settings updated on primary and propagated to secondaries**
   * 
   * The settings listed [here](https://cloud.google.com/memorystore/docs/cluster/about-cross-region-replication#set_on_primary)
   * are only allowed to be updated on the primary cluster and the changes are automatically propagated to the secondary clusters.
   * To keep the Terraform configuration and state in sync for such settings, please follow the below steps to update them:
   *   1. Update the setting on the primary cluster:
   *       * Update the setting to its new desired value in the Terraform configuration file.
   *       * Execute `pulumi up` to apply the change and wait for it to complete.
   *   2. Detect configuration drift on the secondary cluster(s):
   *       * Execute `pulumi preview`. This should reveal a diff for the modified setting. The proposed value in the pulumi preview should align with the updated value applied to the primary cluster in the preceding step.
   *   3. Reconcile secondary cluster(s) configuration:
   *       * Manually edit the Terraform configuration file(s) for the secondary cluster(s) to update the setting with the latest value from the state.
   *       * Execute `pulumi preview` once again. This should not generate any diff, confirming the configuration is in sync with the infrastructure.
   * 
   * **Switchover**
   * 
   * To perform a [switchover](https://cloud.google.com/memorystore/docs/cluster/working-with-cross-region-replication#perform_a_switchover), please follow the below steps:
   *   1. Ensure that the Terraform configuration file for the secondary cluster that needs to become the new primary has the `crossClusterReplicationConfig` field. If it is not present:
   *       * Add the `crossClusterReplicationConfig` field to the configuration file to match the latest value in the state.
   *       * Execute `pulumi preview`. This should not generate any diff, confirming the configuration is in sync with the infrastructure.
   *   2. Update the `crossClusterReplicationConfig` field of the secondary that needs to become the new primary:
   *       * Change `cross_cluster_replication_config.cluster_role` from `SECONDARY` to `PRIMARY`.
   *       * Remove `cross_cluster_replication_config.primary_cluster` field.
   *       * Set `cross_cluster_replication_config.secondary_clusters` list with the new secondaries. The new secondaries are the current primary and other secondary clusters(if any).
   * 
   *       &gt; You can refer to the current value of `cross_cluster_replication_config.membership` field to lookup the current primary and secondary clusters.
   *   3. Execute switchover:
   *       * Execute`pulumi up` to apply the change and wait for it to complete.
   *   4. Fix any configuration drifts on the previous primary and other secondary clusters:
   *       * Execute `pulumi preview`. If any diffs are reported for `crossClusterReplicationConfig` field:
   *           * Manually update `crossClusterReplicationConfig` field in the configuration file(s) for those clusters with the latest value from the state.
   *           * Execute `pulumi preview` once again. This should not generate any diff, confirming the configuration is in sync with the infrastructure.
   * 
   * **Detach a secondary cluster**
   * 
   * To [detach](https://cloud.google.com/memorystore/docs/cluster/working-with-cross-region-replication#detach_secondary_clusters_option_1) a secondary cluster, please follow the below steps:
   *   1. Ensure that the Terraform configuration file for the secondary cluster that needs to be detached has the `crossClusterReplicationConfig` field. If it is not present:
   *       * Add the `crossClusterReplicationConfig` field to the configuration file to match the latest value in the state.
   *       * Execute `pulumi preview`. This should not generate any diff, confirming the configuration is in sync with the infrastructure.
   *   2. Update the `crossClusterReplicationConfig` field of the secondary that needs to be detached:
   *       * Change `cross_cluster_replication_config.cluster_role` from `SECONDARY` to `NONE`.
   *       * Remove `cross_cluster_replication_config.primary_cluster`.
   *   3. Execute detach:
   *       * Execute`pulumi up` to apply the change and wait for it to complete.
   *   4. Fix any configuration drifts on the primary cluster:
   *       * Execute `pulumi preview`. If any diff is reported for `crossClusterReplicationConfig` field:
   *           * Manually update `crossClusterReplicationConfig` field in the configuration file with the latest value from the state.
   *           * Execute `pulumi preview` once again. This should not generate any diff, confirming the configuration is in sync with the infrastructure.
   * 
   * **Detach secondary cluster(s) via primary cluster**
   * 
   * To [detach](https://cloud.google.com/memorystore/docs/cluster/working-with-cross-region-replication#detach_secondary_clusters_option_2) secondary clusters via primary, please follow the below steps:
   *   1. Ensure that the Terraform configuration file for the primary cluster from which the secondary(ies) has(ve) to be detached has the `crossClusterReplicationConfig` field. If it is not present:
   *       * Add the `crossClusterReplicationConfig` field to the configuration file to match the latest value in the state.
   *       * Execute `pulumi preview`. This should not generate any diff, confirming the configuration is in sync with the infrastructure.
   *   2. Update the `crossClusterReplicationConfig` field of the primary cluster:
   *       * If you are detaching all secondaries from the primary:
   *           * Change `cross_cluster_replication_config.cluster_role` from `PRIMARY` to `NONE`.
   *           * Remove `cross_cluster_replication_config.secondary_clusters` list field.
   *       * If you are detaching a subset of secondaries:
   *           * Update `cross_cluster_replication_config.secondary_clusters` list field to remove the secondary clusters that need to be detached.
   *   3. Execute detach:
   *       * Execute `pulumi up` to apply the change and wait for it to complete.
   *   4. Fix any configuration drifts on the secondary cluster(s) that was detached:
   *       * Execute `pulumi preview`. If any diffs are reported for `crossClusterReplicationConfig` field:
   *           * Manually update `crossClusterReplicationConfig` field in the configuration file(s) for those clusters with the latest value from the state.
   *           * Execute `pulumi preview` once again. This should not generate any diff, confirming the configuration is in sync with the infrastructure.
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.redis.ClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.redis.ClusterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.redis.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Google Cloud Redis Cluster ACL policy.
   * 
   * ## Import
   * 
   * ClusterAclPolicy can be imported using any of these accepted formats:
   * 
   * * `projects/{{project}}/locations/{{location}}/aclPolicies/{{acl_policy_id}}`
   * * `{{project}}/{{location}}/{{acl_policy_id}}`
   * * `{{location}}/{{acl_policy_id}}`
   * 
   * When using the `pulumi import` command, ClusterAclPolicy can be imported using one of the formats above. For example:
   * 
   * ```sh
   * \$ pulumi import gcp:redis/clusterAclPolicy:ClusterAclPolicy default projects/{{project}}/locations/{{location}}/aclPolicies/{{acl_policy_id}}
   * \$ pulumi import gcp:redis/clusterAclPolicy:ClusterAclPolicy default {{project}}/{{location}}/{{acl_policy_id}}
   * \$ pulumi import gcp:redis/clusterAclPolicy:ClusterAclPolicy default {{location}}/{{acl_policy_id}}
   * ```
   */
  def ClusterAclPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.redis.ClusterAclPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.redis.ClusterAclPolicyArgs.builder
    com.pulumi.gcp.redis.ClusterAclPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages user created connections for Redis cluster
   * 
   * To get more information about ClusterUserCreatedConnections, see:
   * 
   * * [API documentation](https://cloud.google.com/memorystore/docs/cluster/reference/rest/v1/projects.locations.clusters)
   * 
   * &gt; **Note:** Please ensure your connections meet the requirements outlined at
   * https://cloud.google.com/memorystore/docs/cluster/about-multiple-vpc-networking.
   * If you remove a connections item from the resource, the corresponding forwarding rule will no longer be functioning.
   * If the corresponding forwarding rule is represented in your terraform configuration it is recommended to delete that
   * `gcp.compute.ForwardingRule` resource at the same time.
   */
  def ClusterUserCreatedConnections(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.redis.ClusterUserCreatedConnectionsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.redis.ClusterUserCreatedConnectionsArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.redis.ClusterUserCreatedConnections(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Google Cloud Redis instance.
   * 
   * To get more information about Instance, see:
   * 
   * * [API documentation](https://cloud.google.com/memorystore/docs/redis/reference/rest/v1/projects.locations.instances)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/memorystore/docs/redis/)
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.redis.InstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.redis.InstanceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.redis.Instance(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object RedisFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to get information about a Redis Cluster. For more details, see the [API documentation](https://cloud.google.com/memorystore/docs/cluster/reference/rest/v1/projects.locations.clusters). */
    inline def getCluster(args: Endofunction[com.pulumi.gcp.redis.inputs.GetClusterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.redis.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.gcp.redis.inputs.GetClusterArgs.builder
      com.pulumi.gcp.redis.RedisFunctions.getCluster(args(argsBuilder).build)

    /** Use this data source to get information about a Redis Cluster. For more details, see the [API documentation](https://cloud.google.com/memorystore/docs/cluster/reference/rest/v1/projects.locations.clusters). */
    inline def getClusterPlain(args: Endofunction[com.pulumi.gcp.redis.inputs.GetClusterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.redis.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.gcp.redis.inputs.GetClusterPlainArgs.builder
      com.pulumi.gcp.redis.RedisFunctions.getClusterPlain(args(argsBuilder).build)

    /** Get information about a Google Cloud Redis Cluster ACL policy. For more information see the [official documentation](https://cloud.google.com/memorystore/docs/redis) or the [API documentation](https://cloud.google.com/memorystore/docs/redis/reference/rest). */
    inline def getClusterAclPolicy(args: Endofunction[com.pulumi.gcp.redis.inputs.GetClusterAclPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.redis.outputs.GetClusterAclPolicyResult] =
      val argsBuilder = com.pulumi.gcp.redis.inputs.GetClusterAclPolicyArgs.builder
      com.pulumi.gcp.redis.RedisFunctions.getClusterAclPolicy(args(argsBuilder).build)

    /** Get information about a Google Cloud Redis Cluster ACL policy. For more information see the [official documentation](https://cloud.google.com/memorystore/docs/redis) or the [API documentation](https://cloud.google.com/memorystore/docs/redis/reference/rest). */
    inline def getClusterAclPolicyPlain(args: Endofunction[com.pulumi.gcp.redis.inputs.GetClusterAclPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.redis.outputs.GetClusterAclPolicyResult] =
      val argsBuilder = com.pulumi.gcp.redis.inputs.GetClusterAclPolicyPlainArgs.builder
      com.pulumi.gcp.redis.RedisFunctions.getClusterAclPolicyPlain(args(argsBuilder).build)

    /** Get info about a Google Cloud Redis instance. */
    inline def getInstance(args: Endofunction[com.pulumi.gcp.redis.inputs.GetInstanceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.redis.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.redis.inputs.GetInstanceArgs.builder
      com.pulumi.gcp.redis.RedisFunctions.getInstance(args(argsBuilder).build)

    /** Get info about a Google Cloud Redis instance. */
    inline def getInstancePlain(args: Endofunction[com.pulumi.gcp.redis.inputs.GetInstancePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.redis.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.redis.inputs.GetInstancePlainArgs.builder
      com.pulumi.gcp.redis.RedisFunctions.getInstancePlain(args(argsBuilder).build)
