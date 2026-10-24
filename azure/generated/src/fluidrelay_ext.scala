package jp.ukiba.ko_pulumi
package azure

object fluidrelay_ext:
  extension (builder: com.pulumi.azure.fluidrelay.ServerArgs.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.fluidrelay.inputs.ServerCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.fluidrelay.ServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.fluidrelay.inputs.ServerCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.fluidrelay.inputs.ServerIdentityArgs.Builder]):
        com.pulumi.azure.fluidrelay.ServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.fluidrelay.inputs.ServerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.fluidrelay.inputs.ServerState.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.fluidrelay.inputs.ServerCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.fluidrelay.inputs.ServerState.Builder =
      val argsBuilder = com.pulumi.azure.fluidrelay.inputs.ServerCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.fluidrelay.inputs.ServerIdentityArgs.Builder]):
        com.pulumi.azure.fluidrelay.inputs.ServerState.Builder =
      val argsBuilder = com.pulumi.azure.fluidrelay.inputs.ServerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
