package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object webpubsub:
  extension (builder: com.pulumi.azure.webpubsub.ServiceArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.webpubsub.inputs.ServiceIdentityArgs.Builder]):
        com.pulumi.azure.webpubsub.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.ServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param liveTrace A `liveTrace` block as defined below.
     * @return builder
     */
    def liveTrace(args: Endofunction[com.pulumi.azure.webpubsub.inputs.ServiceLiveTraceArgs.Builder]):
        com.pulumi.azure.webpubsub.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.ServiceLiveTraceArgs.builder
      builder.liveTrace(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.webpubsub.ServiceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Azure Web PubSub Custom Domain. */
  def CustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.webpubsub.CustomDomainArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.webpubsub.CustomDomainArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.webpubsub.CustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Web PubSub Custom Certificate. */
  def CustomCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.webpubsub.CustomCertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.webpubsub.CustomCertificateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.webpubsub.CustomCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the hub settings for a Web Pubsub. */
  def Hub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.webpubsub.HubArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.webpubsub.HubArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.webpubsub.Hub(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the Shared Private Link Resource for a Web Pubsub service. */
  def SharedPrivateLinkResource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.webpubsub.SharedPrivateLinkResourceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.webpubsub.SharedPrivateLinkResourceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.webpubsub.SharedPrivateLinkResource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the Network ACL for a Web Pubsub. */
  def NetworkAcl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.webpubsub.NetworkAclArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.webpubsub.NetworkAclArgs.builder
    com.pulumi.azure.webpubsub.NetworkAcl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object WebpubsubFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about the Private Link Resource supported by the Web Pubsub Resource. */
    inline def getPrivateLinkResource(args: Endofunction[com.pulumi.azure.webpubsub.inputs.GetPrivateLinkResourceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.webpubsub.outputs.GetPrivateLinkResourceResult] =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.GetPrivateLinkResourceArgs.builder
      com.pulumi.azure.webpubsub.WebpubsubFunctions.getPrivateLinkResource(args(argsBuilder).build)

    /** Use this data source to access information about the Private Link Resource supported by the Web Pubsub Resource. */
    inline def getPrivateLinkResourcePlain(args: Endofunction[com.pulumi.azure.webpubsub.inputs.GetPrivateLinkResourcePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.webpubsub.outputs.GetPrivateLinkResourceResult] =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.GetPrivateLinkResourcePlainArgs.builder
      com.pulumi.azure.webpubsub.WebpubsubFunctions.getPrivateLinkResourcePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Azure Web Pubsub service. */
    inline def getService(args: Endofunction[com.pulumi.azure.webpubsub.inputs.GetServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.webpubsub.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.GetServiceArgs.builder
      com.pulumi.azure.webpubsub.WebpubsubFunctions.getService(args(argsBuilder).build)

    /** Use this data source to access information about an existing Azure Web Pubsub service. */
    inline def getServicePlain(args: Endofunction[com.pulumi.azure.webpubsub.inputs.GetServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.webpubsub.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.GetServicePlainArgs.builder
      com.pulumi.azure.webpubsub.WebpubsubFunctions.getServicePlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.webpubsub.SocketioArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.webpubsub.inputs.SocketioIdentityArgs.Builder]):
        com.pulumi.azure.webpubsub.SocketioArgs.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.SocketioIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param sku One or more `sku` blocks as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.webpubsub.inputs.SocketioSkuArgs.Builder]):
        com.pulumi.azure.webpubsub.SocketioArgs.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.SocketioSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.webpubsub.SocketioArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Web PubSub Service for Socket.IO. */
  def Socketio(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.webpubsub.SocketioArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.webpubsub.SocketioArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.webpubsub.Socketio(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.webpubsub.HubArgs.Builder)
    /**
     * @param eventHandlers An `eventHandler` block as defined below.
     * 
     *  &gt; **Note:** User can change the order of `eventHandler` to change the priority accordingly.
     * @return builder
     */
    def eventHandlers(args: Endofunction[com.pulumi.azure.webpubsub.inputs.HubEventHandlerArgs.Builder]*):
        com.pulumi.azure.webpubsub.HubArgs.Builder =
      def argsBuilder = com.pulumi.azure.webpubsub.inputs.HubEventHandlerArgs.builder
      builder.eventHandlers(args.map(_(argsBuilder).build)*)

    /**
     * @param eventListeners An `eventListener` block as defined below.
     * 
     *  &gt; **Note:** The managed identity of Web PubSub service must be enabled and the identity must have the &#34;Azure Event Hubs Data sender&#34; role to access the Event Hub.
     * @return builder
     */
    def eventListeners(args: Endofunction[com.pulumi.azure.webpubsub.inputs.HubEventListenerArgs.Builder]*):
        com.pulumi.azure.webpubsub.HubArgs.Builder =
      def argsBuilder = com.pulumi.azure.webpubsub.inputs.HubEventListenerArgs.builder
      builder.eventListeners(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.webpubsub.NetworkAclArgs.Builder)
    /**
     * @param privateEndpoints A `privateEndpoint` block as defined below.
     * @return builder
     */
    def privateEndpoints(args: Endofunction[com.pulumi.azure.webpubsub.inputs.NetworkAclPrivateEndpointArgs.Builder]*):
        com.pulumi.azure.webpubsub.NetworkAclArgs.Builder =
      def argsBuilder = com.pulumi.azure.webpubsub.inputs.NetworkAclPrivateEndpointArgs.builder
      builder.privateEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param publicNetwork A `publicNetwork` block as defined below.
     * @return builder
     */
    def publicNetwork(args: Endofunction[com.pulumi.azure.webpubsub.inputs.NetworkAclPublicNetworkArgs.Builder]):
        com.pulumi.azure.webpubsub.NetworkAclArgs.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.NetworkAclPublicNetworkArgs.builder
      builder.publicNetwork(args(argsBuilder).build)

  /** Manages an Azure Web PubSub Service. */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.webpubsub.ServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.webpubsub.ServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.webpubsub.Service(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.webpubsub.inputs.NetworkAclState.Builder)
    /**
     * @param privateEndpoints A `privateEndpoint` block as defined below.
     * @return builder
     */
    def privateEndpoints(args: Endofunction[com.pulumi.azure.webpubsub.inputs.NetworkAclPrivateEndpointArgs.Builder]*):
        com.pulumi.azure.webpubsub.inputs.NetworkAclState.Builder =
      def argsBuilder = com.pulumi.azure.webpubsub.inputs.NetworkAclPrivateEndpointArgs.builder
      builder.privateEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param publicNetwork A `publicNetwork` block as defined below.
     * @return builder
     */
    def publicNetwork(args: Endofunction[com.pulumi.azure.webpubsub.inputs.NetworkAclPublicNetworkArgs.Builder]):
        com.pulumi.azure.webpubsub.inputs.NetworkAclState.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.NetworkAclPublicNetworkArgs.builder
      builder.publicNetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.webpubsub.inputs.ServiceState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.webpubsub.inputs.ServiceIdentityArgs.Builder]):
        com.pulumi.azure.webpubsub.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.ServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param liveTrace A `liveTrace` block as defined below.
     * @return builder
     */
    def liveTrace(args: Endofunction[com.pulumi.azure.webpubsub.inputs.ServiceLiveTraceArgs.Builder]):
        com.pulumi.azure.webpubsub.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.ServiceLiveTraceArgs.builder
      builder.liveTrace(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.webpubsub.inputs.ServiceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.webpubsub.inputs.HubState.Builder)
    /**
     * @param eventHandlers An `eventHandler` block as defined below.
     * 
     *  &gt; **Note:** User can change the order of `eventHandler` to change the priority accordingly.
     * @return builder
     */
    def eventHandlers(args: Endofunction[com.pulumi.azure.webpubsub.inputs.HubEventHandlerArgs.Builder]*):
        com.pulumi.azure.webpubsub.inputs.HubState.Builder =
      def argsBuilder = com.pulumi.azure.webpubsub.inputs.HubEventHandlerArgs.builder
      builder.eventHandlers(args.map(_(argsBuilder).build)*)

    /**
     * @param eventListeners An `eventListener` block as defined below.
     * 
     *  &gt; **Note:** The managed identity of Web PubSub service must be enabled and the identity must have the &#34;Azure Event Hubs Data sender&#34; role to access the Event Hub.
     * @return builder
     */
    def eventListeners(args: Endofunction[com.pulumi.azure.webpubsub.inputs.HubEventListenerArgs.Builder]*):
        com.pulumi.azure.webpubsub.inputs.HubState.Builder =
      def argsBuilder = com.pulumi.azure.webpubsub.inputs.HubEventListenerArgs.builder
      builder.eventListeners(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.webpubsub.inputs.SocketioState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.webpubsub.inputs.SocketioIdentityArgs.Builder]):
        com.pulumi.azure.webpubsub.inputs.SocketioState.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.SocketioIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param sku One or more `sku` blocks as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.webpubsub.inputs.SocketioSkuArgs.Builder]):
        com.pulumi.azure.webpubsub.inputs.SocketioState.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.SocketioSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.webpubsub.inputs.SocketioState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.webpubsub.inputs.HubEventHandlerArgs.Builder)
    /**
     * @param auth An `auth` block as defined below.
     * @return builder
     */
    def auth(args: Endofunction[com.pulumi.azure.webpubsub.inputs.HubEventHandlerAuthArgs.Builder]):
        com.pulumi.azure.webpubsub.inputs.HubEventHandlerArgs.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.HubEventHandlerAuthArgs.builder
      builder.auth(args(argsBuilder).build)
