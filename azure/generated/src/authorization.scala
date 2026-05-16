package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object authorization:
  /** Manages a custom Role Definition, used to assign Roles to Users/Principals. See [&#39;Understand role definitions&#39;](https://docs.microsoft.com/azure/role-based-access-control/role-definitions) in the Azure documentation for more details. */
  def RoleDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.authorization.RoleDefinitionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.authorization.RoleDefinitionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.authorization.RoleDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &lt;!-- Note: This documentation is generated. Any manual changes will be overwritten --&gt;
   * 
   *  Manages a User Assigned Identity.
   */
  def UserAssignedIdentity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.authorization.UserAssignedIdentityArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.authorization.UserAssignedIdentityArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.authorization.UserAssignedIdentity(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object AuthorizationFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Role Definition. */
    inline def getRoleDefinition(args: Endofunction[com.pulumi.azure.authorization.inputs.GetRoleDefinitionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.authorization.outputs.GetRoleDefinitionResult] =
      val argsBuilder = com.pulumi.azure.authorization.inputs.GetRoleDefinitionArgs.builder
      com.pulumi.azure.authorization.AuthorizationFunctions.getRoleDefinition(args(argsBuilder).build)

    /** Use this data source to access information about an existing Role Definition. */
    inline def getRoleDefinitionPlain(args: Endofunction[com.pulumi.azure.authorization.inputs.GetRoleDefinitionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.authorization.outputs.GetRoleDefinitionResult] =
      val argsBuilder = com.pulumi.azure.authorization.inputs.GetRoleDefinitionPlainArgs.builder
      com.pulumi.azure.authorization.AuthorizationFunctions.getRoleDefinitionPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing User Assigned Identity. */
    inline def getUserAssignedIdentity(args: Endofunction[com.pulumi.azure.authorization.inputs.GetUserAssignedIdentityArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.authorization.outputs.GetUserAssignedIdentityResult] =
      val argsBuilder = com.pulumi.azure.authorization.inputs.GetUserAssignedIdentityArgs.builder
      com.pulumi.azure.authorization.AuthorizationFunctions.getUserAssignedIdentity(args(argsBuilder).build)

    /** Use this data source to access information about an existing User Assigned Identity. */
    inline def getUserAssignedIdentityPlain(args: Endofunction[com.pulumi.azure.authorization.inputs.GetUserAssignedIdentityPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.authorization.outputs.GetUserAssignedIdentityResult] =
      val argsBuilder = com.pulumi.azure.authorization.inputs.GetUserAssignedIdentityPlainArgs.builder
      com.pulumi.azure.authorization.AuthorizationFunctions.getUserAssignedIdentityPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.authorization.RoleDefinitionArgs.Builder)
    /**
     * @param permissions A `permissions` block as defined below.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.azure.authorization.inputs.RoleDefinitionPermissionArgs.Builder]*):
        com.pulumi.azure.authorization.RoleDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.azure.authorization.inputs.RoleDefinitionPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

  /** Assigns a given Principal (User or Group) to a given Role. */
  def Assignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.authorization.AssignmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.authorization.AssignmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.authorization.Assignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.authorization.inputs.RoleDefinitionState.Builder)
    /**
     * @param permissions A `permissions` block as defined below.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.azure.authorization.inputs.RoleDefinitionPermissionArgs.Builder]*):
        com.pulumi.azure.authorization.inputs.RoleDefinitionState.Builder =
      def argsBuilder = com.pulumi.azure.authorization.inputs.RoleDefinitionPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)
