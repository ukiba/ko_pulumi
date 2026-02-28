package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object networkmanager:
  extension (builder: com.pulumi.aws.networkmanager.ConnectAttachmentArgs.Builder)
    /**
     * @param options Options block. See options for more information.
     * @return builder
     */
    def options(args: Endofunction[com.pulumi.aws.networkmanager.inputs.ConnectAttachmentOptionsArgs.Builder]):
        com.pulumi.aws.networkmanager.ConnectAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.ConnectAttachmentOptionsArgs.builder
      builder.options(args(argsBuilder).build)

  /** Manages a Network Manager link. Use this resource to create a link for a site. */
  def Link(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.LinkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.LinkArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.networkmanager.Link(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Manager transit gateway peering connection. Creates a peering connection between an AWS Cloud WAN core network and an AWS Transit Gateway. */
  def TransitGatewayPeering(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.TransitGatewayPeeringArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.TransitGatewayPeeringArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.networkmanager.TransitGatewayPeering(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Manager transit gateway registration. Registers a transit gateway to a global network. The transit gateway can be in any AWS Region, but it must be owned by the same AWS account that owns the global network. You cannot register a transit gateway in more than one global network. */
  def TransitGatewayRegistration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.TransitGatewayRegistrationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.networkmanager.TransitGatewayRegistrationArgs.builder
    
    com.pulumi.aws.networkmanager.TransitGatewayRegistration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Manager transit gateway Connect peer association. Associates a transit gateway Connect peer with a device, and optionally, with a link. If you specify a link, it must be associated with the specified device. */
  def TransitGatewayConnectPeerAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.TransitGatewayConnectPeerAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.networkmanager.TransitGatewayConnectPeerAssociationArgs.builder
    
    com.pulumi.aws.networkmanager.TransitGatewayConnectPeerAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Network Manager Core Network.
   *  
   *  Use this resource to create and manage a core network within a global network.
   */
  def CoreNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.CoreNetworkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.CoreNetworkArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.networkmanager.CoreNetwork(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.networkmanager.DxGatewayAttachmentArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.networkmanager.inputs.DxGatewayAttachmentTimeoutsArgs.Builder]):
        com.pulumi.aws.networkmanager.DxGatewayAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.DxGatewayAttachmentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Manages a Network Manager VPC attachment. */
  def VpcAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.VpcAttachmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.VpcAttachmentArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.networkmanager.VpcAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an AWS Network Manager Attachment Accepter.
   *  
   *  Use this resource to accept cross-account attachments in AWS Network Manager. When an attachment is created in one account and needs to be accepted by another account that owns the core network, this resource handles the acceptance process.
   */
  def AttachmentAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.AttachmentAccepterArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.networkmanager.AttachmentAccepterArgs.builder
    
    com.pulumi.aws.networkmanager.AttachmentAccepter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.networkmanager.ConnectPeerArgs.Builder)
    /**
     * @param bgpOptions Connect peer BGP options. See bgpOptions for more information.
     * @return builder
     */
    def bgpOptions(args: Endofunction[com.pulumi.aws.networkmanager.inputs.ConnectPeerBgpOptionsArgs.Builder]):
        com.pulumi.aws.networkmanager.ConnectPeerArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.ConnectPeerBgpOptionsArgs.builder
      builder.bgpOptions(args(argsBuilder).build)

  /** Associates a routing policy label to a Network Manager Cloud WAN&#39;s attachment outside of the attachment creation. This is useful in multi-account environments where only the Cloud WAN core network owner account can apply a routing policy label. */
  def AttachmentRoutingPolicyLabel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.AttachmentRoutingPolicyLabelArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.networkmanager.AttachmentRoutingPolicyLabelArgs.builder
    
    com.pulumi.aws.networkmanager.AttachmentRoutingPolicyLabel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Manager site-to-site VPN attachment. */
  def SiteToSiteVpnAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.SiteToSiteVpnAttachmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.SiteToSiteVpnAttachmentArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.networkmanager.SiteToSiteVpnAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Network Manager Customer Gateway Association.
   *  
   *  Use this resource to associate a customer gateway with a device and optionally, with a link. If you specify a link, it must be associated with the specified device.
   */
  def CustomerGatewayAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.CustomerGatewayAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.networkmanager.CustomerGatewayAssociationArgs.builder
    
    com.pulumi.aws.networkmanager.CustomerGatewayAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Network Manager Direct Connect Gateway Attachment.
   *  
   *  Use this resource to create and manage a Direct Connect Gateway attachment to a Cloud WAN core network.
   */
  def DxGatewayAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.DxGatewayAttachmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.DxGatewayAttachmentArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.networkmanager.DxGatewayAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Manager transit gateway route table attachment. */
  def TransitGatewayRouteTableAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.TransitGatewayRouteTableAttachmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.TransitGatewayRouteTableAttachmentArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.networkmanager.TransitGatewayRouteTableAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.networkmanager.LinkArgs.Builder)
    /**
     * @param bandwidth Upload speed and download speed in Mbps. See below.
     * @return builder
     */
    def bandwidth(args: Endofunction[com.pulumi.aws.networkmanager.inputs.LinkBandwidthArgs.Builder]):
        com.pulumi.aws.networkmanager.LinkArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.LinkBandwidthArgs.builder
      builder.bandwidth(args(argsBuilder).build)

  /** Manages a Network Manager link association. Associates a link to a device. A device can be associated to multiple links and a link can be associated to multiple devices. The device and link must be in the same global network and the same site. */
  def LinkAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.LinkAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.networkmanager.LinkAssociationArgs.builder
    
    com.pulumi.aws.networkmanager.LinkAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.networkmanager.VpcAttachmentArgs.Builder)
    /**
     * @param options Options for the VPC attachment. See below.
     * @return builder
     */
    def options(args: Endofunction[com.pulumi.aws.networkmanager.inputs.VpcAttachmentOptionsArgs.Builder]):
        com.pulumi.aws.networkmanager.VpcAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.VpcAttachmentOptionsArgs.builder
      builder.options(args(argsBuilder).build)

  /**
   * Manages an AWS Network Manager Connect Attachment.
   *  
   *  Use this resource to create a Connect attachment in AWS Network Manager. Connect attachments enable you to connect your on-premises networks to your core network through a VPC or Transit Gateway attachment.
   */
  def ConnectAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.ConnectAttachmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.ConnectAttachmentArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.networkmanager.ConnectAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Network Manager Core Network Policy Attachment.
   *  
   *  Use this resource to attach a Core Network Policy to an existing Core Network and execute the change set, which deploys changes globally based on the policy submitted (sets the policy to `LIVE`).
   *  
   *  &gt; **NOTE:** Deleting this resource will not delete the current policy defined in this resource. Deleting this resource will also not revert the current `LIVE` policy to the previous version.
   */
  def CoreNetworkPolicyAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.CoreNetworkPolicyAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.networkmanager.CoreNetworkPolicyAttachmentArgs.builder
    
    com.pulumi.aws.networkmanager.CoreNetworkPolicyAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Network Manager Device.
   *  
   *  Use this resource to create a device in a global network. If you specify both a site ID and a location, the location of the site is used for visualization in the Network Manager console.
   */
  def Device(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.DeviceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.DeviceArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.networkmanager.Device(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Network Manager Global Network.
   *  
   *  Use this resource to create and manage a global network, which is a single private network that acts as the high-level container for your network objects.
   */
  def GlobalNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.GlobalNetworkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.GlobalNetworkArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.networkmanager.GlobalNetwork(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Network Manager Connection.
   *  
   *  Use this resource to create a connection between two devices in your global network.
   */
  def Connection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.ConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.ConnectionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.networkmanager.Connection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type NetworkmanagerFunctions = com.pulumi.aws.networkmanager.NetworkmanagerFunctions
  object NetworkmanagerFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.networkmanager.NetworkmanagerFunctions.*
  extension (self: NetworkmanagerFunctions.type)
    /** Provides details about an existing Network Manager connection. */
    def getConnection(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetConnectionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetConnectionResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetConnectionArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getConnection(args(argsBuilder).build)

    /** Provides details about an existing Network Manager connection. */
    def getConnectionPlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetConnectionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetConnectionResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetConnectionPlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getConnectionPlain(args(argsBuilder).build)

    /** Provides details about existing Network Manager connections. */
    def getConnections(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetConnectionsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetConnectionsResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetConnectionsArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getConnections(args(argsBuilder).build)

    /** Provides details about existing Network Manager connections. */
    def getConnectionsPlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetConnectionsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetConnectionsResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetConnectionsPlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getConnectionsPlain(args(argsBuilder).build)

    /**
     * Generates a Core Network policy document in JSON format for use with resources that expect core network policy documents such as `awsccNetworkmanagerCoreNetwork`. It follows the API definition from the [core-network-policy documentation](https://docs.aws.amazon.com/vpc/latest/cloudwan/cloudwan-policies-json.html).
     *  
     *  Using this data source to generate policy documents is *optional*. It is also valid to use literal JSON strings in your configuration or to use the `file` interpolation function to read a raw JSON policy document from a file.
     */
    def getCoreNetworkPolicyDocument(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetCoreNetworkPolicyDocumentResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getCoreNetworkPolicyDocument(args(argsBuilder).build)

    /**
     * Generates a Core Network policy document in JSON format for use with resources that expect core network policy documents such as `awsccNetworkmanagerCoreNetwork`. It follows the API definition from the [core-network-policy documentation](https://docs.aws.amazon.com/vpc/latest/cloudwan/cloudwan-policies-json.html).
     *  
     *  Using this data source to generate policy documents is *optional*. It is also valid to use literal JSON strings in your configuration or to use the `file` interpolation function to read a raw JSON policy document from a file.
     */
    def getCoreNetworkPolicyDocumentPlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetCoreNetworkPolicyDocumentResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentPlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getCoreNetworkPolicyDocumentPlain(args(argsBuilder).build)

    /** Provides details about an existing Network Manager device. */
    def getDevice(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetDeviceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetDeviceResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetDeviceArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getDevice(args(argsBuilder).build)

    /** Provides details about an existing Network Manager device. */
    def getDevicePlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetDevicePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetDeviceResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetDevicePlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getDevicePlain(args(argsBuilder).build)

    /** Provides details about existing Network Manager devices. */
    def getDevices(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetDevicesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetDevicesResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetDevicesArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getDevices(args(argsBuilder).build)

    /** Provides details about existing Network Manager devices. */
    def getDevicesPlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetDevicesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetDevicesResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetDevicesPlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getDevicesPlain(args(argsBuilder).build)

    /** Provides details about an existing Network Manager global network. */
    def getGlobalNetwork(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetGlobalNetworkArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetGlobalNetworkResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetGlobalNetworkArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getGlobalNetwork(args(argsBuilder).build)

    /** Provides details about an existing Network Manager global network. */
    def getGlobalNetworkPlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetGlobalNetworkPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetGlobalNetworkResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetGlobalNetworkPlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getGlobalNetworkPlain(args(argsBuilder).build)

    /** Provides details about existing Network Manager global networks. */
    def getGlobalNetworks(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetGlobalNetworksArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetGlobalNetworksResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetGlobalNetworksArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getGlobalNetworks(args(argsBuilder).build)

    /** Provides details about existing Network Manager global networks. */
    def getGlobalNetworksPlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetGlobalNetworksPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetGlobalNetworksResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetGlobalNetworksPlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getGlobalNetworksPlain(args(argsBuilder).build)

    /** Provides details about an existing Network Manager link. */
    def getLink(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetLinkArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetLinkResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetLinkArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getLink(args(argsBuilder).build)

    /** Provides details about an existing Network Manager link. */
    def getLinkPlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetLinkPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetLinkResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetLinkPlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getLinkPlain(args(argsBuilder).build)

    /** Provides details about existing Network Manager links. */
    def getLinks(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetLinksArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetLinksResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetLinksArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getLinks(args(argsBuilder).build)

    /** Provides details about existing Network Manager links. */
    def getLinksPlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetLinksPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetLinksResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetLinksPlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getLinksPlain(args(argsBuilder).build)

    /** Provides details about an existing Network Manager site. */
    def getSite(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetSiteArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetSiteResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetSiteArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getSite(args(argsBuilder).build)

    /** Provides details about an existing Network Manager site. */
    def getSitePlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetSitePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetSiteResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetSitePlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getSitePlain(args(argsBuilder).build)

    /** Provides details about existing Network Manager sites. */
    def getSites(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetSitesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetSitesResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetSitesArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getSites(args(argsBuilder).build)

    /** Provides details about existing Network Manager sites. */
    def getSitesPlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetSitesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetSitesResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetSitesPlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getSitesPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.SiteArgs.Builder)
    /**
     * @param location Site location. See below.
     * @return builder
     */
    def location(args: Endofunction[com.pulumi.aws.networkmanager.inputs.SiteLocationArgs.Builder]):
        com.pulumi.aws.networkmanager.SiteArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.SiteLocationArgs.builder
      builder.location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.DeviceArgs.Builder)
    /**
     * @param awsLocation AWS location of the device. Documented below.
     * @return builder
     */
    def awsLocation(args: Endofunction[com.pulumi.aws.networkmanager.inputs.DeviceAwsLocationArgs.Builder]):
        com.pulumi.aws.networkmanager.DeviceArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.DeviceAwsLocationArgs.builder
      builder.awsLocation(args(argsBuilder).build)

    /**
     * @param location Location of the device. Documented below.
     * @return builder
     */
    def location(args: Endofunction[com.pulumi.aws.networkmanager.inputs.DeviceLocationArgs.Builder]):
        com.pulumi.aws.networkmanager.DeviceArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.DeviceLocationArgs.builder
      builder.location(args(argsBuilder).build)

  /** Manages a Network Manager site. Use this resource to create a site in a global network. */
  def Site(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.SiteArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.SiteArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.networkmanager.Site(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an AWS Network Manager Connect Peer.
   *  
   *  Use this resource to create a Connect peer in AWS Network Manager. Connect peers establish BGP sessions with your on-premises networks through Connect attachments, enabling dynamic routing between your core network and external networks.
   */
  def ConnectPeer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.ConnectPeerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.ConnectPeerArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.networkmanager.ConnectPeer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.networkmanager.inputs.LinkState.Builder)
    /**
     * @param bandwidth Upload speed and download speed in Mbps. See below.
     * @return builder
     */
    def bandwidth(args: Endofunction[com.pulumi.aws.networkmanager.inputs.LinkBandwidthArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.LinkState.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.LinkBandwidthArgs.builder
      builder.bandwidth(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionArgs.Builder)
    /**
     * @param action Block defining the action to take when conditions match. Detailed below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionActionArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param matchConditions List of conditions to match against routes. Detailed below.
     * @return builder
     */
    def matchConditions(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionMatchConditionArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionMatchConditionArgs.builder
      builder.matchConditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.DeviceState.Builder)
    /**
     * @param awsLocation AWS location of the device. Documented below.
     * @return builder
     */
    def awsLocation(args: Endofunction[com.pulumi.aws.networkmanager.inputs.DeviceAwsLocationArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.DeviceState.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.DeviceAwsLocationArgs.builder
      builder.awsLocation(args(argsBuilder).build)

    /**
     * @param location Location of the device. Documented below.
     * @return builder
     */
    def location(args: Endofunction[com.pulumi.aws.networkmanager.inputs.DeviceLocationArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.DeviceState.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.DeviceLocationArgs.builder
      builder.location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.inputs.SiteState.Builder)
    /**
     * @param location Site location. See below.
     * @return builder
     */
    def location(args: Endofunction[com.pulumi.aws.networkmanager.inputs.SiteLocationArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.SiteState.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.SiteLocationArgs.builder
      builder.location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.inputs.DxGatewayAttachmentState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.networkmanager.inputs.DxGatewayAttachmentTimeoutsArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.DxGatewayAttachmentState.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.DxGatewayAttachmentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.inputs.CoreNetworkState.Builder)
    /**
     * @param edges One or more blocks detailing the edges within a core network. Detailed below.
     * @return builder
     */
    def edges(args: Endofunction[com.pulumi.aws.networkmanager.inputs.CoreNetworkEdgeArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.CoreNetworkState.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.CoreNetworkEdgeArgs.builder
      builder.edges(args.map(_(argsBuilder).build)*)

    /**
     * @param segments One or more blocks detailing the segments within a core network. Detailed below.
     * @return builder
     */
    def segments(args: Endofunction[com.pulumi.aws.networkmanager.inputs.CoreNetworkSegmentArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.CoreNetworkState.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.CoreNetworkSegmentArgs.builder
      builder.segments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyArgs.Builder)
    /**
     * @param action Action to take when a condition is true. Detailed Below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyActionArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param conditions A block argument. Detailed Below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyConditionArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.ConnectPeerConfigurationArgs.Builder)
    def bgpConfigurations(args: Endofunction[com.pulumi.aws.networkmanager.inputs.ConnectPeerConfigurationBgpConfigurationArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.ConnectPeerConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.ConnectPeerConfigurationBgpConfigurationArgs.builder
      builder.bgpConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.ConnectAttachmentState.Builder)
    /**
     * @param options Options block. See options for more information.
     * @return builder
     */
    def options(args: Endofunction[com.pulumi.aws.networkmanager.inputs.ConnectAttachmentOptionsArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.ConnectAttachmentState.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.ConnectAttachmentOptionsArgs.builder
      builder.options(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionArgs.Builder)
    /**
     * @param edgeLocationAssociation Associates routing policies with specific edge location pairs. Available in policy version `2025.11` and later. Detailed below.
     * @return builder
     */
    def edgeLocationAssociation(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionEdgeLocationAssociationArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionEdgeLocationAssociationArgs.builder
      builder.edgeLocationAssociation(args(argsBuilder).build)

    /**
     * @param via The network function groups and any edge overrides associated with the action.
     * @return builder
     */
    def via(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionViaArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionViaArgs.builder
      builder.via(args(argsBuilder).build)

    /**
     * @param whenSentTo The destination segments for the `send-via` or `send-to` `action`.
     * @return builder
     */
    def whenSentTo(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionWhenSentToArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionWhenSentToArgs.builder
      builder.whenSentTo(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.inputs.ConnectPeerState.Builder)
    /**
     * @param bgpOptions Connect peer BGP options. See bgpOptions for more information.
     * @return builder
     */
    def bgpOptions(args: Endofunction[com.pulumi.aws.networkmanager.inputs.ConnectPeerBgpOptionsArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.ConnectPeerState.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.ConnectPeerBgpOptionsArgs.builder
      builder.bgpOptions(args(argsBuilder).build)

    /**
     * @param configurations Configuration of the Connect peer.
     * @return builder
     */
    def configurations(args: Endofunction[com.pulumi.aws.networkmanager.inputs.ConnectPeerConfigurationArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.ConnectPeerState.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.ConnectPeerConfigurationArgs.builder
      builder.configurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionViaArgs.Builder)
    /**
     * @param withEdgeOverrides Any edge overrides and the preferred edge to use.
     * @return builder
     */
    def withEdgeOverrides(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionViaWithEdgeOverrideArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionViaArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionViaWithEdgeOverrideArgs.builder
      builder.withEdgeOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyArgs.Builder)
    /**
     * @param routingPolicyRules List of routing policy rules. Each rule defines match conditions and actions. Detailed below.
     * @return builder
     */
    def routingPolicyRules(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleArgs.builder
      builder.routingPolicyRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.VpcAttachmentState.Builder)
    /**
     * @param options Options for the VPC attachment. See below.
     * @return builder
     */
    def options(args: Endofunction[com.pulumi.aws.networkmanager.inputs.VpcAttachmentOptionsArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.VpcAttachmentState.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.VpcAttachmentOptionsArgs.builder
      builder.options(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleArgs.Builder)
    /**
     * @param action Block defining the action to take when conditions match. Detailed below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleActionArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param conditions A block argument. Detailed below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleConditionArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationArgs.Builder)
    /**
     * @param edgeLocations A block value of AWS Region locations where you&#39;re creating Core Network Edges. Detailed below.
     * @return builder
     */
    def edgeLocations(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationArgs.builder
      builder.edgeLocations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs.Builder)
    /**
     * @param attachmentPolicies In a core network, all attachments use the block argument `attachmentPolicies` section to map an attachment to a segment. Instead of manually associating a segment to each attachment, attachments use tags, and then the tags are used to associate the attachment to the specified segment. Detailed below.
     * @return builder
     */
    def attachmentPolicies(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyArgs.builder
      builder.attachmentPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param attachmentRoutingPolicyRules Block argument that applies routing policies to attachments. Available in policy version `2025.11` and later. Detailed below.
     * @return builder
     */
    def attachmentRoutingPolicyRules(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleArgs.builder
      builder.attachmentRoutingPolicyRules(args.map(_(argsBuilder).build)*)

    /**
     * @param coreNetworkConfigurations The core network configuration section defines the Regions where a core network should operate. For AWS Regions that are defined in the policy, the core network creates a Core Network Edge where you can connect attachments. After it&#39;s created, each Core Network Edge is peered with every other defined Region and is configured with consistent segment and routing across all Regions. Regions cannot be removed until the associated attachments are deleted. Detailed below.
     * @return builder
     */
    def coreNetworkConfigurations(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationArgs.builder
      builder.coreNetworkConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param networkFunctionGroups Block argument that defines the service insertion actions you want to include. Detailed below.
     * @return builder
     */
    def networkFunctionGroups(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentNetworkFunctionGroupArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentNetworkFunctionGroupArgs.builder
      builder.networkFunctionGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param routingPolicies Block argument that defines routing policies for controlling route propagation. Routing policies allow you to filter, modify, and control BGP routes advertised to and from your core network. Available in policy version `2025.11` and later. Detailed below.
     * @return builder
     */
    def routingPolicies(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyArgs.builder
      builder.routingPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param segmentActions A block argument, `segmentActions` define how routing works between segments. By default, attachments can only communicate with other attachments in the same segment. Detailed below.
     * @return builder
     */
    def segmentActions(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionArgs.builder
      builder.segmentActions(args.map(_(argsBuilder).build)*)

    /**
     * @param segments Block argument that defines the different segments in the network. Here you can provide descriptions, change defaults, and provide explicit Regional operational and route filters. The names defined for each segment are used in the `segmentActions` and `attachmentPolicies` section. Each segment is created, and operates, as a completely separated routing domain. By default, attachments can only communicate with other attachments in the same segment. Detailed below.
     * @return builder
     */
    def segments(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentArgs.builder
      builder.segments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleArgs.Builder)
    /**
     * @param ruleDefinition Defines the match conditions and actions for the rule. Detailed below.
     * @return builder
     */
    def ruleDefinition(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionArgs.builder
      builder.ruleDefinition(args(argsBuilder).build)
