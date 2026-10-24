package jp.ukiba.ko_pulumi
package gcp

object memcache_ext:
  extension (builder: com.pulumi.gcp.memcache.InstanceArgs.Builder)
    /**
     * @param maintenancePolicy Maintenance policy for an instance.
     * Structure is documented below.
     * @return builder
     */
    inline def maintenancePolicy(args: Endofunction[com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.memcache.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

    /**
     * @param memcacheParameters User-specified parameters for this memcache instance.
     * Structure is documented below.
     * @return builder
     */
    inline def memcacheParameters(args: Endofunction[com.pulumi.gcp.memcache.inputs.InstanceMemcacheParametersArgs.Builder]):
        com.pulumi.gcp.memcache.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memcache.inputs.InstanceMemcacheParametersArgs.builder
      builder.memcacheParameters(args(argsBuilder).build)

    /**
     * @param nodeConfig Configuration for memcache nodes.
     * Structure is documented below.
     * @return builder
     */
    inline def nodeConfig(args: Endofunction[com.pulumi.gcp.memcache.inputs.InstanceNodeConfigArgs.Builder]):
        com.pulumi.gcp.memcache.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memcache.inputs.InstanceNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyArgs.Builder)
    /**
     * @param weeklyMaintenanceWindows Required. Maintenance window that is applied to resources covered by this policy.
     * Minimum 1. For the current version, the maximum number of weeklyMaintenanceWindows
     * is expected to be one.
     * Structure is documented below.
     * @return builder
     */
    inline def weeklyMaintenanceWindows(args: Endofunction[com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs.Builder]*):
        com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs.builder
      builder.weeklyMaintenanceWindows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs.Builder)
    /**
     * @param startTime Required. Start time of the window in UTC time.
     * Structure is documented below.
     * @return builder
     */
    inline def startTime(args: Endofunction[com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs.Builder]):
        com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs.builder
      builder.startTime(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.memcache.inputs.InstanceState.Builder)
    /**
     * @param maintenancePolicy Maintenance policy for an instance.
     * Structure is documented below.
     * @return builder
     */
    inline def maintenancePolicy(args: Endofunction[com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.memcache.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

    /**
     * @param maintenanceSchedules Output only. Published maintenance schedule.
     * Structure is documented below.
     * @return builder
     */
    inline def maintenanceSchedules(args: Endofunction[com.pulumi.gcp.memcache.inputs.InstanceMaintenanceScheduleArgs.Builder]*):
        com.pulumi.gcp.memcache.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.memcache.inputs.InstanceMaintenanceScheduleArgs.builder
      builder.maintenanceSchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param memcacheNodes Additional information about the instance state, if available.
     * Structure is documented below.
     * @return builder
     */
    inline def memcacheNodes(args: Endofunction[com.pulumi.gcp.memcache.inputs.InstanceMemcacheNodeArgs.Builder]*):
        com.pulumi.gcp.memcache.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.memcache.inputs.InstanceMemcacheNodeArgs.builder
      builder.memcacheNodes(args.map(_(argsBuilder).build)*)

    /**
     * @param memcacheParameters User-specified parameters for this memcache instance.
     * Structure is documented below.
     * @return builder
     */
    inline def memcacheParameters(args: Endofunction[com.pulumi.gcp.memcache.inputs.InstanceMemcacheParametersArgs.Builder]):
        com.pulumi.gcp.memcache.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.memcache.inputs.InstanceMemcacheParametersArgs.builder
      builder.memcacheParameters(args(argsBuilder).build)

    /**
     * @param nodeConfig Configuration for memcache nodes.
     * Structure is documented below.
     * @return builder
     */
    inline def nodeConfig(args: Endofunction[com.pulumi.gcp.memcache.inputs.InstanceNodeConfigArgs.Builder]):
        com.pulumi.gcp.memcache.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.memcache.inputs.InstanceNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)
