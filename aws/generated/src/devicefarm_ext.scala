package jp.ukiba.ko_pulumi
package aws

object devicefarm_ext:
  extension (builder: com.pulumi.aws.devicefarm.DevicePoolArgs.Builder)
    /**
     * @param rules The device pool&#39;s rules. See Rule.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.devicefarm.inputs.DevicePoolRuleArgs.Builder]*):
        com.pulumi.aws.devicefarm.DevicePoolArgs.Builder =
      def argsBuilder = com.pulumi.aws.devicefarm.inputs.DevicePoolRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.devicefarm.TestGridProjectArgs.Builder)
    /**
     * @param vpcConfig The VPC security groups and subnets that are attached to a project. See VPC Config below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.devicefarm.inputs.TestGridProjectVpcConfigArgs.Builder]):
        com.pulumi.aws.devicefarm.TestGridProjectArgs.Builder =
      val argsBuilder = com.pulumi.aws.devicefarm.inputs.TestGridProjectVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.devicefarm.inputs.DevicePoolState.Builder)
    /**
     * @param rules The device pool&#39;s rules. See Rule.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.devicefarm.inputs.DevicePoolRuleArgs.Builder]*):
        com.pulumi.aws.devicefarm.inputs.DevicePoolState.Builder =
      def argsBuilder = com.pulumi.aws.devicefarm.inputs.DevicePoolRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.devicefarm.inputs.TestGridProjectState.Builder)
    /**
     * @param vpcConfig The VPC security groups and subnets that are attached to a project. See VPC Config below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.devicefarm.inputs.TestGridProjectVpcConfigArgs.Builder]):
        com.pulumi.aws.devicefarm.inputs.TestGridProjectState.Builder =
      val argsBuilder = com.pulumi.aws.devicefarm.inputs.TestGridProjectVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)
