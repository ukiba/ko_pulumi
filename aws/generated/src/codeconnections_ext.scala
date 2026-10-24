package jp.ukiba.ko_pulumi
package aws

object codeconnections_ext:
  extension (builder: com.pulumi.aws.codeconnections.ConnectionArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.codeconnections.inputs.ConnectionTimeoutsArgs.Builder]):
        com.pulumi.aws.codeconnections.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.codeconnections.inputs.ConnectionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codeconnections.HostArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.codeconnections.inputs.HostTimeoutsArgs.Builder]):
        com.pulumi.aws.codeconnections.HostArgs.Builder =
      val argsBuilder = com.pulumi.aws.codeconnections.inputs.HostTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vpcConfiguration The VPC configuration to be provisioned for the host. A VPC must be configured, and the infrastructure to be represented by the host must already be connected to the VPC.
     * @return builder
     */
    def vpcConfiguration(args: Endofunction[com.pulumi.aws.codeconnections.inputs.HostVpcConfigurationArgs.Builder]):
        com.pulumi.aws.codeconnections.HostArgs.Builder =
      val argsBuilder = com.pulumi.aws.codeconnections.inputs.HostVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codeconnections.inputs.ConnectionState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.codeconnections.inputs.ConnectionTimeoutsArgs.Builder]):
        com.pulumi.aws.codeconnections.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.codeconnections.inputs.ConnectionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codeconnections.inputs.HostState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.codeconnections.inputs.HostTimeoutsArgs.Builder]):
        com.pulumi.aws.codeconnections.inputs.HostState.Builder =
      val argsBuilder = com.pulumi.aws.codeconnections.inputs.HostTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vpcConfiguration The VPC configuration to be provisioned for the host. A VPC must be configured, and the infrastructure to be represented by the host must already be connected to the VPC.
     * @return builder
     */
    def vpcConfiguration(args: Endofunction[com.pulumi.aws.codeconnections.inputs.HostVpcConfigurationArgs.Builder]):
        com.pulumi.aws.codeconnections.inputs.HostState.Builder =
      val argsBuilder = com.pulumi.aws.codeconnections.inputs.HostVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)
