package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object apigatewayv2:
  /**
   * Manages an Amazon API Gateway Version 2 API.
   * 
   * &gt; **Note:** Amazon API Gateway Version 2 resources are used for creating and deploying WebSocket and HTTP APIs. To create and deploy REST APIs, use Amazon API Gateway Version 1 resources.
   */
  def Api(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.ApiArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigatewayv2.ApiArgs.builder
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
    com.pulumi.aws.apigatewayv2.Api(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Amazon API Gateway Version 2 API mapping.
   * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html).
   */
  def ApiMapping(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.ApiMappingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.apigatewayv2.ApiMappingArgs.builder
    com.pulumi.aws.apigatewayv2.ApiMapping(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object Apigatewayv2Functions:
    /** Provides details about a specific Amazon API Gateway Version 2 API. */
    inline def getApi(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.GetApiArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.apigatewayv2.outputs.GetApiResult] =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.GetApiArgs.builder
      com.pulumi.aws.apigatewayv2.Apigatewayv2Functions.getApi(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific Amazon API Gateway Version 2 API. */
    inline def getApiPlain(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.GetApiPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.apigatewayv2.outputs.GetApiResult] =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.GetApiPlainArgs.builder
      com.pulumi.aws.apigatewayv2.Apigatewayv2Functions.getApiPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about multiple Amazon API Gateway Version 2 APIs. */
    inline def getApis(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.GetApisArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.apigatewayv2.outputs.GetApisResult] =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.GetApisArgs.builder
      com.pulumi.aws.apigatewayv2.Apigatewayv2Functions.getApis(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about multiple Amazon API Gateway Version 2 APIs. */
    inline def getApisPlain(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.GetApisPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.apigatewayv2.outputs.GetApisResult] =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.GetApisPlainArgs.builder
      com.pulumi.aws.apigatewayv2.Apigatewayv2Functions.getApisPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Exports a definition of an API in a particular output format and specification. */
    inline def getExport(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.GetExportArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.apigatewayv2.outputs.GetExportResult] =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.GetExportArgs.builder
      com.pulumi.aws.apigatewayv2.Apigatewayv2Functions.getExport(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Exports a definition of an API in a particular output format and specification. */
    inline def getExportPlain(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.GetExportPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.apigatewayv2.outputs.GetExportResult] =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.GetExportPlainArgs.builder
      com.pulumi.aws.apigatewayv2.Apigatewayv2Functions.getExportPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS API Gateway V2 VPC Link. */
    inline def getVpcLink(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.GetVpcLinkArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.apigatewayv2.outputs.GetVpcLinkResult] =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.GetVpcLinkArgs.builder
      com.pulumi.aws.apigatewayv2.Apigatewayv2Functions.getVpcLink(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS API Gateway V2 VPC Link. */
    inline def getVpcLinkPlain(args: Endofunction[com.pulumi.aws.apigatewayv2.inputs.GetVpcLinkPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.apigatewayv2.outputs.GetVpcLinkResult] =
      val argsBuilder = com.pulumi.aws.apigatewayv2.inputs.GetVpcLinkPlainArgs.builder
      com.pulumi.aws.apigatewayv2.Apigatewayv2Functions.getVpcLinkPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Manages an Amazon API Gateway Version 2 authorizer.
   * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
   */
  def Authorizer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.AuthorizerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigatewayv2.AuthorizerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.apigatewayv2.Authorizer(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Amazon API Gateway Version 2 deployment.
   * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
   * 
   * &gt; **Note:** Creating a deployment for an API requires at least one `aws.apigatewayv2.Route` resource associated with that API. To avoid race conditions when all resources are being created together, you need to add implicit resource references via the `triggers` argument or explicit resource references using the [resource `dependsOn` meta-argument](https://www.pulumi.com/docs/intro/concepts/programming-model/#dependson).
   */
  def Deployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.DeploymentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.apigatewayv2.DeploymentArgs.builder
    com.pulumi.aws.apigatewayv2.Deployment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Amazon API Gateway Version 2 domain name.
   * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html).
   * 
   * &gt; **Note:** This resource establishes ownership of and the TLS settings for
   * a particular domain name. An API stage can be associated with the domain name using the `aws.apigatewayv2.ApiMapping` resource.
   */
  def DomainName(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.DomainNameArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigatewayv2.DomainNameArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.apigatewayv2.DomainName(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Amazon API Gateway Version 2 integration.
   * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
   */
  def Integration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.IntegrationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.apigatewayv2.IntegrationArgs.builder
    com.pulumi.aws.apigatewayv2.Integration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Amazon API Gateway Version 2 integration response.
   * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
   */
  def IntegrationResponse(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.IntegrationResponseArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.apigatewayv2.IntegrationResponseArgs.builder
    com.pulumi.aws.apigatewayv2.IntegrationResponse(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Amazon API Gateway Version 2 [model](https://docs.aws.amazon.com/apigateway/latest/developerguide/models-mappings.html#models-mappings-models). */
  def Model(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.ModelArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigatewayv2.ModelArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.apigatewayv2.Model(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Amazon API Gateway Version 2 route.
   * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/welcome.html) for [WebSocket](https://docs.aws.amazon.com/apigateway/latest/developerguide/websocket-api-develop-routes.html) and [HTTP](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-routes.html) APIs.
   */
  def Route(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.RouteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.apigatewayv2.RouteArgs.builder
    com.pulumi.aws.apigatewayv2.Route(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Amazon API Gateway Version 2 route response.
   * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
   */
  def RouteResponse(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.RouteResponseArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.apigatewayv2.RouteResponseArgs.builder
    com.pulumi.aws.apigatewayv2.RouteResponse(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS API Gateway V2 Routing Rule. */
  def RoutingRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.RoutingRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.apigatewayv2.RoutingRuleArgs.builder
    com.pulumi.aws.apigatewayv2.RoutingRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Amazon API Gateway Version 2 stage.
   * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
   */
  def Stage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.StageArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigatewayv2.StageArgs.builder
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
    com.pulumi.aws.apigatewayv2.Stage(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Amazon API Gateway Version 2 VPC Link.
   * 
   * &gt; **Note:** Amazon API Gateway Version 2 VPC Links enable private integrations that connect HTTP APIs to private resources in a VPC.
   * To enable private integration for REST APIs, use the Amazon API Gateway Version 1 VPC Link resource.
   */
  def VpcLink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigatewayv2.VpcLinkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigatewayv2.VpcLinkArgs.builder
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
    com.pulumi.aws.apigatewayv2.VpcLink(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
