package jp.ukiba.ko_pulumi
package azure

object blueprint_ext:
  extension (builder: com.pulumi.azure.blueprint.AssignmentArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.blueprint.inputs.AssignmentIdentityArgs.Builder]):
        com.pulumi.azure.blueprint.AssignmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.blueprint.inputs.AssignmentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.blueprint.inputs.AssignmentState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.blueprint.inputs.AssignmentIdentityArgs.Builder]):
        com.pulumi.azure.blueprint.inputs.AssignmentState.Builder =
      val argsBuilder = com.pulumi.azure.blueprint.inputs.AssignmentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
