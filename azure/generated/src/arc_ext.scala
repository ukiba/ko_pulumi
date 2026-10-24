package jp.ukiba.ko_pulumi
package azure

object arc_ext:
  extension (builder: com.pulumi.azure.arc.ResourceBridgeApplianceArgs.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.arc.inputs.ResourceBridgeApplianceIdentityArgs.Builder]):
        com.pulumi.azure.arc.ResourceBridgeApplianceArgs.Builder =
      val argsBuilder = com.pulumi.azure.arc.inputs.ResourceBridgeApplianceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.arc.inputs.ResourceBridgeApplianceState.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.arc.inputs.ResourceBridgeApplianceIdentityArgs.Builder]):
        com.pulumi.azure.arc.inputs.ResourceBridgeApplianceState.Builder =
      val argsBuilder = com.pulumi.azure.arc.inputs.ResourceBridgeApplianceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
