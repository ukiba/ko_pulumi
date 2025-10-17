package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object databoxedge:
  object DataboxedgeFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Get information about a Databox Edge Device. */
    inline def getDevice(args: Endofunction[com.pulumi.azure.databoxedge.inputs.GetDeviceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.databoxedge.outputs.GetDeviceResult] =
      val argsBuilder = com.pulumi.azure.databoxedge.inputs.GetDeviceArgs.builder
      com.pulumi.azure.databoxedge.DataboxedgeFunctions.getDevice(args(argsBuilder).build)

    /** Get information about a Databox Edge Device. */
    inline def getDevicePlain(args: Endofunction[com.pulumi.azure.databoxedge.inputs.GetDevicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.databoxedge.outputs.GetDeviceResult] =
      val argsBuilder = com.pulumi.azure.databoxedge.inputs.GetDevicePlainArgs.builder
      com.pulumi.azure.databoxedge.DataboxedgeFunctions.getDevicePlain(args(argsBuilder).build)

  /** Manages a Databox Edge Device. */
  def Device(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.databoxedge.DeviceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.databoxedge.DeviceArgs.builder
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
    com.pulumi.azure.databoxedge.Device(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.databoxedge.inputs.DeviceState.Builder)
    /**
     * @param deviceProperties A `deviceProperties` block as defined below.
     * @return builder
     */
    def deviceProperties(args: Endofunction[com.pulumi.azure.databoxedge.inputs.DeviceDevicePropertyArgs.Builder]*):
        com.pulumi.azure.databoxedge.inputs.DeviceState.Builder =
      def argsBuilder = com.pulumi.azure.databoxedge.inputs.DeviceDevicePropertyArgs.builder
      builder.deviceProperties(args.map(_(argsBuilder).build)*)
