package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object networkservices:
  /**
   * AuthzExtension is a resource that allows traffic forwarding to a callout backend service to make an authorization decision.
   * 
   *  To get more information about AuthzExtension, see:
   * 
   *  * [API documentation](https://cloud.google.com/service-extensions/docs/reference/rest/v1beta1/projects.locations.authzExtensions)
   */
  def AuthzExtension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.AuthzExtensionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.AuthzExtensionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.AuthzExtension(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networkservices.ServiceLbPoliciesArgs.Builder)
    /**
     * @param autoCapacityDrain Option to specify if an unhealthy MIG/NEG should be considered for global load balancing and traffic routing.
     *  Structure is documented below.
     * @return builder
     */
    def autoCapacityDrain(args: Endofunction[com.pulumi.gcp.networkservices.inputs.ServiceLbPoliciesAutoCapacityDrainArgs.Builder]):
        com.pulumi.gcp.networkservices.ServiceLbPoliciesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.ServiceLbPoliciesAutoCapacityDrainArgs.builder
      builder.autoCapacityDrain(args(argsBuilder).build)

    /**
     * @param failoverConfig Option to specify health based failover behavior. This is not related to Network load balancer FailoverPolicy.
     *  Structure is documented below.
     * @return builder
     */
    def failoverConfig(args: Endofunction[com.pulumi.gcp.networkservices.inputs.ServiceLbPoliciesFailoverConfigArgs.Builder]):
        com.pulumi.gcp.networkservices.ServiceLbPoliciesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.ServiceLbPoliciesFailoverConfigArgs.builder
      builder.failoverConfig(args(argsBuilder).build)

    /**
     * @param isolationConfig Configuration to provide isolation support for the associated Backend Service.
     *  Structure is documented below.
     * @return builder
     */
    def isolationConfig(args: Endofunction[com.pulumi.gcp.networkservices.inputs.ServiceLbPoliciesIsolationConfigArgs.Builder]):
        com.pulumi.gcp.networkservices.ServiceLbPoliciesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.ServiceLbPoliciesIsolationConfigArgs.builder
      builder.isolationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.MulticastDomainArgs.Builder)
    /**
     * @param connectionConfig VPC connectivity information.
     *  Structure is documented below.
     * @return builder
     */
    def connectionConfig(args: Endofunction[com.pulumi.gcp.networkservices.inputs.MulticastDomainConnectionConfigArgs.Builder]):
        com.pulumi.gcp.networkservices.MulticastDomainArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.MulticastDomainConnectionConfigArgs.builder
      builder.connectionConfig(args(argsBuilder).build)

    /**
     * @param ullMulticastDomain Information for an Ultra-Low-Latency multicast domain.
     *  Structure is documented below.
     * @return builder
     */
    def ullMulticastDomain(args: Endofunction[com.pulumi.gcp.networkservices.inputs.MulticastDomainUllMulticastDomainArgs.Builder]):
        com.pulumi.gcp.networkservices.MulticastDomainArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.MulticastDomainUllMulticastDomainArgs.builder
      builder.ullMulticastDomain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.EndpointPolicyArgs.Builder)
    /**
     * @param endpointMatcher Required. A matcher that selects endpoints to which the policies should be applied.
     *  Structure is documented below.
     * @return builder
     */
    def endpointMatcher(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EndpointPolicyEndpointMatcherArgs.Builder]):
        com.pulumi.gcp.networkservices.EndpointPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EndpointPolicyEndpointMatcherArgs.builder
      builder.endpointMatcher(args(argsBuilder).build)

    /**
     * @param trafficPortSelector Port selector for the (matched) endpoints. If no port selector is provided, the matched config is applied to all ports.
     *  Structure is documented below.
     * @return builder
     */
    def trafficPortSelector(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EndpointPolicyTrafficPortSelectorArgs.Builder]):
        com.pulumi.gcp.networkservices.EndpointPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EndpointPolicyTrafficPortSelectorArgs.builder
      builder.trafficPortSelector(args(argsBuilder).build)

  /**
   * Create a multicast domain group in the current project.
   * 
   *  To get more information about MulticastDomainGroup, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/vpc/docs/multicast/reference/rest/v1/projects.locations.multicastDomainGroups)
   *  * How-to Guides
   *      * [Create Multicast Domain Group](https://docs.cloud.google.com/vpc/docs/multicast/create-domains#create-domain-group)
   */
  def MulticastDomainGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.MulticastDomainGroupArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networkservices.MulticastDomainGroupArgs.builder
    com.pulumi.gcp.networkservices.MulticastDomainGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * TcpRoute is the resource defining how TCP traffic should be routed by a Mesh/Gateway resource.
   * 
   *  To get more information about TcpRoute, see:
   * 
   *  * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-services/rest/v1beta1/projects.locations.tcpRoutes)
   *  * How-to Guides
   *      * [Setup TCP Services](https://cloud.google.com/traffic-director/docs/set-up-tcp-route)
   */
  def TcpRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.TcpRouteArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.TcpRouteArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.TcpRoute(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networkservices.TlsRouteArgs.Builder)
    /**
     * @param rules Rules that define how traffic is routed and handled.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.networkservices.inputs.TlsRouteRuleArgs.Builder]*):
        com.pulumi.gcp.networkservices.TlsRouteArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.TlsRouteRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  /**
   * Create a multicast group producer activation in the specified location of the current project.
   * 
   *  To get more information about MulticastGroupProducerActivation, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/vpc/docs/multicast/reference/rest/v1/projects.locations.multicastGroupProducerActivations)
   *  * How-to Guides
   *      * [Create Multicast Group Producer Activation](https://docs.cloud.google.com/vpc/docs/multicast/enable-producer-network#activate-producer)
   */
  def MulticastGroupProducerActivation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.MulticastGroupProducerActivationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networkservices.MulticastGroupProducerActivationArgs.builder
    com.pulumi.gcp.networkservices.MulticastGroupProducerActivation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Create a multicast group range in the current project.
   * 
   *  To get more information about MulticastGroupRange, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/vpc/docs/multicast/reference/rest/v1/projects.locations.multicastGroupRanges)
   *  * How-to Guides
   *      * [Create Multicast Group Range](https://docs.cloud.google.com/vpc/docs/multicast/create-group-ranges#create_a_group_range)
   */
  def MulticastGroupRange(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.MulticastGroupRangeArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networkservices.MulticastGroupRangeArgs.builder
    com.pulumi.gcp.networkservices.MulticastGroupRange(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * AgentGateway represents the agent gateway resource.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about AgentGateway, see:
   * 
   *  * [API documentation](https://cloud.google.com/network-services/docs/reference/network-services/rest/v1beta1/projects.locations.agentGateways)
   */
  def AgentGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.AgentGatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.AgentGatewayArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.AgentGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * WasmPlugin is a resource representing a service executing a customer-provided Wasm module.
   * 
   *  To get more information about WasmPlugin, see:
   * 
   *  * [API documentation](https://cloud.google.com/service-extensions/docs/reference/rest/v1/projects.locations.wasmPlugins)
   *  * How-to Guides
   *      * [Configure a route extension](https://cloud.google.com/service-extensions/docs/create-plugin)
   */
  def WasmPlugin(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.WasmPluginArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.WasmPluginArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.WasmPlugin(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networkservices.TcpRouteArgs.Builder)
    /**
     * @param rules Rules that define how traffic is routed and handled. At least one RouteRule must be supplied.
     *  If there are multiple rules then the action taken will be the first rule to match.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.networkservices.inputs.TcpRouteRuleArgs.Builder]*):
        com.pulumi.gcp.networkservices.TcpRouteArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.TcpRouteRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  /**
   * Create a multicast domain in the current project.
   * 
   *  To get more information about MulticastDomain, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/vpc/docs/multicast/reference/rest/v1/projects.locations.multicastDomains)
   *  * How-to Guides
   *      * [Create Multicast Domain](https://docs.cloud.google.com/vpc/docs/multicast/create-domains#create-domain)
   */
  def MulticastDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.MulticastDomainArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networkservices.MulticastDomainArgs.builder
    com.pulumi.gcp.networkservices.MulticastDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networkservices.AgentGatewayArgs.Builder)
    /**
     * @param googleManaged Configuration for Google Managed deployment mode.
     *  Proxy is orchestrated and managed by GoogleCloud in a tenant project.
     *  Structure is documented below.
     * @return builder
     */
    def googleManaged(args: Endofunction[com.pulumi.gcp.networkservices.inputs.AgentGatewayGoogleManagedArgs.Builder]):
        com.pulumi.gcp.networkservices.AgentGatewayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.AgentGatewayGoogleManagedArgs.builder
      builder.googleManaged(args(argsBuilder).build)

    /**
     * @param networkConfig Network configuration for the AgentGateway.
     *  Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.networkservices.inputs.AgentGatewayNetworkConfigArgs.Builder]):
        com.pulumi.gcp.networkservices.AgentGatewayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.AgentGatewayNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param selfManaged Configuration for Self Managed deployment mode.
     *  Attach to existing Application Load Balancers or Secure Web Proxies.
     *  Structure is documented below.
     * @return builder
     */
    def selfManaged(args: Endofunction[com.pulumi.gcp.networkservices.inputs.AgentGatewaySelfManagedArgs.Builder]):
        com.pulumi.gcp.networkservices.AgentGatewayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.AgentGatewaySelfManagedArgs.builder
      builder.selfManaged(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.GrpcRouteArgs.Builder)
    /**
     * @param rules Rules that define how traffic is routed and handled.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleArgs.Builder]*):
        com.pulumi.gcp.networkservices.GrpcRouteArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  /**
   * Create a multicast group range activation in the specified location of the current project.
   * 
   *  To get more information about MulticastGroupRangeActivation, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/vpc/docs/multicast/reference/rest/v1/projects.locations.multicastGroupRangeActivations)
   *  * How-to Guides
   *      * [Create Multicast Group Range Activation](https://docs.cloud.google.com/vpc/docs/multicast/create-group-ranges#activate_the_group_range)
   */
  def MulticastGroupRangeActivation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.MulticastGroupRangeActivationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networkservices.MulticastGroupRangeActivationArgs.builder
    com.pulumi.gcp.networkservices.MulticastGroupRangeActivation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Gateway represents the configuration for a proxy, typically a load balancer.
   *  It captures the ip:port over which the services are exposed by the proxy,
   *  along with any policy configurations. Routes have reference to to Gateways
   *  to dictate how requests should be routed by this Gateway.
   * 
   *  To get more information about Gateway, see:
   * 
   *  * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-services/rest/v1/projects.locations.gateways)
   */
  def Gateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.GatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.GatewayArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.Gateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Create a multicast producer association in the specified location of the current project.
   * 
   *  To get more information about MulticastProducerAssociation, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/vpc/docs/multicast/reference/rest/v1/projects.locations.multicastProducerAssociations)
   *  * How-to Guides
   *      * [Create Multicast Producer Association](https://docs.cloud.google.com/vpc/docs/multicast/enable-producer-network#create-producer)
   */
  def MulticastProducerAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.MulticastProducerAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networkservices.MulticastProducerAssociationArgs.builder
    com.pulumi.gcp.networkservices.MulticastProducerAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * EndpointPolicy is a resource that helps apply desired configuration on the endpoints that match specific criteria.
   * 
   *  To get more information about EndpointPolicy, see:
   * 
   *  * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-services/rest/v1beta1/projects.locations.endpointPolicies)
   */
  def EndpointPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.EndpointPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.EndpointPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.EndpointPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * EdgeCacheKeyset represents a collection of public keys used for validating signed requests.
   * 
   *  To get more information about EdgeCacheKeyset, see:
   * 
   *  * [API documentation](https://cloud.google.com/media-cdn/docs/reference/rest/v1/projects.locations.edgeCacheKeysets)
   *  * How-to Guides
   *      * [Create keysets](https://cloud.google.com/media-cdn/docs/create-keyset)
   */
  def EdgeCacheKeyset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.EdgeCacheKeysetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.EdgeCacheKeysetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.EdgeCacheKeyset(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networkservices.LbEdgeExtensionArgs.Builder)
    /**
     * @param extensionChains A set of ordered extension chains that contain the match conditions and extensions to execute.
     *  Match conditions for each extension chain are evaluated in sequence for a given request.
     *  The first extension chain that has a condition that matches the request is executed.
     *  Any subsequent extension chains do not execute. Limited to 5 extension chains per resource.
     *  Structure is documented below.
     * @return builder
     */
    def extensionChains(args: Endofunction[com.pulumi.gcp.networkservices.inputs.LbEdgeExtensionExtensionChainArgs.Builder]*):
        com.pulumi.gcp.networkservices.LbEdgeExtensionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.LbEdgeExtensionExtensionChainArgs.builder
      builder.extensionChains(args.map(_(argsBuilder).build)*)

  /**
   * Create a multicast consumer association in the specified location of the current project.
   * 
   *  To get more information about MulticastConsumerAssociation, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/vpc/docs/multicast/reference/rest/v1/projects.locations.multicastConsumerAssociations)
   *  * How-to Guides
   *      * [Create Multicast Consumer Association](https://docs.cloud.google.com/vpc/docs/multicast/enable-consumer-network#add-consumer)
   */
  def MulticastConsumerAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.MulticastConsumerAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networkservices.MulticastConsumerAssociationArgs.builder
    com.pulumi.gcp.networkservices.MulticastConsumerAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networkservices.MulticastDomainActivationArgs.Builder)
    /**
     * @param trafficSpec Specifies the traffic volume and multicast group scale parameters that are
     *  used to set up multicast infrastructure for a multicast domain in a zone.
     *  Structure is documented below.
     * @return builder
     */
    def trafficSpec(args: Endofunction[com.pulumi.gcp.networkservices.inputs.MulticastDomainActivationTrafficSpecArgs.Builder]):
        com.pulumi.gcp.networkservices.MulticastDomainActivationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.MulticastDomainActivationTrafficSpecArgs.builder
      builder.trafficSpec(args(argsBuilder).build)

  /**
   * LbRouteExtension is a resource that lets you control where traffic is routed to for a given request.
   * 
   *  To get more information about LbRouteExtension, see:
   * 
   *  * [API documentation](https://cloud.google.com/service-extensions/docs/reference/rest/v1/projects.locations.lbRouteExtensions)
   *  * How-to Guides
   *      * [Configure a route extension](https://cloud.google.com/service-extensions/docs/configure-callout#configure_a_route_extension)
   */
  def LbRouteExtension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.LbRouteExtensionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.LbRouteExtensionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.LbRouteExtension(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networkservices.EdgeCacheKeysetArgs.Builder)
    /**
     * @param publicKeys An ordered list of Ed25519 public keys to use for validating signed requests.
     *  You must specify `publicKeys` or `validationSharedKeys` (or both). The keys in `publicKeys` are checked first.
     *  You may specify no more than one Google-managed public key.
     *  If you specify `publicKeys`, you must specify at least one (1) key and may specify up to three (3) keys.
     *  Ed25519 public keys are not secret, and only allow Google to validate a request was signed by your corresponding private key.
     *  Ensure that the private key is kept secret, and that only authorized users can add public keys to a keyset.
     *  Structure is documented below.
     * @return builder
     */
    def publicKeys(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheKeysetPublicKeyArgs.Builder]*):
        com.pulumi.gcp.networkservices.EdgeCacheKeysetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheKeysetPublicKeyArgs.builder
      builder.publicKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param validationSharedKeys An ordered list of shared keys to use for validating signed requests.
     *  Shared keys are secret.  Ensure that only authorized users can add `validationSharedKeys` to a keyset.
     *  You can rotate keys by appending (pushing) a new key to the list of `validationSharedKeys` and removing any superseded keys.
     *  You must specify `publicKeys` or `validationSharedKeys` (or both). The keys in `publicKeys` are checked first.
     *  Structure is documented below.
     * @return builder
     */
    def validationSharedKeys(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheKeysetValidationSharedKeyArgs.Builder]*):
        com.pulumi.gcp.networkservices.EdgeCacheKeysetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheKeysetValidationSharedKeyArgs.builder
      builder.validationSharedKeys(args.map(_(argsBuilder).build)*)

  /**
   * Create a multicast domain activation in the specified location of the current project.
   * 
   *  To get more information about MulticastDomainActivation, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/vpc/docs/multicast/reference/rest/v1/projects.locations.multicastDomainActivations)
   *  * How-to Guides
   *      * [Create Multicast Domain Activation](https://docs.cloud.google.com/vpc/docs/multicast/create-domains#activate-domain)
   */
  def MulticastDomainActivation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.MulticastDomainActivationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networkservices.MulticastDomainActivationArgs.builder
    com.pulumi.gcp.networkservices.MulticastDomainActivation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networkservices.EdgeCacheOriginArgs.Builder)
    /**
     * @param awsV4Authentication Enable AWS Signature Version 4 origin authentication.
     *  Structure is documented below.
     * @return builder
     */
    def awsV4Authentication(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginAwsV4AuthenticationArgs.Builder]):
        com.pulumi.gcp.networkservices.EdgeCacheOriginArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginAwsV4AuthenticationArgs.builder
      builder.awsV4Authentication(args(argsBuilder).build)

    /**
     * @param flexShielding The FlexShieldingOptions to be used for all routes to this origin.
     *  If not set, defaults to a global caching layer in front of the origin.
     *  Structure is documented below.
     * @return builder
     */
    def flexShielding(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginFlexShieldingArgs.Builder]):
        com.pulumi.gcp.networkservices.EdgeCacheOriginArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginFlexShieldingArgs.builder
      builder.flexShielding(args(argsBuilder).build)

    /**
     * @param originOverrideAction The override actions, including url rewrites and header
     *  additions, for requests that use this origin.
     *  Structure is documented below.
     * @return builder
     */
    def originOverrideAction(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginOriginOverrideActionArgs.Builder]):
        com.pulumi.gcp.networkservices.EdgeCacheOriginArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginOriginOverrideActionArgs.builder
      builder.originOverrideAction(args(argsBuilder).build)

    /**
     * @param originRedirect Follow redirects from this origin.
     *  Structure is documented below.
     * @return builder
     */
    def originRedirect(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginOriginRedirectArgs.Builder]):
        com.pulumi.gcp.networkservices.EdgeCacheOriginArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginOriginRedirectArgs.builder
      builder.originRedirect(args(argsBuilder).build)

    /**
     * @param timeout The connection and HTTP timeout configuration for this origin.
     *  Structure is documented below.
     * @return builder
     */
    def timeout(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginTimeoutArgs.Builder]):
        com.pulumi.gcp.networkservices.EdgeCacheOriginArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginTimeoutArgs.builder
      builder.timeout(args(argsBuilder).build)

  /**
   * TlsRoute defines how traffic should be routed based on SNI and other matching L3 attributes.
   * 
   *  To get more information about TlsRoute, see:
   * 
   *  * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-services/rest/v1beta1/projects.locations.tlsRoutes)
   */
  def TlsRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.TlsRouteArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.TlsRouteArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.TlsRoute(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * LbTrafficExtension is a resource that lets the extension service modify the headers and payloads of both requests and responses without impacting the choice of backend services or any other security policies associated with the backend service.
   * 
   *  To get more information about LbTrafficExtension, see:
   * 
   *  * [API documentation](https://cloud.google.com/service-extensions/docs/reference/rest/v1beta1/projects.locations.lbTrafficExtensions)
   *  * How-to Guides
   *      * [Configure a traffic extension](https://cloud.google.com/service-extensions/docs/configure-callout#configure_a_traffic_extension)
   */
  def LbTrafficExtension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.LbTrafficExtensionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.LbTrafficExtensionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.LbTrafficExtension(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * ServiceLbPolicy holds global load balancing and traffic distribution configuration that can be applied to a BackendService.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about ServiceLbPolicies, see:
   * 
   *  * [API documentation](https://cloud.google.com/service-mesh/docs/reference/network-services/rest/v1/projects.locations.serviceLbPolicies)
   */
  def ServiceLbPolicies(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.ServiceLbPoliciesArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.ServiceLbPoliciesArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.ServiceLbPolicies(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * GrpcRoute is the resource defining how gRPC traffic routed by a Mesh or Gateway resource is routed.
   * 
   *  To get more information about GrpcRoute, see:
   * 
   *  * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-services/rest/v1beta1/projects.locations.grpcRoutes)
   */
  def GrpcRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.GrpcRouteArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.GrpcRouteArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.GrpcRoute(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Create a multicast group consumer activation in the specified location of the current project.
   * 
   *  To get more information about MulticastGroupConsumerActivation, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/vpc/docs/multicast/reference/rest/v1/projects.locations.multicastGroupConsumerActivations)
   *  * How-to Guides
   *      * [Create Multicast Group Consumer Activation](https://docs.cloud.google.com/vpc/docs/multicast/enable-consumer-network#activate-consumer)
   */
  def MulticastGroupConsumerActivation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.MulticastGroupConsumerActivationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networkservices.MulticastGroupConsumerActivationArgs.builder
    com.pulumi.gcp.networkservices.MulticastGroupConsumerActivation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networkservices.HttpRouteArgs.Builder)
    /**
     * @param rules Rules that define how traffic is routed and handled.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.networkservices.inputs.HttpRouteRuleArgs.Builder]*):
        com.pulumi.gcp.networkservices.HttpRouteArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.HttpRouteRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.MulticastGroupRangeActivationArgs.Builder)
    /**
     * @param logConfig The logging configuration.
     *  Structure is documented below.
     * @return builder
     */
    def logConfig(args: Endofunction[com.pulumi.gcp.networkservices.inputs.MulticastGroupRangeActivationLogConfigArgs.Builder]):
        com.pulumi.gcp.networkservices.MulticastGroupRangeActivationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.MulticastGroupRangeActivationLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

  /**
   * LbEdgeExtension is a resource that lets the extension service influence the selection of backend services and Cloud CDN cache keys by modifying request headers.
   * 
   *  To get more information about LbEdgeExtension, see:
   * 
   *  * [API documentation](https://cloud.google.com/service-extensions/docs/reference/rest/v1beta1/projects.locations.lbEdgeExtensions)
   *  * How-to Guides
   *      * [Configure a edge extension](https://cloud.google.com/service-extensions/docs/configure-edge-extensions)
   */
  def LbEdgeExtension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.LbEdgeExtensionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.LbEdgeExtensionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.LbEdgeExtension(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * EdgeCacheOrigin represents a HTTP-reachable backend for an EdgeCacheService.
   * 
   *  To get more information about EdgeCacheOrigin, see:
   * 
   *  * [API documentation](https://cloud.google.com/media-cdn/docs/reference/rest/v1/projects.locations.edgeCacheOrigins)
   */
  def EdgeCacheOrigin(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.EdgeCacheOriginArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.EdgeCacheOriginArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.EdgeCacheOrigin(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networkservices.EdgeCacheServiceArgs.Builder)
    /**
     * @param logConfig Specifies the logging options for the traffic served by this service. If logging is enabled, logs will be exported to Cloud Logging.
     *  Structure is documented below.
     * @return builder
     */
    def logConfig(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceLogConfigArgs.Builder]):
        com.pulumi.gcp.networkservices.EdgeCacheServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param routing Defines how requests are routed, modified, cached and/or which origin content is filled from.
     *  Structure is documented below.
     * @return builder
     */
    def routing(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingArgs.Builder]):
        com.pulumi.gcp.networkservices.EdgeCacheServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingArgs.builder
      builder.routing(args(argsBuilder).build)

  /**
   * Mesh represents a logical configuration grouping for workload to workload communication within a
   *  service mesh. Routes that point to mesh dictate how requests are routed within this logical
   *  mesh boundary.
   * 
   *  To get more information about Mesh, see:
   * 
   *  * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-services/rest/v1beta1/projects.locations.meshes)
   */
  def Mesh(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.MeshArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.MeshArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.Mesh(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networkservices.LbRouteExtensionArgs.Builder)
    /**
     * @param extensionChains A set of ordered extension chains that contain the match conditions and extensions to execute.
     *  Match conditions for each extension chain are evaluated in sequence for a given request.
     *  The first extension chain that has a condition that matches the request is executed.
     *  Any subsequent extension chains do not execute. Limited to 5 extension chains per resource.
     *  Further information can be found at https://cloud.google.com/service-extensions/docs/reference/rest/v1/ExtensionChain
     *  Structure is documented below.
     * @return builder
     */
    def extensionChains(args: Endofunction[com.pulumi.gcp.networkservices.inputs.LbRouteExtensionExtensionChainArgs.Builder]*):
        com.pulumi.gcp.networkservices.LbRouteExtensionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.LbRouteExtensionExtensionChainArgs.builder
      builder.extensionChains(args.map(_(argsBuilder).build)*)

  /**
   * EdgeCacheService defines the IP addresses, protocols, security policies, cache policies and routing configuration.
   * 
   *  &gt; **Warning:** These resources require allow-listing to use, and are not openly available to all Cloud customers. Engage with your Cloud account team to discuss how to onboard.
   */
  def EdgeCacheService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.EdgeCacheServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.EdgeCacheServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.EdgeCacheService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * HttpRoute is the resource defining how HTTP traffic should be routed by a Mesh or Gateway resource.
   * 
   *  To get more information about HttpRoute, see:
   * 
   *  * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-services/rest/v1beta1/projects.locations.httpRoutes)
   *  * How-to Guides
   *      * [Setup HTTP Services](https://cloud.google.com/traffic-director/docs/set-up-envoy-http-mesh)
   */
  def HttpRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.HttpRouteArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.HttpRouteArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.HttpRoute(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Warning:** Cloud Service Mesh&#39;s integration with Service Directory is going to be deprecated. [Learn more](https://docs.cloud.google.com/service-mesh/docs/service-routing/service-directory-integration-setup). Creating new service binding resources will be disabled.
   * 
   *  ServiceBinding is the resource that defines a Service Directory Service to be used in a
   *  BackendService resource.
   * 
   *  To get more information about ServiceBinding, see:
   * 
   *  * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-services/rest/v1beta1/projects.locations.serviceBindings)
   */
  def ServiceBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkservices.ServiceBindingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkservices.ServiceBindingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkservices.ServiceBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networkservices.WasmPluginArgs.Builder)
    /**
     * @param logConfig Optional. Specifies the logging options for the activity performed by this plugin. If logging is enabled, plugin logs are exported to Cloud Logging.
     *  Note that the settings relate to the logs generated by using logging statements in your Wasm code.
     *  Structure is documented below.
     * @return builder
     */
    def logConfig(args: Endofunction[com.pulumi.gcp.networkservices.inputs.WasmPluginLogConfigArgs.Builder]):
        com.pulumi.gcp.networkservices.WasmPluginArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.WasmPluginLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param versions All versions of this WasmPlugin resource in the key-value format. The key is the resource ID, and the value is the VersionDetails object.
     *  Structure is documented below.
     * @return builder
     */
    def versions(args: Endofunction[com.pulumi.gcp.networkservices.inputs.WasmPluginVersionArgs.Builder]*):
        com.pulumi.gcp.networkservices.WasmPluginArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.WasmPluginVersionArgs.builder
      builder.versions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.MulticastGroupRangeArgs.Builder)
    /**
     * @param logConfig The logging configuration.
     *  Structure is documented below.
     * @return builder
     */
    def logConfig(args: Endofunction[com.pulumi.gcp.networkservices.inputs.MulticastGroupRangeLogConfigArgs.Builder]):
        com.pulumi.gcp.networkservices.MulticastGroupRangeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.MulticastGroupRangeLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.LbTrafficExtensionArgs.Builder)
    /**
     * @param extensionChains A set of ordered extension chains that contain the match conditions and extensions to execute.
     *  Match conditions for each extension chain are evaluated in sequence for a given request.
     *  The first extension chain that has a condition that matches the request is executed.
     *  Any subsequent extension chains do not execute. Limited to 5 extension chains per resource.
     *  Further information can be found at https://cloud.google.com/service-extensions/docs/reference/rest/v1/ExtensionChain
     *  Structure is documented below.
     * @return builder
     */
    def extensionChains(args: Endofunction[com.pulumi.gcp.networkservices.inputs.LbTrafficExtensionExtensionChainArgs.Builder]*):
        com.pulumi.gcp.networkservices.LbTrafficExtensionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.LbTrafficExtensionExtensionChainArgs.builder
      builder.extensionChains(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.HttpRouteRuleArgs.Builder)
    /**
     * @param action The detailed rule defining how to route matched traffic.
     *  Structure is documented below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.HttpRouteRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param matches A list of matches define conditions used for matching the rule against incoming HTTP requests. Each match is independent, i.e. this rule will be matched if ANY one of the matches is satisfied.
     *  If no matches field is specified, this rule will unconditionally match traffic.
     *  If a default rule is desired to be configured, add a rule with no matches specified to the end of the rules list.
     *  Structure is documented below.
     * @return builder
     */
    def matches(args: Endofunction[com.pulumi.gcp.networkservices.inputs.HttpRouteRuleMatchArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.HttpRouteRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.HttpRouteRuleMatchArgs.builder
      builder.matches(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.MulticastDomainActivationState.Builder)
    /**
     * @param states (Output)
     *  The state of the multicast resource.
     *  Possible values:
     *  CREATING
     *  ACTIVE
     *  DELETING
     *  DELETE_FAILED
     *  UPDATING
     *  UPDATE_FAILED
     *  INACTIVE
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.networkservices.inputs.MulticastDomainActivationStateArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.MulticastDomainActivationState.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.MulticastDomainActivationStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

    /**
     * @param trafficSpec Specifies the traffic volume and multicast group scale parameters that are
     *  used to set up multicast infrastructure for a multicast domain in a zone.
     *  Structure is documented below.
     * @return builder
     */
    def trafficSpec(args: Endofunction[com.pulumi.gcp.networkservices.inputs.MulticastDomainActivationTrafficSpecArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.MulticastDomainActivationState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.MulticastDomainActivationTrafficSpecArgs.builder
      builder.trafficSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.GrpcRouteState.Builder)
    /**
     * @param rules Rules that define how traffic is routed and handled.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.GrpcRouteState.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.LbTrafficExtensionState.Builder)
    /**
     * @param extensionChains A set of ordered extension chains that contain the match conditions and extensions to execute.
     *  Match conditions for each extension chain are evaluated in sequence for a given request.
     *  The first extension chain that has a condition that matches the request is executed.
     *  Any subsequent extension chains do not execute. Limited to 5 extension chains per resource.
     *  Further information can be found at https://cloud.google.com/service-extensions/docs/reference/rest/v1/ExtensionChain
     *  Structure is documented below.
     * @return builder
     */
    def extensionChains(args: Endofunction[com.pulumi.gcp.networkservices.inputs.LbTrafficExtensionExtensionChainArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.LbTrafficExtensionState.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.LbTrafficExtensionExtensionChainArgs.builder
      builder.extensionChains(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs.Builder)
    /**
     * @param addSignatures Enable signature generation or propagation on this route.
     *  This field may only be specified when signedRequestMode is set to REQUIRE_TOKENS.
     *  Structure is documented below.
     * @return builder
     */
    def addSignatures(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyAddSignaturesArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyAddSignaturesArgs.builder
      builder.addSignatures(args(argsBuilder).build)

    /**
     * @param cacheKeyPolicy Defines the request parameters that contribute to the cache key.
     *  Structure is documented below.
     * @return builder
     */
    def cacheKeyPolicy(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs.builder
      builder.cacheKeyPolicy(args(argsBuilder).build)

    /**
     * @param signedTokenOptions Additional options for signed tokens.
     *  signedTokenOptions may only be specified when signedRequestMode is REQUIRE_TOKENS.
     *  Structure is documented below.
     * @return builder
     */
    def signedTokenOptions(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicySignedTokenOptionsArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicySignedTokenOptionsArgs.builder
      builder.signedTokenOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginOriginOverrideActionArgs.Builder)
    /**
     * @param headerAction The header actions, including adding and removing
     *  headers, for request handled by this origin.
     *  Structure is documented below.
     * @return builder
     */
    def headerAction(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginOriginOverrideActionHeaderActionArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginOriginOverrideActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginOriginOverrideActionHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

    /**
     * @param urlRewrite The URL rewrite configuration for request that are
     *  handled by this origin.
     *  Structure is documented below.
     * @return builder
     */
    def urlRewrite(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginOriginOverrideActionUrlRewriteArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginOriginOverrideActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginOriginOverrideActionUrlRewriteArgs.builder
      builder.urlRewrite(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.TlsRouteRuleActionArgs.Builder)
    /**
     * @param destinations The destination to which traffic should be forwarded.
     *  Structure is documented below.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.gcp.networkservices.inputs.TlsRouteRuleActionDestinationArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.TlsRouteRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.TlsRouteRuleActionDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionArgs.Builder)
    /**
     * @param cdnPolicy The policy to use for defining caching and signed request behaviour for requests that match this route.
     *  Structure is documented below.
     * @return builder
     */
    def cdnPolicy(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs.builder
      builder.cdnPolicy(args(argsBuilder).build)

    /**
     * @param corsPolicy CORSPolicy defines Cross-Origin-Resource-Sharing configuration, including which CORS response headers will be set.
     *  Structure is documented below.
     * @return builder
     */
    def corsPolicy(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyArgs.builder
      builder.corsPolicy(args(argsBuilder).build)

    /**
     * @param urlRewrite The URL rewrite configuration for requests that match this route.
     *  Structure is documented below.
     * @return builder
     */
    def urlRewrite(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteArgs.builder
      builder.urlRewrite(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.LbTrafficExtensionExtensionChainArgs.Builder)
    /**
     * @param extensions A set of extensions to execute for the matching request.
     *  At least one extension is required. Up to 3 extensions can be defined for each extension chain for
     *  LbTrafficExtension resource. LbRouteExtension chains are limited to 1 extension per extension chain.
     *  Further documentation to be found at https://cloud.google.com/service-extensions/docs/reference/rest/v1/ExtensionChain#Extension
     *  Structure is documented below.
     * @return builder
     */
    def extensions(args: Endofunction[com.pulumi.gcp.networkservices.inputs.LbTrafficExtensionExtensionChainExtensionArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.LbTrafficExtensionExtensionChainArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.LbTrafficExtensionExtensionChainExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param matchCondition Conditions under which this chain is invoked for a request.
     *  Structure is documented below.
     * @return builder
     */
    def matchCondition(args: Endofunction[com.pulumi.gcp.networkservices.inputs.LbTrafficExtensionExtensionChainMatchConditionArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.LbTrafficExtensionExtensionChainArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.LbTrafficExtensionExtensionChainMatchConditionArgs.builder
      builder.matchCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.EdgeCacheKeysetState.Builder)
    /**
     * @param publicKeys An ordered list of Ed25519 public keys to use for validating signed requests.
     *  You must specify `publicKeys` or `validationSharedKeys` (or both). The keys in `publicKeys` are checked first.
     *  You may specify no more than one Google-managed public key.
     *  If you specify `publicKeys`, you must specify at least one (1) key and may specify up to three (3) keys.
     *  Ed25519 public keys are not secret, and only allow Google to validate a request was signed by your corresponding private key.
     *  Ensure that the private key is kept secret, and that only authorized users can add public keys to a keyset.
     *  Structure is documented below.
     * @return builder
     */
    def publicKeys(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheKeysetPublicKeyArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheKeysetState.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheKeysetPublicKeyArgs.builder
      builder.publicKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param validationSharedKeys An ordered list of shared keys to use for validating signed requests.
     *  Shared keys are secret.  Ensure that only authorized users can add `validationSharedKeys` to a keyset.
     *  You can rotate keys by appending (pushing) a new key to the list of `validationSharedKeys` and removing any superseded keys.
     *  You must specify `publicKeys` or `validationSharedKeys` (or both). The keys in `publicKeys` are checked first.
     *  Structure is documented below.
     * @return builder
     */
    def validationSharedKeys(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheKeysetValidationSharedKeyArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheKeysetState.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheKeysetValidationSharedKeyArgs.builder
      builder.validationSharedKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionFaultInjectionPolicyArgs.Builder)
    /**
     * @param abort Specification of how client requests are aborted as part of fault injection before being sent to a destination.
     *  Structure is documented below.
     * @return builder
     */
    def abort(args: Endofunction[com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionFaultInjectionPolicyAbortArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionFaultInjectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionFaultInjectionPolicyAbortArgs.builder
      builder.abort(args(argsBuilder).build)

    /**
     * @param delay Specification of how client requests are delayed as part of fault injection before being sent to a destination.
     *  Structure is documented below.
     * @return builder
     */
    def delay(args: Endofunction[com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionFaultInjectionPolicyDelayArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionFaultInjectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionFaultInjectionPolicyDelayArgs.builder
      builder.delay(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionArgs.Builder)
    /**
     * @param corsPolicy The specification for allowing client side cross-origin requests.
     *  Structure is documented below.
     * @return builder
     */
    def corsPolicy(args: Endofunction[com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionCorsPolicyArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionCorsPolicyArgs.builder
      builder.corsPolicy(args(argsBuilder).build)

    /**
     * @param destinations The destination to which traffic should be forwarded.
     *  Structure is documented below.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionDestinationArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param faultInjectionPolicy The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     *  Structure is documented below.
     * @return builder
     */
    def faultInjectionPolicy(args: Endofunction[com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionFaultInjectionPolicyArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionFaultInjectionPolicyArgs.builder
      builder.faultInjectionPolicy(args(argsBuilder).build)

    /**
     * @param redirect If set, the request is directed as configured by this field.
     *  Structure is documented below.
     * @return builder
     */
    def redirect(args: Endofunction[com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionRedirectArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionRedirectArgs.builder
      builder.redirect(args(argsBuilder).build)

    /**
     * @param requestHeaderModifier The specification for modifying the headers of a matching request prior to delivery of the request to the destination.
     *  Structure is documented below.
     * @return builder
     */
    def requestHeaderModifier(args: Endofunction[com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionRequestHeaderModifierArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionRequestHeaderModifierArgs.builder
      builder.requestHeaderModifier(args(argsBuilder).build)

    /**
     * @param requestMirrorPolicy Specifies the policy on how requests intended for the routes destination are shadowed to a separate mirrored destination.
     *  Structure is documented below.
     * @return builder
     */
    def requestMirrorPolicy(args: Endofunction[com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionRequestMirrorPolicyArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionRequestMirrorPolicyArgs.builder
      builder.requestMirrorPolicy(args(argsBuilder).build)

    /**
     * @param responseHeaderModifier The specification for modifying the headers of a response prior to sending the response back to the client.
     *  Structure is documented below.
     * @return builder
     */
    def responseHeaderModifier(args: Endofunction[com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionResponseHeaderModifierArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionResponseHeaderModifierArgs.builder
      builder.responseHeaderModifier(args(argsBuilder).build)

    /**
     * @param retryPolicy Specifies the retry policy associated with this route.
     *  Structure is documented below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionRetryPolicyArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param urlRewrite The specification for rewrite URL before forwarding requests to the destination.
     *  Structure is documented below.
     * @return builder
     */
    def urlRewrite(args: Endofunction[com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionUrlRewriteArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionUrlRewriteArgs.builder
      builder.urlRewrite(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs.Builder)
    /**
     * @param headerMatches Specifies a list of header match criteria, all of which must match corresponding headers in the request.
     *  Structure is documented below.
     * @return builder
     */
    def headerMatches(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs.builder
      builder.headerMatches(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParameterMatches Specifies a list of query parameter match criteria, all of which must match corresponding query parameters in the request.
     *  Structure is documented below.
     * @return builder
     */
    def queryParameterMatches(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs.builder
      builder.queryParameterMatches(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.LbRouteExtensionState.Builder)
    /**
     * @param extensionChains A set of ordered extension chains that contain the match conditions and extensions to execute.
     *  Match conditions for each extension chain are evaluated in sequence for a given request.
     *  The first extension chain that has a condition that matches the request is executed.
     *  Any subsequent extension chains do not execute. Limited to 5 extension chains per resource.
     *  Further information can be found at https://cloud.google.com/service-extensions/docs/reference/rest/v1/ExtensionChain
     *  Structure is documented below.
     * @return builder
     */
    def extensionChains(args: Endofunction[com.pulumi.gcp.networkservices.inputs.LbRouteExtensionExtensionChainArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.LbRouteExtensionState.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.LbRouteExtensionExtensionChainArgs.builder
      builder.extensionChains(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.EndpointPolicyState.Builder)
    /**
     * @param endpointMatcher Required. A matcher that selects endpoints to which the policies should be applied.
     *  Structure is documented below.
     * @return builder
     */
    def endpointMatcher(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EndpointPolicyEndpointMatcherArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EndpointPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EndpointPolicyEndpointMatcherArgs.builder
      builder.endpointMatcher(args(argsBuilder).build)

    /**
     * @param trafficPortSelector Port selector for the (matched) endpoints. If no port selector is provided, the matched config is applied to all ports.
     *  Structure is documented below.
     * @return builder
     */
    def trafficPortSelector(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EndpointPolicyTrafficPortSelectorArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EndpointPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EndpointPolicyTrafficPortSelectorArgs.builder
      builder.trafficPortSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginOriginOverrideActionHeaderActionArgs.Builder)
    /**
     * @param requestHeadersToAdds Describes a header to add.
     *  You may add a maximum of 25 request headers.
     *  Structure is documented below.
     * @return builder
     */
    def requestHeadersToAdds(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginOriginOverrideActionHeaderActionRequestHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginOriginOverrideActionHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginOriginOverrideActionHeaderActionRequestHeadersToAddArgs.builder
      builder.requestHeadersToAdds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.WasmPluginState.Builder)
    /**
     * @param logConfig Optional. Specifies the logging options for the activity performed by this plugin. If logging is enabled, plugin logs are exported to Cloud Logging.
     *  Note that the settings relate to the logs generated by using logging statements in your Wasm code.
     *  Structure is documented below.
     * @return builder
     */
    def logConfig(args: Endofunction[com.pulumi.gcp.networkservices.inputs.WasmPluginLogConfigArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.WasmPluginState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.WasmPluginLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param usedBies Output only. List of all extensions that use this WasmPlugin resource.
     *  Structure is documented below.
     * @return builder
     */
    def usedBies(args: Endofunction[com.pulumi.gcp.networkservices.inputs.WasmPluginUsedByArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.WasmPluginState.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.WasmPluginUsedByArgs.builder
      builder.usedBies(args.map(_(argsBuilder).build)*)

    /**
     * @param versions All versions of this WasmPlugin resource in the key-value format. The key is the resource ID, and the value is the VersionDetails object.
     *  Structure is documented below.
     * @return builder
     */
    def versions(args: Endofunction[com.pulumi.gcp.networkservices.inputs.WasmPluginVersionArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.WasmPluginState.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.WasmPluginVersionArgs.builder
      builder.versions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleArgs.Builder)
    /**
     * @param action Required. A detailed rule defining how to route traffic.
     *  Structure is documented below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param matches Matches define conditions used for matching the rule against incoming gRPC requests.
     *  Structure is documented below.
     * @return builder
     */
    def matches(args: Endofunction[com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleMatchArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleMatchArgs.builder
      builder.matches(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.HttpRouteState.Builder)
    /**
     * @param rules Rules that define how traffic is routed and handled.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.networkservices.inputs.HttpRouteRuleArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.HttpRouteState.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.HttpRouteRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.MulticastDomainGroupState.Builder)
    /**
     * @param states (Output)
     *  The state of the multicast resource.
     *  Possible values:
     *  CREATING
     *  ACTIVE
     *  DELETING
     *  DELETE_FAILED
     *  UPDATING
     *  UPDATE_FAILED
     *  INACTIVE
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.networkservices.inputs.MulticastDomainGroupStateArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.MulticastDomainGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.MulticastDomainGroupStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.MulticastGroupProducerActivationState.Builder)
    /**
     * @param states (Output)
     *  The state of the multicast resource.
     *  Possible values:
     *  CREATING
     *  ACTIVE
     *  DELETING
     *  DELETE_FAILED
     *  UPDATING
     *  UPDATE_FAILED
     *  INACTIVE
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.networkservices.inputs.MulticastGroupProducerActivationStateArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.MulticastGroupProducerActivationState.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.MulticastGroupProducerActivationStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.EndpointPolicyEndpointMatcherArgs.Builder)
    /**
     * @param metadataLabelMatcher The matcher is based on node metadata presented by xDS clients.
     *  Structure is documented below.
     * @return builder
     */
    def metadataLabelMatcher(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EndpointPolicyEndpointMatcherMetadataLabelMatcherArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EndpointPolicyEndpointMatcherArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EndpointPolicyEndpointMatcherMetadataLabelMatcherArgs.builder
      builder.metadataLabelMatcher(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.LbRouteExtensionExtensionChainArgs.Builder)
    /**
     * @param extensions A set of extensions to execute for the matching request.
     *  At least one extension is required. Up to 3 extensions can be defined for each extension chain for
     *  LbTrafficExtension resource. LbRouteExtension chains are limited to 1 extension per extension chain.
     *  Further documentation can be found at https://cloud.google.com/service-extensions/docs/reference/rest/v1/ExtensionChain#Extension
     *  Structure is documented below.
     * @return builder
     */
    def extensions(args: Endofunction[com.pulumi.gcp.networkservices.inputs.LbRouteExtensionExtensionChainExtensionArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.LbRouteExtensionExtensionChainArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.LbRouteExtensionExtensionChainExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param matchCondition Conditions under which this chain is invoked for a request.
     *  Structure is documented below.
     * @return builder
     */
    def matchCondition(args: Endofunction[com.pulumi.gcp.networkservices.inputs.LbRouteExtensionExtensionChainMatchConditionArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.LbRouteExtensionExtensionChainArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.LbRouteExtensionExtensionChainMatchConditionArgs.builder
      builder.matchCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.TlsRouteRuleArgs.Builder)
    /**
     * @param action Required. A detailed rule defining how to route traffic.
     *  Structure is documented below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.gcp.networkservices.inputs.TlsRouteRuleActionArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.TlsRouteRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.TlsRouteRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param matches Matches define the predicate used to match requests to a given action.
     *  Structure is documented below.
     * @return builder
     */
    def matches(args: Endofunction[com.pulumi.gcp.networkservices.inputs.TlsRouteRuleMatchArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.TlsRouteRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.TlsRouteRuleMatchArgs.builder
      builder.matches(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleArgs.Builder)
    /**
     * @param headerAction The header actions, including adding &amp; removing headers, for requests that match this route.
     *  Structure is documented below.
     * @return builder
     */
    def headerAction(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

    /**
     * @param matchRules The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates
     *  within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
     *  Structure is documented below.
     * @return builder
     */
    def matchRules(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs.builder
      builder.matchRules(args.map(_(argsBuilder).build)*)

    /**
     * @param routeAction In response to a matching path, the routeAction performs advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request to the selected origin.
     *  Structure is documented below.
     * @return builder
     */
    def routeAction(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionArgs.builder
      builder.routeAction(args(argsBuilder).build)

    /**
     * @param routeMethods Allow overriding the set of methods that are allowed for this route.
     *  When not set, Media CDN allows only &#34;GET&#34;, &#34;HEAD&#34;, and &#34;OPTIONS&#34;.
     *  Structure is documented below.
     * @return builder
     */
    def routeMethods(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteMethodsArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteMethodsArgs.builder
      builder.routeMethods(args(argsBuilder).build)

    /**
     * @param urlRedirect The URL redirect configuration for requests that match this route.
     *  Structure is documented below.
     * @return builder
     */
    def urlRedirect(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectArgs.builder
      builder.urlRedirect(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.TcpRouteState.Builder)
    /**
     * @param rules Rules that define how traffic is routed and handled. At least one RouteRule must be supplied.
     *  If there are multiple rules then the action taken will be the first rule to match.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.networkservices.inputs.TcpRouteRuleArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.TcpRouteState.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.TcpRouteRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.MulticastConsumerAssociationState.Builder)
    /**
     * @param states (Output)
     *  The state of the multicast resource.
     *  Possible values:
     *  CREATING
     *  ACTIVE
     *  DELETING
     *  DELETE_FAILED
     *  UPDATING
     *  UPDATE_FAILED
     *  INACTIVE
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.networkservices.inputs.MulticastConsumerAssociationStateArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.MulticastConsumerAssociationState.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.MulticastConsumerAssociationStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionArgs.Builder)
    /**
     * @param destinations The destination to which traffic should be forwarded.
     *  Structure is documented below.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionDestinationArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param faultInjectionPolicy The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     *  Structure is documented below.
     * @return builder
     */
    def faultInjectionPolicy(args: Endofunction[com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionFaultInjectionPolicyArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionFaultInjectionPolicyArgs.builder
      builder.faultInjectionPolicy(args(argsBuilder).build)

    /**
     * @param retryPolicy Specifies the retry policy associated with this route.
     *  Structure is documented below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionRetryPolicyArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.LbEdgeExtensionState.Builder)
    /**
     * @param extensionChains A set of ordered extension chains that contain the match conditions and extensions to execute.
     *  Match conditions for each extension chain are evaluated in sequence for a given request.
     *  The first extension chain that has a condition that matches the request is executed.
     *  Any subsequent extension chains do not execute. Limited to 5 extension chains per resource.
     *  Structure is documented below.
     * @return builder
     */
    def extensionChains(args: Endofunction[com.pulumi.gcp.networkservices.inputs.LbEdgeExtensionExtensionChainArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.LbEdgeExtensionState.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.LbEdgeExtensionExtensionChainArgs.builder
      builder.extensionChains(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingArgs.Builder)
    /**
     * @param hostRules The list of hostRules to match against. These rules define which hostnames the EdgeCacheService will match against, and which route configurations apply.
     *  Structure is documented below.
     * @return builder
     */
    def hostRules(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingHostRuleArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingHostRuleArgs.builder
      builder.hostRules(args.map(_(argsBuilder).build)*)

    /**
     * @param pathMatchers The list of pathMatchers referenced via name by hostRules. PathMatcher is used to match the path portion of the URL when a HostRule matches the URL&#39;s host portion.
     *  Structure is documented below.
     * @return builder
     */
    def pathMatchers(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherArgs.builder
      builder.pathMatchers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionRequestMirrorPolicyArgs.Builder)
    /**
     * @param destination The destination the requests will be mirrored to.
     *  Structure is documented below.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionRequestMirrorPolicyDestinationArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionRequestMirrorPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionRequestMirrorPolicyDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.MulticastGroupRangeActivationState.Builder)
    /**
     * @param logConfig The logging configuration.
     *  Structure is documented below.
     * @return builder
     */
    def logConfig(args: Endofunction[com.pulumi.gcp.networkservices.inputs.MulticastGroupRangeActivationLogConfigArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.MulticastGroupRangeActivationState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.MulticastGroupRangeActivationLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param states (Output)
     *  The state of the multicast resource.
     *  Possible values:
     *  CREATING
     *  ACTIVE
     *  DELETING
     *  DELETE_FAILED
     *  UPDATING
     *  UPDATE_FAILED
     *  INACTIVE
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.networkservices.inputs.MulticastGroupRangeActivationStateArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.MulticastGroupRangeActivationState.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.MulticastGroupRangeActivationStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.HttpRouteRuleMatchHeaderArgs.Builder)
    /**
     * @param rangeMatch If specified, the rule will match if the request header value is within the range.
     *  Structure is documented below.
     * @return builder
     */
    def rangeMatch(args: Endofunction[com.pulumi.gcp.networkservices.inputs.HttpRouteRuleMatchHeaderRangeMatchArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.HttpRouteRuleMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.HttpRouteRuleMatchHeaderRangeMatchArgs.builder
      builder.rangeMatch(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleMatchArgs.Builder)
    /**
     * @param headers Specifies a list of HTTP request headers to match against.
     *  Structure is documented below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleMatchHeaderArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param method A gRPC method to match against. If this field is empty or omitted, will match all methods.
     *  Structure is documented below.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleMatchMethodArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleMatchArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceState.Builder)
    /**
     * @param logConfig Specifies the logging options for the traffic served by this service. If logging is enabled, logs will be exported to Cloud Logging.
     *  Structure is documented below.
     * @return builder
     */
    def logConfig(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceLogConfigArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param routing Defines how requests are routed, modified, cached and/or which origin content is filled from.
     *  Structure is documented below.
     * @return builder
     */
    def routing(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingArgs.builder
      builder.routing(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.ServiceLbPoliciesState.Builder)
    /**
     * @param autoCapacityDrain Option to specify if an unhealthy MIG/NEG should be considered for global load balancing and traffic routing.
     *  Structure is documented below.
     * @return builder
     */
    def autoCapacityDrain(args: Endofunction[com.pulumi.gcp.networkservices.inputs.ServiceLbPoliciesAutoCapacityDrainArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.ServiceLbPoliciesState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.ServiceLbPoliciesAutoCapacityDrainArgs.builder
      builder.autoCapacityDrain(args(argsBuilder).build)

    /**
     * @param failoverConfig Option to specify health based failover behavior. This is not related to Network load balancer FailoverPolicy.
     *  Structure is documented below.
     * @return builder
     */
    def failoverConfig(args: Endofunction[com.pulumi.gcp.networkservices.inputs.ServiceLbPoliciesFailoverConfigArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.ServiceLbPoliciesState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.ServiceLbPoliciesFailoverConfigArgs.builder
      builder.failoverConfig(args(argsBuilder).build)

    /**
     * @param isolationConfig Configuration to provide isolation support for the associated Backend Service.
     *  Structure is documented below.
     * @return builder
     */
    def isolationConfig(args: Endofunction[com.pulumi.gcp.networkservices.inputs.ServiceLbPoliciesIsolationConfigArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.ServiceLbPoliciesState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.ServiceLbPoliciesIsolationConfigArgs.builder
      builder.isolationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.TcpRouteRuleActionArgs.Builder)
    /**
     * @param destinations The destination services to which traffic should be forwarded. At least one destination service is required.
     *  Structure is documented below.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.gcp.networkservices.inputs.TcpRouteRuleActionDestinationArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.TcpRouteRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.TcpRouteRuleActionDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherArgs.Builder)
    /**
     * @param routeRules The routeRules to match against. routeRules support advanced routing behaviour, and can match on paths, headers and query parameters, as well as status codes and HTTP methods.
     *  Structure is documented below.
     * @return builder
     */
    def routeRules(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleArgs.builder
      builder.routeRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginState.Builder)
    /**
     * @param awsV4Authentication Enable AWS Signature Version 4 origin authentication.
     *  Structure is documented below.
     * @return builder
     */
    def awsV4Authentication(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginAwsV4AuthenticationArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginAwsV4AuthenticationArgs.builder
      builder.awsV4Authentication(args(argsBuilder).build)

    /**
     * @param flexShielding The FlexShieldingOptions to be used for all routes to this origin.
     *  If not set, defaults to a global caching layer in front of the origin.
     *  Structure is documented below.
     * @return builder
     */
    def flexShielding(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginFlexShieldingArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginFlexShieldingArgs.builder
      builder.flexShielding(args(argsBuilder).build)

    /**
     * @param originOverrideAction The override actions, including url rewrites and header
     *  additions, for requests that use this origin.
     *  Structure is documented below.
     * @return builder
     */
    def originOverrideAction(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginOriginOverrideActionArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginOriginOverrideActionArgs.builder
      builder.originOverrideAction(args(argsBuilder).build)

    /**
     * @param originRedirect Follow redirects from this origin.
     *  Structure is documented below.
     * @return builder
     */
    def originRedirect(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginOriginRedirectArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginOriginRedirectArgs.builder
      builder.originRedirect(args(argsBuilder).build)

    /**
     * @param timeout The connection and HTTP timeout configuration for this origin.
     *  Structure is documented below.
     * @return builder
     */
    def timeout(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginTimeoutArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginTimeoutArgs.builder
      builder.timeout(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.AgentGatewayState.Builder)
    /**
     * @param agentGatewayCards AgentGatewayOutputCard contains informational output-only fields.
     *  Structure is documented below.
     * @return builder
     */
    def agentGatewayCards(args: Endofunction[com.pulumi.gcp.networkservices.inputs.AgentGatewayAgentGatewayCardArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.AgentGatewayState.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.AgentGatewayAgentGatewayCardArgs.builder
      builder.agentGatewayCards(args.map(_(argsBuilder).build)*)

    /**
     * @param googleManaged Configuration for Google Managed deployment mode.
     *  Proxy is orchestrated and managed by GoogleCloud in a tenant project.
     *  Structure is documented below.
     * @return builder
     */
    def googleManaged(args: Endofunction[com.pulumi.gcp.networkservices.inputs.AgentGatewayGoogleManagedArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.AgentGatewayState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.AgentGatewayGoogleManagedArgs.builder
      builder.googleManaged(args(argsBuilder).build)

    /**
     * @param networkConfig Network configuration for the AgentGateway.
     *  Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.networkservices.inputs.AgentGatewayNetworkConfigArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.AgentGatewayState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.AgentGatewayNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param selfManaged Configuration for Self Managed deployment mode.
     *  Attach to existing Application Load Balancers or Secure Web Proxies.
     *  Structure is documented below.
     * @return builder
     */
    def selfManaged(args: Endofunction[com.pulumi.gcp.networkservices.inputs.AgentGatewaySelfManagedArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.AgentGatewayState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.AgentGatewaySelfManagedArgs.builder
      builder.selfManaged(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.MulticastProducerAssociationState.Builder)
    /**
     * @param states (Output)
     *  The state of the multicast resource.
     *  Possible values:
     *  CREATING
     *  ACTIVE
     *  DELETING
     *  DELETE_FAILED
     *  UPDATING
     *  UPDATE_FAILED
     *  INACTIVE
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.networkservices.inputs.MulticastProducerAssociationStateArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.MulticastProducerAssociationState.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.MulticastProducerAssociationStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionArgs.Builder)
    /**
     * @param requestHeaderToAdds Describes a header to add.
     *  Structure is documented below.
     * @return builder
     */
    def requestHeaderToAdds(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs.builder
      builder.requestHeaderToAdds(args.map(_(argsBuilder).build)*)

    /**
     * @param requestHeaderToRemoves A list of header names for headers that need to be removed from the request prior to forwarding the request to the origin.
     *  Structure is documented below.
     * @return builder
     */
    def requestHeaderToRemoves(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemoveArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemoveArgs.builder
      builder.requestHeaderToRemoves(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeaderToAdds Headers to add to the response prior to sending it back to the client.
     *  Response headers are only sent to the client, and do not have an effect on the cache serving the response.
     *  Structure is documented below.
     * @return builder
     */
    def responseHeaderToAdds(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAddArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAddArgs.builder
      builder.responseHeaderToAdds(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeaderToRemoves A list of header names for headers that need to be removed from the request prior to forwarding the request to the origin.
     *  Structure is documented below.
     * @return builder
     */
    def responseHeaderToRemoves(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemoveArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemoveArgs.builder
      builder.responseHeaderToRemoves(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.TlsRouteState.Builder)
    /**
     * @param rules Rules that define how traffic is routed and handled.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.networkservices.inputs.TlsRouteRuleArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.TlsRouteState.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.TlsRouteRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.TcpRouteRuleArgs.Builder)
    /**
     * @param action A detailed rule defining how to route traffic.
     *  Structure is documented below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.gcp.networkservices.inputs.TcpRouteRuleActionArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.TcpRouteRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.TcpRouteRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param matches RouteMatch defines the predicate used to match requests to a given action. Multiple match types are &#34;OR&#34;ed for evaluation.
     *  If no routeMatch field is specified, this rule will unconditionally match traffic.
     *  Structure is documented below.
     * @return builder
     */
    def matches(args: Endofunction[com.pulumi.gcp.networkservices.inputs.TcpRouteRuleMatchArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.TcpRouteRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.TcpRouteRuleMatchArgs.builder
      builder.matches(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.EndpointPolicyEndpointMatcherMetadataLabelMatcherArgs.Builder)
    /**
     * @param metadataLabels The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria
     *  Structure is documented below.
     * @return builder
     */
    def metadataLabels(args: Endofunction[com.pulumi.gcp.networkservices.inputs.EndpointPolicyEndpointMatcherMetadataLabelMatcherMetadataLabelArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.EndpointPolicyEndpointMatcherMetadataLabelMatcherArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.EndpointPolicyEndpointMatcherMetadataLabelMatcherMetadataLabelArgs.builder
      builder.metadataLabels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.HttpRouteRuleMatchArgs.Builder)
    /**
     * @param headers Specifies a list of HTTP request headers to match against.
     *  Structure is documented below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.gcp.networkservices.inputs.HttpRouteRuleMatchHeaderArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.HttpRouteRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.HttpRouteRuleMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryParameters Specifies a list of query parameters to match against.
     *  Structure is documented below.
     * @return builder
     */
    def queryParameters(args: Endofunction[com.pulumi.gcp.networkservices.inputs.HttpRouteRuleMatchQueryParameterArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.HttpRouteRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.HttpRouteRuleMatchQueryParameterArgs.builder
      builder.queryParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.MulticastDomainState.Builder)
    /**
     * @param connectionConfig VPC connectivity information.
     *  Structure is documented below.
     * @return builder
     */
    def connectionConfig(args: Endofunction[com.pulumi.gcp.networkservices.inputs.MulticastDomainConnectionConfigArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.MulticastDomainState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.MulticastDomainConnectionConfigArgs.builder
      builder.connectionConfig(args(argsBuilder).build)

    /**
     * @param states (Output)
     *  The state of the multicast resource.
     *  Possible values:
     *  CREATING
     *  ACTIVE
     *  DELETING
     *  DELETE_FAILED
     *  UPDATING
     *  UPDATE_FAILED
     *  INACTIVE
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.networkservices.inputs.MulticastDomainStateArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.MulticastDomainState.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.MulticastDomainStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

    /**
     * @param ullMulticastDomain Information for an Ultra-Low-Latency multicast domain.
     *  Structure is documented below.
     * @return builder
     */
    def ullMulticastDomain(args: Endofunction[com.pulumi.gcp.networkservices.inputs.MulticastDomainUllMulticastDomainArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.MulticastDomainState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.MulticastDomainUllMulticastDomainArgs.builder
      builder.ullMulticastDomain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.LbEdgeExtensionExtensionChainArgs.Builder)
    /**
     * @param extensions A set of extensions to execute for the matching request.
     *  At least one extension is required. Up to 3 extensions can be defined for each extension chain for
     *  LbTrafficExtension resource. LbRouteExtension chains are limited to 1 extension per extension chain.
     *  Structure is documented below.
     * @return builder
     */
    def extensions(args: Endofunction[com.pulumi.gcp.networkservices.inputs.LbEdgeExtensionExtensionChainExtensionArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.LbEdgeExtensionExtensionChainArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.LbEdgeExtensionExtensionChainExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param matchCondition Conditions under which this chain is invoked for a request.
     *  Structure is documented below.
     * @return builder
     */
    def matchCondition(args: Endofunction[com.pulumi.gcp.networkservices.inputs.LbEdgeExtensionExtensionChainMatchConditionArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.LbEdgeExtensionExtensionChainArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.LbEdgeExtensionExtensionChainMatchConditionArgs.builder
      builder.matchCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionFaultInjectionPolicyArgs.Builder)
    /**
     * @param abort Specification of how client requests are aborted as part of fault injection before being sent to a destination.
     *  Structure is documented below.
     * @return builder
     */
    def abort(args: Endofunction[com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionFaultInjectionPolicyAbortArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionFaultInjectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionFaultInjectionPolicyAbortArgs.builder
      builder.abort(args(argsBuilder).build)

    /**
     * @param delay Specification of how client requests are delayed as part of fault injection before being sent to a destination.
     *  Structure is documented below.
     * @return builder
     */
    def delay(args: Endofunction[com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionFaultInjectionPolicyDelayArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionFaultInjectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionFaultInjectionPolicyDelayArgs.builder
      builder.delay(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.MulticastGroupConsumerActivationState.Builder)
    /**
     * @param logConfig The logging configuration.
     *  Structure is documented below.
     * @return builder
     */
    def logConfig(args: Endofunction[com.pulumi.gcp.networkservices.inputs.MulticastGroupConsumerActivationLogConfigArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.MulticastGroupConsumerActivationState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.MulticastGroupConsumerActivationLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param states (Output)
     *  The state of the multicast resource.
     *  Possible values:
     *  CREATING
     *  ACTIVE
     *  DELETING
     *  DELETE_FAILED
     *  UPDATING
     *  UPDATE_FAILED
     *  INACTIVE
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.networkservices.inputs.MulticastGroupConsumerActivationStateArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.MulticastGroupConsumerActivationState.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.MulticastGroupConsumerActivationStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.inputs.AgentGatewayNetworkConfigArgs.Builder)
    /**
     * @param egress Optional PSC-Interface network attachment for connectivity to your
     *  private VPCs network.
     *  Structure is documented below.
     * @return builder
     */
    def egress(args: Endofunction[com.pulumi.gcp.networkservices.inputs.AgentGatewayNetworkConfigEgressArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.AgentGatewayNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.AgentGatewayNetworkConfigEgressArgs.builder
      builder.egress(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkservices.inputs.MulticastGroupRangeState.Builder)
    /**
     * @param logConfig The logging configuration.
     *  Structure is documented below.
     * @return builder
     */
    def logConfig(args: Endofunction[com.pulumi.gcp.networkservices.inputs.MulticastGroupRangeLogConfigArgs.Builder]):
        com.pulumi.gcp.networkservices.inputs.MulticastGroupRangeState.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.MulticastGroupRangeLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param states (Output)
     *  The state of the multicast resource.
     *  Possible values:
     *  CREATING
     *  ACTIVE
     *  DELETING
     *  DELETE_FAILED
     *  UPDATING
     *  UPDATE_FAILED
     *  INACTIVE
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.networkservices.inputs.MulticastGroupRangeStateArgs.Builder]*):
        com.pulumi.gcp.networkservices.inputs.MulticastGroupRangeState.Builder =
      def argsBuilder = com.pulumi.gcp.networkservices.inputs.MulticastGroupRangeStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkservices.MulticastGroupConsumerActivationArgs.Builder)
    /**
     * @param logConfig The logging configuration.
     *  Structure is documented below.
     * @return builder
     */
    def logConfig(args: Endofunction[com.pulumi.gcp.networkservices.inputs.MulticastGroupConsumerActivationLogConfigArgs.Builder]):
        com.pulumi.gcp.networkservices.MulticastGroupConsumerActivationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkservices.inputs.MulticastGroupConsumerActivationLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)
