package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object signalr:
  extension (builder: com.pulumi.azure.signalr.ServiceArgs.Builder)
    /**
     * @param cors A `cors` block as documented below.
     * @return builder
     */
    def cors(args: Endofunction[com.pulumi.azure.signalr.inputs.ServiceCorArgs.Builder]*):
        com.pulumi.azure.signalr.ServiceArgs.Builder =
      def argsBuilder = com.pulumi.azure.signalr.inputs.ServiceCorArgs.builder
      builder.cors(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.signalr.inputs.ServiceIdentityArgs.Builder]):
        com.pulumi.azure.signalr.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.signalr.inputs.ServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param liveTrace A `liveTrace` block as defined below.
     * @return builder
     */
    def liveTrace(args: Endofunction[com.pulumi.azure.signalr.inputs.ServiceLiveTraceArgs.Builder]):
        com.pulumi.azure.signalr.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.signalr.inputs.ServiceLiveTraceArgs.builder
      builder.liveTrace(args(argsBuilder).build)

    /**
     * @param sku A `sku` block as documented below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.signalr.inputs.ServiceSkuArgs.Builder]):
        com.pulumi.azure.signalr.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.signalr.inputs.ServiceSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    /**
     * @param upstreamEndpoints An `upstreamEndpoint` block as documented below. Using this block requires the SignalR service to be Serverless. When creating multiple blocks they will be processed in the order they are defined in.
     * @return builder
     */
    def upstreamEndpoints(args: Endofunction[com.pulumi.azure.signalr.inputs.ServiceUpstreamEndpointArgs.Builder]*):
        com.pulumi.azure.signalr.ServiceArgs.Builder =
      def argsBuilder = com.pulumi.azure.signalr.inputs.ServiceUpstreamEndpointArgs.builder
      builder.upstreamEndpoints(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.signalr.ServiceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages the Network ACL for a SignalR service. */
  def ServiceNetworkAcl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.signalr.ServiceNetworkAclArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.signalr.ServiceNetworkAclArgs.builder
    com.pulumi.azure.signalr.ServiceNetworkAcl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the Shared Private Link Resource for a Signalr service. */
  def SharedPrivateLinkResource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.signalr.SharedPrivateLinkResourceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.signalr.SharedPrivateLinkResourceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.signalr.SharedPrivateLinkResource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type SignalrFunctions = com.pulumi.azure.signalr.SignalrFunctions
  object SignalrFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.signalr.SignalrFunctions.*
  extension (self: SignalrFunctions.type)
    /** Use this data source to access information about an existing Azure SignalR service. */
    def getService(args: Endofunction[com.pulumi.azure.signalr.inputs.GetServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.signalr.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.signalr.inputs.GetServiceArgs.builder
      com.pulumi.azure.signalr.SignalrFunctions.getService(args(argsBuilder).build)

    /** Use this data source to access information about an existing Azure SignalR service. */
    def getServicePlain(args: Endofunction[com.pulumi.azure.signalr.inputs.GetServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.signalr.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.signalr.inputs.GetServicePlainArgs.builder
      com.pulumi.azure.signalr.SignalrFunctions.getServicePlain(args(argsBuilder).build)

  /** Manages an Azure SignalR service. */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.signalr.ServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.signalr.ServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.signalr.Service(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure SignalR Custom Domain. */
  def ServiceCustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.signalr.ServiceCustomDomainArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.signalr.ServiceCustomDomainArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.signalr.ServiceCustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.signalr.ServiceNetworkAclArgs.Builder)
    /**
     * @param privateEndpoints A `privateEndpoint` block as defined below.
     * @return builder
     */
    def privateEndpoints(args: Endofunction[com.pulumi.azure.signalr.inputs.ServiceNetworkAclPrivateEndpointArgs.Builder]*):
        com.pulumi.azure.signalr.ServiceNetworkAclArgs.Builder =
      def argsBuilder = com.pulumi.azure.signalr.inputs.ServiceNetworkAclPrivateEndpointArgs.builder
      builder.privateEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param publicNetwork A `publicNetwork` block as defined below.
     * @return builder
     */
    def publicNetwork(args: Endofunction[com.pulumi.azure.signalr.inputs.ServiceNetworkAclPublicNetworkArgs.Builder]):
        com.pulumi.azure.signalr.ServiceNetworkAclArgs.Builder =
      val argsBuilder = com.pulumi.azure.signalr.inputs.ServiceNetworkAclPublicNetworkArgs.builder
      builder.publicNetwork(args(argsBuilder).build)

  /** Manages an Azure SignalR Custom Certificate. */
  def ServiceCustomCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.signalr.ServiceCustomCertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.signalr.ServiceCustomCertificateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.signalr.ServiceCustomCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.signalr.inputs.ServiceNetworkAclState.Builder)
    /**
     * @param privateEndpoints A `privateEndpoint` block as defined below.
     * @return builder
     */
    def privateEndpoints(args: Endofunction[com.pulumi.azure.signalr.inputs.ServiceNetworkAclPrivateEndpointArgs.Builder]*):
        com.pulumi.azure.signalr.inputs.ServiceNetworkAclState.Builder =
      def argsBuilder = com.pulumi.azure.signalr.inputs.ServiceNetworkAclPrivateEndpointArgs.builder
      builder.privateEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param publicNetwork A `publicNetwork` block as defined below.
     * @return builder
     */
    def publicNetwork(args: Endofunction[com.pulumi.azure.signalr.inputs.ServiceNetworkAclPublicNetworkArgs.Builder]):
        com.pulumi.azure.signalr.inputs.ServiceNetworkAclState.Builder =
      val argsBuilder = com.pulumi.azure.signalr.inputs.ServiceNetworkAclPublicNetworkArgs.builder
      builder.publicNetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.signalr.inputs.ServiceState.Builder)
    /**
     * @param cors A `cors` block as documented below.
     * @return builder
     */
    def cors(args: Endofunction[com.pulumi.azure.signalr.inputs.ServiceCorArgs.Builder]*):
        com.pulumi.azure.signalr.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.azure.signalr.inputs.ServiceCorArgs.builder
      builder.cors(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.signalr.inputs.ServiceIdentityArgs.Builder]):
        com.pulumi.azure.signalr.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.signalr.inputs.ServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param liveTrace A `liveTrace` block as defined below.
     * @return builder
     */
    def liveTrace(args: Endofunction[com.pulumi.azure.signalr.inputs.ServiceLiveTraceArgs.Builder]):
        com.pulumi.azure.signalr.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.signalr.inputs.ServiceLiveTraceArgs.builder
      builder.liveTrace(args(argsBuilder).build)

    /**
     * @param sku A `sku` block as documented below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.signalr.inputs.ServiceSkuArgs.Builder]):
        com.pulumi.azure.signalr.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.signalr.inputs.ServiceSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    /**
     * @param upstreamEndpoints An `upstreamEndpoint` block as documented below. Using this block requires the SignalR service to be Serverless. When creating multiple blocks they will be processed in the order they are defined in.
     * @return builder
     */
    def upstreamEndpoints(args: Endofunction[com.pulumi.azure.signalr.inputs.ServiceUpstreamEndpointArgs.Builder]*):
        com.pulumi.azure.signalr.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.azure.signalr.inputs.ServiceUpstreamEndpointArgs.builder
      builder.upstreamEndpoints(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.signalr.inputs.ServiceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
