package jp.ukiba.ko_pulumi
package azure

object signalr_ext:
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
