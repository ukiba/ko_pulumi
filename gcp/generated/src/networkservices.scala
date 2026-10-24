package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object networkservices:
  /**
   * AgentConnectivityTemplate represents a reusable network configuration.
   * 
   * To get more information about AgentConnectivityTemplate, see:
   * 
   * * [API documentation](https://cloud.google.com/network-services/docs/reference/network-services/rest/v1/projects.locations.agentConnectivityTemplates)
   */
  def AgentConnectivityTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.AgentConnectivityTemplateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networkservices.AgentConnectivityTemplateArgs.builder
    com.pulumi.gcp.networkservices.AgentConnectivityTemplate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * AgentGateway represents the agent gateway resource.
   * 
   * To get more information about AgentGateway, see:
   * 
   * * [API documentation](https://cloud.google.com/network-services/docs/reference/network-services/rest/v1/projects.locations.agentGateways)
   */
  def AgentGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.AgentGatewayArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.AgentGatewayArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.AgentGateway(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * AuthzExtension is a resource that allows traffic forwarding to a callout backend service to make an authorization decision.
   * 
   * To get more information about AuthzExtension, see:
   * 
   * * [API documentation](https://cloud.google.com/service-extensions/docs/reference/rest/v1beta1/projects.locations.authzExtensions)
   */
  def AuthzExtension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.AuthzExtensionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.AuthzExtensionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.AuthzExtension(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * EdgeCacheKeyset represents a collection of public keys used for validating signed requests.
   * 
   * To get more information about EdgeCacheKeyset, see:
   * 
   * * [API documentation](https://cloud.google.com/media-cdn/docs/reference/rest/v1/projects.locations.edgeCacheKeysets)
   * * How-to Guides
   *     * [Create keysets](https://cloud.google.com/media-cdn/docs/create-keyset)
   */
  def EdgeCacheKeyset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.EdgeCacheKeysetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.EdgeCacheKeysetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.EdgeCacheKeyset(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * EdgeCacheOrigin represents a HTTP-reachable backend for an EdgeCacheService.
   * 
   * To get more information about EdgeCacheOrigin, see:
   * 
   * * [API documentation](https://cloud.google.com/media-cdn/docs/reference/rest/v1/projects.locations.edgeCacheOrigins)
   */
  def EdgeCacheOrigin(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.EdgeCacheOriginArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.EdgeCacheOriginArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.EdgeCacheOrigin(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * EdgeCacheService defines the IP addresses, protocols, security policies, cache policies and routing configuration.
   * 
   * &gt; **Warning:** These resources require allow-listing to use, and are not openly available to all Cloud customers. Engage with your Cloud account team to discuss how to onboard.
   */
  def EdgeCacheService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.EdgeCacheServiceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.EdgeCacheServiceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.EdgeCacheService(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * EndpointPolicy is a resource that helps apply desired configuration on the endpoints that match specific criteria.
   * 
   * To get more information about EndpointPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-services/rest/v1beta1/projects.locations.endpointPolicies)
   */
  def EndpointPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.EndpointPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.EndpointPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.EndpointPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Gateway represents the configuration for a proxy, typically a load balancer.
   * It captures the ip:port over which the services are exposed by the proxy,
   * along with any policy configurations. Routes have reference to to Gateways
   * to dictate how requests should be routed by this Gateway.
   * 
   * To get more information about Gateway, see:
   * 
   * * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-services/rest/v1/projects.locations.gateways)
   */
  def Gateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.GatewayArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.GatewayArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.Gateway(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * GrpcRoute is the resource defining how gRPC traffic routed by a Mesh or Gateway resource is routed.
   * 
   * To get more information about GrpcRoute, see:
   * 
   * * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-services/rest/v1beta1/projects.locations.grpcRoutes)
   */
  def GrpcRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.GrpcRouteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.GrpcRouteArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.GrpcRoute(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * HttpRoute is the resource defining how HTTP traffic should be routed by a Mesh or Gateway resource.
   * 
   * To get more information about HttpRoute, see:
   * 
   * * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-services/rest/v1beta1/projects.locations.httpRoutes)
   * * How-to Guides
   *     * [Setup HTTP Services](https://cloud.google.com/traffic-director/docs/set-up-envoy-http-mesh)
   */
  def HttpRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.HttpRouteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.HttpRouteArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.HttpRoute(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * LbEdgeExtension is a resource that lets the extension service influence the selection of backend services and Cloud CDN cache keys by modifying request headers.
   * 
   * To get more information about LbEdgeExtension, see:
   * 
   * * [API documentation](https://cloud.google.com/service-extensions/docs/reference/rest/v1beta1/projects.locations.lbEdgeExtensions)
   * * How-to Guides
   *     * [Configure a edge extension](https://cloud.google.com/service-extensions/docs/configure-edge-extensions)
   */
  def LbEdgeExtension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.LbEdgeExtensionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.LbEdgeExtensionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.LbEdgeExtension(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * LbRouteExtension is a resource that lets you control where traffic is routed to for a given request.
   * 
   * To get more information about LbRouteExtension, see:
   * 
   * * [API documentation](https://cloud.google.com/service-extensions/docs/reference/rest/v1/projects.locations.lbRouteExtensions)
   * * How-to Guides
   *     * [Configure a route extension](https://cloud.google.com/service-extensions/docs/configure-callout#configure_a_route_extension)
   */
  def LbRouteExtension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.LbRouteExtensionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.LbRouteExtensionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.LbRouteExtension(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * LbTrafficExtension is a resource that lets the extension service modify the headers and payloads of both requests and responses without impacting the choice of backend services or any other security policies associated with the backend service.
   * 
   * To get more information about LbTrafficExtension, see:
   * 
   * * [API documentation](https://cloud.google.com/service-extensions/docs/reference/rest/v1beta1/projects.locations.lbTrafficExtensions)
   * * How-to Guides
   *     * [Configure a traffic extension](https://cloud.google.com/service-extensions/docs/configure-callout#configure_a_traffic_extension)
   */
  def LbTrafficExtension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.LbTrafficExtensionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.LbTrafficExtensionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.LbTrafficExtension(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Mesh represents a logical configuration grouping for workload to workload communication within a
   * service mesh. Routes that point to mesh dictate how requests are routed within this logical
   * mesh boundary.
   * 
   * To get more information about Mesh, see:
   * 
   * * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-services/rest/v1beta1/projects.locations.meshes)
   */
  def Mesh(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.MeshArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.MeshArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.Mesh(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Create a multicast consumer association in the specified location of the current project.
   * 
   * To get more information about MulticastConsumerAssociation, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/vpc/docs/multicast/reference/rest/v1/projects.locations.multicastConsumerAssociations)
   * * How-to Guides
   *     * [Create Multicast Consumer Association](https://docs.cloud.google.com/vpc/docs/multicast/enable-consumer-network#add-consumer)
   */
  def MulticastConsumerAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.MulticastConsumerAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networkservices.MulticastConsumerAssociationArgs.builder
    com.pulumi.gcp.networkservices.MulticastConsumerAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Create a multicast domain in the current project.
   * 
   * To get more information about MulticastDomain, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/vpc/docs/multicast/reference/rest/v1/projects.locations.multicastDomains)
   * * How-to Guides
   *     * [Create Multicast Domain](https://docs.cloud.google.com/vpc/docs/multicast/create-domains#create-domain)
   */
  def MulticastDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.MulticastDomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networkservices.MulticastDomainArgs.builder
    com.pulumi.gcp.networkservices.MulticastDomain(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Create a multicast domain activation in the specified location of the current project.
   * 
   * To get more information about MulticastDomainActivation, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/vpc/docs/multicast/reference/rest/v1/projects.locations.multicastDomainActivations)
   * * How-to Guides
   *     * [Create Multicast Domain Activation](https://docs.cloud.google.com/vpc/docs/multicast/create-domains#activate-domain)
   */
  def MulticastDomainActivation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.MulticastDomainActivationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networkservices.MulticastDomainActivationArgs.builder
    com.pulumi.gcp.networkservices.MulticastDomainActivation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Create a multicast domain group in the current project.
   * 
   * To get more information about MulticastDomainGroup, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/vpc/docs/multicast/reference/rest/v1/projects.locations.multicastDomainGroups)
   * * How-to Guides
   *     * [Create Multicast Domain Group](https://docs.cloud.google.com/vpc/docs/multicast/create-domains#create-domain-group)
   */
  def MulticastDomainGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.MulticastDomainGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networkservices.MulticastDomainGroupArgs.builder
    com.pulumi.gcp.networkservices.MulticastDomainGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Create a multicast group consumer activation in the specified location of the current project.
   * 
   * To get more information about MulticastGroupConsumerActivation, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/vpc/docs/multicast/reference/rest/v1/projects.locations.multicastGroupConsumerActivations)
   * * How-to Guides
   *     * [Create Multicast Group Consumer Activation](https://docs.cloud.google.com/vpc/docs/multicast/enable-consumer-network#activate-consumer)
   */
  def MulticastGroupConsumerActivation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.MulticastGroupConsumerActivationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networkservices.MulticastGroupConsumerActivationArgs.builder
    com.pulumi.gcp.networkservices.MulticastGroupConsumerActivation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Create a multicast group producer activation in the specified location of the current project.
   * 
   * To get more information about MulticastGroupProducerActivation, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/vpc/docs/multicast/reference/rest/v1/projects.locations.multicastGroupProducerActivations)
   * * How-to Guides
   *     * [Create Multicast Group Producer Activation](https://docs.cloud.google.com/vpc/docs/multicast/enable-producer-network#activate-producer)
   */
  def MulticastGroupProducerActivation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.MulticastGroupProducerActivationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networkservices.MulticastGroupProducerActivationArgs.builder
    com.pulumi.gcp.networkservices.MulticastGroupProducerActivation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Create a multicast group range in the current project.
   * 
   * To get more information about MulticastGroupRange, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/vpc/docs/multicast/reference/rest/v1/projects.locations.multicastGroupRanges)
   * * How-to Guides
   *     * [Create Multicast Group Range](https://docs.cloud.google.com/vpc/docs/multicast/create-group-ranges#create_a_group_range)
   */
  def MulticastGroupRange(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.MulticastGroupRangeArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networkservices.MulticastGroupRangeArgs.builder
    com.pulumi.gcp.networkservices.MulticastGroupRange(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Create a multicast group range activation in the specified location of the current project.
   * 
   * To get more information about MulticastGroupRangeActivation, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/vpc/docs/multicast/reference/rest/v1/projects.locations.multicastGroupRangeActivations)
   * * How-to Guides
   *     * [Create Multicast Group Range Activation](https://docs.cloud.google.com/vpc/docs/multicast/create-group-ranges#activate_the_group_range)
   */
  def MulticastGroupRangeActivation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.MulticastGroupRangeActivationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networkservices.MulticastGroupRangeActivationArgs.builder
    com.pulumi.gcp.networkservices.MulticastGroupRangeActivation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Create a multicast producer association in the specified location of the current project.
   * 
   * To get more information about MulticastProducerAssociation, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/vpc/docs/multicast/reference/rest/v1/projects.locations.multicastProducerAssociations)
   * * How-to Guides
   *     * [Create Multicast Producer Association](https://docs.cloud.google.com/vpc/docs/multicast/enable-producer-network#create-producer)
   */
  def MulticastProducerAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.MulticastProducerAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networkservices.MulticastProducerAssociationArgs.builder
    com.pulumi.gcp.networkservices.MulticastProducerAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object NetworkservicesFunctions:
    /** Get information about a Network Services Gateway. */
    inline def getGateway(args: Endofunction[com.pulumi.gcp.networkservices.inputs.GetGatewayArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.networkservices.outputs.GetGatewayResult] =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.GetGatewayArgs.builder
      com.pulumi.gcp.networkservices.NetworkservicesFunctions.getGateway(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get information about a Network Services Gateway. */
    inline def getGatewayPlain(args: Endofunction[com.pulumi.gcp.networkservices.inputs.GetGatewayPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.networkservices.outputs.GetGatewayResult] =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.GetGatewayPlainArgs.builder
      com.pulumi.gcp.networkservices.NetworkservicesFunctions.getGatewayPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * &gt; **Warning:** Cloud Service Mesh&#39;s integration with Service Directory is going to be deprecated. [Learn more](https://docs.cloud.google.com/service-mesh/docs/service-routing/service-directory-integration-setup). Creating new service binding resources will be disabled.
   * 
   * ServiceBinding is the resource that defines a Service Directory Service to be used in a
   * BackendService resource.
   * 
   * To get more information about ServiceBinding, see:
   * 
   * * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-services/rest/v1beta1/projects.locations.serviceBindings)
   */
  def ServiceBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.ServiceBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.ServiceBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.ServiceBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * ServiceLbPolicy holds global load balancing and traffic distribution configuration that can be applied to a BackendService.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about ServiceLbPolicies, see:
   * 
   * * [API documentation](https://cloud.google.com/service-mesh/docs/reference/network-services/rest/v1/projects.locations.serviceLbPolicies)
   */
  def ServiceLbPolicies(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.ServiceLbPoliciesArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.ServiceLbPoliciesArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.ServiceLbPolicies(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * TcpRoute is the resource defining how TCP traffic should be routed by a Mesh/Gateway resource.
   * 
   * To get more information about TcpRoute, see:
   * 
   * * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-services/rest/v1beta1/projects.locations.tcpRoutes)
   * * How-to Guides
   *     * [Setup TCP Services](https://cloud.google.com/traffic-director/docs/set-up-tcp-route)
   */
  def TcpRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.TcpRouteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.TcpRouteArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.TcpRoute(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * TlsRoute defines how traffic should be routed based on SNI and other matching L3 attributes.
   * 
   * To get more information about TlsRoute, see:
   * 
   * * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-services/rest/v1beta1/projects.locations.tlsRoutes)
   */
  def TlsRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.TlsRouteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.TlsRouteArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.TlsRoute(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * WasmPlugin is a resource representing a service executing a customer-provided Wasm module.
   * 
   * To get more information about WasmPlugin, see:
   * 
   * * [API documentation](https://cloud.google.com/service-extensions/docs/reference/rest/v1/projects.locations.wasmPlugins)
   * * How-to Guides
   *     * [Configure a route extension](https://cloud.google.com/service-extensions/docs/create-plugin)
   */
  def WasmPlugin(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.WasmPluginArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.WasmPluginArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.WasmPlugin(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
