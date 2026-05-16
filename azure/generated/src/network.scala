package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object network:
  /** Manages a Route Filter. */
  def RouteFilter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.RouteFilterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.RouteFilterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.RouteFilter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.FirewallArgs.Builder)
    /**
     * @param ipConfigurations An `ipConfiguration` block as documented below.
     * @return builder
     */
    def ipConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.FirewallIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.FirewallArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param managementIpConfiguration A `managementIpConfiguration` block as documented below, which allows force-tunnelling of traffic to be performed by the firewall. Adding or removing this block or changing the `subnetId` in an existing block forces a new resource to be created. Changing this forces a new resource to be created.
     * @return builder
     */
    def managementIpConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.FirewallManagementIpConfigurationArgs.Builder]):
        com.pulumi.azure.network.FirewallArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallManagementIpConfigurationArgs.builder
      builder.managementIpConfiguration(args(argsBuilder).build)

    /**
     * @param virtualHub A `virtualHub` block as documented below.
     * @return builder
     */
    def virtualHub(args: Endofunction[com.pulumi.azure.network.inputs.FirewallVirtualHubArgs.Builder]):
        com.pulumi.azure.network.FirewallArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallVirtualHubArgs.builder
      builder.virtualHub(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.FirewallArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a connection in an existing Virtual Network Gateway. */
  def VirtualNetworkGatewayConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualNetworkGatewayConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualNetworkGatewayConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.VirtualNetworkGatewayConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.ExpressRouteConnectionArgs.Builder)
    /**
     * @param routing A `routing` block as defined below.
     * @return builder
     */
    def routing(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRouteConnectionRoutingArgs.Builder]):
        com.pulumi.azure.network.ExpressRouteConnectionArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRouteConnectionRoutingArgs.builder
      builder.routing(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.TrafficManagerExternalEndpointArgs.Builder)
    /**
     * @param customHeaders One or more `customHeader` blocks as defined below.
     * @return builder
     */
    def customHeaders(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointCustomHeaderArgs.Builder]*):
        com.pulumi.azure.network.TrafficManagerExternalEndpointArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointCustomHeaderArgs.builder
      builder.customHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param subnets One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def subnets(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointSubnetArgs.Builder]*):
        com.pulumi.azure.network.TrafficManagerExternalEndpointArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

  /** Associates a Network Security Group with a Subnet within a Virtual Network. */
  def SubnetNetworkSecurityGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.SubnetNetworkSecurityGroupAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.network.SubnetNetworkSecurityGroupAssociationArgs.builder
    com.pulumi.azure.network.SubnetNetworkSecurityGroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.NetworkManagerAdminRuleArgs.Builder)
    /**
     * @param destinations One or more `destination` blocks as defined below.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerAdminRuleDestinationArgs.Builder]*):
        com.pulumi.azure.network.NetworkManagerAdminRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerAdminRuleDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param sources One or more `source` blocks as defined below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerAdminRuleSourceArgs.Builder]*):
        com.pulumi.azure.network.NetworkManagerAdminRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerAdminRuleSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.VnpGatewayNatRuleArgs.Builder)
    /**
     * @param externalMappings One of more `externalMapping` blocks as defined below.
     * @return builder
     */
    def externalMappings(args: Endofunction[com.pulumi.azure.network.inputs.VnpGatewayNatRuleExternalMappingArgs.Builder]*):
        com.pulumi.azure.network.VnpGatewayNatRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VnpGatewayNatRuleExternalMappingArgs.builder
      builder.externalMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param internalMappings One of more `internalMapping` blocks as defined below.
     * @return builder
     */
    def internalMappings(args: Endofunction[com.pulumi.azure.network.inputs.VnpGatewayNatRuleInternalMappingArgs.Builder]*):
        com.pulumi.azure.network.VnpGatewayNatRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VnpGatewayNatRuleInternalMappingArgs.builder
      builder.internalMappings(args.map(_(argsBuilder).build)*)

  /**
   * Manages a Virtual Hub IP. This resource is also known as a Route Server.
   * 
   *  &gt; **Note:** Virtual Hub IP only supports Standard Virtual Hub without Virtual Wan.
   */
  def VirtualHubIp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualHubIpArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualHubIpArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.VirtualHubIp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Profile. */
  def Profile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.ProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.ProfileArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.Profile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Security Perimeter Profile. */
  def NetworkSecurityPerimeterProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkSecurityPerimeterProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkSecurityPerimeterProfileArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkSecurityPerimeterProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Rule Collection within an Azure Firewall. */
  def FirewallNetworkRuleCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.FirewallNetworkRuleCollectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.FirewallNetworkRuleCollectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.FirewallNetworkRuleCollection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Watcher. */
  def NetworkWatcher(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkWatcherArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkWatcherArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.NetworkWatcher(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.VpnSiteArgs.Builder)
    /**
     * @param links One or more `link` blocks as defined below.
     * @return builder
     */
    def links(args: Endofunction[com.pulumi.azure.network.inputs.VpnSiteLinkArgs.Builder]*):
        com.pulumi.azure.network.VpnSiteArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnSiteLinkArgs.builder
      builder.links(args.map(_(argsBuilder).build)*)

    /**
     * @param o365Policy An `o365Policy` block as defined below.
     * @return builder
     */
    def o365Policy(args: Endofunction[com.pulumi.azure.network.inputs.VpnSiteO365PolicyArgs.Builder]):
        com.pulumi.azure.network.VpnSiteArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnSiteO365PolicyArgs.builder
      builder.o365Policy(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.VpnSiteArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.NetworkManagerConnectivityConfigurationArgs.Builder)
    /**
     * @param appliesToGroups One or more `appliesToGroup` blocks as defined below.
     * @return builder
     */
    def appliesToGroups(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationAppliesToGroupArgs.Builder]*):
        com.pulumi.azure.network.NetworkManagerConnectivityConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationAppliesToGroupArgs.builder
      builder.appliesToGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param hub A `hub` block as defined below.
     * @return builder
     */
    def hub(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationHubArgs.Builder]):
        com.pulumi.azure.network.NetworkManagerConnectivityConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationHubArgs.builder
      builder.hub(args(argsBuilder).build)

  /** Manages a VPN Site. */
  def VpnSite(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.VpnSiteArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VpnSiteArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.VpnSite(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Manager Routing Configuration. */
  def NetworkManagerRoutingConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerRoutingConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerRoutingConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerRoutingConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Traffic Manager Profile to which multiple endpoints can be attached. */
  def TrafficManagerProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.TrafficManagerProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.TrafficManagerProfileArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.TrafficManagerProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.SubnetServiceEndpointStoragePolicyArgs.Builder)
    /**
     * @param definitions A `definition` block as defined below
     * @return builder
     */
    def definitions(args: Endofunction[com.pulumi.azure.network.inputs.SubnetServiceEndpointStoragePolicyDefinitionArgs.Builder]*):
        com.pulumi.azure.network.SubnetServiceEndpointStoragePolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.SubnetServiceEndpointStoragePolicyDefinitionArgs.builder
      builder.definitions(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.SubnetServiceEndpointStoragePolicyArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Application Security Group. */
  def ApplicationSecurityGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.ApplicationSecurityGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.ApplicationSecurityGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.ApplicationSecurityGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.VirtualHubRouteTableArgs.Builder)
    /**
     * @param routes One or more `route` blocks as defined below.
     * @return builder
     */
    def routes(args: Endofunction[com.pulumi.azure.network.inputs.VirtualHubRouteTableRouteArgs.Builder]*):
        com.pulumi.azure.network.VirtualHubRouteTableArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualHubRouteTableRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  /** Manages a Express Route Port. */
  def ExpressRoutePort(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.ExpressRoutePortArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.ExpressRoutePortArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.ExpressRoutePort(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.NetworkConnectionMonitorArgs.Builder)
    /**
     * @param endpoints A `endpoint` block as defined below.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointArgs.Builder]*):
        com.pulumi.azure.network.NetworkConnectionMonitorArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param testConfigurations A `testConfiguration` block as defined below.
     * @return builder
     */
    def testConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationArgs.Builder]*):
        com.pulumi.azure.network.NetworkConnectionMonitorArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationArgs.builder
      builder.testConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param testGroups A `testGroup` block as defined below.
     * @return builder
     */
    def testGroups(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestGroupArgs.Builder]*):
        com.pulumi.azure.network.NetworkConnectionMonitorArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestGroupArgs.builder
      builder.testGroups(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.NetworkConnectionMonitorArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.FirewallPolicyArgs.Builder)
    /**
     * @param dns A `dns` block as defined below.
     * @return builder
     */
    def dns(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyDnsArgs.Builder]):
        com.pulumi.azure.network.FirewallPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyDnsArgs.builder
      builder.dns(args(argsBuilder).build)

    /**
     * @param explicitProxy A `explicitProxy` block as defined below.
     * @return builder
     */
    def explicitProxy(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyExplicitProxyArgs.Builder]):
        com.pulumi.azure.network.FirewallPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyExplicitProxyArgs.builder
      builder.explicitProxy(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyIdentityArgs.Builder]):
        com.pulumi.azure.network.FirewallPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param insights An `insights` block as defined below.
     * @return builder
     */
    def insights(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyInsightsArgs.Builder]):
        com.pulumi.azure.network.FirewallPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyInsightsArgs.builder
      builder.insights(args(argsBuilder).build)

    /**
     * @param intrusionDetection A `intrusionDetection` block as defined below.
     * @return builder
     */
    def intrusionDetection(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionArgs.Builder]):
        com.pulumi.azure.network.FirewallPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionArgs.builder
      builder.intrusionDetection(args(argsBuilder).build)

    /**
     * @param threatIntelligenceAllowlist A `threatIntelligenceAllowlist` block as defined below.
     * @return builder
     */
    def threatIntelligenceAllowlist(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyThreatIntelligenceAllowlistArgs.Builder]):
        com.pulumi.azure.network.FirewallPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyThreatIntelligenceAllowlistArgs.builder
      builder.threatIntelligenceAllowlist(args(argsBuilder).build)

    /**
     * @param tlsCertificate A `tlsCertificate` block as defined below.
     * @return builder
     */
    def tlsCertificate(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyTlsCertificateArgs.Builder]):
        com.pulumi.azure.network.FirewallPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyTlsCertificateArgs.builder
      builder.tlsCertificate(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.FirewallPolicyArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Nested Endpoint within a Traffic Manager Profile. */
  def TrafficManagerNestedEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.TrafficManagerNestedEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.TrafficManagerNestedEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.TrafficManagerNestedEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.PointToPointVpnGatewayArgs.Builder)
    /**
     * @param connectionConfigurations A `connectionConfiguration` block as defined below.
     * @return builder
     */
    def connectionConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationArgs.Builder]*):
        com.pulumi.azure.network.PointToPointVpnGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationArgs.builder
      builder.connectionConfigurations(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.PointToPointVpnGatewayArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages an Application Gateway.
   * 
   *  &gt; **Note:** The `backendAddressPool`, `backendHttpSettings`, `httpListener`, `privateLinkConfiguration`, `requestRoutingRule`, `redirectConfiguration`, `probe`, `sslCertificate`,
   *  and `frontendPort` properties are Sets as the service API returns these lists of objects in a different order from how the provider sends them. As Sets are stored using a hash, if one
   *  value is added or removed from the Set, Terraform considers the entire list of objects changed and the plan shows that it is removing every value in the list and re-adding it with the
   *  new information. Though Terraform is showing all the values being removed and re-added, we are not actually removing anything unless the user specifies a removal in the configfile.
   */
  def ApplicationGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.ApplicationGatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.ApplicationGatewayArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.ApplicationGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.RouteFilterArgs.Builder)
    /**
     * @param rule A `rule` block as defined below.
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.azure.network.inputs.RouteFilterRuleArgs.Builder]):
        com.pulumi.azure.network.RouteFilterArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.RouteFilterRuleArgs.builder
      builder.rule(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.RouteFilterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.NetworkSecurityGroupArgs.Builder)
    /**
     * @param securityRules A list of objects representing security rules, as defined below.
     * 
     *  &gt; **NOTE** Since `securityRule` can be configured both inline and via the separate `azure.network.NetworkSecurityRule` resource, we have to explicitly set it to empty slice (`[]`) to remove it.
     * @return builder
     */
    def securityRules(args: Endofunction[com.pulumi.azure.network.inputs.NetworkSecurityGroupSecurityRuleArgs.Builder]*):
        com.pulumi.azure.network.NetworkSecurityGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkSecurityGroupSecurityRuleArgs.builder
      builder.securityRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.NetworkSecurityGroupArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Bgp Connection for a Route Server */
  def RouteServerBgpConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.RouteServerBgpConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.RouteServerBgpConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.RouteServerBgpConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an IP group that contains a list of CIDRs and/or IP addresses. */
  def IPGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.IPGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.IPGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.IPGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.VpnGatewayArgs.Builder)
    /**
     * @param bgpSettings A `bgpSettings` block as defined below.
     * @return builder
     */
    def bgpSettings(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsArgs.Builder]):
        com.pulumi.azure.network.VpnGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsArgs.builder
      builder.bgpSettings(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.VpnGatewayArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Network Manager Static Member. */
  def NetworkManagerStaticMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerStaticMemberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerStaticMemberArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerStaticMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Virtual Hub within a Virtual WAN. */
  def VirtualHub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualHubArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualHubArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.VirtualHub(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Security Partner Provider which could be associated to virtual hub. */
  def SecurityPartnerProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.SecurityPartnerProviderArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.SecurityPartnerProviderArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.SecurityPartnerProvider(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Subnet Service Endpoint Storage Policy. */
  def SubnetServiceEndpointStoragePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.SubnetServiceEndpointStoragePolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.SubnetServiceEndpointStoragePolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.SubnetServiceEndpointStoragePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Route Server */
  def RouteServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.RouteServerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.RouteServerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.RouteServer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Manager Management Group Connection which may cross tenants. */
  def NetworkManagerManagementGroupConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerManagementGroupConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerManagementGroupConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerManagementGroupConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Network Manager Routing Rule.
   * 
   *  !&gt; **Note:** Terraform has enabled force deletion. This setting deletes the resource even if it&#39;s part of a deployed configuration. If the configuration is deployed, the service will perform a cleanup deployment in the background before the deletion.
   */
  def NetworkManagerRoutingRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerRoutingRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerRoutingRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerRoutingRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Manager Security Admin Configuration. */
  def NetworkManagerSecurityAdminConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerSecurityAdminConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerSecurityAdminConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerSecurityAdminConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Network Watcher Flow Log.
   * 
   *  &gt; **Note:** The `azure.network.NetworkWatcherFlowLog` creates a new storage lifecyle management rule that overwrites existing rules. Please make sure to use a `storageAccount` with no existing management rules, until the issue is fixed.
   */
  def NetworkWatcherFlowLog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkWatcherFlowLogArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkWatcherFlowLogArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.NetworkWatcherFlowLog(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.RouteTableArgs.Builder)
    /**
     * @param routes A list of objects representing routes. Each object accepts the arguments documented below.
     * 
     *  &gt; **NOTE** Since `route` can be configured both inline and via the separate `azure.network.Route` resource, we have to explicitly set it to empty slice (`[]`) to remove it.
     * @return builder
     */
    def routes(args: Endofunction[com.pulumi.azure.network.inputs.RouteTableRouteArgs.Builder]*):
        com.pulumi.azure.network.RouteTableArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.RouteTableRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.RouteTableArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages a Network Connection Monitor.
   * 
   *  &gt; **NOTE:** Any Network Connection Monitor resource created with API versions 2019-06-01 or earlier (v1) are now incompatible with this provider, which now only supports v2.
   */
  def NetworkConnectionMonitor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkConnectionMonitorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkConnectionMonitorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.NetworkConnectionMonitor(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.ExpressRouteCircuitArgs.Builder)
    /**
     * @param sku A `sku` block for the ExpressRoute circuit as documented below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRouteCircuitSkuArgs.Builder]):
        com.pulumi.azure.network.ExpressRouteCircuitArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRouteCircuitSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.ExpressRouteCircuitArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages the DNS servers associated with a virtual network.
   * 
   *  &gt; **Note:** Terraform currently provides both a standalone virtual network DNS Servers resource, and allows for DNS servers to be defined in-line within the Virtual Network resource.
   *  At this time you cannot use a Virtual Network with in-line DNS servers in conjunction with any Virtual Network DNS Servers resources. Doing so will cause a conflict of Virtual Network DNS Servers configurations and will overwrite virtual networks DNS servers.
   */
  def VirtualNetworkDnsServers(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualNetworkDnsServersArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.network.VirtualNetworkDnsServersArgs.builder
    com.pulumi.azure.network.VirtualNetworkDnsServers(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Public IP Prefix. */
  def PublicIpPrefix(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.PublicIpPrefixArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.PublicIpPrefixArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.PublicIpPrefix(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.RoutingIntentArgs.Builder)
    /**
     * @param routingPolicies One or more `routingPolicy` blocks as defined below.
     * @return builder
     */
    def routingPolicies(args: Endofunction[com.pulumi.azure.network.inputs.RoutingIntentRoutingPolicyArgs.Builder]*):
        com.pulumi.azure.network.RoutingIntentArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.RoutingIntentRoutingPolicyArgs.builder
      builder.routingPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.FirewallApplicationRuleCollectionArgs.Builder)
    /**
     * @param rules One or more `rule` blocks as defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.network.inputs.FirewallApplicationRuleCollectionRuleArgs.Builder]*):
        com.pulumi.azure.network.FirewallApplicationRuleCollectionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallApplicationRuleCollectionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.VpnServerConfigurationArgs.Builder)
    def azureActiveDirectoryAuthentications(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs.Builder]*):
        com.pulumi.azure.network.VpnServerConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs.builder
      builder.azureActiveDirectoryAuthentications(args.map(_(argsBuilder).build)*)

    def clientRevokedCertificates(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationClientRevokedCertificateArgs.Builder]*):
        com.pulumi.azure.network.VpnServerConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationClientRevokedCertificateArgs.builder
      builder.clientRevokedCertificates(args.map(_(argsBuilder).build)*)

    def clientRootCertificates(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationClientRootCertificateArgs.Builder]*):
        com.pulumi.azure.network.VpnServerConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationClientRootCertificateArgs.builder
      builder.clientRootCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param ipsecPolicy A `ipsecPolicy` block as defined below.
     * @return builder
     */
    def ipsecPolicy(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationIpsecPolicyArgs.Builder]):
        com.pulumi.azure.network.VpnServerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationIpsecPolicyArgs.builder
      builder.ipsecPolicy(args(argsBuilder).build)

    def radius(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusArgs.Builder]):
        com.pulumi.azure.network.VpnServerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusArgs.builder
      builder.radius(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.VpnServerConfigurationArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an External Endpoint within a Traffic Manager Profile. */
  def TrafficManagerExternalEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.TrafficManagerExternalEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.TrafficManagerExternalEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.TrafficManagerExternalEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Public IP Address.
   * 
   *  &gt; **Note** If this resource is to be associated with a resource that requires disassociation before destruction (such as `azure.network.NetworkInterface`) it is recommended to set the `lifecycle` argument `createBeforeDestroy = true`. Otherwise, it can fail to disassociate on destruction.
   */
  def PublicIp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.PublicIpArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.PublicIpArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.PublicIp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.NetworkManagerArgs.Builder)
    /**
     * @param scope A `scope` block as defined below.
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerScopeArgs.Builder]):
        com.pulumi.azure.network.NetworkManagerArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerScopeArgs.builder
      builder.scope(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.NetworkManagerArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.VpnServerConfigurationPolicyGroupArgs.Builder)
    /**
     * @param policies One or more `policy` blocks as documented below.
     * @return builder
     */
    def policies(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationPolicyGroupPolicyArgs.Builder]*):
        com.pulumi.azure.network.VpnServerConfigurationPolicyGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationPolicyGroupPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.VirtualNetworkGatewayConnectionArgs.Builder)
    /**
     * @param customBgpAddresses A `customBgpAddresses` block which is documented below.
     *  The block can only be used on `IPSec` / `activeactive` connections,
     *  For details about see [the relevant section in the Azure documentation](https://docs.microsoft.com/en-us/azure/vpn-gateway/vpn-gateway-howto-aws-bgp).
     * @return builder
     */
    def customBgpAddresses(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionCustomBgpAddressesArgs.Builder]):
        com.pulumi.azure.network.VirtualNetworkGatewayConnectionArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionCustomBgpAddressesArgs.builder
      builder.customBgpAddresses(args(argsBuilder).build)

    /**
     * @param ipsecPolicy A `ipsecPolicy` block which is documented below.
     *  Only a single policy can be defined for a connection. For details on
     *  custom policies refer to [the relevant section in the Azure documentation](https://docs.microsoft.com/azure/vpn-gateway/vpn-gateway-ipsecikepolicy-rm-powershell).
     * @return builder
     */
    def ipsecPolicy(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionIpsecPolicyArgs.Builder]):
        com.pulumi.azure.network.VirtualNetworkGatewayConnectionArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionIpsecPolicyArgs.builder
      builder.ipsecPolicy(args(argsBuilder).build)

    /**
     * @param trafficSelectorPolicy One or more `trafficSelectorPolicy` blocks which are documented below.
     *  A `trafficSelectorPolicy` allows to specify a traffic selector policy proposal to be used in a virtual network gateway connection.
     *  For details about traffic selectors refer to [the relevant section in the Azure documentation](https://docs.microsoft.com/azure/vpn-gateway/vpn-gateway-connect-multiple-policybased-rm-ps).
     * @return builder
     */
    def trafficSelectorPolicy(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionTrafficSelectorPolicyArgs.Builder]):
        com.pulumi.azure.network.VirtualNetworkGatewayConnectionArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionTrafficSelectorPolicyArgs.builder
      builder.trafficSelectorPolicy(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.VirtualNetworkGatewayConnectionArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Firewall Policy. */
  def FirewallPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.FirewallPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.FirewallPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.FirewallPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Application Rule Collection within an Azure Firewall. */
  def FirewallApplicationRuleCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.FirewallApplicationRuleCollectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.FirewallApplicationRuleCollectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.FirewallApplicationRuleCollection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Virtual WAN. */
  def VirtualWan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualWanArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualWanArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.VirtualWan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.FirewallPolicyRuleCollectionGroupArgs.Builder)
    /**
     * @param applicationRuleCollections One or more `applicationRuleCollection` blocks as defined below.
     * @return builder
     */
    def applicationRuleCollections(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs.Builder]*):
        com.pulumi.azure.network.FirewallPolicyRuleCollectionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs.builder
      builder.applicationRuleCollections(args.map(_(argsBuilder).build)*)

    /**
     * @param natRuleCollections One or more `natRuleCollection` blocks as defined below.
     * @return builder
     */
    def natRuleCollections(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionArgs.Builder]*):
        com.pulumi.azure.network.FirewallPolicyRuleCollectionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionArgs.builder
      builder.natRuleCollections(args.map(_(argsBuilder).build)*)

    /**
     * @param networkRuleCollections One or more `networkRuleCollection` blocks as defined below.
     * @return builder
     */
    def networkRuleCollections(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionArgs.Builder]*):
        com.pulumi.azure.network.FirewallPolicyRuleCollectionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionArgs.builder
      builder.networkRuleCollections(args.map(_(argsBuilder).build)*)

  /** Manages a Network Manager Network Group. */
  def NetworkManagerNetworkGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerNetworkGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerNetworkGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerNetworkGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Route within a Route Table.
   * 
   *  &gt; **NOTE on Route Tables and Routes:** This provider currently
   *  provides both a standalone Route resource, and allows for Routes to be defined in-line within the Route Table resource.
   *  At this time you cannot use a Route Table with in-line Routes in conjunction with any Route resources. Doing so will cause a conflict of Route configurations and will overwrite Routes.
   */
  def Route(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.RouteArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.RouteArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.Route(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Security Perimeter. */
  def NetworkSecurityPerimeter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkSecurityPerimeterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkSecurityPerimeterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.NetworkSecurityPerimeter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.RouteMapArgs.Builder)
    /**
     * @param rules A `rule` block as defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.network.inputs.RouteMapRuleArgs.Builder]*):
        com.pulumi.azure.network.RouteMapArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.RouteMapRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  /** Manages the association between a NAT Gateway and a Public IP Prefix. */
  def NatGatewayPublicIpPrefixAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NatGatewayPublicIpPrefixAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.network.NatGatewayPublicIpPrefixAssociationArgs.builder
    com.pulumi.azure.network.NatGatewayPublicIpPrefixAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Virtual Network Gateway Nat Rule. */
  def VirtualNetworkGatewayNatRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualNetworkGatewayNatRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualNetworkGatewayNatRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.VirtualNetworkGatewayNatRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Manager Admin Rule Collection. */
  def NetworkManagerAdminRuleCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerAdminRuleCollectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerAdminRuleCollectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerAdminRuleCollection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Bgp Connection for a Virtual Hub. */
  def BgpConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.BgpConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.BgpConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.BgpConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a virtual network including any configured subnets. Each subnet can
   *  optionally be configured with a security group to be associated with the subnet.
   * 
   *  &gt; **NOTE on Virtual Networks and Subnet&#39;s:** This provider currently
   *  provides both a standalone Subnet resource, and allows for Subnets to be defined in-line within the Virtual Network resource.
   *  At this time you cannot use a Virtual Network with in-line Subnets in conjunction with any Subnet resources. Doing so will cause a conflict of Subnet configurations and will overwrite Subnet&#39;s.
   *  **NOTE on Virtual Networks and DNS Servers:** This provider currently provides both a standalone virtual network DNS Servers resource, and allows for DNS servers to be defined in-line within the Virtual Network resource.
   *  At this time you cannot use a Virtual Network with in-line DNS servers in conjunction with any Virtual Network DNS Servers resources. Doing so will cause a conflict of Virtual Network DNS Servers configurations and will overwrite virtual networks DNS servers.
   */
  def VirtualNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualNetworkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualNetworkArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.VirtualNetwork(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Manager Verifier Workspace Reachability Analysis Intent. */
  def NetworkManagerVerifierWorkspaceReachabilityAnalysisIntent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Manager IPAM Pool Static CIDR. */
  def NetworkManagerIpamPoolStaticCidr(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerIpamPoolStaticCidrArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerIpamPoolStaticCidrArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerIpamPoolStaticCidr(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a VPN Server Configuration. */
  def VpnServerConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.VpnServerConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VpnServerConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.VpnServerConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure NAT Gateway. */
  def NatGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NatGatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NatGatewayArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.NatGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Manager Admin Rule. */
  def NetworkManagerAdminRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerAdminRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerAdminRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerAdminRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Express Route Connection.
   * 
   *  &gt; **Note:** The provider status of the Express Route Circuit must be set as provisioned while creating the Express Route Connection. See more details [here](https://docs.microsoft.com/azure/expressroute/expressroute-howto-circuit-portal-resource-manager#send-the-service-key-to-your-connectivity-provider-for-provisioning).
   */
  def ExpressRouteConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.ExpressRouteConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.ExpressRouteConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.ExpressRouteConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.ApplicationGatewayArgs.Builder)
    /**
     * @param authenticationCertificates One or more `authenticationCertificate` blocks as defined below.
     * @return builder
     */
    def authenticationCertificates(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayAuthenticationCertificateArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayAuthenticationCertificateArgs.builder
      builder.authenticationCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param autoscaleConfiguration An `autoscaleConfiguration` block as defined below.
     * @return builder
     */
    def autoscaleConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayAutoscaleConfigurationArgs.Builder]):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayAutoscaleConfigurationArgs.builder
      builder.autoscaleConfiguration(args(argsBuilder).build)

    /**
     * @param backendAddressPools One or more `backendAddressPool` blocks as defined below.
     * @return builder
     */
    def backendAddressPools(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayBackendAddressPoolArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayBackendAddressPoolArgs.builder
      builder.backendAddressPools(args.map(_(argsBuilder).build)*)

    /**
     * @param backendHttpSettings One or more `backendHttpSettings` blocks as defined below.
     * 
     *  &gt; **Note:** At least one of `backendHttpSettings` or `backend` must be specified.
     * @return builder
     */
    def backendHttpSettings(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingArgs.builder
      builder.backendHttpSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param backends One or more `backend` blocks as defined below.
     * 
     *  &gt; **Note:** At least one of `backendHttpSettings` or `backend` must be specified.
     * @return builder
     */
    def backends(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayBackendArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayBackendArgs.builder
      builder.backends(args.map(_(argsBuilder).build)*)

    /**
     * @param customErrorConfigurations One or more `customErrorConfiguration` blocks as defined below.
     * @return builder
     */
    def customErrorConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayCustomErrorConfigurationArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayCustomErrorConfigurationArgs.builder
      builder.customErrorConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param frontendIpConfigurations One or more `frontendIpConfiguration` blocks as defined below.
     * @return builder
     */
    def frontendIpConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayFrontendIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayFrontendIpConfigurationArgs.builder
      builder.frontendIpConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param frontendPorts One or more `frontendPort` blocks as defined below.
     * @return builder
     */
    def frontendPorts(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayFrontendPortArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayFrontendPortArgs.builder
      builder.frontendPorts(args.map(_(argsBuilder).build)*)

    /**
     * @param gatewayIpConfigurations One or more `gatewayIpConfiguration` blocks as defined below.
     * @return builder
     */
    def gatewayIpConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayGatewayIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayGatewayIpConfigurationArgs.builder
      builder.gatewayIpConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param global A `global` block as defined below.
     * @return builder
     */
    def global(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayGlobalArgs.Builder]):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayGlobalArgs.builder
      builder.global(args(argsBuilder).build)

    /**
     * @param httpListeners One or more `httpListener` blocks as defined below.
     * 
     *  &gt; **Note:** At least one of `httpListener` or `listener` must be specified.
     * @return builder
     */
    def httpListeners(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayHttpListenerArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayHttpListenerArgs.builder
      builder.httpListeners(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayIdentityArgs.Builder]):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param listeners One or more `listener` blocks as defined below.
     * 
     *  &gt; **Note:** At least one of `httpListener` or `listener` must be specified.
     * @return builder
     */
    def listeners(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayListenerArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayListenerArgs.builder
      builder.listeners(args.map(_(argsBuilder).build)*)

    /**
     * @param privateLinkConfigurations One or more `privateLinkConfiguration` blocks as defined below.
     * @return builder
     */
    def privateLinkConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayPrivateLinkConfigurationArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayPrivateLinkConfigurationArgs.builder
      builder.privateLinkConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param probes One or more `probe` blocks as defined below.
     * @return builder
     */
    def probes(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayProbeArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayProbeArgs.builder
      builder.probes(args.map(_(argsBuilder).build)*)

    /**
     * @param redirectConfigurations One or more `redirectConfiguration` blocks as defined below.
     * @return builder
     */
    def redirectConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRedirectConfigurationArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRedirectConfigurationArgs.builder
      builder.redirectConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param requestRoutingRules One or more `requestRoutingRule` blocks as defined below.
     * 
     *  &gt; **Note:** At least one of `requestRoutingRule` or `routingRule` must be specified.
     * @return builder
     */
    def requestRoutingRules(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRequestRoutingRuleArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRequestRoutingRuleArgs.builder
      builder.requestRoutingRules(args.map(_(argsBuilder).build)*)

    /**
     * @param rewriteRuleSets One or more `rewriteRuleSet` blocks as defined below. Only valid for v2 WAF and Standard SKUs.
     * @return builder
     */
    def rewriteRuleSets(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetArgs.builder
      builder.rewriteRuleSets(args.map(_(argsBuilder).build)*)

    /**
     * @param routingRules One or more `routingRule` blocks as defined below.
     * 
     *  &gt; **Note:** At least one of `requestRoutingRule` or `routingRule` must be specified.
     * @return builder
     */
    def routingRules(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRoutingRuleArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRoutingRuleArgs.builder
      builder.routingRules(args.map(_(argsBuilder).build)*)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewaySkuArgs.Builder]):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewaySkuArgs.builder
      builder.sku(args(argsBuilder).build)

    /**
     * @param sslCertificates One or more `sslCertificate` blocks as defined below.
     * @return builder
     */
    def sslCertificates(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewaySslCertificateArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewaySslCertificateArgs.builder
      builder.sslCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param sslPolicy a `sslPolicy` block as defined below.
     * @return builder
     */
    def sslPolicy(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewaySslPolicyArgs.Builder]):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewaySslPolicyArgs.builder
      builder.sslPolicy(args(argsBuilder).build)

    /**
     * @param sslProfiles One or more `sslProfile` blocks as defined below.
     * @return builder
     */
    def sslProfiles(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewaySslProfileArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewaySslProfileArgs.builder
      builder.sslProfiles(args.map(_(argsBuilder).build)*)

    /**
     * @param trustedClientCertificates One or more `trustedClientCertificate` blocks as defined below.
     * @return builder
     */
    def trustedClientCertificates(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayTrustedClientCertificateArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayTrustedClientCertificateArgs.builder
      builder.trustedClientCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param trustedRootCertificates One or more `trustedRootCertificate` blocks as defined below.
     * @return builder
     */
    def trustedRootCertificates(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayTrustedRootCertificateArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayTrustedRootCertificateArgs.builder
      builder.trustedRootCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param urlPathMaps One or more `urlPathMap` blocks as defined below.
     * @return builder
     */
    def urlPathMaps(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayUrlPathMapArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayUrlPathMapArgs.builder
      builder.urlPathMaps(args.map(_(argsBuilder).build)*)

    /**
     * @param wafConfiguration A `wafConfiguration` block as defined below.
     * @return builder
     */
    def wafConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationArgs.Builder]):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationArgs.builder
      builder.wafConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages a Network Manager Deployment.
   * 
   *  &gt; **Note:** Using Network Manager Deployment to deploy Connectivity Configuration may modify or delete existing Virtual Network Peering. At this time you should not use Network Peering resource in conjunction with Network Manager Deployment. Doing so may cause a conflict of Peering configurations.
   */
  def NetworkManagerDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerDeploymentArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.network.NetworkManagerDeploymentArgs.builder
    com.pulumi.azure.network.NetworkManagerDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.VirtualNetworkArgs.Builder)
    /**
     * @param ddosProtectionPlan A `ddosProtectionPlan` block as documented below.
     * @return builder
     */
    def ddosProtectionPlan(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkDdosProtectionPlanArgs.Builder]):
        com.pulumi.azure.network.VirtualNetworkArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkDdosProtectionPlanArgs.builder
      builder.ddosProtectionPlan(args(argsBuilder).build)

    /**
     * @param encryption A `encryption` block as defined below.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkEncryptionArgs.Builder]):
        com.pulumi.azure.network.VirtualNetworkArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param ipAddressPools One or more `ipAddressPool` blocks as defined below. Only one association of each IP type(IPv4 or IPv6) is allowed.
     * 
     *  &gt; **Note:** Exactly one of `addressSpace` or `ipAddressPool` must be specified.
     * @return builder
     */
    def ipAddressPools(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkIpAddressPoolArgs.Builder]*):
        com.pulumi.azure.network.VirtualNetworkArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkIpAddressPoolArgs.builder
      builder.ipAddressPools(args.map(_(argsBuilder).build)*)

    /**
     * @param subnets Can be specified multiple times to define multiple subnets. Each `subnet` block supports fields documented below.
     * 
     *  &gt; **NOTE** Since `subnet` can be configured both inline and via the separate `azure.network.Subnet` resource, we have to explicitly set it to empty slice (`[]`) to remove it.
     * @return builder
     */
    def subnets(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkSubnetArgs.Builder]*):
        com.pulumi.azure.network.VirtualNetworkArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.VirtualNetworkArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Network Manager IP Address Management (IPAM) Pool. */
  def NetworkManagerIpamPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerIpamPoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerIpamPoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.NetworkManagerIpamPool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.TrafficManagerAzureEndpointArgs.Builder)
    /**
     * @param customHeaders One or more `customHeader` blocks as defined below.
     * @return builder
     */
    def customHeaders(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointCustomHeaderArgs.Builder]*):
        com.pulumi.azure.network.TrafficManagerAzureEndpointArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointCustomHeaderArgs.builder
      builder.customHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param subnets One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def subnets(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointSubnetArgs.Builder]*):
        com.pulumi.azure.network.TrafficManagerAzureEndpointArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

  /**
   * Manages a Network Manager Routing Rule Collection.
   * 
   *  !&gt; **Note:** Terraform has enabled force deletion. This setting deletes the resource even if it&#39;s part of a deployed configuration. If the configuration is deployed, the service will perform a cleanup deployment in the background before the deletion.
   */
  def NetworkManagerRoutingRuleCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerRoutingRuleCollectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerRoutingRuleCollectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerRoutingRuleCollection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.TrafficManagerProfileArgs.Builder)
    /**
     * @param dnsConfig This block specifies the DNS configuration of the Profile. One `dnsConfig` block as defined below.
     * @return builder
     */
    def dnsConfig(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerProfileDnsConfigArgs.Builder]):
        com.pulumi.azure.network.TrafficManagerProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerProfileDnsConfigArgs.builder
      builder.dnsConfig(args(argsBuilder).build)

    /**
     * @param monitorConfig This block specifies the Endpoint monitoring configuration for the Profile. One `monitorConfig` block as defined below.
     * @return builder
     */
    def monitorConfig(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerProfileMonitorConfigArgs.Builder]):
        com.pulumi.azure.network.TrafficManagerProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerProfileMonitorConfigArgs.builder
      builder.monitorConfig(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.TrafficManagerProfileArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.ExpressRouteCircuitPeeringArgs.Builder)
    /**
     * @param ipv6 A `ipv6` block as defined below.
     * @return builder
     */
    def ipv6(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringIpv6Args.Builder]):
        com.pulumi.azure.network.ExpressRouteCircuitPeeringArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringIpv6Args.builder
      builder.ipv6(args(argsBuilder).build)

    /**
     * @param microsoftPeeringConfig A `microsoftPeeringConfig` block as defined below. Required when `peeringType` is set to `MicrosoftPeering` and config for IPv4.
     * @return builder
     */
    def microsoftPeeringConfig(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringMicrosoftPeeringConfigArgs.Builder]):
        com.pulumi.azure.network.ExpressRouteCircuitPeeringArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringMicrosoftPeeringConfigArgs.builder
      builder.microsoftPeeringConfig(args(argsBuilder).build)

  /**
   * Manages a virtual network peering which allows resources to access other
   *  resources in the linked virtual network.
   */
  def VirtualNetworkPeering(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualNetworkPeeringArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualNetworkPeeringArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.VirtualNetworkPeering(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the association between a Network Interface and a Load Balancer&#39;s NAT Rule. */
  def NetworkInterfaceNatRuleAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkInterfaceNatRuleAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.network.NetworkInterfaceNatRuleAssociationArgs.builder
    com.pulumi.azure.network.NetworkInterfaceNatRuleAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a local network gateway connection over which specific connections can be configured. */
  def LocalNetworkGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.LocalNetworkGatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.LocalNetworkGatewayArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.LocalNetworkGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a subnet. Subnets represent network segments within the IP space defined by the virtual network.
   * 
   *  &gt; **NOTE on Virtual Networks and Subnet&#39;s:** This provider currently
   *  provides both a standalone Subnet resource, and allows for Subnets to be defined in-line within the Virtual Network resource.
   *  At this time you cannot use a Virtual Network with in-line Subnets in conjunction with any Subnet resources. Doing so will cause a conflict of Subnet configurations and will overwrite Subnets.
   */
  def Subnet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.SubnetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.SubnetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.Subnet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a network security group that contains a list of network security rules.  Network security groups enable inbound or outbound traffic to be enabled or denied.
   * 
   *  &gt; **NOTE on Network Security Groups and Network Security Rules:** This provider currently
   *  provides both a standalone Network Security Rule resource, and allows for Network Security Rules to be defined in-line within the Network Security Group resource.
   *  At this time you cannot use a Network Security Group with in-line Network Security Rules in conjunction with any Network Security Rule resources. Doing so will cause a conflict of rule settings and will overwrite rules.
   */
  def NetworkSecurityGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkSecurityGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkSecurityGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.NetworkSecurityGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the association between a NAT Gateway and a Public IP. */
  def NatGatewayPublicIpAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NatGatewayPublicIpAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.network.NatGatewayPublicIpAssociationArgs.builder
    com.pulumi.azure.network.NatGatewayPublicIpAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an ExpressRoute gateway. */
  def ExpressRouteGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.ExpressRouteGatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.ExpressRouteGatewayArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.ExpressRouteGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Associates a NAT Gateway with a Subnet within a Virtual Network. */
  def SubnetNatGatewayAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.SubnetNatGatewayAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.network.SubnetNatGatewayAssociationArgs.builder
    com.pulumi.azure.network.SubnetNatGatewayAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Network Manager Connectivity Configuration.
   * 
   *  &gt; **Note:** The `azure.network.NetworkManagerConnectivityConfiguration` deployment may modify or delete existing Network Peering resource.
   */
  def NetworkManagerConnectivityConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerConnectivityConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerConnectivityConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerConnectivityConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Virtual Network Gateway to establish secure, cross-premises connectivity.
   * 
   *  &gt; **Note:** Please be aware that provisioning a Virtual Network Gateway takes a long time (between 30 minutes and 1 hour)
   */
  def VirtualNetworkGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualNetworkGatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualNetworkGatewayArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.VirtualNetworkGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a NAT Rule Collection within an Azure Firewall. */
  def FirewallNatRuleCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.FirewallNatRuleCollectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.FirewallNatRuleCollectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.FirewallNatRuleCollection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Manager. */
  def NetworkManager(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.NetworkManager(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.VirtualNetworkGatewayNatRuleArgs.Builder)
    /**
     * @param externalMappings One or more `externalMapping` blocks as documented below.
     * @return builder
     */
    def externalMappings(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleExternalMappingArgs.Builder]*):
        com.pulumi.azure.network.VirtualNetworkGatewayNatRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleExternalMappingArgs.builder
      builder.externalMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param internalMappings One or more `internalMapping` blocks as documented below.
     * @return builder
     */
    def internalMappings(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleInternalMappingArgs.Builder]*):
        com.pulumi.azure.network.VirtualNetworkGatewayNatRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleInternalMappingArgs.builder
      builder.internalMappings(args.map(_(argsBuilder).build)*)

  /**
   * Manages IP Group CIDR records.
   * 
   *  &gt; **Note:** Warning Do not use this resource at the same time as the `cidrs` property of the
   *  `azure.network.IPGroup` resource for the same IP Group. Doing so will cause a conflict and
   *  CIDRS will be removed.
   */
  def IPGroupCIDR(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.IPGroupCIDRArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.network.IPGroupCIDRArgs.builder
    com.pulumi.azure.network.IPGroupCIDR(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.VirtualHubArgs.Builder)
    /**
     * @param routes One or more `route` blocks as defined below.
     * @return builder
     */
    def routes(args: Endofunction[com.pulumi.azure.network.inputs.VirtualHubRouteArgs.Builder]*):
        com.pulumi.azure.network.VirtualHubArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualHubRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.VirtualHubArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.ProfileArgs.Builder)
    /**
     * @param containerNetworkInterface A `containerNetworkInterface` block as documented below.
     * @return builder
     */
    def containerNetworkInterface(args: Endofunction[com.pulumi.azure.network.inputs.ProfileContainerNetworkInterfaceArgs.Builder]):
        com.pulumi.azure.network.ProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ProfileContainerNetworkInterfaceArgs.builder
      builder.containerNetworkInterface(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.ProfileArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a VPN Gateway Connection. */
  def VpnGatewayConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.VpnGatewayConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VpnGatewayConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.VpnGatewayConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Virtual Hub Route Table. */
  def VirtualHubRouteTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualHubRouteTableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualHubRouteTableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.VirtualHubRouteTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Manager Scope Connection which may cross tenants. */
  def NetworkManagerScopeConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerScopeConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerScopeConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerScopeConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Route in a Virtual Hub Route Table.
   * 
   *  &gt; **Note:** Route table routes can managed with this resource, or in-line with the virtualHubRouteTable resource. Using both is not supported.
   */
  def VirtualHubRouteTableRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualHubRouteTableRouteArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualHubRouteTableRouteArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.VirtualHubRouteTableRoute(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an ExpressRoute Circuit Peering. */
  def ExpressRouteCircuitPeering(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.ExpressRouteCircuitPeeringArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.network.ExpressRouteCircuitPeeringArgs.builder
    com.pulumi.azure.network.ExpressRouteCircuitPeering(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.FirewallNetworkRuleCollectionArgs.Builder)
    /**
     * @param rules One or more `rule` blocks as defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.network.inputs.FirewallNetworkRuleCollectionRuleArgs.Builder]*):
        com.pulumi.azure.network.FirewallNetworkRuleCollectionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallNetworkRuleCollectionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  /** Manages an ExpressRoute Port Authorization. */
  def ExpressRoutePortAuthorization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.ExpressRoutePortAuthorizationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.ExpressRoutePortAuthorizationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.ExpressRoutePortAuthorization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a VPN Gateway within a Virtual Hub, which enables Site-to-Site communication. */
  def VpnGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.VpnGatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VpnGatewayArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.VpnGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.FirewallNatRuleCollectionArgs.Builder)
    /**
     * @param rules One or more `rule` blocks as defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.network.inputs.FirewallNatRuleCollectionRuleArgs.Builder]*):
        com.pulumi.azure.network.FirewallNatRuleCollectionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallNatRuleCollectionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.NetworkManagerRoutingRuleArgs.Builder)
    /**
     * @param destination A `destination` block as defined below.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleDestinationArgs.Builder]):
        com.pulumi.azure.network.NetworkManagerRoutingRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param nextHop A `nextHop` block as defined below.
     * @return builder
     */
    def nextHop(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleNextHopArgs.Builder]):
        com.pulumi.azure.network.NetworkManagerRoutingRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleNextHopArgs.builder
      builder.nextHop(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.NetworkInterfaceArgs.Builder)
    /**
     * @param ipConfigurations One or more `ipConfiguration` blocks as defined below.
     * @return builder
     */
    def ipConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.NetworkInterfaceIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.NetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkInterfaceIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.NetworkInterfaceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntentArgs.Builder)
    /**
     * @param ipTraffic An `ipTraffic` block as defined below. Changing this forces a new Network Manager Verifier Workspace Reachability Analysis Intent to be created.
     * @return builder
     */
    def ipTraffic(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntentIpTrafficArgs.Builder]):
        com.pulumi.azure.network.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntentArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntentIpTrafficArgs.builder
      builder.ipTraffic(args(argsBuilder).build)

  /** Manages the association between a Network Interface and a Application Gateway&#39;s Backend Address Pool. */
  def NetworkInterfaceApplicationGatewayBackendAddressPoolAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkInterfaceApplicationGatewayBackendAddressPoolAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.network.NetworkInterfaceApplicationGatewayBackendAddressPoolAssociationArgs.builder
    com.pulumi.azure.network.NetworkInterfaceApplicationGatewayBackendAddressPoolAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.VirtualNetworkGatewayArgs.Builder)
    /**
     * @param bgpSettings A `bgpSettings` block which is documented below. In this block the BGP specific settings can be defined.
     * @return builder
     */
    def bgpSettings(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayBgpSettingsArgs.Builder]):
        com.pulumi.azure.network.VirtualNetworkGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayBgpSettingsArgs.builder
      builder.bgpSettings(args(argsBuilder).build)

    /**
     * @param customRoute A `customRoute` block as defined below. Specifies a custom routes address space for a virtual network gateway and a VpnClient.
     * @return builder
     */
    def customRoute(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayCustomRouteArgs.Builder]):
        com.pulumi.azure.network.VirtualNetworkGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayCustomRouteArgs.builder
      builder.customRoute(args(argsBuilder).build)

    /**
     * @param ipConfigurations One or more (up to 3) `ipConfiguration` blocks documented below. Changing this forces a new resource to be created. An active-standby gateway requires exactly one `ipConfiguration` block, an active-active gateway requires exactly two `ipConfiguration` blocks whereas an active-active zone redundant gateway with P2S configuration requires exactly three `ipConfiguration` blocks.
     * @return builder
     */
    def ipConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.VirtualNetworkGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param policyGroups One or more `policyGroup` blocks as defined below.
     * @return builder
     */
    def policyGroups(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayPolicyGroupArgs.Builder]*):
        com.pulumi.azure.network.VirtualNetworkGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayPolicyGroupArgs.builder
      builder.policyGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param vpnClientConfiguration A `vpnClientConfiguration` block which is documented below. In this block the Virtual Network Gateway can be configured to accept IPSec point-to-site connections.
     * @return builder
     */
    def vpnClientConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationArgs.Builder]):
        com.pulumi.azure.network.VirtualNetworkGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationArgs.builder
      builder.vpnClientConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.VirtualNetworkGatewayArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.VpnGatewayConnectionArgs.Builder)
    /**
     * @param routing A `routing` block as defined below. If this is not specified, there will be a default route table created implicitly.
     * @return builder
     */
    def routing(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayConnectionRoutingArgs.Builder]):
        com.pulumi.azure.network.VpnGatewayConnectionArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayConnectionRoutingArgs.builder
      builder.routing(args(argsBuilder).build)

    /**
     * @param trafficSelectorPolicies One or more `trafficSelectorPolicy` blocks as defined below.
     * @return builder
     */
    def trafficSelectorPolicies(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayConnectionTrafficSelectorPolicyArgs.Builder]*):
        com.pulumi.azure.network.VpnGatewayConnectionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayConnectionTrafficSelectorPolicyArgs.builder
      builder.trafficSelectorPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param vpnLinks One or more `vpnLink` blocks as defined below.
     * @return builder
     */
    def vpnLinks(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkArgs.Builder]*):
        com.pulumi.azure.network.VpnGatewayConnectionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkArgs.builder
      builder.vpnLinks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.TrafficManagerNestedEndpointArgs.Builder)
    /**
     * @param customHeaders One or more `customHeader` blocks as defined below.
     * @return builder
     */
    def customHeaders(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointCustomHeaderArgs.Builder]*):
        com.pulumi.azure.network.TrafficManagerNestedEndpointArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointCustomHeaderArgs.builder
      builder.customHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param subnets One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def subnets(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointSubnetArgs.Builder]*):
        com.pulumi.azure.network.TrafficManagerNestedEndpointArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.VirtualHubConnectionArgs.Builder)
    /**
     * @param routing A `routing` block as defined below.
     * @return builder
     */
    def routing(args: Endofunction[com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingArgs.Builder]):
        com.pulumi.azure.network.VirtualHubConnectionArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingArgs.builder
      builder.routing(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.LocalNetworkGatewayArgs.Builder)
    /**
     * @param bgpSettings A `bgpSettings` block as defined below containing the Local Network Gateway&#39;s BGP speaker settings.
     * @return builder
     */
    def bgpSettings(args: Endofunction[com.pulumi.azure.network.inputs.LocalNetworkGatewayBgpSettingsArgs.Builder]):
        com.pulumi.azure.network.LocalNetworkGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.LocalNetworkGatewayBgpSettingsArgs.builder
      builder.bgpSettings(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.LocalNetworkGatewayArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Firewall Policy Rule Collection Group. */
  def FirewallPolicyRuleCollectionGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.FirewallPolicyRuleCollectionGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.FirewallPolicyRuleCollectionGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.FirewallPolicyRuleCollectionGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Manager Verifier Workspace. */
  def NetworkManagerVerifierWorkspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerVerifierWorkspaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerVerifierWorkspaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.NetworkManagerVerifierWorkspace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.ExpressRoutePortArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRoutePortIdentityArgs.Builder]):
        com.pulumi.azure.network.ExpressRoutePortArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRoutePortIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param link1 A list of `link` blocks as defined below.
     * @return builder
     */
    def link1(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRoutePortLink1Args.Builder]):
        com.pulumi.azure.network.ExpressRoutePortArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRoutePortLink1Args.builder
      builder.link1(args(argsBuilder).build)

    /**
     * @param link2 A list of `link` blocks as defined below.
     * @return builder
     */
    def link2(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRoutePortLink2Args.Builder]):
        com.pulumi.azure.network.ExpressRoutePortArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRoutePortLink2Args.builder
      builder.link2(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.ExpressRoutePortArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Azure Firewall. */
  def Firewall(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.FirewallArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.FirewallArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.Firewall(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Associates a Route Table with a Subnet within a Virtual Network. */
  def SubnetRouteTableAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.SubnetRouteTableAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.network.SubnetRouteTableAssociationArgs.builder
    com.pulumi.azure.network.SubnetRouteTableAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Point-to-Site VPN Gateway. */
  def PointToPointVpnGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.PointToPointVpnGatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.PointToPointVpnGatewayArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.PointToPointVpnGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Network Security Rule.
   * 
   *  &gt; **NOTE on Network Security Groups and Network Security Rules:** This provider currently
   *  provides both a standalone Network Security Rule resource, and allows for Network Security Rules to be defined in-line within the Network Security Group resource.
   *  At this time you cannot use a Network Security Group with in-line Network Security Rules in conjunction with any Network Security Rule resources. Doing so will cause a conflict of rule settings and will overwrite rules.
   */
  def NetworkSecurityRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkSecurityRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkSecurityRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkSecurityRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Route Map. */
  def RouteMap(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.RouteMapArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.RouteMapArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.RouteMap(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Route Table
   * 
   *  &gt; **NOTE on Route Tables and Routes:** There is both a standalone `route` resource, and allows for Routes to be defined in-line within the `routeTable` resource.
   *  At this time you cannot use a Route Table with in-line Routes in conjunction with any Route resources. Doing so will cause a conflict of Route configurations and will overwrite Routes.
   */
  def RouteTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.RouteTableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.RouteTableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.RouteTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a VPN Server Configuration Policy Group. */
  def VpnServerConfigurationPolicyGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.VpnServerConfigurationPolicyGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VpnServerConfigurationPolicyGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.VpnServerConfigurationPolicyGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an ExpressRoute circuit. */
  def ExpressRouteCircuit(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.ExpressRouteCircuitArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.ExpressRouteCircuitArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.ExpressRouteCircuit(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Connection for a Virtual Hub. */
  def VirtualHubConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualHubConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualHubConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.VirtualHubConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.NetworkWatcherFlowLogArgs.Builder)
    /**
     * @param retentionPolicy A `retentionPolicy` block as documented below.
     * @return builder
     */
    def retentionPolicy(args: Endofunction[com.pulumi.azure.network.inputs.NetworkWatcherFlowLogRetentionPolicyArgs.Builder]):
        com.pulumi.azure.network.NetworkWatcherFlowLogArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkWatcherFlowLogRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

    /**
     * @param trafficAnalytics A `trafficAnalytics` block as documented below.
     * @return builder
     */
    def trafficAnalytics(args: Endofunction[com.pulumi.azure.network.inputs.NetworkWatcherFlowLogTrafficAnalyticsArgs.Builder]):
        com.pulumi.azure.network.NetworkWatcherFlowLogArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkWatcherFlowLogTrafficAnalyticsArgs.builder
      builder.trafficAnalytics(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.NetworkWatcherFlowLogArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages the association between a Network Interface and a Application Security Group. */
  def NetworkInterfaceApplicationSecurityGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkInterfaceApplicationSecurityGroupAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.network.NetworkInterfaceApplicationSecurityGroupAssociationArgs.builder
    com.pulumi.azure.network.NetworkInterfaceApplicationSecurityGroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the association between a Network Interface and a Network Security Group. */
  def NetworkInterfaceSecurityGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkInterfaceSecurityGroupAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.network.NetworkInterfaceSecurityGroupAssociationArgs.builder
    com.pulumi.azure.network.NetworkInterfaceSecurityGroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an AzureNetwork DDoS Protection Plan.
   * 
   *  &gt; **Note:** Azure only allows `one` DDoS Protection Plan per region.
   * 
   *  &gt; **Note:** The DDoS Protection Plan is a [high-cost service](https://azure.microsoft.com/en-us/pricing/details/ddos-protection/#pricing). Please keep this in mind while testing and learning.
   */
  def DdosProtectionPlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.DdosProtectionPlanArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.DdosProtectionPlanArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.DdosProtectionPlan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Virtual Hub Routing Intent. */
  def RoutingIntent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.RoutingIntentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.RoutingIntentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.RoutingIntent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.SubnetArgs.Builder)
    /**
     * @param delegations One or more `delegation` blocks as defined below.
     * @return builder
     */
    def delegations(args: Endofunction[com.pulumi.azure.network.inputs.SubnetDelegationArgs.Builder]*):
        com.pulumi.azure.network.SubnetArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.SubnetDelegationArgs.builder
      builder.delegations(args.map(_(argsBuilder).build)*)

    /**
     * @param ipAddressPool An `ipAddressPool` block as defined below.
     * 
     *  &gt; **Note:** Exactly one of `addressPrefixes` or `ipAddressPool` must be specified.
     * @return builder
     */
    def ipAddressPool(args: Endofunction[com.pulumi.azure.network.inputs.SubnetIpAddressPoolArgs.Builder]):
        com.pulumi.azure.network.SubnetArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.SubnetIpAddressPoolArgs.builder
      builder.ipAddressPool(args(argsBuilder).build)

  /** Manages an Express Route Circuit Connection. */
  def ExpressRouteCircuitConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.ExpressRouteCircuitConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.ExpressRouteCircuitConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.ExpressRouteCircuitConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Security Perimeter Access Rule. */
  def NetworkSecurityPerimeterAccessRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkSecurityPerimeterAccessRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkSecurityPerimeterAccessRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkSecurityPerimeterAccessRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the association between a Network Interface and a Load Balancer&#39;s Backend Address Pool. */
  def NetworkInterfaceBackendAddressPoolAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkInterfaceBackendAddressPoolAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.network.NetworkInterfaceBackendAddressPoolAssociationArgs.builder
    com.pulumi.azure.network.NetworkInterfaceBackendAddressPoolAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Security Perimeter Association. */
  def NetworkSecurityPerimeterAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkSecurityPerimeterAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkSecurityPerimeterAssociationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkSecurityPerimeterAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Interface. */
  def NetworkInterface(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkInterfaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkInterfaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.network.NetworkInterface(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Manager Subscription Connection which may cross tenants. */
  def NetworkManagerSubscriptionConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerSubscriptionConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerSubscriptionConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerSubscriptionConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an ExpressRoute Circuit Authorization. */
  def ExpressRouteCircuitAuthorization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.ExpressRouteCircuitAuthorizationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.ExpressRouteCircuitAuthorizationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.ExpressRouteCircuitAuthorization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Endpoint within a Traffic Manager Profile. */
  def TrafficManagerAzureEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.TrafficManagerAzureEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.TrafficManagerAzureEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.TrafficManagerAzureEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.network.inputs.TrafficManagerProfileState.Builder)
    /**
     * @param dnsConfig This block specifies the DNS configuration of the Profile. One `dnsConfig` block as defined below.
     * @return builder
     */
    def dnsConfig(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerProfileDnsConfigArgs.Builder]):
        com.pulumi.azure.network.inputs.TrafficManagerProfileState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerProfileDnsConfigArgs.builder
      builder.dnsConfig(args(argsBuilder).build)

    /**
     * @param monitorConfig This block specifies the Endpoint monitoring configuration for the Profile. One `monitorConfig` block as defined below.
     * @return builder
     */
    def monitorConfig(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerProfileMonitorConfigArgs.Builder]):
        com.pulumi.azure.network.inputs.TrafficManagerProfileState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerProfileMonitorConfigArgs.builder
      builder.monitorConfig(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.TrafficManagerProfileState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.NetworkManagerState.Builder)
    /**
     * @param crossTenantScopes One or more `crossTenantScopes` blocks as defined below.
     * @return builder
     */
    def crossTenantScopes(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerCrossTenantScopeArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkManagerState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerCrossTenantScopeArgs.builder
      builder.crossTenantScopes(args.map(_(argsBuilder).build)*)

    /**
     * @param scope A `scope` block as defined below.
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerScopeArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkManagerState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerScopeArgs.builder
      builder.scope(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.NetworkManagerState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringIpv6Args.Builder)
    /**
     * @param microsoftPeering A `microsoftPeering` block as defined below.
     * @return builder
     */
    def microsoftPeering(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringIpv6MicrosoftPeeringArgs.Builder]):
        com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringIpv6Args.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringIpv6MicrosoftPeeringArgs.builder
      builder.microsoftPeering(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.PointToPointVpnGatewayState.Builder)
    /**
     * @param connectionConfigurations A `connectionConfiguration` block as defined below.
     * @return builder
     */
    def connectionConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.PointToPointVpnGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationArgs.builder
      builder.connectionConfigurations(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.PointToPointVpnGatewayState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusArgs.Builder)
    /**
     * @param clientRootCertificates One or more `clientRootCertificate` blocks as defined below.
     * @return builder
     */
    def clientRootCertificates(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusClientRootCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusClientRootCertificateArgs.builder
      builder.clientRootCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param serverRootCertificates One or more `serverRootCertificate` blocks as defined below.
     * @return builder
     */
    def serverRootCertificates(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusServerRootCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusServerRootCertificateArgs.builder
      builder.serverRootCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param servers One or more `server` blocks as defined below.
     * @return builder
     */
    def servers(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusServerArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusServerArgs.builder
      builder.servers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VpnSiteLinkArgs.Builder)
    /**
     * @param bgp A `bgp` block as defined above.
     * 
     *  &gt; **Note:** The `link.bgp` has to be set when the `addressCidrs` isn&#39;t specified.
     * @return builder
     */
    def bgp(args: Endofunction[com.pulumi.azure.network.inputs.VpnSiteLinkBgpArgs.Builder]):
        com.pulumi.azure.network.inputs.VpnSiteLinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnSiteLinkBgpArgs.builder
      builder.bgp(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionArgs.Builder)
    /**
     * @param rules One or more `networkRule` blocks as defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VirtualNetworkSubnetArgs.Builder)
    /**
     * @param delegation One or more `delegation` blocks as defined below.
     * @return builder
     */
    def delegation(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkSubnetDelegationArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkSubnetArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkSubnetDelegationArgs.builder
      builder.delegation(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs.Builder)
    /**
     * @param httpHeaders Specifies a list of HTTP/HTTPS headers to insert. One or more `httpHeaders` blocks as defined below.
     * @return builder
     */
    def httpHeaders(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleHttpHeaderArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleHttpHeaderArgs.builder
      builder.httpHeaders(args.map(_(argsBuilder).build)*)

    def protocols(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs.builder
      builder.protocols(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionArgs.Builder)
    /**
     * @param signatureOverrides One or more `signatureOverrides` blocks as defined below.
     * @return builder
     */
    def signatureOverrides(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionSignatureOverrideArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionSignatureOverrideArgs.builder
      builder.signatureOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param trafficBypasses One or more `trafficBypass` blocks as defined below.
     * @return builder
     */
    def trafficBypasses(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionTrafficBypassArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionTrafficBypassArgs.builder
      builder.trafficBypasses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.ExpressRoutePortState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRoutePortIdentityArgs.Builder]):
        com.pulumi.azure.network.inputs.ExpressRoutePortState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRoutePortIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param link1 A list of `link` blocks as defined below.
     * @return builder
     */
    def link1(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRoutePortLink1Args.Builder]):
        com.pulumi.azure.network.inputs.ExpressRoutePortState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRoutePortLink1Args.builder
      builder.link1(args(argsBuilder).build)

    /**
     * @param link2 A list of `link` blocks as defined below.
     * @return builder
     */
    def link2(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRoutePortLink2Args.Builder]):
        com.pulumi.azure.network.inputs.ExpressRoutePortState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRoutePortLink2Args.builder
      builder.link2(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.ExpressRoutePortState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.FirewallNetworkRuleCollectionState.Builder)
    /**
     * @param rules One or more `rule` blocks as defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.network.inputs.FirewallNetworkRuleCollectionRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallNetworkRuleCollectionState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallNetworkRuleCollectionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.ApplicationGatewaySslProfileArgs.Builder)
    /**
     * @param sslPolicy a `sslPolicy` block as defined below.
     * @return builder
     */
    def sslPolicy(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewaySslProfileSslPolicyArgs.Builder]):
        com.pulumi.azure.network.inputs.ApplicationGatewaySslProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewaySslProfileSslPolicyArgs.builder
      builder.sslPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.VirtualNetworkSubnetDelegationArgs.Builder)
    /**
     * @param serviceDelegation A `serviceDelegation` block as defined below.
     * @return builder
     */
    def serviceDelegation(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkSubnetDelegationServiceDelegationArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkSubnetDelegationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkSubnetDelegationServiceDelegationArgs.builder
      builder.serviceDelegation(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.LocalNetworkGatewayState.Builder)
    /**
     * @param bgpSettings A `bgpSettings` block as defined below containing the Local Network Gateway&#39;s BGP speaker settings.
     * @return builder
     */
    def bgpSettings(args: Endofunction[com.pulumi.azure.network.inputs.LocalNetworkGatewayBgpSettingsArgs.Builder]):
        com.pulumi.azure.network.inputs.LocalNetworkGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.LocalNetworkGatewayBgpSettingsArgs.builder
      builder.bgpSettings(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.LocalNetworkGatewayState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.VirtualNetworkGatewayPolicyGroupArgs.Builder)
    /**
     * @param policyMembers One or more `policyMember` blocks as defined below.
     * @return builder
     */
    def policyMembers(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayPolicyGroupPolicyMemberArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayPolicyGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayPolicyGroupPolicyMemberArgs.builder
      builder.policyMembers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.NetworkInterfaceState.Builder)
    /**
     * @param ipConfigurations One or more `ipConfiguration` blocks as defined below.
     * @return builder
     */
    def ipConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.NetworkInterfaceIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkInterfaceState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkInterfaceIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.NetworkInterfaceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.VirtualNetworkGatewayState.Builder)
    /**
     * @param bgpSettings A `bgpSettings` block which is documented below. In this block the BGP specific settings can be defined.
     * @return builder
     */
    def bgpSettings(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayBgpSettingsArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayBgpSettingsArgs.builder
      builder.bgpSettings(args(argsBuilder).build)

    /**
     * @param customRoute A `customRoute` block as defined below. Specifies a custom routes address space for a virtual network gateway and a VpnClient.
     * @return builder
     */
    def customRoute(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayCustomRouteArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayCustomRouteArgs.builder
      builder.customRoute(args(argsBuilder).build)

    /**
     * @param ipConfigurations One or more (up to 3) `ipConfiguration` blocks documented below. Changing this forces a new resource to be created. An active-standby gateway requires exactly one `ipConfiguration` block, an active-active gateway requires exactly two `ipConfiguration` blocks whereas an active-active zone redundant gateway with P2S configuration requires exactly three `ipConfiguration` blocks.
     * @return builder
     */
    def ipConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param policyGroups One or more `policyGroup` blocks as defined below.
     * @return builder
     */
    def policyGroups(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayPolicyGroupArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayPolicyGroupArgs.builder
      builder.policyGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param vpnClientConfiguration A `vpnClientConfiguration` block which is documented below. In this block the Virtual Network Gateway can be configured to accept IPSec point-to-site connections.
     * @return builder
     */
    def vpnClientConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationArgs.builder
      builder.vpnClientConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.VirtualHubRouteTableState.Builder)
    /**
     * @param routes One or more `route` blocks as defined below.
     * @return builder
     */
    def routes(args: Endofunction[com.pulumi.azure.network.inputs.VirtualHubRouteTableRouteArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualHubRouteTableState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualHubRouteTableRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationArgs.Builder)
    /**
     * @param httpConfiguration A `httpConfiguration` block as defined below.
     * @return builder
     */
    def httpConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationHttpConfigurationArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationHttpConfigurationArgs.builder
      builder.httpConfiguration(args(argsBuilder).build)

    /**
     * @param icmpConfiguration A `icmpConfiguration` block as defined below.
     * @return builder
     */
    def icmpConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationIcmpConfigurationArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationIcmpConfigurationArgs.builder
      builder.icmpConfiguration(args(argsBuilder).build)

    /**
     * @param successThreshold A `successThreshold` block as defined below.
     * @return builder
     */
    def successThreshold(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationSuccessThresholdArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationSuccessThresholdArgs.builder
      builder.successThreshold(args(argsBuilder).build)

    /**
     * @param tcpConfiguration A `tcpConfiguration` block as defined below.
     * @return builder
     */
    def tcpConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationTcpConfigurationArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationTcpConfigurationArgs.builder
      builder.tcpConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringState.Builder)
    /**
     * @param ipv6 A `ipv6` block as defined below.
     * @return builder
     */
    def ipv6(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringIpv6Args.Builder]):
        com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringIpv6Args.builder
      builder.ipv6(args(argsBuilder).build)

    /**
     * @param microsoftPeeringConfig A `microsoftPeeringConfig` block as defined below. Required when `peeringType` is set to `MicrosoftPeering` and config for IPv4.
     * @return builder
     */
    def microsoftPeeringConfig(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringMicrosoftPeeringConfigArgs.Builder]):
        com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringMicrosoftPeeringConfigArgs.builder
      builder.microsoftPeeringConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.NetworkWatcherFlowLogState.Builder)
    /**
     * @param retentionPolicy A `retentionPolicy` block as documented below.
     * @return builder
     */
    def retentionPolicy(args: Endofunction[com.pulumi.azure.network.inputs.NetworkWatcherFlowLogRetentionPolicyArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkWatcherFlowLogState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkWatcherFlowLogRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

    /**
     * @param trafficAnalytics A `trafficAnalytics` block as documented below.
     * @return builder
     */
    def trafficAnalytics(args: Endofunction[com.pulumi.azure.network.inputs.NetworkWatcherFlowLogTrafficAnalyticsArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkWatcherFlowLogState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkWatcherFlowLogTrafficAnalyticsArgs.builder
      builder.trafficAnalytics(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.NetworkWatcherFlowLogState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.ApplicationGatewayPrivateLinkConfigurationArgs.Builder)
    /**
     * @param ipConfigurations One or more `ipConfiguration` blocks as defined below.
     * 
     *  &gt; **Note:** The `AllowApplicationGatewayPrivateLink` feature must be registered on the subscription before enabling private link
     * @return builder
     */
    def ipConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayPrivateLinkConfigurationIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayPrivateLinkConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayPrivateLinkConfigurationIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointFilterArgs.Builder)
    /**
     * @param items A `item` block as defined below.
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointFilterItemArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointFilterItemArgs.builder
      builder.items(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VpnServerConfigurationPolicyGroupState.Builder)
    /**
     * @param policies One or more `policy` blocks as documented below.
     * @return builder
     */
    def policies(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationPolicyGroupPolicyArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnServerConfigurationPolicyGroupState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationPolicyGroupPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.SubnetDelegationArgs.Builder)
    /**
     * @param serviceDelegation A `serviceDelegation` block as defined below.
     * @return builder
     */
    def serviceDelegation(args: Endofunction[com.pulumi.azure.network.inputs.SubnetDelegationServiceDelegationArgs.Builder]):
        com.pulumi.azure.network.inputs.SubnetDelegationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.SubnetDelegationServiceDelegationArgs.builder
      builder.serviceDelegation(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.TrafficManagerProfileMonitorConfigArgs.Builder)
    /**
     * @param customHeaders One or more `customHeader` blocks as defined below.
     * @return builder
     */
    def customHeaders(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerProfileMonitorConfigCustomHeaderArgs.Builder]*):
        com.pulumi.azure.network.inputs.TrafficManagerProfileMonitorConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerProfileMonitorConfigCustomHeaderArgs.builder
      builder.customHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationHttpConfigurationArgs.Builder)
    /**
     * @param requestHeaders A `requestHeader` block as defined below.
     * @return builder
     */
    def requestHeaders(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationHttpConfigurationRequestHeaderArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationHttpConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationHttpConfigurationRequestHeaderArgs.builder
      builder.requestHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingArgs.Builder)
    /**
     * @param propagatedRouteTable A `propagatedRouteTable` block as defined below.
     * @return builder
     */
    def propagatedRouteTable(args: Endofunction[com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingPropagatedRouteTableArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingPropagatedRouteTableArgs.builder
      builder.propagatedRouteTable(args(argsBuilder).build)

    /**
     * @param staticVnetRoutes A `staticVnetRoute` block as defined below.
     * @return builder
     */
    def staticVnetRoutes(args: Endofunction[com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingStaticVnetRouteArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingStaticVnetRouteArgs.builder
      builder.staticVnetRoutes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.RouteTableState.Builder)
    /**
     * @param routes A list of objects representing routes. Each object accepts the arguments documented below.
     * 
     *  &gt; **NOTE** Since `route` can be configured both inline and via the separate `azure.network.Route` resource, we have to explicitly set it to empty slice (`[]`) to remove it.
     * @return builder
     */
    def routes(args: Endofunction[com.pulumi.azure.network.inputs.RouteTableRouteArgs.Builder]*):
        com.pulumi.azure.network.inputs.RouteTableState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.RouteTableRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.RouteTableState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingArgs.Builder)
    /**
     * @param authenticationCertificates One or more `authenticationCertificateBackend` blocks as defined below.
     * @return builder
     */
    def authenticationCertificates(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingAuthenticationCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingAuthenticationCertificateArgs.builder
      builder.authenticationCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param connectionDraining A `connectionDraining` block as defined below.
     * @return builder
     */
    def connectionDraining(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingConnectionDrainingArgs.Builder]):
        com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingConnectionDrainingArgs.builder
      builder.connectionDraining(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.RouteFilterState.Builder)
    /**
     * @param rule A `rule` block as defined below.
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.azure.network.inputs.RouteFilterRuleArgs.Builder]):
        com.pulumi.azure.network.inputs.RouteFilterState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.RouteFilterRuleArgs.builder
      builder.rule(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.RouteFilterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs.Builder)
    /**
     * @param rules One or more `applicationRule` blocks as defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleArgs.Builder)
    /**
     * @param conditions One or more `condition` blocks as defined above.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleConditionArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param requestHeaderConfigurations One or more `requestHeaderConfiguration` blocks as defined above.
     * @return builder
     */
    def requestHeaderConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfigurationArgs.builder
      builder.requestHeaderConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeaderConfigurations One or more `responseHeaderConfiguration` blocks as defined above.
     * @return builder
     */
    def responseHeaderConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleResponseHeaderConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleResponseHeaderConfigurationArgs.builder
      builder.responseHeaderConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param url One `url` block as defined below
     * @return builder
     */
    def url(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleUrlArgs.Builder]):
        com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleUrlArgs.builder
      builder.url(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointState.Builder)
    /**
     * @param customHeaders One or more `customHeader` blocks as defined below.
     * @return builder
     */
    def customHeaders(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointCustomHeaderArgs.Builder]*):
        com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointCustomHeaderArgs.builder
      builder.customHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param subnets One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def subnets(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointSubnetArgs.Builder]*):
        com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.ProfileContainerNetworkInterfaceArgs.Builder)
    /**
     * @param ipConfigurations One or more `ipConfiguration` blocks as documented below.
     * @return builder
     */
    def ipConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ProfileContainerNetworkInterfaceIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.ProfileContainerNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ProfileContainerNetworkInterfaceIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleState.Builder)
    /**
     * @param externalMappings One or more `externalMapping` blocks as documented below.
     * @return builder
     */
    def externalMappings(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleExternalMappingArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleExternalMappingArgs.builder
      builder.externalMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param internalMappings One or more `internalMapping` blocks as documented below.
     * @return builder
     */
    def internalMappings(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleInternalMappingArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleInternalMappingArgs.builder
      builder.internalMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.NetworkManagerAdminRuleState.Builder)
    /**
     * @param destinations One or more `destination` blocks as defined below.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerAdminRuleDestinationArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkManagerAdminRuleState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerAdminRuleDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param sources One or more `source` blocks as defined below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerAdminRuleSourceArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkManagerAdminRuleState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerAdminRuleSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.NetworkConnectionMonitorState.Builder)
    /**
     * @param endpoints A `endpoint` block as defined below.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkConnectionMonitorState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param testConfigurations A `testConfiguration` block as defined below.
     * @return builder
     */
    def testConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkConnectionMonitorState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationArgs.builder
      builder.testConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param testGroups A `testGroup` block as defined below.
     * @return builder
     */
    def testGroups(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestGroupArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkConnectionMonitorState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestGroupArgs.builder
      builder.testGroups(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.NetworkConnectionMonitorState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.NetworkSecurityGroupState.Builder)
    /**
     * @param securityRules A list of objects representing security rules, as defined below.
     * 
     *  &gt; **NOTE** Since `securityRule` can be configured both inline and via the separate `azure.network.NetworkSecurityRule` resource, we have to explicitly set it to empty slice (`[]`) to remove it.
     * @return builder
     */
    def securityRules(args: Endofunction[com.pulumi.azure.network.inputs.NetworkSecurityGroupSecurityRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkSecurityGroupState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkSecurityGroupSecurityRuleArgs.builder
      builder.securityRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.NetworkSecurityGroupState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.RouteMapState.Builder)
    /**
     * @param rules A `rule` block as defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.network.inputs.RouteMapRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.RouteMapState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.RouteMapRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.ExpressRouteConnectionState.Builder)
    /**
     * @param routing A `routing` block as defined below.
     * @return builder
     */
    def routing(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRouteConnectionRoutingArgs.Builder]):
        com.pulumi.azure.network.inputs.ExpressRouteConnectionState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRouteConnectionRoutingArgs.builder
      builder.routing(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.FirewallPolicyState.Builder)
    /**
     * @param dns A `dns` block as defined below.
     * @return builder
     */
    def dns(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyDnsArgs.Builder]):
        com.pulumi.azure.network.inputs.FirewallPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyDnsArgs.builder
      builder.dns(args(argsBuilder).build)

    /**
     * @param explicitProxy A `explicitProxy` block as defined below.
     * @return builder
     */
    def explicitProxy(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyExplicitProxyArgs.Builder]):
        com.pulumi.azure.network.inputs.FirewallPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyExplicitProxyArgs.builder
      builder.explicitProxy(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyIdentityArgs.Builder]):
        com.pulumi.azure.network.inputs.FirewallPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param insights An `insights` block as defined below.
     * @return builder
     */
    def insights(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyInsightsArgs.Builder]):
        com.pulumi.azure.network.inputs.FirewallPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyInsightsArgs.builder
      builder.insights(args(argsBuilder).build)

    /**
     * @param intrusionDetection A `intrusionDetection` block as defined below.
     * @return builder
     */
    def intrusionDetection(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionArgs.Builder]):
        com.pulumi.azure.network.inputs.FirewallPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionArgs.builder
      builder.intrusionDetection(args(argsBuilder).build)

    /**
     * @param threatIntelligenceAllowlist A `threatIntelligenceAllowlist` block as defined below.
     * @return builder
     */
    def threatIntelligenceAllowlist(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyThreatIntelligenceAllowlistArgs.Builder]):
        com.pulumi.azure.network.inputs.FirewallPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyThreatIntelligenceAllowlistArgs.builder
      builder.threatIntelligenceAllowlist(args(argsBuilder).build)

    /**
     * @param tlsCertificate A `tlsCertificate` block as defined below.
     * @return builder
     */
    def tlsCertificate(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyTlsCertificateArgs.Builder]):
        com.pulumi.azure.network.inputs.FirewallPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyTlsCertificateArgs.builder
      builder.tlsCertificate(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.FirewallPolicyState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.VpnSiteO365PolicyArgs.Builder)
    /**
     * @param trafficCategory A `trafficCategory` block as defined above.
     * @return builder
     */
    def trafficCategory(args: Endofunction[com.pulumi.azure.network.inputs.VpnSiteO365PolicyTrafficCategoryArgs.Builder]):
        com.pulumi.azure.network.inputs.VpnSiteO365PolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnSiteO365PolicyTrafficCategoryArgs.builder
      builder.trafficCategory(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.ApplicationGatewayUrlPathMapArgs.Builder)
    /**
     * @param pathRules One or more `pathRule` blocks as defined above.
     * @return builder
     */
    def pathRules(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayUrlPathMapPathRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayUrlPathMapArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayUrlPathMapPathRuleArgs.builder
      builder.pathRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationRouteArgs.Builder)
    /**
     * @param propagatedRouteTable A `propagatedRouteTable` block as defined below.
     * @return builder
     */
    def propagatedRouteTable(args: Endofunction[com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs.Builder]):
        com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationRouteArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs.builder
      builder.propagatedRouteTable(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointState.Builder)
    /**
     * @param customHeaders One or more `customHeader` blocks as defined below.
     * @return builder
     */
    def customHeaders(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointCustomHeaderArgs.Builder]*):
        com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointCustomHeaderArgs.builder
      builder.customHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param subnets One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def subnets(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointSubnetArgs.Builder]*):
        com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.RouteMapRuleArgs.Builder)
    /**
     * @param actions An `action` block as defined below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.azure.network.inputs.RouteMapRuleActionArgs.Builder]*):
        com.pulumi.azure.network.inputs.RouteMapRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.RouteMapRuleActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param matchCriterions A `matchCriterion` block as defined below.
     * @return builder
     */
    def matchCriterions(args: Endofunction[com.pulumi.azure.network.inputs.RouteMapRuleMatchCriterionArgs.Builder]*):
        com.pulumi.azure.network.inputs.RouteMapRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.RouteMapRuleMatchCriterionArgs.builder
      builder.matchCriterions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.ExpressRouteConnectionRoutingArgs.Builder)
    /**
     * @param propagatedRouteTable A `propagatedRouteTable` block as defined below.
     * @return builder
     */
    def propagatedRouteTable(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRouteConnectionRoutingPropagatedRouteTableArgs.Builder]):
        com.pulumi.azure.network.inputs.ExpressRouteConnectionRoutingArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRouteConnectionRoutingPropagatedRouteTableArgs.builder
      builder.propagatedRouteTable(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetArgs.Builder)
    /**
     * @param rewriteRules One or more `rewriteRule` blocks as defined below.
     * @return builder
     */
    def rewriteRules(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleArgs.builder
      builder.rewriteRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleState.Builder)
    /**
     * @param destination A `destination` block as defined below.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleDestinationArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param nextHop A `nextHop` block as defined below.
     * @return builder
     */
    def nextHop(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleNextHopArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleNextHopArgs.builder
      builder.nextHop(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.VpnSiteState.Builder)
    /**
     * @param links One or more `link` blocks as defined below.
     * @return builder
     */
    def links(args: Endofunction[com.pulumi.azure.network.inputs.VpnSiteLinkArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnSiteState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnSiteLinkArgs.builder
      builder.links(args.map(_(argsBuilder).build)*)

    /**
     * @param o365Policy An `o365Policy` block as defined below.
     * @return builder
     */
    def o365Policy(args: Endofunction[com.pulumi.azure.network.inputs.VpnSiteO365PolicyArgs.Builder]):
        com.pulumi.azure.network.inputs.VpnSiteState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnSiteO365PolicyArgs.builder
      builder.o365Policy(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.VpnSiteState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionArgs.Builder)
    /**
     * @param rules A `natRule` block as defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationState.Builder)
    /**
     * @param appliesToGroups One or more `appliesToGroup` blocks as defined below.
     * @return builder
     */
    def appliesToGroups(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationAppliesToGroupArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationAppliesToGroupArgs.builder
      builder.appliesToGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param hub A `hub` block as defined below.
     * @return builder
     */
    def hub(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationHubArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationHubArgs.builder
      builder.hub(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.FirewallApplicationRuleCollectionState.Builder)
    /**
     * @param rules One or more `rule` blocks as defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.network.inputs.FirewallApplicationRuleCollectionRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallApplicationRuleCollectionState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallApplicationRuleCollectionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VpnGatewayConnectionRoutingArgs.Builder)
    /**
     * @param propagatedRouteTable A `propagatedRouteTable` block as defined below.
     * @return builder
     */
    def propagatedRouteTable(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayConnectionRoutingPropagatedRouteTableArgs.Builder]):
        com.pulumi.azure.network.inputs.VpnGatewayConnectionRoutingArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayConnectionRoutingPropagatedRouteTableArgs.builder
      builder.propagatedRouteTable(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.FirewallApplicationRuleCollectionRuleArgs.Builder)
    /**
     * @param protocols One or more `protocol` blocks as defined below.
     * @return builder
     */
    def protocols(args: Endofunction[com.pulumi.azure.network.inputs.FirewallApplicationRuleCollectionRuleProtocolArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallApplicationRuleCollectionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallApplicationRuleCollectionRuleProtocolArgs.builder
      builder.protocols(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VpnGatewayConnectionState.Builder)
    /**
     * @param routing A `routing` block as defined below. If this is not specified, there will be a default route table created implicitly.
     * @return builder
     */
    def routing(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayConnectionRoutingArgs.Builder]):
        com.pulumi.azure.network.inputs.VpnGatewayConnectionState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayConnectionRoutingArgs.builder
      builder.routing(args(argsBuilder).build)

    /**
     * @param trafficSelectorPolicies One or more `trafficSelectorPolicy` blocks as defined below.
     * @return builder
     */
    def trafficSelectorPolicies(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayConnectionTrafficSelectorPolicyArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnGatewayConnectionState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayConnectionTrafficSelectorPolicyArgs.builder
      builder.trafficSelectorPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param vpnLinks One or more `vpnLink` blocks as defined below.
     * @return builder
     */
    def vpnLinks(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnGatewayConnectionState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkArgs.builder
      builder.vpnLinks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.SubnetServiceEndpointStoragePolicyState.Builder)
    /**
     * @param definitions A `definition` block as defined below
     * @return builder
     */
    def definitions(args: Endofunction[com.pulumi.azure.network.inputs.SubnetServiceEndpointStoragePolicyDefinitionArgs.Builder]*):
        com.pulumi.azure.network.inputs.SubnetServiceEndpointStoragePolicyState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.SubnetServiceEndpointStoragePolicyDefinitionArgs.builder
      builder.definitions(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.SubnetServiceEndpointStoragePolicyState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.VirtualNetworkGatewayBgpSettingsArgs.Builder)
    /**
     * @param peeringAddresses A list of `peeringAddresses` blocks as defined below. Only one `peeringAddresses` block can be specified except when `activeActive` of this Virtual Network Gateway is `true`.
     * @return builder
     */
    def peeringAddresses(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayBgpSettingsPeeringAddressArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayBgpSettingsArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayBgpSettingsPeeringAddressArgs.builder
      builder.peeringAddresses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder)
    /**
     * @param authenticationCertificates One or more `authenticationCertificate` blocks as defined below.
     * @return builder
     */
    def authenticationCertificates(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayAuthenticationCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayAuthenticationCertificateArgs.builder
      builder.authenticationCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param autoscaleConfiguration An `autoscaleConfiguration` block as defined below.
     * @return builder
     */
    def autoscaleConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayAutoscaleConfigurationArgs.Builder]):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayAutoscaleConfigurationArgs.builder
      builder.autoscaleConfiguration(args(argsBuilder).build)

    /**
     * @param backendAddressPools One or more `backendAddressPool` blocks as defined below.
     * @return builder
     */
    def backendAddressPools(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayBackendAddressPoolArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayBackendAddressPoolArgs.builder
      builder.backendAddressPools(args.map(_(argsBuilder).build)*)

    /**
     * @param backendHttpSettings One or more `backendHttpSettings` blocks as defined below.
     * 
     *  &gt; **Note:** At least one of `backendHttpSettings` or `backend` must be specified.
     * @return builder
     */
    def backendHttpSettings(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingArgs.builder
      builder.backendHttpSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param backends One or more `backend` blocks as defined below.
     * 
     *  &gt; **Note:** At least one of `backendHttpSettings` or `backend` must be specified.
     * @return builder
     */
    def backends(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayBackendArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayBackendArgs.builder
      builder.backends(args.map(_(argsBuilder).build)*)

    /**
     * @param customErrorConfigurations One or more `customErrorConfiguration` blocks as defined below.
     * @return builder
     */
    def customErrorConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayCustomErrorConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayCustomErrorConfigurationArgs.builder
      builder.customErrorConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param frontendIpConfigurations One or more `frontendIpConfiguration` blocks as defined below.
     * @return builder
     */
    def frontendIpConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayFrontendIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayFrontendIpConfigurationArgs.builder
      builder.frontendIpConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param frontendPorts One or more `frontendPort` blocks as defined below.
     * @return builder
     */
    def frontendPorts(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayFrontendPortArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayFrontendPortArgs.builder
      builder.frontendPorts(args.map(_(argsBuilder).build)*)

    /**
     * @param gatewayIpConfigurations One or more `gatewayIpConfiguration` blocks as defined below.
     * @return builder
     */
    def gatewayIpConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayGatewayIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayGatewayIpConfigurationArgs.builder
      builder.gatewayIpConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param global A `global` block as defined below.
     * @return builder
     */
    def global(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayGlobalArgs.Builder]):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayGlobalArgs.builder
      builder.global(args(argsBuilder).build)

    /**
     * @param httpListeners One or more `httpListener` blocks as defined below.
     * 
     *  &gt; **Note:** At least one of `httpListener` or `listener` must be specified.
     * @return builder
     */
    def httpListeners(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayHttpListenerArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayHttpListenerArgs.builder
      builder.httpListeners(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayIdentityArgs.Builder]):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param listeners One or more `listener` blocks as defined below.
     * 
     *  &gt; **Note:** At least one of `httpListener` or `listener` must be specified.
     * @return builder
     */
    def listeners(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayListenerArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayListenerArgs.builder
      builder.listeners(args.map(_(argsBuilder).build)*)

    /**
     * @param privateEndpointConnections A list of `privateEndpointConnection` blocks as defined below.
     * @return builder
     */
    def privateEndpointConnections(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayPrivateEndpointConnectionArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayPrivateEndpointConnectionArgs.builder
      builder.privateEndpointConnections(args.map(_(argsBuilder).build)*)

    /**
     * @param privateLinkConfigurations One or more `privateLinkConfiguration` blocks as defined below.
     * @return builder
     */
    def privateLinkConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayPrivateLinkConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayPrivateLinkConfigurationArgs.builder
      builder.privateLinkConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param probes One or more `probe` blocks as defined below.
     * @return builder
     */
    def probes(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayProbeArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayProbeArgs.builder
      builder.probes(args.map(_(argsBuilder).build)*)

    /**
     * @param redirectConfigurations One or more `redirectConfiguration` blocks as defined below.
     * @return builder
     */
    def redirectConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRedirectConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRedirectConfigurationArgs.builder
      builder.redirectConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param requestRoutingRules One or more `requestRoutingRule` blocks as defined below.
     * 
     *  &gt; **Note:** At least one of `requestRoutingRule` or `routingRule` must be specified.
     * @return builder
     */
    def requestRoutingRules(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRequestRoutingRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRequestRoutingRuleArgs.builder
      builder.requestRoutingRules(args.map(_(argsBuilder).build)*)

    /**
     * @param rewriteRuleSets One or more `rewriteRuleSet` blocks as defined below. Only valid for v2 WAF and Standard SKUs.
     * @return builder
     */
    def rewriteRuleSets(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetArgs.builder
      builder.rewriteRuleSets(args.map(_(argsBuilder).build)*)

    /**
     * @param routingRules One or more `routingRule` blocks as defined below.
     * 
     *  &gt; **Note:** At least one of `requestRoutingRule` or `routingRule` must be specified.
     * @return builder
     */
    def routingRules(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRoutingRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRoutingRuleArgs.builder
      builder.routingRules(args.map(_(argsBuilder).build)*)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewaySkuArgs.Builder]):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewaySkuArgs.builder
      builder.sku(args(argsBuilder).build)

    /**
     * @param sslCertificates One or more `sslCertificate` blocks as defined below.
     * @return builder
     */
    def sslCertificates(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewaySslCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewaySslCertificateArgs.builder
      builder.sslCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param sslPolicy a `sslPolicy` block as defined below.
     * @return builder
     */
    def sslPolicy(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewaySslPolicyArgs.Builder]):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewaySslPolicyArgs.builder
      builder.sslPolicy(args(argsBuilder).build)

    /**
     * @param sslProfiles One or more `sslProfile` blocks as defined below.
     * @return builder
     */
    def sslProfiles(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewaySslProfileArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewaySslProfileArgs.builder
      builder.sslProfiles(args.map(_(argsBuilder).build)*)

    /**
     * @param trustedClientCertificates One or more `trustedClientCertificate` blocks as defined below.
     * @return builder
     */
    def trustedClientCertificates(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayTrustedClientCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayTrustedClientCertificateArgs.builder
      builder.trustedClientCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param trustedRootCertificates One or more `trustedRootCertificate` blocks as defined below.
     * @return builder
     */
    def trustedRootCertificates(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayTrustedRootCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayTrustedRootCertificateArgs.builder
      builder.trustedRootCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param urlPathMaps One or more `urlPathMap` blocks as defined below.
     * @return builder
     */
    def urlPathMaps(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayUrlPathMapArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayUrlPathMapArgs.builder
      builder.urlPathMaps(args.map(_(argsBuilder).build)*)

    /**
     * @param wafConfiguration A `wafConfiguration` block as defined below.
     * @return builder
     */
    def wafConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationArgs.Builder]):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationArgs.builder
      builder.wafConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.ApplicationGatewayHttpListenerArgs.Builder)
    /**
     * @param customErrorConfigurations One or more `customErrorConfiguration` blocks as defined below.
     * @return builder
     */
    def customErrorConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayHttpListenerCustomErrorConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayHttpListenerArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayHttpListenerCustomErrorConfigurationArgs.builder
      builder.customErrorConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationArgs.Builder)
    /**
     * @param route A `route` block as defined below.
     * @return builder
     */
    def route(args: Endofunction[com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationRouteArgs.Builder]):
        com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationRouteArgs.builder
      builder.route(args(argsBuilder).build)

    /**
     * @param vpnClientAddressPool A `vpnClientAddressPool` block as defined below.
     * @return builder
     */
    def vpnClientAddressPool(args: Endofunction[com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationVpnClientAddressPoolArgs.Builder]):
        com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationVpnClientAddressPoolArgs.builder
      builder.vpnClientAddressPool(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.ExpressRouteCircuitState.Builder)
    /**
     * @param sku A `sku` block for the ExpressRoute circuit as documented below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRouteCircuitSkuArgs.Builder]):
        com.pulumi.azure.network.inputs.ExpressRouteCircuitState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRouteCircuitSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.ExpressRouteCircuitState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.VpnServerConfigurationState.Builder)
    def azureActiveDirectoryAuthentications(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnServerConfigurationState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs.builder
      builder.azureActiveDirectoryAuthentications(args.map(_(argsBuilder).build)*)

    def clientRevokedCertificates(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationClientRevokedCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnServerConfigurationState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationClientRevokedCertificateArgs.builder
      builder.clientRevokedCertificates(args.map(_(argsBuilder).build)*)

    def clientRootCertificates(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationClientRootCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnServerConfigurationState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationClientRootCertificateArgs.builder
      builder.clientRootCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param ipsecPolicy A `ipsecPolicy` block as defined below.
     * @return builder
     */
    def ipsecPolicy(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationIpsecPolicyArgs.Builder]):
        com.pulumi.azure.network.inputs.VpnServerConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationIpsecPolicyArgs.builder
      builder.ipsecPolicy(args(argsBuilder).build)

    def radius(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusArgs.Builder]):
        com.pulumi.azure.network.inputs.VpnServerConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusArgs.builder
      builder.radius(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.VpnServerConfigurationState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.ApplicationGatewayProbeArgs.Builder)
    /**
     * @param match A `match` block as defined above.
     * 
     *  &gt; **Note:** `match` cannot be set when `protocol` is set to `Tcp` or `Tls`.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayProbeMatchArgs.Builder]):
        com.pulumi.azure.network.inputs.ApplicationGatewayProbeArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayProbeMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkArgs.Builder)
    /**
     * @param customBgpAddresses One or more `customBgpAddress` blocks as defined below.
     * @return builder
     */
    def customBgpAddresses(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkCustomBgpAddressArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkCustomBgpAddressArgs.builder
      builder.customBgpAddresses(args.map(_(argsBuilder).build)*)

    /**
     * @param ipsecPolicies One or more `ipsecPolicy` blocks as defined above.
     * @return builder
     */
    def ipsecPolicies(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkIpsecPolicyArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkIpsecPolicyArgs.builder
      builder.ipsecPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.RoutingIntentState.Builder)
    /**
     * @param routingPolicies One or more `routingPolicy` blocks as defined below.
     * @return builder
     */
    def routingPolicies(args: Endofunction[com.pulumi.azure.network.inputs.RoutingIntentRoutingPolicyArgs.Builder]*):
        com.pulumi.azure.network.inputs.RoutingIntentState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.RoutingIntentRoutingPolicyArgs.builder
      builder.routingPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.FirewallState.Builder)
    /**
     * @param ipConfigurations An `ipConfiguration` block as documented below.
     * @return builder
     */
    def ipConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.FirewallIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param managementIpConfiguration A `managementIpConfiguration` block as documented below, which allows force-tunnelling of traffic to be performed by the firewall. Adding or removing this block or changing the `subnetId` in an existing block forces a new resource to be created. Changing this forces a new resource to be created.
     * @return builder
     */
    def managementIpConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.FirewallManagementIpConfigurationArgs.Builder]):
        com.pulumi.azure.network.inputs.FirewallState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallManagementIpConfigurationArgs.builder
      builder.managementIpConfiguration(args(argsBuilder).build)

    /**
     * @param virtualHub A `virtualHub` block as documented below.
     * @return builder
     */
    def virtualHub(args: Endofunction[com.pulumi.azure.network.inputs.FirewallVirtualHubArgs.Builder]):
        com.pulumi.azure.network.inputs.FirewallState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallVirtualHubArgs.builder
      builder.virtualHub(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.FirewallState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.SubnetState.Builder)
    /**
     * @param delegations One or more `delegation` blocks as defined below.
     * @return builder
     */
    def delegations(args: Endofunction[com.pulumi.azure.network.inputs.SubnetDelegationArgs.Builder]*):
        com.pulumi.azure.network.inputs.SubnetState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.SubnetDelegationArgs.builder
      builder.delegations(args.map(_(argsBuilder).build)*)

    /**
     * @param ipAddressPool An `ipAddressPool` block as defined below.
     * 
     *  &gt; **Note:** Exactly one of `addressPrefixes` or `ipAddressPool` must be specified.
     * @return builder
     */
    def ipAddressPool(args: Endofunction[com.pulumi.azure.network.inputs.SubnetIpAddressPoolArgs.Builder]):
        com.pulumi.azure.network.inputs.SubnetState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.SubnetIpAddressPoolArgs.builder
      builder.ipAddressPool(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.VnpGatewayNatRuleState.Builder)
    /**
     * @param externalMappings One of more `externalMapping` blocks as defined below.
     * @return builder
     */
    def externalMappings(args: Endofunction[com.pulumi.azure.network.inputs.VnpGatewayNatRuleExternalMappingArgs.Builder]*):
        com.pulumi.azure.network.inputs.VnpGatewayNatRuleState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VnpGatewayNatRuleExternalMappingArgs.builder
      builder.externalMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param internalMappings One of more `internalMapping` blocks as defined below.
     * @return builder
     */
    def internalMappings(args: Endofunction[com.pulumi.azure.network.inputs.VnpGatewayNatRuleInternalMappingArgs.Builder]*):
        com.pulumi.azure.network.inputs.VnpGatewayNatRuleState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VnpGatewayNatRuleInternalMappingArgs.builder
      builder.internalMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VirtualHubState.Builder)
    /**
     * @param routes One or more `route` blocks as defined below.
     * @return builder
     */
    def routes(args: Endofunction[com.pulumi.azure.network.inputs.VirtualHubRouteArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualHubState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualHubRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.VirtualHubState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.VirtualHubConnectionState.Builder)
    /**
     * @param routing A `routing` block as defined below.
     * @return builder
     */
    def routing(args: Endofunction[com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualHubConnectionState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingArgs.builder
      builder.routing(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionState.Builder)
    /**
     * @param customBgpAddresses A `customBgpAddresses` block which is documented below.
     *  The block can only be used on `IPSec` / `activeactive` connections,
     *  For details about see [the relevant section in the Azure documentation](https://docs.microsoft.com/en-us/azure/vpn-gateway/vpn-gateway-howto-aws-bgp).
     * @return builder
     */
    def customBgpAddresses(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionCustomBgpAddressesArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionCustomBgpAddressesArgs.builder
      builder.customBgpAddresses(args(argsBuilder).build)

    /**
     * @param ipsecPolicy A `ipsecPolicy` block which is documented below.
     *  Only a single policy can be defined for a connection. For details on
     *  custom policies refer to [the relevant section in the Azure documentation](https://docs.microsoft.com/azure/vpn-gateway/vpn-gateway-ipsecikepolicy-rm-powershell).
     * @return builder
     */
    def ipsecPolicy(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionIpsecPolicyArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionIpsecPolicyArgs.builder
      builder.ipsecPolicy(args(argsBuilder).build)

    /**
     * @param trafficSelectorPolicy One or more `trafficSelectorPolicy` blocks which are documented below.
     *  A `trafficSelectorPolicy` allows to specify a traffic selector policy proposal to be used in a virtual network gateway connection.
     *  For details about traffic selectors refer to [the relevant section in the Azure documentation](https://docs.microsoft.com/azure/vpn-gateway/vpn-gateway-connect-multiple-policybased-rm-ps).
     * @return builder
     */
    def trafficSelectorPolicy(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionTrafficSelectorPolicyArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionTrafficSelectorPolicyArgs.builder
      builder.trafficSelectorPolicy(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsArgs.Builder)
    /**
     * @param instance0BgpPeeringAddress An `instanceBgpPeeringAddress` block as defined below.
     * @return builder
     */
    def instance0BgpPeeringAddress(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsInstance0BgpPeeringAddressArgs.Builder]):
        com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsInstance0BgpPeeringAddressArgs.builder
      builder.instance0BgpPeeringAddress(args(argsBuilder).build)

    /**
     * @param instance1BgpPeeringAddress An `instanceBgpPeeringAddress` block as defined below.
     * @return builder
     */
    def instance1BgpPeeringAddress(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsInstance1BgpPeeringAddressArgs.Builder]):
        com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsInstance1BgpPeeringAddressArgs.builder
      builder.instance1BgpPeeringAddress(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointArgs.Builder)
    /**
     * @param filter A `filter` block as defined below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointFilterArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.FirewallNatRuleCollectionState.Builder)
    /**
     * @param rules One or more `rule` blocks as defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.network.inputs.FirewallNatRuleCollectionRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallNatRuleCollectionState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallNatRuleCollectionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationArgs.Builder)
    /**
     * @param ipsecPolicy An `ipsecPolicy` block as defined below.
     * @return builder
     */
    def ipsecPolicy(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationIpsecPolicyArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationIpsecPolicyArgs.builder
      builder.ipsecPolicy(args(argsBuilder).build)

    /**
     * @param radiusServers One or more `radiusServer` blocks as defined below.
     * @return builder
     */
    def radiusServers(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationRadiusServerArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationRadiusServerArgs.builder
      builder.radiusServers(args.map(_(argsBuilder).build)*)

    /**
     * @param revokedCertificates One or more `revokedCertificate` blocks which are defined below.
     * @return builder
     */
    def revokedCertificates(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationRevokedCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationRevokedCertificateArgs.builder
      builder.revokedCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param rootCertificates One or more `rootCertificate` blocks which are defined below. These root certificates are used to sign the client certificate used by the VPN clients to connect to the gateway.
     * @return builder
     */
    def rootCertificates(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationRootCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationRootCertificateArgs.builder
      builder.rootCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param virtualNetworkGatewayClientConnections One or more `virtualNetworkGatewayClientConnection` blocks as defined below.
     * @return builder
     */
    def virtualNetworkGatewayClientConnections(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationVirtualNetworkGatewayClientConnectionArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationVirtualNetworkGatewayClientConnectionArgs.builder
      builder.virtualNetworkGatewayClientConnections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.ProfileState.Builder)
    /**
     * @param containerNetworkInterface A `containerNetworkInterface` block as documented below.
     * @return builder
     */
    def containerNetworkInterface(args: Endofunction[com.pulumi.azure.network.inputs.ProfileContainerNetworkInterfaceArgs.Builder]):
        com.pulumi.azure.network.inputs.ProfileState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ProfileContainerNetworkInterfaceArgs.builder
      builder.containerNetworkInterface(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.ProfileState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointState.Builder)
    /**
     * @param customHeaders One or more `customHeader` blocks as defined below.
     * @return builder
     */
    def customHeaders(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointCustomHeaderArgs.Builder]*):
        com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointCustomHeaderArgs.builder
      builder.customHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param subnets One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def subnets(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointSubnetArgs.Builder]*):
        com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.RouteMapRuleActionArgs.Builder)
    /**
     * @param parameters A `parameter` block as defined below. Required if `type` is anything other than `Drop`.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.azure.network.inputs.RouteMapRuleActionParameterArgs.Builder]*):
        com.pulumi.azure.network.inputs.RouteMapRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.RouteMapRuleActionParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationArgs.Builder)
    /**
     * @param disabledRuleGroups One or more `disabledRuleGroup` blocks as defined below.
     * @return builder
     */
    def disabledRuleGroups(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationDisabledRuleGroupArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationDisabledRuleGroupArgs.builder
      builder.disabledRuleGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param exclusions One or more `exclusion` blocks as defined below.
     * @return builder
     */
    def exclusions(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationExclusionArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupState.Builder)
    /**
     * @param applicationRuleCollections One or more `applicationRuleCollection` blocks as defined below.
     * @return builder
     */
    def applicationRuleCollections(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs.builder
      builder.applicationRuleCollections(args.map(_(argsBuilder).build)*)

    /**
     * @param natRuleCollections One or more `natRuleCollection` blocks as defined below.
     * @return builder
     */
    def natRuleCollections(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionArgs.builder
      builder.natRuleCollections(args.map(_(argsBuilder).build)*)

    /**
     * @param networkRuleCollections One or more `networkRuleCollection` blocks as defined below.
     * @return builder
     */
    def networkRuleCollections(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionArgs.builder
      builder.networkRuleCollections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.FirewallPolicyInsightsArgs.Builder)
    /**
     * @param logAnalyticsWorkspaces A list of `logAnalyticsWorkspace` block as defined below.
     * @return builder
     */
    def logAnalyticsWorkspaces(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyInsightsLogAnalyticsWorkspaceArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyInsightsArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyInsightsLogAnalyticsWorkspaceArgs.builder
      builder.logAnalyticsWorkspaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VirtualNetworkState.Builder)
    /**
     * @param ddosProtectionPlan A `ddosProtectionPlan` block as documented below.
     * @return builder
     */
    def ddosProtectionPlan(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkDdosProtectionPlanArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkDdosProtectionPlanArgs.builder
      builder.ddosProtectionPlan(args(argsBuilder).build)

    /**
     * @param encryption A `encryption` block as defined below.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkEncryptionArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param ipAddressPools One or more `ipAddressPool` blocks as defined below. Only one association of each IP type(IPv4 or IPv6) is allowed.
     * 
     *  &gt; **Note:** Exactly one of `addressSpace` or `ipAddressPool` must be specified.
     * @return builder
     */
    def ipAddressPools(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkIpAddressPoolArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkIpAddressPoolArgs.builder
      builder.ipAddressPools(args.map(_(argsBuilder).build)*)

    /**
     * @param subnets Can be specified multiple times to define multiple subnets. Each `subnet` block supports fields documented below.
     * 
     *  &gt; **NOTE** Since `subnet` can be configured both inline and via the separate `azure.network.Subnet` resource, we have to explicitly set it to empty slice (`[]`) to remove it.
     * @return builder
     */
    def subnets(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkSubnetArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.VirtualNetworkState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.VpnGatewayState.Builder)
    /**
     * @param bgpSettings A `bgpSettings` block as defined below.
     * @return builder
     */
    def bgpSettings(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsArgs.Builder]):
        com.pulumi.azure.network.inputs.VpnGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsArgs.builder
      builder.bgpSettings(args(argsBuilder).build)

    /**
     * @param ipConfigurations An `ipConfiguration` block as defined below.
     * @return builder
     */
    def ipConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.network.inputs.VpnGatewayState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.network.inputs.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntentState.Builder)
    /**
     * @param ipTraffic An `ipTraffic` block as defined below. Changing this forces a new Network Manager Verifier Workspace Reachability Analysis Intent to be created.
     * @return builder
     */
    def ipTraffic(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntentIpTrafficArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntentState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntentIpTrafficArgs.builder
      builder.ipTraffic(args(argsBuilder).build)

  /** Manages a VPN Gateway NAT Rule. */
  def VnpGatewayNatRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.network.VnpGatewayNatRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VnpGatewayNatRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.VnpGatewayNatRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object NetworkFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Application Gateway. */
    inline def getApplicationGateway(args: Endofunction[com.pulumi.azure.network.inputs.GetApplicationGatewayArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetApplicationGatewayResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetApplicationGatewayArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getApplicationGateway(args(argsBuilder).build)

    /** Use this data source to access information about an existing Application Gateway. */
    inline def getApplicationGatewayPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetApplicationGatewayPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetApplicationGatewayResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetApplicationGatewayPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getApplicationGatewayPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Application Security Group. */
    inline def getApplicationSecurityGroup(args: Endofunction[com.pulumi.azure.network.inputs.GetApplicationSecurityGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetApplicationSecurityGroupResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetApplicationSecurityGroupArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getApplicationSecurityGroup(args(argsBuilder).build)

    /** Use this data source to access information about an existing Application Security Group. */
    inline def getApplicationSecurityGroupPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetApplicationSecurityGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetApplicationSecurityGroupResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetApplicationSecurityGroupPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getApplicationSecurityGroupPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing ExpressRoute circuit. */
    inline def getExpressRouteCircuit(args: Endofunction[com.pulumi.azure.network.inputs.GetExpressRouteCircuitArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetExpressRouteCircuitResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetExpressRouteCircuitArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getExpressRouteCircuit(args(argsBuilder).build)

    /** Use this data source to access information about an existing ExpressRoute circuit. */
    inline def getExpressRouteCircuitPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetExpressRouteCircuitPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetExpressRouteCircuitResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetExpressRouteCircuitPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getExpressRouteCircuitPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Azure Firewall. */
    inline def getFirewall(args: Endofunction[com.pulumi.azure.network.inputs.GetFirewallArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetFirewallResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetFirewallArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getFirewall(args(argsBuilder).build)

    /** Use this data source to access information about an existing Azure Firewall. */
    inline def getFirewallPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetFirewallPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetFirewallResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetFirewallPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getFirewallPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Firewall Policy. */
    inline def getFirewallPolicy(args: Endofunction[com.pulumi.azure.network.inputs.GetFirewallPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetFirewallPolicyResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetFirewallPolicyArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getFirewallPolicy(args(argsBuilder).build)

    /** Use this data source to access information about an existing Firewall Policy. */
    inline def getFirewallPolicyPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetFirewallPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetFirewallPolicyResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetFirewallPolicyPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getFirewallPolicyPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Virtual Network Gateway Connection. */
    inline def getGatewayConnection(args: Endofunction[com.pulumi.azure.network.inputs.GetGatewayConnectionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetGatewayConnectionResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetGatewayConnectionArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getGatewayConnection(args(argsBuilder).build)

    /** Use this data source to access information about an existing Virtual Network Gateway Connection. */
    inline def getGatewayConnectionPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetGatewayConnectionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetGatewayConnectionResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetGatewayConnectionPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getGatewayConnectionPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing IP Group. */
    inline def getIpGroup(args: Endofunction[com.pulumi.azure.network.inputs.GetIpGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetIpGroupResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetIpGroupArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getIpGroup(args(argsBuilder).build)

    /** Use this data source to access information about an existing IP Group. */
    inline def getIpGroupPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetIpGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetIpGroupResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetIpGroupPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getIpGroupPlain(args(argsBuilder).build)

    /** Use this data source to access information about existing IP Groups. */
    inline def getIpGroups(args: Endofunction[com.pulumi.azure.network.inputs.GetIpGroupsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetIpGroupsResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetIpGroupsArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getIpGroups(args(argsBuilder).build)

    /** Use this data source to access information about existing IP Groups. */
    inline def getIpGroupsPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetIpGroupsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetIpGroupsResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetIpGroupsPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getIpGroupsPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Local Network Gateway. */
    inline def getLocalNetworkGateway(args: Endofunction[com.pulumi.azure.network.inputs.GetLocalNetworkGatewayArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetLocalNetworkGatewayResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetLocalNetworkGatewayArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getLocalNetworkGateway(args(argsBuilder).build)

    /** Use this data source to access information about an existing Local Network Gateway. */
    inline def getLocalNetworkGatewayPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetLocalNetworkGatewayPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetLocalNetworkGatewayResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetLocalNetworkGatewayPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getLocalNetworkGatewayPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing NAT Gateway.
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.Network` - 2025-01-01
     */
    inline def getNatGateway(args: Endofunction[com.pulumi.azure.network.inputs.GetNatGatewayArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNatGatewayResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNatGatewayArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNatGateway(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing NAT Gateway.
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.Network` - 2025-01-01
     */
    inline def getNatGatewayPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNatGatewayPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNatGatewayResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNatGatewayPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNatGatewayPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Azure Network DDoS Protection Plan. */
    inline def getNetworkDdosProtectionPlan(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkDdosProtectionPlanArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNetworkDdosProtectionPlanResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkDdosProtectionPlanArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkDdosProtectionPlan(args(argsBuilder).build)

    /** Use this data source to access information about an existing Azure Network DDoS Protection Plan. */
    inline def getNetworkDdosProtectionPlanPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkDdosProtectionPlanPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNetworkDdosProtectionPlanResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkDdosProtectionPlanPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkDdosProtectionPlanPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Network Interface. */
    inline def getNetworkInterface(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkInterfaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNetworkInterfaceResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkInterfaceArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkInterface(args(argsBuilder).build)

    /** Use this data source to access information about an existing Network Interface. */
    inline def getNetworkInterfacePlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkInterfacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNetworkInterfaceResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkInterfacePlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkInterfacePlain(args(argsBuilder).build)

    /** Use this data source to access information about a Network Manager. */
    inline def getNetworkManager(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkManagerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNetworkManagerResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkManagerArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkManager(args(argsBuilder).build)

    /** Use this data source to access information about a Network Manager. */
    inline def getNetworkManagerPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkManagerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNetworkManagerResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkManagerPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkManagerPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Network Manager Connectivity Configuration. */
    inline def getNetworkManagerConnectivityConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkManagerConnectivityConfigurationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNetworkManagerConnectivityConfigurationResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkManagerConnectivityConfigurationArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkManagerConnectivityConfiguration(args(argsBuilder).build)

    /** Use this data source to access information about an existing Network Manager Connectivity Configuration. */
    inline def getNetworkManagerConnectivityConfigurationPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkManagerConnectivityConfigurationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNetworkManagerConnectivityConfigurationResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkManagerConnectivityConfigurationPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkManagerConnectivityConfigurationPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Network Manager IPAM Pool. */
    inline def getNetworkManagerIpamPool(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkManagerIpamPoolArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNetworkManagerIpamPoolResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkManagerIpamPoolArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkManagerIpamPool(args(argsBuilder).build)

    /** Use this data source to access information about an existing Network Manager IPAM Pool. */
    inline def getNetworkManagerIpamPoolPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkManagerIpamPoolPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNetworkManagerIpamPoolResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkManagerIpamPoolPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkManagerIpamPoolPlain(args(argsBuilder).build)

    /** Use this data source to access information about a Network Manager Network Group. */
    inline def getNetworkManagerNetworkGroup(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkManagerNetworkGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNetworkManagerNetworkGroupResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkManagerNetworkGroupArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkManagerNetworkGroup(args(argsBuilder).build)

    /** Use this data source to access information about a Network Manager Network Group. */
    inline def getNetworkManagerNetworkGroupPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkManagerNetworkGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNetworkManagerNetworkGroupResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkManagerNetworkGroupPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkManagerNetworkGroupPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Network Security Group. */
    inline def getNetworkSecurityGroup(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkSecurityGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNetworkSecurityGroupResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkSecurityGroupArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkSecurityGroup(args(argsBuilder).build)

    /** Use this data source to access information about an existing Network Security Group. */
    inline def getNetworkSecurityGroupPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkSecurityGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNetworkSecurityGroupResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkSecurityGroupPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkSecurityGroupPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Network Security Perimeter. */
    inline def getNetworkSecurityPerimeter(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkSecurityPerimeterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNetworkSecurityPerimeterResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkSecurityPerimeterArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkSecurityPerimeter(args(argsBuilder).build)

    /** Use this data source to access information about an existing Network Security Perimeter. */
    inline def getNetworkSecurityPerimeterPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkSecurityPerimeterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNetworkSecurityPerimeterResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkSecurityPerimeterPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkSecurityPerimeterPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Network Security Perimeter Profile. */
    inline def getNetworkSecurityPerimeterProfile(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkSecurityPerimeterProfileArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNetworkSecurityPerimeterProfileResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkSecurityPerimeterProfileArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkSecurityPerimeterProfile(args(argsBuilder).build)

    /** Use this data source to access information about an existing Network Security Perimeter Profile. */
    inline def getNetworkSecurityPerimeterProfilePlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkSecurityPerimeterProfilePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNetworkSecurityPerimeterProfileResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkSecurityPerimeterProfilePlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkSecurityPerimeterProfilePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Network Watcher. */
    inline def getNetworkWatcher(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkWatcherArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNetworkWatcherResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkWatcherArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkWatcher(args(argsBuilder).build)

    /** Use this data source to access information about an existing Network Watcher. */
    inline def getNetworkWatcherPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkWatcherPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNetworkWatcherResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkWatcherPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkWatcherPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Public IP Address. */
    inline def getPublicIP(args: Endofunction[com.pulumi.azure.network.inputs.GetPublicIPArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetPublicIPResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetPublicIPArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getPublicIP(args(argsBuilder).build)

    /** Use this data source to access information about an existing Public IP Address. */
    inline def getPublicIPPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetPublicIPPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetPublicIPResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetPublicIPPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getPublicIPPlain(args(argsBuilder).build)

    /** Use this data source to access information about a set of existing Public IP Addresses. */
    inline def getPublicIPs(args: Endofunction[com.pulumi.azure.network.inputs.GetPublicIPsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetPublicIPsResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetPublicIPsArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getPublicIPs(args(argsBuilder).build)

    /** Use this data source to access information about a set of existing Public IP Addresses. */
    inline def getPublicIPsPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetPublicIPsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetPublicIPsResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetPublicIPsPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getPublicIPsPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Public IP Prefix. */
    inline def getPublicIpPrefix(args: Endofunction[com.pulumi.azure.network.inputs.GetPublicIpPrefixArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetPublicIpPrefixResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetPublicIpPrefixArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getPublicIpPrefix(args(argsBuilder).build)

    /** Use this data source to access information about an existing Public IP Prefix. */
    inline def getPublicIpPrefixPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetPublicIpPrefixPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetPublicIpPrefixResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetPublicIpPrefixPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getPublicIpPrefixPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Route Filter. */
    inline def getRouteFilter(args: Endofunction[com.pulumi.azure.network.inputs.GetRouteFilterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetRouteFilterResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetRouteFilterArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getRouteFilter(args(argsBuilder).build)

    /** Use this data source to access information about an existing Route Filter. */
    inline def getRouteFilterPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetRouteFilterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetRouteFilterResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetRouteFilterPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getRouteFilterPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Route Table. */
    inline def getRouteTable(args: Endofunction[com.pulumi.azure.network.inputs.GetRouteTableArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetRouteTableResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetRouteTableArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getRouteTable(args(argsBuilder).build)

    /** Use this data source to access information about an existing Route Table. */
    inline def getRouteTablePlain(args: Endofunction[com.pulumi.azure.network.inputs.GetRouteTablePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetRouteTableResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetRouteTablePlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getRouteTablePlain(args(argsBuilder).build)

    /** Use this data source to access information about Service Tags. */
    inline def getServiceTags(args: Endofunction[com.pulumi.azure.network.inputs.GetServiceTagsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetServiceTagsResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetServiceTagsArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getServiceTags(args(argsBuilder).build)

    /** Use this data source to access information about Service Tags. */
    inline def getServiceTagsPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetServiceTagsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetServiceTagsResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetServiceTagsPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getServiceTagsPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Subnet within a Virtual Network. */
    inline def getSubnet(args: Endofunction[com.pulumi.azure.network.inputs.GetSubnetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetSubnetResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetSubnetArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getSubnet(args(argsBuilder).build)

    /** Use this data source to access information about an existing Subnet within a Virtual Network. */
    inline def getSubnetPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetSubnetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetSubnetResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetSubnetPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getSubnetPlain(args(argsBuilder).build)

    /** Use this data source to access the ID of a specified Traffic Manager Geographical Location within the Geographical Hierarchy. */
    inline def getTrafficManager(args: Endofunction[com.pulumi.azure.network.inputs.GetTrafficManagerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetTrafficManagerResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetTrafficManagerArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getTrafficManager(args(argsBuilder).build)

    /** Use this data source to access the ID of a specified Traffic Manager Geographical Location within the Geographical Hierarchy. */
    inline def getTrafficManagerPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetTrafficManagerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetTrafficManagerResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetTrafficManagerPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getTrafficManagerPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Traffic Manager Profile. */
    inline def getTrafficManagerProfile(args: Endofunction[com.pulumi.azure.network.inputs.GetTrafficManagerProfileArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetTrafficManagerProfileResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetTrafficManagerProfileArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getTrafficManagerProfile(args(argsBuilder).build)

    /** Use this data source to access information about an existing Traffic Manager Profile. */
    inline def getTrafficManagerProfilePlain(args: Endofunction[com.pulumi.azure.network.inputs.GetTrafficManagerProfilePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetTrafficManagerProfileResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetTrafficManagerProfilePlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getTrafficManagerProfilePlain(args(argsBuilder).build)

    /**
     * Uses this data source to access information about an existing Virtual Hub.
     * 
     *  ## Virtual Hub Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.azure.network.NetworkFunctions;
     *  import com.pulumi.azure.network.inputs.GetVirtualHubArgs;
     *  import java.util.List;
     *  import java.util.ArrayList;
     *  import java.util.Map;
     *  import java.io.File;
     *  import java.nio.file.Files;
     *  import java.nio.file.Paths;
     * 
     *  public class App {
     *      public static void main(String[] args) {
     *          Pulumi.run(App::stack);
     *      }
     * 
     *      public static void stack(Context ctx) {
     *          final var example = NetworkFunctions.getVirtualHub(GetVirtualHubArgs.builder()
     *              .name("example-hub")
     *              .resourceGroupName("example-resources")
     *              .build());
     * 
     *          ctx.export("virtualHubId", example.id());
     *      }
     *  }
     *  }
     *  </pre>
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.Network` - 2025-01-01
     */
    inline def getVirtualHub(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualHubArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetVirtualHubResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualHubArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualHub(args(argsBuilder).build)

    /**
     * Uses this data source to access information about an existing Virtual Hub.
     * 
     *  ## Virtual Hub Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.azure.network.NetworkFunctions;
     *  import com.pulumi.azure.network.inputs.GetVirtualHubArgs;
     *  import java.util.List;
     *  import java.util.ArrayList;
     *  import java.util.Map;
     *  import java.io.File;
     *  import java.nio.file.Files;
     *  import java.nio.file.Paths;
     * 
     *  public class App {
     *      public static void main(String[] args) {
     *          Pulumi.run(App::stack);
     *      }
     * 
     *      public static void stack(Context ctx) {
     *          final var example = NetworkFunctions.getVirtualHub(GetVirtualHubArgs.builder()
     *              .name("example-hub")
     *              .resourceGroupName("example-resources")
     *              .build());
     * 
     *          ctx.export("virtualHubId", example.id());
     *      }
     *  }
     *  }
     *  </pre>
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.Network` - 2025-01-01
     */
    inline def getVirtualHubPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualHubPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetVirtualHubResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualHubPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualHubPlain(args(argsBuilder).build)

    /**
     * Uses this data source to access information about an existing Virtual Hub Connection.
     * 
     *  ## Virtual Hub Connection Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.azure.network.NetworkFunctions;
     *  import com.pulumi.azure.network.inputs.GetVirtualHubConnectionArgs;
     *  import java.util.List;
     *  import java.util.ArrayList;
     *  import java.util.Map;
     *  import java.io.File;
     *  import java.nio.file.Files;
     *  import java.nio.file.Paths;
     * 
     *  public class App {
     *      public static void main(String[] args) {
     *          Pulumi.run(App::stack);
     *      }
     * 
     *      public static void stack(Context ctx) {
     *          final var example = NetworkFunctions.getVirtualHubConnection(GetVirtualHubConnectionArgs.builder()
     *              .name("example-connection")
     *              .resourceGroupName("example-resources")
     *              .virtualHubName("example-hub-name")
     *              .build());
     * 
     *          ctx.export("virtualHubConnectionId", example.id());
     *      }
     *  }
     *  }
     *  </pre>
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.Network` - 2025-01-01
     */
    inline def getVirtualHubConnection(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualHubConnectionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetVirtualHubConnectionResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualHubConnectionArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualHubConnection(args(argsBuilder).build)

    /**
     * Uses this data source to access information about an existing Virtual Hub Connection.
     * 
     *  ## Virtual Hub Connection Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.azure.network.NetworkFunctions;
     *  import com.pulumi.azure.network.inputs.GetVirtualHubConnectionArgs;
     *  import java.util.List;
     *  import java.util.ArrayList;
     *  import java.util.Map;
     *  import java.io.File;
     *  import java.nio.file.Files;
     *  import java.nio.file.Paths;
     * 
     *  public class App {
     *      public static void main(String[] args) {
     *          Pulumi.run(App::stack);
     *      }
     * 
     *      public static void stack(Context ctx) {
     *          final var example = NetworkFunctions.getVirtualHubConnection(GetVirtualHubConnectionArgs.builder()
     *              .name("example-connection")
     *              .resourceGroupName("example-resources")
     *              .virtualHubName("example-hub-name")
     *              .build());
     * 
     *          ctx.export("virtualHubConnectionId", example.id());
     *      }
     *  }
     *  }
     *  </pre>
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.Network` - 2025-01-01
     */
    inline def getVirtualHubConnectionPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualHubConnectionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetVirtualHubConnectionResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualHubConnectionPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualHubConnectionPlain(args(argsBuilder).build)

    /**
     * Uses this data source to access information about an existing Virtual Hub Route Table.
     * 
     *  ## Virtual Hub Route Table Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.azure.network.NetworkFunctions;
     *  import com.pulumi.azure.network.inputs.GetVirtualHubRouteTableArgs;
     *  import java.util.List;
     *  import java.util.ArrayList;
     *  import java.util.Map;
     *  import java.io.File;
     *  import java.nio.file.Files;
     *  import java.nio.file.Paths;
     * 
     *  public class App {
     *      public static void main(String[] args) {
     *          Pulumi.run(App::stack);
     *      }
     * 
     *      public static void stack(Context ctx) {
     *          final var example = NetworkFunctions.getVirtualHubRouteTable(GetVirtualHubRouteTableArgs.builder()
     *              .name("example-hub-route-table")
     *              .resourceGroupName("example-resources")
     *              .virtualHubName("example-hub-name")
     *              .build());
     * 
     *          ctx.export("virtualHubRouteTableId", example.id());
     *      }
     *  }
     *  }
     *  </pre>
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.Network` - 2025-01-01
     */
    inline def getVirtualHubRouteTable(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualHubRouteTableArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetVirtualHubRouteTableResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualHubRouteTableArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualHubRouteTable(args(argsBuilder).build)

    /**
     * Uses this data source to access information about an existing Virtual Hub Route Table.
     * 
     *  ## Virtual Hub Route Table Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.azure.network.NetworkFunctions;
     *  import com.pulumi.azure.network.inputs.GetVirtualHubRouteTableArgs;
     *  import java.util.List;
     *  import java.util.ArrayList;
     *  import java.util.Map;
     *  import java.io.File;
     *  import java.nio.file.Files;
     *  import java.nio.file.Paths;
     * 
     *  public class App {
     *      public static void main(String[] args) {
     *          Pulumi.run(App::stack);
     *      }
     * 
     *      public static void stack(Context ctx) {
     *          final var example = NetworkFunctions.getVirtualHubRouteTable(GetVirtualHubRouteTableArgs.builder()
     *              .name("example-hub-route-table")
     *              .resourceGroupName("example-resources")
     *              .virtualHubName("example-hub-name")
     *              .build());
     * 
     *          ctx.export("virtualHubRouteTableId", example.id());
     *      }
     *  }
     *  }
     *  </pre>
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.Network` - 2025-01-01
     */
    inline def getVirtualHubRouteTablePlain(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualHubRouteTablePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetVirtualHubRouteTableResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualHubRouteTablePlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualHubRouteTablePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Virtual Network. */
    inline def getVirtualNetwork(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualNetworkArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetVirtualNetworkResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualNetworkArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualNetwork(args(argsBuilder).build)

    /** Use this data source to access information about an existing Virtual Network. */
    inline def getVirtualNetworkPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualNetworkPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetVirtualNetworkResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualNetworkPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualNetworkPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Virtual Network Gateway. */
    inline def getVirtualNetworkGateway(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualNetworkGatewayArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetVirtualNetworkGatewayResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualNetworkGatewayArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualNetworkGateway(args(argsBuilder).build)

    /** Use this data source to access information about an existing Virtual Network Gateway. */
    inline def getVirtualNetworkGatewayPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualNetworkGatewayPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetVirtualNetworkGatewayResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualNetworkGatewayPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualNetworkGatewayPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing virtual network peering. */
    inline def getVirtualNetworkPeering(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualNetworkPeeringArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetVirtualNetworkPeeringResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualNetworkPeeringArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualNetworkPeering(args(argsBuilder).build)

    /** Use this data source to access information about an existing virtual network peering. */
    inline def getVirtualNetworkPeeringPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualNetworkPeeringPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetVirtualNetworkPeeringResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualNetworkPeeringPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualNetworkPeeringPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Virtual Wan. */
    inline def getVirtualWan(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualWanArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetVirtualWanResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualWanArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualWan(args(argsBuilder).build)

    /** Use this data source to access information about an existing Virtual Wan. */
    inline def getVirtualWanPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualWanPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetVirtualWanResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualWanPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualWanPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing VPN Gateway within a Virtual Hub. */
    inline def getVpnGateway(args: Endofunction[com.pulumi.azure.network.inputs.GetVpnGatewayArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetVpnGatewayResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVpnGatewayArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVpnGateway(args(argsBuilder).build)

    /** Use this data source to access information about an existing VPN Gateway within a Virtual Hub. */
    inline def getVpnGatewayPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetVpnGatewayPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetVpnGatewayResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVpnGatewayPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVpnGatewayPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing VPN Server Configuration. */
    inline def getVpnServerConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.GetVpnServerConfigurationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetVpnServerConfigurationResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVpnServerConfigurationArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVpnServerConfiguration(args(argsBuilder).build)

    /** Use this data source to access information about an existing VPN Server Configuration. */
    inline def getVpnServerConfigurationPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetVpnServerConfigurationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetVpnServerConfigurationResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVpnServerConfigurationPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVpnServerConfigurationPlain(args(argsBuilder).build)
