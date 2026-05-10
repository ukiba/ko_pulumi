package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object privatelink:
  /** Manages an association between Private Endpoint and Application Security Group. */
  def ApplicationSecurityGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.privatelink.ApplicationSecurityGroupAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.privatelink.ApplicationSecurityGroupAssociationArgs.builder
    com.pulumi.azure.privatelink.ApplicationSecurityGroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Private Endpoint.
   * 
   *  Azure Private Endpoint is a network interface that connects you privately and securely to a service powered by Azure Private Link. Private Endpoint uses a private IP address from your VNet, effectively bringing the service into your VNet. The service could be an Azure service such as Azure Storage, SQL, etc. or your own Private Link Service.
   */
  def Endpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.privatelink.EndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.privatelink.EndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.privatelink.Endpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type PrivatelinkFunctions = com.pulumi.azure.privatelink.PrivatelinkFunctions
  object PrivatelinkFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.privatelink.PrivatelinkFunctions.*
  extension (self: PrivatelinkFunctions.type)
    /** Use this data source to access the connection status information about an existing Private Endpoint Connection. */
    def getEndpointConnection(args: Endofunction[com.pulumi.azure.privatelink.inputs.GetEndpointConnectionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatelink.outputs.GetEndpointConnectionResult] =
      val argsBuilder = com.pulumi.azure.privatelink.inputs.GetEndpointConnectionArgs.builder
      com.pulumi.azure.privatelink.PrivatelinkFunctions.getEndpointConnection(args(argsBuilder).build)

    /** Use this data source to access the connection status information about an existing Private Endpoint Connection. */
    def getEndpointConnectionPlain(args: Endofunction[com.pulumi.azure.privatelink.inputs.GetEndpointConnectionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatelink.outputs.GetEndpointConnectionResult] =
      val argsBuilder = com.pulumi.azure.privatelink.inputs.GetEndpointConnectionPlainArgs.builder
      com.pulumi.azure.privatelink.PrivatelinkFunctions.getEndpointConnectionPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Private Link Service. */
    def getService(args: Endofunction[com.pulumi.azure.privatelink.inputs.GetServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatelink.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.privatelink.inputs.GetServiceArgs.builder
      com.pulumi.azure.privatelink.PrivatelinkFunctions.getService(args(argsBuilder).build)

    /** Use this data source to access information about an existing Private Link Service. */
    def getServicePlain(args: Endofunction[com.pulumi.azure.privatelink.inputs.GetServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatelink.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.privatelink.inputs.GetServicePlainArgs.builder
      com.pulumi.azure.privatelink.PrivatelinkFunctions.getServicePlain(args(argsBuilder).build)

    /** Use this data source to access endpoint connection information about an existing Private Link Service. */
    def getServiceEndpointConnections(args: Endofunction[com.pulumi.azure.privatelink.inputs.GetServiceEndpointConnectionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatelink.outputs.GetServiceEndpointConnectionsResult] =
      val argsBuilder = com.pulumi.azure.privatelink.inputs.GetServiceEndpointConnectionsArgs.builder
      com.pulumi.azure.privatelink.PrivatelinkFunctions.getServiceEndpointConnections(args(argsBuilder).build)

    /** Use this data source to access endpoint connection information about an existing Private Link Service. */
    def getServiceEndpointConnectionsPlain(args: Endofunction[com.pulumi.azure.privatelink.inputs.GetServiceEndpointConnectionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatelink.outputs.GetServiceEndpointConnectionsResult] =
      val argsBuilder = com.pulumi.azure.privatelink.inputs.GetServiceEndpointConnectionsPlainArgs.builder
      com.pulumi.azure.privatelink.PrivatelinkFunctions.getServiceEndpointConnectionsPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.privatelink.EndpointArgs.Builder)
    /**
     * @param ipConfigurations One or more `ipConfiguration` blocks as defined below. This allows a static IP address to be set for this Private Endpoint, otherwise an address is dynamically allocated from the Subnet.
     * @return builder
     */
    def ipConfigurations(args: Endofunction[com.pulumi.azure.privatelink.inputs.EndpointIpConfigurationArgs.Builder]*):
        com.pulumi.azure.privatelink.EndpointArgs.Builder =
      def argsBuilder = com.pulumi.azure.privatelink.inputs.EndpointIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param privateDnsZoneGroup A `privateDnsZoneGroup` block as defined below.
     * @return builder
     */
    def privateDnsZoneGroup(args: Endofunction[com.pulumi.azure.privatelink.inputs.EndpointPrivateDnsZoneGroupArgs.Builder]):
        com.pulumi.azure.privatelink.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.azure.privatelink.inputs.EndpointPrivateDnsZoneGroupArgs.builder
      builder.privateDnsZoneGroup(args(argsBuilder).build)

    /**
     * @param privateServiceConnection A `privateServiceConnection` block as defined below.
     * @return builder
     */
    def privateServiceConnection(args: Endofunction[com.pulumi.azure.privatelink.inputs.EndpointPrivateServiceConnectionArgs.Builder]):
        com.pulumi.azure.privatelink.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.azure.privatelink.inputs.EndpointPrivateServiceConnectionArgs.builder
      builder.privateServiceConnection(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.privatelink.EndpointArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.privatelink.inputs.EndpointPrivateDnsZoneConfigArgs.Builder)
    /**
     * @param recordSets A `recordSets` block as defined below.
     * @return builder
     */
    def recordSets(args: Endofunction[com.pulumi.azure.privatelink.inputs.EndpointPrivateDnsZoneConfigRecordSetArgs.Builder]*):
        com.pulumi.azure.privatelink.inputs.EndpointPrivateDnsZoneConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.privatelink.inputs.EndpointPrivateDnsZoneConfigRecordSetArgs.builder
      builder.recordSets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.privatelink.inputs.EndpointState.Builder)
    /**
     * @param customDnsConfigs A `customDnsConfigs` block as defined below.
     * @return builder
     */
    def customDnsConfigs(args: Endofunction[com.pulumi.azure.privatelink.inputs.EndpointCustomDnsConfigArgs.Builder]*):
        com.pulumi.azure.privatelink.inputs.EndpointState.Builder =
      def argsBuilder = com.pulumi.azure.privatelink.inputs.EndpointCustomDnsConfigArgs.builder
      builder.customDnsConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param ipConfigurations One or more `ipConfiguration` blocks as defined below. This allows a static IP address to be set for this Private Endpoint, otherwise an address is dynamically allocated from the Subnet.
     * @return builder
     */
    def ipConfigurations(args: Endofunction[com.pulumi.azure.privatelink.inputs.EndpointIpConfigurationArgs.Builder]*):
        com.pulumi.azure.privatelink.inputs.EndpointState.Builder =
      def argsBuilder = com.pulumi.azure.privatelink.inputs.EndpointIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param networkInterfaces A `networkInterface` block as defined below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.azure.privatelink.inputs.EndpointNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.privatelink.inputs.EndpointState.Builder =
      def argsBuilder = com.pulumi.azure.privatelink.inputs.EndpointNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param privateDnsZoneConfigs A `privateDnsZoneConfigs` block as defined below.
     * @return builder
     */
    def privateDnsZoneConfigs(args: Endofunction[com.pulumi.azure.privatelink.inputs.EndpointPrivateDnsZoneConfigArgs.Builder]*):
        com.pulumi.azure.privatelink.inputs.EndpointState.Builder =
      def argsBuilder = com.pulumi.azure.privatelink.inputs.EndpointPrivateDnsZoneConfigArgs.builder
      builder.privateDnsZoneConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param privateDnsZoneGroup A `privateDnsZoneGroup` block as defined below.
     * @return builder
     */
    def privateDnsZoneGroup(args: Endofunction[com.pulumi.azure.privatelink.inputs.EndpointPrivateDnsZoneGroupArgs.Builder]):
        com.pulumi.azure.privatelink.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.azure.privatelink.inputs.EndpointPrivateDnsZoneGroupArgs.builder
      builder.privateDnsZoneGroup(args(argsBuilder).build)

    /**
     * @param privateServiceConnection A `privateServiceConnection` block as defined below.
     * @return builder
     */
    def privateServiceConnection(args: Endofunction[com.pulumi.azure.privatelink.inputs.EndpointPrivateServiceConnectionArgs.Builder]):
        com.pulumi.azure.privatelink.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.azure.privatelink.inputs.EndpointPrivateServiceConnectionArgs.builder
      builder.privateServiceConnection(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.privatelink.inputs.EndpointState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
