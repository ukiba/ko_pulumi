package jp.ukiba.ko_pulumi
package gcp

object bigquerydatapolicy_ext:
  extension (builder: com.pulumi.gcp.bigquerydatapolicy.DataPolicyArgs.Builder)
    /**
     * @param dataMaskingPolicy The data masking policy that specifies the data masking rule to use.
     * Structure is documented below.
     * @return builder
     */
    def dataMaskingPolicy(args: Endofunction[com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyDataMaskingPolicyArgs.Builder]):
        com.pulumi.gcp.bigquerydatapolicy.DataPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyDataMaskingPolicyArgs.builder
      builder.dataMaskingPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyState.Builder)
    /**
     * @param dataMaskingPolicy The data masking policy that specifies the data masking rule to use.
     * Structure is documented below.
     * @return builder
     */
    def dataMaskingPolicy(args: Endofunction[com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyDataMaskingPolicyArgs.Builder]):
        com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyDataMaskingPolicyArgs.builder
      builder.dataMaskingPolicy(args(argsBuilder).build)
