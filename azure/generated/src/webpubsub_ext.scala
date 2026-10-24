package jp.ukiba.ko_pulumi
package azure

object webpubsub_ext:
  extension (builder: com.pulumi.azure.webpubsub.HubArgs.Builder)
    /**
     * @param eventHandlers An `eventHandler` block as defined below.
     * 
     * &gt; **Note:** User can change the order of `eventHandler` to change the priority accordingly.
     * @return builder
     */
    inline def eventHandlers(args: Endofunction[com.pulumi.azure.webpubsub.inputs.HubEventHandlerArgs.Builder]*):
        com.pulumi.azure.webpubsub.HubArgs.Builder =
      def argsBuilder = com.pulumi.azure.webpubsub.inputs.HubEventHandlerArgs.builder
      builder.eventHandlers(args.map(_(argsBuilder).build)*)

    /**
     * @param eventListeners An `eventListener` block as defined below.
     * 
     * &gt; **Note:** The managed identity of Web PubSub service must be enabled and the identity must have the &#34;Azure Event Hubs Data sender&#34; role to access the Event Hub.
     * @return builder
     */
    inline def eventListeners(args: Endofunction[com.pulumi.azure.webpubsub.inputs.HubEventListenerArgs.Builder]*):
        com.pulumi.azure.webpubsub.HubArgs.Builder =
      def argsBuilder = com.pulumi.azure.webpubsub.inputs.HubEventListenerArgs.builder
      builder.eventListeners(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.webpubsub.NetworkAclArgs.Builder)
    /**
     * @param privateEndpoints A `privateEndpoint` block as defined below.
     * @return builder
     */
    inline def privateEndpoints(args: Endofunction[com.pulumi.azure.webpubsub.inputs.NetworkAclPrivateEndpointArgs.Builder]*):
        com.pulumi.azure.webpubsub.NetworkAclArgs.Builder =
      def argsBuilder = com.pulumi.azure.webpubsub.inputs.NetworkAclPrivateEndpointArgs.builder
      builder.privateEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param publicNetwork A `publicNetwork` block as defined below.
     * @return builder
     */
    inline def publicNetwork(args: Endofunction[com.pulumi.azure.webpubsub.inputs.NetworkAclPublicNetworkArgs.Builder]):
        com.pulumi.azure.webpubsub.NetworkAclArgs.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.NetworkAclPublicNetworkArgs.builder
      builder.publicNetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.webpubsub.ServiceArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.webpubsub.inputs.ServiceIdentityArgs.Builder]):
        com.pulumi.azure.webpubsub.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.ServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param liveTrace A `liveTrace` block as defined below.
     * @return builder
     */
    inline def liveTrace(args: Endofunction[com.pulumi.azure.webpubsub.inputs.ServiceLiveTraceArgs.Builder]):
        com.pulumi.azure.webpubsub.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.ServiceLiveTraceArgs.builder
      builder.liveTrace(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.webpubsub.SocketioArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.webpubsub.inputs.SocketioIdentityArgs.Builder]):
        com.pulumi.azure.webpubsub.SocketioArgs.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.SocketioIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param sku One or more `sku` blocks as defined below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.webpubsub.inputs.SocketioSkuArgs.Builder]):
        com.pulumi.azure.webpubsub.SocketioArgs.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.SocketioSkuArgs.builder
      builder.sku(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.webpubsub.inputs.HubEventHandlerArgs.Builder)
    /**
     * @param auth An `auth` block as defined below.
     * @return builder
     */
    inline def auth(args: Endofunction[com.pulumi.azure.webpubsub.inputs.HubEventHandlerAuthArgs.Builder]):
        com.pulumi.azure.webpubsub.inputs.HubEventHandlerArgs.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.HubEventHandlerAuthArgs.builder
      builder.auth(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.webpubsub.inputs.HubState.Builder)
    /**
     * @param eventHandlers An `eventHandler` block as defined below.
     * 
     * &gt; **Note:** User can change the order of `eventHandler` to change the priority accordingly.
     * @return builder
     */
    inline def eventHandlers(args: Endofunction[com.pulumi.azure.webpubsub.inputs.HubEventHandlerArgs.Builder]*):
        com.pulumi.azure.webpubsub.inputs.HubState.Builder =
      def argsBuilder = com.pulumi.azure.webpubsub.inputs.HubEventHandlerArgs.builder
      builder.eventHandlers(args.map(_(argsBuilder).build)*)

    /**
     * @param eventListeners An `eventListener` block as defined below.
     * 
     * &gt; **Note:** The managed identity of Web PubSub service must be enabled and the identity must have the &#34;Azure Event Hubs Data sender&#34; role to access the Event Hub.
     * @return builder
     */
    inline def eventListeners(args: Endofunction[com.pulumi.azure.webpubsub.inputs.HubEventListenerArgs.Builder]*):
        com.pulumi.azure.webpubsub.inputs.HubState.Builder =
      def argsBuilder = com.pulumi.azure.webpubsub.inputs.HubEventListenerArgs.builder
      builder.eventListeners(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.webpubsub.inputs.NetworkAclState.Builder)
    /**
     * @param privateEndpoints A `privateEndpoint` block as defined below.
     * @return builder
     */
    inline def privateEndpoints(args: Endofunction[com.pulumi.azure.webpubsub.inputs.NetworkAclPrivateEndpointArgs.Builder]*):
        com.pulumi.azure.webpubsub.inputs.NetworkAclState.Builder =
      def argsBuilder = com.pulumi.azure.webpubsub.inputs.NetworkAclPrivateEndpointArgs.builder
      builder.privateEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param publicNetwork A `publicNetwork` block as defined below.
     * @return builder
     */
    inline def publicNetwork(args: Endofunction[com.pulumi.azure.webpubsub.inputs.NetworkAclPublicNetworkArgs.Builder]):
        com.pulumi.azure.webpubsub.inputs.NetworkAclState.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.NetworkAclPublicNetworkArgs.builder
      builder.publicNetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.webpubsub.inputs.ServiceState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.webpubsub.inputs.ServiceIdentityArgs.Builder]):
        com.pulumi.azure.webpubsub.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.ServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param liveTrace A `liveTrace` block as defined below.
     * @return builder
     */
    inline def liveTrace(args: Endofunction[com.pulumi.azure.webpubsub.inputs.ServiceLiveTraceArgs.Builder]):
        com.pulumi.azure.webpubsub.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.ServiceLiveTraceArgs.builder
      builder.liveTrace(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.webpubsub.inputs.SocketioState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.webpubsub.inputs.SocketioIdentityArgs.Builder]):
        com.pulumi.azure.webpubsub.inputs.SocketioState.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.SocketioIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param sku One or more `sku` blocks as defined below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.webpubsub.inputs.SocketioSkuArgs.Builder]):
        com.pulumi.azure.webpubsub.inputs.SocketioState.Builder =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.SocketioSkuArgs.builder
      builder.sku(args(argsBuilder).build)
