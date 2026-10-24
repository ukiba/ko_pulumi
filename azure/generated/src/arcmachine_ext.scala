package jp.ukiba.ko_pulumi
package azure

object arcmachine_ext:
  extension (builder: com.pulumi.azure.arcmachine.ArcMachineArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.arcmachine.inputs.ArcMachineIdentityArgs.Builder]):
        com.pulumi.azure.arcmachine.ArcMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.arcmachine.inputs.ArcMachineIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.arcmachine.inputs.ArcMachineState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.arcmachine.inputs.ArcMachineIdentityArgs.Builder]):
        com.pulumi.azure.arcmachine.inputs.ArcMachineState.Builder =
      val argsBuilder = com.pulumi.azure.arcmachine.inputs.ArcMachineIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
