package jp.ukiba.ko_pulumi
package azure

object purview_ext:
  extension (builder: com.pulumi.azure.purview.AccountArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.purview.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.purview.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.purview.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.purview.inputs.AccountState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.purview.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.purview.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.purview.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param managedResources A `managedResources` block as defined below.
     * @return builder
     */
    def managedResources(args: Endofunction[com.pulumi.azure.purview.inputs.AccountManagedResourceArgs.Builder]*):
        com.pulumi.azure.purview.inputs.AccountState.Builder =
      def argsBuilder = com.pulumi.azure.purview.inputs.AccountManagedResourceArgs.builder
      builder.managedResources(args.map(_(argsBuilder).build)*)
