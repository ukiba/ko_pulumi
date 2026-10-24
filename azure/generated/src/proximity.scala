package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object proximity:
  /** Manages a proximity placement group for virtual machines, virtual machine scale sets and availability sets. */
  def PlacementGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.proximity.PlacementGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.proximity.PlacementGroupArgs.builder
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
    com.pulumi.azure.proximity.PlacementGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object ProximityFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Proximity Placement Group. */
    inline def getPlacementGroup(args: Endofunction[com.pulumi.azure.proximity.inputs.GetPlacementGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.proximity.outputs.GetPlacementGroupResult] =
      val argsBuilder = com.pulumi.azure.proximity.inputs.GetPlacementGroupArgs.builder
      com.pulumi.azure.proximity.ProximityFunctions.getPlacementGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Proximity Placement Group. */
    inline def getPlacementGroupPlain(args: Endofunction[com.pulumi.azure.proximity.inputs.GetPlacementGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.proximity.outputs.GetPlacementGroupResult] =
      val argsBuilder = com.pulumi.azure.proximity.inputs.GetPlacementGroupPlainArgs.builder
      com.pulumi.azure.proximity.ProximityFunctions.getPlacementGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
