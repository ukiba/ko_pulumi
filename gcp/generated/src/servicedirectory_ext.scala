package jp.ukiba.ko_pulumi
package gcp

object servicedirectory_ext:
  extension (builder: com.pulumi.gcp.servicedirectory.NamespaceIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.servicedirectory.inputs.NamespaceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.servicedirectory.NamespaceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.servicedirectory.inputs.NamespaceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.servicedirectory.NamespaceIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.servicedirectory.inputs.NamespaceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.servicedirectory.NamespaceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.servicedirectory.inputs.NamespaceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.servicedirectory.ServiceIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.servicedirectory.inputs.ServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.servicedirectory.ServiceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.servicedirectory.inputs.ServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.servicedirectory.ServiceIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.servicedirectory.inputs.ServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.servicedirectory.ServiceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.servicedirectory.inputs.ServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.servicedirectory.inputs.NamespaceIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.servicedirectory.inputs.NamespaceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.servicedirectory.inputs.NamespaceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.servicedirectory.inputs.NamespaceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.servicedirectory.inputs.NamespaceIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.servicedirectory.inputs.NamespaceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.servicedirectory.inputs.NamespaceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.servicedirectory.inputs.NamespaceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.servicedirectory.inputs.ServiceIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.servicedirectory.inputs.ServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.servicedirectory.inputs.ServiceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.servicedirectory.inputs.ServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.servicedirectory.inputs.ServiceIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.servicedirectory.inputs.ServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.servicedirectory.inputs.ServiceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.servicedirectory.inputs.ServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)
