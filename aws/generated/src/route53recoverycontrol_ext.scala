package jp.ukiba.ko_pulumi
package aws

object route53recoverycontrol_ext:
  extension (builder: com.pulumi.aws.route53recoverycontrol.SafetyRuleArgs.Builder)
    /**
     * @param ruleConfig Configuration block for safety rule criteria. See below.
     * @return builder
     */
    inline def ruleConfig(args: Endofunction[com.pulumi.aws.route53recoverycontrol.inputs.SafetyRuleRuleConfigArgs.Builder]):
        com.pulumi.aws.route53recoverycontrol.SafetyRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53recoverycontrol.inputs.SafetyRuleRuleConfigArgs.builder
      builder.ruleConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53recoverycontrol.inputs.ClusterState.Builder)
    /**
     * @param clusterEndpoints List of 5 endpoints in 5 regions that can be used to talk to the cluster. See below.
     * @return builder
     */
    inline def clusterEndpoints(args: Endofunction[com.pulumi.aws.route53recoverycontrol.inputs.ClusterClusterEndpointArgs.Builder]*):
        com.pulumi.aws.route53recoverycontrol.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.route53recoverycontrol.inputs.ClusterClusterEndpointArgs.builder
      builder.clusterEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53recoverycontrol.inputs.SafetyRuleState.Builder)
    /**
     * @param ruleConfig Configuration block for safety rule criteria. See below.
     * @return builder
     */
    inline def ruleConfig(args: Endofunction[com.pulumi.aws.route53recoverycontrol.inputs.SafetyRuleRuleConfigArgs.Builder]):
        com.pulumi.aws.route53recoverycontrol.inputs.SafetyRuleState.Builder =
      val argsBuilder = com.pulumi.aws.route53recoverycontrol.inputs.SafetyRuleRuleConfigArgs.builder
      builder.ruleConfig(args(argsBuilder).build)
