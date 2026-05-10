package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object databoxedge:
  /** Manages a Databox Edge Device. */
  def Device(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.databoxedge.DeviceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.databoxedge.DeviceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.databoxedge.Device(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type DataboxedgeFunctions = com.pulumi.azure.databoxedge.DataboxedgeFunctions
  object DataboxedgeFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.databoxedge.DataboxedgeFunctions.*
  extension (self: DataboxedgeFunctions.type)
    /** Get information about a Databox Edge Device. */
    def getDevice(args: Endofunction[com.pulumi.azure.databoxedge.inputs.GetDeviceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.databoxedge.outputs.GetDeviceResult] =
      val argsBuilder = com.pulumi.azure.databoxedge.inputs.GetDeviceArgs.builder
      com.pulumi.azure.databoxedge.DataboxedgeFunctions.getDevice(args(argsBuilder).build)

    /** Get information about a Databox Edge Device. */
    def getDevicePlain(args: Endofunction[com.pulumi.azure.databoxedge.inputs.GetDevicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.databoxedge.outputs.GetDeviceResult] =
      val argsBuilder = com.pulumi.azure.databoxedge.inputs.GetDevicePlainArgs.builder
      com.pulumi.azure.databoxedge.DataboxedgeFunctions.getDevicePlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.databoxedge.inputs.DeviceState.Builder)
    /**
     * @param deviceProperties A `deviceProperties` block as defined below.
     * @return builder
     */
    def deviceProperties(args: Endofunction[com.pulumi.azure.databoxedge.inputs.DeviceDevicePropertyArgs.Builder]*):
        com.pulumi.azure.databoxedge.inputs.DeviceState.Builder =
      def argsBuilder = com.pulumi.azure.databoxedge.inputs.DeviceDevicePropertyArgs.builder
      builder.deviceProperties(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.databoxedge.inputs.DeviceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
