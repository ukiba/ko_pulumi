package jp.ukiba.ko_pulumi
package gcp

object serviceaccount_ext:
  extension (builder: com.pulumi.gcp.serviceaccount.IAMBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.IAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.serviceaccount.IAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.IAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.serviceaccount.IAMMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.IAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.serviceaccount.IAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.IAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.serviceaccount.inputs.IAMBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.IAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.serviceaccount.inputs.IAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.IAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.serviceaccount.inputs.IAMMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.IAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.serviceaccount.inputs.IAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.IAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)
