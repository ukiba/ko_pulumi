package jp.ukiba.ko_pulumi
package azure

object analysisservices_ext:
  extension (builder: com.pulumi.azure.analysisservices.ServerArgs.Builder)
    /**
     * @param ipv4FirewallRules One or more `ipv4FirewallRule` block(s) as defined below.
     * @return builder
     */
    def ipv4FirewallRules(args: Endofunction[com.pulumi.azure.analysisservices.inputs.ServerIpv4FirewallRuleArgs.Builder]*):
        com.pulumi.azure.analysisservices.ServerArgs.Builder =
      def argsBuilder = com.pulumi.azure.analysisservices.inputs.ServerIpv4FirewallRuleArgs.builder
      builder.ipv4FirewallRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.analysisservices.inputs.ServerState.Builder)
    /**
     * @param ipv4FirewallRules One or more `ipv4FirewallRule` block(s) as defined below.
     * @return builder
     */
    def ipv4FirewallRules(args: Endofunction[com.pulumi.azure.analysisservices.inputs.ServerIpv4FirewallRuleArgs.Builder]*):
        com.pulumi.azure.analysisservices.inputs.ServerState.Builder =
      def argsBuilder = com.pulumi.azure.analysisservices.inputs.ServerIpv4FirewallRuleArgs.builder
      builder.ipv4FirewallRules(args.map(_(argsBuilder).build)*)
