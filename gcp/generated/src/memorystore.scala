package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object memorystore:
  /**
   * Manages user created connections for Memorystore instance
   * 
   *  To get more information about InstanceDesiredUserCreatedEndpoints, see:
   * 
   *  * [API documentation](https://cloud.google.com/memorystore/docs/valkey/reference/rest/v1/projects.locations.instances)
   * 
   *  &gt; **Note:** Please ensure your connections meet the requirements outlined at
   *  https://cloud.google.com/memorystore/docs/valkey/about-multiple-vpc-networking#application_connection_requirements.
   *  If you remove a connections item from the resource, the corresponding forwarding rule will no longer be functioning.
   *  If the corresponding forwarding rule is represented in your terraform configuration it is recommended to delete that
   *  `gcp.compute.ForwardingRule` resource at the same time.
   */
  def InstanceDesiredUserCreatedEndpoints(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.memorystore.InstanceDesiredUserCreatedEndpointsArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.memorystore.InstanceDesiredUserCreatedEndpointsArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.memorystore.InstanceDesiredUserCreatedEndpoints(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object MemorystoreFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to get information about the available instance. For more details refer the [API docs](https://cloud.google.com/memorystore/docs/valkey/reference/rest/v1/projects.locations.instances). */
    inline def getInstance(args: Endofunction[com.pulumi.gcp.memorystore.inputs.GetInstanceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.memorystore.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.GetInstanceArgs.builder
      com.pulumi.gcp.memorystore.MemorystoreFunctions.getInstance(args(argsBuilder).build)

    /** Use this data source to get information about the available instance. For more details refer the [API docs](https://cloud.google.com/memorystore/docs/valkey/reference/rest/v1/projects.locations.instances). */
    inline def getInstancePlain(args: Endofunction[com.pulumi.gcp.memorystore.inputs.GetInstancePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.memorystore.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.GetInstancePlainArgs.builder
      com.pulumi.gcp.memorystore.MemorystoreFunctions.getInstancePlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.memorystore.InstanceArgs.Builder)
    /**
     * @param automatedBackupConfig The automated backup config for a instance.
     *  Structure is documented below.
     * @return builder
     */
    def automatedBackupConfig(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceAutomatedBackupConfigArgs.Builder]):
        com.pulumi.gcp.memorystore.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceAutomatedBackupConfigArgs.builder
      builder.automatedBackupConfig(args(argsBuilder).build)

    /**
     * @param crossInstanceReplicationConfig Cross instance replication config
     *  Structure is documented below.
     * @return builder
     */
    def crossInstanceReplicationConfig(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigArgs.Builder]):
        com.pulumi.gcp.memorystore.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigArgs.builder
      builder.crossInstanceReplicationConfig(args(argsBuilder).build)

    /**
     * @param desiredAutoCreatedEndpoints Immutable. User inputs for the auto-created endpoints connections.
     * @return builder
     */
    def desiredAutoCreatedEndpoints(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceDesiredAutoCreatedEndpointArgs.Builder]*):
        com.pulumi.gcp.memorystore.InstanceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceDesiredAutoCreatedEndpointArgs.builder
      builder.desiredAutoCreatedEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param desiredPscAutoConnections `desiredPscAutoConnections` is deprecated  Use `desiredAutoCreatedEndpoints` instead `pulumi import` will only work with desiredAutoCreatedEndpoints`.
     * @return builder
     * @deprecated `desiredPscAutoConnections` is deprecated. Use `desiredAutoCreatedEndpoints` instead. `terraform import` will only work with desiredAutoCreatedEndpoints`.
     */
    @deprecated def desiredPscAutoConnections(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceDesiredPscAutoConnectionArgs.Builder]*):
        com.pulumi.gcp.memorystore.InstanceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceDesiredPscAutoConnectionArgs.builder
      builder.desiredPscAutoConnections(args.map(_(argsBuilder).build)*)

    /**
     * @param gcsSource GCS source for the instance.
     *  Structure is documented below.
     * @return builder
     */
    def gcsSource(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceGcsSourceArgs.Builder]):
        com.pulumi.gcp.memorystore.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceGcsSourceArgs.builder
      builder.gcsSource(args(argsBuilder).build)

    /**
     * @param maintenancePolicy Maintenance policy for a cluster
     *  Structure is documented below.
     * @return builder
     */
    def maintenancePolicy(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.memorystore.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

    /**
     * @param managedBackupSource Managed backup source for the instance.
     *  Structure is documented below.
     * @return builder
     */
    def managedBackupSource(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceManagedBackupSourceArgs.Builder]):
        com.pulumi.gcp.memorystore.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceManagedBackupSourceArgs.builder
      builder.managedBackupSource(args(argsBuilder).build)

    /**
     * @param persistenceConfig Represents persistence configuration for a instance.
     *  Structure is documented below.
     * @return builder
     */
    def persistenceConfig(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstancePersistenceConfigArgs.Builder]):
        com.pulumi.gcp.memorystore.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstancePersistenceConfigArgs.builder
      builder.persistenceConfig(args(argsBuilder).build)

    /**
     * @param zoneDistributionConfig Zone distribution configuration for allocation of instance resources.
     *  Structure is documented below.
     * @return builder
     */
    def zoneDistributionConfig(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceZoneDistributionConfigArgs.Builder]):
        com.pulumi.gcp.memorystore.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceZoneDistributionConfigArgs.builder
      builder.zoneDistributionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.memorystore.InstanceDesiredUserCreatedEndpointsArgs.Builder)
    /**
     * @param desiredUserCreatedEndpoints A list of desired user endpoints
     *  Structure is documented below.
     * @return builder
     */
    def desiredUserCreatedEndpoints(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceDesiredUserCreatedEndpointsDesiredUserCreatedEndpointArgs.Builder]*):
        com.pulumi.gcp.memorystore.InstanceDesiredUserCreatedEndpointsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceDesiredUserCreatedEndpointsDesiredUserCreatedEndpointArgs.builder
      builder.desiredUserCreatedEndpoints(args.map(_(argsBuilder).build)*)

  /**
   * A Google Cloud Memorystore instance.
   * 
   *  To get more information about Instance, see:
   * 
   *  * [API documentation](https://cloud.google.com/memorystore/docs/valkey/reference/rest/v1/projects.locations.instances)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/memorystore/docs/valkey/create-instances)
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.memorystore.InstanceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.memorystore.InstanceArgs.builder
    com.pulumi.gcp.memorystore.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.memorystore.inputs.InstanceDesiredUserCreatedEndpointsDesiredUserCreatedEndpointConnectionArgs.Builder)
    /**
     * @param pscConnection Detailed information of a PSC connection that is created by the customer
     *  who owns the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def pscConnection(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceDesiredUserCreatedEndpointsDesiredUserCreatedEndpointConnectionPscConnectionArgs.Builder]):
        com.pulumi.gcp.memorystore.inputs.InstanceDesiredUserCreatedEndpointsDesiredUserCreatedEndpointConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceDesiredUserCreatedEndpointsDesiredUserCreatedEndpointConnectionPscConnectionArgs.builder
      builder.pscConnection(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.memorystore.inputs.InstanceAutomatedBackupConfigFixedFrequencyScheduleArgs.Builder)
    /**
     * @param startTime The start time of every automated backup in UTC.
     *  It must be set to the start of an hour. This field is required.
     *  Structure is documented below.
     * @return builder
     */
    def startTime(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceAutomatedBackupConfigFixedFrequencyScheduleStartTimeArgs.Builder]):
        com.pulumi.gcp.memorystore.inputs.InstanceAutomatedBackupConfigFixedFrequencyScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceAutomatedBackupConfigFixedFrequencyScheduleStartTimeArgs.builder
      builder.startTime(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.memorystore.inputs.InstanceEndpointArgs.Builder)
    /**
     * @param connections A group of PSC connections. They are created in the same VPC network, one for each service attachment in the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def connections(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceEndpointConnectionArgs.Builder]*):
        com.pulumi.gcp.memorystore.inputs.InstanceEndpointArgs.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceEndpointConnectionArgs.builder
      builder.connections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigArgs.Builder)
    /**
     * @param memberships (Output)
     *  An output only view of all the member instance participating in cross instance replication. This field is populated for all the member clusters irrespective of their cluster role.
     *  Structure is documented below.
     * @return builder
     */
    def memberships(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigMembershipArgs.Builder]*):
        com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigMembershipArgs.builder
      builder.memberships(args.map(_(argsBuilder).build)*)

    /**
     * @param primaryInstance This field is only set for a secondary instance. Details of the primary instance that is used as the replication source for this secondary instance. This is allowed to be set only for clusters whose cluster role is of type `SECONDARY`.
     *  Structure is documented below.
     * @return builder
     */
    def primaryInstance(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigPrimaryInstanceArgs.Builder]):
        com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigPrimaryInstanceArgs.builder
      builder.primaryInstance(args(argsBuilder).build)

    /**
     * @param secondaryInstances List of secondary instances that are replicating from this primary cluster. This is allowed to be set only for instances whose cluster role is of type `PRIMARY`.
     *  Structure is documented below.
     * @return builder
     */
    def secondaryInstances(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigSecondaryInstanceArgs.Builder]*):
        com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigSecondaryInstanceArgs.builder
      builder.secondaryInstances(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigMembershipArgs.Builder)
    /**
     * @param primaryInstances Details of the primary instance that is used as the replication source for all the secondary instances.
     * @return builder
     */
    def primaryInstances(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigMembershipPrimaryInstanceArgs.Builder]*):
        com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigMembershipArgs.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigMembershipPrimaryInstanceArgs.builder
      builder.primaryInstances(args.map(_(argsBuilder).build)*)

    /**
     * @param secondaryInstances List of secondary instances that are replicating from the primary instance.
     * @return builder
     */
    def secondaryInstances(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigMembershipSecondaryInstanceArgs.Builder]*):
        com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigMembershipArgs.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigMembershipSecondaryInstanceArgs.builder
      builder.secondaryInstances(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.memorystore.inputs.InstanceStateInfoArgs.Builder)
    /**
     * @param updateInfos (Output)
     *  Represents information about instance with state UPDATING.
     *  Structure is documented below.
     * @return builder
     */
    def updateInfos(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceStateInfoUpdateInfoArgs.Builder]*):
        com.pulumi.gcp.memorystore.inputs.InstanceStateInfoArgs.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceStateInfoUpdateInfoArgs.builder
      builder.updateInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.memorystore.inputs.InstanceEndpointConnectionArgs.Builder)
    /**
     * @param pscAutoConnection Detailed information of a PSC connection that is created through service connectivity automation.
     *  Structure is documented below.
     * @return builder
     */
    def pscAutoConnection(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceEndpointConnectionPscAutoConnectionArgs.Builder]):
        com.pulumi.gcp.memorystore.inputs.InstanceEndpointConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceEndpointConnectionPscAutoConnectionArgs.builder
      builder.pscAutoConnection(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.memorystore.inputs.InstanceManagedServerCaArgs.Builder)
    /**
     * @param caCerts (Output)
     *  The PEM encoded CA certificate chains for managed server authentication
     *  Structure is documented below.
     * @return builder
     */
    def caCerts(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceManagedServerCaCaCertArgs.Builder]*):
        com.pulumi.gcp.memorystore.inputs.InstanceManagedServerCaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceManagedServerCaCaCertArgs.builder
      builder.caCerts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.memorystore.inputs.InstancePersistenceConfigArgs.Builder)
    /**
     * @param aofConfig Configuration for AOF based persistence.
     *  Structure is documented below.
     * @return builder
     */
    def aofConfig(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstancePersistenceConfigAofConfigArgs.Builder]):
        com.pulumi.gcp.memorystore.inputs.InstancePersistenceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstancePersistenceConfigAofConfigArgs.builder
      builder.aofConfig(args(argsBuilder).build)

    /**
     * @param rdbConfig Configuration for RDB based persistence.
     *  Structure is documented below.
     * @return builder
     */
    def rdbConfig(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstancePersistenceConfigRdbConfigArgs.Builder]):
        com.pulumi.gcp.memorystore.inputs.InstancePersistenceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstancePersistenceConfigRdbConfigArgs.builder
      builder.rdbConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.memorystore.inputs.InstanceMaintenancePolicyArgs.Builder)
    /**
     * @param weeklyMaintenanceWindows Optional. Maintenance window that is applied to resources covered by this policy.
     *  Minimum 1. For the current version, the maximum number
     *  of weeklyWindow is expected to be one.
     *  Structure is documented below.
     * @return builder
     */
    def weeklyMaintenanceWindows(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs.Builder]*):
        com.pulumi.gcp.memorystore.inputs.InstanceMaintenancePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs.builder
      builder.weeklyMaintenanceWindows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.memorystore.inputs.InstanceDesiredUserCreatedEndpointsState.Builder)
    /**
     * @param desiredUserCreatedEndpoints A list of desired user endpoints
     *  Structure is documented below.
     * @return builder
     */
    def desiredUserCreatedEndpoints(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceDesiredUserCreatedEndpointsDesiredUserCreatedEndpointArgs.Builder]*):
        com.pulumi.gcp.memorystore.inputs.InstanceDesiredUserCreatedEndpointsState.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceDesiredUserCreatedEndpointsDesiredUserCreatedEndpointArgs.builder
      builder.desiredUserCreatedEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.memorystore.inputs.InstanceDesiredUserCreatedEndpointsDesiredUserCreatedEndpointArgs.Builder)
    /**
     * @param connections Structure is documented below.
     * @return builder
     */
    def connections(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceDesiredUserCreatedEndpointsDesiredUserCreatedEndpointConnectionArgs.Builder]*):
        com.pulumi.gcp.memorystore.inputs.InstanceDesiredUserCreatedEndpointsDesiredUserCreatedEndpointArgs.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceDesiredUserCreatedEndpointsDesiredUserCreatedEndpointConnectionArgs.builder
      builder.connections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.memorystore.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs.Builder)
    /**
     * @param startTime Start time of the window in UTC time.
     *  Structure is documented below.
     * @return builder
     */
    def startTime(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs.Builder]):
        com.pulumi.gcp.memorystore.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs.builder
      builder.startTime(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.memorystore.inputs.InstanceAutomatedBackupConfigArgs.Builder)
    /**
     * @param fixedFrequencySchedule Trigger automated backups at a fixed frequency.
     *  Structure is documented below.
     * @return builder
     */
    def fixedFrequencySchedule(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceAutomatedBackupConfigFixedFrequencyScheduleArgs.Builder]):
        com.pulumi.gcp.memorystore.inputs.InstanceAutomatedBackupConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceAutomatedBackupConfigFixedFrequencyScheduleArgs.builder
      builder.fixedFrequencySchedule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.memorystore.inputs.InstanceState.Builder)
    /**
     * @param automatedBackupConfig The automated backup config for a instance.
     *  Structure is documented below.
     * @return builder
     */
    def automatedBackupConfig(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceAutomatedBackupConfigArgs.Builder]):
        com.pulumi.gcp.memorystore.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceAutomatedBackupConfigArgs.builder
      builder.automatedBackupConfig(args(argsBuilder).build)

    /**
     * @param crossInstanceReplicationConfig Cross instance replication config
     *  Structure is documented below.
     * @return builder
     */
    def crossInstanceReplicationConfig(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigArgs.Builder]):
        com.pulumi.gcp.memorystore.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigArgs.builder
      builder.crossInstanceReplicationConfig(args(argsBuilder).build)

    /**
     * @param desiredAutoCreatedEndpoints Immutable. User inputs for the auto-created endpoints connections.
     * @return builder
     */
    def desiredAutoCreatedEndpoints(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceDesiredAutoCreatedEndpointArgs.Builder]*):
        com.pulumi.gcp.memorystore.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceDesiredAutoCreatedEndpointArgs.builder
      builder.desiredAutoCreatedEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param desiredPscAutoConnections `desiredPscAutoConnections` is deprecated  Use `desiredAutoCreatedEndpoints` instead `pulumi import` will only work with desiredAutoCreatedEndpoints`.
     * @return builder
     * @deprecated `desiredPscAutoConnections` is deprecated. Use `desiredAutoCreatedEndpoints` instead. `terraform import` will only work with desiredAutoCreatedEndpoints`.
     */
    @deprecated def desiredPscAutoConnections(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceDesiredPscAutoConnectionArgs.Builder]*):
        com.pulumi.gcp.memorystore.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceDesiredPscAutoConnectionArgs.builder
      builder.desiredPscAutoConnections(args.map(_(argsBuilder).build)*)

    /**
     * @param discoveryEndpoints (Deprecated)
     *  Deprecated. Output only. Endpoints clients can connect to the instance through.
     *  Structure is documented below.
     * @return builder
     * @deprecated This field is deprecated. As a result it will not be populated if the connections are created using `desiredAutoCreatedEndpoints` parameter or `gcp.memorystore.InstanceDesiredUserCreatedEndpoints` resource. Instead of this parameter, for discovery, use `endpoints.connections.pscConnection` and `endpoints.connections.pscAutoConnection` with `connectionType` CONNECTION_TYPE_DISCOVERY.
     */
    @deprecated def discoveryEndpoints(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceDiscoveryEndpointArgs.Builder]*):
        com.pulumi.gcp.memorystore.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceDiscoveryEndpointArgs.builder
      builder.discoveryEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param endpoints Endpoints for the instance.
     *  Structure is documented below.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceEndpointArgs.Builder]*):
        com.pulumi.gcp.memorystore.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param gcsSource GCS source for the instance.
     *  Structure is documented below.
     * @return builder
     */
    def gcsSource(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceGcsSourceArgs.Builder]):
        com.pulumi.gcp.memorystore.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceGcsSourceArgs.builder
      builder.gcsSource(args(argsBuilder).build)

    /**
     * @param maintenancePolicy Maintenance policy for a cluster
     *  Structure is documented below.
     * @return builder
     */
    def maintenancePolicy(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.memorystore.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

    /**
     * @param maintenanceSchedules Upcoming maintenance schedule.
     *  Structure is documented below.
     * @return builder
     */
    def maintenanceSchedules(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceMaintenanceScheduleArgs.Builder]*):
        com.pulumi.gcp.memorystore.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceMaintenanceScheduleArgs.builder
      builder.maintenanceSchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param managedBackupSource Managed backup source for the instance.
     *  Structure is documented below.
     * @return builder
     */
    def managedBackupSource(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceManagedBackupSourceArgs.Builder]):
        com.pulumi.gcp.memorystore.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceManagedBackupSourceArgs.builder
      builder.managedBackupSource(args(argsBuilder).build)

    /**
     * @param managedServerCas Instance&#39;s Certificate Authority. This field will only be populated if instance&#39;s transitEncryptionMode is SERVER_AUTHENTICATION
     *  Structure is documented below.
     * @return builder
     */
    def managedServerCas(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceManagedServerCaArgs.Builder]*):
        com.pulumi.gcp.memorystore.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceManagedServerCaArgs.builder
      builder.managedServerCas(args.map(_(argsBuilder).build)*)

    /**
     * @param nodeConfigs Represents configuration for nodes of the instance.
     *  Structure is documented below.
     * @return builder
     */
    def nodeConfigs(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceNodeConfigArgs.Builder]*):
        com.pulumi.gcp.memorystore.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceNodeConfigArgs.builder
      builder.nodeConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param persistenceConfig Represents persistence configuration for a instance.
     *  Structure is documented below.
     * @return builder
     */
    def persistenceConfig(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstancePersistenceConfigArgs.Builder]):
        com.pulumi.gcp.memorystore.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstancePersistenceConfigArgs.builder
      builder.persistenceConfig(args(argsBuilder).build)

    /**
     * @param pscAttachmentDetails Configuration of a service attachment of the cluster, for creating PSC connections.
     *  Structure is documented below.
     * @return builder
     */
    def pscAttachmentDetails(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstancePscAttachmentDetailArgs.Builder]*):
        com.pulumi.gcp.memorystore.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstancePscAttachmentDetailArgs.builder
      builder.pscAttachmentDetails(args.map(_(argsBuilder).build)*)

    /**
     * @param pscAutoConnections (Deprecated)
     *  Output only. User inputs and resource details of the auto-created PSC connections.
     *  Structure is documented below.
     * @return builder
     * @deprecated `pscAutoConnections` is deprecated  Use `endpoints.connections.pscAutoConnections` instead.
     */
    @deprecated def pscAutoConnections(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstancePscAutoConnectionArgs.Builder]*):
        com.pulumi.gcp.memorystore.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstancePscAutoConnectionArgs.builder
      builder.pscAutoConnections(args.map(_(argsBuilder).build)*)

    /**
     * @param stateInfos Additional information about the state of the instance.
     *  Structure is documented below.
     * @return builder
     */
    def stateInfos(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceStateInfoArgs.Builder]*):
        com.pulumi.gcp.memorystore.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceStateInfoArgs.builder
      builder.stateInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param zoneDistributionConfig Zone distribution configuration for allocation of instance resources.
     *  Structure is documented below.
     * @return builder
     */
    def zoneDistributionConfig(args: Endofunction[com.pulumi.gcp.memorystore.inputs.InstanceZoneDistributionConfigArgs.Builder]):
        com.pulumi.gcp.memorystore.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.InstanceZoneDistributionConfigArgs.builder
      builder.zoneDistributionConfig(args(argsBuilder).build)
