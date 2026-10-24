package jp.ukiba.ko_pulumi
package azure

object network_ext:
  extension (builder: com.pulumi.azure.network.ApplicationGatewayArgs.Builder)
    /**
     * @param authenticationCertificates One or more `authenticationCertificate` blocks as defined below.
     * @return builder
     */
    inline def authenticationCertificates(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayAuthenticationCertificateArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayAuthenticationCertificateArgs.builder
      builder.authenticationCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param autoscaleConfiguration An `autoscaleConfiguration` block as defined below.
     * @return builder
     */
    inline def autoscaleConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayAutoscaleConfigurationArgs.Builder]):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayAutoscaleConfigurationArgs.builder
      builder.autoscaleConfiguration(args(argsBuilder).build)

    /**
     * @param backendAddressPools One or more `backendAddressPool` blocks as defined below.
     * @return builder
     */
    inline def backendAddressPools(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayBackendAddressPoolArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayBackendAddressPoolArgs.builder
      builder.backendAddressPools(args.map(_(argsBuilder).build)*)

    /**
     * @param backendHttpSettings One or more `backendHttpSettings` blocks as defined below.
     * 
     * &gt; **Note:** At least one of `backendHttpSettings` or `backend` must be specified.
     * @return builder
     */
    inline def backendHttpSettings(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingArgs.builder
      builder.backendHttpSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param backends One or more `backend` blocks as defined below.
     * 
     * &gt; **Note:** At least one of `backendHttpSettings` or `backend` must be specified.
     * @return builder
     */
    inline def backends(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayBackendArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayBackendArgs.builder
      builder.backends(args.map(_(argsBuilder).build)*)

    /**
     * @param customErrorConfigurations One or more `customErrorConfiguration` blocks as defined below.
     * @return builder
     */
    inline def customErrorConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayCustomErrorConfigurationArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayCustomErrorConfigurationArgs.builder
      builder.customErrorConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param frontendIpConfigurations One or more `frontendIpConfiguration` blocks as defined below.
     * @return builder
     */
    inline def frontendIpConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayFrontendIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayFrontendIpConfigurationArgs.builder
      builder.frontendIpConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param frontendPorts One or more `frontendPort` blocks as defined below.
     * @return builder
     */
    inline def frontendPorts(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayFrontendPortArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayFrontendPortArgs.builder
      builder.frontendPorts(args.map(_(argsBuilder).build)*)

    /**
     * @param gatewayIpConfigurations One or more `gatewayIpConfiguration` blocks as defined below.
     * @return builder
     */
    inline def gatewayIpConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayGatewayIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayGatewayIpConfigurationArgs.builder
      builder.gatewayIpConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param global A `global` block as defined below.
     * @return builder
     */
    inline def global(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayGlobalArgs.Builder]):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayGlobalArgs.builder
      builder.global(args(argsBuilder).build)

    /**
     * @param httpListeners One or more `httpListener` blocks as defined below.
     * 
     * &gt; **Note:** At least one of `httpListener` or `listener` must be specified.
     * @return builder
     */
    inline def httpListeners(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayHttpListenerArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayHttpListenerArgs.builder
      builder.httpListeners(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayIdentityArgs.Builder]):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param listeners One or more `listener` blocks as defined below.
     * 
     * &gt; **Note:** At least one of `httpListener` or `listener` must be specified.
     * @return builder
     */
    inline def listeners(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayListenerArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayListenerArgs.builder
      builder.listeners(args.map(_(argsBuilder).build)*)

    /**
     * @param privateLinkConfigurations One or more `privateLinkConfiguration` blocks as defined below.
     * @return builder
     */
    inline def privateLinkConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayPrivateLinkConfigurationArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayPrivateLinkConfigurationArgs.builder
      builder.privateLinkConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param probes One or more `probe` blocks as defined below.
     * @return builder
     */
    inline def probes(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayProbeArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayProbeArgs.builder
      builder.probes(args.map(_(argsBuilder).build)*)

    /**
     * @param redirectConfigurations One or more `redirectConfiguration` blocks as defined below.
     * @return builder
     */
    inline def redirectConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRedirectConfigurationArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRedirectConfigurationArgs.builder
      builder.redirectConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param requestRoutingRules One or more `requestRoutingRule` blocks as defined below.
     * 
     * &gt; **Note:** At least one of `requestRoutingRule` or `routingRule` must be specified.
     * @return builder
     */
    inline def requestRoutingRules(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRequestRoutingRuleArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRequestRoutingRuleArgs.builder
      builder.requestRoutingRules(args.map(_(argsBuilder).build)*)

    /**
     * @param rewriteRuleSets One or more `rewriteRuleSet` blocks as defined below. Only valid for v2 WAF and Standard SKUs.
     * @return builder
     */
    inline def rewriteRuleSets(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetArgs.builder
      builder.rewriteRuleSets(args.map(_(argsBuilder).build)*)

    /**
     * @param routingRules One or more `routingRule` blocks as defined below.
     * 
     * &gt; **Note:** At least one of `requestRoutingRule` or `routingRule` must be specified.
     * @return builder
     */
    inline def routingRules(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRoutingRuleArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRoutingRuleArgs.builder
      builder.routingRules(args.map(_(argsBuilder).build)*)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewaySkuArgs.Builder]):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewaySkuArgs.builder
      builder.sku(args(argsBuilder).build)

    /**
     * @param sslCertificates One or more `sslCertificate` blocks as defined below.
     * @return builder
     */
    inline def sslCertificates(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewaySslCertificateArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewaySslCertificateArgs.builder
      builder.sslCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param sslPolicy a `sslPolicy` block as defined below.
     * @return builder
     */
    inline def sslPolicy(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewaySslPolicyArgs.Builder]):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewaySslPolicyArgs.builder
      builder.sslPolicy(args(argsBuilder).build)

    /**
     * @param sslProfiles One or more `sslProfile` blocks as defined below.
     * @return builder
     */
    inline def sslProfiles(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewaySslProfileArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewaySslProfileArgs.builder
      builder.sslProfiles(args.map(_(argsBuilder).build)*)

    /**
     * @param trustedClientCertificates One or more `trustedClientCertificate` blocks as defined below.
     * @return builder
     */
    inline def trustedClientCertificates(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayTrustedClientCertificateArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayTrustedClientCertificateArgs.builder
      builder.trustedClientCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param trustedRootCertificates One or more `trustedRootCertificate` blocks as defined below.
     * @return builder
     */
    inline def trustedRootCertificates(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayTrustedRootCertificateArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayTrustedRootCertificateArgs.builder
      builder.trustedRootCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param urlPathMaps One or more `urlPathMap` blocks as defined below.
     * @return builder
     */
    inline def urlPathMaps(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayUrlPathMapArgs.Builder]*):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayUrlPathMapArgs.builder
      builder.urlPathMaps(args.map(_(argsBuilder).build)*)

    /**
     * @param wafConfiguration A `wafConfiguration` block as defined below.
     * @return builder
     */
    inline def wafConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationArgs.Builder]):
        com.pulumi.azure.network.ApplicationGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationArgs.builder
      builder.wafConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.ExpressRouteCircuitArgs.Builder)
    /**
     * @param sku A `sku` block for the ExpressRoute circuit as documented below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRouteCircuitSkuArgs.Builder]):
        com.pulumi.azure.network.ExpressRouteCircuitArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRouteCircuitSkuArgs.builder
      builder.sku(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.ExpressRouteCircuitPeeringArgs.Builder)
    /**
     * @param ipv6 A `ipv6` block as defined below.
     * @return builder
     */
    inline def ipv6(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringIpv6Args.Builder]):
        com.pulumi.azure.network.ExpressRouteCircuitPeeringArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringIpv6Args.builder
      builder.ipv6(args(argsBuilder).build)

    /**
     * @param microsoftPeeringConfig A `microsoftPeeringConfig` block as defined below. Required when `peeringType` is set to `MicrosoftPeering` and config for IPv4.
     * @return builder
     */
    inline def microsoftPeeringConfig(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringMicrosoftPeeringConfigArgs.Builder]):
        com.pulumi.azure.network.ExpressRouteCircuitPeeringArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringMicrosoftPeeringConfigArgs.builder
      builder.microsoftPeeringConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.ExpressRouteConnectionArgs.Builder)
    /**
     * @param routing A `routing` block as defined below.
     * @return builder
     */
    inline def routing(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRouteConnectionRoutingArgs.Builder]):
        com.pulumi.azure.network.ExpressRouteConnectionArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRouteConnectionRoutingArgs.builder
      builder.routing(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.ExpressRoutePortArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRoutePortIdentityArgs.Builder]):
        com.pulumi.azure.network.ExpressRoutePortArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRoutePortIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param link1 A list of `link` blocks as defined below.
     * @return builder
     */
    inline def link1(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRoutePortLink1Args.Builder]):
        com.pulumi.azure.network.ExpressRoutePortArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRoutePortLink1Args.builder
      builder.link1(args(argsBuilder).build)

    /**
     * @param link2 A list of `link` blocks as defined below.
     * @return builder
     */
    inline def link2(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRoutePortLink2Args.Builder]):
        com.pulumi.azure.network.ExpressRoutePortArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRoutePortLink2Args.builder
      builder.link2(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.FirewallApplicationRuleCollectionArgs.Builder)
    /**
     * @param rules One or more `rule` blocks as defined below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.network.inputs.FirewallApplicationRuleCollectionRuleArgs.Builder]*):
        com.pulumi.azure.network.FirewallApplicationRuleCollectionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallApplicationRuleCollectionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.FirewallArgs.Builder)
    /**
     * @param ipConfigurations An `ipConfiguration` block as documented below.
     * @return builder
     */
    inline def ipConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.FirewallIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.FirewallArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param managementIpConfiguration A `managementIpConfiguration` block as documented below, which allows force-tunnelling of traffic to be performed by the firewall. Adding or removing this block or changing the `subnetId` in an existing block forces a new resource to be created. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def managementIpConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.FirewallManagementIpConfigurationArgs.Builder]):
        com.pulumi.azure.network.FirewallArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallManagementIpConfigurationArgs.builder
      builder.managementIpConfiguration(args(argsBuilder).build)

    /**
     * @param virtualHub A `virtualHub` block as documented below.
     * @return builder
     */
    inline def virtualHub(args: Endofunction[com.pulumi.azure.network.inputs.FirewallVirtualHubArgs.Builder]):
        com.pulumi.azure.network.FirewallArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallVirtualHubArgs.builder
      builder.virtualHub(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.FirewallNatRuleCollectionArgs.Builder)
    /**
     * @param rules One or more `rule` blocks as defined below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.network.inputs.FirewallNatRuleCollectionRuleArgs.Builder]*):
        com.pulumi.azure.network.FirewallNatRuleCollectionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallNatRuleCollectionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.FirewallNetworkRuleCollectionArgs.Builder)
    /**
     * @param rules One or more `rule` blocks as defined below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.network.inputs.FirewallNetworkRuleCollectionRuleArgs.Builder]*):
        com.pulumi.azure.network.FirewallNetworkRuleCollectionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallNetworkRuleCollectionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.FirewallPolicyArgs.Builder)
    /**
     * @param dns A `dns` block as defined below.
     * @return builder
     */
    inline def dns(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyDnsArgs.Builder]):
        com.pulumi.azure.network.FirewallPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyDnsArgs.builder
      builder.dns(args(argsBuilder).build)

    /**
     * @param explicitProxy A `explicitProxy` block as defined below.
     * @return builder
     */
    inline def explicitProxy(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyExplicitProxyArgs.Builder]):
        com.pulumi.azure.network.FirewallPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyExplicitProxyArgs.builder
      builder.explicitProxy(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyIdentityArgs.Builder]):
        com.pulumi.azure.network.FirewallPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param insights An `insights` block as defined below.
     * @return builder
     */
    inline def insights(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyInsightsArgs.Builder]):
        com.pulumi.azure.network.FirewallPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyInsightsArgs.builder
      builder.insights(args(argsBuilder).build)

    /**
     * @param intrusionDetection A `intrusionDetection` block as defined below.
     * @return builder
     */
    inline def intrusionDetection(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionArgs.Builder]):
        com.pulumi.azure.network.FirewallPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionArgs.builder
      builder.intrusionDetection(args(argsBuilder).build)

    /**
     * @param threatIntelligenceAllowlist A `threatIntelligenceAllowlist` block as defined below.
     * @return builder
     */
    inline def threatIntelligenceAllowlist(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyThreatIntelligenceAllowlistArgs.Builder]):
        com.pulumi.azure.network.FirewallPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyThreatIntelligenceAllowlistArgs.builder
      builder.threatIntelligenceAllowlist(args(argsBuilder).build)

    /**
     * @param tlsCertificate A `tlsCertificate` block as defined below.
     * @return builder
     */
    inline def tlsCertificate(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyTlsCertificateArgs.Builder]):
        com.pulumi.azure.network.FirewallPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyTlsCertificateArgs.builder
      builder.tlsCertificate(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.FirewallPolicyRuleCollectionGroupArgs.Builder)
    /**
     * @param applicationRuleCollections One or more `applicationRuleCollection` blocks as defined below.
     * @return builder
     */
    inline def applicationRuleCollections(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs.Builder]*):
        com.pulumi.azure.network.FirewallPolicyRuleCollectionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs.builder
      builder.applicationRuleCollections(args.map(_(argsBuilder).build)*)

    /**
     * @param natRuleCollections One or more `natRuleCollection` blocks as defined below.
     * @return builder
     */
    inline def natRuleCollections(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionArgs.Builder]*):
        com.pulumi.azure.network.FirewallPolicyRuleCollectionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionArgs.builder
      builder.natRuleCollections(args.map(_(argsBuilder).build)*)

    /**
     * @param networkRuleCollections One or more `networkRuleCollection` blocks as defined below.
     * @return builder
     */
    inline def networkRuleCollections(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionArgs.Builder]*):
        com.pulumi.azure.network.FirewallPolicyRuleCollectionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionArgs.builder
      builder.networkRuleCollections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.LocalNetworkGatewayArgs.Builder)
    /**
     * @param bgpSettings A `bgpSettings` block as defined below containing the Local Network Gateway&#39;s BGP speaker settings.
     * @return builder
     */
    inline def bgpSettings(args: Endofunction[com.pulumi.azure.network.inputs.LocalNetworkGatewayBgpSettingsArgs.Builder]):
        com.pulumi.azure.network.LocalNetworkGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.LocalNetworkGatewayBgpSettingsArgs.builder
      builder.bgpSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.NetworkConnectionMonitorArgs.Builder)
    /**
     * @param endpoints A `endpoint` block as defined below.
     * @return builder
     */
    inline def endpoints(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointArgs.Builder]*):
        com.pulumi.azure.network.NetworkConnectionMonitorArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param testConfigurations A `testConfiguration` block as defined below.
     * @return builder
     */
    inline def testConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationArgs.Builder]*):
        com.pulumi.azure.network.NetworkConnectionMonitorArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationArgs.builder
      builder.testConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param testGroups A `testGroup` block as defined below.
     * @return builder
     */
    inline def testGroups(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestGroupArgs.Builder]*):
        com.pulumi.azure.network.NetworkConnectionMonitorArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestGroupArgs.builder
      builder.testGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.NetworkInterfaceArgs.Builder)
    /**
     * @param ipConfigurations One or more `ipConfiguration` blocks as defined below.
     * @return builder
     */
    inline def ipConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.NetworkInterfaceIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.NetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkInterfaceIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.NetworkManagerAdminRuleArgs.Builder)
    /**
     * @param destinations One or more `destination` blocks as defined below.
     * @return builder
     */
    inline def destinations(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerAdminRuleDestinationArgs.Builder]*):
        com.pulumi.azure.network.NetworkManagerAdminRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerAdminRuleDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param sources One or more `source` blocks as defined below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerAdminRuleSourceArgs.Builder]*):
        com.pulumi.azure.network.NetworkManagerAdminRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerAdminRuleSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.NetworkManagerArgs.Builder)
    /**
     * @param scope A `scope` block as defined below.
     * @return builder
     */
    inline def scope(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerScopeArgs.Builder]):
        com.pulumi.azure.network.NetworkManagerArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.NetworkManagerConnectivityConfigurationArgs.Builder)
    /**
     * @param appliesToGroups One or more `appliesToGroup` blocks as defined below.
     * @return builder
     */
    inline def appliesToGroups(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationAppliesToGroupArgs.Builder]*):
        com.pulumi.azure.network.NetworkManagerConnectivityConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationAppliesToGroupArgs.builder
      builder.appliesToGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param hub A `hub` block as defined below.
     * @return builder
     */
    inline def hub(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationHubArgs.Builder]):
        com.pulumi.azure.network.NetworkManagerConnectivityConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationHubArgs.builder
      builder.hub(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.NetworkManagerRoutingRuleArgs.Builder)
    /**
     * @param destination A `destination` block as defined below.
     * @return builder
     */
    inline def destination(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleDestinationArgs.Builder]):
        com.pulumi.azure.network.NetworkManagerRoutingRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param nextHop A `nextHop` block as defined below.
     * @return builder
     */
    inline def nextHop(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleNextHopArgs.Builder]):
        com.pulumi.azure.network.NetworkManagerRoutingRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleNextHopArgs.builder
      builder.nextHop(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntentArgs.Builder)
    /**
     * @param ipTraffic An `ipTraffic` block as defined below. Changing this forces a new Network Manager Verifier Workspace Reachability Analysis Intent to be created.
     * @return builder
     */
    inline def ipTraffic(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntentIpTrafficArgs.Builder]):
        com.pulumi.azure.network.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntentArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntentIpTrafficArgs.builder
      builder.ipTraffic(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.NetworkSecurityGroupArgs.Builder)
    /**
     * @param securityRules A list of objects representing security rules, as defined below.
     * 
     * &gt; **NOTE** Since `securityRule` can be configured both inline and via the separate `azure.network.NetworkSecurityRule` resource, we have to explicitly set it to empty slice (`[]`) to remove it.
     * @return builder
     */
    inline def securityRules(args: Endofunction[com.pulumi.azure.network.inputs.NetworkSecurityGroupSecurityRuleArgs.Builder]*):
        com.pulumi.azure.network.NetworkSecurityGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkSecurityGroupSecurityRuleArgs.builder
      builder.securityRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.NetworkWatcherFlowLogArgs.Builder)
    /**
     * @param retentionPolicy A `retentionPolicy` block as documented below.
     * @return builder
     */
    inline def retentionPolicy(args: Endofunction[com.pulumi.azure.network.inputs.NetworkWatcherFlowLogRetentionPolicyArgs.Builder]):
        com.pulumi.azure.network.NetworkWatcherFlowLogArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkWatcherFlowLogRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

    /**
     * @param trafficAnalytics A `trafficAnalytics` block as documented below.
     * @return builder
     */
    inline def trafficAnalytics(args: Endofunction[com.pulumi.azure.network.inputs.NetworkWatcherFlowLogTrafficAnalyticsArgs.Builder]):
        com.pulumi.azure.network.NetworkWatcherFlowLogArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkWatcherFlowLogTrafficAnalyticsArgs.builder
      builder.trafficAnalytics(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.PointToPointVpnGatewayArgs.Builder)
    /**
     * @param connectionConfigurations A `connectionConfiguration` block as defined below.
     * @return builder
     */
    inline def connectionConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationArgs.Builder]*):
        com.pulumi.azure.network.PointToPointVpnGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationArgs.builder
      builder.connectionConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.ProfileArgs.Builder)
    /**
     * @param containerNetworkInterface A `containerNetworkInterface` block as documented below.
     * @return builder
     */
    inline def containerNetworkInterface(args: Endofunction[com.pulumi.azure.network.inputs.ProfileContainerNetworkInterfaceArgs.Builder]):
        com.pulumi.azure.network.ProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ProfileContainerNetworkInterfaceArgs.builder
      builder.containerNetworkInterface(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.RouteFilterArgs.Builder)
    /**
     * @param rule A `rule` block as defined below.
     * @return builder
     */
    inline def rule(args: Endofunction[com.pulumi.azure.network.inputs.RouteFilterRuleArgs.Builder]):
        com.pulumi.azure.network.RouteFilterArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.RouteFilterRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.RouteMapArgs.Builder)
    /**
     * @param rules A `rule` block as defined below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.network.inputs.RouteMapRuleArgs.Builder]*):
        com.pulumi.azure.network.RouteMapArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.RouteMapRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.RouteTableArgs.Builder)
    /**
     * @param routes A list of objects representing routes. Each object accepts the arguments documented below.
     * 
     * &gt; **NOTE** Since `route` can be configured both inline and via the separate `azure.network.Route` resource, we have to explicitly set it to empty slice (`[]`) to remove it.
     * @return builder
     */
    inline def routes(args: Endofunction[com.pulumi.azure.network.inputs.RouteTableRouteArgs.Builder]*):
        com.pulumi.azure.network.RouteTableArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.RouteTableRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.RoutingIntentArgs.Builder)
    /**
     * @param routingPolicies One or more `routingPolicy` blocks as defined below.
     * @return builder
     */
    inline def routingPolicies(args: Endofunction[com.pulumi.azure.network.inputs.RoutingIntentRoutingPolicyArgs.Builder]*):
        com.pulumi.azure.network.RoutingIntentArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.RoutingIntentRoutingPolicyArgs.builder
      builder.routingPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.SubnetArgs.Builder)
    /**
     * @param delegations One or more `delegation` blocks as defined below.
     * @return builder
     */
    inline def delegations(args: Endofunction[com.pulumi.azure.network.inputs.SubnetDelegationArgs.Builder]*):
        com.pulumi.azure.network.SubnetArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.SubnetDelegationArgs.builder
      builder.delegations(args.map(_(argsBuilder).build)*)

    /**
     * @param ipAddressPool An `ipAddressPool` block as defined below.
     * 
     * &gt; **Note:** Exactly one of `addressPrefixes` or `ipAddressPool` must be specified.
     * @return builder
     */
    inline def ipAddressPool(args: Endofunction[com.pulumi.azure.network.inputs.SubnetIpAddressPoolArgs.Builder]):
        com.pulumi.azure.network.SubnetArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.SubnetIpAddressPoolArgs.builder
      builder.ipAddressPool(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.SubnetServiceEndpointStoragePolicyArgs.Builder)
    /**
     * @param definitions A `definition` block as defined below
     * @return builder
     */
    inline def definitions(args: Endofunction[com.pulumi.azure.network.inputs.SubnetServiceEndpointStoragePolicyDefinitionArgs.Builder]*):
        com.pulumi.azure.network.SubnetServiceEndpointStoragePolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.SubnetServiceEndpointStoragePolicyDefinitionArgs.builder
      builder.definitions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.TrafficManagerAzureEndpointArgs.Builder)
    /**
     * @param customHeaders One or more `customHeader` blocks as defined below.
     * @return builder
     */
    inline def customHeaders(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointCustomHeaderArgs.Builder]*):
        com.pulumi.azure.network.TrafficManagerAzureEndpointArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointCustomHeaderArgs.builder
      builder.customHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param subnets One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def subnets(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointSubnetArgs.Builder]*):
        com.pulumi.azure.network.TrafficManagerAzureEndpointArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.TrafficManagerExternalEndpointArgs.Builder)
    /**
     * @param customHeaders One or more `customHeader` blocks as defined below.
     * @return builder
     */
    inline def customHeaders(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointCustomHeaderArgs.Builder]*):
        com.pulumi.azure.network.TrafficManagerExternalEndpointArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointCustomHeaderArgs.builder
      builder.customHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param subnets One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def subnets(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointSubnetArgs.Builder]*):
        com.pulumi.azure.network.TrafficManagerExternalEndpointArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.TrafficManagerNestedEndpointArgs.Builder)
    /**
     * @param customHeaders One or more `customHeader` blocks as defined below.
     * @return builder
     */
    inline def customHeaders(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointCustomHeaderArgs.Builder]*):
        com.pulumi.azure.network.TrafficManagerNestedEndpointArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointCustomHeaderArgs.builder
      builder.customHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param subnets One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def subnets(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointSubnetArgs.Builder]*):
        com.pulumi.azure.network.TrafficManagerNestedEndpointArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.TrafficManagerProfileArgs.Builder)
    /**
     * @param dnsConfig This block specifies the DNS configuration of the Profile. One `dnsConfig` block as defined below.
     * @return builder
     */
    inline def dnsConfig(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerProfileDnsConfigArgs.Builder]):
        com.pulumi.azure.network.TrafficManagerProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerProfileDnsConfigArgs.builder
      builder.dnsConfig(args(argsBuilder).build)

    /**
     * @param monitorConfig This block specifies the Endpoint monitoring configuration for the Profile. One `monitorConfig` block as defined below.
     * @return builder
     */
    inline def monitorConfig(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerProfileMonitorConfigArgs.Builder]):
        com.pulumi.azure.network.TrafficManagerProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerProfileMonitorConfigArgs.builder
      builder.monitorConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.VirtualHubArgs.Builder)
    /**
     * @param routes One or more `route` blocks as defined below.
     * @return builder
     */
    inline def routes(args: Endofunction[com.pulumi.azure.network.inputs.VirtualHubRouteArgs.Builder]*):
        com.pulumi.azure.network.VirtualHubArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualHubRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.VirtualHubConnectionArgs.Builder)
    /**
     * @param routing A `routing` block as defined below.
     * @return builder
     */
    inline def routing(args: Endofunction[com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingArgs.Builder]):
        com.pulumi.azure.network.VirtualHubConnectionArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingArgs.builder
      builder.routing(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.VirtualHubRouteTableArgs.Builder)
    /**
     * @param routes One or more `route` blocks as defined below.
     * @return builder
     */
    inline def routes(args: Endofunction[com.pulumi.azure.network.inputs.VirtualHubRouteTableRouteArgs.Builder]*):
        com.pulumi.azure.network.VirtualHubRouteTableArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualHubRouteTableRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.VirtualNetworkArgs.Builder)
    /**
     * @param ddosProtectionPlan A `ddosProtectionPlan` block as documented below.
     * @return builder
     */
    inline def ddosProtectionPlan(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkDdosProtectionPlanArgs.Builder]):
        com.pulumi.azure.network.VirtualNetworkArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkDdosProtectionPlanArgs.builder
      builder.ddosProtectionPlan(args(argsBuilder).build)

    /**
     * @param encryption A `encryption` block as defined below.
     * @return builder
     */
    inline def encryption(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkEncryptionArgs.Builder]):
        com.pulumi.azure.network.VirtualNetworkArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param ipAddressPools One or more `ipAddressPool` blocks as defined below. Only one association of each IP type(IPv4 or IPv6) is allowed.
     * 
     * &gt; **Note:** Exactly one of `addressSpace` or `ipAddressPool` must be specified.
     * @return builder
     */
    inline def ipAddressPools(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkIpAddressPoolArgs.Builder]*):
        com.pulumi.azure.network.VirtualNetworkArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkIpAddressPoolArgs.builder
      builder.ipAddressPools(args.map(_(argsBuilder).build)*)

    /**
     * @param subnets Can be specified multiple times to define multiple subnets. Each `subnet` block supports fields documented below.
     * 
     * &gt; **NOTE** Since `subnet` can be configured both inline and via the separate `azure.network.Subnet` resource, we have to explicitly set it to empty slice (`[]`) to remove it.
     * @return builder
     */
    inline def subnets(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkSubnetArgs.Builder]*):
        com.pulumi.azure.network.VirtualNetworkArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.VirtualNetworkGatewayArgs.Builder)
    /**
     * @param bgpSettings A `bgpSettings` block which is documented below. In this block the BGP specific settings can be defined.
     * @return builder
     */
    inline def bgpSettings(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayBgpSettingsArgs.Builder]):
        com.pulumi.azure.network.VirtualNetworkGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayBgpSettingsArgs.builder
      builder.bgpSettings(args(argsBuilder).build)

    /**
     * @param customRoute A `customRoute` block as defined below. Specifies a custom routes address space for a virtual network gateway and a VpnClient.
     * @return builder
     */
    inline def customRoute(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayCustomRouteArgs.Builder]):
        com.pulumi.azure.network.VirtualNetworkGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayCustomRouteArgs.builder
      builder.customRoute(args(argsBuilder).build)

    /**
     * @param ipConfigurations One or more (up to 3) `ipConfiguration` blocks documented below. Changing this forces a new resource to be created. An active-standby gateway requires exactly one `ipConfiguration` block, an active-active gateway requires exactly two `ipConfiguration` blocks whereas an active-active zone redundant gateway with P2S configuration requires exactly three `ipConfiguration` blocks.
     * @return builder
     */
    inline def ipConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.VirtualNetworkGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param policyGroups One or more `policyGroup` blocks as defined below.
     * @return builder
     */
    inline def policyGroups(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayPolicyGroupArgs.Builder]*):
        com.pulumi.azure.network.VirtualNetworkGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayPolicyGroupArgs.builder
      builder.policyGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param vpnClientConfiguration A `vpnClientConfiguration` block which is documented below. In this block the Virtual Network Gateway can be configured to accept IPSec point-to-site connections.
     * @return builder
     */
    inline def vpnClientConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationArgs.Builder]):
        com.pulumi.azure.network.VirtualNetworkGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationArgs.builder
      builder.vpnClientConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.VirtualNetworkGatewayConnectionArgs.Builder)
    /**
     * @param customBgpAddresses A `customBgpAddresses` block which is documented below.
     * The block can only be used on `IPSec` / `activeactive` connections,
     * For details about see [the relevant section in the Azure documentation](https://docs.microsoft.com/en-us/azure/vpn-gateway/vpn-gateway-howto-aws-bgp).
     * @return builder
     */
    inline def customBgpAddresses(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionCustomBgpAddressesArgs.Builder]):
        com.pulumi.azure.network.VirtualNetworkGatewayConnectionArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionCustomBgpAddressesArgs.builder
      builder.customBgpAddresses(args(argsBuilder).build)

    /**
     * @param ipsecPolicy A `ipsecPolicy` block which is documented below.
     * Only a single policy can be defined for a connection. For details on
     * custom policies refer to [the relevant section in the Azure documentation](https://docs.microsoft.com/azure/vpn-gateway/vpn-gateway-ipsecikepolicy-rm-powershell).
     * @return builder
     */
    inline def ipsecPolicy(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionIpsecPolicyArgs.Builder]):
        com.pulumi.azure.network.VirtualNetworkGatewayConnectionArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionIpsecPolicyArgs.builder
      builder.ipsecPolicy(args(argsBuilder).build)

    /**
     * @param trafficSelectorPolicy One or more `trafficSelectorPolicy` blocks which are documented below.
     * A `trafficSelectorPolicy` allows to specify a traffic selector policy proposal to be used in a virtual network gateway connection.
     * For details about traffic selectors refer to [the relevant section in the Azure documentation](https://docs.microsoft.com/azure/vpn-gateway/vpn-gateway-connect-multiple-policybased-rm-ps).
     * @return builder
     */
    inline def trafficSelectorPolicy(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionTrafficSelectorPolicyArgs.Builder]):
        com.pulumi.azure.network.VirtualNetworkGatewayConnectionArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionTrafficSelectorPolicyArgs.builder
      builder.trafficSelectorPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.VirtualNetworkGatewayNatRuleArgs.Builder)
    /**
     * @param externalMappings One or more `externalMapping` blocks as documented below.
     * @return builder
     */
    inline def externalMappings(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleExternalMappingArgs.Builder]*):
        com.pulumi.azure.network.VirtualNetworkGatewayNatRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleExternalMappingArgs.builder
      builder.externalMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param internalMappings One or more `internalMapping` blocks as documented below.
     * @return builder
     */
    inline def internalMappings(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleInternalMappingArgs.Builder]*):
        com.pulumi.azure.network.VirtualNetworkGatewayNatRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleInternalMappingArgs.builder
      builder.internalMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.VnpGatewayNatRuleArgs.Builder)
    /**
     * @param externalMappings One of more `externalMapping` blocks as defined below.
     * @return builder
     */
    inline def externalMappings(args: Endofunction[com.pulumi.azure.network.inputs.VnpGatewayNatRuleExternalMappingArgs.Builder]*):
        com.pulumi.azure.network.VnpGatewayNatRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VnpGatewayNatRuleExternalMappingArgs.builder
      builder.externalMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param internalMappings One of more `internalMapping` blocks as defined below.
     * @return builder
     */
    inline def internalMappings(args: Endofunction[com.pulumi.azure.network.inputs.VnpGatewayNatRuleInternalMappingArgs.Builder]*):
        com.pulumi.azure.network.VnpGatewayNatRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VnpGatewayNatRuleInternalMappingArgs.builder
      builder.internalMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.VpnGatewayArgs.Builder)
    /**
     * @param bgpSettings A `bgpSettings` block as defined below.
     * @return builder
     */
    inline def bgpSettings(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsArgs.Builder]):
        com.pulumi.azure.network.VpnGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsArgs.builder
      builder.bgpSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.VpnGatewayConnectionArgs.Builder)
    /**
     * @param routing A `routing` block as defined below. If this is not specified, there will be a default route table created implicitly.
     * @return builder
     */
    inline def routing(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayConnectionRoutingArgs.Builder]):
        com.pulumi.azure.network.VpnGatewayConnectionArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayConnectionRoutingArgs.builder
      builder.routing(args(argsBuilder).build)

    /**
     * @param trafficSelectorPolicies One or more `trafficSelectorPolicy` blocks as defined below.
     * @return builder
     */
    inline def trafficSelectorPolicies(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayConnectionTrafficSelectorPolicyArgs.Builder]*):
        com.pulumi.azure.network.VpnGatewayConnectionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayConnectionTrafficSelectorPolicyArgs.builder
      builder.trafficSelectorPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param vpnLinks One or more `vpnLink` blocks as defined below.
     * @return builder
     */
    inline def vpnLinks(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkArgs.Builder]*):
        com.pulumi.azure.network.VpnGatewayConnectionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkArgs.builder
      builder.vpnLinks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.VpnServerConfigurationArgs.Builder)
    inline def azureActiveDirectoryAuthentications(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs.Builder]*):
        com.pulumi.azure.network.VpnServerConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs.builder
      builder.azureActiveDirectoryAuthentications(args.map(_(argsBuilder).build)*)

    inline def clientRevokedCertificates(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationClientRevokedCertificateArgs.Builder]*):
        com.pulumi.azure.network.VpnServerConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationClientRevokedCertificateArgs.builder
      builder.clientRevokedCertificates(args.map(_(argsBuilder).build)*)

    inline def clientRootCertificates(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationClientRootCertificateArgs.Builder]*):
        com.pulumi.azure.network.VpnServerConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationClientRootCertificateArgs.builder
      builder.clientRootCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param ipsecPolicy A `ipsecPolicy` block as defined below.
     * @return builder
     */
    inline def ipsecPolicy(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationIpsecPolicyArgs.Builder]):
        com.pulumi.azure.network.VpnServerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationIpsecPolicyArgs.builder
      builder.ipsecPolicy(args(argsBuilder).build)

    inline def radius(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusArgs.Builder]):
        com.pulumi.azure.network.VpnServerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusArgs.builder
      builder.radius(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.VpnServerConfigurationPolicyGroupArgs.Builder)
    /**
     * @param policies One or more `policy` blocks as documented below.
     * @return builder
     */
    inline def policies(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationPolicyGroupPolicyArgs.Builder]*):
        com.pulumi.azure.network.VpnServerConfigurationPolicyGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationPolicyGroupPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.VpnSiteArgs.Builder)
    /**
     * @param links One or more `link` blocks as defined below.
     * @return builder
     */
    inline def links(args: Endofunction[com.pulumi.azure.network.inputs.VpnSiteLinkArgs.Builder]*):
        com.pulumi.azure.network.VpnSiteArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnSiteLinkArgs.builder
      builder.links(args.map(_(argsBuilder).build)*)

    /**
     * @param o365Policy An `o365Policy` block as defined below.
     * @return builder
     */
    inline def o365Policy(args: Endofunction[com.pulumi.azure.network.inputs.VpnSiteO365PolicyArgs.Builder]):
        com.pulumi.azure.network.VpnSiteArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnSiteO365PolicyArgs.builder
      builder.o365Policy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingArgs.Builder)
    /**
     * @param authenticationCertificates One or more `authenticationCertificateBackend` blocks as defined below.
     * @return builder
     */
    inline def authenticationCertificates(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingAuthenticationCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingAuthenticationCertificateArgs.builder
      builder.authenticationCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param connectionDraining A `connectionDraining` block as defined below.
     * @return builder
     */
    inline def connectionDraining(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingConnectionDrainingArgs.Builder]):
        com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingConnectionDrainingArgs.builder
      builder.connectionDraining(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.ApplicationGatewayHttpListenerArgs.Builder)
    /**
     * @param customErrorConfigurations One or more `customErrorConfiguration` blocks as defined below.
     * @return builder
     */
    inline def customErrorConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayHttpListenerCustomErrorConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayHttpListenerArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayHttpListenerCustomErrorConfigurationArgs.builder
      builder.customErrorConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.ApplicationGatewayPrivateLinkConfigurationArgs.Builder)
    /**
     * @param ipConfigurations One or more `ipConfiguration` blocks as defined below.
     * 
     * &gt; **Note:** The `AllowApplicationGatewayPrivateLink` feature must be registered on the subscription before enabling private link
     * @return builder
     */
    inline def ipConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayPrivateLinkConfigurationIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayPrivateLinkConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayPrivateLinkConfigurationIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.ApplicationGatewayProbeArgs.Builder)
    /**
     * @param match A `match` block as defined above.
     * 
     * &gt; **Note:** `match` cannot be set when `protocol` is set to `Tcp` or `Tls`.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayProbeMatchArgs.Builder]):
        com.pulumi.azure.network.inputs.ApplicationGatewayProbeArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayProbeMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetArgs.Builder)
    /**
     * @param rewriteRules One or more `rewriteRule` blocks as defined below.
     * @return builder
     */
    inline def rewriteRules(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleArgs.builder
      builder.rewriteRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleArgs.Builder)
    /**
     * @param conditions One or more `condition` blocks as defined above.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleConditionArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param requestHeaderConfigurations One or more `requestHeaderConfiguration` blocks as defined above.
     * @return builder
     */
    inline def requestHeaderConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfigurationArgs.builder
      builder.requestHeaderConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeaderConfigurations One or more `responseHeaderConfiguration` blocks as defined above.
     * @return builder
     */
    inline def responseHeaderConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleResponseHeaderConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleResponseHeaderConfigurationArgs.builder
      builder.responseHeaderConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param url One `url` block as defined below
     * @return builder
     */
    inline def url(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleUrlArgs.Builder]):
        com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetRewriteRuleUrlArgs.builder
      builder.url(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.ApplicationGatewaySslProfileArgs.Builder)
    /**
     * @param sslPolicy a `sslPolicy` block as defined below.
     * @return builder
     */
    inline def sslPolicy(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewaySslProfileSslPolicyArgs.Builder]):
        com.pulumi.azure.network.inputs.ApplicationGatewaySslProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewaySslProfileSslPolicyArgs.builder
      builder.sslPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder)
    /**
     * @param authenticationCertificates One or more `authenticationCertificate` blocks as defined below.
     * @return builder
     */
    inline def authenticationCertificates(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayAuthenticationCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayAuthenticationCertificateArgs.builder
      builder.authenticationCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param autoscaleConfiguration An `autoscaleConfiguration` block as defined below.
     * @return builder
     */
    inline def autoscaleConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayAutoscaleConfigurationArgs.Builder]):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayAutoscaleConfigurationArgs.builder
      builder.autoscaleConfiguration(args(argsBuilder).build)

    /**
     * @param backendAddressPools One or more `backendAddressPool` blocks as defined below.
     * @return builder
     */
    inline def backendAddressPools(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayBackendAddressPoolArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayBackendAddressPoolArgs.builder
      builder.backendAddressPools(args.map(_(argsBuilder).build)*)

    /**
     * @param backendHttpSettings One or more `backendHttpSettings` blocks as defined below.
     * 
     * &gt; **Note:** At least one of `backendHttpSettings` or `backend` must be specified.
     * @return builder
     */
    inline def backendHttpSettings(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingArgs.builder
      builder.backendHttpSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param backends One or more `backend` blocks as defined below.
     * 
     * &gt; **Note:** At least one of `backendHttpSettings` or `backend` must be specified.
     * @return builder
     */
    inline def backends(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayBackendArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayBackendArgs.builder
      builder.backends(args.map(_(argsBuilder).build)*)

    /**
     * @param customErrorConfigurations One or more `customErrorConfiguration` blocks as defined below.
     * @return builder
     */
    inline def customErrorConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayCustomErrorConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayCustomErrorConfigurationArgs.builder
      builder.customErrorConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param frontendIpConfigurations One or more `frontendIpConfiguration` blocks as defined below.
     * @return builder
     */
    inline def frontendIpConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayFrontendIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayFrontendIpConfigurationArgs.builder
      builder.frontendIpConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param frontendPorts One or more `frontendPort` blocks as defined below.
     * @return builder
     */
    inline def frontendPorts(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayFrontendPortArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayFrontendPortArgs.builder
      builder.frontendPorts(args.map(_(argsBuilder).build)*)

    /**
     * @param gatewayIpConfigurations One or more `gatewayIpConfiguration` blocks as defined below.
     * @return builder
     */
    inline def gatewayIpConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayGatewayIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayGatewayIpConfigurationArgs.builder
      builder.gatewayIpConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param global A `global` block as defined below.
     * @return builder
     */
    inline def global(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayGlobalArgs.Builder]):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayGlobalArgs.builder
      builder.global(args(argsBuilder).build)

    /**
     * @param httpListeners One or more `httpListener` blocks as defined below.
     * 
     * &gt; **Note:** At least one of `httpListener` or `listener` must be specified.
     * @return builder
     */
    inline def httpListeners(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayHttpListenerArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayHttpListenerArgs.builder
      builder.httpListeners(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayIdentityArgs.Builder]):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param listeners One or more `listener` blocks as defined below.
     * 
     * &gt; **Note:** At least one of `httpListener` or `listener` must be specified.
     * @return builder
     */
    inline def listeners(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayListenerArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayListenerArgs.builder
      builder.listeners(args.map(_(argsBuilder).build)*)

    /**
     * @param privateEndpointConnections A list of `privateEndpointConnection` blocks as defined below.
     * @return builder
     */
    inline def privateEndpointConnections(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayPrivateEndpointConnectionArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayPrivateEndpointConnectionArgs.builder
      builder.privateEndpointConnections(args.map(_(argsBuilder).build)*)

    /**
     * @param privateLinkConfigurations One or more `privateLinkConfiguration` blocks as defined below.
     * @return builder
     */
    inline def privateLinkConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayPrivateLinkConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayPrivateLinkConfigurationArgs.builder
      builder.privateLinkConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param probes One or more `probe` blocks as defined below.
     * @return builder
     */
    inline def probes(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayProbeArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayProbeArgs.builder
      builder.probes(args.map(_(argsBuilder).build)*)

    /**
     * @param redirectConfigurations One or more `redirectConfiguration` blocks as defined below.
     * @return builder
     */
    inline def redirectConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRedirectConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRedirectConfigurationArgs.builder
      builder.redirectConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param requestRoutingRules One or more `requestRoutingRule` blocks as defined below.
     * 
     * &gt; **Note:** At least one of `requestRoutingRule` or `routingRule` must be specified.
     * @return builder
     */
    inline def requestRoutingRules(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRequestRoutingRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRequestRoutingRuleArgs.builder
      builder.requestRoutingRules(args.map(_(argsBuilder).build)*)

    /**
     * @param rewriteRuleSets One or more `rewriteRuleSet` blocks as defined below. Only valid for v2 WAF and Standard SKUs.
     * @return builder
     */
    inline def rewriteRuleSets(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRewriteRuleSetArgs.builder
      builder.rewriteRuleSets(args.map(_(argsBuilder).build)*)

    /**
     * @param routingRules One or more `routingRule` blocks as defined below.
     * 
     * &gt; **Note:** At least one of `requestRoutingRule` or `routingRule` must be specified.
     * @return builder
     */
    inline def routingRules(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayRoutingRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayRoutingRuleArgs.builder
      builder.routingRules(args.map(_(argsBuilder).build)*)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewaySkuArgs.Builder]):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewaySkuArgs.builder
      builder.sku(args(argsBuilder).build)

    /**
     * @param sslCertificates One or more `sslCertificate` blocks as defined below.
     * @return builder
     */
    inline def sslCertificates(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewaySslCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewaySslCertificateArgs.builder
      builder.sslCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param sslPolicy a `sslPolicy` block as defined below.
     * @return builder
     */
    inline def sslPolicy(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewaySslPolicyArgs.Builder]):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewaySslPolicyArgs.builder
      builder.sslPolicy(args(argsBuilder).build)

    /**
     * @param sslProfiles One or more `sslProfile` blocks as defined below.
     * @return builder
     */
    inline def sslProfiles(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewaySslProfileArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewaySslProfileArgs.builder
      builder.sslProfiles(args.map(_(argsBuilder).build)*)

    /**
     * @param trustedClientCertificates One or more `trustedClientCertificate` blocks as defined below.
     * @return builder
     */
    inline def trustedClientCertificates(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayTrustedClientCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayTrustedClientCertificateArgs.builder
      builder.trustedClientCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param trustedRootCertificates One or more `trustedRootCertificate` blocks as defined below.
     * @return builder
     */
    inline def trustedRootCertificates(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayTrustedRootCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayTrustedRootCertificateArgs.builder
      builder.trustedRootCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param urlPathMaps One or more `urlPathMap` blocks as defined below.
     * @return builder
     */
    inline def urlPathMaps(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayUrlPathMapArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayUrlPathMapArgs.builder
      builder.urlPathMaps(args.map(_(argsBuilder).build)*)

    /**
     * @param wafConfiguration A `wafConfiguration` block as defined below.
     * @return builder
     */
    inline def wafConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationArgs.Builder]):
        com.pulumi.azure.network.inputs.ApplicationGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationArgs.builder
      builder.wafConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.ApplicationGatewayUrlPathMapArgs.Builder)
    /**
     * @param pathRules One or more `pathRule` blocks as defined above.
     * @return builder
     */
    inline def pathRules(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayUrlPathMapPathRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayUrlPathMapArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayUrlPathMapPathRuleArgs.builder
      builder.pathRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationArgs.Builder)
    /**
     * @param disabledRuleGroups One or more `disabledRuleGroup` blocks as defined below.
     * @return builder
     */
    inline def disabledRuleGroups(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationDisabledRuleGroupArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationDisabledRuleGroupArgs.builder
      builder.disabledRuleGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param exclusions One or more `exclusion` blocks as defined below.
     * @return builder
     */
    inline def exclusions(args: Endofunction[com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationExclusionArgs.Builder]*):
        com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ApplicationGatewayWafConfigurationExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringIpv6Args.Builder)
    /**
     * @param microsoftPeering A `microsoftPeering` block as defined below.
     * @return builder
     */
    inline def microsoftPeering(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringIpv6MicrosoftPeeringArgs.Builder]):
        com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringIpv6Args.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringIpv6MicrosoftPeeringArgs.builder
      builder.microsoftPeering(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringState.Builder)
    /**
     * @param ipv6 A `ipv6` block as defined below.
     * @return builder
     */
    inline def ipv6(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringIpv6Args.Builder]):
        com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringIpv6Args.builder
      builder.ipv6(args(argsBuilder).build)

    /**
     * @param microsoftPeeringConfig A `microsoftPeeringConfig` block as defined below. Required when `peeringType` is set to `MicrosoftPeering` and config for IPv4.
     * @return builder
     */
    inline def microsoftPeeringConfig(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringMicrosoftPeeringConfigArgs.Builder]):
        com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringMicrosoftPeeringConfigArgs.builder
      builder.microsoftPeeringConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.ExpressRouteCircuitState.Builder)
    /**
     * @param sku A `sku` block for the ExpressRoute circuit as documented below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRouteCircuitSkuArgs.Builder]):
        com.pulumi.azure.network.inputs.ExpressRouteCircuitState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRouteCircuitSkuArgs.builder
      builder.sku(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.ExpressRouteConnectionRoutingArgs.Builder)
    /**
     * @param propagatedRouteTable A `propagatedRouteTable` block as defined below.
     * @return builder
     */
    inline def propagatedRouteTable(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRouteConnectionRoutingPropagatedRouteTableArgs.Builder]):
        com.pulumi.azure.network.inputs.ExpressRouteConnectionRoutingArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRouteConnectionRoutingPropagatedRouteTableArgs.builder
      builder.propagatedRouteTable(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.ExpressRouteConnectionState.Builder)
    /**
     * @param routing A `routing` block as defined below.
     * @return builder
     */
    inline def routing(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRouteConnectionRoutingArgs.Builder]):
        com.pulumi.azure.network.inputs.ExpressRouteConnectionState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRouteConnectionRoutingArgs.builder
      builder.routing(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.ExpressRoutePortState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRoutePortIdentityArgs.Builder]):
        com.pulumi.azure.network.inputs.ExpressRoutePortState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRoutePortIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param link1 A list of `link` blocks as defined below.
     * @return builder
     */
    inline def link1(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRoutePortLink1Args.Builder]):
        com.pulumi.azure.network.inputs.ExpressRoutePortState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRoutePortLink1Args.builder
      builder.link1(args(argsBuilder).build)

    /**
     * @param link2 A list of `link` blocks as defined below.
     * @return builder
     */
    inline def link2(args: Endofunction[com.pulumi.azure.network.inputs.ExpressRoutePortLink2Args.Builder]):
        com.pulumi.azure.network.inputs.ExpressRoutePortState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ExpressRoutePortLink2Args.builder
      builder.link2(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.FirewallApplicationRuleCollectionRuleArgs.Builder)
    /**
     * @param protocols One or more `protocol` blocks as defined below.
     * @return builder
     */
    inline def protocols(args: Endofunction[com.pulumi.azure.network.inputs.FirewallApplicationRuleCollectionRuleProtocolArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallApplicationRuleCollectionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallApplicationRuleCollectionRuleProtocolArgs.builder
      builder.protocols(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.FirewallApplicationRuleCollectionState.Builder)
    /**
     * @param rules One or more `rule` blocks as defined below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.network.inputs.FirewallApplicationRuleCollectionRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallApplicationRuleCollectionState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallApplicationRuleCollectionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.FirewallNatRuleCollectionState.Builder)
    /**
     * @param rules One or more `rule` blocks as defined below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.network.inputs.FirewallNatRuleCollectionRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallNatRuleCollectionState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallNatRuleCollectionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.FirewallNetworkRuleCollectionState.Builder)
    /**
     * @param rules One or more `rule` blocks as defined below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.network.inputs.FirewallNetworkRuleCollectionRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallNetworkRuleCollectionState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallNetworkRuleCollectionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.FirewallPolicyInsightsArgs.Builder)
    /**
     * @param logAnalyticsWorkspaces A list of `logAnalyticsWorkspace` block as defined below.
     * @return builder
     */
    inline def logAnalyticsWorkspaces(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyInsightsLogAnalyticsWorkspaceArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyInsightsArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyInsightsLogAnalyticsWorkspaceArgs.builder
      builder.logAnalyticsWorkspaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionArgs.Builder)
    /**
     * @param signatureOverrides One or more `signatureOverrides` blocks as defined below.
     * @return builder
     */
    inline def signatureOverrides(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionSignatureOverrideArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionSignatureOverrideArgs.builder
      builder.signatureOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param trafficBypasses One or more `trafficBypass` blocks as defined below.
     * @return builder
     */
    inline def trafficBypasses(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionTrafficBypassArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionTrafficBypassArgs.builder
      builder.trafficBypasses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs.Builder)
    /**
     * @param rules One or more `applicationRule` blocks as defined below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs.Builder)
    /**
     * @param httpHeaders Specifies a list of HTTP/HTTPS headers to insert. One or more `httpHeaders` blocks as defined below.
     * @return builder
     */
    inline def httpHeaders(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleHttpHeaderArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleHttpHeaderArgs.builder
      builder.httpHeaders(args.map(_(argsBuilder).build)*)

    inline def protocols(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs.builder
      builder.protocols(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionArgs.Builder)
    /**
     * @param rules A `natRule` block as defined below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionArgs.Builder)
    /**
     * @param rules One or more `networkRule` blocks as defined below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupState.Builder)
    /**
     * @param applicationRuleCollections One or more `applicationRuleCollection` blocks as defined below.
     * @return builder
     */
    inline def applicationRuleCollections(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs.builder
      builder.applicationRuleCollections(args.map(_(argsBuilder).build)*)

    /**
     * @param natRuleCollections One or more `natRuleCollection` blocks as defined below.
     * @return builder
     */
    inline def natRuleCollections(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionArgs.builder
      builder.natRuleCollections(args.map(_(argsBuilder).build)*)

    /**
     * @param networkRuleCollections One or more `networkRuleCollection` blocks as defined below.
     * @return builder
     */
    inline def networkRuleCollections(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionArgs.builder
      builder.networkRuleCollections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.FirewallPolicyState.Builder)
    /**
     * @param dns A `dns` block as defined below.
     * @return builder
     */
    inline def dns(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyDnsArgs.Builder]):
        com.pulumi.azure.network.inputs.FirewallPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyDnsArgs.builder
      builder.dns(args(argsBuilder).build)

    /**
     * @param explicitProxy A `explicitProxy` block as defined below.
     * @return builder
     */
    inline def explicitProxy(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyExplicitProxyArgs.Builder]):
        com.pulumi.azure.network.inputs.FirewallPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyExplicitProxyArgs.builder
      builder.explicitProxy(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyIdentityArgs.Builder]):
        com.pulumi.azure.network.inputs.FirewallPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param insights An `insights` block as defined below.
     * @return builder
     */
    inline def insights(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyInsightsArgs.Builder]):
        com.pulumi.azure.network.inputs.FirewallPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyInsightsArgs.builder
      builder.insights(args(argsBuilder).build)

    /**
     * @param intrusionDetection A `intrusionDetection` block as defined below.
     * @return builder
     */
    inline def intrusionDetection(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionArgs.Builder]):
        com.pulumi.azure.network.inputs.FirewallPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyIntrusionDetectionArgs.builder
      builder.intrusionDetection(args(argsBuilder).build)

    /**
     * @param threatIntelligenceAllowlist A `threatIntelligenceAllowlist` block as defined below.
     * @return builder
     */
    inline def threatIntelligenceAllowlist(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyThreatIntelligenceAllowlistArgs.Builder]):
        com.pulumi.azure.network.inputs.FirewallPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyThreatIntelligenceAllowlistArgs.builder
      builder.threatIntelligenceAllowlist(args(argsBuilder).build)

    /**
     * @param tlsCertificate A `tlsCertificate` block as defined below.
     * @return builder
     */
    inline def tlsCertificate(args: Endofunction[com.pulumi.azure.network.inputs.FirewallPolicyTlsCertificateArgs.Builder]):
        com.pulumi.azure.network.inputs.FirewallPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallPolicyTlsCertificateArgs.builder
      builder.tlsCertificate(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.FirewallState.Builder)
    /**
     * @param ipConfigurations An `ipConfiguration` block as documented below.
     * @return builder
     */
    inline def ipConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.FirewallIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.FirewallState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.FirewallIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param managementIpConfiguration A `managementIpConfiguration` block as documented below, which allows force-tunnelling of traffic to be performed by the firewall. Adding or removing this block or changing the `subnetId` in an existing block forces a new resource to be created. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def managementIpConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.FirewallManagementIpConfigurationArgs.Builder]):
        com.pulumi.azure.network.inputs.FirewallState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallManagementIpConfigurationArgs.builder
      builder.managementIpConfiguration(args(argsBuilder).build)

    /**
     * @param virtualHub A `virtualHub` block as documented below.
     * @return builder
     */
    inline def virtualHub(args: Endofunction[com.pulumi.azure.network.inputs.FirewallVirtualHubArgs.Builder]):
        com.pulumi.azure.network.inputs.FirewallState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.FirewallVirtualHubArgs.builder
      builder.virtualHub(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.LocalNetworkGatewayState.Builder)
    /**
     * @param bgpSettings A `bgpSettings` block as defined below containing the Local Network Gateway&#39;s BGP speaker settings.
     * @return builder
     */
    inline def bgpSettings(args: Endofunction[com.pulumi.azure.network.inputs.LocalNetworkGatewayBgpSettingsArgs.Builder]):
        com.pulumi.azure.network.inputs.LocalNetworkGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.LocalNetworkGatewayBgpSettingsArgs.builder
      builder.bgpSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointArgs.Builder)
    /**
     * @param filter A `filter` block as defined below.
     * @return builder
     */
    inline def filter(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointFilterArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointFilterArgs.Builder)
    /**
     * @param items A `item` block as defined below.
     * @return builder
     */
    inline def items(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointFilterItemArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointFilterItemArgs.builder
      builder.items(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.NetworkConnectionMonitorState.Builder)
    /**
     * @param endpoints A `endpoint` block as defined below.
     * @return builder
     */
    inline def endpoints(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkConnectionMonitorState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param testConfigurations A `testConfiguration` block as defined below.
     * @return builder
     */
    inline def testConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkConnectionMonitorState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationArgs.builder
      builder.testConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param testGroups A `testGroup` block as defined below.
     * @return builder
     */
    inline def testGroups(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestGroupArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkConnectionMonitorState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestGroupArgs.builder
      builder.testGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationArgs.Builder)
    /**
     * @param httpConfiguration A `httpConfiguration` block as defined below.
     * @return builder
     */
    inline def httpConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationHttpConfigurationArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationHttpConfigurationArgs.builder
      builder.httpConfiguration(args(argsBuilder).build)

    /**
     * @param icmpConfiguration A `icmpConfiguration` block as defined below.
     * @return builder
     */
    inline def icmpConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationIcmpConfigurationArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationIcmpConfigurationArgs.builder
      builder.icmpConfiguration(args(argsBuilder).build)

    /**
     * @param successThreshold A `successThreshold` block as defined below.
     * @return builder
     */
    inline def successThreshold(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationSuccessThresholdArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationSuccessThresholdArgs.builder
      builder.successThreshold(args(argsBuilder).build)

    /**
     * @param tcpConfiguration A `tcpConfiguration` block as defined below.
     * @return builder
     */
    inline def tcpConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationTcpConfigurationArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationTcpConfigurationArgs.builder
      builder.tcpConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationHttpConfigurationArgs.Builder)
    /**
     * @param requestHeaders A `requestHeader` block as defined below.
     * @return builder
     */
    inline def requestHeaders(args: Endofunction[com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationHttpConfigurationRequestHeaderArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationHttpConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkConnectionMonitorTestConfigurationHttpConfigurationRequestHeaderArgs.builder
      builder.requestHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.NetworkInterfaceState.Builder)
    /**
     * @param ipConfigurations One or more `ipConfiguration` blocks as defined below.
     * @return builder
     */
    inline def ipConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.NetworkInterfaceIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkInterfaceState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkInterfaceIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.NetworkManagerAdminRuleState.Builder)
    /**
     * @param destinations One or more `destination` blocks as defined below.
     * @return builder
     */
    inline def destinations(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerAdminRuleDestinationArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkManagerAdminRuleState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerAdminRuleDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param sources One or more `source` blocks as defined below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerAdminRuleSourceArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkManagerAdminRuleState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerAdminRuleSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationState.Builder)
    /**
     * @param appliesToGroups One or more `appliesToGroup` blocks as defined below.
     * @return builder
     */
    inline def appliesToGroups(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationAppliesToGroupArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationAppliesToGroupArgs.builder
      builder.appliesToGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param hub A `hub` block as defined below.
     * @return builder
     */
    inline def hub(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationHubArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerConnectivityConfigurationHubArgs.builder
      builder.hub(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleState.Builder)
    /**
     * @param destination A `destination` block as defined below.
     * @return builder
     */
    inline def destination(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleDestinationArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param nextHop A `nextHop` block as defined below.
     * @return builder
     */
    inline def nextHop(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleNextHopArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerRoutingRuleNextHopArgs.builder
      builder.nextHop(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.NetworkManagerState.Builder)
    /**
     * @param crossTenantScopes One or more `crossTenantScopes` blocks as defined below.
     * @return builder
     */
    inline def crossTenantScopes(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerCrossTenantScopeArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkManagerState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerCrossTenantScopeArgs.builder
      builder.crossTenantScopes(args.map(_(argsBuilder).build)*)

    /**
     * @param scope A `scope` block as defined below.
     * @return builder
     */
    inline def scope(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerScopeArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkManagerState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntentState.Builder)
    /**
     * @param ipTraffic An `ipTraffic` block as defined below. Changing this forces a new Network Manager Verifier Workspace Reachability Analysis Intent to be created.
     * @return builder
     */
    inline def ipTraffic(args: Endofunction[com.pulumi.azure.network.inputs.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntentIpTrafficArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntentState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkManagerVerifierWorkspaceReachabilityAnalysisIntentIpTrafficArgs.builder
      builder.ipTraffic(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.NetworkSecurityGroupState.Builder)
    /**
     * @param securityRules A list of objects representing security rules, as defined below.
     * 
     * &gt; **NOTE** Since `securityRule` can be configured both inline and via the separate `azure.network.NetworkSecurityRule` resource, we have to explicitly set it to empty slice (`[]`) to remove it.
     * @return builder
     */
    inline def securityRules(args: Endofunction[com.pulumi.azure.network.inputs.NetworkSecurityGroupSecurityRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.NetworkSecurityGroupState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.NetworkSecurityGroupSecurityRuleArgs.builder
      builder.securityRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.NetworkWatcherFlowLogState.Builder)
    /**
     * @param retentionPolicy A `retentionPolicy` block as documented below.
     * @return builder
     */
    inline def retentionPolicy(args: Endofunction[com.pulumi.azure.network.inputs.NetworkWatcherFlowLogRetentionPolicyArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkWatcherFlowLogState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkWatcherFlowLogRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

    /**
     * @param trafficAnalytics A `trafficAnalytics` block as documented below.
     * @return builder
     */
    inline def trafficAnalytics(args: Endofunction[com.pulumi.azure.network.inputs.NetworkWatcherFlowLogTrafficAnalyticsArgs.Builder]):
        com.pulumi.azure.network.inputs.NetworkWatcherFlowLogState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.NetworkWatcherFlowLogTrafficAnalyticsArgs.builder
      builder.trafficAnalytics(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationArgs.Builder)
    /**
     * @param route A `route` block as defined below.
     * @return builder
     */
    inline def route(args: Endofunction[com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationRouteArgs.Builder]):
        com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationRouteArgs.builder
      builder.route(args(argsBuilder).build)

    /**
     * @param vpnClientAddressPool A `vpnClientAddressPool` block as defined below.
     * @return builder
     */
    inline def vpnClientAddressPool(args: Endofunction[com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationVpnClientAddressPoolArgs.Builder]):
        com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationVpnClientAddressPoolArgs.builder
      builder.vpnClientAddressPool(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationRouteArgs.Builder)
    /**
     * @param propagatedRouteTable A `propagatedRouteTable` block as defined below.
     * @return builder
     */
    inline def propagatedRouteTable(args: Endofunction[com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs.Builder]):
        com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationRouteArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs.builder
      builder.propagatedRouteTable(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.PointToPointVpnGatewayState.Builder)
    /**
     * @param connectionConfigurations A `connectionConfiguration` block as defined below.
     * @return builder
     */
    inline def connectionConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.PointToPointVpnGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationArgs.builder
      builder.connectionConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.ProfileContainerNetworkInterfaceArgs.Builder)
    /**
     * @param ipConfigurations One or more `ipConfiguration` blocks as documented below.
     * @return builder
     */
    inline def ipConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.ProfileContainerNetworkInterfaceIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.ProfileContainerNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.ProfileContainerNetworkInterfaceIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.ProfileState.Builder)
    /**
     * @param containerNetworkInterface A `containerNetworkInterface` block as documented below.
     * @return builder
     */
    inline def containerNetworkInterface(args: Endofunction[com.pulumi.azure.network.inputs.ProfileContainerNetworkInterfaceArgs.Builder]):
        com.pulumi.azure.network.inputs.ProfileState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.ProfileContainerNetworkInterfaceArgs.builder
      builder.containerNetworkInterface(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.RouteFilterState.Builder)
    /**
     * @param rule A `rule` block as defined below.
     * @return builder
     */
    inline def rule(args: Endofunction[com.pulumi.azure.network.inputs.RouteFilterRuleArgs.Builder]):
        com.pulumi.azure.network.inputs.RouteFilterState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.RouteFilterRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.RouteMapRuleActionArgs.Builder)
    /**
     * @param parameters A `parameter` block as defined below. Required if `type` is anything other than `Drop`.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.azure.network.inputs.RouteMapRuleActionParameterArgs.Builder]*):
        com.pulumi.azure.network.inputs.RouteMapRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.RouteMapRuleActionParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.RouteMapRuleArgs.Builder)
    /**
     * @param actions An `action` block as defined below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.azure.network.inputs.RouteMapRuleActionArgs.Builder]*):
        com.pulumi.azure.network.inputs.RouteMapRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.RouteMapRuleActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param matchCriterions A `matchCriterion` block as defined below.
     * @return builder
     */
    inline def matchCriterions(args: Endofunction[com.pulumi.azure.network.inputs.RouteMapRuleMatchCriterionArgs.Builder]*):
        com.pulumi.azure.network.inputs.RouteMapRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.RouteMapRuleMatchCriterionArgs.builder
      builder.matchCriterions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.RouteMapState.Builder)
    /**
     * @param rules A `rule` block as defined below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.network.inputs.RouteMapRuleArgs.Builder]*):
        com.pulumi.azure.network.inputs.RouteMapState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.RouteMapRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.RouteTableState.Builder)
    /**
     * @param routes A list of objects representing routes. Each object accepts the arguments documented below.
     * 
     * &gt; **NOTE** Since `route` can be configured both inline and via the separate `azure.network.Route` resource, we have to explicitly set it to empty slice (`[]`) to remove it.
     * @return builder
     */
    inline def routes(args: Endofunction[com.pulumi.azure.network.inputs.RouteTableRouteArgs.Builder]*):
        com.pulumi.azure.network.inputs.RouteTableState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.RouteTableRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.RoutingIntentState.Builder)
    /**
     * @param routingPolicies One or more `routingPolicy` blocks as defined below.
     * @return builder
     */
    inline def routingPolicies(args: Endofunction[com.pulumi.azure.network.inputs.RoutingIntentRoutingPolicyArgs.Builder]*):
        com.pulumi.azure.network.inputs.RoutingIntentState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.RoutingIntentRoutingPolicyArgs.builder
      builder.routingPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.SubnetDelegationArgs.Builder)
    /**
     * @param serviceDelegation A `serviceDelegation` block as defined below.
     * @return builder
     */
    inline def serviceDelegation(args: Endofunction[com.pulumi.azure.network.inputs.SubnetDelegationServiceDelegationArgs.Builder]):
        com.pulumi.azure.network.inputs.SubnetDelegationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.SubnetDelegationServiceDelegationArgs.builder
      builder.serviceDelegation(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.SubnetServiceEndpointStoragePolicyState.Builder)
    /**
     * @param definitions A `definition` block as defined below
     * @return builder
     */
    inline def definitions(args: Endofunction[com.pulumi.azure.network.inputs.SubnetServiceEndpointStoragePolicyDefinitionArgs.Builder]*):
        com.pulumi.azure.network.inputs.SubnetServiceEndpointStoragePolicyState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.SubnetServiceEndpointStoragePolicyDefinitionArgs.builder
      builder.definitions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.SubnetState.Builder)
    /**
     * @param delegations One or more `delegation` blocks as defined below.
     * @return builder
     */
    inline def delegations(args: Endofunction[com.pulumi.azure.network.inputs.SubnetDelegationArgs.Builder]*):
        com.pulumi.azure.network.inputs.SubnetState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.SubnetDelegationArgs.builder
      builder.delegations(args.map(_(argsBuilder).build)*)

    /**
     * @param ipAddressPool An `ipAddressPool` block as defined below.
     * 
     * &gt; **Note:** Exactly one of `addressPrefixes` or `ipAddressPool` must be specified.
     * @return builder
     */
    inline def ipAddressPool(args: Endofunction[com.pulumi.azure.network.inputs.SubnetIpAddressPoolArgs.Builder]):
        com.pulumi.azure.network.inputs.SubnetState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.SubnetIpAddressPoolArgs.builder
      builder.ipAddressPool(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointState.Builder)
    /**
     * @param customHeaders One or more `customHeader` blocks as defined below.
     * @return builder
     */
    inline def customHeaders(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointCustomHeaderArgs.Builder]*):
        com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointCustomHeaderArgs.builder
      builder.customHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param subnets One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def subnets(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointSubnetArgs.Builder]*):
        com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointState.Builder)
    /**
     * @param customHeaders One or more `customHeader` blocks as defined below.
     * @return builder
     */
    inline def customHeaders(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointCustomHeaderArgs.Builder]*):
        com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointCustomHeaderArgs.builder
      builder.customHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param subnets One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def subnets(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointSubnetArgs.Builder]*):
        com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointState.Builder)
    /**
     * @param customHeaders One or more `customHeader` blocks as defined below.
     * @return builder
     */
    inline def customHeaders(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointCustomHeaderArgs.Builder]*):
        com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointCustomHeaderArgs.builder
      builder.customHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param subnets One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def subnets(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointSubnetArgs.Builder]*):
        com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerNestedEndpointSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.TrafficManagerProfileMonitorConfigArgs.Builder)
    /**
     * @param customHeaders One or more `customHeader` blocks as defined below.
     * @return builder
     */
    inline def customHeaders(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerProfileMonitorConfigCustomHeaderArgs.Builder]*):
        com.pulumi.azure.network.inputs.TrafficManagerProfileMonitorConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerProfileMonitorConfigCustomHeaderArgs.builder
      builder.customHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.TrafficManagerProfileState.Builder)
    /**
     * @param dnsConfig This block specifies the DNS configuration of the Profile. One `dnsConfig` block as defined below.
     * @return builder
     */
    inline def dnsConfig(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerProfileDnsConfigArgs.Builder]):
        com.pulumi.azure.network.inputs.TrafficManagerProfileState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerProfileDnsConfigArgs.builder
      builder.dnsConfig(args(argsBuilder).build)

    /**
     * @param monitorConfig This block specifies the Endpoint monitoring configuration for the Profile. One `monitorConfig` block as defined below.
     * @return builder
     */
    inline def monitorConfig(args: Endofunction[com.pulumi.azure.network.inputs.TrafficManagerProfileMonitorConfigArgs.Builder]):
        com.pulumi.azure.network.inputs.TrafficManagerProfileState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.TrafficManagerProfileMonitorConfigArgs.builder
      builder.monitorConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingArgs.Builder)
    /**
     * @param propagatedRouteTable A `propagatedRouteTable` block as defined below.
     * @return builder
     */
    inline def propagatedRouteTable(args: Endofunction[com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingPropagatedRouteTableArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingPropagatedRouteTableArgs.builder
      builder.propagatedRouteTable(args(argsBuilder).build)

    /**
     * @param staticVnetRoutes A `staticVnetRoute` block as defined below.
     * @return builder
     */
    inline def staticVnetRoutes(args: Endofunction[com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingStaticVnetRouteArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingStaticVnetRouteArgs.builder
      builder.staticVnetRoutes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VirtualHubConnectionState.Builder)
    /**
     * @param routing A `routing` block as defined below.
     * @return builder
     */
    inline def routing(args: Endofunction[com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualHubConnectionState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualHubConnectionRoutingArgs.builder
      builder.routing(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.VirtualHubRouteTableState.Builder)
    /**
     * @param routes One or more `route` blocks as defined below.
     * @return builder
     */
    inline def routes(args: Endofunction[com.pulumi.azure.network.inputs.VirtualHubRouteTableRouteArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualHubRouteTableState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualHubRouteTableRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VirtualHubState.Builder)
    /**
     * @param routes One or more `route` blocks as defined below.
     * @return builder
     */
    inline def routes(args: Endofunction[com.pulumi.azure.network.inputs.VirtualHubRouteArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualHubState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualHubRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VirtualNetworkGatewayBgpSettingsArgs.Builder)
    /**
     * @param peeringAddresses A list of `peeringAddresses` blocks as defined below. Only one `peeringAddresses` block can be specified except when `activeActive` of this Virtual Network Gateway is `true`.
     * @return builder
     */
    inline def peeringAddresses(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayBgpSettingsPeeringAddressArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayBgpSettingsArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayBgpSettingsPeeringAddressArgs.builder
      builder.peeringAddresses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionState.Builder)
    /**
     * @param customBgpAddresses A `customBgpAddresses` block which is documented below.
     * The block can only be used on `IPSec` / `activeactive` connections,
     * For details about see [the relevant section in the Azure documentation](https://docs.microsoft.com/en-us/azure/vpn-gateway/vpn-gateway-howto-aws-bgp).
     * @return builder
     */
    inline def customBgpAddresses(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionCustomBgpAddressesArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionCustomBgpAddressesArgs.builder
      builder.customBgpAddresses(args(argsBuilder).build)

    /**
     * @param ipsecPolicy A `ipsecPolicy` block which is documented below.
     * Only a single policy can be defined for a connection. For details on
     * custom policies refer to [the relevant section in the Azure documentation](https://docs.microsoft.com/azure/vpn-gateway/vpn-gateway-ipsecikepolicy-rm-powershell).
     * @return builder
     */
    inline def ipsecPolicy(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionIpsecPolicyArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionIpsecPolicyArgs.builder
      builder.ipsecPolicy(args(argsBuilder).build)

    /**
     * @param trafficSelectorPolicy One or more `trafficSelectorPolicy` blocks which are documented below.
     * A `trafficSelectorPolicy` allows to specify a traffic selector policy proposal to be used in a virtual network gateway connection.
     * For details about traffic selectors refer to [the relevant section in the Azure documentation](https://docs.microsoft.com/azure/vpn-gateway/vpn-gateway-connect-multiple-policybased-rm-ps).
     * @return builder
     */
    inline def trafficSelectorPolicy(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionTrafficSelectorPolicyArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionTrafficSelectorPolicyArgs.builder
      builder.trafficSelectorPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleState.Builder)
    /**
     * @param externalMappings One or more `externalMapping` blocks as documented below.
     * @return builder
     */
    inline def externalMappings(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleExternalMappingArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleExternalMappingArgs.builder
      builder.externalMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param internalMappings One or more `internalMapping` blocks as documented below.
     * @return builder
     */
    inline def internalMappings(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleInternalMappingArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleInternalMappingArgs.builder
      builder.internalMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VirtualNetworkGatewayPolicyGroupArgs.Builder)
    /**
     * @param policyMembers One or more `policyMember` blocks as defined below.
     * @return builder
     */
    inline def policyMembers(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayPolicyGroupPolicyMemberArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayPolicyGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayPolicyGroupPolicyMemberArgs.builder
      builder.policyMembers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VirtualNetworkGatewayState.Builder)
    /**
     * @param bgpSettings A `bgpSettings` block which is documented below. In this block the BGP specific settings can be defined.
     * @return builder
     */
    inline def bgpSettings(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayBgpSettingsArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayBgpSettingsArgs.builder
      builder.bgpSettings(args(argsBuilder).build)

    /**
     * @param customRoute A `customRoute` block as defined below. Specifies a custom routes address space for a virtual network gateway and a VpnClient.
     * @return builder
     */
    inline def customRoute(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayCustomRouteArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayCustomRouteArgs.builder
      builder.customRoute(args(argsBuilder).build)

    /**
     * @param ipConfigurations One or more (up to 3) `ipConfiguration` blocks documented below. Changing this forces a new resource to be created. An active-standby gateway requires exactly one `ipConfiguration` block, an active-active gateway requires exactly two `ipConfiguration` blocks whereas an active-active zone redundant gateway with P2S configuration requires exactly three `ipConfiguration` blocks.
     * @return builder
     */
    inline def ipConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param policyGroups One or more `policyGroup` blocks as defined below.
     * @return builder
     */
    inline def policyGroups(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayPolicyGroupArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayPolicyGroupArgs.builder
      builder.policyGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param vpnClientConfiguration A `vpnClientConfiguration` block which is documented below. In this block the Virtual Network Gateway can be configured to accept IPSec point-to-site connections.
     * @return builder
     */
    inline def vpnClientConfiguration(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationArgs.builder
      builder.vpnClientConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationArgs.Builder)
    /**
     * @param ipsecPolicy An `ipsecPolicy` block as defined below.
     * @return builder
     */
    inline def ipsecPolicy(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationIpsecPolicyArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationIpsecPolicyArgs.builder
      builder.ipsecPolicy(args(argsBuilder).build)

    /**
     * @param radiusServers One or more `radiusServer` blocks as defined below.
     * @return builder
     */
    inline def radiusServers(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationRadiusServerArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationRadiusServerArgs.builder
      builder.radiusServers(args.map(_(argsBuilder).build)*)

    /**
     * @param revokedCertificates One or more `revokedCertificate` blocks which are defined below.
     * @return builder
     */
    inline def revokedCertificates(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationRevokedCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationRevokedCertificateArgs.builder
      builder.revokedCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param rootCertificates One or more `rootCertificate` blocks which are defined below. These root certificates are used to sign the client certificate used by the VPN clients to connect to the gateway.
     * @return builder
     */
    inline def rootCertificates(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationRootCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationRootCertificateArgs.builder
      builder.rootCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param virtualNetworkGatewayClientConnections One or more `virtualNetworkGatewayClientConnection` blocks as defined below.
     * @return builder
     */
    inline def virtualNetworkGatewayClientConnections(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationVirtualNetworkGatewayClientConnectionArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationVirtualNetworkGatewayClientConnectionArgs.builder
      builder.virtualNetworkGatewayClientConnections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VirtualNetworkState.Builder)
    /**
     * @param ddosProtectionPlan A `ddosProtectionPlan` block as documented below.
     * @return builder
     */
    inline def ddosProtectionPlan(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkDdosProtectionPlanArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkDdosProtectionPlanArgs.builder
      builder.ddosProtectionPlan(args(argsBuilder).build)

    /**
     * @param encryption A `encryption` block as defined below.
     * @return builder
     */
    inline def encryption(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkEncryptionArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param ipAddressPools One or more `ipAddressPool` blocks as defined below. Only one association of each IP type(IPv4 or IPv6) is allowed.
     * 
     * &gt; **Note:** Exactly one of `addressSpace` or `ipAddressPool` must be specified.
     * @return builder
     */
    inline def ipAddressPools(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkIpAddressPoolArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkIpAddressPoolArgs.builder
      builder.ipAddressPools(args.map(_(argsBuilder).build)*)

    /**
     * @param subnets Can be specified multiple times to define multiple subnets. Each `subnet` block supports fields documented below.
     * 
     * &gt; **NOTE** Since `subnet` can be configured both inline and via the separate `azure.network.Subnet` resource, we have to explicitly set it to empty slice (`[]`) to remove it.
     * @return builder
     */
    inline def subnets(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkSubnetArgs.Builder]*):
        com.pulumi.azure.network.inputs.VirtualNetworkState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VirtualNetworkSubnetArgs.Builder)
    /**
     * @param delegation One or more `delegation` blocks as defined below.
     * @return builder
     */
    inline def delegation(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkSubnetDelegationArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkSubnetArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkSubnetDelegationArgs.builder
      builder.delegation(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.VirtualNetworkSubnetDelegationArgs.Builder)
    /**
     * @param serviceDelegation A `serviceDelegation` block as defined below.
     * @return builder
     */
    inline def serviceDelegation(args: Endofunction[com.pulumi.azure.network.inputs.VirtualNetworkSubnetDelegationServiceDelegationArgs.Builder]):
        com.pulumi.azure.network.inputs.VirtualNetworkSubnetDelegationArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VirtualNetworkSubnetDelegationServiceDelegationArgs.builder
      builder.serviceDelegation(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.VnpGatewayNatRuleState.Builder)
    /**
     * @param externalMappings One of more `externalMapping` blocks as defined below.
     * @return builder
     */
    inline def externalMappings(args: Endofunction[com.pulumi.azure.network.inputs.VnpGatewayNatRuleExternalMappingArgs.Builder]*):
        com.pulumi.azure.network.inputs.VnpGatewayNatRuleState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VnpGatewayNatRuleExternalMappingArgs.builder
      builder.externalMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param internalMappings One of more `internalMapping` blocks as defined below.
     * @return builder
     */
    inline def internalMappings(args: Endofunction[com.pulumi.azure.network.inputs.VnpGatewayNatRuleInternalMappingArgs.Builder]*):
        com.pulumi.azure.network.inputs.VnpGatewayNatRuleState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VnpGatewayNatRuleInternalMappingArgs.builder
      builder.internalMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsArgs.Builder)
    /**
     * @param instance0BgpPeeringAddress An `instanceBgpPeeringAddress` block as defined below.
     * @return builder
     */
    inline def instance0BgpPeeringAddress(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsInstance0BgpPeeringAddressArgs.Builder]):
        com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsInstance0BgpPeeringAddressArgs.builder
      builder.instance0BgpPeeringAddress(args(argsBuilder).build)

    /**
     * @param instance1BgpPeeringAddress An `instanceBgpPeeringAddress` block as defined below.
     * @return builder
     */
    inline def instance1BgpPeeringAddress(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsInstance1BgpPeeringAddressArgs.Builder]):
        com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsInstance1BgpPeeringAddressArgs.builder
      builder.instance1BgpPeeringAddress(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.VpnGatewayConnectionRoutingArgs.Builder)
    /**
     * @param propagatedRouteTable A `propagatedRouteTable` block as defined below.
     * @return builder
     */
    inline def propagatedRouteTable(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayConnectionRoutingPropagatedRouteTableArgs.Builder]):
        com.pulumi.azure.network.inputs.VpnGatewayConnectionRoutingArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayConnectionRoutingPropagatedRouteTableArgs.builder
      builder.propagatedRouteTable(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.VpnGatewayConnectionState.Builder)
    /**
     * @param routing A `routing` block as defined below. If this is not specified, there will be a default route table created implicitly.
     * @return builder
     */
    inline def routing(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayConnectionRoutingArgs.Builder]):
        com.pulumi.azure.network.inputs.VpnGatewayConnectionState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayConnectionRoutingArgs.builder
      builder.routing(args(argsBuilder).build)

    /**
     * @param trafficSelectorPolicies One or more `trafficSelectorPolicy` blocks as defined below.
     * @return builder
     */
    inline def trafficSelectorPolicies(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayConnectionTrafficSelectorPolicyArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnGatewayConnectionState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayConnectionTrafficSelectorPolicyArgs.builder
      builder.trafficSelectorPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param vpnLinks One or more `vpnLink` blocks as defined below.
     * @return builder
     */
    inline def vpnLinks(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnGatewayConnectionState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkArgs.builder
      builder.vpnLinks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkArgs.Builder)
    /**
     * @param customBgpAddresses One or more `customBgpAddress` blocks as defined below.
     * @return builder
     */
    inline def customBgpAddresses(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkCustomBgpAddressArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkCustomBgpAddressArgs.builder
      builder.customBgpAddresses(args.map(_(argsBuilder).build)*)

    /**
     * @param ipsecPolicies One or more `ipsecPolicy` blocks as defined above.
     * @return builder
     */
    inline def ipsecPolicies(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkIpsecPolicyArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayConnectionVpnLinkIpsecPolicyArgs.builder
      builder.ipsecPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VpnGatewayState.Builder)
    /**
     * @param bgpSettings A `bgpSettings` block as defined below.
     * @return builder
     */
    inline def bgpSettings(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsArgs.Builder]):
        com.pulumi.azure.network.inputs.VpnGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsArgs.builder
      builder.bgpSettings(args(argsBuilder).build)

    /**
     * @param ipConfigurations An `ipConfiguration` block as defined below.
     * @return builder
     */
    inline def ipConfigurations(args: Endofunction[com.pulumi.azure.network.inputs.VpnGatewayIpConfigurationArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnGatewayIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VpnServerConfigurationPolicyGroupState.Builder)
    /**
     * @param policies One or more `policy` blocks as documented below.
     * @return builder
     */
    inline def policies(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationPolicyGroupPolicyArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnServerConfigurationPolicyGroupState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationPolicyGroupPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusArgs.Builder)
    /**
     * @param clientRootCertificates One or more `clientRootCertificate` blocks as defined below.
     * @return builder
     */
    inline def clientRootCertificates(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusClientRootCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusClientRootCertificateArgs.builder
      builder.clientRootCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param serverRootCertificates One or more `serverRootCertificate` blocks as defined below.
     * @return builder
     */
    inline def serverRootCertificates(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusServerRootCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusServerRootCertificateArgs.builder
      builder.serverRootCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param servers One or more `server` blocks as defined below.
     * @return builder
     */
    inline def servers(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusServerArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusArgs.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusServerArgs.builder
      builder.servers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.network.inputs.VpnServerConfigurationState.Builder)
    inline def azureActiveDirectoryAuthentications(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnServerConfigurationState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs.builder
      builder.azureActiveDirectoryAuthentications(args.map(_(argsBuilder).build)*)

    inline def clientRevokedCertificates(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationClientRevokedCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnServerConfigurationState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationClientRevokedCertificateArgs.builder
      builder.clientRevokedCertificates(args.map(_(argsBuilder).build)*)

    inline def clientRootCertificates(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationClientRootCertificateArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnServerConfigurationState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationClientRootCertificateArgs.builder
      builder.clientRootCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param ipsecPolicy A `ipsecPolicy` block as defined below.
     * @return builder
     */
    inline def ipsecPolicy(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationIpsecPolicyArgs.Builder]):
        com.pulumi.azure.network.inputs.VpnServerConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationIpsecPolicyArgs.builder
      builder.ipsecPolicy(args(argsBuilder).build)

    inline def radius(args: Endofunction[com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusArgs.Builder]):
        com.pulumi.azure.network.inputs.VpnServerConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusArgs.builder
      builder.radius(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.VpnSiteLinkArgs.Builder)
    /**
     * @param bgp A `bgp` block as defined above.
     * 
     * &gt; **Note:** The `link.bgp` has to be set when the `addressCidrs` isn&#39;t specified.
     * @return builder
     */
    inline def bgp(args: Endofunction[com.pulumi.azure.network.inputs.VpnSiteLinkBgpArgs.Builder]):
        com.pulumi.azure.network.inputs.VpnSiteLinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnSiteLinkBgpArgs.builder
      builder.bgp(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.VpnSiteO365PolicyArgs.Builder)
    /**
     * @param trafficCategory A `trafficCategory` block as defined above.
     * @return builder
     */
    inline def trafficCategory(args: Endofunction[com.pulumi.azure.network.inputs.VpnSiteO365PolicyTrafficCategoryArgs.Builder]):
        com.pulumi.azure.network.inputs.VpnSiteO365PolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnSiteO365PolicyTrafficCategoryArgs.builder
      builder.trafficCategory(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.network.inputs.VpnSiteState.Builder)
    /**
     * @param links One or more `link` blocks as defined below.
     * @return builder
     */
    inline def links(args: Endofunction[com.pulumi.azure.network.inputs.VpnSiteLinkArgs.Builder]*):
        com.pulumi.azure.network.inputs.VpnSiteState.Builder =
      def argsBuilder = com.pulumi.azure.network.inputs.VpnSiteLinkArgs.builder
      builder.links(args.map(_(argsBuilder).build)*)

    /**
     * @param o365Policy An `o365Policy` block as defined below.
     * @return builder
     */
    inline def o365Policy(args: Endofunction[com.pulumi.azure.network.inputs.VpnSiteO365PolicyArgs.Builder]):
        com.pulumi.azure.network.inputs.VpnSiteState.Builder =
      val argsBuilder = com.pulumi.azure.network.inputs.VpnSiteO365PolicyArgs.builder
      builder.o365Policy(args(argsBuilder).build)
