package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object managedlustre:
  /** Manages an Azure Managed Lustre File System. */
  def FileSystem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.managedlustre.FileSystemArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.managedlustre.FileSystemArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.managedlustre.FileSystem(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.managedlustre.FileSystemArgs.Builder)
    /**
     * @param encryptionKey An `encryptionKey` block as defined below.
     * 
     *  &gt; **Note:** Removing `encryptionKey` forces a new resource to be created.
     * @return builder
     */
    def encryptionKey(args: Endofunction[com.pulumi.azure.managedlustre.inputs.FileSystemEncryptionKeyArgs.Builder]):
        com.pulumi.azure.managedlustre.FileSystemArgs.Builder =
      val argsBuilder = com.pulumi.azure.managedlustre.inputs.FileSystemEncryptionKeyArgs.builder
      builder.encryptionKey(args(argsBuilder).build)

    /**
     * @param hsmSetting A `hsmSetting` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def hsmSetting(args: Endofunction[com.pulumi.azure.managedlustre.inputs.FileSystemHsmSettingArgs.Builder]):
        com.pulumi.azure.managedlustre.FileSystemArgs.Builder =
      val argsBuilder = com.pulumi.azure.managedlustre.inputs.FileSystemHsmSettingArgs.builder
      builder.hsmSetting(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.managedlustre.inputs.FileSystemIdentityArgs.Builder]):
        com.pulumi.azure.managedlustre.FileSystemArgs.Builder =
      val argsBuilder = com.pulumi.azure.managedlustre.inputs.FileSystemIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param maintenanceWindow A `maintenanceWindow` block as defined below.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.azure.managedlustre.inputs.FileSystemMaintenanceWindowArgs.Builder]):
        com.pulumi.azure.managedlustre.FileSystemArgs.Builder =
      val argsBuilder = com.pulumi.azure.managedlustre.inputs.FileSystemMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    /**
     * @param rootSquash A `rootSquash` block as defined below.
     * @return builder
     */
    def rootSquash(args: Endofunction[com.pulumi.azure.managedlustre.inputs.FileSystemRootSquashArgs.Builder]):
        com.pulumi.azure.managedlustre.FileSystemArgs.Builder =
      val argsBuilder = com.pulumi.azure.managedlustre.inputs.FileSystemRootSquashArgs.builder
      builder.rootSquash(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.managedlustre.FileSystemArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.managedlustre.inputs.FileSystemState.Builder)
    /**
     * @param encryptionKey An `encryptionKey` block as defined below.
     * 
     *  &gt; **Note:** Removing `encryptionKey` forces a new resource to be created.
     * @return builder
     */
    def encryptionKey(args: Endofunction[com.pulumi.azure.managedlustre.inputs.FileSystemEncryptionKeyArgs.Builder]):
        com.pulumi.azure.managedlustre.inputs.FileSystemState.Builder =
      val argsBuilder = com.pulumi.azure.managedlustre.inputs.FileSystemEncryptionKeyArgs.builder
      builder.encryptionKey(args(argsBuilder).build)

    /**
     * @param hsmSetting A `hsmSetting` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def hsmSetting(args: Endofunction[com.pulumi.azure.managedlustre.inputs.FileSystemHsmSettingArgs.Builder]):
        com.pulumi.azure.managedlustre.inputs.FileSystemState.Builder =
      val argsBuilder = com.pulumi.azure.managedlustre.inputs.FileSystemHsmSettingArgs.builder
      builder.hsmSetting(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.managedlustre.inputs.FileSystemIdentityArgs.Builder]):
        com.pulumi.azure.managedlustre.inputs.FileSystemState.Builder =
      val argsBuilder = com.pulumi.azure.managedlustre.inputs.FileSystemIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param maintenanceWindow A `maintenanceWindow` block as defined below.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.azure.managedlustre.inputs.FileSystemMaintenanceWindowArgs.Builder]):
        com.pulumi.azure.managedlustre.inputs.FileSystemState.Builder =
      val argsBuilder = com.pulumi.azure.managedlustre.inputs.FileSystemMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    /**
     * @param rootSquash A `rootSquash` block as defined below.
     * @return builder
     */
    def rootSquash(args: Endofunction[com.pulumi.azure.managedlustre.inputs.FileSystemRootSquashArgs.Builder]):
        com.pulumi.azure.managedlustre.inputs.FileSystemState.Builder =
      val argsBuilder = com.pulumi.azure.managedlustre.inputs.FileSystemRootSquashArgs.builder
      builder.rootSquash(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.managedlustre.inputs.FileSystemState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
