package jp.ukiba.ko_pulumi
package aws

object resourcegroups_ext:
  extension (builder: com.pulumi.aws.resourcegroups.GroupArgs.Builder)
    /**
     * @param configurations A configuration associates the resource group with an AWS service and specifies how the service can interact with the resources in the group. See below for details.
     * @return builder
     */
    inline def configurations(args: Endofunction[com.pulumi.aws.resourcegroups.inputs.GroupConfigurationArgs.Builder]*):
        com.pulumi.aws.resourcegroups.GroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.resourcegroups.inputs.GroupConfigurationArgs.builder
      builder.configurations(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceQuery A `resourceQuery` block. Resource queries are documented below.
     * @return builder
     */
    inline def resourceQuery(args: Endofunction[com.pulumi.aws.resourcegroups.inputs.GroupResourceQueryArgs.Builder]):
        com.pulumi.aws.resourcegroups.GroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.resourcegroups.inputs.GroupResourceQueryArgs.builder
      builder.resourceQuery(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.resourcegroups.inputs.GroupConfigurationArgs.Builder)
    /**
     * @param parameters A collection of parameters for this group configuration item. See below for details.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.resourcegroups.inputs.GroupConfigurationParameterArgs.Builder]*):
        com.pulumi.aws.resourcegroups.inputs.GroupConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.resourcegroups.inputs.GroupConfigurationParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.resourcegroups.inputs.GroupState.Builder)
    /**
     * @param configurations A configuration associates the resource group with an AWS service and specifies how the service can interact with the resources in the group. See below for details.
     * @return builder
     */
    inline def configurations(args: Endofunction[com.pulumi.aws.resourcegroups.inputs.GroupConfigurationArgs.Builder]*):
        com.pulumi.aws.resourcegroups.inputs.GroupState.Builder =
      def argsBuilder = com.pulumi.aws.resourcegroups.inputs.GroupConfigurationArgs.builder
      builder.configurations(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceQuery A `resourceQuery` block. Resource queries are documented below.
     * @return builder
     */
    inline def resourceQuery(args: Endofunction[com.pulumi.aws.resourcegroups.inputs.GroupResourceQueryArgs.Builder]):
        com.pulumi.aws.resourcegroups.inputs.GroupState.Builder =
      val argsBuilder = com.pulumi.aws.resourcegroups.inputs.GroupResourceQueryArgs.builder
      builder.resourceQuery(args(argsBuilder).build)
