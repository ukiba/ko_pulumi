package jp.ukiba.ko_pulumi
package gcp

object dns_ext:
  extension (builder: com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.ManagedZoneArgs.Builder)
    /**
     * @param cloudLoggingConfig Cloud logging configuration
     * Structure is documented below.
     * @return builder
     */
    def cloudLoggingConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneCloudLoggingConfigArgs.Builder]):
        com.pulumi.gcp.dns.ManagedZoneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneCloudLoggingConfigArgs.builder
      builder.cloudLoggingConfig(args(argsBuilder).build)

    /**
     * @param dnssecConfig DNSSEC configuration
     * Structure is documented below.
     * @return builder
     */
    def dnssecConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneDnssecConfigArgs.Builder]):
        com.pulumi.gcp.dns.ManagedZoneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneDnssecConfigArgs.builder
      builder.dnssecConfig(args(argsBuilder).build)

    /**
     * @param forwardingConfig The presence for this field indicates that outbound forwarding is enabled
     * for this zone. The value of this field contains the set of destinations
     * to forward to.
     * Structure is documented below.
     * @return builder
     */
    def forwardingConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneForwardingConfigArgs.Builder]):
        com.pulumi.gcp.dns.ManagedZoneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneForwardingConfigArgs.builder
      builder.forwardingConfig(args(argsBuilder).build)

    /**
     * @param peeringConfig The presence of this field indicates that DNS Peering is enabled for this
     * zone. The value of this field contains the network to peer with.
     * Structure is documented below.
     * @return builder
     */
    def peeringConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZonePeeringConfigArgs.Builder]):
        com.pulumi.gcp.dns.ManagedZoneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZonePeeringConfigArgs.builder
      builder.peeringConfig(args(argsBuilder).build)

    /**
     * @param privateVisibilityConfig For privately visible zones, the set of Virtual Private Cloud
     * resources that the zone is visible from. At least one of `gkeClusters` or `networks` must be specified.
     * Structure is documented below.
     * @return builder
     */
    def privateVisibilityConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigArgs.Builder]):
        com.pulumi.gcp.dns.ManagedZoneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigArgs.builder
      builder.privateVisibilityConfig(args(argsBuilder).build)

    /**
     * @param serviceDirectoryConfig (Optional, Beta)
     * The presence of this field indicates that this zone is backed by Service Directory. The value of this field contains information related to the namespace associated with the zone.
     * Structure is documented below.
     * @return builder
     */
    def serviceDirectoryConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigArgs.Builder]):
        com.pulumi.gcp.dns.ManagedZoneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigArgs.builder
      builder.serviceDirectoryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.PolicyArgs.Builder)
    /**
     * @param alternativeNameServerConfig Sets an alternative name server for the associated networks.
     * When specified, all DNS queries are forwarded to a name server that you choose.
     * Names such as .internal are not available when an alternative name server is specified.
     * Structure is documented below.
     * @return builder
     */
    def alternativeNameServerConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.PolicyAlternativeNameServerConfigArgs.Builder]):
        com.pulumi.gcp.dns.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.PolicyAlternativeNameServerConfigArgs.builder
      builder.alternativeNameServerConfig(args(argsBuilder).build)

    /**
     * @param dns64Config Configurations related to DNS64 for this Policy.
     * Structure is documented below.
     * @return builder
     */
    def dns64Config(args: Endofunction[com.pulumi.gcp.dns.inputs.PolicyDns64ConfigArgs.Builder]):
        com.pulumi.gcp.dns.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.PolicyDns64ConfigArgs.builder
      builder.dns64Config(args(argsBuilder).build)

    /**
     * @param networks List of network names specifying networks to which this policy is applied.
     * Structure is documented below.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.gcp.dns.inputs.PolicyNetworkArgs.Builder]*):
        com.pulumi.gcp.dns.PolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.PolicyNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.RecordSetArgs.Builder)
    /**
     * @param routingPolicy The configuration for steering traffic based on query.
     * Now you can specify either Weighted Round Robin(WRR) type or Geolocation(GEO) type.
     * Structure is documented below.
     * @return builder
     */
    def routingPolicy(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyArgs.Builder]):
        com.pulumi.gcp.dns.RecordSetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyArgs.builder
      builder.routingPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.ResponsePolicyArgs.Builder)
    /**
     * @param gkeClusters The list of Google Kubernetes Engine clusters that can see this zone.
     * Structure is documented below.
     * @return builder
     */
    def gkeClusters(args: Endofunction[com.pulumi.gcp.dns.inputs.ResponsePolicyGkeClusterArgs.Builder]*):
        com.pulumi.gcp.dns.ResponsePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.ResponsePolicyGkeClusterArgs.builder
      builder.gkeClusters(args.map(_(argsBuilder).build)*)

    /**
     * @param networks The list of network names specifying networks to which this policy is applied.
     * Structure is documented below.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.gcp.dns.inputs.ResponsePolicyNetworkArgs.Builder]*):
        com.pulumi.gcp.dns.ResponsePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.ResponsePolicyNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.ResponsePolicyRuleArgs.Builder)
    /**
     * @param localData Answer this query directly with DNS data. These ResourceRecordSets override any other DNS behavior for the matched name;
     * in particular they override private zones, the public internet, and GCP internal DNS. No SOA nor NS types are allowed.
     * Structure is documented below.
     * @return builder
     */
    def localData(args: Endofunction[com.pulumi.gcp.dns.inputs.ResponsePolicyRuleLocalDataArgs.Builder]):
        com.pulumi.gcp.dns.ResponsePolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ResponsePolicyRuleLocalDataArgs.builder
      builder.localData(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.ManagedZoneDnssecConfigArgs.Builder)
    /**
     * @param defaultKeySpecs Specifies parameters that will be used for generating initial DnsKeys
     * for this ManagedZone. If you provide a spec for keySigning or zoneSigning,
     * you must also provide one for the other.
     * defaultKeySpecs can only be updated when the state is `off`.
     * Structure is documented below.
     * @return builder
     */
    def defaultKeySpecs(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneDnssecConfigDefaultKeySpecArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.ManagedZoneDnssecConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneDnssecConfigDefaultKeySpecArgs.builder
      builder.defaultKeySpecs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.ManagedZoneForwardingConfigArgs.Builder)
    /**
     * @param targetNameServers List of target name servers to forward to. Cloud DNS will
     * select the best available name server if more than
     * one target is given.
     * Structure is documented below.
     * @return builder
     */
    def targetNameServers(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneForwardingConfigTargetNameServerArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.ManagedZoneForwardingConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneForwardingConfigTargetNameServerArgs.builder
      builder.targetNameServers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.ManagedZonePeeringConfigArgs.Builder)
    /**
     * @param targetNetwork The network with which to peer.
     * Structure is documented below.
     * @return builder
     */
    def targetNetwork(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZonePeeringConfigTargetNetworkArgs.Builder]):
        com.pulumi.gcp.dns.inputs.ManagedZonePeeringConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZonePeeringConfigTargetNetworkArgs.builder
      builder.targetNetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigArgs.Builder)
    /**
     * @param gkeClusters The list of Google Kubernetes Engine clusters that can see this zone.
     * Structure is documented below.
     * @return builder
     */
    def gkeClusters(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigGkeClusterArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigGkeClusterArgs.builder
      builder.gkeClusters(args.map(_(argsBuilder).build)*)

    /**
     * @param networks The list of VPC networks that can see this zone. Until the provider updates to use the Terraform 0.12 SDK in a future release, you
     * may experience issues with this resource while updating. If you&#39;ve defined a `networks` block and
     * add another `networks` block while keeping the old block, Terraform will see an incorrect diff
     * and apply an incorrect update to the resource. If you encounter this issue, remove all `networks`
     * blocks in an update and then apply another update adding all of them back simultaneously.
     * Structure is documented below.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigNetworkArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigArgs.Builder)
    /**
     * @param namespace The namespace associated with the zone.
     * Structure is documented below.
     * @return builder
     */
    def namespace(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigNamespaceArgs.Builder]):
        com.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigNamespaceArgs.builder
      builder.namespace(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.ManagedZoneState.Builder)
    /**
     * @param cloudLoggingConfig Cloud logging configuration
     * Structure is documented below.
     * @return builder
     */
    def cloudLoggingConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneCloudLoggingConfigArgs.Builder]):
        com.pulumi.gcp.dns.inputs.ManagedZoneState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneCloudLoggingConfigArgs.builder
      builder.cloudLoggingConfig(args(argsBuilder).build)

    /**
     * @param dnssecConfig DNSSEC configuration
     * Structure is documented below.
     * @return builder
     */
    def dnssecConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneDnssecConfigArgs.Builder]):
        com.pulumi.gcp.dns.inputs.ManagedZoneState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneDnssecConfigArgs.builder
      builder.dnssecConfig(args(argsBuilder).build)

    /**
     * @param forwardingConfig The presence for this field indicates that outbound forwarding is enabled
     * for this zone. The value of this field contains the set of destinations
     * to forward to.
     * Structure is documented below.
     * @return builder
     */
    def forwardingConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneForwardingConfigArgs.Builder]):
        com.pulumi.gcp.dns.inputs.ManagedZoneState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneForwardingConfigArgs.builder
      builder.forwardingConfig(args(argsBuilder).build)

    /**
     * @param peeringConfig The presence of this field indicates that DNS Peering is enabled for this
     * zone. The value of this field contains the network to peer with.
     * Structure is documented below.
     * @return builder
     */
    def peeringConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZonePeeringConfigArgs.Builder]):
        com.pulumi.gcp.dns.inputs.ManagedZoneState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZonePeeringConfigArgs.builder
      builder.peeringConfig(args(argsBuilder).build)

    /**
     * @param privateVisibilityConfig For privately visible zones, the set of Virtual Private Cloud
     * resources that the zone is visible from. At least one of `gkeClusters` or `networks` must be specified.
     * Structure is documented below.
     * @return builder
     */
    def privateVisibilityConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigArgs.Builder]):
        com.pulumi.gcp.dns.inputs.ManagedZoneState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigArgs.builder
      builder.privateVisibilityConfig(args(argsBuilder).build)

    /**
     * @param serviceDirectoryConfig (Optional, Beta)
     * The presence of this field indicates that this zone is backed by Service Directory. The value of this field contains information related to the namespace associated with the zone.
     * Structure is documented below.
     * @return builder
     */
    def serviceDirectoryConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigArgs.Builder]):
        com.pulumi.gcp.dns.inputs.ManagedZoneState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigArgs.builder
      builder.serviceDirectoryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.PolicyAlternativeNameServerConfigArgs.Builder)
    /**
     * @param targetNameServers Sets an alternative name server for the associated networks. When specified,
     * all DNS queries are forwarded to a name server that you choose. Names such as .internal
     * are not available when an alternative name server is specified.
     * Structure is documented below.
     * @return builder
     */
    def targetNameServers(args: Endofunction[com.pulumi.gcp.dns.inputs.PolicyAlternativeNameServerConfigTargetNameServerArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.PolicyAlternativeNameServerConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.PolicyAlternativeNameServerConfigTargetNameServerArgs.builder
      builder.targetNameServers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.PolicyDns64ConfigArgs.Builder)
    /**
     * @param scope The scope to which DNS64 config will be applied to.
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.gcp.dns.inputs.PolicyDns64ConfigScopeArgs.Builder]):
        com.pulumi.gcp.dns.inputs.PolicyDns64ConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.PolicyDns64ConfigScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.PolicyState.Builder)
    /**
     * @param alternativeNameServerConfig Sets an alternative name server for the associated networks.
     * When specified, all DNS queries are forwarded to a name server that you choose.
     * Names such as .internal are not available when an alternative name server is specified.
     * Structure is documented below.
     * @return builder
     */
    def alternativeNameServerConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.PolicyAlternativeNameServerConfigArgs.Builder]):
        com.pulumi.gcp.dns.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.PolicyAlternativeNameServerConfigArgs.builder
      builder.alternativeNameServerConfig(args(argsBuilder).build)

    /**
     * @param dns64Config Configurations related to DNS64 for this Policy.
     * Structure is documented below.
     * @return builder
     */
    def dns64Config(args: Endofunction[com.pulumi.gcp.dns.inputs.PolicyDns64ConfigArgs.Builder]):
        com.pulumi.gcp.dns.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.PolicyDns64ConfigArgs.builder
      builder.dns64Config(args(argsBuilder).build)

    /**
     * @param networks List of network names specifying networks to which this policy is applied.
     * Structure is documented below.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.gcp.dns.inputs.PolicyNetworkArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.PolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.PolicyNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyArgs.Builder)
    /**
     * @param geos The configuration for Geolocation based routing policy.
     * Structure is documented below.
     * @return builder
     */
    def geos(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyGeoArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyGeoArgs.builder
      builder.geos(args.map(_(argsBuilder).build)*)

    /**
     * @param primaryBackup The configuration for a failover policy with global to regional failover. Queries are responded to with the global primary targets, but if none of the primary targets are healthy, then we fallback to a regional failover policy.
     * Structure is documented below.
     * @return builder
     */
    def primaryBackup(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupArgs.Builder]):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupArgs.builder
      builder.primaryBackup(args(argsBuilder).build)

    /**
     * @param wrrs The configuration for Weighted Round Robin based routing policy.
     * Structure is documented below.
     * @return builder
     */
    def wrrs(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyWrrArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyWrrArgs.builder
      builder.wrrs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyGeoArgs.Builder)
    /**
     * @param healthCheckedTargets For A and AAAA types only. The list of targets to be health checked. These can be specified along with `rrdatas` within this item.
     * Structure is documented below.
     * @return builder
     */
    def healthCheckedTargets(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyGeoHealthCheckedTargetsArgs.Builder]):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyGeoArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyGeoHealthCheckedTargetsArgs.builder
      builder.healthCheckedTargets(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyGeoHealthCheckedTargetsArgs.Builder)
    /**
     * @param internalLoadBalancers The list of internal load balancers to health check.
     * Structure is documented below.
     * @return builder
     */
    def internalLoadBalancers(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyGeoHealthCheckedTargetsInternalLoadBalancerArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyGeoHealthCheckedTargetsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyGeoHealthCheckedTargetsInternalLoadBalancerArgs.builder
      builder.internalLoadBalancers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupArgs.Builder)
    /**
     * @param backupGeos The backup geo targets, which provide a regional failover policy for the otherwise global primary targets.
     * Structure is document above.
     * @return builder
     */
    def backupGeos(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoArgs.builder
      builder.backupGeos(args.map(_(argsBuilder).build)*)

    /**
     * @param primary The list of global primary targets to be health checked.
     * Structure is documented below.
     * @return builder
     */
    def primary(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupPrimaryArgs.Builder]):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupPrimaryArgs.builder
      builder.primary(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoArgs.Builder)
    /**
     * @param healthCheckedTargets For A and AAAA types only. The list of targets to be health checked. These can be specified along with `rrdatas` within this item.
     * @return builder
     */
    def healthCheckedTargets(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoHealthCheckedTargetsArgs.Builder]):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoHealthCheckedTargetsArgs.builder
      builder.healthCheckedTargets(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoHealthCheckedTargetsArgs.Builder)
    /**
     * @param internalLoadBalancers The list of internal load balancers to health check.
     * Structure is documented below.
     * @return builder
     */
    def internalLoadBalancers(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoHealthCheckedTargetsInternalLoadBalancerArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoHealthCheckedTargetsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoHealthCheckedTargetsInternalLoadBalancerArgs.builder
      builder.internalLoadBalancers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupPrimaryArgs.Builder)
    /**
     * @param internalLoadBalancers The list of internal load balancers to health check.
     * @return builder
     */
    def internalLoadBalancers(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupPrimaryInternalLoadBalancerArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupPrimaryArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupPrimaryInternalLoadBalancerArgs.builder
      builder.internalLoadBalancers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyWrrArgs.Builder)
    /**
     * @param healthCheckedTargets The list of targets to be health checked. Note that if DNSSEC is enabled for this zone, only one of `rrdatas` or `healthCheckedTargets` can be set.
     * Structure is documented below.
     * @return builder
     */
    def healthCheckedTargets(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyWrrHealthCheckedTargetsArgs.Builder]):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyWrrArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyWrrHealthCheckedTargetsArgs.builder
      builder.healthCheckedTargets(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyWrrHealthCheckedTargetsArgs.Builder)
    /**
     * @param internalLoadBalancers The list of internal load balancers to health check.
     * Structure is documented below.
     * @return builder
     */
    def internalLoadBalancers(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyWrrHealthCheckedTargetsInternalLoadBalancerArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyWrrHealthCheckedTargetsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyWrrHealthCheckedTargetsInternalLoadBalancerArgs.builder
      builder.internalLoadBalancers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.RecordSetState.Builder)
    /**
     * @param routingPolicy The configuration for steering traffic based on query.
     * Now you can specify either Weighted Round Robin(WRR) type or Geolocation(GEO) type.
     * Structure is documented below.
     * @return builder
     */
    def routingPolicy(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyArgs.Builder]):
        com.pulumi.gcp.dns.inputs.RecordSetState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyArgs.builder
      builder.routingPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.ResponsePolicyRuleLocalDataArgs.Builder)
    /**
     * @param localDatas All resource record sets for this selector, one per resource record type. The name must match the dns_name.
     * Structure is documented below.
     * @return builder
     */
    def localDatas(args: Endofunction[com.pulumi.gcp.dns.inputs.ResponsePolicyRuleLocalDataLocalDataArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.ResponsePolicyRuleLocalDataArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.ResponsePolicyRuleLocalDataLocalDataArgs.builder
      builder.localDatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.ResponsePolicyRuleState.Builder)
    /**
     * @param localData Answer this query directly with DNS data. These ResourceRecordSets override any other DNS behavior for the matched name;
     * in particular they override private zones, the public internet, and GCP internal DNS. No SOA nor NS types are allowed.
     * Structure is documented below.
     * @return builder
     */
    def localData(args: Endofunction[com.pulumi.gcp.dns.inputs.ResponsePolicyRuleLocalDataArgs.Builder]):
        com.pulumi.gcp.dns.inputs.ResponsePolicyRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ResponsePolicyRuleLocalDataArgs.builder
      builder.localData(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.ResponsePolicyState.Builder)
    /**
     * @param gkeClusters The list of Google Kubernetes Engine clusters that can see this zone.
     * Structure is documented below.
     * @return builder
     */
    def gkeClusters(args: Endofunction[com.pulumi.gcp.dns.inputs.ResponsePolicyGkeClusterArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.ResponsePolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.ResponsePolicyGkeClusterArgs.builder
      builder.gkeClusters(args.map(_(argsBuilder).build)*)

    /**
     * @param networks The list of network names specifying networks to which this policy is applied.
     * Structure is documented below.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.gcp.dns.inputs.ResponsePolicyNetworkArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.ResponsePolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.ResponsePolicyNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)
