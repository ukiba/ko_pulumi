package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object cognito:
  object CognitoFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS Cognito Identity Pool. */
    inline def getIdentityPool(args: Endofunction[com.pulumi.aws.cognito.inputs.GetIdentityPoolArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cognito.outputs.GetIdentityPoolResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetIdentityPoolArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getIdentityPool(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS Cognito Identity Pool. */
    inline def getIdentityPoolPlain(args: Endofunction[com.pulumi.aws.cognito.inputs.GetIdentityPoolPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cognito.outputs.GetIdentityPoolResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetIdentityPoolPlainArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getIdentityPoolPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS Cognito IDP (Identity Provider) User Group. */
    inline def getUserGroup(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cognito.outputs.GetUserGroupResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserGroupArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS Cognito IDP (Identity Provider) User Group. */
    inline def getUserGroupPlain(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cognito.outputs.GetUserGroupResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserGroupPlainArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing AWS Cognito IDP (Identity Provider) User Groups. */
    inline def getUserGroups(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserGroupsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cognito.outputs.GetUserGroupsResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserGroupsArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserGroups(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing AWS Cognito IDP (Identity Provider) User Groups. */
    inline def getUserGroupsPlain(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserGroupsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cognito.outputs.GetUserGroupsResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserGroupsPlainArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserGroupsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS Cognito User Pool. */
    inline def getUserPool(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserPoolArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cognito.outputs.GetUserPoolResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserPoolArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserPool(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS Cognito User Pool. */
    inline def getUserPoolPlain(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserPoolPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cognito.outputs.GetUserPoolResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserPoolPlainArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserPoolPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides a Cognito User Pool Client resource. */
    inline def getUserPoolClient(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserPoolClientArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cognito.outputs.GetUserPoolClientResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserPoolClientArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserPoolClient(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides a Cognito User Pool Client resource. */
    inline def getUserPoolClientPlain(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserPoolClientPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cognito.outputs.GetUserPoolClientResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserPoolClientPlainArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserPoolClientPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get a list of Cognito user pools clients for a Cognito IdP user pool. */
    inline def getUserPoolClients(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserPoolClientsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cognito.outputs.GetUserPoolClientsResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserPoolClientsArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserPoolClients(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get a list of Cognito user pools clients for a Cognito IdP user pool. */
    inline def getUserPoolClientsPlain(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserPoolClientsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cognito.outputs.GetUserPoolClientsResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserPoolClientsPlainArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserPoolClientsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get the signing certificate for a Cognito IdP user pool. */
    inline def getUserPoolSigningCertificate(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserPoolSigningCertificateArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cognito.outputs.GetUserPoolSigningCertificateResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserPoolSigningCertificateArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserPoolSigningCertificate(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get the signing certificate for a Cognito IdP user pool. */
    inline def getUserPoolSigningCertificatePlain(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserPoolSigningCertificatePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cognito.outputs.GetUserPoolSigningCertificateResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserPoolSigningCertificatePlainArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserPoolSigningCertificatePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get a list of cognito user pools. */
    inline def getUserPools(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserPoolsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cognito.outputs.GetUserPoolsResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserPoolsArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserPools(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get a list of cognito user pools. */
    inline def getUserPoolsPlain(args: Endofunction[com.pulumi.aws.cognito.inputs.GetUserPoolsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cognito.outputs.GetUserPoolsResult] =
      val argsBuilder = com.pulumi.aws.cognito.inputs.GetUserPoolsPlainArgs.builder
      com.pulumi.aws.cognito.CognitoFunctions.getUserPoolsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Provides an AWS Cognito Identity Pool. */
  def IdentityPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.IdentityPoolArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cognito.IdentityPoolArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cognito.IdentityPool(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AWS Cognito Identity Principal Mapping. */
  def IdentityPoolProviderPrincipalTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.IdentityPoolProviderPrincipalTagArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cognito.IdentityPoolProviderPrincipalTagArgs.builder
    com.pulumi.aws.cognito.IdentityPoolProviderPrincipalTag(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an AWS Cognito Identity Pool Roles Attachment.
   * 
   * ## Import
   * 
   * Using `pulumi import`, import Cognito Identity Pool Roles Attachment using the Identity Pool ID. For example:
   * 
   * ```sh
   * \$ pulumi import aws:cognito/identityPoolRoleAttachment:IdentityPoolRoleAttachment example us-west-2:b64805ad-cb56-40ba-9ffc-f5d8207e6d42
   * ```
   */
  def IdentityPoolRoleAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.IdentityPoolRoleAttachmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cognito.IdentityPoolRoleAttachmentArgs.builder
    com.pulumi.aws.cognito.IdentityPoolRoleAttachment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Cognito User Identity Provider resource. */
  def IdentityProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.IdentityProviderArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cognito.IdentityProviderArgs.builder
    com.pulumi.aws.cognito.IdentityProvider(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Cognito IDP (Identity Provider) Log Delivery Configuration. */
  def LogDeliveryConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.LogDeliveryConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cognito.LogDeliveryConfigurationArgs.builder
    com.pulumi.aws.cognito.LogDeliveryConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages branding settings for a user pool style and associates it with an app client. */
  def ManagedLoginBranding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.ManagedLoginBrandingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cognito.ManagedLoginBrandingArgs.builder
    com.pulumi.aws.cognito.ManagedLoginBranding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Use the `aws.cognito.UserPoolClient` resource to manage a Cognito User Pool Client.
   * 
   * **This resource is advanced** and has special caveats to consider before use. Please read this document completely before using the resource.
   * 
   * Use the `aws.cognito.ManagedUserPoolClient` resource to manage a Cognito User Pool Client that is automatically created by an AWS service. For instance, when [configuring an OpenSearch Domain to use Cognito authentication](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html), the OpenSearch service creates the User Pool Client during setup and removes it when it is no longer required. As a result, the `aws.cognito.ManagedUserPoolClient` resource does not create or delete this resource, but instead assumes management of it.
   * 
   * Use the `aws.cognito.UserPoolClient` resource to manage Cognito User Pool Clients for normal use cases.
   */
  def ManagedUserPoolClient(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.ManagedUserPoolClientArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cognito.ManagedUserPoolClientArgs.builder
    com.pulumi.aws.cognito.ManagedUserPoolClient(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Cognito Resource Server. */
  def ResourceServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.ResourceServerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cognito.ResourceServerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cognito.ResourceServer(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Cognito Risk Configuration resource. */
  def RiskConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.RiskConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cognito.RiskConfigurationArgs.builder
    com.pulumi.aws.cognito.RiskConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Cognito User Resource. */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.UserArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cognito.UserArgs.builder
    com.pulumi.aws.cognito.User(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Cognito User Group resource. */
  def UserGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.UserGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cognito.UserGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cognito.UserGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Adds the specified user to the specified group. */
  def UserInGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.UserInGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cognito.UserInGroupArgs.builder
    com.pulumi.aws.cognito.UserInGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Cognito User Pool resource. */
  def UserPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.UserPoolArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cognito.UserPoolArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cognito.UserPool(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a Cognito User Pool Client resource.
   * 
   * To manage a User Pool Client created by another service, such as when [configuring an OpenSearch Domain to use Cognito authentication](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html),
   * use the `aws.cognito.ManagedUserPoolClient` resource instead.
   */
  def UserPoolClient(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.UserPoolClientArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cognito.UserPoolClientArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cognito.UserPoolClient(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Cognito User Pool Domain resource. */
  def UserPoolDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.UserPoolDomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cognito.UserPoolDomainArgs.builder
    com.pulumi.aws.cognito.UserPoolDomain(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a Cognito User Pool UI Customization resource.
   * 
   * &gt; **Note:** To use this resource, the user pool must have a domain associated with it. For more information, see the Amazon Cognito Developer Guide on [Customizing the Built-in Sign-In and Sign-up Webpages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-app-ui-customization.html).
   */
  def UserPoolUICustomization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cognito.UserPoolUICustomizationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cognito.UserPoolUICustomizationArgs.builder
    com.pulumi.aws.cognito.UserPoolUICustomization(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
