package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object identitystore:
  /** Resource for managing an AWS IdentityStore Group. */
  inline def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.identitystore.GroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.identitystore.GroupArgs.builder
    com.pulumi.aws.identitystore.Group(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS IdentityStore Group Membership. */
  inline def GroupMembership(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.identitystore.GroupMembershipArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.identitystore.GroupMembershipArgs.builder
    com.pulumi.aws.identitystore.GroupMembership(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object IdentitystoreFunctions:
    /** Use this data source to get an Identity Store Group. */
    inline def getGroup(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.identitystore.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get an Identity Store Group. */
    inline def getGroupPlain(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.identitystore.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupPlainArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get a list of members in an Identity Store Group. */
    inline def getGroupMemberships(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupMembershipsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.identitystore.outputs.GetGroupMembershipsResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupMembershipsArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getGroupMemberships(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get a list of members in an Identity Store Group. */
    inline def getGroupMembershipsPlain(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupMembershipsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.identitystore.outputs.GetGroupMembershipsResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupMembershipsPlainArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getGroupMembershipsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS SSO Identity Store Groups. */
    inline def getGroups(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.identitystore.outputs.GetGroupsResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupsArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getGroups(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS SSO Identity Store Groups. */
    inline def getGroupsPlain(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.identitystore.outputs.GetGroupsResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupsPlainArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getGroupsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get an Identity Store User. */
    inline def getUser(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetUserArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.identitystore.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetUserArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getUser(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get an Identity Store User. */
    inline def getUserPlain(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetUserPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.identitystore.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetUserPlainArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getUserPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get a list of users in an Identity Store instance. */
    inline def getUsers(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetUsersArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.identitystore.outputs.GetUsersResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetUsersArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getUsers(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get a list of users in an Identity Store instance. */
    inline def getUsersPlain(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetUsersPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.identitystore.outputs.GetUsersResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetUsersPlainArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getUsersPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * This resource manages a User resource within an Identity Store.
   * 
   * &gt; **Note:** If you use an external identity provider or Active Directory as your identity source,
   * use this resource with caution. IAM Identity Center does not support outbound synchronization,
   * so your identity source does not automatically update with the changes that you make to
   * users using this resource.
   */
  inline def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.identitystore.UserArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.identitystore.UserArgs.builder
    com.pulumi.aws.identitystore.User(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
