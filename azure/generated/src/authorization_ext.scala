package jp.ukiba.ko_pulumi
package azure

object authorization_ext:
  extension (builder: com.pulumi.azure.authorization.RoleDefinitionArgs.Builder)
    /**
     * @param permissions A `permissions` block as defined below.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.azure.authorization.inputs.RoleDefinitionPermissionArgs.Builder]*):
        com.pulumi.azure.authorization.RoleDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.azure.authorization.inputs.RoleDefinitionPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.authorization.inputs.RoleDefinitionState.Builder)
    /**
     * @param permissions A `permissions` block as defined below.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.azure.authorization.inputs.RoleDefinitionPermissionArgs.Builder]*):
        com.pulumi.azure.authorization.inputs.RoleDefinitionState.Builder =
      def argsBuilder = com.pulumi.azure.authorization.inputs.RoleDefinitionPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)
