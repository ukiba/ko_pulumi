package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object privatedns:
  extension (builder: com.pulumi.azure.privatedns.ResolverInboundEndpointArgs.Builder)
    /**
     * @param ipConfigurations One `ipConfigurations` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def ipConfigurations(args: Endofunction[com.pulumi.azure.privatedns.inputs.ResolverInboundEndpointIpConfigurationsArgs.Builder]):
        com.pulumi.azure.privatedns.ResolverInboundEndpointArgs.Builder =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.ResolverInboundEndpointIpConfigurationsArgs.builder
      builder.ipConfigurations(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.privatedns.ResolverInboundEndpointArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Private DNS Resolver Virtual Network Link. */
  def ResolverVirtualNetworkLink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.privatedns.ResolverVirtualNetworkLinkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.privatedns.ResolverVirtualNetworkLinkArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.privatedns.ResolverVirtualNetworkLink(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Private DNS Resolver Dns Forwarding Ruleset. */
  def ResolverDnsForwardingRuleset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.privatedns.ResolverDnsForwardingRulesetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.privatedns.ResolverDnsForwardingRulesetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.privatedns.ResolverDnsForwardingRuleset(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.privatedns.TxtRecordArgs.Builder)
    /**
     * @param records One or more `record` blocks as defined below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.privatedns.inputs.TxtRecordRecordArgs.Builder]*):
        com.pulumi.azure.privatedns.TxtRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.privatedns.inputs.TxtRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.privatedns.TxtRecordArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages a Private Link Service.
   * 
   *  &gt; **Note:** Private Link is now in [GA](https://docs.microsoft.com/en-gb/azure/private-link/).
   */
  def LinkService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.privatedns.LinkServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.privatedns.LinkServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.privatedns.LinkService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.privatedns.LinkServiceArgs.Builder)
    /**
     * @param natIpConfigurations One or more (up to 8) `natIpConfiguration` block as defined below.
     * @return builder
     */
    def natIpConfigurations(args: Endofunction[com.pulumi.azure.privatedns.inputs.LinkServiceNatIpConfigurationArgs.Builder]*):
        com.pulumi.azure.privatedns.LinkServiceArgs.Builder =
      def argsBuilder = com.pulumi.azure.privatedns.inputs.LinkServiceNatIpConfigurationArgs.builder
      builder.natIpConfigurations(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.privatedns.LinkServiceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Private DNS Resolver. */
  def Resolver(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.privatedns.ResolverArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.privatedns.ResolverArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.privatedns.Resolver(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Private DNS Resolver Inbound Endpoint. */
  def ResolverInboundEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.privatedns.ResolverInboundEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.privatedns.ResolverInboundEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.privatedns.ResolverInboundEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.privatedns.ResolverForwardingRuleArgs.Builder)
    /**
     * @param targetDnsServers Can be specified multiple times to define multiple target DNS servers. Each `targetDnsServers` block as defined below.
     * @return builder
     */
    def targetDnsServers(args: Endofunction[com.pulumi.azure.privatedns.inputs.ResolverForwardingRuleTargetDnsServerArgs.Builder]*):
        com.pulumi.azure.privatedns.ResolverForwardingRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.privatedns.inputs.ResolverForwardingRuleTargetDnsServerArgs.builder
      builder.targetDnsServers(args.map(_(argsBuilder).build)*)

  /** Enables you to manage DNS CNAME Records within Azure Private DNS. */
  def CnameRecord(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.privatedns.CnameRecordArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.privatedns.CnameRecordArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.privatedns.CnameRecord(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Enables you to manage DNS AAAA Records within Azure Private DNS. */
  def AAAARecord(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.privatedns.AAAARecordArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.privatedns.AAAARecordArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.privatedns.AAAARecord(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.privatedns.SRVRecordArgs.Builder)
    /**
     * @param records One or more `record` blocks as defined below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.privatedns.inputs.SRVRecordRecordArgs.Builder]*):
        com.pulumi.azure.privatedns.SRVRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.privatedns.inputs.SRVRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.privatedns.SRVRecordArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.privatedns.ZoneArgs.Builder)
    /**
     * @param soaRecord An `soaRecord` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def soaRecord(args: Endofunction[com.pulumi.azure.privatedns.inputs.ZoneSoaRecordArgs.Builder]):
        com.pulumi.azure.privatedns.ZoneArgs.Builder =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.ZoneSoaRecordArgs.builder
      builder.soaRecord(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.privatedns.ZoneArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Private DNS Resolver Outbound Endpoint. */
  def ResolverOutboundEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.privatedns.ResolverOutboundEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.privatedns.ResolverOutboundEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.privatedns.ResolverOutboundEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Enables you to manage Private DNS zone Virtual Network Links. These Links enable DNS resolution and registration inside Azure Virtual Networks using Azure Private DNS. */
  def ZoneVirtualNetworkLink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.privatedns.ZoneVirtualNetworkLinkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.privatedns.ZoneVirtualNetworkLinkArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.privatedns.ZoneVirtualNetworkLink(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Enables you to manage DNS MX Records within Azure Private DNS. */
  def MxRecord(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.privatedns.MxRecordArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.privatedns.MxRecordArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.privatedns.MxRecord(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.privatedns.MxRecordArgs.Builder)
    /**
     * @param records One or more `record` blocks as defined below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.privatedns.inputs.MxRecordRecordArgs.Builder]*):
        com.pulumi.azure.privatedns.MxRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.privatedns.inputs.MxRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.privatedns.MxRecordArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Enables you to manage DNS A Records within Azure Private DNS. */
  def ARecord(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.privatedns.ARecordArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.privatedns.ARecordArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.privatedns.ARecord(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Private DNS Resolver Forwarding Rule. */
  def ResolverForwardingRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.privatedns.ResolverForwardingRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.privatedns.ResolverForwardingRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.privatedns.ResolverForwardingRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Enables you to manage DNS SRV Records within Azure Private DNS. */
  def SRVRecord(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.privatedns.SRVRecordArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.privatedns.SRVRecordArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.privatedns.SRVRecord(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Enables you to manage DNS PTR Records within Azure Private DNS. */
  def PTRRecord(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.privatedns.PTRRecordArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.privatedns.PTRRecordArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.privatedns.PTRRecord(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Enables you to manage DNS TXT Records within Azure Private DNS. */
  def TxtRecord(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.privatedns.TxtRecordArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.privatedns.TxtRecordArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.privatedns.TxtRecord(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type PrivatednsFunctions = com.pulumi.azure.privatedns.PrivatednsFunctions
  object PrivatednsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.privatedns.PrivatednsFunctions.*
  extension (self: PrivatednsFunctions.type)
    /**
     * Use this data source to access information about an existing Private DNS AAAA Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    def getAAAARecord(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetAAAARecordArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatedns.outputs.GetAAAARecordResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetAAAARecordArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getAAAARecord(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Private DNS AAAA Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    def getAAAARecordPlain(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetAAAARecordPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatedns.outputs.GetAAAARecordResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetAAAARecordPlainArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getAAAARecordPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Private DNS A Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    def getARecord(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetARecordArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatedns.outputs.GetARecordResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetARecordArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getARecord(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Private DNS A Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    def getARecordPlain(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetARecordPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatedns.outputs.GetARecordResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetARecordPlainArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getARecordPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Private DNS CNAME Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    def getCnameRecord(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetCnameRecordArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatedns.outputs.GetCnameRecordResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetCnameRecordArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getCnameRecord(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Private DNS CNAME Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    def getCnameRecordPlain(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetCnameRecordPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatedns.outputs.GetCnameRecordResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetCnameRecordPlainArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getCnameRecordPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Private DNS Zone. */
    def getDnsZone(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetDnsZoneArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatedns.outputs.GetDnsZoneResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetDnsZoneArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getDnsZone(args(argsBuilder).build)

    /** Use this data source to access information about an existing Private DNS Zone. */
    def getDnsZonePlain(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetDnsZonePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatedns.outputs.GetDnsZoneResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetDnsZonePlainArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getDnsZonePlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Private DNS MX Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    def getMxRecord(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetMxRecordArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatedns.outputs.GetMxRecordResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetMxRecordArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getMxRecord(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Private DNS MX Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    def getMxRecordPlain(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetMxRecordPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatedns.outputs.GetMxRecordResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetMxRecordPlainArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getMxRecordPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Private DNS PTR Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    def getPtrRecord(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetPtrRecordArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatedns.outputs.GetPtrRecordResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetPtrRecordArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getPtrRecord(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Private DNS PTR Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    def getPtrRecordPlain(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetPtrRecordPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatedns.outputs.GetPtrRecordResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetPtrRecordPlainArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getPtrRecordPlain(args(argsBuilder).build)

    /** Gets information about an existing Private DNS Resolver. */
    def getResolver(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetResolverArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatedns.outputs.GetResolverResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetResolverArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getResolver(args(argsBuilder).build)

    /** Gets information about an existing Private DNS Resolver. */
    def getResolverPlain(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetResolverPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatedns.outputs.GetResolverResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetResolverPlainArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getResolverPlain(args(argsBuilder).build)

    /** Gets information about an existing Private DNS Resolver Dns Forwarding Ruleset. */
    def getResolverDnsForwardingRuleset(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetResolverDnsForwardingRulesetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatedns.outputs.GetResolverDnsForwardingRulesetResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetResolverDnsForwardingRulesetArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getResolverDnsForwardingRuleset(args(argsBuilder).build)

    /** Gets information about an existing Private DNS Resolver Dns Forwarding Ruleset. */
    def getResolverDnsForwardingRulesetPlain(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetResolverDnsForwardingRulesetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatedns.outputs.GetResolverDnsForwardingRulesetResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetResolverDnsForwardingRulesetPlainArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getResolverDnsForwardingRulesetPlain(args(argsBuilder).build)

    /** Gets information about an existing Private DNS Resolver Forwarding Rule. */
    def getResolverForwardingRule(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetResolverForwardingRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatedns.outputs.GetResolverForwardingRuleResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetResolverForwardingRuleArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getResolverForwardingRule(args(argsBuilder).build)

    /** Gets information about an existing Private DNS Resolver Forwarding Rule. */
    def getResolverForwardingRulePlain(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetResolverForwardingRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatedns.outputs.GetResolverForwardingRuleResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetResolverForwardingRulePlainArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getResolverForwardingRulePlain(args(argsBuilder).build)

    /** Gets information about an existing Private DNS Resolver Inbound Endpoint. */
    def getResolverInboundEndpoint(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetResolverInboundEndpointArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatedns.outputs.GetResolverInboundEndpointResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetResolverInboundEndpointArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getResolverInboundEndpoint(args(argsBuilder).build)

    /** Gets information about an existing Private DNS Resolver Inbound Endpoint. */
    def getResolverInboundEndpointPlain(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetResolverInboundEndpointPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatedns.outputs.GetResolverInboundEndpointResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetResolverInboundEndpointPlainArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getResolverInboundEndpointPlain(args(argsBuilder).build)

    /** Gets information about an existing Private DNS Resolver Outbound Endpoint. */
    def getResolverOutboundEndpoint(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetResolverOutboundEndpointArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatedns.outputs.GetResolverOutboundEndpointResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetResolverOutboundEndpointArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getResolverOutboundEndpoint(args(argsBuilder).build)

    /** Gets information about an existing Private DNS Resolver Outbound Endpoint. */
    def getResolverOutboundEndpointPlain(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetResolverOutboundEndpointPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatedns.outputs.GetResolverOutboundEndpointResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetResolverOutboundEndpointPlainArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getResolverOutboundEndpointPlain(args(argsBuilder).build)

    /** Gets information about an existing Private DNS Resolver Virtual Network Link. */
    def getResolverVirtualNetworkLink(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetResolverVirtualNetworkLinkArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatedns.outputs.GetResolverVirtualNetworkLinkResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetResolverVirtualNetworkLinkArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getResolverVirtualNetworkLink(args(argsBuilder).build)

    /** Gets information about an existing Private DNS Resolver Virtual Network Link. */
    def getResolverVirtualNetworkLinkPlain(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetResolverVirtualNetworkLinkPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatedns.outputs.GetResolverVirtualNetworkLinkResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetResolverVirtualNetworkLinkPlainArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getResolverVirtualNetworkLinkPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Private DNS SOA Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    def getSoaRecord(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetSoaRecordArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatedns.outputs.GetSoaRecordResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetSoaRecordArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getSoaRecord(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Private DNS SOA Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    def getSoaRecordPlain(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetSoaRecordPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatedns.outputs.GetSoaRecordResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetSoaRecordPlainArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getSoaRecordPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Private DNS SRV Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    def getSrvRecord(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetSrvRecordArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatedns.outputs.GetSrvRecordResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetSrvRecordArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getSrvRecord(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Private DNS SRV Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    def getSrvRecordPlain(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetSrvRecordPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatedns.outputs.GetSrvRecordResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetSrvRecordPlainArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getSrvRecordPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Private DNS TXT Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    def getTxtRecord(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetTxtRecordArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatedns.outputs.GetTxtRecordResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetTxtRecordArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getTxtRecord(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Private DNS TXT Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    def getTxtRecordPlain(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetTxtRecordPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatedns.outputs.GetTxtRecordResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetTxtRecordPlainArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getTxtRecordPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Private DNS zone Virtual Network Link. These Links enable DNS resolution and registration inside Azure Virtual Networks using Azure Private DNS. */
    def getZoneVirtualNetworkLink(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetZoneVirtualNetworkLinkArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatedns.outputs.GetZoneVirtualNetworkLinkResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetZoneVirtualNetworkLinkArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getZoneVirtualNetworkLink(args(argsBuilder).build)

    /** Use this data source to access information about an existing Private DNS zone Virtual Network Link. These Links enable DNS resolution and registration inside Azure Virtual Networks using Azure Private DNS. */
    def getZoneVirtualNetworkLinkPlain(args: Endofunction[com.pulumi.azure.privatedns.inputs.GetZoneVirtualNetworkLinkPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatedns.outputs.GetZoneVirtualNetworkLinkResult] =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.GetZoneVirtualNetworkLinkPlainArgs.builder
      com.pulumi.azure.privatedns.PrivatednsFunctions.getZoneVirtualNetworkLinkPlain(args(argsBuilder).build)

  /** Enables you to manage Private DNS zones within Azure DNS. These zones are hosted on Azure&#39;s name servers. */
  def Zone(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.privatedns.ZoneArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.privatedns.ZoneArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.privatedns.Zone(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.privatedns.inputs.MxRecordState.Builder)
    /**
     * @param records One or more `record` blocks as defined below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.privatedns.inputs.MxRecordRecordArgs.Builder]*):
        com.pulumi.azure.privatedns.inputs.MxRecordState.Builder =
      def argsBuilder = com.pulumi.azure.privatedns.inputs.MxRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.privatedns.inputs.MxRecordState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.privatedns.inputs.ResolverInboundEndpointState.Builder)
    /**
     * @param ipConfigurations One `ipConfigurations` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def ipConfigurations(args: Endofunction[com.pulumi.azure.privatedns.inputs.ResolverInboundEndpointIpConfigurationsArgs.Builder]):
        com.pulumi.azure.privatedns.inputs.ResolverInboundEndpointState.Builder =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.ResolverInboundEndpointIpConfigurationsArgs.builder
      builder.ipConfigurations(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.privatedns.inputs.ResolverInboundEndpointState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.privatedns.inputs.ZoneState.Builder)
    /**
     * @param soaRecord An `soaRecord` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def soaRecord(args: Endofunction[com.pulumi.azure.privatedns.inputs.ZoneSoaRecordArgs.Builder]):
        com.pulumi.azure.privatedns.inputs.ZoneState.Builder =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.ZoneSoaRecordArgs.builder
      builder.soaRecord(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.privatedns.inputs.ZoneState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.privatedns.inputs.ResolverForwardingRuleState.Builder)
    /**
     * @param targetDnsServers Can be specified multiple times to define multiple target DNS servers. Each `targetDnsServers` block as defined below.
     * @return builder
     */
    def targetDnsServers(args: Endofunction[com.pulumi.azure.privatedns.inputs.ResolverForwardingRuleTargetDnsServerArgs.Builder]*):
        com.pulumi.azure.privatedns.inputs.ResolverForwardingRuleState.Builder =
      def argsBuilder = com.pulumi.azure.privatedns.inputs.ResolverForwardingRuleTargetDnsServerArgs.builder
      builder.targetDnsServers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.privatedns.inputs.SRVRecordState.Builder)
    /**
     * @param records One or more `record` blocks as defined below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.privatedns.inputs.SRVRecordRecordArgs.Builder]*):
        com.pulumi.azure.privatedns.inputs.SRVRecordState.Builder =
      def argsBuilder = com.pulumi.azure.privatedns.inputs.SRVRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.privatedns.inputs.SRVRecordState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.privatedns.inputs.LinkServiceState.Builder)
    /**
     * @param natIpConfigurations One or more (up to 8) `natIpConfiguration` block as defined below.
     * @return builder
     */
    def natIpConfigurations(args: Endofunction[com.pulumi.azure.privatedns.inputs.LinkServiceNatIpConfigurationArgs.Builder]*):
        com.pulumi.azure.privatedns.inputs.LinkServiceState.Builder =
      def argsBuilder = com.pulumi.azure.privatedns.inputs.LinkServiceNatIpConfigurationArgs.builder
      builder.natIpConfigurations(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.privatedns.inputs.LinkServiceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.privatedns.inputs.TxtRecordState.Builder)
    /**
     * @param records One or more `record` blocks as defined below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.privatedns.inputs.TxtRecordRecordArgs.Builder]*):
        com.pulumi.azure.privatedns.inputs.TxtRecordState.Builder =
      def argsBuilder = com.pulumi.azure.privatedns.inputs.TxtRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.privatedns.inputs.TxtRecordState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
