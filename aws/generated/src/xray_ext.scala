package jp.ukiba.ko_pulumi
package aws

object xray_ext:
  extension (builder: com.pulumi.aws.xray.GroupArgs.Builder)
    /**
     * @param insightsConfiguration Configuration options for enabling insights.
     * @return builder
     */
    inline def insightsConfiguration(args: Endofunction[com.pulumi.aws.xray.inputs.GroupInsightsConfigurationArgs.Builder]):
        com.pulumi.aws.xray.GroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.xray.inputs.GroupInsightsConfigurationArgs.builder
      builder.insightsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.xray.IndexingRuleArgs.Builder)
    /**
     * @param rule Rule configuration. See `rule` Block below.
     * @return builder
     */
    inline def rule(args: Endofunction[com.pulumi.aws.xray.inputs.IndexingRuleRuleArgs.Builder]):
        com.pulumi.aws.xray.IndexingRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.xray.inputs.IndexingRuleRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.xray.TraceSegmentDestinationArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.xray.inputs.TraceSegmentDestinationTimeoutsArgs.Builder]):
        com.pulumi.aws.xray.TraceSegmentDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.xray.inputs.TraceSegmentDestinationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.xray.inputs.GroupState.Builder)
    /**
     * @param insightsConfiguration Configuration options for enabling insights.
     * @return builder
     */
    inline def insightsConfiguration(args: Endofunction[com.pulumi.aws.xray.inputs.GroupInsightsConfigurationArgs.Builder]):
        com.pulumi.aws.xray.inputs.GroupState.Builder =
      val argsBuilder = com.pulumi.aws.xray.inputs.GroupInsightsConfigurationArgs.builder
      builder.insightsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.xray.inputs.IndexingRuleRuleArgs.Builder)
    /**
     * @param probabilistic Indexing rule configuration used to probabilistically sample traceIds. See `probabilistic` Block below.
     * @return builder
     */
    inline def probabilistic(args: Endofunction[com.pulumi.aws.xray.inputs.IndexingRuleRuleProbabilisticArgs.Builder]):
        com.pulumi.aws.xray.inputs.IndexingRuleRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.xray.inputs.IndexingRuleRuleProbabilisticArgs.builder
      builder.probabilistic(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.xray.inputs.IndexingRuleState.Builder)
    /**
     * @param rule Rule configuration. See `rule` Block below.
     * @return builder
     */
    inline def rule(args: Endofunction[com.pulumi.aws.xray.inputs.IndexingRuleRuleArgs.Builder]):
        com.pulumi.aws.xray.inputs.IndexingRuleState.Builder =
      val argsBuilder = com.pulumi.aws.xray.inputs.IndexingRuleRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.xray.inputs.TraceSegmentDestinationState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.xray.inputs.TraceSegmentDestinationTimeoutsArgs.Builder]):
        com.pulumi.aws.xray.inputs.TraceSegmentDestinationState.Builder =
      val argsBuilder = com.pulumi.aws.xray.inputs.TraceSegmentDestinationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
