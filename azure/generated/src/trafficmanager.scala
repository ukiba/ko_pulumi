package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object trafficmanager:
  /** Manages a Traffic Manager Profile to which multiple endpoints can be attached. */
  @deprecated("azure.trafficmanager.Profile has been deprecated in favor of azure.network.TrafficManagerProfile") def Profile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.trafficmanager.ProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.trafficmanager.ProfileArgs.builder
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
    com.pulumi.azure.trafficmanager.Profile(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object TrafficmanagerFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access the ID of a specified Traffic Manager Geographical Location within the Geographical Hierarchy. */
    @deprecated("azure.trafficmanager.getGeographicalLocation has been deprecated in favor of azure.network.getTrafficManager") inline def getGeographicalLocation(args: Endofunction[com.pulumi.azure.trafficmanager.inputs.GetGeographicalLocationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.trafficmanager.outputs.GetGeographicalLocationResult] =
      val argsBuilder = com.pulumi.azure.trafficmanager.inputs.GetGeographicalLocationArgs.builder
      com.pulumi.azure.trafficmanager.TrafficmanagerFunctions.getGeographicalLocation(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access the ID of a specified Traffic Manager Geographical Location within the Geographical Hierarchy. */
    @deprecated("azure.trafficmanager.getGeographicalLocation has been deprecated in favor of azure.network.getTrafficManager") inline def getGeographicalLocationPlain(args: Endofunction[com.pulumi.azure.trafficmanager.inputs.GetGeographicalLocationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.trafficmanager.outputs.GetGeographicalLocationResult] =
      val argsBuilder = com.pulumi.azure.trafficmanager.inputs.GetGeographicalLocationPlainArgs.builder
      com.pulumi.azure.trafficmanager.TrafficmanagerFunctions.getGeographicalLocationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
