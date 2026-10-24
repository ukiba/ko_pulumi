package jp.ukiba.ko_pulumi
package azure

object digitaltwins_ext:
  extension (builder: com.pulumi.azure.digitaltwins.InstanceArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.digitaltwins.inputs.InstanceIdentityArgs.Builder]):
        com.pulumi.azure.digitaltwins.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.digitaltwins.inputs.InstanceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.digitaltwins.inputs.InstanceState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.digitaltwins.inputs.InstanceIdentityArgs.Builder]):
        com.pulumi.azure.digitaltwins.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.azure.digitaltwins.inputs.InstanceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
