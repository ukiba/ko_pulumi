package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object rbin:
  extension (builder: com.pulumi.aws.rbin.RuleArgs.Builder)
    /**
     * @param excludeResourceTags Exclusion tags to use to identify resources that are to be excluded, or ignored, by a Region-level retention rule. See `excludeResourceTags` below.
     * @return builder
     */
    def excludeResourceTags(args: Endofunction[com.pulumi.aws.rbin.inputs.RuleExcludeResourceTagArgs.Builder]*):
        com.pulumi.aws.rbin.RuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.rbin.inputs.RuleExcludeResourceTagArgs.builder
      builder.excludeResourceTags(args.map(_(argsBuilder).build)*)

    /**
     * @param lockConfiguration Information about the retention rule lock configuration. See `lockConfiguration` below.
     * @return builder
     */
    def lockConfiguration(args: Endofunction[com.pulumi.aws.rbin.inputs.RuleLockConfigurationArgs.Builder]):
        com.pulumi.aws.rbin.RuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.rbin.inputs.RuleLockConfigurationArgs.builder
      builder.lockConfiguration(args(argsBuilder).build)

    /**
     * @param resourceTags Resource tags to use to identify resources that are to be retained by a tag-level retention rule. See `resourceTags` below.
     * @return builder
     */
    def resourceTags(args: Endofunction[com.pulumi.aws.rbin.inputs.RuleResourceTagArgs.Builder]*):
        com.pulumi.aws.rbin.RuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.rbin.inputs.RuleResourceTagArgs.builder
      builder.resourceTags(args.map(_(argsBuilder).build)*)

    /**
     * @param retentionPeriod Information about the retention period for which the retention rule is to retain resources. See `retentionPeriod` below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def retentionPeriod(args: Endofunction[com.pulumi.aws.rbin.inputs.RuleRetentionPeriodArgs.Builder]):
        com.pulumi.aws.rbin.RuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.rbin.inputs.RuleRetentionPeriodArgs.builder
      builder.retentionPeriod(args(argsBuilder).build)

  /** Resource for managing an AWS RBin Rule. */
  def Rule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rbin.RuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rbin.RuleArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rbin.Rule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.rbin.inputs.RuleState.Builder)
    /**
     * @param excludeResourceTags Exclusion tags to use to identify resources that are to be excluded, or ignored, by a Region-level retention rule. See `excludeResourceTags` below.
     * @return builder
     */
    def excludeResourceTags(args: Endofunction[com.pulumi.aws.rbin.inputs.RuleExcludeResourceTagArgs.Builder]*):
        com.pulumi.aws.rbin.inputs.RuleState.Builder =
      def argsBuilder = com.pulumi.aws.rbin.inputs.RuleExcludeResourceTagArgs.builder
      builder.excludeResourceTags(args.map(_(argsBuilder).build)*)

    /**
     * @param lockConfiguration Information about the retention rule lock configuration. See `lockConfiguration` below.
     * @return builder
     */
    def lockConfiguration(args: Endofunction[com.pulumi.aws.rbin.inputs.RuleLockConfigurationArgs.Builder]):
        com.pulumi.aws.rbin.inputs.RuleState.Builder =
      val argsBuilder = com.pulumi.aws.rbin.inputs.RuleLockConfigurationArgs.builder
      builder.lockConfiguration(args(argsBuilder).build)

    /**
     * @param resourceTags Resource tags to use to identify resources that are to be retained by a tag-level retention rule. See `resourceTags` below.
     * @return builder
     */
    def resourceTags(args: Endofunction[com.pulumi.aws.rbin.inputs.RuleResourceTagArgs.Builder]*):
        com.pulumi.aws.rbin.inputs.RuleState.Builder =
      def argsBuilder = com.pulumi.aws.rbin.inputs.RuleResourceTagArgs.builder
      builder.resourceTags(args.map(_(argsBuilder).build)*)

    /**
     * @param retentionPeriod Information about the retention period for which the retention rule is to retain resources. See `retentionPeriod` below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def retentionPeriod(args: Endofunction[com.pulumi.aws.rbin.inputs.RuleRetentionPeriodArgs.Builder]):
        com.pulumi.aws.rbin.inputs.RuleState.Builder =
      val argsBuilder = com.pulumi.aws.rbin.inputs.RuleRetentionPeriodArgs.builder
      builder.retentionPeriod(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rbin.inputs.RuleLockConfigurationArgs.Builder)
    /**
     * @param unlockDelay Information about the retention rule unlock delay. See `unlockDelay` below.
     * @return builder
     */
    def unlockDelay(args: Endofunction[com.pulumi.aws.rbin.inputs.RuleLockConfigurationUnlockDelayArgs.Builder]):
        com.pulumi.aws.rbin.inputs.RuleLockConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.rbin.inputs.RuleLockConfigurationUnlockDelayArgs.builder
      builder.unlockDelay(args(argsBuilder).build)
