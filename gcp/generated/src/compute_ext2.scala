package jp.ukiba.ko_pulumi
package gcp

object compute_ext2:
  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleArgs.Builder)
    /**
     * @param routeAction In response to a matching path, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * @return builder
     */
    def routeAction(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionArgs.builder
      builder.routeAction(args(argsBuilder).build)

    /**
     * @param urlRedirect When a path pattern is matched, the request is redirected to a URL specified
     * by urlRedirect. If urlRedirect is specified, service or routeAction must not
     * be set.
     * Structure is documented below.
     * @return builder
     */
    def urlRedirect(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleUrlRedirectArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleUrlRedirectArgs.builder
      builder.urlRedirect(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionArgs.Builder)
    /**
     * @param corsPolicy The specification for allowing client side cross-origin requests. Please see W3C
     * Recommendation for Cross Origin Resource Sharing
     * Structure is documented below.
     * @return builder
     */
    def corsPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyArgs.builder
      builder.corsPolicy(args(argsBuilder).build)

    /**
     * @param faultInjectionPolicy The specification for fault injection introduced into traffic to test the
     * resiliency of clients to backend service failure. As part of fault injection,
     * when clients send requests to a backend service, delays can be introduced by
     * Loadbalancer on a percentage of requests before sending those request to the
     * backend service. Similarly requests from clients can be aborted by the
     * Loadbalancer for a percentage of requests. timeout and retryPolicy will be
     * ignored by clients that are configured with a fault_injection_policy.
     * Structure is documented below.
     * @return builder
     */
    def faultInjectionPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs.builder
      builder.faultInjectionPolicy(args(argsBuilder).build)

    /**
     * @param requestMirrorPolicy Specifies the policy on how requests intended for the route&#39;s backends are
     * shadowed to a separate mirrored backend service. Loadbalancer does not wait for
     * responses from the shadow service. Prior to sending traffic to the shadow
     * service, the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * @return builder
     */
    def requestMirrorPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs.builder
      builder.requestMirrorPolicy(args(argsBuilder).build)

    /**
     * @param retryPolicy Specifies the retry policy associated with this route.
     * Structure is documented below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param timeout Specifies the timeout for the selected route. Timeout is computed from the time
     * the request is has been fully processed (i.e. end-of-stream) up until the
     * response has been completely processed. Timeout includes all retries. If not
     * specified, the default value is 15 seconds.
     * Structure is documented below.
     * @return builder
     */
    def timeout(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionTimeoutArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionTimeoutArgs.builder
      builder.timeout(args(argsBuilder).build)

    /**
     * @param urlRewrite The spec to modify the URL of the request, prior to forwarding the request to
     * the matched service
     * Structure is documented below.
     * @return builder
     */
    def urlRewrite(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteArgs.builder
      builder.urlRewrite(args(argsBuilder).build)

    /**
     * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match
     * occurs. The weights determine the fraction of traffic that flows to their
     * corresponding backend service. If all traffic needs to go to a single backend
     * service, there must be one  weightedBackendService with weight set to a non 0
     * number. Once a backendService is identified and before forwarding the request to
     * the backend service, advanced routing actions like Url rewrites and header
     * transformations are applied depending on additional settings specified in this
     * HttpRouteAction.
     * Structure is documented below.
     * @return builder
     */
    def weightedBackendServices(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs.builder
      builder.weightedBackendServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs.Builder)
    /**
     * @param abort The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * @return builder
     */
    def abort(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs.builder
      builder.abort(args(argsBuilder).build)

    /**
     * @param delay The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * @return builder
     */
    def delay(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs.builder
      builder.delay(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs.Builder)
    /**
     * @param fixedDelay Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * @return builder
     */
    def fixedDelay(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs.builder
      builder.fixedDelay(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs.Builder)
    /**
     * @param perTryTimeout Specifies a non-zero timeout per retry attempt.
     * If not specified, will use the timeout set in HttpRouteAction. If timeout in HttpRouteAction is not set,
     * will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * @return builder
     */
    def perTryTimeout(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyPerTryTimeoutArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyPerTryTimeoutArgs.builder
      builder.perTryTimeout(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs.Builder)
    /**
     * @param headerAction Specifies changes to request and response headers that need to take effect for the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL.
     * Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * Structure is documented below.
     * @return builder
     */
    def headerAction(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs.Builder)
    /**
     * @param requestHeadersToAdds Headers to add to a matching request before forwarding the request to the backendService.
     * Structure is documented below.
     * @return builder
     */
    def requestHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs.builder
      builder.requestHeadersToAdds(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeadersToAdds Headers to add the response before sending the response back to the client.
     * Structure is documented below.
     * @return builder
     */
    def responseHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs.builder
      builder.responseHeadersToAdds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleArgs.Builder)
    /**
     * @param headerAction Specifies changes to request and response headers that need to take effect for
     * the selected backendService. The headerAction specified here are applied before
     * the matching pathMatchers[].headerAction and after pathMatchers[].routeRules[].r
     * outeAction.weightedBackendService.backendServiceWeightAction[].headerAction
     * Structure is documented below.
     * @return builder
     */
    def headerAction(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleHeaderActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

    /**
     * @param matchRules The rules for determining a match.
     * Structure is documented below.
     * @return builder
     */
    def matchRules(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleArgs.builder
      builder.matchRules(args.map(_(argsBuilder).build)*)

    /**
     * @param routeAction In response to a matching matchRule, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If  routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * @return builder
     */
    def routeAction(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionArgs.builder
      builder.routeAction(args(argsBuilder).build)

    /**
     * @param urlRedirect When this rule is matched, the request is redirected to a URL specified by
     * urlRedirect. If urlRedirect is specified, service or routeAction must not be
     * set.
     * Structure is documented below.
     * @return builder
     */
    def urlRedirect(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleUrlRedirectArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleUrlRedirectArgs.builder
      builder.urlRedirect(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleHeaderActionArgs.Builder)
    /**
     * @param requestHeadersToAdds Headers to add to a matching request before forwarding the request to the backendService.
     * Structure is documented below.
     * @return builder
     */
    def requestHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleHeaderActionRequestHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleHeaderActionRequestHeadersToAddArgs.builder
      builder.requestHeadersToAdds(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeadersToAdds Headers to add the response before sending the response back to the client.
     * Structure is documented below.
     * @return builder
     */
    def responseHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleHeaderActionResponseHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleHeaderActionResponseHeadersToAddArgs.builder
      builder.responseHeadersToAdds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleArgs.Builder)
    /**
     * @param headerMatches Specifies a list of header match criteria, all of which must match corresponding
     * headers in the request.
     * Structure is documented below.
     * @return builder
     */
    def headerMatches(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs.builder
      builder.headerMatches(args.map(_(argsBuilder).build)*)

    /**
     * @param metadataFilters Opaque filter criteria used by Loadbalancer to restrict routing configuration to
     * a limited set xDS compliant clients. In their xDS requests to Loadbalancer, xDS
     * clients present node metadata. If a match takes place, the relevant routing
     * configuration is made available to those proxies. For each metadataFilter in
     * this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the
     * filterLabels must match the corresponding label provided in the metadata. If its
     * filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match
     * with corresponding labels in the provided metadata. metadataFilters specified
     * here can be overrides those specified in ForwardingRule that refers to this
     * UrlMap. metadataFilters only applies to Loadbalancers that have their
     * loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * @return builder
     */
    def metadataFilters(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs.builder
      builder.metadataFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParameterMatches Specifies a list of query parameter match criteria, all of which must match
     * corresponding query parameters in the request.
     * Structure is documented below.
     * @return builder
     */
    def queryParameterMatches(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs.builder
      builder.queryParameterMatches(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs.Builder)
    /**
     * @param rangeMatch The header value must be an integer and its value must be in the range specified
     * in rangeMatch. If the header does not contain an integer, number or is empty,
     * the match fails. For example for a range [-5, 0]
     * * -3 will match
     * * 0 will not match
     * * 0.25 will not match
     * * -3someString will not match.
     *   Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
     *   rangeMatch must be set.
     *   Structure is documented below.
     * @return builder
     */
    def rangeMatch(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchArgs.builder
      builder.rangeMatch(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs.Builder)
    /**
     * @param filterLabels The list of label value pairs that must match labels in the provided metadata
     * based on filterMatchCriteria  This list must not be empty and can have at the
     * most 64 entries.
     * Structure is documented below.
     * @return builder
     */
    def filterLabels(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs.builder
      builder.filterLabels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionArgs.Builder)
    /**
     * @param corsPolicy The specification for allowing client side cross-origin requests. Please see W3C
     * Recommendation for Cross Origin Resource Sharing
     * Structure is documented below.
     * @return builder
     */
    def corsPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs.builder
      builder.corsPolicy(args(argsBuilder).build)

    /**
     * @param faultInjectionPolicy The specification for fault injection introduced into traffic to test the
     * resiliency of clients to backend service failure. As part of fault injection,
     * when clients send requests to a backend service, delays can be introduced by
     * Loadbalancer on a percentage of requests before sending those request to the
     * backend service. Similarly requests from clients can be aborted by the
     * Loadbalancer for a percentage of requests. timeout and retryPolicy will be
     * ignored by clients that are configured with a fault_injection_policy.
     * Structure is documented below.
     * @return builder
     */
    def faultInjectionPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs.builder
      builder.faultInjectionPolicy(args(argsBuilder).build)

    /**
     * @param requestMirrorPolicy Specifies the policy on how requests intended for the route&#39;s backends are
     * shadowed to a separate mirrored backend service. Loadbalancer does not wait for
     * responses from the shadow service. Prior to sending traffic to the shadow
     * service, the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * @return builder
     */
    def requestMirrorPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs.builder
      builder.requestMirrorPolicy(args(argsBuilder).build)

    /**
     * @param retryPolicy Specifies the retry policy associated with this route.
     * Structure is documented below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param timeout Specifies the timeout for the selected route. Timeout is computed from the time
     * the request is has been fully processed (i.e. end-of-stream) up until the
     * response has been completely processed. Timeout includes all retries. If not
     * specified, the default value is 15 seconds.
     * Structure is documented below.
     * @return builder
     */
    def timeout(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionTimeoutArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionTimeoutArgs.builder
      builder.timeout(args(argsBuilder).build)

    /**
     * @param urlRewrite The spec to modify the URL of the request, prior to forwarding the request to
     * the matched service
     * Structure is documented below.
     * @return builder
     */
    def urlRewrite(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteArgs.builder
      builder.urlRewrite(args(argsBuilder).build)

    /**
     * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match
     * occurs. The weights determine the fraction of traffic that flows to their
     * corresponding backend service. If all traffic needs to go to a single backend
     * service, there must be one  weightedBackendService with weight set to a non 0
     * number. Once a backendService is identified and before forwarding the request to
     * the backend service, advanced routing actions like Url rewrites and header
     * transformations are applied depending on additional settings specified in this
     * HttpRouteAction.
     * Structure is documented below.
     * @return builder
     */
    def weightedBackendServices(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs.builder
      builder.weightedBackendServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs.Builder)
    /**
     * @param abort The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * @return builder
     */
    def abort(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs.builder
      builder.abort(args(argsBuilder).build)

    /**
     * @param delay The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * @return builder
     */
    def delay(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs.builder
      builder.delay(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs.Builder)
    /**
     * @param fixedDelay Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * @return builder
     */
    def fixedDelay(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs.builder
      builder.fixedDelay(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyArgs.Builder)
    /**
     * @param perTryTimeout Specifies a non-zero timeout per retry attempt.
     * If not specified, will use the timeout set in HttpRouteAction. If timeout in HttpRouteAction is not set,
     * will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * @return builder
     */
    def perTryTimeout(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeoutArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeoutArgs.builder
      builder.perTryTimeout(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteArgs.Builder)
    /**
     * @param regexRewrite The regex rewrite to be applied to the URL. Only one of
     * pathPrefixRewrite, pathTemplateRewrite, or regexRewrite may be
     * specified.
     * Structure is documented below.
     * @return builder
     */
    def regexRewrite(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteRegexRewriteArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteRegexRewriteArgs.builder
      builder.regexRewrite(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs.Builder)
    /**
     * @param headerAction Specifies changes to request and response headers that need to take effect for the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL.
     * Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * Structure is documented below.
     * @return builder
     */
    def headerAction(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs.Builder)
    /**
     * @param requestHeadersToAdds Headers to add to a matching request before forwarding the request to the backendService.
     * Structure is documented below.
     * @return builder
     */
    def requestHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs.builder
      builder.requestHeadersToAdds(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeadersToAdds Headers to add the response before sending the response back to the client.
     * Structure is documented below.
     * @return builder
     */
    def responseHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs.builder
      builder.responseHeadersToAdds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapState.Builder)
    /**
     * @param defaultRouteAction defaultRouteAction takes effect when none of the hostRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices.
     * Only one of defaultRouteAction or defaultUrlRedirect must be set.
     * URL maps for Classic external HTTP(S) load balancers only support the urlRewrite action within defaultRouteAction.
     * defaultRouteAction has no effect when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * Structure is documented below.
     * @return builder
     */
    def defaultRouteAction(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionArgs.builder
      builder.defaultRouteAction(args(argsBuilder).build)

    /**
     * @param defaultUrlRedirect When none of the specified hostRules match, the request is redirected to a URL specified
     * by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or
     * defaultRouteAction must not be set.
     * Structure is documented below.
     * @return builder
     */
    def defaultUrlRedirect(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultUrlRedirectArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultUrlRedirectArgs.builder
      builder.defaultUrlRedirect(args(argsBuilder).build)

    /**
     * @param headerAction Specifies changes to request and response headers that need to take effect for the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL.
     * Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * Structure is documented below.
     * @return builder
     */
    def headerAction(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapHeaderActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

    /**
     * @param hostRules The list of HostRules to use against the URL.
     * Structure is documented below.
     * @return builder
     */
    def hostRules(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapHostRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapHostRuleArgs.builder
      builder.hostRules(args.map(_(argsBuilder).build)*)

    /**
     * @param pathMatchers The list of named PathMatchers to use against the URL.
     * Structure is documented below.
     * @return builder
     */
    def pathMatchers(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherArgs.builder
      builder.pathMatchers(args.map(_(argsBuilder).build)*)

    /**
     * @param tests The list of expected URL mappings. Requests to update this UrlMap will
     * succeed only if all of the test cases pass.
     * Structure is documented below.
     * @return builder
     */
    def tests(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapTestArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapTestArgs.builder
      builder.tests(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.ReservationResourceStatusArgs.Builder)
    /**
     * @param healthInfos (Output)
     * Health information for the reservation.
     * Structure is documented below.
     * @return builder
     */
    def healthInfos(args: Endofunction[com.pulumi.gcp.compute.inputs.ReservationResourceStatusHealthInfoArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ReservationResourceStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ReservationResourceStatusHealthInfoArgs.builder
      builder.healthInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param reservationMaintenances (Output)
     * Maintenance information for this reservation
     * Structure is documented below.
     * @return builder
     */
    def reservationMaintenances(args: Endofunction[com.pulumi.gcp.compute.inputs.ReservationResourceStatusReservationMaintenanceArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ReservationResourceStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ReservationResourceStatusReservationMaintenanceArgs.builder
      builder.reservationMaintenances(args.map(_(argsBuilder).build)*)

    /**
     * @param specificSkuAllocations (Output)
     * Allocation Properties of this reservation.
     * Structure is documented below.
     * @return builder
     */
    def specificSkuAllocations(args: Endofunction[com.pulumi.gcp.compute.inputs.ReservationResourceStatusSpecificSkuAllocationArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ReservationResourceStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ReservationResourceStatusSpecificSkuAllocationArgs.builder
      builder.specificSkuAllocations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.ReservationResourceStatusReservationMaintenanceArgs.Builder)
    /**
     * @param upcomingGroupMaintenances (Output)
     * Maintenance information on this group of VMs.
     * Structure is documented below.
     * @return builder
     */
    def upcomingGroupMaintenances(args: Endofunction[com.pulumi.gcp.compute.inputs.ReservationResourceStatusReservationMaintenanceUpcomingGroupMaintenanceArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ReservationResourceStatusReservationMaintenanceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ReservationResourceStatusReservationMaintenanceUpcomingGroupMaintenanceArgs.builder
      builder.upcomingGroupMaintenances(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.ReservationShareSettingsArgs.Builder)
    /**
     * @param projectMaps A map of project number and project config. This is only valid when shareType&#39;s value is SPECIFIC_PROJECTS.
     * Structure is documented below.
     * @return builder
     */
    def projectMaps(args: Endofunction[com.pulumi.gcp.compute.inputs.ReservationShareSettingsProjectMapArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ReservationShareSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ReservationShareSettingsProjectMapArgs.builder
      builder.projectMaps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.ReservationSpecificReservationArgs.Builder)
    /**
     * @param instanceProperties The instance properties for the reservation.
     * Structure is documented below.
     * @return builder
     */
    def instanceProperties(args: Endofunction[com.pulumi.gcp.compute.inputs.ReservationSpecificReservationInstancePropertiesArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ReservationSpecificReservationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ReservationSpecificReservationInstancePropertiesArgs.builder
      builder.instanceProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.ReservationSpecificReservationInstancePropertiesArgs.Builder)
    /**
     * @param guestAccelerators Guest accelerator type and count.
     * Structure is documented below.
     * @return builder
     */
    def guestAccelerators(args: Endofunction[com.pulumi.gcp.compute.inputs.ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ReservationSpecificReservationInstancePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs.builder
      builder.guestAccelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param localSsds The amount of local ssd to reserve with each instance. This
     * reserves disks of type `local-ssd`.
     * Structure is documented below.
     * @return builder
     */
    def localSsds(args: Endofunction[com.pulumi.gcp.compute.inputs.ReservationSpecificReservationInstancePropertiesLocalSsdArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ReservationSpecificReservationInstancePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ReservationSpecificReservationInstancePropertiesLocalSsdArgs.builder
      builder.localSsds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.ReservationState.Builder)
    /**
     * @param deleteAfterDuration Duration after which the reservation will be auto-deleted by Compute Engine. Cannot be used with delete_at_time.
     * Structure is documented below.
     * @return builder
     */
    def deleteAfterDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.ReservationDeleteAfterDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ReservationState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ReservationDeleteAfterDurationArgs.builder
      builder.deleteAfterDuration(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    def params(args: Endofunction[com.pulumi.gcp.compute.inputs.ReservationParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ReservationState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ReservationParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param reservationSharingPolicy Sharing policy for reservations with Google Cloud managed services.
     * Structure is documented below.
     * @return builder
     */
    def reservationSharingPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.ReservationReservationSharingPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ReservationState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ReservationReservationSharingPolicyArgs.builder
      builder.reservationSharingPolicy(args(argsBuilder).build)

    /**
     * @param resourceStatuses Status information for Reservation resource.
     * Structure is documented below.
     * @return builder
     */
    def resourceStatuses(args: Endofunction[com.pulumi.gcp.compute.inputs.ReservationResourceStatusArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ReservationState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ReservationResourceStatusArgs.builder
      builder.resourceStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param shareSettings The share setting for reservations.
     * Structure is documented below.
     * @return builder
     */
    def shareSettings(args: Endofunction[com.pulumi.gcp.compute.inputs.ReservationShareSettingsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ReservationState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ReservationShareSettingsArgs.builder
      builder.shareSettings(args(argsBuilder).build)

    /**
     * @param specificReservation Reservation for instances with specific machine shapes.
     * Structure is documented below.
     * @return builder
     */
    def specificReservation(args: Endofunction[com.pulumi.gcp.compute.inputs.ReservationSpecificReservationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ReservationState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ReservationSpecificReservationArgs.builder
      builder.specificReservation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.ResizeRequestState.Builder)
    /**
     * @param requestedRunDuration Requested run duration for instances that will be created by this request. At the end of the run duration instance will be deleted.
     * Structure is documented below.
     * @return builder
     */
    def requestedRunDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.ResizeRequestRequestedRunDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ResizeRequestState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ResizeRequestRequestedRunDurationArgs.builder
      builder.requestedRunDuration(args(argsBuilder).build)

    /**
     * @param statuses Status of the request.
     * Structure is documented below.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.gcp.compute.inputs.ResizeRequestStatusArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ResizeRequestState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ResizeRequestStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.ResizeRequestStatusArgs.Builder)
    /**
     * @param errors (Output)
     * Fatal errors encountered during the queueing or provisioning phases of the ResizeRequest that caused the transition to the FAILED state. Contrary to the lastAttempt errors, this field is final and errors are never removed from here, as the ResizeRequest is not going to retry.
     * Structure is documented below.
     * @return builder
     */
    def errors(args: Endofunction[com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ResizeRequestStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

    /**
     * @param lastAttempts (Output)
     * Information about the last attempt to fulfill the request. The value is temporary since the ResizeRequest can retry, as long as it&#39;s still active and the last attempt value can either be cleared or replaced with a different error. Since ResizeRequest retries infrequently, the value may be stale and no longer show an active problem. The value is cleared when ResizeRequest transitions to the final state (becomes inactive). If the final state is FAILED the error describing it will be storred in the &#34;error&#34; field only.
     * Structure is documented below.
     * @return builder
     */
    def lastAttempts(args: Endofunction[com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ResizeRequestStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptArgs.builder
      builder.lastAttempts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorArgs.Builder)
    /**
     * @param errors (Output)
     * The array of errors encountered while processing this operation.
     * Structure is documented below.
     * @return builder
     */
    def errors(args: Endofunction[com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorArgs.Builder)
    /**
     * @param errorDetails (Output)
     * An array of messages that contain the error details. There is a set of defined message types to use for providing details.The syntax depends on the error code. For example, QuotaExceededInfo will have details when the error code is QUOTA_EXCEEDED.
     * Structure is documented below.
     * @return builder
     */
    def errorDetails(args: Endofunction[com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorErrorDetailArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorErrorDetailArgs.builder
      builder.errorDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorErrorDetailArgs.Builder)
    /**
     * @param errorInfos (Output)
     * A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    def errorInfos(args: Endofunction[com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorErrorDetailErrorInfoArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorErrorDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorErrorDetailErrorInfoArgs.builder
      builder.errorInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param helps (Output)
     * A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    def helps(args: Endofunction[com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorErrorDetailHelpArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorErrorDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorErrorDetailHelpArgs.builder
      builder.helps(args.map(_(argsBuilder).build)*)

    /**
     * @param localizedMessages (Output)
     * A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    def localizedMessages(args: Endofunction[com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorErrorDetailLocalizedMessageArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorErrorDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorErrorDetailLocalizedMessageArgs.builder
      builder.localizedMessages(args.map(_(argsBuilder).build)*)

    /**
     * @param quotaInfos (Output)
     * A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    def quotaInfos(args: Endofunction[com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorErrorDetailQuotaInfoArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorErrorDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorErrorDetailQuotaInfoArgs.builder
      builder.quotaInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorErrorDetailHelpArgs.Builder)
    /**
     * @param links (Output)
     * A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    def links(args: Endofunction[com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorErrorDetailHelpLinkArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorErrorDetailHelpArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ResizeRequestStatusErrorErrorErrorDetailHelpLinkArgs.builder
      builder.links(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptArgs.Builder)
    /**
     * @param errors (Output)
     * Fatal errors encountered during the queueing or provisioning phases of the ResizeRequest that caused the transition to the FAILED state. Contrary to the lastAttempt errors, this field is final and errors are never removed from here, as the ResizeRequest is not going to retry.
     * Structure is documented below.
     * @return builder
     */
    def errors(args: Endofunction[com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorArgs.Builder)
    /**
     * @param errors (Output)
     * The array of errors encountered while processing this operation.
     * Structure is documented below.
     * @return builder
     */
    def errors(args: Endofunction[com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorArgs.Builder)
    /**
     * @param errorDetails (Output)
     * An array of messages that contain the error details. There is a set of defined message types to use for providing details.The syntax depends on the error code. For example, QuotaExceededInfo will have details when the error code is QUOTA_EXCEEDED.
     * Structure is documented below.
     * @return builder
     */
    def errorDetails(args: Endofunction[com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailArgs.builder
      builder.errorDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailArgs.Builder)
    /**
     * @param errorInfos (Output)
     * A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    def errorInfos(args: Endofunction[com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailErrorInfoArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailErrorInfoArgs.builder
      builder.errorInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param helps (Output)
     * A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    def helps(args: Endofunction[com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpArgs.builder
      builder.helps(args.map(_(argsBuilder).build)*)

    /**
     * @param localizedMessages (Output)
     * A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    def localizedMessages(args: Endofunction[com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailLocalizedMessageArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailLocalizedMessageArgs.builder
      builder.localizedMessages(args.map(_(argsBuilder).build)*)

    /**
     * @param quotaInfos (Output)
     * A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    def quotaInfos(args: Endofunction[com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailQuotaInfoArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailQuotaInfoArgs.builder
      builder.quotaInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpArgs.Builder)
    /**
     * @param links (Output)
     * A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    def links(args: Endofunction[com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpLinkArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpLinkArgs.builder
      builder.links(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.ResourcePolicyInstanceSchedulePolicyArgs.Builder)
    /**
     * @param vmStartSchedule Specifies the schedule for starting instances.
     * Structure is documented below.
     * @return builder
     */
    def vmStartSchedule(args: Endofunction[com.pulumi.gcp.compute.inputs.ResourcePolicyInstanceSchedulePolicyVmStartScheduleArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ResourcePolicyInstanceSchedulePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ResourcePolicyInstanceSchedulePolicyVmStartScheduleArgs.builder
      builder.vmStartSchedule(args(argsBuilder).build)

    /**
     * @param vmStopSchedule Specifies the schedule for stopping instances.
     * Structure is documented below.
     * @return builder
     */
    def vmStopSchedule(args: Endofunction[com.pulumi.gcp.compute.inputs.ResourcePolicyInstanceSchedulePolicyVmStopScheduleArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ResourcePolicyInstanceSchedulePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ResourcePolicyInstanceSchedulePolicyVmStopScheduleArgs.builder
      builder.vmStopSchedule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyArgs.Builder)
    /**
     * @param retentionPolicy Retention policy applied to snapshots created by this resource policy.
     * Structure is documented below.
     * @return builder
     */
    def retentionPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

    /**
     * @param schedule Contains one of an `hourlySchedule`, `dailySchedule`, or `weeklySchedule`.
     * Structure is documented below.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    /**
     * @param snapshotProperties Properties with which the snapshots are created, such as labels.
     * Structure is documented below.
     * @return builder
     */
    def snapshotProperties(args: Endofunction[com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs.builder
      builder.snapshotProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleArgs.Builder)
    /**
     * @param dailySchedule The policy will execute every nth day at the specified time.
     * Structure is documented below.
     * @return builder
     */
    def dailySchedule(args: Endofunction[com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleArgs.builder
      builder.dailySchedule(args(argsBuilder).build)

    /**
     * @param hourlySchedule The policy will execute every nth hour starting at the specified time.
     * Structure is documented below.
     * @return builder
     */
    def hourlySchedule(args: Endofunction[com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleArgs.builder
      builder.hourlySchedule(args(argsBuilder).build)

    /**
     * @param weeklySchedule Allows specifying a snapshot time for each day of the week.
     * Structure is documented below.
     * @return builder
     */
    def weeklySchedule(args: Endofunction[com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs.builder
      builder.weeklySchedule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs.Builder)
    /**
     * @param dayOfWeeks May contain up to seven (one for each day of the week) snapshot times.
     * Structure is documented below.
     * @return builder
     */
    def dayOfWeeks(args: Endofunction[com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekArgs.builder
      builder.dayOfWeeks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.ResourcePolicyState.Builder)
    /**
     * @param diskConsistencyGroupPolicy Replication consistency group for asynchronous disk replication.
     * Structure is documented below.
     * @return builder
     */
    def diskConsistencyGroupPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.ResourcePolicyDiskConsistencyGroupPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ResourcePolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ResourcePolicyDiskConsistencyGroupPolicyArgs.builder
      builder.diskConsistencyGroupPolicy(args(argsBuilder).build)

    /**
     * @param groupPlacementPolicy Resource policy for instances used for placement configuration.
     * Structure is documented below.
     * @return builder
     */
    def groupPlacementPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.ResourcePolicyGroupPlacementPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ResourcePolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ResourcePolicyGroupPlacementPolicyArgs.builder
      builder.groupPlacementPolicy(args(argsBuilder).build)

    /**
     * @param instanceSchedulePolicy Resource policy for scheduling instance operations.
     * Structure is documented below.
     * @return builder
     */
    def instanceSchedulePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.ResourcePolicyInstanceSchedulePolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ResourcePolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ResourcePolicyInstanceSchedulePolicyArgs.builder
      builder.instanceSchedulePolicy(args(argsBuilder).build)

    /**
     * @param snapshotSchedulePolicy Policy for creating snapshots of persistent disks.
     * Structure is documented below.
     * @return builder
     */
    def snapshotSchedulePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ResourcePolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyArgs.builder
      builder.snapshotSchedulePolicy(args(argsBuilder).build)

    /**
     * @param workloadPolicy Represents the workload policy.
     * Structure is documented below.
     * @return builder
     */
    def workloadPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.ResourcePolicyWorkloadPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ResourcePolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ResourcePolicyWorkloadPolicyArgs.builder
      builder.workloadPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RolloutPlanState.Builder)
    /**
     * @param waves The waves included in this rollout plan.
     * Structure is documented below.
     * @return builder
     */
    def waves(args: Endofunction[com.pulumi.gcp.compute.inputs.RolloutPlanWaveArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RolloutPlanState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RolloutPlanWaveArgs.builder
      builder.waves(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RolloutPlanWaveArgs.Builder)
    /**
     * @param orchestrationOptions Options to control the pace of orchestration of a wave.
     * Structure is documented below.
     * @return builder
     */
    def orchestrationOptions(args: Endofunction[com.pulumi.gcp.compute.inputs.RolloutPlanWaveOrchestrationOptionsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RolloutPlanWaveArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RolloutPlanWaveOrchestrationOptionsArgs.builder
      builder.orchestrationOptions(args(argsBuilder).build)

    /**
     * @param selectors The selectors for this wave. There is a logical AND between each selector
     * defined in a wave, so a resource must satisfy the criteria of *all* the
     * specified selectors to be in scope for the wave.
     * Structure is documented below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.gcp.compute.inputs.RolloutPlanWaveSelectorArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RolloutPlanWaveArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RolloutPlanWaveSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

    /**
     * @param validation The validation to be performed before progressing to the next wave.
     * Structure is documented below.
     * @return builder
     */
    def validation(args: Endofunction[com.pulumi.gcp.compute.inputs.RolloutPlanWaveValidationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RolloutPlanWaveArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RolloutPlanWaveValidationArgs.builder
      builder.validation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RolloutPlanWaveOrchestrationOptionsArgs.Builder)
    /**
     * @param delays Delays, if any, to be added between batches of projects.
     * Structure is documented below.
     * @return builder
     */
    def delays(args: Endofunction[com.pulumi.gcp.compute.inputs.RolloutPlanWaveOrchestrationOptionsDelayArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RolloutPlanWaveOrchestrationOptionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RolloutPlanWaveOrchestrationOptionsDelayArgs.builder
      builder.delays(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RolloutPlanWaveSelectorArgs.Builder)
    /**
     * @param locationSelector Roll out to resources by location.
     * Structure is documented below.
     * @return builder
     */
    def locationSelector(args: Endofunction[com.pulumi.gcp.compute.inputs.RolloutPlanWaveSelectorLocationSelectorArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RolloutPlanWaveSelectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RolloutPlanWaveSelectorLocationSelectorArgs.builder
      builder.locationSelector(args(argsBuilder).build)

    /**
     * @param resourceHierarchySelector Roll out to resources by Cloud Resource Manager resource hierarchy nodes such as projects, folders, orgs.
     * Structure is documented below.
     * @return builder
     */
    def resourceHierarchySelector(args: Endofunction[com.pulumi.gcp.compute.inputs.RolloutPlanWaveSelectorResourceHierarchySelectorArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RolloutPlanWaveSelectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RolloutPlanWaveSelectorResourceHierarchySelectorArgs.builder
      builder.resourceHierarchySelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RolloutPlanWaveValidationArgs.Builder)
    /**
     * @param timeBasedValidationMetadata Metadata required if type = &#34;time&#34;.
     * Structure is documented below.
     * @return builder
     */
    def timeBasedValidationMetadata(args: Endofunction[com.pulumi.gcp.compute.inputs.RolloutPlanWaveValidationTimeBasedValidationMetadataArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RolloutPlanWaveValidationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RolloutPlanWaveValidationTimeBasedValidationMetadataArgs.builder
      builder.timeBasedValidationMetadata(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RouteState.Builder)
    /**
     * @param asPaths Structure is documented below.
     * @return builder
     */
    def asPaths(args: Endofunction[com.pulumi.gcp.compute.inputs.RouteAsPathArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RouteState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RouteAsPathArgs.builder
      builder.asPaths(args.map(_(argsBuilder).build)*)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    def params(args: Endofunction[com.pulumi.gcp.compute.inputs.RouteParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RouteState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RouteParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param warnings If potential misconfigurations are detected for this route, this field will be populated with warning messages.
     * Structure is documented below.
     * @return builder
     */
    def warnings(args: Endofunction[com.pulumi.gcp.compute.inputs.RouteWarningArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RouteState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RouteWarningArgs.builder
      builder.warnings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RouteWarningArgs.Builder)
    /**
     * @param datas (Output)
     * Metadata about this warning in key: value format. For example:
     * &#34;data&#34;:   {  &#34;key&#34;: &#34;scope&#34;,  &#34;value&#34;: &#34;zones/us-east1-d&#34;  }
     * Structure is [documented below.
     * @return builder
     */
    def datas(args: Endofunction[com.pulumi.gcp.compute.inputs.RouteWarningDataArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RouteWarningArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RouteWarningDataArgs.builder
      builder.datas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RouterBgpArgs.Builder)
    /**
     * @param advertisedIpRanges User-specified list of individual IP ranges to advertise in
     * custom mode. This field can only be populated if advertiseMode
     * is CUSTOM and is advertised to all peers of the router. These IP
     * ranges will be advertised in addition to any specified groups.
     * Leave this field blank to advertise no custom IP ranges.
     * Structure is documented below.
     * @return builder
     */
    def advertisedIpRanges(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterBgpAdvertisedIpRangeArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RouterBgpArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RouterBgpAdvertisedIpRangeArgs.builder
      builder.advertisedIpRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RouterNamedSetState.Builder)
    /**
     * @param elements CEL expressions that are comparable to constructs of this set&#39;s type.
     * Structure is documented below.
     * @return builder
     */
    def elements(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterNamedSetElementArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RouterNamedSetState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RouterNamedSetElementArgs.builder
      builder.elements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RouterNatRuleArgs.Builder)
    /**
     * @param action The action to be enforced for traffic that matches this rule.
     * Structure is documented below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterNatRuleActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RouterNatRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RouterNatRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RouterNatState.Builder)
    /**
     * @param logConfig Configuration for logging on NAT
     * Structure is documented below.
     * @return builder
     */
    def logConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterNatLogConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RouterNatState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RouterNatLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param nat64Subnetworks One or more subnetwork NAT configurations whose traffic should be translated by NAT64 Gateway.
     * Only used if `sourceSubnetworkIpRangesToNat64` is set to `LIST_OF_IPV6_SUBNETWORKS`
     * Structure is documented below.
     * @return builder
     */
    def nat64Subnetworks(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterNatNat64SubnetworkArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RouterNatState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RouterNatNat64SubnetworkArgs.builder
      builder.nat64Subnetworks(args.map(_(argsBuilder).build)*)

    /**
     * @param rules A list of rules associated with this NAT.
     * Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterNatRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RouterNatState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RouterNatRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param subnetworks One or more subnetwork NAT configurations. Only used if
     * `sourceSubnetworkIpRangesToNat` is set to `LIST_OF_SUBNETWORKS`
     * Structure is documented below.
     * @return builder
     */
    def subnetworks(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterNatSubnetworkArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RouterNatState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RouterNatSubnetworkArgs.builder
      builder.subnetworks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RouterPeerState.Builder)
    /**
     * @param advertisedIpRanges User-specified list of individual IP ranges to advertise in
     * custom mode. This field can only be populated if advertiseMode
     * is `CUSTOM` and is advertised to all peers of the router. These IP
     * ranges will be advertised in addition to any specified groups.
     * Leave this field blank to advertise no custom IP ranges.
     * Structure is documented below.
     * @return builder
     */
    def advertisedIpRanges(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterPeerAdvertisedIpRangeArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RouterPeerState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RouterPeerAdvertisedIpRangeArgs.builder
      builder.advertisedIpRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param bfd BFD configuration for the BGP peering.
     * Structure is documented below.
     * @return builder
     */
    def bfd(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterPeerBfdArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RouterPeerState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RouterPeerBfdArgs.builder
      builder.bfd(args(argsBuilder).build)

    /**
     * @param customLearnedIpRanges The custom learned route IP address range. Must be a valid CIDR-formatted prefix.
     * If an IP address is provided without a subnet mask, it is interpreted as, for IPv4,
     * a /32 singular IP address range, and, for IPv6, /128.
     * Structure is documented below.
     * @return builder
     */
    def customLearnedIpRanges(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterPeerCustomLearnedIpRangeArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RouterPeerState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RouterPeerCustomLearnedIpRangeArgs.builder
      builder.customLearnedIpRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param md5AuthenticationKey Configuration for MD5 authentication on the BGP session.
     * Structure is documented below.
     * @return builder
     */
    def md5AuthenticationKey(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterPeerMd5AuthenticationKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RouterPeerState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RouterPeerMd5AuthenticationKeyArgs.builder
      builder.md5AuthenticationKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RouterRoutePolicyState.Builder)
    /**
     * @param terms List of terms (the order in the list is not important, they are evaluated in order of priority).
     * Structure is documented below.
     * @return builder
     */
    def terms(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterRoutePolicyTermArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RouterRoutePolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RouterRoutePolicyTermArgs.builder
      builder.terms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RouterRoutePolicyTermArgs.Builder)
    /**
     * @param actions &#39;CEL expressions to evaluate to modify a route when this term matches.&#39;\
     * Structure is documented below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterRoutePolicyTermActionArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RouterRoutePolicyTermArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RouterRoutePolicyTermActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param match CEL expression evaluated against a route to determine if this term applies (see Policy Language).
     * Structure is documented below.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterRoutePolicyTermMatchArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RouterRoutePolicyTermArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RouterRoutePolicyTermMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RouterState.Builder)
    /**
     * @param bgp BGP information specific to this router.
     * Structure is documented below.
     * @return builder
     */
    def bgp(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterBgpArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RouterState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RouterBgpArgs.builder
      builder.bgp(args(argsBuilder).build)

    /**
     * @param md5AuthenticationKeys Keys used for MD5 authentication.
     * Structure is documented below.
     * @return builder
     */
    def md5AuthenticationKeys(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterMd5AuthenticationKeysArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RouterState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RouterMd5AuthenticationKeysArgs.builder
      builder.md5AuthenticationKeys(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    def params(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RouterState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RouterParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigArgs.Builder)
    /**
     * @param autoDeployConfig ) Configuration for [Automatically deploy Adaptive Protection suggested rules](https://cloud.google.com/armor/docs/adaptive-protection-auto-deploy?hl=en). Structure is documented below.
     * 
     * &lt;a name=&#34;nestedLayer7DdosDefenseConfig&#34;&gt;&lt;/a&gt;The `layer7DdosDefenseConfig` block supports:
     * @return builder
     */
    def autoDeployConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigAutoDeployConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigAutoDeployConfigArgs.builder
      builder.autoDeployConfig(args(argsBuilder).build)

    /**
     * @param layer7DdosDefenseConfig Configuration for [Google Cloud Armor Adaptive Protection Layer 7 DDoS Defense](https://cloud.google.com/armor/docs/adaptive-protection-overview?hl=en). Structure is documented below.
     * @return builder
     */
    def layer7DdosDefenseConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs.builder
      builder.layer7DdosDefenseConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs.Builder)
    /**
     * @param thresholdConfigs Configuration options for layer7 adaptive protection for various customizable thresholds.
     * @return builder
     */
    def thresholdConfigs(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigThresholdConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigThresholdConfigArgs.builder
      builder.thresholdConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigThresholdConfigArgs.Builder)
    /**
     * @param trafficGranularityConfigs Configuration options for enabling Adaptive Protection to work on the specified service granularity. Structure is documented below.
     * @return builder
     */
    def trafficGranularityConfigs(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigThresholdConfigTrafficGranularityConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigThresholdConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigThresholdConfigTrafficGranularityConfigArgs.builder
      builder.trafficGranularityConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.SecurityPolicyAdvancedOptionsConfigArgs.Builder)
    /**
     * @param jsonCustomConfig Custom configuration to apply the JSON parsing. Only applicable when
     * `jsonParsing` is set to `STANDARD`. Structure is documented below.
     * @return builder
     */
    def jsonCustomConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyAdvancedOptionsConfigJsonCustomConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyAdvancedOptionsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyAdvancedOptionsConfigJsonCustomConfigArgs.builder
      builder.jsonCustomConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.SecurityPolicyRuleArgs.Builder)
    /**
     * @param headerAction Additional actions that are performed on headers. Structure is documented below.
     * @return builder
     */
    def headerAction(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleHeaderActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

    /**
     * @param match A match condition that incoming traffic is evaluated against.
     * If it evaluates to true, the corresponding `action` is enforced. Structure is documented below.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param preconfiguredWafConfig Preconfigured WAF configuration to be applied for the rule. If the rule does not evaluate preconfigured WAF rules, i.e., if `evaluatePreconfiguredWaf()` is not used, this field will have no effect. Structure is documented below.
     * @return builder
     */
    def preconfiguredWafConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigArgs.builder
      builder.preconfiguredWafConfig(args(argsBuilder).build)

    /**
     * @param rateLimitOptions Must be specified if the `action` is `rateBasedBan` or `throttle`. Cannot be specified for other actions. Structure is documented below.
     * @return builder
     */
    def rateLimitOptions(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsArgs.builder
      builder.rateLimitOptions(args(argsBuilder).build)

    /**
     * @param redirectOptions Can be specified if the `action` is `redirect`. Cannot be specified for other actions. Structure is documented below.
     * @return builder
     */
    def redirectOptions(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRedirectOptionsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRedirectOptionsArgs.builder
      builder.redirectOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.SecurityPolicyRuleHeaderActionArgs.Builder)
    /**
     * @param requestHeadersToAdds The list of request headers to add or overwrite if they&#39;re already present.
     * Structure is documented below.
     * @return builder
     */
    def requestHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleHeaderActionRequestHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRuleHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleHeaderActionRequestHeadersToAddArgs.builder
      builder.requestHeadersToAdds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchArgs.Builder)
    /**
     * @param config The configuration options available when specifying versionedExpr.
     * This field must be specified if versionedExpr is specified and cannot be specified if versionedExpr is not specified.
     * Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param expr User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
     * Structure is documented below.
     * @return builder
     */
    def expr(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchExprArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchExprArgs.builder
      builder.expr(args(argsBuilder).build)

    /**
     * @param exprOptions The configuration options available when specifying a user defined CEVAL expression (i.e., &#39;expr&#39;).
     * Structure is documented below.
     * @return builder
     */
    def exprOptions(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchExprOptionsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchExprOptionsArgs.builder
      builder.exprOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchExprOptionsArgs.Builder)
    /**
     * @param recaptchaOptions reCAPTCHA configuration options to be applied for the rule. If the rule does not evaluate reCAPTCHA tokens, this field has no effect.
     * Structure is documented below.
     * @return builder
     */
    def recaptchaOptions(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchExprOptionsRecaptchaOptionsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchExprOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchExprOptionsRecaptchaOptionsArgs.builder
      builder.recaptchaOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigArgs.Builder)
    /**
     * @param exclusions An exclusion to apply during preconfigured WAF evaluation.
     * Structure is documented below.
     * @return builder
     */
    def exclusions(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigExclusionArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigExclusionArgs.Builder)
    /**
     * @param requestBodies (Optional, Beta)
     * A list of request body fields to be excluded from inspection during preconfigured WAF evaluation.
     * Structure is documented below.
     * @return builder
     */
    def requestBodies(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigExclusionRequestBodyArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigExclusionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigExclusionRequestBodyArgs.builder
      builder.requestBodies(args.map(_(argsBuilder).build)*)

    /**
     * @param requestCookies Request cookie whose value will be excluded from inspection during preconfigured WAF evaluation.
     * Structure is documented below.
     * @return builder
     */
    def requestCookies(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigExclusionRequestCookyArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigExclusionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigExclusionRequestCookyArgs.builder
      builder.requestCookies(args.map(_(argsBuilder).build)*)

    /**
     * @param requestHeaders Request header whose value will be excluded from inspection during preconfigured WAF evaluation.
     * Structure is documented below.
     * @return builder
     */
    def requestHeaders(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigExclusionRequestHeaderArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigExclusionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigExclusionRequestHeaderArgs.builder
      builder.requestHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param requestQueryParams Request query parameter whose value will be excluded from inspection during preconfigured WAF evaluation.
     * Note that the parameter can be in the query string or in the POST body.
     * Structure is documented below.
     * @return builder
     */
    def requestQueryParams(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigExclusionRequestQueryParamArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigExclusionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigExclusionRequestQueryParamArgs.builder
      builder.requestQueryParams(args.map(_(argsBuilder).build)*)

    /**
     * @param requestUris Request URI from the request line to be excluded from inspection during preconfigured WAF evaluation.
     * When specifying this field, the query or fragment part should be excluded.
     * Structure is documented below.
     * @return builder
     */
    def requestUris(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigExclusionRequestUriArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigExclusionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigExclusionRequestUriArgs.builder
      builder.requestUris(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsArgs.Builder)
    /**
     * @param banThreshold Can only be specified if the action for the rule is &#34;rateBasedBan&#34;.
     * If specified, the key will be banned for the configured &#39;banDurationSec&#39; when the number of requests that exceed the &#39;rateLimitThreshold&#39; also exceed this &#39;banThreshold&#39;.
     * Structure is documented below.
     * @return builder
     */
    def banThreshold(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsBanThresholdArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsBanThresholdArgs.builder
      builder.banThreshold(args(argsBuilder).build)

    /**
     * @param enforceOnKeyConfigs If specified, any combination of values of enforceOnKeyType/enforceOnKeyName is treated as the key on which ratelimit threshold/action is enforced.
     * You can specify up to 3 enforceOnKeyConfigs.
     * If enforceOnKeyConfigs is specified, enforceOnKey must not be specified.
     * Structure is documented below.
     * @return builder
     */
    def enforceOnKeyConfigs(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsEnforceOnKeyConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsEnforceOnKeyConfigArgs.builder
      builder.enforceOnKeyConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param exceedRedirectOptions Parameters defining the redirect action that is used as the exceed action. Cannot be specified if the exceed action is not redirect. This field is only supported in Global Security Policies of type CLOUD_ARMOR.
     * Structure is documented below.
     * @return builder
     */
    def exceedRedirectOptions(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsArgs.builder
      builder.exceedRedirectOptions(args(argsBuilder).build)

    /**
     * @param rateLimitThreshold Threshold at which to begin ratelimiting.
     * Structure is documented below.
     * @return builder
     */
    def rateLimitThreshold(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsRateLimitThresholdArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsRateLimitThresholdArgs.builder
      builder.rateLimitThreshold(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.SecurityPolicyRuleState.Builder)
    /**
     * @param headerAction Optional, additional actions that are performed on headers. This field is only supported in Global Security Policies of type CLOUD_ARMOR.
     * Structure is documented below.
     * @return builder
     */
    def headerAction(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleHeaderActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

    /**
     * @param match A match condition that incoming traffic is evaluated against.
     * If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param preconfiguredWafConfig Preconfigured WAF configuration to be applied for the rule.
     * If the rule does not evaluate preconfigured WAF rules, i.e., if evaluatePreconfiguredWaf() is not used, this field will have no effect.
     * Structure is documented below.
     * @return builder
     */
    def preconfiguredWafConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigArgs.builder
      builder.preconfiguredWafConfig(args(argsBuilder).build)

    /**
     * @param rateLimitOptions Must be specified if the action is &#34;rateBasedBan&#34; or &#34;throttle&#34;. Cannot be specified for any other actions.
     * Structure is documented below.
     * @return builder
     */
    def rateLimitOptions(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsArgs.builder
      builder.rateLimitOptions(args(argsBuilder).build)

    /**
     * @param redirectOptions Parameters defining the redirect action. Cannot be specified for any other actions. This field is only supported in Global Security Policies of type CLOUD_ARMOR.
     * Structure is documented below.
     * @return builder
     */
    def redirectOptions(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRedirectOptionsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRedirectOptionsArgs.builder
      builder.redirectOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.SecurityPolicyState.Builder)
    /**
     * @param adaptiveProtectionConfig Configuration for [Google Cloud Armor Adaptive Protection](https://cloud.google.com/armor/docs/adaptive-protection-overview?hl=en). Structure is documented below.
     * @return builder
     */
    def adaptiveProtectionConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigArgs.builder
      builder.adaptiveProtectionConfig(args(argsBuilder).build)

    /**
     * @param advancedOptionsConfig [Advanced Configuration Options](https://cloud.google.com/armor/docs/security-policy-overview#json-parsing).
     * Structure is documented below.
     * @return builder
     */
    def advancedOptionsConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyAdvancedOptionsConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyAdvancedOptionsConfigArgs.builder
      builder.advancedOptionsConfig(args(argsBuilder).build)

    /**
     * @param recaptchaOptionsConfig [reCAPTCHA Configuration Options](https://cloud.google.com/armor/docs/configure-security-policies?hl=en#use_a_manual_challenge_to_distinguish_between_human_or_automated_clients). Structure is documented below.
     * @return builder
     */
    def recaptchaOptionsConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRecaptchaOptionsConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRecaptchaOptionsConfigArgs.builder
      builder.recaptchaOptionsConfig(args(argsBuilder).build)

    /**
     * @param rules The set of rules that belong to this policy. There must always be a default
     * rule (rule with priority 2147483647 and match &#34;\*&#34;). If no rules are provided when creating a
     * security policy, a default rule with action &#34;allow&#34; will be added. Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.SecurityPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.SecurityScanConfigAuthenticationArgs.Builder)
    /**
     * @param customAccount Describes authentication configuration that uses a custom account.
     * Structure is documented below.
     * @return builder
     */
    def customAccount(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityScanConfigAuthenticationCustomAccountArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityScanConfigAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityScanConfigAuthenticationCustomAccountArgs.builder
      builder.customAccount(args(argsBuilder).build)

    /**
     * @param googleAccount Describes authentication configuration that uses a Google account.
     * Structure is documented below.
     * @return builder
     */
    def googleAccount(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityScanConfigAuthenticationGoogleAccountArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityScanConfigAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityScanConfigAuthenticationGoogleAccountArgs.builder
      builder.googleAccount(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.SecurityScanConfigState.Builder)
    /**
     * @param authentication The authentication configuration.
     * If specified, service will use the authentication configuration during scanning.
     * Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityScanConfigAuthenticationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityScanConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityScanConfigAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    /**
     * @param schedule The schedule of the ScanConfig
     * Structure is documented below.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityScanConfigScheduleArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SecurityScanConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityScanConfigScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.ServiceAttachmentState.Builder)
    /**
     * @param connectedEndpoints An array of the consumer forwarding rules connected to this service
     * attachment.
     * Structure is documented below.
     * @return builder
     */
    def connectedEndpoints(args: Endofunction[com.pulumi.gcp.compute.inputs.ServiceAttachmentConnectedEndpointArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ServiceAttachmentState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ServiceAttachmentConnectedEndpointArgs.builder
      builder.connectedEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param consumerAcceptLists An array of projects that are allowed to connect to this service
     * attachment.
     * Structure is documented below.
     * @return builder
     */
    def consumerAcceptLists(args: Endofunction[com.pulumi.gcp.compute.inputs.ServiceAttachmentConsumerAcceptListArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ServiceAttachmentState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ServiceAttachmentConsumerAcceptListArgs.builder
      builder.consumerAcceptLists(args.map(_(argsBuilder).build)*)

    /**
     * @param pscServiceAttachmentIds An 128-bit global unique ID of the PSC service attachment.
     * Structure is documented below.
     * @return builder
     */
    def pscServiceAttachmentIds(args: Endofunction[com.pulumi.gcp.compute.inputs.ServiceAttachmentPscServiceAttachmentIdArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ServiceAttachmentState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ServiceAttachmentPscServiceAttachmentIdArgs.builder
      builder.pscServiceAttachmentIds(args.map(_(argsBuilder).build)*)

    /**
     * @param tunnelingConfig (Optional, Beta)
     * Tunneling configuration for this service attachment.
     * Structure is documented below.
     * @return builder
     */
    def tunnelingConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.ServiceAttachmentTunnelingConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ServiceAttachmentState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ServiceAttachmentTunnelingConfigArgs.builder
      builder.tunnelingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.SnapshotIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.SnapshotIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SnapshotIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SnapshotIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.SnapshotIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.SnapshotIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SnapshotIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SnapshotIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.SnapshotRecycleBinPolicyRuleArgs.Builder)
    /**
     * @param standardSnapshots The rule config for standard snapshots.
     * Structure is documented below.
     * @return builder
     */
    def standardSnapshots(args: Endofunction[com.pulumi.gcp.compute.inputs.SnapshotRecycleBinPolicyRuleStandardSnapshotsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SnapshotRecycleBinPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SnapshotRecycleBinPolicyRuleStandardSnapshotsArgs.builder
      builder.standardSnapshots(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.SnapshotRecycleBinPolicyState.Builder)
    /**
     * @param rules The rules for the snapshot recycle bin policy. The key name is either &#39;default&#39;
     * or namespaced name of the tag value which can be in the format:
     * {organization_id}/{tag_key_short_name}/{tag_value_short_name} or
     * {project_id}/{tag_key_short_name}/{tag_value_short_name} or
     * {project_number}/{tag_key_short_name}/{tag_value_short_name}. The default rule is
     * applied if snapshots do not have any of these tags. The value is the rule for the key.
     * Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.compute.inputs.SnapshotRecycleBinPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.SnapshotRecycleBinPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.SnapshotRecycleBinPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param systemRules The system rules for snapshot recycle bin policy. Defines the default rule that applies if no customer-defined
     * rule matches.
     * Structure is documented below.
     * @return builder
     */
    def systemRules(args: Endofunction[com.pulumi.gcp.compute.inputs.SnapshotRecycleBinPolicySystemRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.SnapshotRecycleBinPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.SnapshotRecycleBinPolicySystemRuleArgs.builder
      builder.systemRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.SnapshotRecycleBinPolicySystemRuleArgs.Builder)
    /**
     * @param standardSnapshots (Output)
     * The rule config for standard snapshots.
     * Structure is documented below.
     * @return builder
     */
    def standardSnapshots(args: Endofunction[com.pulumi.gcp.compute.inputs.SnapshotRecycleBinPolicySystemRuleStandardSnapshotArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.SnapshotRecycleBinPolicySystemRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.SnapshotRecycleBinPolicySystemRuleStandardSnapshotArgs.builder
      builder.standardSnapshots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.SnapshotSettingsState.Builder)
    /**
     * @param storageLocation Policy of which storage location is going to be resolved, and additional data
     * that particularizes how the policy is going to be carried out
     * Structure is documented below.
     * @return builder
     */
    def storageLocation(args: Endofunction[com.pulumi.gcp.compute.inputs.SnapshotSettingsStorageLocationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SnapshotSettingsState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SnapshotSettingsStorageLocationArgs.builder
      builder.storageLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.SnapshotSettingsStorageLocationArgs.Builder)
    /**
     * @param locations When the policy is SPECIFIC_LOCATIONS, snapshots will be stored in the
     * locations listed in this field. Keys are Cloud Storage bucket locations.
     * Only one location can be specified.
     * Structure is documented below.
     * @return builder
     */
    def locations(args: Endofunction[com.pulumi.gcp.compute.inputs.SnapshotSettingsStorageLocationLocationArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.SnapshotSettingsStorageLocationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.SnapshotSettingsStorageLocationLocationArgs.builder
      builder.locations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.SnapshotState.Builder)
    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    def params(args: Endofunction[com.pulumi.gcp.compute.inputs.SnapshotParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SnapshotState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SnapshotParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param snapshotEncryptionKey Encrypts the snapshot using a customer-supplied encryption key.
     * After you encrypt a snapshot using a customer-supplied key, you must
     * provide the same key if you use the snapshot later. For example, you
     * must provide the encryption key when you create a disk from the
     * encrypted snapshot in a future request.
     * Customer-supplied encryption keys do not protect access to metadata of
     * the snapshot.
     * If you do not provide an encryption key when creating the snapshot,
     * then the snapshot will be encrypted using an automatically generated
     * key and you do not need to provide a key to use the snapshot later.
     * ~&gt;**NOTE** Only changing `kmsKeySelfLink` between Cloud KMS keys is
     * done in place; other changes to this block recreate the snapshot.
     * Structure is documented below.
     * @return builder
     */
    def snapshotEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.SnapshotSnapshotEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SnapshotState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SnapshotSnapshotEncryptionKeyArgs.builder
      builder.snapshotEncryptionKey(args(argsBuilder).build)

    /**
     * @param sourceDiskEncryptionKey The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * @return builder
     */
    def sourceDiskEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.SnapshotSourceDiskEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SnapshotState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SnapshotSourceDiskEncryptionKeyArgs.builder
      builder.sourceDiskEncryptionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.StoragePoolIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.StoragePoolIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.StoragePoolIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.StoragePoolIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.StoragePoolIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.StoragePoolIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.StoragePoolIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.StoragePoolIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.StoragePoolState.Builder)
    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    def params(args: Endofunction[com.pulumi.gcp.compute.inputs.StoragePoolParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.StoragePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.StoragePoolParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param resourceStatuses Status information for the storage pool resource.
     * Structure is documented below.
     * @return builder
     */
    def resourceStatuses(args: Endofunction[com.pulumi.gcp.compute.inputs.StoragePoolResourceStatusArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.StoragePoolState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.StoragePoolResourceStatusArgs.builder
      builder.resourceStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param statuses Status information for the storage pool resource.
     * Structure is documented below.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.gcp.compute.inputs.StoragePoolStatusArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.StoragePoolState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.StoragePoolStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.SubnetworkIAMBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.SubnetworkIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SubnetworkIAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SubnetworkIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.SubnetworkIAMMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.SubnetworkIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SubnetworkIAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SubnetworkIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.SubnetworkState.Builder)
    /**
     * @param logConfig This field denotes the VPC flow logging options for this subnetwork. If
     * logging is enabled, logs are exported to Cloud Logging. Flow logging
     * isn&#39;t supported if the subnet `purpose` field is set to subnetwork is
     * `REGIONAL_MANAGED_PROXY` or `GLOBAL_MANAGED_PROXY`.
     * Structure is documented below.
     * @return builder
     */
    def logConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.SubnetworkLogConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SubnetworkState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SubnetworkLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    def params(args: Endofunction[com.pulumi.gcp.compute.inputs.SubnetworkParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.SubnetworkState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SubnetworkParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param secondaryIpRanges An array of configurations for secondary IP ranges for VM instances
     * contained in this subnetwork. The primary IP of such VM must belong
     * to the primary ipCidrRange of the subnetwork. The alias IPs may belong
     * to either primary or secondary ranges.
     * Structure is documented below.
     * @return builder
     */
    def secondaryIpRanges(args: Endofunction[com.pulumi.gcp.compute.inputs.SubnetworkSecondaryIpRangeArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.SubnetworkState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.SubnetworkSecondaryIpRangeArgs.builder
      builder.secondaryIpRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapDefaultCustomErrorResponsePolicyArgs.Builder)
    /**
     * @param errorResponseRules Specifies rules for returning error responses.
     * In a given policy, if you specify rules for both a range of error codes as well as rules for specific error codes then rules with specific error codes have a higher priority.
     * For example, assume that you configure a rule for 401 (Un-authorized) code, and another for all 4 series error codes (4XX).
     * If the backend service returns a 401, then the rule for 401 will be applied. However if the backend service returns a 403, the rule for 4xx takes effect.
     * Structure is documented below.
     * @return builder
     */
    def errorResponseRules(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultCustomErrorResponsePolicyErrorResponseRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapDefaultCustomErrorResponsePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultCustomErrorResponsePolicyErrorResponseRuleArgs.builder
      builder.errorResponseRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionArgs.Builder)
    /**
     * @param cachePolicy Specifies the cache policy configuration for matched traffic. Available
     * only for Global EXTERNAL_MANAGED load balancer schemes. At least one
     * property must be specified. This policy cannot be specified if any target
     * backend has Identity-Aware Proxy enabled.
     * Structure is documented below.
     * @return builder
     */
    def cachePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyArgs.builder
      builder.cachePolicy(args(argsBuilder).build)

    /**
     * @param corsPolicy The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * @return builder
     */
    def corsPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCorsPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCorsPolicyArgs.builder
      builder.corsPolicy(args(argsBuilder).build)

    /**
     * @param dynamicCompressionPolicy (Optional, Beta)
     * Dynamic compression policy for this URL Map&#39;s route. Available only for
     * Global EXTERNAL_MANAGED load balancer schemes.
     * Structure is documented below.
     * @return builder
     */
    def dynamicCompressionPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionDynamicCompressionPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionDynamicCompressionPolicyArgs.builder
      builder.dynamicCompressionPolicy(args(argsBuilder).build)

    /**
     * @param faultInjectionPolicy The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a
     * percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted
     * by the Loadbalancer for a percentage of requests.
     * timeout and retryPolicy will be ignored by clients that are configured with a faultInjectionPolicy.
     * Structure is documented below.
     * @return builder
     */
    def faultInjectionPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionFaultInjectionPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionFaultInjectionPolicyArgs.builder
      builder.faultInjectionPolicy(args(argsBuilder).build)

    /**
     * @param imageOptimizationPolicy (Optional, Beta)
     * Specifies the policy for optimizing images returned in the HTTP response.
     * Structure is documented below.
     * @return builder
     */
    def imageOptimizationPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionImageOptimizationPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionImageOptimizationPolicyArgs.builder
      builder.imageOptimizationPolicy(args(argsBuilder).build)

    /**
     * @param maxStreamDuration Specifies the maximum duration (timeout) for streams on the selected route.
     * Unlike the `Timeout` field where the timeout duration starts from the time the request
     * has been fully processed (known as end-of-stream), the duration in this field
     * is computed from the beginning of the stream until the response has been processed,
     * including all retries. A stream that does not complete in this duration is closed.
     * Structure is documented below.
     * @return builder
     */
    def maxStreamDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionMaxStreamDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionMaxStreamDurationArgs.builder
      builder.maxStreamDuration(args(argsBuilder).build)

    /**
     * @param requestMirrorPolicy Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
     * Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
     * the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * @return builder
     */
    def requestMirrorPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionRequestMirrorPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionRequestMirrorPolicyArgs.builder
      builder.requestMirrorPolicy(args(argsBuilder).build)

    /**
     * @param retryPolicy Specifies the retry policy associated with this route.
     * Structure is documented below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionRetryPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param timeout Specifies the timeout for the selected route. Timeout is computed from the time the request has been
     * fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
     * If not specified, will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * @return builder
     */
    def timeout(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionTimeoutArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionTimeoutArgs.builder
      builder.timeout(args(argsBuilder).build)

    /**
     * @param urlRewrite The spec to modify the URL of the request, prior to forwarding the request to the matched service.
     * Structure is documented below.
     * @return builder
     */
    def urlRewrite(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionUrlRewriteArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionUrlRewriteArgs.builder
      builder.urlRewrite(args(argsBuilder).build)

    /**
     * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match occurs.
     * The weights determine the fraction of traffic that flows to their corresponding backend service.
     * If all traffic needs to go to a single backend service, there must be one weightedBackendService
     * with weight set to a non 0 number.
     * Once a backendService is identified and before forwarding the request to the backend service,
     * advanced routing actions like Url rewrites and header transformations are applied depending on
     * additional settings specified in this HttpRouteAction.
     * Structure is documented below.
     * @return builder
     */
    def weightedBackendServices(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionWeightedBackendServiceArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionWeightedBackendServiceArgs.builder
      builder.weightedBackendServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyArgs.Builder)
    /**
     * @param cacheKeyPolicy The cache key configuration. If not specified, the default behavior depends
     * on the backend type: for Backend Services, the complete request URI is
     * used; for Backend Buckets, the request URI is used without the protocol or
     * host, and only query parameters known to Cloud Storage are included.
     * Structure is documented below.
     * @return builder
     */
    def cacheKeyPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyCacheKeyPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyCacheKeyPolicyArgs.builder
      builder.cacheKeyPolicy(args(argsBuilder).build)

    /**
     * @param clientTtl Specifies a separate client (e.g. browser client) maximum TTL for cached
     * content. This is used to clamp the max-age (or Expires) value sent to the
     * client. With FORCE_CACHE_ALL, the lesser of clientTtl and defaultTtl
     * is used for the response max-age directive, along with a &#34;public&#34;
     * directive. For cacheable content in CACHE_ALL_STATIC mode, clientTtl
     * clamps the max-age from the origin (if specified), or else sets the
     * response max-age directive to the lesser of the clientTtl and defaultTtl,
     * and also ensures a &#34;public&#34; cache-control directive is present. The maximum
     * allowed value is 31,622,400s (1 year). If not specified, Cloud CDN uses
     * 3600s (1 hour) for CACHE_ALL_STATIC mode. Cannot exceed maxTtl.
     * Cannot be specified when cacheMode is USE_ORIGIN_HEADERS.
     * Structure is documented below.
     * @return builder
     */
    def clientTtl(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyClientTtlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyClientTtlArgs.builder
      builder.clientTtl(args(argsBuilder).build)

    /**
     * @param defaultTtl Specifies the default TTL for cached content for responses that do not have
     * an existing valid TTL (max-age or s-maxage). Setting a TTL of &#34;0&#34; means
     * &#34;always revalidate&#34;. The value of defaultTtl cannot be set to a value
     * greater than that of maxTtl. When the cacheMode is set to
     * FORCE_CACHE_ALL, the defaultTtl will overwrite the TTL set in all
     * responses. The maximum allowed value is 31,622,400s (1 year). Infrequently
     * accessed objects may be evicted from the cache before the defined TTL. If
     * not specified, Cloud CDN uses 3600s (1 hour) for CACHE_ALL_STATIC and
     * FORCE_CACHE_ALL modes. Cannot be specified when cacheMode is
     * USE_ORIGIN_HEADERS.
     * Structure is documented below.
     * @return builder
     */
    def defaultTtl(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyDefaultTtlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyDefaultTtlArgs.builder
      builder.defaultTtl(args(argsBuilder).build)

    /**
     * @param maxTtl Specifies the maximum allowed TTL for cached content. Cache directives that
     * attempt to set a max-age or s-maxage higher than this, or an Expires header
     * more than maxTtl seconds in the future will be capped at the value of
     * maxTtl, as if it were the value of an s-maxage Cache-Control directive.
     * Headers sent to the client will not be modified. Setting a TTL of &#34;0&#34; means
     * &#34;always revalidate&#34;. The maximum allowed value is 31,622,400s (1 year).
     * Infrequently accessed objects may be evicted from the cache before the
     * defined TTL. If not specified, Cloud CDN uses 86400s (1 day) for
     * CACHE_ALL_STATIC mode. Can be specified only for CACHE_ALL_STATIC cache
     * mode.
     * Structure is documented below.
     * @return builder
     */
    def maxTtl(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyMaxTtlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyMaxTtlArgs.builder
      builder.maxTtl(args(argsBuilder).build)

    /**
     * @param negativeCachingPolicies Sets a cache TTL for the specified HTTP status code. negativeCaching
     * must be enabled to configure negativeCachingPolicy. Omitting the policy
     * and leaving negativeCaching enabled will use Cloud CDN&#39;s default cache
     * TTLs. Note that when specifying an explicit negativeCachingPolicy, you
     * should take care to specify a cache TTL for all response codes that you
     * wish to cache. Cloud CDN will not apply any default negative caching when
     * a policy exists.
     * Structure is documented below.
     * @return builder
     */
    def negativeCachingPolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyNegativeCachingPolicyArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyNegativeCachingPolicyArgs.builder
      builder.negativeCachingPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param serveWhileStale Serve existing content from the cache (if available) when revalidating
     * content with the origin, or when an error is encountered when refreshing
     * the cache. This setting defines the default &#34;max-stale&#34; duration for any
     * cached responses that do not specify a max-stale directive. Stale
     * responses that exceed the TTL configured here will not be served. The
     * default limit (max-stale) is 86400s (1 day), which will allow stale
     * content to be served up to this limit beyond the max-age (or s-maxage) of
     * a cached response. The maximum allowed value is 604800 (1 week). Set this
     * to zero (0) to disable serve-while-stale.
     * Structure is documented below.
     * @return builder
     */
    def serveWhileStale(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyServeWhileStaleArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyServeWhileStaleArgs.builder
      builder.serveWhileStale(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyNegativeCachingPolicyArgs.Builder)
    /**
     * @param ttl The TTL (in seconds) for which to cache responses with the
     * corresponding status code. The maximum allowed value is 1800s (30
     * minutes). Infrequently accessed objects may be evicted from the cache
     * before the defined TTL.
     * Structure is documented below.
     * @return builder
     */
    def ttl(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyNegativeCachingPolicyTtlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyNegativeCachingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCachePolicyNegativeCachingPolicyTtlArgs.builder
      builder.ttl(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionFaultInjectionPolicyArgs.Builder)
    /**
     * @param abort The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * @return builder
     */
    def abort(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionFaultInjectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs.builder
      builder.abort(args(argsBuilder).build)

    /**
     * @param delay The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * @return builder
     */
    def delay(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionFaultInjectionPolicyDelayArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionFaultInjectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionFaultInjectionPolicyDelayArgs.builder
      builder.delay(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionFaultInjectionPolicyDelayArgs.Builder)
    /**
     * @param fixedDelay Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * @return builder
     */
    def fixedDelay(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionFaultInjectionPolicyDelayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayArgs.builder
      builder.fixedDelay(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionRetryPolicyArgs.Builder)
    /**
     * @param perTryTimeout Specifies a non-zero timeout per retry attempt.
     * If not specified, will use the timeout set in HttpRouteAction. If timeout in HttpRouteAction is not set,
     * will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * @return builder
     */
    def perTryTimeout(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionRetryPolicyPerTryTimeoutArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionRetryPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionRetryPolicyPerTryTimeoutArgs.builder
      builder.perTryTimeout(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionWeightedBackendServiceArgs.Builder)
    /**
     * @param headerAction Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * @return builder
     */
    def headerAction(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionWeightedBackendServiceHeaderActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionWeightedBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionWeightedBackendServiceHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionWeightedBackendServiceHeaderActionArgs.Builder)
    /**
     * @param requestHeadersToAdds Headers to add to a matching request prior to forwarding the request to the backendService.
     * Structure is documented below.
     * @return builder
     */
    def requestHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionWeightedBackendServiceHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs.builder
      builder.requestHeadersToAdds(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeadersToAdds Headers to add the response prior to sending the response back to the client.
     * Structure is documented below.
     * @return builder
     */
    def responseHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionWeightedBackendServiceHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs.builder
      builder.responseHeadersToAdds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapHeaderActionArgs.Builder)
    /**
     * @param requestHeadersToAdds Headers to add to a matching request prior to forwarding the request to the backendService.
     * Structure is documented below.
     * @return builder
     */
    def requestHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapHeaderActionRequestHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapHeaderActionRequestHeadersToAddArgs.builder
      builder.requestHeadersToAdds(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeadersToAdds Headers to add the response prior to sending the response back to the client.
     * Structure is documented below.
     * @return builder
     */
    def responseHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapHeaderActionResponseHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapHeaderActionResponseHeadersToAddArgs.builder
      builder.responseHeadersToAdds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherArgs.Builder)
    /**
     * @param defaultCustomErrorResponsePolicy defaultCustomErrorResponsePolicy specifies how the Load Balancer returns error responses when BackendService or BackendBucket responds with an error.
     * This policy takes effect at the PathMatcher level and applies only when no policy has been defined for the error code at lower levels like RouteRule and PathRule within this PathMatcher. If an error code does not have a policy defined in defaultCustomErrorResponsePolicy, then a policy defined for the error code in UrlMap.defaultCustomErrorResponsePolicy takes effect.
     * For example, consider a UrlMap with the following configuration:
     * UrlMap.defaultCustomErrorResponsePolicy is configured with policies for 5xx and 4xx errors
     * A RouteRule for /coming_soon/ is configured for the error code 404.
     * If the request is for www.myotherdomain.com and a 404 is encountered, the policy under UrlMap.defaultCustomErrorResponsePolicy takes effect. If a 404 response is encountered for the request www.example.com/current_events/, the pathMatcher&#39;s policy takes effect. If however, the request for www.example.com/coming_soon/ encounters a 404, the policy in RouteRule.customErrorResponsePolicy takes effect. If any of the requests in this example encounter a 500 error code, the policy at UrlMap.defaultCustomErrorResponsePolicy takes effect.
     * When used in conjunction with pathMatcher.defaultRouteAction.retryPolicy, retries take precedence. Only once all retries are exhausted, the defaultCustomErrorResponsePolicy is applied. While attempting a retry, if load balancer is successful in reaching the service, the defaultCustomErrorResponsePolicy is ignored and the response from the service is returned to the client.
     * defaultCustomErrorResponsePolicy is supported only for global external Application Load Balancers.
     * Structure is documented below.
     * @return builder
     */
    def defaultCustomErrorResponsePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultCustomErrorResponsePolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultCustomErrorResponsePolicyArgs.builder
      builder.defaultCustomErrorResponsePolicy(args(argsBuilder).build)

    /**
     * @param defaultRouteAction defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs
     * advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request
     * to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set.
     * Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices.
     * Only one of defaultRouteAction or defaultUrlRedirect must be set.
     * Structure is documented below.
     * @return builder
     */
    def defaultRouteAction(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionArgs.builder
      builder.defaultRouteAction(args(argsBuilder).build)

    /**
     * @param defaultUrlRedirect When none of the specified hostRules match, the request is redirected to a URL specified
     * by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or
     * defaultRouteAction must not be set.
     * Structure is documented below.
     * @return builder
     */
    def defaultUrlRedirect(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultUrlRedirectArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultUrlRedirectArgs.builder
      builder.defaultUrlRedirect(args(argsBuilder).build)

    /**
     * @param headerAction Specifies changes to request and response headers that need to take effect for
     * the selected backendService. HeaderAction specified here are applied after the
     * matching HttpRouteRule HeaderAction and before the HeaderAction in the UrlMap
     * Structure is documented below.
     * @return builder
     */
    def headerAction(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherHeaderActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

    /**
     * @param pathRules The list of path rules. Use this list instead of routeRules when routing based
     * on simple path matching is all that&#39;s required. The order by which path rules
     * are specified does not matter. Matches are always done on the longest-path-first
     * basis. For example: a pathRule with a path /a/b/c&#47;&#42; will match before /a/b&#47;&#42;
     * irrespective of the order in which those paths appear in this list. Within a
     * given pathMatcher, only one of pathRules or routeRules must be set.
     * Structure is documented below.
     * @return builder
     */
    def pathRules(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleArgs.builder
      builder.pathRules(args.map(_(argsBuilder).build)*)

    /**
     * @param routeRules The list of ordered HTTP route rules. Use this list instead of pathRules when
     * advanced route matching and routing actions are desired. The order of specifying
     * routeRules matters: the first rule that matches will cause its specified routing
     * action to take effect. Within a given pathMatcher, only one of pathRules or
     * routeRules must be set. routeRules are not supported in UrlMaps intended for
     * External load balancers.
     * Structure is documented below.
     * @return builder
     */
    def routeRules(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleArgs.builder
      builder.routeRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultCustomErrorResponsePolicyArgs.Builder)
    /**
     * @param errorResponseRules Specifies rules for returning error responses.
     * In a given policy, if you specify rules for both a range of error codes as well as rules for specific error codes then rules with specific error codes have a higher priority.
     * For example, assume that you configure a rule for 401 (Un-authorized) code, and another for all 4 series error codes (4XX).
     * If the backend service returns a 401, then the rule for 401 will be applied. However if the backend service returns a 403, the rule for 4xx takes effect.
     * Structure is documented below.
     * @return builder
     */
    def errorResponseRules(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultCustomErrorResponsePolicyErrorResponseRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultCustomErrorResponsePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultCustomErrorResponsePolicyErrorResponseRuleArgs.builder
      builder.errorResponseRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionArgs.Builder)
    /**
     * @param cachePolicy Specifies the cache policy configuration for matched traffic. Available
     * only for Global EXTERNAL_MANAGED load balancer schemes. At least one
     * property must be specified. This policy cannot be specified if any target
     * backend has Identity-Aware Proxy enabled.
     * Structure is documented below.
     * @return builder
     */
    def cachePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyArgs.builder
      builder.cachePolicy(args(argsBuilder).build)

    /**
     * @param corsPolicy The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * @return builder
     */
    def corsPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCorsPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCorsPolicyArgs.builder
      builder.corsPolicy(args(argsBuilder).build)

    /**
     * @param dynamicCompressionPolicy (Optional, Beta)
     * Dynamic compression policy for this URL Map&#39;s route. Available only for
     * Global EXTERNAL_MANAGED load balancer schemes.
     * Structure is documented below.
     * @return builder
     */
    def dynamicCompressionPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionDynamicCompressionPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionDynamicCompressionPolicyArgs.builder
      builder.dynamicCompressionPolicy(args(argsBuilder).build)

    /**
     * @param faultInjectionPolicy The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a
     * percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted
     * by the Loadbalancer for a percentage of requests.
     * timeout and retryPolicy will be ignored by clients that are configured with a faultInjectionPolicy.
     * Structure is documented below.
     * @return builder
     */
    def faultInjectionPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs.builder
      builder.faultInjectionPolicy(args(argsBuilder).build)

    /**
     * @param imageOptimizationPolicy (Optional, Beta)
     * Specifies the policy for optimizing images returned in the HTTP response.
     * Structure is documented below.
     * @return builder
     */
    def imageOptimizationPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionImageOptimizationPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionImageOptimizationPolicyArgs.builder
      builder.imageOptimizationPolicy(args(argsBuilder).build)

    /**
     * @param maxStreamDuration Specifies the maximum duration (timeout) for streams on the selected route.
     * Unlike the `Timeout` field where the timeout duration starts from the time the request
     * has been fully processed (known as end-of-stream), the duration in this field
     * is computed from the beginning of the stream until the response has been processed,
     * including all retries. A stream that does not complete in this duration is closed.
     * Structure is documented below.
     * @return builder
     */
    def maxStreamDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionMaxStreamDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionMaxStreamDurationArgs.builder
      builder.maxStreamDuration(args(argsBuilder).build)

    /**
     * @param requestMirrorPolicy Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
     * Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
     * the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * @return builder
     */
    def requestMirrorPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyArgs.builder
      builder.requestMirrorPolicy(args(argsBuilder).build)

    /**
     * @param retryPolicy Specifies the retry policy associated with this route.
     * Structure is documented below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionRetryPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param timeout Specifies the timeout for the selected route. Timeout is computed from the time the request has been
     * fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
     * If not specified, will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * @return builder
     */
    def timeout(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionTimeoutArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionTimeoutArgs.builder
      builder.timeout(args(argsBuilder).build)

    /**
     * @param urlRewrite The spec to modify the URL of the request, prior to forwarding the request to the matched service.
     * Structure is documented below.
     * @return builder
     */
    def urlRewrite(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionUrlRewriteArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionUrlRewriteArgs.builder
      builder.urlRewrite(args(argsBuilder).build)

    /**
     * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match occurs.
     * The weights determine the fraction of traffic that flows to their corresponding backend service.
     * If all traffic needs to go to a single backend service, there must be one weightedBackendService
     * with weight set to a non 0 number.
     * Once a backendService is identified and before forwarding the request to the backend service,
     * advanced routing actions like Url rewrites and header transformations are applied depending on
     * additional settings specified in this HttpRouteAction.
     * Structure is documented below.
     * @return builder
     */
    def weightedBackendServices(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs.builder
      builder.weightedBackendServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyArgs.Builder)
    /**
     * @param cacheKeyPolicy The cache key configuration. If not specified, the default behavior depends
     * on the backend type: for Backend Services, the complete request URI is
     * used; for Backend Buckets, the request URI is used without the protocol or
     * host, and only query parameters known to Cloud Storage are included.
     * Structure is documented below.
     * @return builder
     */
    def cacheKeyPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyCacheKeyPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyCacheKeyPolicyArgs.builder
      builder.cacheKeyPolicy(args(argsBuilder).build)

    /**
     * @param clientTtl Specifies a separate client (e.g. browser client) maximum TTL for cached
     * content. This is used to clamp the max-age (or Expires) value sent to the
     * client. With FORCE_CACHE_ALL, the lesser of clientTtl and defaultTtl
     * is used for the response max-age directive, along with a &#34;public&#34;
     * directive. For cacheable content in CACHE_ALL_STATIC mode, clientTtl
     * clamps the max-age from the origin (if specified), or else sets the
     * response max-age directive to the lesser of the clientTtl and defaultTtl,
     * and also ensures a &#34;public&#34; cache-control directive is present. The maximum
     * allowed value is 31,622,400s (1 year). If not specified, Cloud CDN uses
     * 3600s (1 hour) for CACHE_ALL_STATIC mode. Cannot exceed maxTtl.
     * Cannot be specified when cacheMode is USE_ORIGIN_HEADERS.
     * Structure is documented below.
     * @return builder
     */
    def clientTtl(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyClientTtlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyClientTtlArgs.builder
      builder.clientTtl(args(argsBuilder).build)

    /**
     * @param defaultTtl Specifies the default TTL for cached content for responses that do not have
     * an existing valid TTL (max-age or s-maxage). Setting a TTL of &#34;0&#34; means
     * &#34;always revalidate&#34;. The value of defaultTtl cannot be set to a value
     * greater than that of maxTtl. When the cacheMode is set to
     * FORCE_CACHE_ALL, the defaultTtl will overwrite the TTL set in all
     * responses. The maximum allowed value is 31,622,400s (1 year). Infrequently
     * accessed objects may be evicted from the cache before the defined TTL. If
     * not specified, Cloud CDN uses 3600s (1 hour) for CACHE_ALL_STATIC and
     * FORCE_CACHE_ALL modes. Cannot be specified when cacheMode is
     * USE_ORIGIN_HEADERS.
     * Structure is documented below.
     * @return builder
     */
    def defaultTtl(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyDefaultTtlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyDefaultTtlArgs.builder
      builder.defaultTtl(args(argsBuilder).build)

    /**
     * @param maxTtl Specifies the maximum allowed TTL for cached content. Cache directives that
     * attempt to set a max-age or s-maxage higher than this, or an Expires header
     * more than maxTtl seconds in the future will be capped at the value of
     * maxTtl, as if it were the value of an s-maxage Cache-Control directive.
     * Headers sent to the client will not be modified. Setting a TTL of &#34;0&#34; means
     * &#34;always revalidate&#34;. The maximum allowed value is 31,622,400s (1 year).
     * Infrequently accessed objects may be evicted from the cache before the
     * defined TTL. If not specified, Cloud CDN uses 86400s (1 day) for
     * CACHE_ALL_STATIC mode. Can be specified only for CACHE_ALL_STATIC cache
     * mode.
     * Structure is documented below.
     * @return builder
     */
    def maxTtl(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyMaxTtlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyMaxTtlArgs.builder
      builder.maxTtl(args(argsBuilder).build)

    /**
     * @param negativeCachingPolicies Sets a cache TTL for the specified HTTP status code. negativeCaching
     * must be enabled to configure negativeCachingPolicy. Omitting the policy
     * and leaving negativeCaching enabled will use Cloud CDN&#39;s default cache
     * TTLs. Note that when specifying an explicit negativeCachingPolicy, you
     * should take care to specify a cache TTL for all response codes that you
     * wish to cache. Cloud CDN will not apply any default negative caching when
     * a policy exists.
     * Structure is documented below.
     * @return builder
     */
    def negativeCachingPolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyNegativeCachingPolicyArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyNegativeCachingPolicyArgs.builder
      builder.negativeCachingPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param serveWhileStale Serve existing content from the cache (if available) when revalidating
     * content with the origin, or when an error is encountered when refreshing
     * the cache. This setting defines the default &#34;max-stale&#34; duration for any
     * cached responses that do not specify a max-stale directive. Stale
     * responses that exceed the TTL configured here will not be served. The
     * default limit (max-stale) is 86400s (1 day), which will allow stale
     * content to be served up to this limit beyond the max-age (or s-maxage) of
     * a cached response. The maximum allowed value is 604800 (1 week). Set this
     * to zero (0) to disable serve-while-stale.
     * Structure is documented below.
     * @return builder
     */
    def serveWhileStale(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyServeWhileStaleArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyServeWhileStaleArgs.builder
      builder.serveWhileStale(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyNegativeCachingPolicyArgs.Builder)
    /**
     * @param ttl The TTL (in seconds) for which to cache responses with the
     * corresponding status code. The maximum allowed value is 1800s (30
     * minutes). Infrequently accessed objects may be evicted from the cache
     * before the defined TTL.
     * Structure is documented below.
     * @return builder
     */
    def ttl(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyNegativeCachingPolicyTtlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyNegativeCachingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionCachePolicyNegativeCachingPolicyTtlArgs.builder
      builder.ttl(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs.Builder)
    /**
     * @param abort The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * @return builder
     */
    def abort(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortArgs.builder
      builder.abort(args(argsBuilder).build)

    /**
     * @param delay The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * @return builder
     */
    def delay(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs.builder
      builder.delay(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs.Builder)
    /**
     * @param fixedDelay Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * @return builder
     */
    def fixedDelay(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayArgs.builder
      builder.fixedDelay(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionRetryPolicyArgs.Builder)
    /**
     * @param perTryTimeout Specifies a non-zero timeout per retry attempt.
     * If not specified, will use the timeout set in HttpRouteAction. If timeout in HttpRouteAction is not set,
     * will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * @return builder
     */
    def perTryTimeout(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionRetryPolicyPerTryTimeoutArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionRetryPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionRetryPolicyPerTryTimeoutArgs.builder
      builder.perTryTimeout(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs.Builder)
    /**
     * @param headerAction Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * @return builder
     */
    def headerAction(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionArgs.Builder)
    /**
     * @param requestHeadersToAdds Headers to add to a matching request prior to forwarding the request to the backendService.
     * Structure is documented below.
     * @return builder
     */
    def requestHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs.builder
      builder.requestHeadersToAdds(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeadersToAdds Headers to add the response prior to sending the response back to the client.
     * Structure is documented below.
     * @return builder
     */
    def responseHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs.builder
      builder.responseHeadersToAdds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherHeaderActionArgs.Builder)
    /**
     * @param requestHeadersToAdds Headers to add to a matching request prior to forwarding the request to the backendService.
     * Structure is documented below.
     * @return builder
     */
    def requestHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherHeaderActionRequestHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherHeaderActionRequestHeadersToAddArgs.builder
      builder.requestHeadersToAdds(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeadersToAdds Headers to add the response prior to sending the response back to the client.
     * Structure is documented below.
     * @return builder
     */
    def responseHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherHeaderActionResponseHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherHeaderActionResponseHeadersToAddArgs.builder
      builder.responseHeadersToAdds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleArgs.Builder)
    /**
     * @param customErrorResponsePolicy customErrorResponsePolicy specifies how the Load Balancer returns error responses when BackendService or BackendBucket responds with an error.
     * If a policy for an error code is not configured for the PathRule, a policy for the error code configured in pathMatcher.defaultCustomErrorResponsePolicy is applied. If one is not specified in pathMatcher.defaultCustomErrorResponsePolicy, the policy configured in UrlMap.defaultCustomErrorResponsePolicy takes effect.
     * For example, consider a UrlMap with the following configuration:
     * UrlMap.defaultCustomErrorResponsePolicy are configured with policies for 5xx and 4xx errors
     * A PathRule for /coming_soon/ is configured for the error code 404.
     * If the request is for www.myotherdomain.com and a 404 is encountered, the policy under UrlMap.defaultCustomErrorResponsePolicy takes effect. If a 404 response is encountered for the request www.example.com/current_events/, the pathMatcher&#39;s policy takes effect. If however, the request for www.example.com/coming_soon/ encounters a 404, the policy in PathRule.customErrorResponsePolicy takes effect. If any of the requests in this example encounter a 500 error code, the policy at UrlMap.defaultCustomErrorResponsePolicy takes effect.
     * customErrorResponsePolicy is supported only for global external Application Load Balancers.
     * Structure is documented below.
     * @return builder
     */
    def customErrorResponsePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleCustomErrorResponsePolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleCustomErrorResponsePolicyArgs.builder
      builder.customErrorResponsePolicy(args(argsBuilder).build)

    /**
     * @param routeAction In response to a matching path, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * @return builder
     */
    def routeAction(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionArgs.builder
      builder.routeAction(args(argsBuilder).build)

    /**
     * @param urlRedirect When a path pattern is matched, the request is redirected to a URL specified
     * by urlRedirect. If urlRedirect is specified, service or routeAction must not
     * be set.
     * Structure is documented below.
     * @return builder
     */
    def urlRedirect(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleUrlRedirectArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleUrlRedirectArgs.builder
      builder.urlRedirect(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleCustomErrorResponsePolicyArgs.Builder)
    /**
     * @param errorResponseRules Specifies rules for returning error responses.
     * In a given policy, if you specify rules for both a range of error codes as well as rules for specific error codes then rules with specific error codes have a higher priority.
     * For example, assume that you configure a rule for 401 (Un-authorized) code, and another for all 4 series error codes (4XX).
     * If the backend service returns a 401, then the rule for 401 will be applied. However if the backend service returns a 403, the rule for 4xx takes effect.
     * Structure is documented below.
     * @return builder
     */
    def errorResponseRules(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleCustomErrorResponsePolicyErrorResponseRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleCustomErrorResponsePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleCustomErrorResponsePolicyErrorResponseRuleArgs.builder
      builder.errorResponseRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionArgs.Builder)
    /**
     * @param cachePolicy Specifies the cache policy configuration for matched traffic. Available
     * only for Global EXTERNAL_MANAGED load balancer schemes. At least one
     * property must be specified. This policy cannot be specified if any target
     * backend has Identity-Aware Proxy enabled.
     * Structure is documented below.
     * @return builder
     */
    def cachePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyArgs.builder
      builder.cachePolicy(args(argsBuilder).build)

    /**
     * @param corsPolicy The specification for allowing client side cross-origin requests. Please see W3C
     * Recommendation for Cross Origin Resource Sharing
     * Structure is documented below.
     * @return builder
     */
    def corsPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs.builder
      builder.corsPolicy(args(argsBuilder).build)

    /**
     * @param dynamicCompressionPolicy (Optional, Beta)
     * Dynamic compression policy for this URL Map&#39;s route. Available only for
     * Global EXTERNAL_MANAGED load balancer schemes.
     * Structure is documented below.
     * @return builder
     */
    def dynamicCompressionPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionDynamicCompressionPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionDynamicCompressionPolicyArgs.builder
      builder.dynamicCompressionPolicy(args(argsBuilder).build)

    /**
     * @param faultInjectionPolicy The specification for fault injection introduced into traffic to test the
     * resiliency of clients to backend service failure. As part of fault injection,
     * when clients send requests to a backend service, delays can be introduced by
     * Loadbalancer on a percentage of requests before sending those request to the
     * backend service. Similarly requests from clients can be aborted by the
     * Loadbalancer for a percentage of requests. timeout and retryPolicy will be
     * ignored by clients that are configured with a fault_injection_policy.
     * Structure is documented below.
     * @return builder
     */
    def faultInjectionPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs.builder
      builder.faultInjectionPolicy(args(argsBuilder).build)

    /**
     * @param imageOptimizationPolicy (Optional, Beta)
     * Specifies the policy for optimizing images returned in the HTTP response.
     * Structure is documented below.
     * @return builder
     */
    def imageOptimizationPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionImageOptimizationPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionImageOptimizationPolicyArgs.builder
      builder.imageOptimizationPolicy(args(argsBuilder).build)

    /**
     * @param maxStreamDuration Specifies the maximum duration (timeout) for streams on the selected route.
     * Unlike the `Timeout` field where the timeout duration starts from the time the request
     * has been fully processed (known as end-of-stream), the duration in this field
     * is computed from the beginning of the stream until the response has been processed,
     * including all retries. A stream that does not complete in this duration is closed.
     * Structure is documented below.
     * @return builder
     */
    def maxStreamDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionMaxStreamDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionMaxStreamDurationArgs.builder
      builder.maxStreamDuration(args(argsBuilder).build)

    /**
     * @param requestMirrorPolicy Specifies the policy on how requests intended for the route&#39;s backends are
     * shadowed to a separate mirrored backend service. Loadbalancer does not wait for
     * responses from the shadow service. Prior to sending traffic to the shadow
     * service, the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * @return builder
     */
    def requestMirrorPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs.builder
      builder.requestMirrorPolicy(args(argsBuilder).build)

    /**
     * @param retryPolicy Specifies the retry policy associated with this route.
     * Structure is documented below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionRetryPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param timeout Specifies the timeout for the selected route. Timeout is computed from the time
     * the request is has been fully processed (i.e. end-of-stream) up until the
     * response has been completely processed. Timeout includes all retries. If not
     * specified, the default value is 15 seconds.
     * Structure is documented below.
     * @return builder
     */
    def timeout(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionTimeoutArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionTimeoutArgs.builder
      builder.timeout(args(argsBuilder).build)

    /**
     * @param urlRewrite The spec to modify the URL of the request, prior to forwarding the request to
     * the matched service
     * Structure is documented below.
     * @return builder
     */
    def urlRewrite(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs.builder
      builder.urlRewrite(args(argsBuilder).build)

    /**
     * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match
     * occurs. The weights determine the fraction of traffic that flows to their
     * corresponding backend service. If all traffic needs to go to a single backend
     * service, there must be one  weightedBackendService with weight set to a non 0
     * number. Once a backendService is identified and before forwarding the request to
     * the backend service, advanced routing actions like Url rewrites and header
     * transformations are applied depending on additional settings specified in this
     * HttpRouteAction.
     * Structure is documented below.
     * @return builder
     */
    def weightedBackendServices(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs.builder
      builder.weightedBackendServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyArgs.Builder)
    /**
     * @param cacheKeyPolicy The cache key configuration. If not specified, the default behavior depends
     * on the backend type: for Backend Services, the complete request URI is
     * used; for Backend Buckets, the request URI is used without the protocol or
     * host, and only query parameters known to Cloud Storage are included.
     * Structure is documented below.
     * @return builder
     */
    def cacheKeyPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyCacheKeyPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyCacheKeyPolicyArgs.builder
      builder.cacheKeyPolicy(args(argsBuilder).build)

    /**
     * @param clientTtl Specifies a separate client (e.g. browser client) maximum TTL for cached
     * content. This is used to clamp the max-age (or Expires) value sent to the
     * client. With FORCE_CACHE_ALL, the lesser of clientTtl and defaultTtl
     * is used for the response max-age directive, along with a &#34;public&#34;
     * directive. For cacheable content in CACHE_ALL_STATIC mode, clientTtl
     * clamps the max-age from the origin (if specified), or else sets the
     * response max-age directive to the lesser of the clientTtl and defaultTtl,
     * and also ensures a &#34;public&#34; cache-control directive is present. The maximum
     * allowed value is 31,622,400s (1 year). If not specified, Cloud CDN uses
     * 3600s (1 hour) for CACHE_ALL_STATIC mode. Cannot exceed maxTtl.
     * Cannot be specified when cacheMode is USE_ORIGIN_HEADERS.
     * Structure is documented below.
     * @return builder
     */
    def clientTtl(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyClientTtlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyClientTtlArgs.builder
      builder.clientTtl(args(argsBuilder).build)

    /**
     * @param defaultTtl Specifies the default TTL for cached content for responses that do not have
     * an existing valid TTL (max-age or s-maxage). Setting a TTL of &#34;0&#34; means
     * &#34;always revalidate&#34;. The value of defaultTtl cannot be set to a value
     * greater than that of maxTtl. When the cacheMode is set to
     * FORCE_CACHE_ALL, the defaultTtl will overwrite the TTL set in all
     * responses. The maximum allowed value is 31,622,400s (1 year). Infrequently
     * accessed objects may be evicted from the cache before the defined TTL. If
     * not specified, Cloud CDN uses 3600s (1 hour) for CACHE_ALL_STATIC and
     * FORCE_CACHE_ALL modes. Cannot be specified when cacheMode is
     * USE_ORIGIN_HEADERS.
     * Structure is documented below.
     * @return builder
     */
    def defaultTtl(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyDefaultTtlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyDefaultTtlArgs.builder
      builder.defaultTtl(args(argsBuilder).build)

    /**
     * @param maxTtl Specifies the maximum allowed TTL for cached content. Cache directives that
     * attempt to set a max-age or s-maxage higher than this, or an Expires header
     * more than maxTtl seconds in the future will be capped at the value of
     * maxTtl, as if it were the value of an s-maxage Cache-Control directive.
     * Headers sent to the client will not be modified. Setting a TTL of &#34;0&#34; means
     * &#34;always revalidate&#34;. The maximum allowed value is 31,622,400s (1 year).
     * Infrequently accessed objects may be evicted from the cache before the
     * defined TTL. If not specified, Cloud CDN uses 86400s (1 day) for
     * CACHE_ALL_STATIC mode. Can be specified only for CACHE_ALL_STATIC cache
     * mode.
     * Structure is documented below.
     * @return builder
     */
    def maxTtl(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyMaxTtlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyMaxTtlArgs.builder
      builder.maxTtl(args(argsBuilder).build)

    /**
     * @param negativeCachingPolicies Sets a cache TTL for the specified HTTP status code. negativeCaching
     * must be enabled to configure negativeCachingPolicy. Omitting the policy
     * and leaving negativeCaching enabled will use Cloud CDN&#39;s default cache
     * TTLs. Note that when specifying an explicit negativeCachingPolicy, you
     * should take care to specify a cache TTL for all response codes that you
     * wish to cache. Cloud CDN will not apply any default negative caching when
     * a policy exists.
     * Structure is documented below.
     * @return builder
     */
    def negativeCachingPolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyNegativeCachingPolicyArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyNegativeCachingPolicyArgs.builder
      builder.negativeCachingPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param serveWhileStale Serve existing content from the cache (if available) when revalidating
     * content with the origin, or when an error is encountered when refreshing
     * the cache. This setting defines the default &#34;max-stale&#34; duration for any
     * cached responses that do not specify a max-stale directive. Stale
     * responses that exceed the TTL configured here will not be served. The
     * default limit (max-stale) is 86400s (1 day), which will allow stale
     * content to be served up to this limit beyond the max-age (or s-maxage) of
     * a cached response. The maximum allowed value is 604800 (1 week). Set this
     * to zero (0) to disable serve-while-stale.
     * Structure is documented below.
     * @return builder
     */
    def serveWhileStale(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyServeWhileStaleArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyServeWhileStaleArgs.builder
      builder.serveWhileStale(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyNegativeCachingPolicyArgs.Builder)
    /**
     * @param ttl The TTL (in seconds) for which to cache responses with the
     * corresponding status code. The maximum allowed value is 1800s (30
     * minutes). Infrequently accessed objects may be evicted from the cache
     * before the defined TTL.
     * Structure is documented below.
     * @return builder
     */
    def ttl(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyNegativeCachingPolicyTtlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyNegativeCachingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCachePolicyNegativeCachingPolicyTtlArgs.builder
      builder.ttl(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs.Builder)
    /**
     * @param abort The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * @return builder
     */
    def abort(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs.builder
      builder.abort(args(argsBuilder).build)

    /**
     * @param delay The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * @return builder
     */
    def delay(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs.builder
      builder.delay(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs.Builder)
    /**
     * @param fixedDelay Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * @return builder
     */
    def fixedDelay(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs.builder
      builder.fixedDelay(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionRetryPolicyArgs.Builder)
    /**
     * @param perTryTimeout Specifies a non-zero timeout per retry attempt.
     * If not specified, will use the timeout set in HttpRouteAction. If timeout in HttpRouteAction is not set,
     * will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * @return builder
     */
    def perTryTimeout(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionRetryPolicyPerTryTimeoutArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionRetryPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionRetryPolicyPerTryTimeoutArgs.builder
      builder.perTryTimeout(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs.Builder)
    /**
     * @param headerAction Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * @return builder
     */
    def headerAction(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs.Builder)
    /**
     * @param requestHeadersToAdds Headers to add to a matching request prior to forwarding the request to the backendService.
     * Structure is documented below.
     * @return builder
     */
    def requestHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs.builder
      builder.requestHeadersToAdds(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeadersToAdds Headers to add the response prior to sending the response back to the client.
     * Structure is documented below.
     * @return builder
     */
    def responseHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs.builder
      builder.responseHeadersToAdds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleArgs.Builder)
    /**
     * @param customErrorResponsePolicy customErrorResponsePolicy specifies how the Load Balancer returns error responses when BackendService or BackendBucket responds with an error.
     * Structure is documented below.
     * @return builder
     */
    def customErrorResponsePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleCustomErrorResponsePolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleCustomErrorResponsePolicyArgs.builder
      builder.customErrorResponsePolicy(args(argsBuilder).build)

    /**
     * @param headerAction Specifies changes to request and response headers that need to take effect for
     * the selected backendService. The headerAction specified here are applied before
     * the matching pathMatchers[].headerAction and after pathMatchers[].routeRules[].r
     * outeAction.weightedBackendService.backendServiceWeightAction[].headerAction
     * Structure is documented below.
     * @return builder
     */
    def headerAction(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleHeaderActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

    /**
     * @param httpFilterConfigs (Optional, Beta)
     * Outbound route specific configuration for networkservices.HttpFilter resources enabled by Traffic Director.
     * httpFilterConfigs only applies for load balancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * See ForwardingRule for more details.
     * Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * Structure is documented below.
     * @return builder
     */
    def httpFilterConfigs(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleHttpFilterConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleHttpFilterConfigArgs.builder
      builder.httpFilterConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param httpFilterMetadatas (Optional, Beta)
     * Outbound route specific metadata supplied to networkservices.HttpFilter resources enabled by Traffic Director.
     * httpFilterMetadata only applies for load balancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * See ForwardingRule for more details.
     * Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * Structure is documented below.
     * @return builder
     */
    def httpFilterMetadatas(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleHttpFilterMetadataArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleHttpFilterMetadataArgs.builder
      builder.httpFilterMetadatas(args.map(_(argsBuilder).build)*)

    /**
     * @param matchRules The rules for determining a match.
     * Structure is documented below.
     * @return builder
     */
    def matchRules(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleArgs.builder
      builder.matchRules(args.map(_(argsBuilder).build)*)

    /**
     * @param routeAction In response to a matching matchRule, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If  routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * @return builder
     */
    def routeAction(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionArgs.builder
      builder.routeAction(args(argsBuilder).build)

    /**
     * @param urlRedirect When this rule is matched, the request is redirected to a URL specified by
     * urlRedirect. If urlRedirect is specified, service or routeAction must not be
     * set.
     * Structure is documented below.
     * @return builder
     */
    def urlRedirect(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleUrlRedirectArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleUrlRedirectArgs.builder
      builder.urlRedirect(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleCustomErrorResponsePolicyArgs.Builder)
    /**
     * @param errorResponseRules Specifies rules for returning error responses.
     * In a given policy, if you specify rules for both a range of error codes as well as rules for specific error codes then rules with specific error codes have a higher priority.
     * For example, assume that you configure a rule for 401 (Un-authorized) code, and another for all 4 series error codes (4XX).
     * If the backend service returns a 401, then the rule for 401 will be applied. However if the backend service returns a 403, the rule for 4xx takes effect.
     * Structure is documented below.
     * @return builder
     */
    def errorResponseRules(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleCustomErrorResponsePolicyErrorResponseRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleCustomErrorResponsePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleCustomErrorResponsePolicyErrorResponseRuleArgs.builder
      builder.errorResponseRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleHeaderActionArgs.Builder)
    /**
     * @param requestHeadersToAdds Headers to add to a matching request prior to forwarding the request to the backendService.
     * Structure is documented below.
     * @return builder
     */
    def requestHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleHeaderActionRequestHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleHeaderActionRequestHeadersToAddArgs.builder
      builder.requestHeadersToAdds(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeadersToAdds Headers to add the response prior to sending the response back to the client.
     * Structure is documented below.
     * @return builder
     */
    def responseHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleHeaderActionResponseHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleHeaderActionResponseHeadersToAddArgs.builder
      builder.responseHeadersToAdds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleArgs.Builder)
    /**
     * @param headerMatches Specifies a list of header match criteria, all of which must match corresponding
     * headers in the request.
     * Structure is documented below.
     * @return builder
     */
    def headerMatches(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs.builder
      builder.headerMatches(args.map(_(argsBuilder).build)*)

    /**
     * @param metadataFilters Opaque filter criteria used by Loadbalancer to restrict routing configuration to
     * a limited set xDS compliant clients. In their xDS requests to Loadbalancer, xDS
     * clients present node metadata. If a match takes place, the relevant routing
     * configuration is made available to those proxies. For each metadataFilter in
     * this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the
     * filterLabels must match the corresponding label provided in the metadata. If its
     * filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match
     * with corresponding labels in the provided metadata. metadataFilters specified
     * here can be overrides those specified in ForwardingRule that refers to this
     * UrlMap. metadataFilters only applies to Loadbalancers that have their
     * loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * @return builder
     */
    def metadataFilters(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs.builder
      builder.metadataFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParameterMatches Specifies a list of query parameter match criteria, all of which must match
     * corresponding query parameters in the request.
     * Structure is documented below.
     * @return builder
     */
    def queryParameterMatches(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs.builder
      builder.queryParameterMatches(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs.Builder)
    /**
     * @param rangeMatch The header value must be an integer and its value must be in the range specified
     * in rangeMatch. If the header does not contain an integer, number or is empty,
     * the match fails. For example for a range [-5, 0]   - -3 will match.  - 0 will
     * not match.  - 0.25 will not match.  - -3someString will not match.   Only one of
     * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
     * must be set.
     * Structure is documented below.
     * @return builder
     */
    def rangeMatch(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchArgs.builder
      builder.rangeMatch(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs.Builder)
    /**
     * @param filterLabels The list of label value pairs that must match labels in the provided metadata
     * based on filterMatchCriteria  This list must not be empty and can have at the
     * most 64 entries.
     * Structure is documented below.
     * @return builder
     */
    def filterLabels(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs.builder
      builder.filterLabels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionArgs.Builder)
    /**
     * @param cachePolicy Specifies the cache policy configuration for matched traffic. Available
     * only for Global EXTERNAL_MANAGED load balancer schemes. At least one
     * property must be specified. This policy cannot be specified if any target
     * backend has Identity-Aware Proxy enabled.
     * Structure is documented below.
     * @return builder
     */
    def cachePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyArgs.builder
      builder.cachePolicy(args(argsBuilder).build)

    /**
     * @param corsPolicy The specification for allowing client side cross-origin requests. Please see W3C
     * Recommendation for Cross Origin Resource Sharing
     * Structure is documented below.
     * @return builder
     */
    def corsPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCorsPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCorsPolicyArgs.builder
      builder.corsPolicy(args(argsBuilder).build)

    /**
     * @param dynamicCompressionPolicy (Optional, Beta)
     * Dynamic compression policy for this URL Map&#39;s route. Available only for
     * Global EXTERNAL_MANAGED load balancer schemes.
     * Structure is documented below.
     * @return builder
     */
    def dynamicCompressionPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionDynamicCompressionPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionDynamicCompressionPolicyArgs.builder
      builder.dynamicCompressionPolicy(args(argsBuilder).build)

    /**
     * @param faultInjectionPolicy The specification for fault injection introduced into traffic to test the
     * resiliency of clients to backend service failure. As part of fault injection,
     * when clients send requests to a backend service, delays can be introduced by
     * Loadbalancer on a percentage of requests before sending those request to the
     * backend service. Similarly requests from clients can be aborted by the
     * Loadbalancer for a percentage of requests. timeout and retryPolicy will be
     * ignored by clients that are configured with a fault_injection_policy.
     * Structure is documented below.
     * @return builder
     */
    def faultInjectionPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs.builder
      builder.faultInjectionPolicy(args(argsBuilder).build)

    /**
     * @param imageOptimizationPolicy (Optional, Beta)
     * Specifies the policy for optimizing images returned in the HTTP response.
     * Structure is documented below.
     * @return builder
     */
    def imageOptimizationPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionImageOptimizationPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionImageOptimizationPolicyArgs.builder
      builder.imageOptimizationPolicy(args(argsBuilder).build)

    /**
     * @param maxStreamDuration Specifies the maximum duration (timeout) for streams on the selected route.
     * Unlike the `Timeout` field where the timeout duration starts from the time the request
     * has been fully processed (known as end-of-stream), the duration in this field
     * is computed from the beginning of the stream until the response has been processed,
     * including all retries. A stream that does not complete in this duration is closed.
     * Structure is documented below.
     * @return builder
     */
    def maxStreamDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionMaxStreamDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionMaxStreamDurationArgs.builder
      builder.maxStreamDuration(args(argsBuilder).build)

    /**
     * @param requestMirrorPolicy Specifies the policy on how requests intended for the route&#39;s backends are
     * shadowed to a separate mirrored backend service. Loadbalancer does not wait for
     * responses from the shadow service. Prior to sending traffic to the shadow
     * service, the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * @return builder
     */
    def requestMirrorPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs.builder
      builder.requestMirrorPolicy(args(argsBuilder).build)

    /**
     * @param retryPolicy Specifies the retry policy associated with this route.
     * Structure is documented below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param timeout Specifies the timeout for the selected route. Timeout is computed from the time
     * the request is has been fully processed (i.e. end-of-stream) up until the
     * response has been completely processed. Timeout includes all retries. If not
     * specified, the default value is 15 seconds.
     * Structure is documented below.
     * @return builder
     */
    def timeout(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionTimeoutArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionTimeoutArgs.builder
      builder.timeout(args(argsBuilder).build)

    /**
     * @param urlRewrite The spec to modify the URL of the request, prior to forwarding the request to
     * the matched service
     * Structure is documented below.
     * @return builder
     */
    def urlRewrite(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs.builder
      builder.urlRewrite(args(argsBuilder).build)

    /**
     * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match
     * occurs. The weights determine the fraction of traffic that flows to their
     * corresponding backend service. If all traffic needs to go to a single backend
     * service, there must be one  weightedBackendService with weight set to a non 0
     * number. Once a backendService is identified and before forwarding the request to
     * the backend service, advanced routing actions like Url rewrites and header
     * transformations are applied depending on additional settings specified in this
     * HttpRouteAction.
     * Structure is documented below.
     * @return builder
     */
    def weightedBackendServices(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs.builder
      builder.weightedBackendServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyArgs.Builder)
    /**
     * @param cacheKeyPolicy The cache key configuration. If not specified, the default behavior depends
     * on the backend type: for Backend Services, the complete request URI is
     * used; for Backend Buckets, the request URI is used without the protocol or
     * host, and only query parameters known to Cloud Storage are included.
     * Structure is documented below.
     * @return builder
     */
    def cacheKeyPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyCacheKeyPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyCacheKeyPolicyArgs.builder
      builder.cacheKeyPolicy(args(argsBuilder).build)

    /**
     * @param clientTtl Specifies a separate client (e.g. browser client) maximum TTL for cached
     * content. This is used to clamp the max-age (or Expires) value sent to the
     * client. With FORCE_CACHE_ALL, the lesser of clientTtl and defaultTtl
     * is used for the response max-age directive, along with a &#34;public&#34;
     * directive. For cacheable content in CACHE_ALL_STATIC mode, clientTtl
     * clamps the max-age from the origin (if specified), or else sets the
     * response max-age directive to the lesser of the clientTtl and defaultTtl,
     * and also ensures a &#34;public&#34; cache-control directive is present. The maximum
     * allowed value is 31,622,400s (1 year). If not specified, Cloud CDN uses
     * 3600s (1 hour) for CACHE_ALL_STATIC mode. Cannot exceed maxTtl.
     * Cannot be specified when cacheMode is USE_ORIGIN_HEADERS.
     * Structure is documented below.
     * @return builder
     */
    def clientTtl(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyClientTtlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyClientTtlArgs.builder
      builder.clientTtl(args(argsBuilder).build)

    /**
     * @param defaultTtl Specifies the default TTL for cached content for responses that do not have
     * an existing valid TTL (max-age or s-maxage). Setting a TTL of &#34;0&#34; means
     * &#34;always revalidate&#34;. The value of defaultTtl cannot be set to a value
     * greater than that of maxTtl. When the cacheMode is set to
     * FORCE_CACHE_ALL, the defaultTtl will overwrite the TTL set in all
     * responses. The maximum allowed value is 31,622,400s (1 year). Infrequently
     * accessed objects may be evicted from the cache before the defined TTL. If
     * not specified, Cloud CDN uses 3600s (1 hour) for CACHE_ALL_STATIC and
     * FORCE_CACHE_ALL modes. Cannot be specified when cacheMode is
     * USE_ORIGIN_HEADERS.
     * Structure is documented below.
     * @return builder
     */
    def defaultTtl(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyDefaultTtlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyDefaultTtlArgs.builder
      builder.defaultTtl(args(argsBuilder).build)

    /**
     * @param maxTtl Specifies the maximum allowed TTL for cached content. Cache directives that
     * attempt to set a max-age or s-maxage higher than this, or an Expires header
     * more than maxTtl seconds in the future will be capped at the value of
     * maxTtl, as if it were the value of an s-maxage Cache-Control directive.
     * Headers sent to the client will not be modified. Setting a TTL of &#34;0&#34; means
     * &#34;always revalidate&#34;. The maximum allowed value is 31,622,400s (1 year).
     * Infrequently accessed objects may be evicted from the cache before the
     * defined TTL. If not specified, Cloud CDN uses 86400s (1 day) for
     * CACHE_ALL_STATIC mode. Can be specified only for CACHE_ALL_STATIC cache
     * mode.
     * Structure is documented below.
     * @return builder
     */
    def maxTtl(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyMaxTtlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyMaxTtlArgs.builder
      builder.maxTtl(args(argsBuilder).build)

    /**
     * @param negativeCachingPolicies Sets a cache TTL for the specified HTTP status code. negativeCaching
     * must be enabled to configure negativeCachingPolicy. Omitting the policy
     * and leaving negativeCaching enabled will use Cloud CDN&#39;s default cache
     * TTLs. Note that when specifying an explicit negativeCachingPolicy, you
     * should take care to specify a cache TTL for all response codes that you
     * wish to cache. Cloud CDN will not apply any default negative caching when
     * a policy exists.
     * Structure is documented below.
     * @return builder
     */
    def negativeCachingPolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyNegativeCachingPolicyArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyNegativeCachingPolicyArgs.builder
      builder.negativeCachingPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param serveWhileStale Serve existing content from the cache (if available) when revalidating
     * content with the origin, or when an error is encountered when refreshing
     * the cache. This setting defines the default &#34;max-stale&#34; duration for any
     * cached responses that do not specify a max-stale directive. Stale
     * responses that exceed the TTL configured here will not be served. The
     * default limit (max-stale) is 86400s (1 day), which will allow stale
     * content to be served up to this limit beyond the max-age (or s-maxage) of
     * a cached response. The maximum allowed value is 604800 (1 week). Set this
     * to zero (0) to disable serve-while-stale.
     * Structure is documented below.
     * @return builder
     */
    def serveWhileStale(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyServeWhileStaleArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyServeWhileStaleArgs.builder
      builder.serveWhileStale(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyNegativeCachingPolicyArgs.Builder)
    /**
     * @param ttl The TTL (in seconds) for which to cache responses with the
     * corresponding status code. The maximum allowed value is 1800s (30
     * minutes). Infrequently accessed objects may be evicted from the cache
     * before the defined TTL.
     * Structure is documented below.
     * @return builder
     */
    def ttl(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyNegativeCachingPolicyTtlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyNegativeCachingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCachePolicyNegativeCachingPolicyTtlArgs.builder
      builder.ttl(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs.Builder)
    /**
     * @param abort The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * @return builder
     */
    def abort(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs.builder
      builder.abort(args(argsBuilder).build)

    /**
     * @param delay The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * @return builder
     */
    def delay(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs.builder
      builder.delay(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs.Builder)
    /**
     * @param fixedDelay Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * @return builder
     */
    def fixedDelay(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs.builder
      builder.fixedDelay(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs.Builder)
    /**
     * @param perTryTimeout Specifies a non-zero timeout per retry attempt.
     * If not specified, will use the timeout set in HttpRouteAction. If timeout in HttpRouteAction is not set,
     * will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * @return builder
     */
    def perTryTimeout(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeoutArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeoutArgs.builder
      builder.perTryTimeout(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs.Builder)
    /**
     * @param regexRewrite The regex rewrite to be applied to the URL. Only one of
     * pathPrefixRewrite, pathTemplateRewrite, or regexRewrite may be
     * specified.
     * Structure is documented below.
     * @return builder
     */
    def regexRewrite(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionUrlRewriteRegexRewriteArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionUrlRewriteRegexRewriteArgs.builder
      builder.regexRewrite(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs.Builder)
    /**
     * @param headerAction Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * @return builder
     */
    def headerAction(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs.Builder)
    /**
     * @param requestHeadersToAdds Headers to add to a matching request prior to forwarding the request to the backendService.
     * Structure is documented below.
     * @return builder
     */
    def requestHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs.builder
      builder.requestHeadersToAdds(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeadersToAdds Headers to add the response prior to sending the response back to the client.
     * Structure is documented below.
     * @return builder
     */
    def responseHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs.builder
      builder.responseHeadersToAdds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapState.Builder)
    /**
     * @param defaultCustomErrorResponsePolicy defaultCustomErrorResponsePolicy specifies how the Load Balancer returns error responses when BackendService or BackendBucket responds with an error.
     * This policy takes effect at the PathMatcher level and applies only when no policy has been defined for the error code at lower levels like RouteRule and PathRule within this PathMatcher. If an error code does not have a policy defined in defaultCustomErrorResponsePolicy, then a policy defined for the error code in UrlMap.defaultCustomErrorResponsePolicy takes effect.
     * For example, consider a UrlMap with the following configuration:
     * UrlMap.defaultCustomErrorResponsePolicy is configured with policies for 5xx and 4xx errors
     * A RouteRule for /coming_soon/ is configured for the error code 404.
     * If the request is for www.myotherdomain.com and a 404 is encountered, the policy under UrlMap.defaultCustomErrorResponsePolicy takes effect. If a 404 response is encountered for the request www.example.com/current_events/, the pathMatcher&#39;s policy takes effect. If however, the request for www.example.com/coming_soon/ encounters a 404, the policy in RouteRule.customErrorResponsePolicy takes effect. If any of the requests in this example encounter a 500 error code, the policy at UrlMap.defaultCustomErrorResponsePolicy takes effect.
     * When used in conjunction with pathMatcher.defaultRouteAction.retryPolicy, retries take precedence. Only once all retries are exhausted, the defaultCustomErrorResponsePolicy is applied. While attempting a retry, if load balancer is successful in reaching the service, the defaultCustomErrorResponsePolicy is ignored and the response from the service is returned to the client.
     * defaultCustomErrorResponsePolicy is supported only for global external Application Load Balancers.
     * Structure is documented below.
     * @return builder
     */
    def defaultCustomErrorResponsePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultCustomErrorResponsePolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultCustomErrorResponsePolicyArgs.builder
      builder.defaultCustomErrorResponsePolicy(args(argsBuilder).build)

    /**
     * @param defaultRouteAction defaultRouteAction takes effect when none of the hostRules match. The load balancer performs advanced routing actions
     * like URL rewrites, header transformations, etc. prior to forwarding the request to the selected backend.
     * If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService
     * is set, defaultRouteAction cannot contain any weightedBackendServices.
     * Only one of defaultRouteAction or defaultUrlRedirect must be set.
     * Structure is documented below.
     * @return builder
     */
    def defaultRouteAction(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionArgs.builder
      builder.defaultRouteAction(args(argsBuilder).build)

    /**
     * @param defaultUrlRedirect When none of the specified hostRules match, the request is redirected to a URL specified
     * by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or
     * defaultRouteAction must not be set.
     * Structure is documented below.
     * @return builder
     */
    def defaultUrlRedirect(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultUrlRedirectArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultUrlRedirectArgs.builder
      builder.defaultUrlRedirect(args(argsBuilder).build)

    /**
     * @param headerAction Specifies changes to request and response headers that need to take effect for
     * the selected backendService. The headerAction specified here take effect after
     * headerAction specified under pathMatcher.
     * Structure is documented below.
     * @return builder
     */
    def headerAction(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapHeaderActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.URLMapState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

    /**
     * @param hostRules The list of HostRules to use against the URL.
     * Structure is documented below.
     * @return builder
     */
    def hostRules(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapHostRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapHostRuleArgs.builder
      builder.hostRules(args.map(_(argsBuilder).build)*)

    /**
     * @param pathMatchers The list of named PathMatchers to use against the URL.
     * Structure is documented below.
     * @return builder
     */
    def pathMatchers(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherArgs.builder
      builder.pathMatchers(args.map(_(argsBuilder).build)*)

    /**
     * @param tests The list of expected URL mapping tests. Request to update this UrlMap will
     * succeed only if all of the test cases pass. You can specify a maximum of 100
     * tests per UrlMap.
     * Structure is documented below.
     * @return builder
     */
    def tests(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapTestArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapTestArgs.builder
      builder.tests(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.URLMapTestArgs.Builder)
    /**
     * @param headers HTTP headers for this request.
     * Structure is documented below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapTestHeaderArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.URLMapTestArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapTestHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.VPNGatewayState.Builder)
    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    def params(args: Endofunction[com.pulumi.gcp.compute.inputs.VPNGatewayParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.VPNGatewayState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.VPNGatewayParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.VPNTunnelCipherSuiteArgs.Builder)
    /**
     * @param phase1 Cipher configuration for phase 1 of the IKE protocol.
     * Structure is documented below.
     * @return builder
     */
    def phase1(args: Endofunction[com.pulumi.gcp.compute.inputs.VPNTunnelCipherSuitePhase1Args.Builder]):
        com.pulumi.gcp.compute.inputs.VPNTunnelCipherSuiteArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.VPNTunnelCipherSuitePhase1Args.builder
      builder.phase1(args(argsBuilder).build)

    /**
     * @param phase2 Cipher configuration for phase 2 of the IKE protocol.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nestedCipherSuitePhase1&#34;&gt;&lt;/a&gt;The `phase1` block supports:
     * @return builder
     */
    def phase2(args: Endofunction[com.pulumi.gcp.compute.inputs.VPNTunnelCipherSuitePhase2Args.Builder]):
        com.pulumi.gcp.compute.inputs.VPNTunnelCipherSuiteArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.VPNTunnelCipherSuitePhase2Args.builder
      builder.phase2(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.VPNTunnelState.Builder)
    /**
     * @param cipherSuite User specified list of ciphers to use for the phase 1 and phase 2 of the IKE protocol.
     * Structure is documented below.
     * @return builder
     */
    def cipherSuite(args: Endofunction[com.pulumi.gcp.compute.inputs.VPNTunnelCipherSuiteArgs.Builder]):
        com.pulumi.gcp.compute.inputs.VPNTunnelState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.VPNTunnelCipherSuiteArgs.builder
      builder.cipherSuite(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    def params(args: Endofunction[com.pulumi.gcp.compute.inputs.VPNTunnelParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.VPNTunnelState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.VPNTunnelParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.WireGroupEndpointArgs.Builder)
    /**
     * @param interconnects Structure is documented below.
     * @return builder
     */
    def interconnects(args: Endofunction[com.pulumi.gcp.compute.inputs.WireGroupEndpointInterconnectArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.WireGroupEndpointArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.WireGroupEndpointInterconnectArgs.builder
      builder.interconnects(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.WireGroupState.Builder)
    /**
     * @param endpoints Endpoints grouped by location, each mapping to interconnect configurations.
     * Structure is documented below.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.gcp.compute.inputs.WireGroupEndpointArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.WireGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.WireGroupEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param topologies Topology details for the wire group configuration.
     * Structure is documented below.
     * @return builder
     */
    def topologies(args: Endofunction[com.pulumi.gcp.compute.inputs.WireGroupTopologyArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.WireGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.WireGroupTopologyArgs.builder
      builder.topologies(args.map(_(argsBuilder).build)*)

    /**
     * @param wireGroupProperties (Optional, Beta)
     * Properties specific to the wire group.
     * Structure is documented below.
     * @return builder
     */
    def wireGroupProperties(args: Endofunction[com.pulumi.gcp.compute.inputs.WireGroupWireGroupPropertiesArgs.Builder]):
        com.pulumi.gcp.compute.inputs.WireGroupState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.WireGroupWireGroupPropertiesArgs.builder
      builder.wireGroupProperties(args(argsBuilder).build)

    /**
     * @param wireProperties Default properties for wires within the group.
     * Structure is documented below.
     * @return builder
     */
    def wireProperties(args: Endofunction[com.pulumi.gcp.compute.inputs.WireGroupWirePropertiesArgs.Builder]):
        com.pulumi.gcp.compute.inputs.WireGroupState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.WireGroupWirePropertiesArgs.builder
      builder.wireProperties(args(argsBuilder).build)

    /**
     * @param wires The single/redundant wire(s) managed by the wire group.
     * Structure is documented below.
     * @return builder
     */
    def wires(args: Endofunction[com.pulumi.gcp.compute.inputs.WireGroupWireArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.WireGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.WireGroupWireArgs.builder
      builder.wires(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.WireGroupTopologyArgs.Builder)
    /**
     * @param endpoints Endpoints grouped by location, each mapping to interconnect configurations.
     * Structure is documented below.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.gcp.compute.inputs.WireGroupTopologyEndpointArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.WireGroupTopologyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.WireGroupTopologyEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.WireGroupWireArgs.Builder)
    /**
     * @param endpoints Endpoints grouped by location, each mapping to interconnect configurations.
     * Structure is documented below.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.gcp.compute.inputs.WireGroupWireEndpointArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.WireGroupWireArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.WireGroupWireEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param wireProperties Default properties for wires within the group.
     * Structure is documented below.
     * @return builder
     */
    def wireProperties(args: Endofunction[com.pulumi.gcp.compute.inputs.WireGroupWireWirePropertyArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.WireGroupWireArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.WireGroupWireWirePropertyArgs.builder
      builder.wireProperties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.ZoneVmExtensionPolicyInstanceSelectorArgs.Builder)
    /**
     * @param labelSelector LabelSelector matches VM labels.
     * Structure is documented below.
     * @return builder
     */
    def labelSelector(args: Endofunction[com.pulumi.gcp.compute.inputs.ZoneVmExtensionPolicyInstanceSelectorLabelSelectorArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ZoneVmExtensionPolicyInstanceSelectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ZoneVmExtensionPolicyInstanceSelectorLabelSelectorArgs.builder
      builder.labelSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.ZoneVmExtensionPolicyState.Builder)
    /**
     * @param extensionPolicies A map of extension names (for example, &#34;ops-agent&#34;) to their corresponding policy configurations.
     * Structure is documented below.
     * @return builder
     */
    def extensionPolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.ZoneVmExtensionPolicyExtensionPolicyArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ZoneVmExtensionPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ZoneVmExtensionPolicyExtensionPolicyArgs.builder
      builder.extensionPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceSelectors Selectors to target VMs for this policy.
     * Structure is documented below.
     * @return builder
     */
    def instanceSelectors(args: Endofunction[com.pulumi.gcp.compute.inputs.ZoneVmExtensionPolicyInstanceSelectorArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ZoneVmExtensionPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ZoneVmExtensionPolicyInstanceSelectorArgs.builder
      builder.instanceSelectors(args.map(_(argsBuilder).build)*)
