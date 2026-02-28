package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object apigatewayv2:
  /**
   * Manages an Amazon API Gateway Version 2 stage.
   *  More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
   */
  def Stage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.StageArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigatewayv2.StageArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.apigatewayv2.Stage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.DomainNameArgs.Builder)
    /**
     * @param domainNameConfiguration Domain name configuration. See below.
     * @return builder
     */
    def domainNameConfiguration(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.DomainNameDomainNameConfigurationArgs.Builder]):
        com.pulumi.aws.apigatewayv2.DomainNameArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.DomainNameDomainNameConfigurationArgs.builder
      builder.domainNameConfiguration(args(argsBuilder).build)

    /**
     * @param mutualTlsAuthentication Mutual TLS authentication configuration for the domain name.
     * @return builder
     */
    def mutualTlsAuthentication(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.DomainNameMutualTlsAuthenticationArgs.Builder]):
        com.pulumi.aws.apigatewayv2.DomainNameArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.DomainNameMutualTlsAuthenticationArgs.builder
      builder.mutualTlsAuthentication(args(argsBuilder).build)

  /**
   * Manages an Amazon API Gateway Version 2 integration.
   *  More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
   */
  def Integration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.IntegrationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigatewayv2.IntegrationArgs.builder
    
    com.pulumi.aws.apigatewayv2.Integration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Amazon API Gateway Version 2 domain name.
   *  More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html).
   *  
   *  &gt; **Note:** This resource establishes ownership of and the TLS settings for
   *  a particular domain name. An API stage can be associated with the domain name using the `aws.apigatewayv2.ApiMapping` resource.
   */
  def DomainName(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.DomainNameArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigatewayv2.DomainNameArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.apigatewayv2.DomainName(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS API Gateway V2 Routing Rule. */
  def RoutingRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.RoutingRuleArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigatewayv2.RoutingRuleArgs.builder
    
    com.pulumi.aws.apigatewayv2.RoutingRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.RouteArgs.Builder)
    /**
     * @param requestParameters Request parameters for the route. Supported only for WebSocket APIs.
     * @return builder
     */
    def requestParameters(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.RouteRequestParameterArgs.Builder]*):
        com.pulumi.aws.apigatewayv2.RouteArgs.Builder =
      def argsBuilder = com.pulumi.aws.apigatewayv2.inputs.RouteRequestParameterArgs.builder
      builder.requestParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.apigatewayv2.RoutingRuleArgs.Builder)
    /**
     * @param actions Configuration of resulting action based on matching routing rules condition. See below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.RoutingRuleActionArgs.Builder]*):
        com.pulumi.aws.apigatewayv2.RoutingRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.apigatewayv2.inputs.RoutingRuleActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param conditions Conditions configuration. See below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionArgs.Builder]*):
        com.pulumi.aws.apigatewayv2.RoutingRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  /**
   * Manages an Amazon API Gateway Version 2 route.
   *  More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/welcome.html) for [WebSocket](https://docs.aws.amazon.com/apigateway/latest/developerguide/websocket-api-develop-routes.html) and [HTTP](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-routes.html) APIs.
   */
  def Route(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.RouteArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigatewayv2.RouteArgs.builder
    
    com.pulumi.aws.apigatewayv2.Route(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Amazon API Gateway Version 2 authorizer.
   *  More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
   */
  def Authorizer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.AuthorizerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigatewayv2.AuthorizerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.apigatewayv2.Authorizer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.AuthorizerArgs.Builder)
    /**
     * @param jwtConfiguration Configuration of a JWT authorizer. Required for the `JWT` authorizer type.
     *  Supported only for HTTP APIs.
     * @return builder
     */
    def jwtConfiguration(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.AuthorizerJwtConfigurationArgs.Builder]):
        com.pulumi.aws.apigatewayv2.AuthorizerArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.AuthorizerJwtConfigurationArgs.builder
      builder.jwtConfiguration(args(argsBuilder).build)

  type Apigatewayv2Functions = com.pulumi.aws.apigatewayv2.Apigatewayv2Functions
  object Apigatewayv2Functions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.apigatewayv2.Apigatewayv2Functions.*
  extension (self: Apigatewayv2Functions.type)
    /** Provides details about a specific Amazon API Gateway Version 2 API. */
    def getApi(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.GetApiArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.apigatewayv2.outputs.GetApiResult] =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.GetApiArgs.builder
      com.pulumi.aws.apigatewayv2.Apigatewayv2Functions.getApi(args(argsBuilder).build)

    /** Provides details about a specific Amazon API Gateway Version 2 API. */
    def getApiPlain(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.GetApiPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.apigatewayv2.outputs.GetApiResult] =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.GetApiPlainArgs.builder
      com.pulumi.aws.apigatewayv2.Apigatewayv2Functions.getApiPlain(args(argsBuilder).build)

    /** Provides details about multiple Amazon API Gateway Version 2 APIs. */
    def getApis(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.GetApisArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.apigatewayv2.outputs.GetApisResult] =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.GetApisArgs.builder
      com.pulumi.aws.apigatewayv2.Apigatewayv2Functions.getApis(args(argsBuilder).build)

    /** Provides details about multiple Amazon API Gateway Version 2 APIs. */
    def getApisPlain(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.GetApisPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.apigatewayv2.outputs.GetApisResult] =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.GetApisPlainArgs.builder
      com.pulumi.aws.apigatewayv2.Apigatewayv2Functions.getApisPlain(args(argsBuilder).build)

    /** Exports a definition of an API in a particular output format and specification. */
    def getExport(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.GetExportArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.apigatewayv2.outputs.GetExportResult] =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.GetExportArgs.builder
      com.pulumi.aws.apigatewayv2.Apigatewayv2Functions.getExport(args(argsBuilder).build)

    /** Exports a definition of an API in a particular output format and specification. */
    def getExportPlain(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.GetExportPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.apigatewayv2.outputs.GetExportResult] =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.GetExportPlainArgs.builder
      com.pulumi.aws.apigatewayv2.Apigatewayv2Functions.getExportPlain(args(argsBuilder).build)

    /** Data source for managing an AWS API Gateway V2 VPC Link. */
    def getVpcLink(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.GetVpcLinkArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.apigatewayv2.outputs.GetVpcLinkResult] =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.GetVpcLinkArgs.builder
      com.pulumi.aws.apigatewayv2.Apigatewayv2Functions.getVpcLink(args(argsBuilder).build)

    /** Data source for managing an AWS API Gateway V2 VPC Link. */
    def getVpcLinkPlain(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.GetVpcLinkPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.apigatewayv2.outputs.GetVpcLinkResult] =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.GetVpcLinkPlainArgs.builder
      com.pulumi.aws.apigatewayv2.Apigatewayv2Functions.getVpcLinkPlain(args(argsBuilder).build)

  /**
   * Manages an Amazon API Gateway Version 2 API mapping.
   *  More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html).
   */
  def ApiMapping(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.ApiMappingArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigatewayv2.ApiMappingArgs.builder
    
    com.pulumi.aws.apigatewayv2.ApiMapping(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Amazon API Gateway Version 2 VPC Link.
   *  
   *  &gt; **Note:** Amazon API Gateway Version 2 VPC Links enable private integrations that connect HTTP APIs to private resources in a VPC.
   *  To enable private integration for REST APIs, use the Amazon API Gateway Version 1 VPC Link resource.
   */
  def VpcLink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.VpcLinkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigatewayv2.VpcLinkArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.apigatewayv2.VpcLink(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Amazon API Gateway Version 2 integration response.
   *  More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
   */
  def IntegrationResponse(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.IntegrationResponseArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigatewayv2.IntegrationResponseArgs.builder
    
    com.pulumi.aws.apigatewayv2.IntegrationResponse(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.StageArgs.Builder)
    /**
     * @param accessLogSettings Settings for logging access in this stage.
     *  Use the `aws.apigateway.Account` resource to configure [permissions for CloudWatch Logging](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html#set-up-access-logging-permissions).
     * @return builder
     */
    def accessLogSettings(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.StageAccessLogSettingsArgs.Builder]):
        com.pulumi.aws.apigatewayv2.StageArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.StageAccessLogSettingsArgs.builder
      builder.accessLogSettings(args(argsBuilder).build)

    /**
     * @param defaultRouteSettings Default route settings for the stage.
     * @return builder
     */
    def defaultRouteSettings(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.StageDefaultRouteSettingsArgs.Builder]):
        com.pulumi.aws.apigatewayv2.StageArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.StageDefaultRouteSettingsArgs.builder
      builder.defaultRouteSettings(args(argsBuilder).build)

    /**
     * @param routeSettings Route settings for the stage.
     * @return builder
     */
    def routeSettings(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.StageRouteSettingArgs.Builder]*):
        com.pulumi.aws.apigatewayv2.StageArgs.Builder =
      def argsBuilder = com.pulumi.aws.apigatewayv2.inputs.StageRouteSettingArgs.builder
      builder.routeSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.apigatewayv2.IntegrationArgs.Builder)
    /**
     * @param responseParameters Mappings to transform the HTTP response from a backend integration before returning the response to clients. Supported only for HTTP APIs.
     * @return builder
     */
    def responseParameters(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.IntegrationResponseParameterArgs.Builder]*):
        com.pulumi.aws.apigatewayv2.IntegrationArgs.Builder =
      def argsBuilder = com.pulumi.aws.apigatewayv2.inputs.IntegrationResponseParameterArgs.builder
      builder.responseParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param tlsConfig TLS configuration for a private integration. Supported only for HTTP APIs.
     * @return builder
     */
    def tlsConfig(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.IntegrationTlsConfigArgs.Builder]):
        com.pulumi.aws.apigatewayv2.IntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.IntegrationTlsConfigArgs.builder
      builder.tlsConfig(args(argsBuilder).build)

  /**
   * Manages an Amazon API Gateway Version 2 deployment.
   *  More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
   *  
   *  &gt; **Note:** Creating a deployment for an API requires at least one `aws.apigatewayv2.Route` resource associated with that API. To avoid race conditions when all resources are being created together, you need to add implicit resource references via the `triggers` argument or explicit resource references using the [resource `dependsOn` meta-argument](https://www.pulumi.com/docs/intro/concepts/programming-model/#dependson).
   */
  def Deployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.DeploymentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigatewayv2.DeploymentArgs.builder
    
    com.pulumi.aws.apigatewayv2.Deployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Amazon API Gateway Version 2 API.
   *  
   *  &gt; **Note:** Amazon API Gateway Version 2 resources are used for creating and deploying WebSocket and HTTP APIs. To create and deploy REST APIs, use Amazon API Gateway Version 1 resources.
   */
  def Api(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.ApiArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigatewayv2.ApiArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.apigatewayv2.Api(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Amazon API Gateway Version 2 route response.
   *  More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
   */
  def RouteResponse(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.RouteResponseArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigatewayv2.RouteResponseArgs.builder
    
    com.pulumi.aws.apigatewayv2.RouteResponse(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Amazon API Gateway Version 2 [model](https://docs.aws.amazon.com/apigateway/latest/developerguide/models-mappings.html#models-mappings-models). */
  def Model(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.ModelArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigatewayv2.ModelArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.apigatewayv2.Model(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.inputs.AuthorizerState.Builder)
    /**
     * @param jwtConfiguration Configuration of a JWT authorizer. Required for the `JWT` authorizer type.
     *  Supported only for HTTP APIs.
     * @return builder
     */
    def jwtConfiguration(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.AuthorizerJwtConfigurationArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.AuthorizerState.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.AuthorizerJwtConfigurationArgs.builder
      builder.jwtConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.inputs.RoutingRuleState.Builder)
    /**
     * @param actions Configuration of resulting action based on matching routing rules condition. See below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.RoutingRuleActionArgs.Builder]*):
        com.pulumi.aws.apigatewayv2.inputs.RoutingRuleState.Builder =
      def argsBuilder = com.pulumi.aws.apigatewayv2.inputs.RoutingRuleActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param conditions Conditions configuration. See below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionArgs.Builder]*):
        com.pulumi.aws.apigatewayv2.inputs.RoutingRuleState.Builder =
      def argsBuilder = com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.apigatewayv2.inputs.IntegrationState.Builder)
    /**
     * @param responseParameters Mappings to transform the HTTP response from a backend integration before returning the response to clients. Supported only for HTTP APIs.
     * @return builder
     */
    def responseParameters(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.IntegrationResponseParameterArgs.Builder]*):
        com.pulumi.aws.apigatewayv2.inputs.IntegrationState.Builder =
      def argsBuilder = com.pulumi.aws.apigatewayv2.inputs.IntegrationResponseParameterArgs.builder
      builder.responseParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param tlsConfig TLS configuration for a private integration. Supported only for HTTP APIs.
     * @return builder
     */
    def tlsConfig(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.IntegrationTlsConfigArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.IntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.IntegrationTlsConfigArgs.builder
      builder.tlsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.inputs.RouteState.Builder)
    /**
     * @param requestParameters Request parameters for the route. Supported only for WebSocket APIs.
     * @return builder
     */
    def requestParameters(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.RouteRequestParameterArgs.Builder]*):
        com.pulumi.aws.apigatewayv2.inputs.RouteState.Builder =
      def argsBuilder = com.pulumi.aws.apigatewayv2.inputs.RouteRequestParameterArgs.builder
      builder.requestParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionMatchHeadersArgs.Builder)
    /**
     * @param anyOf Configuration of the headers to be matched. There is a match if any of the header name and header value globs are matched. See below.
     * @return builder
     */
    def anyOf(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionMatchHeadersAnyOfArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionMatchHeadersArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionMatchHeadersAnyOfArgs.builder
      builder.anyOf(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.inputs.StageState.Builder)
    /**
     * @param accessLogSettings Settings for logging access in this stage.
     *  Use the `aws.apigateway.Account` resource to configure [permissions for CloudWatch Logging](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html#set-up-access-logging-permissions).
     * @return builder
     */
    def accessLogSettings(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.StageAccessLogSettingsArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.StageState.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.StageAccessLogSettingsArgs.builder
      builder.accessLogSettings(args(argsBuilder).build)

    /**
     * @param defaultRouteSettings Default route settings for the stage.
     * @return builder
     */
    def defaultRouteSettings(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.StageDefaultRouteSettingsArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.StageState.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.StageDefaultRouteSettingsArgs.builder
      builder.defaultRouteSettings(args(argsBuilder).build)

    /**
     * @param routeSettings Route settings for the stage.
     * @return builder
     */
    def routeSettings(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.StageRouteSettingArgs.Builder]*):
        com.pulumi.aws.apigatewayv2.inputs.StageState.Builder =
      def argsBuilder = com.pulumi.aws.apigatewayv2.inputs.StageRouteSettingArgs.builder
      builder.routeSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.apigatewayv2.inputs.ApiState.Builder)
    /**
     * @param corsConfiguration Cross-origin resource sharing (CORS) [configuration](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html). Applicable for HTTP APIs.
     * @return builder
     */
    def corsConfiguration(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.ApiCorsConfigurationArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.ApiState.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.ApiCorsConfigurationArgs.builder
      builder.corsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.inputs.DomainNameState.Builder)
    /**
     * @param domainNameConfiguration Domain name configuration. See below.
     * @return builder
     */
    def domainNameConfiguration(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.DomainNameDomainNameConfigurationArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.DomainNameState.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.DomainNameDomainNameConfigurationArgs.builder
      builder.domainNameConfiguration(args(argsBuilder).build)

    /**
     * @param mutualTlsAuthentication Mutual TLS authentication configuration for the domain name.
     * @return builder
     */
    def mutualTlsAuthentication(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.DomainNameMutualTlsAuthenticationArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.DomainNameState.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.DomainNameMutualTlsAuthenticationArgs.builder
      builder.mutualTlsAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.inputs.RoutingRuleActionArgs.Builder)
    /**
     * @param invokeApi Configuration to invoke a stage of a target API. Only REST APIs are supported. See below.
     * @return builder
     */
    def invokeApi(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.RoutingRuleActionInvokeApiArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.RoutingRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.RoutingRuleActionInvokeApiArgs.builder
      builder.invokeApi(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionArgs.Builder)
    /**
     * @param matchBasePaths The base path to be matched. See below.
     * @return builder
     */
    def matchBasePaths(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionMatchBasePathsArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionMatchBasePathsArgs.builder
      builder.matchBasePaths(args(argsBuilder).build)

    /**
     * @param matchHeaders The headers to be matched. See below.
     * @return builder
     */
    def matchHeaders(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionMatchHeadersArgs.Builder]):
        com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.RoutingRuleConditionMatchHeadersArgs.builder
      builder.matchHeaders(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigatewayv2.ApiArgs.Builder)
    /**
     * @param corsConfiguration Cross-origin resource sharing (CORS) [configuration](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html). Applicable for HTTP APIs.
     * @return builder
     */
    def corsConfiguration(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.ApiCorsConfigurationArgs.Builder]):
        com.pulumi.aws.apigatewayv2.ApiArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.ApiCorsConfigurationArgs.builder
      builder.corsConfiguration(args(argsBuilder).build)
