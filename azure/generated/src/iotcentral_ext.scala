package jp.ukiba.ko_pulumi
package azure

object iotcentral_ext:
  extension (builder: com.pulumi.azure.iotcentral.ApplicationArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.iotcentral.inputs.ApplicationIdentityArgs.Builder]):
        com.pulumi.azure.iotcentral.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.azure.iotcentral.inputs.ApplicationIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.iotcentral.ApplicationNetworkRuleSetArgs.Builder)
    /**
     * @param ipRules One or more `ipRule` blocks as defined below.
     * @return builder
     */
    def ipRules(args: Endofunction[com.pulumi.azure.iotcentral.inputs.ApplicationNetworkRuleSetIpRuleArgs.Builder]*):
        com.pulumi.azure.iotcentral.ApplicationNetworkRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.iotcentral.inputs.ApplicationNetworkRuleSetIpRuleArgs.builder
      builder.ipRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.iotcentral.inputs.ApplicationNetworkRuleSetState.Builder)
    /**
     * @param ipRules One or more `ipRule` blocks as defined below.
     * @return builder
     */
    def ipRules(args: Endofunction[com.pulumi.azure.iotcentral.inputs.ApplicationNetworkRuleSetIpRuleArgs.Builder]*):
        com.pulumi.azure.iotcentral.inputs.ApplicationNetworkRuleSetState.Builder =
      def argsBuilder = com.pulumi.azure.iotcentral.inputs.ApplicationNetworkRuleSetIpRuleArgs.builder
      builder.ipRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.iotcentral.inputs.ApplicationState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.iotcentral.inputs.ApplicationIdentityArgs.Builder]):
        com.pulumi.azure.iotcentral.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.azure.iotcentral.inputs.ApplicationIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
