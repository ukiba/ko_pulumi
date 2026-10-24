package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object role:
  /** Assigns a given Principal (User or Group) to a given Role. */
  @deprecated("azure.role.Assignment has been deprecated in favor of azure.authorization.Assignment") def Assignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.role.AssignmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.role.AssignmentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.role.Assignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a custom Role Definition, used to assign Roles to Users/Principals. See [&#39;Understand role definitions&#39;](https://docs.microsoft.com/azure/role-based-access-control/role-definitions) in the Azure documentation for more details. */
  @deprecated("azure.role.Definition has been deprecated in favor of azure.authorization.RoleDefinition") def Definition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.role.DefinitionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.role.DefinitionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.role.Definition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object RoleFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Role Definition. */
    @deprecated("azure.role.getRoleDefinition has been deprecated in favor of azure.authorization.getRoleDefinition") inline def getRoleDefinition(args: Endofunction[com.pulumi.azure.role.inputs.GetRoleDefinitionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.role.outputs.GetRoleDefinitionResult] =
      val argsBuilder = com.pulumi.azure.role.inputs.GetRoleDefinitionArgs.builder
      com.pulumi.azure.role.RoleFunctions.getRoleDefinition(args(argsBuilder).build)

    /** Use this data source to access information about an existing Role Definition. */
    @deprecated("azure.role.getRoleDefinition has been deprecated in favor of azure.authorization.getRoleDefinition") inline def getRoleDefinitionPlain(args: Endofunction[com.pulumi.azure.role.inputs.GetRoleDefinitionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.role.outputs.GetRoleDefinitionResult] =
      val argsBuilder = com.pulumi.azure.role.inputs.GetRoleDefinitionPlainArgs.builder
      com.pulumi.azure.role.RoleFunctions.getRoleDefinitionPlain(args(argsBuilder).build)
