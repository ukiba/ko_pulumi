package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object fabric:
  /** Manages a Fabric Capacity. */
  def Capacity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.fabric.CapacityArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.fabric.CapacityArgs.builder
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
    com.pulumi.azure.fabric.Capacity(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.fabric.CapacityArgs.Builder)
    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.fabric.inputs.CapacitySkuArgs.Builder]):
        com.pulumi.azure.fabric.CapacityArgs.Builder =
      val argsBuilder = com.pulumi.azure.fabric.inputs.CapacitySkuArgs.builder
      builder.sku(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.fabric.inputs.CapacityState.Builder)
    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.fabric.inputs.CapacitySkuArgs.Builder]):
        com.pulumi.azure.fabric.inputs.CapacityState.Builder =
      val argsBuilder = com.pulumi.azure.fabric.inputs.CapacitySkuArgs.builder
      builder.sku(args(argsBuilder).build)
