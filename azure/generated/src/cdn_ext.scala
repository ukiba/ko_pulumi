package jp.ukiba.ko_pulumi
package azure

object cdn_ext:
  extension (builder: com.pulumi.azure.cdn.EndpointArgs.Builder)
    /**
     * @param deliveryRules Rules for the rules engine. An endpoint can contain up until 4 of those rules that consist of conditions and actions. A `deliveryRule` blocks as defined below.
     * @return builder
     */
    inline def deliveryRules(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder]*):
        com.pulumi.azure.cdn.EndpointArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.builder
      builder.deliveryRules(args.map(_(argsBuilder).build)*)

    /**
     * @param geoFilters A set of Geo Filters for this CDN Endpoint. Each `geoFilter` block supports fields documented below.
     * @return builder
     */
    inline def geoFilters(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointGeoFilterArgs.Builder]*):
        com.pulumi.azure.cdn.EndpointArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointGeoFilterArgs.builder
      builder.geoFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param globalDeliveryRule Actions that are valid for all resources regardless of any conditions. A `globalDeliveryRule` block as defined below.
     * @return builder
     */
    inline def globalDeliveryRule(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.Builder]):
        com.pulumi.azure.cdn.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.builder
      builder.globalDeliveryRule(args(argsBuilder).build)

    /**
     * @param origins The set of origins of the CDN endpoint. When multiple origins exist, the first origin will be used as primary and rest will be used as failover options. Each `origin` block supports fields documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def origins(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointOriginArgs.Builder]*):
        com.pulumi.azure.cdn.EndpointArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointOriginArgs.builder
      builder.origins(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.EndpointCustomDomainArgs.Builder)
    /**
     * @param cdnManagedHttps A `cdnManagedHttps` block as defined below.
     * @return builder
     */
    inline def cdnManagedHttps(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointCustomDomainCdnManagedHttpsArgs.Builder]):
        com.pulumi.azure.cdn.EndpointCustomDomainArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointCustomDomainCdnManagedHttpsArgs.builder
      builder.cdnManagedHttps(args(argsBuilder).build)

    /**
     * @param userManagedHttps A `userManagedHttps` block as defined below.
     * 
     * &gt; **Note:** Only one of `cdnManagedHttps` and `userManagedHttps` can be specified.
     * @return builder
     */
    inline def userManagedHttps(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointCustomDomainUserManagedHttpsArgs.Builder]):
        com.pulumi.azure.cdn.EndpointCustomDomainArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointCustomDomainUserManagedHttpsArgs.builder
      builder.userManagedHttps(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.FrontdoorBatchRuleSetArgs.Builder)
    /**
     * @param rules One or more `rule` blocks as defined below. The configured blocks represent the complete set of rules managed for this Front Door Batch Rule Set. The final rule ordering is determined by each block&#39;s `order` value. A maximum of `100` `rule` blocks may be defined.
     * 
     * &gt; **Note:** The `rule` blocks must be declared in ascending `order`, gaps between different rules are allowed. To insert, remove, or move a rule, update the full `rule` collection in the same ascending order that you want Terraform to store.
     * 
     * &gt; **Note:** Each `rule` block must use a unique `name` value and a unique `order` value.
     * 
     * &gt; **Note:** Each `rule` that enables caching (using the `route_configuration_override.caching` block with a `behaviour` other than `Disabled`) consumes two of the `100` available rule slots. The plan fails if the effective number of rule slots exceeds this service-side quota.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleArgs.Builder]*):
        com.pulumi.azure.cdn.FrontdoorBatchRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.FrontdoorCustomDomainArgs.Builder)
    /**
     * @param tls A `tls` block as defined below.
     * @return builder
     */
    inline def tls(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorCustomDomainTlsArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorCustomDomainArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorCustomDomainTlsArgs.builder
      builder.tls(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.FrontdoorFirewallPolicyArgs.Builder)
    /**
     * @param customRules One or more `customRule` blocks as defined below.
     * @return builder
     */
    inline def customRules(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyCustomRuleArgs.Builder]*):
        com.pulumi.azure.cdn.FrontdoorFirewallPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyCustomRuleArgs.builder
      builder.customRules(args.map(_(argsBuilder).build)*)

    /**
     * @param logScrubbing A `logScrubbing` block as defined below.
     * 
     * &gt; **Note:** Setting the`logScrubbing` block is currently in **PREVIEW**. Please see the [Supplemental Terms of Use for Microsoft Azure Previews](https://azure.microsoft.com/support/legal/preview-supplemental-terms/) for legal terms that apply to Azure features that are in beta, preview, or otherwise not yet released into general availability.
     * @return builder
     */
    inline def logScrubbing(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyLogScrubbingArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorFirewallPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyLogScrubbingArgs.builder
      builder.logScrubbing(args(argsBuilder).build)

    /**
     * @param managedRules One or more `managedRule` blocks as defined below.
     * @return builder
     */
    inline def managedRules(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleArgs.Builder]*):
        com.pulumi.azure.cdn.FrontdoorFirewallPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleArgs.builder
      builder.managedRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.FrontdoorOriginArgs.Builder)
    /**
     * @param privateLink A `privateLink` block as defined below.
     * 
     * &gt; **Note:** Private Link requires that the Front Door Profile this Origin is hosted within is using the SKU `Premium_AzureFrontDoor` and that the `certificateNameCheckEnabled` field is set to `true`.
     * @return builder
     */
    inline def privateLink(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorOriginPrivateLinkArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorOriginArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorOriginPrivateLinkArgs.builder
      builder.privateLink(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.FrontdoorOriginGroupArgs.Builder)
    /**
     * @param healthProbe A `healthProbe` block as defined below.
     * @return builder
     */
    inline def healthProbe(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupHealthProbeArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorOriginGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupHealthProbeArgs.builder
      builder.healthProbe(args(argsBuilder).build)

    /**
     * @param loadBalancing A `loadBalancing` block as defined below.
     * @return builder
     */
    inline def loadBalancing(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupLoadBalancingArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorOriginGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupLoadBalancingArgs.builder
      builder.loadBalancing(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.FrontdoorProfileArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorProfileIdentityArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorProfileIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param logScrubbingRules One or more `logScrubbingRule` blocks as defined below.
     * 
     * &gt; **Note:** When no `logScrubbingRule` blocks are defined, log scrubbing will be automatically `disabled`. When one or more `logScrubbingRule` blocks are present, log scrubbing will be `enabled`.
     * @return builder
     */
    inline def logScrubbingRules(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorProfileLogScrubbingRuleArgs.Builder]*):
        com.pulumi.azure.cdn.FrontdoorProfileArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorProfileLogScrubbingRuleArgs.builder
      builder.logScrubbingRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.FrontdoorRouteArgs.Builder)
    /**
     * @param cache A `cache` block as defined below.
     * 
     * &gt; **Note:** To disable caching, do not provide the `cache` block in the configuration file.
     * @return builder
     */
    inline def cache(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRouteCacheArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorRouteArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRouteCacheArgs.builder
      builder.cache(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.FrontdoorRuleArgs.Builder)
    /**
     * @param actions An `actions` block as defined below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsArgs.builder
      builder.actions(args(argsBuilder).build)

    /**
     * @param conditions A `conditions` block as defined below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.builder
      builder.conditions(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.FrontdoorSecretArgs.Builder)
    /**
     * @param secret A `secret` block as defined below. Changing this forces a new Front Door Secret to be created.
     * @return builder
     */
    inline def secret(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorSecretSecretArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorSecretArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorSecretSecretArgs.builder
      builder.secret(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.FrontdoorSecurityPolicyArgs.Builder)
    /**
     * @param securityPolicies A `securityPolicies` block as defined below.
     * @return builder
     */
    inline def securityPolicies(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesArgs.Builder]):
        com.pulumi.azure.cdn.FrontdoorSecurityPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesArgs.builder
      builder.securityPolicies(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.EndpointCustomDomainState.Builder)
    /**
     * @param cdnManagedHttps A `cdnManagedHttps` block as defined below.
     * @return builder
     */
    inline def cdnManagedHttps(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointCustomDomainCdnManagedHttpsArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointCustomDomainState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointCustomDomainCdnManagedHttpsArgs.builder
      builder.cdnManagedHttps(args(argsBuilder).build)

    /**
     * @param userManagedHttps A `userManagedHttps` block as defined below.
     * 
     * &gt; **Note:** Only one of `cdnManagedHttps` and `userManagedHttps` can be specified.
     * @return builder
     */
    inline def userManagedHttps(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointCustomDomainUserManagedHttpsArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointCustomDomainState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointCustomDomainUserManagedHttpsArgs.builder
      builder.userManagedHttps(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder)
    /**
     * @param cacheExpirationAction A `cacheExpirationAction` block as defined above.
     * @return builder
     */
    inline def cacheExpirationAction(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleCacheExpirationActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleCacheExpirationActionArgs.builder
      builder.cacheExpirationAction(args(argsBuilder).build)

    /**
     * @param cacheKeyQueryStringAction A `cacheKeyQueryStringAction` block as defined above.
     * @return builder
     */
    inline def cacheKeyQueryStringAction(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleCacheKeyQueryStringActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleCacheKeyQueryStringActionArgs.builder
      builder.cacheKeyQueryStringAction(args(argsBuilder).build)

    /**
     * @param cookiesConditions A `cookiesCondition` block as defined above.
     * @return builder
     */
    inline def cookiesConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleCookiesConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleCookiesConditionArgs.builder
      builder.cookiesConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param deviceCondition A `deviceCondition` block as defined below.
     * @return builder
     */
    inline def deviceCondition(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleDeviceConditionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleDeviceConditionArgs.builder
      builder.deviceCondition(args(argsBuilder).build)

    /**
     * @param httpVersionConditions A `httpVersionCondition` block as defined below.
     * @return builder
     */
    inline def httpVersionConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleHttpVersionConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleHttpVersionConditionArgs.builder
      builder.httpVersionConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param modifyRequestHeaderActions A `modifyRequestHeaderAction` block as defined below.
     * @return builder
     */
    inline def modifyRequestHeaderActions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleModifyRequestHeaderActionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleModifyRequestHeaderActionArgs.builder
      builder.modifyRequestHeaderActions(args.map(_(argsBuilder).build)*)

    /**
     * @param modifyResponseHeaderActions A `modifyResponseHeaderAction` block as defined below.
     * @return builder
     */
    inline def modifyResponseHeaderActions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleModifyResponseHeaderActionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleModifyResponseHeaderActionArgs.builder
      builder.modifyResponseHeaderActions(args.map(_(argsBuilder).build)*)

    /**
     * @param postArgConditions A `postArgCondition` block as defined below.
     * @return builder
     */
    inline def postArgConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRulePostArgConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRulePostArgConditionArgs.builder
      builder.postArgConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param queryStringConditions A `queryStringCondition` block as defined below.
     * @return builder
     */
    inline def queryStringConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleQueryStringConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleQueryStringConditionArgs.builder
      builder.queryStringConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param remoteAddressConditions A `remoteAddressCondition` block as defined below.
     * @return builder
     */
    inline def remoteAddressConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRemoteAddressConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRemoteAddressConditionArgs.builder
      builder.remoteAddressConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param requestBodyConditions A `requestBodyCondition` block as defined below.
     * @return builder
     */
    inline def requestBodyConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRequestBodyConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRequestBodyConditionArgs.builder
      builder.requestBodyConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param requestHeaderConditions A `requestHeaderCondition` block as defined below.
     * @return builder
     */
    inline def requestHeaderConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRequestHeaderConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRequestHeaderConditionArgs.builder
      builder.requestHeaderConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param requestMethodCondition A `requestMethodCondition` block as defined below.
     * @return builder
     */
    inline def requestMethodCondition(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRequestMethodConditionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRequestMethodConditionArgs.builder
      builder.requestMethodCondition(args(argsBuilder).build)

    /**
     * @param requestSchemeCondition A `requestSchemeCondition` block as defined below.
     * @return builder
     */
    inline def requestSchemeCondition(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRequestSchemeConditionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRequestSchemeConditionArgs.builder
      builder.requestSchemeCondition(args(argsBuilder).build)

    /**
     * @param requestUriConditions A `requestUriCondition` block as defined below.
     * @return builder
     */
    inline def requestUriConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRequestUriConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleRequestUriConditionArgs.builder
      builder.requestUriConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param urlFileExtensionConditions A `urlFileExtensionCondition` block as defined below.
     * @return builder
     */
    inline def urlFileExtensionConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleUrlFileExtensionConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleUrlFileExtensionConditionArgs.builder
      builder.urlFileExtensionConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param urlFileNameConditions A `urlFileNameCondition` block as defined below.
     * @return builder
     */
    inline def urlFileNameConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleUrlFileNameConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleUrlFileNameConditionArgs.builder
      builder.urlFileNameConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param urlPathConditions A `urlPathCondition` block as defined below.
     * @return builder
     */
    inline def urlPathConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleUrlPathConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleUrlPathConditionArgs.builder
      builder.urlPathConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param urlRedirectAction A `urlRedirectAction` block as defined below.
     * @return builder
     */
    inline def urlRedirectAction(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleUrlRedirectActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleUrlRedirectActionArgs.builder
      builder.urlRedirectAction(args(argsBuilder).build)

    /**
     * @param urlRewriteAction A `urlRewriteAction` block as defined below.
     * @return builder
     */
    inline def urlRewriteAction(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleUrlRewriteActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleUrlRewriteActionArgs.builder
      builder.urlRewriteAction(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.Builder)
    /**
     * @param cacheExpirationAction A `cacheExpirationAction` block as defined above.
     * @return builder
     */
    inline def cacheExpirationAction(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleCacheExpirationActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleCacheExpirationActionArgs.builder
      builder.cacheExpirationAction(args(argsBuilder).build)

    /**
     * @param cacheKeyQueryStringAction A `cacheKeyQueryStringAction` block as defined above.
     * @return builder
     */
    inline def cacheKeyQueryStringAction(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleCacheKeyQueryStringActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleCacheKeyQueryStringActionArgs.builder
      builder.cacheKeyQueryStringAction(args(argsBuilder).build)

    /**
     * @param modifyRequestHeaderActions A `modifyRequestHeaderAction` block as defined below.
     * @return builder
     */
    inline def modifyRequestHeaderActions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleModifyRequestHeaderActionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleModifyRequestHeaderActionArgs.builder
      builder.modifyRequestHeaderActions(args.map(_(argsBuilder).build)*)

    /**
     * @param modifyResponseHeaderActions A `modifyResponseHeaderAction` block as defined below.
     * @return builder
     */
    inline def modifyResponseHeaderActions(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleModifyResponseHeaderActionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleModifyResponseHeaderActionArgs.builder
      builder.modifyResponseHeaderActions(args.map(_(argsBuilder).build)*)

    /**
     * @param urlRedirectAction A `urlRedirectAction` block as defined below.
     * @return builder
     */
    inline def urlRedirectAction(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleUrlRedirectActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleUrlRedirectActionArgs.builder
      builder.urlRedirectAction(args(argsBuilder).build)

    /**
     * @param urlRewriteAction A `urlRewriteAction` block as defined below.
     * @return builder
     */
    inline def urlRewriteAction(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleUrlRewriteActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleUrlRewriteActionArgs.builder
      builder.urlRewriteAction(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.EndpointState.Builder)
    /**
     * @param deliveryRules Rules for the rules engine. An endpoint can contain up until 4 of those rules that consist of conditions and actions. A `deliveryRule` blocks as defined below.
     * @return builder
     */
    inline def deliveryRules(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointState.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointDeliveryRuleArgs.builder
      builder.deliveryRules(args.map(_(argsBuilder).build)*)

    /**
     * @param geoFilters A set of Geo Filters for this CDN Endpoint. Each `geoFilter` block supports fields documented below.
     * @return builder
     */
    inline def geoFilters(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointGeoFilterArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointState.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointGeoFilterArgs.builder
      builder.geoFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param globalDeliveryRule Actions that are valid for all resources regardless of any conditions. A `globalDeliveryRule` block as defined below.
     * @return builder
     */
    inline def globalDeliveryRule(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.Builder]):
        com.pulumi.azure.cdn.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.EndpointGlobalDeliveryRuleArgs.builder
      builder.globalDeliveryRule(args(argsBuilder).build)

    /**
     * @param origins The set of origins of the CDN endpoint. When multiple origins exist, the first origin will be used as primary and rest will be used as failover options. Each `origin` block supports fields documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def origins(args: Endofunction[com.pulumi.azure.cdn.inputs.EndpointOriginArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.EndpointState.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.EndpointOriginArgs.builder
      builder.origins(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsArgs.Builder)
    /**
     * @param modifyRequestHeaders One or more `modifyRequestHeader` blocks as defined below.
     * @return builder
     */
    inline def modifyRequestHeaders(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsModifyRequestHeaderArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsModifyRequestHeaderArgs.builder
      builder.modifyRequestHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param modifyResponseHeaders One or more `modifyResponseHeader` blocks as defined below.
     * @return builder
     */
    inline def modifyResponseHeaders(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsModifyResponseHeaderArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsModifyResponseHeaderArgs.builder
      builder.modifyResponseHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param routeConfigurationOverride A `routeConfigurationOverride` block as defined below.
     * 
     * &gt; **Note:** `routeConfigurationOverride` conflicts with `urlRedirect`.
     * @return builder
     */
    inline def routeConfigurationOverride(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsRouteConfigurationOverrideArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsRouteConfigurationOverrideArgs.builder
      builder.routeConfigurationOverride(args(argsBuilder).build)

    /**
     * @param urlRedirect A `urlRedirect` block as defined below.
     * @return builder
     */
    inline def urlRedirect(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsUrlRedirectArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsUrlRedirectArgs.builder
      builder.urlRedirect(args(argsBuilder).build)

    /**
     * @param urlRewrite A `urlRewrite` block as defined below.
     * 
     * &gt; **Note:** `urlRewrite` conflicts with `urlRedirect` and vice-versa.
     * @return builder
     */
    inline def urlRewrite(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsUrlRewriteArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsUrlRewriteArgs.builder
      builder.urlRewrite(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsRouteConfigurationOverrideArgs.Builder)
    /**
     * @param caching A `caching` block as defined below.
     * @return builder
     */
    inline def caching(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsRouteConfigurationOverrideCachingArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsRouteConfigurationOverrideArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsRouteConfigurationOverrideCachingArgs.builder
      builder.caching(args(argsBuilder).build)

    /**
     * @param originGroup An `originGroup` block as defined below.
     * @return builder
     */
    inline def originGroup(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsRouteConfigurationOverrideOriginGroupArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsRouteConfigurationOverrideArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsRouteConfigurationOverrideOriginGroupArgs.builder
      builder.originGroup(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleArgs.Builder)
    /**
     * @param actions An `actions` block as defined below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleActionsArgs.builder
      builder.actions(args(argsBuilder).build)

    /**
     * @param conditions A `conditions` block as defined below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.builder
      builder.conditions(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.Builder)
    /**
     * @param clientPorts One or more `clientPort` blocks as defined below.
     * @return builder
     */
    inline def clientPorts(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsClientPortArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsClientPortArgs.builder
      builder.clientPorts(args.map(_(argsBuilder).build)*)

    /**
     * @param deviceTypes One or more `deviceType` blocks as defined below.
     * @return builder
     */
    inline def deviceTypes(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsDeviceTypeArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsDeviceTypeArgs.builder
      builder.deviceTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param hostNames One or more `hostName` blocks as defined below.
     * @return builder
     */
    inline def hostNames(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsHostNameArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsHostNameArgs.builder
      builder.hostNames(args.map(_(argsBuilder).build)*)

    /**
     * @param httpVersions One or more `httpVersion` blocks as defined below.
     * @return builder
     */
    inline def httpVersions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsHttpVersionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsHttpVersionArgs.builder
      builder.httpVersions(args.map(_(argsBuilder).build)*)

    /**
     * @param postArguments One or more `postArgument` blocks as defined below.
     * @return builder
     */
    inline def postArguments(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsPostArgumentArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsPostArgumentArgs.builder
      builder.postArguments(args.map(_(argsBuilder).build)*)

    /**
     * @param queryStrings One or more `queryString` blocks as defined below.
     * @return builder
     */
    inline def queryStrings(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsQueryStringArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsQueryStringArgs.builder
      builder.queryStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param remoteAddresses One or more `remoteAddress` blocks as defined below.
     * @return builder
     */
    inline def remoteAddresses(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsRemoteAddressArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsRemoteAddressArgs.builder
      builder.remoteAddresses(args.map(_(argsBuilder).build)*)

    /**
     * @param requestBodies One or more `requestBody` blocks as defined below.
     * @return builder
     */
    inline def requestBodies(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsRequestBodyArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsRequestBodyArgs.builder
      builder.requestBodies(args.map(_(argsBuilder).build)*)

    /**
     * @param requestCookies One or more `requestCookies` blocks as defined below.
     * @return builder
     */
    inline def requestCookies(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsRequestCookyArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsRequestCookyArgs.builder
      builder.requestCookies(args.map(_(argsBuilder).build)*)

    /**
     * @param requestFileExtensions One or more `requestFileExtension` blocks as defined below.
     * @return builder
     */
    inline def requestFileExtensions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsRequestFileExtensionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsRequestFileExtensionArgs.builder
      builder.requestFileExtensions(args.map(_(argsBuilder).build)*)

    /**
     * @param requestFilenames One or more `requestFilename` blocks as defined below.
     * @return builder
     */
    inline def requestFilenames(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsRequestFilenameArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsRequestFilenameArgs.builder
      builder.requestFilenames(args.map(_(argsBuilder).build)*)

    /**
     * @param requestHeaders One or more `requestHeader` blocks as defined below.
     * @return builder
     */
    inline def requestHeaders(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsRequestHeaderArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsRequestHeaderArgs.builder
      builder.requestHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param requestMethods One or more `requestMethod` blocks as defined below.
     * @return builder
     */
    inline def requestMethods(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsRequestMethodArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsRequestMethodArgs.builder
      builder.requestMethods(args.map(_(argsBuilder).build)*)

    /**
     * @param requestPaths One or more `requestPath` blocks as defined below.
     * @return builder
     */
    inline def requestPaths(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsRequestPathArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsRequestPathArgs.builder
      builder.requestPaths(args.map(_(argsBuilder).build)*)

    /**
     * @param requestSchemes One or more `requestScheme` blocks as defined below.
     * @return builder
     */
    inline def requestSchemes(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsRequestSchemeArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsRequestSchemeArgs.builder
      builder.requestSchemes(args.map(_(argsBuilder).build)*)

    /**
     * @param requestUrls One or more `requestUrl` blocks as defined below.
     * @return builder
     */
    inline def requestUrls(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsRequestUrlArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsRequestUrlArgs.builder
      builder.requestUrls(args.map(_(argsBuilder).build)*)

    /**
     * @param serverPorts One or more `serverPort` blocks as defined below.
     * @return builder
     */
    inline def serverPorts(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsServerPortArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsServerPortArgs.builder
      builder.serverPorts(args.map(_(argsBuilder).build)*)

    /**
     * @param socketAddresses One or more `socketAddress` blocks as defined below.
     * @return builder
     */
    inline def socketAddresses(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsSocketAddressArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsSocketAddressArgs.builder
      builder.socketAddresses(args.map(_(argsBuilder).build)*)

    /**
     * @param sslProtocols One or more `sslProtocol` blocks as defined below.
     * @return builder
     */
    inline def sslProtocols(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsSslProtocolArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleConditionsSslProtocolArgs.builder
      builder.sslProtocols(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetState.Builder)
    /**
     * @param rules One or more `rule` blocks as defined below. The configured blocks represent the complete set of rules managed for this Front Door Batch Rule Set. The final rule ordering is determined by each block&#39;s `order` value. A maximum of `100` `rule` blocks may be defined.
     * 
     * &gt; **Note:** The `rule` blocks must be declared in ascending `order`, gaps between different rules are allowed. To insert, remove, or move a rule, update the full `rule` collection in the same ascending order that you want Terraform to store.
     * 
     * &gt; **Note:** Each `rule` block must use a unique `name` value and a unique `order` value.
     * 
     * &gt; **Note:** Each `rule` that enables caching (using the `route_configuration_override.caching` block with a `behaviour` other than `Disabled`) consumes two of the `100` available rule slots. The plan fails if the effective number of rule slots exceeds this service-side quota.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetState.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorBatchRuleSetRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorCustomDomainState.Builder)
    /**
     * @param tls A `tls` block as defined below.
     * @return builder
     */
    inline def tls(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorCustomDomainTlsArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorCustomDomainState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorCustomDomainTlsArgs.builder
      builder.tls(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorCustomDomainTlsArgs.Builder)
    /**
     * @param cipherSuite A `cipherSuite` block as defined below.
     * @return builder
     */
    inline def cipherSuite(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorCustomDomainTlsCipherSuiteArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorCustomDomainTlsArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorCustomDomainTlsCipherSuiteArgs.builder
      builder.cipherSuite(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorCustomDomainTlsCipherSuiteArgs.Builder)
    /**
     * @param customCiphers A `customCiphers` block as defined below.
     * 
     * &gt; **Note:** The `customCiphers` block is required when `type` is set to `Customized` and must not be specified otherwise.
     * @return builder
     */
    inline def customCiphers(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorCustomDomainTlsCipherSuiteCustomCiphersArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorCustomDomainTlsCipherSuiteArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorCustomDomainTlsCipherSuiteCustomCiphersArgs.builder
      builder.customCiphers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyCustomRuleArgs.Builder)
    /**
     * @param matchConditions One or more `matchCondition` block defined below. Can support up to `10` `matchCondition` blocks.
     * @return builder
     */
    inline def matchConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyCustomRuleMatchConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyCustomRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyCustomRuleMatchConditionArgs.builder
      builder.matchConditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyLogScrubbingArgs.Builder)
    /**
     * @param scrubbingRules One or more `scrubbingRule` blocks as defined below.
     * 
     * &gt; **Note:** For more information on masking sensitive data in Azure Front Door please see the [product documentation](https://learn.microsoft.com/azure/web-application-firewall/afds/waf-sensitive-data-protection-configure-frontdoor).
     * @return builder
     */
    inline def scrubbingRules(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyLogScrubbingScrubbingRuleArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyLogScrubbingArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyLogScrubbingScrubbingRuleArgs.builder
      builder.scrubbingRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleArgs.Builder)
    /**
     * @param exclusions One or more `exclusion` blocks as defined below.
     * @return builder
     */
    inline def exclusions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleExclusionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

    /**
     * @param overrides One or more `override` blocks as defined below.
     * @return builder
     */
    inline def overrides(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideArgs.builder
      builder.overrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideArgs.Builder)
    /**
     * @param exclusions One or more `exclusion` blocks as defined below.
     * @return builder
     */
    inline def exclusions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideExclusionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

    /**
     * @param rules One or more `rule` blocks as defined below. If none are specified, all of the rules in the group will be disabled.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideRuleArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideRuleArgs.Builder)
    /**
     * @param exclusions One or more `exclusion` blocks as defined below.
     * @return builder
     */
    inline def exclusions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideRuleExclusionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleOverrideRuleExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyState.Builder)
    /**
     * @param customRules One or more `customRule` blocks as defined below.
     * @return builder
     */
    inline def customRules(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyCustomRuleArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyState.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyCustomRuleArgs.builder
      builder.customRules(args.map(_(argsBuilder).build)*)

    /**
     * @param logScrubbing A `logScrubbing` block as defined below.
     * 
     * &gt; **Note:** Setting the`logScrubbing` block is currently in **PREVIEW**. Please see the [Supplemental Terms of Use for Microsoft Azure Previews](https://azure.microsoft.com/support/legal/preview-supplemental-terms/) for legal terms that apply to Azure features that are in beta, preview, or otherwise not yet released into general availability.
     * @return builder
     */
    inline def logScrubbing(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyLogScrubbingArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyLogScrubbingArgs.builder
      builder.logScrubbing(args(argsBuilder).build)

    /**
     * @param managedRules One or more `managedRule` blocks as defined below.
     * @return builder
     */
    inline def managedRules(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyState.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyManagedRuleArgs.builder
      builder.managedRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupState.Builder)
    /**
     * @param healthProbe A `healthProbe` block as defined below.
     * @return builder
     */
    inline def healthProbe(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupHealthProbeArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupHealthProbeArgs.builder
      builder.healthProbe(args(argsBuilder).build)

    /**
     * @param loadBalancing A `loadBalancing` block as defined below.
     * @return builder
     */
    inline def loadBalancing(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupLoadBalancingArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupLoadBalancingArgs.builder
      builder.loadBalancing(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorOriginState.Builder)
    /**
     * @param privateLink A `privateLink` block as defined below.
     * 
     * &gt; **Note:** Private Link requires that the Front Door Profile this Origin is hosted within is using the SKU `Premium_AzureFrontDoor` and that the `certificateNameCheckEnabled` field is set to `true`.
     * @return builder
     */
    inline def privateLink(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorOriginPrivateLinkArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorOriginState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorOriginPrivateLinkArgs.builder
      builder.privateLink(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorProfileState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorProfileIdentityArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorProfileState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorProfileIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param logScrubbingRules One or more `logScrubbingRule` blocks as defined below.
     * 
     * &gt; **Note:** When no `logScrubbingRule` blocks are defined, log scrubbing will be automatically `disabled`. When one or more `logScrubbingRule` blocks are present, log scrubbing will be `enabled`.
     * @return builder
     */
    inline def logScrubbingRules(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorProfileLogScrubbingRuleArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorProfileState.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorProfileLogScrubbingRuleArgs.builder
      builder.logScrubbingRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorRouteState.Builder)
    /**
     * @param cache A `cache` block as defined below.
     * 
     * &gt; **Note:** To disable caching, do not provide the `cache` block in the configuration file.
     * @return builder
     */
    inline def cache(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRouteCacheArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorRouteState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRouteCacheArgs.builder
      builder.cache(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsArgs.Builder)
    /**
     * @param requestHeaderActions A `requestHeaderAction` block as defined below.
     * @return builder
     */
    inline def requestHeaderActions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsRequestHeaderActionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsRequestHeaderActionArgs.builder
      builder.requestHeaderActions(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeaderActions A `responseHeaderAction` block as defined below.
     * @return builder
     */
    inline def responseHeaderActions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsResponseHeaderActionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsResponseHeaderActionArgs.builder
      builder.responseHeaderActions(args.map(_(argsBuilder).build)*)

    /**
     * @param routeConfigurationOverrideAction A `routeConfigurationOverrideAction` block as defined below.
     * @return builder
     */
    inline def routeConfigurationOverrideAction(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsRouteConfigurationOverrideActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsRouteConfigurationOverrideActionArgs.builder
      builder.routeConfigurationOverrideAction(args(argsBuilder).build)

    /**
     * @param urlRedirectAction A `urlRedirectAction` block as defined below. You may **not** have a `urlRedirectAction` **and** a `urlRewriteAction` defined in the same `actions` block.
     * @return builder
     */
    inline def urlRedirectAction(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsUrlRedirectActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsUrlRedirectActionArgs.builder
      builder.urlRedirectAction(args(argsBuilder).build)

    /**
     * @param urlRewriteAction A `urlRewriteAction` block as defined below. You may **not** have a `urlRewriteAction` **and** a `urlRedirectAction` defined in the same `actions` block.
     * @return builder
     */
    inline def urlRewriteAction(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsUrlRewriteActionArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsUrlRewriteActionArgs.builder
      builder.urlRewriteAction(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder)
    /**
     * @param clientPortConditions A `clientPortCondition` block as defined below.
     * @return builder
     */
    inline def clientPortConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsClientPortConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsClientPortConditionArgs.builder
      builder.clientPortConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param cookiesConditions A `cookiesCondition` block as defined below.
     * @return builder
     */
    inline def cookiesConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsCookiesConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsCookiesConditionArgs.builder
      builder.cookiesConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param hostNameConditions A `hostNameCondition` block as defined below.
     * @return builder
     */
    inline def hostNameConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsHostNameConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsHostNameConditionArgs.builder
      builder.hostNameConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param httpVersionConditions A `httpVersionCondition` block as defined below.
     * @return builder
     */
    inline def httpVersionConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsHttpVersionConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsHttpVersionConditionArgs.builder
      builder.httpVersionConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param isDeviceConditions A `isDeviceCondition` block as defined below.
     * @return builder
     */
    inline def isDeviceConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsIsDeviceConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsIsDeviceConditionArgs.builder
      builder.isDeviceConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param postArgsConditions A `postArgsCondition` block as defined below.
     * @return builder
     */
    inline def postArgsConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsPostArgsConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsPostArgsConditionArgs.builder
      builder.postArgsConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param queryStringConditions A `queryStringCondition` block as defined below.
     * @return builder
     */
    inline def queryStringConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsQueryStringConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsQueryStringConditionArgs.builder
      builder.queryStringConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param remoteAddressConditions A `remoteAddressCondition` block as defined below.
     * @return builder
     */
    inline def remoteAddressConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRemoteAddressConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRemoteAddressConditionArgs.builder
      builder.remoteAddressConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param requestBodyConditions A `requestBodyCondition` block as defined below.
     * @return builder
     */
    inline def requestBodyConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRequestBodyConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRequestBodyConditionArgs.builder
      builder.requestBodyConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param requestHeaderConditions A `requestHeaderCondition` block as defined below.
     * @return builder
     */
    inline def requestHeaderConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRequestHeaderConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRequestHeaderConditionArgs.builder
      builder.requestHeaderConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param requestMethodConditions A `requestMethodCondition` block as defined below.
     * @return builder
     */
    inline def requestMethodConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRequestMethodConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRequestMethodConditionArgs.builder
      builder.requestMethodConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param requestSchemeConditions A `requestSchemeCondition` block as defined below.
     * @return builder
     */
    inline def requestSchemeConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRequestSchemeConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRequestSchemeConditionArgs.builder
      builder.requestSchemeConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param requestUriConditions A `requestUriCondition` block as defined below.
     * @return builder
     */
    inline def requestUriConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRequestUriConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsRequestUriConditionArgs.builder
      builder.requestUriConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param serverPortConditions A `serverPortCondition` block as defined below.
     * @return builder
     */
    inline def serverPortConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsServerPortConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsServerPortConditionArgs.builder
      builder.serverPortConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param socketAddressConditions A `socketAddressCondition` block as defined below.
     * @return builder
     */
    inline def socketAddressConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsSocketAddressConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsSocketAddressConditionArgs.builder
      builder.socketAddressConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param sslProtocolConditions A `sslProtocolCondition` block as defined below.
     * @return builder
     */
    inline def sslProtocolConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsSslProtocolConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsSslProtocolConditionArgs.builder
      builder.sslProtocolConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param urlFileExtensionConditions A `urlFileExtensionCondition` block as defined below.
     * @return builder
     */
    inline def urlFileExtensionConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsUrlFileExtensionConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsUrlFileExtensionConditionArgs.builder
      builder.urlFileExtensionConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param urlFilenameConditions A `urlFilenameCondition` block as defined below.
     * @return builder
     */
    inline def urlFilenameConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsUrlFilenameConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsUrlFilenameConditionArgs.builder
      builder.urlFilenameConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param urlPathConditions A `urlPathCondition` block as defined below.
     * @return builder
     */
    inline def urlPathConditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsUrlPathConditionArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsUrlPathConditionArgs.builder
      builder.urlPathConditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorRuleState.Builder)
    /**
     * @param actions An `actions` block as defined below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsArgs.builder
      builder.actions(args(argsBuilder).build)

    /**
     * @param conditions A `conditions` block as defined below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorRuleState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorRuleConditionsArgs.builder
      builder.conditions(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorSecretSecretArgs.Builder)
    /**
     * @param customerCertificates A `customerCertificate` block as defined below. Changing this forces a new Front Door Secret to be created.
     * @return builder
     */
    inline def customerCertificates(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorSecretSecretCustomerCertificateArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorSecretSecretArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorSecretSecretCustomerCertificateArgs.builder
      builder.customerCertificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorSecretState.Builder)
    /**
     * @param secret A `secret` block as defined below. Changing this forces a new Front Door Secret to be created.
     * @return builder
     */
    inline def secret(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorSecretSecretArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorSecretState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorSecretSecretArgs.builder
      builder.secret(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesArgs.Builder)
    /**
     * @param firewall A `firewall` block as defined below.
     * @return builder
     */
    inline def firewall(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallArgs.builder
      builder.firewall(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallArgs.Builder)
    /**
     * @param association An `association` block as defined below.
     * @return builder
     */
    inline def association(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallAssociationArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallArgs.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallAssociationArgs.builder
      builder.association(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallAssociationArgs.Builder)
    /**
     * @param domains One or more `domain` blocks as defined below.
     * 
     * &gt; **Note:** The number of `domain` blocks that may be included in the configuration varies depending on the `skuName` field of the linked Front Door Profile. The `Standard_AzureFrontDoor` sku may contain up to 100 `domain` blocks and a `Premium_AzureFrontDoor` sku may contain up to 500 `domain` blocks.
     * @return builder
     */
    inline def domains(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallAssociationDomainArgs.Builder]*):
        com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallAssociationArgs.Builder =
      def argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallAssociationDomainArgs.builder
      builder.domains(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicyState.Builder)
    /**
     * @param securityPolicies A `securityPolicies` block as defined below.
     * @return builder
     */
    inline def securityPolicies(args: Endofunction[com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesArgs.Builder]):
        com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesArgs.builder
      builder.securityPolicies(args(argsBuilder).build)
