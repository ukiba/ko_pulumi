package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object apimanagement:
  extension (builder: com.pulumi.azure.apimanagement.ServiceArgs.Builder)
    /**
     * @param additionalLocations One or more `additionalLocation` blocks as defined below.
     * @return builder
     */
    def additionalLocations(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceAdditionalLocationArgs.Builder]*):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceAdditionalLocationArgs.builder
      builder.additionalLocations(args.map(_(argsBuilder).build)*)

    /**
     * @param certificates One or more `certificate` blocks (up to 10) as defined below.
     * @return builder
     */
    def certificates(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceCertificateArgs.Builder]*):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

    /**
     * @param delegation A `delegation` block as defined below.
     * @return builder
     */
    def delegation(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceDelegationArgs.Builder]):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceDelegationArgs.builder
      builder.delegation(args(argsBuilder).build)

    /**
     * @param hostnameConfiguration A `hostnameConfiguration` block as defined below.
     * @return builder
     */
    def hostnameConfiguration(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationArgs.Builder]):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationArgs.builder
      builder.hostnameConfiguration(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceIdentityArgs.Builder]):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param protocols A `protocols` block as defined below.
     * @return builder
     */
    def protocols(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceProtocolsArgs.Builder]):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceProtocolsArgs.builder
      builder.protocols(args(argsBuilder).build)

    /**
     * @param security A `security` block as defined below.
     * @return builder
     */
    def security(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceSecurityArgs.Builder]):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceSecurityArgs.builder
      builder.security(args(argsBuilder).build)

    /**
     * @param signIn A `signIn` block as defined below.
     * @return builder
     */
    def signIn(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceSignInArgs.Builder]):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceSignInArgs.builder
      builder.signIn(args(argsBuilder).build)

    /**
     * @param signUp A `signUp` block as defined below.
     * @return builder
     */
    def signUp(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceSignUpArgs.Builder]):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceSignUpArgs.builder
      builder.signUp(args(argsBuilder).build)

    /**
     * @param tenantAccess A `tenantAccess` block as defined below.
     * @return builder
     */
    def tenantAccess(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceTenantAccessArgs.Builder]):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceTenantAccessArgs.builder
      builder.tenantAccess(args(argsBuilder).build)

    /**
     * @param virtualNetworkConfiguration A `virtualNetworkConfiguration` block as defined below. Required when `virtualNetworkType` is `External` or `Internal`.
     * @return builder
     */
    def virtualNetworkConfiguration(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceVirtualNetworkConfigurationArgs.Builder]):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceVirtualNetworkConfigurationArgs.builder
      builder.virtualNetworkConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Azure API Management Standalone Gateway. */
  def StandaloneGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.StandaloneGatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.StandaloneGatewayArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.apimanagement.StandaloneGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API Management Twitter Identity Provider. */
  def IdentityProviderTwitter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.IdentityProviderTwitterArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.IdentityProviderTwitterArgs.builder
    com.pulumi.azure.apimanagement.IdentityProviderTwitter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Global Schema within an API Management Service. */
  def GlobalSchema(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.GlobalSchemaArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.GlobalSchemaArgs.builder
    com.pulumi.azure.apimanagement.GlobalSchema(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.apimanagement.ApiOperationArgs.Builder)
    /**
     * @param request A `request` block as defined below.
     * @return builder
     */
    def request(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationRequestArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiOperationArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationRequestArgs.builder
      builder.request(args(argsBuilder).build)

    /**
     * @param responses One or more `response` blocks as defined below.
     * @return builder
     */
    def responses(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationResponseArgs.Builder]*):
        com.pulumi.azure.apimanagement.ApiOperationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationResponseArgs.builder
      builder.responses(args.map(_(argsBuilder).build)*)

    /**
     * @param templateParameters One or more `templateParameter` blocks as defined below. Required if `urlTemplate` contains one or more parameters.
     * @return builder
     */
    def templateParameters(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationTemplateParameterArgs.Builder]*):
        com.pulumi.azure.apimanagement.ApiOperationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationTemplateParameterArgs.builder
      builder.templateParameters(args.map(_(argsBuilder).build)*)

  /** Manages a API Management Service API Diagnostics Logs. */
  def ApiDiagnostic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiDiagnosticArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.ApiDiagnosticArgs.builder
    com.pulumi.azure.apimanagement.ApiDiagnostic(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the Assignment of an API Management API Tag to an API. */
  def ApiTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiTagArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.ApiTagArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.ApiTag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a API Management Custom Domain.
   * 
   *  ## Disclaimers
   * 
   *  &gt; **Note:** It&#39;s possible to define Custom Domains both within the `azure.apimanagement.Service` resource via the `hostnameConfigurations` block and by using this resource. However it&#39;s not possible to use both methods to manage Custom Domains within an API Management Service, since there will be conflicts.
   */
  def CustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.CustomDomainArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.CustomDomainArgs.builder
    com.pulumi.azure.apimanagement.CustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.apimanagement.AuthorizationServerArgs.Builder)
    /**
     * @param tokenBodyParameters A `tokenBodyParameter` block as defined below.
     * @return builder
     */
    def tokenBodyParameters(args: Endofunction[com.pulumi.azure.apimanagement.inputs.AuthorizationServerTokenBodyParameterArgs.Builder]*):
        com.pulumi.azure.apimanagement.AuthorizationServerArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.AuthorizationServerTokenBodyParameterArgs.builder
      builder.tokenBodyParameters(args.map(_(argsBuilder).build)*)

  /** Manages an API Management Product tag */
  def ProductTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ProductTagArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.ProductTagArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.ProductTag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a backend within an API Management Service. */
  def Backend(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.BackendArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.BackendArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.Backend(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API Management Product Policy */
  def ProductPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ProductPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.ProductPolicyArgs.builder
    com.pulumi.azure.apimanagement.ProductPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API Version Set within an API Management Workspace. */
  def WorkspaceApiVersionSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.WorkspaceApiVersionSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.WorkspaceApiVersionSetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.WorkspaceApiVersionSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.apimanagement.ApiDiagnosticArgs.Builder)
    /**
     * @param backendRequest A `backendRequest` block as defined below.
     * @return builder
     */
    def backendRequest(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiDiagnosticArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestArgs.builder
      builder.backendRequest(args(argsBuilder).build)

    /**
     * @param backendResponse A `backendResponse` block as defined below.
     * @return builder
     */
    def backendResponse(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiDiagnosticArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseArgs.builder
      builder.backendResponse(args(argsBuilder).build)

    /**
     * @param frontendRequest A `frontendRequest` block as defined below.
     * @return builder
     */
    def frontendRequest(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiDiagnosticArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestArgs.builder
      builder.frontendRequest(args(argsBuilder).build)

    /**
     * @param frontendResponse A `frontendResponse` block as defined below.
     * @return builder
     */
    def frontendResponse(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiDiagnosticArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseArgs.builder
      builder.frontendResponse(args(argsBuilder).build)

  /** Manages an API Management Product. */
  def Product(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ProductArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.ProductArgs.builder
    com.pulumi.azure.apimanagement.Product(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API Management Group. */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.GroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.GroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.Group(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API Tag Description within an API Management Service. */
  def ApiTagDescription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiTagDescriptionArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.ApiTagDescriptionArgs.builder
    com.pulumi.azure.apimanagement.ApiTagDescription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a API Management Tag. */
  def Tag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.TagArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.TagArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.Tag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API Management Named Value. */
  def NamedValue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.NamedValueArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.NamedValueArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.NamedValue(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Authorization Server within an API Management Service. */
  def AuthorizationServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.AuthorizationServerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.AuthorizationServerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.AuthorizationServer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Logger within an API Management Service. */
  def Logger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.LoggerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.LoggerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.Logger(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.apimanagement.BackendArgs.Builder)
    /**
     * @param circuitBreakerRule A `circuitBreakerRule` block as documented below.
     * @return builder
     */
    def circuitBreakerRule(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleArgs.Builder]):
        com.pulumi.azure.apimanagement.BackendArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleArgs.builder
      builder.circuitBreakerRule(args(argsBuilder).build)

    /**
     * @param credentials A `credentials` block as documented below.
     * @return builder
     */
    def credentials(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendCredentialsArgs.Builder]):
        com.pulumi.azure.apimanagement.BackendArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendCredentialsArgs.builder
      builder.credentials(args(argsBuilder).build)

    /**
     * @param proxy A `proxy` block as documented below.
     * @return builder
     */
    def proxy(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendProxyArgs.Builder]):
        com.pulumi.azure.apimanagement.BackendArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendProxyArgs.builder
      builder.proxy(args(argsBuilder).build)

    /**
     * @param serviceFabricCluster A `serviceFabricCluster` block as documented below.
     * @return builder
     */
    def serviceFabricCluster(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendServiceFabricClusterArgs.Builder]):
        com.pulumi.azure.apimanagement.BackendArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendServiceFabricClusterArgs.builder
      builder.serviceFabricCluster(args(argsBuilder).build)

    /**
     * @param tls A `tls` block as documented below.
     * @return builder
     */
    def tls(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendTlsArgs.Builder]):
        com.pulumi.azure.apimanagement.BackendArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendTlsArgs.builder
      builder.tls(args(argsBuilder).build)

  /** Manages an API Management Gateway. */
  def Gateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.GatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.GatewayArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.Gateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a API Management Redis Cache. */
  def RedisCache(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.RedisCacheArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.RedisCacheArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.RedisCache(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API Management Service Diagnostic. */
  def Diagnostic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.DiagnosticArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.DiagnosticArgs.builder
    com.pulumi.azure.apimanagement.Diagnostic(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API Schema within an API Management Service. */
  def ApiSchema(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiSchemaArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.ApiSchemaArgs.builder
    com.pulumi.azure.apimanagement.ApiSchema(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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

  /** Manages an API Management User. */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.UserArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.UserArgs.builder
    com.pulumi.azure.apimanagement.User(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API Management Product Assignment to a Group. */
  def ProductGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ProductGroupArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.ProductGroupArgs.builder
    com.pulumi.azure.apimanagement.ProductGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Certificate within an API Management Service. */
  def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.CertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.CertificateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.Certificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a API Management Notification Recipient User. */
  def NotificationRecipientUser(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.NotificationRecipientUserArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.NotificationRecipientUserArgs.builder
    com.pulumi.azure.apimanagement.NotificationRecipientUser(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API Operation within an API Management Service. */
  def ApiOperation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiOperationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.ApiOperationArgs.builder
    com.pulumi.azure.apimanagement.ApiOperation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API Management AAD Identity Provider. */
  def IdentityProviderAad(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.IdentityProviderAadArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.IdentityProviderAadArgs.builder
    com.pulumi.azure.apimanagement.IdentityProviderAad(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.apimanagement.CustomDomainArgs.Builder)
    /**
     * @param developerPortals One or more `developerPortal` blocks as defined below.
     * @return builder
     */
    def developerPortals(args: Endofunction[com.pulumi.azure.apimanagement.inputs.CustomDomainDeveloperPortalArgs.Builder]*):
        com.pulumi.azure.apimanagement.CustomDomainArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.CustomDomainDeveloperPortalArgs.builder
      builder.developerPortals(args.map(_(argsBuilder).build)*)

    /**
     * @param gateways One or more `gateway` blocks as defined below.
     * @return builder
     */
    def gateways(args: Endofunction[com.pulumi.azure.apimanagement.inputs.CustomDomainGatewayArgs.Builder]*):
        com.pulumi.azure.apimanagement.CustomDomainArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.CustomDomainGatewayArgs.builder
      builder.gateways(args.map(_(argsBuilder).build)*)

    /**
     * @param managements One or more `management` blocks as defined below.
     * @return builder
     */
    def managements(args: Endofunction[com.pulumi.azure.apimanagement.inputs.CustomDomainManagementArgs.Builder]*):
        com.pulumi.azure.apimanagement.CustomDomainArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.CustomDomainManagementArgs.builder
      builder.managements(args.map(_(argsBuilder).build)*)

    /**
     * @param portals One or more `portal` blocks as defined below.
     * @return builder
     */
    def portals(args: Endofunction[com.pulumi.azure.apimanagement.inputs.CustomDomainPortalArgs.Builder]*):
        com.pulumi.azure.apimanagement.CustomDomainArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.CustomDomainPortalArgs.builder
      builder.portals(args.map(_(argsBuilder).build)*)

    /**
     * @param scms One or more `scm` blocks as defined below.
     * @return builder
     */
    def scms(args: Endofunction[com.pulumi.azure.apimanagement.inputs.CustomDomainScmArgs.Builder]*):
        com.pulumi.azure.apimanagement.CustomDomainArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.CustomDomainScmArgs.builder
      builder.scms(args.map(_(argsBuilder).build)*)

  /** Manages an API Version Set within an API Management Service. */
  def ApiVersionSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiVersionSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.ApiVersionSetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.ApiVersionSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a API Management API Operation Tag. */
  def ApiOperationTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiOperationTagArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.ApiOperationTagArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.ApiOperationTag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API Management Gateway Host Name Configuration. */
  def GatewayHostNameConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.GatewayHostNameConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.GatewayHostNameConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.GatewayHostNameConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.apimanagement.WorkspaceNamedValueArgs.Builder)
    /**
     * @param valueFromKeyVault A `valueFromKeyVault` block as defined below.
     * 
     *  &gt; **Note:** Exactly one of `value` or `valueFromKeyVault` must be specified. If `valueFromKeyVault` is specified, `secret` must also be set to `true`.
     * @return builder
     */
    def valueFromKeyVault(args: Endofunction[com.pulumi.azure.apimanagement.inputs.WorkspaceNamedValueValueFromKeyVaultArgs.Builder]):
        com.pulumi.azure.apimanagement.WorkspaceNamedValueArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.WorkspaceNamedValueValueFromKeyVaultArgs.builder
      builder.valueFromKeyVault(args(argsBuilder).build)

  /** Manages an API Management Gateway Certificate Authority. */
  def GatewayCertificateAuthority(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.GatewayCertificateAuthorityArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.GatewayCertificateAuthorityArgs.builder
    com.pulumi.azure.apimanagement.GatewayCertificateAuthority(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API Management User Assignment to a Group. */
  def GroupUser(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.GroupUserArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.GroupUserArgs.builder
    com.pulumi.azure.apimanagement.GroupUser(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.apimanagement.NamedValueArgs.Builder)
    /**
     * @param valueFromKeyVault A `valueFromKeyVault` block as defined below. If specified, `secret` must also be set to `true`.
     * @return builder
     */
    def valueFromKeyVault(args: Endofunction[com.pulumi.azure.apimanagement.inputs.NamedValueValueFromKeyVaultArgs.Builder]):
        com.pulumi.azure.apimanagement.NamedValueArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.NamedValueValueFromKeyVaultArgs.builder
      builder.valueFromKeyVault(args(argsBuilder).build)

  /** Manages an API Management API Assignment to a Product. */
  def ProductApi(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ProductApiArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.ProductApiArgs.builder
    com.pulumi.azure.apimanagement.ProductApi(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API Management API Operation Policy */
  def ApiOperationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiOperationPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.ApiOperationPolicyArgs.builder
    com.pulumi.azure.apimanagement.ApiOperationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API Management Facebook Identity Provider. */
  def IdentityProviderFacebook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.IdentityProviderFacebookArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.IdentityProviderFacebookArgs.builder
    com.pulumi.azure.apimanagement.IdentityProviderFacebook(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an API Management Service.
   * 
   *  ## Disclaimers
   * 
   *  &gt; **Note:** When creating a new API Management resource in version 3.0 of the AzureRM Provider and later, please be aware that the AzureRM Provider will now clean up any sample APIs and Products created by the Azure API during the creation of the API Management resource.
   * 
   *  &gt; **Note:** Version 2.77 and later of the Azure Provider include a Feature Toggle which will purge an API Management resource on destroy, rather than the default soft-delete. See the Features block documentation for more information on Feature Toggles within Terraform.
   * 
   *  &gt; **Note:** It&#39;s possible to define Custom Domains both within the `azure.apimanagement.Service` resource via the `hostnameConfigurations` block and by using the `azure.apimanagement.CustomDomain` resource. However it&#39;s not possible to use both methods to manage Custom Domains within an API Management Service, since there&#39;ll be conflicts.
   */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.ServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.apimanagement.Service(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a API Management API Release. */
  def ApiRelease(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiReleaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.ApiReleaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.ApiRelease(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.apimanagement.LoggerArgs.Builder)
    /**
     * @param applicationInsights An `applicationInsights` block as documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    def applicationInsights(args: Endofunction[com.pulumi.azure.apimanagement.inputs.LoggerApplicationInsightsArgs.Builder]):
        com.pulumi.azure.apimanagement.LoggerArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.LoggerApplicationInsightsArgs.builder
      builder.applicationInsights(args(argsBuilder).build)

    /**
     * @param eventhub An `eventhub` block as documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    def eventhub(args: Endofunction[com.pulumi.azure.apimanagement.inputs.LoggerEventhubArgs.Builder]):
        com.pulumi.azure.apimanagement.LoggerArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.LoggerEventhubArgs.builder
      builder.eventhub(args(argsBuilder).build)

  /** Manages an API Management Google Identity Provider. */
  def IdentityProviderGoogle(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.IdentityProviderGoogleArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.IdentityProviderGoogleArgs.builder
    com.pulumi.azure.apimanagement.IdentityProviderGoogle(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a API Management Notification Recipient Email. */
  def NotificationRecipientEmail(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.NotificationRecipientEmailArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.NotificationRecipientEmailArgs.builder
    com.pulumi.azure.apimanagement.NotificationRecipientEmail(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Api Management Policy Fragment. */
  def PolicyFragment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.PolicyFragmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.PolicyFragmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.PolicyFragment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.apimanagement.DiagnosticArgs.Builder)
    /**
     * @param backendRequest A `backendRequest` block as defined below.
     * @return builder
     */
    def backendRequest(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestArgs.Builder]):
        com.pulumi.azure.apimanagement.DiagnosticArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestArgs.builder
      builder.backendRequest(args(argsBuilder).build)

    /**
     * @param backendResponse A `backendResponse` block as defined below.
     * @return builder
     */
    def backendResponse(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseArgs.Builder]):
        com.pulumi.azure.apimanagement.DiagnosticArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseArgs.builder
      builder.backendResponse(args(argsBuilder).build)

    /**
     * @param frontendRequest A `frontendRequest` block as defined below.
     * @return builder
     */
    def frontendRequest(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestArgs.Builder]):
        com.pulumi.azure.apimanagement.DiagnosticArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestArgs.builder
      builder.frontendRequest(args(argsBuilder).build)

    /**
     * @param frontendResponse A `frontendResponse` block as defined below.
     * @return builder
     */
    def frontendResponse(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseArgs.Builder]):
        com.pulumi.azure.apimanagement.DiagnosticArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseArgs.builder
      builder.frontendResponse(args(argsBuilder).build)

  /** Manages a API Management Gateway API. */
  def GatewayApi(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.GatewayApiArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.GatewayApiArgs.builder
    com.pulumi.azure.apimanagement.GatewayApi(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an OpenID Connect Provider within a API Management Service. */
  def OpenIdConnectProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.OpenIdConnectProviderArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.OpenIdConnectProviderArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.OpenIdConnectProvider(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a API Management Email Template. */
  def EmailTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.EmailTemplateArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.EmailTemplateArgs.builder
    com.pulumi.azure.apimanagement.EmailTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API Management Workspace Policy Fragment. */
  def WorkspacePolicyFragment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.WorkspacePolicyFragmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.WorkspacePolicyFragmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.WorkspacePolicyFragment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API Management Workspace Policy. */
  def WorkspacePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.WorkspacePolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.WorkspacePolicyArgs.builder
    com.pulumi.azure.apimanagement.WorkspacePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API within an API Management Service. */
  def Api(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.ApiArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.Api(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API Management Microsoft Identity Provider. */
  def IdentityProviderMicrosoft(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.IdentityProviderMicrosoftArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.IdentityProviderMicrosoftArgs.builder
    com.pulumi.azure.apimanagement.IdentityProviderMicrosoft(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API Management Azure AD B2C Identity Provider. */
  def IdentityProviderAadb2c(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.IdentityProviderAadb2cArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.IdentityProviderAadb2cArgs.builder
    com.pulumi.azure.apimanagement.IdentityProviderAadb2c(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API Management Workspace Named Value. */
  def WorkspaceNamedValue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.WorkspaceNamedValueArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.WorkspaceNamedValueArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.WorkspaceNamedValue(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an API Management Workspace.
   * 
   *  &gt; **Note:** This resource is currently available only when using the Classic Premium SKU of `azure.apimanagement.Service`. For more details, refer to [Federated API Management with Workspaces](https://learn.microsoft.com/en-us/azure/api-management/workspaces-overview).
   */
  def Workspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.WorkspaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.WorkspaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.Workspace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Subscription within a API Management Service. */
  def Subscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.SubscriptionArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.SubscriptionArgs.builder
    com.pulumi.azure.apimanagement.Subscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an API Management API Policy */
  def ApiPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.ApiPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.ApiPolicyArgs.builder
    com.pulumi.azure.apimanagement.ApiPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.apimanagement.StandaloneGatewayArgs.Builder)
    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.apimanagement.inputs.StandaloneGatewaySkuArgs.Builder]):
        com.pulumi.azure.apimanagement.StandaloneGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.StandaloneGatewaySkuArgs.builder
      builder.sku(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.apimanagement.StandaloneGatewayArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages a API Management service Policy.
   * 
   *  &gt; **Note:** This resource will, upon creation, **overwrite any existing policy in the API Management service**, as there is no feasible way to test whether the policy has been modified from the default. Similarly, when this resource is destroyed, the API Management service will revert to its default policy.
   */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.PolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.apimanagement.PolicyArgs.builder
    com.pulumi.azure.apimanagement.Policy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.apimanagement.GatewayArgs.Builder)
    /**
     * @param locationData A `locationData` block as documented below.
     * @return builder
     */
    def locationData(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GatewayLocationDataArgs.Builder]):
        com.pulumi.azure.apimanagement.GatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GatewayLocationDataArgs.builder
      builder.locationData(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationRequestArgs.Builder)
    /**
     * @param headers One or more `header` blocks as defined above.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationRequestHeaderArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationRequestArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationRequestHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParameters One or more `queryParameter` blocks as defined above.
     * @return builder
     */
    def queryParameters(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationRequestQueryParameterArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationRequestArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationRequestQueryParameterArgs.builder
      builder.queryParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param representations One or more `representation` blocks as defined below.
     * @return builder
     */
    def representations(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationRequestArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationArgs.builder
      builder.representations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestArgs.Builder)
    /**
     * @param dataMasking A `dataMasking` block as defined below.
     * @return builder
     */
    def dataMasking(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestDataMaskingArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestDataMaskingArgs.builder
      builder.dataMasking(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationArgs.Builder)
    /**
     * @param examples One or more `example` blocks as defined above.
     * @return builder
     */
    def examples(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationExampleArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationExampleArgs.builder
      builder.examples(args.map(_(argsBuilder).build)*)

    /**
     * @param formParameters One or more `formParameter` block as defined above.
     * 
     *  &gt; **Note:** This is Required when `contentType` is set to `application/x-www-form-urlencoded` or `multipart/form-data`.
     * @return builder
     */
    def formParameters(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationFormParameterArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationFormParameterArgs.builder
      builder.formParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseArgs.Builder)
    /**
     * @param dataMasking A `dataMasking` block as defined below.
     * @return builder
     */
    def dataMasking(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseDataMaskingArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseDataMaskingArgs.builder
      builder.dataMasking(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestDataMaskingArgs.Builder)
    /**
     * @param headers A `headers` block as defined below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestDataMaskingHeaderArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestDataMaskingHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParams A `queryParams` block as defined below.
     * @return builder
     */
    def queryParams(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestDataMaskingQueryParamArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestDataMaskingQueryParamArgs.builder
      builder.queryParams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestDataMaskingArgs.Builder)
    /**
     * @param headers A `headers` block as defined below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestDataMaskingHeaderArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestDataMaskingHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParams A `queryParams` block as defined below.
     * @return builder
     */
    def queryParams(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestDataMaskingQueryParamArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestDataMaskingQueryParamArgs.builder
      builder.queryParams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.LoggerState.Builder)
    /**
     * @param applicationInsights An `applicationInsights` block as documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    def applicationInsights(args: Endofunction[com.pulumi.azure.apimanagement.inputs.LoggerApplicationInsightsArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.LoggerState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.LoggerApplicationInsightsArgs.builder
      builder.applicationInsights(args(argsBuilder).build)

    /**
     * @param eventhub An `eventhub` block as documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    def eventhub(args: Endofunction[com.pulumi.azure.apimanagement.inputs.LoggerEventhubArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.LoggerState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.LoggerEventhubArgs.builder
      builder.eventhub(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleArgs.Builder)
    /**
     * @param failureCondition A `failureCondition` block as defined below.
     * @return builder
     */
    def failureCondition(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleFailureConditionArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleFailureConditionArgs.builder
      builder.failureCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseArgs.Builder)
    /**
     * @param dataMasking A `dataMasking` block as defined below.
     * @return builder
     */
    def dataMasking(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseDataMaskingArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseDataMaskingArgs.builder
      builder.dataMasking(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ServiceSignUpArgs.Builder)
    /**
     * @param termsOfService A `termsOfService` block as defined below.
     * @return builder
     */
    def termsOfService(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceSignUpTermsOfServiceArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceSignUpArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceSignUpTermsOfServiceArgs.builder
      builder.termsOfService(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.CustomDomainState.Builder)
    /**
     * @param developerPortals One or more `developerPortal` blocks as defined below.
     * @return builder
     */
    def developerPortals(args: Endofunction[com.pulumi.azure.apimanagement.inputs.CustomDomainDeveloperPortalArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.CustomDomainState.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.CustomDomainDeveloperPortalArgs.builder
      builder.developerPortals(args.map(_(argsBuilder).build)*)

    /**
     * @param gateways One or more `gateway` blocks as defined below.
     * @return builder
     */
    def gateways(args: Endofunction[com.pulumi.azure.apimanagement.inputs.CustomDomainGatewayArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.CustomDomainState.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.CustomDomainGatewayArgs.builder
      builder.gateways(args.map(_(argsBuilder).build)*)

    /**
     * @param managements One or more `management` blocks as defined below.
     * @return builder
     */
    def managements(args: Endofunction[com.pulumi.azure.apimanagement.inputs.CustomDomainManagementArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.CustomDomainState.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.CustomDomainManagementArgs.builder
      builder.managements(args.map(_(argsBuilder).build)*)

    /**
     * @param portals One or more `portal` blocks as defined below.
     * @return builder
     */
    def portals(args: Endofunction[com.pulumi.azure.apimanagement.inputs.CustomDomainPortalArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.CustomDomainState.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.CustomDomainPortalArgs.builder
      builder.portals(args.map(_(argsBuilder).build)*)

    /**
     * @param scms One or more `scm` blocks as defined below.
     * @return builder
     */
    def scms(args: Endofunction[com.pulumi.azure.apimanagement.inputs.CustomDomainScmArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.CustomDomainState.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.CustomDomainScmArgs.builder
      builder.scms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.AuthorizationServerState.Builder)
    /**
     * @param tokenBodyParameters A `tokenBodyParameter` block as defined below.
     * @return builder
     */
    def tokenBodyParameters(args: Endofunction[com.pulumi.azure.apimanagement.inputs.AuthorizationServerTokenBodyParameterArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.AuthorizationServerState.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.AuthorizationServerTokenBodyParameterArgs.builder
      builder.tokenBodyParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationFormParameterArgs.Builder)
    /**
     * @param examples One or more `example` blocks as defined above.
     * @return builder
     */
    def examples(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationFormParameterExampleArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationFormParameterArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationFormParameterExampleArgs.builder
      builder.examples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationState.Builder)
    /**
     * @param request A `request` block as defined below.
     * @return builder
     */
    def request(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationRequestArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiOperationState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationRequestArgs.builder
      builder.request(args(argsBuilder).build)

    /**
     * @param responses One or more `response` blocks as defined below.
     * @return builder
     */
    def responses(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationResponseArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationState.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationResponseArgs.builder
      builder.responses(args.map(_(argsBuilder).build)*)

    /**
     * @param templateParameters One or more `templateParameter` blocks as defined below. Required if `urlTemplate` contains one or more parameters.
     * @return builder
     */
    def templateParameters(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationTemplateParameterArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationState.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationTemplateParameterArgs.builder
      builder.templateParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationTemplateParameterArgs.Builder)
    /**
     * @param examples One or more `example` blocks as defined above.
     * @return builder
     */
    def examples(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationTemplateParameterExampleArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationTemplateParameterArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationTemplateParameterExampleArgs.builder
      builder.examples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestArgs.Builder)
    /**
     * @param dataMasking A `dataMasking` block as defined below.
     * @return builder
     */
    def dataMasking(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestDataMaskingArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestDataMaskingArgs.builder
      builder.dataMasking(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseDataMaskingArgs.Builder)
    /**
     * @param headers A `headers` block as defined below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseDataMaskingHeaderArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseDataMaskingHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParams A `queryParams` block as defined below.
     * @return builder
     */
    def queryParams(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseDataMaskingQueryParamArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseDataMaskingQueryParamArgs.builder
      builder.queryParams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationResponseHeaderArgs.Builder)
    /**
     * @param examples One or more `example` blocks as defined above.
     * @return builder
     */
    def examples(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationResponseHeaderExampleArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationResponseHeaderArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationResponseHeaderExampleArgs.builder
      builder.examples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.GatewayState.Builder)
    /**
     * @param locationData A `locationData` block as documented below.
     * @return builder
     */
    def locationData(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GatewayLocationDataArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.GatewayState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GatewayLocationDataArgs.builder
      builder.locationData(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationRequestHeaderArgs.Builder)
    /**
     * @param examples One or more `example` blocks as defined above.
     * @return builder
     */
    def examples(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationRequestHeaderExampleArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationRequestHeaderArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationRequestHeaderExampleArgs.builder
      builder.examples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.WorkspaceNamedValueState.Builder)
    /**
     * @param valueFromKeyVault A `valueFromKeyVault` block as defined below.
     * 
     *  &gt; **Note:** Exactly one of `value` or `valueFromKeyVault` must be specified. If `valueFromKeyVault` is specified, `secret` must also be set to `true`.
     * @return builder
     */
    def valueFromKeyVault(args: Endofunction[com.pulumi.azure.apimanagement.inputs.WorkspaceNamedValueValueFromKeyVaultArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.WorkspaceNamedValueState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.WorkspaceNamedValueValueFromKeyVaultArgs.builder
      builder.valueFromKeyVault(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.NamedValueState.Builder)
    /**
     * @param valueFromKeyVault A `valueFromKeyVault` block as defined below. If specified, `secret` must also be set to `true`.
     * @return builder
     */
    def valueFromKeyVault(args: Endofunction[com.pulumi.azure.apimanagement.inputs.NamedValueValueFromKeyVaultArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.NamedValueState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.NamedValueValueFromKeyVaultArgs.builder
      builder.valueFromKeyVault(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiImportArgs.Builder)
    /**
     * @param wsdlSelector A `wsdlSelector` block as defined below, which allows you to limit the import of a WSDL to only a subset of the document. This can only be specified when `contentFormat` is `wsdl` or `wsdl-link`.
     * @return builder
     */
    def wsdlSelector(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiImportWsdlSelectorArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiImportArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiImportWsdlSelectorArgs.builder
      builder.wsdlSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestArgs.Builder)
    /**
     * @param dataMasking A `dataMasking` block as defined below.
     * @return builder
     */
    def dataMasking(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestDataMaskingArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestDataMaskingArgs.builder
      builder.dataMasking(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseDataMaskingArgs.Builder)
    /**
     * @param headers A `headers` block as defined below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseDataMaskingHeaderArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseDataMaskingHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParams A `queryParams` block as defined below.
     * @return builder
     */
    def queryParams(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseDataMaskingQueryParamArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseDataMaskingQueryParamArgs.builder
      builder.queryParams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationFormParameterArgs.Builder)
    /**
     * @param examples One or more `example` blocks as defined above.
     * @return builder
     */
    def examples(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationFormParameterExampleArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationFormParameterArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationFormParameterExampleArgs.builder
      builder.examples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ServiceState.Builder)
    /**
     * @param additionalLocations One or more `additionalLocation` blocks as defined below.
     * @return builder
     */
    def additionalLocations(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceAdditionalLocationArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceAdditionalLocationArgs.builder
      builder.additionalLocations(args.map(_(argsBuilder).build)*)

    /**
     * @param certificates One or more `certificate` blocks (up to 10) as defined below.
     * @return builder
     */
    def certificates(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceCertificateArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

    /**
     * @param delegation A `delegation` block as defined below.
     * @return builder
     */
    def delegation(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceDelegationArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceDelegationArgs.builder
      builder.delegation(args(argsBuilder).build)

    /**
     * @param hostnameConfiguration A `hostnameConfiguration` block as defined below.
     * @return builder
     */
    def hostnameConfiguration(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationArgs.builder
      builder.hostnameConfiguration(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceIdentityArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param protocols A `protocols` block as defined below.
     * @return builder
     */
    def protocols(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceProtocolsArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceProtocolsArgs.builder
      builder.protocols(args(argsBuilder).build)

    /**
     * @param security A `security` block as defined below.
     * @return builder
     */
    def security(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceSecurityArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceSecurityArgs.builder
      builder.security(args(argsBuilder).build)

    /**
     * @param signIn A `signIn` block as defined below.
     * @return builder
     */
    def signIn(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceSignInArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceSignInArgs.builder
      builder.signIn(args(argsBuilder).build)

    /**
     * @param signUp A `signUp` block as defined below.
     * @return builder
     */
    def signUp(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceSignUpArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceSignUpArgs.builder
      builder.signUp(args(argsBuilder).build)

    /**
     * @param tenantAccess A `tenantAccess` block as defined below.
     * @return builder
     */
    def tenantAccess(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceTenantAccessArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceTenantAccessArgs.builder
      builder.tenantAccess(args(argsBuilder).build)

    /**
     * @param virtualNetworkConfiguration A `virtualNetworkConfiguration` block as defined below. Required when `virtualNetworkType` is `External` or `Internal`.
     * @return builder
     */
    def virtualNetworkConfiguration(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceVirtualNetworkConfigurationArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceVirtualNetworkConfigurationArgs.builder
      builder.virtualNetworkConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseDataMaskingArgs.Builder)
    /**
     * @param headers A `headers` block as defined below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseDataMaskingHeaderArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseDataMaskingHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParams A `queryParams` block as defined below.
     * @return builder
     */
    def queryParams(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseDataMaskingQueryParamArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseDataMaskingQueryParamArgs.builder
      builder.queryParams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.BackendServiceFabricClusterArgs.Builder)
    /**
     * @param serverX509Names One or more `serverX509Name` blocks as documented below.
     * @return builder
     */
    def serverX509Names(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendServiceFabricClusterServerX509NameArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.BackendServiceFabricClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendServiceFabricClusterServerX509NameArgs.builder
      builder.serverX509Names(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestDataMaskingArgs.Builder)
    /**
     * @param headers A `headers` block as defined below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestDataMaskingHeaderArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestDataMaskingHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParams A `queryParams` block as defined below.
     * @return builder
     */
    def queryParams(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestDataMaskingQueryParamArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestDataMaskingQueryParamArgs.builder
      builder.queryParams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiState.Builder)
    /**
     * @param contact A `contact` block as documented below.
     * @return builder
     */
    def contact(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiContactArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiContactArgs.builder
      builder.contact(args(argsBuilder).build)

    /**
     * @param import_ A `import` block as documented below.
     * 
     *  &gt; **Note:** The `displayName`, `description`, `contact`, and `license` fields can be imported by the `import` block, which might cause a drift if these fields are set along with the `import` block.
     * @return builder
     */
    def import_(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiImportArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiImportArgs.builder
      builder.import_(args(argsBuilder).build)

    /**
     * @param license A `license` block as documented below.
     * @return builder
     */
    def license(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiLicenseArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiLicenseArgs.builder
      builder.license(args(argsBuilder).build)

    /**
     * @param oauth2Authorization An `oauth2Authorization` block as documented below.
     * @return builder
     */
    def oauth2Authorization(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOauth2AuthorizationArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOauth2AuthorizationArgs.builder
      builder.oauth2Authorization(args(argsBuilder).build)

    /**
     * @param openidAuthentication An `openidAuthentication` block as documented below.
     * @return builder
     */
    def openidAuthentication(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOpenidAuthenticationArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOpenidAuthenticationArgs.builder
      builder.openidAuthentication(args(argsBuilder).build)

    /**
     * @param subscriptionKeyParameterNames A `subscriptionKeyParameterNames` block as documented below.
     * @return builder
     */
    def subscriptionKeyParameterNames(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiSubscriptionKeyParameterNamesArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiSubscriptionKeyParameterNamesArgs.builder
      builder.subscriptionKeyParameterNames(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiDiagnosticState.Builder)
    /**
     * @param backendRequest A `backendRequest` block as defined below.
     * @return builder
     */
    def backendRequest(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestArgs.builder
      builder.backendRequest(args(argsBuilder).build)

    /**
     * @param backendResponse A `backendResponse` block as defined below.
     * @return builder
     */
    def backendResponse(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseArgs.builder
      builder.backendResponse(args(argsBuilder).build)

    /**
     * @param frontendRequest A `frontendRequest` block as defined below.
     * @return builder
     */
    def frontendRequest(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestArgs.builder
      builder.frontendRequest(args(argsBuilder).build)

    /**
     * @param frontendResponse A `frontendResponse` block as defined below.
     * @return builder
     */
    def frontendResponse(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseArgs.builder
      builder.frontendResponse(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationRequestQueryParameterArgs.Builder)
    /**
     * @param examples One or more `example` blocks as defined above.
     * @return builder
     */
    def examples(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationRequestQueryParameterExampleArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationRequestQueryParameterArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationRequestQueryParameterExampleArgs.builder
      builder.examples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.StandaloneGatewayState.Builder)
    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.apimanagement.inputs.StandaloneGatewaySkuArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.StandaloneGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.StandaloneGatewaySkuArgs.builder
      builder.sku(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.apimanagement.inputs.StandaloneGatewayState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationArgs.Builder)
    /**
     * @param developerPortals One or more `developerPortal` blocks as documented below.
     * @return builder
     */
    def developerPortals(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationDeveloperPortalArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationDeveloperPortalArgs.builder
      builder.developerPortals(args.map(_(argsBuilder).build)*)

    /**
     * @param managements One or more `management` blocks as documented below.
     * @return builder
     */
    def managements(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationManagementArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationManagementArgs.builder
      builder.managements(args.map(_(argsBuilder).build)*)

    /**
     * @param portals One or more `portal` blocks as documented below.
     * @return builder
     */
    def portals(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationPortalArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationPortalArgs.builder
      builder.portals(args.map(_(argsBuilder).build)*)

    /**
     * @param proxies One or more `proxy` blocks as documented below.
     * @return builder
     */
    def proxies(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationProxyArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationProxyArgs.builder
      builder.proxies(args.map(_(argsBuilder).build)*)

    /**
     * @param scms One or more `scm` blocks as documented below.
     * @return builder
     */
    def scms(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationScmArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationScmArgs.builder
      builder.scms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.BackendState.Builder)
    /**
     * @param circuitBreakerRule A `circuitBreakerRule` block as documented below.
     * @return builder
     */
    def circuitBreakerRule(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.BackendState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleArgs.builder
      builder.circuitBreakerRule(args(argsBuilder).build)

    /**
     * @param credentials A `credentials` block as documented below.
     * @return builder
     */
    def credentials(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendCredentialsArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.BackendState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendCredentialsArgs.builder
      builder.credentials(args(argsBuilder).build)

    /**
     * @param proxy A `proxy` block as documented below.
     * @return builder
     */
    def proxy(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendProxyArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.BackendState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendProxyArgs.builder
      builder.proxy(args(argsBuilder).build)

    /**
     * @param serviceFabricCluster A `serviceFabricCluster` block as documented below.
     * @return builder
     */
    def serviceFabricCluster(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendServiceFabricClusterArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.BackendState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendServiceFabricClusterArgs.builder
      builder.serviceFabricCluster(args(argsBuilder).build)

    /**
     * @param tls A `tls` block as documented below.
     * @return builder
     */
    def tls(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendTlsArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.BackendState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendTlsArgs.builder
      builder.tls(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleFailureConditionArgs.Builder)
    /**
     * @param statusCodeRanges One or more `statusCodeRange` blocks as defined below.
     * 
     *  &gt; **Note:** At least one of `statusCodeRange`, and `errorReasons` must be set.
     * @return builder
     */
    def statusCodeRanges(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleFailureConditionStatusCodeRangeArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleFailureConditionArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleFailureConditionStatusCodeRangeArgs.builder
      builder.statusCodeRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestArgs.Builder)
    /**
     * @param dataMasking A `dataMasking` block as defined below.
     * @return builder
     */
    def dataMasking(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestDataMaskingArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestDataMaskingArgs.builder
      builder.dataMasking(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.DiagnosticState.Builder)
    /**
     * @param backendRequest A `backendRequest` block as defined below.
     * @return builder
     */
    def backendRequest(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.DiagnosticState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestArgs.builder
      builder.backendRequest(args(argsBuilder).build)

    /**
     * @param backendResponse A `backendResponse` block as defined below.
     * @return builder
     */
    def backendResponse(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.DiagnosticState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseArgs.builder
      builder.backendResponse(args(argsBuilder).build)

    /**
     * @param frontendRequest A `frontendRequest` block as defined below.
     * @return builder
     */
    def frontendRequest(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.DiagnosticState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestArgs.builder
      builder.frontendRequest(args(argsBuilder).build)

    /**
     * @param frontendResponse A `frontendResponse` block as defined below.
     * @return builder
     */
    def frontendResponse(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.DiagnosticState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseArgs.builder
      builder.frontendResponse(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.BackendCredentialsArgs.Builder)
    /**
     * @param authorization An `authorization` block as defined below.
     * @return builder
     */
    def authorization(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendCredentialsAuthorizationArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.BackendCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendCredentialsAuthorizationArgs.builder
      builder.authorization(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationResponseArgs.Builder)
    /**
     * @param headers One or more `header` blocks as defined above.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationResponseHeaderArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationResponseArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationResponseHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param representations One or more `representation` blocks as defined above.
     * @return builder
     */
    def representations(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationResponseArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationArgs.builder
      builder.representations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseArgs.Builder)
    /**
     * @param dataMasking A `dataMasking` block as defined below.
     * @return builder
     */
    def dataMasking(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseDataMaskingArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseDataMaskingArgs.builder
      builder.dataMasking(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseArgs.Builder)
    /**
     * @param dataMasking A `dataMasking` block as defined below.
     * @return builder
     */
    def dataMasking(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseDataMaskingArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseDataMaskingArgs.builder
      builder.dataMasking(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseDataMaskingArgs.Builder)
    /**
     * @param headers A `headers` block as defined below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseDataMaskingHeaderArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseDataMaskingHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParams A `queryParams` block as defined below.
     * @return builder
     */
    def queryParams(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseDataMaskingQueryParamArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseDataMaskingQueryParamArgs.builder
      builder.queryParams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestDataMaskingArgs.Builder)
    /**
     * @param headers A `headers` block as defined below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestDataMaskingHeaderArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestDataMaskingHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParams A `queryParams` block as defined below.
     * @return builder
     */
    def queryParams(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestDataMaskingQueryParamArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestDataMaskingQueryParamArgs.builder
      builder.queryParams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ServiceAdditionalLocationArgs.Builder)
    /**
     * @param virtualNetworkConfiguration A `virtualNetworkConfiguration` block as defined below. Required when `virtualNetworkType` is `External` or `Internal`.
     * @return builder
     */
    def virtualNetworkConfiguration(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceAdditionalLocationVirtualNetworkConfigurationArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceAdditionalLocationArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceAdditionalLocationVirtualNetworkConfigurationArgs.builder
      builder.virtualNetworkConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationArgs.Builder)
    /**
     * @param examples One or more `example` blocks as defined above.
     * @return builder
     */
    def examples(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationExampleArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationExampleArgs.builder
      builder.examples(args.map(_(argsBuilder).build)*)

    /**
     * @param formParameters One or more `formParameter` block as defined above.
     * 
     *  &gt; **Note:** This is Required when `contentType` is set to `application/x-www-form-urlencoded` or `multipart/form-data`.
     * @return builder
     */
    def formParameters(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationFormParameterArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationFormParameterArgs.builder
      builder.formParameters(args.map(_(argsBuilder).build)*)

  /** Manages a Certificate within an API Management Workspace. */
  def WorkspaceCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.apimanagement.WorkspaceCertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.apimanagement.WorkspaceCertificateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.apimanagement.WorkspaceCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.apimanagement.ApiArgs.Builder)
    /**
     * @param contact A `contact` block as documented below.
     * @return builder
     */
    def contact(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiContactArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiContactArgs.builder
      builder.contact(args(argsBuilder).build)

    /**
     * @param import_ A `import` block as documented below.
     * 
     *  &gt; **Note:** The `displayName`, `description`, `contact`, and `license` fields can be imported by the `import` block, which might cause a drift if these fields are set along with the `import` block.
     * @return builder
     */
    def import_(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiImportArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiImportArgs.builder
      builder.import_(args(argsBuilder).build)

    /**
     * @param license A `license` block as documented below.
     * @return builder
     */
    def license(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiLicenseArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiLicenseArgs.builder
      builder.license(args(argsBuilder).build)

    /**
     * @param oauth2Authorization An `oauth2Authorization` block as documented below.
     * @return builder
     */
    def oauth2Authorization(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOauth2AuthorizationArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOauth2AuthorizationArgs.builder
      builder.oauth2Authorization(args(argsBuilder).build)

    /**
     * @param openidAuthentication An `openidAuthentication` block as documented below.
     * @return builder
     */
    def openidAuthentication(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOpenidAuthenticationArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOpenidAuthenticationArgs.builder
      builder.openidAuthentication(args(argsBuilder).build)

    /**
     * @param subscriptionKeyParameterNames A `subscriptionKeyParameterNames` block as documented below.
     * @return builder
     */
    def subscriptionKeyParameterNames(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiSubscriptionKeyParameterNamesArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiSubscriptionKeyParameterNamesArgs.builder
      builder.subscriptionKeyParameterNames(args(argsBuilder).build)
