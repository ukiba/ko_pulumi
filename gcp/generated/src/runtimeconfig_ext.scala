package jp.ukiba.ko_pulumi
package gcp

object runtimeconfig_ext:
  extension (builder: com.pulumi.gcp.runtimeconfig.ConfigIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.runtimeconfig.inputs.ConfigIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.runtimeconfig.ConfigIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.runtimeconfig.inputs.ConfigIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.runtimeconfig.ConfigIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.runtimeconfig.inputs.ConfigIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.runtimeconfig.ConfigIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.runtimeconfig.inputs.ConfigIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.runtimeconfig.inputs.ConfigIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.runtimeconfig.inputs.ConfigIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.runtimeconfig.inputs.ConfigIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.runtimeconfig.inputs.ConfigIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.runtimeconfig.inputs.ConfigIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.runtimeconfig.inputs.ConfigIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.runtimeconfig.inputs.ConfigIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.runtimeconfig.inputs.ConfigIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)
