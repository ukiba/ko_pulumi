package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object xray:
  extension (builder: com.pulumi.aws.xray.GroupArgs.Builder)
    /**
     * @param insightsConfiguration Configuration options for enabling insights.
     * @return builder
     */
    def insightsConfiguration(args: Endofunction[com.pulumi.aws.xray.inputs.GroupInsightsConfigurationArgs.Builder]):
        com.pulumi.aws.xray.GroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.xray.inputs.GroupInsightsConfigurationArgs.builder
      builder.insightsConfiguration(args(argsBuilder).build)

  /** Creates and manages an AWS XRay Sampling Rule. */
  def SamplingRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.xray.SamplingRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.xray.SamplingRuleArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.xray.SamplingRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates and manages an AWS XRay Group. */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.xray.GroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.xray.GroupArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.xray.Group(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS X-Ray Resource Policy. */
  def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.xray.ResourcePolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.xray.ResourcePolicyArgs.builder
    
    com.pulumi.aws.xray.ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Creates and manages an AWS XRay Encryption Config.
   *  
   *  &gt; **NOTE:** Removing this resource from the provider has no effect to the encryption configuration within X-Ray.
   */
  def EncryptionConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.xray.EncryptionConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.xray.EncryptionConfigArgs.builder
    
    com.pulumi.aws.xray.EncryptionConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.xray.inputs.GroupState.Builder)
    /**
     * @param insightsConfiguration Configuration options for enabling insights.
     * @return builder
     */
    def insightsConfiguration(args: Endofunction[com.pulumi.aws.xray.inputs.GroupInsightsConfigurationArgs.Builder]):
        com.pulumi.aws.xray.inputs.GroupState.Builder =
      val argsBuilder = com.pulumi.aws.xray.inputs.GroupInsightsConfigurationArgs.builder
      builder.insightsConfiguration(args(argsBuilder).build)
