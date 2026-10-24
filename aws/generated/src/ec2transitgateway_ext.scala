package jp.ukiba.ko_pulumi
package aws

object ec2transitgateway_ext:
  extension (builder: com.pulumi.aws.ec2transitgateway.DefaultRouteTableAssociationArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTableAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.DefaultRouteTableAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTableAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.DefaultRouteTablePropagationArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTablePropagationTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.DefaultRouteTablePropagationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTablePropagationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.InstanceConnectEndpointArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.InstanceConnectEndpointTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.InstanceConnectEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.InstanceConnectEndpointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.MeteringPolicyArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.MeteringPolicyTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.MeteringPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.MeteringPolicyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.MeteringPolicyEntryArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.MeteringPolicyEntryTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.MeteringPolicyEntryArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.MeteringPolicyEntryTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.PeeringAttachmentArgs.Builder)
    /**
     * @param options Block describing whether dynamic routing is enabled or disabled for the transit gateway peering request. If not configured, the value is populated from the API. See options below for more details!
     * @return builder
     */
    inline def options(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.PeeringAttachmentOptionsArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.PeeringAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.PeeringAttachmentOptionsArgs.builder
      builder.options(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.PolicyTableEntryArgs.Builder)
    /**
     * @param policyRule Matching criteria for the policy table entry. See below.
     * @return builder
     */
    inline def policyRule(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.PolicyTableEntryPolicyRuleArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.PolicyTableEntryArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.PolicyTableEntryPolicyRuleArgs.builder
      builder.policyRule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTableAssociationState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTableAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTableAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTableAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTablePropagationState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTablePropagationTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTablePropagationState.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTablePropagationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentPlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentFilter.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentsArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentsFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentsPlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentsFilter.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetConnectArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetConnectFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetConnectArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetConnectFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetConnectPeerArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetConnectPeerFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetConnectPeerArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetConnectPeerFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetConnectPeerPlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetConnectPeerFilter.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetConnectPeerPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetConnectPeerFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetConnectPlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetConnectFilter.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetConnectPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetConnectFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetDirectConnectGatewayAttachmentArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetDirectConnectGatewayAttachmentFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetDirectConnectGatewayAttachmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetDirectConnectGatewayAttachmentFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetDirectConnectGatewayAttachmentPlainArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetDirectConnectGatewayAttachmentFilter.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetDirectConnectGatewayAttachmentPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetDirectConnectGatewayAttachmentFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetMulticastDomainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetMulticastDomainFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetMulticastDomainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetMulticastDomainFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetMulticastDomainPlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetMulticastDomainFilter.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetMulticastDomainPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetMulticastDomainFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentPlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentFilter.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentsArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentsFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentsPlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentsFilter.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableAssociationsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * 
     * More complex filters can be expressed using one or more `filter` sub-blocks,
     * which take the following arguments:
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableAssociationsFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableAssociationsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableAssociationsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableAssociationsPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * 
     * More complex filters can be expressed using one or more `filter` sub-blocks,
     * which take the following arguments:
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableAssociationsFilter.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableAssociationsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableAssociationsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetRouteTablePlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableFilter.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetRouteTablePlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetRouteTablePropagationsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * 
     * More complex filters can be expressed using one or more `filter` sub-blocks,
     * which take the following arguments:
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetRouteTablePropagationsFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetRouteTablePropagationsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetRouteTablePropagationsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetRouteTablePropagationsPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * 
     * More complex filters can be expressed using one or more `filter` sub-blocks,
     * which take the following arguments:
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetRouteTablePropagationsFilter.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetRouteTablePropagationsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetRouteTablePropagationsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableRoutesArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableRoutesFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableRoutesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableRoutesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableRoutesPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableRoutesFilter.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableRoutesPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableRoutesFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetTransitGatewayArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetTransitGatewayFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetTransitGatewayArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetTransitGatewayFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetTransitGatewayPlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetTransitGatewayFilter.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetTransitGatewayPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetTransitGatewayFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentPlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentFilter.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentsArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentsFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentsPlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentsFilter.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetVpnAttachmentArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetVpnAttachmentFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetVpnAttachmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetVpnAttachmentFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetVpnAttachmentPlainArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetVpnAttachmentFilter.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetVpnAttachmentPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetVpnAttachmentFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.InstanceConnectEndpointState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.InstanceConnectEndpointTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.inputs.InstanceConnectEndpointState.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.InstanceConnectEndpointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.MeteringPolicyEntryState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.MeteringPolicyEntryTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.inputs.MeteringPolicyEntryState.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.MeteringPolicyEntryTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.MeteringPolicyState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.MeteringPolicyTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.inputs.MeteringPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.MeteringPolicyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.PeeringAttachmentState.Builder)
    /**
     * @param options Block describing whether dynamic routing is enabled or disabled for the transit gateway peering request. If not configured, the value is populated from the API. See options below for more details!
     * @return builder
     */
    inline def options(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.PeeringAttachmentOptionsArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.inputs.PeeringAttachmentState.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.PeeringAttachmentOptionsArgs.builder
      builder.options(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.PolicyTableEntryPolicyRuleArgs.Builder)
    /**
     * @param metadata Metadata key/value tag associated with the policy rule. See below.
     * @return builder
     */
    inline def metadata(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.PolicyTableEntryPolicyRuleMetadataArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.inputs.PolicyTableEntryPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.PolicyTableEntryPolicyRuleMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.PolicyTableEntryState.Builder)
    /**
     * @param policyRule Matching criteria for the policy table entry. See below.
     * @return builder
     */
    inline def policyRule(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.PolicyTableEntryPolicyRuleArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.inputs.PolicyTableEntryState.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.PolicyTableEntryPolicyRuleArgs.builder
      builder.policyRule(args(argsBuilder).build)
