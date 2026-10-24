package jp.ukiba.ko_pulumi
package aws

object appintegrations_ext:
  extension (builder: com.pulumi.aws.appintegrations.DataIntegrationArgs.Builder)
    /**
     * @param scheduleConfig Configuration block that defines the name of the data and how often it should be pulled from the source. See `scheduleConfig` Block for details.
     * @return builder
     */
    def scheduleConfig(args: Endofunction[com.pulumi.aws.appintegrations.inputs.DataIntegrationScheduleConfigArgs.Builder]):
        com.pulumi.aws.appintegrations.DataIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appintegrations.inputs.DataIntegrationScheduleConfigArgs.builder
      builder.scheduleConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appintegrations.inputs.DataIntegrationState.Builder)
    /**
     * @param scheduleConfig Configuration block that defines the name of the data and how often it should be pulled from the source. See `scheduleConfig` Block for details.
     * @return builder
     */
    def scheduleConfig(args: Endofunction[com.pulumi.aws.appintegrations.inputs.DataIntegrationScheduleConfigArgs.Builder]):
        com.pulumi.aws.appintegrations.inputs.DataIntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.appintegrations.inputs.DataIntegrationScheduleConfigArgs.builder
      builder.scheduleConfig(args(argsBuilder).build)
