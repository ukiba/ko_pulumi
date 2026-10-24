package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object apimanagement:
  /** Manages an API within an API Management Service. */
  def Api(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.ApiArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.Api(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a API Management Service API Diagnostics Logs. */
  def ApiDiagnostic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiDiagnosticArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.ApiDiagnosticArgs.builder
    com.pulumi.azure.apimanagement.ApiDiagnostic(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Operation within an API Management Service. */
  def ApiOperation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiOperationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.ApiOperationArgs.builder
    com.pulumi.azure.apimanagement.ApiOperation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management API Operation Policy */
  def ApiOperationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiOperationPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.ApiOperationPolicyArgs.builder
    com.pulumi.azure.apimanagement.ApiOperationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a API Management API Operation Tag. */
  def ApiOperationTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiOperationTagArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.ApiOperationTagArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.ApiOperationTag(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management API Policy */
  def ApiPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.ApiPolicyArgs.builder
    com.pulumi.azure.apimanagement.ApiPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a API Management API Release. */
  def ApiRelease(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiReleaseArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.ApiReleaseArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.ApiRelease(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Schema within an API Management Service. */
  def ApiSchema(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiSchemaArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.ApiSchemaArgs.builder
    com.pulumi.azure.apimanagement.ApiSchema(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages the Assignment of an API Management API Tag to an API. */
  def ApiTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiTagArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.ApiTagArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.ApiTag(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Tag Description within an API Management Service. */
  def ApiTagDescription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiTagDescriptionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.ApiTagDescriptionArgs.builder
    com.pulumi.azure.apimanagement.ApiTagDescription(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Version Set within an API Management Service. */
  def ApiVersionSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiVersionSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.ApiVersionSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.ApiVersionSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object ApimanagementFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing API Management API. */
    inline def getApi(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GetApiArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.apimanagement.outputs.GetApiResult] =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GetApiArgs.builder
      com.pulumi.azure.apimanagement.ApimanagementFunctions.getApi(args(argsBuilder).build)

    /** Use this data source to access information about an existing API Management API. */
    inline def getApiPlain(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GetApiPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.apimanagement.outputs.GetApiResult] =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GetApiPlainArgs.builder
      com.pulumi.azure.apimanagement.ApimanagementFunctions.getApiPlain(args(argsBuilder).build)

    /** Uses this data source to access information about an API Version Set within an API Management Service. */
    inline def getApiVersionSet(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GetApiVersionSetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.apimanagement.outputs.GetApiVersionSetResult] =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GetApiVersionSetArgs.builder
      com.pulumi.azure.apimanagement.ApimanagementFunctions.getApiVersionSet(args(argsBuilder).build)

    /** Uses this data source to access information about an API Version Set within an API Management Service. */
    inline def getApiVersionSetPlain(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GetApiVersionSetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.apimanagement.outputs.GetApiVersionSetResult] =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GetApiVersionSetPlainArgs.builder
      com.pulumi.azure.apimanagement.ApimanagementFunctions.getApiVersionSetPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing API Management Gateway. */
    inline def getGateway(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GetGatewayArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.apimanagement.outputs.GetGatewayResult] =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GetGatewayArgs.builder
      com.pulumi.azure.apimanagement.ApimanagementFunctions.getGateway(args(argsBuilder).build)

    /** Use this data source to access information about an existing API Management Gateway. */
    inline def getGatewayPlain(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GetGatewayPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.apimanagement.outputs.GetGatewayResult] =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GetGatewayPlainArgs.builder
      com.pulumi.azure.apimanagement.ApimanagementFunctions.getGatewayPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing API Management Gateway Host Configuration. */
    inline def getGatewayHostNameConfiguration(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GetGatewayHostNameConfigurationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.apimanagement.outputs.GetGatewayHostNameConfigurationResult] =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GetGatewayHostNameConfigurationArgs.builder
      com.pulumi.azure.apimanagement.ApimanagementFunctions.getGatewayHostNameConfiguration(args(argsBuilder).build)

    /** Use this data source to access information about an existing API Management Gateway Host Configuration. */
    inline def getGatewayHostNameConfigurationPlain(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GetGatewayHostNameConfigurationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.apimanagement.outputs.GetGatewayHostNameConfigurationResult] =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GetGatewayHostNameConfigurationPlainArgs.builder
      com.pulumi.azure.apimanagement.ApimanagementFunctions.getGatewayHostNameConfigurationPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing API Management Group. */
    inline def getGroup(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GetGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.apimanagement.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GetGroupArgs.builder
      com.pulumi.azure.apimanagement.ApimanagementFunctions.getGroup(args(argsBuilder).build)

    /** Use this data source to access information about an existing API Management Group. */
    inline def getGroupPlain(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GetGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.apimanagement.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GetGroupPlainArgs.builder
      com.pulumi.azure.apimanagement.ApimanagementFunctions.getGroupPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing API Management Product. */
    inline def getProduct(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GetProductArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.apimanagement.outputs.GetProductResult] =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GetProductArgs.builder
      com.pulumi.azure.apimanagement.ApimanagementFunctions.getProduct(args(argsBuilder).build)

    /** Use this data source to access information about an existing API Management Product. */
    inline def getProductPlain(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GetProductPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.apimanagement.outputs.GetProductResult] =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GetProductPlainArgs.builder
      com.pulumi.azure.apimanagement.ApimanagementFunctions.getProductPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing API Management Service. */
    inline def getService(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GetServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.apimanagement.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GetServiceArgs.builder
      com.pulumi.azure.apimanagement.ApimanagementFunctions.getService(args(argsBuilder).build)

    /** Use this data source to access information about an existing API Management Service. */
    inline def getServicePlain(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GetServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.apimanagement.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GetServicePlainArgs.builder
      com.pulumi.azure.apimanagement.ApimanagementFunctions.getServicePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing API Management Subscription. */
    inline def getSubscription(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GetSubscriptionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.apimanagement.outputs.GetSubscriptionResult] =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GetSubscriptionArgs.builder
      com.pulumi.azure.apimanagement.ApimanagementFunctions.getSubscription(args(argsBuilder).build)

    /** Use this data source to access information about an existing API Management Subscription. */
    inline def getSubscriptionPlain(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GetSubscriptionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.apimanagement.outputs.GetSubscriptionResult] =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GetSubscriptionPlainArgs.builder
      com.pulumi.azure.apimanagement.ApimanagementFunctions.getSubscriptionPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing API Management User. */
    inline def getUser(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GetUserArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.apimanagement.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GetUserArgs.builder
      com.pulumi.azure.apimanagement.ApimanagementFunctions.getUser(args(argsBuilder).build)

    /** Use this data source to access information about an existing API Management User. */
    inline def getUserPlain(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GetUserPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.apimanagement.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GetUserPlainArgs.builder
      com.pulumi.azure.apimanagement.ApimanagementFunctions.getUserPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing API Management Workspace. */
    inline def getWorkspace(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GetWorkspaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.apimanagement.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GetWorkspaceArgs.builder
      com.pulumi.azure.apimanagement.ApimanagementFunctions.getWorkspace(args(argsBuilder).build)

    /** Use this data source to access information about an existing API Management Workspace. */
    inline def getWorkspacePlain(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GetWorkspacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.apimanagement.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GetWorkspacePlainArgs.builder
      com.pulumi.azure.apimanagement.ApimanagementFunctions.getWorkspacePlain(args(argsBuilder).build)

  /** Manages an Authorization Server within an API Management Service. */
  def AuthorizationServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.AuthorizationServerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.AuthorizationServerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.AuthorizationServer(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a backend within an API Management Service. */
  def Backend(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.BackendArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.BackendArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.Backend(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Certificate within an API Management Service. */
  def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.CertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.CertificateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.Certificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a API Management Custom Domain.
   * 
   * ## Disclaimers
   * 
   * &gt; **Note:** It&#39;s possible to define Custom Domains both within the `azure.apimanagement.Service` resource via the `hostnameConfigurations` block and by using this resource. However it&#39;s not possible to use both methods to manage Custom Domains within an API Management Service, since there will be conflicts.
   */
  def CustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.CustomDomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.CustomDomainArgs.builder
    com.pulumi.azure.apimanagement.CustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management Service Diagnostic. */
  def Diagnostic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.DiagnosticArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.DiagnosticArgs.builder
    com.pulumi.azure.apimanagement.Diagnostic(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a API Management Email Template. */
  def EmailTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.EmailTemplateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.EmailTemplateArgs.builder
    com.pulumi.azure.apimanagement.EmailTemplate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management Gateway. */
  def Gateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.GatewayArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.GatewayArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.Gateway(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a API Management Gateway API. */
  def GatewayApi(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.GatewayApiArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.GatewayApiArgs.builder
    com.pulumi.azure.apimanagement.GatewayApi(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management Gateway Certificate Authority. */
  def GatewayCertificateAuthority(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.GatewayCertificateAuthorityArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.GatewayCertificateAuthorityArgs.builder
    com.pulumi.azure.apimanagement.GatewayCertificateAuthority(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management Gateway Host Name Configuration. */
  def GatewayHostNameConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.GatewayHostNameConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.GatewayHostNameConfigurationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.GatewayHostNameConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Global Schema within an API Management Service. */
  def GlobalSchema(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.GlobalSchemaArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.GlobalSchemaArgs.builder
    com.pulumi.azure.apimanagement.GlobalSchema(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management Group. */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.GroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.GroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.Group(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management User Assignment to a Group. */
  def GroupUser(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.GroupUserArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.GroupUserArgs.builder
    com.pulumi.azure.apimanagement.GroupUser(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management AAD Identity Provider. */
  def IdentityProviderAad(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.IdentityProviderAadArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.IdentityProviderAadArgs.builder
    com.pulumi.azure.apimanagement.IdentityProviderAad(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management Azure AD B2C Identity Provider. */
  def IdentityProviderAadb2c(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.IdentityProviderAadb2cArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.IdentityProviderAadb2cArgs.builder
    com.pulumi.azure.apimanagement.IdentityProviderAadb2c(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management Facebook Identity Provider. */
  def IdentityProviderFacebook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.IdentityProviderFacebookArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.IdentityProviderFacebookArgs.builder
    com.pulumi.azure.apimanagement.IdentityProviderFacebook(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management Google Identity Provider. */
  def IdentityProviderGoogle(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.IdentityProviderGoogleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.IdentityProviderGoogleArgs.builder
    com.pulumi.azure.apimanagement.IdentityProviderGoogle(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management Microsoft Identity Provider. */
  def IdentityProviderMicrosoft(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.IdentityProviderMicrosoftArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.IdentityProviderMicrosoftArgs.builder
    com.pulumi.azure.apimanagement.IdentityProviderMicrosoft(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management Twitter Identity Provider. */
  def IdentityProviderTwitter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.IdentityProviderTwitterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.IdentityProviderTwitterArgs.builder
    com.pulumi.azure.apimanagement.IdentityProviderTwitter(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Logger within an API Management Service. */
  def Logger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.LoggerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.LoggerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.Logger(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management Named Value. */
  def NamedValue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.NamedValueArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.NamedValueArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.NamedValue(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a API Management Notification Recipient Email. */
  def NotificationRecipientEmail(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.NotificationRecipientEmailArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.NotificationRecipientEmailArgs.builder
    com.pulumi.azure.apimanagement.NotificationRecipientEmail(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a API Management Notification Recipient User. */
  def NotificationRecipientUser(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.NotificationRecipientUserArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.NotificationRecipientUserArgs.builder
    com.pulumi.azure.apimanagement.NotificationRecipientUser(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an OpenID Connect Provider within a API Management Service. */
  def OpenIdConnectProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.OpenIdConnectProviderArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.OpenIdConnectProviderArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.OpenIdConnectProvider(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a API Management service Policy.
   * 
   * &gt; **Note:** This resource will, upon creation, **overwrite any existing policy in the API Management service**, as there is no feasible way to test whether the policy has been modified from the default. Similarly, when this resource is destroyed, the API Management service will revert to its default policy.
   */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.PolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.PolicyArgs.builder
    com.pulumi.azure.apimanagement.Policy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Api Management Policy Fragment. */
  def PolicyFragment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.PolicyFragmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.PolicyFragmentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.PolicyFragment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management Product. */
  def Product(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ProductArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.ProductArgs.builder
    com.pulumi.azure.apimanagement.Product(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management API Assignment to a Product. */
  def ProductApi(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ProductApiArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.ProductApiArgs.builder
    com.pulumi.azure.apimanagement.ProductApi(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management Product Assignment to a Group. */
  def ProductGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ProductGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.ProductGroupArgs.builder
    com.pulumi.azure.apimanagement.ProductGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management Product Policy */
  def ProductPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ProductPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.ProductPolicyArgs.builder
    com.pulumi.azure.apimanagement.ProductPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management Product tag */
  def ProductTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ProductTagArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.ProductTagArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.ProductTag(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a API Management Redis Cache. */
  def RedisCache(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.RedisCacheArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.RedisCacheArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.RedisCache(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an API Management Service.
   * 
   * ## Disclaimers
   * 
   * &gt; **Note:** When creating a new API Management resource in version 3.0 of the AzureRM Provider and later, please be aware that the AzureRM Provider will now clean up any sample APIs and Products created by the Azure API during the creation of the API Management resource.
   * 
   * &gt; **Note:** Version 2.77 and later of the Azure Provider include a Feature Toggle which will purge an API Management resource on destroy, rather than the default soft-delete. See the Features block documentation for more information on Feature Toggles within Terraform.
   * 
   * &gt; **Note:** It&#39;s possible to define Custom Domains both within the `azure.apimanagement.Service` resource via the `hostnameConfigurations` block and by using the `azure.apimanagement.CustomDomain` resource. However it&#39;s not possible to use both methods to manage Custom Domains within an API Management Service, since there&#39;ll be conflicts.
   */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ServiceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.ServiceArgs.builder
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
    com.pulumi.azure.apimanagement.Service(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure API Management Standalone Gateway. */
  def StandaloneGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.StandaloneGatewayArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.StandaloneGatewayArgs.builder
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
    com.pulumi.azure.apimanagement.StandaloneGateway(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Subscription within a API Management Service. */
  def Subscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.SubscriptionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.SubscriptionArgs.builder
    com.pulumi.azure.apimanagement.Subscription(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a API Management Tag. */
  def Tag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.TagArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.TagArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.Tag(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management User. */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.UserArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.UserArgs.builder
    com.pulumi.azure.apimanagement.User(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an API Management Workspace.
   * 
   * &gt; **Note:** This resource is currently available only when using the Classic Premium SKU of `azure.apimanagement.Service`. For more details, refer to [Federated API Management with Workspaces](https://learn.microsoft.com/en-us/azure/api-management/workspaces-overview).
   */
  def Workspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.WorkspaceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.WorkspaceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.Workspace(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Version Set within an API Management Workspace. */
  def WorkspaceApiVersionSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.WorkspaceApiVersionSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.WorkspaceApiVersionSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.WorkspaceApiVersionSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Certificate within an API Management Workspace. */
  def WorkspaceCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.WorkspaceCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.WorkspaceCertificateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.WorkspaceCertificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management Workspace Named Value. */
  def WorkspaceNamedValue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.WorkspaceNamedValueArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.WorkspaceNamedValueArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.WorkspaceNamedValue(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management Workspace Policy. */
  def WorkspacePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.WorkspacePolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.apimanagement.WorkspacePolicyArgs.builder
    com.pulumi.azure.apimanagement.WorkspacePolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an API Management Workspace Policy Fragment. */
  def WorkspacePolicyFragment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.WorkspacePolicyFragmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.WorkspacePolicyFragmentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.WorkspacePolicyFragment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
