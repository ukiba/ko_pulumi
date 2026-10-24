package jp.ukiba.ko_pulumi
package aws

object drs_ext:
  extension (builder: com.pulumi.aws.drs.ReplicationConfigurationTemplateArgs.Builder)
    /**
     * @param pitPolicies Configuration block for Point in time (PIT) policy to manage snapshots taken during replication. See below.
     * @return builder
     */
    def pitPolicies(args: Endofunction[com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplatePitPolicyArgs.Builder]*):
        com.pulumi.aws.drs.ReplicationConfigurationTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplatePitPolicyArgs.builder
      builder.pitPolicies(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplateTimeoutsArgs.Builder]):
        com.pulumi.aws.drs.ReplicationConfigurationTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplateTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplateState.Builder)
    /**
     * @param pitPolicies Configuration block for Point in time (PIT) policy to manage snapshots taken during replication. See below.
     * @return builder
     */
    def pitPolicies(args: Endofunction[com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplatePitPolicyArgs.Builder]*):
        com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplatePitPolicyArgs.builder
      builder.pitPolicies(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplateTimeoutsArgs.Builder]):
        com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplateTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
