package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object role:
  /** Manages a custom Role Definition, used to assign Roles to Users/Principals. See [&#39;Understand role definitions&#39;](https://docs.microsoft.com/azure/role-based-access-control/role-definitions) in the Azure documentation for more details. */
  @deprecated() def Definition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.role.DefinitionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.role.DefinitionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.role.Definition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.role.DefinitionArgs.Builder)
    /**
     * @param permissions A `permissions` block as defined below.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.azure.role.inputs.DefinitionPermissionArgs.Builder]*):
        com.pulumi.azure.role.DefinitionArgs.Builder =
      def argsBuilder = com.pulumi.azure.role.inputs.DefinitionPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

  type RoleFunctions = com.pulumi.azure.role.RoleFunctions
  object RoleFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.role.RoleFunctions.*
  extension (self: RoleFunctions.type)
    /** Use this data source to access information about an existing Role Definition. */
    @deprecated def getRoleDefinition(args: Endofunction[com.pulumi.azure.role.inputs.GetRoleDefinitionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.role.outputs.GetRoleDefinitionResult] =
      val argsBuilder = com.pulumi.azure.role.inputs.GetRoleDefinitionArgs.builder
      com.pulumi.azure.role.RoleFunctions.getRoleDefinition(args(argsBuilder).build)

    /** Use this data source to access information about an existing Role Definition. */
    @deprecated def getRoleDefinitionPlain(args: Endofunction[com.pulumi.azure.role.inputs.GetRoleDefinitionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.role.outputs.GetRoleDefinitionResult] =
      val argsBuilder = com.pulumi.azure.role.inputs.GetRoleDefinitionPlainArgs.builder
      com.pulumi.azure.role.RoleFunctions.getRoleDefinitionPlain(args(argsBuilder).build)

  /** Assigns a given Principal (User or Group) to a given Role. */
  @deprecated() def Assignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.role.AssignmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.role.AssignmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.role.Assignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.role.inputs.DefinitionState.Builder)
    /**
     * @param permissions A `permissions` block as defined below.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.azure.role.inputs.DefinitionPermissionArgs.Builder]*):
        com.pulumi.azure.role.inputs.DefinitionState.Builder =
      def argsBuilder = com.pulumi.azure.role.inputs.DefinitionPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)
