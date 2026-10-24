package jp.ukiba.ko_pulumi
package azure

object role_ext:
  extension (builder: com.pulumi.azure.role.DefinitionArgs.Builder)
    /**
     * @param permissions A `permissions` block as defined below.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.azure.role.inputs.DefinitionPermissionArgs.Builder]*):
        com.pulumi.azure.role.DefinitionArgs.Builder =
      def argsBuilder = com.pulumi.azure.role.inputs.DefinitionPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.role.inputs.DefinitionState.Builder)
    /**
     * @param permissions A `permissions` block as defined below.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.azure.role.inputs.DefinitionPermissionArgs.Builder]*):
        com.pulumi.azure.role.inputs.DefinitionState.Builder =
      def argsBuilder = com.pulumi.azure.role.inputs.DefinitionPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)
