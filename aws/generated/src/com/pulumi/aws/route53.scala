package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object route53:
  extension (builder: com.pulumi.aws.route53.ResolverRuleArgs.Builder)
    /**
     * @param targetIps Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
     *  This argument should only be specified for `FORWARD` type rules.
     * @return builder
     */
    def targetIps(args: Endofunction[com.pulumi.aws.route53.inputs.ResolverRuleTargetIpArgs.Builder]*):
        com.pulumi.aws.route53.ResolverRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.ResolverRuleTargetIpArgs.builder
      builder.targetIps(args.map(_(argsBuilder).build)*)

  /** Provides a Route 53 Resolver DNSSEC config resource. */
  def ResolverDnsSecConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverDnsSecConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.route53.ResolverDnsSecConfigArgs.builder
    
    com.pulumi.aws.route53.ResolverDnsSecConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Route 53 Profiles Resource Association. */
  def ProfilesResourceAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.ProfilesResourceAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ProfilesResourceAssociationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.route53.ProfilesResourceAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type Route53Functions = com.pulumi.aws.route53.Route53Functions
  object Route53Functions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.route53.Route53Functions.*
  extension (self: Route53Functions.type)
    /**
     * `aws.route53.DelegationSet` provides details about a specific Route 53 Delegation Set.
     *  
     *  This data source allows to find a list of name servers associated with a specific delegation set.
     */
    def getDelegationSet(args: Endofunction[com.pulumi.aws.route53.inputs.GetDelegationSetArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetDelegationSetResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetDelegationSetArgs.builder
      com.pulumi.aws.route53.Route53Functions.getDelegationSet(args(argsBuilder).build)

    /**
     * `aws.route53.DelegationSet` provides details about a specific Route 53 Delegation Set.
     *  
     *  This data source allows to find a list of name servers associated with a specific delegation set.
     */
    def getDelegationSetPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetDelegationSetPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetDelegationSetResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetDelegationSetPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getDelegationSetPlain(args(argsBuilder).build)

    /** Data source for managing an AWS Route 53 Profiles. */
    def getProfilesProfiles(args: Endofunction[com.pulumi.aws.route53.inputs.GetProfilesProfilesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetProfilesProfilesResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetProfilesProfilesArgs.builder
      com.pulumi.aws.route53.Route53Functions.getProfilesProfiles(args(argsBuilder).build)

    /** Data source for managing an AWS Route 53 Profiles. */
    def getProfilesProfilesPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetProfilesProfilesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetProfilesProfilesResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetProfilesProfilesPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getProfilesProfilesPlain(args(argsBuilder).build)

    /** `aws.route53.ResolverQueryLogConfig` provides details about a specific Route53 Resolver Query Logging Configuration. */
    def getQueryLogConfig(args: Endofunction[com.pulumi.aws.route53.inputs.GetQueryLogConfigArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetQueryLogConfigResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetQueryLogConfigArgs.builder
      com.pulumi.aws.route53.Route53Functions.getQueryLogConfig(args(argsBuilder).build)

    /** `aws.route53.ResolverQueryLogConfig` provides details about a specific Route53 Resolver Query Logging Configuration. */
    def getQueryLogConfigPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetQueryLogConfigPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetQueryLogConfigResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetQueryLogConfigPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getQueryLogConfigPlain(args(argsBuilder).build)

    /** Use this data source to get the details of resource records in a Route 53 hosted zone. */
    def getRecords(args: Endofunction[com.pulumi.aws.route53.inputs.GetRecordsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetRecordsResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetRecordsArgs.builder
      com.pulumi.aws.route53.Route53Functions.getRecords(args(argsBuilder).build)

    /** Use this data source to get the details of resource records in a Route 53 hosted zone. */
    def getRecordsPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetRecordsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetRecordsResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetRecordsPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getRecordsPlain(args(argsBuilder).build)

    /**
     * `aws.route53.ResolverEndpoint` provides details about a specific Route53 Resolver Endpoint.
     *  
     *  This data source allows to find a list of IPaddresses associated with a specific Route53 Resolver Endpoint.
     */
    def getResolverEndpoint(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverEndpointArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetResolverEndpointResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverEndpointArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverEndpoint(args(argsBuilder).build)

    /**
     * `aws.route53.ResolverEndpoint` provides details about a specific Route53 Resolver Endpoint.
     *  
     *  This data source allows to find a list of IPaddresses associated with a specific Route53 Resolver Endpoint.
     */
    def getResolverEndpointPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverEndpointPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetResolverEndpointResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverEndpointPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverEndpointPlain(args(argsBuilder).build)

    /**
     * `aws.route53.ResolverFirewallConfig` provides details about a specific a Route 53 Resolver DNS Firewall config.
     *  
     *  This data source allows to find a details about a specific a Route 53 Resolver DNS Firewall config.
     */
    def getResolverFirewallConfig(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverFirewallConfigArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetResolverFirewallConfigResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverFirewallConfigArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverFirewallConfig(args(argsBuilder).build)

    /**
     * `aws.route53.ResolverFirewallConfig` provides details about a specific a Route 53 Resolver DNS Firewall config.
     *  
     *  This data source allows to find a details about a specific a Route 53 Resolver DNS Firewall config.
     */
    def getResolverFirewallConfigPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverFirewallConfigPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetResolverFirewallConfigResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverFirewallConfigPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverFirewallConfigPlain(args(argsBuilder).build)

    /**
     * `aws.route53.ResolverFirewallDomainList` Retrieves the specified firewall domain list.
     *  
     *  This data source allows to retrieve details about a specific a Route 53 Resolver DNS Firewall domain list.
     */
    def getResolverFirewallDomainList(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverFirewallDomainListArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetResolverFirewallDomainListResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverFirewallDomainListArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverFirewallDomainList(args(argsBuilder).build)

    /**
     * `aws.route53.ResolverFirewallDomainList` Retrieves the specified firewall domain list.
     *  
     *  This data source allows to retrieve details about a specific a Route 53 Resolver DNS Firewall domain list.
     */
    def getResolverFirewallDomainListPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverFirewallDomainListPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetResolverFirewallDomainListResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverFirewallDomainListPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverFirewallDomainListPlain(args(argsBuilder).build)

    /**
     * `aws.route53.ResolverFirewallRuleGroup` Retrieves the specified firewall rule group.
     *  
     *  This data source allows to retrieve details about a specific a Route 53 Resolver DNS Firewall rule group.
     */
    def getResolverFirewallRuleGroup(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverFirewallRuleGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetResolverFirewallRuleGroupResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverFirewallRuleGroupArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverFirewallRuleGroup(args(argsBuilder).build)

    /**
     * `aws.route53.ResolverFirewallRuleGroup` Retrieves the specified firewall rule group.
     *  
     *  This data source allows to retrieve details about a specific a Route 53 Resolver DNS Firewall rule group.
     */
    def getResolverFirewallRuleGroupPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverFirewallRuleGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetResolverFirewallRuleGroupResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverFirewallRuleGroupPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverFirewallRuleGroupPlain(args(argsBuilder).build)

    /**
     * `aws.route53.ResolverFirewallRuleGroupAssociation` Retrieves the specified firewall rule group association.
     *  
     *  This data source allows to retrieve details about a specific a Route 53 Resolver DNS Firewall rule group association.
     */
    def getResolverFirewallRuleGroupAssociation(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverFirewallRuleGroupAssociationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetResolverFirewallRuleGroupAssociationResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverFirewallRuleGroupAssociationArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverFirewallRuleGroupAssociation(args(argsBuilder).build)

    /**
     * `aws.route53.ResolverFirewallRuleGroupAssociation` Retrieves the specified firewall rule group association.
     *  
     *  This data source allows to retrieve details about a specific a Route 53 Resolver DNS Firewall rule group association.
     */
    def getResolverFirewallRuleGroupAssociationPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverFirewallRuleGroupAssociationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetResolverFirewallRuleGroupAssociationResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverFirewallRuleGroupAssociationPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverFirewallRuleGroupAssociationPlain(args(argsBuilder).build)

    /** `aws.route53.getResolverFirewallRules` Provides details about rules in a specific Route53 Resolver Firewall rule group. */
    def getResolverFirewallRules(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverFirewallRulesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetResolverFirewallRulesResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverFirewallRulesArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverFirewallRules(args(argsBuilder).build)

    /** `aws.route53.getResolverFirewallRules` Provides details about rules in a specific Route53 Resolver Firewall rule group. */
    def getResolverFirewallRulesPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverFirewallRulesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetResolverFirewallRulesResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverFirewallRulesPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverFirewallRulesPlain(args(argsBuilder).build)

    /** `aws.route53.ResolverRule` provides details about a specific Route53 Resolver rule. */
    def getResolverRule(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverRuleArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetResolverRuleResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverRuleArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverRule(args(argsBuilder).build)

    /** `aws.route53.ResolverRule` provides details about a specific Route53 Resolver rule. */
    def getResolverRulePlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverRulePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetResolverRuleResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverRulePlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverRulePlain(args(argsBuilder).build)

    /** `aws.route53.getResolverRules` provides details about a set of Route53 Resolver rules. */
    def getResolverRules(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverRulesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetResolverRulesResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverRulesArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverRules(args(argsBuilder).build)

    /** `aws.route53.getResolverRules` provides details about a set of Route53 Resolver rules. */
    def getResolverRulesPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverRulesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetResolverRulesResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverRulesPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverRulesPlain(args(argsBuilder).build)

    /** Generates an Route53 traffic policy document in JSON format for use with resources that expect policy documents such as `aws.route53.TrafficPolicy`. */
    def getTrafficPolicyDocument(args: Endofunction[com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetTrafficPolicyDocumentResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentArgs.builder
      com.pulumi.aws.route53.Route53Functions.getTrafficPolicyDocument(args(argsBuilder).build)

    /** Generates an Route53 traffic policy document in JSON format for use with resources that expect policy documents such as `aws.route53.TrafficPolicy`. */
    def getTrafficPolicyDocumentPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetTrafficPolicyDocumentResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getTrafficPolicyDocumentPlain(args(argsBuilder).build)

    /**
     * `aws.route53.Zone` provides details about a specific Route 53 Hosted Zone.
     *  
     *  This data source allows to find a Hosted Zone ID given Hosted Zone name and certain search criteria.
     */
    def getZone(args: Endofunction[com.pulumi.aws.route53.inputs.GetZoneArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetZoneResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetZoneArgs.builder
      com.pulumi.aws.route53.Route53Functions.getZone(args(argsBuilder).build)

    /**
     * `aws.route53.Zone` provides details about a specific Route 53 Hosted Zone.
     *  
     *  This data source allows to find a Hosted Zone ID given Hosted Zone name and certain search criteria.
     */
    def getZonePlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetZonePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetZoneResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetZonePlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getZonePlain(args(argsBuilder).build)

  /**
   * Provides a Route53 query logging configuration resource.
   *  
   *  &gt; **NOTE:** There are restrictions on the configuration of query logging. Notably,
   *  the CloudWatch log group must be in the `us-east-1` region,
   *  a permissive CloudWatch log resource policy must be in place, and
   *  the Route53 hosted zone must be public.
   *  See [Configuring Logging for DNS Queries](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html?console_help=true#query-logs-configuring) for additional details.
   */
  def QueryLog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.QueryLogArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.route53.QueryLogArgs.builder
    
    com.pulumi.aws.route53.QueryLog(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Route 53 Resolver DNS Firewall rule resource. */
  def ResolverFirewallRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverFirewallRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ResolverFirewallRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.route53.ResolverFirewallRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages Route 53 Hosted Zone Domain Name System Security Extensions (DNSSEC). For more information about managing DNSSEC in Route 53, see the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec.html).
   *  
   *  !&gt; **WARNING:** If you disable DNSSEC signing for your hosted zone before the DNS changes have propagated, your domain could become unavailable on the internet. When you remove the DS records, you must wait until the longest TTL for the DS records that you remove has expired before you complete the step to disable DNSSEC signing. Please refer to the [Route 53 Developer Guide - Disable DNSSEC](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-disable.html) for a detailed breakdown on the steps required to disable DNSSEC safely for a hosted zone.
   *  
   *  &gt; **Note:** Route53 hosted zones are global resources, and as such any `aws.kms.Key` that you use as part of a signing key needs to be located in the `us-east-1` region. In the example below, the main AWS provider declaration is for `us-east-1`, however if you are provisioning your AWS resources in a different region, you will need to specify a provider alias and use that attached to the `aws.kms.Key` resource as described in the provider alias documentation.
   */
  def HostedZoneDnsSec(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.HostedZoneDnsSecArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.route53.HostedZoneDnsSecArgs.builder
    
    com.pulumi.aws.route53.HostedZoneDnsSec(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Route53 CIDR location resource. */
  def CidrLocation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.CidrLocationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.CidrLocationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.route53.CidrLocation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Route53 Resolver rule. */
  def ResolverRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ResolverRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.route53.ResolverRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.route53.ProfilesResourceAssociationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.route53.inputs.ProfilesResourceAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.route53.ProfilesResourceAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.ProfilesResourceAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53.ProfilesProfileArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.route53.inputs.ProfilesProfileTimeoutsArgs.Builder]):
        com.pulumi.aws.route53.ProfilesProfileArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.ProfilesProfileTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Manages a Route53 Traffic Policy. */
  def TrafficPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.TrafficPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.TrafficPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.route53.TrafficPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Route 53 Profiles Association. */
  def ProfilesAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.ProfilesAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ProfilesAssociationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.route53.ProfilesAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Route 53 Resolver DNS Firewall domain list resource. */
  def ResolverFirewallDomainList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverFirewallDomainListArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ResolverFirewallDomainListArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.route53.ResolverFirewallDomainList(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Route53 Resolver rule association. */
  def ResolverRuleAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverRuleAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ResolverRuleAssociationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.route53.ResolverRuleAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Route 53 Profile. */
  def ProfilesProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.ProfilesProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ProfilesProfileArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.route53.ProfilesProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Route53 Hosted Zone VPC association. VPC associations can only be made on private zones. See the `aws.route53.VpcAssociationAuthorization` resource for setting up cross-account associations.
   *  
   *  &gt; **NOTE:** Unless explicit association ordering is required (e.g., a separate cross-account association authorization), usage of this resource is not recommended. Use the `vpc` configuration blocks available within the `aws.route53.Zone` resource instead.
   *  
   *  &gt; **NOTE:** This provider provides both this standalone Zone VPC Association resource and exclusive VPC associations defined in-line in the `aws.route53.Zone` resource via `vpc` configuration blocks. At this time, you cannot use those in-line VPC associations in conjunction with this resource and the same zone ID otherwise it will cause a perpetual difference in plan output. You can optionally use [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) in the `aws.route53.Zone` resource to manage additional associations via this resource.
   */
  def ZoneAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.ZoneAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.route53.ZoneAssociationArgs.builder
    
    com.pulumi.aws.route53.ZoneAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.route53.ProfilesAssociationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.route53.inputs.ProfilesAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.route53.ProfilesAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.ProfilesAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Provides a Route 53 Resolver query logging configuration resource. */
  def ResolverQueryLogConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverQueryLogConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ResolverQueryLogConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.route53.ResolverQueryLogConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Route 53 Key Signing Key. To manage Domain Name System Security Extensions (DNSSEC) for a Hosted Zone, see the `aws.route53.HostedZoneDnsSec` resource. For more information about managing DNSSEC in Route 53, see the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec.html). */
  def KeySigningKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.KeySigningKeyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.KeySigningKeyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.route53.KeySigningKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Route 53 Resolver DNS Firewall config resource. */
  def ResolverFirewallConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverFirewallConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.route53.ResolverFirewallConfigArgs.builder
    
    com.pulumi.aws.route53.ResolverFirewallConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.route53.ZoneArgs.Builder)
    /**
     * @param vpcs Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegationSetId` argument in this resource and any `aws.route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
     * @return builder
     */
    def vpcs(args: Endofunction[com.pulumi.aws.route53.inputs.ZoneVpcArgs.Builder]*):
        com.pulumi.aws.route53.ZoneArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.ZoneVpcArgs.builder
      builder.vpcs(args.map(_(argsBuilder).build)*)

  /** Provides a Route53 CIDR collection resource. */
  def CidrCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.CidrCollectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.CidrCollectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.route53.CidrCollection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Route53 health check. */
  def HealthCheck(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.HealthCheckArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.HealthCheckArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.route53.HealthCheck(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Route 53 Resolver endpoint resource. */
  def ResolverEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ResolverEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.route53.ResolverEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Route 53 Resolver config resource. */
  def ResolverConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.route53.ResolverConfigArgs.builder
    
    com.pulumi.aws.route53.ResolverConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Authorizes a VPC in a different account to be associated with a local Route53 Hosted Zone. */
  def VpcAssociationAuthorization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.VpcAssociationAuthorizationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.route53.VpcAssociationAuthorizationArgs.builder
    
    com.pulumi.aws.route53.VpcAssociationAuthorization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Route 53 Resolver DNS Firewall rule group resource. */
  def ResolverFirewallRuleGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverFirewallRuleGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ResolverFirewallRuleGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.route53.ResolverFirewallRuleGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Route 53 Resolver DNS Firewall rule group association resource. */
  def ResolverFirewallRuleGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverFirewallRuleGroupAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ResolverFirewallRuleGroupAssociationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.route53.ResolverFirewallRuleGroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Route53 traffic policy instance resource. */
  def TrafficPolicyInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.TrafficPolicyInstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.TrafficPolicyInstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.route53.TrafficPolicyInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Route 53 Resolver query logging configuration association resource. */
  def ResolverQueryLogConfigAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverQueryLogConfigAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.route53.ResolverQueryLogConfigAssociationArgs.builder
    
    com.pulumi.aws.route53.ResolverQueryLogConfigAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Route53 record resource. */
  def Record(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.RecordArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.RecordArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.route53.Record(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.route53.RecordsExclusiveArgs.Builder)
    /**
     * @param resourceRecordSets A list of all resource record sets associated with the hosted zone.
     *  See `resourceRecordSet` below.
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

  extension (builder: com.pulumi.aws.route53.RecordArgs.Builder)
    /**
     * @param aliases An alias block. Conflicts with `ttl` &amp; `records`.
     *  Documented below.
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

  /** Provides a [Route53 Delegation Set](https://docs.aws.amazon.com/Route53/latest/APIReference/API-actions-by-function.html#actions-by-function-reusable-delegation-sets) resource. */
  def DelegationSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.DelegationSetArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.route53.DelegationSetArgs.builder
    
    com.pulumi.aws.route53.DelegationSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Route53 Hosted Zone. For managing Domain Name System Security Extensions (DNSSEC), see the `aws.route53.KeySigningKey` and `aws.route53.HostedZoneDnsSec` resources. */
  def Zone(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.ZoneArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ZoneArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.route53.Zone(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.route53.ResolverEndpointArgs.Builder)
    /**
     * @param ipAddresses Subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
     *  to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
     * @return builder
     */
    def ipAddresses(args: Endofunction[com.pulumi.aws.route53.inputs.ResolverEndpointIpAddressArgs.Builder]*):
        com.pulumi.aws.route53.ResolverEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.ResolverEndpointIpAddressArgs.builder
      builder.ipAddresses(args.map(_(argsBuilder).build)*)

  /**
   * Resource for maintaining exclusive management of resource record sets defined in an AWS Route53 hosted zone.
   *  
   *  !&gt; This resource takes exclusive ownership over resource record sets defined in a hosted zone. This includes removal of record sets which are not explicitly configured. To prevent persistent drift, ensure any `aws.route53.Record` resources managed alongside this resource have an equivalent `resourceRecordSet` argument.
   *  
   *  &gt; Destruction of this resource means Terraform will no longer manage reconciliation of the configured resource record sets. It __will not__ delete the configured record sets from the hosted zone.
   *  
   *  &gt; The default `NS` and `SOA` records created during provisioning of the Route53 Zone __should not be included__ in this resource definition. Adding them will cause persistent drift as the read operation is explicitly configured to ignore writing them to state.
   */
  def RecordsExclusive(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53.RecordsExclusiveArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.route53.RecordsExclusiveArgs.builder
    
    com.pulumi.aws.route53.RecordsExclusive(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.route53.inputs.ZoneState.Builder)
    /**
     * @param vpcs Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegationSetId` argument in this resource and any `aws.route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
     * @return builder
     */
    def vpcs(args: Endofunction[com.pulumi.aws.route53.inputs.ZoneVpcArgs.Builder]*):
        com.pulumi.aws.route53.inputs.ZoneState.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.ZoneVpcArgs.builder
      builder.vpcs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53.inputs.ResolverEndpointState.Builder)
    /**
     * @param ipAddresses Subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
     *  to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
     * @return builder
     */
    def ipAddresses(args: Endofunction[com.pulumi.aws.route53.inputs.ResolverEndpointIpAddressArgs.Builder]*):
        com.pulumi.aws.route53.inputs.ResolverEndpointState.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.ResolverEndpointIpAddressArgs.builder
      builder.ipAddresses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53.inputs.GetQueryLogConfigArgs.Builder)
    /**
     * @param filters One or more name/value pairs to use as filters. There are
     *  several valid keys, for a full reference, check out
     *  [Route53resolver Filter value in the AWS API reference][1].
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.route53.inputs.GetQueryLogConfigFilterArgs.Builder]*):
        com.pulumi.aws.route53.inputs.GetQueryLogConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.GetQueryLogConfigFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetArgs.Builder)
    /**
     * @param aliasTarget Alias target block.
     *  See `aliasTarget` below.
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
     *  See `geolocation` below.
     * @return builder
     */
    def geolocation(args: Endofunction[com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetGeolocationArgs.Builder]):
        com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetGeolocationArgs.builder
      builder.geolocation(args(argsBuilder).build)

    /**
     * @param geoproximityLocation Geoproximity location block.
     *  See `geoproximityLocation` below.
     * @return builder
     */
    def geoproximityLocation(args: Endofunction[com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetGeoproximityLocationArgs.Builder]):
        com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetGeoproximityLocationArgs.builder
      builder.geoproximityLocation(args(argsBuilder).build)

    /**
     * @param resourceRecords Information about the resource records to act upon.
     *  See `resourceRecords` below.
     * @return builder
     */
    def resourceRecords(args: Endofunction[com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetResourceRecordArgs.Builder]*):
        com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetResourceRecordArgs.builder
      builder.resourceRecords(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53.inputs.GetResolverEndpointArgs.Builder)
    /**
     * @param filters One or more name/value pairs to use as filters. There are
     *  several valid keys, for a full reference, check out
     *  [Route53resolver Filter value in the AWS API reference][1].
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverEndpointFilterArgs.Builder]*):
        com.pulumi.aws.route53.inputs.GetResolverEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.GetResolverEndpointFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53.inputs.ProfilesResourceAssociationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.route53.inputs.ProfilesResourceAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.route53.inputs.ProfilesResourceAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.ProfilesResourceAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetGeoproximityLocationArgs.Builder)
    /**
     * @param coordinates Coordinates for a geoproximity resource record.
     *  See `coordinates` below.
     * @return builder
     */
    def coordinates(args: Endofunction[com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetGeoproximityLocationCoordinatesArgs.Builder]):
        com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetGeoproximityLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53.inputs.RecordsExclusiveResourceRecordSetGeoproximityLocationCoordinatesArgs.builder
      builder.coordinates(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53.inputs.RecordsExclusiveState.Builder)
    /**
     * @param resourceRecordSets A list of all resource record sets associated with the hosted zone.
     *  See `resourceRecordSet` below.
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

  extension (builder: com.pulumi.aws.route53.inputs.ResolverRuleState.Builder)
    /**
     * @param targetIps Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
     *  This argument should only be specified for `FORWARD` type rules.
     * @return builder
     */
    def targetIps(args: Endofunction[com.pulumi.aws.route53.inputs.ResolverRuleTargetIpArgs.Builder]*):
        com.pulumi.aws.route53.inputs.ResolverRuleState.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.ResolverRuleTargetIpArgs.builder
      builder.targetIps(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.route53.inputs.RecordState.Builder)
    /**
     * @param aliases An alias block. Conflicts with `ttl` &amp; `records`.
     *  Documented below.
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

  extension (builder: com.pulumi.aws.route53.inputs.RecordGeoproximityRoutingPolicyArgs.Builder)
    /**
     * @param coordinates Specify `latitude` and `longitude` for routing traffic to non-AWS resources.
     * @return builder
     */
    def coordinates(args: Endofunction[com.pulumi.aws.route53.inputs.RecordGeoproximityRoutingPolicyCoordinateArgs.Builder]*):
        com.pulumi.aws.route53.inputs.RecordGeoproximityRoutingPolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53.inputs.RecordGeoproximityRoutingPolicyCoordinateArgs.builder
      builder.coordinates(args.map(_(argsBuilder).build)*)

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
