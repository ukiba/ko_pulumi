package jp.ukiba.ko_pulumi
package aws

object grafana_ext:
  extension (builder: com.pulumi.aws.grafana.WorkspaceArgs.Builder)
    /**
     * @param networkAccessControl Configuration for network access to your workspace. See `networkAccessControl` Block below.
     * @return builder
     */
    def networkAccessControl(args: Endofunction[com.pulumi.aws.grafana.inputs.WorkspaceNetworkAccessControlArgs.Builder]):
        com.pulumi.aws.grafana.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.grafana.inputs.WorkspaceNetworkAccessControlArgs.builder
      builder.networkAccessControl(args(argsBuilder).build)

    /**
     * @param vpcConfiguration Configuration settings for an Amazon VPC that contains data sources for your Grafana workspace to connect to. See `vpcConfiguration` Block below.
     * @return builder
     */
    def vpcConfiguration(args: Endofunction[com.pulumi.aws.grafana.inputs.WorkspaceVpcConfigurationArgs.Builder]):
        com.pulumi.aws.grafana.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.grafana.inputs.WorkspaceVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.grafana.inputs.WorkspaceState.Builder)
    /**
     * @param networkAccessControl Configuration for network access to your workspace. See `networkAccessControl` Block below.
     * @return builder
     */
    def networkAccessControl(args: Endofunction[com.pulumi.aws.grafana.inputs.WorkspaceNetworkAccessControlArgs.Builder]):
        com.pulumi.aws.grafana.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.aws.grafana.inputs.WorkspaceNetworkAccessControlArgs.builder
      builder.networkAccessControl(args(argsBuilder).build)

    /**
     * @param vpcConfiguration Configuration settings for an Amazon VPC that contains data sources for your Grafana workspace to connect to. See `vpcConfiguration` Block below.
     * @return builder
     */
    def vpcConfiguration(args: Endofunction[com.pulumi.aws.grafana.inputs.WorkspaceVpcConfigurationArgs.Builder]):
        com.pulumi.aws.grafana.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.aws.grafana.inputs.WorkspaceVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)
