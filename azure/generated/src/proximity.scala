package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object proximity:
  type ProximityFunctions = com.pulumi.azure.proximity.ProximityFunctions
  object ProximityFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.proximity.ProximityFunctions.*
  extension (self: ProximityFunctions.type)
    /** Use this data source to access information about an existing Proximity Placement Group. */
    def getPlacementGroup(args: Endofunction[com.pulumi.azure.proximity.inputs.GetPlacementGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.proximity.outputs.GetPlacementGroupResult] =
      val argsBuilder = com.pulumi.azure.proximity.inputs.GetPlacementGroupArgs.builder
      com.pulumi.azure.proximity.ProximityFunctions.getPlacementGroup(args(argsBuilder).build)

    /** Use this data source to access information about an existing Proximity Placement Group. */
    def getPlacementGroupPlain(args: Endofunction[com.pulumi.azure.proximity.inputs.GetPlacementGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.proximity.outputs.GetPlacementGroupResult] =
      val argsBuilder = com.pulumi.azure.proximity.inputs.GetPlacementGroupPlainArgs.builder
      com.pulumi.azure.proximity.ProximityFunctions.getPlacementGroupPlain(args(argsBuilder).build)

  /** Manages a proximity placement group for virtual machines, virtual machine scale sets and availability sets. */
  def PlacementGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.proximity.PlacementGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.proximity.PlacementGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.proximity.PlacementGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
