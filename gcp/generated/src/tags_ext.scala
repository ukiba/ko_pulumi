package jp.ukiba.ko_pulumi
package gcp

object tags_ext:
  extension (builder: com.pulumi.gcp.tags.TagKeyIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.tags.inputs.TagKeyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.tags.TagKeyIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.tags.inputs.TagKeyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.tags.TagKeyIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.tags.inputs.TagKeyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.tags.TagKeyIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.tags.inputs.TagKeyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.tags.TagValueIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.tags.inputs.TagValueIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.tags.TagValueIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.tags.inputs.TagValueIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.tags.TagValueIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.tags.inputs.TagValueIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.tags.TagValueIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.tags.inputs.TagValueIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.tags.inputs.TagKeyIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.tags.inputs.TagKeyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.tags.inputs.TagKeyIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.tags.inputs.TagKeyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.tags.inputs.TagKeyIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.tags.inputs.TagKeyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.tags.inputs.TagKeyIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.tags.inputs.TagKeyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.tags.inputs.TagValueIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.tags.inputs.TagValueIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.tags.inputs.TagValueIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.tags.inputs.TagValueIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.tags.inputs.TagValueIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.tags.inputs.TagValueIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.tags.inputs.TagValueIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.tags.inputs.TagValueIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)
