package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object ec2transitgateway:
  /** Manages an EC2 Transit Gateway Policy Table. */
  def PolicyTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.PolicyTableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2transitgateway.PolicyTableArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2transitgateway.PolicyTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS EC2 (Elastic Compute Cloud) Transit Gateway Default Route Table Propagation. */
  def DefaultRouteTablePropagation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.DefaultRouteTablePropagationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2transitgateway.DefaultRouteTablePropagationArgs.builder
    
    com.pulumi.aws.ec2transitgateway.DefaultRouteTablePropagation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type Ec2transitgatewayFunctions = com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions
  object Ec2transitgatewayFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.*
  extension (self: Ec2transitgatewayFunctions.type)
    /** Get information on an EC2 Transit Gateway&#39;s attachment to a resource. */
    def getAttachment(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2transitgateway.outputs.GetAttachmentResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getAttachment(args(argsBuilder).build)

    /** Get information on an EC2 Transit Gateway&#39;s attachment to a resource. */
    def getAttachmentPlain(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2transitgateway.outputs.GetAttachmentResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentPlainArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getAttachmentPlain(args(argsBuilder).build)

    /** Get information on EC2 Transit Gateway Attachments. */
    def getAttachments(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2transitgateway.outputs.GetAttachmentsResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentsArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getAttachments(args(argsBuilder).build)

    /** Get information on EC2 Transit Gateway Attachments. */
    def getAttachmentsPlain(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2transitgateway.outputs.GetAttachmentsResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentsPlainArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getAttachmentsPlain(args(argsBuilder).build)

    /** Get information on an EC2 Transit Gateway Connect. */
    def getConnect(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetConnectArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2transitgateway.outputs.GetConnectResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetConnectArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getConnect(args(argsBuilder).build)

    /** Get information on an EC2 Transit Gateway Connect. */
    def getConnectPlain(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetConnectPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2transitgateway.outputs.GetConnectResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetConnectPlainArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getConnectPlain(args(argsBuilder).build)

    /** Get information on an EC2 Transit Gateway Connect Peer. */
    def getConnectPeer(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetConnectPeerArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2transitgateway.outputs.GetConnectPeerResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetConnectPeerArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getConnectPeer(args(argsBuilder).build)

    /** Get information on an EC2 Transit Gateway Connect Peer. */
    def getConnectPeerPlain(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetConnectPeerPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2transitgateway.outputs.GetConnectPeerResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetConnectPeerPlainArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getConnectPeerPlain(args(argsBuilder).build)

    /**
     * Get information on an EC2 Transit Gateway&#39;s attachment to a Direct Connect Gateway.
     *  
     *  !&gt; **Warning:** Using the `aws.ec2transitgateway.getDirectConnectGatewayAttachment` data source in combination with  `aws.ec2transitgateway.RouteTablePropagation` or `aws.ec2transitgateway.RouteTableAssociation` may result in lost connectivity due to unnecessary resource re-creation. To avoid this, use the `transitGatewayAttachmentId` attribute directly from the `aws.directconnect.GatewayAssociation` resource. For example, `transitGatewayAttachmentId  = aws_dx_gateway_association.example.transit_gateway_attachment_id`.
     */
    def getDirectConnectGatewayAttachment(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetDirectConnectGatewayAttachmentArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2transitgateway.outputs.GetDirectConnectGatewayAttachmentResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetDirectConnectGatewayAttachmentArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getDirectConnectGatewayAttachment(args(argsBuilder).build)

    /**
     * Get information on an EC2 Transit Gateway&#39;s attachment to a Direct Connect Gateway.
     *  
     *  !&gt; **Warning:** Using the `aws.ec2transitgateway.getDirectConnectGatewayAttachment` data source in combination with  `aws.ec2transitgateway.RouteTablePropagation` or `aws.ec2transitgateway.RouteTableAssociation` may result in lost connectivity due to unnecessary resource re-creation. To avoid this, use the `transitGatewayAttachmentId` attribute directly from the `aws.directconnect.GatewayAssociation` resource. For example, `transitGatewayAttachmentId  = aws_dx_gateway_association.example.transit_gateway_attachment_id`.
     */
    def getDirectConnectGatewayAttachmentPlain(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetDirectConnectGatewayAttachmentPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2transitgateway.outputs.GetDirectConnectGatewayAttachmentResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetDirectConnectGatewayAttachmentPlainArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getDirectConnectGatewayAttachmentPlain(args(argsBuilder).build)

    /** Get information on an EC2 Transit Gateway Multicast Domain. */
    def getMulticastDomain(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetMulticastDomainArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2transitgateway.outputs.GetMulticastDomainResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetMulticastDomainArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getMulticastDomain(args(argsBuilder).build)

    /** Get information on an EC2 Transit Gateway Multicast Domain. */
    def getMulticastDomainPlain(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetMulticastDomainPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2transitgateway.outputs.GetMulticastDomainResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetMulticastDomainPlainArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getMulticastDomainPlain(args(argsBuilder).build)

    /** Get information on an EC2 Transit Gateway Peering Attachment. */
    def getPeeringAttachment(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2transitgateway.outputs.GetPeeringAttachmentResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getPeeringAttachment(args(argsBuilder).build)

    /** Get information on an EC2 Transit Gateway Peering Attachment. */
    def getPeeringAttachmentPlain(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2transitgateway.outputs.GetPeeringAttachmentResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentPlainArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getPeeringAttachmentPlain(args(argsBuilder).build)

    /** Get information on EC2 Transit Gateway Peering Attachments. */
    def getPeeringAttachments(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2transitgateway.outputs.GetPeeringAttachmentsResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentsArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getPeeringAttachments(args(argsBuilder).build)

    /** Get information on EC2 Transit Gateway Peering Attachments. */
    def getPeeringAttachmentsPlain(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2transitgateway.outputs.GetPeeringAttachmentsResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentsPlainArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getPeeringAttachmentsPlain(args(argsBuilder).build)

    /** Get information on an EC2 Transit Gateway Route Table. */
    def getRouteTable(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2transitgateway.outputs.GetRouteTableResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getRouteTable(args(argsBuilder).build)

    /** Get information on an EC2 Transit Gateway Route Table. */
    def getRouteTablePlain(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetRouteTablePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2transitgateway.outputs.GetRouteTableResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetRouteTablePlainArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getRouteTablePlain(args(argsBuilder).build)

    /** Provides information for multiple EC2 Transit Gateway Route Table Associations, such as their identifiers. */
    def getRouteTableAssociations(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableAssociationsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2transitgateway.outputs.GetRouteTableAssociationsResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableAssociationsArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getRouteTableAssociations(args(argsBuilder).build)

    /** Provides information for multiple EC2 Transit Gateway Route Table Associations, such as their identifiers. */
    def getRouteTableAssociationsPlain(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableAssociationsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2transitgateway.outputs.GetRouteTableAssociationsResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableAssociationsPlainArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getRouteTableAssociationsPlain(args(argsBuilder).build)

    /** Provides information for multiple EC2 Transit Gateway Route Table Propagations, such as their identifiers. */
    def getRouteTablePropagations(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetRouteTablePropagationsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2transitgateway.outputs.GetRouteTablePropagationsResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetRouteTablePropagationsArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getRouteTablePropagations(args(argsBuilder).build)

    /** Provides information for multiple EC2 Transit Gateway Route Table Propagations, such as their identifiers. */
    def getRouteTablePropagationsPlain(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetRouteTablePropagationsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2transitgateway.outputs.GetRouteTablePropagationsResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetRouteTablePropagationsPlainArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getRouteTablePropagationsPlain(args(argsBuilder).build)

    /** Provides informations for routes of a specific transit gateway, such as state, type, cidr */
    def getRouteTableRoutes(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableRoutesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2transitgateway.outputs.GetRouteTableRoutesResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableRoutesArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getRouteTableRoutes(args(argsBuilder).build)

    /** Provides informations for routes of a specific transit gateway, such as state, type, cidr */
    def getRouteTableRoutesPlain(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableRoutesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2transitgateway.outputs.GetRouteTableRoutesResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableRoutesPlainArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getRouteTableRoutesPlain(args(argsBuilder).build)

    /** Get information on an EC2 Transit Gateway. */
    def getTransitGateway(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetTransitGatewayArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2transitgateway.outputs.GetTransitGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetTransitGatewayArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getTransitGateway(args(argsBuilder).build)

    /** Get information on an EC2 Transit Gateway. */
    def getTransitGatewayPlain(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetTransitGatewayPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2transitgateway.outputs.GetTransitGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetTransitGatewayPlainArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getTransitGatewayPlain(args(argsBuilder).build)

    /**
     * Get information on an EC2 Transit Gateway VPC Attachment.
     *  
     *  !&gt; **Warning:** Using the `aws.ec2transitgateway.VpcAttachment` data source in combination with  `aws.ec2transitgateway.RouteTablePropagation` or `aws.ec2transitgateway.RouteTableAssociation` may result in lost connectivity due to unnecessary resource re-creation. To avoid this, use the `id` attribute directly from the `aws.ec2transitgateway.VpcAttachment` _resource_. For example, `transitGatewayAttachmentId  = aws_ec2_transit_gateway_vpc_attachment.example.id`.
     */
    def getVpcAttachment(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2transitgateway.outputs.GetVpcAttachmentResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getVpcAttachment(args(argsBuilder).build)

    /**
     * Get information on an EC2 Transit Gateway VPC Attachment.
     *  
     *  !&gt; **Warning:** Using the `aws.ec2transitgateway.VpcAttachment` data source in combination with  `aws.ec2transitgateway.RouteTablePropagation` or `aws.ec2transitgateway.RouteTableAssociation` may result in lost connectivity due to unnecessary resource re-creation. To avoid this, use the `id` attribute directly from the `aws.ec2transitgateway.VpcAttachment` _resource_. For example, `transitGatewayAttachmentId  = aws_ec2_transit_gateway_vpc_attachment.example.id`.
     */
    def getVpcAttachmentPlain(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2transitgateway.outputs.GetVpcAttachmentResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentPlainArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getVpcAttachmentPlain(args(argsBuilder).build)

    /** Get information on EC2 Transit Gateway VPC Attachments. */
    def getVpcAttachments(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2transitgateway.outputs.GetVpcAttachmentsResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentsArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getVpcAttachments(args(argsBuilder).build)

    /** Get information on EC2 Transit Gateway VPC Attachments. */
    def getVpcAttachmentsPlain(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2transitgateway.outputs.GetVpcAttachmentsResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentsPlainArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getVpcAttachmentsPlain(args(argsBuilder).build)

    /**
     * Get information on an EC2 Transit Gateway VPN Attachment.
     *  
     *  &gt; EC2 Transit Gateway VPN Attachments are implicitly created by VPN Connections referencing an EC2 Transit Gateway so there is no managed resource. For ease, the `aws.ec2.VpnConnection` resource includes a `transitGatewayAttachmentId` attribute which can replace some usage of this data source. For tagging the attachment, see the `aws.ec2.Tag` resource.
     */
    def getVpnAttachment(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetVpnAttachmentArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2transitgateway.outputs.GetVpnAttachmentResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetVpnAttachmentArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getVpnAttachment(args(argsBuilder).build)

    /**
     * Get information on an EC2 Transit Gateway VPN Attachment.
     *  
     *  &gt; EC2 Transit Gateway VPN Attachments are implicitly created by VPN Connections referencing an EC2 Transit Gateway so there is no managed resource. For ease, the `aws.ec2.VpnConnection` resource includes a `transitGatewayAttachmentId` attribute which can replace some usage of this data source. For tagging the attachment, see the `aws.ec2.Tag` resource.
     */
    def getVpnAttachmentPlain(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetVpnAttachmentPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2transitgateway.outputs.GetVpnAttachmentResult] =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetVpnAttachmentPlainArgs.builder
      com.pulumi.aws.ec2transitgateway.Ec2transitgatewayFunctions.getVpnAttachmentPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.DefaultRouteTableAssociationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTableAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.DefaultRouteTableAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTableAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Manages an EC2 Transit Gateway Policy Table association. */
  def PolicyTableAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.PolicyTableAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2transitgateway.PolicyTableAssociationArgs.builder
    
    com.pulumi.aws.ec2transitgateway.PolicyTableAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Registers sources (network interfaces) with the transit gateway multicast group.
   *  A multicast source is a network interface attached to a supported instance that sends multicast traffic.
   */
  def MulticastGroupSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.MulticastGroupSourceArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2transitgateway.MulticastGroupSourceArgs.builder
    
    com.pulumi.aws.ec2transitgateway.MulticastGroupSource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Associates the specified subnet and transit gateway attachment with the specified transit gateway multicast domain. */
  def MulticastDomainAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.MulticastDomainAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2transitgateway.MulticastDomainAssociationArgs.builder
    
    com.pulumi.aws.ec2transitgateway.MulticastDomainAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS EC2 (Elastic Compute Cloud) Transit Gateway Default Route Table Association. */
  def DefaultRouteTableAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.DefaultRouteTableAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2transitgateway.DefaultRouteTableAssociationArgs.builder
    
    com.pulumi.aws.ec2transitgateway.DefaultRouteTableAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an EC2 Transit Gateway. */
  def TransitGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.TransitGatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2transitgateway.TransitGatewayArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2transitgateway.TransitGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an EC2 Transit Gateway Multicast Domain. */
  def MulticastDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.MulticastDomainArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2transitgateway.MulticastDomainArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2transitgateway.MulticastDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an EC2 Transit Gateway VPC Attachment. For examples of custom route table association and propagation, see the EC2 Transit Gateway Networking Examples Guide. */
  def VpcAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.VpcAttachmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2transitgateway.VpcAttachmentArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2transitgateway.VpcAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an EC2 Transit Gateway Route Table propagation. */
  def RouteTablePropagation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.RouteTablePropagationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2transitgateway.RouteTablePropagationArgs.builder
    
    com.pulumi.aws.ec2transitgateway.RouteTablePropagation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Registers members (network interfaces) with the transit gateway multicast group.
   *  A member is a network interface associated with a supported EC2 instance that receives multicast traffic.
   */
  def MulticastGroupMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.MulticastGroupMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2transitgateway.MulticastGroupMemberArgs.builder
    
    com.pulumi.aws.ec2transitgateway.MulticastGroupMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an EC2 Transit Gateway Prefix List Reference. */
  def PrefixListReference(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.PrefixListReferenceArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2transitgateway.PrefixListReferenceArgs.builder
    
    com.pulumi.aws.ec2transitgateway.PrefixListReference(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an EC2 Transit Gateway Route. */
  def Route(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.RouteArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2transitgateway.RouteArgs.builder
    
    com.pulumi.aws.ec2transitgateway.Route(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.DefaultRouteTablePropagationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTablePropagationTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.DefaultRouteTablePropagationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTablePropagationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Manages an EC2 Instance Connect Endpoint. */
  def InstanceConnectEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.InstanceConnectEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2transitgateway.InstanceConnectEndpointArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2transitgateway.InstanceConnectEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an EC2 Transit Gateway Route Table association. */
  def RouteTableAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.RouteTableAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2transitgateway.RouteTableAssociationArgs.builder
    
    com.pulumi.aws.ec2transitgateway.RouteTableAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages the accepter&#39;s side of an EC2 Transit Gateway VPC Attachment.
   *  
   *  When a cross-account (requester&#39;s AWS account differs from the accepter&#39;s AWS account) EC2 Transit Gateway VPC Attachment
   *  is created, an EC2 Transit Gateway VPC Attachment resource is automatically created in the accepter&#39;s account.
   *  The requester can use the `aws.ec2transitgateway.VpcAttachment` resource to manage its side of the connection
   *  and the accepter can use the `aws.ec2transitgateway.VpcAttachmentAccepter` resource to &#34;adopt&#34; its side of the
   *  connection into management.
   */
  def VpcAttachmentAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.VpcAttachmentAccepterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2transitgateway.VpcAttachmentAccepterArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2transitgateway.VpcAttachmentAccepter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.PeeringAttachmentArgs.Builder)
    /**
     * @param options Describes whether dynamic routing is enabled or disabled for the transit gateway peering request. See options below for more details!
     * @return builder
     */
    def options(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.PeeringAttachmentOptionsArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.PeeringAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.PeeringAttachmentOptionsArgs.builder
      builder.options(args(argsBuilder).build)

  /** Manages the accepter&#39;s side of an EC2 Transit Gateway Peering Attachment. */
  def PeeringAttachmentAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.PeeringAttachmentAccepterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2transitgateway.PeeringAttachmentAccepterArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2transitgateway.PeeringAttachmentAccepter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an EC2 Transit Gateway Peering Attachment.
   *  For examples of custom route table association and propagation, see the [EC2 Transit Gateway Networking Examples Guide](https://docs.aws.amazon.com/vpc/latest/tgw/TGW_Scenarios.html).
   */
  def PeeringAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.PeeringAttachmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2transitgateway.PeeringAttachmentArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2transitgateway.PeeringAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.InstanceConnectEndpointArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.InstanceConnectEndpointTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.InstanceConnectEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.InstanceConnectEndpointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Manages an EC2 Transit Gateway Route Table. */
  def RouteTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.RouteTableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2transitgateway.RouteTableArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2transitgateway.RouteTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an EC2 Transit Gateway Connect. */
  def Connect(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.ConnectArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2transitgateway.ConnectArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2transitgateway.Connect(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an EC2 Transit Gateway Connect Peer. */
  def ConnectPeer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.ConnectPeerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2transitgateway.ConnectPeerArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2transitgateway.ConnectPeer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentsArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentsFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentsArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentsFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableRoutesArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableRoutesFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableRoutesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableRoutesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTablePropagationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTablePropagationTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTablePropagationState.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTablePropagationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetMulticastDomainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetMulticastDomainFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetMulticastDomainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetMulticastDomainFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetDirectConnectGatewayAttachmentArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetDirectConnectGatewayAttachmentFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetDirectConnectGatewayAttachmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetDirectConnectGatewayAttachmentFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.PeeringAttachmentState.Builder)
    /**
     * @param options Describes whether dynamic routing is enabled or disabled for the transit gateway peering request. See options below for more details!
     * @return builder
     */
    def options(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.PeeringAttachmentOptionsArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.inputs.PeeringAttachmentState.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.PeeringAttachmentOptionsArgs.builder
      builder.options(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetVpnAttachmentArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetVpnAttachmentFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetVpnAttachmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetVpnAttachmentFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetConnectPeerArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetConnectPeerFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetConnectPeerArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetConnectPeerFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTableAssociationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTableAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTableAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.DefaultRouteTableAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentsArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentsFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableAssociationsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     *  
     *  More complex filters can be expressed using one or more `filter` sub-blocks,
     *  which take the following arguments:
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableAssociationsFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableAssociationsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableAssociationsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetAttachmentFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetConnectArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetConnectFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetConnectArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetConnectFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.InstanceConnectEndpointState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.InstanceConnectEndpointTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2transitgateway.inputs.InstanceConnectEndpointState.Builder =
      val argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.InstanceConnectEndpointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetRouteTablePropagationsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     *  
     *  More complex filters can be expressed using one or more `filter` sub-blocks,
     *  which take the following arguments:
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetRouteTablePropagationsFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetRouteTablePropagationsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetRouteTablePropagationsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetTransitGatewayArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetTransitGatewayFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetTransitGatewayArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetTransitGatewayFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableFilterArgs.Builder]*):
        com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2transitgateway.inputs.GetRouteTableFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  /**
   * Provides an EC2 instance state resource. This allows managing an instance power state.
   *  
   *  &gt; **NOTE on Instance State Management:** AWS does not currently have an EC2 API operation to determine an instance has finished processing user data. As a result, this resource can interfere with user data processing. For example, this resource may stop an instance while the user data script is in mid run.
   */
  def InstanceState(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2transitgateway.InstanceStateArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2transitgateway.InstanceStateArgs.builder
    
    com.pulumi.aws.ec2transitgateway.InstanceState(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
