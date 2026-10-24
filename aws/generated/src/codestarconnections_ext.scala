package jp.ukiba.ko_pulumi
package aws

object codestarconnections_ext:
  extension (builder: com.pulumi.aws.codestarconnections.HostArgs.Builder)
    /**
     * @param vpcConfiguration The VPC configuration to be provisioned for the host. A VPC must be configured, and the infrastructure to be represented by the host must already be connected to the VPC.
     * @return builder
     */
    inline def vpcConfiguration(args: Endofunction[com.pulumi.aws.codestarconnections.inputs.HostVpcConfigurationArgs.Builder]):
        com.pulumi.aws.codestarconnections.HostArgs.Builder =
      val argsBuilder = com.pulumi.aws.codestarconnections.inputs.HostVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codestarconnections.inputs.HostState.Builder)
    /**
     * @param vpcConfiguration The VPC configuration to be provisioned for the host. A VPC must be configured, and the infrastructure to be represented by the host must already be connected to the VPC.
     * @return builder
     */
    inline def vpcConfiguration(args: Endofunction[com.pulumi.aws.codestarconnections.inputs.HostVpcConfigurationArgs.Builder]):
        com.pulumi.aws.codestarconnections.inputs.HostState.Builder =
      val argsBuilder = com.pulumi.aws.codestarconnections.inputs.HostVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)
