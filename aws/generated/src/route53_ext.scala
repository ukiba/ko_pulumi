package jp.ukiba.ko_pulumi
package aws

object route53_ext:
  extension (builder: com.pulumi.aws.route53.ProfilesAssociationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.route53.inputs.ProfilesAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.route53.ProfilesAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.ProfilesAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53.ProfilesProfileArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.route53.inputs.ProfilesProfileTimeoutsArgs.Builder]):
        com.pulumi.aws.route53.ProfilesProfileArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.ProfilesProfileTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53.ProfilesResourceAssociationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.route53.inputs.ProfilesResourceAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.route53.ProfilesResourceAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.ProfilesResourceAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53.RecordArgs.Builder)
    /**
     * @param aliases An alias block. Conflicts with `ttl` &amp; `records`.
     * Documented below.
     * @return builder
     */
    def aliases(args: Endofunction[com.pulumi.aws.route53.inputs.RecordAliasArgs.Builder]*):
        com.pulumi.aws.route53.RecordArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.RecordAliasArgs.builder
      builder.aliases(args.map(_(argsBuilder).build)*)

    /**
     * @param cidrRoutingPolicy A block indicating a routing policy based on the IP network ranges of requestors. Conflicts with any other routing policy. Documented below.
     * @return builder
     */
    def cidrRoutingPolicy(args: Endofunction[com.pulumi.aws.route53.inputs.RecordCidrRoutingPolicyArgs.Builder]):
        com.pulumi.aws.route53.RecordArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.RecordCidrRoutingPolicyArgs.builder
      builder.cidrRoutingPolicy(args(argsBuilder).build)

    /**
     * @param failoverRoutingPolicies A block indicating the routing behavior when associated health check fails. Conflicts with any other routing policy. Documented below.
     * @return builder
     */
    def failoverRoutingPolicies(args: Endofunction[com.pulumi.aws.route53.inputs.RecordFailoverRoutingPolicyArgs.Builder]*):
        com.pulumi.aws.route53.RecordArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.RecordFailoverRoutingPolicyArgs.builder
      builder.failoverRoutingPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param geolocationRoutingPolicies A block indicating a routing policy based on the geolocation of the requestor. Conflicts with any other routing policy. Documented below.
     * @return builder
     */
    def geolocationRoutingPolicies(args: Endofunction[com.pulumi.aws.route53.inputs.RecordGeolocationRoutingPolicyArgs.Builder]*):
        com.pulumi.aws.route53.RecordArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.RecordGeolocationRoutingPolicyArgs.builder
      builder.geolocationRoutingPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param geoproximityRoutingPolicy A block indicating a routing policy based on the geoproximity of the requestor. Conflicts with any other routing policy. Documented below.
     * @return builder
     */
    def geoproximityRoutingPolicy(args: Endofunction[com.pulumi.aws.route53.inputs.RecordGeoproximityRoutingPolicyArgs.Builder]):
        com.pulumi.aws.route53.RecordArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.RecordGeoproximityRoutingPolicyArgs.builder
      builder.geoproximityRoutingPolicy(args(argsBuilder).build)

    /**
     * @param latencyRoutingPolicies A block indicating a routing policy based on the latency between the requestor and an AWS region. Conflicts with any other routing policy. Documented below.
     * @return builder
     */
    def latencyRoutingPolicies(args: Endofunction[com.pulumi.aws.route53.inputs.RecordLatencyRoutingPolicyArgs.Builder]*):
        com.pulumi.aws.route53.RecordArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.RecordLatencyRoutingPolicyArgs.builder
      builder.latencyRoutingPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param weightedRoutingPolicies A block indicating a weighted routing policy. Conflicts with any other routing policy. Documented below.
     * @return builder
     */
    def weightedRoutingPolicies(args: Endofunction[com.pulumi.aws.route53.inputs.RecordWeightedRoutingPolicyArgs.Builder]*):
        com.pulumi.aws.route53.RecordArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.RecordWeightedRoutingPolicyArgs.builder
      builder.weightedRoutingPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53.RecordsExclusiveArgs.Builder)
    /**
     * @param resourceRecordSets A list of all resource record sets associated with the hosted zone.
     * See `resourceRecordSet` below.
     * @return builder
     */
    def resourceRecordSets(args: Endofunction[com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetArgs.Builder]*):
        com.pulumi.aws.route53.RecordsExclusiveArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetArgs.builder
      builder.resourceRecordSets(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.route53.inputs.RecordsExclusiveTimeoutsArgs.Builder]):
        com.pulumi.aws.route53.RecordsExclusiveArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.RecordsExclusiveTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53.ResolverEndpointArgs.Builder)
    /**
     * @param ipAddresses Subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
     * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
     * @return builder
     */
    def ipAddresses(args: Endofunction[com.pulumi.aws.route53.inputs.ResolverEndpointIpAddressArgs.Builder]*):
        com.pulumi.aws.route53.ResolverEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.ResolverEndpointIpAddressArgs.builder
      builder.ipAddresses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53.ResolverRuleArgs.Builder)
    /**
     * @param targetIps Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
     * This argument should only be specified for `FORWARD` type rules.
     * @return builder
     */
    def targetIps(args: Endofunction[com.pulumi.aws.route53.inputs.ResolverRuleTargetIpArgs.Builder]*):
        com.pulumi.aws.route53.ResolverRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.ResolverRuleTargetIpArgs.builder
      builder.targetIps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53.ZoneArgs.Builder)
    /**
     * @param vpcs Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegationSetId` argument in this resource and any `aws.route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
     * @return builder
     */
    def vpcs(args: Endofunction[com.pulumi.aws.route53.inputs.ZoneVpcArgs.Builder]*):
        com.pulumi.aws.route53.ZoneArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.ZoneVpcArgs.builder
      builder.vpcs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53.inputs.GetQueryLogConfigArgs.Builder)
    /**
     * @param filters One or more name/value pairs to use as filters. There are
     * several valid keys, for a full reference, check out
     * [Route53resolver Filter value in the AWS API reference](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_Filter.html).
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.route53.inputs.GetQueryLogConfigFilterArgs.Builder]*):
        com.pulumi.aws.route53.inputs.GetQueryLogConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.GetQueryLogConfigFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53.inputs.GetQueryLogConfigPlainArgs.Builder)
    /**
     * @param filters One or more name/value pairs to use as filters. There are
     * several valid keys, for a full reference, check out
     * [Route53resolver Filter value in the AWS API reference](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_Filter.html).
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.route53.inputs.GetQueryLogConfigFilter.Builder]*):
        com.pulumi.aws.route53.inputs.GetQueryLogConfigPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.GetQueryLogConfigFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53.inputs.GetResolverEndpointArgs.Builder)
    /**
     * @param filters One or more name/value pairs to use as filters. There are
     * several valid keys, for a full reference, check out
     * [Route53resolver Filter value in the AWS API reference](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_Filter.html).
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverEndpointFilterArgs.Builder]*):
        com.pulumi.aws.route53.inputs.GetResolverEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.GetResolverEndpointFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53.inputs.GetResolverEndpointPlainArgs.Builder)
    /**
     * @param filters One or more name/value pairs to use as filters. There are
     * several valid keys, for a full reference, check out
     * [Route53resolver Filter value in the AWS API reference](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_Filter.html).
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverEndpointFilter.Builder]*):
        com.pulumi.aws.route53.inputs.GetResolverEndpointPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.GetResolverEndpointFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentArgs.Builder)
    /**
     * @param endpoints Configuration block for the definitions of the endpoints that you want to use in this traffic policy. See below
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentEndpointArgs.Builder]*):
        com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param rules Configuration block for definitions of the rules that you want to use in this traffic policy. See below
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleArgs.Builder]*):
        com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentPlainArgs.Builder)
    /**
     * @param endpoints Configuration block for the definitions of the endpoints that you want to use in this traffic policy. See below
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentEndpoint.Builder]*):
        com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentEndpoint.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param rules Configuration block for definitions of the rules that you want to use in this traffic policy. See below
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRule.Builder]*):
        com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRule.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRule.Builder)
    /**
     * @param geoProximityLocations Configuration block for when you add a geoproximity rule, you configure Amazon Route 53 to route traffic to your resources based on the geographic location of your resources. Only valid for `geoproximity` type. See below
     * @return builder
     */
    def geoProximityLocations(args: Endofunction[com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleGeoProximityLocation.Builder]*):
        com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRule.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleGeoProximityLocation.builder
      builder.geoProximityLocations(args.map(_(argsBuilder).build)*)

    /**
     * @param items Configuration block for when you add a multivalue answer rule, you configure your traffic policy to route traffic approximately randomly to your healthy resources.  Only valid for `multivalue` type. See below
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleItem.Builder]*):
        com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRule.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleItem.builder
      builder.items(args.map(_(argsBuilder).build)*)

    /**
     * @param locations Configuration block for when you add a geolocation rule, you configure your traffic policy to route your traffic based on the geographic location of your users.  Only valid for `geo` type. See below
     * @return builder
     */
    def locations(args: Endofunction[com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleLocation.Builder]*):
        com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRule.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleLocation.builder
      builder.locations(args.map(_(argsBuilder).build)*)

    /**
     * @param primary Configuration block for the settings for the rule or endpoint that you want to route traffic to whenever the corresponding resources are available. Only valid for `failover` type. See below
     * @return builder
     */
    def primary(args: Endofunction[com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRulePrimary.Builder]):
        com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRule.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRulePrimary.builder
      builder.primary(args(argsBuilder).build)

    def regions(args: Endofunction[com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleRegion.Builder]*):
        com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRule.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleRegion.builder
      builder.regions(args.map(_(argsBuilder).build)*)

    /**
     * @param secondary Configuration block for the rule or endpoint that you want to route traffic to whenever the primary resources are not available. Only valid for `failover` type. See below
     * @return builder
     */
    def secondary(args: Endofunction[com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleSecondary.Builder]):
        com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRule.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleSecondary.builder
      builder.secondary(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleArgs.Builder)
    /**
     * @param geoProximityLocations Configuration block for when you add a geoproximity rule, you configure Amazon Route 53 to route traffic to your resources based on the geographic location of your resources. Only valid for `geoproximity` type. See below
     * @return builder
     */
    def geoProximityLocations(args: Endofunction[com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleGeoProximityLocationArgs.Builder]*):
        com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleGeoProximityLocationArgs.builder
      builder.geoProximityLocations(args.map(_(argsBuilder).build)*)

    /**
     * @param items Configuration block for when you add a multivalue answer rule, you configure your traffic policy to route traffic approximately randomly to your healthy resources.  Only valid for `multivalue` type. See below
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleItemArgs.Builder]*):
        com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleItemArgs.builder
      builder.items(args.map(_(argsBuilder).build)*)

    /**
     * @param locations Configuration block for when you add a geolocation rule, you configure your traffic policy to route your traffic based on the geographic location of your users.  Only valid for `geo` type. See below
     * @return builder
     */
    def locations(args: Endofunction[com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleLocationArgs.Builder]*):
        com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleLocationArgs.builder
      builder.locations(args.map(_(argsBuilder).build)*)

    /**
     * @param primary Configuration block for the settings for the rule or endpoint that you want to route traffic to whenever the corresponding resources are available. Only valid for `failover` type. See below
     * @return builder
     */
    def primary(args: Endofunction[com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRulePrimaryArgs.Builder]):
        com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRulePrimaryArgs.builder
      builder.primary(args(argsBuilder).build)

    def regions(args: Endofunction[com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleRegionArgs.Builder]*):
        com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleRegionArgs.builder
      builder.regions(args.map(_(argsBuilder).build)*)

    /**
     * @param secondary Configuration block for the rule or endpoint that you want to route traffic to whenever the primary resources are not available. Only valid for `failover` type. See below
     * @return builder
     */
    def secondary(args: Endofunction[com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleSecondaryArgs.Builder]):
        com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRuleSecondaryArgs.builder
      builder.secondary(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53.inputs.ProfilesAssociationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.route53.inputs.ProfilesAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.route53.inputs.ProfilesAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.ProfilesAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53.inputs.ProfilesProfileState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.route53.inputs.ProfilesProfileTimeoutsArgs.Builder]):
        com.pulumi.aws.route53.inputs.ProfilesProfileState.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.ProfilesProfileTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53.inputs.ProfilesResourceAssociationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.route53.inputs.ProfilesResourceAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.route53.inputs.ProfilesResourceAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.ProfilesResourceAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53.inputs.RecordGeoproximityRoutingPolicyArgs.Builder)
    /**
     * @param coordinates Specify `latitude` and `longitude` for routing traffic to non-AWS resources.
     * @return builder
     */
    def coordinates(args: Endofunction[com.pulumi.aws.route53.inputs.RecordGeoproximityRoutingPolicyCoordinateArgs.Builder]*):
        com.pulumi.aws.route53.inputs.RecordGeoproximityRoutingPolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.RecordGeoproximityRoutingPolicyCoordinateArgs.builder
      builder.coordinates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53.inputs.RecordState.Builder)
    /**
     * @param aliases An alias block. Conflicts with `ttl` &amp; `records`.
     * Documented below.
     * @return builder
     */
    def aliases(args: Endofunction[com.pulumi.aws.route53.inputs.RecordAliasArgs.Builder]*):
        com.pulumi.aws.route53.inputs.RecordState.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.RecordAliasArgs.builder
      builder.aliases(args.map(_(argsBuilder).build)*)

    /**
     * @param cidrRoutingPolicy A block indicating a routing policy based on the IP network ranges of requestors. Conflicts with any other routing policy. Documented below.
     * @return builder
     */
    def cidrRoutingPolicy(args: Endofunction[com.pulumi.aws.route53.inputs.RecordCidrRoutingPolicyArgs.Builder]):
        com.pulumi.aws.route53.inputs.RecordState.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.RecordCidrRoutingPolicyArgs.builder
      builder.cidrRoutingPolicy(args(argsBuilder).build)

    /**
     * @param failoverRoutingPolicies A block indicating the routing behavior when associated health check fails. Conflicts with any other routing policy. Documented below.
     * @return builder
     */
    def failoverRoutingPolicies(args: Endofunction[com.pulumi.aws.route53.inputs.RecordFailoverRoutingPolicyArgs.Builder]*):
        com.pulumi.aws.route53.inputs.RecordState.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.RecordFailoverRoutingPolicyArgs.builder
      builder.failoverRoutingPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param geolocationRoutingPolicies A block indicating a routing policy based on the geolocation of the requestor. Conflicts with any other routing policy. Documented below.
     * @return builder
     */
    def geolocationRoutingPolicies(args: Endofunction[com.pulumi.aws.route53.inputs.RecordGeolocationRoutingPolicyArgs.Builder]*):
        com.pulumi.aws.route53.inputs.RecordState.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.RecordGeolocationRoutingPolicyArgs.builder
      builder.geolocationRoutingPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param geoproximityRoutingPolicy A block indicating a routing policy based on the geoproximity of the requestor. Conflicts with any other routing policy. Documented below.
     * @return builder
     */
    def geoproximityRoutingPolicy(args: Endofunction[com.pulumi.aws.route53.inputs.RecordGeoproximityRoutingPolicyArgs.Builder]):
        com.pulumi.aws.route53.inputs.RecordState.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.RecordGeoproximityRoutingPolicyArgs.builder
      builder.geoproximityRoutingPolicy(args(argsBuilder).build)

    /**
     * @param latencyRoutingPolicies A block indicating a routing policy based on the latency between the requestor and an AWS region. Conflicts with any other routing policy. Documented below.
     * @return builder
     */
    def latencyRoutingPolicies(args: Endofunction[com.pulumi.aws.route53.inputs.RecordLatencyRoutingPolicyArgs.Builder]*):
        com.pulumi.aws.route53.inputs.RecordState.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.RecordLatencyRoutingPolicyArgs.builder
      builder.latencyRoutingPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param weightedRoutingPolicies A block indicating a weighted routing policy. Conflicts with any other routing policy. Documented below.
     * @return builder
     */
    def weightedRoutingPolicies(args: Endofunction[com.pulumi.aws.route53.inputs.RecordWeightedRoutingPolicyArgs.Builder]*):
        com.pulumi.aws.route53.inputs.RecordState.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.RecordWeightedRoutingPolicyArgs.builder
      builder.weightedRoutingPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetArgs.Builder)
    /**
     * @param aliasTarget Alias target block.
     * See `aliasTarget` below.
     * @return builder
     */
    def aliasTarget(args: Endofunction[com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetAliasTargetArgs.Builder]):
        com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetAliasTargetArgs.builder
      builder.aliasTarget(args(argsBuilder).build)

    def cidrRoutingConfig(args: Endofunction[com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetCidrRoutingConfigArgs.Builder]):
        com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetCidrRoutingConfigArgs.builder
      builder.cidrRoutingConfig(args(argsBuilder).build)

    /**
     * @param geolocation Geolocation block to control how Amazon Route 53 responds to DNS queries based on the geographic origin of the query.
     * See `geolocation` below.
     * @return builder
     */
    def geolocation(args: Endofunction[com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetGeolocationArgs.Builder]):
        com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetGeolocationArgs.builder
      builder.geolocation(args(argsBuilder).build)

    /**
     * @param geoproximityLocation Geoproximity location block.
     * See `geoproximityLocation` below.
     * @return builder
     */
    def geoproximityLocation(args: Endofunction[com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetGeoproximityLocationArgs.Builder]):
        com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetGeoproximityLocationArgs.builder
      builder.geoproximityLocation(args(argsBuilder).build)

    /**
     * @param resourceRecords Information about the resource records to act upon.
     * See `resourceRecords` below.
     * @return builder
     */
    def resourceRecords(args: Endofunction[com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetResourceRecordArgs.Builder]*):
        com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetResourceRecordArgs.builder
      builder.resourceRecords(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetGeoproximityLocationArgs.Builder)
    /**
     * @param coordinates Coordinates for a geoproximity resource record.
     * See `coordinates` below.
     * @return builder
     */
    def coordinates(args: Endofunction[com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetGeoproximityLocationCoordinatesArgs.Builder]):
        com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetGeoproximityLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetGeoproximityLocationCoordinatesArgs.builder
      builder.coordinates(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53.inputs.RecordsExclusiveState.Builder)
    /**
     * @param resourceRecordSets A list of all resource record sets associated with the hosted zone.
     * See `resourceRecordSet` below.
     * @return builder
     */
    def resourceRecordSets(args: Endofunction[com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetArgs.Builder]*):
        com.pulumi.aws.route53.inputs.RecordsExclusiveState.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetArgs.builder
      builder.resourceRecordSets(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.route53.inputs.RecordsExclusiveTimeoutsArgs.Builder]):
        com.pulumi.aws.route53.inputs.RecordsExclusiveState.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.RecordsExclusiveTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53.inputs.ResolverEndpointState.Builder)
    /**
     * @param ipAddresses Subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
     * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
     * @return builder
     */
    def ipAddresses(args: Endofunction[com.pulumi.aws.route53.inputs.ResolverEndpointIpAddressArgs.Builder]*):
        com.pulumi.aws.route53.inputs.ResolverEndpointState.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.ResolverEndpointIpAddressArgs.builder
      builder.ipAddresses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53.inputs.ResolverRuleState.Builder)
    /**
     * @param targetIps Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
     * This argument should only be specified for `FORWARD` type rules.
     * @return builder
     */
    def targetIps(args: Endofunction[com.pulumi.aws.route53.inputs.ResolverRuleTargetIpArgs.Builder]*):
        com.pulumi.aws.route53.inputs.ResolverRuleState.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.ResolverRuleTargetIpArgs.builder
      builder.targetIps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53.inputs.ZoneState.Builder)
    /**
     * @param vpcs Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegationSetId` argument in this resource and any `aws.route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
     * @return builder
     */
    def vpcs(args: Endofunction[com.pulumi.aws.route53.inputs.ZoneVpcArgs.Builder]*):
        com.pulumi.aws.route53.inputs.ZoneState.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.ZoneVpcArgs.builder
      builder.vpcs(args.map(_(argsBuilder).build)*)
