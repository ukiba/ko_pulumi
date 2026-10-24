package jp.ukiba.ko_pulumi
package aws

object oam_ext:
  extension (builder: com.pulumi.aws.oam.LinkArgs.Builder)
    /**
     * @param linkConfiguration Configuration for creating filters that specify that only some metric namespaces or log groups are to be shared from the source account to the monitoring account. See `linkConfiguration` Block for details.
     * @return builder
     */
    def linkConfiguration(args: Endofunction[com.pulumi.aws.oam.inputs.LinkLinkConfigurationArgs.Builder]):
        com.pulumi.aws.oam.LinkArgs.Builder =
      val argsBuilder = com.pulumi.aws.oam.inputs.LinkLinkConfigurationArgs.builder
      builder.linkConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.oam.inputs.LinkLinkConfigurationArgs.Builder)
    /**
     * @param logGroupConfiguration Configuration for filtering which log groups are to send log events from the source account to the monitoring account. See `logGroupConfiguration` Block for details.
     * @return builder
     */
    def logGroupConfiguration(args: Endofunction[com.pulumi.aws.oam.inputs.LinkLinkConfigurationLogGroupConfigurationArgs.Builder]):
        com.pulumi.aws.oam.inputs.LinkLinkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.oam.inputs.LinkLinkConfigurationLogGroupConfigurationArgs.builder
      builder.logGroupConfiguration(args(argsBuilder).build)

    /**
     * @param metricConfiguration Configuration for filtering which metric namespaces are to be shared from the source account to the monitoring account. See `metricConfiguration` Block for details.
     * @return builder
     */
    def metricConfiguration(args: Endofunction[com.pulumi.aws.oam.inputs.LinkLinkConfigurationMetricConfigurationArgs.Builder]):
        com.pulumi.aws.oam.inputs.LinkLinkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.oam.inputs.LinkLinkConfigurationMetricConfigurationArgs.builder
      builder.metricConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.oam.inputs.LinkState.Builder)
    /**
     * @param linkConfiguration Configuration for creating filters that specify that only some metric namespaces or log groups are to be shared from the source account to the monitoring account. See `linkConfiguration` Block for details.
     * @return builder
     */
    def linkConfiguration(args: Endofunction[com.pulumi.aws.oam.inputs.LinkLinkConfigurationArgs.Builder]):
        com.pulumi.aws.oam.inputs.LinkState.Builder =
      val argsBuilder = com.pulumi.aws.oam.inputs.LinkLinkConfigurationArgs.builder
      builder.linkConfiguration(args(argsBuilder).build)
