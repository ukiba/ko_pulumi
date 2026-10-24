package jp.ukiba.ko_pulumi
package azure

object fabric_ext:
  extension (builder: com.pulumi.azure.fabric.CapacityArgs.Builder)
    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.fabric.inputs.CapacitySkuArgs.Builder]):
        com.pulumi.azure.fabric.CapacityArgs.Builder =
      val argsBuilder = com.pulumi.azure.fabric.inputs.CapacitySkuArgs.builder
      builder.sku(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.fabric.inputs.CapacityState.Builder)
    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.fabric.inputs.CapacitySkuArgs.Builder]):
        com.pulumi.azure.fabric.inputs.CapacityState.Builder =
      val argsBuilder = com.pulumi.azure.fabric.inputs.CapacitySkuArgs.builder
      builder.sku(args(argsBuilder).build)
