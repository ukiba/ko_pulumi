package jp.ukiba.ko_pulumi
package aws

object apigatewayv2_ext:
  extension (builder: com.pulumi.aws.apigatewayv2.ApiArgs.Builder)
    /**
     * @param corsConfiguration Cross-origin resource sharing (CORS) [configuration](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html). Applicable for HTTP APIs. See `corsConfiguration` Block below.
     * @return builder
     */
    inline def corsConfiguration(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.ApiCorsConfigurationArgs.Builder]):
        com.pulumi.aws.apigatewayv2.ApiArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.ApiCorsConfigurationArgs.builder
      builder.corsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.AuthorizerArgs.Builder)
    /**
     * @param jwtConfiguration Configuration of a JWT authorizer. Required for the `JWT` authorizer type. Supported only for HTTP APIs. See `jwtConfiguration` Block below.
     * @return builder
     */
    inline def jwtConfiguration(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.AuthorizerJwtConfigurationArgs.Builder]):
        com.pulumi.aws.apigatewayv2.AuthorizerArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.AuthorizerJwtConfigurationArgs.builder
      builder.jwtConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.DomainNameArgs.Builder)
    /**
     * @param domainNameConfiguration Domain name configuration. See below.
     * @return builder
     */
    inline def domainNameConfiguration(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.DomainNameDomainNameConfigurationArgs.Builder]):
        com.pulumi.aws.apigatewayv2.DomainNameArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.DomainNameDomainNameConfigurationArgs.builder
      builder.domainNameConfiguration(args(argsBuilder).build)

    /**
     * @param mutualTlsAuthentication Mutual TLS authentication configuration for the domain name.
     * @return builder
     */
    inline def mutualTlsAuthentication(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.DomainNameMutualTlsAuthenticationArgs.Builder]):
        com.pulumi.aws.apigatewayv2.DomainNameArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.DomainNameMutualTlsAuthenticationArgs.builder
      builder.mutualTlsAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.IntegrationArgs.Builder)
    /**
     * @param responseParameters Mappings to transform the HTTP response from a backend integration before returning the response to clients. Supported only for HTTP APIs.
     * @return builder
     */
    inline def responseParameters(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.IntegrationResponseParameterArgs.Builder]*):
        com.pulumi.aws.apigatewayv2.IntegrationArgs.Builder =
      def argsBuilder = com.pulumi.aws.apigatewayv2.inputs.IntegrationResponseParameterArgs.builder
      builder.responseParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param tlsConfig TLS configuration for a private integration. Supported only for HTTP APIs.
     * @return builder
     */
    inline def tlsConfig(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.IntegrationTlsConfigArgs.Builder]):
        com.pulumi.aws.apigatewayv2.IntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.IntegrationTlsConfigArgs.builder
      builder.tlsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.RouteArgs.Builder)
    /**
     * @param requestParameters Request parameters for the route. Supported only for WebSocket APIs. See `requestParameter` Block below.
     * @return builder
     */
    inline def requestParameters(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.RouteRequestParameterArgs.Builder]*):
        com.pulumi.aws.apigatewayv2.RouteArgs.Builder =
      def argsBuilder = com.pulumi.aws.apigatewayv2.inputs.RouteRequestParameterArgs.builder
      builder.requestParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.apigatewayv2.RoutingRuleArgs.Builder)
    /**
     * @param actions Configuration of resulting action based on matching routing rules condition. See below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.RoutingRuleActionArgs.Builder]*):
        com.pulumi.aws.apigatewayv2.RoutingRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.apigatewayv2.inputs.RoutingRuleActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param conditions Conditions configuration. See below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionArgs.Builder]*):
        com.pulumi.aws.apigatewayv2.RoutingRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.apigatewayv2.StageArgs.Builder)
    /**
     * @param accessLogSettings Settings for logging access in this stage. Use the `aws.apigateway.Account` resource to configure [permissions for CloudWatch Logging](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html#set-up-access-logging-permissions).
     * @return builder
     */
    inline def accessLogSettings(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.StageAccessLogSettingsArgs.Builder]):
        com.pulumi.aws.apigatewayv2.StageArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.StageAccessLogSettingsArgs.builder
      builder.accessLogSettings(args(argsBuilder).build)

    /**
     * @param defaultRouteSettings Default route settings for the stage.
     * @return builder
     */
    inline def defaultRouteSettings(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.StageDefaultRouteSettingsArgs.Builder]):
        com.pulumi.aws.apigatewayv2.StageArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.StageDefaultRouteSettingsArgs.builder
      builder.defaultRouteSettings(args(argsBuilder).build)

    /**
     * @param routeSettings Route settings for the stage.
     * @return builder
     */
    inline def routeSettings(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.StageRouteSettingArgs.Builder]*):
        com.pulumi.aws.apigatewayv2.StageArgs.Builder =
      def argsBuilder = com.pulumi.aws.apigatewayv2.inputs.StageRouteSettingArgs.builder
      builder.routeSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.apigatewayv2.inputs.ApiState.Builder)
    /**
     * @param corsConfiguration Cross-origin resource sharing (CORS) [configuration](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html). Applicable for HTTP APIs. See `corsConfiguration` Block below.
     * @return builder
     */
    inline def corsConfiguration(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.ApiCorsConfigurationArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.ApiState.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.ApiCorsConfigurationArgs.builder
      builder.corsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.inputs.AuthorizerState.Builder)
    /**
     * @param jwtConfiguration Configuration of a JWT authorizer. Required for the `JWT` authorizer type. Supported only for HTTP APIs. See `jwtConfiguration` Block below.
     * @return builder
     */
    inline def jwtConfiguration(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.AuthorizerJwtConfigurationArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.AuthorizerState.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.AuthorizerJwtConfigurationArgs.builder
      builder.jwtConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.inputs.DomainNameState.Builder)
    /**
     * @param domainNameConfiguration Domain name configuration. See below.
     * @return builder
     */
    inline def domainNameConfiguration(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.DomainNameDomainNameConfigurationArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.DomainNameState.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.DomainNameDomainNameConfigurationArgs.builder
      builder.domainNameConfiguration(args(argsBuilder).build)

    /**
     * @param mutualTlsAuthentication Mutual TLS authentication configuration for the domain name.
     * @return builder
     */
    inline def mutualTlsAuthentication(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.DomainNameMutualTlsAuthenticationArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.DomainNameState.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.DomainNameMutualTlsAuthenticationArgs.builder
      builder.mutualTlsAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.inputs.IntegrationState.Builder)
    /**
     * @param responseParameters Mappings to transform the HTTP response from a backend integration before returning the response to clients. Supported only for HTTP APIs.
     * @return builder
     */
    inline def responseParameters(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.IntegrationResponseParameterArgs.Builder]*):
        com.pulumi.aws.apigatewayv2.inputs.IntegrationState.Builder =
      def argsBuilder = com.pulumi.aws.apigatewayv2.inputs.IntegrationResponseParameterArgs.builder
      builder.responseParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param tlsConfig TLS configuration for a private integration. Supported only for HTTP APIs.
     * @return builder
     */
    inline def tlsConfig(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.IntegrationTlsConfigArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.IntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.IntegrationTlsConfigArgs.builder
      builder.tlsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.inputs.RouteState.Builder)
    /**
     * @param requestParameters Request parameters for the route. Supported only for WebSocket APIs. See `requestParameter` Block below.
     * @return builder
     */
    inline def requestParameters(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.RouteRequestParameterArgs.Builder]*):
        com.pulumi.aws.apigatewayv2.inputs.RouteState.Builder =
      def argsBuilder = com.pulumi.aws.apigatewayv2.inputs.RouteRequestParameterArgs.builder
      builder.requestParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.apigatewayv2.inputs.RoutingRuleActionArgs.Builder)
    /**
     * @param invokeApi Configuration to invoke a stage of a target API. Only REST APIs are supported. See below.
     * @return builder
     */
    inline def invokeApi(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.RoutingRuleActionInvokeApiArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.RoutingRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.RoutingRuleActionInvokeApiArgs.builder
      builder.invokeApi(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionArgs.Builder)
    /**
     * @param matchBasePaths Base path to be matched. See below.
     * @return builder
     */
    inline def matchBasePaths(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionMatchBasePathsArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionMatchBasePathsArgs.builder
      builder.matchBasePaths(args(argsBuilder).build)

    /**
     * @param matchHeaders Headers to be matched. See below.
     * @return builder
     */
    inline def matchHeaders(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionMatchHeadersArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionMatchHeadersArgs.builder
      builder.matchHeaders(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionMatchHeadersArgs.Builder)
    /**
     * @param anyOf Configuration of the headers to be matched. There is a match if any of the header name and header value globs are matched. See below.
     * @return builder
     */
    inline def anyOf(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionMatchHeadersAnyOfArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionMatchHeadersArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionMatchHeadersAnyOfArgs.builder
      builder.anyOf(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.inputs.RoutingRuleState.Builder)
    /**
     * @param actions Configuration of resulting action based on matching routing rules condition. See below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.RoutingRuleActionArgs.Builder]*):
        com.pulumi.aws.apigatewayv2.inputs.RoutingRuleState.Builder =
      def argsBuilder = com.pulumi.aws.apigatewayv2.inputs.RoutingRuleActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param conditions Conditions configuration. See below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionArgs.Builder]*):
        com.pulumi.aws.apigatewayv2.inputs.RoutingRuleState.Builder =
      def argsBuilder = com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.apigatewayv2.inputs.StageState.Builder)
    /**
     * @param accessLogSettings Settings for logging access in this stage. Use the `aws.apigateway.Account` resource to configure [permissions for CloudWatch Logging](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html#set-up-access-logging-permissions).
     * @return builder
     */
    inline def accessLogSettings(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.StageAccessLogSettingsArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.StageState.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.StageAccessLogSettingsArgs.builder
      builder.accessLogSettings(args(argsBuilder).build)

    /**
     * @param defaultRouteSettings Default route settings for the stage.
     * @return builder
     */
    inline def defaultRouteSettings(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.StageDefaultRouteSettingsArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.StageState.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.StageDefaultRouteSettingsArgs.builder
      builder.defaultRouteSettings(args(argsBuilder).build)

    /**
     * @param routeSettings Route settings for the stage.
     * @return builder
     */
    inline def routeSettings(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.StageRouteSettingArgs.Builder]*):
        com.pulumi.aws.apigatewayv2.inputs.StageState.Builder =
      def argsBuilder = com.pulumi.aws.apigatewayv2.inputs.StageRouteSettingArgs.builder
      builder.routeSettings(args.map(_(argsBuilder).build)*)
