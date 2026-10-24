package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object identitystore:
  /** Resource for managing an AWS IdentityStore Group. */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.identitystore.GroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.identitystore.GroupArgs.builder
    com.pulumi.aws.identitystore.Group(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS IdentityStore Group Membership. */
  def GroupMembership(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.identitystore.GroupMembershipArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.identitystore.GroupMembershipArgs.builder
    com.pulumi.aws.identitystore.GroupMembership(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object IdentitystoreFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to get an Identity Store Group. */
    inline def getGroup(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.identitystore.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getGroup(args(argsBuilder).build)

    /** Use this data source to get an Identity Store Group. */
    inline def getGroupPlain(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.identitystore.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupPlainArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getGroupPlain(args(argsBuilder).build)

    /** Use this data source to get a list of members in an Identity Store Group. */
    inline def getGroupMemberships(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupMembershipsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.identitystore.outputs.GetGroupMembershipsResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupMembershipsArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getGroupMemberships(args(argsBuilder).build)

    /** Use this data source to get a list of members in an Identity Store Group. */
    inline def getGroupMembershipsPlain(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupMembershipsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.identitystore.outputs.GetGroupMembershipsResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupMembershipsPlainArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getGroupMembershipsPlain(args(argsBuilder).build)

    /** Data source for managing an AWS SSO Identity Store Groups. */
    inline def getGroups(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.identitystore.outputs.GetGroupsResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupsArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getGroups(args(argsBuilder).build)

    /** Data source for managing an AWS SSO Identity Store Groups. */
    inline def getGroupsPlain(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.identitystore.outputs.GetGroupsResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupsPlainArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getGroupsPlain(args(argsBuilder).build)

    /** Use this data source to get an Identity Store User. */
    inline def getUser(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetUserArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.identitystore.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetUserArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getUser(args(argsBuilder).build)

    /** Use this data source to get an Identity Store User. */
    inline def getUserPlain(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetUserPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.identitystore.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetUserPlainArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getUserPlain(args(argsBuilder).build)

    /** Use this data source to get a list of users in an Identity Store instance. */
    inline def getUsers(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetUsersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.identitystore.outputs.GetUsersResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetUsersArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getUsers(args(argsBuilder).build)

    /** Use this data source to get a list of users in an Identity Store instance. */
    inline def getUsersPlain(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetUsersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.identitystore.outputs.GetUsersResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetUsersPlainArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getUsersPlain(args(argsBuilder).build)

  /**
   * This resource manages a User resource within an Identity Store.
   * 
   * &gt; **Note:** If you use an external identity provider or Active Directory as your identity source,
   * use this resource with caution. IAM Identity Center does not support outbound synchronization,
   * so your identity source does not automatically update with the changes that you make to
   * users using this resource.
   */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.identitystore.UserArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.identitystore.UserArgs.builder
    com.pulumi.aws.identitystore.User(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
