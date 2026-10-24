package jp.ukiba.ko_pulumi
package gcp

object serviceusage_ext:
  extension (builder: com.pulumi.gcp.serviceusage.V2ConsumerPolicyArgs.Builder)
    /**
     * @param enableRules The consumer policy rule that defines enabled services. The structure is documented below.
     * Structure is documented below.
     * @return builder
     */
    def enableRules(args: Endofunction[com.pulumi.gcp.serviceusage.inputs.V2ConsumerPolicyEnableRuleArgs.Builder]*):
        com.pulumi.gcp.serviceusage.V2ConsumerPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.serviceusage.inputs.V2ConsumerPolicyEnableRuleArgs.builder
      builder.enableRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.serviceusage.inputs.V2ConsumerPolicyState.Builder)
    /**
     * @param enableRules The consumer policy rule that defines enabled services. The structure is documented below.
     * Structure is documented below.
     * @return builder
     */
    def enableRules(args: Endofunction[com.pulumi.gcp.serviceusage.inputs.V2ConsumerPolicyEnableRuleArgs.Builder]*):
        com.pulumi.gcp.serviceusage.inputs.V2ConsumerPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.serviceusage.inputs.V2ConsumerPolicyEnableRuleArgs.builder
      builder.enableRules(args.map(_(argsBuilder).build)*)
