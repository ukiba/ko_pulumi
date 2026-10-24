package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object networkmanager:
  /**
   * Manages an AWS Network Manager Attachment Accepter.
   * 
   * Use this resource to accept cross-account attachments in AWS Network Manager. When an attachment is created in one account and needs to be accepted by another account that owns the core network, this resource handles the acceptance process.
   */
  def AttachmentAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.AttachmentAccepterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.networkmanager.AttachmentAccepterArgs.builder
    com.pulumi.aws.networkmanager.AttachmentAccepter(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Associates a routing policy label to a Network Manager Cloud WAN&#39;s attachment outside of the attachment creation. This is useful in multi-account environments where only the Cloud WAN core network owner account can apply a routing policy label. */
  def AttachmentRoutingPolicyLabel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.AttachmentRoutingPolicyLabelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.networkmanager.AttachmentRoutingPolicyLabelArgs.builder
    com.pulumi.aws.networkmanager.AttachmentRoutingPolicyLabel(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS Network Manager Connect Attachment.
   * 
   * Use this resource to create a Connect attachment in AWS Network Manager. Connect attachments enable you to connect your on-premises networks to your core network through a VPC or Transit Gateway attachment.
   */
  def ConnectAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.ConnectAttachmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.ConnectAttachmentArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.networkmanager.ConnectAttachment(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS Network Manager Connect Peer.
   * 
   * Use this resource to create a Connect peer in AWS Network Manager. Connect peers establish BGP sessions with your on-premises networks through Connect attachments, enabling dynamic routing between your core network and external networks.
   */
  def ConnectPeer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.ConnectPeerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.ConnectPeerArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.networkmanager.ConnectPeer(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Network Manager Connection.
   * 
   * Use this resource to create a connection between two devices in your global network.
   */
  def Connection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.ConnectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.ConnectionArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.networkmanager.Connection(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Network Manager Core Network.
   * 
   * Use this resource to create and manage a core network within a global network.
   */
  def CoreNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.CoreNetworkArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.CoreNetworkArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.networkmanager.CoreNetwork(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Network Manager Core Network Policy Attachment.
   * 
   * Use this resource to attach a Core Network Policy to an existing Core Network and execute the change set, which deploys changes globally based on the policy submitted (sets the policy to `LIVE`).
   * 
   * &gt; **NOTE:** Deleting this resource will not delete the current policy defined in this resource. Deleting this resource will also not revert the current `LIVE` policy to the previous version.
   */
  def CoreNetworkPolicyAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.CoreNetworkPolicyAttachmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.networkmanager.CoreNetworkPolicyAttachmentArgs.builder
    com.pulumi.aws.networkmanager.CoreNetworkPolicyAttachment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Network Manager Customer Gateway Association.
   * 
   * Use this resource to associate a customer gateway with a device and optionally, with a link. If you specify a link, it must be associated with the specified device.
   */
  def CustomerGatewayAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.CustomerGatewayAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.networkmanager.CustomerGatewayAssociationArgs.builder
    com.pulumi.aws.networkmanager.CustomerGatewayAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Network Manager Device.
   * 
   * Use this resource to create a device in a global network. If you specify both a site ID and a location, the location of the site is used for visualization in the Network Manager console.
   */
  def Device(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.DeviceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.DeviceArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.networkmanager.Device(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Network Manager Direct Connect Gateway Attachment.
   * 
   * Use this resource to create and manage a Direct Connect Gateway attachment to a Cloud WAN core network.
   */
  def DxGatewayAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.DxGatewayAttachmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.DxGatewayAttachmentArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.networkmanager.DxGatewayAttachment(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Network Manager Global Network.
   * 
   * Use this resource to create and manage a global network, which is a single private network that acts as the high-level container for your network objects.
   */
  def GlobalNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.GlobalNetworkArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.GlobalNetworkArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.networkmanager.GlobalNetwork(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager link. Use this resource to create a link for a site. */
  def Link(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.LinkArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.LinkArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.networkmanager.Link(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager link association. Associates a link to a device. A device can be associated to multiple links and a link can be associated to multiple devices. The device and link must be in the same global network and the same site. */
  def LinkAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.LinkAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.networkmanager.LinkAssociationArgs.builder
    com.pulumi.aws.networkmanager.LinkAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object NetworkmanagerFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides details about an existing Network Manager connection. */
    inline def getConnection(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetConnectionArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetConnectionResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetConnectionArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getConnection(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about an existing Network Manager connection. */
    inline def getConnectionPlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetConnectionPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetConnectionResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetConnectionPlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getConnectionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about existing Network Manager connections. */
    inline def getConnections(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetConnectionsArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetConnectionsResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetConnectionsArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getConnections(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about existing Network Manager connections. */
    inline def getConnectionsPlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetConnectionsPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetConnectionsResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetConnectionsPlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getConnectionsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about an AWS Network Manager Core Network. */
    inline def getCoreNetwork(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetCoreNetworkResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getCoreNetwork(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about an AWS Network Manager Core Network. */
    inline def getCoreNetworkPlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetCoreNetworkResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getCoreNetworkPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Generates a Core Network policy document in JSON format for use with resources that expect core network policy documents such as `awsccNetworkmanagerCoreNetwork`. It follows the API definition from the [core-network-policy documentation](https://docs.aws.amazon.com/vpc/latest/cloudwan/cloudwan-policies-json.html).
     * 
     * Using this data source to generate policy documents is *optional*. It is also valid to use literal JSON strings in your configuration or to use the `file` interpolation function to read a raw JSON policy document from a file.
     */
    inline def getCoreNetworkPolicyDocument(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetCoreNetworkPolicyDocumentResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getCoreNetworkPolicyDocument(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Generates a Core Network policy document in JSON format for use with resources that expect core network policy documents such as `awsccNetworkmanagerCoreNetwork`. It follows the API definition from the [core-network-policy documentation](https://docs.aws.amazon.com/vpc/latest/cloudwan/cloudwan-policies-json.html).
     * 
     * Using this data source to generate policy documents is *optional*. It is also valid to use literal JSON strings in your configuration or to use the `file` interpolation function to read a raw JSON policy document from a file.
     */
    inline def getCoreNetworkPolicyDocumentPlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetCoreNetworkPolicyDocumentResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentPlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getCoreNetworkPolicyDocumentPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about an existing Network Manager device. */
    inline def getDevice(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetDeviceArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetDeviceResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetDeviceArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getDevice(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about an existing Network Manager device. */
    inline def getDevicePlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetDevicePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetDeviceResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetDevicePlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getDevicePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about existing Network Manager devices. */
    inline def getDevices(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetDevicesArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetDevicesResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetDevicesArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getDevices(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about existing Network Manager devices. */
    inline def getDevicesPlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetDevicesPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetDevicesResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetDevicesPlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getDevicesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about an existing Network Manager global network. */
    inline def getGlobalNetwork(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetGlobalNetworkArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetGlobalNetworkResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetGlobalNetworkArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getGlobalNetwork(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about an existing Network Manager global network. */
    inline def getGlobalNetworkPlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetGlobalNetworkPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetGlobalNetworkResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetGlobalNetworkPlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getGlobalNetworkPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about existing Network Manager global networks. */
    inline def getGlobalNetworks(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetGlobalNetworksArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetGlobalNetworksResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetGlobalNetworksArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getGlobalNetworks(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about existing Network Manager global networks. */
    inline def getGlobalNetworksPlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetGlobalNetworksPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetGlobalNetworksResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetGlobalNetworksPlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getGlobalNetworksPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about an existing Network Manager link. */
    inline def getLink(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetLinkArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetLinkResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetLinkArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getLink(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about an existing Network Manager link. */
    inline def getLinkPlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetLinkPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetLinkResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetLinkPlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getLinkPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about existing Network Manager links. */
    inline def getLinks(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetLinksArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetLinksResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetLinksArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getLinks(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about existing Network Manager links. */
    inline def getLinksPlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetLinksPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetLinksResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetLinksPlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getLinksPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about an existing Network Manager site. */
    inline def getSite(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetSiteArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetSiteResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetSiteArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getSite(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about an existing Network Manager site. */
    inline def getSitePlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetSitePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetSiteResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetSitePlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getSitePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about existing Network Manager sites. */
    inline def getSites(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetSitesArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.networkmanager.outputs.GetSitesResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetSitesArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getSites(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about existing Network Manager sites. */
    inline def getSitesPlain(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetSitesPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.networkmanager.outputs.GetSitesResult] =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetSitesPlainArgs.builder
      com.pulumi.aws.networkmanager.NetworkmanagerFunctions.getSitesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Associates an EC2 managed prefix list with a Network Manager Cloud WAN core network. Once associated, the prefix list can be referenced in the core network policy document.
   * 
   * &gt; **NOTE:** The prefix list must be defined in the [Cloud WAN home region](https://docs.aws.amazon.com/network-manager/latest/cloudwan/what-is-cloudwan.html#cloudwan-home-region) (us-west-2). Although defined in the Cloud WAN home region, the prefix-list based policy will apply globally to all the relevant core network edges (regions) in your core network.
   */
  def PrefixListAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.PrefixListAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.networkmanager.PrefixListAssociationArgs.builder
    com.pulumi.aws.networkmanager.PrefixListAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager site. Use this resource to create a site in a global network. */
  def Site(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.SiteArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.SiteArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.networkmanager.Site(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager site-to-site VPN attachment. */
  def SiteToSiteVpnAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.SiteToSiteVpnAttachmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.SiteToSiteVpnAttachmentArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.networkmanager.SiteToSiteVpnAttachment(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager transit gateway Connect peer association. Associates a transit gateway Connect peer with a device, and optionally, with a link. If you specify a link, it must be associated with the specified device. */
  def TransitGatewayConnectPeerAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.TransitGatewayConnectPeerAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.networkmanager.TransitGatewayConnectPeerAssociationArgs.builder
    com.pulumi.aws.networkmanager.TransitGatewayConnectPeerAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager transit gateway peering connection. Creates a peering connection between an AWS Cloud WAN core network and an AWS Transit Gateway. */
  def TransitGatewayPeering(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.TransitGatewayPeeringArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.TransitGatewayPeeringArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.networkmanager.TransitGatewayPeering(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager transit gateway registration. Registers a transit gateway to a global network. The transit gateway can be in any AWS Region, but it must be owned by the same AWS account that owns the global network. You cannot register a transit gateway in more than one global network. */
  def TransitGatewayRegistration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.TransitGatewayRegistrationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.networkmanager.TransitGatewayRegistrationArgs.builder
    com.pulumi.aws.networkmanager.TransitGatewayRegistration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager transit gateway route table attachment. */
  def TransitGatewayRouteTableAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.TransitGatewayRouteTableAttachmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.TransitGatewayRouteTableAttachmentArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.networkmanager.TransitGatewayRouteTableAttachment(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Network Manager VPC attachment. */
  def VpcAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.networkmanager.VpcAttachmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkmanager.VpcAttachmentArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.networkmanager.VpcAttachment(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
