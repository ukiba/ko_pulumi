package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object route53:
  /** Provides a Route53 CIDR collection resource. */
  def CidrCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.CidrCollectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.CidrCollectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.route53.CidrCollection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Route53 CIDR location resource. */
  def CidrLocation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.CidrLocationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.CidrLocationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.route53.CidrLocation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a [Route53 Delegation Set](https://docs.aws.amazon.com/Route53/latest/APIReference/API-actions-by-function.html#actions-by-function-reusable-delegation-sets) resource. */
  def DelegationSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.DelegationSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.route53.DelegationSetArgs.builder
    com.pulumi.aws.route53.DelegationSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Route53 health check. */
  def HealthCheck(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.HealthCheckArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.HealthCheckArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.route53.HealthCheck(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages Route 53 Hosted Zone DNS Security Extensions (DNSSEC). For more information about managing DNSSEC in Route 53, see the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec.html).
   * 
   * &gt; **WARNING:** If you disable DNSSEC signing for your hosted zone before the DNS changes have propagated, your domain could become unavailable on the internet. When you remove the DS records, you must wait until the longest TTL for the DS records that you remove has expired before you complete the step to disable DNSSEC signing. Please refer to the [Route 53 Developer Guide - Disable DNSSEC](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-disable.html) for a detailed breakdown on the steps required to disable DNSSEC safely for a hosted zone.
   * 
   * &gt; **Note:** Route53 hosted zones are global resources, and as such any `aws.kms.Key` that you use as part of a signing key needs to be located in the `us-east-1` region. In the example below, the main AWS provider declaration is for `us-east-1`, however if you are provisioning your AWS resources in a different region, you will need to specify a provider alias and use that attached to the `aws.kms.Key` resource as described in the provider alias documentation.
   */
  def HostedZoneDnsSec(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.HostedZoneDnsSecArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.route53.HostedZoneDnsSecArgs.builder
    com.pulumi.aws.route53.HostedZoneDnsSec(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Route 53 Key Signing Key. To manage DNS Security Extensions (DNSSEC) for a Hosted Zone, see the `aws.route53.HostedZoneDnsSec` resource. For more information about managing DNSSEC in Route 53, see the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec.html). */
  def KeySigningKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.KeySigningKeyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.KeySigningKeyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.route53.KeySigningKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS Route 53 Profiles Association. */
  def ProfilesAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.ProfilesAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ProfilesAssociationArgs.builder
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
    com.pulumi.aws.route53.ProfilesAssociation(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS Route 53 Profile. */
  def ProfilesProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.ProfilesProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ProfilesProfileArgs.builder
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
    com.pulumi.aws.route53.ProfilesProfile(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS Route 53 Profiles Resource Association. */
  def ProfilesResourceAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.ProfilesResourceAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ProfilesResourceAssociationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.route53.ProfilesResourceAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a Route53 query logging configuration resource.
   * 
   * &gt; **NOTE:** There are restrictions on the configuration of query logging. Notably,
   * the CloudWatch log group must be in the `us-east-1` region,
   * a permissive CloudWatch log resource policy must be in place, and
   * the Route53 hosted zone must be public.
   * See [Configuring Logging for DNS Queries](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html?console_help=true#query-logs-configuring) for additional details.
   */
  def QueryLog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.QueryLogArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.route53.QueryLogArgs.builder
    com.pulumi.aws.route53.QueryLog(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Route53 record resource. */
  def Record(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.RecordArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.RecordArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.route53.Record(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Resource for maintaining exclusive management of resource record sets defined in an AWS Route53 hosted zone.
   * 
   * &gt; This resource takes exclusive ownership over resource record sets defined in a hosted zone. This includes removal of record sets which are not explicitly configured. To prevent persistent drift, ensure any `aws.route53.Record` resources managed alongside this resource have an equivalent `resourceRecordSet` argument.
   * 
   * &gt; Destruction of this resource means Terraform will no longer manage reconciliation of the configured resource record sets. It __will not__ delete the configured record sets from the hosted zone.
   * 
   * &gt; The default `NS` and `SOA` records created during provisioning of the Route53 Zone __should not be included__ in this resource definition. Adding them will cause persistent drift as the read operation is explicitly configured to ignore writing them to state.
   */
  def RecordsExclusive(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.RecordsExclusiveArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.route53.RecordsExclusiveArgs.builder
    com.pulumi.aws.route53.RecordsExclusive(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Route 53 Resolver config resource. */
  def ResolverConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.route53.ResolverConfigArgs.builder
    com.pulumi.aws.route53.ResolverConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Route 53 Resolver DNSSEC config resource. */
  def ResolverDnsSecConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverDnsSecConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.route53.ResolverDnsSecConfigArgs.builder
    com.pulumi.aws.route53.ResolverDnsSecConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Route 53 Resolver endpoint resource. */
  def ResolverEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverEndpointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ResolverEndpointArgs.builder
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
    com.pulumi.aws.route53.ResolverEndpoint(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Route 53 Resolver DNS Firewall config resource. */
  def ResolverFirewallConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverFirewallConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.route53.ResolverFirewallConfigArgs.builder
    com.pulumi.aws.route53.ResolverFirewallConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Route 53 Resolver DNS Firewall domain list resource. */
  def ResolverFirewallDomainList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverFirewallDomainListArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ResolverFirewallDomainListArgs.builder
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
    com.pulumi.aws.route53.ResolverFirewallDomainList(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Route 53 Resolver DNS Firewall rule resource. */
  def ResolverFirewallRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverFirewallRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ResolverFirewallRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.route53.ResolverFirewallRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Route 53 Resolver DNS Firewall rule group resource. */
  def ResolverFirewallRuleGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverFirewallRuleGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ResolverFirewallRuleGroupArgs.builder
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
    com.pulumi.aws.route53.ResolverFirewallRuleGroup(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Route 53 Resolver DNS Firewall rule group association resource. */
  def ResolverFirewallRuleGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverFirewallRuleGroupAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ResolverFirewallRuleGroupAssociationArgs.builder
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
    com.pulumi.aws.route53.ResolverFirewallRuleGroupAssociation(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Route 53 Resolver query logging configuration resource. */
  def ResolverQueryLogConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverQueryLogConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ResolverQueryLogConfigArgs.builder
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
    com.pulumi.aws.route53.ResolverQueryLogConfig(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Route 53 Resolver query logging configuration association resource. */
  def ResolverQueryLogConfigAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverQueryLogConfigAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.route53.ResolverQueryLogConfigAssociationArgs.builder
    com.pulumi.aws.route53.ResolverQueryLogConfigAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Route53 Resolver rule. */
  def ResolverRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ResolverRuleArgs.builder
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
    com.pulumi.aws.route53.ResolverRule(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Route53 Resolver rule association. */
  def ResolverRuleAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.ResolverRuleAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ResolverRuleAssociationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.route53.ResolverRuleAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object Route53Functions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * `aws.route53.DelegationSet` provides details about a specific Route 53 Delegation Set.
     * 
     * This data source allows to find a list of name servers associated with a specific delegation set.
     */
    inline def getDelegationSet(args: Endofunction[com.pulumi.aws.route53.inputs.GetDelegationSetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetDelegationSetResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetDelegationSetArgs.builder
      com.pulumi.aws.route53.Route53Functions.getDelegationSet(args(argsBuilder).build)

    /**
     * `aws.route53.DelegationSet` provides details about a specific Route 53 Delegation Set.
     * 
     * This data source allows to find a list of name servers associated with a specific delegation set.
     */
    inline def getDelegationSetPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetDelegationSetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetDelegationSetResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetDelegationSetPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getDelegationSetPlain(args(argsBuilder).build)

    /** Provides details about an AWS Route 53 Profile. */
    inline def getProfilesProfile(args: Endofunction[com.pulumi.aws.route53.inputs.GetProfilesProfileArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetProfilesProfileResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetProfilesProfileArgs.builder
      com.pulumi.aws.route53.Route53Functions.getProfilesProfile(args(argsBuilder).build)

    /** Provides details about an AWS Route 53 Profile. */
    inline def getProfilesProfilePlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetProfilesProfilePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetProfilesProfileResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetProfilesProfilePlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getProfilesProfilePlain(args(argsBuilder).build)

    /** Data source for managing an AWS Route 53 Profiles. */
    inline def getProfilesProfiles(args: Endofunction[com.pulumi.aws.route53.inputs.GetProfilesProfilesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetProfilesProfilesResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetProfilesProfilesArgs.builder
      com.pulumi.aws.route53.Route53Functions.getProfilesProfiles(args(argsBuilder).build)

    /** Data source for managing an AWS Route 53 Profiles. */
    inline def getProfilesProfilesPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetProfilesProfilesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetProfilesProfilesResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetProfilesProfilesPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getProfilesProfilesPlain(args(argsBuilder).build)

    /** `aws.route53.ResolverQueryLogConfig` provides details about a specific Route53 Resolver Query Logging Configuration. */
    inline def getQueryLogConfig(args: Endofunction[com.pulumi.aws.route53.inputs.GetQueryLogConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetQueryLogConfigResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetQueryLogConfigArgs.builder
      com.pulumi.aws.route53.Route53Functions.getQueryLogConfig(args(argsBuilder).build)

    /** `aws.route53.ResolverQueryLogConfig` provides details about a specific Route53 Resolver Query Logging Configuration. */
    inline def getQueryLogConfigPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetQueryLogConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetQueryLogConfigResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetQueryLogConfigPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getQueryLogConfigPlain(args(argsBuilder).build)

    /** Use this data source to get the details of resource records in a Route 53 hosted zone. */
    inline def getRecords(args: Endofunction[com.pulumi.aws.route53.inputs.GetRecordsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetRecordsResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetRecordsArgs.builder
      com.pulumi.aws.route53.Route53Functions.getRecords(args(argsBuilder).build)

    /** Use this data source to get the details of resource records in a Route 53 hosted zone. */
    inline def getRecordsPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetRecordsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetRecordsResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetRecordsPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getRecordsPlain(args(argsBuilder).build)

    /**
     * `aws.route53.ResolverEndpoint` provides details about a specific Route53 Resolver Endpoint.
     * 
     * This data source allows to find a list of IPaddresses associated with a specific Route53 Resolver Endpoint.
     */
    inline def getResolverEndpoint(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverEndpointArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetResolverEndpointResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverEndpointArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverEndpoint(args(argsBuilder).build)

    /**
     * `aws.route53.ResolverEndpoint` provides details about a specific Route53 Resolver Endpoint.
     * 
     * This data source allows to find a list of IPaddresses associated with a specific Route53 Resolver Endpoint.
     */
    inline def getResolverEndpointPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverEndpointPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetResolverEndpointResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverEndpointPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverEndpointPlain(args(argsBuilder).build)

    /**
     * `aws.route53.ResolverFirewallConfig` provides details about a specific a Route 53 Resolver DNS Firewall config.
     * 
     * This data source allows to find a details about a specific a Route 53 Resolver DNS Firewall config.
     */
    inline def getResolverFirewallConfig(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverFirewallConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetResolverFirewallConfigResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverFirewallConfigArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverFirewallConfig(args(argsBuilder).build)

    /**
     * `aws.route53.ResolverFirewallConfig` provides details about a specific a Route 53 Resolver DNS Firewall config.
     * 
     * This data source allows to find a details about a specific a Route 53 Resolver DNS Firewall config.
     */
    inline def getResolverFirewallConfigPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverFirewallConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetResolverFirewallConfigResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverFirewallConfigPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverFirewallConfigPlain(args(argsBuilder).build)

    /**
     * `aws.route53.ResolverFirewallDomainList` Retrieves the specified firewall domain list.
     * 
     * This data source allows to retrieve details about a specific a Route 53 Resolver DNS Firewall domain list.
     */
    inline def getResolverFirewallDomainList(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverFirewallDomainListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetResolverFirewallDomainListResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverFirewallDomainListArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverFirewallDomainList(args(argsBuilder).build)

    /**
     * `aws.route53.ResolverFirewallDomainList` Retrieves the specified firewall domain list.
     * 
     * This data source allows to retrieve details about a specific a Route 53 Resolver DNS Firewall domain list.
     */
    inline def getResolverFirewallDomainListPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverFirewallDomainListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetResolverFirewallDomainListResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverFirewallDomainListPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverFirewallDomainListPlain(args(argsBuilder).build)

    /**
     * `aws.route53.ResolverFirewallRuleGroup` Retrieves the specified firewall rule group.
     * 
     * This data source allows to retrieve details about a specific a Route 53 Resolver DNS Firewall rule group.
     */
    inline def getResolverFirewallRuleGroup(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverFirewallRuleGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetResolverFirewallRuleGroupResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverFirewallRuleGroupArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverFirewallRuleGroup(args(argsBuilder).build)

    /**
     * `aws.route53.ResolverFirewallRuleGroup` Retrieves the specified firewall rule group.
     * 
     * This data source allows to retrieve details about a specific a Route 53 Resolver DNS Firewall rule group.
     */
    inline def getResolverFirewallRuleGroupPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverFirewallRuleGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetResolverFirewallRuleGroupResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverFirewallRuleGroupPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverFirewallRuleGroupPlain(args(argsBuilder).build)

    /**
     * `aws.route53.ResolverFirewallRuleGroupAssociation` Retrieves the specified firewall rule group association.
     * 
     * This data source allows to retrieve details about a specific a Route 53 Resolver DNS Firewall rule group association.
     */
    inline def getResolverFirewallRuleGroupAssociation(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverFirewallRuleGroupAssociationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetResolverFirewallRuleGroupAssociationResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverFirewallRuleGroupAssociationArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverFirewallRuleGroupAssociation(args(argsBuilder).build)

    /**
     * `aws.route53.ResolverFirewallRuleGroupAssociation` Retrieves the specified firewall rule group association.
     * 
     * This data source allows to retrieve details about a specific a Route 53 Resolver DNS Firewall rule group association.
     */
    inline def getResolverFirewallRuleGroupAssociationPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverFirewallRuleGroupAssociationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetResolverFirewallRuleGroupAssociationResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverFirewallRuleGroupAssociationPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverFirewallRuleGroupAssociationPlain(args(argsBuilder).build)

    /** `aws.route53.getResolverFirewallRules` Provides details about rules in a specific Route53 Resolver Firewall rule group. */
    inline def getResolverFirewallRules(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverFirewallRulesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetResolverFirewallRulesResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverFirewallRulesArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverFirewallRules(args(argsBuilder).build)

    /** `aws.route53.getResolverFirewallRules` Provides details about rules in a specific Route53 Resolver Firewall rule group. */
    inline def getResolverFirewallRulesPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverFirewallRulesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetResolverFirewallRulesResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverFirewallRulesPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverFirewallRulesPlain(args(argsBuilder).build)

    /** `aws.route53.ResolverRule` provides details about a specific Route53 Resolver rule. */
    inline def getResolverRule(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetResolverRuleResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverRuleArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverRule(args(argsBuilder).build)

    /** `aws.route53.ResolverRule` provides details about a specific Route53 Resolver rule. */
    inline def getResolverRulePlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetResolverRuleResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverRulePlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverRulePlain(args(argsBuilder).build)

    /** `aws.route53.getResolverRules` provides details about a set of Route53 Resolver rules. */
    inline def getResolverRules(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverRulesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetResolverRulesResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverRulesArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverRules(args(argsBuilder).build)

    /** `aws.route53.getResolverRules` provides details about a set of Route53 Resolver rules. */
    inline def getResolverRulesPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetResolverRulesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetResolverRulesResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetResolverRulesPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getResolverRulesPlain(args(argsBuilder).build)

    /** Generates an Route53 traffic policy document in JSON format for use with resources that expect policy documents such as `aws.route53.TrafficPolicy`. */
    inline def getTrafficPolicyDocument(args: Endofunction[com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetTrafficPolicyDocumentResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentArgs.builder
      com.pulumi.aws.route53.Route53Functions.getTrafficPolicyDocument(args(argsBuilder).build)

    /** Generates an Route53 traffic policy document in JSON format for use with resources that expect policy documents such as `aws.route53.TrafficPolicy`. */
    inline def getTrafficPolicyDocumentPlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetTrafficPolicyDocumentResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentPlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getTrafficPolicyDocumentPlain(args(argsBuilder).build)

    /**
     * `aws.route53.Zone` provides details about a specific Route 53 Hosted Zone.
     * 
     * This data source allows to find a Hosted Zone ID given Hosted Zone name and certain search criteria.
     */
    inline def getZone(args: Endofunction[com.pulumi.aws.route53.inputs.GetZoneArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.route53.outputs.GetZoneResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetZoneArgs.builder
      com.pulumi.aws.route53.Route53Functions.getZone(args(argsBuilder).build)

    /**
     * `aws.route53.Zone` provides details about a specific Route 53 Hosted Zone.
     * 
     * This data source allows to find a Hosted Zone ID given Hosted Zone name and certain search criteria.
     */
    inline def getZonePlain(args: Endofunction[com.pulumi.aws.route53.inputs.GetZonePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.route53.outputs.GetZoneResult] =
      val argsBuilder = com.pulumi.aws.route53.inputs.GetZonePlainArgs.builder
      com.pulumi.aws.route53.Route53Functions.getZonePlain(args(argsBuilder).build)

  /** Manages a Route53 Traffic Policy. */
  def TrafficPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.TrafficPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.TrafficPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.route53.TrafficPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Route53 traffic policy instance resource. */
  def TrafficPolicyInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.TrafficPolicyInstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.TrafficPolicyInstanceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.route53.TrafficPolicyInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Authorizes a VPC in a different account to be associated with a local Route53 Hosted Zone. */
  def VpcAssociationAuthorization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.VpcAssociationAuthorizationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.route53.VpcAssociationAuthorizationArgs.builder
    com.pulumi.aws.route53.VpcAssociationAuthorization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Route53 Hosted Zone. For managing DNS Security Extensions (DNSSEC), see the `aws.route53.KeySigningKey` and `aws.route53.HostedZoneDnsSec` resources. */
  def Zone(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.ZoneArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53.ZoneArgs.builder
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
    com.pulumi.aws.route53.Zone(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a Route53 Hosted Zone VPC association. VPC associations can only be made on private zones. See the `aws.route53.VpcAssociationAuthorization` resource for setting up cross-account associations.
   * 
   * &gt; **NOTE:** Unless explicit association ordering is required (e.g., a separate cross-account association authorization), usage of this resource is not recommended. Use the `vpc` configuration blocks available within the `aws.route53.Zone` resource instead.
   * 
   * &gt; **NOTE:** This provider provides both this standalone Zone VPC Association resource and exclusive VPC associations defined in-line in the `aws.route53.Zone` resource via `vpc` configuration blocks. At this time, you cannot use those in-line VPC associations in conjunction with this resource and the same zone ID otherwise it will cause a perpetual difference in plan output. You can optionally use [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) in the `aws.route53.Zone` resource to manage additional associations via this resource.
   */
  def ZoneAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.route53.ZoneAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.route53.ZoneAssociationArgs.builder
    com.pulumi.aws.route53.ZoneAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
