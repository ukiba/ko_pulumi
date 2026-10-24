package jp.ukiba.ko_pulumi
package azure

object search_ext:
  extension (builder: com.pulumi.azure.search.ServiceArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.search.inputs.ServiceIdentityArgs.Builder]):
        com.pulumi.azure.search.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.search.inputs.ServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.search.inputs.ServiceState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.search.inputs.ServiceIdentityArgs.Builder]):
        com.pulumi.azure.search.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.search.inputs.ServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param queryKeys A `queryKeys` block as defined below.
     * @return builder
     */
    inline def queryKeys(args: Endofunction[com.pulumi.azure.search.inputs.ServiceQueryKeyArgs.Builder]*):
        com.pulumi.azure.search.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.azure.search.inputs.ServiceQueryKeyArgs.builder
      builder.queryKeys(args.map(_(argsBuilder).build)*)
