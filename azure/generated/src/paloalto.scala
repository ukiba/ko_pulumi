package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object paloalto:
  /** Manages a Palo Alto Next Generation Firewall VHub Local Rulestack. */
  def NextGenerationFirewallVirtualHubLocalRulestack(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubLocalRulestackArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubLocalRulestackArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubLocalRulestack(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkStrataCloudManagerArgs.Builder)
    /**
     * @param destinationNats One or more `destinationNat` blocks as defined below.
     * @return builder
     */
    def destinationNats(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerDestinationNatArgs.Builder]*):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkStrataCloudManagerArgs.Builder =
      def argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerDestinationNatArgs.builder
      builder.destinationNats(args.map(_(argsBuilder).build)*)

    /**
     * @param dnsSettings A `dnsSettings` block as defined below.
     * @return builder
     */
    def dnsSettings(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerDnsSettingsArgs.Builder]):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkStrataCloudManagerArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerDnsSettingsArgs.builder
      builder.dnsSettings(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerIdentityArgs.Builder]):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkStrataCloudManagerArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below.
     * @return builder
     */
    def networkProfile(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerNetworkProfileArgs.Builder]):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkStrataCloudManagerArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkStrataCloudManagerArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  object PaloaltoFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Palo Alto Networks Rulestack. */
    inline def getLocalRulestack(args: Endofunction[com.pulumi.azure.paloalto.inputs.GetLocalRulestackArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.paloalto.outputs.GetLocalRulestackResult] =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.GetLocalRulestackArgs.builder
      com.pulumi.azure.paloalto.PaloaltoFunctions.getLocalRulestack(args(argsBuilder).build)

    /** Use this data source to access information about an existing Palo Alto Networks Rulestack. */
    inline def getLocalRulestackPlain(args: Endofunction[com.pulumi.azure.paloalto.inputs.GetLocalRulestackPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.paloalto.outputs.GetLocalRulestackResult] =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.GetLocalRulestackPlainArgs.builder
      com.pulumi.azure.paloalto.PaloaltoFunctions.getLocalRulestackPlain(args(argsBuilder).build)

  /** Manages a Palo Alto Next Generation Firewall Virtual Network Panorama. */
  def NextGenerationFirewallVirtualNetworkPanorama(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkPanoramaArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkPanoramaArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkPanorama(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Palo Alto Networks Rulestack Outbound Trust Certificate Association. */
  def LocalRulestackOutboundTrustCertificateAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.LocalRulestackOutboundTrustCertificateAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.paloalto.LocalRulestackOutboundTrustCertificateAssociationArgs.builder
    com.pulumi.azure.paloalto.LocalRulestackOutboundTrustCertificateAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Palo Alto Local Rulestack Rule. */
  def LocalRulestackRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.LocalRulestackRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.LocalRulestackRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.paloalto.LocalRulestackRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Palo Alto Next Generation Firewall Virtual Network Strata Cloud Manager. */
  def NextGenerationFirewallVirtualNetworkStrataCloudManager(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkStrataCloudManagerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkStrataCloudManagerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkStrataCloudManager(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Palo Alto Networks Rulestack. */
  def LocalRulestack(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.LocalRulestackArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.LocalRulestackArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.paloalto.LocalRulestack(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Palo Alto Networks Rulestack Certificate. */
  def LocalRulestackCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.LocalRulestackCertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.LocalRulestackCertificateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.paloalto.LocalRulestackCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackArgs.Builder)
    /**
     * @param destinationNats One or more `destinationNat` blocks as defined below.
     * @return builder
     */
    def destinationNats(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatArgs.Builder]*):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackArgs.Builder =
      def argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatArgs.builder
      builder.destinationNats(args.map(_(argsBuilder).build)*)

    /**
     * @param dnsSettings A `dnsSettings` block as defined below.
     * @return builder
     */
    def dnsSettings(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettingsArgs.Builder]):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettingsArgs.builder
      builder.dnsSettings(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below.
     * @return builder
     */
    def networkProfile(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileArgs.Builder]):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Palo Alto Network Virtual Appliance. */
  def VirtualNetworkAppliance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.VirtualNetworkApplianceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.VirtualNetworkApplianceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.paloalto.VirtualNetworkAppliance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Palo Alto Networks Rulestack Outbound Untrust Certificate Association. */
  def LocalRulestackOutboundUntrustCertificateAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.LocalRulestackOutboundUntrustCertificateAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.paloalto.LocalRulestackOutboundUntrustCertificateAssociationArgs.builder
    com.pulumi.azure.paloalto.LocalRulestackOutboundUntrustCertificateAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkPanoramaArgs.Builder)
    /**
     * @param destinationNats One or more `destinationNat` blocks as defined below.
     * @return builder
     */
    def destinationNats(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaDestinationNatArgs.Builder]*):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkPanoramaArgs.Builder =
      def argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaDestinationNatArgs.builder
      builder.destinationNats(args.map(_(argsBuilder).build)*)

    /**
     * @param dnsSettings A `dnsSettings` block as defined below.
     * @return builder
     */
    def dnsSettings(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaDnsSettingsArgs.Builder]):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkPanoramaArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaDnsSettingsArgs.builder
      builder.dnsSettings(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below.
     * @return builder
     */
    def networkProfile(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaNetworkProfileArgs.Builder]):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkPanoramaArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkPanoramaArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubStrataCloudManagerArgs.Builder)
    /**
     * @param destinationNats One or more `destinationNat` blocks as defined below.
     * @return builder
     */
    def destinationNats(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerDestinationNatArgs.Builder]*):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubStrataCloudManagerArgs.Builder =
      def argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerDestinationNatArgs.builder
      builder.destinationNats(args.map(_(argsBuilder).build)*)

    /**
     * @param dnsSettings A `dnsSettings` block as defined below.
     * @return builder
     */
    def dnsSettings(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerDnsSettingsArgs.Builder]):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubStrataCloudManagerArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerDnsSettingsArgs.builder
      builder.dnsSettings(args(argsBuilder).build)

    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerIdentityArgs.Builder]):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubStrataCloudManagerArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below.
     * @return builder
     */
    def networkProfile(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerNetworkProfileArgs.Builder]):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubStrataCloudManagerArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubStrataCloudManagerArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Palo Alto Next Generation Firewall Virtual Hub Strata Cloud Manager. */
  def NextGenerationFirewallVirtualHubStrataCloudManager(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubStrataCloudManagerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubStrataCloudManagerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubStrataCloudManager(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Palo Alto Local Rulestack Prefix List. */
  def LocalRulestackPrefixList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.LocalRulestackPrefixListArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.LocalRulestackPrefixListArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.paloalto.LocalRulestackPrefixList(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Palo Alto Next Generation Firewall VHub Panorama. */
  def NextGenerationFirewallVirtualHubPanorama(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubPanoramaArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubPanoramaArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubPanorama(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubPanoramaArgs.Builder)
    /**
     * @param destinationNats One or more `destinationNat` blocks as defined below.
     * @return builder
     */
    def destinationNats(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs.Builder]*):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubPanoramaArgs.Builder =
      def argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs.builder
      builder.destinationNats(args.map(_(argsBuilder).build)*)

    /**
     * @param dnsSettings A `dnsSettings` block as defined below.
     * @return builder
     */
    def dnsSettings(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaDnsSettingsArgs.Builder]):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubPanoramaArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaDnsSettingsArgs.builder
      builder.dnsSettings(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below.
     * @return builder
     */
    def networkProfile(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaNetworkProfileArgs.Builder]):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubPanoramaArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubPanoramaArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubLocalRulestackArgs.Builder)
    /**
     * @param destinationNats One or more `destinationNat` blocks as defined below.
     * @return builder
     */
    def destinationNats(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackDestinationNatArgs.Builder]*):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubLocalRulestackArgs.Builder =
      def argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackDestinationNatArgs.builder
      builder.destinationNats(args.map(_(argsBuilder).build)*)

    /**
     * @param dnsSettings A `dnsSettings` block as defined below.
     * @return builder
     */
    def dnsSettings(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackDnsSettingsArgs.Builder]):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubLocalRulestackArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackDnsSettingsArgs.builder
      builder.dnsSettings(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below.
     * @return builder
     */
    def networkProfile(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackNetworkProfileArgs.Builder]):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubLocalRulestackArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubLocalRulestackArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Palo Alto Next Generation Firewall Deployed in a Virtual Network and configured via a Local Rulestack. */
  def NextGenerationFirewallVirtualNetworkLocalRulestack(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestack(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.paloalto.LocalRulestackRuleArgs.Builder)
    /**
     * @param category A `category` block as defined below.
     * @return builder
     */
    def category(args: Endofunction[com.pulumi.azure.paloalto.inputs.LocalRulestackRuleCategoryArgs.Builder]):
        com.pulumi.azure.paloalto.LocalRulestackRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.LocalRulestackRuleCategoryArgs.builder
      builder.category(args(argsBuilder).build)

    /**
     * @param destination One or more `destination` blocks as defined below.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.azure.paloalto.inputs.LocalRulestackRuleDestinationArgs.Builder]):
        com.pulumi.azure.paloalto.LocalRulestackRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.LocalRulestackRuleDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param source One or more `source` blocks as defined below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.azure.paloalto.inputs.LocalRulestackRuleSourceArgs.Builder]):
        com.pulumi.azure.paloalto.LocalRulestackRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.LocalRulestackRuleSourceArgs.builder
      builder.source(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.paloalto.LocalRulestackRuleArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaNetworkProfileArgs.Builder)
    /**
     * @param vnetConfiguration A `vnetConfiguration` block as defined below.
     * @return builder
     */
    def vnetConfiguration(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaNetworkProfileVnetConfigurationArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaNetworkProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaNetworkProfileVnetConfigurationArgs.builder
      builder.vnetConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerNetworkProfileArgs.Builder)
    /**
     * @param vnetConfiguration A `vnetConfiguration` block as defined below.
     * @return builder
     */
    def vnetConfiguration(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerNetworkProfileVnetConfigurationArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerNetworkProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerNetworkProfileVnetConfigurationArgs.builder
      builder.vnetConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackDestinationNatArgs.Builder)
    /**
     * @param backendConfig A `backendConfig` block as defined above.
     * @return builder
     */
    def backendConfig(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfigArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackDestinationNatArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfigArgs.builder
      builder.backendConfig(args(argsBuilder).build)

    /**
     * @param frontendConfig A `frontendConfig` block as defined below.
     * @return builder
     */
    def frontendConfig(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackDestinationNatArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs.builder
      builder.frontendConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackState.Builder)
    /**
     * @param destinationNats One or more `destinationNat` blocks as defined below.
     * @return builder
     */
    def destinationNats(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatArgs.Builder]*):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackState.Builder =
      def argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatArgs.builder
      builder.destinationNats(args.map(_(argsBuilder).build)*)

    /**
     * @param dnsSettings A `dnsSettings` block as defined below.
     * @return builder
     */
    def dnsSettings(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettingsArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackState.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettingsArgs.builder
      builder.dnsSettings(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below.
     * @return builder
     */
    def networkProfile(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackState.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaState.Builder)
    /**
     * @param destinationNats One or more `destinationNat` blocks as defined below.
     * @return builder
     */
    def destinationNats(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaDestinationNatArgs.Builder]*):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaState.Builder =
      def argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaDestinationNatArgs.builder
      builder.destinationNats(args.map(_(argsBuilder).build)*)

    /**
     * @param dnsSettings A `dnsSettings` block as defined below.
     * @return builder
     */
    def dnsSettings(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaDnsSettingsArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaState.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaDnsSettingsArgs.builder
      builder.dnsSettings(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below.
     * @return builder
     */
    def networkProfile(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaNetworkProfileArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaState.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

    /**
     * @param panoramas A `panorama` block as defined below.
     * @return builder
     */
    def panoramas(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaPanoramaArgs.Builder]*):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaState.Builder =
      def argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaPanoramaArgs.builder
      builder.panoramas(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerState.Builder)
    /**
     * @param destinationNats One or more `destinationNat` blocks as defined below.
     * @return builder
     */
    def destinationNats(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerDestinationNatArgs.Builder]*):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerState.Builder =
      def argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerDestinationNatArgs.builder
      builder.destinationNats(args.map(_(argsBuilder).build)*)

    /**
     * @param dnsSettings A `dnsSettings` block as defined below.
     * @return builder
     */
    def dnsSettings(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerDnsSettingsArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerState.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerDnsSettingsArgs.builder
      builder.dnsSettings(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerIdentityArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerState.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below.
     * @return builder
     */
    def networkProfile(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerNetworkProfileArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerState.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerState.Builder)
    /**
     * @param destinationNats One or more `destinationNat` blocks as defined below.
     * @return builder
     */
    def destinationNats(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerDestinationNatArgs.Builder]*):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerState.Builder =
      def argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerDestinationNatArgs.builder
      builder.destinationNats(args.map(_(argsBuilder).build)*)

    /**
     * @param dnsSettings A `dnsSettings` block as defined below.
     * @return builder
     */
    def dnsSettings(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerDnsSettingsArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerState.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerDnsSettingsArgs.builder
      builder.dnsSettings(args(argsBuilder).build)

    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerIdentityArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerState.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below.
     * @return builder
     */
    def networkProfile(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerNetworkProfileArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerState.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaState.Builder)
    /**
     * @param destinationNats One or more `destinationNat` blocks as defined below.
     * @return builder
     */
    def destinationNats(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs.Builder]*):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaState.Builder =
      def argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs.builder
      builder.destinationNats(args.map(_(argsBuilder).build)*)

    /**
     * @param dnsSettings A `dnsSettings` block as defined below.
     * @return builder
     */
    def dnsSettings(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaDnsSettingsArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaState.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaDnsSettingsArgs.builder
      builder.dnsSettings(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below.
     * @return builder
     */
    def networkProfile(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaNetworkProfileArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaState.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

    def panoramas(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaPanoramaArgs.Builder]*):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaState.Builder =
      def argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaPanoramaArgs.builder
      builder.panoramas(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerDestinationNatArgs.Builder)
    /**
     * @param backendConfig One or more `backendConfig` block as defined below.
     * @return builder
     */
    def backendConfig(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerDestinationNatBackendConfigArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerDestinationNatArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerDestinationNatBackendConfigArgs.builder
      builder.backendConfig(args(argsBuilder).build)

    /**
     * @param frontendConfig One or more `frontendConfig` block as defined below.
     * @return builder
     */
    def frontendConfig(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerDestinationNatFrontendConfigArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerDestinationNatArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkStrataCloudManagerDestinationNatFrontendConfigArgs.builder
      builder.frontendConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.paloalto.inputs.LocalRulestackRuleState.Builder)
    /**
     * @param category A `category` block as defined below.
     * @return builder
     */
    def category(args: Endofunction[com.pulumi.azure.paloalto.inputs.LocalRulestackRuleCategoryArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.LocalRulestackRuleState.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.LocalRulestackRuleCategoryArgs.builder
      builder.category(args(argsBuilder).build)

    /**
     * @param destination One or more `destination` blocks as defined below.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.azure.paloalto.inputs.LocalRulestackRuleDestinationArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.LocalRulestackRuleState.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.LocalRulestackRuleDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param source One or more `source` blocks as defined below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.azure.paloalto.inputs.LocalRulestackRuleSourceArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.LocalRulestackRuleState.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.LocalRulestackRuleSourceArgs.builder
      builder.source(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.paloalto.inputs.LocalRulestackRuleState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaDestinationNatArgs.Builder)
    /**
     * @param backendConfig A `backendConfig` block as defined above.
     * @return builder
     */
    def backendConfig(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaDestinationNatBackendConfigArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaDestinationNatArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaDestinationNatBackendConfigArgs.builder
      builder.backendConfig(args(argsBuilder).build)

    /**
     * @param frontendConfig A `frontendConfig` block as defined below.
     * @return builder
     */
    def frontendConfig(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaDestinationNatFrontendConfigArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaDestinationNatArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaDestinationNatFrontendConfigArgs.builder
      builder.frontendConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatArgs.Builder)
    /**
     * @param backendConfig A `backendConfig` block as defined above.
     * @return builder
     */
    def backendConfig(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatBackendConfigArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatBackendConfigArgs.builder
      builder.backendConfig(args(argsBuilder).build)

    /**
     * @param frontendConfig A `frontendConfig` block as defined below.
     * @return builder
     */
    def frontendConfig(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatFrontendConfigArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatFrontendConfigArgs.builder
      builder.frontendConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs.Builder)
    /**
     * @param backendConfig A `backendConfig` block as defined above.
     * @return builder
     */
    def backendConfig(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatBackendConfigArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatBackendConfigArgs.builder
      builder.backendConfig(args(argsBuilder).build)

    /**
     * @param frontendConfig A `frontendConfig` block as defined below.
     * @return builder
     */
    def frontendConfig(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatFrontendConfigArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatFrontendConfigArgs.builder
      builder.frontendConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerDestinationNatArgs.Builder)
    /**
     * @param backendConfig One or more `backendConfig` block as defined below.
     * @return builder
     */
    def backendConfig(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerDestinationNatBackendConfigArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerDestinationNatArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerDestinationNatBackendConfigArgs.builder
      builder.backendConfig(args(argsBuilder).build)

    /**
     * @param frontendConfig One or more `frontendConfig` block as defined below.
     * @return builder
     */
    def frontendConfig(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerDestinationNatFrontendConfigArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerDestinationNatArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubStrataCloudManagerDestinationNatFrontendConfigArgs.builder
      builder.frontendConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackState.Builder)
    /**
     * @param destinationNats One or more `destinationNat` blocks as defined below.
     * @return builder
     */
    def destinationNats(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackDestinationNatArgs.Builder]*):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackState.Builder =
      def argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackDestinationNatArgs.builder
      builder.destinationNats(args.map(_(argsBuilder).build)*)

    /**
     * @param dnsSettings A `dnsSettings` block as defined below.
     * @return builder
     */
    def dnsSettings(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackDnsSettingsArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackState.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackDnsSettingsArgs.builder
      builder.dnsSettings(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below.
     * @return builder
     */
    def networkProfile(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackNetworkProfileArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackState.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubLocalRulestackState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileArgs.Builder)
    /**
     * @param vnetConfiguration A `vnetConfiguration` block as defined below.
     * @return builder
     */
    def vnetConfiguration(args: Endofunction[com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileVnetConfigurationArgs.Builder]):
        com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileVnetConfigurationArgs.builder
      builder.vnetConfiguration(args(argsBuilder).build)

  /** Manages a Palo Alto Local Rulestack FQDN List. */
  def LocalRulestackFqdnList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.LocalRulestackFqdnListArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.LocalRulestackFqdnListArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.paloalto.LocalRulestackFqdnList(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
