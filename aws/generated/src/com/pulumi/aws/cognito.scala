package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object cognito:
  extension (builder: com.pulumi.aws.cognito.UserPoolArgs.Builder)
    /**
     * @param accountRecoverySetting Configuration block to define which verified available method a user can use to recover their forgotten password. Detailed below.
     * @return builder
     */
    def accountRecoverySetting(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolAccountRecoverySettingArgs.Builder]):
        com.pulumi.aws.cognito.UserPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolAccountRecoverySettingArgs.builder
      builder.accountRecoverySetting(args(argsBuilder).build)

    /**
     * @param adminCreateUserConfig Configuration block for creating a new user profile. Detailed below.
     * @return builder
     */
    def adminCreateUserConfig(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolAdminCreateUserConfigArgs.Builder]):
        com.pulumi.aws.cognito.UserPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolAdminCreateUserConfigArgs.builder
      builder.adminCreateUserConfig(args(argsBuilder).build)

    /**
     * @param deviceConfiguration Configuration block for the user pool&#39;s device tracking. Detailed below.
     * @return builder
     */
    def deviceConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolDeviceConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.UserPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolDeviceConfigurationArgs.builder
      builder.deviceConfiguration(args(argsBuilder).build)

    /**
     * @param emailConfiguration Configuration block for configuring email. Detailed below.
     * @return builder
     */
    def emailConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolEmailConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.UserPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolEmailConfigurationArgs.builder
      builder.emailConfiguration(args(argsBuilder).build)

    /**
     * @param emailMfaConfiguration Configuration block for configuring email Multi-Factor Authentication (MFA); requires at least 2 `accountRecoverySetting` entries; requires an `emailConfiguration` configuration block. Effective only when `mfaConfiguration` is `ON` or `OPTIONAL`. Detailed below.
     * @return builder
     */
    def emailMfaConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolEmailMfaConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.UserPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolEmailMfaConfigurationArgs.builder
      builder.emailMfaConfiguration(args(argsBuilder).build)

    /**
     * @param lambdaConfig Configuration block for the AWS Lambda triggers associated with the user pool. Detailed below.
     * @return builder
     */
    def lambdaConfig(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolLambdaConfigArgs.Builder]):
        com.pulumi.aws.cognito.UserPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolLambdaConfigArgs.builder
      builder.lambdaConfig(args(argsBuilder).build)

    /**
     * @param passwordPolicy Configuration block for information about the user pool password policy. Detailed below.
     * @return builder
     */
    def passwordPolicy(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolPasswordPolicyArgs.Builder]):
        com.pulumi.aws.cognito.UserPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolPasswordPolicyArgs.builder
      builder.passwordPolicy(args(argsBuilder).build)

    /**
     * @param schemas Configuration block for the schema attributes of a user pool. Detailed below. Schema attributes from the [standard attribute set](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes) only need to be specified if they are different from the default configuration. Attributes can be added, but not modified or removed. Maximum of 50 attributes.
     * @return builder
     */
    def schemas(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolSchemaArgs.Builder]*):
        com.pulumi.aws.cognito.UserPoolArgs.Builder =
      def argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolSchemaArgs.builder
      builder.schemas(args.map(_(argsBuilder).build)*)

    /**
     * @param signInPolicy Configuration block for information about the user pool sign in policy. Detailed below.
     * @return builder
     */
    def signInPolicy(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolSignInPolicyArgs.Builder]):
        com.pulumi.aws.cognito.UserPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolSignInPolicyArgs.builder
      builder.signInPolicy(args(argsBuilder).build)

    /**
     * @param smsConfiguration Configuration block for Short Message Service (SMS) settings. Detailed below. These settings apply to SMS user verification and SMS Multi-Factor Authentication (MFA). SMS MFA is activated only when `mfaConfiguration` is set to `ON` or `OPTIONAL` along with this block. Due to Cognito API restrictions, the SMS configuration cannot be removed without recreating the Cognito User Pool. For user data safety, this resource will ignore the removal of this configuration by disabling drift detection. To force resource recreation after this configuration has been applied, see the `taint` command.
     * @return builder
     */
    def smsConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolSmsConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.UserPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolSmsConfigurationArgs.builder
      builder.smsConfiguration(args(argsBuilder).build)

    /**
     * @param softwareTokenMfaConfiguration Configuration block for software token Mult-Factor Authentication (MFA) settings. Effective only when `mfaConfiguration` is `ON` or `OPTIONAL`. Detailed below.
     * @return builder
     */
    def softwareTokenMfaConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolSoftwareTokenMfaConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.UserPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolSoftwareTokenMfaConfigurationArgs.builder
      builder.softwareTokenMfaConfiguration(args(argsBuilder).build)

    /**
     * @param userAttributeUpdateSettings Configuration block for user attribute update settings. Detailed below.
     * @return builder
     */
    def userAttributeUpdateSettings(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolUserAttributeUpdateSettingsArgs.Builder]):
        com.pulumi.aws.cognito.UserPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolUserAttributeUpdateSettingsArgs.builder
      builder.userAttributeUpdateSettings(args(argsBuilder).build)

    /**
     * @param userPoolAddOns Configuration block for user pool add-ons to enable user pool advanced security mode features. Detailed below.
     * @return builder
     */
    def userPoolAddOns(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolUserPoolAddOnsArgs.Builder]):
        com.pulumi.aws.cognito.UserPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolUserPoolAddOnsArgs.builder
      builder.userPoolAddOns(args(argsBuilder).build)

    /**
     * @param usernameConfiguration Configuration block for username configuration. Detailed below.
     * @return builder
     */
    def usernameConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolUsernameConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.UserPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolUsernameConfigurationArgs.builder
      builder.usernameConfiguration(args(argsBuilder).build)

    /**
     * @param verificationMessageTemplate Configuration block for verification message templates. Detailed below.
     * @return builder
     */
    def verificationMessageTemplate(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolVerificationMessageTemplateArgs.Builder]):
        com.pulumi.aws.cognito.UserPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolVerificationMessageTemplateArgs.builder
      builder.verificationMessageTemplate(args(argsBuilder).build)

    /**
     * @param webAuthnConfiguration Configuration block for web authn configuration. Detailed below.
     * @return builder
     */
    def webAuthnConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolWebAuthnConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.UserPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolWebAuthnConfigurationArgs.builder
      builder.webAuthnConfiguration(args(argsBuilder).build)

  /** Provides a Cognito Risk Configuration resource. */
  def RiskConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.RiskConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cognito.RiskConfigurationArgs.builder
    
    com.pulumi.aws.cognito.RiskConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Cognito User Identity Provider resource. */
  def IdentityProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.IdentityProviderArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cognito.IdentityProviderArgs.builder
    
    com.pulumi.aws.cognito.IdentityProvider(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type CognitoFunctions = com.pulumi.aws.cognito.CognitoFunctions
  object CognitoFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.cognito.CognitoFunctions.*
  extension (self: CognitoFunctions.type)
    /** Data source for managing an AWS Cognito Identity Pool. */
    def getIdentityPool(args: Endofunction[com.pulumi.aws.cognito.inputs.GetIdentityPoolArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cognito.outputs.GetIdentityPoolResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetIdentityPoolArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getIdentityPool(args(argsBuilder).build)

    /** Data source for managing an AWS Cognito Identity Pool. */
    def getIdentityPoolPlain(args: Endofunction[com.pulumi.aws.cognito.inputs.GetIdentityPoolPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cognito.outputs.GetIdentityPoolResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetIdentityPoolPlainArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getIdentityPoolPlain(args(argsBuilder).build)

    /** Data source for managing an AWS Cognito IDP (Identity Provider) User Group. */
    def getUserGroup(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cognito.outputs.GetUserGroupResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserGroupArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserGroup(args(argsBuilder).build)

    /** Data source for managing an AWS Cognito IDP (Identity Provider) User Group. */
    def getUserGroupPlain(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cognito.outputs.GetUserGroupResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserGroupPlainArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserGroupPlain(args(argsBuilder).build)

    /** Data source for managing AWS Cognito IDP (Identity Provider) User Groups. */
    def getUserGroups(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserGroupsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cognito.outputs.GetUserGroupsResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserGroupsArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserGroups(args(argsBuilder).build)

    /** Data source for managing AWS Cognito IDP (Identity Provider) User Groups. */
    def getUserGroupsPlain(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserGroupsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cognito.outputs.GetUserGroupsResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserGroupsPlainArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserGroupsPlain(args(argsBuilder).build)

    /** Data source for managing an AWS Cognito User Pool. */
    def getUserPool(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserPoolArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cognito.outputs.GetUserPoolResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserPoolArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserPool(args(argsBuilder).build)

    /** Data source for managing an AWS Cognito User Pool. */
    def getUserPoolPlain(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserPoolPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cognito.outputs.GetUserPoolResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserPoolPlainArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserPoolPlain(args(argsBuilder).build)

    /** Provides a Cognito User Pool Client resource. */
    def getUserPoolClient(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserPoolClientArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cognito.outputs.GetUserPoolClientResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserPoolClientArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserPoolClient(args(argsBuilder).build)

    /** Provides a Cognito User Pool Client resource. */
    def getUserPoolClientPlain(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserPoolClientPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cognito.outputs.GetUserPoolClientResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserPoolClientPlainArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserPoolClientPlain(args(argsBuilder).build)

    /** Use this data source to get a list of Cognito user pools clients for a Cognito IdP user pool. */
    def getUserPoolClients(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserPoolClientsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cognito.outputs.GetUserPoolClientsResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserPoolClientsArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserPoolClients(args(argsBuilder).build)

    /** Use this data source to get a list of Cognito user pools clients for a Cognito IdP user pool. */
    def getUserPoolClientsPlain(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserPoolClientsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cognito.outputs.GetUserPoolClientsResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserPoolClientsPlainArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserPoolClientsPlain(args(argsBuilder).build)

    /** Use this data source to get the signing certificate for a Cognito IdP user pool. */
    def getUserPoolSigningCertificate(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserPoolSigningCertificateArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cognito.outputs.GetUserPoolSigningCertificateResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserPoolSigningCertificateArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserPoolSigningCertificate(args(argsBuilder).build)

    /** Use this data source to get the signing certificate for a Cognito IdP user pool. */
    def getUserPoolSigningCertificatePlain(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserPoolSigningCertificatePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cognito.outputs.GetUserPoolSigningCertificateResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserPoolSigningCertificatePlainArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserPoolSigningCertificatePlain(args(argsBuilder).build)

    /** Use this data source to get a list of cognito user pools. */
    def getUserPools(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserPoolsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cognito.outputs.GetUserPoolsResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserPoolsArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserPools(args(argsBuilder).build)

    /** Use this data source to get a list of cognito user pools. */
    def getUserPoolsPlain(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserPoolsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cognito.outputs.GetUserPoolsResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserPoolsPlainArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserPoolsPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cognito.IdentityPoolArgs.Builder)
    /**
     * @param cognitoIdentityProviders An array of Amazon Cognito Identity user pools and their client IDs.
     * @return builder
     */
    def cognitoIdentityProviders(args: Endofunction[com.pulumi.aws.cognito.inputs.IdentityPoolCognitoIdentityProviderArgs.Builder]*):
        com.pulumi.aws.cognito.IdentityPoolArgs.Builder =
      def argsBuilder = com.pulumi.aws.cognito.inputs.IdentityPoolCognitoIdentityProviderArgs.builder
      builder.cognitoIdentityProviders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cognito.UserPoolClientArgs.Builder)
    /**
     * @param analyticsConfiguration Configuration block for Amazon Pinpoint analytics that collects metrics for this user pool. See details below.
     * @return builder
     */
    def analyticsConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolClientAnalyticsConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.UserPoolClientArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolClientAnalyticsConfigurationArgs.builder
      builder.analyticsConfiguration(args(argsBuilder).build)

    /**
     * @param refreshTokenRotation A block that specifies the configuration of refresh token rotation. Detailed below.
     * @return builder
     */
    def refreshTokenRotation(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolClientRefreshTokenRotationArgs.Builder]):
        com.pulumi.aws.cognito.UserPoolClientArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolClientRefreshTokenRotationArgs.builder
      builder.refreshTokenRotation(args(argsBuilder).build)

    /**
     * @param tokenValidityUnits Configuration block for representing the validity times in units. See details below. Detailed below.
     * @return builder
     */
    def tokenValidityUnits(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolClientTokenValidityUnitsArgs.Builder]):
        com.pulumi.aws.cognito.UserPoolClientArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolClientTokenValidityUnitsArgs.builder
      builder.tokenValidityUnits(args(argsBuilder).build)

  /** Provides an AWS Cognito Identity Pool. */
  def IdentityPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.IdentityPoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cognito.IdentityPoolArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cognito.IdentityPool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Use the `aws.cognito.UserPoolClient` resource to manage a Cognito User Pool Client.
   *  
   *  **This resource is advanced** and has special caveats to consider before use. Please read this document completely before using the resource.
   *  
   *  Use the `aws.cognito.ManagedUserPoolClient` resource to manage a Cognito User Pool Client that is automatically created by an AWS service. For instance, when [configuring an OpenSearch Domain to use Cognito authentication](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html), the OpenSearch service creates the User Pool Client during setup and removes it when it is no longer required. As a result, the `aws.cognito.ManagedUserPoolClient` resource does not create or delete this resource, but instead assumes management of it.
   *  
   *  Use the `aws.cognito.UserPoolClient` resource to manage Cognito User Pool Clients for normal use cases.
   */
  def ManagedUserPoolClient(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.ManagedUserPoolClientArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cognito.ManagedUserPoolClientArgs.builder
    
    com.pulumi.aws.cognito.ManagedUserPoolClient(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an AWS Cognito Identity Pool Roles Attachment.
   *  
   *  ## Import
   *  
   *  Using `pulumi import`, import Cognito Identity Pool Roles Attachment using the Identity Pool ID. For example:
   *  
   *  ```sh
   *  $ pulumi import aws:cognito/identityPoolRoleAttachment:IdentityPoolRoleAttachment example us-west-2:b64805ad-cb56-40ba-9ffc-f5d8207e6d42
   *  ```
   */
  def IdentityPoolRoleAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.IdentityPoolRoleAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cognito.IdentityPoolRoleAttachmentArgs.builder
    
    com.pulumi.aws.cognito.IdentityPoolRoleAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cognito.LogDeliveryConfigurationArgs.Builder)
    /**
     * @param logConfigurations Configuration block for log delivery. At least one configuration block is required. See Log Configurations below.
     * @return builder
     */
    def logConfigurations(args: Endofunction[com.pulumi.aws.cognito.inputs.LogDeliveryConfigurationLogConfigurationArgs.Builder]*):
        com.pulumi.aws.cognito.LogDeliveryConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.cognito.inputs.LogDeliveryConfigurationLogConfigurationArgs.builder
      builder.logConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cognito.IdentityPoolRoleAttachmentArgs.Builder)
    /**
     * @param roleMappings A List of Role Mapping.
     * @return builder
     */
    def roleMappings(args: Endofunction[com.pulumi.aws.cognito.inputs.IdentityPoolRoleAttachmentRoleMappingArgs.Builder]*):
        com.pulumi.aws.cognito.IdentityPoolRoleAttachmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.cognito.inputs.IdentityPoolRoleAttachmentRoleMappingArgs.builder
      builder.roleMappings(args.map(_(argsBuilder).build)*)

  /** Provides a Cognito Resource Server. */
  def ResourceServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.ResourceServerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cognito.ResourceServerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cognito.ResourceServer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Cognito User Resource. */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.UserArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cognito.UserArgs.builder
    
    com.pulumi.aws.cognito.User(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages branding settings for a user pool style and associates it with an app client. */
  def ManagedLoginBranding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.ManagedLoginBrandingArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cognito.ManagedLoginBrandingArgs.builder
    
    com.pulumi.aws.cognito.ManagedLoginBranding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AWS Cognito IDP (Identity Provider) Log Delivery Configuration. */
  def LogDeliveryConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.LogDeliveryConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cognito.LogDeliveryConfigurationArgs.builder
    
    com.pulumi.aws.cognito.LogDeliveryConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cognito.ResourceServerArgs.Builder)
    /**
     * @param scopes A list of Authorization Scope.
     * @return builder
     */
    def scopes(args: Endofunction[com.pulumi.aws.cognito.inputs.ResourceServerScopeArgs.Builder]*):
        com.pulumi.aws.cognito.ResourceServerArgs.Builder =
      def argsBuilder = com.pulumi.aws.cognito.inputs.ResourceServerScopeArgs.builder
      builder.scopes(args.map(_(argsBuilder).build)*)

  /** Provides a Cognito User Group resource. */
  def UserGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.UserGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cognito.UserGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cognito.UserGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Cognito User Pool Domain resource. */
  def UserPoolDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.UserPoolDomainArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cognito.UserPoolDomainArgs.builder
    
    com.pulumi.aws.cognito.UserPoolDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Cognito User Pool resource. */
  def UserPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.UserPoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cognito.UserPoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cognito.UserPool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Adds the specified user to the specified group. */
  def UserInGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.UserInGroupArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cognito.UserInGroupArgs.builder
    
    com.pulumi.aws.cognito.UserInGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Cognito User Pool Client resource.
   *  
   *  To manage a User Pool Client created by another service, such as when [configuring an OpenSearch Domain to use Cognito authentication](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html),
   *  use the `aws.cognito.ManagedUserPoolClient` resource instead.
   */
  def UserPoolClient(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.UserPoolClientArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cognito.UserPoolClientArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cognito.UserPoolClient(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cognito.ManagedUserPoolClientArgs.Builder)
    /**
     * @param analyticsConfiguration Configuration block for Amazon Pinpoint analytics that collects metrics for this user pool. See details below.
     * @return builder
     */
    def analyticsConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.ManagedUserPoolClientAnalyticsConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.ManagedUserPoolClientArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.ManagedUserPoolClientAnalyticsConfigurationArgs.builder
      builder.analyticsConfiguration(args(argsBuilder).build)

    /**
     * @param refreshTokenRotation A block that specifies the configuration of refresh token rotation. Detailed below.
     * @return builder
     */
    def refreshTokenRotation(args: Endofunction[com.pulumi.aws.cognito.inputs.ManagedUserPoolClientRefreshTokenRotationArgs.Builder]):
        com.pulumi.aws.cognito.ManagedUserPoolClientArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.ManagedUserPoolClientRefreshTokenRotationArgs.builder
      builder.refreshTokenRotation(args(argsBuilder).build)

    /**
     * @param tokenValidityUnits Configuration block for representing the validity times in units. See details below. Detailed below.
     * @return builder
     */
    def tokenValidityUnits(args: Endofunction[com.pulumi.aws.cognito.inputs.ManagedUserPoolClientTokenValidityUnitsArgs.Builder]):
        com.pulumi.aws.cognito.ManagedUserPoolClientArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.ManagedUserPoolClientTokenValidityUnitsArgs.builder
      builder.tokenValidityUnits(args(argsBuilder).build)

  /**
   * Provides a Cognito User Pool UI Customization resource.
   *  
   *  &gt; **Note:** To use this resource, the user pool must have a domain associated with it. For more information, see the Amazon Cognito Developer Guide on [Customizing the Built-in Sign-In and Sign-up Webpages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-app-ui-customization.html).
   */
  def UserPoolUICustomization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.UserPoolUICustomizationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cognito.UserPoolUICustomizationArgs.builder
    
    com.pulumi.aws.cognito.UserPoolUICustomization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cognito.ManagedLoginBrandingArgs.Builder)
    /**
     * @param assets Image files to apply to roles like backgrounds, logos, and icons. See details below.
     * @return builder
     */
    def assets(args: Endofunction[com.pulumi.aws.cognito.inputs.ManagedLoginBrandingAssetArgs.Builder]*):
        com.pulumi.aws.cognito.ManagedLoginBrandingArgs.Builder =
      def argsBuilder = com.pulumi.aws.cognito.inputs.ManagedLoginBrandingAssetArgs.builder
      builder.assets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cognito.RiskConfigurationArgs.Builder)
    /**
     * @param accountTakeoverRiskConfiguration The account takeover risk configuration. See details below.
     * @return builder
     */
    def accountTakeoverRiskConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.RiskConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationArgs.builder
      builder.accountTakeoverRiskConfiguration(args(argsBuilder).build)

    /**
     * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration. See details below.
     * @return builder
     */
    def compromisedCredentialsRiskConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.RiskConfigurationCompromisedCredentialsRiskConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.RiskConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.RiskConfigurationCompromisedCredentialsRiskConfigurationArgs.builder
      builder.compromisedCredentialsRiskConfiguration(args(argsBuilder).build)

    /**
     * @param riskExceptionConfiguration The configuration to override the risk decision. See details below.
     * @return builder
     */
    def riskExceptionConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.RiskConfigurationRiskExceptionConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.RiskConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.RiskConfigurationRiskExceptionConfigurationArgs.builder
      builder.riskExceptionConfiguration(args(argsBuilder).build)

  /** Provides an AWS Cognito Identity Principal Mapping. */
  def IdentityPoolProviderPrincipalTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.IdentityPoolProviderPrincipalTagArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cognito.IdentityPoolProviderPrincipalTagArgs.builder
    
    com.pulumi.aws.cognito.IdentityPoolProviderPrincipalTag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cognito.inputs.ResourceServerState.Builder)
    /**
     * @param scopes A list of Authorization Scope.
     * @return builder
     */
    def scopes(args: Endofunction[com.pulumi.aws.cognito.inputs.ResourceServerScopeArgs.Builder]*):
        com.pulumi.aws.cognito.inputs.ResourceServerState.Builder =
      def argsBuilder = com.pulumi.aws.cognito.inputs.ResourceServerScopeArgs.builder
      builder.scopes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cognito.inputs.UserPoolSchemaArgs.Builder)
    /**
     * @param numberAttributeConstraints Configuration block for the constraints for an attribute of the number type. Detailed below.
     * @return builder
     */
    def numberAttributeConstraints(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolSchemaNumberAttributeConstraintsArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolSchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolSchemaNumberAttributeConstraintsArgs.builder
      builder.numberAttributeConstraints(args(argsBuilder).build)

    /**
     * @param stringAttributeConstraints Constraints for an attribute of the string type. Detailed below.
     * @return builder
     */
    def stringAttributeConstraints(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolSchemaStringAttributeConstraintsArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolSchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolSchemaStringAttributeConstraintsArgs.builder
      builder.stringAttributeConstraints(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cognito.inputs.IdentityPoolRoleAttachmentRoleMappingArgs.Builder)
    /**
     * @param mappingRules The Rules Configuration to be used for mapping users to roles. You can specify up to 25 rules per identity provider. Rules are evaluated in order. The first one to match specifies the role.
     * @return builder
     */
    def mappingRules(args: Endofunction[com.pulumi.aws.cognito.inputs.IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs.Builder]*):
        com.pulumi.aws.cognito.inputs.IdentityPoolRoleAttachmentRoleMappingArgs.Builder =
      def argsBuilder = com.pulumi.aws.cognito.inputs.IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs.builder
      builder.mappingRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cognito.inputs.ManagedLoginBrandingState.Builder)
    /**
     * @param assets Image files to apply to roles like backgrounds, logos, and icons. See details below.
     * @return builder
     */
    def assets(args: Endofunction[com.pulumi.aws.cognito.inputs.ManagedLoginBrandingAssetArgs.Builder]*):
        com.pulumi.aws.cognito.inputs.ManagedLoginBrandingState.Builder =
      def argsBuilder = com.pulumi.aws.cognito.inputs.ManagedLoginBrandingAssetArgs.builder
      builder.assets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cognito.inputs.UserPoolAccountRecoverySettingArgs.Builder)
    /**
     * @param recoveryMechanisms List of Account Recovery Options of the following structure:
     * @return builder
     */
    def recoveryMechanisms(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolAccountRecoverySettingRecoveryMechanismArgs.Builder]*):
        com.pulumi.aws.cognito.inputs.UserPoolAccountRecoverySettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolAccountRecoverySettingRecoveryMechanismArgs.builder
      builder.recoveryMechanisms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationArgs.Builder)
    /**
     * @param blockEmail Email template used when a detected risk event is blocked. See notify email type below.
     * @return builder
     */
    def blockEmail(args: Endofunction[com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationBlockEmailArgs.Builder]):
        com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationBlockEmailArgs.builder
      builder.blockEmail(args(argsBuilder).build)

    /**
     * @param mfaEmail The multi-factor authentication (MFA) email template used when MFA is challenged as part of a detected risk. See notify email type below.
     * @return builder
     */
    def mfaEmail(args: Endofunction[com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationMfaEmailArgs.Builder]):
        com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationMfaEmailArgs.builder
      builder.mfaEmail(args(argsBuilder).build)

    /**
     * @param noActionEmail The email template used when a detected risk event is allowed. See notify email type below.
     * @return builder
     */
    def noActionEmail(args: Endofunction[com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmailArgs.Builder]):
        com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmailArgs.builder
      builder.noActionEmail(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cognito.inputs.LogDeliveryConfigurationLogConfigurationArgs.Builder)
    /**
     * @param cloudWatchLogsConfiguration Configuration for CloudWatch Logs delivery. See CloudWatch Logs Configuration below.
     * @return builder
     */
    def cloudWatchLogsConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.LogDeliveryConfigurationLogConfigurationCloudWatchLogsConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.inputs.LogDeliveryConfigurationLogConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.LogDeliveryConfigurationLogConfigurationCloudWatchLogsConfigurationArgs.builder
      builder.cloudWatchLogsConfiguration(args(argsBuilder).build)

    /**
     * @param firehoseConfiguration Configuration for Kinesis Data Firehose delivery. See Firehose Configuration below.
     * @return builder
     */
    def firehoseConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.LogDeliveryConfigurationLogConfigurationFirehoseConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.inputs.LogDeliveryConfigurationLogConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.LogDeliveryConfigurationLogConfigurationFirehoseConfigurationArgs.builder
      builder.firehoseConfiguration(args(argsBuilder).build)

    /**
     * @param s3Configuration Configuration for S3 delivery. See S3 Configuration below.
     *  
     *  &gt; **Note:** At least one destination configuration (`cloudWatchLogsConfiguration`, `firehoseConfiguration`, or `s3Configuration`) must be specified for each log configuration.
     * @return builder
     */
    def s3Configuration(args: Endofunction[com.pulumi.aws.cognito.inputs.LogDeliveryConfigurationLogConfigurationS3ConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.inputs.LogDeliveryConfigurationLogConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.LogDeliveryConfigurationLogConfigurationS3ConfigurationArgs.builder
      builder.s3Configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cognito.inputs.RiskConfigurationState.Builder)
    /**
     * @param accountTakeoverRiskConfiguration The account takeover risk configuration. See details below.
     * @return builder
     */
    def accountTakeoverRiskConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.inputs.RiskConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationArgs.builder
      builder.accountTakeoverRiskConfiguration(args(argsBuilder).build)

    /**
     * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration. See details below.
     * @return builder
     */
    def compromisedCredentialsRiskConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.RiskConfigurationCompromisedCredentialsRiskConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.inputs.RiskConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.RiskConfigurationCompromisedCredentialsRiskConfigurationArgs.builder
      builder.compromisedCredentialsRiskConfiguration(args(argsBuilder).build)

    /**
     * @param riskExceptionConfiguration The configuration to override the risk decision. See details below.
     * @return builder
     */
    def riskExceptionConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.RiskConfigurationRiskExceptionConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.inputs.RiskConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.RiskConfigurationRiskExceptionConfigurationArgs.builder
      builder.riskExceptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cognito.inputs.UserPoolState.Builder)
    /**
     * @param accountRecoverySetting Configuration block to define which verified available method a user can use to recover their forgotten password. Detailed below.
     * @return builder
     */
    def accountRecoverySetting(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolAccountRecoverySettingArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolAccountRecoverySettingArgs.builder
      builder.accountRecoverySetting(args(argsBuilder).build)

    /**
     * @param adminCreateUserConfig Configuration block for creating a new user profile. Detailed below.
     * @return builder
     */
    def adminCreateUserConfig(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolAdminCreateUserConfigArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolAdminCreateUserConfigArgs.builder
      builder.adminCreateUserConfig(args(argsBuilder).build)

    /**
     * @param deviceConfiguration Configuration block for the user pool&#39;s device tracking. Detailed below.
     * @return builder
     */
    def deviceConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolDeviceConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolDeviceConfigurationArgs.builder
      builder.deviceConfiguration(args(argsBuilder).build)

    /**
     * @param emailConfiguration Configuration block for configuring email. Detailed below.
     * @return builder
     */
    def emailConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolEmailConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolEmailConfigurationArgs.builder
      builder.emailConfiguration(args(argsBuilder).build)

    /**
     * @param emailMfaConfiguration Configuration block for configuring email Multi-Factor Authentication (MFA); requires at least 2 `accountRecoverySetting` entries; requires an `emailConfiguration` configuration block. Effective only when `mfaConfiguration` is `ON` or `OPTIONAL`. Detailed below.
     * @return builder
     */
    def emailMfaConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolEmailMfaConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolEmailMfaConfigurationArgs.builder
      builder.emailMfaConfiguration(args(argsBuilder).build)

    /**
     * @param lambdaConfig Configuration block for the AWS Lambda triggers associated with the user pool. Detailed below.
     * @return builder
     */
    def lambdaConfig(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolLambdaConfigArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolLambdaConfigArgs.builder
      builder.lambdaConfig(args(argsBuilder).build)

    /**
     * @param passwordPolicy Configuration block for information about the user pool password policy. Detailed below.
     * @return builder
     */
    def passwordPolicy(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolPasswordPolicyArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolPasswordPolicyArgs.builder
      builder.passwordPolicy(args(argsBuilder).build)

    /**
     * @param schemas Configuration block for the schema attributes of a user pool. Detailed below. Schema attributes from the [standard attribute set](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes) only need to be specified if they are different from the default configuration. Attributes can be added, but not modified or removed. Maximum of 50 attributes.
     * @return builder
     */
    def schemas(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolSchemaArgs.Builder]*):
        com.pulumi.aws.cognito.inputs.UserPoolState.Builder =
      def argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolSchemaArgs.builder
      builder.schemas(args.map(_(argsBuilder).build)*)

    /**
     * @param signInPolicy Configuration block for information about the user pool sign in policy. Detailed below.
     * @return builder
     */
    def signInPolicy(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolSignInPolicyArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolSignInPolicyArgs.builder
      builder.signInPolicy(args(argsBuilder).build)

    /**
     * @param smsConfiguration Configuration block for Short Message Service (SMS) settings. Detailed below. These settings apply to SMS user verification and SMS Multi-Factor Authentication (MFA). SMS MFA is activated only when `mfaConfiguration` is set to `ON` or `OPTIONAL` along with this block. Due to Cognito API restrictions, the SMS configuration cannot be removed without recreating the Cognito User Pool. For user data safety, this resource will ignore the removal of this configuration by disabling drift detection. To force resource recreation after this configuration has been applied, see the `taint` command.
     * @return builder
     */
    def smsConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolSmsConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolSmsConfigurationArgs.builder
      builder.smsConfiguration(args(argsBuilder).build)

    /**
     * @param softwareTokenMfaConfiguration Configuration block for software token Mult-Factor Authentication (MFA) settings. Effective only when `mfaConfiguration` is `ON` or `OPTIONAL`. Detailed below.
     * @return builder
     */
    def softwareTokenMfaConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolSoftwareTokenMfaConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolSoftwareTokenMfaConfigurationArgs.builder
      builder.softwareTokenMfaConfiguration(args(argsBuilder).build)

    /**
     * @param userAttributeUpdateSettings Configuration block for user attribute update settings. Detailed below.
     * @return builder
     */
    def userAttributeUpdateSettings(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolUserAttributeUpdateSettingsArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolUserAttributeUpdateSettingsArgs.builder
      builder.userAttributeUpdateSettings(args(argsBuilder).build)

    /**
     * @param userPoolAddOns Configuration block for user pool add-ons to enable user pool advanced security mode features. Detailed below.
     * @return builder
     */
    def userPoolAddOns(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolUserPoolAddOnsArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolUserPoolAddOnsArgs.builder
      builder.userPoolAddOns(args(argsBuilder).build)

    /**
     * @param usernameConfiguration Configuration block for username configuration. Detailed below.
     * @return builder
     */
    def usernameConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolUsernameConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolUsernameConfigurationArgs.builder
      builder.usernameConfiguration(args(argsBuilder).build)

    /**
     * @param verificationMessageTemplate Configuration block for verification message templates. Detailed below.
     * @return builder
     */
    def verificationMessageTemplate(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolVerificationMessageTemplateArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolVerificationMessageTemplateArgs.builder
      builder.verificationMessageTemplate(args(argsBuilder).build)

    /**
     * @param webAuthnConfiguration Configuration block for web authn configuration. Detailed below.
     * @return builder
     */
    def webAuthnConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolWebAuthnConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolWebAuthnConfigurationArgs.builder
      builder.webAuthnConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cognito.inputs.UserPoolClientState.Builder)
    /**
     * @param analyticsConfiguration Configuration block for Amazon Pinpoint analytics that collects metrics for this user pool. See details below.
     * @return builder
     */
    def analyticsConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolClientAnalyticsConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolClientState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolClientAnalyticsConfigurationArgs.builder
      builder.analyticsConfiguration(args(argsBuilder).build)

    /**
     * @param refreshTokenRotation A block that specifies the configuration of refresh token rotation. Detailed below.
     * @return builder
     */
    def refreshTokenRotation(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolClientRefreshTokenRotationArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolClientState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolClientRefreshTokenRotationArgs.builder
      builder.refreshTokenRotation(args(argsBuilder).build)

    /**
     * @param tokenValidityUnits Configuration block for representing the validity times in units. See details below. Detailed below.
     * @return builder
     */
    def tokenValidityUnits(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolClientTokenValidityUnitsArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolClientState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolClientTokenValidityUnitsArgs.builder
      builder.tokenValidityUnits(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cognito.inputs.RiskConfigurationCompromisedCredentialsRiskConfigurationArgs.Builder)
    /**
     * @param actions The compromised credentials risk configuration actions. See details below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.aws.cognito.inputs.RiskConfigurationCompromisedCredentialsRiskConfigurationActionsArgs.Builder]):
        com.pulumi.aws.cognito.inputs.RiskConfigurationCompromisedCredentialsRiskConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.RiskConfigurationCompromisedCredentialsRiskConfigurationActionsArgs.builder
      builder.actions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cognito.inputs.UserPoolUserPoolAddOnsArgs.Builder)
    /**
     * @param advancedSecurityAdditionalFlows A block to specify the threat protection configuration options for additional authentication types in your user pool, including custom authentication. Detailed below.
     * @return builder
     */
    def advancedSecurityAdditionalFlows(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolUserPoolAddOnsAdvancedSecurityAdditionalFlowsArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolUserPoolAddOnsArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolUserPoolAddOnsAdvancedSecurityAdditionalFlowsArgs.builder
      builder.advancedSecurityAdditionalFlows(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cognito.inputs.ManagedUserPoolClientState.Builder)
    /**
     * @param analyticsConfiguration Configuration block for Amazon Pinpoint analytics that collects metrics for this user pool. See details below.
     * @return builder
     */
    def analyticsConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.ManagedUserPoolClientAnalyticsConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.inputs.ManagedUserPoolClientState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.ManagedUserPoolClientAnalyticsConfigurationArgs.builder
      builder.analyticsConfiguration(args(argsBuilder).build)

    /**
     * @param refreshTokenRotation A block that specifies the configuration of refresh token rotation. Detailed below.
     * @return builder
     */
    def refreshTokenRotation(args: Endofunction[com.pulumi.aws.cognito.inputs.ManagedUserPoolClientRefreshTokenRotationArgs.Builder]):
        com.pulumi.aws.cognito.inputs.ManagedUserPoolClientState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.ManagedUserPoolClientRefreshTokenRotationArgs.builder
      builder.refreshTokenRotation(args(argsBuilder).build)

    /**
     * @param tokenValidityUnits Configuration block for representing the validity times in units. See details below. Detailed below.
     * @return builder
     */
    def tokenValidityUnits(args: Endofunction[com.pulumi.aws.cognito.inputs.ManagedUserPoolClientTokenValidityUnitsArgs.Builder]):
        com.pulumi.aws.cognito.inputs.ManagedUserPoolClientState.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.ManagedUserPoolClientTokenValidityUnitsArgs.builder
      builder.tokenValidityUnits(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cognito.inputs.IdentityPoolRoleAttachmentState.Builder)
    /**
     * @param roleMappings A List of Role Mapping.
     * @return builder
     */
    def roleMappings(args: Endofunction[com.pulumi.aws.cognito.inputs.IdentityPoolRoleAttachmentRoleMappingArgs.Builder]*):
        com.pulumi.aws.cognito.inputs.IdentityPoolRoleAttachmentState.Builder =
      def argsBuilder = com.pulumi.aws.cognito.inputs.IdentityPoolRoleAttachmentRoleMappingArgs.builder
      builder.roleMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationActionsArgs.Builder)
    /**
     * @param highAction Action to take for a high risk. See action block below.
     * @return builder
     */
    def highAction(args: Endofunction[com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationActionsHighActionArgs.Builder]):
        com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationActionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationActionsHighActionArgs.builder
      builder.highAction(args(argsBuilder).build)

    /**
     * @param lowAction Action to take for a low risk. See action block below.
     * @return builder
     */
    def lowAction(args: Endofunction[com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationActionsLowActionArgs.Builder]):
        com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationActionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationActionsLowActionArgs.builder
      builder.lowAction(args(argsBuilder).build)

    /**
     * @param mediumAction Action to take for a medium risk. See action block below.
     * @return builder
     */
    def mediumAction(args: Endofunction[com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationActionsMediumActionArgs.Builder]):
        com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationActionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationActionsMediumActionArgs.builder
      builder.mediumAction(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cognito.inputs.UserPoolLambdaConfigArgs.Builder)
    /**
     * @param customEmailSender A custom email sender AWS Lambda trigger. See customEmailSender Below.
     * @return builder
     */
    def customEmailSender(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolLambdaConfigCustomEmailSenderArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolLambdaConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolLambdaConfigCustomEmailSenderArgs.builder
      builder.customEmailSender(args(argsBuilder).build)

    /**
     * @param customSmsSender A custom SMS sender AWS Lambda trigger. See customSmsSender Below.
     * @return builder
     */
    def customSmsSender(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolLambdaConfigCustomSmsSenderArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolLambdaConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolLambdaConfigCustomSmsSenderArgs.builder
      builder.customSmsSender(args(argsBuilder).build)

    /**
     * @param preTokenGenerationConfig Allow to customize access tokens. See pre_token_configuration_type
     * @return builder
     */
    def preTokenGenerationConfig(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolLambdaConfigPreTokenGenerationConfigArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolLambdaConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolLambdaConfigPreTokenGenerationConfigArgs.builder
      builder.preTokenGenerationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cognito.inputs.UserPoolAdminCreateUserConfigArgs.Builder)
    /**
     * @param inviteMessageTemplate Invite message template structure. Detailed below.
     * @return builder
     */
    def inviteMessageTemplate(args: Endofunction[com.pulumi.aws.cognito.inputs.UserPoolAdminCreateUserConfigInviteMessageTemplateArgs.Builder]):
        com.pulumi.aws.cognito.inputs.UserPoolAdminCreateUserConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.UserPoolAdminCreateUserConfigInviteMessageTemplateArgs.builder
      builder.inviteMessageTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cognito.inputs.LogDeliveryConfigurationState.Builder)
    /**
     * @param logConfigurations Configuration block for log delivery. At least one configuration block is required. See Log Configurations below.
     * @return builder
     */
    def logConfigurations(args: Endofunction[com.pulumi.aws.cognito.inputs.LogDeliveryConfigurationLogConfigurationArgs.Builder]*):
        com.pulumi.aws.cognito.inputs.LogDeliveryConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.cognito.inputs.LogDeliveryConfigurationLogConfigurationArgs.builder
      builder.logConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationArgs.Builder)
    /**
     * @param actions Account takeover risk configuration actions. See details below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationActionsArgs.Builder]):
        com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationActionsArgs.builder
      builder.actions(args(argsBuilder).build)

    /**
     * @param notifyConfiguration The notify configuration used to construct email notifications. See details below.
     * @return builder
     */
    def notifyConfiguration(args: Endofunction[com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationArgs.Builder]):
        com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationArgs.builder
      builder.notifyConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cognito.inputs.IdentityPoolState.Builder)
    /**
     * @param cognitoIdentityProviders An array of Amazon Cognito Identity user pools and their client IDs.
     * @return builder
     */
    def cognitoIdentityProviders(args: Endofunction[com.pulumi.aws.cognito.inputs.IdentityPoolCognitoIdentityProviderArgs.Builder]*):
        com.pulumi.aws.cognito.inputs.IdentityPoolState.Builder =
      def argsBuilder = com.pulumi.aws.cognito.inputs.IdentityPoolCognitoIdentityProviderArgs.builder
      builder.cognitoIdentityProviders(args.map(_(argsBuilder).build)*)
