package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object dlm:
  /** Provides a [Data Lifecycle Manager (DLM) lifecycle policy](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-lifecycle.html) for managing snapshots. */
  def LifecyclePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dlm.LifecyclePolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dlm.LifecyclePolicyArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.dlm.LifecyclePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.dlm.LifecyclePolicyArgs.Builder)
    /**
     * @param policyDetails See the `policyDetails` configuration block. Max of 1.
     * @return builder
     */
    def policyDetails(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsArgs.Builder]):
        com.pulumi.aws.dlm.LifecyclePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsArgs.builder
      builder.policyDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleArgs.Builder)
    /**
     * @param archiveRule Specifies a snapshot archiving rule for a schedule. See `archiveRule` block.
     * @return builder
     */
    def archiveRule(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleArchiveRuleArgs.Builder]):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleArgs.Builder =
      val argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleArchiveRuleArgs.builder
      builder.archiveRule(args(argsBuilder).build)

    /**
     * @param createRule See the `createRule` block. Max of 1 per schedule.
     * @return builder
     */
    def createRule(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs.Builder]):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleArgs.Builder =
      val argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs.builder
      builder.createRule(args(argsBuilder).build)

    /**
     * @param crossRegionCopyRules See the `crossRegionCopyRule` block. Max of 3 per schedule.
     * @return builder
     */
    def crossRegionCopyRules(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs.Builder]*):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleArgs.Builder =
      def argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs.builder
      builder.crossRegionCopyRules(args.map(_(argsBuilder).build)*)

    def deprecateRule(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleDeprecateRuleArgs.Builder]):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleArgs.Builder =
      val argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleDeprecateRuleArgs.builder
      builder.deprecateRule(args(argsBuilder).build)

    /**
     * @param fastRestoreRule See the `fastRestoreRule` block. Max of 1 per schedule.
     * @return builder
     */
    def fastRestoreRule(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleFastRestoreRuleArgs.Builder]):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleArgs.Builder =
      val argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleFastRestoreRuleArgs.builder
      builder.fastRestoreRule(args(argsBuilder).build)

    def retainRule(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleRetainRuleArgs.Builder]):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleArgs.Builder =
      val argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleRetainRuleArgs.builder
      builder.retainRule(args(argsBuilder).build)

    /**
     * @param shareRule See the `shareRule` block. Max of 1 per schedule.
     * @return builder
     */
    def shareRule(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleShareRuleArgs.Builder]):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleArgs.Builder =
      val argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleShareRuleArgs.builder
      builder.shareRule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsArgs.Builder)
    /**
     * @param action The actions to be performed when the event-based policy is triggered. You can specify only one action per policy. This parameter is required for event-based policies only. If you are creating a snapshot or AMI policy, omit this parameter. See the `action` configuration block.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsActionArgs.Builder]):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param eventSource The event that triggers the event-based policy. This parameter is required for event-based policies only. If you are creating a snapshot or AMI policy, omit this parameter. See the `eventSource` configuration block.
     * @return builder
     */
    def eventSource(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsEventSourceArgs.Builder]):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsEventSourceArgs.builder
      builder.eventSource(args(argsBuilder).build)

    /**
     * @param exclusions Specifies exclusion parameters for volumes or instances for which you do not want to create snapshots or AMIs.  See the `exclusions` configuration block.
     * @return builder
     */
    def exclusions(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsExclusionsArgs.Builder]):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsExclusionsArgs.builder
      builder.exclusions(args(argsBuilder).build)

    def parameters(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsParametersArgs.Builder]):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

    /**
     * @param schedules See the `schedule` configuration block.
     * @return builder
     */
    def schedules(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleArgs.Builder]*):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsArgs.Builder =
      def argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleArgs.builder
      builder.schedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsActionCrossRegionCopyArgs.Builder)
    /**
     * @param encryptionConfiguration The encryption settings for the copied snapshot. See the `encryptionConfiguration` block. Max of 1 per action.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsActionCrossRegionCopyEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsActionCrossRegionCopyArgs.Builder =
      val argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsActionCrossRegionCopyEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    def retainRule(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRuleArgs.Builder]):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsActionCrossRegionCopyArgs.Builder =
      val argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRuleArgs.builder
      builder.retainRule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleArchiveRuleArchiveRetainRuleArgs.Builder)
    /**
     * @param retentionArchiveTier Information about retention period in the Amazon EBS Snapshots Archive. See the `retentionArchiveTier` block.
     * @return builder
     */
    def retentionArchiveTier(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleArchiveRuleArchiveRetainRuleRetentionArchiveTierArgs.Builder]):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleArchiveRuleArchiveRetainRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleArchiveRuleArchiveRetainRuleRetentionArchiveTierArgs.builder
      builder.retentionArchiveTier(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsActionArgs.Builder)
    /**
     * @param crossRegionCopies The rule for copying shared snapshots across Regions. See the `crossRegionCopy` configuration block.
     * @return builder
     */
    def crossRegionCopies(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsActionCrossRegionCopyArgs.Builder]*):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsActionCrossRegionCopyArgs.builder
      builder.crossRegionCopies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleArchiveRuleArgs.Builder)
    /**
     * @param archiveRetainRule Information about the retention period for the snapshot archiving rule. See the `archiveRetainRule` block.
     * @return builder
     */
    def archiveRetainRule(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleArchiveRuleArchiveRetainRuleArgs.Builder]):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleArchiveRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleArchiveRuleArchiveRetainRuleArgs.builder
      builder.archiveRetainRule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs.Builder)
    def deprecateRule(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleDeprecateRuleArgs.Builder]):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleDeprecateRuleArgs.builder
      builder.deprecateRule(args(argsBuilder).build)

    def retainRule(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs.Builder]):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs.builder
      builder.retainRule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsEventSourceArgs.Builder)
    def parameters(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsEventSourceParametersArgs.Builder]):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsEventSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsEventSourceParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dlm.inputs.LifecyclePolicyState.Builder)
    /**
     * @param policyDetails See the `policyDetails` configuration block. Max of 1.
     * @return builder
     */
    def policyDetails(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsArgs.Builder]):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyState.Builder =
      val argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsArgs.builder
      builder.policyDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs.Builder)
    /**
     * @param scripts Specifies pre and/or post scripts for a snapshot lifecycle policy that targets instances. Valid only when `resourceType` is INSTANCE. See the `scripts` configuration block.
     * @return builder
     */
    def scripts(args: Endofunction[com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCreateRuleScriptsArgs.Builder]):
        com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCreateRuleScriptsArgs.builder
      builder.scripts(args(argsBuilder).build)
