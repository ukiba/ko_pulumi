package jp.ukiba.ko_pulumi
package cloudflare

object cloudflare_ext2:
  extension (builder: com.pulumi.cloudflare.inputs.MagicTransitSiteLanRoutedSubnetArgs.Builder)
    def nat(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitSiteLanRoutedSubnetNatArgs.Builder]):
        com.pulumi.cloudflare.inputs.MagicTransitSiteLanRoutedSubnetArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitSiteLanRoutedSubnetNatArgs.builder
      builder.nat(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.MagicTransitSiteLanState.Builder)
    def nat(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitSiteLanNatArgs.Builder]):
        com.pulumi.cloudflare.inputs.MagicTransitSiteLanState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitSiteLanNatArgs.builder
      builder.nat(args(argsBuilder).build)

    def routedSubnets(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitSiteLanRoutedSubnetArgs.Builder]*):
        com.pulumi.cloudflare.inputs.MagicTransitSiteLanState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitSiteLanRoutedSubnetArgs.builder
      builder.routedSubnets(args.map(_(argsBuilder).build)*)

    /**
     * @param staticAddressing If the site is not configured in high availability mode, this configuration is optional (if omitted, use DHCP). However, if in high availability mode, static*address is required along with secondary and virtual address.
     * @return builder
     */
    def staticAddressing(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitSiteLanStaticAddressingArgs.Builder]):
        com.pulumi.cloudflare.inputs.MagicTransitSiteLanState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitSiteLanStaticAddressingArgs.builder
      builder.staticAddressing(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.MagicTransitSiteLanStaticAddressingArgs.Builder)
    def dhcpRelay(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitSiteLanStaticAddressingDhcpRelayArgs.Builder]):
        com.pulumi.cloudflare.inputs.MagicTransitSiteLanStaticAddressingArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitSiteLanStaticAddressingDhcpRelayArgs.builder
      builder.dhcpRelay(args(argsBuilder).build)

    def dhcpServer(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitSiteLanStaticAddressingDhcpServerArgs.Builder]):
        com.pulumi.cloudflare.inputs.MagicTransitSiteLanStaticAddressingArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitSiteLanStaticAddressingDhcpServerArgs.builder
      builder.dhcpServer(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.MagicTransitSiteLanStaticAddressingDhcpServerArgs.Builder)
    /**
     * @param dhcpOptions Optional list of custom DHCP options to include in DHCP responses. Only valid when DHCP server is enabled.
     * @return builder
     */
    def dhcpOptions(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitSiteLanStaticAddressingDhcpServerDhcpOptionArgs.Builder]*):
        com.pulumi.cloudflare.inputs.MagicTransitSiteLanStaticAddressingDhcpServerArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitSiteLanStaticAddressingDhcpServerDhcpOptionArgs.builder
      builder.dhcpOptions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.MagicTransitSiteState.Builder)
    /**
     * @param location Location of site in latitude and longitude.
     * @return builder
     */
    def location(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitSiteLocationArgs.Builder]):
        com.pulumi.cloudflare.inputs.MagicTransitSiteState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitSiteLocationArgs.builder
      builder.location(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.MagicTransitSiteWanState.Builder)
    /**
     * @param staticAddressing (optional) if omitted, use DHCP. Submit secondary*address when site is in high availability mode.
     * @return builder
     */
    def staticAddressing(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitSiteWanStaticAddressingArgs.Builder]):
        com.pulumi.cloudflare.inputs.MagicTransitSiteWanState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitSiteWanStaticAddressingArgs.builder
      builder.staticAddressing(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.MagicWanGreTunnelHealthCheckArgs.Builder)
    /**
     * @param target The destination address in a request type health check. After the healthcheck is decapsulated at the customer end of the tunnel, the ICMP echo will be forwarded to this address. This field defaults to `customerGreEndpoint address`. This field is ignored for bidirectional healthchecks as the interface*address (not assigned to the Cloudflare side of the tunnel) is used as the target. Must be in object form if the x-magic-new-hc-target header is set to true and string form if x-magic-new-hc-target is absent or set to false.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.cloudflare.inputs.MagicWanGreTunnelHealthCheckTargetArgs.Builder]):
        com.pulumi.cloudflare.inputs.MagicWanGreTunnelHealthCheckArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicWanGreTunnelHealthCheckTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.MagicWanGreTunnelState.Builder)
    def bgp(args: Endofunction[com.pulumi.cloudflare.inputs.MagicWanGreTunnelBgpArgs.Builder]):
        com.pulumi.cloudflare.inputs.MagicWanGreTunnelState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicWanGreTunnelBgpArgs.builder
      builder.bgp(args(argsBuilder).build)

    def bgpStatus(args: Endofunction[com.pulumi.cloudflare.inputs.MagicWanGreTunnelBgpStatusArgs.Builder]):
        com.pulumi.cloudflare.inputs.MagicWanGreTunnelState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicWanGreTunnelBgpStatusArgs.builder
      builder.bgpStatus(args(argsBuilder).build)

    def healthCheck(args: Endofunction[com.pulumi.cloudflare.inputs.MagicWanGreTunnelHealthCheckArgs.Builder]):
        com.pulumi.cloudflare.inputs.MagicWanGreTunnelState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicWanGreTunnelHealthCheckArgs.builder
      builder.healthCheck(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelHealthCheckArgs.Builder)
    /**
     * @param target The destination address in a request type health check. After the healthcheck is decapsulated at the customer end of the tunnel, the ICMP echo will be forwarded to this address. This field defaults to `customerGreEndpoint address`. This field is ignored for bidirectional healthchecks as the interface*address (not assigned to the Cloudflare side of the tunnel) is used as the target. Must be in object form if the x-magic-new-hc-target header is set to true and string form if x-magic-new-hc-target is absent or set to false.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelHealthCheckTargetArgs.Builder]):
        com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelHealthCheckArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelHealthCheckTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelState.Builder)
    def bgp(args: Endofunction[com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelBgpArgs.Builder]):
        com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelBgpArgs.builder
      builder.bgp(args(argsBuilder).build)

    def bgpStatus(args: Endofunction[com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelBgpStatusArgs.Builder]):
        com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelBgpStatusArgs.builder
      builder.bgpStatus(args(argsBuilder).build)

    def customRemoteIdentities(args: Endofunction[com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelCustomRemoteIdentitiesArgs.Builder]):
        com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelCustomRemoteIdentitiesArgs.builder
      builder.customRemoteIdentities(args(argsBuilder).build)

    def healthCheck(args: Endofunction[com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelHealthCheckArgs.Builder]):
        com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelHealthCheckArgs.builder
      builder.healthCheck(args(argsBuilder).build)

    /**
     * @param pskMetadata The PSK metadata that includes when the PSK was generated.
     * @return builder
     */
    def pskMetadata(args: Endofunction[com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelPskMetadataArgs.Builder]):
        com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelPskMetadataArgs.builder
      builder.pskMetadata(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.MagicWanStaticRouteState.Builder)
    /**
     * @param scope Used only for ECMP routes.
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.cloudflare.inputs.MagicWanStaticRouteScopeArgs.Builder]):
        com.pulumi.cloudflare.inputs.MagicWanStaticRouteState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicWanStaticRouteScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ManagedHeadersState.Builder)
    /**
     * @param managedRequestHeaders The list of Managed Request Transforms.
     * @return builder
     */
    def managedRequestHeaders(args: Endofunction[com.pulumi.cloudflare.inputs.ManagedHeadersManagedRequestHeaderArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ManagedHeadersState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ManagedHeadersManagedRequestHeaderArgs.builder
      builder.managedRequestHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param managedResponseHeaders The list of Managed Response Transforms.
     * @return builder
     */
    def managedResponseHeaders(args: Endofunction[com.pulumi.cloudflare.inputs.ManagedHeadersManagedResponseHeaderArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ManagedHeadersState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ManagedHeadersManagedResponseHeaderArgs.builder
      builder.managedResponseHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ManagedTransformsState.Builder)
    /**
     * @param managedRequestHeaders The list of Managed Request Transforms.
     * @return builder
     */
    def managedRequestHeaders(args: Endofunction[com.pulumi.cloudflare.inputs.ManagedTransformsManagedRequestHeaderArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ManagedTransformsState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ManagedTransformsManagedRequestHeaderArgs.builder
      builder.managedRequestHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param managedResponseHeaders The list of Managed Response Transforms.
     * @return builder
     */
    def managedResponseHeaders(args: Endofunction[com.pulumi.cloudflare.inputs.ManagedTransformsManagedResponseHeaderArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ManagedTransformsState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ManagedTransformsManagedResponseHeaderArgs.builder
      builder.managedResponseHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.MonetizationRulesState.Builder)
    /**
     * @param rules Full desired Payment Required ruleset. An empty array clears all payment rules. The ruleset may contain at most 40 unique wallet addresses; address comparison is case-insensitive. Every address must pass wallet screening before deployment.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.MonetizationRulesRuleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.MonetizationRulesState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.MonetizationRulesRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.MoqRelayConfigArgs.Builder)
    def lingeringSubscribe(args: Endofunction[com.pulumi.cloudflare.inputs.MoqRelayConfigLingeringSubscribeArgs.Builder]):
        com.pulumi.cloudflare.inputs.MoqRelayConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MoqRelayConfigLingeringSubscribeArgs.builder
      builder.lingeringSubscribe(args(argsBuilder).build)

    /**
     * @param upstreams Upstreams are external MOQT server publishers that a relay falls back
     * to when it has no local publisher for a requested namespace/track.
     * @return builder
     */
    def upstreams(args: Endofunction[com.pulumi.cloudflare.inputs.MoqRelayConfigUpstreamsArgs.Builder]):
        com.pulumi.cloudflare.inputs.MoqRelayConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MoqRelayConfigUpstreamsArgs.builder
      builder.upstreams(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.MoqRelayConfigUpstreamsArgs.Builder)
    /**
     * @param upstreams Ordered list of upstream MOQT server publishers. Each entry is an
     * object (not a bare string) so per-upstream configuration can be
     * added in the future without another breaking change.
     * @return builder
     */
    def upstreams(args: Endofunction[com.pulumi.cloudflare.inputs.MoqRelayConfigUpstreamsUpstreamArgs.Builder]*):
        com.pulumi.cloudflare.inputs.MoqRelayConfigUpstreamsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.MoqRelayConfigUpstreamsUpstreamArgs.builder
      builder.upstreams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.MoqRelayState.Builder)
    /**
     * @param config upstreams and lingeringSubscribe are mutually exclusive.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.MoqRelayConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.MoqRelayState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MoqRelayConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.NelSettingState.Builder)
    /**
     * @param value The NEL configuration value.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.cloudflare.inputs.NelSettingValueArgs.Builder]):
        com.pulumi.cloudflare.inputs.NelSettingState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.NelSettingValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.NotificationPolicyMechanismsArgs.Builder)
    def emails(args: Endofunction[com.pulumi.cloudflare.inputs.NotificationPolicyMechanismsEmailArgs.Builder]*):
        com.pulumi.cloudflare.inputs.NotificationPolicyMechanismsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.NotificationPolicyMechanismsEmailArgs.builder
      builder.emails(args.map(_(argsBuilder).build)*)

    def pagerduties(args: Endofunction[com.pulumi.cloudflare.inputs.NotificationPolicyMechanismsPagerdutyArgs.Builder]*):
        com.pulumi.cloudflare.inputs.NotificationPolicyMechanismsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.NotificationPolicyMechanismsPagerdutyArgs.builder
      builder.pagerduties(args.map(_(argsBuilder).build)*)

    def webhooks(args: Endofunction[com.pulumi.cloudflare.inputs.NotificationPolicyMechanismsWebhookArgs.Builder]*):
        com.pulumi.cloudflare.inputs.NotificationPolicyMechanismsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.NotificationPolicyMechanismsWebhookArgs.builder
      builder.webhooks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.NotificationPolicyState.Builder)
    /**
     * @param filters Optional filters that allow you to be alerted only on a subset of events for that alert type based on some criteria. This is only available for select alert types. See alert type documentation for more details.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.cloudflare.inputs.NotificationPolicyFiltersArgs.Builder]):
        com.pulumi.cloudflare.inputs.NotificationPolicyState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.NotificationPolicyFiltersArgs.builder
      builder.filters(args(argsBuilder).build)

    /**
     * @param mechanisms List of IDs that will be used when dispatching a notification. IDs for email type will be the email address.
     * @return builder
     */
    def mechanisms(args: Endofunction[com.pulumi.cloudflare.inputs.NotificationPolicyMechanismsArgs.Builder]):
        com.pulumi.cloudflare.inputs.NotificationPolicyState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.NotificationPolicyMechanismsArgs.builder
      builder.mechanisms(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.OauthClientState.Builder)
    /**
     * @param clientUriVerification Client URI domain control verification state.
     * @return builder
     */
    def clientUriVerification(args: Endofunction[com.pulumi.cloudflare.inputs.OauthClientClientUriVerificationArgs.Builder]):
        com.pulumi.cloudflare.inputs.OauthClientState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.OauthClientClientUriVerificationArgs.builder
      builder.clientUriVerification(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ObservatoryScheduledTestState.Builder)
    /**
     * @param schedule The test schedule.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.cloudflare.inputs.ObservatoryScheduledTestScheduleArgs.Builder]):
        com.pulumi.cloudflare.inputs.ObservatoryScheduledTestState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ObservatoryScheduledTestScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    def test(args: Endofunction[com.pulumi.cloudflare.inputs.ObservatoryScheduledTestTestArgs.Builder]):
        com.pulumi.cloudflare.inputs.ObservatoryScheduledTestState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ObservatoryScheduledTestTestArgs.builder
      builder.test(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ObservatoryScheduledTestTestArgs.Builder)
    /**
     * @param desktopReport The Lighthouse report.
     * @return builder
     */
    def desktopReport(args: Endofunction[com.pulumi.cloudflare.inputs.ObservatoryScheduledTestTestDesktopReportArgs.Builder]):
        com.pulumi.cloudflare.inputs.ObservatoryScheduledTestTestArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ObservatoryScheduledTestTestDesktopReportArgs.builder
      builder.desktopReport(args(argsBuilder).build)

    /**
     * @param mobileReport The Lighthouse report.
     * @return builder
     */
    def mobileReport(args: Endofunction[com.pulumi.cloudflare.inputs.ObservatoryScheduledTestTestMobileReportArgs.Builder]):
        com.pulumi.cloudflare.inputs.ObservatoryScheduledTestTestArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ObservatoryScheduledTestTestMobileReportArgs.builder
      builder.mobileReport(args(argsBuilder).build)

    /**
     * @param region A test region with a label.
     * @return builder
     */
    def region(args: Endofunction[com.pulumi.cloudflare.inputs.ObservatoryScheduledTestTestRegionArgs.Builder]):
        com.pulumi.cloudflare.inputs.ObservatoryScheduledTestTestArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ObservatoryScheduledTestTestRegionArgs.builder
      builder.region(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ObservatoryScheduledTestTestDesktopReportArgs.Builder)
    def error(args: Endofunction[com.pulumi.cloudflare.inputs.ObservatoryScheduledTestTestDesktopReportErrorArgs.Builder]):
        com.pulumi.cloudflare.inputs.ObservatoryScheduledTestTestDesktopReportArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ObservatoryScheduledTestTestDesktopReportErrorArgs.builder
      builder.error(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ObservatoryScheduledTestTestMobileReportArgs.Builder)
    def error(args: Endofunction[com.pulumi.cloudflare.inputs.ObservatoryScheduledTestTestMobileReportErrorArgs.Builder]):
        com.pulumi.cloudflare.inputs.ObservatoryScheduledTestTestMobileReportArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ObservatoryScheduledTestTestMobileReportErrorArgs.builder
      builder.error(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.OrganizationMetaArgs.Builder)
    /**
     * @param tenantFlags Enable features for Organizations.
     * @return builder
     */
    def tenantFlags(args: Endofunction[com.pulumi.cloudflare.inputs.OrganizationMetaTenantFlagsArgs.Builder]):
        com.pulumi.cloudflare.inputs.OrganizationMetaArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.OrganizationMetaTenantFlagsArgs.builder
      builder.tenantFlags(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.OrganizationState.Builder)
    def meta(args: Endofunction[com.pulumi.cloudflare.inputs.OrganizationMetaArgs.Builder]):
        com.pulumi.cloudflare.inputs.OrganizationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.OrganizationMetaArgs.builder
      builder.meta(args(argsBuilder).build)

    def parent(args: Endofunction[com.pulumi.cloudflare.inputs.OrganizationParentArgs.Builder]):
        com.pulumi.cloudflare.inputs.OrganizationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.OrganizationParentArgs.builder
      builder.parent(args(argsBuilder).build)

    def profile(args: Endofunction[com.pulumi.cloudflare.inputs.OrganizationProfileArgs.Builder]):
        com.pulumi.cloudflare.inputs.OrganizationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.OrganizationProfileArgs.builder
      builder.profile(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.PageRuleActionsArgs.Builder)
    def cacheKeyFields(args: Endofunction[com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsArgs.Builder]):
        com.pulumi.cloudflare.inputs.PageRuleActionsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsArgs.builder
      builder.cacheKeyFields(args(argsBuilder).build)

    def forwardingUrl(args: Endofunction[com.pulumi.cloudflare.inputs.PageRuleActionsForwardingUrlArgs.Builder]):
        com.pulumi.cloudflare.inputs.PageRuleActionsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PageRuleActionsForwardingUrlArgs.builder
      builder.forwardingUrl(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsArgs.Builder)
    def cookie(args: Endofunction[com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsCookieArgs.Builder]):
        com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsCookieArgs.builder
      builder.cookie(args(argsBuilder).build)

    def header(args: Endofunction[com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsHeaderArgs.Builder]):
        com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsHeaderArgs.builder
      builder.header(args(argsBuilder).build)

    def host(args: Endofunction[com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsHostArgs.Builder]):
        com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsHostArgs.builder
      builder.host(args(argsBuilder).build)

    def queryString(args: Endofunction[com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsQueryStringArgs.Builder]):
        com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    def user(args: Endofunction[com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsUserArgs.Builder]):
        com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsUserArgs.builder
      builder.user(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.PageRuleState.Builder)
    def actions(args: Endofunction[com.pulumi.cloudflare.inputs.PageRuleActionsArgs.Builder]):
        com.pulumi.cloudflare.inputs.PageRuleState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PageRuleActionsArgs.builder
      builder.actions(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.PagesDomainState.Builder)
    def validationData(args: Endofunction[com.pulumi.cloudflare.inputs.PagesDomainValidationDataArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesDomainState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesDomainValidationDataArgs.builder
      builder.validationData(args(argsBuilder).build)

    def verificationData(args: Endofunction[com.pulumi.cloudflare.inputs.PagesDomainVerificationDataArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesDomainState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesDomainVerificationDataArgs.builder
      builder.verificationData(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentArgs.Builder)
    /**
     * @param buildConfig Configs for the project build process.
     * @return builder
     */
    def buildConfig(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentBuildConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentBuildConfigArgs.builder
      builder.buildConfig(args(argsBuilder).build)

    /**
     * @param deploymentTrigger Info about what caused the deployment.
     * @return builder
     */
    def deploymentTrigger(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentDeploymentTriggerArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentDeploymentTriggerArgs.builder
      builder.deploymentTrigger(args(argsBuilder).build)

    /**
     * @param latestStage The status of the deployment.
     * @return builder
     */
    def latestStage(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentLatestStageArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentLatestStageArgs.builder
      builder.latestStage(args(argsBuilder).build)

    /**
     * @param source Configs for the project source control.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentSourceArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentSourceArgs.builder
      builder.source(args(argsBuilder).build)

    /**
     * @param stages List of past stages.
     * @return builder
     */
    def stages(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentStageArgs.Builder]*):
        com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentStageArgs.builder
      builder.stages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentDeploymentTriggerArgs.Builder)
    /**
     * @param metadata Additional info about the trigger.
     * @return builder
     */
    def metadata(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentDeploymentTriggerMetadataArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentDeploymentTriggerArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentDeploymentTriggerMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentSourceArgs.Builder)
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentSourceConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentSourceArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentSourceConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsArgs.Builder)
    /**
     * @param preview Configs for preview deploys.
     * @return builder
     */
    def preview(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsPreviewArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsPreviewArgs.builder
      builder.preview(args(argsBuilder).build)

    /**
     * @param production Configs for production deploys.
     * @return builder
     */
    def production(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsProductionArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsProductionArgs.builder
      builder.production(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsPreviewArgs.Builder)
    /**
     * @param limits Limits for Pages Functions.
     * @return builder
     */
    def limits(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsPreviewLimitsArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsPreviewArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsPreviewLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    /**
     * @param placement Placement setting used for Pages Functions.
     * @return builder
     */
    def placement(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsPreviewPlacementArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsPreviewArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsPreviewPlacementArgs.builder
      builder.placement(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsProductionArgs.Builder)
    /**
     * @param limits Limits for Pages Functions.
     * @return builder
     */
    def limits(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsProductionLimitsArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsProductionArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsProductionLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    /**
     * @param placement Placement setting used for Pages Functions.
     * @return builder
     */
    def placement(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsProductionPlacementArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsProductionArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsProductionPlacementArgs.builder
      builder.placement(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentArgs.Builder)
    /**
     * @param buildConfig Configs for the project build process.
     * @return builder
     */
    def buildConfig(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentBuildConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentBuildConfigArgs.builder
      builder.buildConfig(args(argsBuilder).build)

    /**
     * @param deploymentTrigger Info about what caused the deployment.
     * @return builder
     */
    def deploymentTrigger(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentDeploymentTriggerArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentDeploymentTriggerArgs.builder
      builder.deploymentTrigger(args(argsBuilder).build)

    /**
     * @param latestStage The status of the deployment.
     * @return builder
     */
    def latestStage(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentLatestStageArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentLatestStageArgs.builder
      builder.latestStage(args(argsBuilder).build)

    /**
     * @param source Configs for the project source control.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentSourceArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentSourceArgs.builder
      builder.source(args(argsBuilder).build)

    /**
     * @param stages List of past stages.
     * @return builder
     */
    def stages(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentStageArgs.Builder]*):
        com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentStageArgs.builder
      builder.stages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentDeploymentTriggerArgs.Builder)
    /**
     * @param metadata Additional info about the trigger.
     * @return builder
     */
    def metadata(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentDeploymentTriggerMetadataArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentDeploymentTriggerArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentDeploymentTriggerMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentSourceArgs.Builder)
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentSourceConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentSourceArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentSourceConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.PagesProjectSourceArgs.Builder)
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectSourceConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectSourceArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectSourceConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.PagesProjectState.Builder)
    /**
     * @param buildConfig Configs for the project build process.
     * @return builder
     */
    def buildConfig(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectBuildConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectBuildConfigArgs.builder
      builder.buildConfig(args(argsBuilder).build)

    /**
     * @param buildImageAutoUpgrade Present when the project is set to a retired build image major version and its builds have been moved to a newer one. `buildImageMajorVersion` in `deploymentConfigs` then reports the version the builds run on.
     * @return builder
     */
    def buildImageAutoUpgrade(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectBuildImageAutoUpgradeArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectBuildImageAutoUpgradeArgs.builder
      builder.buildImageAutoUpgrade(args(argsBuilder).build)

    /**
     * @param canonicalDeployment Most recent production deployment of the project.
     * @return builder
     */
    def canonicalDeployment(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectCanonicalDeploymentArgs.builder
      builder.canonicalDeployment(args(argsBuilder).build)

    /**
     * @param deploymentConfigs Configs for deployments in a project.
     * @return builder
     */
    def deploymentConfigs(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsArgs.builder
      builder.deploymentConfigs(args(argsBuilder).build)

    /**
     * @param latestDeployment Most recent deployment of the project.
     * @return builder
     */
    def latestDeployment(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectLatestDeploymentArgs.builder
      builder.latestDeployment(args(argsBuilder).build)

    /**
     * @param source Configs for the project source control.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectSourceArgs.Builder]):
        com.pulumi.cloudflare.inputs.PagesProjectState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.PipelineSinkConfigArgs.Builder)
    def credentials(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineSinkConfigCredentialsArgs.Builder]):
        com.pulumi.cloudflare.inputs.PipelineSinkConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PipelineSinkConfigCredentialsArgs.builder
      builder.credentials(args(argsBuilder).build)

    /**
     * @param fileNaming Controls filename prefix/suffix and strategy.
     * @return builder
     */
    def fileNaming(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineSinkConfigFileNamingArgs.Builder]):
        com.pulumi.cloudflare.inputs.PipelineSinkConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PipelineSinkConfigFileNamingArgs.builder
      builder.fileNaming(args(argsBuilder).build)

    /**
     * @param partitioning Data-layout partitioning for sinks.
     * @return builder
     */
    def partitioning(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineSinkConfigPartitioningArgs.Builder]):
        com.pulumi.cloudflare.inputs.PipelineSinkConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PipelineSinkConfigPartitioningArgs.builder
      builder.partitioning(args(argsBuilder).build)

    /**
     * @param rollingPolicy Rolling policy for file sinks (when &amp; why to close a file and open a new one).
     * @return builder
     */
    def rollingPolicy(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineSinkConfigRollingPolicyArgs.Builder]):
        com.pulumi.cloudflare.inputs.PipelineSinkConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PipelineSinkConfigRollingPolicyArgs.builder
      builder.rollingPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.PipelineSinkSchemaArgs.Builder)
    def fields(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineSinkSchemaFieldArgs.Builder]*):
        com.pulumi.cloudflare.inputs.PipelineSinkSchemaArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.PipelineSinkSchemaFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.PipelineSinkState.Builder)
    /**
     * @param config Defines the configuration of the R2 Sink.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineSinkConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.PipelineSinkState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PipelineSinkConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param format Defines the output data format of a sink.
     * @return builder
     */
    def format(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineSinkFormatArgs.Builder]):
        com.pulumi.cloudflare.inputs.PipelineSinkState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PipelineSinkFormatArgs.builder
      builder.format(args(argsBuilder).build)

    /**
     * @param schema Defines the schema of the events in the data stream.
     * @return builder
     */
    def schema(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineSinkSchemaArgs.Builder]):
        com.pulumi.cloudflare.inputs.PipelineSinkState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PipelineSinkSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.PipelineState.Builder)
    /**
     * @param tables List of streams and sinks used by this pipeline.
     * @return builder
     */
    def tables(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineTableArgs.Builder]*):
        com.pulumi.cloudflare.inputs.PipelineState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.PipelineTableArgs.builder
      builder.tables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.PipelineStreamHttpArgs.Builder)
    /**
     * @param cors Specifies the CORS options for the HTTP endpoint.
     * @return builder
     */
    def cors(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineStreamHttpCorsArgs.Builder]):
        com.pulumi.cloudflare.inputs.PipelineStreamHttpArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PipelineStreamHttpCorsArgs.builder
      builder.cors(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.PipelineStreamSchemaArgs.Builder)
    def fields(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineStreamSchemaFieldArgs.Builder]*):
        com.pulumi.cloudflare.inputs.PipelineStreamSchemaArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.PipelineStreamSchemaFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.PipelineStreamState.Builder)
    /**
     * @param format Defines the data format of the events.
     * @return builder
     */
    def format(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineStreamFormatArgs.Builder]):
        com.pulumi.cloudflare.inputs.PipelineStreamState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PipelineStreamFormatArgs.builder
      builder.format(args(argsBuilder).build)

    def http(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineStreamHttpArgs.Builder]):
        com.pulumi.cloudflare.inputs.PipelineStreamState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PipelineStreamHttpArgs.builder
      builder.http(args(argsBuilder).build)

    /**
     * @param schema Defines the schema of the events in the data stream.
     * @return builder
     */
    def schema(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineStreamSchemaArgs.Builder]):
        com.pulumi.cloudflare.inputs.PipelineStreamState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PipelineStreamSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

    def workerBinding(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineStreamWorkerBindingArgs.Builder]):
        com.pulumi.cloudflare.inputs.PipelineStreamState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PipelineStreamWorkerBindingArgs.builder
      builder.workerBinding(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.PrecursorState.Builder)
    /**
     * @param enforcementRules The ordered list of enforcement rules for the zone.
     * @return builder
     * @deprecated This attribute is deprecated.
     */
    @deprecated("This attribute is deprecated.") def enforcementRules(args: Endofunction[com.pulumi.cloudflare.inputs.PrecursorEnforcementRuleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.PrecursorState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.PrecursorEnforcementRuleArgs.builder
      builder.enforcementRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.QueueConsumerArgs.Builder)
    def settings(args: Endofunction[com.pulumi.cloudflare.inputs.QueueConsumerSettingsArgs.Builder]):
        com.pulumi.cloudflare.inputs.QueueConsumerArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.QueueConsumerSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.QueueConsumerSettingsArgs.Builder)
    def emails(args: Endofunction[com.pulumi.cloudflare.inputs.QueueConsumerSettingsEmailArgs.Builder]*):
        com.pulumi.cloudflare.inputs.QueueConsumerSettingsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.QueueConsumerSettingsEmailArgs.builder
      builder.emails(args.map(_(argsBuilder).build)*)

    /**
     * @param pagerduties PagerDuty notification destinations.
     * @return builder
     */
    def pagerduties(args: Endofunction[com.pulumi.cloudflare.inputs.QueueConsumerSettingsPagerdutyArgs.Builder]*):
        com.pulumi.cloudflare.inputs.QueueConsumerSettingsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.QueueConsumerSettingsPagerdutyArgs.builder
      builder.pagerduties(args.map(_(argsBuilder).build)*)

    /**
     * @param webhooks Webhook notification destinations.
     * @return builder
     */
    def webhooks(args: Endofunction[com.pulumi.cloudflare.inputs.QueueConsumerSettingsWebhookArgs.Builder]*):
        com.pulumi.cloudflare.inputs.QueueConsumerSettingsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.QueueConsumerSettingsWebhookArgs.builder
      builder.webhooks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.QueueConsumerState.Builder)
    def settings(args: Endofunction[com.pulumi.cloudflare.inputs.QueueConsumerSettingsArgs.Builder]):
        com.pulumi.cloudflare.inputs.QueueConsumerState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.QueueConsumerSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.QueueState.Builder)
    def consumers(args: Endofunction[com.pulumi.cloudflare.inputs.QueueConsumerArgs.Builder]*):
        com.pulumi.cloudflare.inputs.QueueState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.QueueConsumerArgs.builder
      builder.consumers(args.map(_(argsBuilder).build)*)

    def producers(args: Endofunction[com.pulumi.cloudflare.inputs.QueueProducerArgs.Builder]*):
        com.pulumi.cloudflare.inputs.QueueState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.QueueProducerArgs.builder
      builder.producers(args.map(_(argsBuilder).build)*)

    def settings(args: Endofunction[com.pulumi.cloudflare.inputs.QueueSettingsArgs.Builder]):
        com.pulumi.cloudflare.inputs.QueueState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.QueueSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.R2BucketCorsRuleArgs.Builder)
    /**
     * @param allowed Object specifying allowed origins, methods and headers for this CORS rule.
     * @return builder
     */
    def allowed(args: Endofunction[com.pulumi.cloudflare.inputs.R2BucketCorsRuleAllowedArgs.Builder]):
        com.pulumi.cloudflare.inputs.R2BucketCorsRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.R2BucketCorsRuleAllowedArgs.builder
      builder.allowed(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.R2BucketCorsState.Builder)
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.R2BucketCorsRuleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.R2BucketCorsState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.R2BucketCorsRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.R2BucketEventNotificationState.Builder)
    /**
     * @param rules Array of rules to drive notifications.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.R2BucketEventNotificationRuleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.R2BucketEventNotificationState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.R2BucketEventNotificationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleAbortMultipartUploadsTransitionArgs.Builder)
    /**
     * @param condition Condition for lifecycle transitions to apply after an object reaches an age in seconds.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleAbortMultipartUploadsTransitionConditionArgs.Builder]):
        com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleAbortMultipartUploadsTransitionArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleAbortMultipartUploadsTransitionConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleArgs.Builder)
    /**
     * @param abortMultipartUploadsTransition Transition to abort ongoing multipart uploads.
     * @return builder
     */
    def abortMultipartUploadsTransition(args: Endofunction[com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleAbortMultipartUploadsTransitionArgs.Builder]):
        com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleAbortMultipartUploadsTransitionArgs.builder
      builder.abortMultipartUploadsTransition(args(argsBuilder).build)

    /**
     * @param conditions Conditions that apply to all transitions of this rule.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleConditionsArgs.Builder]):
        com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleConditionsArgs.builder
      builder.conditions(args(argsBuilder).build)

    /**
     * @param deleteObjectsTransition Transition to delete objects.
     * @return builder
     */
    def deleteObjectsTransition(args: Endofunction[com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleDeleteObjectsTransitionArgs.Builder]):
        com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleDeleteObjectsTransitionArgs.builder
      builder.deleteObjectsTransition(args(argsBuilder).build)

    /**
     * @param storageClassTransitions Transitions to change the storage class of objects.
     * @return builder
     */
    def storageClassTransitions(args: Endofunction[com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleStorageClassTransitionArgs.Builder]*):
        com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleStorageClassTransitionArgs.builder
      builder.storageClassTransitions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleDeleteObjectsTransitionArgs.Builder)
    /**
     * @param condition Condition for lifecycle transitions to apply after an object reaches an age in seconds.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleDeleteObjectsTransitionConditionArgs.Builder]):
        com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleDeleteObjectsTransitionArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleDeleteObjectsTransitionConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleStorageClassTransitionArgs.Builder)
    /**
     * @param condition Condition for lifecycle transitions to apply after an object reaches an age in seconds.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleStorageClassTransitionConditionArgs.Builder]):
        com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleStorageClassTransitionArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleStorageClassTransitionConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.R2BucketLifecycleState.Builder)
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.R2BucketLifecycleState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.R2BucketLockRuleArgs.Builder)
    /**
     * @param condition Condition to apply a lock rule to an object for how long in seconds.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.cloudflare.inputs.R2BucketLockRuleConditionArgs.Builder]):
        com.pulumi.cloudflare.inputs.R2BucketLockRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.R2BucketLockRuleConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.R2BucketLockState.Builder)
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.R2BucketLockRuleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.R2BucketLockState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.R2BucketLockRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.R2BucketSippyState.Builder)
    /**
     * @param destination R2 bucket to copy objects to.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.cloudflare.inputs.R2BucketSippyDestinationArgs.Builder]):
        com.pulumi.cloudflare.inputs.R2BucketSippyState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.R2BucketSippyDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param source AWS S3 bucket to copy objects from.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.cloudflare.inputs.R2BucketSippySourceArgs.Builder]):
        com.pulumi.cloudflare.inputs.R2BucketSippyState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.R2BucketSippySourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.R2CustomDomainState.Builder)
    def status(args: Endofunction[com.pulumi.cloudflare.inputs.R2CustomDomainStatusArgs.Builder]):
        com.pulumi.cloudflare.inputs.R2CustomDomainState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.R2CustomDomainStatusArgs.builder
      builder.status(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.R2DataCatalogMaintenanceConfigArgs.Builder)
    /**
     * @param compaction Configures compaction for catalog maintenance.
     * @return builder
     */
    def compaction(args: Endofunction[com.pulumi.cloudflare.inputs.R2DataCatalogMaintenanceConfigCompactionArgs.Builder]):
        com.pulumi.cloudflare.inputs.R2DataCatalogMaintenanceConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.R2DataCatalogMaintenanceConfigCompactionArgs.builder
      builder.compaction(args(argsBuilder).build)

    /**
     * @param snapshotExpiration Configures snapshot expiration settings.
     * @return builder
     */
    def snapshotExpiration(args: Endofunction[com.pulumi.cloudflare.inputs.R2DataCatalogMaintenanceConfigSnapshotExpirationArgs.Builder]):
        com.pulumi.cloudflare.inputs.R2DataCatalogMaintenanceConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.R2DataCatalogMaintenanceConfigSnapshotExpirationArgs.builder
      builder.snapshotExpiration(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.R2DataCatalogState.Builder)
    /**
     * @param maintenanceConfig Configures maintenance for the catalog.
     * @return builder
     */
    def maintenanceConfig(args: Endofunction[com.pulumi.cloudflare.inputs.R2DataCatalogMaintenanceConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.R2DataCatalogState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.R2DataCatalogMaintenanceConfigArgs.builder
      builder.maintenanceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.RateLimitActionArgs.Builder)
    /**
     * @param response A custom content type and reponse to return when the threshold is exceeded. The custom response configured in this object will override the custom error for the zone. This object is optional.
     * Notes: If you omit this object, Cloudflare will use the default HTML error page. If &#34;mode&#34; is &#34;challenge&#34;, &#34;managed*challenge&#34;, or &#34;js*challenge&#34;, Cloudflare will use the zone challenge pages and you should not provide the &#34;response&#34; object.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.cloudflare.inputs.RateLimitActionResponseArgs.Builder]):
        com.pulumi.cloudflare.inputs.RateLimitActionArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RateLimitActionResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.RateLimitMatchArgs.Builder)
    def headers(args: Endofunction[com.pulumi.cloudflare.inputs.RateLimitMatchHeaderArgs.Builder]*):
        com.pulumi.cloudflare.inputs.RateLimitMatchArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.RateLimitMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    def request(args: Endofunction[com.pulumi.cloudflare.inputs.RateLimitMatchRequestArgs.Builder]):
        com.pulumi.cloudflare.inputs.RateLimitMatchArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RateLimitMatchRequestArgs.builder
      builder.request(args(argsBuilder).build)

    def response(args: Endofunction[com.pulumi.cloudflare.inputs.RateLimitMatchResponseArgs.Builder]):
        com.pulumi.cloudflare.inputs.RateLimitMatchArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RateLimitMatchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.RateLimitState.Builder)
    /**
     * @param action The action to perform when the threshold of matched traffic within the configured period is exceeded.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.cloudflare.inputs.RateLimitActionArgs.Builder]):
        com.pulumi.cloudflare.inputs.RateLimitState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RateLimitActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param match Determines which traffic the rate limit counts towards the threshold.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.cloudflare.inputs.RateLimitMatchArgs.Builder]):
        com.pulumi.cloudflare.inputs.RateLimitState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RateLimitMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.RecordState.Builder)
    /**
     * @param data Components of a MX record.
     * @return builder
     */
    def data(args: Endofunction[com.pulumi.cloudflare.inputs.RecordDataArgs.Builder]):
        com.pulumi.cloudflare.inputs.RecordState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RecordDataArgs.builder
      builder.data(args(argsBuilder).build)

    /**
     * @param settings Settings for the DNS record.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.cloudflare.inputs.RecordSettingsArgs.Builder]):
        com.pulumi.cloudflare.inputs.RecordState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RecordSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder)
    /**
     * @param algorithms Custom order for compression algorithms.
     * @return builder
     */
    def algorithms(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersAlgorithmArgs.Builder]*):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersAlgorithmArgs.builder
      builder.algorithms(args.map(_(argsBuilder).build)*)

    /**
     * @param autominify Which file extensions to minify automatically.
     * @return builder
     */
    def autominify(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersAutominifyArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersAutominifyArgs.builder
      builder.autominify(args(argsBuilder).build)

    /**
     * @param browserTtl How long client browsers should cache the response. Cloudflare cache purge will not purge content cached on client browsers, so high browser TTLs may lead to stale content.
     * @return builder
     */
    def browserTtl(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersBrowserTtlArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersBrowserTtlArgs.builder
      builder.browserTtl(args(argsBuilder).build)

    /**
     * @param cacheKey Which components of the request are included in or excluded from the cache key Cloudflare uses to store the response in cache.
     * @return builder
     */
    def cacheKey(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyArgs.builder
      builder.cacheKey(args(argsBuilder).build)

    /**
     * @param cacheReserve Settings to determine whether the request&#39;s response from origin is eligible for Cache Reserve (requires a Cache Reserve add-on plan).
     * @return builder
     */
    def cacheReserve(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheReserveArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheReserveArgs.builder
      builder.cacheReserve(args(argsBuilder).build)

    /**
     * @param cookieFields The cookie fields to log.
     * @return builder
     */
    def cookieFields(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCookieFieldArgs.Builder]*):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCookieFieldArgs.builder
      builder.cookieFields(args.map(_(argsBuilder).build)*)

    /**
     * @param edgeTtl How long the Cloudflare edge network should cache the response.
     * @return builder
     */
    def edgeTtl(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersEdgeTtlArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersEdgeTtlArgs.builder
      builder.edgeTtl(args(argsBuilder).build)

    /**
     * @param fromList A redirect based on a bulk list lookup.
     * @return builder
     */
    def fromList(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersFromListArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersFromListArgs.builder
      builder.fromList(args(argsBuilder).build)

    /**
     * @param fromValue A redirect based on the request properties.
     * @return builder
     */
    def fromValue(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersFromValueArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersFromValueArgs.builder
      builder.fromValue(args(argsBuilder).build)

    /**
     * @param immutable Set the immutable cache control directive.
     * @return builder
     */
    def immutable(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersImmutableArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersImmutableArgs.builder
      builder.immutable(args(argsBuilder).build)

    /**
     * @param matchedData The configuration to use for matched data logging.
     * @return builder
     */
    def matchedData(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersMatchedDataArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersMatchedDataArgs.builder
      builder.matchedData(args(argsBuilder).build)

    /**
     * @param maxAge Set the max-age cache control directive.
     * @return builder
     */
    def maxAge(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersMaxAgeArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersMaxAgeArgs.builder
      builder.maxAge(args(argsBuilder).build)

    /**
     * @param mustRevalidate Set the must-revalidate cache control directive.
     * @return builder
     */
    def mustRevalidate(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersMustRevalidateArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersMustRevalidateArgs.builder
      builder.mustRevalidate(args(argsBuilder).build)

    /**
     * @param mustUnderstand Set the must-understand cache control directive.
     * @return builder
     */
    def mustUnderstand(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersMustUnderstandArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersMustUnderstandArgs.builder
      builder.mustUnderstand(args(argsBuilder).build)

    /**
     * @param noCache Set the no-cache cache control directive.
     * @return builder
     */
    def noCache(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersNoCacheArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersNoCacheArgs.builder
      builder.noCache(args(argsBuilder).build)

    /**
     * @param noStore Set the no-store cache control directive.
     * @return builder
     */
    def noStore(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersNoStoreArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersNoStoreArgs.builder
      builder.noStore(args(argsBuilder).build)

    /**
     * @param noTransform Set the no-transform cache control directive.
     * @return builder
     */
    def noTransform(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersNoTransformArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersNoTransformArgs.builder
      builder.noTransform(args(argsBuilder).build)

    /**
     * @param origin An origin to route to.
     * @return builder
     */
    def origin(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersOriginArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersOriginArgs.builder
      builder.origin(args(argsBuilder).build)

    /**
     * @param originRangeRequests Controls whether Cloudflare fetches a large asset from the origin as a series of range requests instead of one whole-body request.
     * @return builder
     */
    def originRangeRequests(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersOriginRangeRequestsArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersOriginRangeRequestsArgs.builder
      builder.originRangeRequests(args(argsBuilder).build)

    /**
     * @param overrides A set of overrides to apply to the target ruleset.
     * @return builder
     */
    def overrides(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersOverridesArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersOverridesArgs.builder
      builder.overrides(args(argsBuilder).build)

    /**
     * @param private_ Set the private cache control directive.
     * @return builder
     */
    def private_(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersPrivateArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersPrivateArgs.builder
      builder.private_(args(argsBuilder).build)

    /**
     * @param proxyRevalidate Set the proxy-revalidate cache control directive.
     * @return builder
     */
    def proxyRevalidate(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersProxyRevalidateArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersProxyRevalidateArgs.builder
      builder.proxyRevalidate(args(argsBuilder).build)

    /**
     * @param public_ Set the public cache control directive.
     * @return builder
     */
    def public_(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersPublicArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersPublicArgs.builder
      builder.public_(args(argsBuilder).build)

    /**
     * @param rawResponseFields The raw response fields to log.
     * @return builder
     */
    def rawResponseFields(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersRawResponseFieldArgs.Builder]*):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersRawResponseFieldArgs.builder
      builder.rawResponseFields(args.map(_(argsBuilder).build)*)

    /**
     * @param requestFields The raw request fields to log.
     * @return builder
     */
    def requestFields(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersRequestFieldArgs.Builder]*):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersRequestFieldArgs.builder
      builder.requestFields(args.map(_(argsBuilder).build)*)

    /**
     * @param response The response to show when the block is applied.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersResponseArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersResponseArgs.builder
      builder.response(args(argsBuilder).build)

    /**
     * @param responseFields The transformed response fields to log.
     * @return builder
     */
    def responseFields(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersResponseFieldArgs.Builder]*):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersResponseFieldArgs.builder
      builder.responseFields(args.map(_(argsBuilder).build)*)

    /**
     * @param sMaxage Set the s-maxage cache control directive.
     * @return builder
     */
    def sMaxage(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersSMaxageArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersSMaxageArgs.builder
      builder.sMaxage(args(argsBuilder).build)

    /**
     * @param serveStale When to serve stale content from cache.
     * @return builder
     */
    def serveStale(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersServeStaleArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersServeStaleArgs.builder
      builder.serveStale(args(argsBuilder).build)

    /**
     * @param sni A Server Name Indication (SNI) override.
     * @return builder
     */
    def sni(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersSniArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersSniArgs.builder
      builder.sni(args(argsBuilder).build)

    /**
     * @param staleIfError Set the stale-if-error cache control directive.
     * @return builder
     */
    def staleIfError(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersStaleIfErrorArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersStaleIfErrorArgs.builder
      builder.staleIfError(args(argsBuilder).build)

    /**
     * @param staleWhileRevalidate Set the stale-while-revalidate cache control directive.
     * @return builder
     */
    def staleWhileRevalidate(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersStaleWhileRevalidateArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersStaleWhileRevalidateArgs.builder
      builder.staleWhileRevalidate(args(argsBuilder).build)

    /**
     * @param transformedRequestFields The transformed request fields to log.
     * @return builder
     */
    def transformedRequestFields(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersTransformedRequestFieldArgs.Builder]*):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersTransformedRequestFieldArgs.builder
      builder.transformedRequestFields(args.map(_(argsBuilder).build)*)

    /**
     * @param uri A URI rewrite.
     * @return builder
     */
    def uri(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersUriArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersUriArgs.builder
      builder.uri(args(argsBuilder).build)

    /**
     * @param vary Controls how cached responses vary based on request headers. `default` is required and applies to any Vary response header that does not have a per-header override.
     * @return builder
     */
    def vary(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersVaryArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersVaryArgs.builder
      builder.vary(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyArgs.Builder)
    /**
     * @param customKey Which components of the request are included or excluded from the cache key.
     * @return builder
     */
    def customKey(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyArgs.builder
      builder.customKey(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyArgs.Builder)
    /**
     * @param cookie Which cookies to include in the cache key.
     * @return builder
     */
    def cookie(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyCookieArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyCookieArgs.builder
      builder.cookie(args(argsBuilder).build)

    /**
     * @param header Which headers to include in the cache key.
     * @return builder
     */
    def header(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs.builder
      builder.header(args(argsBuilder).build)

    /**
     * @param host How to use the host in the cache key.
     * @return builder
     */
    def host(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyHostArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyHostArgs.builder
      builder.host(args(argsBuilder).build)

    /**
     * @param queryString Which query string parameters to include in or exclude from the cache key.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyQueryStringArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param user How to use characteristics of the request user agent in the cache key.
     * @return builder
     */
    def user(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyUserArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyUserArgs.builder
      builder.user(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyQueryStringArgs.Builder)
    /**
     * @param exclude Which query string parameters to exclude from the cache key.
     * @return builder
     */
    def exclude(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyQueryStringExcludeArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyQueryStringArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyQueryStringExcludeArgs.builder
      builder.exclude(args(argsBuilder).build)

    /**
     * @param include Which query string parameters to include in the cache key.
     * @return builder
     */
    def include(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyQueryStringIncludeArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyQueryStringArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyQueryStringIncludeArgs.builder
      builder.include(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.RulesetRuleActionParametersEdgeTtlArgs.Builder)
    /**
     * @param statusCodeTtls A list of TTLs to apply to specific status codes or status code ranges.
     * @return builder
     */
    def statusCodeTtls(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersEdgeTtlStatusCodeTtlArgs.Builder]*):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersEdgeTtlArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersEdgeTtlStatusCodeTtlArgs.builder
      builder.statusCodeTtls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.RulesetRuleActionParametersEdgeTtlStatusCodeTtlArgs.Builder)
    /**
     * @param statusCodeRange A range of status codes to apply the TTL to.
     * @return builder
     */
    def statusCodeRange(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRangeArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersEdgeTtlStatusCodeTtlArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRangeArgs.builder
      builder.statusCodeRange(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.RulesetRuleActionParametersFromValueArgs.Builder)
    /**
     * @param targetUrl A URL to redirect the request to.
     * @return builder
     */
    def targetUrl(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersFromValueTargetUrlArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersFromValueArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersFromValueTargetUrlArgs.builder
      builder.targetUrl(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.RulesetRuleActionParametersOverridesArgs.Builder)
    /**
     * @param categories A list of category-level overrides. This option has the second-highest precedence after rule-level overrides.
     * @return builder
     */
    def categories(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersOverridesCategoryArgs.Builder]*):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersOverridesArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersOverridesCategoryArgs.builder
      builder.categories(args.map(_(argsBuilder).build)*)

    /**
     * @param rules A list of rule-level overrides. This option has the highest precedence.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersOverridesRuleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersOverridesArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersOverridesRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.RulesetRuleActionParametersUriArgs.Builder)
    /**
     * @param path A URI path rewrite.
     * @return builder
     */
    def path(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersUriPathArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersUriArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersUriPathArgs.builder
      builder.path(args(argsBuilder).build)

    /**
     * @param query A URI query rewrite.
     * @return builder
     */
    def query(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersUriQueryArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersUriArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersUriQueryArgs.builder
      builder.query(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.RulesetRuleActionParametersVaryArgs.Builder)
    /**
     * @param default_ Controls how response Vary headers without a per-header override contribute to the cache key.
     * @return builder
     */
    def default_(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersVaryDefaultArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleActionParametersVaryArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersVaryDefaultArgs.builder
      builder.default_(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.RulesetRuleArgs.Builder)
    /**
     * @param actionParameters The parameters configuring the rule&#39;s action.
     * @return builder
     */
    def actionParameters(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs.builder
      builder.actionParameters(args(argsBuilder).build)

    /**
     * @param exposedCredentialCheck Configuration for exposed credential checking.
     * @return builder
     */
    def exposedCredentialCheck(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleExposedCredentialCheckArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleExposedCredentialCheckArgs.builder
      builder.exposedCredentialCheck(args(argsBuilder).build)

    /**
     * @param logging An object configuring the rule&#39;s logging behavior.
     * @return builder
     */
    def logging(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleLoggingArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param ratelimit An object configuring the rule&#39;s rate limit behavior.
     * @return builder
     */
    def ratelimit(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleRatelimitArgs.Builder]):
        com.pulumi.cloudflare.inputs.RulesetRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleRatelimitArgs.builder
      builder.ratelimit(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.RulesetState.Builder)
    /**
     * @param rules The list of rules in the ruleset.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.RulesetState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ShareRecipientState.Builder)
    def resources(args: Endofunction[com.pulumi.cloudflare.inputs.ShareRecipientResourceArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ShareRecipientState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ShareRecipientResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ShareState.Builder)
    def recipients(args: Endofunction[com.pulumi.cloudflare.inputs.ShareRecipientArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ShareState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ShareRecipientArgs.builder
      builder.recipients(args.map(_(argsBuilder).build)*)

    def resources(args: Endofunction[com.pulumi.cloudflare.inputs.ShareResourceArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ShareState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ShareResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.SnippetRulesState.Builder)
    /**
     * @param rules Lists snippet rules.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.SnippetRulesRuleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.SnippetRulesState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.SnippetRulesRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.SnippetState.Builder)
    /**
     * @param files The list of files belonging to the snippet.
     * @return builder
     */
    def files(args: Endofunction[com.pulumi.cloudflare.inputs.SnippetFileArgs.Builder]*):
        com.pulumi.cloudflare.inputs.SnippetState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.SnippetFileArgs.builder
      builder.files(args.map(_(argsBuilder).build)*)

    /**
     * @param metadata Provide metadata about the snippet.
     * @return builder
     */
    def metadata(args: Endofunction[com.pulumi.cloudflare.inputs.SnippetMetadataArgs.Builder]):
        com.pulumi.cloudflare.inputs.SnippetState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.SnippetMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.SnippetsState.Builder)
    /**
     * @param metadata Metadata about the snippet.
     * @return builder
     */
    def metadata(args: Endofunction[com.pulumi.cloudflare.inputs.SnippetsMetadataArgs.Builder]):
        com.pulumi.cloudflare.inputs.SnippetsState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.SnippetsMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.SpectrumApplicationState.Builder)
    /**
     * @param dns The name and type of DNS record for the Spectrum application.
     * @return builder
     */
    def dns(args: Endofunction[com.pulumi.cloudflare.inputs.SpectrumApplicationDnsArgs.Builder]):
        com.pulumi.cloudflare.inputs.SpectrumApplicationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.SpectrumApplicationDnsArgs.builder
      builder.dns(args(argsBuilder).build)

    /**
     * @param edgeIps The anycast edge IP configuration for the hostname of this application.
     * @return builder
     */
    def edgeIps(args: Endofunction[com.pulumi.cloudflare.inputs.SpectrumApplicationEdgeIpsArgs.Builder]):
        com.pulumi.cloudflare.inputs.SpectrumApplicationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.SpectrumApplicationEdgeIpsArgs.builder
      builder.edgeIps(args(argsBuilder).build)

    /**
     * @param originDns The name and type of DNS record for the Spectrum application.
     * @return builder
     */
    def originDns(args: Endofunction[com.pulumi.cloudflare.inputs.SpectrumApplicationOriginDnsArgs.Builder]):
        com.pulumi.cloudflare.inputs.SpectrumApplicationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.SpectrumApplicationOriginDnsArgs.builder
      builder.originDns(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.SsoConnectorState.Builder)
    def verification(args: Endofunction[com.pulumi.cloudflare.inputs.SsoConnectorVerificationArgs.Builder]):
        com.pulumi.cloudflare.inputs.SsoConnectorState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.SsoConnectorVerificationArgs.builder
      builder.verification(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.StaticRouteState.Builder)
    /**
     * @param scope Used only for ECMP routes.
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.cloudflare.inputs.StaticRouteScopeArgs.Builder]):
        com.pulumi.cloudflare.inputs.StaticRouteState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.StaticRouteScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.StreamAudioTrackState.Builder)
    /**
     * @param audios Array of audio tracks for the video.
     * @return builder
     */
    def audios(args: Endofunction[com.pulumi.cloudflare.inputs.StreamAudioTrackAudioArgs.Builder]*):
        com.pulumi.cloudflare.inputs.StreamAudioTrackState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.StreamAudioTrackAudioArgs.builder
      builder.audios(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.StreamDownloadState.Builder)
    /**
     * @param audio The audio-only download. Only present if this download type has been created.
     * @return builder
     */
    def audio(args: Endofunction[com.pulumi.cloudflare.inputs.StreamDownloadAudioArgs.Builder]):
        com.pulumi.cloudflare.inputs.StreamDownloadState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.StreamDownloadAudioArgs.builder
      builder.audio(args(argsBuilder).build)

    /**
     * @param default_ The default video download. Only present if this download type has been created.
     * @return builder
     */
    def default_(args: Endofunction[com.pulumi.cloudflare.inputs.StreamDownloadDefaultArgs.Builder]):
        com.pulumi.cloudflare.inputs.StreamDownloadState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.StreamDownloadDefaultArgs.builder
      builder.default_(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.StreamLiveInputState.Builder)
    /**
     * @param playback Details for playing a live input&#39;s broadcast using the HLS or DASH manifests. URLs reference the live input ID.
     * @return builder
     */
    def playback(args: Endofunction[com.pulumi.cloudflare.inputs.StreamLiveInputPlaybackArgs.Builder]):
        com.pulumi.cloudflare.inputs.StreamLiveInputState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.StreamLiveInputPlaybackArgs.builder
      builder.playback(args(argsBuilder).build)

    /**
     * @param recording Records the input to a Cloudflare Stream video. Behavior depends on the mode. In most cases, the video will initially be viewable as a live video and transition to on-demand after a condition is satisfied.
     * @return builder
     */
    def recording(args: Endofunction[com.pulumi.cloudflare.inputs.StreamLiveInputRecordingArgs.Builder]):
        com.pulumi.cloudflare.inputs.StreamLiveInputState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.StreamLiveInputRecordingArgs.builder
      builder.recording(args(argsBuilder).build)

    /**
     * @param rtmps Details for streaming to an live input using RTMPS.
     * @return builder
     */
    def rtmps(args: Endofunction[com.pulumi.cloudflare.inputs.StreamLiveInputRtmpsArgs.Builder]):
        com.pulumi.cloudflare.inputs.StreamLiveInputState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.StreamLiveInputRtmpsArgs.builder
      builder.rtmps(args(argsBuilder).build)

    /**
     * @param rtmpsPlayback Details for playback from an live input using RTMPS.
     * @return builder
     */
    def rtmpsPlayback(args: Endofunction[com.pulumi.cloudflare.inputs.StreamLiveInputRtmpsPlaybackArgs.Builder]):
        com.pulumi.cloudflare.inputs.StreamLiveInputState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.StreamLiveInputRtmpsPlaybackArgs.builder
      builder.rtmpsPlayback(args(argsBuilder).build)

    /**
     * @param srt Details for streaming to a live input using SRT.
     * @return builder
     */
    def srt(args: Endofunction[com.pulumi.cloudflare.inputs.StreamLiveInputSrtArgs.Builder]):
        com.pulumi.cloudflare.inputs.StreamLiveInputState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.StreamLiveInputSrtArgs.builder
      builder.srt(args(argsBuilder).build)

    /**
     * @param srtPlayback Details for playback from an live input using SRT.
     * @return builder
     */
    def srtPlayback(args: Endofunction[com.pulumi.cloudflare.inputs.StreamLiveInputSrtPlaybackArgs.Builder]):
        com.pulumi.cloudflare.inputs.StreamLiveInputState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.StreamLiveInputSrtPlaybackArgs.builder
      builder.srtPlayback(args(argsBuilder).build)

    /**
     * @param webRtc Details for streaming to a live input using WebRTC.
     * @return builder
     */
    def webRtc(args: Endofunction[com.pulumi.cloudflare.inputs.StreamLiveInputWebRtcArgs.Builder]):
        com.pulumi.cloudflare.inputs.StreamLiveInputState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.StreamLiveInputWebRtcArgs.builder
      builder.webRtc(args(argsBuilder).build)

    /**
     * @param webRtcPlayback Details for playback from a live input using WebRTC.
     * @return builder
     */
    def webRtcPlayback(args: Endofunction[com.pulumi.cloudflare.inputs.StreamLiveInputWebRtcPlaybackArgs.Builder]):
        com.pulumi.cloudflare.inputs.StreamLiveInputState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.StreamLiveInputWebRtcPlaybackArgs.builder
      builder.webRtcPlayback(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.StreamState.Builder)
    def input(args: Endofunction[com.pulumi.cloudflare.inputs.StreamInputArgs.Builder]):
        com.pulumi.cloudflare.inputs.StreamState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.StreamInputArgs.builder
      builder.input(args(argsBuilder).build)

    def playback(args: Endofunction[com.pulumi.cloudflare.inputs.StreamPlaybackArgs.Builder]):
        com.pulumi.cloudflare.inputs.StreamState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.StreamPlaybackArgs.builder
      builder.playback(args(argsBuilder).build)

    /**
     * @param publicDetails Public details for the video including title, share link, channel link, and logo.
     * @return builder
     */
    def publicDetails(args: Endofunction[com.pulumi.cloudflare.inputs.StreamPublicDetailsArgs.Builder]):
        com.pulumi.cloudflare.inputs.StreamState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.StreamPublicDetailsArgs.builder
      builder.publicDetails(args(argsBuilder).build)

    /**
     * @param status Specifies a detailed status for a video. If the `state` is `inprogress` or `error`, the `step` field returns `encoding` or `manifest`. If the `state` is `inprogress`, `pctComplete` returns a number between 0 and 100 to indicate the approximate percent of completion. If the `state` is `error`, `errorReasonCode` and `errorReasonText` provide additional details.
     * @return builder
     */
    def status(args: Endofunction[com.pulumi.cloudflare.inputs.StreamStatusArgs.Builder]):
        com.pulumi.cloudflare.inputs.StreamState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.StreamStatusArgs.builder
      builder.status(args(argsBuilder).build)

    def watermark(args: Endofunction[com.pulumi.cloudflare.inputs.StreamWatermarkArgs.Builder]):
        com.pulumi.cloudflare.inputs.StreamState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.StreamWatermarkArgs.builder
      builder.watermark(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.TeamsAccountSettingsAntivirusArgs.Builder)
    /**
     * @param notificationSettings Configure the message the user&#39;s device shows during an antivirus scan.
     * @return builder
     */
    def notificationSettings(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsAccountSettingsAntivirusNotificationSettingsArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsAccountSettingsAntivirusArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsAccountSettingsAntivirusNotificationSettingsArgs.builder
      builder.notificationSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.TeamsAccountSettingsArgs.Builder)
    /**
     * @param activityLog Specify activity log settings.
     * @return builder
     */
    def activityLog(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsAccountSettingsActivityLogArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsAccountSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsAccountSettingsActivityLogArgs.builder
      builder.activityLog(args(argsBuilder).build)

    /**
     * @param antivirus Specify anti-virus settings.
     * @return builder
     */
    def antivirus(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsAccountSettingsAntivirusArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsAccountSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsAccountSettingsAntivirusArgs.builder
      builder.antivirus(args(argsBuilder).build)

    /**
     * @param blockPage Specify block page layout settings.
     * @return builder
     */
    def blockPage(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsAccountSettingsBlockPageArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsAccountSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsAccountSettingsBlockPageArgs.builder
      builder.blockPage(args(argsBuilder).build)

    /**
     * @param bodyScanning Specify the DLP inspection mode.
     * @return builder
     */
    def bodyScanning(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsAccountSettingsBodyScanningArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsAccountSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsAccountSettingsBodyScanningArgs.builder
      builder.bodyScanning(args(argsBuilder).build)

    /**
     * @param browserIsolation Specify Clientless Browser Isolation settings.
     * @return builder
     */
    def browserIsolation(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsAccountSettingsBrowserIsolationArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsAccountSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsAccountSettingsBrowserIsolationArgs.builder
      builder.browserIsolation(args(argsBuilder).build)

    /**
     * @param certificate Specify certificate settings for Gateway TLS interception. If unset, the Cloudflare Root CA handles interception.
     * @return builder
     */
    def certificate(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsAccountSettingsCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsAccountSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsAccountSettingsCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    /**
     * @param customCertificate Specify custom certificate settings for BYO-PKI. This field is deprecated; use `certificate` instead.
     * @return builder
     * @deprecated This attribute is deprecated.
     */
    @deprecated("This attribute is deprecated.") def customCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsAccountSettingsCustomCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsAccountSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsAccountSettingsCustomCertificateArgs.builder
      builder.customCertificate(args(argsBuilder).build)

    /**
     * @param extendedEmailMatching Configures user email settings for firewall policies. When you enable this, the system standardizes email addresses in the identity portion of the rule to match extended email variants in firewall policies. When you disable this setting, the system matches email addresses exactly as you provide them. Enable this setting if your email uses `.` or `+` modifiers.
     * @return builder
     */
    def extendedEmailMatching(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsAccountSettingsExtendedEmailMatchingArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsAccountSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsAccountSettingsExtendedEmailMatchingArgs.builder
      builder.extendedEmailMatching(args(argsBuilder).build)

    /**
     * @param fips Specify FIPS settings.
     * @return builder
     */
    def fips(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsAccountSettingsFipsArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsAccountSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsAccountSettingsFipsArgs.builder
      builder.fips(args(argsBuilder).build)

    /**
     * @param hostSelector Enable host selection in egress policies.
     * @return builder
     */
    def hostSelector(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsAccountSettingsHostSelectorArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsAccountSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsAccountSettingsHostSelectorArgs.builder
      builder.hostSelector(args(argsBuilder).build)

    /**
     * @param inspection Define the proxy inspection mode.
     * @return builder
     */
    def inspection(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsAccountSettingsInspectionArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsAccountSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsAccountSettingsInspectionArgs.builder
      builder.inspection(args(argsBuilder).build)

    /**
     * @param protocolDetection Specify whether to detect protocols from the initial bytes of client traffic.
     * @return builder
     */
    def protocolDetection(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsAccountSettingsProtocolDetectionArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsAccountSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsAccountSettingsProtocolDetectionArgs.builder
      builder.protocolDetection(args(argsBuilder).build)

    /**
     * @param sandbox Specify whether to enable the sandbox.
     * @return builder
     */
    def sandbox(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsAccountSettingsSandboxArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsAccountSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsAccountSettingsSandboxArgs.builder
      builder.sandbox(args(argsBuilder).build)

    /**
     * @param tlsDecrypt Specify whether to inspect encrypted HTTP traffic.
     * @return builder
     */
    def tlsDecrypt(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsAccountSettingsTlsDecryptArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsAccountSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsAccountSettingsTlsDecryptArgs.builder
      builder.tlsDecrypt(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.TeamsAccountState.Builder)
    /**
     * @param settings Specify account settings.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsAccountSettingsArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsAccountState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsAccountSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.TeamsListState.Builder)
    /**
     * @param items Add items to the list.
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsListItemArgs.Builder]*):
        com.pulumi.cloudflare.inputs.TeamsListState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.TeamsListItemArgs.builder
      builder.items(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.TeamsLocationEndpointsArgs.Builder)
    def doh(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsLocationEndpointsDohArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsLocationEndpointsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsLocationEndpointsDohArgs.builder
      builder.doh(args(argsBuilder).build)

    def dot(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsLocationEndpointsDotArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsLocationEndpointsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsLocationEndpointsDotArgs.builder
      builder.dot(args(argsBuilder).build)

    def ipv4(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsLocationEndpointsIpv4Args.Builder]):
        com.pulumi.cloudflare.inputs.TeamsLocationEndpointsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsLocationEndpointsIpv4Args.builder
      builder.ipv4(args(argsBuilder).build)

    def ipv6(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsLocationEndpointsIpv6Args.Builder]):
        com.pulumi.cloudflare.inputs.TeamsLocationEndpointsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsLocationEndpointsIpv6Args.builder
      builder.ipv6(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.TeamsLocationEndpointsDohArgs.Builder)
    /**
     * @param networks Specify the list of allowed source IP network ranges for this endpoint. When the list is empty, the endpoint allows all source IPs. The list takes effect only if the endpoint is enabled for this location.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsLocationEndpointsDohNetworkArgs.Builder]*):
        com.pulumi.cloudflare.inputs.TeamsLocationEndpointsDohArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.TeamsLocationEndpointsDohNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.TeamsLocationEndpointsDotArgs.Builder)
    /**
     * @param networks Specify the list of allowed source IP network ranges for this endpoint. When the list is empty, the endpoint allows all source IPs. The list takes effect only if the endpoint is enabled for this location.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsLocationEndpointsDotNetworkArgs.Builder]*):
        com.pulumi.cloudflare.inputs.TeamsLocationEndpointsDotArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.TeamsLocationEndpointsDotNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.TeamsLocationEndpointsIpv6Args.Builder)
    /**
     * @param networks Specify the list of allowed source IPv6 network ranges for this endpoint. When the list is empty, the endpoint allows all source IPs. The list takes effect only if the endpoint is enabled for this location.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsLocationEndpointsIpv6NetworkArgs.Builder]*):
        com.pulumi.cloudflare.inputs.TeamsLocationEndpointsIpv6Args.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.TeamsLocationEndpointsIpv6NetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.TeamsLocationState.Builder)
    /**
     * @param endpoints Configure the destination endpoints for this location.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsLocationEndpointsArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsLocationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsLocationEndpointsArgs.builder
      builder.endpoints(args(argsBuilder).build)

    /**
     * @param maxTtl Controls how DNS response TTLs are capped for this location relative to the account `maxTtlSecs` setting. Omitting `maxTtl` on update resets it to `inherit`.
     * @return builder
     */
    def maxTtl(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsLocationMaxTtlArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsLocationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsLocationMaxTtlArgs.builder
      builder.maxTtl(args(argsBuilder).build)

    /**
     * @param networks Specify the list of network ranges from which requests at this location originate. The list takes effect only if it is non-empty and the IPv4 endpoint is enabled for this location.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsLocationNetworkArgs.Builder]*):
        com.pulumi.cloudflare.inputs.TeamsLocationState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.TeamsLocationNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsArgs.Builder)
    /**
     * @param auditSsh Define the settings for the Audit SSH action. Settable only for `l4` rules with `auditSsh` action.
     * @return builder
     */
    def auditSsh(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsAuditSshArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsAuditSshArgs.builder
      builder.auditSsh(args(argsBuilder).build)

    /**
     * @param bisoAdminControls Configure browser isolation behavior. Settable only for `http` rules with the action set to `isolate`.
     * @return builder
     */
    def bisoAdminControls(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsBisoAdminControlsArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsBisoAdminControlsArgs.builder
      builder.bisoAdminControls(args(argsBuilder).build)

    /**
     * @param blockPage Configure custom block page settings. If missing or null, use the account settings. Settable only for `http` rules with the action set to `block`.
     * @return builder
     */
    def blockPage(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsBlockPageArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsBlockPageArgs.builder
      builder.blockPage(args(argsBuilder).build)

    /**
     * @param checkSession Configure session check behavior. Settable only for `l4` and `http` rules with the action set to `allow`.
     * @return builder
     */
    def checkSession(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsCheckSessionArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsCheckSessionArgs.builder
      builder.checkSession(args(argsBuilder).build)

    /**
     * @param dnsResolvers Configure custom resolvers to route queries that match the resolver policy. Unused with &#39;resolve*dns*through*cloudflare&#39; or &#39;resolve*dns*internally&#39; settings. DNS queries get routed to the address closest to their origin. Only valid when a rule&#39;s action set to &#39;resolve&#39;. Settable only for `dnsResolver` rules.
     * @return builder
     */
    def dnsResolvers(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsDnsResolversArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsDnsResolversArgs.builder
      builder.dnsResolvers(args(argsBuilder).build)

    /**
     * @param egress Configure how Gateway Proxy traffic egresses. You can enable this setting for rules with Egress actions and filters, or omit it to indicate local egress via WARP IPs. Settable only for `egress` rules.
     * @return builder
     */
    def egress(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsEgressArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsEgressArgs.builder
      builder.egress(args(argsBuilder).build)

    /**
     * @param forensicCopy Configure whether a copy of the HTTP request will be sent to storage when the rule matches.
     * @return builder
     */
    def forensicCopy(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsForensicCopyArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsForensicCopyArgs.builder
      builder.forensicCopy(args(argsBuilder).build)

    /**
     * @param l4override Send matching traffic to the supplied destination IP address and port. Settable only for `l4` rules with the action set to `l4Override`.
     * @return builder
     */
    def l4override(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsL4overrideArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsL4overrideArgs.builder
      builder.l4override(args(argsBuilder).build)

    /**
     * @param notificationSettings Configure a notification to display on the user&#39;s device when this rule matched. Settable for all types of rules with the action set to `block`.
     * @return builder
     */
    def notificationSettings(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsNotificationSettingsArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsNotificationSettingsArgs.builder
      builder.notificationSettings(args(argsBuilder).build)

    /**
     * @param payloadLog Configure DLP payload logging. Settable only for `http` rules.
     * @return builder
     */
    def payloadLog(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsPayloadLogArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsPayloadLogArgs.builder
      builder.payloadLog(args(argsBuilder).build)

    /**
     * @param quarantine Configure settings that apply to quarantine rules. Settable only for `http` rules.
     * @return builder
     */
    def quarantine(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsQuarantineArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsQuarantineArgs.builder
      builder.quarantine(args(argsBuilder).build)

    /**
     * @param redirect Apply settings to redirect rules. Settable only for `http` rules with the action set to `redirect`.
     * @return builder
     */
    def redirect(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsRedirectArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsRedirectArgs.builder
      builder.redirect(args(argsBuilder).build)

    /**
     * @param resolveDnsInternally Configure to forward the query to the internal DNS service, passing the specified &#39;view*id&#39; as input. Not used when &#39;dns*resolvers&#39; is specified or &#39;resolve*dns*through*cloudflare&#39; is set. Only valid when a rule&#39;s action set to &#39;resolve&#39;. Settable only for `dnsResolver` rules.
     * @return builder
     */
    def resolveDnsInternally(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsResolveDnsInternallyArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsResolveDnsInternallyArgs.builder
      builder.resolveDnsInternally(args(argsBuilder).build)

    /**
     * @param untrustedCert Configure behavior when an upstream certificate is invalid or an SSL error occurs. Settable only for `http` rules with the action set to `allow`.
     * @return builder
     */
    def untrustedCert(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsUntrustedCertArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsUntrustedCertArgs.builder
      builder.untrustedCert(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsDnsResolversArgs.Builder)
    def ipv4s(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsDnsResolversIpv4Args.Builder]*):
        com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsDnsResolversArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsDnsResolversIpv4Args.builder
      builder.ipv4s(args.map(_(argsBuilder).build)*)

    def ipv6s(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsDnsResolversIpv6Args.Builder]*):
        com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsDnsResolversArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsDnsResolversIpv6Args.builder
      builder.ipv6s(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.TeamsRuleState.Builder)
    /**
     * @param expiration Defines the expiration time stamp and default duration of a DNS policy. Takes precedence over the policy&#39;s `schedule` configuration, if any. This  does not apply to HTTP or network policies. Settable only for `dns` rules.
     * @return builder
     */
    def expiration(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleExpirationArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsRuleState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleExpirationArgs.builder
      builder.expiration(args(argsBuilder).build)

    /**
     * @param ruleSettings Defines settings for this rule. Settings apply only to specific rule types and must use compatible selectors. If Terraform detects drift, confirm the setting supports your rule type and check whether the API modifies the value. Use API-returned values in your configuration to prevent drift.
     * @return builder
     */
    def ruleSettings(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsRuleState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsArgs.builder
      builder.ruleSettings(args(argsBuilder).build)

    /**
     * @param schedule Defines the schedule for activating DNS policies. Settable only for `dns` and `dnsResolver` rules.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleScheduleArgs.Builder]):
        com.pulumi.cloudflare.inputs.TeamsRuleState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.TokenValidationConfigCredentialsArgs.Builder)
    def keys(args: Endofunction[com.pulumi.cloudflare.inputs.TokenValidationConfigCredentialsKeyArgs.Builder]*):
        com.pulumi.cloudflare.inputs.TokenValidationConfigCredentialsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.TokenValidationConfigCredentialsKeyArgs.builder
      builder.keys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.TokenValidationConfigState.Builder)
    /**
     * @param credentials Request payload for create and PUT credentials operations. Provided keys define the complete stored key set. Key identities (`{alg,kid}`) must be unique.
     * @return builder
     */
    def credentials(args: Endofunction[com.pulumi.cloudflare.inputs.TokenValidationConfigCredentialsArgs.Builder]):
        com.pulumi.cloudflare.inputs.TokenValidationConfigState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TokenValidationConfigCredentialsArgs.builder
      builder.credentials(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.TokenValidationRulesSelectorArgs.Builder)
    /**
     * @param excludes Ignore operations that were otherwise included by `include`.
     * @return builder
     */
    def excludes(args: Endofunction[com.pulumi.cloudflare.inputs.TokenValidationRulesSelectorExcludeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.TokenValidationRulesSelectorArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.TokenValidationRulesSelectorExcludeArgs.builder
      builder.excludes(args.map(_(argsBuilder).build)*)

    /**
     * @param includes Select all matching operations.
     * @return builder
     */
    def includes(args: Endofunction[com.pulumi.cloudflare.inputs.TokenValidationRulesSelectorIncludeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.TokenValidationRulesSelectorArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.TokenValidationRulesSelectorIncludeArgs.builder
      builder.includes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.TokenValidationRulesState.Builder)
    /**
     * @param position Update rule order among zone rules.
     * @return builder
     */
    def position(args: Endofunction[com.pulumi.cloudflare.inputs.TokenValidationRulesPositionArgs.Builder]):
        com.pulumi.cloudflare.inputs.TokenValidationRulesState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TokenValidationRulesPositionArgs.builder
      builder.position(args(argsBuilder).build)

    /**
     * @param selector Select operations covered by this rule.
     * 
     * For details on selectors, see the [Cloudflare Docs](https://developers.cloudflare.com/api-shield/security/jwt-validation/).
     * @return builder
     */
    def selector(args: Endofunction[com.pulumi.cloudflare.inputs.TokenValidationRulesSelectorArgs.Builder]):
        com.pulumi.cloudflare.inputs.TokenValidationRulesState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TokenValidationRulesSelectorArgs.builder
      builder.selector(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.TunnelConfigConfigArgs.Builder)
    /**
     * @param ingresses List of public hostname definitions. At least one ingress rule needs to be defined for the tunnel.
     * @return builder
     */
    def ingresses(args: Endofunction[com.pulumi.cloudflare.inputs.TunnelConfigConfigIngressArgs.Builder]*):
        com.pulumi.cloudflare.inputs.TunnelConfigConfigArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.TunnelConfigConfigIngressArgs.builder
      builder.ingresses(args.map(_(argsBuilder).build)*)

    /**
     * @param originRequest Configuration parameters for the public hostname specific connection settings between cloudflared and origin server.
     * @return builder
     */
    def originRequest(args: Endofunction[com.pulumi.cloudflare.inputs.TunnelConfigConfigOriginRequestArgs.Builder]):
        com.pulumi.cloudflare.inputs.TunnelConfigConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TunnelConfigConfigOriginRequestArgs.builder
      builder.originRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.TunnelConfigConfigIngressArgs.Builder)
    /**
     * @param originRequest Configuration parameters for the public hostname specific connection settings between cloudflared and origin server.
     * @return builder
     */
    def originRequest(args: Endofunction[com.pulumi.cloudflare.inputs.TunnelConfigConfigIngressOriginRequestArgs.Builder]):
        com.pulumi.cloudflare.inputs.TunnelConfigConfigIngressArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TunnelConfigConfigIngressOriginRequestArgs.builder
      builder.originRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.TunnelConfigConfigIngressOriginRequestArgs.Builder)
    /**
     * @param access For all L7 requests to this hostname, cloudflared will validate each request&#39;s Cf-Access-Jwt-Assertion request header.
     * @return builder
     */
    def access(args: Endofunction[com.pulumi.cloudflare.inputs.TunnelConfigConfigIngressOriginRequestAccessArgs.Builder]):
        com.pulumi.cloudflare.inputs.TunnelConfigConfigIngressOriginRequestArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TunnelConfigConfigIngressOriginRequestAccessArgs.builder
      builder.access(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.TunnelConfigConfigOriginRequestArgs.Builder)
    /**
     * @param access For all L7 requests to this hostname, cloudflared will validate each request&#39;s Cf-Access-Jwt-Assertion request header.
     * @return builder
     */
    def access(args: Endofunction[com.pulumi.cloudflare.inputs.TunnelConfigConfigOriginRequestAccessArgs.Builder]):
        com.pulumi.cloudflare.inputs.TunnelConfigConfigOriginRequestArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TunnelConfigConfigOriginRequestAccessArgs.builder
      builder.access(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.TunnelConfigState.Builder)
    /**
     * @param config The tunnel configuration and ingress rules.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.TunnelConfigConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.TunnelConfigState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TunnelConfigConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.TunnelState.Builder)
    /**
     * @param connections The Cloudflare Tunnel connections between your origin and Cloudflare&#39;s edge.
     * @return builder
     * @deprecated This field will start returning an empty array. To fetch the connections of a given tunnel, please use the dedicated endpoint `/accounts/{account_id}/{tunnel_type}/{tunnel_id}/connections`
     */
    @deprecated("This field will start returning an empty array. To fetch the connections of a given tunnel, please use the dedicated endpoint `/accounts/{account_id}/{tunnel_type}/{tunnel_id}/connections`") def connections(args: Endofunction[com.pulumi.cloudflare.inputs.TunnelConnectionArgs.Builder]*):
        com.pulumi.cloudflare.inputs.TunnelState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.TunnelConnectionArgs.builder
      builder.connections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.UserAgentBlockingRuleState.Builder)
    def configuration(args: Endofunction[com.pulumi.cloudflare.inputs.UserAgentBlockingRuleConfigurationArgs.Builder]):
        com.pulumi.cloudflare.inputs.UserAgentBlockingRuleState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.UserAgentBlockingRuleConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.UserGroupMembersState.Builder)
    def members(args: Endofunction[com.pulumi.cloudflare.inputs.UserGroupMembersMemberArgs.Builder]*):
        com.pulumi.cloudflare.inputs.UserGroupMembersState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.UserGroupMembersMemberArgs.builder
      builder.members(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.UserGroupPolicyArgs.Builder)
    /**
     * @param permissionGroups A set of permission groups that are specified to the policy.
     * @return builder
     */
    def permissionGroups(args: Endofunction[com.pulumi.cloudflare.inputs.UserGroupPolicyPermissionGroupArgs.Builder]*):
        com.pulumi.cloudflare.inputs.UserGroupPolicyArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.UserGroupPolicyPermissionGroupArgs.builder
      builder.permissionGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceGroups A set of resource groups that are specified to the policy.
     * @return builder
     */
    def resourceGroups(args: Endofunction[com.pulumi.cloudflare.inputs.UserGroupPolicyResourceGroupArgs.Builder]*):
        com.pulumi.cloudflare.inputs.UserGroupPolicyArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.UserGroupPolicyResourceGroupArgs.builder
      builder.resourceGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.UserGroupState.Builder)
    /**
     * @param policies Policies attached to the User group
     * @return builder
     */
    def policies(args: Endofunction[com.pulumi.cloudflare.inputs.UserGroupPolicyArgs.Builder]*):
        com.pulumi.cloudflare.inputs.UserGroupState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.UserGroupPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.UserState.Builder)
    def organizations(args: Endofunction[com.pulumi.cloudflare.inputs.UserOrganizationArgs.Builder]*):
        com.pulumi.cloudflare.inputs.UserState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.UserOrganizationArgs.builder
      builder.organizations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.VulnerabilityScannerTargetEnvironmentState.Builder)
    /**
     * @param target Identifies the Cloudflare asset to scan. Uses a `type` discriminator.
     * Currently the service supports only `zone` targets.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.cloudflare.inputs.VulnerabilityScannerTargetEnvironmentTargetArgs.Builder]):
        com.pulumi.cloudflare.inputs.VulnerabilityScannerTargetEnvironmentState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.VulnerabilityScannerTargetEnvironmentTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.WaitingRoomRulesState.Builder)
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.WaitingRoomRulesRuleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WaitingRoomRulesState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WaitingRoomRulesRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.WaitingRoomState.Builder)
    /**
     * @param additionalRoutes Only available for the Waiting Room Advanced subscription. Additional hostname and path combinations to which this waiting room will be applied. There is an implied wildcard at the end of the path. The hostname and path combination must be unique to this and all other waiting rooms.
     * @return builder
     */
    def additionalRoutes(args: Endofunction[com.pulumi.cloudflare.inputs.WaitingRoomAdditionalRouteArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WaitingRoomState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WaitingRoomAdditionalRouteArgs.builder
      builder.additionalRoutes(args.map(_(argsBuilder).build)*)

    /**
     * @param cookieAttributes Configures cookie attributes for the waiting room cookie. This encrypted cookie stores a user&#39;s status in the waiting room, such as queue position.
     * @return builder
     */
    def cookieAttributes(args: Endofunction[com.pulumi.cloudflare.inputs.WaitingRoomCookieAttributesArgs.Builder]):
        com.pulumi.cloudflare.inputs.WaitingRoomState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WaitingRoomCookieAttributesArgs.builder
      builder.cookieAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.WebAnalyticsSiteState.Builder)
    /**
     * @param rules A list of rules.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.WebAnalyticsSiteRuleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WebAnalyticsSiteState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WebAnalyticsSiteRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    def ruleset(args: Endofunction[com.pulumi.cloudflare.inputs.WebAnalyticsSiteRulesetArgs.Builder]):
        com.pulumi.cloudflare.inputs.WebAnalyticsSiteState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WebAnalyticsSiteRulesetArgs.builder
      builder.ruleset(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerCronTriggerState.Builder)
    def schedules(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerCronTriggerScheduleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerCronTriggerState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerCronTriggerScheduleArgs.builder
      builder.schedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerObservabilityArgs.Builder)
    /**
     * @param issues Real-time Issues settings for the Worker.
     * @return builder
     */
    def issues(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerObservabilityIssuesArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerObservabilityArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerObservabilityIssuesArgs.builder
      builder.issues(args(argsBuilder).build)

    /**
     * @param logs Log settings for the Worker.
     * @return builder
     */
    def logs(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerObservabilityLogsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerObservabilityArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerObservabilityLogsArgs.builder
      builder.logs(args(argsBuilder).build)

    /**
     * @param traces Trace settings for the Worker.
     * @return builder
     */
    def traces(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerObservabilityTracesArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerObservabilityArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerObservabilityTracesArgs.builder
      builder.traces(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigArgs.Builder)
    /**
     * @param cacheOptions Cache options used when creating new Previews.
     * @return builder
     */
    def cacheOptions(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigCacheOptionsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigCacheOptionsArgs.builder
      builder.cacheOptions(args(argsBuilder).build)

    /**
     * @param limits Resource limits enforced at runtime for newly created Previews.
     * @return builder
     */
    def limits(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigLimitsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    /**
     * @param observability Observability settings used when creating new Previews.
     * @return builder
     */
    def observability(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigObservabilityArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigObservabilityArgs.builder
      builder.observability(args(argsBuilder).build)

    /**
     * @param placement Placement configuration used when creating new Previews.
     * @return builder
     */
    def placement(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigPlacementArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigPlacementArgs.builder
      builder.placement(args(argsBuilder).build)

    /**
     * @param tailConsumers Other Workers that should consume logs from newly created Previews.
     * @return builder
     */
    def tailConsumers(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigTailConsumerArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigTailConsumerArgs.builder
      builder.tailConsumers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigObservabilityArgs.Builder)
    /**
     * @param issues Real-time Issues settings for the Worker.
     * @return builder
     */
    def issues(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigObservabilityIssuesArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigObservabilityArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigObservabilityIssuesArgs.builder
      builder.issues(args(argsBuilder).build)

    /**
     * @param logs Log settings for the Worker.
     * @return builder
     */
    def logs(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigObservabilityLogsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigObservabilityArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigObservabilityLogsArgs.builder
      builder.logs(args(argsBuilder).build)

    /**
     * @param traces Trace settings for the Worker.
     * @return builder
     */
    def traces(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigObservabilityTracesArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigObservabilityArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigObservabilityTracesArgs.builder
      builder.traces(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigPlacementArgs.Builder)
    /**
     * @param targets Array of placement targets (currently limited to single target).
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigPlacementTargetArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigPlacementArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigPlacementTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerReferencesArgs.Builder)
    /**
     * @param dispatchNamespaceOutbounds Other Workers that reference the Worker as an outbound for a dispatch namespace.
     * @return builder
     */
    def dispatchNamespaceOutbounds(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerReferencesDispatchNamespaceOutboundArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerReferencesArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerReferencesDispatchNamespaceOutboundArgs.builder
      builder.dispatchNamespaceOutbounds(args.map(_(argsBuilder).build)*)

    /**
     * @param domains Custom domains connected to the Worker.
     * @return builder
     */
    def domains(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerReferencesDomainArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerReferencesArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerReferencesDomainArgs.builder
      builder.domains(args.map(_(argsBuilder).build)*)

    /**
     * @param durableObjects Other Workers that reference Durable Object classes implemented by the Worker.
     * @return builder
     */
    def durableObjects(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerReferencesDurableObjectArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerReferencesArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerReferencesDurableObjectArgs.builder
      builder.durableObjects(args.map(_(argsBuilder).build)*)

    /**
     * @param queues Queues that send messages to the Worker.
     * @return builder
     */
    def queues(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerReferencesQueueArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerReferencesArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerReferencesQueueArgs.builder
      builder.queues(args.map(_(argsBuilder).build)*)

    /**
     * @param workers Other Workers that reference the Worker using [service bindings](https://developers.cloudflare.com/workers/runtime-apis/bindings/service-bindings/).
     * @return builder
     */
    def workers(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerReferencesWorkerArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerReferencesArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerReferencesWorkerArgs.builder
      builder.workers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerScriptAssetsArgs.Builder)
    /**
     * @param config Configuration for assets within a Worker.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptAssetsConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerScriptAssetsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptAssetsConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerScriptBindingArgs.Builder)
    /**
     * @param outbound Outbound worker.
     * @return builder
     */
    def outbound(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptBindingOutboundArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerScriptBindingArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptBindingOutboundArgs.builder
      builder.outbound(args(argsBuilder).build)

    /**
     * @param retry Retry policy for calls made to the Durable Object through this binding. Omitted or null properties use the runtime defaults. These limits are upper bounds and do not enable retries for otherwise ineligible calls.
     * @return builder
     */
    def retry(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptBindingRetryArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerScriptBindingArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptBindingRetryArgs.builder
      builder.retry(args(argsBuilder).build)

    /**
     * @param simple A simple rate limit.
     * @return builder
     */
    def simple(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptBindingSimpleArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerScriptBindingArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptBindingSimpleArgs.builder
      builder.simple(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerScriptBindingOutboundArgs.Builder)
    /**
     * @param worker Outbound worker.
     * @return builder
     */
    def worker(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptBindingOutboundWorkerArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerScriptBindingOutboundArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptBindingOutboundWorkerArgs.builder
      builder.worker(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerScriptExportsArgs.Builder)
    /**
     * @param cache Per-entrypoint cache override. When present, this overrides the top-level `cacheOptions` for this specific entrypoint.
     * @return builder
     */
    def cache(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptExportsCacheArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerScriptExportsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptExportsCacheArgs.builder
      builder.cache(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerScriptMigrationsArgs.Builder)
    /**
     * @param renamedClasses A list of classes with Durable Object namespaces that were renamed.
     * @return builder
     */
    def renamedClasses(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptMigrationsRenamedClassArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerScriptMigrationsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptMigrationsRenamedClassArgs.builder
      builder.renamedClasses(args.map(_(argsBuilder).build)*)

    /**
     * @param steps Migrations to apply in order.
     * @return builder
     */
    def steps(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptMigrationsStepArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerScriptMigrationsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptMigrationsStepArgs.builder
      builder.steps(args.map(_(argsBuilder).build)*)

    /**
     * @param transferredClasses A list of transfers for Durable Object namespaces from a different Worker and class to a class defined in this Worker.
     * @return builder
     */
    def transferredClasses(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptMigrationsTransferredClassArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerScriptMigrationsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptMigrationsTransferredClassArgs.builder
      builder.transferredClasses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerScriptMigrationsStepArgs.Builder)
    /**
     * @param renamedClasses A list of classes with Durable Object namespaces that were renamed.
     * @return builder
     */
    def renamedClasses(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptMigrationsStepRenamedClassArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerScriptMigrationsStepArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptMigrationsStepRenamedClassArgs.builder
      builder.renamedClasses(args.map(_(argsBuilder).build)*)

    /**
     * @param transferredClasses A list of transfers for Durable Object namespaces from a different Worker and class to a class defined in this Worker.
     * @return builder
     */
    def transferredClasses(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptMigrationsStepTransferredClassArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerScriptMigrationsStepArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptMigrationsStepTransferredClassArgs.builder
      builder.transferredClasses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerScriptObservabilityArgs.Builder)
    /**
     * @param issues Real-time Issues settings for the Worker.
     * @return builder
     */
    def issues(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptObservabilityIssuesArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerScriptObservabilityArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptObservabilityIssuesArgs.builder
      builder.issues(args(argsBuilder).build)

    /**
     * @param logs Log settings for the Worker.
     * @return builder
     */
    def logs(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptObservabilityLogsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerScriptObservabilityArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptObservabilityLogsArgs.builder
      builder.logs(args(argsBuilder).build)

    /**
     * @param traces Trace settings for the Worker.
     * @return builder
     */
    def traces(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptObservabilityTracesArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerScriptObservabilityArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptObservabilityTracesArgs.builder
      builder.traces(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerScriptPlacementArgs.Builder)
    /**
     * @param targets Array of placement targets (currently limited to single target).
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptPlacementTargetArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerScriptPlacementArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptPlacementTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerScriptState.Builder)
    /**
     * @param annotations Annotations for the version created by this upload.
     * @return builder
     */
    def annotations(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptAnnotationsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerScriptState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptAnnotationsArgs.builder
      builder.annotations(args(argsBuilder).build)

    /**
     * @param assets Configuration for assets within a Worker.
     * @return builder
     */
    def assets(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptAssetsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerScriptState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptAssetsArgs.builder
      builder.assets(args(argsBuilder).build)

    /**
     * @param bindings List of bindings attached to a Worker. You can find more about bindings on our docs: https://developers.cloudflare.com/workers/configuration/multipart-upload-metadata/#bindings.
     * @return builder
     */
    def bindings(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptBindingArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerScriptState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptBindingArgs.builder
      builder.bindings(args.map(_(argsBuilder).build)*)

    /**
     * @param cacheOptions Global CacheW configuration for the Worker. When caching is on,
     * the platform provisions a `cloudflare.app` zone for the Worker.
     * A `type: worker` entry in the `exports` map can override this
     * value for a single entrypoint.
     * @return builder
     */
    def cacheOptions(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptCacheOptionsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerScriptState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptCacheOptionsArgs.builder
      builder.cacheOptions(args(argsBuilder).build)

    /**
     * @param limits Limits to apply for this Worker.
     * @return builder
     */
    def limits(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptLimitsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerScriptState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    /**
     * @param migrations Migrations to apply for Durable Objects associated with this Worker.
     * @return builder
     */
    def migrations(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptMigrationsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerScriptState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptMigrationsArgs.builder
      builder.migrations(args(argsBuilder).build)

    /**
     * @param namedHandlers Named exports, such as Durable Object class implementations and named entrypoints.
     * @return builder
     */
    def namedHandlers(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptNamedHandlerArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerScriptState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptNamedHandlerArgs.builder
      builder.namedHandlers(args.map(_(argsBuilder).build)*)

    /**
     * @param observability Observability settings for the Worker.
     * @return builder
     */
    def observability(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptObservabilityArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerScriptState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptObservabilityArgs.builder
      builder.observability(args(argsBuilder).build)

    /**
     * @param packageDependencies The list of npm packages that were installed and used when this Worker was built.
     * @return builder
     */
    def packageDependencies(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptPackageDependencyArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerScriptState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptPackageDependencyArgs.builder
      builder.packageDependencies(args.map(_(argsBuilder).build)*)

    /**
     * @param placement Configuration for [Smart Placement](https://developers.cloudflare.com/workers/configuration/smart-placement). Specify mode=&#39;smart&#39; for Smart Placement, or one of region/hostname/host.
     * @return builder
     */
    def placement(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptPlacementArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerScriptState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptPlacementArgs.builder
      builder.placement(args(argsBuilder).build)

    /**
     * @param tailConsumers List of Workers that will consume logs from the attached Worker.
     * @return builder
     */
    def tailConsumers(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptTailConsumerArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerScriptState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptTailConsumerArgs.builder
      builder.tailConsumers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerState.Builder)
    /**
     * @param observability Observability settings for the Worker.
     * @return builder
     */
    def observability(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerObservabilityArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerObservabilityArgs.builder
      builder.observability(args(argsBuilder).build)

    /**
     * @param previewsBaseConfig Template configuration used when creating new Previews for this Worker.
     * @return builder
     */
    def previewsBaseConfig(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigArgs.builder
      builder.previewsBaseConfig(args(argsBuilder).build)

    /**
     * @param references Other resources that reference the Worker and depend on it existing.
     * @return builder
     */
    def references(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerReferencesArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerReferencesArgs.builder
      builder.references(args(argsBuilder).build)

    /**
     * @param subdomain Subdomain settings for the Worker.
     * @return builder
     */
    def subdomain(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerSubdomainArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerSubdomainArgs.builder
      builder.subdomain(args(argsBuilder).build)

    /**
     * @param tailConsumers Other Workers that should consume logs from the Worker.
     * @return builder
     */
    def tailConsumers(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerTailConsumerArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerTailConsumerArgs.builder
      builder.tailConsumers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerVersionAssetsArgs.Builder)
    /**
     * @param config Configuration for assets within a Worker.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionAssetsConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerVersionAssetsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionAssetsConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerVersionBindingArgs.Builder)
    /**
     * @param outbound Outbound worker.
     * @return builder
     */
    def outbound(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionBindingOutboundArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerVersionBindingArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionBindingOutboundArgs.builder
      builder.outbound(args(argsBuilder).build)

    /**
     * @param retry Retry policy for calls made to the Durable Object through this binding. Omitted or null properties use the runtime defaults. These limits are upper bounds and do not enable retries for otherwise ineligible calls.
     * @return builder
     */
    def retry(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionBindingRetryArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerVersionBindingArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionBindingRetryArgs.builder
      builder.retry(args(argsBuilder).build)

    /**
     * @param simple The rate limit configuration.
     * @return builder
     */
    def simple(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionBindingSimpleArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerVersionBindingArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionBindingSimpleArgs.builder
      builder.simple(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerVersionBindingOutboundArgs.Builder)
    /**
     * @param params Pass information from the Dispatch Worker to the Outbound Worker through the parameters.
     * @return builder
     */
    def params(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionBindingOutboundParamArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerVersionBindingOutboundArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionBindingOutboundParamArgs.builder
      builder.params(args.map(_(argsBuilder).build)*)

    /**
     * @param worker Outbound worker.
     * @return builder
     */
    def worker(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionBindingOutboundWorkerArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerVersionBindingOutboundArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionBindingOutboundWorkerArgs.builder
      builder.worker(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerVersionExportsArgs.Builder)
    /**
     * @param cache Cache override for this entrypoint. It applies only to
     * `type: worker` entries and overrides the Worker&#39;s global
     * `cache_options.enabled` for that entrypoint.
     * @return builder
     */
    def cache(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionExportsCacheArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerVersionExportsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionExportsCacheArgs.builder
      builder.cache(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerVersionExportsReconciliationArgs.Builder)
    /**
     * @param infos Non-blocking info entries (stale tombstones, tombstone applied with class still in code). See `exportsReconciliationInfo`.
     * @return builder
     */
    def infos(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionExportsReconciliationInfoArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerVersionExportsReconciliationArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionExportsReconciliationInfoArgs.builder
      builder.infos(args.map(_(argsBuilder).build)*)

    /**
     * @param renameds Applied `renamed` tombstones.
     * @return builder
     */
    def renameds(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionExportsReconciliationRenamedArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerVersionExportsReconciliationArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionExportsReconciliationRenamedArgs.builder
      builder.renameds(args.map(_(argsBuilder).build)*)

    /**
     * @param transferPendings Phase-1 transfer hints recorded on the target side.
     * @return builder
     */
    def transferPendings(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionExportsReconciliationTransferPendingArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerVersionExportsReconciliationArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionExportsReconciliationTransferPendingArgs.builder
      builder.transferPendings(args.map(_(argsBuilder).build)*)

    /**
     * @param transferreds Committed `transferred` tombstones (phase-2).
     * @return builder
     */
    def transferreds(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionExportsReconciliationTransferredArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerVersionExportsReconciliationArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionExportsReconciliationTransferredArgs.builder
      builder.transferreds(args.map(_(argsBuilder).build)*)

    /**
     * @param warnings Non-blocking warnings. See `exportsReconciliationWarning`.
     * @return builder
     */
    def warnings(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionExportsReconciliationWarningArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerVersionExportsReconciliationArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionExportsReconciliationWarningArgs.builder
      builder.warnings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerVersionMigrationsArgs.Builder)
    /**
     * @param renamedClasses A list of classes with Durable Object namespaces that were renamed.
     * @return builder
     */
    def renamedClasses(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionMigrationsRenamedClassArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerVersionMigrationsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionMigrationsRenamedClassArgs.builder
      builder.renamedClasses(args.map(_(argsBuilder).build)*)

    /**
     * @param steps Migrations to apply in order.
     * @return builder
     */
    def steps(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionMigrationsStepArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerVersionMigrationsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionMigrationsStepArgs.builder
      builder.steps(args.map(_(argsBuilder).build)*)

    /**
     * @param transferredClasses A list of transfers for Durable Object namespaces from a different Worker and class to a class defined in this Worker.
     * @return builder
     */
    def transferredClasses(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionMigrationsTransferredClassArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerVersionMigrationsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionMigrationsTransferredClassArgs.builder
      builder.transferredClasses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerVersionMigrationsStepArgs.Builder)
    /**
     * @param renamedClasses A list of classes with Durable Object namespaces that were renamed.
     * @return builder
     */
    def renamedClasses(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionMigrationsStepRenamedClassArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerVersionMigrationsStepArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionMigrationsStepRenamedClassArgs.builder
      builder.renamedClasses(args.map(_(argsBuilder).build)*)

    /**
     * @param transferredClasses A list of transfers for Durable Object namespaces from a different Worker and class to a class defined in this Worker.
     * @return builder
     */
    def transferredClasses(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionMigrationsStepTransferredClassArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerVersionMigrationsStepArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionMigrationsStepTransferredClassArgs.builder
      builder.transferredClasses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerVersionPlacementArgs.Builder)
    /**
     * @param targets Array of placement targets (currently limited to single target).
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionPlacementTargetArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerVersionPlacementArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionPlacementTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.WorkerVersionState.Builder)
    /**
     * @param annotations Metadata about the version.
     * @return builder
     */
    def annotations(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionAnnotationsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerVersionState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionAnnotationsArgs.builder
      builder.annotations(args(argsBuilder).build)

    /**
     * @param assets Configuration for assets within a Worker.
     * @return builder
     */
    def assets(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionAssetsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerVersionState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionAssetsArgs.builder
      builder.assets(args(argsBuilder).build)

    /**
     * @param bindings List of bindings attached to a Worker. You can find more about bindings on our docs: https://developers.cloudflare.com/workers/configuration/multipart-upload-metadata/#bindings.
     * @return builder
     */
    def bindings(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionBindingArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerVersionState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionBindingArgs.builder
      builder.bindings(args.map(_(argsBuilder).build)*)

    /**
     * @param cacheOptions Global CacheW configuration for the Worker. When caching is on,
     * the platform provisions a `cloudflare.app` zone for the Worker.
     * A `type: worker` entry in the `exports` map can override this
     * value for a single entrypoint.
     * @return builder
     */
    def cacheOptions(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionCacheOptionsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerVersionState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionCacheOptionsArgs.builder
      builder.cacheOptions(args(argsBuilder).build)

    /**
     * @param containers List of containers attached to a Worker. Containers can only be attached to Durable Object classes of this Worker script.
     * @return builder
     */
    def containers(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionContainerArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerVersionState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

    /**
     * @param exportsReconciliation Summary of the declarative exports reconciliation that ran on this upload. Populated only when the uploaded metadata included an `exports` block. Durable Object entries drive reconciliation; `type: worker` entries do not contribute to this summary.
     * @return builder
     */
    def exportsReconciliation(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionExportsReconciliationArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerVersionState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionExportsReconciliationArgs.builder
      builder.exportsReconciliation(args(argsBuilder).build)

    /**
     * @param limits Resource limits enforced at runtime.
     * @return builder
     */
    def limits(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionLimitsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerVersionState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    /**
     * @param migrations Migrations for Durable Objects associated with the version. Migrations are applied when the version is deployed.
     * @return builder
     */
    def migrations(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionMigrationsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerVersionState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionMigrationsArgs.builder
      builder.migrations(args(argsBuilder).build)

    /**
     * @param modules Code, sourcemaps, and other content used at runtime.
     * 
     * This includes [`_headers`](https://developers.cloudflare.com/workers/static-assets/headers/#custom-headers) and
     * [`_redirects`](https://developers.cloudflare.com/workers/static-assets/redirects/) files used to configure
     * [Static Assets](https://developers.cloudflare.com/workers/static-assets/). `_headers` and `_redirects` files should be
     * included as modules named `_headers` and `_redirects` with content type `text/plain`.
     * @return builder
     */
    def modules(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionModuleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerVersionState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionModuleArgs.builder
      builder.modules(args.map(_(argsBuilder).build)*)

    /**
     * @param packageDependencies The list of npm packages that were installed and used when this Worker
     * version was built.
     * @return builder
     */
    def packageDependencies(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionPackageDependencyArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkerVersionState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionPackageDependencyArgs.builder
      builder.packageDependencies(args.map(_(argsBuilder).build)*)

    /**
     * @param placement Configuration for [Smart Placement](https://developers.cloudflare.com/workers/configuration/smart-placement). Specify mode=&#39;smart&#39; for Smart Placement, or one of region/hostname/host.
     * @return builder
     */
    def placement(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionPlacementArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkerVersionState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionPlacementArgs.builder
      builder.placement(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.WorkersCronTriggerState.Builder)
    def schedules(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersCronTriggerScheduleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkersCronTriggerState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkersCronTriggerScheduleArgs.builder
      builder.schedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.WorkersDeploymentState.Builder)
    def annotations(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersDeploymentAnnotationsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkersDeploymentState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersDeploymentAnnotationsArgs.builder
      builder.annotations(args(argsBuilder).build)

    /**
     * @param versions Worker versions included in this deployment. Each object must contain a `versionId` UUID and a `percentage`; percentages across all objects must total 100. In the `cf` CLI, pass the entire array as one JSON value to `--versions`, either inline, for example `--versions &#39;[{&#34;versionId&#34;:&#34;023e105f-2a42-4f8b-a1c1-73f6a2a30c0f&#34;,&#34;percentage&#34;:100}]&#39;`, or from a JSON file with `--versions {@literal @}versions.json`.
     * @return builder
     */
    def versions(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersDeploymentVersionArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkersDeploymentState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkersDeploymentVersionArgs.builder
      builder.versions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.WorkersScriptAssetsArgs.Builder)
    /**
     * @param config Configuration for assets within a Worker.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptAssetsConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkersScriptAssetsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptAssetsConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.WorkersScriptBindingArgs.Builder)
    /**
     * @param outbound Outbound worker.
     * @return builder
     */
    def outbound(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptBindingOutboundArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkersScriptBindingArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptBindingOutboundArgs.builder
      builder.outbound(args(argsBuilder).build)

    /**
     * @param retry Retry policy for calls made to the Durable Object through this binding. Omitted or null properties use the runtime defaults. These limits are upper bounds and do not enable retries for otherwise ineligible calls.
     * @return builder
     */
    def retry(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptBindingRetryArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkersScriptBindingArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptBindingRetryArgs.builder
      builder.retry(args(argsBuilder).build)

    /**
     * @param simple A simple rate limit.
     * @return builder
     */
    def simple(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptBindingSimpleArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkersScriptBindingArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptBindingSimpleArgs.builder
      builder.simple(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.WorkersScriptBindingOutboundArgs.Builder)
    /**
     * @param worker Outbound worker.
     * @return builder
     */
    def worker(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptBindingOutboundWorkerArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkersScriptBindingOutboundArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptBindingOutboundWorkerArgs.builder
      builder.worker(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.WorkersScriptExportsArgs.Builder)
    /**
     * @param cache Per-entrypoint cache override. When present, this overrides the top-level `cacheOptions` for this specific entrypoint.
     * @return builder
     */
    def cache(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptExportsCacheArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkersScriptExportsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptExportsCacheArgs.builder
      builder.cache(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.WorkersScriptMigrationsArgs.Builder)
    /**
     * @param renamedClasses A list of classes with Durable Object namespaces that were renamed.
     * @return builder
     */
    def renamedClasses(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptMigrationsRenamedClassArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkersScriptMigrationsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptMigrationsRenamedClassArgs.builder
      builder.renamedClasses(args.map(_(argsBuilder).build)*)

    /**
     * @param steps Migrations to apply in order.
     * @return builder
     */
    def steps(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptMigrationsStepArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkersScriptMigrationsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptMigrationsStepArgs.builder
      builder.steps(args.map(_(argsBuilder).build)*)

    /**
     * @param transferredClasses A list of transfers for Durable Object namespaces from a different Worker and class to a class defined in this Worker.
     * @return builder
     */
    def transferredClasses(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptMigrationsTransferredClassArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkersScriptMigrationsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptMigrationsTransferredClassArgs.builder
      builder.transferredClasses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.WorkersScriptMigrationsStepArgs.Builder)
    /**
     * @param renamedClasses A list of classes with Durable Object namespaces that were renamed.
     * @return builder
     */
    def renamedClasses(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptMigrationsStepRenamedClassArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkersScriptMigrationsStepArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptMigrationsStepRenamedClassArgs.builder
      builder.renamedClasses(args.map(_(argsBuilder).build)*)

    /**
     * @param transferredClasses A list of transfers for Durable Object namespaces from a different Worker and class to a class defined in this Worker.
     * @return builder
     */
    def transferredClasses(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptMigrationsStepTransferredClassArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkersScriptMigrationsStepArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptMigrationsStepTransferredClassArgs.builder
      builder.transferredClasses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.WorkersScriptObservabilityArgs.Builder)
    /**
     * @param issues Real-time Issues settings for the Worker.
     * @return builder
     */
    def issues(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptObservabilityIssuesArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkersScriptObservabilityArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptObservabilityIssuesArgs.builder
      builder.issues(args(argsBuilder).build)

    /**
     * @param logs Log settings for the Worker.
     * @return builder
     */
    def logs(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptObservabilityLogsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkersScriptObservabilityArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptObservabilityLogsArgs.builder
      builder.logs(args(argsBuilder).build)

    /**
     * @param traces Trace settings for the Worker.
     * @return builder
     */
    def traces(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptObservabilityTracesArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkersScriptObservabilityArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptObservabilityTracesArgs.builder
      builder.traces(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.WorkersScriptPlacementArgs.Builder)
    /**
     * @param targets Array of placement targets (currently limited to single target).
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptPlacementTargetArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkersScriptPlacementArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptPlacementTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.WorkersScriptState.Builder)
    /**
     * @param annotations Annotations for the version created by this upload.
     * @return builder
     */
    def annotations(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptAnnotationsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkersScriptState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptAnnotationsArgs.builder
      builder.annotations(args(argsBuilder).build)

    /**
     * @param assets Configuration for assets within a Worker.
     * @return builder
     */
    def assets(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptAssetsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkersScriptState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptAssetsArgs.builder
      builder.assets(args(argsBuilder).build)

    /**
     * @param bindings List of bindings attached to a Worker. You can find more about bindings on our docs: https://developers.cloudflare.com/workers/configuration/multipart-upload-metadata/#bindings.
     * @return builder
     */
    def bindings(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptBindingArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkersScriptState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptBindingArgs.builder
      builder.bindings(args.map(_(argsBuilder).build)*)

    /**
     * @param cacheOptions Global CacheW configuration for the Worker. When caching is on,
     * the platform provisions a `cloudflare.app` zone for the Worker.
     * A `type: worker` entry in the `exports` map can override this
     * value for a single entrypoint.
     * @return builder
     */
    def cacheOptions(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptCacheOptionsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkersScriptState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptCacheOptionsArgs.builder
      builder.cacheOptions(args(argsBuilder).build)

    /**
     * @param limits Limits to apply for this Worker.
     * @return builder
     */
    def limits(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptLimitsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkersScriptState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    /**
     * @param migrations Migrations to apply for Durable Objects associated with this Worker.
     * @return builder
     */
    def migrations(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptMigrationsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkersScriptState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptMigrationsArgs.builder
      builder.migrations(args(argsBuilder).build)

    /**
     * @param namedHandlers Named exports, such as Durable Object class implementations and named entrypoints.
     * @return builder
     */
    def namedHandlers(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptNamedHandlerArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkersScriptState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptNamedHandlerArgs.builder
      builder.namedHandlers(args.map(_(argsBuilder).build)*)

    /**
     * @param observability Observability settings for the Worker.
     * @return builder
     */
    def observability(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptObservabilityArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkersScriptState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptObservabilityArgs.builder
      builder.observability(args(argsBuilder).build)

    /**
     * @param packageDependencies The list of npm packages that were installed and used when this Worker was built.
     * @return builder
     */
    def packageDependencies(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptPackageDependencyArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkersScriptState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptPackageDependencyArgs.builder
      builder.packageDependencies(args.map(_(argsBuilder).build)*)

    /**
     * @param placement Configuration for [Smart Placement](https://developers.cloudflare.com/workers/configuration/smart-placement). Specify mode=&#39;smart&#39; for Smart Placement, or one of region/hostname/host.
     * @return builder
     */
    def placement(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptPlacementArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkersScriptState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptPlacementArgs.builder
      builder.placement(args(argsBuilder).build)

    /**
     * @param tailConsumers List of Workers that will consume logs from the attached Worker.
     * @return builder
     */
    def tailConsumers(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptTailConsumerArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkersScriptState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptTailConsumerArgs.builder
      builder.tailConsumers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.WorkflowState.Builder)
    def concurrency(args: Endofunction[com.pulumi.cloudflare.inputs.WorkflowConcurrencyArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkflowState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkflowConcurrencyArgs.builder
      builder.concurrency(args(argsBuilder).build)

    /**
     * @param defaultRetention Default retention applied to instances of this version when they do not set their own retention.
     * @return builder
     */
    def defaultRetention(args: Endofunction[com.pulumi.cloudflare.inputs.WorkflowDefaultRetentionArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkflowState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkflowDefaultRetentionArgs.builder
      builder.defaultRetention(args(argsBuilder).build)

    def limits(args: Endofunction[com.pulumi.cloudflare.inputs.WorkflowLimitsArgs.Builder]):
        com.pulumi.cloudflare.inputs.WorkflowState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkflowLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    def schedules(args: Endofunction[com.pulumi.cloudflare.inputs.WorkflowScheduleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.WorkflowState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkflowScheduleArgs.builder
      builder.schedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpPortalServerArgs.Builder)
    /**
     * @param updatedPrompts Portal-specific prompt overrides.
     * @return builder
     */
    def updatedPrompts(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpPortalServerUpdatedPromptArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpPortalServerArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpPortalServerUpdatedPromptArgs.builder
      builder.updatedPrompts(args.map(_(argsBuilder).build)*)

    /**
     * @param updatedTools Portal-specific tool overrides.
     * @return builder
     */
    def updatedTools(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpPortalServerUpdatedToolArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpPortalServerArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpPortalServerUpdatedToolArgs.builder
      builder.updatedTools(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpPortalState.Builder)
    /**
     * @param servers MCP servers attached to the portal and their portal-specific settings.
     * @return builder
     */
    def servers(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpPortalServerArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpPortalState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpPortalServerArgs.builder
      builder.servers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerAuthConfigSummaryArgs.Builder)
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerAuthConfigSummaryConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerAuthConfigSummaryArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerAuthConfigSummaryConfigArgs.builder
      builder.config(args(argsBuilder).build)

    def registrationInfo(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerAuthConfigSummaryRegistrationInfoArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerAuthConfigSummaryArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerAuthConfigSummaryRegistrationInfoArgs.builder
      builder.registrationInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerState.Builder)
    /**
     * @param authConfigSummary Safe subset of auth*credentials surfaced to the dashboard. Includes auth*mode (dcr|manual), has*client*secret, client*secret*version, and the OAuth endpoints + client*id for manual servers. Never includes the secret value.
     * @return builder
     */
    def authConfigSummary(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerAuthConfigSummaryArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerAuthConfigSummaryArgs.builder
      builder.authConfigSummary(args(argsBuilder).build)

    def errorDetails(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerErrorDetailsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerErrorDetailsArgs.builder
      builder.errorDetails(args(argsBuilder).build)

    /**
     * @param updatedPrompts Server-wide prompt capability overrides.
     * @return builder
     */
    def updatedPrompts(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerUpdatedPromptArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerUpdatedPromptArgs.builder
      builder.updatedPrompts(args.map(_(argsBuilder).build)*)

    /**
     * @param updatedTools Server-wide tool capability overrides.
     * @return builder
     */
    def updatedTools(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerUpdatedToolArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerUpdatedToolArgs.builder
      builder.updatedTools(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationOauthConfigurationArgs.Builder)
    /**
     * @param dynamicClientRegistration Settings for OAuth dynamic client registration.
     * @return builder
     */
    def dynamicClientRegistration(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationOauthConfigurationDynamicClientRegistrationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationOauthConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationOauthConfigurationDynamicClientRegistrationArgs.builder
      builder.dynamicClientRegistration(args(argsBuilder).build)

    /**
     * @param grant Settings for OAuth grant behavior.
     * @return builder
     */
    def grant(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationOauthConfigurationGrantArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationOauthConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationOauthConfigurationGrantArgs.builder
      builder.grant(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyArgs.Builder)
    /**
     * @param connectionRules The rules that define how users may connect to the targets secured by your application.
     * @return builder
     */
    def connectionRules(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyConnectionRulesArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyConnectionRulesArgs.builder
      builder.connectionRules(args(argsBuilder).build)

    /**
     * @param excludes Rules evaluated with a NOT logical operator. To match the policy, a user cannot meet any of the Exclude rules.
     * @return builder
     */
    def excludes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.builder
      builder.excludes(args.map(_(argsBuilder).build)*)

    /**
     * @param includes Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules.
     * @return builder
     */
    def includes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.builder
      builder.includes(args.map(_(argsBuilder).build)*)

    /**
     * @param mfaConfig Configures multi-factor authentication (MFA) settings for this policy. For infrastructure applications only `sshPivKey` is a supported authenticator; for other application types use `totp`, `biometrics`, or `securityKey`.
     * @return builder
     */
    def mfaConfig(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyMfaConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyMfaConfigArgs.builder
      builder.mfaConfig(args(argsBuilder).build)

    /**
     * @param requires Rules evaluated with an AND logical operator. To match the policy, a user must meet all of the Require rules.
     * @return builder
     */
    def requires(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.builder
      builder.requires(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyConnectionRulesArgs.Builder)
    /**
     * @param rdp The RDP-specific rules that define clipboard behavior for RDP connections.
     * @return builder
     */
    def rdp(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyConnectionRulesRdpArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyConnectionRulesArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyConnectionRulesRdpArgs.builder
      builder.rdp(args(argsBuilder).build)

    /**
     * @param ssh The SSH-specific rules that define how users may connect to the targets secured by your application.
     * @return builder
     */
    def ssh(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyConnectionRulesSshArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyConnectionRulesArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyConnectionRulesSshArgs.builder
      builder.ssh(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder)
    /**
     * @param anyValidServiceToken An empty object which matches on all service tokens.
     * @return builder
     */
    def anyValidServiceToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeAnyValidServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeAnyValidServiceTokenArgs.builder
      builder.anyValidServiceToken(args(argsBuilder).build)

    def authContext(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeAuthContextArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeAuthContextArgs.builder
      builder.authContext(args(argsBuilder).build)

    def authMethod(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeAuthMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeAuthMethodArgs.builder
      builder.authMethod(args(argsBuilder).build)

    def azureAd(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeAzureAdArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeAzureAdArgs.builder
      builder.azureAd(args(argsBuilder).build)

    def certificate(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    def commonName(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeCommonNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeCommonNameArgs.builder
      builder.commonName(args(argsBuilder).build)

    def devicePosture(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeDevicePostureArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeDevicePostureArgs.builder
      builder.devicePosture(args(argsBuilder).build)

    def email(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeEmailArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeEmailArgs.builder
      builder.email(args(argsBuilder).build)

    def emailDomain(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeEmailDomainArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeEmailDomainArgs.builder
      builder.emailDomain(args(argsBuilder).build)

    def emailList(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeEmailListArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeEmailListArgs.builder
      builder.emailList(args(argsBuilder).build)

    /**
     * @param everyone An empty object which matches on all users.
     * @return builder
     */
    def everyone(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeEveryoneArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeEveryoneArgs.builder
      builder.everyone(args(argsBuilder).build)

    def externalEvaluation(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeExternalEvaluationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeExternalEvaluationArgs.builder
      builder.externalEvaluation(args(argsBuilder).build)

    def geo(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeGeoArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeGeoArgs.builder
      builder.geo(args(argsBuilder).build)

    def githubOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeGithubOrganizationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeGithubOrganizationArgs.builder
      builder.githubOrganization(args(argsBuilder).build)

    def group(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeGroupArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeGroupArgs.builder
      builder.group(args(argsBuilder).build)

    def gsuite(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeGsuiteArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeGsuiteArgs.builder
      builder.gsuite(args(argsBuilder).build)

    def ip(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeIpArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeIpArgs.builder
      builder.ip(args(argsBuilder).build)

    def ipList(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeIpListArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeIpListArgs.builder
      builder.ipList(args(argsBuilder).build)

    def linkedAppToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeLinkedAppTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeLinkedAppTokenArgs.builder
      builder.linkedAppToken(args(argsBuilder).build)

    def loginMethod(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeLoginMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeLoginMethodArgs.builder
      builder.loginMethod(args(argsBuilder).build)

    def oidc(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeOidcArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    def okta(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeOktaArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeOktaArgs.builder
      builder.okta(args(argsBuilder).build)

    def saml(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeSamlArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    def serviceToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyExcludeServiceTokenArgs.builder
      builder.serviceToken(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder)
    /**
     * @param anyValidServiceToken An empty object which matches on all service tokens.
     * @return builder
     */
    def anyValidServiceToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeAnyValidServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeAnyValidServiceTokenArgs.builder
      builder.anyValidServiceToken(args(argsBuilder).build)

    def authContext(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeAuthContextArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeAuthContextArgs.builder
      builder.authContext(args(argsBuilder).build)

    def authMethod(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeAuthMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeAuthMethodArgs.builder
      builder.authMethod(args(argsBuilder).build)

    def azureAd(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeAzureAdArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeAzureAdArgs.builder
      builder.azureAd(args(argsBuilder).build)

    def certificate(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    def commonName(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeCommonNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeCommonNameArgs.builder
      builder.commonName(args(argsBuilder).build)

    def devicePosture(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeDevicePostureArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeDevicePostureArgs.builder
      builder.devicePosture(args(argsBuilder).build)

    def email(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeEmailArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeEmailArgs.builder
      builder.email(args(argsBuilder).build)

    def emailDomain(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeEmailDomainArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeEmailDomainArgs.builder
      builder.emailDomain(args(argsBuilder).build)

    def emailList(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeEmailListArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeEmailListArgs.builder
      builder.emailList(args(argsBuilder).build)

    /**
     * @param everyone An empty object which matches on all users.
     * @return builder
     */
    def everyone(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeEveryoneArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeEveryoneArgs.builder
      builder.everyone(args(argsBuilder).build)

    def externalEvaluation(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeExternalEvaluationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeExternalEvaluationArgs.builder
      builder.externalEvaluation(args(argsBuilder).build)

    def geo(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeGeoArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeGeoArgs.builder
      builder.geo(args(argsBuilder).build)

    def githubOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeGithubOrganizationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeGithubOrganizationArgs.builder
      builder.githubOrganization(args(argsBuilder).build)

    def group(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeGroupArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeGroupArgs.builder
      builder.group(args(argsBuilder).build)

    def gsuite(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeGsuiteArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeGsuiteArgs.builder
      builder.gsuite(args(argsBuilder).build)

    def ip(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeIpArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeIpArgs.builder
      builder.ip(args(argsBuilder).build)

    def ipList(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeIpListArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeIpListArgs.builder
      builder.ipList(args(argsBuilder).build)

    def linkedAppToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeLinkedAppTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeLinkedAppTokenArgs.builder
      builder.linkedAppToken(args(argsBuilder).build)

    def loginMethod(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeLoginMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeLoginMethodArgs.builder
      builder.loginMethod(args(argsBuilder).build)

    def oidc(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeOidcArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    def okta(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeOktaArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeOktaArgs.builder
      builder.okta(args(argsBuilder).build)

    def saml(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeSamlArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    def serviceToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyIncludeServiceTokenArgs.builder
      builder.serviceToken(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder)
    /**
     * @param anyValidServiceToken An empty object which matches on all service tokens.
     * @return builder
     */
    def anyValidServiceToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireAnyValidServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireAnyValidServiceTokenArgs.builder
      builder.anyValidServiceToken(args(argsBuilder).build)

    def authContext(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireAuthContextArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireAuthContextArgs.builder
      builder.authContext(args(argsBuilder).build)

    def authMethod(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireAuthMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireAuthMethodArgs.builder
      builder.authMethod(args(argsBuilder).build)

    def azureAd(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireAzureAdArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireAzureAdArgs.builder
      builder.azureAd(args(argsBuilder).build)

    def certificate(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    def commonName(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireCommonNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireCommonNameArgs.builder
      builder.commonName(args(argsBuilder).build)

    def devicePosture(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireDevicePostureArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireDevicePostureArgs.builder
      builder.devicePosture(args(argsBuilder).build)

    def email(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireEmailArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireEmailArgs.builder
      builder.email(args(argsBuilder).build)

    def emailDomain(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireEmailDomainArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireEmailDomainArgs.builder
      builder.emailDomain(args(argsBuilder).build)

    def emailList(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireEmailListArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireEmailListArgs.builder
      builder.emailList(args(argsBuilder).build)

    /**
     * @param everyone An empty object which matches on all users.
     * @return builder
     */
    def everyone(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireEveryoneArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireEveryoneArgs.builder
      builder.everyone(args(argsBuilder).build)

    def externalEvaluation(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireExternalEvaluationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireExternalEvaluationArgs.builder
      builder.externalEvaluation(args(argsBuilder).build)

    def geo(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireGeoArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireGeoArgs.builder
      builder.geo(args(argsBuilder).build)

    def githubOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireGithubOrganizationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireGithubOrganizationArgs.builder
      builder.githubOrganization(args(argsBuilder).build)

    def group(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireGroupArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireGroupArgs.builder
      builder.group(args(argsBuilder).build)

    def gsuite(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireGsuiteArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireGsuiteArgs.builder
      builder.gsuite(args(argsBuilder).build)

    def ip(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireIpArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireIpArgs.builder
      builder.ip(args(argsBuilder).build)

    def ipList(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireIpListArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireIpListArgs.builder
      builder.ipList(args(argsBuilder).build)

    def linkedAppToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireLinkedAppTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireLinkedAppTokenArgs.builder
      builder.linkedAppToken(args(argsBuilder).build)

    def loginMethod(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireLoginMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireLoginMethodArgs.builder
      builder.loginMethod(args(argsBuilder).build)

    def oidc(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireOidcArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    def okta(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireOktaArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireOktaArgs.builder
      builder.okta(args(argsBuilder).build)

    def saml(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireSamlArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    def serviceToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyRequireServiceTokenArgs.builder
      builder.serviceToken(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppArgs.Builder)
    def customAttributes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppCustomAttributeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppCustomAttributeArgs.builder
      builder.customAttributes(args.map(_(argsBuilder).build)*)

    def customClaims(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppCustomClaimArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppCustomClaimArgs.builder
      builder.customClaims(args.map(_(argsBuilder).build)*)

    def hybridAndImplicitOptions(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppHybridAndImplicitOptionsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppHybridAndImplicitOptionsArgs.builder
      builder.hybridAndImplicitOptions(args(argsBuilder).build)

    def refreshTokenOptions(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppRefreshTokenOptionsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppRefreshTokenOptionsArgs.builder
      builder.refreshTokenOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppCustomAttributeArgs.Builder)
    def source(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppCustomAttributeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs.Builder)
    /**
     * @param nameByIdps A mapping from IdP ID to attribute name.
     * @return builder
     */
    def nameByIdps(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppCustomAttributeSourceNameByIdpArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppCustomAttributeSourceNameByIdpArgs.builder
      builder.nameByIdps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppCustomClaimArgs.Builder)
    def source(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppCustomClaimSourceArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppCustomClaimArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppCustomClaimSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationScimConfigArgs.Builder)
    /**
     * @param authentication Attributes for configuring HTTP Basic authentication scheme for SCIM provisioning to an application.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationScimConfigAuthenticationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationScimConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationScimConfigAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    /**
     * @param mappings A list of mappings to apply to SCIM resources before provisioning them in this application. These can transform or filter the resources to be provisioned.
     * @return builder
     */
    def mappings(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationScimConfigMappingArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationScimConfigArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationScimConfigMappingArgs.builder
      builder.mappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationScimConfigMappingArgs.Builder)
    /**
     * @param operations Whether or not this mapping applies to creates, updates, or deletes.
     * @return builder
     */
    def operations(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationScimConfigMappingOperationsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationScimConfigMappingArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationScimConfigMappingOperationsArgs.builder
      builder.operations(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationState.Builder)
    def corsHeaders(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationCorsHeadersArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationCorsHeadersArgs.builder
      builder.corsHeaders(args(argsBuilder).build)

    /**
     * @param destinations List of destinations secured by Access. This supersedes `selfHostedDomains` to allow for more flexibility in defining different types of domains. If `destinations` are provided, then `selfHostedDomains` will be ignored.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationDestinationArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param footerLinks The links in the App Launcher footer.
     * @return builder
     */
    def footerLinks(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationFooterLinkArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationFooterLinkArgs.builder
      builder.footerLinks(args.map(_(argsBuilder).build)*)

    /**
     * @param landingPageDesign The design of the App Launcher landing page shown to users when they log in.
     * @return builder
     */
    def landingPageDesign(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationLandingPageDesignArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationLandingPageDesignArgs.builder
      builder.landingPageDesign(args(argsBuilder).build)

    /**
     * @param mfaConfig Configures multi-factor authentication (MFA) settings for the application. Only valid for self*hosted, ssh, vnc, and rdp application types.
     * @return builder
     */
    def mfaConfig(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationMfaConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationMfaConfigArgs.builder
      builder.mfaConfig(args(argsBuilder).build)

    /**
     * @param oauthConfiguration Optional configuration for managing an OAuth authorization flow controlled by Access. When set, Access will act as the OAuth authorization server for this application. This feature is currently in beta.
     * @return builder
     */
    def oauthConfiguration(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationOauthConfigurationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationOauthConfigurationArgs.builder
      builder.oauthConfiguration(args(argsBuilder).build)

    /**
     * @param policies The policies that Access applies to the application, in ascending order of precedence. Items can reference existing policies or create new policies exclusive to the application.
     * @return builder
     */
    def policies(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)

    def saasApp(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppArgs.builder
      builder.saasApp(args(argsBuilder).build)

    /**
     * @param scimConfig Configuration for provisioning to this application via SCIM. This is currently in closed beta.
     * @return builder
     */
    def scimConfig(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationScimConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationScimConfigArgs.builder
      builder.scimConfig(args(argsBuilder).build)

    /**
     * @param targetCriterias Defines targets covered by the application. Use either the legacy top-level target*attributes format or the rule format, but not both. The rule format requires include; require and exclude are optional. Each rule must contain a non-empty target*attributes or tags selector. Hostname selectors accept 1-5000 non-empty strings. Tag maps accept 1-50 non-empty keys, each with 1-50 non-empty values.
     * @return builder
     */
    def targetCriterias(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaArgs.builder
      builder.targetCriterias(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaArgs.Builder)
    /**
     * @param exclude Target is excluded when any selector in this rule matches.
     * @return builder
     */
    def exclude(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaExcludeArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaExcludeArgs.builder
      builder.exclude(args(argsBuilder).build)

    /**
     * @param include Target matches when any selector in this rule matches.
     * @return builder
     */
    def include(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaIncludeArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaIncludeArgs.builder
      builder.include(args(argsBuilder).build)

    /**
     * @param require Target matches only when every selector in this rule matches.
     * @return builder
     */
    def require(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaRequireArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaRequireArgs.builder
      builder.require(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaExcludeArgs.Builder)
    /**
     * @param targetAttributes Hostname selector map. Only the hostname key is supported.
     * @return builder
     */
    def targetAttributes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaExcludeTargetAttributesArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaExcludeTargetAttributesArgs.builder
      builder.targetAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaIncludeArgs.Builder)
    /**
     * @param targetAttributes Hostname selector map. Only the hostname key is supported.
     * @return builder
     */
    def targetAttributes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaIncludeTargetAttributesArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaIncludeTargetAttributesArgs.builder
      builder.targetAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaRequireArgs.Builder)
    /**
     * @param targetAttributes Hostname selector map. Only the hostname key is supported.
     * @return builder
     */
    def targetAttributes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaRequireTargetAttributesArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaRequireTargetAttributesArgs.builder
      builder.targetAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessCustomPageState.Builder)
    /**
     * @param warnings Advisory validation findings returned when creating or updating a template. Omitted when empty.
     * @return builder
     */
    def warnings(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessCustomPageWarningArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessCustomPageState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessCustomPageWarningArgs.builder
      builder.warnings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder)
    /**
     * @param anyValidServiceToken An empty object which matches on all service tokens.
     * @return builder
     */
    def anyValidServiceToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeAnyValidServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeAnyValidServiceTokenArgs.builder
      builder.anyValidServiceToken(args(argsBuilder).build)

    def authContext(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeAuthContextArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeAuthContextArgs.builder
      builder.authContext(args(argsBuilder).build)

    def authMethod(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeAuthMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeAuthMethodArgs.builder
      builder.authMethod(args(argsBuilder).build)

    def azureAd(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeAzureAdArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeAzureAdArgs.builder
      builder.azureAd(args(argsBuilder).build)

    def certificate(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    def cloudflareAccountMember(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeCloudflareAccountMemberArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeCloudflareAccountMemberArgs.builder
      builder.cloudflareAccountMember(args(argsBuilder).build)

    def commonName(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeCommonNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeCommonNameArgs.builder
      builder.commonName(args(argsBuilder).build)

    def devicePosture(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeDevicePostureArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeDevicePostureArgs.builder
      builder.devicePosture(args(argsBuilder).build)

    def email(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeEmailArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeEmailArgs.builder
      builder.email(args(argsBuilder).build)

    def emailDomain(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeEmailDomainArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeEmailDomainArgs.builder
      builder.emailDomain(args(argsBuilder).build)

    def emailList(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeEmailListArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeEmailListArgs.builder
      builder.emailList(args(argsBuilder).build)

    /**
     * @param everyone An empty object which matches on all users.
     * @return builder
     */
    def everyone(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeEveryoneArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeEveryoneArgs.builder
      builder.everyone(args(argsBuilder).build)

    def externalEvaluation(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeExternalEvaluationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeExternalEvaluationArgs.builder
      builder.externalEvaluation(args(argsBuilder).build)

    def geo(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeGeoArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeGeoArgs.builder
      builder.geo(args(argsBuilder).build)

    def githubOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeGithubOrganizationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeGithubOrganizationArgs.builder
      builder.githubOrganization(args(argsBuilder).build)

    def group(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeGroupArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeGroupArgs.builder
      builder.group(args(argsBuilder).build)

    def gsuite(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeGsuiteArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeGsuiteArgs.builder
      builder.gsuite(args(argsBuilder).build)

    def ip(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeIpArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeIpArgs.builder
      builder.ip(args(argsBuilder).build)

    def ipList(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeIpListArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeIpListArgs.builder
      builder.ipList(args(argsBuilder).build)

    def linkedAppToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeLinkedAppTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeLinkedAppTokenArgs.builder
      builder.linkedAppToken(args(argsBuilder).build)

    def loginMethod(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeLoginMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeLoginMethodArgs.builder
      builder.loginMethod(args(argsBuilder).build)

    def oidc(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeOidcArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    def okta(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeOktaArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeOktaArgs.builder
      builder.okta(args(argsBuilder).build)

    def saml(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeSamlArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    def serviceToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeServiceTokenArgs.builder
      builder.serviceToken(args(argsBuilder).build)

    def userRiskScore(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeUserRiskScoreArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeUserRiskScoreArgs.builder
      builder.userRiskScore(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder)
    /**
     * @param anyValidServiceToken An empty object which matches on all service tokens.
     * @return builder
     */
    def anyValidServiceToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeAnyValidServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeAnyValidServiceTokenArgs.builder
      builder.anyValidServiceToken(args(argsBuilder).build)

    def authContext(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeAuthContextArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeAuthContextArgs.builder
      builder.authContext(args(argsBuilder).build)

    def authMethod(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeAuthMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeAuthMethodArgs.builder
      builder.authMethod(args(argsBuilder).build)

    def azureAd(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeAzureAdArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeAzureAdArgs.builder
      builder.azureAd(args(argsBuilder).build)

    def certificate(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    def cloudflareAccountMember(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeCloudflareAccountMemberArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeCloudflareAccountMemberArgs.builder
      builder.cloudflareAccountMember(args(argsBuilder).build)

    def commonName(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeCommonNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeCommonNameArgs.builder
      builder.commonName(args(argsBuilder).build)

    def devicePosture(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeDevicePostureArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeDevicePostureArgs.builder
      builder.devicePosture(args(argsBuilder).build)

    def email(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeEmailArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeEmailArgs.builder
      builder.email(args(argsBuilder).build)

    def emailDomain(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeEmailDomainArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeEmailDomainArgs.builder
      builder.emailDomain(args(argsBuilder).build)

    def emailList(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeEmailListArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeEmailListArgs.builder
      builder.emailList(args(argsBuilder).build)

    /**
     * @param everyone An empty object which matches on all users.
     * @return builder
     */
    def everyone(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeEveryoneArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeEveryoneArgs.builder
      builder.everyone(args(argsBuilder).build)

    def externalEvaluation(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeExternalEvaluationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeExternalEvaluationArgs.builder
      builder.externalEvaluation(args(argsBuilder).build)

    def geo(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeGeoArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeGeoArgs.builder
      builder.geo(args(argsBuilder).build)

    def githubOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeGithubOrganizationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeGithubOrganizationArgs.builder
      builder.githubOrganization(args(argsBuilder).build)

    def group(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeGroupArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeGroupArgs.builder
      builder.group(args(argsBuilder).build)

    def gsuite(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeGsuiteArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeGsuiteArgs.builder
      builder.gsuite(args(argsBuilder).build)

    def ip(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeIpArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeIpArgs.builder
      builder.ip(args(argsBuilder).build)

    def ipList(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeIpListArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeIpListArgs.builder
      builder.ipList(args(argsBuilder).build)

    def linkedAppToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeLinkedAppTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeLinkedAppTokenArgs.builder
      builder.linkedAppToken(args(argsBuilder).build)

    def loginMethod(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeLoginMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeLoginMethodArgs.builder
      builder.loginMethod(args(argsBuilder).build)

    def oidc(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeOidcArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    def okta(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeOktaArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeOktaArgs.builder
      builder.okta(args(argsBuilder).build)

    def saml(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeSamlArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    def serviceToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeServiceTokenArgs.builder
      builder.serviceToken(args(argsBuilder).build)

    def userRiskScore(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeUserRiskScoreArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeUserRiskScoreArgs.builder
      builder.userRiskScore(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder)
    /**
     * @param anyValidServiceToken An empty object which matches on all service tokens.
     * @return builder
     */
    def anyValidServiceToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireAnyValidServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireAnyValidServiceTokenArgs.builder
      builder.anyValidServiceToken(args(argsBuilder).build)

    def authContext(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireAuthContextArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireAuthContextArgs.builder
      builder.authContext(args(argsBuilder).build)

    def authMethod(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireAuthMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireAuthMethodArgs.builder
      builder.authMethod(args(argsBuilder).build)

    def azureAd(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireAzureAdArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireAzureAdArgs.builder
      builder.azureAd(args(argsBuilder).build)

    def certificate(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    def cloudflareAccountMember(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireCloudflareAccountMemberArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireCloudflareAccountMemberArgs.builder
      builder.cloudflareAccountMember(args(argsBuilder).build)

    def commonName(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireCommonNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireCommonNameArgs.builder
      builder.commonName(args(argsBuilder).build)

    def devicePosture(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireDevicePostureArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireDevicePostureArgs.builder
      builder.devicePosture(args(argsBuilder).build)

    def email(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireEmailArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireEmailArgs.builder
      builder.email(args(argsBuilder).build)

    def emailDomain(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireEmailDomainArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireEmailDomainArgs.builder
      builder.emailDomain(args(argsBuilder).build)

    def emailList(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireEmailListArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireEmailListArgs.builder
      builder.emailList(args(argsBuilder).build)

    /**
     * @param everyone An empty object which matches on all users.
     * @return builder
     */
    def everyone(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireEveryoneArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireEveryoneArgs.builder
      builder.everyone(args(argsBuilder).build)

    def externalEvaluation(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireExternalEvaluationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireExternalEvaluationArgs.builder
      builder.externalEvaluation(args(argsBuilder).build)

    def geo(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireGeoArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireGeoArgs.builder
      builder.geo(args(argsBuilder).build)

    def githubOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireGithubOrganizationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireGithubOrganizationArgs.builder
      builder.githubOrganization(args(argsBuilder).build)

    def group(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireGroupArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireGroupArgs.builder
      builder.group(args(argsBuilder).build)

    def gsuite(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireGsuiteArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireGsuiteArgs.builder
      builder.gsuite(args(argsBuilder).build)

    def ip(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireIpArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireIpArgs.builder
      builder.ip(args(argsBuilder).build)

    def ipList(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireIpListArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireIpListArgs.builder
      builder.ipList(args(argsBuilder).build)

    def linkedAppToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireLinkedAppTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireLinkedAppTokenArgs.builder
      builder.linkedAppToken(args(argsBuilder).build)

    def loginMethod(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireLoginMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireLoginMethodArgs.builder
      builder.loginMethod(args(argsBuilder).build)

    def oidc(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireOidcArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    def okta(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireOktaArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireOktaArgs.builder
      builder.okta(args(argsBuilder).build)

    def saml(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireSamlArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    def serviceToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireServiceTokenArgs.builder
      builder.serviceToken(args(argsBuilder).build)

    def userRiskScore(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireUserRiskScoreArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireUserRiskScoreArgs.builder
      builder.userRiskScore(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupState.Builder)
    /**
     * @param excludes Rules evaluated with a NOT logical operator. To match a policy, a user cannot meet any of the Exclude rules.
     * @return builder
     */
    def excludes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.builder
      builder.excludes(args.map(_(argsBuilder).build)*)

    /**
     * @param includes Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules.
     * @return builder
     */
    def includes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.builder
      builder.includes(args.map(_(argsBuilder).build)*)

    /**
     * @param requires Rules evaluated with an AND logical operator. To match a policy, a user must meet all of the Require rules.
     * @return builder
     */
    def requires(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.builder
      builder.requires(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderConfigArgs.Builder)
    /**
     * @param headerAttributes Add a list of attribute names that will be returned in the response header from the Access callback.
     * @return builder
     */
    def headerAttributes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderConfigHeaderAttributeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderConfigArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderConfigHeaderAttributeArgs.builder
      builder.headerAttributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderSamlCertificateSetArgs.Builder)
    /**
     * @param currentCertificate The currently active certificate used for encrypting SAML assertions
     * @return builder
     */
    def currentCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderSamlCertificateSetCurrentCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderSamlCertificateSetArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderSamlCertificateSetCurrentCertificateArgs.builder
      builder.currentCertificate(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderState.Builder)
    /**
     * @param config The configuration parameters for the identity provider. To view the required parameters for a specific provider, refer to our [developer documentation](https://developers.cloudflare.com/cloudflare-one/identity/idp-integration/).
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param samlCertificateSet The SAML encryption certificate set details, including current and previous certificates.
     * Only present for SAML identity providers with a certificate set assigned.
     * @return builder
     */
    def samlCertificateSet(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderSamlCertificateSetArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderSamlCertificateSetArgs.builder
      builder.samlCertificateSet(args(argsBuilder).build)

    /**
     * @param scimConfig The configuration settings for enabling a System for Cross-Domain Identity Management (SCIM) with the identity provider.
     * @return builder
     */
    def scimConfig(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderScimConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderScimConfigArgs.builder
      builder.scimConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessInfrastructureTargetIpArgs.Builder)
    /**
     * @param ipv4 The target&#39;s IPv4 address
     * @return builder
     */
    def ipv4(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessInfrastructureTargetIpIpv4Args.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessInfrastructureTargetIpArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessInfrastructureTargetIpIpv4Args.builder
      builder.ipv4(args(argsBuilder).build)

    /**
     * @param ipv6 The target&#39;s IPv6 address
     * @return builder
     */
    def ipv6(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessInfrastructureTargetIpIpv6Args.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessInfrastructureTargetIpArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessInfrastructureTargetIpIpv6Args.builder
      builder.ipv6(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessInfrastructureTargetState.Builder)
    /**
     * @param ip The IPv4/IPv6 address that identifies where to reach a target
     * @return builder
     */
    def ip(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessInfrastructureTargetIpArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessInfrastructureTargetState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessInfrastructureTargetIpArgs.builder
      builder.ip(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessMtlsHostnameSettingsState.Builder)
    def settings(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessMtlsHostnameSettingsSettingArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessMtlsHostnameSettingsState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessMtlsHostnameSettingsSettingArgs.builder
      builder.settings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyConnectionRulesArgs.Builder)
    /**
     * @param rdp The RDP-specific rules that define clipboard behavior for RDP connections.
     * @return builder
     */
    def rdp(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyConnectionRulesRdpArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyConnectionRulesArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyConnectionRulesRdpArgs.builder
      builder.rdp(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder)
    /**
     * @param anyValidServiceToken An empty object which matches on all service tokens.
     * @return builder
     */
    def anyValidServiceToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeAnyValidServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeAnyValidServiceTokenArgs.builder
      builder.anyValidServiceToken(args(argsBuilder).build)

    def authContext(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeAuthContextArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeAuthContextArgs.builder
      builder.authContext(args(argsBuilder).build)

    def authMethod(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeAuthMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeAuthMethodArgs.builder
      builder.authMethod(args(argsBuilder).build)

    def azureAd(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeAzureAdArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeAzureAdArgs.builder
      builder.azureAd(args(argsBuilder).build)

    def certificate(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    def cloudflareAccountMember(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeCloudflareAccountMemberArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeCloudflareAccountMemberArgs.builder
      builder.cloudflareAccountMember(args(argsBuilder).build)

    def commonName(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeCommonNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeCommonNameArgs.builder
      builder.commonName(args(argsBuilder).build)

    def devicePosture(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeDevicePostureArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeDevicePostureArgs.builder
      builder.devicePosture(args(argsBuilder).build)

    def email(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeEmailArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeEmailArgs.builder
      builder.email(args(argsBuilder).build)

    def emailDomain(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeEmailDomainArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeEmailDomainArgs.builder
      builder.emailDomain(args(argsBuilder).build)

    def emailList(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeEmailListArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeEmailListArgs.builder
      builder.emailList(args(argsBuilder).build)

    /**
     * @param everyone An empty object which matches on all users.
     * @return builder
     */
    def everyone(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeEveryoneArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeEveryoneArgs.builder
      builder.everyone(args(argsBuilder).build)

    def externalEvaluation(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeExternalEvaluationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeExternalEvaluationArgs.builder
      builder.externalEvaluation(args(argsBuilder).build)

    def geo(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeGeoArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeGeoArgs.builder
      builder.geo(args(argsBuilder).build)

    def githubOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeGithubOrganizationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeGithubOrganizationArgs.builder
      builder.githubOrganization(args(argsBuilder).build)

    def group(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeGroupArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeGroupArgs.builder
      builder.group(args(argsBuilder).build)

    def gsuite(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeGsuiteArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeGsuiteArgs.builder
      builder.gsuite(args(argsBuilder).build)

    def ip(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeIpArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeIpArgs.builder
      builder.ip(args(argsBuilder).build)

    def ipList(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeIpListArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeIpListArgs.builder
      builder.ipList(args(argsBuilder).build)

    def linkedAppToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeLinkedAppTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeLinkedAppTokenArgs.builder
      builder.linkedAppToken(args(argsBuilder).build)

    def loginMethod(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeLoginMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeLoginMethodArgs.builder
      builder.loginMethod(args(argsBuilder).build)

    def oidc(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeOidcArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    def okta(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeOktaArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeOktaArgs.builder
      builder.okta(args(argsBuilder).build)

    def saml(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeSamlArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    def serviceToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeServiceTokenArgs.builder
      builder.serviceToken(args(argsBuilder).build)

    def userRiskScore(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeUserRiskScoreArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeUserRiskScoreArgs.builder
      builder.userRiskScore(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder)
    /**
     * @param anyValidServiceToken An empty object which matches on all service tokens.
     * @return builder
     */
    def anyValidServiceToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeAnyValidServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeAnyValidServiceTokenArgs.builder
      builder.anyValidServiceToken(args(argsBuilder).build)

    def authContext(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeAuthContextArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeAuthContextArgs.builder
      builder.authContext(args(argsBuilder).build)

    def authMethod(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeAuthMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeAuthMethodArgs.builder
      builder.authMethod(args(argsBuilder).build)

    def azureAd(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeAzureAdArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeAzureAdArgs.builder
      builder.azureAd(args(argsBuilder).build)

    def certificate(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    def cloudflareAccountMember(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeCloudflareAccountMemberArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeCloudflareAccountMemberArgs.builder
      builder.cloudflareAccountMember(args(argsBuilder).build)

    def commonName(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeCommonNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeCommonNameArgs.builder
      builder.commonName(args(argsBuilder).build)

    def devicePosture(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeDevicePostureArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeDevicePostureArgs.builder
      builder.devicePosture(args(argsBuilder).build)

    def email(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeEmailArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeEmailArgs.builder
      builder.email(args(argsBuilder).build)

    def emailDomain(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeEmailDomainArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeEmailDomainArgs.builder
      builder.emailDomain(args(argsBuilder).build)

    def emailList(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeEmailListArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeEmailListArgs.builder
      builder.emailList(args(argsBuilder).build)

    /**
     * @param everyone An empty object which matches on all users.
     * @return builder
     */
    def everyone(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeEveryoneArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeEveryoneArgs.builder
      builder.everyone(args(argsBuilder).build)

    def externalEvaluation(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeExternalEvaluationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeExternalEvaluationArgs.builder
      builder.externalEvaluation(args(argsBuilder).build)

    def geo(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeGeoArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeGeoArgs.builder
      builder.geo(args(argsBuilder).build)

    def githubOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeGithubOrganizationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeGithubOrganizationArgs.builder
      builder.githubOrganization(args(argsBuilder).build)

    def group(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeGroupArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeGroupArgs.builder
      builder.group(args(argsBuilder).build)

    def gsuite(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeGsuiteArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeGsuiteArgs.builder
      builder.gsuite(args(argsBuilder).build)

    def ip(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeIpArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeIpArgs.builder
      builder.ip(args(argsBuilder).build)

    def ipList(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeIpListArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeIpListArgs.builder
      builder.ipList(args(argsBuilder).build)

    def linkedAppToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeLinkedAppTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeLinkedAppTokenArgs.builder
      builder.linkedAppToken(args(argsBuilder).build)

    def loginMethod(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeLoginMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeLoginMethodArgs.builder
      builder.loginMethod(args(argsBuilder).build)

    def oidc(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeOidcArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    def okta(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeOktaArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeOktaArgs.builder
      builder.okta(args(argsBuilder).build)

    def saml(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeSamlArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    def serviceToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeServiceTokenArgs.builder
      builder.serviceToken(args(argsBuilder).build)

    def userRiskScore(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeUserRiskScoreArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeUserRiskScoreArgs.builder
      builder.userRiskScore(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder)
    /**
     * @param anyValidServiceToken An empty object which matches on all service tokens.
     * @return builder
     */
    def anyValidServiceToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireAnyValidServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireAnyValidServiceTokenArgs.builder
      builder.anyValidServiceToken(args(argsBuilder).build)

    def authContext(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireAuthContextArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireAuthContextArgs.builder
      builder.authContext(args(argsBuilder).build)

    def authMethod(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireAuthMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireAuthMethodArgs.builder
      builder.authMethod(args(argsBuilder).build)

    def azureAd(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireAzureAdArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireAzureAdArgs.builder
      builder.azureAd(args(argsBuilder).build)

    def certificate(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    def cloudflareAccountMember(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireCloudflareAccountMemberArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireCloudflareAccountMemberArgs.builder
      builder.cloudflareAccountMember(args(argsBuilder).build)

    def commonName(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireCommonNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireCommonNameArgs.builder
      builder.commonName(args(argsBuilder).build)

    def devicePosture(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireDevicePostureArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireDevicePostureArgs.builder
      builder.devicePosture(args(argsBuilder).build)

    def email(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireEmailArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireEmailArgs.builder
      builder.email(args(argsBuilder).build)

    def emailDomain(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireEmailDomainArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireEmailDomainArgs.builder
      builder.emailDomain(args(argsBuilder).build)

    def emailList(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireEmailListArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireEmailListArgs.builder
      builder.emailList(args(argsBuilder).build)

    /**
     * @param everyone An empty object which matches on all users.
     * @return builder
     */
    def everyone(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireEveryoneArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireEveryoneArgs.builder
      builder.everyone(args(argsBuilder).build)

    def externalEvaluation(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireExternalEvaluationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireExternalEvaluationArgs.builder
      builder.externalEvaluation(args(argsBuilder).build)

    def geo(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireGeoArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireGeoArgs.builder
      builder.geo(args(argsBuilder).build)

    def githubOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireGithubOrganizationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireGithubOrganizationArgs.builder
      builder.githubOrganization(args(argsBuilder).build)

    def group(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireGroupArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireGroupArgs.builder
      builder.group(args(argsBuilder).build)

    def gsuite(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireGsuiteArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireGsuiteArgs.builder
      builder.gsuite(args(argsBuilder).build)

    def ip(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireIpArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireIpArgs.builder
      builder.ip(args(argsBuilder).build)

    def ipList(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireIpListArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireIpListArgs.builder
      builder.ipList(args(argsBuilder).build)

    def linkedAppToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireLinkedAppTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireLinkedAppTokenArgs.builder
      builder.linkedAppToken(args(argsBuilder).build)

    def loginMethod(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireLoginMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireLoginMethodArgs.builder
      builder.loginMethod(args(argsBuilder).build)

    def oidc(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireOidcArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    def okta(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireOktaArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireOktaArgs.builder
      builder.okta(args(argsBuilder).build)

    def saml(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireSamlArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    def serviceToken(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireServiceTokenArgs.builder
      builder.serviceToken(args(argsBuilder).build)

    def userRiskScore(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireUserRiskScoreArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireUserRiskScoreArgs.builder
      builder.userRiskScore(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyState.Builder)
    /**
     * @param approvalGroups Administrators who can approve a temporary authentication request.
     * @return builder
     */
    def approvalGroups(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyApprovalGroupArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyApprovalGroupArgs.builder
      builder.approvalGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param connectionRules The rules that define how users may connect to targets secured by your application.
     * @return builder
     */
    def connectionRules(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyConnectionRulesArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyConnectionRulesArgs.builder
      builder.connectionRules(args(argsBuilder).build)

    /**
     * @param excludes Rules evaluated with a NOT logical operator. To match the policy, a user cannot meet any of the Exclude rules.
     * @return builder
     */
    def excludes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.builder
      builder.excludes(args.map(_(argsBuilder).build)*)

    /**
     * @param includes Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules.
     * @return builder
     */
    def includes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.builder
      builder.includes(args.map(_(argsBuilder).build)*)

    /**
     * @param mfaConfig Configures multi-factor authentication (MFA) settings.
     * @return builder
     */
    def mfaConfig(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyMfaConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyMfaConfigArgs.builder
      builder.mfaConfig(args(argsBuilder).build)

    /**
     * @param requires Rules evaluated with an AND logical operator. To match the policy, a user must meet all of the Require rules.
     * @return builder
     */
    def requires(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.builder
      builder.requires(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAnthropicArgs.Builder)
    /**
     * @param anthropicAdminApiKey Authenticate with an Anthropic Admin API key.
     * @return builder
     */
    def anthropicAdminApiKey(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAnthropicAnthropicAdminApiKeyArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAnthropicArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAnthropicAnthropicAdminApiKeyArgs.builder
      builder.anthropicAdminApiKey(args(argsBuilder).build)

    /**
     * @param anthropicComplianceApiKey Authenticate with an Anthropic Compliance API key.
     * @return builder
     */
    def anthropicComplianceApiKey(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAnthropicAnthropicComplianceApiKeyArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAnthropicArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAnthropicAnthropicComplianceApiKeyArgs.builder
      builder.anthropicComplianceApiKey(args(argsBuilder).build)

    /**
     * @param anthropicWorkspaceApiKey Authenticate with an Anthropic Workspace API key.
     * @return builder
     */
    def anthropicWorkspaceApiKey(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAnthropicAnthropicWorkspaceApiKeyArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAnthropicArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAnthropicAnthropicWorkspaceApiKeyArgs.builder
      builder.anthropicWorkspaceApiKey(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAwsArgs.Builder)
    /**
     * @param awsIamRole Authenticate by delegating to a cross-account IAM role.
     * @return builder
     */
    def awsIamRole(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAwsAwsIamRoleArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAwsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAwsAwsIamRoleArgs.builder
      builder.awsIamRole(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationBoxArgs.Builder)
    /**
     * @param boxServerAuthentication Authenticate with Box server authentication. Before creating the integration, add the Cloudflare CASB application in Box Admin Console &gt; Integrations &gt; Platform Apps Manager &gt; Server Authentication Apps using client ID `puaghckpy0578r8p6f3g0rf860unup4r`.
     * @return builder
     */
    def boxServerAuthentication(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationBoxBoxServerAuthenticationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationBoxArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationBoxBoxServerAuthenticationArgs.builder
      builder.boxServerAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationGoogleCloudPlatformArgs.Builder)
    /**
     * @param googleCloudPlatformServiceAccount Authenticate with a service account key.
     * @return builder
     */
    def googleCloudPlatformServiceAccount(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationGoogleCloudPlatformGoogleCloudPlatformServiceAccountArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationGoogleCloudPlatformArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationGoogleCloudPlatformGoogleCloudPlatformServiceAccountArgs.builder
      builder.googleCloudPlatformServiceAccount(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationGoogleWorkspaceArgs.Builder)
    /**
     * @param googleDomainWideDelegationServiceAccount Authenticate with a service account granted domain-wide delegation.
     * @return builder
     */
    def googleDomainWideDelegationServiceAccount(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationGoogleWorkspaceGoogleDomainWideDelegationServiceAccountArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationGoogleWorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationGoogleWorkspaceGoogleDomainWideDelegationServiceAccountArgs.builder
      builder.googleDomainWideDelegationServiceAccount(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationOpenaiArgs.Builder)
    /**
     * @param chatgptComplianceApiKey Authenticate with an OpenAI Compliance API key. Requires an Enterprise plan.
     * @return builder
     */
    def chatgptComplianceApiKey(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationOpenaiChatgptComplianceApiKeyArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationOpenaiArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationOpenaiChatgptComplianceApiKeyArgs.builder
      builder.chatgptComplianceApiKey(args(argsBuilder).build)

    /**
     * @param chatgptStandardApiKey Authenticate with an OpenAI Admin API key.
     * @return builder
     */
    def chatgptStandardApiKey(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationOpenaiChatgptStandardApiKeyArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationOpenaiArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationOpenaiChatgptStandardApiKeyArgs.builder
      builder.chatgptStandardApiKey(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationState.Builder)
    /**
     * @param anthropic Anthropic integration configuration.
     * @return builder
     */
    def anthropic(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAnthropicArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAnthropicArgs.builder
      builder.anthropic(args(argsBuilder).build)

    /**
     * @param aws AWS integration configuration.
     * @return builder
     */
    def aws(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAwsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAwsArgs.builder
      builder.aws(args(argsBuilder).build)

    /**
     * @param box Box integration configuration.
     * @return builder
     */
    def box(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationBoxArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationBoxArgs.builder
      builder.box(args(argsBuilder).build)

    /**
     * @param googleCloudPlatform Google Cloud Platform integration configuration.
     * @return builder
     */
    def googleCloudPlatform(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationGoogleCloudPlatformArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationGoogleCloudPlatformArgs.builder
      builder.googleCloudPlatform(args(argsBuilder).build)

    /**
     * @param googleWorkspace Google Workspace integration configuration.
     * @return builder
     */
    def googleWorkspace(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationGoogleWorkspaceArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationGoogleWorkspaceArgs.builder
      builder.googleWorkspace(args(argsBuilder).build)

    /**
     * @param openai OpenAI integration configuration.
     * @return builder
     */
    def openai(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationOpenaiArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationOpenaiArgs.builder
      builder.openai(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustCasbPolicyActionsArgs.Builder)
    /**
     * @param remediationTypes Remediation actions to execute (at most one).
     * @return builder
     */
    def remediationTypes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbPolicyActionsRemediationTypeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustCasbPolicyActionsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbPolicyActionsRemediationTypeArgs.builder
      builder.remediationTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param webhookConfigs Webhook actions to execute.
     * @return builder
     */
    def webhookConfigs(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbPolicyActionsWebhookConfigArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustCasbPolicyActionsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbPolicyActionsWebhookConfigArgs.builder
      builder.webhookConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustCasbPolicyState.Builder)
    /**
     * @param actions Actions to execute when this policy is triggered, grouped by action type.
     * A policy must contain at least one action across all groups and may include
     * at most one remediation.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbPolicyActionsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustCasbPolicyState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbPolicyActionsArgs.builder
      builder.actions(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustCasbWebhookState.Builder)
    /**
     * @param headers List of custom headers to include in webhook requests.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbWebhookHeaderArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustCasbWebhookState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbWebhookHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileLocalDomainFallbackState.Builder)
    def domains(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileLocalDomainFallbackDomainArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileLocalDomainFallbackState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileLocalDomainFallbackDomainArgs.builder
      builder.domains(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileState.Builder)
    /**
     * @param browserExtensionConfig Browser extension proxy settings. Required when profile*type is browser*extension and invalid for WARP profiles.
     * @return builder
     */
    def browserExtensionConfig(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileBrowserExtensionConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileBrowserExtensionConfigArgs.builder
      builder.browserExtensionConfig(args(argsBuilder).build)

    /**
     * @param dnsSearchSuffixes List of DNS search suffixes to apply to clients. Suffixes are evaluated in order. Use an empty array to clear.
     * @return builder
     */
    def dnsSearchSuffixes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileDnsSearchSuffixArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileDnsSearchSuffixArgs.builder
      builder.dnsSearchSuffixes(args.map(_(argsBuilder).build)*)

    /**
     * @param excludes List of routes excluded in the WARP client&#39;s tunnel. Both &#39;exclude&#39; and &#39;include&#39; cannot be set in the same request.
     * @return builder
     */
    def excludes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileExcludeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileExcludeArgs.builder
      builder.excludes(args.map(_(argsBuilder).build)*)

    def fallbackDomains(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileFallbackDomainArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileFallbackDomainArgs.builder
      builder.fallbackDomains(args.map(_(argsBuilder).build)*)

    /**
     * @param globalAcceleration Global Acceleration settings for China. When configured, WARP clients connect to the Global Accelerator addresses instead of the default ones. Please contact your account representative to enable this feature on your account. See https://developers.cloudflare.com/china-network/concepts/global-acceleration/.
     * @return builder
     */
    def globalAcceleration(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileGlobalAccelerationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileGlobalAccelerationArgs.builder
      builder.globalAcceleration(args(argsBuilder).build)

    /**
     * @param includes List of routes included in the WARP client&#39;s tunnel. Both &#39;exclude&#39; and &#39;include&#39; cannot be set in the same request.
     * @return builder
     */
    def includes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileIncludeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileIncludeArgs.builder
      builder.includes(args.map(_(argsBuilder).build)*)

    def serviceModeV2(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileServiceModeV2Args.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileServiceModeV2Args.builder
      builder.serviceModeV2(args(argsBuilder).build)

    /**
     * @return builder
     * @deprecated This attribute is deprecated.
     */
    @deprecated("This attribute is deprecated.") def targetTests(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileTargetTestArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileTargetTestArgs.builder
      builder.targetTests(args.map(_(argsBuilder).build)*)

    /**
     * @param virtualNetworks Virtual network access settings for the device.
     * @return builder
     */
    def virtualNetworks(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileVirtualNetworksArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileVirtualNetworksArgs.builder
      builder.virtualNetworks(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileLocalDomainFallbackState.Builder)
    def domains(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileLocalDomainFallbackDomainArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileLocalDomainFallbackState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileLocalDomainFallbackDomainArgs.builder
      builder.domains(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileState.Builder)
    /**
     * @param dnsSearchSuffixes List of DNS search suffixes to apply to clients. Suffixes are evaluated in order. Use an empty array to clear.
     * @return builder
     */
    def dnsSearchSuffixes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileDnsSearchSuffixArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileDnsSearchSuffixArgs.builder
      builder.dnsSearchSuffixes(args.map(_(argsBuilder).build)*)

    /**
     * @param excludes List of routes excluded in the WARP client&#39;s tunnel. Both &#39;exclude&#39; and &#39;include&#39; cannot be set in the same request.
     * @return builder
     */
    def excludes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileExcludeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileExcludeArgs.builder
      builder.excludes(args.map(_(argsBuilder).build)*)

    def fallbackDomains(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileFallbackDomainArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileFallbackDomainArgs.builder
      builder.fallbackDomains(args.map(_(argsBuilder).build)*)

    /**
     * @param globalAcceleration Global Acceleration settings for China. When configured, WARP clients connect to the Global Accelerator addresses instead of the default ones. Please contact your account representative to enable this feature on your account. See https://developers.cloudflare.com/china-network/concepts/global-acceleration/.
     * @return builder
     */
    def globalAcceleration(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileGlobalAccelerationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileGlobalAccelerationArgs.builder
      builder.globalAcceleration(args(argsBuilder).build)

    /**
     * @param includes List of routes included in the WARP client&#39;s tunnel. Both &#39;exclude&#39; and &#39;include&#39; cannot be set in the same request.
     * @return builder
     */
    def includes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileIncludeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileIncludeArgs.builder
      builder.includes(args.map(_(argsBuilder).build)*)

    def serviceModeV2(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileServiceModeV2Args.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileServiceModeV2Args.builder
      builder.serviceModeV2(args(argsBuilder).build)

    /**
     * @param virtualNetworks Virtual network access settings for the device.
     * @return builder
     */
    def virtualNetworks(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileVirtualNetworksArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileVirtualNetworksArgs.builder
      builder.virtualNetworks(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDeviceDeploymentGroupsState.Builder)
    /**
     * @param versionConfigs Contains at least one version configuration.
     * @return builder
     */
    def versionConfigs(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceDeploymentGroupsVersionConfigArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDeviceDeploymentGroupsState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceDeploymentGroupsVersionConfigArgs.builder
      builder.versionConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDeviceManagedNetworksState.Builder)
    /**
     * @param config The configuration object containing information for the WARP client to detect the managed network.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceManagedNetworksConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDeviceManagedNetworksState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceManagedNetworksConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureIntegrationState.Builder)
    /**
     * @param config The configuration object containing third-party integration information.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureIntegrationConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureIntegrationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureIntegrationConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureRuleInputArgs.Builder)
    def locations(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureRuleInputLocationsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureRuleInputArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureRuleInputLocationsArgs.builder
      builder.locations(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureRuleState.Builder)
    /**
     * @param input The value to be checked against.
     * @return builder
     */
    def input(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureRuleInputArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureRuleState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureRuleInputArgs.builder
      builder.input(args(argsBuilder).build)

    /**
     * @param matches The conditions that the client must match to run the rule.
     * @return builder
     */
    def matches(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureRuleMatchArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureRuleState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureRuleMatchArgs.builder
      builder.matches(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDeviceSubnetState.Builder)
    /**
     * @param capacity IP capacity information for the subnet.
     * @return builder
     */
    def capacity(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceSubnetCapacityArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDeviceSubnetState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceSubnetCapacityArgs.builder
      builder.capacity(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDexRuleState.Builder)
    def targetedTests(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDexRuleTargetedTestArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDexRuleState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDexRuleTargetedTestArgs.builder
      builder.targetedTests(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDexRuleTargetedTestArgs.Builder)
    /**
     * @param data The configuration object which contains the details for the WARP client to conduct the test.
     * @return builder
     */
    def data(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDexRuleTargetedTestDataArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDexRuleTargetedTestArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDexRuleTargetedTestDataArgs.builder
      builder.data(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDexTestState.Builder)
    /**
     * @param data The configuration object which contains the details for the WARP client to conduct the test.
     * @return builder
     */
    def data(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDexTestDataArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDexTestState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDexTestDataArgs.builder
      builder.data(args(argsBuilder).build)

    /**
     * @param targetPolicies DEX rules targeted by this test
     * @return builder
     */
    def targetPolicies(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDexTestTargetPolicyArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDexTestState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDexTestTargetPolicyArgs.builder
      builder.targetPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomEntryState.Builder)
    def confidence(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomEntryConfidenceArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomEntryState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomEntryConfidenceArgs.builder
      builder.confidence(args(argsBuilder).build)

    def pattern(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomEntryPatternArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomEntryState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomEntryPatternArgs.builder
      builder.pattern(args(argsBuilder).build)

    def profiles(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomEntryProfileArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomEntryState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomEntryProfileArgs.builder
      builder.profiles(args.map(_(argsBuilder).build)*)

    /**
     * @param variant A Predefined AI prompt classification topic entry.
     * @return builder
     */
    def variant(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomEntryVariantArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomEntryState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomEntryVariantArgs.builder
      builder.variant(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileContextAwarenessArgs.Builder)
    /**
     * @param skip Content types to exclude from context analysis and return all matches.
     * @return builder
     */
    def skip(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileContextAwarenessSkipArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileContextAwarenessArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileContextAwarenessSkipArgs.builder
      builder.skip(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileEntryArgs.Builder)
    def pattern(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileEntryPatternArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileEntryArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileEntryPatternArgs.builder
      builder.pattern(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileState.Builder)
    /**
     * @param contextAwareness Scan the context of predefined entries to only return matches surrounded by keywords.
     * @return builder
     * @deprecated This attribute is deprecated.
     */
    @deprecated("This attribute is deprecated.") def contextAwareness(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileContextAwarenessArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileContextAwarenessArgs.builder
      builder.contextAwareness(args(argsBuilder).build)

    /**
     * @param entries Custom entries from this profile.
     * If this field is omitted, entries owned by this profile will not be changed.
     * @return builder
     * @deprecated This attribute will be sunset on 01/01/2026
     */
    @deprecated("This attribute will be sunset on 01/01/2026") def entries(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileEntryArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

    /**
     * @param sensitivityLevels Sensitivity levels to associate with the profile.
     * @return builder
     */
    def sensitivityLevels(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileSensitivityLevelArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileSensitivityLevelArgs.builder
      builder.sensitivityLevels(args.map(_(argsBuilder).build)*)

    /**
     * @param sharedEntries Entries from other profiles (e.g. pre-defined Cloudflare profiles, or your Microsoft Information Protection profiles).
     * @return builder
     */
    def sharedEntries(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileSharedEntryArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileSharedEntryArgs.builder
      builder.sharedEntries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDlpDataClassState.Builder)
    def sensitivityLevels(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpDataClassSensitivityLevelArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpDataClassState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpDataClassSensitivityLevelArgs.builder
      builder.sensitivityLevels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDlpDataTagCategoryState.Builder)
    def tags(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpDataTagCategoryTagArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpDataTagCategoryState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpDataTagCategoryTagArgs.builder
      builder.tags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDlpDatasetDatasetArgs.Builder)
    def columns(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpDatasetDatasetColumnArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpDatasetDatasetArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpDatasetDatasetColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

    def uploads(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpDatasetDatasetUploadArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpDatasetDatasetArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpDatasetDatasetUploadArgs.builder
      builder.uploads(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDlpDatasetState.Builder)
    def columns(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpDatasetColumnArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpDatasetState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpDatasetColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

    def dataset(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpDatasetDatasetArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpDatasetState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpDatasetDatasetArgs.builder
      builder.dataset(args(argsBuilder).build)

    def uploads(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpDatasetUploadArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpDatasetState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpDatasetUploadArgs.builder
      builder.uploads(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDlpEntryState.Builder)
    def confidence(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpEntryConfidenceArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpEntryState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpEntryConfidenceArgs.builder
      builder.confidence(args(argsBuilder).build)

    def pattern(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpEntryPatternArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpEntryState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpEntryPatternArgs.builder
      builder.pattern(args(argsBuilder).build)

    def profiles(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpEntryProfileArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpEntryState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpEntryProfileArgs.builder
      builder.profiles(args.map(_(argsBuilder).build)*)

    /**
     * @param variant A Predefined AI prompt classification topic entry.
     * @return builder
     */
    def variant(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpEntryVariantArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpEntryState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpEntryVariantArgs.builder
      builder.variant(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDlpIntegrationEntryState.Builder)
    def confidence(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpIntegrationEntryConfidenceArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpIntegrationEntryState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpIntegrationEntryConfidenceArgs.builder
      builder.confidence(args(argsBuilder).build)

    def pattern(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpIntegrationEntryPatternArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpIntegrationEntryState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpIntegrationEntryPatternArgs.builder
      builder.pattern(args(argsBuilder).build)

    def profiles(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpIntegrationEntryProfileArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpIntegrationEntryState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpIntegrationEntryProfileArgs.builder
      builder.profiles(args.map(_(argsBuilder).build)*)

    /**
     * @param variant A Predefined AI prompt classification topic entry.
     * @return builder
     */
    def variant(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpIntegrationEntryVariantArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpIntegrationEntryState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpIntegrationEntryVariantArgs.builder
      builder.variant(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDlpPredefinedEntryState.Builder)
    def confidence(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpPredefinedEntryConfidenceArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpPredefinedEntryState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpPredefinedEntryConfidenceArgs.builder
      builder.confidence(args(argsBuilder).build)

    def pattern(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpPredefinedEntryPatternArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpPredefinedEntryState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpPredefinedEntryPatternArgs.builder
      builder.pattern(args(argsBuilder).build)

    def profiles(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpPredefinedEntryProfileArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpPredefinedEntryState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpPredefinedEntryProfileArgs.builder
      builder.profiles(args.map(_(argsBuilder).build)*)

    /**
     * @param variant A Predefined AI prompt classification topic entry.
     * @return builder
     */
    def variant(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpPredefinedEntryVariantArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpPredefinedEntryState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpPredefinedEntryVariantArgs.builder
      builder.variant(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDlpPredefinedProfileState.Builder)
    /**
     * @return builder
     * @deprecated This attribute is deprecated. Use enabledEntries instead.
     */
    @deprecated("This attribute is deprecated. Use enabledEntries instead.") def entries(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpPredefinedProfileEntryArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpPredefinedProfileState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpPredefinedProfileEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDlpSensitivityGroupState.Builder)
    def levels(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpSensitivityGroupLevelArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpSensitivityGroupState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpSensitivityGroupLevelArgs.builder
      builder.levels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDlpSettingsState.Builder)
    /**
     * @param payloadLogging Request model for payload log settings within the DLP settings endpoint.
     * Unlike the legacy endpoint, null and missing are treated identically here
     * (both mean &#34;not provided&#34; for PATCH, &#34;reset to default&#34; for PUT).
     * @return builder
     */
    def payloadLogging(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpSettingsPayloadLoggingArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDlpSettingsState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpSettingsPayloadLoggingArgs.builder
      builder.payloadLogging(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsArgs.Builder)
    def doh(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsDohArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsDohArgs.builder
      builder.doh(args(argsBuilder).build)

    def dot(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsDotArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsDotArgs.builder
      builder.dot(args(argsBuilder).build)

    def ipv4(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsIpv4Args.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsIpv4Args.builder
      builder.ipv4(args(argsBuilder).build)

    def ipv6(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsIpv6Args.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsIpv6Args.builder
      builder.ipv6(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsDohArgs.Builder)
    /**
     * @param networks Specify the list of allowed source IP network ranges for this endpoint. When the list is empty, the endpoint allows all source IPs. The list takes effect only if the endpoint is enabled for this location.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsDohNetworkArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsDohArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsDohNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsDotArgs.Builder)
    /**
     * @param networks Specify the list of allowed source IP network ranges for this endpoint. When the list is empty, the endpoint allows all source IPs. The list takes effect only if the endpoint is enabled for this location.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsDotNetworkArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsDotArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsDotNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsIpv6Args.Builder)
    /**
     * @param networks Specify the list of allowed source IPv6 network ranges for this endpoint. When the list is empty, the endpoint allows all source IPs. The list takes effect only if the endpoint is enabled for this location.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsIpv6NetworkArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsIpv6Args.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsIpv6NetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationState.Builder)
    /**
     * @param endpoints Configure the destination endpoints for this location.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsArgs.builder
      builder.endpoints(args(argsBuilder).build)

    /**
     * @param maxTtl Controls how DNS response TTLs are capped for this location relative to the account `maxTtlSecs` setting. Omitting `maxTtl` on update resets it to `inherit`.
     * @return builder
     */
    def maxTtl(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationMaxTtlArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationMaxTtlArgs.builder
      builder.maxTtl(args(argsBuilder).build)

    /**
     * @param networks Specify the list of network ranges from which requests at this location originate. The list takes effect only if it is non-empty and the IPv4 endpoint is enabled for this location.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationNetworkArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustGatewayLoggingSettingsByRuleTypeArgs.Builder)
    /**
     * @param dns Configure logging settings for DNS firewall.
     * @return builder
     */
    def dns(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayLoggingSettingsByRuleTypeDnsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayLoggingSettingsByRuleTypeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayLoggingSettingsByRuleTypeDnsArgs.builder
      builder.dns(args(argsBuilder).build)

    /**
     * @param http Configure logging settings for HTTP/HTTPS firewall.
     * @return builder
     */
    def http(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayLoggingSettingsByRuleTypeHttpArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayLoggingSettingsByRuleTypeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayLoggingSettingsByRuleTypeHttpArgs.builder
      builder.http(args(argsBuilder).build)

    /**
     * @param l4 Configure logging settings for Network firewall.
     * @return builder
     */
    def l4(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayLoggingSettingsByRuleTypeL4Args.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayLoggingSettingsByRuleTypeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayLoggingSettingsByRuleTypeL4Args.builder
      builder.l4(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustGatewayLoggingState.Builder)
    /**
     * @param settingsByRuleType Configure logging settings for each rule type.
     * @return builder
     */
    def settingsByRuleType(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayLoggingSettingsByRuleTypeArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayLoggingState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayLoggingSettingsByRuleTypeArgs.builder
      builder.settingsByRuleType(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsArgs.Builder)
    /**
     * @param auditSsh Define the settings for the Audit SSH action. Settable only for `l4` rules with `auditSsh` action.
     * @return builder
     */
    def auditSsh(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsAuditSshArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsAuditSshArgs.builder
      builder.auditSsh(args(argsBuilder).build)

    /**
     * @param bisoAdminControls Configure browser isolation behavior. Settable only for `http` rules with the action set to `isolate`.
     * @return builder
     */
    def bisoAdminControls(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsBisoAdminControlsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsBisoAdminControlsArgs.builder
      builder.bisoAdminControls(args(argsBuilder).build)

    /**
     * @param blockPage Configure custom block page settings. If missing or null, use the account settings. Settable only for `http` rules with the action set to `block`.
     * @return builder
     */
    def blockPage(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsBlockPageArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsBlockPageArgs.builder
      builder.blockPage(args(argsBuilder).build)

    /**
     * @param checkSession Configure session check behavior. Settable only for `l4` and `http` rules with the action set to `allow`.
     * @return builder
     */
    def checkSession(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsCheckSessionArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsCheckSessionArgs.builder
      builder.checkSession(args(argsBuilder).build)

    /**
     * @param dnsResolvers Configure custom resolvers to route queries that match the resolver policy. Unused with &#39;resolve*dns*through*cloudflare&#39; or &#39;resolve*dns*internally&#39; settings. DNS queries get routed to the address closest to their origin. Only valid when a rule&#39;s action set to &#39;resolve&#39;. Settable only for `dnsResolver` rules.
     * @return builder
     */
    def dnsResolvers(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsDnsResolversArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsDnsResolversArgs.builder
      builder.dnsResolvers(args(argsBuilder).build)

    /**
     * @param egress Configure how Gateway Proxy traffic egresses. You can enable this setting for rules with Egress actions and filters, or omit it to indicate local egress via WARP IPs. Settable only for `egress` rules.
     * @return builder
     */
    def egress(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsEgressArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsEgressArgs.builder
      builder.egress(args(argsBuilder).build)

    /**
     * @param forensicCopy Configure whether a copy of the HTTP request will be sent to storage when the rule matches.
     * @return builder
     */
    def forensicCopy(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsForensicCopyArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsForensicCopyArgs.builder
      builder.forensicCopy(args(argsBuilder).build)

    /**
     * @param l4override Send matching traffic to the supplied destination IP address and port. Settable only for `l4` rules with the action set to `l4Override`.
     * @return builder
     */
    def l4override(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsL4overrideArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsL4overrideArgs.builder
      builder.l4override(args(argsBuilder).build)

    /**
     * @param notificationSettings Configure a notification to display on the user&#39;s device when this rule matched. Settable for all types of rules with the action set to `block`.
     * @return builder
     */
    def notificationSettings(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsNotificationSettingsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsNotificationSettingsArgs.builder
      builder.notificationSettings(args(argsBuilder).build)

    /**
     * @param payloadLog Configure DLP payload logging. Settable only for `http` rules.
     * @return builder
     */
    def payloadLog(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsPayloadLogArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsPayloadLogArgs.builder
      builder.payloadLog(args(argsBuilder).build)

    /**
     * @param quarantine Configure settings that apply to quarantine rules. Settable only for `http` rules.
     * @return builder
     */
    def quarantine(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsQuarantineArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsQuarantineArgs.builder
      builder.quarantine(args(argsBuilder).build)

    /**
     * @param redirect Apply settings to redirect rules. Settable only for `http` rules with the action set to `redirect`.
     * @return builder
     */
    def redirect(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsRedirectArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsRedirectArgs.builder
      builder.redirect(args(argsBuilder).build)

    /**
     * @param resolveDnsInternally Configure to forward the query to the internal DNS service, passing the specified &#39;view*id&#39; as input. Not used when &#39;dns*resolvers&#39; is specified or &#39;resolve*dns*through*cloudflare&#39; is set. Only valid when a rule&#39;s action set to &#39;resolve&#39;. Settable only for `dnsResolver` rules.
     * @return builder
     */
    def resolveDnsInternally(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsResolveDnsInternallyArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsResolveDnsInternallyArgs.builder
      builder.resolveDnsInternally(args(argsBuilder).build)

    /**
     * @param untrustedCert Configure behavior when an upstream certificate is invalid or an SSL error occurs. Settable only for `http` rules with the action set to `allow`.
     * @return builder
     */
    def untrustedCert(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsUntrustedCertArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsUntrustedCertArgs.builder
      builder.untrustedCert(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsDnsResolversArgs.Builder)
    def ipv4s(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv4Args.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsDnsResolversArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv4Args.builder
      builder.ipv4s(args.map(_(argsBuilder).build)*)

    def ipv6s(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv6Args.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsDnsResolversArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv6Args.builder
      builder.ipv6s(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyState.Builder)
    /**
     * @param expiration Defines the expiration time stamp and default duration of a DNS policy. Takes precedence over the policy&#39;s `schedule` configuration, if any. This  does not apply to HTTP or network policies. Settable only for `dns` rules.
     * @return builder
     */
    def expiration(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyExpirationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyExpirationArgs.builder
      builder.expiration(args(argsBuilder).build)

    /**
     * @param ruleSettings Defines settings for this rule. Settings apply only to specific rule types and must use compatible selectors. If Terraform detects drift, confirm the setting supports your rule type and check whether the API modifies the value. Use API-returned values in your configuration to prevent drift.
     * @return builder
     */
    def ruleSettings(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsArgs.builder
      builder.ruleSettings(args(argsBuilder).build)

    /**
     * @param schedule Defines the schedule for activating DNS policies. Settable only for `dns` and `dnsResolver` rules.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyScheduleArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsAntivirusArgs.Builder)
    /**
     * @param notificationSettings Configure the message the user&#39;s device shows during an antivirus scan.
     * @return builder
     */
    def notificationSettings(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsAntivirusNotificationSettingsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsAntivirusArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsAntivirusNotificationSettingsArgs.builder
      builder.notificationSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsArgs.Builder)
    /**
     * @param activityLog Specify activity log settings.
     * @return builder
     */
    def activityLog(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsActivityLogArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsActivityLogArgs.builder
      builder.activityLog(args(argsBuilder).build)

    /**
     * @param antivirus Specify anti-virus settings.
     * @return builder
     */
    def antivirus(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsAntivirusArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsAntivirusArgs.builder
      builder.antivirus(args(argsBuilder).build)

    /**
     * @param blockPage Specify block page layout settings.
     * @return builder
     */
    def blockPage(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsBlockPageArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsBlockPageArgs.builder
      builder.blockPage(args(argsBuilder).build)

    /**
     * @param bodyScanning Specify the DLP inspection mode.
     * @return builder
     */
    def bodyScanning(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsBodyScanningArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsBodyScanningArgs.builder
      builder.bodyScanning(args(argsBuilder).build)

    /**
     * @param browserIsolation Specify Clientless Browser Isolation settings.
     * @return builder
     */
    def browserIsolation(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsBrowserIsolationArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsBrowserIsolationArgs.builder
      builder.browserIsolation(args(argsBuilder).build)

    /**
     * @param certificate Specify certificate settings for Gateway TLS interception. If unset, the Cloudflare Root CA handles interception.
     * @return builder
     */
    def certificate(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    /**
     * @param customCertificate Specify custom certificate settings for BYO-PKI. This field is deprecated; use `certificate` instead.
     * @return builder
     * @deprecated This attribute is deprecated.
     */
    @deprecated("This attribute is deprecated.") def customCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsCustomCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsCustomCertificateArgs.builder
      builder.customCertificate(args(argsBuilder).build)

    /**
     * @param extendedEmailMatching Configures user email settings for firewall policies. When you enable this, the system standardizes email addresses in the identity portion of the rule to match extended email variants in firewall policies. When you disable this setting, the system matches email addresses exactly as you provide them. Enable this setting if your email uses `.` or `+` modifiers.
     * @return builder
     */
    def extendedEmailMatching(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsExtendedEmailMatchingArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsExtendedEmailMatchingArgs.builder
      builder.extendedEmailMatching(args(argsBuilder).build)

    /**
     * @param fips Specify FIPS settings.
     * @return builder
     */
    def fips(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsFipsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsFipsArgs.builder
      builder.fips(args(argsBuilder).build)

    /**
     * @param hostSelector Enable host selection in egress policies.
     * @return builder
     */
    def hostSelector(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsHostSelectorArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsHostSelectorArgs.builder
      builder.hostSelector(args(argsBuilder).build)

    /**
     * @param inspection Define the proxy inspection mode.
     * @return builder
     */
    def inspection(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsInspectionArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsInspectionArgs.builder
      builder.inspection(args(argsBuilder).build)

    /**
     * @param protocolDetection Specify whether to detect protocols from the initial bytes of client traffic.
     * @return builder
     */
    def protocolDetection(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsProtocolDetectionArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsProtocolDetectionArgs.builder
      builder.protocolDetection(args(argsBuilder).build)

    /**
     * @param sandbox Specify whether to enable the sandbox.
     * @return builder
     */
    def sandbox(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsSandboxArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsSandboxArgs.builder
      builder.sandbox(args(argsBuilder).build)

    /**
     * @param tlsDecrypt Specify whether to inspect encrypted HTTP traffic.
     * @return builder
     */
    def tlsDecrypt(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsTlsDecryptArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsTlsDecryptArgs.builder
      builder.tlsDecrypt(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsState.Builder)
    /**
     * @param settings Specify account settings.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustListState.Builder)
    /**
     * @param items Add items to the list.
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustListItemArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustListState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustListItemArgs.builder
      builder.items(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustLocalFallbackDomainState.Builder)
    def domains(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustLocalFallbackDomainDomainArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustLocalFallbackDomainState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustLocalFallbackDomainDomainArgs.builder
      builder.domains(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustOrganizationState.Builder)
    def customPages(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustOrganizationCustomPagesArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustOrganizationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustOrganizationCustomPagesArgs.builder
      builder.customPages(args(argsBuilder).build)

    def loginDesign(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustOrganizationLoginDesignArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustOrganizationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustOrganizationLoginDesignArgs.builder
      builder.loginDesign(args(argsBuilder).build)

    /**
     * @param mfaConfig Configures multi-factor authentication (MFA) settings for an organization.
     * @return builder
     */
    def mfaConfig(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustOrganizationMfaConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustOrganizationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustOrganizationMfaConfigArgs.builder
      builder.mfaConfig(args(argsBuilder).build)

    /**
     * @param mfaPivKeyRequirements Configures PIV key requirements for MFA using hardware security keys.
     * @return builder
     */
    def mfaPivKeyRequirements(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustOrganizationMfaPivKeyRequirementsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustOrganizationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustOrganizationMfaPivKeyRequirementsArgs.builder
      builder.mfaPivKeyRequirements(args(argsBuilder).build)

    /**
     * @param serviceTokenInactivity Configures automatic enforcement for inactive service tokens. A service token is inactive if no policy references it, and it has not successfully authenticated with an Access application during the selected inactivity period. This setting applies to every service token in your Zero Trust account.
     * @return builder
     */
    def serviceTokenInactivity(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustOrganizationServiceTokenInactivityArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustOrganizationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustOrganizationServiceTokenInactivityArgs.builder
      builder.serviceTokenInactivity(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigArgs.Builder)
    /**
     * @param ingresses List of public hostname definitions. At least one ingress rule needs to be defined for the tunnel.
     * @return builder
     */
    def ingresses(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigIngressArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigIngressArgs.builder
      builder.ingresses(args.map(_(argsBuilder).build)*)

    /**
     * @param originRequest Configuration parameters for the public hostname specific connection settings between cloudflared and origin server.
     * @return builder
     */
    def originRequest(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigOriginRequestArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigOriginRequestArgs.builder
      builder.originRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigIngressArgs.Builder)
    /**
     * @param originRequest Configuration parameters for the public hostname specific connection settings between cloudflared and origin server.
     * @return builder
     */
    def originRequest(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigIngressOriginRequestArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigIngressArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigIngressOriginRequestArgs.builder
      builder.originRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigIngressOriginRequestArgs.Builder)
    /**
     * @param access For all L7 requests to this hostname, cloudflared will validate each request&#39;s Cf-Access-Jwt-Assertion request header.
     * @return builder
     */
    def access(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigIngressOriginRequestAccessArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigIngressOriginRequestArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigIngressOriginRequestAccessArgs.builder
      builder.access(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigOriginRequestArgs.Builder)
    /**
     * @param access For all L7 requests to this hostname, cloudflared will validate each request&#39;s Cf-Access-Jwt-Assertion request header.
     * @return builder
     */
    def access(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigOriginRequestAccessArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigOriginRequestArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigOriginRequestAccessArgs.builder
      builder.access(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigState.Builder)
    /**
     * @param config The tunnel configuration and ingress rules.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredState.Builder)
    /**
     * @param connections The Cloudflare Tunnel connections between your origin and Cloudflare&#39;s edge.
     * @return builder
     * @deprecated This field will start returning an empty array. To fetch the connections of a given tunnel, please use the dedicated endpoint `/accounts/{account_id}/{tunnel_type}/{tunnel_id}/connections`
     */
    @deprecated("This field will start returning an empty array. To fetch the connections of a given tunnel, please use the dedicated endpoint `/accounts/{account_id}/{tunnel_type}/{tunnel_id}/connections`") def connections(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConnectionArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConnectionArgs.builder
      builder.connections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustTunnelWarpConnectorConfigConfigArgs.Builder)
    /**
     * @param vips VIPs to assign on the CloudflareWARP interface.
     * @return builder
     */
    def vips(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustTunnelWarpConnectorConfigConfigVipArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustTunnelWarpConnectorConfigConfigArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustTunnelWarpConnectorConfigConfigVipArgs.builder
      builder.vips(args.map(_(argsBuilder).build)*)

    /**
     * @param vipsPreviouses VIPs to clean up on demotion or version drift.
     * @return builder
     */
    def vipsPreviouses(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustTunnelWarpConnectorConfigConfigVipsPreviouseArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustTunnelWarpConnectorConfigConfigArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustTunnelWarpConnectorConfigConfigVipsPreviouseArgs.builder
      builder.vipsPreviouses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustTunnelWarpConnectorConfigState.Builder)
    /**
     * @param config Provider-specific configuration. Required shape depends on ha_mode. For `aws`, must contain `fnrId`. For `local`, must contain `vips`. For `none` and `disabled`, must be empty or omitted.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustTunnelWarpConnectorConfigConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZeroTrustTunnelWarpConnectorConfigState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustTunnelWarpConnectorConfigConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZeroTrustTunnelWarpConnectorState.Builder)
    /**
     * @param connections The Cloudflare Tunnel connections between your origin and Cloudflare&#39;s edge.
     * @return builder
     * @deprecated This field will start returning an empty array. To fetch the connections of a given tunnel, please use the dedicated endpoint `/accounts/{account_id}/{tunnel_type}/{tunnel_id}/connections`
     */
    @deprecated("This field will start returning an empty array. To fetch the connections of a given tunnel, please use the dedicated endpoint `/accounts/{account_id}/{tunnel_type}/{tunnel_id}/connections`") def connections(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustTunnelWarpConnectorConnectionArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZeroTrustTunnelWarpConnectorState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustTunnelWarpConnectorConnectionArgs.builder
      builder.connections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZoneCacheVariantsState.Builder)
    /**
     * @param value Value of the zone setting.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.cloudflare.inputs.ZoneCacheVariantsValueArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZoneCacheVariantsState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZoneCacheVariantsValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZoneDnsSettingsState.Builder)
    /**
     * @param internalDns Settings for this internal zone.
     * @return builder
     */
    def internalDns(args: Endofunction[com.pulumi.cloudflare.inputs.ZoneDnsSettingsInternalDnsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZoneDnsSettingsState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZoneDnsSettingsInternalDnsArgs.builder
      builder.internalDns(args(argsBuilder).build)

    /**
     * @param nameservers Controls the nameservers through which the zone is available.
     * @return builder
     */
    def nameservers(args: Endofunction[com.pulumi.cloudflare.inputs.ZoneDnsSettingsNameserversArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZoneDnsSettingsState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZoneDnsSettingsNameserversArgs.builder
      builder.nameservers(args(argsBuilder).build)

    /**
     * @param soa Components of the zone&#39;s SOA record.
     * @return builder
     */
    def soa(args: Endofunction[com.pulumi.cloudflare.inputs.ZoneDnsSettingsSoaArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZoneDnsSettingsState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZoneDnsSettingsSoaArgs.builder
      builder.soa(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZoneLockdownState.Builder)
    /**
     * @param configurations A list of IP addresses or CIDR ranges that will be allowed to access the URLs specified in the Zone Lockdown rule. You can include any number of `ip` or `ipRange` configurations.
     * @return builder
     */
    def configurations(args: Endofunction[com.pulumi.cloudflare.inputs.ZoneLockdownConfigurationArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZoneLockdownState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZoneLockdownConfigurationArgs.builder
      builder.configurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ZoneState.Builder)
    def account(args: Endofunction[com.pulumi.cloudflare.inputs.ZoneAccountArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZoneState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZoneAccountArgs.builder
      builder.account(args(argsBuilder).build)

    /**
     * @param meta Metadata about the zone.
     * @return builder
     */
    def meta(args: Endofunction[com.pulumi.cloudflare.inputs.ZoneMetaArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZoneState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZoneMetaArgs.builder
      builder.meta(args(argsBuilder).build)

    /**
     * @param owner The owner of the zone.
     * @return builder
     */
    def owner(args: Endofunction[com.pulumi.cloudflare.inputs.ZoneOwnerArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZoneState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZoneOwnerArgs.builder
      builder.owner(args(argsBuilder).build)

    /**
     * @param plan A Zones subscription information.
     * @return builder
     * @deprecated Please use the `/zones/{zone_id}/subscription` API
     * to update a zone&#39;s plan. Changing this value will create/cancel
     * associated subscriptions. To view available plans for this zone,
     * see [Zone Plans](https://developers.cloudflare.com/api/resources/zones/subresources/plans/).
     */
    @deprecated("Please use the `/zones/{zone_id}/subscription` API to update a zone&#39;s plan. Changing this value will create/cancel associated subscriptions. To view available plans for this zone, see [Zone Plans](https://developers.cloudflare.com/api/resources/zones/subresources/plans/).") def plan(args: Endofunction[com.pulumi.cloudflare.inputs.ZonePlanArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZoneState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZonePlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param tenant The root organizational unit that this zone belongs to (such as a tenant or organization).
     * @return builder
     */
    def tenant(args: Endofunction[com.pulumi.cloudflare.inputs.ZoneTenantArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZoneState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZoneTenantArgs.builder
      builder.tenant(args(argsBuilder).build)

    /**
     * @param tenantUnit The immediate parent organizational unit that this zone belongs to (such as under a tenant or sub-organization).
     * @return builder
     */
    def tenantUnit(args: Endofunction[com.pulumi.cloudflare.inputs.ZoneTenantUnitArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZoneState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZoneTenantUnitArgs.builder
      builder.tenantUnit(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZoneSubscriptionState.Builder)
    /**
     * @param ratePlan The rate plan applied to the subscription.
     * @return builder
     */
    def ratePlan(args: Endofunction[com.pulumi.cloudflare.inputs.ZoneSubscriptionRatePlanArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZoneSubscriptionState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZoneSubscriptionRatePlanArgs.builder
      builder.ratePlan(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZoneTracingRulesRuleArgs.Builder)
    def actionParameters(args: Endofunction[com.pulumi.cloudflare.inputs.ZoneTracingRulesRuleActionParametersArgs.Builder]):
        com.pulumi.cloudflare.inputs.ZoneTracingRulesRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZoneTracingRulesRuleActionParametersArgs.builder
      builder.actionParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ZoneTracingRulesState.Builder)
    /**
     * @param rules Trace rules in evaluation order.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.ZoneTracingRulesRuleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ZoneTracingRulesState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZoneTracingRulesRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)
