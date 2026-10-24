package jp.ukiba.ko_pulumi
package azure

object apimanagement_ext:
  extension (builder: com.pulumi.azure.apimanagement.ApiArgs.Builder)
    /**
     * @param contact A `contact` block as documented below.
     * @return builder
     */
    inline def contact(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiContactArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiContactArgs.builder
      builder.contact(args(argsBuilder).build)

    /**
     * @param import_ A `import` block as documented below.
     * 
     * &gt; **Note:** The `displayName`, `description`, `contact`, and `license` fields can be imported by the `import` block, which might cause a drift if these fields are set along with the `import` block.
     * @return builder
     */
    inline def import_(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiImportArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiImportArgs.builder
      builder.import_(args(argsBuilder).build)

    /**
     * @param license A `license` block as documented below.
     * @return builder
     */
    inline def license(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiLicenseArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiLicenseArgs.builder
      builder.license(args(argsBuilder).build)

    /**
     * @param oauth2Authorization An `oauth2Authorization` block as documented below.
     * @return builder
     */
    inline def oauth2Authorization(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOauth2AuthorizationArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOauth2AuthorizationArgs.builder
      builder.oauth2Authorization(args(argsBuilder).build)

    /**
     * @param openidAuthentication An `openidAuthentication` block as documented below.
     * @return builder
     */
    inline def openidAuthentication(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOpenidAuthenticationArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOpenidAuthenticationArgs.builder
      builder.openidAuthentication(args(argsBuilder).build)

    /**
     * @param subscriptionKeyParameterNames A `subscriptionKeyParameterNames` block as documented below.
     * @return builder
     */
    inline def subscriptionKeyParameterNames(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiSubscriptionKeyParameterNamesArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiSubscriptionKeyParameterNamesArgs.builder
      builder.subscriptionKeyParameterNames(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.ApiDiagnosticArgs.Builder)
    /**
     * @param backendRequest A `backendRequest` block as defined below.
     * @return builder
     */
    inline def backendRequest(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiDiagnosticArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestArgs.builder
      builder.backendRequest(args(argsBuilder).build)

    /**
     * @param backendResponse A `backendResponse` block as defined below.
     * @return builder
     */
    inline def backendResponse(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiDiagnosticArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseArgs.builder
      builder.backendResponse(args(argsBuilder).build)

    /**
     * @param frontendRequest A `frontendRequest` block as defined below.
     * @return builder
     */
    inline def frontendRequest(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiDiagnosticArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestArgs.builder
      builder.frontendRequest(args(argsBuilder).build)

    /**
     * @param frontendResponse A `frontendResponse` block as defined below.
     * @return builder
     */
    inline def frontendResponse(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiDiagnosticArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseArgs.builder
      builder.frontendResponse(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.ApiOperationArgs.Builder)
    /**
     * @param request A `request` block as defined below.
     * @return builder
     */
    inline def request(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationRequestArgs.Builder]):
        com.pulumi.azure.apimanagement.ApiOperationArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationRequestArgs.builder
      builder.request(args(argsBuilder).build)

    /**
     * @param responses One or more `response` blocks as defined below.
     * @return builder
     */
    inline def responses(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationResponseArgs.Builder]*):
        com.pulumi.azure.apimanagement.ApiOperationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationResponseArgs.builder
      builder.responses(args.map(_(argsBuilder).build)*)

    /**
     * @param templateParameters One or more `templateParameter` blocks as defined below. Required if `urlTemplate` contains one or more parameters.
     * @return builder
     */
    inline def templateParameters(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationTemplateParameterArgs.Builder]*):
        com.pulumi.azure.apimanagement.ApiOperationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationTemplateParameterArgs.builder
      builder.templateParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.AuthorizationServerArgs.Builder)
    /**
     * @param tokenBodyParameters A `tokenBodyParameter` block as defined below.
     * @return builder
     */
    inline def tokenBodyParameters(args: Endofunction[com.pulumi.azure.apimanagement.inputs.AuthorizationServerTokenBodyParameterArgs.Builder]*):
        com.pulumi.azure.apimanagement.AuthorizationServerArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.AuthorizationServerTokenBodyParameterArgs.builder
      builder.tokenBodyParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.BackendArgs.Builder)
    /**
     * @param circuitBreakerRule A `circuitBreakerRule` block as documented below.
     * @return builder
     */
    inline def circuitBreakerRule(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleArgs.Builder]):
        com.pulumi.azure.apimanagement.BackendArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleArgs.builder
      builder.circuitBreakerRule(args(argsBuilder).build)

    /**
     * @param credentials A `credentials` block as documented below.
     * @return builder
     */
    inline def credentials(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendCredentialsArgs.Builder]):
        com.pulumi.azure.apimanagement.BackendArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendCredentialsArgs.builder
      builder.credentials(args(argsBuilder).build)

    /**
     * @param proxy A `proxy` block as documented below.
     * @return builder
     */
    inline def proxy(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendProxyArgs.Builder]):
        com.pulumi.azure.apimanagement.BackendArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendProxyArgs.builder
      builder.proxy(args(argsBuilder).build)

    /**
     * @param serviceFabricCluster A `serviceFabricCluster` block as documented below.
     * @return builder
     */
    inline def serviceFabricCluster(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendServiceFabricClusterArgs.Builder]):
        com.pulumi.azure.apimanagement.BackendArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendServiceFabricClusterArgs.builder
      builder.serviceFabricCluster(args(argsBuilder).build)

    /**
     * @param tls A `tls` block as documented below.
     * @return builder
     */
    inline def tls(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendTlsArgs.Builder]):
        com.pulumi.azure.apimanagement.BackendArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendTlsArgs.builder
      builder.tls(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.CustomDomainArgs.Builder)
    /**
     * @param developerPortals One or more `developerPortal` blocks as defined below.
     * @return builder
     */
    inline def developerPortals(args: Endofunction[com.pulumi.azure.apimanagement.inputs.CustomDomainDeveloperPortalArgs.Builder]*):
        com.pulumi.azure.apimanagement.CustomDomainArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.CustomDomainDeveloperPortalArgs.builder
      builder.developerPortals(args.map(_(argsBuilder).build)*)

    /**
     * @param gateways One or more `gateway` blocks as defined below.
     * @return builder
     */
    inline def gateways(args: Endofunction[com.pulumi.azure.apimanagement.inputs.CustomDomainGatewayArgs.Builder]*):
        com.pulumi.azure.apimanagement.CustomDomainArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.CustomDomainGatewayArgs.builder
      builder.gateways(args.map(_(argsBuilder).build)*)

    /**
     * @param managements One or more `management` blocks as defined below.
     * @return builder
     */
    inline def managements(args: Endofunction[com.pulumi.azure.apimanagement.inputs.CustomDomainManagementArgs.Builder]*):
        com.pulumi.azure.apimanagement.CustomDomainArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.CustomDomainManagementArgs.builder
      builder.managements(args.map(_(argsBuilder).build)*)

    /**
     * @param portals One or more `portal` blocks as defined below.
     * @return builder
     */
    inline def portals(args: Endofunction[com.pulumi.azure.apimanagement.inputs.CustomDomainPortalArgs.Builder]*):
        com.pulumi.azure.apimanagement.CustomDomainArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.CustomDomainPortalArgs.builder
      builder.portals(args.map(_(argsBuilder).build)*)

    /**
     * @param scms One or more `scm` blocks as defined below.
     * @return builder
     */
    inline def scms(args: Endofunction[com.pulumi.azure.apimanagement.inputs.CustomDomainScmArgs.Builder]*):
        com.pulumi.azure.apimanagement.CustomDomainArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.CustomDomainScmArgs.builder
      builder.scms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.DiagnosticArgs.Builder)
    /**
     * @param backendRequest A `backendRequest` block as defined below.
     * @return builder
     */
    inline def backendRequest(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestArgs.Builder]):
        com.pulumi.azure.apimanagement.DiagnosticArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestArgs.builder
      builder.backendRequest(args(argsBuilder).build)

    /**
     * @param backendResponse A `backendResponse` block as defined below.
     * @return builder
     */
    inline def backendResponse(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseArgs.Builder]):
        com.pulumi.azure.apimanagement.DiagnosticArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseArgs.builder
      builder.backendResponse(args(argsBuilder).build)

    /**
     * @param frontendRequest A `frontendRequest` block as defined below.
     * @return builder
     */
    inline def frontendRequest(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestArgs.Builder]):
        com.pulumi.azure.apimanagement.DiagnosticArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestArgs.builder
      builder.frontendRequest(args(argsBuilder).build)

    /**
     * @param frontendResponse A `frontendResponse` block as defined below.
     * @return builder
     */
    inline def frontendResponse(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseArgs.Builder]):
        com.pulumi.azure.apimanagement.DiagnosticArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseArgs.builder
      builder.frontendResponse(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.GatewayArgs.Builder)
    /**
     * @param locationData A `locationData` block as documented below.
     * @return builder
     */
    inline def locationData(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GatewayLocationDataArgs.Builder]):
        com.pulumi.azure.apimanagement.GatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GatewayLocationDataArgs.builder
      builder.locationData(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.LoggerArgs.Builder)
    /**
     * @param applicationInsights An `applicationInsights` block as documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def applicationInsights(args: Endofunction[com.pulumi.azure.apimanagement.inputs.LoggerApplicationInsightsArgs.Builder]):
        com.pulumi.azure.apimanagement.LoggerArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.LoggerApplicationInsightsArgs.builder
      builder.applicationInsights(args(argsBuilder).build)

    /**
     * @param eventhub An `eventhub` block as documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def eventhub(args: Endofunction[com.pulumi.azure.apimanagement.inputs.LoggerEventhubArgs.Builder]):
        com.pulumi.azure.apimanagement.LoggerArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.LoggerEventhubArgs.builder
      builder.eventhub(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.NamedValueArgs.Builder)
    /**
     * @param valueFromKeyVault A `valueFromKeyVault` block as defined below. If specified, `secret` must also be set to `true`.
     * @return builder
     */
    inline def valueFromKeyVault(args: Endofunction[com.pulumi.azure.apimanagement.inputs.NamedValueValueFromKeyVaultArgs.Builder]):
        com.pulumi.azure.apimanagement.NamedValueArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.NamedValueValueFromKeyVaultArgs.builder
      builder.valueFromKeyVault(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.ServiceArgs.Builder)
    /**
     * @param additionalLocations One or more `additionalLocation` blocks as defined below.
     * @return builder
     */
    inline def additionalLocations(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceAdditionalLocationArgs.Builder]*):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceAdditionalLocationArgs.builder
      builder.additionalLocations(args.map(_(argsBuilder).build)*)

    /**
     * @param certificates One or more `certificate` blocks (up to 10) as defined below.
     * @return builder
     */
    inline def certificates(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceCertificateArgs.Builder]*):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

    /**
     * @param delegation A `delegation` block as defined below.
     * @return builder
     */
    inline def delegation(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceDelegationArgs.Builder]):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceDelegationArgs.builder
      builder.delegation(args(argsBuilder).build)

    /**
     * @param hostnameConfiguration A `hostnameConfiguration` block as defined below.
     * @return builder
     */
    inline def hostnameConfiguration(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationArgs.Builder]):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationArgs.builder
      builder.hostnameConfiguration(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceIdentityArgs.Builder]):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param protocols A `protocols` block as defined below.
     * @return builder
     */
    inline def protocols(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceProtocolsArgs.Builder]):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceProtocolsArgs.builder
      builder.protocols(args(argsBuilder).build)

    /**
     * @param security A `security` block as defined below.
     * @return builder
     */
    inline def security(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceSecurityArgs.Builder]):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceSecurityArgs.builder
      builder.security(args(argsBuilder).build)

    /**
     * @param signIn A `signIn` block as defined below.
     * @return builder
     */
    inline def signIn(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceSignInArgs.Builder]):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceSignInArgs.builder
      builder.signIn(args(argsBuilder).build)

    /**
     * @param signUp A `signUp` block as defined below.
     * @return builder
     */
    inline def signUp(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceSignUpArgs.Builder]):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceSignUpArgs.builder
      builder.signUp(args(argsBuilder).build)

    /**
     * @param tenantAccess A `tenantAccess` block as defined below.
     * @return builder
     */
    inline def tenantAccess(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceTenantAccessArgs.Builder]):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceTenantAccessArgs.builder
      builder.tenantAccess(args(argsBuilder).build)

    /**
     * @param virtualNetworkConfiguration A `virtualNetworkConfiguration` block as defined below. Required when `virtualNetworkType` is `External` or `Internal`.
     * @return builder
     */
    inline def virtualNetworkConfiguration(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceVirtualNetworkConfigurationArgs.Builder]):
        com.pulumi.azure.apimanagement.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceVirtualNetworkConfigurationArgs.builder
      builder.virtualNetworkConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.StandaloneGatewayArgs.Builder)
    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.apimanagement.inputs.StandaloneGatewaySkuArgs.Builder]):
        com.pulumi.azure.apimanagement.StandaloneGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.StandaloneGatewaySkuArgs.builder
      builder.sku(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.WorkspaceNamedValueArgs.Builder)
    /**
     * @param valueFromKeyVault A `valueFromKeyVault` block as defined below.
     * 
     * &gt; **Note:** Exactly one of `value` or `valueFromKeyVault` must be specified. If `valueFromKeyVault` is specified, `secret` must also be set to `true`.
     * @return builder
     */
    inline def valueFromKeyVault(args: Endofunction[com.pulumi.azure.apimanagement.inputs.WorkspaceNamedValueValueFromKeyVaultArgs.Builder]):
        com.pulumi.azure.apimanagement.WorkspaceNamedValueArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.WorkspaceNamedValueValueFromKeyVaultArgs.builder
      builder.valueFromKeyVault(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestArgs.Builder)
    /**
     * @param dataMasking A `dataMasking` block as defined below.
     * @return builder
     */
    inline def dataMasking(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestDataMaskingArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestDataMaskingArgs.builder
      builder.dataMasking(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestDataMaskingArgs.Builder)
    /**
     * @param headers A `headers` block as defined below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestDataMaskingHeaderArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestDataMaskingHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParams A `queryParams` block as defined below.
     * @return builder
     */
    inline def queryParams(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestDataMaskingQueryParamArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestDataMaskingQueryParamArgs.builder
      builder.queryParams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseArgs.Builder)
    /**
     * @param dataMasking A `dataMasking` block as defined below.
     * @return builder
     */
    inline def dataMasking(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseDataMaskingArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseDataMaskingArgs.builder
      builder.dataMasking(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseDataMaskingArgs.Builder)
    /**
     * @param headers A `headers` block as defined below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseDataMaskingHeaderArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseDataMaskingHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParams A `queryParams` block as defined below.
     * @return builder
     */
    inline def queryParams(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseDataMaskingQueryParamArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseDataMaskingQueryParamArgs.builder
      builder.queryParams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestArgs.Builder)
    /**
     * @param dataMasking A `dataMasking` block as defined below.
     * @return builder
     */
    inline def dataMasking(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestDataMaskingArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestDataMaskingArgs.builder
      builder.dataMasking(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestDataMaskingArgs.Builder)
    /**
     * @param headers A `headers` block as defined below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestDataMaskingHeaderArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestDataMaskingHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParams A `queryParams` block as defined below.
     * @return builder
     */
    inline def queryParams(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestDataMaskingQueryParamArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestDataMaskingQueryParamArgs.builder
      builder.queryParams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseArgs.Builder)
    /**
     * @param dataMasking A `dataMasking` block as defined below.
     * @return builder
     */
    inline def dataMasking(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseDataMaskingArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseDataMaskingArgs.builder
      builder.dataMasking(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseDataMaskingArgs.Builder)
    /**
     * @param headers A `headers` block as defined below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseDataMaskingHeaderArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseDataMaskingHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParams A `queryParams` block as defined below.
     * @return builder
     */
    inline def queryParams(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseDataMaskingQueryParamArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseDataMaskingQueryParamArgs.builder
      builder.queryParams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiDiagnosticState.Builder)
    /**
     * @param backendRequest A `backendRequest` block as defined below.
     * @return builder
     */
    inline def backendRequest(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestArgs.builder
      builder.backendRequest(args(argsBuilder).build)

    /**
     * @param backendResponse A `backendResponse` block as defined below.
     * @return builder
     */
    inline def backendResponse(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendResponseArgs.builder
      builder.backendResponse(args(argsBuilder).build)

    /**
     * @param frontendRequest A `frontendRequest` block as defined below.
     * @return builder
     */
    inline def frontendRequest(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestArgs.builder
      builder.frontendRequest(args(argsBuilder).build)

    /**
     * @param frontendResponse A `frontendResponse` block as defined below.
     * @return builder
     */
    inline def frontendResponse(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiDiagnosticState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseArgs.builder
      builder.frontendResponse(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiImportArgs.Builder)
    /**
     * @param wsdlSelector A `wsdlSelector` block as defined below, which allows you to limit the import of a WSDL to only a subset of the document. This can only be specified when `contentFormat` is `wsdl` or `wsdl-link`.
     * @return builder
     */
    inline def wsdlSelector(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiImportWsdlSelectorArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiImportArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiImportWsdlSelectorArgs.builder
      builder.wsdlSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationRequestArgs.Builder)
    /**
     * @param headers One or more `header` blocks as defined above.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationRequestHeaderArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationRequestArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationRequestHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParameters One or more `queryParameter` blocks as defined above.
     * @return builder
     */
    inline def queryParameters(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationRequestQueryParameterArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationRequestArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationRequestQueryParameterArgs.builder
      builder.queryParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param representations One or more `representation` blocks as defined below.
     * @return builder
     */
    inline def representations(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationRequestArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationArgs.builder
      builder.representations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationRequestHeaderArgs.Builder)
    /**
     * @param examples One or more `example` blocks as defined above.
     * @return builder
     */
    inline def examples(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationRequestHeaderExampleArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationRequestHeaderArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationRequestHeaderExampleArgs.builder
      builder.examples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationRequestQueryParameterArgs.Builder)
    /**
     * @param examples One or more `example` blocks as defined above.
     * @return builder
     */
    inline def examples(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationRequestQueryParameterExampleArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationRequestQueryParameterArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationRequestQueryParameterExampleArgs.builder
      builder.examples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationArgs.Builder)
    /**
     * @param examples One or more `example` blocks as defined above.
     * @return builder
     */
    inline def examples(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationExampleArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationExampleArgs.builder
      builder.examples(args.map(_(argsBuilder).build)*)

    /**
     * @param formParameters One or more `formParameter` block as defined above.
     * 
     * &gt; **Note:** This is Required when `contentType` is set to `application/x-www-form-urlencoded` or `multipart/form-data`.
     * @return builder
     */
    inline def formParameters(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationFormParameterArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationFormParameterArgs.builder
      builder.formParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationFormParameterArgs.Builder)
    /**
     * @param examples One or more `example` blocks as defined above.
     * @return builder
     */
    inline def examples(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationFormParameterExampleArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationFormParameterArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationRequestRepresentationFormParameterExampleArgs.builder
      builder.examples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationResponseArgs.Builder)
    /**
     * @param headers One or more `header` blocks as defined above.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationResponseHeaderArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationResponseArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationResponseHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param representations One or more `representation` blocks as defined above.
     * @return builder
     */
    inline def representations(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationResponseArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationArgs.builder
      builder.representations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationResponseHeaderArgs.Builder)
    /**
     * @param examples One or more `example` blocks as defined above.
     * @return builder
     */
    inline def examples(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationResponseHeaderExampleArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationResponseHeaderArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationResponseHeaderExampleArgs.builder
      builder.examples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationArgs.Builder)
    /**
     * @param examples One or more `example` blocks as defined above.
     * @return builder
     */
    inline def examples(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationExampleArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationExampleArgs.builder
      builder.examples(args.map(_(argsBuilder).build)*)

    /**
     * @param formParameters One or more `formParameter` block as defined above.
     * 
     * &gt; **Note:** This is Required when `contentType` is set to `application/x-www-form-urlencoded` or `multipart/form-data`.
     * @return builder
     */
    inline def formParameters(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationFormParameterArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationFormParameterArgs.builder
      builder.formParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationFormParameterArgs.Builder)
    /**
     * @param examples One or more `example` blocks as defined above.
     * @return builder
     */
    inline def examples(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationFormParameterExampleArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationFormParameterArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationFormParameterExampleArgs.builder
      builder.examples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationState.Builder)
    /**
     * @param request A `request` block as defined below.
     * @return builder
     */
    inline def request(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationRequestArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiOperationState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationRequestArgs.builder
      builder.request(args(argsBuilder).build)

    /**
     * @param responses One or more `response` blocks as defined below.
     * @return builder
     */
    inline def responses(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationResponseArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationState.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationResponseArgs.builder
      builder.responses(args.map(_(argsBuilder).build)*)

    /**
     * @param templateParameters One or more `templateParameter` blocks as defined below. Required if `urlTemplate` contains one or more parameters.
     * @return builder
     */
    inline def templateParameters(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationTemplateParameterArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationState.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationTemplateParameterArgs.builder
      builder.templateParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiOperationTemplateParameterArgs.Builder)
    /**
     * @param examples One or more `example` blocks as defined above.
     * @return builder
     */
    inline def examples(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOperationTemplateParameterExampleArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ApiOperationTemplateParameterArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOperationTemplateParameterExampleArgs.builder
      builder.examples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ApiState.Builder)
    /**
     * @param contact A `contact` block as documented below.
     * @return builder
     */
    inline def contact(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiContactArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiContactArgs.builder
      builder.contact(args(argsBuilder).build)

    /**
     * @param import_ A `import` block as documented below.
     * 
     * &gt; **Note:** The `displayName`, `description`, `contact`, and `license` fields can be imported by the `import` block, which might cause a drift if these fields are set along with the `import` block.
     * @return builder
     */
    inline def import_(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiImportArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiImportArgs.builder
      builder.import_(args(argsBuilder).build)

    /**
     * @param license A `license` block as documented below.
     * @return builder
     */
    inline def license(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiLicenseArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiLicenseArgs.builder
      builder.license(args(argsBuilder).build)

    /**
     * @param oauth2Authorization An `oauth2Authorization` block as documented below.
     * @return builder
     */
    inline def oauth2Authorization(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOauth2AuthorizationArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOauth2AuthorizationArgs.builder
      builder.oauth2Authorization(args(argsBuilder).build)

    /**
     * @param openidAuthentication An `openidAuthentication` block as documented below.
     * @return builder
     */
    inline def openidAuthentication(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiOpenidAuthenticationArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiOpenidAuthenticationArgs.builder
      builder.openidAuthentication(args(argsBuilder).build)

    /**
     * @param subscriptionKeyParameterNames A `subscriptionKeyParameterNames` block as documented below.
     * @return builder
     */
    inline def subscriptionKeyParameterNames(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ApiSubscriptionKeyParameterNamesArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ApiState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ApiSubscriptionKeyParameterNamesArgs.builder
      builder.subscriptionKeyParameterNames(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.AuthorizationServerState.Builder)
    /**
     * @param tokenBodyParameters A `tokenBodyParameter` block as defined below.
     * @return builder
     */
    inline def tokenBodyParameters(args: Endofunction[com.pulumi.azure.apimanagement.inputs.AuthorizationServerTokenBodyParameterArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.AuthorizationServerState.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.AuthorizationServerTokenBodyParameterArgs.builder
      builder.tokenBodyParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleArgs.Builder)
    /**
     * @param failureCondition A `failureCondition` block as defined below.
     * @return builder
     */
    inline def failureCondition(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleFailureConditionArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleFailureConditionArgs.builder
      builder.failureCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleFailureConditionArgs.Builder)
    /**
     * @param statusCodeRanges One or more `statusCodeRange` blocks as defined below.
     * 
     * &gt; **Note:** At least one of `statusCodeRange`, and `errorReasons` must be set.
     * @return builder
     */
    inline def statusCodeRanges(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleFailureConditionStatusCodeRangeArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleFailureConditionArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleFailureConditionStatusCodeRangeArgs.builder
      builder.statusCodeRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.BackendCredentialsArgs.Builder)
    /**
     * @param authorization An `authorization` block as defined below.
     * @return builder
     */
    inline def authorization(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendCredentialsAuthorizationArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.BackendCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendCredentialsAuthorizationArgs.builder
      builder.authorization(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.BackendServiceFabricClusterArgs.Builder)
    /**
     * @param serverX509Names One or more `serverX509Name` blocks as documented below.
     * @return builder
     */
    inline def serverX509Names(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendServiceFabricClusterServerX509NameArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.BackendServiceFabricClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendServiceFabricClusterServerX509NameArgs.builder
      builder.serverX509Names(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.BackendState.Builder)
    /**
     * @param circuitBreakerRule A `circuitBreakerRule` block as documented below.
     * @return builder
     */
    inline def circuitBreakerRule(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.BackendState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendCircuitBreakerRuleArgs.builder
      builder.circuitBreakerRule(args(argsBuilder).build)

    /**
     * @param credentials A `credentials` block as documented below.
     * @return builder
     */
    inline def credentials(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendCredentialsArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.BackendState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendCredentialsArgs.builder
      builder.credentials(args(argsBuilder).build)

    /**
     * @param proxy A `proxy` block as documented below.
     * @return builder
     */
    inline def proxy(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendProxyArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.BackendState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendProxyArgs.builder
      builder.proxy(args(argsBuilder).build)

    /**
     * @param serviceFabricCluster A `serviceFabricCluster` block as documented below.
     * @return builder
     */
    inline def serviceFabricCluster(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendServiceFabricClusterArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.BackendState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendServiceFabricClusterArgs.builder
      builder.serviceFabricCluster(args(argsBuilder).build)

    /**
     * @param tls A `tls` block as documented below.
     * @return builder
     */
    inline def tls(args: Endofunction[com.pulumi.azure.apimanagement.inputs.BackendTlsArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.BackendState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.BackendTlsArgs.builder
      builder.tls(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.CustomDomainState.Builder)
    /**
     * @param developerPortals One or more `developerPortal` blocks as defined below.
     * @return builder
     */
    inline def developerPortals(args: Endofunction[com.pulumi.azure.apimanagement.inputs.CustomDomainDeveloperPortalArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.CustomDomainState.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.CustomDomainDeveloperPortalArgs.builder
      builder.developerPortals(args.map(_(argsBuilder).build)*)

    /**
     * @param gateways One or more `gateway` blocks as defined below.
     * @return builder
     */
    inline def gateways(args: Endofunction[com.pulumi.azure.apimanagement.inputs.CustomDomainGatewayArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.CustomDomainState.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.CustomDomainGatewayArgs.builder
      builder.gateways(args.map(_(argsBuilder).build)*)

    /**
     * @param managements One or more `management` blocks as defined below.
     * @return builder
     */
    inline def managements(args: Endofunction[com.pulumi.azure.apimanagement.inputs.CustomDomainManagementArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.CustomDomainState.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.CustomDomainManagementArgs.builder
      builder.managements(args.map(_(argsBuilder).build)*)

    /**
     * @param portals One or more `portal` blocks as defined below.
     * @return builder
     */
    inline def portals(args: Endofunction[com.pulumi.azure.apimanagement.inputs.CustomDomainPortalArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.CustomDomainState.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.CustomDomainPortalArgs.builder
      builder.portals(args.map(_(argsBuilder).build)*)

    /**
     * @param scms One or more `scm` blocks as defined below.
     * @return builder
     */
    inline def scms(args: Endofunction[com.pulumi.azure.apimanagement.inputs.CustomDomainScmArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.CustomDomainState.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.CustomDomainScmArgs.builder
      builder.scms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestArgs.Builder)
    /**
     * @param dataMasking A `dataMasking` block as defined below.
     * @return builder
     */
    inline def dataMasking(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestDataMaskingArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestDataMaskingArgs.builder
      builder.dataMasking(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestDataMaskingArgs.Builder)
    /**
     * @param headers A `headers` block as defined below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestDataMaskingHeaderArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestDataMaskingHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParams A `queryParams` block as defined below.
     * @return builder
     */
    inline def queryParams(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestDataMaskingQueryParamArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestDataMaskingQueryParamArgs.builder
      builder.queryParams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseArgs.Builder)
    /**
     * @param dataMasking A `dataMasking` block as defined below.
     * @return builder
     */
    inline def dataMasking(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseDataMaskingArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseDataMaskingArgs.builder
      builder.dataMasking(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseDataMaskingArgs.Builder)
    /**
     * @param headers A `headers` block as defined below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseDataMaskingHeaderArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseDataMaskingHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParams A `queryParams` block as defined below.
     * @return builder
     */
    inline def queryParams(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseDataMaskingQueryParamArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseDataMaskingQueryParamArgs.builder
      builder.queryParams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestArgs.Builder)
    /**
     * @param dataMasking A `dataMasking` block as defined below.
     * @return builder
     */
    inline def dataMasking(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestDataMaskingArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestDataMaskingArgs.builder
      builder.dataMasking(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestDataMaskingArgs.Builder)
    /**
     * @param headers A `headers` block as defined below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestDataMaskingHeaderArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestDataMaskingHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParams A `queryParams` block as defined below.
     * @return builder
     */
    inline def queryParams(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestDataMaskingQueryParamArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestDataMaskingQueryParamArgs.builder
      builder.queryParams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseArgs.Builder)
    /**
     * @param dataMasking A `dataMasking` block as defined below.
     * @return builder
     */
    inline def dataMasking(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseDataMaskingArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseDataMaskingArgs.builder
      builder.dataMasking(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseDataMaskingArgs.Builder)
    /**
     * @param headers A `headers` block as defined below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseDataMaskingHeaderArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseDataMaskingHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParams A `queryParams` block as defined below.
     * @return builder
     */
    inline def queryParams(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseDataMaskingQueryParamArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseDataMaskingArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseDataMaskingQueryParamArgs.builder
      builder.queryParams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.DiagnosticState.Builder)
    /**
     * @param backendRequest A `backendRequest` block as defined below.
     * @return builder
     */
    inline def backendRequest(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.DiagnosticState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestArgs.builder
      builder.backendRequest(args(argsBuilder).build)

    /**
     * @param backendResponse A `backendResponse` block as defined below.
     * @return builder
     */
    inline def backendResponse(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.DiagnosticState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseArgs.builder
      builder.backendResponse(args(argsBuilder).build)

    /**
     * @param frontendRequest A `frontendRequest` block as defined below.
     * @return builder
     */
    inline def frontendRequest(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.DiagnosticState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestArgs.builder
      builder.frontendRequest(args(argsBuilder).build)

    /**
     * @param frontendResponse A `frontendResponse` block as defined below.
     * @return builder
     */
    inline def frontendResponse(args: Endofunction[com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.DiagnosticState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseArgs.builder
      builder.frontendResponse(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.GatewayState.Builder)
    /**
     * @param locationData A `locationData` block as documented below.
     * @return builder
     */
    inline def locationData(args: Endofunction[com.pulumi.azure.apimanagement.inputs.GatewayLocationDataArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.GatewayState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.GatewayLocationDataArgs.builder
      builder.locationData(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.LoggerState.Builder)
    /**
     * @param applicationInsights An `applicationInsights` block as documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def applicationInsights(args: Endofunction[com.pulumi.azure.apimanagement.inputs.LoggerApplicationInsightsArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.LoggerState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.LoggerApplicationInsightsArgs.builder
      builder.applicationInsights(args(argsBuilder).build)

    /**
     * @param eventhub An `eventhub` block as documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def eventhub(args: Endofunction[com.pulumi.azure.apimanagement.inputs.LoggerEventhubArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.LoggerState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.LoggerEventhubArgs.builder
      builder.eventhub(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.NamedValueState.Builder)
    /**
     * @param valueFromKeyVault A `valueFromKeyVault` block as defined below. If specified, `secret` must also be set to `true`.
     * @return builder
     */
    inline def valueFromKeyVault(args: Endofunction[com.pulumi.azure.apimanagement.inputs.NamedValueValueFromKeyVaultArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.NamedValueState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.NamedValueValueFromKeyVaultArgs.builder
      builder.valueFromKeyVault(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ServiceAdditionalLocationArgs.Builder)
    /**
     * @param virtualNetworkConfiguration A `virtualNetworkConfiguration` block as defined below. Required when `virtualNetworkType` is `External` or `Internal`.
     * @return builder
     */
    inline def virtualNetworkConfiguration(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceAdditionalLocationVirtualNetworkConfigurationArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceAdditionalLocationArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceAdditionalLocationVirtualNetworkConfigurationArgs.builder
      builder.virtualNetworkConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationArgs.Builder)
    /**
     * @param developerPortals One or more `developerPortal` blocks as documented below.
     * @return builder
     */
    inline def developerPortals(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationDeveloperPortalArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationDeveloperPortalArgs.builder
      builder.developerPortals(args.map(_(argsBuilder).build)*)

    /**
     * @param managements One or more `management` blocks as documented below.
     * @return builder
     */
    inline def managements(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationManagementArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationManagementArgs.builder
      builder.managements(args.map(_(argsBuilder).build)*)

    /**
     * @param portals One or more `portal` blocks as documented below.
     * @return builder
     */
    inline def portals(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationPortalArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationPortalArgs.builder
      builder.portals(args.map(_(argsBuilder).build)*)

    /**
     * @param proxies One or more `proxy` blocks as documented below.
     * @return builder
     */
    inline def proxies(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationProxyArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationProxyArgs.builder
      builder.proxies(args.map(_(argsBuilder).build)*)

    /**
     * @param scms One or more `scm` blocks as documented below.
     * @return builder
     */
    inline def scms(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationScmArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationScmArgs.builder
      builder.scms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ServiceSignUpArgs.Builder)
    /**
     * @param termsOfService A `termsOfService` block as defined below.
     * @return builder
     */
    inline def termsOfService(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceSignUpTermsOfServiceArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceSignUpArgs.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceSignUpTermsOfServiceArgs.builder
      builder.termsOfService(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.ServiceState.Builder)
    /**
     * @param additionalLocations One or more `additionalLocation` blocks as defined below.
     * @return builder
     */
    inline def additionalLocations(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceAdditionalLocationArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceAdditionalLocationArgs.builder
      builder.additionalLocations(args.map(_(argsBuilder).build)*)

    /**
     * @param certificates One or more `certificate` blocks (up to 10) as defined below.
     * @return builder
     */
    inline def certificates(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceCertificateArgs.Builder]*):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

    /**
     * @param delegation A `delegation` block as defined below.
     * @return builder
     */
    inline def delegation(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceDelegationArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceDelegationArgs.builder
      builder.delegation(args(argsBuilder).build)

    /**
     * @param hostnameConfiguration A `hostnameConfiguration` block as defined below.
     * @return builder
     */
    inline def hostnameConfiguration(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceHostnameConfigurationArgs.builder
      builder.hostnameConfiguration(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceIdentityArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param protocols A `protocols` block as defined below.
     * @return builder
     */
    inline def protocols(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceProtocolsArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceProtocolsArgs.builder
      builder.protocols(args(argsBuilder).build)

    /**
     * @param security A `security` block as defined below.
     * @return builder
     */
    inline def security(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceSecurityArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceSecurityArgs.builder
      builder.security(args(argsBuilder).build)

    /**
     * @param signIn A `signIn` block as defined below.
     * @return builder
     */
    inline def signIn(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceSignInArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceSignInArgs.builder
      builder.signIn(args(argsBuilder).build)

    /**
     * @param signUp A `signUp` block as defined below.
     * @return builder
     */
    inline def signUp(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceSignUpArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceSignUpArgs.builder
      builder.signUp(args(argsBuilder).build)

    /**
     * @param tenantAccess A `tenantAccess` block as defined below.
     * @return builder
     */
    inline def tenantAccess(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceTenantAccessArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceTenantAccessArgs.builder
      builder.tenantAccess(args(argsBuilder).build)

    /**
     * @param virtualNetworkConfiguration A `virtualNetworkConfiguration` block as defined below. Required when `virtualNetworkType` is `External` or `Internal`.
     * @return builder
     */
    inline def virtualNetworkConfiguration(args: Endofunction[com.pulumi.azure.apimanagement.inputs.ServiceVirtualNetworkConfigurationArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.ServiceVirtualNetworkConfigurationArgs.builder
      builder.virtualNetworkConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.StandaloneGatewayState.Builder)
    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.apimanagement.inputs.StandaloneGatewaySkuArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.StandaloneGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.StandaloneGatewaySkuArgs.builder
      builder.sku(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.apimanagement.inputs.WorkspaceNamedValueState.Builder)
    /**
     * @param valueFromKeyVault A `valueFromKeyVault` block as defined below.
     * 
     * &gt; **Note:** Exactly one of `value` or `valueFromKeyVault` must be specified. If `valueFromKeyVault` is specified, `secret` must also be set to `true`.
     * @return builder
     */
    inline def valueFromKeyVault(args: Endofunction[com.pulumi.azure.apimanagement.inputs.WorkspaceNamedValueValueFromKeyVaultArgs.Builder]):
        com.pulumi.azure.apimanagement.inputs.WorkspaceNamedValueState.Builder =
      val argsBuilder = com.pulumi.azure.apimanagement.inputs.WorkspaceNamedValueValueFromKeyVaultArgs.builder
      builder.valueFromKeyVault(args(argsBuilder).build)
