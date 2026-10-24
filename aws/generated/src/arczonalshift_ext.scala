package jp.ukiba.ko_pulumi
package aws

object arczonalshift_ext:
  extension (builder: com.pulumi.aws.arczonalshift.ZonalAutoshiftConfigurationArgs.Builder)
    /**
     * @param blockingAlarms List of CloudWatch alarms that can block practice runs when in alarm state. See `blockingAlarms` below.
     * @return builder
     */
    inline def blockingAlarms(args: Endofunction[com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationBlockingAlarmArgs.Builder]*):
        com.pulumi.aws.arczonalshift.ZonalAutoshiftConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationBlockingAlarmArgs.builder
      builder.blockingAlarms(args.map(_(argsBuilder).build)*)

    /**
     * @param outcomeAlarms List of CloudWatch alarms monitored during practice runs. See `outcomeAlarms` below.
     * @return builder
     */
    inline def outcomeAlarms(args: Endofunction[com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationOutcomeAlarmArgs.Builder]*):
        com.pulumi.aws.arczonalshift.ZonalAutoshiftConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationOutcomeAlarmArgs.builder
      builder.outcomeAlarms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationState.Builder)
    /**
     * @param blockingAlarms List of CloudWatch alarms that can block practice runs when in alarm state. See `blockingAlarms` below.
     * @return builder
     */
    inline def blockingAlarms(args: Endofunction[com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationBlockingAlarmArgs.Builder]*):
        com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationBlockingAlarmArgs.builder
      builder.blockingAlarms(args.map(_(argsBuilder).build)*)

    /**
     * @param outcomeAlarms List of CloudWatch alarms monitored during practice runs. See `outcomeAlarms` below.
     * @return builder
     */
    inline def outcomeAlarms(args: Endofunction[com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationOutcomeAlarmArgs.Builder]*):
        com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationOutcomeAlarmArgs.builder
      builder.outcomeAlarms(args.map(_(argsBuilder).build)*)
