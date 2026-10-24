package jp.ukiba.ko_pulumi
package azure

object videoindexer_ext:
  extension (builder: com.pulumi.azure.videoindexer.AccountArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.videoindexer.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.videoindexer.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.videoindexer.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param storage A `storage` block as defined below.
     * @return builder
     */
    def storage(args: Endofunction[com.pulumi.azure.videoindexer.inputs.AccountStorageArgs.Builder]):
        com.pulumi.azure.videoindexer.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.videoindexer.inputs.AccountStorageArgs.builder
      builder.storage(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.videoindexer.inputs.AccountState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.videoindexer.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.videoindexer.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.videoindexer.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param storage A `storage` block as defined below.
     * @return builder
     */
    def storage(args: Endofunction[com.pulumi.azure.videoindexer.inputs.AccountStorageArgs.Builder]):
        com.pulumi.azure.videoindexer.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.videoindexer.inputs.AccountStorageArgs.builder
      builder.storage(args(argsBuilder).build)
