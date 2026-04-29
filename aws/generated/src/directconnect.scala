package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object directconnect:
  /**
   * Provides a Direct Connect transit virtual interface resource.
   *  A transit virtual interface is a VLAN that transports traffic from a Direct Connect gateway to one or more transit gateways.
   */
  def TransitVirtualInterface(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directconnect.TransitVirtualInterfaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.directconnect.TransitVirtualInterfaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.directconnect.TransitVirtualInterface(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a MAC Security (MACSec) secret key resource for use with Direct Connect. See [MACsec prerequisites](https://docs.aws.amazon.com/directconnect/latest/UserGuide/direct-connect-mac-sec-getting-started.html#mac-sec-prerequisites) for information about MAC Security (MACsec) prerequisites.
   *  
   *  Creating this resource will also create a resource of type `aws.secretsmanager.Secret` which is managed by Direct Connect. While you can import this resource into your state, because this secret is managed by Direct Connect, you will not be able to make any modifications to it. See [How AWS Direct Connect uses AWS Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/integrating_how-services-use-secrets_directconnect.html) for details.
   *  
   *  &gt; **Note:** All arguments including `ckn` and `cak` will be stored in the raw state as plain-text.
   *  **Note:** The `secretArn` argument can only be used to reference a previously created MACSec key. You cannot associate a Secrets Manager secret created outside of the `aws.directconnect.MacsecKeyAssociation` resource.
   */
  def MacsecKeyAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directconnect.MacsecKeyAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.directconnect.MacsecKeyAssociationArgs.builder
    
    com.pulumi.aws.directconnect.MacsecKeyAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Direct Connect LAG. Connections can be added to the LAG via the `aws.directconnect.Connection` and `aws.directconnect.ConnectionAssociation` resources.
   *  
   *  &gt; *NOTE:* When creating a LAG, if no existing connection is specified, Direct Connect will create a connection and this provider will remove this unmanaged connection during resource creation.
   */
  def LinkAggregationGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directconnect.LinkAggregationGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.directconnect.LinkAggregationGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.directconnect.LinkAggregationGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a hosted connection on the specified interconnect or a link aggregation group (LAG) of interconnects. Intended for use by AWS Direct Connect Partners only. */
  def HostedConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directconnect.HostedConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.directconnect.HostedConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.directconnect.HostedConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Direct Connect public virtual interface resource. */
  def PublicVirtualInterface(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directconnect.PublicVirtualInterfaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.directconnect.PublicVirtualInterfaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.directconnect.PublicVirtualInterface(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to manage the accepter&#39;s side of a Direct Connect hosted transit virtual interface.
   *  This resource accepts ownership of a transit virtual interface created by another AWS account.
   *  
   *  &gt; **NOTE:** AWS allows a Direct Connect hosted transit virtual interface to be deleted from either the allocator&#39;s or accepter&#39;s side. However, this provider only allows the Direct Connect hosted transit virtual interface to be deleted from the allocator&#39;s side by removing the corresponding `aws.directconnect.HostedTransitVirtualInterface` resource from your configuration. Removing a `aws.directconnect.HostedTransitVirtualInterfaceAcceptor` resource from your configuration will remove it from your statefile and management, **but will not delete the Direct Connect virtual interface.**
   */
  def HostedTransitVirtualInterfaceAcceptor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directconnect.HostedTransitVirtualInterfaceAcceptorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.directconnect.HostedTransitVirtualInterfaceAcceptorArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.directconnect.HostedTransitVirtualInterfaceAcceptor(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Direct Connect Gateway. */
  def Gateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directconnect.GatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.directconnect.GatewayArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.directconnect.Gateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Associates a Direct Connect Gateway with a VGW or transit gateway.
   *  
   *  To create a cross-account association, create an `aws.directconnect.GatewayAssociationProposal` resource
   *  in the AWS account that owns the VGW or transit gateway and then accept the proposal in the AWS account that owns the Direct Connect Gateway
   *  by creating an `aws.directconnect.GatewayAssociation` resource with the `proposalId` and `associatedGatewayOwnerAccountId` attributes set.
   */
  def GatewayAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directconnect.GatewayAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.directconnect.GatewayAssociationArgs.builder
    
    com.pulumi.aws.directconnect.GatewayAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Associates a Direct Connect Connection with a LAG. */
  def ConnectionAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directconnect.ConnectionAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.directconnect.ConnectionAssociationArgs.builder
    
    com.pulumi.aws.directconnect.ConnectionAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Direct Connect hosted private virtual interface resource. This resource represents the allocator&#39;s side of the hosted virtual interface.
   *  A hosted virtual interface is a virtual interface that is owned by another AWS account.
   */
  def HostedPrivateVirtualInterface(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directconnect.HostedPrivateVirtualInterfaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.directconnect.HostedPrivateVirtualInterfaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.directconnect.HostedPrivateVirtualInterface(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Direct Connect BGP peer resource. */
  def BgpPeer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directconnect.BgpPeerArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.directconnect.BgpPeerArgs.builder
    
    com.pulumi.aws.directconnect.BgpPeer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Direct Connect Gateway Association Proposal, typically for enabling cross-account associations. For single account associations, see the `aws.directconnect.GatewayAssociation` resource. */
  def GatewayAssociationProposal(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directconnect.GatewayAssociationProposalArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.directconnect.GatewayAssociationProposalArgs.builder
    
    com.pulumi.aws.directconnect.GatewayAssociationProposal(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type DirectconnectFunctions = com.pulumi.aws.directconnect.DirectconnectFunctions
  object DirectconnectFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.directconnect.DirectconnectFunctions.*
  extension (self: DirectconnectFunctions.type)
    /** Retrieve information about a Direct Connect Connection. */
    def getConnection(args: Endofunction[com.pulumi.aws.directconnect.inputs.GetConnectionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.directconnect.outputs.GetConnectionResult] =
      val argsBuilder = com.pulumi.aws.directconnect.inputs.GetConnectionArgs.builder
      com.pulumi.aws.directconnect.DirectconnectFunctions.getConnection(args(argsBuilder).build)

    /** Retrieve information about a Direct Connect Connection. */
    def getConnectionPlain(args: Endofunction[com.pulumi.aws.directconnect.inputs.GetConnectionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.directconnect.outputs.GetConnectionResult] =
      val argsBuilder = com.pulumi.aws.directconnect.inputs.GetConnectionPlainArgs.builder
      com.pulumi.aws.directconnect.DirectconnectFunctions.getConnectionPlain(args(argsBuilder).build)

    /** Retrieve information about a Direct Connect Gateway. */
    def getGateway(args: Endofunction[com.pulumi.aws.directconnect.inputs.GetGatewayArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.directconnect.outputs.GetGatewayResult] =
      val argsBuilder = com.pulumi.aws.directconnect.inputs.GetGatewayArgs.builder
      com.pulumi.aws.directconnect.DirectconnectFunctions.getGateway(args(argsBuilder).build)

    /** Retrieve information about a Direct Connect Gateway. */
    def getGatewayPlain(args: Endofunction[com.pulumi.aws.directconnect.inputs.GetGatewayPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.directconnect.outputs.GetGatewayResult] =
      val argsBuilder = com.pulumi.aws.directconnect.inputs.GetGatewayPlainArgs.builder
      com.pulumi.aws.directconnect.DirectconnectFunctions.getGatewayPlain(args(argsBuilder).build)

    /**
     * Retrieve information about a specific AWS Direct Connect location in the current AWS Region.
     *  These are the locations that can be specified when configuring `aws.directconnect.Connection` or `aws.directconnect.LinkAggregationGroup` resources.
     *  
     *  &gt; **Note:** This data source is different from the `aws.directconnect.getLocations` data source which retrieves information about all the AWS Direct Connect locations in the current AWS Region.
     */
    def getLocation(args: Endofunction[com.pulumi.aws.directconnect.inputs.GetLocationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.directconnect.outputs.GetLocationResult] =
      val argsBuilder = com.pulumi.aws.directconnect.inputs.GetLocationArgs.builder
      com.pulumi.aws.directconnect.DirectconnectFunctions.getLocation(args(argsBuilder).build)

    /**
     * Retrieve information about a specific AWS Direct Connect location in the current AWS Region.
     *  These are the locations that can be specified when configuring `aws.directconnect.Connection` or `aws.directconnect.LinkAggregationGroup` resources.
     *  
     *  &gt; **Note:** This data source is different from the `aws.directconnect.getLocations` data source which retrieves information about all the AWS Direct Connect locations in the current AWS Region.
     */
    def getLocationPlain(args: Endofunction[com.pulumi.aws.directconnect.inputs.GetLocationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.directconnect.outputs.GetLocationResult] =
      val argsBuilder = com.pulumi.aws.directconnect.inputs.GetLocationPlainArgs.builder
      com.pulumi.aws.directconnect.DirectconnectFunctions.getLocationPlain(args(argsBuilder).build)

    /**
     * Retrieve information about the AWS Direct Connect locations in the current AWS Region.
     *  These are the locations that can be specified when configuring `aws.directconnect.Connection` or `aws.directconnect.LinkAggregationGroup` resources.
     *  
     *  &gt; **Note:** This data source is different from the `aws.directconnect.getLocation` data source which retrieves information about a specific AWS Direct Connect location in the current AWS Region.
     */
    def getLocations(args: Endofunction[com.pulumi.aws.directconnect.inputs.GetLocationsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.directconnect.outputs.GetLocationsResult] =
      val argsBuilder = com.pulumi.aws.directconnect.inputs.GetLocationsArgs.builder
      com.pulumi.aws.directconnect.DirectconnectFunctions.getLocations(args(argsBuilder).build)

    /**
     * Retrieve information about the AWS Direct Connect locations in the current AWS Region.
     *  These are the locations that can be specified when configuring `aws.directconnect.Connection` or `aws.directconnect.LinkAggregationGroup` resources.
     *  
     *  &gt; **Note:** This data source is different from the `aws.directconnect.getLocation` data source which retrieves information about a specific AWS Direct Connect location in the current AWS Region.
     */
    def getLocationsPlain(args: Endofunction[com.pulumi.aws.directconnect.inputs.GetLocationsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.directconnect.outputs.GetLocationsResult] =
      val argsBuilder = com.pulumi.aws.directconnect.inputs.GetLocationsPlainArgs.builder
      com.pulumi.aws.directconnect.DirectconnectFunctions.getLocationsPlain(args(argsBuilder).build)

    /** Data source for retrieving Router Configuration instructions for a given AWS Direct Connect Virtual Interface and Router Type. */
    def getRouterConfiguration(args: Endofunction[com.pulumi.aws.directconnect.inputs.GetRouterConfigurationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.directconnect.outputs.GetRouterConfigurationResult] =
      val argsBuilder = com.pulumi.aws.directconnect.inputs.GetRouterConfigurationArgs.builder
      com.pulumi.aws.directconnect.DirectconnectFunctions.getRouterConfiguration(args(argsBuilder).build)

    /** Data source for retrieving Router Configuration instructions for a given AWS Direct Connect Virtual Interface and Router Type. */
    def getRouterConfigurationPlain(args: Endofunction[com.pulumi.aws.directconnect.inputs.GetRouterConfigurationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.directconnect.outputs.GetRouterConfigurationResult] =
      val argsBuilder = com.pulumi.aws.directconnect.inputs.GetRouterConfigurationPlainArgs.builder
      com.pulumi.aws.directconnect.DirectconnectFunctions.getRouterConfigurationPlain(args(argsBuilder).build)

  /**
   * Provides a resource to manage the accepter&#39;s side of a Direct Connect hosted private virtual interface.
   *  This resource accepts ownership of a private virtual interface created by another AWS account.
   */
  def HostedPrivateVirtualInterfaceAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directconnect.HostedPrivateVirtualInterfaceAccepterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.directconnect.HostedPrivateVirtualInterfaceAccepterArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.directconnect.HostedPrivateVirtualInterfaceAccepter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Connection of Direct Connect. */
  def Connection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directconnect.ConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.directconnect.ConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.directconnect.Connection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Direct Connect hosted transit virtual interface resource.
   *  This resource represents the allocator&#39;s side of the hosted virtual interface.
   *  A hosted virtual interface is a virtual interface that is owned by another AWS account.
   */
  def HostedTransitVirtualInterface(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directconnect.HostedTransitVirtualInterfaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.directconnect.HostedTransitVirtualInterfaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.directconnect.HostedTransitVirtualInterface(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to manage the accepter&#39;s side of a Direct Connect hosted public virtual interface.
   *  This resource accepts ownership of a public virtual interface created by another AWS account.
   */
  def HostedPublicVirtualInterfaceAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directconnect.HostedPublicVirtualInterfaceAccepterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.directconnect.HostedPublicVirtualInterfaceAccepterArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.directconnect.HostedPublicVirtualInterfaceAccepter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Direct Connect private virtual interface resource. */
  def PrivateVirtualInterface(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directconnect.PrivateVirtualInterfaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.directconnect.PrivateVirtualInterfaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.directconnect.PrivateVirtualInterface(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a confirmation of the creation of the specified hosted connection on an interconnect. */
  def ConnectionConfirmation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directconnect.ConnectionConfirmationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.directconnect.ConnectionConfirmationArgs.builder
    
    com.pulumi.aws.directconnect.ConnectionConfirmation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Direct Connect hosted public virtual interface resource. This resource represents the allocator&#39;s side of the hosted virtual interface.
   *  A hosted virtual interface is a virtual interface that is owned by another AWS account.
   */
  def HostedPublicVirtualInterface(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directconnect.HostedPublicVirtualInterfaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.directconnect.HostedPublicVirtualInterfaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.directconnect.HostedPublicVirtualInterface(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
