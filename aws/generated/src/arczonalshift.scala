package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object arczonalshift:
  /** Manages the autoshift observer notification status for AWS Application Recovery Controller Zonal Shift. This controls whether autoshift observer notifications are enabled or disabled. */
  def AutoshiftObserverNotificationStatus(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.arczonalshift.AutoshiftObserverNotificationStatusArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.arczonalshift.AutoshiftObserverNotificationStatusArgs.builder
    com.pulumi.aws.arczonalshift.AutoshiftObserverNotificationStatus(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an AWS Application Recovery Controller Zonal Shift Zonal Autoshift Configuration for a managed resource (such as a load balancer).
   * 
   *  Zonal autoshift is a capability in AWS Application Recovery Controller (ARC) that automatically shifts traffic away from an Availability Zone when AWS identifies a potential issue, helping maintain application availability.
   */
  def ZonalAutoshiftConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.arczonalshift.ZonalAutoshiftConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.arczonalshift.ZonalAutoshiftConfigurationArgs.builder
    com.pulumi.aws.arczonalshift.ZonalAutoshiftConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.arczonalshift.ZonalAutoshiftConfigurationArgs.Builder)
    /**
     * @param blockingAlarms List of CloudWatch alarms that can block practice runs when in alarm state. See `blockingAlarms` below.
     * @return builder
     */
    def blockingAlarms(args: Endofunction[com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationBlockingAlarmArgs.Builder]*):
        com.pulumi.aws.arczonalshift.ZonalAutoshiftConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationBlockingAlarmArgs.builder
      builder.blockingAlarms(args.map(_(argsBuilder).build)*)

    /**
     * @param outcomeAlarms List of CloudWatch alarms monitored during practice runs. See `outcomeAlarms` below.
     * @return builder
     */
    def outcomeAlarms(args: Endofunction[com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationOutcomeAlarmArgs.Builder]*):
        com.pulumi.aws.arczonalshift.ZonalAutoshiftConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationOutcomeAlarmArgs.builder
      builder.outcomeAlarms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationState.Builder)
    /**
     * @param blockingAlarms List of CloudWatch alarms that can block practice runs when in alarm state. See `blockingAlarms` below.
     * @return builder
     */
    def blockingAlarms(args: Endofunction[com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationBlockingAlarmArgs.Builder]*):
        com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationBlockingAlarmArgs.builder
      builder.blockingAlarms(args.map(_(argsBuilder).build)*)

    /**
     * @param outcomeAlarms List of CloudWatch alarms monitored during practice runs. See `outcomeAlarms` below.
     * @return builder
     */
    def outcomeAlarms(args: Endofunction[com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationOutcomeAlarmArgs.Builder]*):
        com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.arczonalshift.inputs.ZonalAutoshiftConfigurationOutcomeAlarmArgs.builder
      builder.outcomeAlarms(args.map(_(argsBuilder).build)*)
