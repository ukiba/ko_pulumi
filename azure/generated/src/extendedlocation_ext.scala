package jp.ukiba.ko_pulumi
package azure

object extendedlocation_ext:
  extension (builder: com.pulumi.azure.extendedlocation.CustomLocationArgs.Builder)
    /**
     * @param authentication An `authentication` block as defined below.
     * @return builder
     */
    inline def authentication(args: Endofunction[com.pulumi.azure.extendedlocation.inputs.CustomLocationAuthenticationArgs.Builder]):
        com.pulumi.azure.extendedlocation.CustomLocationArgs.Builder =
      val argsBuilder = com.pulumi.azure.extendedlocation.inputs.CustomLocationAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.extendedlocation.inputs.CustomLocationState.Builder)
    /**
     * @param authentication An `authentication` block as defined below.
     * @return builder
     */
    inline def authentication(args: Endofunction[com.pulumi.azure.extendedlocation.inputs.CustomLocationAuthenticationArgs.Builder]):
        com.pulumi.azure.extendedlocation.inputs.CustomLocationState.Builder =
      val argsBuilder = com.pulumi.azure.extendedlocation.inputs.CustomLocationAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)
