package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object memcache:
  extension (builder: com.pulumi.gcp.memcache.InstanceArgs.Builder)
    /**
     * @param maintenancePolicy Maintenance policy for an instance.
     *  Structure is documented below.
     * @return builder
     */
    def maintenancePolicy(args: Endofunction[com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.memcache.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

    /**
     * @param memcacheParameters User-specified parameters for this memcache instance.
     *  Structure is documented below.
     * @return builder
     */
    def memcacheParameters(args: Endofunction[com.pulumi.gcp.memcache.inputs.InstanceMemcacheParametersArgs.Builder]):
        com.pulumi.gcp.memcache.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memcache.inputs.InstanceMemcacheParametersArgs.builder
      builder.memcacheParameters(args(argsBuilder).build)

    /**
     * @param nodeConfig Configuration for memcache nodes.
     *  Structure is documented below.
     * @return builder
     */
    def nodeConfig(args: Endofunction[com.pulumi.gcp.memcache.inputs.InstanceNodeConfigArgs.Builder]):
        com.pulumi.gcp.memcache.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memcache.inputs.InstanceNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)

  object MemcacheFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to get information about the available instance. For more details refer the [API docs](https://cloud.google.com/memorystore/docs/memcached/reference/rest/v1/projects.locations.instances). */
    inline def getInstance(args: Endofunction[com.pulumi.gcp.memcache.inputs.GetInstanceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.memcache.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.memcache.inputs.GetInstanceArgs.builder
      com.pulumi.gcp.memcache.MemcacheFunctions.getInstance(args(argsBuilder).build)

    /** Use this data source to get information about the available instance. For more details refer the [API docs](https://cloud.google.com/memorystore/docs/memcached/reference/rest/v1/projects.locations.instances). */
    inline def getInstancePlain(args: Endofunction[com.pulumi.gcp.memcache.inputs.GetInstancePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.memcache.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.memcache.inputs.GetInstancePlainArgs.builder
      com.pulumi.gcp.memcache.MemcacheFunctions.getInstancePlain(args(argsBuilder).build)

  /**
   * A Google Cloud Memcache instance.
   * 
   *  To get more information about Instance, see:
   * 
   *  * [API documentation](https://cloud.google.com/memorystore/docs/memcached/reference/rest/v1/projects.locations.instances)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/memcache/docs/creating-instances)
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.memcache.InstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.memcache.InstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.memcache.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyArgs.Builder)
    /**
     * @param weeklyMaintenanceWindows Required. Maintenance window that is applied to resources covered by this policy.
     *  Minimum 1. For the current version, the maximum number of weeklyMaintenanceWindows
     *  is expected to be one.
     *  Structure is documented below.
     * @return builder
     */
    def weeklyMaintenanceWindows(args: Endofunction[com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs.Builder]*):
        com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs.builder
      builder.weeklyMaintenanceWindows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs.Builder)
    /**
     * @param startTime Required. Start time of the window in UTC time.
     *  Structure is documented below.
     * @return builder
     */
    def startTime(args: Endofunction[com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs.Builder]):
        com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs.builder
      builder.startTime(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.memcache.inputs.InstanceState.Builder)
    /**
     * @param maintenancePolicy Maintenance policy for an instance.
     *  Structure is documented below.
     * @return builder
     */
    def maintenancePolicy(args: Endofunction[com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.memcache.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

    /**
     * @param maintenanceSchedules Output only. Published maintenance schedule.
     *  Structure is documented below.
     * @return builder
     */
    def maintenanceSchedules(args: Endofunction[com.pulumi.gcp.memcache.inputs.InstanceMaintenanceScheduleArgs.Builder]*):
        com.pulumi.gcp.memcache.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.memcache.inputs.InstanceMaintenanceScheduleArgs.builder
      builder.maintenanceSchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param memcacheNodes Additional information about the instance state, if available.
     *  Structure is documented below.
     * @return builder
     */
    def memcacheNodes(args: Endofunction[com.pulumi.gcp.memcache.inputs.InstanceMemcacheNodeArgs.Builder]*):
        com.pulumi.gcp.memcache.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.memcache.inputs.InstanceMemcacheNodeArgs.builder
      builder.memcacheNodes(args.map(_(argsBuilder).build)*)

    /**
     * @param memcacheParameters User-specified parameters for this memcache instance.
     *  Structure is documented below.
     * @return builder
     */
    def memcacheParameters(args: Endofunction[com.pulumi.gcp.memcache.inputs.InstanceMemcacheParametersArgs.Builder]):
        com.pulumi.gcp.memcache.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.memcache.inputs.InstanceMemcacheParametersArgs.builder
      builder.memcacheParameters(args(argsBuilder).build)

    /**
     * @param nodeConfig Configuration for memcache nodes.
     *  Structure is documented below.
     * @return builder
     */
    def nodeConfig(args: Endofunction[com.pulumi.gcp.memcache.inputs.InstanceNodeConfigArgs.Builder]):
        com.pulumi.gcp.memcache.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.memcache.inputs.InstanceNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)
