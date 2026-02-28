package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object vpclattice:
  extension (builder: com.pulumi.aws.vpclattice.TargetGroupArgs.Builder)
    /**
     * @param config The target group configuration.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.aws.vpclattice.inputs.TargetGroupConfigArgs.Builder]):
        com.pulumi.aws.vpclattice.TargetGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.TargetGroupConfigArgs.builder
      builder.config(args(argsBuilder).build)

  type VpclatticeFunctions = com.pulumi.aws.vpclattice.VpclatticeFunctions
  object VpclatticeFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.vpclattice.VpclatticeFunctions.*
  extension (self: VpclatticeFunctions.type)
    /** Data source for managing an AWS VPC Lattice Auth Policy. */
    def getAuthPolicy(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetAuthPolicyArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.vpclattice.outputs.GetAuthPolicyResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetAuthPolicyArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getAuthPolicy(args(argsBuilder).build)

    /** Data source for managing an AWS VPC Lattice Auth Policy. */
    def getAuthPolicyPlain(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetAuthPolicyPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.vpclattice.outputs.GetAuthPolicyResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetAuthPolicyPlainArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getAuthPolicyPlain(args(argsBuilder).build)

    /** Data source for managing an AWS VPC Lattice Listener. */
    def getListener(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetListenerArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.vpclattice.outputs.GetListenerResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetListenerArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getListener(args(argsBuilder).build)

    /** Data source for managing an AWS VPC Lattice Listener. */
    def getListenerPlain(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetListenerPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.vpclattice.outputs.GetListenerResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetListenerPlainArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getListenerPlain(args(argsBuilder).build)

    /** Data source for managing an AWS VPC Lattice Resource Policy. */
    def getResourcePolicy(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetResourcePolicyArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.vpclattice.outputs.GetResourcePolicyResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetResourcePolicyArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getResourcePolicy(args(argsBuilder).build)

    /** Data source for managing an AWS VPC Lattice Resource Policy. */
    def getResourcePolicyPlain(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetResourcePolicyPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.vpclattice.outputs.GetResourcePolicyResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetResourcePolicyPlainArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getResourcePolicyPlain(args(argsBuilder).build)

    /** Data source for managing an AWS VPC Lattice Service. */
    def getService(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetServiceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.vpclattice.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetServiceArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getService(args(argsBuilder).build)

    /** Data source for managing an AWS VPC Lattice Service. */
    def getServicePlain(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetServicePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.vpclattice.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetServicePlainArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getServicePlain(args(argsBuilder).build)

    /** Data source for managing an AWS VPC Lattice Service Network. */
    def getServiceNetwork(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetServiceNetworkArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.vpclattice.outputs.GetServiceNetworkResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetServiceNetworkArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getServiceNetwork(args(argsBuilder).build)

    /** Data source for managing an AWS VPC Lattice Service Network. */
    def getServiceNetworkPlain(args: Endofunction[com.pulumi.aws.vpclattice.inputs.GetServiceNetworkPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.vpclattice.outputs.GetServiceNetworkResult] =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.GetServiceNetworkPlainArgs.builder
      com.pulumi.aws.vpclattice.VpclatticeFunctions.getServiceNetworkPlain(args(argsBuilder).build)

  /** Resource for managing an AWS VPC Lattice Resource Configuration. */
  def ResourceConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.ResourceConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.ResourceConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.vpclattice.ResourceConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides the ability to register a target with an AWS VPC Lattice Target Group. */
  def TargetGroupAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.TargetGroupAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.vpclattice.TargetGroupAttachmentArgs.builder
    
    com.pulumi.aws.vpclattice.TargetGroupAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS VPC Lattice Target Group. */
  def TargetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.TargetGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.TargetGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.vpclattice.TargetGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.vpclattice.ListenerRuleArgs.Builder)
    /**
     * @param action The action for the listener rule.
     *  See `action` Block for details.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleActionArgs.Builder]):
        com.pulumi.aws.vpclattice.ListenerRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param match The rule match.
     *  See `match` Block
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchArgs.Builder]):
        com.pulumi.aws.vpclattice.ListenerRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  /** Resource for managing an AWS VPC Lattice Service Network. */
  def ServiceNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.ServiceNetworkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.ServiceNetworkArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.vpclattice.ServiceNetwork(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.vpclattice.ServiceNetworkResourceAssociationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ServiceNetworkResourceAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpclattice.ServiceNetworkResourceAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ServiceNetworkResourceAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS VPC Lattice Service Network Resource Association. */
  def ServiceNetworkResourceAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.ServiceNetworkResourceAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.ServiceNetworkResourceAssociationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.vpclattice.ServiceNetworkResourceAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS VPC Lattice Resource Policy. */
  def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.ResourcePolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.vpclattice.ResourcePolicyArgs.builder
    
    com.pulumi.aws.vpclattice.ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.vpclattice.ResourceGatewayArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ResourceGatewayTimeoutsArgs.Builder]):
        com.pulumi.aws.vpclattice.ResourceGatewayArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ResourceGatewayTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.TargetGroupAttachmentArgs.Builder)
    /**
     * @param target The target.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.aws.vpclattice.inputs.TargetGroupAttachmentTargetArgs.Builder]):
        com.pulumi.aws.vpclattice.TargetGroupAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.TargetGroupAttachmentTargetArgs.builder
      builder.target(args(argsBuilder).build)

  /** Resource for managing an AWS VPC Lattice Service. */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.ServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.ServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.vpclattice.Service(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS VPC Lattice Service Network VPC Association. */
  def ServiceNetworkVpcAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.ServiceNetworkVpcAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.ServiceNetworkVpcAssociationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.vpclattice.ServiceNetworkVpcAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS VPC Lattice Service Network or Service Access log subscription. */
  def AccessLogSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.AccessLogSubscriptionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.AccessLogSubscriptionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.vpclattice.AccessLogSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS VPC Lattice Listener. */
  def Listener(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.ListenerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.ListenerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.vpclattice.Listener(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.vpclattice.ResourceConfigurationArgs.Builder)
    /**
     * @param resourceConfigurationDefinition Details of the Resource Configuration. See `resourceConfigurationDefinition` Block for details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def resourceConfigurationDefinition(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionArgs.Builder]):
        com.pulumi.aws.vpclattice.ResourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionArgs.builder
      builder.resourceConfigurationDefinition(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ResourceConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpclattice.ResourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ResourceConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS VPC Lattice Resource Gateway. */
  def ResourceGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.ResourceGatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.ResourceGatewayArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.vpclattice.ResourceGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.vpclattice.ListenerArgs.Builder)
    /**
     * @param defaultAction Default action block for the default listener rule. Default action blocks are defined below.
     * @return builder
     */
    def defaultAction(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionArgs.Builder]):
        com.pulumi.aws.vpclattice.ListenerArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionArgs.builder
      builder.defaultAction(args(argsBuilder).build)

  /** Resource for managing an AWS VPC Lattice Auth Policy. */
  def AuthPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.AuthPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.vpclattice.AuthPolicyArgs.builder
    
    com.pulumi.aws.vpclattice.AuthPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS VPC Lattice Service Network Service Association. */
  def ServiceNetworkServiceAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.ServiceNetworkServiceAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.ServiceNetworkServiceAssociationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.vpclattice.ServiceNetworkServiceAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ServiceNetworkResourceAssociationState.Builder)
    /**
     * @param dnsEntries DNS entry of the association in the service network.
     * @return builder
     */
    def dnsEntries(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ServiceNetworkResourceAssociationDnsEntryArgs.Builder]*):
        com.pulumi.aws.vpclattice.inputs.ServiceNetworkResourceAssociationState.Builder =
      def argsBuilder = com.pulumi.aws.vpclattice.inputs.ServiceNetworkResourceAssociationDnsEntryArgs.builder
      builder.dnsEntries(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ServiceNetworkResourceAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ServiceNetworkResourceAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ServiceNetworkResourceAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ListenerState.Builder)
    /**
     * @param defaultAction Default action block for the default listener rule. Default action blocks are defined below.
     * @return builder
     */
    def defaultAction(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ListenerState.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionArgs.builder
      builder.defaultAction(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ResourceGatewayState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ResourceGatewayTimeoutsArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ResourceGatewayState.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ResourceGatewayTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ListenerRuleActionForwardArgs.Builder)
    /**
     * @param targetGroups The target groups. Traffic matching the rule is forwarded to the specified target groups. With forward actions, you can assign a weight that controls the prioritization and selection of each target group. This means that requests are distributed to individual target groups based on their weights. For example, if two target groups have the same weight, each target group receives half of the traffic.
     *  
     *  The default value is 1 with maximum number of 2. If only one target group is provided, there is no need to set the weight; 100% of traffic will go to that target group.
     * @return builder
     */
    def targetGroups(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleActionForwardTargetGroupArgs.Builder]*):
        com.pulumi.aws.vpclattice.inputs.ListenerRuleActionForwardArgs.Builder =
      def argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleActionForwardTargetGroupArgs.builder
      builder.targetGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ResourceConfigurationState.Builder)
    /**
     * @param resourceConfigurationDefinition Details of the Resource Configuration. See `resourceConfigurationDefinition` Block for details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def resourceConfigurationDefinition(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ResourceConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionArgs.builder
      builder.resourceConfigurationDefinition(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ResourceConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ResourceConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ResourceConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.TargetGroupConfigArgs.Builder)
    /**
     * @param healthCheck The health check configuration.
     * @return builder
     */
    def healthCheck(args: Endofunction[com.pulumi.aws.vpclattice.inputs.TargetGroupConfigHealthCheckArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.TargetGroupConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.TargetGroupConfigHealthCheckArgs.builder
      builder.healthCheck(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchArgs.Builder)
    /**
     * @param headerMatches The header matches.
     *  Matches incoming requests with rule based on request header value before applying rule action.
     *  See `headerMatches` Block for details.
     * @return builder
     */
    def headerMatches(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchHeaderMatchArgs.Builder]*):
        com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchHeaderMatchArgs.builder
      builder.headerMatches(args.map(_(argsBuilder).build)*)

    /**
     * @param pathMatch The path match.
     *  See `pathMatch` Block for details.
     * @return builder
     */
    def pathMatch(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchPathMatchArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchPathMatchArgs.builder
      builder.pathMatch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionArgs.Builder)
    /**
     * @param arnResource Resource DNS Configuration. See `arnResource` Block for details.
     * @return builder
     */
    def arnResource(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionArnResourceArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionArnResourceArgs.builder
      builder.arnResource(args(argsBuilder).build)

    /**
     * @param dnsResource Resource DNS Configuration. See `dnsResource` Block for details.
     * @return builder
     */
    def dnsResource(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionDnsResourceArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionDnsResourceArgs.builder
      builder.dnsResource(args(argsBuilder).build)

    /**
     * @param ipResource Resource DNS Configuration. See `ipResource` Block for details.
     * @return builder
     */
    def ipResource(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionIpResourceArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionIpResourceArgs.builder
      builder.ipResource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.TargetGroupAttachmentState.Builder)
    /**
     * @param target The target.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.aws.vpclattice.inputs.TargetGroupAttachmentTargetArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.TargetGroupAttachmentState.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.TargetGroupAttachmentTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.TargetGroupConfigHealthCheckArgs.Builder)
    /**
     * @param matcher The codes to use when checking for a successful response from a target. These are called _Success codes_ in the console.
     * @return builder
     */
    def matcher(args: Endofunction[com.pulumi.aws.vpclattice.inputs.TargetGroupConfigHealthCheckMatcherArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.TargetGroupConfigHealthCheckArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.TargetGroupConfigHealthCheckMatcherArgs.builder
      builder.matcher(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.TargetGroupState.Builder)
    /**
     * @param config The target group configuration.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.aws.vpclattice.inputs.TargetGroupConfigArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.TargetGroupState.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.TargetGroupConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ServiceNetworkServiceAssociationState.Builder)
    /**
     * @param dnsEntries The DNS name of the service.
     * @return builder
     */
    def dnsEntries(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ServiceNetworkServiceAssociationDnsEntryArgs.Builder]*):
        com.pulumi.aws.vpclattice.inputs.ServiceNetworkServiceAssociationState.Builder =
      def argsBuilder = com.pulumi.aws.vpclattice.inputs.ServiceNetworkServiceAssociationDnsEntryArgs.builder
      builder.dnsEntries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionArgs.Builder)
    def fixedResponse(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionFixedResponseArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionFixedResponseArgs.builder
      builder.fixedResponse(args(argsBuilder).build)

    /**
     * @param forwards Route requests to one or more target groups. See Forward blocks below.
     *  
     *  &gt; **NOTE:** You must specify exactly one of the following argument blocks: `fixedResponse` or `forward`.
     * @return builder
     */
    def forwards(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionForwardArgs.Builder]*):
        com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionForwardArgs.builder
      builder.forwards(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchHeaderMatchArgs.Builder)
    /**
     * @param match The header match type.
     *  See Header Match `match` Block for details.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchHeaderMatchMatchArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchHeaderMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchHeaderMatchMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ListenerRuleState.Builder)
    /**
     * @param action The action for the listener rule.
     *  See `action` Block for details.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleActionArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ListenerRuleState.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param match The rule match.
     *  See `match` Block
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ListenerRuleState.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ServiceState.Builder)
    /**
     * @param dnsEntries DNS name of the service.
     * @return builder
     */
    def dnsEntries(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ServiceDnsEntryArgs.Builder]*):
        com.pulumi.aws.vpclattice.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.aws.vpclattice.inputs.ServiceDnsEntryArgs.builder
      builder.dnsEntries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ListenerRuleActionArgs.Builder)
    /**
     * @param fixedResponse Describes the rule action that returns a custom HTTP response.
     *  See `fixedResponse` Block for details.
     * @return builder
     */
    def fixedResponse(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleActionFixedResponseArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleActionFixedResponseArgs.builder
      builder.fixedResponse(args(argsBuilder).build)

    /**
     * @param forward The forward action. Traffic that matches the rule is forwarded to the specified target groups.
     *  See `forward` Block for details.
     * @return builder
     */
    def forward(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleActionForwardArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleActionForwardArgs.builder
      builder.forward(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchArgs.Builder)
    /**
     * @param httpMatch The HTTP criteria that a rule must match.
     *  See `httpMatch` Block for details.
     * @return builder
     */
    def httpMatch(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchArgs.builder
      builder.httpMatch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionForwardArgs.Builder)
    /**
     * @param targetGroups One or more target group blocks.
     * @return builder
     */
    def targetGroups(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionForwardTargetGroupArgs.Builder]*):
        com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionForwardArgs.Builder =
      def argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionForwardTargetGroupArgs.builder
      builder.targetGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchPathMatchArgs.Builder)
    /**
     * @param match The header match type.
     *  See Path Match `match` Block for details.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchPathMatchMatchArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchPathMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchPathMatchMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  /** Resource for managing an AWS VPC Lattice Listener Rule. */
  def ListenerRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpclattice.ListenerRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpclattice.ListenerRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.vpclattice.ListenerRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
