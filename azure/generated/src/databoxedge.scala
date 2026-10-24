package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object databoxedge:
  object DataboxedgeFunctions:
    /** Get information about a Databox Edge Device. */
    inline def getDevice(args: Endofunction[com.pulumi.azure.databoxedge.inputs.GetDeviceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.databoxedge.outputs.GetDeviceResult] =
      val argsBuilder = com.pulumi.azure.databoxedge.inputs.GetDeviceArgs.builder
      com.pulumi.azure.databoxedge.DataboxedgeFunctions.getDevice(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get information about a Databox Edge Device. */
    inline def getDevicePlain(args: Endofunction[com.pulumi.azure.databoxedge.inputs.GetDevicePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.databoxedge.outputs.GetDeviceResult] =
      val argsBuilder = com.pulumi.azure.databoxedge.inputs.GetDevicePlainArgs.builder
      com.pulumi.azure.databoxedge.DataboxedgeFunctions.getDevicePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages a Databox Edge Device. */
  inline def Device(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.databoxedge.DeviceArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)
