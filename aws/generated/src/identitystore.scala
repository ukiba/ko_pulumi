package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object identitystore:
  type IdentitystoreFunctions = com.pulumi.aws.identitystore.IdentitystoreFunctions
  object IdentitystoreFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.identitystore.IdentitystoreFunctions.*
  extension (self: IdentitystoreFunctions.type)
    /** Use this data source to get an Identity Store Group. */
    def getGroup(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.identitystore.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getGroup(args(argsBuilder).build)

    /** Use this data source to get an Identity Store Group. */
    def getGroupPlain(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.identitystore.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupPlainArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getGroupPlain(args(argsBuilder).build)

    /** Use this data source to get a list of members in an Identity Store Group. */
    def getGroupMemberships(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupMembershipsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.identitystore.outputs.GetGroupMembershipsResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupMembershipsArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getGroupMemberships(args(argsBuilder).build)

    /** Use this data source to get a list of members in an Identity Store Group. */
    def getGroupMembershipsPlain(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupMembershipsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.identitystore.outputs.GetGroupMembershipsResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupMembershipsPlainArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getGroupMembershipsPlain(args(argsBuilder).build)

    /** Data source for managing an AWS SSO Identity Store Groups. */
    def getGroups(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.identitystore.outputs.GetGroupsResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupsArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getGroups(args(argsBuilder).build)

    /** Data source for managing an AWS SSO Identity Store Groups. */
    def getGroupsPlain(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.identitystore.outputs.GetGroupsResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupsPlainArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getGroupsPlain(args(argsBuilder).build)

    /** Use this data source to get an Identity Store User. */
    def getUser(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetUserArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.identitystore.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetUserArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getUser(args(argsBuilder).build)

    /** Use this data source to get an Identity Store User. */
    def getUserPlain(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetUserPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.identitystore.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetUserPlainArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getUserPlain(args(argsBuilder).build)

    /** Use this data source to get a list of users in an Identity Store instance. */
    def getUsers(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetUsersArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.identitystore.outputs.GetUsersResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetUsersArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getUsers(args(argsBuilder).build)

    /** Use this data source to get a list of users in an Identity Store instance. */
    def getUsersPlain(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetUsersPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.identitystore.outputs.GetUsersResult] =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetUsersPlainArgs.builder
      com.pulumi.aws.identitystore.IdentitystoreFunctions.getUsersPlain(args(argsBuilder).build)

  /** Resource for managing an AWS IdentityStore Group. */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.identitystore.GroupArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.identitystore.GroupArgs.builder
    
    com.pulumi.aws.identitystore.Group(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.identitystore.UserArgs.Builder)
    /**
     * @param addresses Details about the user&#39;s address. At most 1 address is allowed. Detailed below.
     * @return builder
     */
    def addresses(args: Endofunction[com.pulumi.aws.identitystore.inputs.UserAddressesArgs.Builder]):
        com.pulumi.aws.identitystore.UserArgs.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.UserAddressesArgs.builder
      builder.addresses(args(argsBuilder).build)

    /**
     * @param emails Details about the user&#39;s email. At most 1 email is allowed. Detailed below.
     * @return builder
     */
    def emails(args: Endofunction[com.pulumi.aws.identitystore.inputs.UserEmailsArgs.Builder]):
        com.pulumi.aws.identitystore.UserArgs.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.UserEmailsArgs.builder
      builder.emails(args(argsBuilder).build)

    /**
     * @param name Details about the user&#39;s full name. Detailed below.
     * @return builder
     */
    def name(args: Endofunction[com.pulumi.aws.identitystore.inputs.UserNameArgs.Builder]):
        com.pulumi.aws.identitystore.UserArgs.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.UserNameArgs.builder
      builder.name(args(argsBuilder).build)

    /**
     * @param phoneNumbers Details about the user&#39;s phone number. At most 1 phone number is allowed. Detailed below.
     * @return builder
     */
    def phoneNumbers(args: Endofunction[com.pulumi.aws.identitystore.inputs.UserPhoneNumbersArgs.Builder]):
        com.pulumi.aws.identitystore.UserArgs.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.UserPhoneNumbersArgs.builder
      builder.phoneNumbers(args(argsBuilder).build)

  /**
   * This resource manages a User resource within an Identity Store.
   *  
   *  &gt; **Note:** If you use an external identity provider or Active Directory as your identity source,
   *  use this resource with caution. IAM Identity Center does not support outbound synchronization,
   *  so your identity source does not automatically update with the changes that you make to
   *  users using this resource.
   */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.identitystore.UserArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.identitystore.UserArgs.builder
    
    com.pulumi.aws.identitystore.User(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS IdentityStore Group Membership. */
  def GroupMembership(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.identitystore.GroupMembershipArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.identitystore.GroupMembershipArgs.builder
    
    com.pulumi.aws.identitystore.GroupMembership(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.identitystore.inputs.GetUserAlternateIdentifierArgs.Builder)
    /**
     * @param externalId Configuration block for filtering by the identifier issued by an external identity provider. Detailed below.
     * @return builder
     */
    def externalId(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetUserAlternateIdentifierExternalIdArgs.Builder]):
        com.pulumi.aws.identitystore.inputs.GetUserAlternateIdentifierArgs.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetUserAlternateIdentifierExternalIdArgs.builder
      builder.externalId(args(argsBuilder).build)

    /**
     * @param uniqueAttribute An entity attribute that&#39;s unique to a specific entity. Detailed below.
     *  
     *  &gt; Exactly one of the above arguments must be provided.
     * @return builder
     */
    def uniqueAttribute(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetUserAlternateIdentifierUniqueAttributeArgs.Builder]):
        com.pulumi.aws.identitystore.inputs.GetUserAlternateIdentifierArgs.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetUserAlternateIdentifierUniqueAttributeArgs.builder
      builder.uniqueAttribute(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.identitystore.inputs.GetGroupArgs.Builder)
    /**
     * @param alternateIdentifier A unique identifier for the group that is not the primary identifier. Conflicts with `groupId` and `filter`. Detailed below.
     * @return builder
     */
    def alternateIdentifier(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupAlternateIdentifierArgs.Builder]):
        com.pulumi.aws.identitystore.inputs.GetGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupAlternateIdentifierArgs.builder
      builder.alternateIdentifier(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.identitystore.inputs.GroupState.Builder)
    /**
     * @param externalIds A list of external IDs that contains the identifiers issued to this resource by an external identity provider. See External IDs below.
     * @return builder
     */
    def externalIds(args: Endofunction[com.pulumi.aws.identitystore.inputs.GroupExternalIdArgs.Builder]*):
        com.pulumi.aws.identitystore.inputs.GroupState.Builder =
      def argsBuilder = com.pulumi.aws.identitystore.inputs.GroupExternalIdArgs.builder
      builder.externalIds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.identitystore.inputs.GetGroupAlternateIdentifierArgs.Builder)
    /**
     * @param externalId Configuration block for filtering by the identifier issued by an external identity provider. Detailed below.
     * @return builder
     */
    def externalId(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupAlternateIdentifierExternalIdArgs.Builder]):
        com.pulumi.aws.identitystore.inputs.GetGroupAlternateIdentifierArgs.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupAlternateIdentifierExternalIdArgs.builder
      builder.externalId(args(argsBuilder).build)

    /**
     * @param uniqueAttribute An entity attribute that&#39;s unique to a specific entity. Detailed below.
     *  
     *  &gt; Exactly one of the above arguments must be provided.
     * @return builder
     */
    def uniqueAttribute(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupAlternateIdentifierUniqueAttributeArgs.Builder]):
        com.pulumi.aws.identitystore.inputs.GetGroupAlternateIdentifierArgs.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupAlternateIdentifierUniqueAttributeArgs.builder
      builder.uniqueAttribute(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.identitystore.inputs.GetUserArgs.Builder)
    /**
     * @param alternateIdentifier A unique identifier for a user or group that is not the primary identifier. Conflicts with `userId` and `filter`. Detailed below.
     * @return builder
     */
    def alternateIdentifier(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetUserAlternateIdentifierArgs.Builder]):
        com.pulumi.aws.identitystore.inputs.GetUserArgs.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetUserAlternateIdentifierArgs.builder
      builder.alternateIdentifier(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.identitystore.inputs.UserState.Builder)
    /**
     * @param addresses Details about the user&#39;s address. At most 1 address is allowed. Detailed below.
     * @return builder
     */
    def addresses(args: Endofunction[com.pulumi.aws.identitystore.inputs.UserAddressesArgs.Builder]):
        com.pulumi.aws.identitystore.inputs.UserState.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.UserAddressesArgs.builder
      builder.addresses(args(argsBuilder).build)

    /**
     * @param emails Details about the user&#39;s email. At most 1 email is allowed. Detailed below.
     * @return builder
     */
    def emails(args: Endofunction[com.pulumi.aws.identitystore.inputs.UserEmailsArgs.Builder]):
        com.pulumi.aws.identitystore.inputs.UserState.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.UserEmailsArgs.builder
      builder.emails(args(argsBuilder).build)

    /**
     * @param externalIds A list of identifiers issued to this resource by an external identity provider.
     * @return builder
     */
    def externalIds(args: Endofunction[com.pulumi.aws.identitystore.inputs.UserExternalIdArgs.Builder]*):
        com.pulumi.aws.identitystore.inputs.UserState.Builder =
      def argsBuilder = com.pulumi.aws.identitystore.inputs.UserExternalIdArgs.builder
      builder.externalIds(args.map(_(argsBuilder).build)*)

    /**
     * @param name Details about the user&#39;s full name. Detailed below.
     * @return builder
     */
    def name(args: Endofunction[com.pulumi.aws.identitystore.inputs.UserNameArgs.Builder]):
        com.pulumi.aws.identitystore.inputs.UserState.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.UserNameArgs.builder
      builder.name(args(argsBuilder).build)

    /**
     * @param phoneNumbers Details about the user&#39;s phone number. At most 1 phone number is allowed. Detailed below.
     * @return builder
     */
    def phoneNumbers(args: Endofunction[com.pulumi.aws.identitystore.inputs.UserPhoneNumbersArgs.Builder]):
        com.pulumi.aws.identitystore.inputs.UserState.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.UserPhoneNumbersArgs.builder
      builder.phoneNumbers(args(argsBuilder).build)
