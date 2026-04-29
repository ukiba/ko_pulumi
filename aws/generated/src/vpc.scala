package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object vpc:
  extension (builder: com.pulumi.aws.vpc.RouteServerPropagationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.RouteServerPropagationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.RouteServerPropagationArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.RouteServerPropagationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpc.RouteServerPeerArgs.Builder)
    /**
     * @param bgpOptions The BGP options for the peer, including ASN (Autonomous System Number) and BFD (Bidrectional Forwarding Detection) settings. Configuration block with BGP Options configuration Detailed below
     * @return builder
     */
    def bgpOptions(args: Endofunction[com.pulumi.aws.vpc.inputs.RouteServerPeerBgpOptionsArgs.Builder]):
        com.pulumi.aws.vpc.RouteServerPeerArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.RouteServerPeerBgpOptionsArgs.builder
      builder.bgpOptions(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.RouteServerPeerTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.RouteServerPeerArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.RouteServerPeerTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpc.EndpointServicePrivateDnsVerificationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.EndpointServicePrivateDnsVerificationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.EndpointServicePrivateDnsVerificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.EndpointServicePrivateDnsVerificationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpc.RouteServerEndpointArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.RouteServerEndpointTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.RouteServerEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.RouteServerEndpointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Provides a resource for managing a VPC (Virtual Private Cloud) Route Server. */
  def RouteServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpc.RouteServerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpc.RouteServerArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.vpc.RouteServer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an inbound (ingress) rule for a security group.
   *  
   *  When specifying an inbound rule for your security group in a VPC, the configuration must include a source for the traffic.
   *  
   *  &gt; **NOTE:** Using `aws.vpc.SecurityGroupEgressRule` and `aws.vpc.SecurityGroupIngressRule` resources is the current best practice. Avoid using the `aws.ec2.SecurityGroupRule` resource and the `ingress` and `egress` arguments of the `aws.ec2.SecurityGroup` resource for configuring in-line rules, as they struggle with managing multiple CIDR blocks, and tags and descriptions due to the historical lack of unique IDs.
   *  
   *  !&gt; **WARNING:** You should not use the `aws.vpc.SecurityGroupEgressRule` and `aws.vpc.SecurityGroupIngressRule` resources in conjunction with the `aws.ec2.SecurityGroup` resource with _in-line rules_ (using the `ingress` and `egress` arguments of `aws.ec2.SecurityGroup`) or the `aws.ec2.SecurityGroupRule` resource. Doing so may cause rule conflicts, perpetual differences, and result in rules being overwritten.
   */
  def SecurityGroupIngressRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpc.SecurityGroupIngressRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpc.SecurityGroupIngressRuleArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.vpc.SecurityGroupIngressRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.vpc.SecurityGroupVpcAssociationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.SecurityGroupVpcAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.SecurityGroupVpcAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.SecurityGroupVpcAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Provides a resource for managing association between VPC (Virtual Private Cloud) route server and a VPC. */
  def RouteServerVpcAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpc.RouteServerVpcAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.vpc.RouteServerVpcAssociationArgs.builder
    
    com.pulumi.aws.vpc.RouteServerVpcAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for managing an AWS VPC (Virtual Private Cloud) Endpoint Service Private DNS Verification.
   *  This resource begins the verification process by calling the [`StartVpcEndpointServicePrivateDnsVerification`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_StartVpcEndpointServicePrivateDnsVerification.html) API.
   *  The service provider should add a record to the DNS server _before_ creating this resource.
   *  
   *  For additional details, refer to the AWS documentation on [managing VPC endpoint service DNS names](https://docs.aws.amazon.com/vpc/latest/privatelink/manage-dns-names.html).
   *  
   *  &gt; Destruction of this resource will not stop the verification process, only remove the resource from state.
   */
  def EndpointServicePrivateDnsVerification(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpc.EndpointServicePrivateDnsVerificationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.vpc.EndpointServicePrivateDnsVerificationArgs.builder
    
    com.pulumi.aws.vpc.EndpointServicePrivateDnsVerification(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource for managing a VPC (Virtual Private Cloud) Route Server Endpoint. */
  def RouteServerEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpc.RouteServerEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpc.RouteServerEndpointArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.vpc.RouteServerEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.vpc.RouteServerVpcAssociationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.RouteServerVpcAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.RouteServerVpcAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.RouteServerVpcAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Provides a resource for managing propagation between VPC (Virtual Private Cloud) route server and a route table. */
  def RouteServerPropagation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpc.RouteServerPropagationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.vpc.RouteServerPropagationArgs.builder
    
    com.pulumi.aws.vpc.RouteServerPropagation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.vpc.RouteServerArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.RouteServerTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.RouteServerArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.RouteServerTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  type VpcFunctions = com.pulumi.aws.vpc.VpcFunctions
  object VpcFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.vpc.VpcFunctions.*
  extension (self: VpcFunctions.type)
    /** Data source for managing an AWS EC2 (Elastic Compute Cloud) Vpc Endpoint Associations. */
    def getEndpointAssociations(args: Endofunction[com.pulumi.aws.vpc.inputs.GetEndpointAssociationsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.vpc.outputs.GetEndpointAssociationsResult] =
      val argsBuilder = com.pulumi.aws.vpc.inputs.GetEndpointAssociationsArgs.builder
      com.pulumi.aws.vpc.VpcFunctions.getEndpointAssociations(args(argsBuilder).build)

    /** Data source for managing an AWS EC2 (Elastic Compute Cloud) Vpc Endpoint Associations. */
    def getEndpointAssociationsPlain(args: Endofunction[com.pulumi.aws.vpc.inputs.GetEndpointAssociationsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.vpc.outputs.GetEndpointAssociationsResult] =
      val argsBuilder = com.pulumi.aws.vpc.inputs.GetEndpointAssociationsPlainArgs.builder
      com.pulumi.aws.vpc.VpcFunctions.getEndpointAssociationsPlain(args(argsBuilder).build)

    /** `aws.vpc.getSecurityGroupRule` provides details about a specific security group rule. */
    def getSecurityGroupRule(args: Endofunction[com.pulumi.aws.vpc.inputs.GetSecurityGroupRuleArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.vpc.outputs.GetSecurityGroupRuleResult] =
      val argsBuilder = com.pulumi.aws.vpc.inputs.GetSecurityGroupRuleArgs.builder
      com.pulumi.aws.vpc.VpcFunctions.getSecurityGroupRule(args(argsBuilder).build)

    /** `aws.vpc.getSecurityGroupRule` provides details about a specific security group rule. */
    def getSecurityGroupRulePlain(args: Endofunction[com.pulumi.aws.vpc.inputs.GetSecurityGroupRulePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.vpc.outputs.GetSecurityGroupRuleResult] =
      val argsBuilder = com.pulumi.aws.vpc.inputs.GetSecurityGroupRulePlainArgs.builder
      com.pulumi.aws.vpc.VpcFunctions.getSecurityGroupRulePlain(args(argsBuilder).build)

    /** This resource can be useful for getting back a set of security group rule IDs. */
    def getSecurityGroupRules(args: Endofunction[com.pulumi.aws.vpc.inputs.GetSecurityGroupRulesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.vpc.outputs.GetSecurityGroupRulesResult] =
      val argsBuilder = com.pulumi.aws.vpc.inputs.GetSecurityGroupRulesArgs.builder
      com.pulumi.aws.vpc.VpcFunctions.getSecurityGroupRules(args(argsBuilder).build)

    /** This resource can be useful for getting back a set of security group rule IDs. */
    def getSecurityGroupRulesPlain(args: Endofunction[com.pulumi.aws.vpc.inputs.GetSecurityGroupRulesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.vpc.outputs.GetSecurityGroupRulesResult] =
      val argsBuilder = com.pulumi.aws.vpc.inputs.GetSecurityGroupRulesPlainArgs.builder
      com.pulumi.aws.vpc.VpcFunctions.getSecurityGroupRulesPlain(args(argsBuilder).build)

  /** Resource for managing Security Group VPC Associations. */
  def SecurityGroupVpcAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpc.SecurityGroupVpcAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.vpc.SecurityGroupVpcAssociationArgs.builder
    
    com.pulumi.aws.vpc.SecurityGroupVpcAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource for managing a VPC (Virtual Private Cloud) Route Server Peer. */
  def RouteServerPeer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpc.RouteServerPeerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpc.RouteServerPeerArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.vpc.RouteServerPeer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for enabling private DNS on an AWS VPC (Virtual Private Cloud) Endpoint.
   *  
   *  &gt; When using this resource, the `privateDnsEnabled` argument should be omitted on the parent `aws.ec2.VpcEndpoint` resource.
   *  Setting the value both places can lead to unintended behavior and persistent differences.
   */
  def EndpointPrivateDns(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpc.EndpointPrivateDnsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.vpc.EndpointPrivateDnsArgs.builder
    
    com.pulumi.aws.vpc.EndpointPrivateDns(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an outbound (egress) rule for a security group.
   *  
   *  When specifying an outbound rule for your security group in a VPC, the configuration must include a destination for the traffic.
   *  
   *  &gt; **NOTE:** Using `aws.vpc.SecurityGroupEgressRule` and `aws.vpc.SecurityGroupIngressRule` resources is the current best practice. Avoid using the `aws.ec2.SecurityGroupRule` resource and the `ingress` and `egress` arguments of the `aws.ec2.SecurityGroup` resource for configuring in-line rules, as they struggle with managing multiple CIDR blocks, and tags and descriptions due to the historical lack of unique IDs.
   *  
   *  !&gt; **WARNING:** You should not use the `aws.vpc.SecurityGroupEgressRule` and `aws.vpc.SecurityGroupIngressRule` resources in conjunction with the `aws.ec2.SecurityGroup` resource with _in-line rules_ (using the `ingress` and `egress` arguments of `aws.ec2.SecurityGroup`) or the `aws.ec2.SecurityGroupRule` resource. Doing so may cause rule conflicts, perpetual differences, and result in rules being overwritten.
   */
  def SecurityGroupEgressRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.vpc.SecurityGroupEgressRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpc.SecurityGroupEgressRuleArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.vpc.SecurityGroupEgressRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.vpc.inputs.RouteServerEndpointState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.RouteServerEndpointTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.inputs.RouteServerEndpointState.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.RouteServerEndpointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpc.inputs.RouteServerVpcAssociationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.RouteServerVpcAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.inputs.RouteServerVpcAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.RouteServerVpcAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpc.inputs.RouteServerPeerState.Builder)
    /**
     * @param bgpOptions The BGP options for the peer, including ASN (Autonomous System Number) and BFD (Bidrectional Forwarding Detection) settings. Configuration block with BGP Options configuration Detailed below
     * @return builder
     */
    def bgpOptions(args: Endofunction[com.pulumi.aws.vpc.inputs.RouteServerPeerBgpOptionsArgs.Builder]):
        com.pulumi.aws.vpc.inputs.RouteServerPeerState.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.RouteServerPeerBgpOptionsArgs.builder
      builder.bgpOptions(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.RouteServerPeerTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.inputs.RouteServerPeerState.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.RouteServerPeerTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpc.inputs.GetSecurityGroupRulesArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.vpc.inputs.GetSecurityGroupRulesFilterArgs.Builder]*):
        com.pulumi.aws.vpc.inputs.GetSecurityGroupRulesArgs.Builder =
      def argsBuilder = com.pulumi.aws.vpc.inputs.GetSecurityGroupRulesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.vpc.inputs.EndpointServicePrivateDnsVerificationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.EndpointServicePrivateDnsVerificationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.inputs.EndpointServicePrivateDnsVerificationState.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.EndpointServicePrivateDnsVerificationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpc.inputs.GetSecurityGroupRuleArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     *  
     *  The arguments of this data source act as filters for querying the available
     *  security group rules. The given filters must match exactly one security group rule
     *  whose data will be exported as attributes.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.vpc.inputs.GetSecurityGroupRuleFilterArgs.Builder]*):
        com.pulumi.aws.vpc.inputs.GetSecurityGroupRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.vpc.inputs.GetSecurityGroupRuleFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.vpc.inputs.SecurityGroupVpcAssociationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.SecurityGroupVpcAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.inputs.SecurityGroupVpcAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.SecurityGroupVpcAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpc.inputs.RouteServerState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.RouteServerTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.inputs.RouteServerState.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.RouteServerTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpc.inputs.RouteServerPropagationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.RouteServerPropagationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.inputs.RouteServerPropagationState.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.RouteServerPropagationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
