package jp.ukiba.ko_pulumi
package gcp

object redis_ext:
  extension (builder: com.pulumi.gcp.redis.ClusterAclPolicyArgs.Builder)
    /**
     * @param rules The ACL rules within the ACL policy.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterAclPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.redis.ClusterAclPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterAclPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.redis.ClusterArgs.Builder)
    /**
     * @param automatedBackupConfig The automated backup config for a instance.
     * Structure is documented below.
     * @return builder
     */
    inline def automatedBackupConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigArgs.Builder]):
        com.pulumi.gcp.redis.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigArgs.builder
      builder.automatedBackupConfig(args(argsBuilder).build)

    /**
     * @param crossClusterReplicationConfig Cross cluster replication config
     * Structure is documented below.
     * @return builder
     */
    inline def crossClusterReplicationConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigArgs.Builder]):
        com.pulumi.gcp.redis.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigArgs.builder
      builder.crossClusterReplicationConfig(args(argsBuilder).build)

    /**
     * @param gcsSource Backups stored in Cloud Storage buckets. The Cloud Storage buckets need to be the same region as the clusters.
     * Structure is documented below.
     * @return builder
     */
    inline def gcsSource(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterGcsSourceArgs.Builder]):
        com.pulumi.gcp.redis.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterGcsSourceArgs.builder
      builder.gcsSource(args(argsBuilder).build)

    /**
     * @param maintenancePolicy Maintenance policy for a cluster
     * Structure is documented below.
     * @return builder
     */
    inline def maintenancePolicy(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.redis.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

    /**
     * @param managedBackupSource Backups that generated and managed by memorystore.
     * Structure is documented below.
     * @return builder
     */
    inline def managedBackupSource(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterManagedBackupSourceArgs.Builder]):
        com.pulumi.gcp.redis.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterManagedBackupSourceArgs.builder
      builder.managedBackupSource(args(argsBuilder).build)

    /**
     * @param persistenceConfig Persistence config (RDB, AOF) for the cluster.
     * Structure is documented below.
     * @return builder
     */
    inline def persistenceConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigArgs.Builder]):
        com.pulumi.gcp.redis.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigArgs.builder
      builder.persistenceConfig(args(argsBuilder).build)

    /**
     * @param pscConfigs Required. Each PscConfig configures the consumer network where two
     * network addresses will be designated to the cluster for client access.
     * Currently, only one PscConfig is supported.
     * Structure is documented below.
     * @return builder
     */
    inline def pscConfigs(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterPscConfigArgs.Builder]*):
        com.pulumi.gcp.redis.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterPscConfigArgs.builder
      builder.pscConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param zoneDistributionConfig Immutable. Zone distribution config for Memorystore Redis cluster.
     * Structure is documented below.
     * @return builder
     */
    inline def zoneDistributionConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterZoneDistributionConfigArgs.Builder]):
        com.pulumi.gcp.redis.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterZoneDistributionConfigArgs.builder
      builder.zoneDistributionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.redis.ClusterUserCreatedConnectionsArgs.Builder)
    /**
     * @param clusterEndpoints A list of cluster endpoints
     * Structure is documented below.
     * @return builder
     */
    inline def clusterEndpoints(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointArgs.Builder]*):
        com.pulumi.gcp.redis.ClusterUserCreatedConnectionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointArgs.builder
      builder.clusterEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.redis.InstanceArgs.Builder)
    /**
     * @param maintenancePolicy Maintenance policy for an instance.
     * Structure is documented below.
     * @return builder
     */
    inline def maintenancePolicy(args: Endofunction[com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.redis.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

    /**
     * @param persistenceConfig Persistence configuration for an instance.
     * Structure is documented below.
     * @return builder
     */
    inline def persistenceConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.InstancePersistenceConfigArgs.Builder]):
        com.pulumi.gcp.redis.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.InstancePersistenceConfigArgs.builder
      builder.persistenceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterAclPolicyState.Builder)
    /**
     * @param rules The ACL rules within the ACL policy.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterAclPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterAclPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterAclPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigArgs.Builder)
    /**
     * @param fixedFrequencySchedule Trigger automated backups at a fixed frequency.
     * Structure is documented below.
     * @return builder
     */
    inline def fixedFrequencySchedule(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigFixedFrequencyScheduleArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigFixedFrequencyScheduleArgs.builder
      builder.fixedFrequencySchedule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigFixedFrequencyScheduleArgs.Builder)
    /**
     * @param startTime The start time of every automated backup in UTC.
     * It must be set to the start of an hour. This field is required.
     * Structure is documented below.
     * @return builder
     */
    inline def startTime(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigFixedFrequencyScheduleStartTimeArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigFixedFrequencyScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigFixedFrequencyScheduleStartTimeArgs.builder
      builder.startTime(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigArgs.Builder)
    /**
     * @param memberships (Output)
     * An output only view of all the member clusters participating in cross cluster replication. This field is populated for all the member clusters irrespective of their cluster role.
     * Structure is documented below.
     * @return builder
     */
    inline def memberships(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigMembershipArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigMembershipArgs.builder
      builder.memberships(args.map(_(argsBuilder).build)*)

    /**
     * @param primaryCluster Details of the primary cluster that is used as the replication source for this secondary cluster. This is allowed to be set only for clusters whose cluster role is of type `SECONDARY`.
     * Structure is documented below.
     * @return builder
     */
    inline def primaryCluster(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigPrimaryClusterArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigPrimaryClusterArgs.builder
      builder.primaryCluster(args(argsBuilder).build)

    /**
     * @param secondaryClusters List of secondary clusters that are replicating from this primary cluster. This is allowed to be set only for clusters whose cluster role is of type `PRIMARY`.
     * Structure is documented below.
     * @return builder
     */
    inline def secondaryClusters(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigSecondaryClusterArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigSecondaryClusterArgs.builder
      builder.secondaryClusters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigMembershipArgs.Builder)
    /**
     * @param primaryClusters Details of the primary cluster that is used as the replication source for all the secondary clusters.
     * @return builder
     */
    inline def primaryClusters(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigMembershipPrimaryClusterArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigMembershipArgs.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigMembershipPrimaryClusterArgs.builder
      builder.primaryClusters(args.map(_(argsBuilder).build)*)

    /**
     * @param secondaryClusters List of secondary clusters that are replicating from the primary cluster.
     * @return builder
     */
    inline def secondaryClusters(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigMembershipSecondaryClusterArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigMembershipArgs.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigMembershipSecondaryClusterArgs.builder
      builder.secondaryClusters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterDiscoveryEndpointArgs.Builder)
    /**
     * @param pscConfig Output only. Customer configuration for where the endpoint
     * is created and accessed from.
     * Structure is documented below.
     * @return builder
     */
    inline def pscConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterDiscoveryEndpointPscConfigArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterDiscoveryEndpointArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterDiscoveryEndpointPscConfigArgs.builder
      builder.pscConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyArgs.Builder)
    /**
     * @param weeklyMaintenanceWindows Optional. Maintenance window that is applied to resources covered by this policy.
     * Minimum 1. For the current version, the maximum number
     * of weeklyWindow is expected to be one.
     * Structure is documented below.
     * @return builder
     */
    inline def weeklyMaintenanceWindows(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyWeeklyMaintenanceWindowArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyWeeklyMaintenanceWindowArgs.builder
      builder.weeklyMaintenanceWindows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyWeeklyMaintenanceWindowArgs.Builder)
    /**
     * @param startTime Required. Start time of the window in UTC time.
     * Structure is documented below.
     * @return builder
     */
    inline def startTime(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyWeeklyMaintenanceWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs.builder
      builder.startTime(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterManagedServerCaArgs.Builder)
    /**
     * @param caCerts (Output)
     * The PEM encoded CA certificate chains for redis managed server authentication
     * Structure is documented below.
     * @return builder
     */
    inline def caCerts(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterManagedServerCaCaCertArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterManagedServerCaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterManagedServerCaCaCertArgs.builder
      builder.caCerts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigArgs.Builder)
    /**
     * @param aofConfig AOF configuration. This field will be ignored if mode is not AOF.
     * Structure is documented below.
     * @return builder
     */
    inline def aofConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigAofConfigArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigAofConfigArgs.builder
      builder.aofConfig(args(argsBuilder).build)

    /**
     * @param rdbConfig RDB configuration. This field will be ignored if mode is not RDB.
     * Structure is documented below.
     * @return builder
     */
    inline def rdbConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigRdbConfigArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigRdbConfigArgs.builder
      builder.rdbConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterState.Builder)
    /**
     * @param automatedBackupConfig The automated backup config for a instance.
     * Structure is documented below.
     * @return builder
     */
    inline def automatedBackupConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterAutomatedBackupConfigArgs.builder
      builder.automatedBackupConfig(args(argsBuilder).build)

    /**
     * @param crossClusterReplicationConfig Cross cluster replication config
     * Structure is documented below.
     * @return builder
     */
    inline def crossClusterReplicationConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigArgs.builder
      builder.crossClusterReplicationConfig(args(argsBuilder).build)

    /**
     * @param discoveryEndpoints Output only. Endpoints created on each given network,
     * for Redis clients to connect to the cluster.
     * Currently only one endpoint is supported.
     * Structure is documented below.
     * @return builder
     */
    inline def discoveryEndpoints(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterDiscoveryEndpointArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterDiscoveryEndpointArgs.builder
      builder.discoveryEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param gcsSource Backups stored in Cloud Storage buckets. The Cloud Storage buckets need to be the same region as the clusters.
     * Structure is documented below.
     * @return builder
     */
    inline def gcsSource(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterGcsSourceArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterGcsSourceArgs.builder
      builder.gcsSource(args(argsBuilder).build)

    /**
     * @param maintenancePolicy Maintenance policy for a cluster
     * Structure is documented below.
     * @return builder
     */
    inline def maintenancePolicy(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

    /**
     * @param maintenanceSchedules Upcoming maintenance schedule.
     * Structure is documented below.
     * @return builder
     */
    inline def maintenanceSchedules(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterMaintenanceScheduleArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterMaintenanceScheduleArgs.builder
      builder.maintenanceSchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param managedBackupSource Backups that generated and managed by memorystore.
     * Structure is documented below.
     * @return builder
     */
    inline def managedBackupSource(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterManagedBackupSourceArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterManagedBackupSourceArgs.builder
      builder.managedBackupSource(args(argsBuilder).build)

    /**
     * @param managedServerCas Cluster&#39;s Certificate Authority. This field will only be populated if Redis Cluster&#39;s transitEncryptionMode is TRANSIT_ENCRYPTION_MODE_SERVER_AUTHENTICATION
     * Structure is documented below.
     * @return builder
     */
    inline def managedServerCas(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterManagedServerCaArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterManagedServerCaArgs.builder
      builder.managedServerCas(args.map(_(argsBuilder).build)*)

    /**
     * @param persistenceConfig Persistence config (RDB, AOF) for the cluster.
     * Structure is documented below.
     * @return builder
     */
    inline def persistenceConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterPersistenceConfigArgs.builder
      builder.persistenceConfig(args(argsBuilder).build)

    /**
     * @param pscConfigs Required. Each PscConfig configures the consumer network where two
     * network addresses will be designated to the cluster for client access.
     * Currently, only one PscConfig is supported.
     * Structure is documented below.
     * @return builder
     */
    inline def pscConfigs(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterPscConfigArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterPscConfigArgs.builder
      builder.pscConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param pscConnections Output only. PSC connections for discovery of the cluster topology and accessing the cluster.
     * Structure is documented below.
     * @return builder
     */
    inline def pscConnections(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterPscConnectionArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterPscConnectionArgs.builder
      builder.pscConnections(args.map(_(argsBuilder).build)*)

    /**
     * @param pscServiceAttachments Service attachment details to configure Psc connections.
     * Structure is documented below.
     * @return builder
     */
    inline def pscServiceAttachments(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterPscServiceAttachmentArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterPscServiceAttachmentArgs.builder
      builder.pscServiceAttachments(args.map(_(argsBuilder).build)*)

    /**
     * @param stateInfos Output only. Additional information about the current state of the cluster.
     * Structure is documented below.
     * @return builder
     */
    inline def stateInfos(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterStateInfoArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterStateInfoArgs.builder
      builder.stateInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param zoneDistributionConfig Immutable. Zone distribution config for Memorystore Redis cluster.
     * Structure is documented below.
     * @return builder
     */
    inline def zoneDistributionConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterZoneDistributionConfigArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterZoneDistributionConfigArgs.builder
      builder.zoneDistributionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterStateInfoArgs.Builder)
    /**
     * @param updateInfo A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def updateInfo(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterStateInfoUpdateInfoArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterStateInfoArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterStateInfoUpdateInfoArgs.builder
      builder.updateInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointArgs.Builder)
    /**
     * @param connections Structure is documented below.
     * @return builder
     */
    inline def connections(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointConnectionArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointArgs.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointConnectionArgs.builder
      builder.connections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointConnectionArgs.Builder)
    /**
     * @param pscConnection Detailed information of a PSC connection that is created by the customer
     * who owns the cluster.
     * Structure is documented below.
     * @return builder
     */
    inline def pscConnection(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointConnectionPscConnectionArgs.Builder]):
        com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointConnectionPscConnectionArgs.builder
      builder.pscConnection(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsState.Builder)
    /**
     * @param clusterEndpoints A list of cluster endpoints
     * Structure is documented below.
     * @return builder
     */
    inline def clusterEndpoints(args: Endofunction[com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.ClusterUserCreatedConnectionsClusterEndpointArgs.builder
      builder.clusterEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyArgs.Builder)
    /**
     * @param weeklyMaintenanceWindows Optional. Maintenance window that is applied to resources covered by this policy.
     * Minimum 1. For the current version, the maximum number
     * of weeklyWindow is expected to be one.
     * Structure is documented below.
     * @return builder
     */
    inline def weeklyMaintenanceWindows(args: Endofunction[com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs.builder
      builder.weeklyMaintenanceWindows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs.Builder)
    /**
     * @param startTime Required. Start time of the window in UTC time.
     * Structure is documented below.
     * @return builder
     */
    inline def startTime(args: Endofunction[com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs.Builder]):
        com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs.builder
      builder.startTime(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.redis.inputs.InstanceState.Builder)
    /**
     * @param maintenancePolicy Maintenance policy for an instance.
     * Structure is documented below.
     * @return builder
     */
    inline def maintenancePolicy(args: Endofunction[com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.redis.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

    /**
     * @param maintenanceSchedules Upcoming maintenance schedule.
     * Structure is documented below.
     * @return builder
     */
    inline def maintenanceSchedules(args: Endofunction[com.pulumi.gcp.redis.inputs.InstanceMaintenanceScheduleArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.InstanceMaintenanceScheduleArgs.builder
      builder.maintenanceSchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param nodes Output only. Info per node.
     * Structure is documented below.
     * @return builder
     */
    inline def nodes(args: Endofunction[com.pulumi.gcp.redis.inputs.InstanceNodeArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.InstanceNodeArgs.builder
      builder.nodes(args.map(_(argsBuilder).build)*)

    /**
     * @param persistenceConfig Persistence configuration for an instance.
     * Structure is documented below.
     * @return builder
     */
    inline def persistenceConfig(args: Endofunction[com.pulumi.gcp.redis.inputs.InstancePersistenceConfigArgs.Builder]):
        com.pulumi.gcp.redis.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.redis.inputs.InstancePersistenceConfigArgs.builder
      builder.persistenceConfig(args(argsBuilder).build)

    /**
     * @param serverCaCerts List of server CA certificates for the instance.
     * Structure is documented below.
     * @return builder
     */
    inline def serverCaCerts(args: Endofunction[com.pulumi.gcp.redis.inputs.InstanceServerCaCertArgs.Builder]*):
        com.pulumi.gcp.redis.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.redis.inputs.InstanceServerCaCertArgs.builder
      builder.serverCaCerts(args.map(_(argsBuilder).build)*)
