package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object voice:
  /**
   * Manages a Voice Services Communications Gateways.
   * 
   * !&gt; **Note:** You must have signed an Operator Connect agreement with Microsoft to use this resource. For more information, see [`Prerequisites`](https://learn.microsoft.com/en-us/azure/communications-gateway/prepare-to-deploy#prerequisites).
   * 
   * !&gt; **Note:** Access to Azure Communications Gateway is restricted, see [`Get access to Azure Communications Gateway for your Azure subscription`](https://learn.microsoft.com/en-us/azure/communications-gateway/prepare-to-deploy#9-get-access-to-azure-communications-gateway-for-your-azure-subscription) for details.
   */
  def ServicesCommunicationsGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.voice.ServicesCommunicationsGatewayArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.voice.ServicesCommunicationsGatewayArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.voice.ServicesCommunicationsGateway(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.voice.ServicesCommunicationsGatewayArgs.Builder)
    /**
     * @param serviceLocations A `serviceLocation` block as defined below.
     * @return builder
     */
    def serviceLocations(args: Endofunction[com.pulumi.azure.voice.inputs.ServicesCommunicationsGatewayServiceLocationArgs.Builder]*):
        com.pulumi.azure.voice.ServicesCommunicationsGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.voice.inputs.ServicesCommunicationsGatewayServiceLocationArgs.builder
      builder.serviceLocations(args.map(_(argsBuilder).build)*)

  /** Manages a Voice Services Communications Gateway Test Line. */
  def ServicesCommunicationsGatewayTestLine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.voice.ServicesCommunicationsGatewayTestLineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.voice.ServicesCommunicationsGatewayTestLineArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.voice.ServicesCommunicationsGatewayTestLine(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.voice.inputs.ServicesCommunicationsGatewayState.Builder)
    /**
     * @param serviceLocations A `serviceLocation` block as defined below.
     * @return builder
     */
    def serviceLocations(args: Endofunction[com.pulumi.azure.voice.inputs.ServicesCommunicationsGatewayServiceLocationArgs.Builder]*):
        com.pulumi.azure.voice.inputs.ServicesCommunicationsGatewayState.Builder =
      def argsBuilder = com.pulumi.azure.voice.inputs.ServicesCommunicationsGatewayServiceLocationArgs.builder
      builder.serviceLocations(args.map(_(argsBuilder).build)*)
