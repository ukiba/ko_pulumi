package jp.ukiba.ko_pulumi
package aws

object identitystore_ext:
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

  extension (builder: com.pulumi.aws.identitystore.inputs.GetGroupAlternateIdentifier.Builder)
    /**
     * @param externalId Configuration block for filtering by the identifier issued by an external identity provider. Detailed below.
     * @return builder
     */
    def externalId(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupAlternateIdentifierExternalId.Builder]):
        com.pulumi.aws.identitystore.inputs.GetGroupAlternateIdentifier.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupAlternateIdentifierExternalId.builder
      builder.externalId(args(argsBuilder).build)

    /**
     * @param uniqueAttribute An entity attribute that&#39;s unique to a specific entity. Detailed below.
     * 
     * &gt; Exactly one of the above arguments must be provided.
     * @return builder
     */
    def uniqueAttribute(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupAlternateIdentifierUniqueAttribute.Builder]):
        com.pulumi.aws.identitystore.inputs.GetGroupAlternateIdentifier.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupAlternateIdentifierUniqueAttribute.builder
      builder.uniqueAttribute(args(argsBuilder).build)

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
     * &gt; Exactly one of the above arguments must be provided.
     * @return builder
     */
    def uniqueAttribute(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupAlternateIdentifierUniqueAttributeArgs.Builder]):
        com.pulumi.aws.identitystore.inputs.GetGroupAlternateIdentifierArgs.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupAlternateIdentifierUniqueAttributeArgs.builder
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

  extension (builder: com.pulumi.aws.identitystore.inputs.GetGroupPlainArgs.Builder)
    /**
     * @param alternateIdentifier A unique identifier for the group that is not the primary identifier. Conflicts with `groupId` and `filter`. Detailed below.
     * @return builder
     */
    def alternateIdentifier(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetGroupAlternateIdentifier.Builder]):
        com.pulumi.aws.identitystore.inputs.GetGroupPlainArgs.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetGroupAlternateIdentifier.builder
      builder.alternateIdentifier(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.identitystore.inputs.GetUserAlternateIdentifier.Builder)
    /**
     * @param externalId Configuration block for filtering by the identifier issued by an external identity provider. Detailed below.
     * @return builder
     */
    def externalId(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetUserAlternateIdentifierExternalId.Builder]):
        com.pulumi.aws.identitystore.inputs.GetUserAlternateIdentifier.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetUserAlternateIdentifierExternalId.builder
      builder.externalId(args(argsBuilder).build)

    /**
     * @param uniqueAttribute An entity attribute that&#39;s unique to a specific entity. Detailed below.
     * 
     * &gt; Exactly one of the above arguments must be provided.
     * @return builder
     */
    def uniqueAttribute(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetUserAlternateIdentifierUniqueAttribute.Builder]):
        com.pulumi.aws.identitystore.inputs.GetUserAlternateIdentifier.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetUserAlternateIdentifierUniqueAttribute.builder
      builder.uniqueAttribute(args(argsBuilder).build)

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
     * &gt; Exactly one of the above arguments must be provided.
     * @return builder
     */
    def uniqueAttribute(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetUserAlternateIdentifierUniqueAttributeArgs.Builder]):
        com.pulumi.aws.identitystore.inputs.GetUserAlternateIdentifierArgs.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetUserAlternateIdentifierUniqueAttributeArgs.builder
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

  extension (builder: com.pulumi.aws.identitystore.inputs.GetUserPlainArgs.Builder)
    /**
     * @param alternateIdentifier A unique identifier for a user or group that is not the primary identifier. Conflicts with `userId` and `filter`. Detailed below.
     * @return builder
     */
    def alternateIdentifier(args: Endofunction[com.pulumi.aws.identitystore.inputs.GetUserAlternateIdentifier.Builder]):
        com.pulumi.aws.identitystore.inputs.GetUserPlainArgs.Builder =
      val argsBuilder = com.pulumi.aws.identitystore.inputs.GetUserAlternateIdentifier.builder
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
