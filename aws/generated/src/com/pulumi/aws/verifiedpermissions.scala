package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object verifiedpermissions:
  extension (builder: com.pulumi.aws.verifiedpermissions.PolicyStoreArgs.Builder)
    /**
     * @param validationSettings Validation settings for the policy store.
     * @return builder
     */
    def validationSettings(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.PolicyStoreValidationSettingsArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.PolicyStoreArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.PolicyStoreValidationSettingsArgs.builder
      builder.validationSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.SchemaArgs.Builder)
    /**
     * @param definition The definition of the schema.
     * @return builder
     */
    def definition(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.SchemaDefinitionArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.SchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.SchemaDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)

  /** This is a Terraform resource for managing an AWS Verified Permissions Policy Store Schema. */
  def Schema(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.verifiedpermissions.SchemaArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.verifiedpermissions.SchemaArgs.builder
    
    com.pulumi.aws.verifiedpermissions.Schema(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Verified Permissions Identity Source. */
  def IdentitySource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.verifiedpermissions.IdentitySourceArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.verifiedpermissions.IdentitySourceArgs.builder
    
    com.pulumi.aws.verifiedpermissions.IdentitySource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.IdentitySourceArgs.Builder)
    /**
     * @param configuration Specifies the details required to communicate with the identity provider (IdP) associated with this identity source. See Configuration below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.IdentitySourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  /** This is a Terraform resource for managing an AWS Verified Permissions Policy Store. */
  def PolicyStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.verifiedpermissions.PolicyStoreArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.verifiedpermissions.PolicyStoreArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.verifiedpermissions.PolicyStore(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Verified Permissions Policy Template. */
  def PolicyTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.verifiedpermissions.PolicyTemplateArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.verifiedpermissions.PolicyTemplateArgs.builder
    
    com.pulumi.aws.verifiedpermissions.PolicyTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type VerifiedpermissionsFunctions = com.pulumi.aws.verifiedpermissions.VerifiedpermissionsFunctions
  object VerifiedpermissionsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.verifiedpermissions.VerifiedpermissionsFunctions.*
  extension (self: VerifiedpermissionsFunctions.type)
    /** Data source for managing an AWS Verified Permissions Policy Store. */
    def getPolicyStore(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.GetPolicyStoreArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.verifiedpermissions.outputs.GetPolicyStoreResult] =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.GetPolicyStoreArgs.builder
      com.pulumi.aws.verifiedpermissions.VerifiedpermissionsFunctions.getPolicyStore(args(argsBuilder).build)

    /** Data source for managing an AWS Verified Permissions Policy Store. */
    def getPolicyStorePlain(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.GetPolicyStorePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.verifiedpermissions.outputs.GetPolicyStoreResult] =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.GetPolicyStorePlainArgs.builder
      com.pulumi.aws.verifiedpermissions.VerifiedpermissionsFunctions.getPolicyStorePlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.PolicyArgs.Builder)
    /**
     * @param definition The definition of the policy. See Definition below.
     * @return builder
     */
    def definition(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)

  /** Resource for managing an AWS Verified Permissions Policy. */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.verifiedpermissions.PolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.verifiedpermissions.PolicyArgs.builder
    
    com.pulumi.aws.verifiedpermissions.Policy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationTokenSelectionArgs.Builder)
    /**
     * @param accessTokenOnly The OIDC configuration for processing access tokens. See Access Token Only below.
     * @return builder
     */
    def accessTokenOnly(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationTokenSelectionAccessTokenOnlyArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationTokenSelectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationTokenSelectionAccessTokenOnlyArgs.builder
      builder.accessTokenOnly(args(argsBuilder).build)

    /**
     * @param identityTokenOnly The OIDC configuration for processing identity (ID) tokens. See Identity Token Only below.
     * @return builder
     */
    def identityTokenOnly(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationTokenSelectionIdentityTokenOnlyArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationTokenSelectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationTokenSelectionIdentityTokenOnlyArgs.builder
      builder.identityTokenOnly(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionArgs.Builder)
    /**
     * @param static_ The static policy statement. See Static below.
     * @return builder
     */
    def static_(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionStaticArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionStaticArgs.builder
      builder.static_(args(argsBuilder).build)

    /**
     * @param templateLinked The template linked policy. See Template Linked below.
     * @return builder
     */
    def templateLinked(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionTemplateLinkedArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionTemplateLinkedArgs.builder
      builder.templateLinked(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceState.Builder)
    /**
     * @param configuration Specifies the details required to communicate with the identity provider (IdP) associated with this identity source. See Configuration below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceState.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationCognitoUserPoolConfigurationArgs.Builder)
    /**
     * @param groupConfiguration The type of entity that a policy store maps to groups from an Amazon Cognito user pool identity source. See Group Configuration below.
     * @return builder
     */
    def groupConfiguration(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationCognitoUserPoolConfigurationGroupConfigurationArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationCognitoUserPoolConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationCognitoUserPoolConfigurationGroupConfigurationArgs.builder
      builder.groupConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationArgs.Builder)
    /**
     * @param groupConfiguration The type of entity that a policy store maps to groups from an Amazon Cognito user pool identity source. See Group Configuration below.
     * @return builder
     */
    def groupConfiguration(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationGroupConfigurationArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationGroupConfigurationArgs.builder
      builder.groupConfiguration(args(argsBuilder).build)

    /**
     * @param tokenSelection The token type that you want to process from your OIDC identity provider. Your policy store can process either identity (ID) or access tokens from a given OIDC identity source. See Token Selection below.
     * @return builder
     */
    def tokenSelection(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationTokenSelectionArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationTokenSelectionArgs.builder
      builder.tokenSelection(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.inputs.PolicyStoreState.Builder)
    /**
     * @param validationSettings Validation settings for the policy store.
     * @return builder
     */
    def validationSettings(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.PolicyStoreValidationSettingsArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.PolicyStoreState.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.PolicyStoreValidationSettingsArgs.builder
      builder.validationSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.inputs.SchemaState.Builder)
    /**
     * @param definition The definition of the schema.
     * @return builder
     */
    def definition(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.SchemaDefinitionArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.SchemaState.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.SchemaDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.inputs.PolicyState.Builder)
    /**
     * @param definition The definition of the policy. See Definition below.
     * @return builder
     */
    def definition(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionTemplateLinkedArgs.Builder)
    /**
     * @param principal The principal of the template linked policy.
     * @return builder
     */
    def principal(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionTemplateLinkedPrincipalArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionTemplateLinkedArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionTemplateLinkedPrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

    /**
     * @param resource The resource of the template linked policy.
     * @return builder
     */
    def resource(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionTemplateLinkedResourceArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionTemplateLinkedArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.PolicyDefinitionTemplateLinkedResourceArgs.builder
      builder.resource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationArgs.Builder)
    /**
     * @param cognitoUserPoolConfiguration Specifies the configuration details of an Amazon Cognito user pool that Verified Permissions can use as a source of authenticated identities as entities. See Cognito User Pool Configuration below.
     * @return builder
     */
    def cognitoUserPoolConfiguration(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationCognitoUserPoolConfigurationArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationCognitoUserPoolConfigurationArgs.builder
      builder.cognitoUserPoolConfiguration(args(argsBuilder).build)

    /**
     * @param openIdConnectConfiguration Specifies the configuration details of an OpenID Connect (OIDC) identity provider, or identity source, that Verified Permissions can use to generate entities from authenticated identities. See Open ID Connect Configuration below.
     * @return builder
     */
    def openIdConnectConfiguration(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationArgs.Builder]):
        com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.IdentitySourceConfigurationOpenIdConnectConfigurationArgs.builder
      builder.openIdConnectConfiguration(args(argsBuilder).build)
