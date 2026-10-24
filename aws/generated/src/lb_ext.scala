package jp.ukiba.ko_pulumi
package aws

object lb_ext:
  extension (builder: com.pulumi.aws.lb.ListenerArgs.Builder)
    /**
     * @param defaultActions Configuration block for default actions. See below.
     * @return builder
     */
    inline def defaultActions(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.Builder]*):
        com.pulumi.aws.lb.ListenerArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.builder
      builder.defaultActions(args.map(_(argsBuilder).build)*)

    /**
     * @param mutualAuthentication The mutual authentication configuration information. See below.
     * @return builder
     */
    inline def mutualAuthentication(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerMutualAuthenticationArgs.Builder]):
        com.pulumi.aws.lb.ListenerArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerMutualAuthenticationArgs.builder
      builder.mutualAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lb.ListenerRuleArgs.Builder)
    /**
     * @param actions An Action block. Action blocks are documented below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.Builder]*):
        com.pulumi.aws.lb.ListenerRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param conditions A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.Builder]*):
        com.pulumi.aws.lb.ListenerRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param transforms Configuration block that defines the transform to apply to requests matching this rule. See Transform Blocks below for more details. Once specified, to remove the transform from the rule, remove the `transform` block from the configuration.
     * @return builder
     */
    inline def transforms(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleTransformArgs.Builder]*):
        com.pulumi.aws.lb.ListenerRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleTransformArgs.builder
      builder.transforms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.LoadBalancerArgs.Builder)
    /**
     * @param accessLogs Access Logs block. See below.
     * @return builder
     */
    inline def accessLogs(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerAccessLogsArgs.Builder]):
        com.pulumi.aws.lb.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerAccessLogsArgs.builder
      builder.accessLogs(args(argsBuilder).build)

    /**
     * @param connectionLogs Connection Logs block. See below. Only valid for Load Balancers of type `application`.
     * @return builder
     */
    inline def connectionLogs(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerConnectionLogsArgs.Builder]):
        com.pulumi.aws.lb.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerConnectionLogsArgs.builder
      builder.connectionLogs(args(argsBuilder).build)

    /**
     * @param healthCheckLogs Health Check Logs block. See below. Only valid for Load Balancers of type `application`.
     * @return builder
     */
    inline def healthCheckLogs(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerHealthCheckLogsArgs.Builder]):
        com.pulumi.aws.lb.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerHealthCheckLogsArgs.builder
      builder.healthCheckLogs(args(argsBuilder).build)

    /**
     * @param ipamPools . The IPAM pools to use with the load balancer.  Only valid for Load Balancers of type `application`. See ipamPools for more information.
     * @return builder
     */
    inline def ipamPools(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerIpamPoolsArgs.Builder]):
        com.pulumi.aws.lb.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerIpamPoolsArgs.builder
      builder.ipamPools(args(argsBuilder).build)

    /**
     * @param minimumLoadBalancerCapacity Minimum capacity for a load balancer. Only valid for Load Balancers of type `application` or `network`.
     * @return builder
     */
    inline def minimumLoadBalancerCapacity(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerMinimumLoadBalancerCapacityArgs.Builder]):
        com.pulumi.aws.lb.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerMinimumLoadBalancerCapacityArgs.builder
      builder.minimumLoadBalancerCapacity(args(argsBuilder).build)

    /**
     * @param subnetMappings Subnet mapping block. See below. For Load Balancers of type `network` subnet mappings can only be added.
     * @return builder
     */
    inline def subnetMappings(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerSubnetMappingArgs.Builder]*):
        com.pulumi.aws.lb.LoadBalancerArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerSubnetMappingArgs.builder
      builder.subnetMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.TargetGroupArgs.Builder)
    /**
     * @param healthCheck Health Check configuration block. Detailed below.
     * @return builder
     */
    inline def healthCheck(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupHealthCheckArgs.Builder]):
        com.pulumi.aws.lb.TargetGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupHealthCheckArgs.builder
      builder.healthCheck(args(argsBuilder).build)

    /**
     * @param stickiness Stickiness configuration block. Detailed below.
     * @return builder
     */
    inline def stickiness(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupStickinessArgs.Builder]):
        com.pulumi.aws.lb.TargetGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupStickinessArgs.builder
      builder.stickiness(args(argsBuilder).build)

    /**
     * @param targetFailovers Target failover block. Only applicable for Gateway Load Balancer target groups. See targetFailover for more information.
     * @return builder
     */
    inline def targetFailovers(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupTargetFailoverArgs.Builder]*):
        com.pulumi.aws.lb.TargetGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupTargetFailoverArgs.builder
      builder.targetFailovers(args.map(_(argsBuilder).build)*)

    /**
     * @param targetGroupHealth Target health requirements block. See targetGroupHealth for more information.
     * @return builder
     */
    inline def targetGroupHealth(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthArgs.Builder]):
        com.pulumi.aws.lb.TargetGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthArgs.builder
      builder.targetGroupHealth(args(argsBuilder).build)

    /**
     * @param targetHealthStates Target health state block. Only applicable for Network Load Balancer target groups when `protocol` is `TCP` or `TLS`. See targetHealthState for more information.
     * @return builder
     */
    inline def targetHealthStates(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupTargetHealthStateArgs.Builder]*):
        com.pulumi.aws.lb.TargetGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupTargetHealthStateArgs.builder
      builder.targetHealthStates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleAction.Builder)
    /**
     * @param authenticateCognitos An action to authenticate using Amazon Cognito.
     * Detailed below.
     * @return builder
     */
    inline def authenticateCognitos(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionAuthenticateCognito.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleAction.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionAuthenticateCognito.builder
      builder.authenticateCognitos(args.map(_(argsBuilder).build)*)

    /**
     * @param authenticateOidcs An action to authenticate using OIDC.
     * Detailed below.
     * @return builder
     */
    inline def authenticateOidcs(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionAuthenticateOidc.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleAction.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionAuthenticateOidc.builder
      builder.authenticateOidcs(args.map(_(argsBuilder).build)*)

    /**
     * @param fixedResponses An action to return a fixed response.
     * Detailed below.
     * @return builder
     */
    inline def fixedResponses(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionFixedResponse.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleAction.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionFixedResponse.builder
      builder.fixedResponses(args.map(_(argsBuilder).build)*)

    /**
     * @param forwards An action to forward the request.
     * Detailed below.
     * @return builder
     */
    inline def forwards(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionForward.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleAction.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionForward.builder
      builder.forwards(args.map(_(argsBuilder).build)*)

    /**
     * @param jwtValidations An action to validate using JWT.
     * Detailed below.
     * @return builder
     */
    inline def jwtValidations(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionJwtValidation.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleAction.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionJwtValidation.builder
      builder.jwtValidations(args.map(_(argsBuilder).build)*)

    /**
     * @param redirects An action to redirect the request.
     * Detailed below.
     * @return builder
     */
    inline def redirects(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionRedirect.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleAction.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionRedirect.builder
      builder.redirects(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleActionArgs.Builder)
    /**
     * @param authenticateCognitos An action to authenticate using Amazon Cognito.
     * Detailed below.
     * @return builder
     */
    inline def authenticateCognitos(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionAuthenticateCognitoArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionAuthenticateCognitoArgs.builder
      builder.authenticateCognitos(args.map(_(argsBuilder).build)*)

    /**
     * @param authenticateOidcs An action to authenticate using OIDC.
     * Detailed below.
     * @return builder
     */
    inline def authenticateOidcs(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionAuthenticateOidcArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionAuthenticateOidcArgs.builder
      builder.authenticateOidcs(args.map(_(argsBuilder).build)*)

    /**
     * @param fixedResponses An action to return a fixed response.
     * Detailed below.
     * @return builder
     */
    inline def fixedResponses(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionFixedResponseArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionFixedResponseArgs.builder
      builder.fixedResponses(args.map(_(argsBuilder).build)*)

    /**
     * @param forwards An action to forward the request.
     * Detailed below.
     * @return builder
     */
    inline def forwards(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardArgs.builder
      builder.forwards(args.map(_(argsBuilder).build)*)

    /**
     * @param jwtValidations An action to validate using JWT.
     * Detailed below.
     * @return builder
     */
    inline def jwtValidations(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionJwtValidationArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionJwtValidationArgs.builder
      builder.jwtValidations(args.map(_(argsBuilder).build)*)

    /**
     * @param redirects An action to redirect the request.
     * Detailed below.
     * @return builder
     */
    inline def redirects(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionRedirectArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionRedirectArgs.builder
      builder.redirects(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleActionForward.Builder)
    /**
     * @param stickinesses Target group stickiness for the rule.
     * Detailed below.
     * @return builder
     */
    inline def stickinesses(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardStickiness.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleActionForward.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardStickiness.builder
      builder.stickinesses(args.map(_(argsBuilder).build)*)

    /**
     * @param targetGroups Set of target groups for the action.
     * Detailed below.
     * @return builder
     */
    inline def targetGroups(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardTargetGroup.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleActionForward.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardTargetGroup.builder
      builder.targetGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardArgs.Builder)
    /**
     * @param stickinesses Target group stickiness for the rule.
     * Detailed below.
     * @return builder
     */
    inline def stickinesses(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardStickinessArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardStickinessArgs.builder
      builder.stickinesses(args.map(_(argsBuilder).build)*)

    /**
     * @param targetGroups Set of target groups for the action.
     * Detailed below.
     * @return builder
     */
    inline def targetGroups(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardTargetGroupArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardTargetGroupArgs.builder
      builder.targetGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleActionJwtValidation.Builder)
    /**
     * @param additionalClaims Additional claims to validate.
     * @return builder
     */
    inline def additionalClaims(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionJwtValidationAdditionalClaim.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleActionJwtValidation.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionJwtValidationAdditionalClaim.builder
      builder.additionalClaims(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleActionJwtValidationArgs.Builder)
    /**
     * @param additionalClaims Additional claims to validate.
     * @return builder
     */
    inline def additionalClaims(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionJwtValidationAdditionalClaimArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleActionJwtValidationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionJwtValidationAdditionalClaimArgs.builder
      builder.additionalClaims(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleArgs.Builder)
    /**
     * @param actions List of actions associated with the rule, sorted by `order`.
     * Detailed below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param conditions Set of conditions associated with the rule.
     * Detailed below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param transforms Block for transform to apply to requests that match this rule. Detailed below.
     * @return builder
     */
    inline def transforms(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleTransformArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleTransformArgs.builder
      builder.transforms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleCondition.Builder)
    /**
     * @param hostHeaders Host header patterns to match.
     * Detailed below.
     * @return builder
     */
    inline def hostHeaders(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionHostHeader.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleCondition.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionHostHeader.builder
      builder.hostHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param httpHeaders HTTP header and values to match.
     * Detailed below.
     * @return builder
     */
    inline def httpHeaders(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionHttpHeader.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleCondition.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionHttpHeader.builder
      builder.httpHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param httpRequestMethods Contains a single attribute `values`, which contains a set of HTTP request methods.
     * @return builder
     */
    inline def httpRequestMethods(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionHttpRequestMethod.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleCondition.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionHttpRequestMethod.builder
      builder.httpRequestMethods(args.map(_(argsBuilder).build)*)

    /**
     * @param pathPatterns Path patterns to compare against the request URL.
     * Detailed below.
     * @return builder
     */
    inline def pathPatterns(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionPathPattern.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleCondition.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionPathPattern.builder
      builder.pathPatterns(args.map(_(argsBuilder).build)*)

    /**
     * @param queryStrings Query string parameters to match.
     * Detailed below.
     * @return builder
     */
    inline def queryStrings(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionQueryString.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleCondition.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionQueryString.builder
      builder.queryStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceIps Source IP address to match.
     * Detailed below.
     * @return builder
     */
    inline def sourceIps(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionSourceIp.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleCondition.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionSourceIp.builder
      builder.sourceIps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleConditionArgs.Builder)
    /**
     * @param hostHeaders Host header patterns to match.
     * Detailed below.
     * @return builder
     */
    inline def hostHeaders(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionHostHeaderArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionHostHeaderArgs.builder
      builder.hostHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param httpHeaders HTTP header and values to match.
     * Detailed below.
     * @return builder
     */
    inline def httpHeaders(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionHttpHeaderArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionHttpHeaderArgs.builder
      builder.httpHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param httpRequestMethods Contains a single attribute `values`, which contains a set of HTTP request methods.
     * @return builder
     */
    inline def httpRequestMethods(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionHttpRequestMethodArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionHttpRequestMethodArgs.builder
      builder.httpRequestMethods(args.map(_(argsBuilder).build)*)

    /**
     * @param pathPatterns Path patterns to compare against the request URL.
     * Detailed below.
     * @return builder
     */
    inline def pathPatterns(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionPathPatternArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionPathPatternArgs.builder
      builder.pathPatterns(args.map(_(argsBuilder).build)*)

    /**
     * @param queryStrings Query string parameters to match.
     * Detailed below.
     * @return builder
     */
    inline def queryStrings(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionQueryStringArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionQueryStringArgs.builder
      builder.queryStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceIps Source IP address to match.
     * Detailed below.
     * @return builder
     */
    inline def sourceIps(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionSourceIpArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionSourceIpArgs.builder
      builder.sourceIps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleConditionQueryString.Builder)
    /**
     * @param values Set of source IP addresses in CIDR format for Application Load Balancers
     * @return builder
     */
    inline def values(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionQueryStringValue.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleConditionQueryString.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionQueryStringValue.builder
      builder.values(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleConditionQueryStringArgs.Builder)
    /**
     * @param values Set of source IP addresses in CIDR format for Application Load Balancers
     * @return builder
     */
    inline def values(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionQueryStringValueArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleConditionQueryStringArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionQueryStringValueArgs.builder
      builder.values(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRulePlainArgs.Builder)
    /**
     * @param actions List of actions associated with the rule, sorted by `order`.
     * Detailed below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleAction.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRulePlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleAction.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param conditions Set of conditions associated with the rule.
     * Detailed below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleCondition.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRulePlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleCondition.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param transforms Block for transform to apply to requests that match this rule. Detailed below.
     * @return builder
     */
    inline def transforms(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleTransform.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRulePlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleTransform.builder
      builder.transforms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleTransform.Builder)
    /**
     * @param hostHeaderRewriteConfigs Block for host header rewrite. Detailed below.
     * @return builder
     */
    inline def hostHeaderRewriteConfigs(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleTransformHostHeaderRewriteConfig.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleTransform.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleTransformHostHeaderRewriteConfig.builder
      builder.hostHeaderRewriteConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param urlRewriteConfigs Block for URL rewrite. Detailed below.
     * @return builder
     */
    inline def urlRewriteConfigs(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleTransformUrlRewriteConfig.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleTransform.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleTransformUrlRewriteConfig.builder
      builder.urlRewriteConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleTransformArgs.Builder)
    /**
     * @param hostHeaderRewriteConfigs Block for host header rewrite. Detailed below.
     * @return builder
     */
    inline def hostHeaderRewriteConfigs(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleTransformHostHeaderRewriteConfigArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleTransformArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleTransformHostHeaderRewriteConfigArgs.builder
      builder.hostHeaderRewriteConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param urlRewriteConfigs Block for URL rewrite. Detailed below.
     * @return builder
     */
    inline def urlRewriteConfigs(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleTransformUrlRewriteConfigArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleTransformArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleTransformUrlRewriteConfigArgs.builder
      builder.urlRewriteConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleTransformHostHeaderRewriteConfig.Builder)
    /**
     * @param rewrites Block for URL rewrite configuration. Detailed below.
     * @return builder
     */
    inline def rewrites(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleTransformHostHeaderRewriteConfigRewrite.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleTransformHostHeaderRewriteConfig.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleTransformHostHeaderRewriteConfigRewrite.builder
      builder.rewrites(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleTransformHostHeaderRewriteConfigArgs.Builder)
    /**
     * @param rewrites Block for URL rewrite configuration. Detailed below.
     * @return builder
     */
    inline def rewrites(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleTransformHostHeaderRewriteConfigRewriteArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleTransformHostHeaderRewriteConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleTransformHostHeaderRewriteConfigRewriteArgs.builder
      builder.rewrites(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleTransformUrlRewriteConfig.Builder)
    /**
     * @param rewrites Block for URL rewrite configuration. Detailed below.
     * @return builder
     */
    inline def rewrites(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleTransformUrlRewriteConfigRewrite.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleTransformUrlRewriteConfig.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleTransformUrlRewriteConfigRewrite.builder
      builder.rewrites(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleTransformUrlRewriteConfigArgs.Builder)
    /**
     * @param rewrites Block for URL rewrite configuration. Detailed below.
     * @return builder
     */
    inline def rewrites(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleTransformUrlRewriteConfigRewriteArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleTransformUrlRewriteConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleTransformUrlRewriteConfigRewriteArgs.builder
      builder.rewrites(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.Builder)
    /**
     * @param authenticateCognito Configuration block for using Amazon Cognito to authenticate users. Specify only when `type` is `authenticate-cognito`. See below.
     * @return builder
     */
    inline def authenticateCognito(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionAuthenticateCognitoArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionAuthenticateCognitoArgs.builder
      builder.authenticateCognito(args(argsBuilder).build)

    /**
     * @param authenticateOidc Configuration block for an identity provider that is compliant with OpenID Connect (OIDC). Specify only when `type` is `authenticate-oidc`. See below.
     * @return builder
     */
    inline def authenticateOidc(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionAuthenticateOidcArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionAuthenticateOidcArgs.builder
      builder.authenticateOidc(args(argsBuilder).build)

    /**
     * @param fixedResponse Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
     * @return builder
     */
    inline def fixedResponse(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionFixedResponseArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionFixedResponseArgs.builder
      builder.fixedResponse(args(argsBuilder).build)

    /**
     * @param forward Configuration block for creating an action that distributes requests among one or more target groups. Specify only if `type` is `forward`. See below.
     * @return builder
     */
    inline def forward(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionForwardArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionForwardArgs.builder
      builder.forward(args(argsBuilder).build)

    /**
     * @param jwtValidation Configuration block for creating a JWT validation action. Required if `type` is `jwt-validation`.
     * @return builder
     */
    inline def jwtValidation(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionJwtValidationArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionJwtValidationArgs.builder
      builder.jwtValidation(args(argsBuilder).build)

    /**
     * @param redirect Configuration block for creating a redirect action. Required if `type` is `redirect`. See below.
     * @return builder
     */
    inline def redirect(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionRedirectArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionRedirectArgs.builder
      builder.redirect(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerDefaultActionForwardArgs.Builder)
    /**
     * @param stickiness Configuration block for target group stickiness for the rule. See below.
     * @return builder
     */
    inline def stickiness(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionForwardStickinessArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerDefaultActionForwardArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionForwardStickinessArgs.builder
      builder.stickiness(args(argsBuilder).build)

    /**
     * @param targetGroups Set of 1-5 target group blocks. See below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def targetGroups(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionForwardTargetGroupArgs.Builder]*):
        com.pulumi.aws.lb.inputs.ListenerDefaultActionForwardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionForwardTargetGroupArgs.builder
      builder.targetGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerDefaultActionJwtValidationArgs.Builder)
    /**
     * @param additionalClaims Repeatable configuration block for additional claims to validate.
     * @return builder
     */
    inline def additionalClaims(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionJwtValidationAdditionalClaimArgs.Builder]*):
        com.pulumi.aws.lb.inputs.ListenerDefaultActionJwtValidationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionJwtValidationAdditionalClaimArgs.builder
      builder.additionalClaims(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.Builder)
    /**
     * @param authenticateCognito Information for creating an authenticate action using Cognito. Required if `type` is `authenticate-cognito`.
     * @return builder
     */
    inline def authenticateCognito(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionAuthenticateCognitoArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionAuthenticateCognitoArgs.builder
      builder.authenticateCognito(args(argsBuilder).build)

    /**
     * @param authenticateOidc Information for creating an authenticate action using OIDC. Required if `type` is `authenticate-oidc`.
     * @return builder
     */
    inline def authenticateOidc(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionAuthenticateOidcArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionAuthenticateOidcArgs.builder
      builder.authenticateOidc(args(argsBuilder).build)

    /**
     * @param fixedResponse Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
     * @return builder
     */
    inline def fixedResponse(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionFixedResponseArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionFixedResponseArgs.builder
      builder.fixedResponse(args(argsBuilder).build)

    /**
     * @param forward Configuration block for creating an action that distributes requests among one or more target groups.
     * Specify only if `type` is `forward`.
     * Cannot be specified with `targetGroupArn`.
     * @return builder
     */
    inline def forward(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionForwardArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionForwardArgs.builder
      builder.forward(args(argsBuilder).build)

    /**
     * @param jwtValidation Information for creating a JWT validation action. Required if `type` is `jwt-validation`.
     * @return builder
     */
    inline def jwtValidation(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionJwtValidationArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionJwtValidationArgs.builder
      builder.jwtValidation(args(argsBuilder).build)

    /**
     * @param redirect Information for creating a redirect action. Required if `type` is `redirect`.
     * @return builder
     */
    inline def redirect(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionRedirectArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionRedirectArgs.builder
      builder.redirect(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerRuleActionForwardArgs.Builder)
    /**
     * @param stickiness The target group stickiness for the rule.
     * @return builder
     */
    inline def stickiness(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionForwardStickinessArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleActionForwardArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionForwardStickinessArgs.builder
      builder.stickiness(args(argsBuilder).build)

    /**
     * @param targetGroups One or more target group blocks.
     * @return builder
     */
    inline def targetGroups(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionForwardTargetGroupArgs.Builder]*):
        com.pulumi.aws.lb.inputs.ListenerRuleActionForwardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionForwardTargetGroupArgs.builder
      builder.targetGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerRuleActionJwtValidationArgs.Builder)
    /**
     * @param additionalClaims Repeatable configuration block for additional claims to validate.
     * @return builder
     */
    inline def additionalClaims(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionJwtValidationAdditionalClaimArgs.Builder]*):
        com.pulumi.aws.lb.inputs.ListenerRuleActionJwtValidationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionJwtValidationAdditionalClaimArgs.builder
      builder.additionalClaims(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.Builder)
    /**
     * @param hostHeader Host header patterns to match. Host Header block fields documented below.
     * @return builder
     */
    inline def hostHeader(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleConditionHostHeaderArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleConditionHostHeaderArgs.builder
      builder.hostHeader(args(argsBuilder).build)

    /**
     * @param httpHeader HTTP headers to match. HTTP Header block fields documented below.
     * @return builder
     */
    inline def httpHeader(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleConditionHttpHeaderArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleConditionHttpHeaderArgs.builder
      builder.httpHeader(args(argsBuilder).build)

    /**
     * @param httpRequestMethod Contains a single `values` item which is a list of HTTP request methods or verbs to match. Maximum size is 40 characters. Only allowed characters are A-Z, hyphen (-) and underscore (\_). Comparison is case sensitive. Wildcards are not supported. Only one needs to match for the condition to be satisfied. AWS recommends that GET and HEAD requests are routed in the same way because the response to a HEAD request may be cached.
     * @return builder
     */
    inline def httpRequestMethod(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleConditionHttpRequestMethodArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleConditionHttpRequestMethodArgs.builder
      builder.httpRequestMethod(args(argsBuilder).build)

    /**
     * @param pathPattern Path patterns to match against the request URL. Path Pattern block fields documented below.
     * @return builder
     */
    inline def pathPattern(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleConditionPathPatternArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleConditionPathPatternArgs.builder
      builder.pathPattern(args(argsBuilder).build)

    /**
     * @param queryStrings Query strings to match. Query String block fields documented below.
     * @return builder
     */
    inline def queryStrings(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleConditionQueryStringArgs.Builder]*):
        com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleConditionQueryStringArgs.builder
      builder.queryStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceIp Source IP address to match. For ALB, use `values` to specify CIDR ranges. For NLB, use `ipAddressType` to match the IP address type (`ipv4` or `ipv6`). Source IP block fields documented below.
     * 
     * &gt; **NOTE::** Exactly one of `hostHeader`, `httpHeader`, `httpRequestMethod`, `pathPattern`, `queryString` or `sourceIp` must be set per condition.
     * @return builder
     */
    inline def sourceIp(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleConditionSourceIpArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleConditionSourceIpArgs.builder
      builder.sourceIp(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerRuleState.Builder)
    /**
     * @param actions An Action block. Action blocks are documented below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.Builder]*):
        com.pulumi.aws.lb.inputs.ListenerRuleState.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param conditions A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.Builder]*):
        com.pulumi.aws.lb.inputs.ListenerRuleState.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param transforms Configuration block that defines the transform to apply to requests matching this rule. See Transform Blocks below for more details. Once specified, to remove the transform from the rule, remove the `transform` block from the configuration.
     * @return builder
     */
    inline def transforms(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleTransformArgs.Builder]*):
        com.pulumi.aws.lb.inputs.ListenerRuleState.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleTransformArgs.builder
      builder.transforms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerRuleTransformArgs.Builder)
    /**
     * @param hostHeaderRewriteConfig Configuration block for host header rewrite. Required if `type` is `host-header-rewrite`. See Host Header Rewrite Config Blocks below.
     * @return builder
     */
    inline def hostHeaderRewriteConfig(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleTransformHostHeaderRewriteConfigArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleTransformHostHeaderRewriteConfigArgs.builder
      builder.hostHeaderRewriteConfig(args(argsBuilder).build)

    /**
     * @param urlRewriteConfig Configuration block for URL rewrite. Required if `type` is `url-rewrite`. See URL Rewrite Config Blocks below.
     * @return builder
     */
    inline def urlRewriteConfig(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleTransformUrlRewriteConfigArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleTransformUrlRewriteConfigArgs.builder
      builder.urlRewriteConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerRuleTransformHostHeaderRewriteConfigArgs.Builder)
    /**
     * @param rewrite Block for host header rewrite configuration. Only one block is accepted. See Rewrite Blocks below.
     * @return builder
     */
    inline def rewrite(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleTransformHostHeaderRewriteConfigRewriteArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleTransformHostHeaderRewriteConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleTransformHostHeaderRewriteConfigRewriteArgs.builder
      builder.rewrite(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerRuleTransformUrlRewriteConfigArgs.Builder)
    /**
     * @param rewrite Block for URL rewrite configuration. Only one block is accepted. See Rewrite Blocks below.
     * @return builder
     */
    inline def rewrite(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleTransformUrlRewriteConfigRewriteArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleTransformUrlRewriteConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleTransformUrlRewriteConfigRewriteArgs.builder
      builder.rewrite(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerState.Builder)
    /**
     * @param defaultActions Configuration block for default actions. See below.
     * @return builder
     */
    inline def defaultActions(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.Builder]*):
        com.pulumi.aws.lb.inputs.ListenerState.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.builder
      builder.defaultActions(args.map(_(argsBuilder).build)*)

    /**
     * @param mutualAuthentication The mutual authentication configuration information. See below.
     * @return builder
     */
    inline def mutualAuthentication(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerMutualAuthenticationArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerState.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerMutualAuthenticationArgs.builder
      builder.mutualAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lb.inputs.LoadBalancerState.Builder)
    /**
     * @param accessLogs Access Logs block. See below.
     * @return builder
     */
    inline def accessLogs(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerAccessLogsArgs.Builder]):
        com.pulumi.aws.lb.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerAccessLogsArgs.builder
      builder.accessLogs(args(argsBuilder).build)

    /**
     * @param connectionLogs Connection Logs block. See below. Only valid for Load Balancers of type `application`.
     * @return builder
     */
    inline def connectionLogs(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerConnectionLogsArgs.Builder]):
        com.pulumi.aws.lb.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerConnectionLogsArgs.builder
      builder.connectionLogs(args(argsBuilder).build)

    /**
     * @param healthCheckLogs Health Check Logs block. See below. Only valid for Load Balancers of type `application`.
     * @return builder
     */
    inline def healthCheckLogs(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerHealthCheckLogsArgs.Builder]):
        com.pulumi.aws.lb.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerHealthCheckLogsArgs.builder
      builder.healthCheckLogs(args(argsBuilder).build)

    /**
     * @param ipamPools . The IPAM pools to use with the load balancer.  Only valid for Load Balancers of type `application`. See ipamPools for more information.
     * @return builder
     */
    inline def ipamPools(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerIpamPoolsArgs.Builder]):
        com.pulumi.aws.lb.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerIpamPoolsArgs.builder
      builder.ipamPools(args(argsBuilder).build)

    /**
     * @param minimumLoadBalancerCapacity Minimum capacity for a load balancer. Only valid for Load Balancers of type `application` or `network`.
     * @return builder
     */
    inline def minimumLoadBalancerCapacity(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerMinimumLoadBalancerCapacityArgs.Builder]):
        com.pulumi.aws.lb.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerMinimumLoadBalancerCapacityArgs.builder
      builder.minimumLoadBalancerCapacity(args(argsBuilder).build)

    /**
     * @param subnetMappings Subnet mapping block. See below. For Load Balancers of type `network` subnet mappings can only be added.
     * @return builder
     */
    inline def subnetMappings(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerSubnetMappingArgs.Builder]*):
        com.pulumi.aws.lb.inputs.LoadBalancerState.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerSubnetMappingArgs.builder
      builder.subnetMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.TargetGroupState.Builder)
    /**
     * @param healthCheck Health Check configuration block. Detailed below.
     * @return builder
     */
    inline def healthCheck(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupHealthCheckArgs.Builder]):
        com.pulumi.aws.lb.inputs.TargetGroupState.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupHealthCheckArgs.builder
      builder.healthCheck(args(argsBuilder).build)

    /**
     * @param stickiness Stickiness configuration block. Detailed below.
     * @return builder
     */
    inline def stickiness(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupStickinessArgs.Builder]):
        com.pulumi.aws.lb.inputs.TargetGroupState.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupStickinessArgs.builder
      builder.stickiness(args(argsBuilder).build)

    /**
     * @param targetFailovers Target failover block. Only applicable for Gateway Load Balancer target groups. See targetFailover for more information.
     * @return builder
     */
    inline def targetFailovers(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupTargetFailoverArgs.Builder]*):
        com.pulumi.aws.lb.inputs.TargetGroupState.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupTargetFailoverArgs.builder
      builder.targetFailovers(args.map(_(argsBuilder).build)*)

    /**
     * @param targetGroupHealth Target health requirements block. See targetGroupHealth for more information.
     * @return builder
     */
    inline def targetGroupHealth(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthArgs.Builder]):
        com.pulumi.aws.lb.inputs.TargetGroupState.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthArgs.builder
      builder.targetGroupHealth(args(argsBuilder).build)

    /**
     * @param targetHealthStates Target health state block. Only applicable for Network Load Balancer target groups when `protocol` is `TCP` or `TLS`. See targetHealthState for more information.
     * @return builder
     */
    inline def targetHealthStates(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupTargetHealthStateArgs.Builder]*):
        com.pulumi.aws.lb.inputs.TargetGroupState.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupTargetHealthStateArgs.builder
      builder.targetHealthStates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthArgs.Builder)
    /**
     * @param dnsFailover Block to configure DNS Failover requirements. See DNS Failover below for details on attributes.
     * @return builder
     */
    inline def dnsFailover(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthDnsFailoverArgs.Builder]):
        com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthDnsFailoverArgs.builder
      builder.dnsFailover(args(argsBuilder).build)

    /**
     * @param unhealthyStateRouting Block to configure Unhealthy State Routing requirements. See Unhealthy State Routing below for details on attributes.
     * @return builder
     */
    inline def unhealthyStateRouting(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthUnhealthyStateRoutingArgs.Builder]):
        com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthUnhealthyStateRoutingArgs.builder
      builder.unhealthyStateRouting(args(argsBuilder).build)
