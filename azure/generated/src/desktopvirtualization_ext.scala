package jp.ukiba.ko_pulumi
package azure

object desktopvirtualization_ext:
  extension (builder: com.pulumi.azure.desktopvirtualization.HostPoolArgs.Builder)
    /**
     * @param scheduledAgentUpdates A `scheduledAgentUpdates` block as defined below. This enables control of when Agent Updates will be applied to Session Hosts.
     * @return builder
     */
    inline def scheduledAgentUpdates(args: Endofunction[com.pulumi.azure.desktopvirtualization.inputs.HostPoolScheduledAgentUpdatesArgs.Builder]):
        com.pulumi.azure.desktopvirtualization.HostPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.desktopvirtualization.inputs.HostPoolScheduledAgentUpdatesArgs.builder
      builder.scheduledAgentUpdates(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.desktopvirtualization.ScalingPlanArgs.Builder)
    /**
     * @param hostPools One or more `hostPool` blocks as defined below.
     * @return builder
     */
    inline def hostPools(args: Endofunction[com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanHostPoolArgs.Builder]*):
        com.pulumi.azure.desktopvirtualization.ScalingPlanArgs.Builder =
      def argsBuilder = com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanHostPoolArgs.builder
      builder.hostPools(args.map(_(argsBuilder).build)*)

    /**
     * @param schedules One or more `schedule` blocks as defined below.
     * @return builder
     */
    inline def schedules(args: Endofunction[com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanScheduleArgs.Builder]*):
        com.pulumi.azure.desktopvirtualization.ScalingPlanArgs.Builder =
      def argsBuilder = com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanScheduleArgs.builder
      builder.schedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.desktopvirtualization.inputs.HostPoolScheduledAgentUpdatesArgs.Builder)
    /**
     * @param schedules A `schedule` block as defined below. A maximum of two blocks can be added.
     * @return builder
     */
    inline def schedules(args: Endofunction[com.pulumi.azure.desktopvirtualization.inputs.HostPoolScheduledAgentUpdatesScheduleArgs.Builder]*):
        com.pulumi.azure.desktopvirtualization.inputs.HostPoolScheduledAgentUpdatesArgs.Builder =
      def argsBuilder = com.pulumi.azure.desktopvirtualization.inputs.HostPoolScheduledAgentUpdatesScheduleArgs.builder
      builder.schedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.desktopvirtualization.inputs.HostPoolState.Builder)
    /**
     * @param scheduledAgentUpdates A `scheduledAgentUpdates` block as defined below. This enables control of when Agent Updates will be applied to Session Hosts.
     * @return builder
     */
    inline def scheduledAgentUpdates(args: Endofunction[com.pulumi.azure.desktopvirtualization.inputs.HostPoolScheduledAgentUpdatesArgs.Builder]):
        com.pulumi.azure.desktopvirtualization.inputs.HostPoolState.Builder =
      val argsBuilder = com.pulumi.azure.desktopvirtualization.inputs.HostPoolScheduledAgentUpdatesArgs.builder
      builder.scheduledAgentUpdates(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanState.Builder)
    /**
     * @param hostPools One or more `hostPool` blocks as defined below.
     * @return builder
     */
    inline def hostPools(args: Endofunction[com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanHostPoolArgs.Builder]*):
        com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanState.Builder =
      def argsBuilder = com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanHostPoolArgs.builder
      builder.hostPools(args.map(_(argsBuilder).build)*)

    /**
     * @param schedules One or more `schedule` blocks as defined below.
     * @return builder
     */
    inline def schedules(args: Endofunction[com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanScheduleArgs.Builder]*):
        com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanState.Builder =
      def argsBuilder = com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanScheduleArgs.builder
      builder.schedules(args.map(_(argsBuilder).build)*)
