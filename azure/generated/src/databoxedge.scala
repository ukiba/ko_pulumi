package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object databoxedge:
  object DataboxedgeFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Get information about a Databox Edge Device. */
    inline def getDevice(args: Endofunction[com.pulumi.azure.databoxedge.inputs.GetDeviceArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.databoxedge.outputs.GetDeviceResult] =
      val argsBuilder = com.pulumi.azure.databoxedge.inputs.GetDeviceArgs.builder
      com.pulumi.azure.databoxedge.DataboxedgeFunctions.getDevice(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get information about a Databox Edge Device. */
    inline def getDevicePlain(args: Endofunction[com.pulumi.azure.databoxedge.inputs.GetDevicePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.databoxedge.outputs.GetDeviceResult] =
      val argsBuilder = com.pulumi.azure.databoxedge.inputs.GetDevicePlainArgs.builder
      com.pulumi.azure.databoxedge.DataboxedgeFunctions.getDevicePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

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
        resourceOptions(conf.customResourceOptionsBuilder).build)
