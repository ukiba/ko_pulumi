package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object paloalto:
  /** Manages a Palo Alto Networks Rulestack. */
  def LocalRulestack(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.LocalRulestackArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.LocalRulestackArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.paloalto.LocalRulestack(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Palo Alto Networks Rulestack Certificate. */
  def LocalRulestackCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.LocalRulestackCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.LocalRulestackCertificateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.paloalto.LocalRulestackCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Palo Alto Local Rulestack FQDN List. */
  def LocalRulestackFqdnList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.LocalRulestackFqdnListArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.LocalRulestackFqdnListArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.paloalto.LocalRulestackFqdnList(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Palo Alto Networks Rulestack Outbound Trust Certificate Association. */
  def LocalRulestackOutboundTrustCertificateAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.LocalRulestackOutboundTrustCertificateAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.paloalto.LocalRulestackOutboundTrustCertificateAssociationArgs.builder
    com.pulumi.azure.paloalto.LocalRulestackOutboundTrustCertificateAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Palo Alto Networks Rulestack Outbound Untrust Certificate Association. */
  def LocalRulestackOutboundUntrustCertificateAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.LocalRulestackOutboundUntrustCertificateAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.paloalto.LocalRulestackOutboundUntrustCertificateAssociationArgs.builder
    com.pulumi.azure.paloalto.LocalRulestackOutboundUntrustCertificateAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Palo Alto Local Rulestack Prefix List. */
  def LocalRulestackPrefixList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.LocalRulestackPrefixListArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.LocalRulestackPrefixListArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.paloalto.LocalRulestackPrefixList(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Palo Alto Local Rulestack Rule. */
  def LocalRulestackRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.LocalRulestackRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.LocalRulestackRuleArgs.builder
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
    com.pulumi.azure.paloalto.LocalRulestackRule(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Palo Alto Next Generation Firewall VHub Local Rulestack. */
  def NextGenerationFirewallVirtualHubLocalRulestack(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubLocalRulestackArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubLocalRulestackArgs.builder
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
    com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubLocalRulestack(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Palo Alto Next Generation Firewall VHub Panorama. */
  def NextGenerationFirewallVirtualHubPanorama(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubPanoramaArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubPanoramaArgs.builder
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
    com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubPanorama(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Palo Alto Next Generation Firewall Virtual Hub Strata Cloud Manager. */
  def NextGenerationFirewallVirtualHubStrataCloudManager(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubStrataCloudManagerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubStrataCloudManagerArgs.builder
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
    com.pulumi.azure.paloalto.NextGenerationFirewallVirtualHubStrataCloudManager(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Palo Alto Next Generation Firewall Deployed in a Virtual Network and configured via a Local Rulestack. */
  def NextGenerationFirewallVirtualNetworkLocalRulestack(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackArgs.builder
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
    com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestack(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Palo Alto Next Generation Firewall Virtual Network Panorama. */
  def NextGenerationFirewallVirtualNetworkPanorama(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkPanoramaArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkPanoramaArgs.builder
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
    com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkPanorama(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Palo Alto Next Generation Firewall Virtual Network Strata Cloud Manager. */
  def NextGenerationFirewallVirtualNetworkStrataCloudManager(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkStrataCloudManagerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkStrataCloudManagerArgs.builder
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
    com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkStrataCloudManager(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /** Manages a Palo Alto Network Virtual Appliance. */
  def VirtualNetworkAppliance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.paloalto.VirtualNetworkApplianceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.paloalto.VirtualNetworkApplianceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.paloalto.VirtualNetworkAppliance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
