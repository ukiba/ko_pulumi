package jp.ukiba.ko_pulumi
package aws

object verifiedpermissions_ext:
  extension (builder: com.pulumi.aws.verifiedpermissions.IdentitySourceArgs.Builder)
    /**
     * @param configuration Details required to communicate with the identity provider (IdP) associated with this identity source. See Configuration below.
     * @return builder
     */
    inline def configuration(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.IdentitySourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.PolicyArgs.Builder)
    /**
     * @param definition Definition of the policy. See Definition below.
     * @return builder
     */
    inline def definition(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.PolicyStoreArgs.Builder)
    /**
     * @param validationSettings Validation settings for the policy store. See Validation Settings below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def validationSettings(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.PolicyStoreValidationSettingsArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.PolicyStoreArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.PolicyStoreValidationSettingsArgs.builder
      builder.validationSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.SchemaArgs.Builder)
    /**
     * @param definition Definition of the schema. See Definition below.
     * @return builder
     */
    inline def definition(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.SchemaDefinitionArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.SchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.SchemaDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationArgs.Builder)
    /**
     * @param cognitoUserPoolConfiguration Configuration details of an Amazon Cognito user pool that Verified Permissions can use as a source of authenticated identities as entities. See Cognito User Pool Configuration below.
     * @return builder
     */
    inline def cognitoUserPoolConfiguration(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationCognitoUserPoolConfigurationArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationCognitoUserPoolConfigurationArgs.builder
      builder.cognitoUserPoolConfiguration(args(argsBuilder).build)

    /**
     * @param openIdConnectConfiguration Configuration details of an OpenID Connect (OIDC) identity provider, or identity source, that Verified Permissions can use to generate entities from authenticated identities. See Open ID Connect Configuration below.
     * @return builder
     */
    inline def openIdConnectConfiguration(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationArgs.builder
      builder.openIdConnectConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationCognitoUserPoolConfigurationArgs.Builder)
    /**
     * @param groupConfiguration Type of entity that a policy store maps to groups from an Amazon Cognito user pool identity source. See Group Configuration below.
     * @return builder
     */
    inline def groupConfiguration(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationCognitoUserPoolConfigurationGroupConfigurationArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationCognitoUserPoolConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationCognitoUserPoolConfigurationGroupConfigurationArgs.builder
      builder.groupConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationArgs.Builder)
    /**
     * @param groupConfiguration Type of entity that a policy store maps to groups from an Amazon Cognito user pool identity source. See Group Configuration below.
     * @return builder
     */
    inline def groupConfiguration(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationGroupConfigurationArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationGroupConfigurationArgs.builder
      builder.groupConfiguration(args(argsBuilder).build)

    /**
     * @param tokenSelection Token type that you want to process from your OIDC identity provider. Your policy store can process either identity (ID) or access tokens from a given OIDC identity source. See Token Selection below.
     * @return builder
     */
    inline def tokenSelection(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationTokenSelectionArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationTokenSelectionArgs.builder
      builder.tokenSelection(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationTokenSelectionArgs.Builder)
    /**
     * @param accessTokenOnly OIDC configuration for processing access tokens. See Access Token Only below.
     * @return builder
     */
    inline def accessTokenOnly(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationTokenSelectionAccessTokenOnlyArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationTokenSelectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationTokenSelectionAccessTokenOnlyArgs.builder
      builder.accessTokenOnly(args(argsBuilder).build)

    /**
     * @param identityTokenOnly OIDC configuration for processing identity (ID) tokens. See Identity Token Only below.
     * @return builder
     */
    inline def identityTokenOnly(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationTokenSelectionIdentityTokenOnlyArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationTokenSelectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationTokenSelectionIdentityTokenOnlyArgs.builder
      builder.identityTokenOnly(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceState.Builder)
    /**
     * @param configuration Details required to communicate with the identity provider (IdP) associated with this identity source. See Configuration below.
     * @return builder
     */
    inline def configuration(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceState.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionArgs.Builder)
    /**
     * @param static_ Static policy statement. See Static below.
     * @return builder
     */
    inline def static_(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionStaticArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionStaticArgs.builder
      builder.static_(args(argsBuilder).build)

    /**
     * @param templateLinked Template linked policy. See Template Linked below.
     * @return builder
     */
    inline def templateLinked(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionTemplateLinkedArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionTemplateLinkedArgs.builder
      builder.templateLinked(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionTemplateLinkedArgs.Builder)
    /**
     * @param principal Principal of the template linked policy. See Principal below.
     * @return builder
     */
    inline def principal(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionTemplateLinkedPrincipalArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionTemplateLinkedArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionTemplateLinkedPrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

    /**
     * @param resource Resource of the template linked policy. See Resource below.
     * @return builder
     */
    inline def resource(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionTemplateLinkedResourceArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionTemplateLinkedArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionTemplateLinkedResourceArgs.builder
      builder.resource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.inputs.PolicyState.Builder)
    /**
     * @param definition Definition of the policy. See Definition below.
     * @return builder
     */
    inline def definition(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.inputs.PolicyStoreState.Builder)
    /**
     * @param validationSettings Validation settings for the policy store. See Validation Settings below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def validationSettings(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.PolicyStoreValidationSettingsArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.PolicyStoreState.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.PolicyStoreValidationSettingsArgs.builder
      builder.validationSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.inputs.SchemaState.Builder)
    /**
     * @param definition Definition of the schema. See Definition below.
     * @return builder
     */
    inline def definition(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.SchemaDefinitionArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.SchemaState.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.SchemaDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)
