package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object network:
  /**
   * Manages an Application Gateway.
   * 
   * &gt; **Note:** The `backendAddressPool`, `backendHttpSettings`, `httpListener`, `privateLinkConfiguration`, `requestRoutingRule`, `redirectConfiguration`, `probe`, `sslCertificate`,
   * and `frontendPort` properties are Sets as the service API returns these lists of objects in a different order from how the provider sends them. As Sets are stored using a hash, if one
   * value is added or removed from the Set, Terraform considers the entire list of objects changed and the plan shows that it is removing every value in the list and re-adding it with the
   * new information. Though Terraform is showing all the values being removed and re-added, we are not actually removing anything unless the user specifies a removal in the configfile.
   */
  def ApplicationGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.ApplicationGatewayArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.ApplicationGatewayArgs.builder
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
    com.pulumi.azure.network.ApplicationGateway(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Application Security Group. */
  def ApplicationSecurityGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.ApplicationSecurityGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.ApplicationSecurityGroupArgs.builder
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
    com.pulumi.azure.network.ApplicationSecurityGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Bgp Connection for a Virtual Hub. */
  def BgpConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.BgpConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.BgpConnectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.BgpConnection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AzureNetwork DDoS Protection Plan.
   * 
   * &gt; **Note:** Azure only allows `one` DDoS Protection Plan per region.
   * 
   * &gt; **Note:** The DDoS Protection Plan is a [high-cost service](https://azure.microsoft.com/en-us/pricing/details/ddos-protection/#pricing). Please keep this in mind while testing and learning.
   */
  def DdosProtectionPlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.DdosProtectionPlanArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.DdosProtectionPlanArgs.builder
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
    com.pulumi.azure.network.DdosProtectionPlan(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an ExpressRoute circuit. */
  def ExpressRouteCircuit(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.ExpressRouteCircuitArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.ExpressRouteCircuitArgs.builder
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
    com.pulumi.azure.network.ExpressRouteCircuit(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an ExpressRoute Circuit Authorization. */
  def ExpressRouteCircuitAuthorization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.ExpressRouteCircuitAuthorizationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.ExpressRouteCircuitAuthorizationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.ExpressRouteCircuitAuthorization(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Express Route Circuit Connection. */
  def ExpressRouteCircuitConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.ExpressRouteCircuitConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.ExpressRouteCircuitConnectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.ExpressRouteCircuitConnection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an ExpressRoute Circuit Peering. */
  def ExpressRouteCircuitPeering(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.ExpressRouteCircuitPeeringArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.network.ExpressRouteCircuitPeeringArgs.builder
    com.pulumi.azure.network.ExpressRouteCircuitPeering(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Express Route Connection.
   * 
   * &gt; **Note:** The provider status of the Express Route Circuit must be set as provisioned while creating the Express Route Connection. See more details [here](https://docs.microsoft.com/azure/expressroute/expressroute-howto-circuit-portal-resource-manager#send-the-service-key-to-your-connectivity-provider-for-provisioning).
   */
  def ExpressRouteConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.ExpressRouteConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.ExpressRouteConnectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.ExpressRouteConnection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an ExpressRoute gateway. */
  def ExpressRouteGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.ExpressRouteGatewayArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.ExpressRouteGatewayArgs.builder
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
    com.pulumi.azure.network.ExpressRouteGateway(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Express Route Port. */
  def ExpressRoutePort(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.ExpressRoutePortArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.ExpressRoutePortArgs.builder
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
    com.pulumi.azure.network.ExpressRoutePort(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an ExpressRoute Port Authorization. */
  def ExpressRoutePortAuthorization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.ExpressRoutePortAuthorizationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.ExpressRoutePortAuthorizationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.ExpressRoutePortAuthorization(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Firewall. */
  def Firewall(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.FirewallArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.FirewallArgs.builder
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
    com.pulumi.azure.network.Firewall(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Application Rule Collection within an Azure Firewall. */
  def FirewallApplicationRuleCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.FirewallApplicationRuleCollectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.FirewallApplicationRuleCollectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.FirewallApplicationRuleCollection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a NAT Rule Collection within an Azure Firewall. */
  def FirewallNatRuleCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.FirewallNatRuleCollectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.FirewallNatRuleCollectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.FirewallNatRuleCollection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Rule Collection within an Azure Firewall. */
  def FirewallNetworkRuleCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.FirewallNetworkRuleCollectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.FirewallNetworkRuleCollectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.FirewallNetworkRuleCollection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Firewall Policy. */
  def FirewallPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.FirewallPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.FirewallPolicyArgs.builder
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
    com.pulumi.azure.network.FirewallPolicy(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Firewall Policy Rule Collection Group. */
  def FirewallPolicyRuleCollectionGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.FirewallPolicyRuleCollectionGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.FirewallPolicyRuleCollectionGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.FirewallPolicyRuleCollectionGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an IP group that contains a list of CIDRs and/or IP addresses. */
  def IPGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.IPGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.IPGroupArgs.builder
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
    com.pulumi.azure.network.IPGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages IP Group CIDR records.
   * 
   * &gt; **Note:** Warning Do not use this resource at the same time as the `cidrs` property of the
   * `azure.network.IPGroup` resource for the same IP Group. Doing so will cause a conflict and
   * CIDRS will be removed.
   */
  def IPGroupCIDR(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.IPGroupCIDRArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.network.IPGroupCIDRArgs.builder
    com.pulumi.azure.network.IPGroupCIDR(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a local network gateway connection over which specific connections can be configured. */
  def LocalNetworkGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.LocalNetworkGatewayArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.LocalNetworkGatewayArgs.builder
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
    com.pulumi.azure.network.LocalNetworkGateway(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure NAT Gateway. */
  def NatGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NatGatewayArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NatGatewayArgs.builder
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
    com.pulumi.azure.network.NatGateway(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a NAT Gateway Public IP Address association. */
  def NatGatewayPublicIpAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NatGatewayPublicIpAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.network.NatGatewayPublicIpAssociationArgs.builder
    com.pulumi.azure.network.NatGatewayPublicIpAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a NAT Gateway Public IP Prefix association. */
  def NatGatewayPublicIpPrefixAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NatGatewayPublicIpPrefixAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.network.NatGatewayPublicIpPrefixAssociationArgs.builder
    com.pulumi.azure.network.NatGatewayPublicIpPrefixAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Network Connection Monitor.
   * 
   * &gt; **NOTE:** Any Network Connection Monitor resource created with API versions 2019-06-01 or earlier (v1) are now incompatible with this provider, which now only supports v2.
   */
  def NetworkConnectionMonitor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkConnectionMonitorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkConnectionMonitorArgs.builder
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
    com.pulumi.azure.network.NetworkConnectionMonitor(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object NetworkFunctions:
    /** Use this data source to access information about an existing Application Gateway. */
    inline def getApplicationGateway(args: Endofunction[com.pulumi.azure.network.inputs.GetApplicationGatewayArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetApplicationGatewayResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetApplicationGatewayArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getApplicationGateway(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Application Gateway. */
    inline def getApplicationGatewayPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetApplicationGatewayPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetApplicationGatewayResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetApplicationGatewayPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getApplicationGatewayPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Application Security Group. */
    inline def getApplicationSecurityGroup(args: Endofunction[com.pulumi.azure.network.inputs.GetApplicationSecurityGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetApplicationSecurityGroupResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetApplicationSecurityGroupArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getApplicationSecurityGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Application Security Group. */
    inline def getApplicationSecurityGroupPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetApplicationSecurityGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetApplicationSecurityGroupResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetApplicationSecurityGroupPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getApplicationSecurityGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing ExpressRoute circuit. */
    inline def getExpressRouteCircuit(args: Endofunction[com.pulumi.azure.network.inputs.GetExpressRouteCircuitArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetExpressRouteCircuitResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetExpressRouteCircuitArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getExpressRouteCircuit(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing ExpressRoute circuit. */
    inline def getExpressRouteCircuitPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetExpressRouteCircuitPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetExpressRouteCircuitResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetExpressRouteCircuitPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getExpressRouteCircuitPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Azure Firewall. */
    inline def getFirewall(args: Endofunction[com.pulumi.azure.network.inputs.GetFirewallArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetFirewallResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetFirewallArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getFirewall(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Azure Firewall. */
    inline def getFirewallPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetFirewallPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetFirewallResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetFirewallPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getFirewallPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Firewall Policy. */
    inline def getFirewallPolicy(args: Endofunction[com.pulumi.azure.network.inputs.GetFirewallPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetFirewallPolicyResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetFirewallPolicyArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getFirewallPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Firewall Policy. */
    inline def getFirewallPolicyPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetFirewallPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetFirewallPolicyResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetFirewallPolicyPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getFirewallPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Virtual Network Gateway Connection. */
    inline def getGatewayConnection(args: Endofunction[com.pulumi.azure.network.inputs.GetGatewayConnectionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetGatewayConnectionResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetGatewayConnectionArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getGatewayConnection(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Virtual Network Gateway Connection. */
    inline def getGatewayConnectionPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetGatewayConnectionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetGatewayConnectionResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetGatewayConnectionPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getGatewayConnectionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing IP Group. */
    inline def getIpGroup(args: Endofunction[com.pulumi.azure.network.inputs.GetIpGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetIpGroupResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetIpGroupArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getIpGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing IP Group. */
    inline def getIpGroupPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetIpGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetIpGroupResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetIpGroupPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getIpGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about existing IP Groups. */
    inline def getIpGroups(args: Endofunction[com.pulumi.azure.network.inputs.GetIpGroupsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetIpGroupsResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetIpGroupsArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getIpGroups(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about existing IP Groups. */
    inline def getIpGroupsPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetIpGroupsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetIpGroupsResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetIpGroupsPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getIpGroupsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Local Network Gateway. */
    inline def getLocalNetworkGateway(args: Endofunction[com.pulumi.azure.network.inputs.GetLocalNetworkGatewayArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetLocalNetworkGatewayResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetLocalNetworkGatewayArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getLocalNetworkGateway(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Local Network Gateway. */
    inline def getLocalNetworkGatewayPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetLocalNetworkGatewayPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetLocalNetworkGatewayResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetLocalNetworkGatewayPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getLocalNetworkGatewayPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to access information about an existing NAT Gateway.
     * 
     * ## API Providers
     * 
     * &lt;!-- This section is generated, changes will be overwritten --&gt;
     * This data source uses the following Azure API Providers:
     * 
     * * `Microsoft.Network` - 2025-01-01
     */
    inline def getNatGateway(args: Endofunction[com.pulumi.azure.network.inputs.GetNatGatewayArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNatGatewayResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNatGatewayArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNatGateway(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to access information about an existing NAT Gateway.
     * 
     * ## API Providers
     * 
     * &lt;!-- This section is generated, changes will be overwritten --&gt;
     * This data source uses the following Azure API Providers:
     * 
     * * `Microsoft.Network` - 2025-01-01
     */
    inline def getNatGatewayPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNatGatewayPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNatGatewayResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNatGatewayPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNatGatewayPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Azure Network DDoS Protection Plan. */
    inline def getNetworkDdosProtectionPlan(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkDdosProtectionPlanArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNetworkDdosProtectionPlanResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkDdosProtectionPlanArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkDdosProtectionPlan(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Azure Network DDoS Protection Plan. */
    inline def getNetworkDdosProtectionPlanPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkDdosProtectionPlanPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNetworkDdosProtectionPlanResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkDdosProtectionPlanPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkDdosProtectionPlanPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Network Interface. */
    inline def getNetworkInterface(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkInterfaceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNetworkInterfaceResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkInterfaceArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkInterface(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Network Interface. */
    inline def getNetworkInterfacePlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkInterfacePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNetworkInterfaceResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkInterfacePlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkInterfacePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about a Network Manager. */
    inline def getNetworkManager(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkManagerArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNetworkManagerResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkManagerArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkManager(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about a Network Manager. */
    inline def getNetworkManagerPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkManagerPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNetworkManagerResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkManagerPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkManagerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Network Manager Connectivity Configuration. */
    inline def getNetworkManagerConnectivityConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkManagerConnectivityConfigurationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNetworkManagerConnectivityConfigurationResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkManagerConnectivityConfigurationArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkManagerConnectivityConfiguration(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Network Manager Connectivity Configuration. */
    inline def getNetworkManagerConnectivityConfigurationPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkManagerConnectivityConfigurationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNetworkManagerConnectivityConfigurationResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkManagerConnectivityConfigurationPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkManagerConnectivityConfigurationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Network Manager IPAM Pool. */
    inline def getNetworkManagerIpamPool(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkManagerIpamPoolArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNetworkManagerIpamPoolResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkManagerIpamPoolArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkManagerIpamPool(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Network Manager IPAM Pool. */
    inline def getNetworkManagerIpamPoolPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkManagerIpamPoolPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNetworkManagerIpamPoolResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkManagerIpamPoolPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkManagerIpamPoolPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about a Network Manager Network Group. */
    inline def getNetworkManagerNetworkGroup(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkManagerNetworkGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNetworkManagerNetworkGroupResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkManagerNetworkGroupArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkManagerNetworkGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about a Network Manager Network Group. */
    inline def getNetworkManagerNetworkGroupPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkManagerNetworkGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNetworkManagerNetworkGroupResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkManagerNetworkGroupPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkManagerNetworkGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Network Security Group. */
    inline def getNetworkSecurityGroup(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkSecurityGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNetworkSecurityGroupResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkSecurityGroupArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkSecurityGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Network Security Group. */
    inline def getNetworkSecurityGroupPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkSecurityGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNetworkSecurityGroupResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkSecurityGroupPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkSecurityGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Network Security Perimeter. */
    inline def getNetworkSecurityPerimeter(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkSecurityPerimeterArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNetworkSecurityPerimeterResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkSecurityPerimeterArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkSecurityPerimeter(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Network Security Perimeter. */
    inline def getNetworkSecurityPerimeterPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkSecurityPerimeterPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNetworkSecurityPerimeterResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkSecurityPerimeterPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkSecurityPerimeterPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Network Security Perimeter Profile. */
    inline def getNetworkSecurityPerimeterProfile(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkSecurityPerimeterProfileArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNetworkSecurityPerimeterProfileResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkSecurityPerimeterProfileArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkSecurityPerimeterProfile(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Network Security Perimeter Profile. */
    inline def getNetworkSecurityPerimeterProfilePlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkSecurityPerimeterProfilePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNetworkSecurityPerimeterProfileResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkSecurityPerimeterProfilePlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkSecurityPerimeterProfilePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Network Watcher. */
    inline def getNetworkWatcher(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkWatcherArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetNetworkWatcherResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkWatcherArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkWatcher(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Network Watcher. */
    inline def getNetworkWatcherPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetNetworkWatcherPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetNetworkWatcherResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetNetworkWatcherPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getNetworkWatcherPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Public IP Address. */
    inline def getPublicIP(args: Endofunction[com.pulumi.azure.network.inputs.GetPublicIPArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetPublicIPResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetPublicIPArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getPublicIP(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Public IP Address. */
    inline def getPublicIPPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetPublicIPPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetPublicIPResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetPublicIPPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getPublicIPPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about a set of existing Public IP Addresses. */
    inline def getPublicIPs(args: Endofunction[com.pulumi.azure.network.inputs.GetPublicIPsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetPublicIPsResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetPublicIPsArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getPublicIPs(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about a set of existing Public IP Addresses. */
    inline def getPublicIPsPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetPublicIPsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetPublicIPsResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetPublicIPsPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getPublicIPsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Public IP Prefix. */
    inline def getPublicIpPrefix(args: Endofunction[com.pulumi.azure.network.inputs.GetPublicIpPrefixArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetPublicIpPrefixResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetPublicIpPrefixArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getPublicIpPrefix(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Public IP Prefix. */
    inline def getPublicIpPrefixPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetPublicIpPrefixPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetPublicIpPrefixResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetPublicIpPrefixPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getPublicIpPrefixPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Route Filter. */
    inline def getRouteFilter(args: Endofunction[com.pulumi.azure.network.inputs.GetRouteFilterArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetRouteFilterResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetRouteFilterArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getRouteFilter(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Route Filter. */
    inline def getRouteFilterPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetRouteFilterPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetRouteFilterResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetRouteFilterPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getRouteFilterPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Route Table. */
    inline def getRouteTable(args: Endofunction[com.pulumi.azure.network.inputs.GetRouteTableArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetRouteTableResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetRouteTableArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getRouteTable(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Route Table. */
    inline def getRouteTablePlain(args: Endofunction[com.pulumi.azure.network.inputs.GetRouteTablePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetRouteTableResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetRouteTablePlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getRouteTablePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about Service Tags. */
    inline def getServiceTags(args: Endofunction[com.pulumi.azure.network.inputs.GetServiceTagsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetServiceTagsResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetServiceTagsArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getServiceTags(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about Service Tags. */
    inline def getServiceTagsPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetServiceTagsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetServiceTagsResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetServiceTagsPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getServiceTagsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Subnet within a Virtual Network. */
    inline def getSubnet(args: Endofunction[com.pulumi.azure.network.inputs.GetSubnetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetSubnetResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetSubnetArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getSubnet(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Subnet within a Virtual Network. */
    inline def getSubnetPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetSubnetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetSubnetResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetSubnetPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getSubnetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access the ID of a specified Traffic Manager Geographical Location within the Geographical Hierarchy. */
    inline def getTrafficManager(args: Endofunction[com.pulumi.azure.network.inputs.GetTrafficManagerArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetTrafficManagerResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetTrafficManagerArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getTrafficManager(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access the ID of a specified Traffic Manager Geographical Location within the Geographical Hierarchy. */
    inline def getTrafficManagerPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetTrafficManagerPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetTrafficManagerResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetTrafficManagerPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getTrafficManagerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Traffic Manager Profile. */
    inline def getTrafficManagerProfile(args: Endofunction[com.pulumi.azure.network.inputs.GetTrafficManagerProfileArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetTrafficManagerProfileResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetTrafficManagerProfileArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getTrafficManagerProfile(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Traffic Manager Profile. */
    inline def getTrafficManagerProfilePlain(args: Endofunction[com.pulumi.azure.network.inputs.GetTrafficManagerProfilePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetTrafficManagerProfileResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetTrafficManagerProfilePlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getTrafficManagerProfilePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Uses this data source to access information about an existing Virtual Hub.
     * 
     * ## Virtual Hub Usage
     * 
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.network.NetworkFunctions;
     * import com.pulumi.azure.network.inputs.GetVirtualHubArgs;
     * import java.util.ArrayList;
     * import java.util.Arrays;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = NetworkFunctions.getVirtualHub(GetVirtualHubArgs.builder()
     *             .name("example-hub")
     *             .resourceGroupName("example-resources")
     *             .build());
     * 
     *         ctx.export("virtualHubId", example.id());
     *     }
     * }
     * }
     * </pre>
     * 
     * ## API Providers
     * 
     * &lt;!-- This section is generated, changes will be overwritten --&gt;
     * This data source uses the following Azure API Providers:
     * 
     * * `Microsoft.Network` - 2025-01-01
     */
    inline def getVirtualHub(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualHubArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetVirtualHubResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualHubArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualHub(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Uses this data source to access information about an existing Virtual Hub.
     * 
     * ## Virtual Hub Usage
     * 
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.network.NetworkFunctions;
     * import com.pulumi.azure.network.inputs.GetVirtualHubArgs;
     * import java.util.ArrayList;
     * import java.util.Arrays;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = NetworkFunctions.getVirtualHub(GetVirtualHubArgs.builder()
     *             .name("example-hub")
     *             .resourceGroupName("example-resources")
     *             .build());
     * 
     *         ctx.export("virtualHubId", example.id());
     *     }
     * }
     * }
     * </pre>
     * 
     * ## API Providers
     * 
     * &lt;!-- This section is generated, changes will be overwritten --&gt;
     * This data source uses the following Azure API Providers:
     * 
     * * `Microsoft.Network` - 2025-01-01
     */
    inline def getVirtualHubPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualHubPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetVirtualHubResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualHubPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualHubPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Uses this data source to access information about an existing Virtual Hub Connection.
     * 
     * ## Virtual Hub Connection Usage
     * 
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.network.NetworkFunctions;
     * import com.pulumi.azure.network.inputs.GetVirtualHubConnectionArgs;
     * import java.util.ArrayList;
     * import java.util.Arrays;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = NetworkFunctions.getVirtualHubConnection(GetVirtualHubConnectionArgs.builder()
     *             .name("example-connection")
     *             .resourceGroupName("example-resources")
     *             .virtualHubName("example-hub-name")
     *             .build());
     * 
     *         ctx.export("virtualHubConnectionId", example.id());
     *     }
     * }
     * }
     * </pre>
     * 
     * ## API Providers
     * 
     * &lt;!-- This section is generated, changes will be overwritten --&gt;
     * This data source uses the following Azure API Providers:
     * 
     * * `Microsoft.Network` - 2025-01-01
     */
    inline def getVirtualHubConnection(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualHubConnectionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetVirtualHubConnectionResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualHubConnectionArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualHubConnection(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Uses this data source to access information about an existing Virtual Hub Connection.
     * 
     * ## Virtual Hub Connection Usage
     * 
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.network.NetworkFunctions;
     * import com.pulumi.azure.network.inputs.GetVirtualHubConnectionArgs;
     * import java.util.ArrayList;
     * import java.util.Arrays;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = NetworkFunctions.getVirtualHubConnection(GetVirtualHubConnectionArgs.builder()
     *             .name("example-connection")
     *             .resourceGroupName("example-resources")
     *             .virtualHubName("example-hub-name")
     *             .build());
     * 
     *         ctx.export("virtualHubConnectionId", example.id());
     *     }
     * }
     * }
     * </pre>
     * 
     * ## API Providers
     * 
     * &lt;!-- This section is generated, changes will be overwritten --&gt;
     * This data source uses the following Azure API Providers:
     * 
     * * `Microsoft.Network` - 2025-01-01
     */
    inline def getVirtualHubConnectionPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualHubConnectionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetVirtualHubConnectionResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualHubConnectionPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualHubConnectionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Uses this data source to access information about an existing Virtual Hub Route Table.
     * 
     * ## Virtual Hub Route Table Usage
     * 
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.network.NetworkFunctions;
     * import com.pulumi.azure.network.inputs.GetVirtualHubRouteTableArgs;
     * import java.util.ArrayList;
     * import java.util.Arrays;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = NetworkFunctions.getVirtualHubRouteTable(GetVirtualHubRouteTableArgs.builder()
     *             .name("example-hub-route-table")
     *             .resourceGroupName("example-resources")
     *             .virtualHubName("example-hub-name")
     *             .build());
     * 
     *         ctx.export("virtualHubRouteTableId", example.id());
     *     }
     * }
     * }
     * </pre>
     * 
     * ## API Providers
     * 
     * &lt;!-- This section is generated, changes will be overwritten --&gt;
     * This data source uses the following Azure API Providers:
     * 
     * * `Microsoft.Network` - 2025-01-01
     */
    inline def getVirtualHubRouteTable(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualHubRouteTableArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetVirtualHubRouteTableResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualHubRouteTableArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualHubRouteTable(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Uses this data source to access information about an existing Virtual Hub Route Table.
     * 
     * ## Virtual Hub Route Table Usage
     * 
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.network.NetworkFunctions;
     * import com.pulumi.azure.network.inputs.GetVirtualHubRouteTableArgs;
     * import java.util.ArrayList;
     * import java.util.Arrays;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = NetworkFunctions.getVirtualHubRouteTable(GetVirtualHubRouteTableArgs.builder()
     *             .name("example-hub-route-table")
     *             .resourceGroupName("example-resources")
     *             .virtualHubName("example-hub-name")
     *             .build());
     * 
     *         ctx.export("virtualHubRouteTableId", example.id());
     *     }
     * }
     * }
     * </pre>
     * 
     * ## API Providers
     * 
     * &lt;!-- This section is generated, changes will be overwritten --&gt;
     * This data source uses the following Azure API Providers:
     * 
     * * `Microsoft.Network` - 2025-01-01
     */
    inline def getVirtualHubRouteTablePlain(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualHubRouteTablePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetVirtualHubRouteTableResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualHubRouteTablePlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualHubRouteTablePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Virtual Network. */
    inline def getVirtualNetwork(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualNetworkArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetVirtualNetworkResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualNetworkArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualNetwork(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Virtual Network. */
    inline def getVirtualNetworkPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualNetworkPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetVirtualNetworkResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualNetworkPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualNetworkPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Virtual Network Gateway. */
    inline def getVirtualNetworkGateway(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualNetworkGatewayArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetVirtualNetworkGatewayResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualNetworkGatewayArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualNetworkGateway(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Virtual Network Gateway. */
    inline def getVirtualNetworkGatewayPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualNetworkGatewayPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetVirtualNetworkGatewayResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualNetworkGatewayPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualNetworkGatewayPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing virtual network peering. */
    inline def getVirtualNetworkPeering(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualNetworkPeeringArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetVirtualNetworkPeeringResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualNetworkPeeringArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualNetworkPeering(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing virtual network peering. */
    inline def getVirtualNetworkPeeringPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualNetworkPeeringPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetVirtualNetworkPeeringResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualNetworkPeeringPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualNetworkPeeringPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Virtual Wan. */
    inline def getVirtualWan(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualWanArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetVirtualWanResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualWanArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualWan(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Virtual Wan. */
    inline def getVirtualWanPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetVirtualWanPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetVirtualWanResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVirtualWanPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVirtualWanPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing VPN Gateway within a Virtual Hub. */
    inline def getVpnGateway(args: Endofunction[com.pulumi.azure.network.inputs.GetVpnGatewayArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetVpnGatewayResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVpnGatewayArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVpnGateway(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing VPN Gateway within a Virtual Hub. */
    inline def getVpnGatewayPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetVpnGatewayPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetVpnGatewayResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVpnGatewayPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVpnGatewayPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing VPN Server Configuration. */
    inline def getVpnServerConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.GetVpnServerConfigurationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.network.outputs.GetVpnServerConfigurationResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVpnServerConfigurationArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVpnServerConfiguration(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing VPN Server Configuration. */
    inline def getVpnServerConfigurationPlain(args: Endofunction[com.pulumi.azure.network.inputs.GetVpnServerConfigurationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.network.outputs.GetVpnServerConfigurationResult] =
      val argsBuilder = com.pulumi.azure.network.inputs.GetVpnServerConfigurationPlainArgs.builder
      com.pulumi.azure.network.NetworkFunctions.getVpnServerConfigurationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages a Network Interface. */
  def NetworkInterface(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkInterfaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkInterfaceArgs.builder
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
    com.pulumi.azure.network.NetworkInterface(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages the association between a Network Interface and a Application Gateway&#39;s Backend Address Pool. */
  def NetworkInterfaceApplicationGatewayBackendAddressPoolAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkInterfaceApplicationGatewayBackendAddressPoolAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.network.NetworkInterfaceApplicationGatewayBackendAddressPoolAssociationArgs.builder
    com.pulumi.azure.network.NetworkInterfaceApplicationGatewayBackendAddressPoolAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages the association between a Network Interface and a Application Security Group. */
  def NetworkInterfaceApplicationSecurityGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkInterfaceApplicationSecurityGroupAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.network.NetworkInterfaceApplicationSecurityGroupAssociationArgs.builder
    com.pulumi.azure.network.NetworkInterfaceApplicationSecurityGroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages the association between a Network Interface and a Load Balancer&#39;s Backend Address Pool. */
  def NetworkInterfaceBackendAddressPoolAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkInterfaceBackendAddressPoolAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.network.NetworkInterfaceBackendAddressPoolAssociationArgs.builder
    com.pulumi.azure.network.NetworkInterfaceBackendAddressPoolAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages the association between a Network Interface and a Load Balancer&#39;s NAT Rule. */
  def NetworkInterfaceNatRuleAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkInterfaceNatRuleAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.network.NetworkInterfaceNatRuleAssociationArgs.builder
    com.pulumi.azure.network.NetworkInterfaceNatRuleAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages the association between a Network Interface and a Network Security Group. */
  def NetworkInterfaceSecurityGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkInterfaceSecurityGroupAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.network.NetworkInterfaceSecurityGroupAssociationArgs.builder
    com.pulumi.azure.network.NetworkInterfaceSecurityGroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager. */
  def NetworkManager(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerArgs.builder
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
    com.pulumi.azure.network.NetworkManager(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager Admin Rule. */
  def NetworkManagerAdminRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerAdminRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerAdminRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerAdminRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager Admin Rule Collection. */
  def NetworkManagerAdminRuleCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerAdminRuleCollectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerAdminRuleCollectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerAdminRuleCollection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Network Manager Connectivity Configuration.
   * 
   * &gt; **Note:** The `azure.network.NetworkManagerConnectivityConfiguration` deployment may modify or delete existing Network Peering resource.
   */
  def NetworkManagerConnectivityConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerConnectivityConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerConnectivityConfigurationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerConnectivityConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Network Manager Deployment.
   * 
   * &gt; **Note:** Using Network Manager Deployment to deploy Connectivity Configuration may modify or delete existing Virtual Network Peering. At this time you should not use Network Peering resource in conjunction with Network Manager Deployment. Doing so may cause a conflict of Peering configurations.
   */
  def NetworkManagerDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerDeploymentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.network.NetworkManagerDeploymentArgs.builder
    com.pulumi.azure.network.NetworkManagerDeployment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager IP Address Management (IPAM) Pool. */
  def NetworkManagerIpamPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerIpamPoolArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerIpamPoolArgs.builder
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
    com.pulumi.azure.network.NetworkManagerIpamPool(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager IPAM Pool Static CIDR. */
  def NetworkManagerIpamPoolStaticCidr(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerIpamPoolStaticCidrArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerIpamPoolStaticCidrArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerIpamPoolStaticCidr(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager Management Group Connection which may cross tenants. */
  def NetworkManagerManagementGroupConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerManagementGroupConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerManagementGroupConnectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerManagementGroupConnection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager Network Group. */
  def NetworkManagerNetworkGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerNetworkGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerNetworkGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerNetworkGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager Routing Configuration. */
  def NetworkManagerRoutingConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerRoutingConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerRoutingConfigurationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerRoutingConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Network Manager Routing Rule.
   * 
   * &gt; **Note:** Terraform has enabled force deletion. This setting deletes the resource even if it&#39;s part of a deployed configuration. If the configuration is deployed, the service will perform a cleanup deployment in the background before the deletion.
   */
  def NetworkManagerRoutingRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerRoutingRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerRoutingRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerRoutingRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Network Manager Routing Rule Collection.
   * 
   * &gt; **Note:** Terraform has enabled force deletion. This setting deletes the resource even if it&#39;s part of a deployed configuration. If the configuration is deployed, the service will perform a cleanup deployment in the background before the deletion.
   */
  def NetworkManagerRoutingRuleCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerRoutingRuleCollectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerRoutingRuleCollectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerRoutingRuleCollection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager Scope Connection which may cross tenants. */
  def NetworkManagerScopeConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerScopeConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerScopeConnectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerScopeConnection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager Security Admin Configuration. */
  def NetworkManagerSecurityAdminConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerSecurityAdminConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerSecurityAdminConfigurationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerSecurityAdminConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager Static Member. */
  def NetworkManagerStaticMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerStaticMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerStaticMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerStaticMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager Subscription Connection which may cross tenants. */
  def NetworkManagerSubscriptionConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerSubscriptionConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerSubscriptionConnectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerSubscriptionConnection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager Verifier Workspace. */
  def NetworkManagerVerifierWorkspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerVerifierWorkspaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerVerifierWorkspaceArgs.builder
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
    com.pulumi.azure.network.NetworkManagerVerifierWorkspace(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager Verifier Workspace Reachability Analysis Intent. */
  def NetworkManagerVerifierWorkspaceReachabilityAnalysisIntent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntent(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a network security group that contains a list of network security rules.  Network security groups enable inbound or outbound traffic to be enabled or denied.
   * 
   * &gt; **NOTE on Network Security Groups and Network Security Rules:** This provider currently
   * provides both a standalone Network Security Rule resource, and allows for Network Security Rules to be defined in-line within the Network Security Group resource.
   * At this time you cannot use a Network Security Group with in-line Network Security Rules in conjunction with any Network Security Rule resources. Doing so will cause a conflict of rule settings and will overwrite rules.
   */
  def NetworkSecurityGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkSecurityGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkSecurityGroupArgs.builder
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
    com.pulumi.azure.network.NetworkSecurityGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Security Perimeter. */
  def NetworkSecurityPerimeter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkSecurityPerimeterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkSecurityPerimeterArgs.builder
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
    com.pulumi.azure.network.NetworkSecurityPerimeter(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Security Perimeter Access Rule. */
  def NetworkSecurityPerimeterAccessRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkSecurityPerimeterAccessRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkSecurityPerimeterAccessRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkSecurityPerimeterAccessRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Security Perimeter Association. */
  def NetworkSecurityPerimeterAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkSecurityPerimeterAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkSecurityPerimeterAssociationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkSecurityPerimeterAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Security Perimeter Profile. */
  def NetworkSecurityPerimeterProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkSecurityPerimeterProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkSecurityPerimeterProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkSecurityPerimeterProfile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Network Security Rule.
   * 
   * &gt; **NOTE on Network Security Groups and Network Security Rules:** This provider currently
   * provides both a standalone Network Security Rule resource, and allows for Network Security Rules to be defined in-line within the Network Security Group resource.
   * At this time you cannot use a Network Security Group with in-line Network Security Rules in conjunction with any Network Security Rule resources. Doing so will cause a conflict of rule settings and will overwrite rules.
   */
  def NetworkSecurityRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkSecurityRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkSecurityRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.NetworkSecurityRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Watcher. */
  def NetworkWatcher(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkWatcherArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkWatcherArgs.builder
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
    com.pulumi.azure.network.NetworkWatcher(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Network Watcher Flow Log.
   * 
   * &gt; **Note:** The `azure.network.NetworkWatcherFlowLog` creates a new storage lifecyle management rule that overwrites existing rules. Please make sure to use a `storageAccount` with no existing management rules, until the issue is fixed.
   */
  def NetworkWatcherFlowLog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.NetworkWatcherFlowLogArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.NetworkWatcherFlowLogArgs.builder
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
    com.pulumi.azure.network.NetworkWatcherFlowLog(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Point-to-Site VPN Gateway. */
  def PointToPointVpnGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.PointToPointVpnGatewayArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.PointToPointVpnGatewayArgs.builder
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
    com.pulumi.azure.network.PointToPointVpnGateway(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Profile. */
  def Profile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.ProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.ProfileArgs.builder
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
    com.pulumi.azure.network.Profile(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Public IP Address.
   * 
   * &gt; **Note** If this resource is to be associated with a resource that requires disassociation before destruction (such as `azure.network.NetworkInterface`) it is recommended to set the `lifecycle` argument `createBeforeDestroy = true`. Otherwise, it can fail to disassociate on destruction.
   */
  def PublicIp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.PublicIpArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.PublicIpArgs.builder
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
    com.pulumi.azure.network.PublicIp(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Public IP Prefix. */
  def PublicIpPrefix(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.PublicIpPrefixArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.PublicIpPrefixArgs.builder
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
    com.pulumi.azure.network.PublicIpPrefix(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Route within a Route Table.
   * 
   * &gt; **NOTE on Route Tables and Routes:** This provider currently
   * provides both a standalone Route resource, and allows for Routes to be defined in-line within the Route Table resource.
   * At this time you cannot use a Route Table with in-line Routes in conjunction with any Route resources. Doing so will cause a conflict of Route configurations and will overwrite Routes.
   */
  def Route(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.RouteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.RouteArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.Route(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Route Filter. */
  def RouteFilter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.RouteFilterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.RouteFilterArgs.builder
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
    com.pulumi.azure.network.RouteFilter(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Route Map. */
  def RouteMap(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.RouteMapArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.RouteMapArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.RouteMap(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Route Server */
  def RouteServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.RouteServerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.RouteServerArgs.builder
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
    com.pulumi.azure.network.RouteServer(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Bgp Connection for a Route Server */
  def RouteServerBgpConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.RouteServerBgpConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.RouteServerBgpConnectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.RouteServerBgpConnection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Route Table
   * 
   * &gt; **NOTE on Route Tables and Routes:** There is both a standalone `route` resource, and allows for Routes to be defined in-line within the `routeTable` resource.
   * At this time you cannot use a Route Table with in-line Routes in conjunction with any Route resources. Doing so will cause a conflict of Route configurations and will overwrite Routes.
   */
  def RouteTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.RouteTableArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.RouteTableArgs.builder
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
    com.pulumi.azure.network.RouteTable(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Virtual Hub Routing Intent. */
  def RoutingIntent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.RoutingIntentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.RoutingIntentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.RoutingIntent(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Security Partner Provider which could be associated to virtual hub. */
  def SecurityPartnerProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.SecurityPartnerProviderArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.SecurityPartnerProviderArgs.builder
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
    com.pulumi.azure.network.SecurityPartnerProvider(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a subnet. Subnets represent network segments within the IP space defined by the virtual network.
   * 
   * &gt; **NOTE on Virtual Networks and Subnet&#39;s:** This provider currently
   * provides both a standalone Subnet resource, and allows for Subnets to be defined in-line within the Virtual Network resource.
   * At this time you cannot use a Virtual Network with in-line Subnets in conjunction with any Subnet resources. Doing so will cause a conflict of Subnet configurations and will overwrite Subnets.
   */
  def Subnet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.SubnetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.SubnetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.Subnet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Associates a NAT Gateway with a Subnet within a Virtual Network. */
  def SubnetNatGatewayAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.SubnetNatGatewayAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.network.SubnetNatGatewayAssociationArgs.builder
    com.pulumi.azure.network.SubnetNatGatewayAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Associates a Network Security Group with a Subnet within a Virtual Network. */
  def SubnetNetworkSecurityGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.SubnetNetworkSecurityGroupAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.network.SubnetNetworkSecurityGroupAssociationArgs.builder
    com.pulumi.azure.network.SubnetNetworkSecurityGroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Associates a Route Table with a Subnet within a Virtual Network. */
  def SubnetRouteTableAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.SubnetRouteTableAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.network.SubnetRouteTableAssociationArgs.builder
    com.pulumi.azure.network.SubnetRouteTableAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Subnet Service Endpoint Storage Policy. */
  def SubnetServiceEndpointStoragePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.SubnetServiceEndpointStoragePolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.SubnetServiceEndpointStoragePolicyArgs.builder
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
    com.pulumi.azure.network.SubnetServiceEndpointStoragePolicy(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Endpoint within a Traffic Manager Profile. */
  def TrafficManagerAzureEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.TrafficManagerAzureEndpointArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.TrafficManagerAzureEndpointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.TrafficManagerAzureEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an External Endpoint within a Traffic Manager Profile. */
  def TrafficManagerExternalEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.TrafficManagerExternalEndpointArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.TrafficManagerExternalEndpointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.TrafficManagerExternalEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Nested Endpoint within a Traffic Manager Profile. */
  def TrafficManagerNestedEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.TrafficManagerNestedEndpointArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.TrafficManagerNestedEndpointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.TrafficManagerNestedEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Traffic Manager Profile to which multiple endpoints can be attached. */
  def TrafficManagerProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.TrafficManagerProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.TrafficManagerProfileArgs.builder
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
    com.pulumi.azure.network.TrafficManagerProfile(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Virtual Hub within a Virtual WAN. */
  def VirtualHub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualHubArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualHubArgs.builder
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
    com.pulumi.azure.network.VirtualHub(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Connection for a Virtual Hub. */
  def VirtualHubConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualHubConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualHubConnectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.VirtualHubConnection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Virtual Hub IP. This resource is also known as a Route Server.
   * 
   * &gt; **Note:** Virtual Hub IP only supports Standard Virtual Hub without Virtual Wan.
   */
  def VirtualHubIp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualHubIpArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualHubIpArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.VirtualHubIp(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Virtual Hub Route Table. */
  def VirtualHubRouteTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualHubRouteTableArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualHubRouteTableArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.VirtualHubRouteTable(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Route in a Virtual Hub Route Table.
   * 
   * &gt; **Note:** Route table routes can managed with this resource, or in-line with the virtualHubRouteTable resource. Using both is not supported.
   */
  def VirtualHubRouteTableRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualHubRouteTableRouteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualHubRouteTableRouteArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.VirtualHubRouteTableRoute(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a virtual network including any configured subnets. Each subnet can
   * optionally be configured with a security group to be associated with the subnet.
   * 
   * &gt; **NOTE on Virtual Networks and Subnet&#39;s:** This provider currently
   * provides both a standalone Subnet resource, and allows for Subnets to be defined in-line within the Virtual Network resource.
   * At this time you cannot use a Virtual Network with in-line Subnets in conjunction with any Subnet resources. Doing so will cause a conflict of Subnet configurations and will overwrite Subnet&#39;s.
   * **NOTE on Virtual Networks and DNS Servers:** This provider currently provides both a standalone virtual network DNS Servers resource, and allows for DNS servers to be defined in-line within the Virtual Network resource.
   * At this time you cannot use a Virtual Network with in-line DNS servers in conjunction with any Virtual Network DNS Servers resources. Doing so will cause a conflict of Virtual Network DNS Servers configurations and will overwrite virtual networks DNS servers.
   */
  def VirtualNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualNetworkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualNetworkArgs.builder
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
    com.pulumi.azure.network.VirtualNetwork(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages the DNS servers associated with a virtual network.
   * 
   * &gt; **Note:** Terraform currently provides both a standalone virtual network DNS Servers resource, and allows for DNS servers to be defined in-line within the Virtual Network resource.
   * At this time you cannot use a Virtual Network with in-line DNS servers in conjunction with any Virtual Network DNS Servers resources. Doing so will cause a conflict of Virtual Network DNS Servers configurations and will overwrite virtual networks DNS servers.
   */
  def VirtualNetworkDnsServers(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualNetworkDnsServersArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.network.VirtualNetworkDnsServersArgs.builder
    com.pulumi.azure.network.VirtualNetworkDnsServers(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Virtual Network Gateway to establish secure, cross-premises connectivity.
   * 
   * &gt; **Note:** Please be aware that provisioning a Virtual Network Gateway takes a long time (between 30 minutes and 1 hour)
   */
  def VirtualNetworkGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualNetworkGatewayArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualNetworkGatewayArgs.builder
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
    com.pulumi.azure.network.VirtualNetworkGateway(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a connection in an existing Virtual Network Gateway. */
  def VirtualNetworkGatewayConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualNetworkGatewayConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualNetworkGatewayConnectionArgs.builder
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
    com.pulumi.azure.network.VirtualNetworkGatewayConnection(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Virtual Network Gateway Nat Rule. */
  def VirtualNetworkGatewayNatRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualNetworkGatewayNatRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualNetworkGatewayNatRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.VirtualNetworkGatewayNatRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a virtual network peering which allows resources to access other
   * resources in the linked virtual network.
   */
  def VirtualNetworkPeering(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualNetworkPeeringArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualNetworkPeeringArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.VirtualNetworkPeering(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Virtual WAN. */
  def VirtualWan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.VirtualWanArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VirtualWanArgs.builder
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
    com.pulumi.azure.network.VirtualWan(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a VPN Gateway NAT Rule. */
  def VnpGatewayNatRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.VnpGatewayNatRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VnpGatewayNatRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.VnpGatewayNatRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a VPN Gateway within a Virtual Hub, which enables Site-to-Site communication. */
  def VpnGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.VpnGatewayArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VpnGatewayArgs.builder
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
    com.pulumi.azure.network.VpnGateway(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a VPN Gateway Connection. */
  def VpnGatewayConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.VpnGatewayConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VpnGatewayConnectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.VpnGatewayConnection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a VPN Server Configuration. */
  def VpnServerConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.VpnServerConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VpnServerConfigurationArgs.builder
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
    com.pulumi.azure.network.VpnServerConfiguration(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a VPN Server Configuration Policy Group. */
  def VpnServerConfigurationPolicyGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.VpnServerConfigurationPolicyGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VpnServerConfigurationPolicyGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.network.VpnServerConfigurationPolicyGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a VPN Site. */
  def VpnSite(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.network.VpnSiteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.network.VpnSiteArgs.builder
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
    com.pulumi.azure.network.VpnSite(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
