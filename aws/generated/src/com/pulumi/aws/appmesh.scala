package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object appmesh:
  /**
   * Provides an AWS App Mesh virtual router resource.
   *  
   *  ## Breaking Changes
   *  
   *  Because of backward incompatible API changes (read [here](https://github.com/awslabs/aws-app-mesh-examples/issues/92) and [here](https://github.com/awslabs/aws-app-mesh-examples/issues/94)), `aws.appmesh.VirtualRouter` resource definitions created with provider versions earlier than v2.3.0 will need to be modified:
   *  
   *  * Remove service `serviceNames` from the `spec` argument. AWS has created a `aws.appmesh.VirtualService` resource for each service name. Import these resource using `pulumi import`.
   *  
   *  * Add a `listener` configuration block to the `spec` argument.
   *  
   *  The state associated with existing resources will automatically be migrated.
   */
  def VirtualRouter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appmesh.VirtualRouterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appmesh.VirtualRouterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appmesh.VirtualRouter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.appmesh.VirtualNodeArgs.Builder)
    /**
     * @param spec Virtual node specification to apply.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecArgs.Builder]):
        com.pulumi.aws.appmesh.VirtualNodeArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.RouteArgs.Builder)
    /**
     * @param spec Route specification to apply.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecArgs.Builder]):
        com.pulumi.aws.appmesh.RouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  /** Provides an AWS App Mesh route resource. */
  def Route(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appmesh.RouteArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appmesh.RouteArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appmesh.Route(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AWS App Mesh virtual gateway resource. */
  def VirtualGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appmesh.VirtualGatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appmesh.VirtualGatewayArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appmesh.VirtualGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.appmesh.VirtualServiceArgs.Builder)
    /**
     * @param spec Virtual service specification to apply.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualServiceSpecArgs.Builder]):
        com.pulumi.aws.appmesh.VirtualServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualServiceSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  /**
   * Provides an AWS App Mesh virtual node resource.
   *  
   *  ## Breaking Changes
   *  
   *  Because of backward incompatible API changes (read [here](https://github.com/awslabs/aws-app-mesh-examples/issues/92)), `aws.appmesh.VirtualNode` resource definitions created with provider versions earlier than v2.3.0 will need to be modified:
   *  
   *  * Rename the `serviceName` attribute of the `dns` object to `hostname`.
   *  
   *  * Replace the `backends` attribute of the `spec` object with one or more `backend` configuration blocks,
   *  setting `virtualServiceName` to the name of the service.
   *  
   *  The state associated with existing resources will automatically be migrated.
   */
  def VirtualNode(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appmesh.VirtualNodeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appmesh.VirtualNodeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appmesh.VirtualNode(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.appmesh.VirtualGatewayArgs.Builder)
    /**
     * @param spec Virtual gateway specification to apply.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecArgs.Builder]):
        com.pulumi.aws.appmesh.VirtualGatewayArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecArgs.builder
      builder.spec(args(argsBuilder).build)

  /** Provides an AWS App Mesh virtual service resource. */
  def VirtualService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appmesh.VirtualServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appmesh.VirtualServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appmesh.VirtualService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.appmesh.MeshArgs.Builder)
    /**
     * @param spec Service mesh specification to apply.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.aws.appmesh.inputs.MeshSpecArgs.Builder]):
        com.pulumi.aws.appmesh.MeshArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.MeshSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  /** Provides an AWS App Mesh service mesh resource. */
  def Mesh(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appmesh.MeshArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appmesh.MeshArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appmesh.Mesh(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.appmesh.GatewayRouteArgs.Builder)
    /**
     * @param spec Gateway route specification to apply.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecArgs.Builder]):
        com.pulumi.aws.appmesh.GatewayRouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.VirtualRouterArgs.Builder)
    /**
     * @param spec Virtual router specification to apply.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualRouterSpecArgs.Builder]):
        com.pulumi.aws.appmesh.VirtualRouterArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualRouterSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  type AppmeshFunctions = com.pulumi.aws.appmesh.AppmeshFunctions
  object AppmeshFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.appmesh.AppmeshFunctions.*
  extension (self: AppmeshFunctions.type)
    /** The App Mesh Gateway Route data source allows details of an App Mesh Gateway Route to be retrieved by its name, mesh_name, virtual_gateway_name, and optionally the mesh_owner. */
    def getGatewayRoute(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetGatewayRouteArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.appmesh.outputs.GetGatewayRouteResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetGatewayRouteArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getGatewayRoute(args(argsBuilder).build)

    /** The App Mesh Gateway Route data source allows details of an App Mesh Gateway Route to be retrieved by its name, mesh_name, virtual_gateway_name, and optionally the mesh_owner. */
    def getGatewayRoutePlain(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetGatewayRoutePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appmesh.outputs.GetGatewayRouteResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetGatewayRoutePlainArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getGatewayRoutePlain(args(argsBuilder).build)

    /** The App Mesh Mesh data source allows details of an App Mesh Mesh to be retrieved by its name and optionally the mesh_owner. */
    def getMesh(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetMeshArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.appmesh.outputs.GetMeshResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetMeshArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getMesh(args(argsBuilder).build)

    /** The App Mesh Mesh data source allows details of an App Mesh Mesh to be retrieved by its name and optionally the mesh_owner. */
    def getMeshPlain(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetMeshPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appmesh.outputs.GetMeshResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetMeshPlainArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getMeshPlain(args(argsBuilder).build)

    /** The App Mesh Route data source allows details of an App Mesh Route to be retrieved by its name, mesh_name, virtual_router_name, and optionally the mesh_owner. */
    def getRoute(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetRouteArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.appmesh.outputs.GetRouteResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetRouteArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getRoute(args(argsBuilder).build)

    /** The App Mesh Route data source allows details of an App Mesh Route to be retrieved by its name, mesh_name, virtual_router_name, and optionally the mesh_owner. */
    def getRoutePlain(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetRoutePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appmesh.outputs.GetRouteResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetRoutePlainArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getRoutePlain(args(argsBuilder).build)

    /** Data source for managing an AWS App Mesh Virtual Gateway. */
    def getVirtualGateway(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetVirtualGatewayArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.appmesh.outputs.GetVirtualGatewayResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetVirtualGatewayArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getVirtualGateway(args(argsBuilder).build)

    /** Data source for managing an AWS App Mesh Virtual Gateway. */
    def getVirtualGatewayPlain(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetVirtualGatewayPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appmesh.outputs.GetVirtualGatewayResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetVirtualGatewayPlainArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getVirtualGatewayPlain(args(argsBuilder).build)

    /** Data source for managing an AWS App Mesh Virtual Node. */
    def getVirtualNode(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetVirtualNodeArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.appmesh.outputs.GetVirtualNodeResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetVirtualNodeArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getVirtualNode(args(argsBuilder).build)

    /** Data source for managing an AWS App Mesh Virtual Node. */
    def getVirtualNodePlain(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetVirtualNodePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appmesh.outputs.GetVirtualNodeResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetVirtualNodePlainArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getVirtualNodePlain(args(argsBuilder).build)

    /** The App Mesh Virtual Router data source allows details of an App Mesh Virtual Service to be retrieved by its name and mesh_name. */
    def getVirtualRouter(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetVirtualRouterArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.appmesh.outputs.GetVirtualRouterResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetVirtualRouterArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getVirtualRouter(args(argsBuilder).build)

    /** The App Mesh Virtual Router data source allows details of an App Mesh Virtual Service to be retrieved by its name and mesh_name. */
    def getVirtualRouterPlain(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetVirtualRouterPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appmesh.outputs.GetVirtualRouterResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetVirtualRouterPlainArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getVirtualRouterPlain(args(argsBuilder).build)

    /** The App Mesh Virtual Service data source allows details of an App Mesh Virtual Service to be retrieved by its name, mesh_name, and optionally the mesh_owner. */
    def getVirtualService(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetVirtualServiceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.appmesh.outputs.GetVirtualServiceResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetVirtualServiceArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getVirtualService(args(argsBuilder).build)

    /** The App Mesh Virtual Service data source allows details of an App Mesh Virtual Service to be retrieved by its name, mesh_name, and optionally the mesh_owner. */
    def getVirtualServicePlain(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetVirtualServicePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appmesh.outputs.GetVirtualServiceResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetVirtualServicePlainArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getVirtualServicePlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchArgs.Builder)
    /**
     * @param headers Client request headers to match on.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchHeaderArgs.Builder]*):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param hostname Host name to match on.
     * @return builder
     */
    def hostname(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchHostnameArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchHostnameArgs.builder
      builder.hostname(args(argsBuilder).build)

    /**
     * @param path Client request path to match on.
     * @return builder
     */
    def path(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchPathArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchPathArgs.builder
      builder.path(args(argsBuilder).build)

    /**
     * @param queryParameters Client request query parameters to match on.
     * @return builder
     */
    def queryParameters(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchQueryParameterArgs.Builder]*):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchQueryParameterArgs.builder
      builder.queryParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecServiceDiscoveryArgs.Builder)
    /**
     * @param awsCloudMap Any AWS Cloud Map information for the virtual node.
     * @return builder
     */
    def awsCloudMap(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecServiceDiscoveryArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs.builder
      builder.awsCloudMap(args(argsBuilder).build)

    /**
     * @param dns DNS service name for the virtual node.
     * @return builder
     */
    def dns(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecServiceDiscoveryDnsArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecServiceDiscoveryArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecServiceDiscoveryDnsArgs.builder
      builder.dns(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchArgs.Builder)
    /**
     * @param headers Client request headers to match on.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchHeaderArgs.Builder]*):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param path Client request path to match on.
     * @return builder
     */
    def path(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchPathArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchPathArgs.builder
      builder.path(args(argsBuilder).build)

    /**
     * @param queryParameters Client request query parameters to match on.
     * @return builder
     */
    def queryParameters(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchQueryParameterArgs.Builder]*):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchQueryParameterArgs.builder
      builder.queryParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteActionArgs.Builder)
    /**
     * @param weightedTargets Targets that traffic is routed to when a request matches the route.
     *  You can specify one or more targets and their relative weights with which to distribute traffic.
     * @return builder
     */
    def weightedTargets(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteActionWeightedTargetArgs.Builder]*):
        com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteActionWeightedTargetArgs.builder
      builder.weightedTargets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualGatewayState.Builder)
    /**
     * @param spec Virtual gateway specification to apply.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewayState.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecArgs.builder
      builder.spec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteRetryPolicyArgs.Builder)
    /**
     * @param perRetryTimeout Per-retry timeout.
     * @return builder
     */
    def perRetryTimeout(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteRetryPolicyPerRetryTimeoutArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteRetryPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteRetryPolicyPerRetryTimeoutArgs.builder
      builder.perRetryTimeout(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsArgs.Builder)
    /**
     * @param certificate Listener&#39;s TLS certificate.
     * @return builder
     */
    def certificate(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    /**
     * @param validation Listener&#39;s Transport Layer Security (TLS) validation context.
     * @return builder
     */
    def validation(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs.builder
      builder.validation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustArgs.Builder)
    /**
     * @param acm TLS validation context trust for an AWS Certificate Manager (ACM) certificate.
     * @return builder
     */
    def acm(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcmArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcmArgs.builder
      builder.acm(args(argsBuilder).build)

    /**
     * @param file TLS validation context trust for a local file certificate.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFileArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFileArgs.builder
      builder.file(args(argsBuilder).build)

    /**
     * @param sds TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * @return builder
     */
    def sds(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustSdsArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustSdsArgs.builder
      builder.sds(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchHeaderArgs.Builder)
    /**
     * @param match Method and value to match the header value sent with a request. Specify one match method.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchHeaderMatchArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchHeaderMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteArgs.Builder)
    /**
     * @param action Action to take if a match is determined.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteActionArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param match Criteria for determining an gRPC request match.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteMatchArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param retryPolicy Retry policy.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteRetryPolicyArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param timeout Types of timeouts.
     * @return builder
     */
    def timeout(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteTimeoutArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteTimeoutArgs.builder
      builder.timeout(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationArgs.Builder)
    /**
     * @param subjectAlternativeNames SANs for a TLS validation context.
     * @return builder
     */
    def subjectAlternativeNames(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesArgs.builder
      builder.subjectAlternativeNames(args(argsBuilder).build)

    /**
     * @param trust TLS validation context trust.
     * @return builder
     */
    def trust(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationTrustArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationTrustArgs.builder
      builder.trust(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateArgs.Builder)
    /**
     * @param file Local file certificate.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs.builder
      builder.file(args(argsBuilder).build)

    /**
     * @param sds A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * @return builder
     */
    def sds(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsArgs.builder
      builder.sds(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogArgs.Builder)
    /**
     * @param file File object to send virtual gateway access logs to.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogFileArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogFileArgs.builder
      builder.file(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeState.Builder)
    /**
     * @param spec Virtual node specification to apply.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeState.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutArgs.Builder)
    /**
     * @param grpc Timeouts for gRPC listeners.
     * @return builder
     */
    def grpc(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutGrpcArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutGrpcArgs.builder
      builder.grpc(args(argsBuilder).build)

    /**
     * @param http Timeouts for HTTP listeners.
     * @return builder
     */
    def http(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttpArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttpArgs.builder
      builder.http(args(argsBuilder).build)

    /**
     * @param http2 Timeouts for HTTP2 listeners.
     * @return builder
     */
    def http2(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttp2Args.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttp2Args.builder
      builder.http2(args(argsBuilder).build)

    /**
     * @param tcp Timeouts for TCP listeners.
     * @return builder
     */
    def tcp(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutTcpArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutTcpArgs.builder
      builder.tcp(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchHeaderMatchArgs.Builder)
    /**
     * @param range Object that specifies the range of numbers that the header value sent by the client must be included in.
     * @return builder
     */
    def range(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchHeaderMatchRangeArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchHeaderMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchHeaderMatchRangeArgs.builder
      builder.range(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteRetryPolicyArgs.Builder)
    /**
     * @param perRetryTimeout Per-retry timeout.
     * @return builder
     */
    def perRetryTimeout(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteRetryPolicyPerRetryTimeoutArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteRetryPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteRetryPolicyPerRetryTimeoutArgs.builder
      builder.perRetryTimeout(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.MeshState.Builder)
    /**
     * @param spec Service mesh specification to apply.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.aws.appmesh.inputs.MeshSpecArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.MeshState.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.MeshSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteMatchMetadataArgs.Builder)
    /**
     * @param match Data to match from the request.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteMatchMetadataMatchArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteMatchMetadataArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteMatchMetadataMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteActionArgs.Builder)
    /**
     * @param weightedTargets Targets that traffic is routed to when a request matches the route.
     *  You can specify one or more targets and their relative weights with which to distribute traffic.
     * @return builder
     */
    def weightedTargets(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteActionWeightedTargetArgs.Builder]*):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteActionWeightedTargetArgs.builder
      builder.weightedTargets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsArgs.Builder)
    /**
     * @param clientPolicy Default client policy for virtual service backends. See above for details.
     * @return builder
     */
    def clientPolicy(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyArgs.builder
      builder.clientPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.GatewayRouteSpecArgs.Builder)
    /**
     * @param grpcRoute Specification of a gRPC gateway route.
     * @return builder
     */
    def grpcRoute(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteArgs.builder
      builder.grpcRoute(args(argsBuilder).build)

    /**
     * @param http2Route Specification of an HTTP/2 gateway route.
     * @return builder
     */
    def http2Route(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteArgs.builder
      builder.http2Route(args(argsBuilder).build)

    /**
     * @param httpRoute Specification of an HTTP gateway route.
     * @return builder
     */
    def httpRoute(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteArgs.builder
      builder.httpRoute(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchQueryParameterArgs.Builder)
    /**
     * @param match The query parameter to match on.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchQueryParameterMatchArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchQueryParameterArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchQueryParameterMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyArgs.Builder)
    /**
     * @param tls Transport Layer Security (TLS) client policy.
     * @return builder
     */
    def tls(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs.builder
      builder.tls(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs.Builder)
    /**
     * @param match Criteria for determining a SAN&#39;s match.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerArgs.Builder)
    /**
     * @param connectionPool Connection pool information for the listener.
     * @return builder
     */
    def connectionPool(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolArgs.builder
      builder.connectionPool(args(argsBuilder).build)

    /**
     * @param healthCheck Health check information for the listener.
     * @return builder
     */
    def healthCheck(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerHealthCheckArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerHealthCheckArgs.builder
      builder.healthCheck(args(argsBuilder).build)

    /**
     * @param outlierDetection Outlier detection information for the listener.
     * @return builder
     */
    def outlierDetection(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerOutlierDetectionArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerOutlierDetectionArgs.builder
      builder.outlierDetection(args(argsBuilder).build)

    /**
     * @param portMapping Port mapping information for the listener.
     * @return builder
     */
    def portMapping(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerPortMappingArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerPortMappingArgs.builder
      builder.portMapping(args(argsBuilder).build)

    /**
     * @param timeout Timeouts for different protocols.
     * @return builder
     */
    def timeout(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutArgs.builder
      builder.timeout(args(argsBuilder).build)

    /**
     * @param tls Transport Layer Security (TLS) properties for the listener
     * @return builder
     */
    def tls(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsArgs.builder
      builder.tls(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchHeaderMatchArgs.Builder)
    /**
     * @param range Object that specifies the range of numbers that the header value sent by the client must be included in.
     * @return builder
     */
    def range(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchHeaderMatchRangeArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchHeaderMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchHeaderMatchRangeArgs.builder
      builder.range(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesArgs.Builder)
    /**
     * @param match Criteria for determining a SAN&#39;s match.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsCertificateArgs.Builder)
    /**
     * @param acm An AWS Certificate Manager (ACM) certificate.
     * @return builder
     */
    def acm(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsCertificateAcmArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsCertificateArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsCertificateAcmArgs.builder
      builder.acm(args(argsBuilder).build)

    /**
     * @param file Local file certificate.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsCertificateFileArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsCertificateArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsCertificateFileArgs.builder
      builder.file(args(argsBuilder).build)

    /**
     * @param sds A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * @return builder
     */
    def sds(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsCertificateSdsArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsCertificateArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsCertificateSdsArgs.builder
      builder.sds(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualServiceSpecProviderArgs.Builder)
    /**
     * @param virtualNode Virtual node associated with a virtual service.
     * @return builder
     */
    def virtualNode(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualServiceSpecProviderVirtualNodeArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualServiceSpecProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualServiceSpecProviderVirtualNodeArgs.builder
      builder.virtualNode(args(argsBuilder).build)

    /**
     * @param virtualRouter Virtual router associated with a virtual service.
     * @return builder
     */
    def virtualRouter(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualServiceSpecProviderVirtualRouterArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualServiceSpecProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualServiceSpecProviderVirtualRouterArgs.builder
      builder.virtualRouter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteActionArgs.Builder)
    /**
     * @param weightedTargets Targets that traffic is routed to when a request matches the route.
     *  You can specify one or more targets and their relative weights with which to distribute traffic.
     * @return builder
     */
    def weightedTargets(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteActionWeightedTargetArgs.Builder]*):
        com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteActionWeightedTargetArgs.builder
      builder.weightedTargets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteArgs.Builder)
    /**
     * @param action Action to take if a match is determined.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteActionArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param match Criteria for determining a request match.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteMatchArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionArgs.Builder)
    /**
     * @param rewrite Gateway route action to rewrite.
     * @return builder
     */
    def rewrite(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionRewriteArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionRewriteArgs.builder
      builder.rewrite(args(argsBuilder).build)

    /**
     * @param target Target that traffic is routed to when a request matches the gateway route.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionTargetArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsArgs.Builder)
    /**
     * @param certificate Listener&#39;s TLS certificate.
     * @return builder
     */
    def certificate(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    /**
     * @param validation Listener&#39;s Transport Layer Security (TLS) validation context.
     * @return builder
     */
    def validation(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationArgs.builder
      builder.validation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteState.Builder)
    /**
     * @param spec Route specification to apply.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteState.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolArgs.Builder)
    /**
     * @param grpc Connection pool information for gRPC listeners.
     * @return builder
     */
    def grpc(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolGrpcArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolGrpcArgs.builder
      builder.grpc(args(argsBuilder).build)

    /**
     * @param http Connection pool information for HTTP listeners.
     * @return builder
     */
    def http(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolHttpArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolHttpArgs.builder
      builder.http(args(argsBuilder).build)

    /**
     * @param http2 Connection pool information for HTTP2 listeners.
     * @return builder
     */
    def http2(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolHttp2Args.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolHttp2Args.builder
      builder.http2(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteTimeoutArgs.Builder)
    /**
     * @param idle Idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * @return builder
     */
    def idle(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteTimeoutIdleArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteTimeoutArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteTimeoutIdleArgs.builder
      builder.idle(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualRouterSpecListenerArgs.Builder)
    /**
     * @param portMapping Port mapping information for the listener.
     * @return builder
     */
    def portMapping(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualRouterSpecListenerPortMappingArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualRouterSpecListenerArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualRouterSpecListenerPortMappingArgs.builder
      builder.portMapping(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteTimeoutArgs.Builder)
    /**
     * @param idle Idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * @return builder
     */
    def idle(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteTimeoutIdleArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteTimeoutArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteTimeoutIdleArgs.builder
      builder.idle(args(argsBuilder).build)

    /**
     * @param perRequest Per request timeout.
     * @return builder
     */
    def perRequest(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteTimeoutPerRequestArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteTimeoutArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteTimeoutPerRequestArgs.builder
      builder.perRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerArgs.Builder)
    /**
     * @param connectionPool Connection pool information for the listener.
     * @return builder
     */
    def connectionPool(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolArgs.builder
      builder.connectionPool(args(argsBuilder).build)

    /**
     * @param healthCheck Health check information for the listener.
     * @return builder
     */
    def healthCheck(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerHealthCheckArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerHealthCheckArgs.builder
      builder.healthCheck(args(argsBuilder).build)

    /**
     * @param portMapping Port mapping information for the listener.
     * @return builder
     */
    def portMapping(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerPortMappingArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerPortMappingArgs.builder
      builder.portMapping(args(argsBuilder).build)

    /**
     * @param tls Transport Layer Security (TLS) properties for the listener
     * @return builder
     */
    def tls(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsArgs.builder
      builder.tls(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteArgs.Builder)
    /**
     * @param action Action to take if a match is determined.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteActionArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteActionArgs.builder
      builder.action(args(argsBuilder).build)

    def `match`(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteMatchArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param timeout Types of timeouts.
     * @return builder
     */
    def timeout(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteTimeoutArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteTimeoutArgs.builder
      builder.timeout(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionRewriteArgs.Builder)
    /**
     * @param hostname Host name to rewrite.
     * @return builder
     */
    def hostname(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionRewriteHostnameArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionRewriteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionRewriteHostnameArgs.builder
      builder.hostname(args(argsBuilder).build)

    /**
     * @param path Exact path to rewrite.
     * @return builder
     */
    def path(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionRewritePathArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionRewriteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionRewritePathArgs.builder
      builder.path(args(argsBuilder).build)

    /**
     * @param prefix Specified beginning characters to rewrite.
     * @return builder
     */
    def prefix(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionRewritePrefixArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionRewriteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionRewritePrefixArgs.builder
      builder.prefix(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesArgs.Builder)
    /**
     * @param match Criteria for determining a SAN&#39;s match.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatchArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionTargetArgs.Builder)
    /**
     * @param virtualService Virtual service gateway route target.
     * @return builder
     */
    def virtualService(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionTargetVirtualServiceArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionTargetVirtualServiceArgs.builder
      builder.virtualService(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttp2Args.Builder)
    /**
     * @param idle Idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * @return builder
     */
    def idle(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttp2IdleArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttp2Args.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttp2IdleArgs.builder
      builder.idle(args(argsBuilder).build)

    /**
     * @param perRequest Per request timeout.
     * @return builder
     */
    def perRequest(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttp2PerRequestArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttp2Args.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttp2PerRequestArgs.builder
      builder.perRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs.Builder)
    /**
     * @param match Criteria for determining a SAN&#39;s match.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchHeaderMatchArgs.Builder)
    /**
     * @param range Object that specifies the range of numbers that the header value sent by the client must be included in.
     * @return builder
     */
    def range(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchHeaderMatchRangeArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchHeaderMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchHeaderMatchRangeArgs.builder
      builder.range(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutTcpArgs.Builder)
    /**
     * @param idle Idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * @return builder
     */
    def idle(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutTcpIdleArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutTcpArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutTcpIdleArgs.builder
      builder.idle(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteArgs.Builder)
    /**
     * @param action Action to take if a match is determined.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteActionArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param match Criteria for determining an HTTP request match.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param retryPolicy Retry policy.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteRetryPolicyArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param timeout Types of timeouts.
     * @return builder
     */
    def timeout(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteTimeoutArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteTimeoutArgs.builder
      builder.timeout(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogFileArgs.Builder)
    /**
     * @param format The specified format for the logs.
     * @return builder
     */
    def format(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogFileFormatArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogFileArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogFileFormatArgs.builder
      builder.format(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerOutlierDetectionArgs.Builder)
    /**
     * @param baseEjectionDuration Base amount of time for which a host is ejected.
     * @return builder
     */
    def baseEjectionDuration(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerOutlierDetectionBaseEjectionDurationArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerOutlierDetectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerOutlierDetectionBaseEjectionDurationArgs.builder
      builder.baseEjectionDuration(args(argsBuilder).build)

    /**
     * @param interval Time interval between ejection sweep analysis.
     * @return builder
     */
    def interval(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerOutlierDetectionIntervalArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerOutlierDetectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerOutlierDetectionIntervalArgs.builder
      builder.interval(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchArgs.Builder)
    /**
     * @param headers Client request headers to match on.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchHeaderArgs.Builder]*):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param hostname Host name to match on.
     * @return builder
     */
    def hostname(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchHostnameArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchHostnameArgs.builder
      builder.hostname(args(argsBuilder).build)

    /**
     * @param path Client request path to match on.
     * @return builder
     */
    def path(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchPathArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchPathArgs.builder
      builder.path(args(argsBuilder).build)

    /**
     * @param queryParameters Client request query parameters to match on.
     * @return builder
     */
    def queryParameters(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchQueryParameterArgs.Builder]*):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchQueryParameterArgs.builder
      builder.queryParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchQueryParameterArgs.Builder)
    /**
     * @param match The query parameter to match on.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchQueryParameterMatchArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchQueryParameterArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchQueryParameterMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingArgs.Builder)
    /**
     * @param accessLog Access log configuration for a virtual node.
     * @return builder
     */
    def accessLog(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingAccessLogArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingAccessLogArgs.builder
      builder.accessLog(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteRetryPolicyArgs.Builder)
    /**
     * @param perRetryTimeout Per-retry timeout.
     * @return builder
     */
    def perRetryTimeout(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteRetryPolicyPerRetryTimeoutArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteRetryPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteRetryPolicyPerRetryTimeoutArgs.builder
      builder.perRetryTimeout(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteActionTargetArgs.Builder)
    /**
     * @param virtualService Virtual service gateway route target.
     * @return builder
     */
    def virtualService(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteActionTargetVirtualServiceArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteActionTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteActionTargetVirtualServiceArgs.builder
      builder.virtualService(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecArgs.Builder)
    /**
     * @param backendDefaults Defaults for backends.
     * @return builder
     */
    def backendDefaults(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsArgs.builder
      builder.backendDefaults(args(argsBuilder).build)

    /**
     * @param listeners Listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one listener.
     * @return builder
     */
    def listeners(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerArgs.Builder]*):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerArgs.builder
      builder.listeners(args.map(_(argsBuilder).build)*)

    /**
     * @param logging Inbound and outbound access logging information for the virtual gateway.
     * @return builder
     */
    def logging(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecArgs.Builder)
    /**
     * @param grpcRoute GRPC routing information for the route.
     * @return builder
     */
    def grpcRoute(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteArgs.builder
      builder.grpcRoute(args(argsBuilder).build)

    /**
     * @param http2Route HTTP/2 routing information for the route.
     * @return builder
     */
    def http2Route(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteArgs.builder
      builder.http2Route(args(argsBuilder).build)

    /**
     * @param httpRoute HTTP routing information for the route.
     * @return builder
     */
    def httpRoute(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteArgs.builder
      builder.httpRoute(args(argsBuilder).build)

    /**
     * @param tcpRoute TCP routing information for the route.
     * @return builder
     */
    def tcpRoute(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteArgs.builder
      builder.tcpRoute(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingArgs.Builder)
    /**
     * @param accessLog Access log configuration for a virtual gateway.
     * @return builder
     */
    def accessLog(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogArgs.builder
      builder.accessLog(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationTrustArgs.Builder)
    /**
     * @param file TLS validation context trust for a local file certificate.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationTrustFileArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationTrustArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationTrustFileArgs.builder
      builder.file(args(argsBuilder).build)

    /**
     * @param sds TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * @return builder
     */
    def sds(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationTrustSdsArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationTrustArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationTrustSdsArgs.builder
      builder.sds(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchQueryParameterArgs.Builder)
    /**
     * @param match The query parameter to match on.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchQueryParameterMatchArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchQueryParameterArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchQueryParameterMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionArgs.Builder)
    /**
     * @param rewrite Gateway route action to rewrite.
     * @return builder
     */
    def rewrite(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionRewriteArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionRewriteArgs.builder
      builder.rewrite(args(argsBuilder).build)

    /**
     * @param target Target that traffic is routed to when a request matches the gateway route.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionTargetArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteMatchArgs.Builder)
    /**
     * @param metadatas Data to match from the gRPC request.
     * @return builder
     */
    def metadatas(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteMatchMetadataArgs.Builder]*):
        com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteMatchMetadataArgs.builder
      builder.metadatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualRouterState.Builder)
    /**
     * @param spec Virtual router specification to apply.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualRouterSpecArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualRouterState.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualRouterSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationArgs.Builder)
    /**
     * @param subjectAlternativeNames SANs for a virtual gateway&#39;s listener&#39;s Transport Layer Security (TLS) validation context.
     * @return builder
     */
    def subjectAlternativeNames(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs.builder
      builder.subjectAlternativeNames(args(argsBuilder).build)

    /**
     * @param trust TLS validation context trust.
     * @return builder
     */
    def trust(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustArgs.builder
      builder.trust(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingAccessLogFileFormatArgs.Builder)
    /**
     * @param jsons The logging format for JSON.
     * @return builder
     */
    def jsons(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingAccessLogFileFormatJsonArgs.Builder]*):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingAccessLogFileFormatArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingAccessLogFileFormatJsonArgs.builder
      builder.jsons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteActionArgs.Builder)
    /**
     * @param weightedTargets Targets that traffic is routed to when a request matches the route.
     *  You can specify one or more targets and their relative weights with which to distribute traffic.
     * @return builder
     */
    def weightedTargets(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteActionWeightedTargetArgs.Builder]*):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteActionWeightedTargetArgs.builder
      builder.weightedTargets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttpArgs.Builder)
    /**
     * @param idle Idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * @return builder
     */
    def idle(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttpIdleArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttpArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttpIdleArgs.builder
      builder.idle(args(argsBuilder).build)

    /**
     * @param perRequest Per request timeout.
     * @return builder
     */
    def perRequest(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttpPerRequestArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttpArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttpPerRequestArgs.builder
      builder.perRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs.Builder)
    /**
     * @param acm TLS validation context trust for an AWS Certificate Manager (ACM) certificate.
     * @return builder
     */
    def acm(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs.builder
      builder.acm(args(argsBuilder).build)

    /**
     * @param file TLS validation context trust for a local file certificate.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs.builder
      builder.file(args(argsBuilder).build)

    /**
     * @param sds TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * @return builder
     */
    def sds(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs.builder
      builder.sds(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolArgs.Builder)
    /**
     * @param grpc Connection pool information for gRPC listeners.
     * @return builder
     */
    def grpc(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolGrpcArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolGrpcArgs.builder
      builder.grpc(args(argsBuilder).build)

    /**
     * @param http2s Connection pool information for HTTP2 listeners.
     * @return builder
     */
    def http2s(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolHttp2Args.Builder]*):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolHttp2Args.builder
      builder.http2s(args.map(_(argsBuilder).build)*)

    /**
     * @param https Connection pool information for HTTP listeners.
     * @return builder
     */
    def https(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolHttpArgs.Builder]*):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolHttpArgs.builder
      builder.https(args.map(_(argsBuilder).build)*)

    /**
     * @param tcps Connection pool information for TCP listeners.
     * @return builder
     */
    def tcps(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolTcpArgs.Builder]*):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolTcpArgs.builder
      builder.tcps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceArgs.Builder)
    /**
     * @param clientPolicy Client policy for the backend.
     * @return builder
     */
    def clientPolicy(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyArgs.builder
      builder.clientPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchHeaderMatchArgs.Builder)
    /**
     * @param range Object that specifies the range of numbers that the header value sent by the client must be included in.
     * @return builder
     */
    def range(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchHeaderMatchRangeArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchHeaderMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchHeaderMatchRangeArgs.builder
      builder.range(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteArgs.Builder)
    /**
     * @param action Action to take if a match is determined.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param match Criteria for determining a request match.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationArgs.Builder)
    /**
     * @param subjectAlternativeNames SANs for a virtual gateway&#39;s listener&#39;s Transport Layer Security (TLS) validation context.
     * @return builder
     */
    def subjectAlternativeNames(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesArgs.builder
      builder.subjectAlternativeNames(args(argsBuilder).build)

    /**
     * @param trust TLS validation context trust.
     * @return builder
     */
    def trust(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationTrustArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationTrustArgs.builder
      builder.trust(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendArgs.Builder)
    /**
     * @param virtualService Virtual service to use as a backend for a virtual node.
     * @return builder
     */
    def virtualService(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceArgs.builder
      builder.virtualService(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs.Builder)
    /**
     * @param subjectAlternativeNames SANs for a TLS validation context.
     * @return builder
     */
    def subjectAlternativeNames(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesArgs.builder
      builder.subjectAlternativeNames(args(argsBuilder).build)

    /**
     * @param trust TLS validation context trust.
     * @return builder
     */
    def trust(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs.builder
      builder.trust(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchHeaderArgs.Builder)
    /**
     * @param match Method and value to match the header value sent with a request. Specify one match method.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchHeaderMatchArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchHeaderMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationTrustArgs.Builder)
    /**
     * @param file TLS validation context trust for a local file certificate.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationTrustFileArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationTrustArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationTrustFileArgs.builder
      builder.file(args(argsBuilder).build)

    /**
     * @param sds TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * @return builder
     */
    def sds(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationTrustSdsArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationTrustArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationTrustSdsArgs.builder
      builder.sds(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateArgs.Builder)
    /**
     * @param file Local file certificate.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFileArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFileArgs.builder
      builder.file(args(argsBuilder).build)

    /**
     * @param sds A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * @return builder
     */
    def sds(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsArgs.builder
      builder.sds(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteTimeoutArgs.Builder)
    /**
     * @param idle Idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * @return builder
     */
    def idle(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteTimeoutIdleArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteTimeoutArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteTimeoutIdleArgs.builder
      builder.idle(args(argsBuilder).build)

    /**
     * @param perRequest Per request timeout.
     * @return builder
     */
    def perRequest(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteTimeoutPerRequestArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteTimeoutArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteTimeoutPerRequestArgs.builder
      builder.perRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateArgs.Builder)
    /**
     * @param acm An AWS Certificate Manager (ACM) certificate.
     * @return builder
     */
    def acm(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateAcmArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateAcmArgs.builder
      builder.acm(args(argsBuilder).build)

    /**
     * @param file Local file certificate.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateFileArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateFileArgs.builder
      builder.file(args(argsBuilder).build)

    /**
     * @param sds A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * @return builder
     */
    def sds(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateSdsArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateSdsArgs.builder
      builder.sds(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs.Builder)
    /**
     * @param acm TLS validation context trust for an AWS Certificate Manager (ACM) certificate.
     * @return builder
     */
    def acm(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcmArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcmArgs.builder
      builder.acm(args(argsBuilder).build)

    /**
     * @param file TLS validation context trust for a local file certificate.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileArgs.builder
      builder.file(args(argsBuilder).build)

    /**
     * @param sds TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * @return builder
     */
    def sds(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsArgs.builder
      builder.sds(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteMatchMetadataMatchArgs.Builder)
    /**
     * @param range Object that specifies the range of numbers that the value sent by the client must be included in.
     * @return builder
     */
    def range(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteMatchMetadataMatchRangeArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteMatchMetadataMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteMatchMetadataMatchRangeArgs.builder
      builder.range(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingAccessLogArgs.Builder)
    /**
     * @param file File object to send virtual node access logs to.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingAccessLogFileArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingAccessLogArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingAccessLogFileArgs.builder
      builder.file(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyArgs.Builder)
    /**
     * @param tls Transport Layer Security (TLS) client policy.
     * @return builder
     */
    def tls(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsArgs.builder
      builder.tls(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsArgs.Builder)
    /**
     * @param certificate Listener&#39;s TLS certificate.
     * @return builder
     */
    def certificate(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    /**
     * @param validation Listener&#39;s Transport Layer Security (TLS) validation context.
     * @return builder
     */
    def validation(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationArgs.builder
      builder.validation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesArgs.Builder)
    /**
     * @param match Criteria for determining a SAN&#39;s match.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateArgs.Builder)
    /**
     * @param file Local file certificate.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileArgs.builder
      builder.file(args(argsBuilder).build)

    /**
     * @param sds A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * @return builder
     */
    def sds(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateSdsArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateSdsArgs.builder
      builder.sds(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchArgs.Builder)
    /**
     * @param headers Client request headers to match on.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchHeaderArgs.Builder]*):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param path Client request path to match on.
     * @return builder
     */
    def path(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchPathArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchPathArgs.builder
      builder.path(args(argsBuilder).build)

    /**
     * @param queryParameters Client request query parameters to match on.
     * @return builder
     */
    def queryParameters(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchQueryParameterArgs.Builder]*):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchQueryParameterArgs.builder
      builder.queryParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsArgs.Builder)
    /**
     * @param clientPolicy Default client policy for virtual gateway backends.
     * @return builder
     */
    def clientPolicy(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyArgs.builder
      builder.clientPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchQueryParameterArgs.Builder)
    /**
     * @param match The query parameter to match on.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchQueryParameterMatchArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchQueryParameterArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchQueryParameterMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogFileFormatArgs.Builder)
    /**
     * @param jsons The logging format for JSON.
     * @return builder
     */
    def jsons(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogFileFormatJsonArgs.Builder]*):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogFileFormatArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogFileFormatJsonArgs.builder
      builder.jsons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteTimeoutArgs.Builder)
    /**
     * @param idle Idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * @return builder
     */
    def idle(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteTimeoutIdleArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteTimeoutArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteTimeoutIdleArgs.builder
      builder.idle(args(argsBuilder).build)

    /**
     * @param perRequest Per request timeout.
     * @return builder
     */
    def perRequest(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteTimeoutPerRequestArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteTimeoutArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteTimeoutPerRequestArgs.builder
      builder.perRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingAccessLogFileArgs.Builder)
    /**
     * @param format The specified format for the logs.
     * @return builder
     */
    def format(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingAccessLogFileFormatArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingAccessLogFileArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingAccessLogFileFormatArgs.builder
      builder.format(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.MeshSpecArgs.Builder)
    /**
     * @param egressFilter Egress filter rules for the service mesh.
     * @return builder
     */
    def egressFilter(args: Endofunction[com.pulumi.aws.appmesh.inputs.MeshSpecEgressFilterArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.MeshSpecArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.MeshSpecEgressFilterArgs.builder
      builder.egressFilter(args(argsBuilder).build)

    /**
     * @param serviceDiscovery The service discovery information for the service mesh.
     * @return builder
     */
    def serviceDiscovery(args: Endofunction[com.pulumi.aws.appmesh.inputs.MeshSpecServiceDiscoveryArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.MeshSpecArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.MeshSpecServiceDiscoveryArgs.builder
      builder.serviceDiscovery(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsArgs.Builder)
    /**
     * @param certificate Listener&#39;s TLS certificate.
     * @return builder
     */
    def certificate(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsCertificateArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    /**
     * @param validation Listener&#39;s Transport Layer Security (TLS) validation context.
     * @return builder
     */
    def validation(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationArgs.builder
      builder.validation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteArgs.Builder)
    /**
     * @param action Action to take if a match is determined.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param match Criteria for determining a request match.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualServiceState.Builder)
    /**
     * @param spec Virtual service specification to apply.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualServiceSpecArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualServiceState.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualServiceSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchHeaderArgs.Builder)
    /**
     * @param match Method and value to match the header value sent with a request. Specify one match method.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchHeaderMatchArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchHeaderMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchHeaderArgs.Builder)
    /**
     * @param match Method and value to match the header value sent with a request. Specify one match method.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchHeaderMatchArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchHeaderMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteActionArgs.Builder)
    /**
     * @param target Target that traffic is routed to when a request matches the gateway route.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteActionTargetArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteActionTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs.Builder)
    /**
     * @param subjectAlternativeNames SANs for a TLS validation context.
     * @return builder
     */
    def subjectAlternativeNames(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs.builder
      builder.subjectAlternativeNames(args(argsBuilder).build)

    /**
     * @param trust TLS validation context trust.
     * @return builder
     */
    def trust(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs.builder
      builder.trust(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualServiceSpecArgs.Builder)
    /**
     * @param provider App Mesh object that is acting as the provider for a virtual service. You can specify a single virtual node or virtual router.
     * @return builder
     */
    def provider(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualServiceSpecProviderArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualServiceSpecArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualServiceSpecProviderArgs.builder
      builder.provider(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutGrpcArgs.Builder)
    /**
     * @param idle Idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * @return builder
     */
    def idle(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutGrpcIdleArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutGrpcArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutGrpcIdleArgs.builder
      builder.idle(args(argsBuilder).build)

    /**
     * @param perRequest Per request timeout.
     * @return builder
     */
    def perRequest(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutGrpcPerRequestArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutGrpcArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutGrpcPerRequestArgs.builder
      builder.perRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteArgs.Builder)
    /**
     * @param action Action to take if a match is determined.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteActionArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param match Criteria for determining an HTTP request match.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param retryPolicy Retry policy.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteRetryPolicyArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param timeout Types of timeouts.
     * @return builder
     */
    def timeout(args: Endofunction[com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteTimeoutArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteTimeoutArgs.builder
      builder.timeout(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualRouterSpecArgs.Builder)
    /**
     * @param listeners Listeners that the virtual router is expected to receive inbound traffic from.
     *  Currently only one listener is supported per virtual router.
     * @return builder
     */
    def listeners(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualRouterSpecListenerArgs.Builder]*):
        com.pulumi.aws.appmesh.inputs.VirtualRouterSpecArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualRouterSpecListenerArgs.builder
      builder.listeners(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs.Builder)
    /**
     * @param certificate Listener&#39;s TLS certificate.
     * @return builder
     */
    def certificate(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    /**
     * @param validation Listener&#39;s Transport Layer Security (TLS) validation context.
     * @return builder
     */
    def validation(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs.builder
      builder.validation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.GatewayRouteState.Builder)
    /**
     * @param spec Gateway route specification to apply.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteState.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionTargetArgs.Builder)
    /**
     * @param virtualService Virtual service gateway route target.
     * @return builder
     */
    def virtualService(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs.builder
      builder.virtualService(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecArgs.Builder)
    /**
     * @param backendDefaults Defaults for backends.
     * @return builder
     */
    def backendDefaults(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsArgs.builder
      builder.backendDefaults(args(argsBuilder).build)

    /**
     * @param backends Backends to which the virtual node is expected to send outbound traffic.
     * @return builder
     */
    def backends(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendArgs.Builder]*):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendArgs.builder
      builder.backends(args.map(_(argsBuilder).build)*)

    /**
     * @param listeners Listeners from which the virtual node is expected to receive inbound traffic.
     * @return builder
     */
    def listeners(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerArgs.Builder]*):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecArgs.Builder =
      def argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerArgs.builder
      builder.listeners(args.map(_(argsBuilder).build)*)

    /**
     * @param logging Inbound and outbound access logging information for the virtual node.
     * @return builder
     */
    def logging(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param serviceDiscovery Service discovery information for the virtual node.
     * @return builder
     */
    def serviceDiscovery(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecServiceDiscoveryArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecServiceDiscoveryArgs.builder
      builder.serviceDiscovery(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyArgs.Builder)
    /**
     * @param tls Transport Layer Security (TLS) client policy.
     * @return builder
     */
    def tls(args: Endofunction[com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsArgs.builder
      builder.tls(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionRewriteArgs.Builder)
    /**
     * @param hostname Host name to rewrite.
     * @return builder
     */
    def hostname(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionRewriteHostnameArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionRewriteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionRewriteHostnameArgs.builder
      builder.hostname(args(argsBuilder).build)

    /**
     * @param path Exact path to rewrite.
     * @return builder
     */
    def path(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionRewritePathArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionRewriteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionRewritePathArgs.builder
      builder.path(args(argsBuilder).build)

    /**
     * @param prefix Specified beginning characters to rewrite.
     * @return builder
     */
    def prefix(args: Endofunction[com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionRewritePrefixArgs.Builder]):
        com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionRewriteArgs.Builder =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionRewritePrefixArgs.builder
      builder.prefix(args(argsBuilder).build)

  /** Provides an AWS App Mesh gateway route resource. */
  def GatewayRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appmesh.GatewayRouteArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appmesh.GatewayRouteArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appmesh.GatewayRoute(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
