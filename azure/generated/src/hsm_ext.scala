package jp.ukiba.ko_pulumi
package azure

object hsm_ext:
  extension (builder: com.pulumi.azure.hsm.ModuleArgs.Builder)
    /**
     * @param managementNetworkProfile A `managementNetworkProfile` block as defined below.
     * 
     * &gt; **Note:** The `managementNetworkProfile` should not be specified when `skuName` is `SafeNet Luna Network HSM A790`.
     * @return builder
     */
    def managementNetworkProfile(args: Endofunction[com.pulumi.azure.hsm.inputs.ModuleManagementNetworkProfileArgs.Builder]):
        com.pulumi.azure.hsm.ModuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.hsm.inputs.ModuleManagementNetworkProfileArgs.builder
      builder.managementNetworkProfile(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below.
     * @return builder
     */
    def networkProfile(args: Endofunction[com.pulumi.azure.hsm.inputs.ModuleNetworkProfileArgs.Builder]):
        com.pulumi.azure.hsm.ModuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.hsm.inputs.ModuleNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hsm.inputs.ModuleState.Builder)
    /**
     * @param managementNetworkProfile A `managementNetworkProfile` block as defined below.
     * 
     * &gt; **Note:** The `managementNetworkProfile` should not be specified when `skuName` is `SafeNet Luna Network HSM A790`.
     * @return builder
     */
    def managementNetworkProfile(args: Endofunction[com.pulumi.azure.hsm.inputs.ModuleManagementNetworkProfileArgs.Builder]):
        com.pulumi.azure.hsm.inputs.ModuleState.Builder =
      val argsBuilder = com.pulumi.azure.hsm.inputs.ModuleManagementNetworkProfileArgs.builder
      builder.managementNetworkProfile(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below.
     * @return builder
     */
    def networkProfile(args: Endofunction[com.pulumi.azure.hsm.inputs.ModuleNetworkProfileArgs.Builder]):
        com.pulumi.azure.hsm.inputs.ModuleState.Builder =
      val argsBuilder = com.pulumi.azure.hsm.inputs.ModuleNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)
