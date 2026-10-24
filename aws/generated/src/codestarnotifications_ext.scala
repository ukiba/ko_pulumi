package jp.ukiba.ko_pulumi
package aws

object codestarnotifications_ext:
  extension (builder: com.pulumi.aws.codestarnotifications.NotificationRuleArgs.Builder)
    /**
     * @param targets Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.aws.codestarnotifications.inputs.NotificationRuleTargetArgs.Builder]*):
        com.pulumi.aws.codestarnotifications.NotificationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.codestarnotifications.inputs.NotificationRuleTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codestarnotifications.inputs.NotificationRuleState.Builder)
    /**
     * @param targets Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.aws.codestarnotifications.inputs.NotificationRuleTargetArgs.Builder]*):
        com.pulumi.aws.codestarnotifications.inputs.NotificationRuleState.Builder =
      def argsBuilder = com.pulumi.aws.codestarnotifications.inputs.NotificationRuleTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)
