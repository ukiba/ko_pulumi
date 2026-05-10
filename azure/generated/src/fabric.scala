package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object fabric:
  extension (builder: com.pulumi.azure.fabric.CapacityArgs.Builder)
    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.fabric.inputs.CapacitySkuArgs.Builder]):
        com.pulumi.azure.fabric.CapacityArgs.Builder =
      val argsBuilder = com.pulumi.azure.fabric.inputs.CapacitySkuArgs.builder
      builder.sku(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.fabric.CapacityArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Fabric Capacity. */
  def Capacity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.fabric.CapacityArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.fabric.CapacityArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.fabric.Capacity(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.fabric.inputs.CapacityState.Builder)
    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.fabric.inputs.CapacitySkuArgs.Builder]):
        com.pulumi.azure.fabric.inputs.CapacityState.Builder =
      val argsBuilder = com.pulumi.azure.fabric.inputs.CapacitySkuArgs.builder
      builder.sku(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.fabric.inputs.CapacityState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
