package jp.ukiba.ko_pulumi
package azure

object recoveryservices_ext:
  extension (builder: com.pulumi.azure.recoveryservices.VaultArgs.Builder)
    /**
     * @param encryption An `encryption` block as defined below. Required with `identity`.
     * 
     * &gt; **Note:** Once Encryption with your own key has been Enabled it&#39;s not possible to Disable it.
     * @return builder
     */
    inline def encryption(args: Endofunction[com.pulumi.azure.recoveryservices.inputs.VaultEncryptionArgs.Builder]):
        com.pulumi.azure.recoveryservices.VaultArgs.Builder =
      val argsBuilder = com.pulumi.azure.recoveryservices.inputs.VaultEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.recoveryservices.inputs.VaultIdentityArgs.Builder]):
        com.pulumi.azure.recoveryservices.VaultArgs.Builder =
      val argsBuilder = com.pulumi.azure.recoveryservices.inputs.VaultIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param monitoring A `monitoring` block as defined below.
     * @return builder
     */
    inline def monitoring(args: Endofunction[com.pulumi.azure.recoveryservices.inputs.VaultMonitoringArgs.Builder]):
        com.pulumi.azure.recoveryservices.VaultArgs.Builder =
      val argsBuilder = com.pulumi.azure.recoveryservices.inputs.VaultMonitoringArgs.builder
      builder.monitoring(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.recoveryservices.inputs.VaultState.Builder)
    /**
     * @param encryption An `encryption` block as defined below. Required with `identity`.
     * 
     * &gt; **Note:** Once Encryption with your own key has been Enabled it&#39;s not possible to Disable it.
     * @return builder
     */
    inline def encryption(args: Endofunction[com.pulumi.azure.recoveryservices.inputs.VaultEncryptionArgs.Builder]):
        com.pulumi.azure.recoveryservices.inputs.VaultState.Builder =
      val argsBuilder = com.pulumi.azure.recoveryservices.inputs.VaultEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.recoveryservices.inputs.VaultIdentityArgs.Builder]):
        com.pulumi.azure.recoveryservices.inputs.VaultState.Builder =
      val argsBuilder = com.pulumi.azure.recoveryservices.inputs.VaultIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param monitoring A `monitoring` block as defined below.
     * @return builder
     */
    inline def monitoring(args: Endofunction[com.pulumi.azure.recoveryservices.inputs.VaultMonitoringArgs.Builder]):
        com.pulumi.azure.recoveryservices.inputs.VaultState.Builder =
      val argsBuilder = com.pulumi.azure.recoveryservices.inputs.VaultMonitoringArgs.builder
      builder.monitoring(args(argsBuilder).build)
