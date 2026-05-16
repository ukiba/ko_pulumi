package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object lustre:
  extension (builder: com.pulumi.gcp.lustre.InstanceArgs.Builder)
    /**
     * @param accessRulesOptions IP-based access rules for the Managed Lustre instance. These options
     *  define the root user squash configuration.
     *  Structure is documented below.
     * @return builder
     */
    def accessRulesOptions(args: Endofunction[com.pulumi.gcp.lustre.inputs.InstanceAccessRulesOptionsArgs.Builder]):
        com.pulumi.gcp.lustre.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.lustre.inputs.InstanceAccessRulesOptionsArgs.builder
      builder.accessRulesOptions(args(argsBuilder).build)

    /**
     * @param dynamicTierOptions Dynamic tier options for a Managed Lustre instance.
     *  Structure is documented below.
     * @return builder
     */
    def dynamicTierOptions(args: Endofunction[com.pulumi.gcp.lustre.inputs.InstanceDynamicTierOptionsArgs.Builder]):
        com.pulumi.gcp.lustre.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.lustre.inputs.InstanceDynamicTierOptionsArgs.builder
      builder.dynamicTierOptions(args(argsBuilder).build)

    /**
     * @param maintenancePolicy Defines a maintenance policy for a resource.
     *  Structure is documented below.
     * @return builder
     */
    def maintenancePolicy(args: Endofunction[com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.lustre.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

  /**
   * A Managed Lustre instance
   * 
   *  To get more information about Instance, see:
   * 
   *  * [API documentation](https://cloud.google.com/managed-lustre/docs/reference/rest/v1/projects.locations.instances)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/managed-lustre/docs/create-instance)
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.lustre.InstanceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.lustre.InstanceArgs.builder
    com.pulumi.gcp.lustre.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object LustreFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to get information about a Lustre instance. For more information see the [API docs](https://docs.cloud.google.com/managed-lustre/docs/reference/rest/v1/projects.locations.instances). */
    inline def getInstance(args: Endofunction[com.pulumi.gcp.lustre.inputs.GetInstanceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.lustre.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.lustre.inputs.GetInstanceArgs.builder
      com.pulumi.gcp.lustre.LustreFunctions.getInstance(args(argsBuilder).build)

    /** Use this data source to get information about a Lustre instance. For more information see the [API docs](https://docs.cloud.google.com/managed-lustre/docs/reference/rest/v1/projects.locations.instances). */
    inline def getInstancePlain(args: Endofunction[com.pulumi.gcp.lustre.inputs.GetInstancePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.lustre.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.lustre.inputs.GetInstancePlainArgs.builder
      com.pulumi.gcp.lustre.LustreFunctions.getInstancePlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyMaintenanceExclusionWindowArgs.Builder)
    /**
     * @param endDate Represents a whole or partial calendar date, such as a birthday. The time of
     *  day and time zone are either specified elsewhere or are insignificant. The
     *  date is relative to the Gregorian Calendar. This can represent one of the
     *  following:
     *  * A full date, with non-zero year, month, and day values.
     *  * A month and day, with a zero year (for example, an anniversary).
     *  * A year on its own, with a zero month and a zero day.
     *  * A year and month, with a zero day (for example, a credit card expiration
     *    date).
     *    Related types:
     *  * google.type.TimeOfDay
     *  * google.type.DateTime
     *  * google.protobuf.Timestamp
     *    Structure is documented below.
     * @return builder
     */
    def endDate(args: Endofunction[com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyMaintenanceExclusionWindowEndDateArgs.Builder]):
        com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyMaintenanceExclusionWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyMaintenanceExclusionWindowEndDateArgs.builder
      builder.endDate(args(argsBuilder).build)

    /**
     * @param startDate Represents a whole or partial calendar date, such as a birthday. The time of
     *  day and time zone are either specified elsewhere or are insignificant. The
     *  date is relative to the Gregorian Calendar. This can represent one of the
     *  following:
     *  * A full date, with non-zero year, month, and day values.
     *  * A month and day, with a zero year (for example, an anniversary).
     *  * A year on its own, with a zero month and a zero day.
     *  * A year and month, with a zero day (for example, a credit card expiration
     *    date).
     *    Related types:
     *  * google.type.TimeOfDay
     *  * google.type.DateTime
     *  * google.protobuf.Timestamp
     *    Structure is documented below.
     * @return builder
     */
    def startDate(args: Endofunction[com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyMaintenanceExclusionWindowStartDateArgs.Builder]):
        com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyMaintenanceExclusionWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyMaintenanceExclusionWindowStartDateArgs.builder
      builder.startDate(args(argsBuilder).build)

    /**
     * @param time Represents a time of day. The date and time zone are either not significant
     *  or are specified elsewhere. An API may choose to allow leap seconds. Related
     *  types are google.type.Date and `google.protobuf.Timestamp`.
     *  Structure is documented below.
     * @return builder
     */
    def time(args: Endofunction[com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyMaintenanceExclusionWindowTimeArgs.Builder]):
        com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyMaintenanceExclusionWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyMaintenanceExclusionWindowTimeArgs.builder
      builder.time(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyArgs.Builder)
    /**
     * @param maintenanceExclusionWindow The exclusion windows for the instance. Currently limited to 1 window.
     *  Structure is documented below.
     * @return builder
     */
    def maintenanceExclusionWindow(args: Endofunction[com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyMaintenanceExclusionWindowArgs.Builder]):
        com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyMaintenanceExclusionWindowArgs.builder
      builder.maintenanceExclusionWindow(args(argsBuilder).build)

    /**
     * @param weeklyMaintenanceWindows The weekly maintenance windows for the instance. Currently limited to 1
     *  window.
     *  Structure is documented below.
     * @return builder
     */
    def weeklyMaintenanceWindows(args: Endofunction[com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowsArgs.Builder]):
        com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowsArgs.builder
      builder.weeklyMaintenanceWindows(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.lustre.inputs.InstanceAccessRulesOptionsArgs.Builder)
    /**
     * @param accessRules The access rules for the instance.
     *  Structure is documented below.
     * @return builder
     */
    def accessRules(args: Endofunction[com.pulumi.gcp.lustre.inputs.InstanceAccessRulesOptionsAccessRuleArgs.Builder]*):
        com.pulumi.gcp.lustre.inputs.InstanceAccessRulesOptionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.lustre.inputs.InstanceAccessRulesOptionsAccessRuleArgs.builder
      builder.accessRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowsArgs.Builder)
    /**
     * @param startTime Represents a time of day. The date and time zone are either not significant
     *  or are specified elsewhere. An API may choose to allow leap seconds. Related
     *  types are google.type.Date and `google.protobuf.Timestamp`.
     *  Structure is documented below.
     * @return builder
     */
    def startTime(args: Endofunction[com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowsStartTimeArgs.Builder]):
        com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowsStartTimeArgs.builder
      builder.startTime(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.lustre.inputs.InstanceState.Builder)
    /**
     * @param accessRulesOptions IP-based access rules for the Managed Lustre instance. These options
     *  define the root user squash configuration.
     *  Structure is documented below.
     * @return builder
     */
    def accessRulesOptions(args: Endofunction[com.pulumi.gcp.lustre.inputs.InstanceAccessRulesOptionsArgs.Builder]):
        com.pulumi.gcp.lustre.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.lustre.inputs.InstanceAccessRulesOptionsArgs.builder
      builder.accessRulesOptions(args(argsBuilder).build)

    /**
     * @param dynamicTierOptions Dynamic tier options for a Managed Lustre instance.
     *  Structure is documented below.
     * @return builder
     */
    def dynamicTierOptions(args: Endofunction[com.pulumi.gcp.lustre.inputs.InstanceDynamicTierOptionsArgs.Builder]):
        com.pulumi.gcp.lustre.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.lustre.inputs.InstanceDynamicTierOptionsArgs.builder
      builder.dynamicTierOptions(args(argsBuilder).build)

    /**
     * @param maintenancePolicy Defines a maintenance policy for a resource.
     *  Structure is documented below.
     * @return builder
     */
    def maintenancePolicy(args: Endofunction[com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.lustre.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.lustre.inputs.InstanceMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

    /**
     * @param upcomingMaintenanceSchedules Represents a scheduled maintenance event.
     *  Structure is documented below.
     * @return builder
     */
    def upcomingMaintenanceSchedules(args: Endofunction[com.pulumi.gcp.lustre.inputs.InstanceUpcomingMaintenanceScheduleArgs.Builder]*):
        com.pulumi.gcp.lustre.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.lustre.inputs.InstanceUpcomingMaintenanceScheduleArgs.builder
      builder.upcomingMaintenanceSchedules(args.map(_(argsBuilder).build)*)
