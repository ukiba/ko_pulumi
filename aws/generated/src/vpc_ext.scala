package jp.ukiba.ko_pulumi
package aws

object vpc_ext:
  extension (builder: com.pulumi.aws.vpc.EndpointServicePrivateDnsVerificationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.EndpointServicePrivateDnsVerificationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.EndpointServicePrivateDnsVerificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.EndpointServicePrivateDnsVerificationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpc.RouteServerArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.RouteServerTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.RouteServerArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.RouteServerTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpc.RouteServerEndpointArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.RouteServerEndpointTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.RouteServerEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.RouteServerEndpointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpc.RouteServerPeerArgs.Builder)
    /**
     * @param bgpOptions BGP options for the peer, including ASN (Autonomous System Number) and BFD (Bidrectional Forwarding Detection) settings. Configuration block with BGP Options configuration Detailed below
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

  extension (builder: com.pulumi.aws.vpc.RouteServerPropagationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.RouteServerPropagationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.RouteServerPropagationArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.RouteServerPropagationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpc.RouteServerVpcAssociationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.RouteServerVpcAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.RouteServerVpcAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.RouteServerVpcAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpc.SecurityGroupVpcAssociationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.SecurityGroupVpcAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.SecurityGroupVpcAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.SecurityGroupVpcAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpc.inputs.EndpointServicePrivateDnsVerificationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.EndpointServicePrivateDnsVerificationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.inputs.EndpointServicePrivateDnsVerificationState.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.EndpointServicePrivateDnsVerificationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpc.inputs.GetSecurityGroupRuleArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.vpc.inputs.GetSecurityGroupRuleFilterArgs.Builder]*):
        com.pulumi.aws.vpc.inputs.GetSecurityGroupRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.vpc.inputs.GetSecurityGroupRuleFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.vpc.inputs.GetSecurityGroupRulePlainArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.vpc.inputs.GetSecurityGroupRuleFilter.Builder]*):
        com.pulumi.aws.vpc.inputs.GetSecurityGroupRulePlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.vpc.inputs.GetSecurityGroupRuleFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.vpc.inputs.GetSecurityGroupRulesArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.vpc.inputs.GetSecurityGroupRulesFilterArgs.Builder]*):
        com.pulumi.aws.vpc.inputs.GetSecurityGroupRulesArgs.Builder =
      def argsBuilder = com.pulumi.aws.vpc.inputs.GetSecurityGroupRulesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.vpc.inputs.GetSecurityGroupRulesPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.vpc.inputs.GetSecurityGroupRulesFilter.Builder]*):
        com.pulumi.aws.vpc.inputs.GetSecurityGroupRulesPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.vpc.inputs.GetSecurityGroupRulesFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.vpc.inputs.RouteServerEndpointState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.RouteServerEndpointTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.inputs.RouteServerEndpointState.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.RouteServerEndpointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpc.inputs.RouteServerPeerState.Builder)
    /**
     * @param bgpOptions BGP options for the peer, including ASN (Autonomous System Number) and BFD (Bidrectional Forwarding Detection) settings. Configuration block with BGP Options configuration Detailed below
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

  extension (builder: com.pulumi.aws.vpc.inputs.RouteServerPropagationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.RouteServerPropagationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.inputs.RouteServerPropagationState.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.RouteServerPropagationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpc.inputs.RouteServerState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.RouteServerTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.inputs.RouteServerState.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.RouteServerTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpc.inputs.RouteServerVpcAssociationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.RouteServerVpcAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.inputs.RouteServerVpcAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.RouteServerVpcAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpc.inputs.SecurityGroupVpcAssociationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.vpc.inputs.SecurityGroupVpcAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpc.inputs.SecurityGroupVpcAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.vpc.inputs.SecurityGroupVpcAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
