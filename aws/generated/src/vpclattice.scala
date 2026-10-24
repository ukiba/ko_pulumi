package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object vpclattice:
  /** Resource for managing an AWS VPC Lattice Service Network or Service Access log subscription. */
  def AccessLogSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.AccessLogSubscriptionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.AccessLogSubscriptionArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.vpclattice.AccessLogSubscription(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS VPC Lattice Auth Policy. */
  def AuthPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.AuthPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.vpclattice.AuthPolicyArgs.builder
    com.pulumi.aws.vpclattice.AuthPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for managing an AWS VPC Lattice Domain Verification.
   * 
   * Starts the domain verification process for a custom domain name. Use this resource to verify ownership of a domain before associating it with VPC Lattice resources.
   */
  def DomainVerification(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.DomainVerificationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.DomainVerificationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.vpclattice.DomainVerification(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS VPC Lattice Listener. */
  def Listener(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.ListenerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.ListenerArgs.builder
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
    com.pulumi.aws.vpclattice.Listener(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS VPC Lattice Listener Rule. */
  def ListenerRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.ListenerRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.ListenerRuleArgs.builder
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
    com.pulumi.aws.vpclattice.ListenerRule(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS VPC Lattice Resource Configuration. */
  def ResourceConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.ResourceConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.ResourceConfigurationArgs.builder
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
    com.pulumi.aws.vpclattice.ResourceConfiguration(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS VPC Lattice Resource Gateway. */
  def ResourceGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.ResourceGatewayArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.ResourceGatewayArgs.builder
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
    com.pulumi.aws.vpclattice.ResourceGateway(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS VPC Lattice Resource Policy. */
  def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.ResourcePolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.vpclattice.ResourcePolicyArgs.builder
    com.pulumi.aws.vpclattice.ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS VPC Lattice Service. */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.ServiceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.ServiceArgs.builder
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
    com.pulumi.aws.vpclattice.Service(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS VPC Lattice Service Network. */
  def ServiceNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.ServiceNetworkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.ServiceNetworkArgs.builder
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
    com.pulumi.aws.vpclattice.ServiceNetwork(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS VPC Lattice Service Network Resource Association. */
  def ServiceNetworkResourceAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.ServiceNetworkResourceAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.ServiceNetworkResourceAssociationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.vpclattice.ServiceNetworkResourceAssociation(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS VPC Lattice Service Network Service Association. */
  def ServiceNetworkServiceAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.ServiceNetworkServiceAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.ServiceNetworkServiceAssociationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.vpclattice.ServiceNetworkServiceAssociation(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS VPC Lattice Service Network VPC Association. */
  def ServiceNetworkVpcAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.ServiceNetworkVpcAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.ServiceNetworkVpcAssociationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.vpclattice.ServiceNetworkVpcAssociation(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS VPC Lattice Target Group. */
  def TargetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.TargetGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.TargetGroupArgs.builder
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
    com.pulumi.aws.vpclattice.TargetGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides the ability to register a target with an AWS VPC Lattice Target Group. */
  def TargetGroupAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.TargetGroupAttachmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.vpclattice.TargetGroupAttachmentArgs.builder
    com.pulumi.aws.vpclattice.TargetGroupAttachment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object VpclatticeFunctions:
    /** Data source for managing an AWS VPC Lattice Auth Policy. */
    inline def getAuthPolicy(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetAuthPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.vpclattice.outputs.GetAuthPolicyResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetAuthPolicyArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getAuthPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS VPC Lattice Auth Policy. */
    inline def getAuthPolicyPlain(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetAuthPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.vpclattice.outputs.GetAuthPolicyResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetAuthPolicyPlainArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getAuthPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS VPC Lattice Listener. */
    inline def getListener(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetListenerArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.vpclattice.outputs.GetListenerResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetListenerArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getListener(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS VPC Lattice Listener. */
    inline def getListenerPlain(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetListenerPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.vpclattice.outputs.GetListenerResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetListenerPlainArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getListenerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS VPC Lattice Resource Policy. */
    inline def getResourcePolicy(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetResourcePolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.vpclattice.outputs.GetResourcePolicyResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetResourcePolicyArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getResourcePolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS VPC Lattice Resource Policy. */
    inline def getResourcePolicyPlain(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetResourcePolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.vpclattice.outputs.GetResourcePolicyResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetResourcePolicyPlainArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getResourcePolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS VPC Lattice Service. */
    inline def getService(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetServiceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.vpclattice.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetServiceArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getService(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS VPC Lattice Service. */
    inline def getServicePlain(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetServicePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.vpclattice.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetServicePlainArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getServicePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS VPC Lattice Service Network. */
    inline def getServiceNetwork(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetServiceNetworkArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.vpclattice.outputs.GetServiceNetworkResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetServiceNetworkArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getServiceNetwork(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS VPC Lattice Service Network. */
    inline def getServiceNetworkPlain(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetServiceNetworkPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.vpclattice.outputs.GetServiceNetworkResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetServiceNetworkPlainArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getServiceNetworkPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for listing AWS VPC Lattice Service Network Service Associations. */
    inline def getServiceNetworkServiceAssociations(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetServiceNetworkServiceAssociationsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.vpclattice.outputs.GetServiceNetworkServiceAssociationsResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetServiceNetworkServiceAssociationsArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getServiceNetworkServiceAssociations(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for listing AWS VPC Lattice Service Network Service Associations. */
    inline def getServiceNetworkServiceAssociationsPlain(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetServiceNetworkServiceAssociationsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.vpclattice.outputs.GetServiceNetworkServiceAssociationsResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetServiceNetworkServiceAssociationsPlainArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getServiceNetworkServiceAssociationsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
