package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object redis:
  extension (builder: com.pulumi.gcp.redis.InstanceArgs.Builder)
    /**
     * @param maintenancePolicy Maintenance policy for an instance.
     *  Structure is documented below.
     * @return builder
     */
    def maintenancePolicy(args: Endofunction[com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.redis.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

    /**
     * @param persistenceConfig Persistence configuration for an instance.
     *  Structure is documented below.
     * @return builder
     */
    def persistenceConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.InstancePersistenceConfigArgs.Builder]):
        com.pulumi.gcp.redis.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.InstancePersistenceConfigArgs.builder
      builder.persistenceConfig(args(argsBuilder).build)

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

  /**
   * A Google Cloud Redis Cluster instance.
   * 
   *  To get more information about Cluster, see:
   * 
   *  * [API documentation](https://cloud.google.com/memorystore/docs/cluster/reference/rest/v1/projects.locations.clusters)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/memorystore/docs/cluster/)
   * 
   *  &gt; **Note:** For [Multiple VPC Networking](https://cloud.google.com/memorystore/docs/cluster/about-multiple-vpc-networking) if you want to use
   *  [User-registered PSC Connections](https://cloud.google.com/memorystore/docs/cluster/about-multiple-vpc-networking#psc_connection_types),
   *  then please use `gcp.redis.ClusterUserCreatedConnections` resource.
   * 
   *  For [Cross Region Replication](https://cloud.google.com/memorystore/docs/cluster/about-cross-region-replication), please follow the instructions below for performing certain update and failover (switchover and detach) operations
   * 
   *  **Cross Region Replication**
   * 
   *  **Settings updated on primary and propagated to secondaries**
   * 
   *  The settings listed [here](https://cloud.google.com/memorystore/docs/cluster/about-cross-region-replication#set_on_primary)
   *  are only allowed to be updated on the primary cluster and the changes are automatically propagated to the secondary clusters.
   *  To keep the Terraform configuration and state in sync for such settings, please follow the below steps to update them:
   *    1. Update the setting on the primary cluster:
   *        * Update the setting to its new desired value in the Terraform configuration file.
   *        * Execute `pulumi up` to apply the change and wait for it to complete.
   *    2. Detect configuration drift on the secondary cluster(s):
   *        * Execute `pulumi preview`. This should reveal a diff for the modified setting. The proposed value in the pulumi preview should align with the updated value applied to the primary cluster in the preceding step.
   *    3. Reconcile secondary cluster(s) configuration:
   *        * Manually edit the Terraform configuration file(s) for the secondary cluster(s) to update the setting with the latest value from the state.
   *        * Execute `pulumi preview` once again. This should not generate any diff, confirming the configuration is in sync with the infrastructure.
   * 
   *  **Switchover**
   * 
   *  To perform a [switchover](https://cloud.google.com/memorystore/docs/cluster/working-with-cross-region-replication#perform_a_switchover), please follow the below steps:
   *    1. Ensure that the Terraform configuration file for the secondary cluster that needs to become the new primary has the `crossClusterReplicationConfig` field. If it is not present:
   *        * Add the `crossClusterReplicationConfig` field to the configuration file to match the latest value in the state.
   *        * Execute `pulumi preview`. This should not generate any diff, confirming the configuration is in sync with the infrastructure.
   *    2. Update the `crossClusterReplicationConfig` field of the secondary that needs to become the new primary:
   *        * Change `cross_cluster_replication_config.cluster_role` from `SECONDARY` to `PRIMARY`.
   *        * Remove `cross_cluster_replication_config.primary_cluster` field.
   *        * Set `cross_cluster_replication_config.secondary_clusters` list with the new secondaries. The new secondaries are the current primary and other secondary clusters(if any).
   * 
   *        &gt; You can refer to the current value of `cross_cluster_replication_config.membership` field to lookup the current primary and secondary clusters.
   *    3. Execute switchover:
   *        * Execute`pulumi up` to apply the change and wait for it to complete.
   *    4. Fix any configuration drifts on the previous primary and other secondary clusters:
   *        * Execute `pulumi preview`. If any diffs are reported for `crossClusterReplicationConfig` field:
   *            * Manually update `crossClusterReplicationConfig` field in the configuration file(s) for those clusters with the latest value from the state.
   *            * Execute `pulumi preview` once again. This should not generate any diff, confirming the configuration is in sync with the infrastructure.
   * 
   *  **Detach a secondary cluster**
   * 
   *  To [detach](https://cloud.google.com/memorystore/docs/cluster/working-with-cross-region-replication#detach_secondary_clusters_option_1) a secondary cluster, please follow the below steps:
   *    1. Ensure that the Terraform configuration file for the secondary cluster that needs to be detached has the `crossClusterReplicationConfig` field. If it is not present:
   *        * Add the `crossClusterReplicationConfig` field to the configuration file to match the latest value in the state.
   *        * Execute `pulumi preview`. This should not generate any diff, confirming the configuration is in sync with the infrastructure.
   *    2. Update the `crossClusterReplicationConfig` field of the secondary that needs to be detached:
   *        * Change `cross_cluster_replication_config.cluster_role` from `SECONDARY` to `NONE`.
   *        * Remove `cross_cluster_replication_config.primary_cluster`.
   *    3. Execute detach:
   *        * Execute`pulumi up` to apply the change and wait for it to complete.
   *    4. Fix any configuration drifts on the primary cluster:
   *        * Execute `pulumi preview`. If any diff is reported for `crossClusterReplicationConfig` field:
   *            * Manually update `crossClusterReplicationConfig` field in the configuration file with the latest value from the state.
   *            * Execute `pulumi preview` once again. This should not generate any diff, confirming the configuration is in sync with the infrastructure.
   * 
   *  **Detach secondary cluster(s) via primary cluster**
   * 
   *  To [detach](https://cloud.google.com/memorystore/docs/cluster/working-with-cross-region-replication#detach_secondary_clusters_option_2) secondary clusters via primary, please follow the below steps:
   *    1. Ensure that the Terraform configuration file for the primary cluster from which the secondary(ies) has(ve) to be detached has the `crossClusterReplicationConfig` field. If it is not present:
   *        * Add the `crossClusterReplicationConfig` field to the configuration file to match the latest value in the state.
   *        * Execute `pulumi preview`. This should not generate any diff, confirming the configuration is in sync with the infrastructure.
   *    2. Update the `crossClusterReplicationConfig` field of the primary cluster:
   *        * If you are detaching all secondaries from the primary:
   *            * Change `cross_cluster_replication_config.cluster_role` from `PRIMARY` to `NONE`.
   *            * Remove `cross_cluster_replication_config.secondary_clusters` list field.
   *        * If you are detaching a subset of secondaries:
   *            * Update `cross_cluster_replication_config.secondary_clusters` list field to remove the secondary clusters that need to be detached.
   *    3. Execute detach:
   *        * Execute `pulumi up` to apply the change and wait for it to complete.
   *    4. Fix any configuration drifts on the secondary cluster(s) that was detached:
   *        * Execute `pulumi preview`. If any diffs are reported for `crossClusterReplicationConfig` field:
   *            * Manually update `crossClusterReplicationConfig` field in the configuration file(s) for those clusters with the latest value from the state.
   *            * Execute `pulumi preview` once again. This should not generate any diff, confirming the configuration is in sync with the infrastructure.
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.redis.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.redis.ClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.redis.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.redis.ClusterArgs.Builder)
    /**
     * @param automatedBackupConfig The automated backup config for a instance.
     *  Structure is documented below.
     * @return builder
     */
    def automatedBackupConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigArgs.Builder]):
        com.pulumi.gcp.redis.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigArgs.builder
      builder.automatedBackupConfig(args(argsBuilder).build)

    /**
     * @param crossClusterReplicationConfig Cross cluster replication config
     *  Structure is documented below.
     * @return builder
     */
    def crossClusterReplicationConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigArgs.Builder]):
        com.pulumi.gcp.redis.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigArgs.builder
      builder.crossClusterReplicationConfig(args(argsBuilder).build)

    /**
     * @param gcsSource Backups stored in Cloud Storage buckets. The Cloud Storage buckets need to be the same region as the clusters.
     *  Structure is documented below.
     * @return builder
     */
    def gcsSource(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterGcsSourceArgs.Builder]):
        com.pulumi.gcp.redis.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterGcsSourceArgs.builder
      builder.gcsSource(args(argsBuilder).build)

    /**
     * @param maintenancePolicy Maintenance policy for a cluster
     *  Structure is documented below.
     * @return builder
     */
    def maintenancePolicy(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.redis.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

    /**
     * @param managedBackupSource Backups that generated and managed by memorystore.
     *  Structure is documented below.
     * @return builder
     */
    def managedBackupSource(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterManagedBackupSourceArgs.Builder]):
        com.pulumi.gcp.redis.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterManagedBackupSourceArgs.builder
      builder.managedBackupSource(args(argsBuilder).build)

    /**
     * @param persistenceConfig Persistence config (RDB, AOF) for the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def persistenceConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigArgs.Builder]):
        com.pulumi.gcp.redis.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigArgs.builder
      builder.persistenceConfig(args(argsBuilder).build)

    /**
     * @param pscConfigs Required. Each PscConfig configures the consumer network where two
     *  network addresses will be designated to the cluster for client access.
     *  Currently, only one PscConfig is supported.
     *  Structure is documented below.
     * @return builder
     */
    def pscConfigs(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterPscConfigArgs.Builder]*):
        com.pulumi.gcp.redis.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterPscConfigArgs.builder
      builder.pscConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param zoneDistributionConfig Immutable. Zone distribution config for Memorystore Redis cluster.
     *  Structure is documented below.
     * @return builder
     */
    def zoneDistributionConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterZoneDistributionConfigArgs.Builder]):
        com.pulumi.gcp.redis.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterZoneDistributionConfigArgs.builder
      builder.zoneDistributionConfig(args(argsBuilder).build)

  /**
   * Manages user created connections for Redis cluster
   * 
   *  To get more information about ClusterUserCreatedConnections, see:
   * 
   *  * [API documentation](https://cloud.google.com/memorystore/docs/cluster/reference/rest/v1/projects.locations.clusters)
   * 
   *  &gt; **Note:** Please ensure your connections meet the requirements outlined at
   *  https://cloud.google.com/memorystore/docs/cluster/about-multiple-vpc-networking.
   *  If you remove a connections item from the resource, the corresponding forwarding rule will no longer be functioning.
   *  If the corresponding forwarding rule is represented in your terraform configuration it is recommended to delete that
   *  `gcp.compute.ForwardingRule` resource at the same time.
   */
  def ClusterUserCreatedConnections(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.redis.ClusterUserCreatedConnectionsArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.redis.ClusterUserCreatedConnectionsArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.redis.ClusterUserCreatedConnections(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Google Cloud Redis instance.
   * 
   *  To get more information about Instance, see:
   * 
   *  * [API documentation](https://cloud.google.com/memorystore/docs/redis/reference/rest/v1/projects.locations.instances)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/memorystore/docs/redis/)
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.redis.InstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.redis.InstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.redis.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.redis.ClusterUserCreatedConnectionsArgs.Builder)
    /**
     * @param clusterEndpoints A list of cluster endpoints
     *  Structure is documented below.
     * @return builder
     */
    def clusterEndpoints(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointArgs.Builder]*):
        com.pulumi.gcp.redis.ClusterUserCreatedConnectionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointArgs.builder
      builder.clusterEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsState.Builder)
    /**
     * @param clusterEndpoints A list of cluster endpoints
     *  Structure is documented below.
     * @return builder
     */
    def clusterEndpoints(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointArgs.builder
      builder.clusterEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterState.Builder)
    /**
     * @param automatedBackupConfig The automated backup config for a instance.
     *  Structure is documented below.
     * @return builder
     */
    def automatedBackupConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigArgs.builder
      builder.automatedBackupConfig(args(argsBuilder).build)

    /**
     * @param crossClusterReplicationConfig Cross cluster replication config
     *  Structure is documented below.
     * @return builder
     */
    def crossClusterReplicationConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigArgs.builder
      builder.crossClusterReplicationConfig(args(argsBuilder).build)

    /**
     * @param discoveryEndpoints Output only. Endpoints created on each given network,
     *  for Redis clients to connect to the cluster.
     *  Currently only one endpoint is supported.
     *  Structure is documented below.
     * @return builder
     */
    def discoveryEndpoints(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterDiscoveryEndpointArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterDiscoveryEndpointArgs.builder
      builder.discoveryEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param gcsSource Backups stored in Cloud Storage buckets. The Cloud Storage buckets need to be the same region as the clusters.
     *  Structure is documented below.
     * @return builder
     */
    def gcsSource(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterGcsSourceArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterGcsSourceArgs.builder
      builder.gcsSource(args(argsBuilder).build)

    /**
     * @param maintenancePolicy Maintenance policy for a cluster
     *  Structure is documented below.
     * @return builder
     */
    def maintenancePolicy(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

    /**
     * @param maintenanceSchedules Upcoming maintenance schedule.
     *  Structure is documented below.
     * @return builder
     */
    def maintenanceSchedules(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterMaintenanceScheduleArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterMaintenanceScheduleArgs.builder
      builder.maintenanceSchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param managedBackupSource Backups that generated and managed by memorystore.
     *  Structure is documented below.
     * @return builder
     */
    def managedBackupSource(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterManagedBackupSourceArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterManagedBackupSourceArgs.builder
      builder.managedBackupSource(args(argsBuilder).build)

    /**
     * @param managedServerCas Cluster&#39;s Certificate Authority. This field will only be populated if Redis Cluster&#39;s transitEncryptionMode is TRANSIT_ENCRYPTION_MODE_SERVER_AUTHENTICATION
     *  Structure is documented below.
     * @return builder
     */
    def managedServerCas(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterManagedServerCaArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterManagedServerCaArgs.builder
      builder.managedServerCas(args.map(_(argsBuilder).build)*)

    /**
     * @param persistenceConfig Persistence config (RDB, AOF) for the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def persistenceConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigArgs.builder
      builder.persistenceConfig(args(argsBuilder).build)

    /**
     * @param pscConfigs Required. Each PscConfig configures the consumer network where two
     *  network addresses will be designated to the cluster for client access.
     *  Currently, only one PscConfig is supported.
     *  Structure is documented below.
     * @return builder
     */
    def pscConfigs(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterPscConfigArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterPscConfigArgs.builder
      builder.pscConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param pscConnections Output only. PSC connections for discovery of the cluster topology and accessing the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def pscConnections(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterPscConnectionArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterPscConnectionArgs.builder
      builder.pscConnections(args.map(_(argsBuilder).build)*)

    /**
     * @param pscServiceAttachments Service attachment details to configure Psc connections.
     *  Structure is documented below.
     * @return builder
     */
    def pscServiceAttachments(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterPscServiceAttachmentArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterPscServiceAttachmentArgs.builder
      builder.pscServiceAttachments(args.map(_(argsBuilder).build)*)

    /**
     * @param stateInfos Output only. Additional information about the current state of the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def stateInfos(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterStateInfoArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterStateInfoArgs.builder
      builder.stateInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param zoneDistributionConfig Immutable. Zone distribution config for Memorystore Redis cluster.
     *  Structure is documented below.
     * @return builder
     */
    def zoneDistributionConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterZoneDistributionConfigArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterZoneDistributionConfigArgs.builder
      builder.zoneDistributionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigFixedFrequencyScheduleArgs.Builder)
    /**
     * @param startTime The start time of every automated backup in UTC.
     *  It must be set to the start of an hour. This field is required.
     *  Structure is documented below.
     * @return builder
     */
    def startTime(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigFixedFrequencyScheduleStartTimeArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigFixedFrequencyScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigFixedFrequencyScheduleStartTimeArgs.builder
      builder.startTime(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyWeeklyMaintenanceWindowArgs.Builder)
    /**
     * @param startTime Required. Start time of the window in UTC time.
     *  Structure is documented below.
     * @return builder
     */
    def startTime(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyWeeklyMaintenanceWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs.builder
      builder.startTime(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyArgs.Builder)
    /**
     * @param weeklyMaintenanceWindows Optional. Maintenance window that is applied to resources covered by this policy.
     *  Minimum 1. For the current version, the maximum number
     *  of weeklyWindow is expected to be one.
     *  Structure is documented below.
     * @return builder
     */
    def weeklyMaintenanceWindows(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyWeeklyMaintenanceWindowArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyWeeklyMaintenanceWindowArgs.builder
      builder.weeklyMaintenanceWindows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigArgs.Builder)
    /**
     * @param aofConfig AOF configuration. This field will be ignored if mode is not AOF.
     *  Structure is documented below.
     * @return builder
     */
    def aofConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigAofConfigArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigAofConfigArgs.builder
      builder.aofConfig(args(argsBuilder).build)

    /**
     * @param rdbConfig RDB configuration. This field will be ignored if mode is not RDB.
     *  Structure is documented below.
     * @return builder
     */
    def rdbConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigRdbConfigArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigRdbConfigArgs.builder
      builder.rdbConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterStateInfoArgs.Builder)
    /**
     * @param updateInfo A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def updateInfo(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterStateInfoUpdateInfoArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterStateInfoArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterStateInfoUpdateInfoArgs.builder
      builder.updateInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterDiscoveryEndpointArgs.Builder)
    /**
     * @param pscConfig Output only. Customer configuration for where the endpoint
     *  is created and accessed from.
     *  Structure is documented below.
     * @return builder
     */
    def pscConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterDiscoveryEndpointPscConfigArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterDiscoveryEndpointArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterDiscoveryEndpointPscConfigArgs.builder
      builder.pscConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyArgs.Builder)
    /**
     * @param weeklyMaintenanceWindows Optional. Maintenance window that is applied to resources covered by this policy.
     *  Minimum 1. For the current version, the maximum number
     *  of weeklyWindow is expected to be one.
     *  Structure is documented below.
     * @return builder
     */
    def weeklyMaintenanceWindows(args: Endofunction[com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs.builder
      builder.weeklyMaintenanceWindows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigArgs.Builder)
    /**
     * @param memberships (Output)
     *  An output only view of all the member clusters participating in cross cluster replication. This field is populated for all the member clusters irrespective of their cluster role.
     *  Structure is documented below.
     * @return builder
     */
    def memberships(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigMembershipArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigMembershipArgs.builder
      builder.memberships(args.map(_(argsBuilder).build)*)

    /**
     * @param primaryCluster Details of the primary cluster that is used as the replication source for this secondary cluster. This is allowed to be set only for clusters whose cluster role is of type `SECONDARY`.
     *  Structure is documented below.
     * @return builder
     */
    def primaryCluster(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigPrimaryClusterArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigPrimaryClusterArgs.builder
      builder.primaryCluster(args(argsBuilder).build)

    /**
     * @param secondaryClusters List of secondary clusters that are replicating from this primary cluster. This is allowed to be set only for clusters whose cluster role is of type `PRIMARY`.
     *  Structure is documented below.
     * @return builder
     */
    def secondaryClusters(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigSecondaryClusterArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigSecondaryClusterArgs.builder
      builder.secondaryClusters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointConnectionArgs.Builder)
    /**
     * @param pscConnection Detailed information of a PSC connection that is created by the customer
     *  who owns the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def pscConnection(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointConnectionPscConnectionArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointConnectionPscConnectionArgs.builder
      builder.pscConnection(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigArgs.Builder)
    /**
     * @param fixedFrequencySchedule Trigger automated backups at a fixed frequency.
     *  Structure is documented below.
     * @return builder
     */
    def fixedFrequencySchedule(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigFixedFrequencyScheduleArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigFixedFrequencyScheduleArgs.builder
      builder.fixedFrequencySchedule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigMembershipArgs.Builder)
    /**
     * @param primaryClusters Details of the primary cluster that is used as the replication source for all the secondary clusters.
     * @return builder
     */
    def primaryClusters(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigMembershipPrimaryClusterArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigMembershipArgs.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigMembershipPrimaryClusterArgs.builder
      builder.primaryClusters(args.map(_(argsBuilder).build)*)

    /**
     * @param secondaryClusters List of secondary clusters that are replicating from the primary cluster.
     * @return builder
     */
    def secondaryClusters(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigMembershipSecondaryClusterArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigMembershipArgs.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigMembershipSecondaryClusterArgs.builder
      builder.secondaryClusters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs.Builder)
    /**
     * @param startTime Required. Start time of the window in UTC time.
     *  Structure is documented below.
     * @return builder
     */
    def startTime(args: Endofunction[com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs.Builder]):
        com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs.builder
      builder.startTime(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointArgs.Builder)
    /**
     * @param connections Structure is documented below.
     * @return builder
     */
    def connections(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointConnectionArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointArgs.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointConnectionArgs.builder
      builder.connections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterManagedServerCaArgs.Builder)
    /**
     * @param caCerts (Output)
     *  The PEM encoded CA certificate chains for redis managed server authentication
     *  Structure is documented below.
     * @return builder
     */
    def caCerts(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterManagedServerCaCaCertArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterManagedServerCaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterManagedServerCaCaCertArgs.builder
      builder.caCerts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.redis.inputs.InstanceState.Builder)
    /**
     * @param maintenancePolicy Maintenance policy for an instance.
     *  Structure is documented below.
     * @return builder
     */
    def maintenancePolicy(args: Endofunction[com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.redis.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

    /**
     * @param maintenanceSchedules Upcoming maintenance schedule.
     *  Structure is documented below.
     * @return builder
     */
    def maintenanceSchedules(args: Endofunction[com.pulumi.gcp.redis.inputs.InstanceMaintenanceScheduleArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.InstanceMaintenanceScheduleArgs.builder
      builder.maintenanceSchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param nodes Output only. Info per node.
     *  Structure is documented below.
     * @return builder
     */
    def nodes(args: Endofunction[com.pulumi.gcp.redis.inputs.InstanceNodeArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.InstanceNodeArgs.builder
      builder.nodes(args.map(_(argsBuilder).build)*)

    /**
     * @param persistenceConfig Persistence configuration for an instance.
     *  Structure is documented below.
     * @return builder
     */
    def persistenceConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.InstancePersistenceConfigArgs.Builder]):
        com.pulumi.gcp.redis.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.InstancePersistenceConfigArgs.builder
      builder.persistenceConfig(args(argsBuilder).build)

    /**
     * @param serverCaCerts List of server CA certificates for the instance.
     *  Structure is documented below.
     * @return builder
     */
    def serverCaCerts(args: Endofunction[com.pulumi.gcp.redis.inputs.InstanceServerCaCertArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.InstanceServerCaCertArgs.builder
      builder.serverCaCerts(args.map(_(argsBuilder).build)*)
