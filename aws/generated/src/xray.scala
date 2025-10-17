package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object xray:
  /**
   * Creates and manages an AWS XRay Encryption Config.
   * 
   * &gt; **NOTE:** Removing this resource from the provider has no effect to the encryption configuration within X-Ray.
   */
  def EncryptionConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.xray.EncryptionConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.xray.EncryptionConfigArgs.builder
    com.pulumi.aws.xray.EncryptionConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Creates and manages an AWS XRay Group. */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.xray.GroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.xray.GroupArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.xray.Group(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.xray.GroupArgs.Builder)
    /**
     * @param insightsConfiguration Configuration options for enabling insights.
     * @return builder
     */
    def insightsConfiguration(args: Endofunction[com.pulumi.aws.xray.inputs.GroupInsightsConfigurationArgs.Builder]):
        com.pulumi.aws.xray.GroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.xray.inputs.GroupInsightsConfigurationArgs.builder
      builder.insightsConfiguration(args(argsBuilder).build)

  /**
   * Manages an AWS X-Ray indexing rule.
   * 
   * &gt; **Note:** Removing this resource from Terraform has no effect on the indedxing rule within AWS X-Ray.
   */
  def IndexingRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.xray.IndexingRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.xray.IndexingRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.xray.IndexingRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.xray.IndexingRuleArgs.Builder)
    /**
     * @param rule Rule configuration. See `rule` Block below.
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.xray.inputs.IndexingRuleRuleArgs.Builder]):
        com.pulumi.aws.xray.IndexingRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.xray.inputs.IndexingRuleRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  /** Resource for managing an AWS X-Ray Resource Policy. */
  def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.xray.ResourcePolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.xray.ResourcePolicyArgs.builder
    com.pulumi.aws.xray.ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Creates and manages an AWS XRay Sampling Rule. */
  def SamplingRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.xray.SamplingRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.xray.SamplingRuleArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.xray.SamplingRule(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages the destination of data sent to `PutTraceSegments` by AWS X-Ray.
   * 
   * &gt; **Note:** Removing this resource from Terraform has no effect on the destination configuration within AWS X-Ray.
   */
  def TraceSegmentDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.xray.TraceSegmentDestinationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.xray.TraceSegmentDestinationArgs.builder
    com.pulumi.aws.xray.TraceSegmentDestination(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.xray.TraceSegmentDestinationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.xray.inputs.TraceSegmentDestinationTimeoutsArgs.Builder]):
        com.pulumi.aws.xray.TraceSegmentDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.xray.inputs.TraceSegmentDestinationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.xray.inputs.GroupState.Builder)
    /**
     * @param insightsConfiguration Configuration options for enabling insights.
     * @return builder
     */
    def insightsConfiguration(args: Endofunction[com.pulumi.aws.xray.inputs.GroupInsightsConfigurationArgs.Builder]):
        com.pulumi.aws.xray.inputs.GroupState.Builder =
      val argsBuilder = com.pulumi.aws.xray.inputs.GroupInsightsConfigurationArgs.builder
      builder.insightsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.xray.inputs.IndexingRuleRuleArgs.Builder)
    /**
     * @param probabilistic Indexing rule configuration used to probabilistically sample traceIds. See `probabilistic` Block below.
     * @return builder
     */
    def probabilistic(args: Endofunction[com.pulumi.aws.xray.inputs.IndexingRuleRuleProbabilisticArgs.Builder]):
        com.pulumi.aws.xray.inputs.IndexingRuleRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.xray.inputs.IndexingRuleRuleProbabilisticArgs.builder
      builder.probabilistic(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.xray.inputs.IndexingRuleState.Builder)
    /**
     * @param rule Rule configuration. See `rule` Block below.
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.xray.inputs.IndexingRuleRuleArgs.Builder]):
        com.pulumi.aws.xray.inputs.IndexingRuleState.Builder =
      val argsBuilder = com.pulumi.aws.xray.inputs.IndexingRuleRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.xray.inputs.TraceSegmentDestinationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.xray.inputs.TraceSegmentDestinationTimeoutsArgs.Builder]):
        com.pulumi.aws.xray.inputs.TraceSegmentDestinationState.Builder =
      val argsBuilder = com.pulumi.aws.xray.inputs.TraceSegmentDestinationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
