package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object networkfirewall:
  /** Manages an AWS Network Firewall Container Association. A container association links Amazon ECS or Amazon EKS clusters to Network Firewall, resolving container IP addresses into a dynamic IP set you can reference from stateful rule groups. */
  def ContainerAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkfirewall.ContainerAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkfirewall.ContainerAssociationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.networkfirewall.ContainerAssociation(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AWS Network Firewall Firewall Resource */
  def Firewall(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkfirewall.FirewallArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkfirewall.FirewallArgs.builder
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
    com.pulumi.aws.networkfirewall.Firewall(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AWS Network Firewall Firewall Policy Resource */
  def FirewallPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkfirewall.FirewallPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkfirewall.FirewallPolicyArgs.builder
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
    com.pulumi.aws.networkfirewall.FirewallPolicy(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS Network Firewall Firewall Transit Gateway Attachment Accepter.
   * 
   * When a cross-account (requester&#39;s AWS account differs from the accepter&#39;s AWS account) requester creates a Network Firewall with Transit Gateway ID using `aws.networkfirewall.Firewall`. Then an EC2 Transit Gateway VPC Attachment resource is automatically created in the accepter&#39;s account.
   * The accepter can use the `aws.networkfirewall.FirewallTransitGatewayAttachmentAccepter` resource to &#34;adopt&#34; its side of the connection into management.
   * 
   * &gt; **NOTE:** If the `transitGatewayId` argument in the `aws.networkfirewall.Firewall` resource is used to attach a firewall to a transit gateway in a cross-account setup (where **Auto accept shared attachments** is disabled), the resource will be considered created when the transit gateway attachment is in the *Pending Acceptance* state and the firewall is in the *Provisioning* status. At this point, you can use the `aws.networkfirewall.FirewallTransitGatewayAttachmentAccepter` resource to finalize the network firewall deployment. Once the transit gateway attachment reaches the *Available* state, the firewall status *Ready*.
   */
  def FirewallTransitGatewayAttachmentAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkfirewall.FirewallTransitGatewayAttachmentAccepterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.networkfirewall.FirewallTransitGatewayAttachmentAccepterArgs.builder
    com.pulumi.aws.networkfirewall.FirewallTransitGatewayAttachmentAccepter(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AWS Network Firewall Logging Configuration Resource */
  def LoggingConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkfirewall.LoggingConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.networkfirewall.LoggingConfigurationArgs.builder
    com.pulumi.aws.networkfirewall.LoggingConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object NetworkfirewallFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieve information about a firewall. */
    inline def getFirewall(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.GetFirewallArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.networkfirewall.outputs.GetFirewallResult] =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.GetFirewallArgs.builder
      com.pulumi.aws.networkfirewall.NetworkfirewallFunctions.getFirewall(args(argsBuilder).build)

    /** Retrieve information about a firewall. */
    inline def getFirewallPlain(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.GetFirewallPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkfirewall.outputs.GetFirewallResult] =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.GetFirewallPlainArgs.builder
      com.pulumi.aws.networkfirewall.NetworkfirewallFunctions.getFirewallPlain(args(argsBuilder).build)

    /** Retrieve information about a firewall policy. */
    inline def getFirewallPolicy(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.GetFirewallPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.networkfirewall.outputs.GetFirewallPolicyResult] =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.GetFirewallPolicyArgs.builder
      com.pulumi.aws.networkfirewall.NetworkfirewallFunctions.getFirewallPolicy(args(argsBuilder).build)

    /** Retrieve information about a firewall policy. */
    inline def getFirewallPolicyPlain(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.GetFirewallPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkfirewall.outputs.GetFirewallPolicyResult] =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.GetFirewallPolicyPlainArgs.builder
      com.pulumi.aws.networkfirewall.NetworkfirewallFunctions.getFirewallPolicyPlain(args(argsBuilder).build)

    /** Retrieve information about a Network Firewall resource policy. */
    inline def getResourcePolicy(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.GetResourcePolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.networkfirewall.outputs.GetResourcePolicyResult] =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.GetResourcePolicyArgs.builder
      com.pulumi.aws.networkfirewall.NetworkfirewallFunctions.getResourcePolicy(args(argsBuilder).build)

    /** Retrieve information about a Network Firewall resource policy. */
    inline def getResourcePolicyPlain(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.GetResourcePolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkfirewall.outputs.GetResourcePolicyResult] =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.GetResourcePolicyPlainArgs.builder
      com.pulumi.aws.networkfirewall.NetworkfirewallFunctions.getResourcePolicyPlain(args(argsBuilder).build)

  /** Provides an AWS Network Firewall Resource Policy Resource for a rule group or firewall policy. */
  def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkfirewall.ResourcePolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.networkfirewall.ResourcePolicyArgs.builder
    com.pulumi.aws.networkfirewall.ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AWS Network Firewall Rule Group Resource */
  def RuleGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkfirewall.RuleGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkfirewall.RuleGroupArgs.builder
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
    com.pulumi.aws.networkfirewall.RuleGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Network Firewall TLS Inspection Configuration. */
  def TlsInspectionConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkfirewall.TlsInspectionConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkfirewall.TlsInspectionConfigurationArgs.builder
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
    com.pulumi.aws.networkfirewall.TlsInspectionConfiguration(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a firewall endpoint for an AWS Network Firewall firewall.
   * 
   * Use `aws.networkfirewall.VpcEndpointAssociation` to establish new firewall endpoints in any Availability Zone where the firewall is already being used. The first use of a firewall in an Availability Zone must be defined by `aws.networkfirewall.Firewall` resource and `subnetMapping` argument.
   */
  def VpcEndpointAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkfirewall.VpcEndpointAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkfirewall.VpcEndpointAssociationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.networkfirewall.VpcEndpointAssociation(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
