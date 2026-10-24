package jp.ukiba.ko_pulumi
package azure

object maps_ext:
  extension (builder: com.pulumi.azure.maps.AccountArgs.Builder)
    /**
     * @param cors A `cors` block as defined below
     * @return builder
     */
    def cors(args: Endofunction[com.pulumi.azure.maps.inputs.AccountCorsArgs.Builder]):
        com.pulumi.azure.maps.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.maps.inputs.AccountCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param dataStores One or more `dataStore` blocks as defined below.
     * @return builder
     */
    def dataStores(args: Endofunction[com.pulumi.azure.maps.inputs.AccountDataStoreArgs.Builder]*):
        com.pulumi.azure.maps.AccountArgs.Builder =
      def argsBuilder = com.pulumi.azure.maps.inputs.AccountDataStoreArgs.builder
      builder.dataStores(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.maps.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.maps.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.maps.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.maps.inputs.AccountState.Builder)
    /**
     * @param cors A `cors` block as defined below
     * @return builder
     */
    def cors(args: Endofunction[com.pulumi.azure.maps.inputs.AccountCorsArgs.Builder]):
        com.pulumi.azure.maps.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.maps.inputs.AccountCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param dataStores One or more `dataStore` blocks as defined below.
     * @return builder
     */
    def dataStores(args: Endofunction[com.pulumi.azure.maps.inputs.AccountDataStoreArgs.Builder]*):
        com.pulumi.azure.maps.inputs.AccountState.Builder =
      def argsBuilder = com.pulumi.azure.maps.inputs.AccountDataStoreArgs.builder
      builder.dataStores(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.maps.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.maps.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.maps.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
