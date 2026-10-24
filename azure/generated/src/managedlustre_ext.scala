package jp.ukiba.ko_pulumi
package azure

object managedlustre_ext:
  extension (builder: com.pulumi.azure.managedlustre.FileSystemArgs.Builder)
    /**
     * @param encryptionKey An `encryptionKey` block as defined below.
     * 
     * &gt; **Note:** Removing `encryptionKey` forces a new resource to be created.
     * @return builder
     */
    inline def encryptionKey(args: Endofunction[com.pulumi.azure.managedlustre.inputs.FileSystemEncryptionKeyArgs.Builder]):
        com.pulumi.azure.managedlustre.FileSystemArgs.Builder =
      val argsBuilder = com.pulumi.azure.managedlustre.inputs.FileSystemEncryptionKeyArgs.builder
      builder.encryptionKey(args(argsBuilder).build)

    /**
     * @param hsmSetting A `hsmSetting` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def hsmSetting(args: Endofunction[com.pulumi.azure.managedlustre.inputs.FileSystemHsmSettingArgs.Builder]):
        com.pulumi.azure.managedlustre.FileSystemArgs.Builder =
      val argsBuilder = com.pulumi.azure.managedlustre.inputs.FileSystemHsmSettingArgs.builder
      builder.hsmSetting(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.managedlustre.inputs.FileSystemIdentityArgs.Builder]):
        com.pulumi.azure.managedlustre.FileSystemArgs.Builder =
      val argsBuilder = com.pulumi.azure.managedlustre.inputs.FileSystemIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param maintenanceWindow A `maintenanceWindow` block as defined below.
     * @return builder
     */
    inline def maintenanceWindow(args: Endofunction[com.pulumi.azure.managedlustre.inputs.FileSystemMaintenanceWindowArgs.Builder]):
        com.pulumi.azure.managedlustre.FileSystemArgs.Builder =
      val argsBuilder = com.pulumi.azure.managedlustre.inputs.FileSystemMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    /**
     * @param rootSquash A `rootSquash` block as defined below.
     * @return builder
     */
    inline def rootSquash(args: Endofunction[com.pulumi.azure.managedlustre.inputs.FileSystemRootSquashArgs.Builder]):
        com.pulumi.azure.managedlustre.FileSystemArgs.Builder =
      val argsBuilder = com.pulumi.azure.managedlustre.inputs.FileSystemRootSquashArgs.builder
      builder.rootSquash(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.managedlustre.inputs.FileSystemState.Builder)
    /**
     * @param encryptionKey An `encryptionKey` block as defined below.
     * 
     * &gt; **Note:** Removing `encryptionKey` forces a new resource to be created.
     * @return builder
     */
    inline def encryptionKey(args: Endofunction[com.pulumi.azure.managedlustre.inputs.FileSystemEncryptionKeyArgs.Builder]):
        com.pulumi.azure.managedlustre.inputs.FileSystemState.Builder =
      val argsBuilder = com.pulumi.azure.managedlustre.inputs.FileSystemEncryptionKeyArgs.builder
      builder.encryptionKey(args(argsBuilder).build)

    /**
     * @param hsmSetting A `hsmSetting` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def hsmSetting(args: Endofunction[com.pulumi.azure.managedlustre.inputs.FileSystemHsmSettingArgs.Builder]):
        com.pulumi.azure.managedlustre.inputs.FileSystemState.Builder =
      val argsBuilder = com.pulumi.azure.managedlustre.inputs.FileSystemHsmSettingArgs.builder
      builder.hsmSetting(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.managedlustre.inputs.FileSystemIdentityArgs.Builder]):
        com.pulumi.azure.managedlustre.inputs.FileSystemState.Builder =
      val argsBuilder = com.pulumi.azure.managedlustre.inputs.FileSystemIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param maintenanceWindow A `maintenanceWindow` block as defined below.
     * @return builder
     */
    inline def maintenanceWindow(args: Endofunction[com.pulumi.azure.managedlustre.inputs.FileSystemMaintenanceWindowArgs.Builder]):
        com.pulumi.azure.managedlustre.inputs.FileSystemState.Builder =
      val argsBuilder = com.pulumi.azure.managedlustre.inputs.FileSystemMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    /**
     * @param rootSquash A `rootSquash` block as defined below.
     * @return builder
     */
    inline def rootSquash(args: Endofunction[com.pulumi.azure.managedlustre.inputs.FileSystemRootSquashArgs.Builder]):
        com.pulumi.azure.managedlustre.inputs.FileSystemState.Builder =
      val argsBuilder = com.pulumi.azure.managedlustre.inputs.FileSystemRootSquashArgs.builder
      builder.rootSquash(args(argsBuilder).build)
