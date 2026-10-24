package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object role:
  /** Assigns a given Principal (User or Group) to a given Role. */
  @deprecated("azure.role.Assignment has been deprecated in favor of azure.authorization.Assignment") def Assignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.role.AssignmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.role.AssignmentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.role.Assignment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a custom Role Definition, used to assign Roles to Users/Principals. See [&#39;Understand role definitions&#39;](https://docs.microsoft.com/azure/role-based-access-control/role-definitions) in the Azure documentation for more details. */
  @deprecated("azure.role.Definition has been deprecated in favor of azure.authorization.RoleDefinition") def Definition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.role.DefinitionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.role.DefinitionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.role.Definition(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object RoleFunctions:
    /** Use this data source to access information about an existing Role Definition. */
    @deprecated("azure.role.getRoleDefinition has been deprecated in favor of azure.authorization.getRoleDefinition") inline def getRoleDefinition(args: Endofunction[com.pulumi.azure.role.inputs.GetRoleDefinitionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.role.outputs.GetRoleDefinitionResult] =
      val argsBuilder = com.pulumi.azure.role.inputs.GetRoleDefinitionArgs.builder
      com.pulumi.azure.role.RoleFunctions.getRoleDefinition(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Role Definition. */
    @deprecated("azure.role.getRoleDefinition has been deprecated in favor of azure.authorization.getRoleDefinition") inline def getRoleDefinitionPlain(args: Endofunction[com.pulumi.azure.role.inputs.GetRoleDefinitionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.role.outputs.GetRoleDefinitionResult] =
      val argsBuilder = com.pulumi.azure.role.inputs.GetRoleDefinitionPlainArgs.builder
      com.pulumi.azure.role.RoleFunctions.getRoleDefinitionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
