package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object compute:
  /** Manages a Bastion Host. */
  def BastionHost(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.BastionHostArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.BastionHostArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.BastionHost(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Gallery Application. */
  def GalleryApplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.GalleryApplicationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.GalleryApplicationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.GalleryApplication(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.compute.ImageArgs.Builder)
    /**
     * @param dataDisks One or more `dataDisk` blocks as defined below.
     * 
     *  &gt; **Note:** `dataDisk` cannot be set together with `sourceVirtualMachineId`.
     * @return builder
     */
    def dataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.ImageDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.ImageArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ImageDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param osDisk One or more `osDisk` blocks as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** `osDisk` cannot be set together with `sourceVirtualMachineId`.
     * @return builder
     */
    def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.ImageOsDiskArgs.Builder]):
        com.pulumi.azure.compute.ImageArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ImageOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.ImageArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.ManagedDiskArgs.Builder)
    /**
     * @param encryptionSettings A `encryptionSettings` block as defined below.
     * 
     *  &gt; **NOTE:** Removing `encryptionSettings` forces a new resource to be created.
     * @return builder
     */
    def encryptionSettings(args: Endofunction[com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsArgs.Builder]):
        com.pulumi.azure.compute.ManagedDiskArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsArgs.builder
      builder.encryptionSettings(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.ManagedDiskArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Capacity Reservation within a Capacity Reservation Group. */
  def CapacityReservation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.CapacityReservationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.CapacityReservationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.CapacityReservation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Virtual Machine.
   * 
   *  ## Disclaimers
   * 
   *  &gt; **Note:** The `azure.compute.VirtualMachine` resource has been superseded by the `azure.compute.LinuxVirtualMachine` and `azure.compute.WindowsVirtualMachine` resources. The existing `azure.compute.VirtualMachine` resource will continue to be available throughout the 2.x releases however is in a feature-frozen state to maintain compatibility - new functionality will instead be added to the `azure.compute.LinuxVirtualMachine` and `azure.compute.WindowsVirtualMachine` resources.
   * 
   *  &gt; **Note:** Data Disks can be attached either directly on the `azure.compute.VirtualMachine` resource, or using the `azure.compute.DataDiskAttachment` resource - but the two cannot be used together. If both are used against the same Virtual Machine, spurious changes will occur.
   */
  def VirtualMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.VirtualMachineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.VirtualMachineArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.VirtualMachine(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Version of a Shared Image within a Shared Image Gallery. */
  def SharedImageVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.SharedImageVersionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.SharedImageVersionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.SharedImageVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Virtual Machine Extension to provide post deployment configuration
   *  and run automated tasks.
   * 
   *  &gt; **Note:** Custom Script Extensions for Linux &amp; Windows require that the `commandToExecute` returns a `0` exit code to be classified as successfully deployed. You can achieve this by appending `exit 0` to the end of your `commandToExecute`.
   * 
   *  &gt; **Note:** Custom Script Extensions require that the Azure Virtual Machine Guest Agent is running on the Virtual Machine.
   */
  def Extension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.ExtensionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.ExtensionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.Extension(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a custom virtual machine image that can be used to create virtual machines. */
  def Image(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.ImageArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.ImageArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.Image(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.compute.SnapshotArgs.Builder)
    /**
     * @param encryptionSettings A `encryptionSettings` block as defined below.
     * 
     *  &gt; **Note:** Removing `encryptionSettings` forces a new resource to be created.
     * @return builder
     */
    def encryptionSettings(args: Endofunction[com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsArgs.Builder]):
        com.pulumi.azure.compute.SnapshotArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsArgs.builder
      builder.encryptionSettings(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.SnapshotArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.VirtualMachineScaleSetExtensionArgs.Builder)
    /**
     * @param protectedSettingsFromKeyVault A `protectedSettingsFromKeyVault` block as defined below.
     * 
     *  &gt; **Note:** `protectedSettingsFromKeyVault` cannot be used with `protectedSettings`
     * @return builder
     */
    def protectedSettingsFromKeyVault(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineScaleSetExtensionProtectedSettingsFromKeyVaultArgs.Builder]):
        com.pulumi.azure.compute.VirtualMachineScaleSetExtensionArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineScaleSetExtensionProtectedSettingsFromKeyVaultArgs.builder
      builder.protectedSettingsFromKeyVault(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder)
    /**
     * @param additionalCapabilities A `additionalCapabilities` block as defined below.
     * @return builder
     */
    def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param additionalUnattendContents One or more `additionalUnattendContent` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def additionalUnattendContents(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineAdditionalUnattendContentArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineAdditionalUnattendContentArgs.builder
      builder.additionalUnattendContents(args.map(_(argsBuilder).build)*)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param galleryApplications One or more `galleryApplication` blocks as defined below.
     * 
     *  &gt; **Note** Gallery Application Assignments can be defined either directly on `azure.compute.WindowsVirtualMachine` resource, or using the `azure.compute.GalleryApplicationAssignment` resource - but the two approaches cannot be used together. If both are used with the same Virtual Machine, spurious changes will occur. If `azure.compute.GalleryApplicationAssignment` is used, it&#39;s recommended to use `ignoreChanges` for the `galleryApplication` block on the corresponding `azure.compute.WindowsVirtualMachine` resource, to avoid a persistent diff when using this resource.
     * @return builder
     */
    def galleryApplications(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineGalleryApplicationArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineGalleryApplicationArgs.builder
      builder.galleryApplications(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineIdentityArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param osDisk An `osDisk` block as defined below.
     * @return builder
     */
    def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsDiskArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    /**
     * @param osImageNotification A `osImageNotification` block as defined below.
     * @return builder
     */
    def osImageNotification(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsImageNotificationArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsImageNotificationArgs.builder
      builder.osImageNotification(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachinePlanArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachinePlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param secrets One or more `secret` blocks as defined below.
     * @return builder
     */
    def secrets(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineSecretArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceImageReference A `sourceImageReference` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **NOTE:** One of either `sourceImageId` or `sourceImageReference` must be set.
     * @return builder
     */
    def sourceImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineSourceImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineSourceImageReferenceArgs.builder
      builder.sourceImageReference(args(argsBuilder).build)

    /**
     * @param terminationNotification A `terminationNotification` block as defined below.
     * @return builder
     */
    def terminationNotification(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineTerminationNotificationArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineTerminationNotificationArgs.builder
      builder.terminationNotification(args(argsBuilder).build)

    /**
     * @param winrmListeners One or more `winrmListener` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def winrmListeners(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineWinrmListenerArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineWinrmListenerArgs.builder
      builder.winrmListeners(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages a Disk SAS Token.
   * 
   *  Use this resource to obtain a Shared Access Signature (SAS Token) for an existing Managed Disk.
   * 
   *  Shared access signatures allow fine-grained, ephemeral access control to various aspects of Managed Disk similar to blob/storage account container.
   * 
   *  With the help of this resource, data from the disk can be copied from managed disk to a storage blob or to some other system without the need of azcopy.
   */
  def ManagedDiskSasToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.ManagedDiskSasTokenArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.compute.ManagedDiskSasTokenArgs.builder
    com.pulumi.azure.compute.ManagedDiskSasToken(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an implicit Data Disk of a Virtual Machine.
   * 
   *  &gt; **Note:** The Implicit Data Disk will be deleted instantly after this resource is destroyed. If you want to detach this disk only, you may set `detachImplicitDataDiskOnDeletion` field to `true` within the `virtualMachine` block in the provider `features` block.
   */
  def ImplicitDataDiskFromSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.ImplicitDataDiskFromSourceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.ImplicitDataDiskFromSourceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.compute.ImplicitDataDiskFromSource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a virtual machine scale set. */
  def ScaleSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.ScaleSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.ScaleSetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.ScaleSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Availability Set for Virtual Machines. */
  def AvailabilitySet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.AvailabilitySetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.AvailabilitySetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.AvailabilitySet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Virtual Machine Gallery Application Assignment.
   * 
   *  &gt; **Note:** Gallery Application Assignments can be defined either directly on `azure.compute.LinuxVirtualMachine` and `azure.compute.WindowsVirtualMachine` resources, or using the `azure.compute.GalleryApplicationAssignment` resource - but the two approaches cannot be used together. If both are used with the same Virtual Machine, spurious changes will occur. It&#39;s recommended to use `ignoreChanges` for the `galleryApplication` block on the associated virtual machine resources, to avoid a persistent diff when using this resource.
   */
  def GalleryApplicationAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.GalleryApplicationAssignmentArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.compute.GalleryApplicationAssignmentArgs.builder
    com.pulumi.azure.compute.GalleryApplicationAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.compute.ScaleSetStandbyPoolArgs.Builder)
    /**
     * @param elasticityProfile An `elasticityProfile` block as defined below.
     * @return builder
     */
    def elasticityProfile(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetStandbyPoolElasticityProfileArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetStandbyPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetStandbyPoolElasticityProfileArgs.builder
      builder.elasticityProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.ScaleSetStandbyPoolArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Configures Network Packet Capturing against a Virtual Machine using a Network Watcher. */
  def PacketCapture(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.PacketCaptureArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.PacketCaptureArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.compute.PacketCapture(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder)
    /**
     * @param additionalCapabilities An `additionalCapabilities` block as defined below.
     * @return builder
     */
    def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param additionalUnattendContents One or more `additionalUnattendContent` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def additionalUnattendContents(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAdditionalUnattendContentArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAdditionalUnattendContentArgs.builder
      builder.additionalUnattendContents(args.map(_(argsBuilder).build)*)

    /**
     * @param automaticInstanceRepair An `automaticInstanceRepair` block as defined below. To enable the automatic instance repair, this Virtual Machine Scale Set must have a valid `healthProbeId` or an [Application Health Extension](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-health-extension).
     * 
     *  &gt; **Note:** For more information about Automatic Instance Repair, please refer to [this doc](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-automatic-instance-repairs).
     * @return builder
     */
    def automaticInstanceRepair(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAutomaticInstanceRepairArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAutomaticInstanceRepairArgs.builder
      builder.automaticInstanceRepair(args(argsBuilder).build)

    /**
     * @param automaticOsUpgradePolicy An `automaticOsUpgradePolicy` block as defined below. This can only be specified when `upgradeMode` is set to either `Automatic` or `Rolling`.
     * @return builder
     */
    def automaticOsUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAutomaticOsUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAutomaticOsUpgradePolicyArgs.builder
      builder.automaticOsUpgradePolicy(args(argsBuilder).build)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param dataDisks One or more `dataDisk` blocks as defined below.
     * @return builder
     */
    def dataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param extensions One or more `extension` blocks as defined below
     * @return builder
     */
    def extensions(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetExtensionArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param galleryApplications One or more `galleryApplication` blocks as defined below.
     * @return builder
     */
    def galleryApplications(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetGalleryApplicationArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetGalleryApplicationArgs.builder
      builder.galleryApplications(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetIdentityArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkInterfaces One or more `networkInterface` blocks as defined below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param osDisk An `osDisk` block as defined below.
     * @return builder
     */
    def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetOsDiskArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** When using an image from Azure Marketplace a `plan` must be specified.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetPlanArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param rollingUpgradePolicy A `rollingUpgradePolicy` block as defined below. This is Required and can only be specified when `upgradeMode` is set to `Automatic` or `Rolling`. Changing this forces a new resource to be created.
     * @return builder
     */
    def rollingUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetRollingUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetRollingUpgradePolicyArgs.builder
      builder.rollingUpgradePolicy(args(argsBuilder).build)

    /**
     * @param scaleIn A `scaleIn` block as defined below.
     * @return builder
     */
    def scaleIn(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetScaleInArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetScaleInArgs.builder
      builder.scaleIn(args(argsBuilder).build)

    /**
     * @param secrets One or more `secret` blocks as defined below.
     * @return builder
     */
    def secrets(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSecretArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceImageReference A `sourceImageReference` block as defined below.
     * 
     *  &gt; **Note:** One of either `sourceImageId` or `sourceImageReference` must be set.
     * @return builder
     */
    def sourceImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSourceImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSourceImageReferenceArgs.builder
      builder.sourceImageReference(args(argsBuilder).build)

    /**
     * @param spotRestore A `spotRestore` block as defined below.
     * @return builder
     */
    def spotRestore(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSpotRestoreArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSpotRestoreArgs.builder
      builder.spotRestore(args(argsBuilder).build)

    /**
     * @param terminationNotification A `terminationNotification` block as defined below.
     * @return builder
     */
    def terminationNotification(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetTerminationNotificationArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetTerminationNotificationArgs.builder
      builder.terminationNotification(args(argsBuilder).build)

    /**
     * @param winrmListeners One or more `winrmListener` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def winrmListeners(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetWinrmListenerArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetWinrmListenerArgs.builder
      builder.winrmListeners(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder)
    /**
     * @param additionalCapabilities An `additionalCapabilities` block as defined below.
     * @return builder
     */
    def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param automaticInstanceRepair An `automaticInstanceRepair` block as defined below.
     * 
     *  &gt; **Note:** To enable the `automaticInstanceRepair`, the Orchestrated Virtual Machine Scale Set must have a valid [Application Health Extension](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-health-extension).
     * @return builder
     */
    def automaticInstanceRepair(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs.builder
      builder.automaticInstanceRepair(args(argsBuilder).build)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param dataDisks One or more `dataDisk` blocks as defined below.
     * @return builder
     */
    def dataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param extensions One or more `extension` blocks as defined below
     * @return builder
     */
    def extensions(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetExtensionArgs.Builder]*):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetIdentityArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkInterfaces One or more `networkInterface` blocks as defined below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param osDisk An `osDisk` block as defined below.
     * @return builder
     */
    def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsDiskArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    /**
     * @param osProfile An `osProfile` block as defined below.
     * @return builder
     */
    def osProfile(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileArgs.builder
      builder.osProfile(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetPlanArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param priorityMix a `priorityMix` block as defined below
     * @return builder
     */
    def priorityMix(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetPriorityMixArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetPriorityMixArgs.builder
      builder.priorityMix(args(argsBuilder).build)

    /**
     * @param rollingUpgradePolicy A `rollingUpgradePolicy` block as defined below. This is Required when `upgradeMode` is set to `Rolling` and cannot be specified when `upgradeMode` is set to `Manual`. Changing this forces a new resource to be created.
     * @return builder
     */
    def rollingUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetRollingUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetRollingUpgradePolicyArgs.builder
      builder.rollingUpgradePolicy(args(argsBuilder).build)

    /**
     * @param skuProfile An `skuProfile` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** If `skuProfile` is specified the `skuName` must be set to `Mix`.
     * @return builder
     */
    def skuProfile(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetSkuProfileArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetSkuProfileArgs.builder
      builder.skuProfile(args(argsBuilder).build)

    /**
     * @param sourceImageReference A `sourceImageReference` block as defined below.
     * @return builder
     */
    def sourceImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetSourceImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetSourceImageReferenceArgs.builder
      builder.sourceImageReference(args(argsBuilder).build)

    /**
     * @param terminationNotification A `terminationNotification` block as defined below.
     * @return builder
     */
    def terminationNotification(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetTerminationNotificationArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetTerminationNotificationArgs.builder
      builder.terminationNotification(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.DiskEncryptionSetArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.compute.inputs.DiskEncryptionSetIdentityArgs.Builder]):
        com.pulumi.azure.compute.DiskEncryptionSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.DiskEncryptionSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.DiskEncryptionSetArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a SSH Public Key. */
  def SshPublicKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.SshPublicKeyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.SshPublicKeyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.SshPublicKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Virtual Machine Run Command. */
  def RunCommand(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.RunCommandArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.RunCommandArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.RunCommand(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Windows Virtual Machine.
   * 
   *  ## Disclaimers
   * 
   *  &gt; **Note** This provider will automatically remove the OS Disk by default - this behaviour can be configured using the `features` setting within the Provider block.
   * 
   *  &gt; **Note** All arguments including the administrator login and password will be stored in the raw state as plain-text.
   * 
   *  &gt; **Note** This resource does not support Unmanaged Disks. If you need to use Unmanaged Disks you can continue to use the `azure.compute.VirtualMachine` resource instead.
   * 
   *  &gt; **Note** This resource does not support attaching existing OS Disks. You can instead capture an image of the OS Disk or continue to use the `azure.compute.VirtualMachine` resource instead.
   * 
   *  &gt; In this release there&#39;s a known issue where the `publicIpAddress` and `publicIpAddresses` fields may not be fully populated for Dynamic Public IP&#39;s.
   */
  def WindowsVirtualMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.WindowsVirtualMachineArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.WindowsVirtualMachine(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Linux Virtual Machine Scale Set.
   * 
   *  ## Disclaimers
   * 
   *  &gt; **Note:** As of the **v2.86.0** (November 19, 2021) release of the provider this resource will only create Virtual Machine Scale Sets with the **Uniform** Orchestration Mode. For Virtual Machine Scale Sets with **Flexible** orchestration mode, use `azure.compute.OrchestratedVirtualMachineScaleSet`. Flexible orchestration mode is recommended for workloads on Azure.
   */
  def LinuxVirtualMachineScaleSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.LinuxVirtualMachineScaleSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.compute.GalleryApplicationVersionArgs.Builder)
    /**
     * @param manageAction A `manageAction` block as defined below.
     * @return builder
     */
    def manageAction(args: Endofunction[com.pulumi.azure.compute.inputs.GalleryApplicationVersionManageActionArgs.Builder]):
        com.pulumi.azure.compute.GalleryApplicationVersionArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.GalleryApplicationVersionManageActionArgs.builder
      builder.manageAction(args(argsBuilder).build)

    /**
     * @param source A `source` block as defined below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.azure.compute.inputs.GalleryApplicationVersionSourceArgs.Builder]):
        com.pulumi.azure.compute.GalleryApplicationVersionArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.GalleryApplicationVersionSourceArgs.builder
      builder.source(args(argsBuilder).build)

    /**
     * @param targetRegions One or more `targetRegion` blocks as defined below.
     * @return builder
     */
    def targetRegions(args: Endofunction[com.pulumi.azure.compute.inputs.GalleryApplicationVersionTargetRegionArgs.Builder]*):
        com.pulumi.azure.compute.GalleryApplicationVersionArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.GalleryApplicationVersionTargetRegionArgs.builder
      builder.targetRegions(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.GalleryApplicationVersionArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Disk Access. */
  def DiskAccess(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.DiskAccessArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.DiskAccessArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.DiskAccess(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Windows Virtual Machine Scale Set.
   * 
   *  ## Disclaimers
   * 
   *  &gt; **Note:** This resource will only create Virtual Machine Scale Sets with the **Uniform** Orchestration Mode. For Virtual Machine Scale Sets with **Flexible** orchestration mode, use `azure.compute.OrchestratedVirtualMachineScaleSet`. Flexible orchestration mode is recommended for workloads on Azure.
   * 
   *  &gt; **Note:** All arguments including the administrator login and password will be stored in the raw state as plain-text. Read more about [sensitive data](https://www.terraform.io/docs/state/sensitive-data.html) in state.
   * 
   *  &gt; **Note:** This provider will automatically update &amp; reimage the nodes in the Scale Set (if Required) during an Update - this behaviour can be configured using the `features` setting within the Provider block.
   * 
   *  &gt; **Note:** This resource does not support Unmanaged Disks. If you need to use Unmanaged Disks you can continue to use the `azure.compute.ScaleSet` resource instead.
   */
  def WindowsVirtualMachineScaleSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.WindowsVirtualMachineScaleSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Configures Network Packet Capturing against a Virtual Machine Scale Set using a Network Watcher. */
  def ScaleSetPacketCapture(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.ScaleSetPacketCaptureArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.ScaleSetPacketCaptureArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.compute.ScaleSetPacketCapture(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Virtual Machine Restore Point. */
  def RestorePoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.RestorePointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.RestorePointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.compute.RestorePoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.compute.SharedImageArgs.Builder)
    /**
     * @param identifier An `identifier` block as defined below.
     * @return builder
     */
    def identifier(args: Endofunction[com.pulumi.azure.compute.inputs.SharedImageIdentifierArgs.Builder]):
        com.pulumi.azure.compute.SharedImageArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SharedImageIdentifierArgs.builder
      builder.identifier(args(argsBuilder).build)

    /**
     * @param purchasePlan A `purchasePlan` block as defined below.
     * @return builder
     */
    def purchasePlan(args: Endofunction[com.pulumi.azure.compute.inputs.SharedImagePurchasePlanArgs.Builder]):
        com.pulumi.azure.compute.SharedImageArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SharedImagePurchasePlanArgs.builder
      builder.purchasePlan(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.SharedImageArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Shared Image Gallery. */
  def SharedImageGallery(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.SharedImageGalleryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.SharedImageGalleryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.SharedImageGallery(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Gallery Application Version. */
  def GalleryApplicationVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.GalleryApplicationVersionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.GalleryApplicationVersionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.GalleryApplicationVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.compute.SharedImageGalleryArgs.Builder)
    /**
     * @param sharing A `sharing` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def sharing(args: Endofunction[com.pulumi.azure.compute.inputs.SharedImageGallerySharingArgs.Builder]):
        com.pulumi.azure.compute.SharedImageGalleryArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SharedImageGallerySharingArgs.builder
      builder.sharing(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.SharedImageGalleryArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Disk Snapshot. */
  def Snapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.SnapshotArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.SnapshotArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.Snapshot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Virtual Machine Scale Set in Flexible Orchestration Mode.
   * 
   *  ## Disclaimers
   * 
   *  &gt; **Note:** As of the **v2.86.0** (November 19, 2021) release of the provider this resource will only create Virtual Machine Scale Sets with the **Flexible** Orchestration Mode.
   * 
   *  &gt; **Note:** All arguments including the administrator login and password will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
   */
  def OrchestratedVirtualMachineScaleSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages attaching a Disk to a Virtual Machine.
   * 
   *  &gt; **NOTE:** Data Disks can be attached either directly on the `azure.compute.VirtualMachine` resource, or using the `azure.compute.DataDiskAttachment` resource - but the two cannot be used together. If both are used against the same Virtual Machine, spurious changes will occur.
   * 
   *  &gt; **Please Note:** only Managed Disks are supported via this separate resource, Unmanaged Disks can be attached using the `storageDataDisk` block in the `azure.compute.VirtualMachine` resource.
   */
  def DataDiskAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.DataDiskAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.compute.DataDiskAttachmentArgs.builder
    com.pulumi.azure.compute.DataDiskAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder)
    /**
     * @param additionalCapabilities An `additionalCapabilities` block as defined below.
     * @return builder
     */
    def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param adminSshKeys One or more `adminSshKey` blocks as defined below.
     * 
     *  &gt; **Note:** One of either `adminPassword` or `adminSshKey` must be specified.
     * @return builder
     */
    def adminSshKeys(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAdminSshKeyArgs.Builder]*):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAdminSshKeyArgs.builder
      builder.adminSshKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param automaticInstanceRepair An `automaticInstanceRepair` block as defined below. To enable the automatic instance repair, this Virtual Machine Scale Set must have a valid `healthProbeId` or an [Application Health Extension](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-health-extension).
     * 
     *  &gt; **Note:** For more information about Automatic Instance Repair, please refer to the [product documentation](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-automatic-instance-repairs).
     * @return builder
     */
    def automaticInstanceRepair(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAutomaticInstanceRepairArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAutomaticInstanceRepairArgs.builder
      builder.automaticInstanceRepair(args(argsBuilder).build)

    /**
     * @param automaticOsUpgradePolicy An `automaticOsUpgradePolicy` block as defined below. This can only be specified when `upgradeMode` is set to either `Automatic` or `Rolling`.
     * @return builder
     */
    def automaticOsUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAutomaticOsUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAutomaticOsUpgradePolicyArgs.builder
      builder.automaticOsUpgradePolicy(args(argsBuilder).build)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param dataDisks One or more `dataDisk` blocks as defined below.
     * @return builder
     */
    def dataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param extensions One or more `extension` blocks as defined below
     * @return builder
     */
    def extensions(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetExtensionArgs.Builder]*):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param galleryApplications One or more `galleryApplication` blocks as defined below.
     * @return builder
     */
    def galleryApplications(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetGalleryApplicationArgs.Builder]*):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetGalleryApplicationArgs.builder
      builder.galleryApplications(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetIdentityArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkInterfaces One or more `networkInterface` blocks as defined below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param osDisk An `osDisk` block as defined below.
     * @return builder
     */
    def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetOsDiskArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** When using an image from Azure Marketplace a `plan` must be specified.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetPlanArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param rollingUpgradePolicy A `rollingUpgradePolicy` block as defined below. This is Required and can only be specified when `upgradeMode` is set to `Automatic` or `Rolling`. Changing this forces a new resource to be created.
     * @return builder
     */
    def rollingUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetRollingUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetRollingUpgradePolicyArgs.builder
      builder.rollingUpgradePolicy(args(argsBuilder).build)

    /**
     * @param scaleIn A `scaleIn` block as defined below.
     * @return builder
     */
    def scaleIn(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetScaleInArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetScaleInArgs.builder
      builder.scaleIn(args(argsBuilder).build)

    /**
     * @param secrets One or more `secret` blocks as defined below.
     * @return builder
     */
    def secrets(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSecretArgs.Builder]*):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceImageReference A `sourceImageReference` block as defined below.
     * 
     *  &gt; **Note:** One of either `sourceImageId` or `sourceImageReference` must be set.
     * @return builder
     */
    def sourceImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSourceImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSourceImageReferenceArgs.builder
      builder.sourceImageReference(args(argsBuilder).build)

    /**
     * @param spotRestore A `spotRestore` block as defined below.
     * @return builder
     */
    def spotRestore(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSpotRestoreArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSpotRestoreArgs.builder
      builder.spotRestore(args(argsBuilder).build)

    /**
     * @param terminationNotification A `terminationNotification` block as defined below.
     * @return builder
     */
    def terminationNotification(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetTerminationNotificationArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetTerminationNotificationArgs.builder
      builder.terminationNotification(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages a Linux Virtual Machine.
   * 
   *  ## Disclaimers
   * 
   *  &gt; **Note** This provider will automatically remove the OS Disk by default - this behaviour can be configured using the `features` configuration within the Provider configuration block.
   * 
   *  &gt; **Note** All arguments including the administrator login and password will be stored in the raw state as plain-text.
   * 
   *  &gt; **Note** This resource does not support Unmanaged Disks. If you need to use Unmanaged Disks you can continue to use the `azure.compute.VirtualMachine` resource instead.
   * 
   *  &gt; **Note** This resource does not support attaching existing OS Disks. You can instead capture an image of the OS Disk or continue to use the `azure.compute.VirtualMachine` resource instead.
   * 
   *  &gt; In this release there&#39;s a known issue where the `publicIpAddress` and `publicIpAddresses` fields may not be fully populated for Dynamic Public IP&#39;s.
   */
  def LinuxVirtualMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.LinuxVirtualMachineArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.LinuxVirtualMachine(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.compute.ExtensionArgs.Builder)
    /**
     * @param protectedSettingsFromKeyVault A `protectedSettingsFromKeyVault` block as defined below.
     * 
     *  &gt; **Note:** `protectedSettingsFromKeyVault` cannot be used with `protectedSettings`
     * @return builder
     */
    def protectedSettingsFromKeyVault(args: Endofunction[com.pulumi.azure.compute.inputs.ExtensionProtectedSettingsFromKeyVaultArgs.Builder]):
        com.pulumi.azure.compute.ExtensionArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ExtensionProtectedSettingsFromKeyVaultArgs.builder
      builder.protectedSettingsFromKeyVault(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.ExtensionArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages an Extension for a Virtual Machine Scale Set.
   * 
   *  &gt; **Note:** This resource is not intended to be used with the `azure.compute.ScaleSet` resource - instead it&#39;s intended for this to be used with the `azure.compute.LinuxVirtualMachineScaleSet` and `azure.compute.WindowsVirtualMachineScaleSet` resources.
   */
  def VirtualMachineScaleSetExtension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.VirtualMachineScaleSetExtensionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.VirtualMachineScaleSetExtensionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.compute.VirtualMachineScaleSetExtension(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Virtual Machine Automanage Configuration Profile Assignment. */
  def AutomanageConfigurationAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.AutomanageConfigurationAssignmentArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.compute.AutomanageConfigurationAssignmentArgs.builder
    com.pulumi.azure.compute.AutomanageConfigurationAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manage a Dedicated Host within a Dedicated Host Group. */
  def DedicatedHost(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.DedicatedHostArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.DedicatedHostArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.DedicatedHost(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder)
    /**
     * @param additionalCapabilities A `additionalCapabilities` block as defined below.
     * @return builder
     */
    def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param adminSshKeys One or more `adminSshKey` blocks as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **NOTE:** One of either `adminPassword` or `adminSshKey` must be specified.
     * @return builder
     */
    def adminSshKeys(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineAdminSshKeyArgs.Builder]*):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineAdminSshKeyArgs.builder
      builder.adminSshKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param galleryApplications One or more `galleryApplication` blocks as defined below.
     * 
     *  &gt; **Note** Gallery Application Assignments can be defined either directly on `azure.compute.LinuxVirtualMachine` resource, or using the `azure.compute.GalleryApplicationAssignment` resource - but the two approaches cannot be used together. If both are used with the same Virtual Machine, spurious changes will occur. If `azure.compute.GalleryApplicationAssignment` is used, it&#39;s recommended to use `ignoreChanges` for the `galleryApplication` block on the corresponding `azure.compute.LinuxVirtualMachine` resource, to avoid a persistent diff when using this resource.
     * @return builder
     */
    def galleryApplications(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineGalleryApplicationArgs.Builder]*):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineGalleryApplicationArgs.builder
      builder.galleryApplications(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineIdentityArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param osDisk A `osDisk` block as defined below.
     * @return builder
     */
    def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsDiskArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    /**
     * @param osImageNotification A `osImageNotification` block as defined below.
     * @return builder
     */
    def osImageNotification(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsImageNotificationArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsImageNotificationArgs.builder
      builder.osImageNotification(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachinePlanArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachinePlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param secrets One or more `secret` blocks as defined below.
     * @return builder
     */
    def secrets(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineSecretArgs.Builder]*):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceImageReference A `sourceImageReference` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **NOTE:** One of either `sourceImageId` or `sourceImageReference` must be set.
     * @return builder
     */
    def sourceImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineSourceImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineSourceImageReferenceArgs.builder
      builder.sourceImageReference(args(argsBuilder).build)

    /**
     * @param terminationNotification A `terminationNotification` block as defined below.
     * @return builder
     */
    def terminationNotification(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineTerminationNotificationArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineTerminationNotificationArgs.builder
      builder.terminationNotification(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.ScaleSetPacketCaptureArgs.Builder)
    /**
     * @param filters One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureFilterArgs.Builder]*):
        com.pulumi.azure.compute.ScaleSetPacketCaptureArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

    /**
     * @param machineScope A `machineScope` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def machineScope(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureMachineScopeArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetPacketCaptureArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureMachineScopeArgs.builder
      builder.machineScope(args(argsBuilder).build)

    /**
     * @param storageLocation A `storageLocation` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def storageLocation(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureStorageLocationArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetPacketCaptureArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureStorageLocationArgs.builder
      builder.storageLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.BastionHostArgs.Builder)
    /**
     * @param ipConfiguration A `ipConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def ipConfiguration(args: Endofunction[com.pulumi.azure.compute.inputs.BastionHostIpConfigurationArgs.Builder]):
        com.pulumi.azure.compute.BastionHostArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.BastionHostIpConfigurationArgs.builder
      builder.ipConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.BastionHostArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Capacity Reservation Group. */
  def CapacityReservationGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.CapacityReservationGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.CapacityReservationGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.CapacityReservationGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.compute.ScaleSetArgs.Builder)
    /**
     * @param bootDiagnostics A `bootDiagnostics` block as referenced below.
     * @return builder
     */
    def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param extensions Can be specified multiple times to add extension profiles to the scale set. Each `extension` block supports the fields documented below.
     * @return builder
     */
    def extensions(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetExtensionArgs.Builder]*):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetIdentityArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkProfiles A collection of `networkProfile` blocks as documented below.
     * @return builder
     */
    def networkProfiles(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileArgs.Builder]*):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileArgs.builder
      builder.networkProfiles(args.map(_(argsBuilder).build)*)

    /**
     * @param osProfile A `osProfile` block as documented below.
     * @return builder
     */
    def osProfile(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileArgs.builder
      builder.osProfile(args(argsBuilder).build)

    /**
     * @param osProfileLinuxConfig A `osProfileLinuxConfig` block as documented below.
     * @return builder
     */
    def osProfileLinuxConfig(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileLinuxConfigArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileLinuxConfigArgs.builder
      builder.osProfileLinuxConfig(args(argsBuilder).build)

    /**
     * @param osProfileSecrets A collection of `osProfileSecrets` blocks as documented below.
     * @return builder
     */
    def osProfileSecrets(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileSecretArgs.Builder]*):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileSecretArgs.builder
      builder.osProfileSecrets(args.map(_(argsBuilder).build)*)

    /**
     * @param osProfileWindowsConfig A `osProfileWindowsConfig` block as documented below.
     * @return builder
     */
    def osProfileWindowsConfig(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigArgs.builder
      builder.osProfileWindowsConfig(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as documented below.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetPlanArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param rollingUpgradePolicy A `rollingUpgradePolicy` block as defined below. This is only applicable when the `upgradePolicyMode` is `Rolling`.
     * @return builder
     */
    def rollingUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetRollingUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetRollingUpgradePolicyArgs.builder
      builder.rollingUpgradePolicy(args(argsBuilder).build)

    /**
     * @param sku A `sku` block as documented below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetSkuArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    /**
     * @param storageProfileDataDisks A `storageProfileDataDisk` block as documented below.
     * @return builder
     */
    def storageProfileDataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetStorageProfileDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetStorageProfileDataDiskArgs.builder
      builder.storageProfileDataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param storageProfileImageReference A `storageProfileImageReference` block as documented below.
     * @return builder
     */
    def storageProfileImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetStorageProfileImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetStorageProfileImageReferenceArgs.builder
      builder.storageProfileImageReference(args(argsBuilder).build)

    /**
     * @param storageProfileOsDisk A `storageProfileOsDisk` block as documented below.
     * @return builder
     */
    def storageProfileOsDisk(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetStorageProfileOsDiskArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetStorageProfileOsDiskArgs.builder
      builder.storageProfileOsDisk(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manage a Dedicated Host Group. */
  def DedicatedHostGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.DedicatedHostGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.DedicatedHostGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.DedicatedHostGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.compute.PacketCaptureArgs.Builder)
    /**
     * @param filters One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.azure.compute.inputs.PacketCaptureFilterArgs.Builder]*):
        com.pulumi.azure.compute.PacketCaptureArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.PacketCaptureFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

    /**
     * @param storageLocation A `storageLocation` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def storageLocation(args: Endofunction[com.pulumi.azure.compute.inputs.PacketCaptureStorageLocationArgs.Builder]):
        com.pulumi.azure.compute.PacketCaptureArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.PacketCaptureStorageLocationArgs.builder
      builder.storageLocation(args(argsBuilder).build)

  /**
   * Manages a Disk Encryption Set.
   * 
   *  &gt; **NOTE:** At this time the Key Vault used to store the Active Key for this Disk Encryption Set must have both Soft Delete &amp; Purge Protection enabled - which are not yet supported by this provider.
   */
  def DiskEncryptionSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.DiskEncryptionSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.DiskEncryptionSetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.DiskEncryptionSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Virtual Machine Restore Point Collection. */
  def RestorePointCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.RestorePointCollectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.RestorePointCollectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.RestorePointCollection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object ComputeFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Availability Set. */
    inline def getAvailabilitySet(args: Endofunction[com.pulumi.azure.compute.inputs.GetAvailabilitySetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetAvailabilitySetResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetAvailabilitySetArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getAvailabilitySet(args(argsBuilder).build)

    /** Use this data source to access information about an existing Availability Set. */
    inline def getAvailabilitySetPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetAvailabilitySetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetAvailabilitySetResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetAvailabilitySetPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getAvailabilitySetPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Bastion Host. */
    inline def getBastionHost(args: Endofunction[com.pulumi.azure.compute.inputs.GetBastionHostArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetBastionHostResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetBastionHostArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getBastionHost(args(argsBuilder).build)

    /** Use this data source to access information about an existing Bastion Host. */
    inline def getBastionHostPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetBastionHostPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetBastionHostResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetBastionHostPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getBastionHostPlain(args(argsBuilder).build)

    /** Gets information about an existing Confidential Ledger. */
    inline def getConfidentialLedger(args: Endofunction[com.pulumi.azure.compute.inputs.GetConfidentialLedgerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetConfidentialLedgerResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetConfidentialLedgerArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getConfidentialLedger(args(argsBuilder).build)

    /** Gets information about an existing Confidential Ledger. */
    inline def getConfidentialLedgerPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetConfidentialLedgerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetConfidentialLedgerResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetConfidentialLedgerPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getConfidentialLedgerPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dedicated Host. */
    inline def getDedicatedHost(args: Endofunction[com.pulumi.azure.compute.inputs.GetDedicatedHostArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetDedicatedHostResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetDedicatedHostArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getDedicatedHost(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dedicated Host. */
    inline def getDedicatedHostPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetDedicatedHostPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetDedicatedHostResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetDedicatedHostPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getDedicatedHostPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dedicated Host Group. */
    inline def getDedicatedHostGroup(args: Endofunction[com.pulumi.azure.compute.inputs.GetDedicatedHostGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetDedicatedHostGroupResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetDedicatedHostGroupArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getDedicatedHostGroup(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dedicated Host Group. */
    inline def getDedicatedHostGroupPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetDedicatedHostGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetDedicatedHostGroupResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetDedicatedHostGroupPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getDedicatedHostGroupPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Disk Access. */
    inline def getDiskAccess(args: Endofunction[com.pulumi.azure.compute.inputs.GetDiskAccessArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetDiskAccessResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetDiskAccessArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getDiskAccess(args(argsBuilder).build)

    /** Use this data source to access information about an existing Disk Access. */
    inline def getDiskAccessPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetDiskAccessPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetDiskAccessResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetDiskAccessPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getDiskAccessPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Disk Encryption Set. */
    inline def getDiskEncryptionSet(args: Endofunction[com.pulumi.azure.compute.inputs.GetDiskEncryptionSetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetDiskEncryptionSetResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetDiskEncryptionSetArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getDiskEncryptionSet(args(argsBuilder).build)

    /** Use this data source to access information about an existing Disk Encryption Set. */
    inline def getDiskEncryptionSetPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetDiskEncryptionSetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetDiskEncryptionSetResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetDiskEncryptionSetPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getDiskEncryptionSetPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Image. */
    inline def getImage(args: Endofunction[com.pulumi.azure.compute.inputs.GetImageArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetImageArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getImage(args(argsBuilder).build)

    /** Use this data source to access information about an existing Image. */
    inline def getImagePlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetImagePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetImagePlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getImagePlain(args(argsBuilder).build)

    /** Use this data source to access information about existing Images within a Resource Group. */
    inline def getImages(args: Endofunction[com.pulumi.azure.compute.inputs.GetImagesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetImagesResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetImagesArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getImages(args(argsBuilder).build)

    /** Use this data source to access information about existing Images within a Resource Group. */
    inline def getImagesPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetImagesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetImagesResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetImagesPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getImagesPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Managed Disk. */
    inline def getManagedDisk(args: Endofunction[com.pulumi.azure.compute.inputs.GetManagedDiskArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetManagedDiskResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetManagedDiskArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getManagedDisk(args(argsBuilder).build)

    /** Use this data source to access information about an existing Managed Disk. */
    inline def getManagedDiskPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetManagedDiskPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetManagedDiskResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetManagedDiskPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getManagedDiskPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Managed Disk. */
    inline def getManagedDisks(args: Endofunction[com.pulumi.azure.compute.inputs.GetManagedDisksArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetManagedDisksResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetManagedDisksArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getManagedDisks(args(argsBuilder).build)

    /** Use this data source to access information about an existing Managed Disk. */
    inline def getManagedDisksPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetManagedDisksPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetManagedDisksResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetManagedDisksPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getManagedDisksPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Orchestrated Virtual Machine Scale Set. */
    inline def getOrchestratedVirtualMachineScaleSet(args: Endofunction[com.pulumi.azure.compute.inputs.GetOrchestratedVirtualMachineScaleSetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetOrchestratedVirtualMachineScaleSetResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetOrchestratedVirtualMachineScaleSetArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getOrchestratedVirtualMachineScaleSet(args(argsBuilder).build)

    /** Use this data source to access information about an existing Orchestrated Virtual Machine Scale Set. */
    inline def getOrchestratedVirtualMachineScaleSetPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetOrchestratedVirtualMachineScaleSetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetOrchestratedVirtualMachineScaleSetResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetOrchestratedVirtualMachineScaleSetPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getOrchestratedVirtualMachineScaleSetPlain(args(argsBuilder).build)

    /** Use this data source to access information about a Platform Image. */
    inline def getPlatformImage(args: Endofunction[com.pulumi.azure.compute.inputs.GetPlatformImageArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetPlatformImageResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetPlatformImageArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getPlatformImage(args(argsBuilder).build)

    /** Use this data source to access information about a Platform Image. */
    inline def getPlatformImagePlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetPlatformImagePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetPlatformImageResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetPlatformImagePlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getPlatformImagePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Shared Image within a Shared Image Gallery. */
    inline def getSharedImage(args: Endofunction[com.pulumi.azure.compute.inputs.GetSharedImageArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetSharedImageResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSharedImageArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSharedImage(args(argsBuilder).build)

    /** Use this data source to access information about an existing Shared Image within a Shared Image Gallery. */
    inline def getSharedImagePlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetSharedImagePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetSharedImageResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSharedImagePlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSharedImagePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Shared Image Gallery. */
    inline def getSharedImageGallery(args: Endofunction[com.pulumi.azure.compute.inputs.GetSharedImageGalleryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetSharedImageGalleryResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSharedImageGalleryArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSharedImageGallery(args(argsBuilder).build)

    /** Use this data source to access information about an existing Shared Image Gallery. */
    inline def getSharedImageGalleryPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetSharedImageGalleryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetSharedImageGalleryResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSharedImageGalleryPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSharedImageGalleryPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Version of a Shared Image within a Shared Image Gallery. */
    inline def getSharedImageVersion(args: Endofunction[com.pulumi.azure.compute.inputs.GetSharedImageVersionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetSharedImageVersionResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSharedImageVersionArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSharedImageVersion(args(argsBuilder).build)

    /** Use this data source to access information about an existing Version of a Shared Image within a Shared Image Gallery. */
    inline def getSharedImageVersionPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetSharedImageVersionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetSharedImageVersionResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSharedImageVersionPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSharedImageVersionPlain(args(argsBuilder).build)

    /** Use this data source to access information about existing Versions of a Shared Image within a Shared Image Gallery. */
    inline def getSharedImageVersions(args: Endofunction[com.pulumi.azure.compute.inputs.GetSharedImageVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetSharedImageVersionsResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSharedImageVersionsArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSharedImageVersions(args(argsBuilder).build)

    /** Use this data source to access information about existing Versions of a Shared Image within a Shared Image Gallery. */
    inline def getSharedImageVersionsPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetSharedImageVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetSharedImageVersionsResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSharedImageVersionsPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSharedImageVersionsPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Snapshot. */
    inline def getSnapshot(args: Endofunction[com.pulumi.azure.compute.inputs.GetSnapshotArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetSnapshotResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSnapshotArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSnapshot(args(argsBuilder).build)

    /** Use this data source to access information about an existing Snapshot. */
    inline def getSnapshotPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetSnapshotPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetSnapshotResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSnapshotPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSnapshotPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing SSH Public Key. */
    inline def getSshPublicKey(args: Endofunction[com.pulumi.azure.compute.inputs.GetSshPublicKeyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetSshPublicKeyResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSshPublicKeyArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSshPublicKey(args(argsBuilder).build)

    /** Use this data source to access information about an existing SSH Public Key. */
    inline def getSshPublicKeyPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetSshPublicKeyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetSshPublicKeyResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSshPublicKeyPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSshPublicKeyPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Virtual Machine. */
    inline def getVirtualMachine(args: Endofunction[com.pulumi.azure.compute.inputs.GetVirtualMachineArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetVirtualMachineResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetVirtualMachineArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getVirtualMachine(args(argsBuilder).build)

    /** Use this data source to access information about an existing Virtual Machine. */
    inline def getVirtualMachinePlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetVirtualMachinePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetVirtualMachineResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetVirtualMachinePlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getVirtualMachinePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Virtual Machine Scale Set. */
    inline def getVirtualMachineScaleSet(args: Endofunction[com.pulumi.azure.compute.inputs.GetVirtualMachineScaleSetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetVirtualMachineScaleSetResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetVirtualMachineScaleSetArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getVirtualMachineScaleSet(args(argsBuilder).build)

    /** Use this data source to access information about an existing Virtual Machine Scale Set. */
    inline def getVirtualMachineScaleSetPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetVirtualMachineScaleSetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetVirtualMachineScaleSetResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetVirtualMachineScaleSetPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getVirtualMachineScaleSetPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.VirtualMachineArgs.Builder)
    /**
     * @param additionalCapabilities An `additionalCapabilities` block as defined below.
     * @return builder
     */
    def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineIdentityArgs.Builder]):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param osProfile An `osProfile` block as defined below. Required when `createOption` in the `storageOsDisk` block is set to `FromImage`.
     * @return builder
     */
    def osProfile(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileArgs.Builder]):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileArgs.builder
      builder.osProfile(args(argsBuilder).build)

    /**
     * @param osProfileLinuxConfig (Required, when a Linux machine) An `osProfileLinuxConfig` block as defined below.
     * @return builder
     */
    def osProfileLinuxConfig(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileLinuxConfigArgs.Builder]):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileLinuxConfigArgs.builder
      builder.osProfileLinuxConfig(args(argsBuilder).build)

    /**
     * @param osProfileSecrets One or more `osProfileSecrets` blocks as defined below.
     * @return builder
     */
    def osProfileSecrets(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileSecretArgs.Builder]*):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileSecretArgs.builder
      builder.osProfileSecrets(args.map(_(argsBuilder).build)*)

    /**
     * @param osProfileWindowsConfig (Required, when a Windows machine) An `osProfileWindowsConfig` block as defined below.
     * @return builder
     */
    def osProfileWindowsConfig(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigArgs.Builder]):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigArgs.builder
      builder.osProfileWindowsConfig(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachinePlanArgs.Builder]):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachinePlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param storageDataDisks One or more `storageDataDisk` blocks as defined below.
     * 
     *  &gt; **Please Note:** Data Disks can also be attached either using this block or the `azure.compute.DataDiskAttachment` resource - but not both.
     * @return builder
     */
    def storageDataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineStorageDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineStorageDataDiskArgs.builder
      builder.storageDataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param storageImageReference A `storageImageReference` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def storageImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineStorageImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineStorageImageReferenceArgs.builder
      builder.storageImageReference(args(argsBuilder).build)

    /**
     * @param storageOsDisk A `storageOsDisk` block as defined below.
     * @return builder
     */
    def storageOsDisk(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineStorageOsDiskArgs.Builder]):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineStorageOsDiskArgs.builder
      builder.storageOsDisk(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a managed disk. */
  def ManagedDisk(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.ManagedDiskArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.ManagedDiskArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.ManagedDisk(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.compute.RunCommandArgs.Builder)
    /**
     * @param errorBlobManagedIdentity An `errorBlobManagedIdentity` block as defined below. User-assigned managed Identity that has access to errorBlobUri storage blob.
     * @return builder
     */
    def errorBlobManagedIdentity(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandErrorBlobManagedIdentityArgs.Builder]):
        com.pulumi.azure.compute.RunCommandArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.RunCommandErrorBlobManagedIdentityArgs.builder
      builder.errorBlobManagedIdentity(args(argsBuilder).build)

    /**
     * @param outputBlobManagedIdentity An `outputBlobManagedIdentity` block as defined below. User-assigned managed Identity that has access to outputBlobUri storage blob.
     * @return builder
     */
    def outputBlobManagedIdentity(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandOutputBlobManagedIdentityArgs.Builder]):
        com.pulumi.azure.compute.RunCommandArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.RunCommandOutputBlobManagedIdentityArgs.builder
      builder.outputBlobManagedIdentity(args(argsBuilder).build)

    /**
     * @param parameters A list of `parameter` blocks as defined below. The parameters used by the script.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandParameterArgs.Builder]*):
        com.pulumi.azure.compute.RunCommandArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.RunCommandParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

    /**
     * @param protectedParameters A list of `protectedParameter` blocks as defined below. The protected parameters used by the script.
     * @return builder
     */
    def protectedParameters(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandProtectedParameterArgs.Builder]*):
        com.pulumi.azure.compute.RunCommandArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.RunCommandProtectedParameterArgs.builder
      builder.protectedParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param source A `source` block as defined below. The source of the run command script.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandSourceArgs.Builder]):
        com.pulumi.azure.compute.RunCommandArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.RunCommandSourceArgs.builder
      builder.source(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.RunCommandArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Shared Image within a Shared Image Gallery. */
  def SharedImage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.SharedImageArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.SharedImageArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.SharedImage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.compute.inputs.ScaleSetOsProfileLinuxConfigArgs.Builder)
    /**
     * @param sshKeys One or more `sshKeys` blocks as defined below.
     * 
     *  &gt; **Note:** Please note that the only allowed `path` is `/home/&lt;username&gt;/.ssh/authorized_keys` due to a limitation of Azure.
     * 
     *  &gt; **NOTE:** At least one `sshKeys` block is required if `disablePasswordAuthentication` is set to `true`.
     * @return builder
     */
    def sshKeys(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileLinuxConfigSshKeyArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ScaleSetOsProfileLinuxConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileLinuxConfigSshKeyArgs.builder
      builder.sshKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.Builder)
    /**
     * @param ipTags One or more `ipTag` blocks as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    def ipTags(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs.builder
      builder.ipTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.SharedImageState.Builder)
    /**
     * @param identifier An `identifier` block as defined below.
     * @return builder
     */
    def identifier(args: Endofunction[com.pulumi.azure.compute.inputs.SharedImageIdentifierArgs.Builder]):
        com.pulumi.azure.compute.inputs.SharedImageState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SharedImageIdentifierArgs.builder
      builder.identifier(args(argsBuilder).build)

    /**
     * @param purchasePlan A `purchasePlan` block as defined below.
     * @return builder
     */
    def purchasePlan(args: Endofunction[com.pulumi.azure.compute.inputs.SharedImagePurchasePlanArgs.Builder]):
        com.pulumi.azure.compute.inputs.SharedImageState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SharedImagePurchasePlanArgs.builder
      builder.purchasePlan(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.inputs.SharedImageState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.inputs.VirtualMachineState.Builder)
    /**
     * @param additionalCapabilities An `additionalCapabilities` block as defined below.
     * @return builder
     */
    def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param osProfile An `osProfile` block as defined below. Required when `createOption` in the `storageOsDisk` block is set to `FromImage`.
     * @return builder
     */
    def osProfile(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileArgs.Builder]):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileArgs.builder
      builder.osProfile(args(argsBuilder).build)

    /**
     * @param osProfileLinuxConfig (Required, when a Linux machine) An `osProfileLinuxConfig` block as defined below.
     * @return builder
     */
    def osProfileLinuxConfig(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileLinuxConfigArgs.Builder]):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileLinuxConfigArgs.builder
      builder.osProfileLinuxConfig(args(argsBuilder).build)

    /**
     * @param osProfileSecrets One or more `osProfileSecrets` blocks as defined below.
     * @return builder
     */
    def osProfileSecrets(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileSecretArgs.Builder]*):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileSecretArgs.builder
      builder.osProfileSecrets(args.map(_(argsBuilder).build)*)

    /**
     * @param osProfileWindowsConfig (Required, when a Windows machine) An `osProfileWindowsConfig` block as defined below.
     * @return builder
     */
    def osProfileWindowsConfig(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigArgs.Builder]):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigArgs.builder
      builder.osProfileWindowsConfig(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachinePlanArgs.Builder]):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachinePlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param storageDataDisks One or more `storageDataDisk` blocks as defined below.
     * 
     *  &gt; **Please Note:** Data Disks can also be attached either using this block or the `azure.compute.DataDiskAttachment` resource - but not both.
     * @return builder
     */
    def storageDataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineStorageDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineStorageDataDiskArgs.builder
      builder.storageDataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param storageImageReference A `storageImageReference` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def storageImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineStorageImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineStorageImageReferenceArgs.builder
      builder.storageImageReference(args(argsBuilder).build)

    /**
     * @param storageOsDisk A `storageOsDisk` block as defined below.
     * @return builder
     */
    def storageOsDisk(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineStorageOsDiskArgs.Builder]):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineStorageOsDiskArgs.builder
      builder.storageOsDisk(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetOsDiskArgs.Builder)
    /**
     * @param diffDiskSettings A `diffDiskSettings` block as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    def diffDiskSettings(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetOsDiskArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs.builder
      builder.diffDiskSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.ImageState.Builder)
    /**
     * @param dataDisks One or more `dataDisk` blocks as defined below.
     * 
     *  &gt; **Note:** `dataDisk` cannot be set together with `sourceVirtualMachineId`.
     * @return builder
     */
    def dataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.ImageDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ImageState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ImageDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param osDisk One or more `osDisk` blocks as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** `osDisk` cannot be set together with `sourceVirtualMachineId`.
     * @return builder
     */
    def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.ImageOsDiskArgs.Builder]):
        com.pulumi.azure.compute.inputs.ImageState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ImageOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.inputs.ImageState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileIpConfigurationArgs.Builder)
    /**
     * @param publicIpAddressConfiguration Describes a virtual machines scale set IP Configuration&#39;s PublicIPAddress configuration. The `publicIpAddressConfiguration` block is documented below.
     * @return builder
     */
    def publicIpAddressConfiguration(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileIpConfigurationPublicIpAddressConfigurationArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileIpConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileIpConfigurationPublicIpAddressConfigurationArgs.builder
      builder.publicIpAddressConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceArgs.Builder)
    /**
     * @param ipConfigurations One or more `ipConfiguration` blocks as defined above.
     * @return builder
     */
    def ipConfigurations(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs.Builder)
    /**
     * @param additionalUnattendContents One or more `additionalUnattendContent` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def additionalUnattendContents(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationAdditionalUnattendContentArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationAdditionalUnattendContentArgs.builder
      builder.additionalUnattendContents(args.map(_(argsBuilder).build)*)

    /**
     * @param secrets One or more `secret` blocks as defined below.
     * @return builder
     */
    def secrets(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param winrmListeners One or more `winrmListener` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def winrmListeners(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationWinrmListenerArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationWinrmListenerArgs.builder
      builder.winrmListeners(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsArgs.Builder)
    /**
     * @param diskEncryptionKey A `diskEncryptionKey` block as defined below.
     * @return builder
     */
    def diskEncryptionKey(args: Endofunction[com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsDiskEncryptionKeyArgs.Builder]):
        com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsDiskEncryptionKeyArgs.builder
      builder.diskEncryptionKey(args(argsBuilder).build)

    /**
     * @param keyEncryptionKey A `keyEncryptionKey` block as defined below.
     * @return builder
     */
    def keyEncryptionKey(args: Endofunction[com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsKeyEncryptionKeyArgs.Builder]):
        com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsKeyEncryptionKeyArgs.builder
      builder.keyEncryptionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.SharedImageGalleryState.Builder)
    /**
     * @param sharing A `sharing` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def sharing(args: Endofunction[com.pulumi.azure.compute.inputs.SharedImageGallerySharingArgs.Builder]):
        com.pulumi.azure.compute.inputs.SharedImageGalleryState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SharedImageGallerySharingArgs.builder
      builder.sharing(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.inputs.SharedImageGalleryState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsDiskArgs.Builder)
    /**
     * @param diffDiskSettings A `diffDiskSettings` block as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    def diffDiskSettings(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsDiskArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs.builder
      builder.diffDiskSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetOsDiskArgs.Builder)
    /**
     * @param diffDiskSettings A `diffDiskSettings` block as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    def diffDiskSettings(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetOsDiskArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs.builder
      builder.diffDiskSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.SharedImageVersionState.Builder)
    /**
     * @param targetRegions One or more `targetRegion` blocks as documented below.
     * @return builder
     */
    def targetRegions(args: Endofunction[com.pulumi.azure.compute.inputs.SharedImageVersionTargetRegionArgs.Builder]*):
        com.pulumi.azure.compute.inputs.SharedImageVersionState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.SharedImageVersionTargetRegionArgs.builder
      builder.targetRegions(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.inputs.SharedImageVersionState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileArgs.Builder)
    /**
     * @param linuxConfiguration A `linuxConfiguration` block as documented below.
     * @return builder
     */
    def linuxConfiguration(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationArgs.builder
      builder.linuxConfiguration(args(argsBuilder).build)

    /**
     * @param windowsConfiguration A `windowsConfiguration` block as documented below.
     * @return builder
     */
    def windowsConfiguration(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs.builder
      builder.windowsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.VirtualMachineOsProfileLinuxConfigArgs.Builder)
    /**
     * @param sshKeys One or more `sshKeys` blocks as defined below. This field is required if `disablePasswordAuthentication` is set to `true`.
     * @return builder
     */
    def sshKeys(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileLinuxConfigSshKeyArgs.Builder]*):
        com.pulumi.azure.compute.inputs.VirtualMachineOsProfileLinuxConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileLinuxConfigSshKeyArgs.builder
      builder.sshKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.Builder)
    /**
     * @param publicIpAddresses A `publicIpAddress` block as defined below.
     * @return builder
     */
    def publicIpAddresses(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.builder
      builder.publicIpAddresses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsDiskArgs.Builder)
    /**
     * @param diffDiskSettings A `diffDiskSettings` block as defined above. Changing this forces a new resource to be created.
     * 
     *  &gt; **NOTE:** `diffDiskSettings` can only be set when `caching` is set to `ReadOnly`. More information can be found [here](https://docs.microsoft.com/azure/virtual-machines/ephemeral-os-disks-deploy#vm-template-deployment). Additionally, this property cannot be set when an existing Managed Disk is used to create the Virtual Machine by setting `osManagedDiskId`.
     * @return builder
     */
    def diffDiskSettings(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsDiskDiffDiskSettingsArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsDiskArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsDiskDiffDiskSettingsArgs.builder
      builder.diffDiskSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.CapacityReservationState.Builder)
    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.compute.inputs.CapacityReservationSkuArgs.Builder]):
        com.pulumi.azure.compute.inputs.CapacityReservationState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.CapacityReservationSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.inputs.CapacityReservationState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.inputs.ExtensionState.Builder)
    /**
     * @param protectedSettingsFromKeyVault A `protectedSettingsFromKeyVault` block as defined below.
     * 
     *  &gt; **Note:** `protectedSettingsFromKeyVault` cannot be used with `protectedSettings`
     * @return builder
     */
    def protectedSettingsFromKeyVault(args: Endofunction[com.pulumi.azure.compute.inputs.ExtensionProtectedSettingsFromKeyVaultArgs.Builder]):
        com.pulumi.azure.compute.inputs.ExtensionState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ExtensionProtectedSettingsFromKeyVaultArgs.builder
      builder.protectedSettingsFromKeyVault(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.inputs.ExtensionState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.inputs.ScaleSetStandbyPoolState.Builder)
    /**
     * @param elasticityProfile An `elasticityProfile` block as defined below.
     * @return builder
     */
    def elasticityProfile(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetStandbyPoolElasticityProfileArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetStandbyPoolState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetStandbyPoolElasticityProfileArgs.builder
      builder.elasticityProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.inputs.ScaleSetStandbyPoolState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.inputs.VirtualMachineOsProfileSecretArgs.Builder)
    /**
     * @param vaultCertificates One or more `vaultCertificates` blocks as defined below.
     * @return builder
     */
    def vaultCertificates(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileSecretVaultCertificateArgs.Builder]*):
        com.pulumi.azure.compute.inputs.VirtualMachineOsProfileSecretArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileSecretVaultCertificateArgs.builder
      builder.vaultCertificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsDiskArgs.Builder)
    /**
     * @param diffDiskSettings A `diffDiskSettings` block as defined above. Changing this forces a new resource to be created.
     * 
     *  &gt; **NOTE:** `diffDiskSettings` can only be set when `caching` is set to `ReadOnly`. More information can be found [here](https://docs.microsoft.com/azure/virtual-machines/ephemeral-os-disks-deploy#vm-template-deployment). Additionally, this property cannot be set when an existing Managed Disk is used to create the Virtual Machine by setting `osManagedDiskId`.
     * @return builder
     */
    def diffDiskSettings(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsDiskDiffDiskSettingsArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsDiskArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsDiskDiffDiskSettingsArgs.builder
      builder.diffDiskSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.RunCommandState.Builder)
    /**
     * @param errorBlobManagedIdentity An `errorBlobManagedIdentity` block as defined below. User-assigned managed Identity that has access to errorBlobUri storage blob.
     * @return builder
     */
    def errorBlobManagedIdentity(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandErrorBlobManagedIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.RunCommandState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.RunCommandErrorBlobManagedIdentityArgs.builder
      builder.errorBlobManagedIdentity(args(argsBuilder).build)

    def instanceViews(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandInstanceViewArgs.Builder]*):
        com.pulumi.azure.compute.inputs.RunCommandState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.RunCommandInstanceViewArgs.builder
      builder.instanceViews(args.map(_(argsBuilder).build)*)

    /**
     * @param outputBlobManagedIdentity An `outputBlobManagedIdentity` block as defined below. User-assigned managed Identity that has access to outputBlobUri storage blob.
     * @return builder
     */
    def outputBlobManagedIdentity(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandOutputBlobManagedIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.RunCommandState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.RunCommandOutputBlobManagedIdentityArgs.builder
      builder.outputBlobManagedIdentity(args(argsBuilder).build)

    /**
     * @param parameters A list of `parameter` blocks as defined below. The parameters used by the script.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandParameterArgs.Builder]*):
        com.pulumi.azure.compute.inputs.RunCommandState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.RunCommandParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

    /**
     * @param protectedParameters A list of `protectedParameter` blocks as defined below. The protected parameters used by the script.
     * @return builder
     */
    def protectedParameters(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandProtectedParameterArgs.Builder]*):
        com.pulumi.azure.compute.inputs.RunCommandState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.RunCommandProtectedParameterArgs.builder
      builder.protectedParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param source A `source` block as defined below. The source of the run command script.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandSourceArgs.Builder]):
        com.pulumi.azure.compute.inputs.RunCommandState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.RunCommandSourceArgs.builder
      builder.source(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.inputs.RunCommandState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigArgs.Builder)
    /**
     * @param additionalUnattendConfigs An `additionalUnattendConfig` block as documented below.
     * @return builder
     */
    def additionalUnattendConfigs(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigAdditionalUnattendConfigArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigAdditionalUnattendConfigArgs.builder
      builder.additionalUnattendConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param winrms A collection of `winrm` blocks as documented below.
     * @return builder
     */
    def winrms(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigWinrmArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigWinrmArgs.builder
      builder.winrms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.SnapshotState.Builder)
    /**
     * @param encryptionSettings A `encryptionSettings` block as defined below.
     * 
     *  &gt; **Note:** Removing `encryptionSettings` forces a new resource to be created.
     * @return builder
     */
    def encryptionSettings(args: Endofunction[com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsArgs.Builder]):
        com.pulumi.azure.compute.inputs.SnapshotState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsArgs.builder
      builder.encryptionSettings(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.inputs.SnapshotState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.inputs.GalleryApplicationVersionState.Builder)
    /**
     * @param manageAction A `manageAction` block as defined below.
     * @return builder
     */
    def manageAction(args: Endofunction[com.pulumi.azure.compute.inputs.GalleryApplicationVersionManageActionArgs.Builder]):
        com.pulumi.azure.compute.inputs.GalleryApplicationVersionState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.GalleryApplicationVersionManageActionArgs.builder
      builder.manageAction(args(argsBuilder).build)

    /**
     * @param source A `source` block as defined below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.azure.compute.inputs.GalleryApplicationVersionSourceArgs.Builder]):
        com.pulumi.azure.compute.inputs.GalleryApplicationVersionState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.GalleryApplicationVersionSourceArgs.builder
      builder.source(args(argsBuilder).build)

    /**
     * @param targetRegions One or more `targetRegion` blocks as defined below.
     * @return builder
     */
    def targetRegions(args: Endofunction[com.pulumi.azure.compute.inputs.GalleryApplicationVersionTargetRegionArgs.Builder]*):
        com.pulumi.azure.compute.inputs.GalleryApplicationVersionState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.GalleryApplicationVersionTargetRegionArgs.builder
      builder.targetRegions(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.inputs.GalleryApplicationVersionState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.Builder)
    /**
     * @param ipTags One or more `ipTag` blocks as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    def ipTags(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs.builder
      builder.ipTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileArgs.Builder)
    /**
     * @param dnsSettings A `dnsSettings` block as documented below.
     * @return builder
     */
    def dnsSettings(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileDnsSettingsArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileDnsSettingsArgs.builder
      builder.dnsSettings(args(argsBuilder).build)

    /**
     * @param ipConfigurations An `ipConfiguration` block as documented below.
     * @return builder
     */
    def ipConfigurations(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileIpConfigurationArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetExtensionArgs.Builder)
    /**
     * @param protectedSettingsFromKeyVault A `protectedSettingsFromKeyVault` block as defined below.
     * 
     *  &gt; **Note:** `protectedSettingsFromKeyVault` cannot be used with `protectedSettings`
     * @return builder
     */
    def protectedSettingsFromKeyVault(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetExtensionProtectedSettingsFromKeyVaultArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetExtensionArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetExtensionProtectedSettingsFromKeyVaultArgs.builder
      builder.protectedSettingsFromKeyVault(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.Builder)
    /**
     * @param publicIpAddresses A `publicIpAddress` block as defined below.
     * @return builder
     */
    def publicIpAddresses(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.builder
      builder.publicIpAddresses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder)
    /**
     * @param additionalCapabilities An `additionalCapabilities` block as defined below.
     * @return builder
     */
    def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param adminSshKeys One or more `adminSshKey` blocks as defined below.
     * 
     *  &gt; **Note:** One of either `adminPassword` or `adminSshKey` must be specified.
     * @return builder
     */
    def adminSshKeys(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAdminSshKeyArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAdminSshKeyArgs.builder
      builder.adminSshKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param automaticInstanceRepair An `automaticInstanceRepair` block as defined below. To enable the automatic instance repair, this Virtual Machine Scale Set must have a valid `healthProbeId` or an [Application Health Extension](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-health-extension).
     * 
     *  &gt; **Note:** For more information about Automatic Instance Repair, please refer to the [product documentation](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-automatic-instance-repairs).
     * @return builder
     */
    def automaticInstanceRepair(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAutomaticInstanceRepairArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAutomaticInstanceRepairArgs.builder
      builder.automaticInstanceRepair(args(argsBuilder).build)

    /**
     * @param automaticOsUpgradePolicy An `automaticOsUpgradePolicy` block as defined below. This can only be specified when `upgradeMode` is set to either `Automatic` or `Rolling`.
     * @return builder
     */
    def automaticOsUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAutomaticOsUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAutomaticOsUpgradePolicyArgs.builder
      builder.automaticOsUpgradePolicy(args(argsBuilder).build)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param dataDisks One or more `dataDisk` blocks as defined below.
     * @return builder
     */
    def dataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param extensions One or more `extension` blocks as defined below
     * @return builder
     */
    def extensions(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetExtensionArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param galleryApplications One or more `galleryApplication` blocks as defined below.
     * @return builder
     */
    def galleryApplications(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetGalleryApplicationArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetGalleryApplicationArgs.builder
      builder.galleryApplications(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkInterfaces One or more `networkInterface` blocks as defined below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param osDisk An `osDisk` block as defined below.
     * @return builder
     */
    def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetOsDiskArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** When using an image from Azure Marketplace a `plan` must be specified.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetPlanArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param rollingUpgradePolicy A `rollingUpgradePolicy` block as defined below. This is Required and can only be specified when `upgradeMode` is set to `Automatic` or `Rolling`. Changing this forces a new resource to be created.
     * @return builder
     */
    def rollingUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetRollingUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetRollingUpgradePolicyArgs.builder
      builder.rollingUpgradePolicy(args(argsBuilder).build)

    /**
     * @param scaleIn A `scaleIn` block as defined below.
     * @return builder
     */
    def scaleIn(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetScaleInArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetScaleInArgs.builder
      builder.scaleIn(args(argsBuilder).build)

    /**
     * @param secrets One or more `secret` blocks as defined below.
     * @return builder
     */
    def secrets(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSecretArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceImageReference A `sourceImageReference` block as defined below.
     * 
     *  &gt; **Note:** One of either `sourceImageId` or `sourceImageReference` must be set.
     * @return builder
     */
    def sourceImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSourceImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSourceImageReferenceArgs.builder
      builder.sourceImageReference(args(argsBuilder).build)

    /**
     * @param spotRestore A `spotRestore` block as defined below.
     * @return builder
     */
    def spotRestore(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSpotRestoreArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSpotRestoreArgs.builder
      builder.spotRestore(args(argsBuilder).build)

    /**
     * @param terminationNotification A `terminationNotification` block as defined below.
     * @return builder
     */
    def terminationNotification(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetTerminationNotificationArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetTerminationNotificationArgs.builder
      builder.terminationNotification(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretArgs.Builder)
    /**
     * @param certificates One or more `certificate` blocks as defined below.
     * @return builder
     */
    def certificates(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretCertificateArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.LinuxVirtualMachineSecretArgs.Builder)
    /**
     * @param certificates One or more `certificate` blocks as defined above.
     * @return builder
     */
    def certificates(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineSecretCertificateArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineSecretArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineSecretCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.VirtualMachineScaleSetExtensionState.Builder)
    /**
     * @param protectedSettingsFromKeyVault A `protectedSettingsFromKeyVault` block as defined below.
     * 
     *  &gt; **Note:** `protectedSettingsFromKeyVault` cannot be used with `protectedSettings`
     * @return builder
     */
    def protectedSettingsFromKeyVault(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineScaleSetExtensionProtectedSettingsFromKeyVaultArgs.Builder]):
        com.pulumi.azure.compute.inputs.VirtualMachineScaleSetExtensionState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineScaleSetExtensionProtectedSettingsFromKeyVaultArgs.builder
      builder.protectedSettingsFromKeyVault(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.Builder)
    /**
     * @param publicIpAddresses A `publicIpAddress` block as defined below.
     * @return builder
     */
    def publicIpAddresses(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.builder
      builder.publicIpAddresses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder)
    /**
     * @param additionalCapabilities An `additionalCapabilities` block as defined below.
     * @return builder
     */
    def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param automaticInstanceRepair An `automaticInstanceRepair` block as defined below.
     * 
     *  &gt; **Note:** To enable the `automaticInstanceRepair`, the Orchestrated Virtual Machine Scale Set must have a valid [Application Health Extension](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-health-extension).
     * @return builder
     */
    def automaticInstanceRepair(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs.builder
      builder.automaticInstanceRepair(args(argsBuilder).build)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param dataDisks One or more `dataDisk` blocks as defined below.
     * @return builder
     */
    def dataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param extensions One or more `extension` blocks as defined below
     * @return builder
     */
    def extensions(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetExtensionArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkInterfaces One or more `networkInterface` blocks as defined below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param osDisk An `osDisk` block as defined below.
     * @return builder
     */
    def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsDiskArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    /**
     * @param osProfile An `osProfile` block as defined below.
     * @return builder
     */
    def osProfile(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileArgs.builder
      builder.osProfile(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetPlanArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param priorityMix a `priorityMix` block as defined below
     * @return builder
     */
    def priorityMix(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetPriorityMixArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetPriorityMixArgs.builder
      builder.priorityMix(args(argsBuilder).build)

    /**
     * @param rollingUpgradePolicy A `rollingUpgradePolicy` block as defined below. This is Required when `upgradeMode` is set to `Rolling` and cannot be specified when `upgradeMode` is set to `Manual`. Changing this forces a new resource to be created.
     * @return builder
     */
    def rollingUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetRollingUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetRollingUpgradePolicyArgs.builder
      builder.rollingUpgradePolicy(args(argsBuilder).build)

    /**
     * @param skuProfile An `skuProfile` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** If `skuProfile` is specified the `skuName` must be set to `Mix`.
     * @return builder
     */
    def skuProfile(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetSkuProfileArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetSkuProfileArgs.builder
      builder.skuProfile(args(argsBuilder).build)

    /**
     * @param sourceImageReference A `sourceImageReference` block as defined below.
     * @return builder
     */
    def sourceImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetSourceImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetSourceImageReferenceArgs.builder
      builder.sourceImageReference(args(argsBuilder).build)

    /**
     * @param terminationNotification A `terminationNotification` block as defined below.
     * @return builder
     */
    def terminationNotification(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetTerminationNotificationArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetTerminationNotificationArgs.builder
      builder.terminationNotification(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretArgs.Builder)
    /**
     * @param certificates One or more `certificate` blocks as defined below.
     * @return builder
     */
    def certificates(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretCertificateArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.WindowsVirtualMachineSecretArgs.Builder)
    /**
     * @param certificates One or more `certificate` blocks as defined above.
     * @return builder
     */
    def certificates(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineSecretCertificateArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineSecretArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineSecretCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder)
    /**
     * @param additionalCapabilities An `additionalCapabilities` block as defined below.
     * @return builder
     */
    def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param additionalUnattendContents One or more `additionalUnattendContent` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def additionalUnattendContents(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAdditionalUnattendContentArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAdditionalUnattendContentArgs.builder
      builder.additionalUnattendContents(args.map(_(argsBuilder).build)*)

    /**
     * @param automaticInstanceRepair An `automaticInstanceRepair` block as defined below. To enable the automatic instance repair, this Virtual Machine Scale Set must have a valid `healthProbeId` or an [Application Health Extension](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-health-extension).
     * 
     *  &gt; **Note:** For more information about Automatic Instance Repair, please refer to [this doc](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-automatic-instance-repairs).
     * @return builder
     */
    def automaticInstanceRepair(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAutomaticInstanceRepairArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAutomaticInstanceRepairArgs.builder
      builder.automaticInstanceRepair(args(argsBuilder).build)

    /**
     * @param automaticOsUpgradePolicy An `automaticOsUpgradePolicy` block as defined below. This can only be specified when `upgradeMode` is set to either `Automatic` or `Rolling`.
     * @return builder
     */
    def automaticOsUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAutomaticOsUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAutomaticOsUpgradePolicyArgs.builder
      builder.automaticOsUpgradePolicy(args(argsBuilder).build)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param dataDisks One or more `dataDisk` blocks as defined below.
     * @return builder
     */
    def dataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param extensions One or more `extension` blocks as defined below
     * @return builder
     */
    def extensions(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetExtensionArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param galleryApplications One or more `galleryApplication` blocks as defined below.
     * @return builder
     */
    def galleryApplications(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetGalleryApplicationArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetGalleryApplicationArgs.builder
      builder.galleryApplications(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkInterfaces One or more `networkInterface` blocks as defined below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param osDisk An `osDisk` block as defined below.
     * @return builder
     */
    def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetOsDiskArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** When using an image from Azure Marketplace a `plan` must be specified.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetPlanArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param rollingUpgradePolicy A `rollingUpgradePolicy` block as defined below. This is Required and can only be specified when `upgradeMode` is set to `Automatic` or `Rolling`. Changing this forces a new resource to be created.
     * @return builder
     */
    def rollingUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetRollingUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetRollingUpgradePolicyArgs.builder
      builder.rollingUpgradePolicy(args(argsBuilder).build)

    /**
     * @param scaleIn A `scaleIn` block as defined below.
     * @return builder
     */
    def scaleIn(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetScaleInArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetScaleInArgs.builder
      builder.scaleIn(args(argsBuilder).build)

    /**
     * @param secrets One or more `secret` blocks as defined below.
     * @return builder
     */
    def secrets(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSecretArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceImageReference A `sourceImageReference` block as defined below.
     * 
     *  &gt; **Note:** One of either `sourceImageId` or `sourceImageReference` must be set.
     * @return builder
     */
    def sourceImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSourceImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSourceImageReferenceArgs.builder
      builder.sourceImageReference(args(argsBuilder).build)

    /**
     * @param spotRestore A `spotRestore` block as defined below.
     * @return builder
     */
    def spotRestore(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSpotRestoreArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSpotRestoreArgs.builder
      builder.spotRestore(args(argsBuilder).build)

    /**
     * @param terminationNotification A `terminationNotification` block as defined below.
     * @return builder
     */
    def terminationNotification(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetTerminationNotificationArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetTerminationNotificationArgs.builder
      builder.terminationNotification(args(argsBuilder).build)

    /**
     * @param winrmListeners One or more `winrmListener` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def winrmListeners(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetWinrmListenerArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetWinrmListenerArgs.builder
      builder.winrmListeners(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.inputs.SharedImageGallerySharingArgs.Builder)
    /**
     * @param communityGallery A `communityGallery` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** `communityGallery` must be set when `permission` is set to `Community`.
     * @return builder
     */
    def communityGallery(args: Endofunction[com.pulumi.azure.compute.inputs.SharedImageGallerySharingCommunityGalleryArgs.Builder]):
        com.pulumi.azure.compute.inputs.SharedImageGallerySharingArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SharedImageGallerySharingCommunityGalleryArgs.builder
      builder.communityGallery(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.ManagedDiskState.Builder)
    /**
     * @param encryptionSettings A `encryptionSettings` block as defined below.
     * 
     *  &gt; **NOTE:** Removing `encryptionSettings` forces a new resource to be created.
     * @return builder
     */
    def encryptionSettings(args: Endofunction[com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsArgs.Builder]):
        com.pulumi.azure.compute.inputs.ManagedDiskState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsArgs.builder
      builder.encryptionSettings(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.inputs.ManagedDiskState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.inputs.ScaleSetState.Builder)
    /**
     * @param bootDiagnostics A `bootDiagnostics` block as referenced below.
     * @return builder
     */
    def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param extensions Can be specified multiple times to add extension profiles to the scale set. Each `extension` block supports the fields documented below.
     * @return builder
     */
    def extensions(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetExtensionArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkProfiles A collection of `networkProfile` blocks as documented below.
     * @return builder
     */
    def networkProfiles(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileArgs.builder
      builder.networkProfiles(args.map(_(argsBuilder).build)*)

    /**
     * @param osProfile A `osProfile` block as documented below.
     * @return builder
     */
    def osProfile(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileArgs.builder
      builder.osProfile(args(argsBuilder).build)

    /**
     * @param osProfileLinuxConfig A `osProfileLinuxConfig` block as documented below.
     * @return builder
     */
    def osProfileLinuxConfig(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileLinuxConfigArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileLinuxConfigArgs.builder
      builder.osProfileLinuxConfig(args(argsBuilder).build)

    /**
     * @param osProfileSecrets A collection of `osProfileSecrets` blocks as documented below.
     * @return builder
     */
    def osProfileSecrets(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileSecretArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileSecretArgs.builder
      builder.osProfileSecrets(args.map(_(argsBuilder).build)*)

    /**
     * @param osProfileWindowsConfig A `osProfileWindowsConfig` block as documented below.
     * @return builder
     */
    def osProfileWindowsConfig(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigArgs.builder
      builder.osProfileWindowsConfig(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as documented below.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetPlanArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param rollingUpgradePolicy A `rollingUpgradePolicy` block as defined below. This is only applicable when the `upgradePolicyMode` is `Rolling`.
     * @return builder
     */
    def rollingUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetRollingUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetRollingUpgradePolicyArgs.builder
      builder.rollingUpgradePolicy(args(argsBuilder).build)

    /**
     * @param sku A `sku` block as documented below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetSkuArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    /**
     * @param storageProfileDataDisks A `storageProfileDataDisk` block as documented below.
     * @return builder
     */
    def storageProfileDataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetStorageProfileDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetStorageProfileDataDiskArgs.builder
      builder.storageProfileDataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param storageProfileImageReference A `storageProfileImageReference` block as documented below.
     * @return builder
     */
    def storageProfileImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetStorageProfileImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetStorageProfileImageReferenceArgs.builder
      builder.storageProfileImageReference(args(argsBuilder).build)

    /**
     * @param storageProfileOsDisk A `storageProfileOsDisk` block as documented below.
     * @return builder
     */
    def storageProfileOsDisk(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetStorageProfileOsDiskArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetStorageProfileOsDiskArgs.builder
      builder.storageProfileOsDisk(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.inputs.RunCommandSourceArgs.Builder)
    /**
     * @param scriptUriManagedIdentity A `scriptUriManagedIdentity` block as defined above.
     * @return builder
     */
    def scriptUriManagedIdentity(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandSourceScriptUriManagedIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.RunCommandSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.RunCommandSourceScriptUriManagedIdentityArgs.builder
      builder.scriptUriManagedIdentity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.ScaleSetOsProfileSecretArgs.Builder)
    /**
     * @param vaultCertificates (Required, on Windows machines) One or more `vaultCertificates` blocks as defined below.
     * @return builder
     */
    def vaultCertificates(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileSecretVaultCertificateArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ScaleSetOsProfileSecretArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileSecretVaultCertificateArgs.builder
      builder.vaultCertificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigArgs.Builder)
    /**
     * @param additionalUnattendConfigs An `additionalUnattendConfig` block as defined below.
     * @return builder
     */
    def additionalUnattendConfigs(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigAdditionalUnattendConfigArgs.Builder]*):
        com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigAdditionalUnattendConfigArgs.builder
      builder.additionalUnattendConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param winrms One or more `winrm` blocks as defined below.
     * @return builder
     */
    def winrms(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigWinrmArgs.Builder]*):
        com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigWinrmArgs.builder
      builder.winrms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceArgs.Builder)
    /**
     * @param ipConfigurations One or more `ipConfiguration` blocks as defined above.
     * @return builder
     */
    def ipConfigurations(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder)
    /**
     * @param additionalCapabilities A `additionalCapabilities` block as defined below.
     * @return builder
     */
    def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param additionalUnattendContents One or more `additionalUnattendContent` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def additionalUnattendContents(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineAdditionalUnattendContentArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineAdditionalUnattendContentArgs.builder
      builder.additionalUnattendContents(args.map(_(argsBuilder).build)*)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param galleryApplications One or more `galleryApplication` blocks as defined below.
     * 
     *  &gt; **Note** Gallery Application Assignments can be defined either directly on `azure.compute.WindowsVirtualMachine` resource, or using the `azure.compute.GalleryApplicationAssignment` resource - but the two approaches cannot be used together. If both are used with the same Virtual Machine, spurious changes will occur. If `azure.compute.GalleryApplicationAssignment` is used, it&#39;s recommended to use `ignoreChanges` for the `galleryApplication` block on the corresponding `azure.compute.WindowsVirtualMachine` resource, to avoid a persistent diff when using this resource.
     * @return builder
     */
    def galleryApplications(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineGalleryApplicationArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineGalleryApplicationArgs.builder
      builder.galleryApplications(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param osDisk An `osDisk` block as defined below.
     * @return builder
     */
    def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsDiskArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    /**
     * @param osImageNotification A `osImageNotification` block as defined below.
     * @return builder
     */
    def osImageNotification(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsImageNotificationArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsImageNotificationArgs.builder
      builder.osImageNotification(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachinePlanArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachinePlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param secrets One or more `secret` blocks as defined below.
     * @return builder
     */
    def secrets(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineSecretArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceImageReference A `sourceImageReference` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **NOTE:** One of either `sourceImageId` or `sourceImageReference` must be set.
     * @return builder
     */
    def sourceImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineSourceImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineSourceImageReferenceArgs.builder
      builder.sourceImageReference(args(argsBuilder).build)

    /**
     * @param terminationNotification A `terminationNotification` block as defined below.
     * @return builder
     */
    def terminationNotification(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineTerminationNotificationArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineTerminationNotificationArgs.builder
      builder.terminationNotification(args(argsBuilder).build)

    /**
     * @param winrmListeners One or more `winrmListener` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def winrmListeners(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineWinrmListenerArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineWinrmListenerArgs.builder
      builder.winrmListeners(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSecretArgs.Builder)
    /**
     * @param certificates One or more `certificate` blocks as defined above.
     * @return builder
     */
    def certificates(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSecretCertificateArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSecretArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSecretCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationArgs.Builder)
    /**
     * @param adminSshKeys A `adminSshKey` block as documented below.
     * @return builder
     */
    def adminSshKeys(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationAdminSshKeyArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationAdminSshKeyArgs.builder
      builder.adminSshKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param secrets One or more `secret` blocks as defined below.
     * @return builder
     */
    def secrets(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureState.Builder)
    /**
     * @param filters One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureFilterArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

    /**
     * @param machineScope A `machineScope` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def machineScope(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureMachineScopeArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureMachineScopeArgs.builder
      builder.machineScope(args(argsBuilder).build)

    /**
     * @param storageLocation A `storageLocation` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def storageLocation(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureStorageLocationArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureStorageLocationArgs.builder
      builder.storageLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.Builder)
    /**
     * @param ipTags One or more `ipTag` blocks as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    def ipTags(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs.builder
      builder.ipTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.BastionHostState.Builder)
    /**
     * @param ipConfiguration A `ipConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def ipConfiguration(args: Endofunction[com.pulumi.azure.compute.inputs.BastionHostIpConfigurationArgs.Builder]):
        com.pulumi.azure.compute.inputs.BastionHostState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.BastionHostIpConfigurationArgs.builder
      builder.ipConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.inputs.BastionHostState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetExtensionArgs.Builder)
    /**
     * @param protectedSettingsFromKeyVault A `protectedSettingsFromKeyVault` block as defined below.
     * 
     *  &gt; **Note:** `protectedSettingsFromKeyVault` cannot be used with `protectedSettings`
     * @return builder
     */
    def protectedSettingsFromKeyVault(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetExtensionProtectedSettingsFromKeyVaultArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetExtensionArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetExtensionProtectedSettingsFromKeyVaultArgs.builder
      builder.protectedSettingsFromKeyVault(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSecretArgs.Builder)
    /**
     * @param certificates One or more `certificate` blocks as defined above.
     * @return builder
     */
    def certificates(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSecretCertificateArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSecretArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSecretCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.DiskEncryptionSetState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.compute.inputs.DiskEncryptionSetIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.DiskEncryptionSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.DiskEncryptionSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.inputs.DiskEncryptionSetState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceArgs.Builder)
    /**
     * @param ipConfigurations One or more `ipConfiguration` blocks as defined above.
     * @return builder
     */
    def ipConfigurations(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetExtensionArgs.Builder)
    /**
     * @param protectedSettingsFromKeyVault A `protectedSettingsFromKeyVault` block as defined below.
     * 
     *  &gt; **Note:** `protectedSettingsFromKeyVault` cannot be used with `protectedSettings`
     * @return builder
     */
    def protectedSettingsFromKeyVault(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetExtensionProtectedSettingsFromKeyVaultArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetExtensionArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetExtensionProtectedSettingsFromKeyVaultArgs.builder
      builder.protectedSettingsFromKeyVault(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.PacketCaptureState.Builder)
    /**
     * @param filters One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.azure.compute.inputs.PacketCaptureFilterArgs.Builder]*):
        com.pulumi.azure.compute.inputs.PacketCaptureState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.PacketCaptureFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

    /**
     * @param storageLocation A `storageLocation` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def storageLocation(args: Endofunction[com.pulumi.azure.compute.inputs.PacketCaptureStorageLocationArgs.Builder]):
        com.pulumi.azure.compute.inputs.PacketCaptureState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.PacketCaptureStorageLocationArgs.builder
      builder.storageLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsArgs.Builder)
    /**
     * @param diskEncryptionKey A `diskEncryptionKey` block as defined above.
     * @return builder
     */
    def diskEncryptionKey(args: Endofunction[com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsDiskEncryptionKeyArgs.Builder]):
        com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsDiskEncryptionKeyArgs.builder
      builder.diskEncryptionKey(args(argsBuilder).build)

    /**
     * @param keyEncryptionKey A `keyEncryptionKey` block as defined below.
     * @return builder
     */
    def keyEncryptionKey(args: Endofunction[com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsKeyEncryptionKeyArgs.Builder]):
        com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsKeyEncryptionKeyArgs.builder
      builder.keyEncryptionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder)
    /**
     * @param additionalCapabilities A `additionalCapabilities` block as defined below.
     * @return builder
     */
    def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param adminSshKeys One or more `adminSshKey` blocks as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **NOTE:** One of either `adminPassword` or `adminSshKey` must be specified.
     * @return builder
     */
    def adminSshKeys(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineAdminSshKeyArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineAdminSshKeyArgs.builder
      builder.adminSshKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param galleryApplications One or more `galleryApplication` blocks as defined below.
     * 
     *  &gt; **Note** Gallery Application Assignments can be defined either directly on `azure.compute.LinuxVirtualMachine` resource, or using the `azure.compute.GalleryApplicationAssignment` resource - but the two approaches cannot be used together. If both are used with the same Virtual Machine, spurious changes will occur. If `azure.compute.GalleryApplicationAssignment` is used, it&#39;s recommended to use `ignoreChanges` for the `galleryApplication` block on the corresponding `azure.compute.LinuxVirtualMachine` resource, to avoid a persistent diff when using this resource.
     * @return builder
     */
    def galleryApplications(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineGalleryApplicationArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineGalleryApplicationArgs.builder
      builder.galleryApplications(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param osDisk A `osDisk` block as defined below.
     * @return builder
     */
    def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsDiskArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    /**
     * @param osImageNotification A `osImageNotification` block as defined below.
     * @return builder
     */
    def osImageNotification(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsImageNotificationArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsImageNotificationArgs.builder
      builder.osImageNotification(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachinePlanArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachinePlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param secrets One or more `secret` blocks as defined below.
     * @return builder
     */
    def secrets(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineSecretArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceImageReference A `sourceImageReference` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **NOTE:** One of either `sourceImageId` or `sourceImageReference` must be set.
     * @return builder
     */
    def sourceImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineSourceImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineSourceImageReferenceArgs.builder
      builder.sourceImageReference(args(argsBuilder).build)

    /**
     * @param terminationNotification A `terminationNotification` block as defined below.
     * @return builder
     */
    def terminationNotification(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineTerminationNotificationArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineTerminationNotificationArgs.builder
      builder.terminationNotification(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.SharedImageVersionArgs.Builder)
    /**
     * @param targetRegions One or more `targetRegion` blocks as documented below.
     * @return builder
     */
    def targetRegions(args: Endofunction[com.pulumi.azure.compute.inputs.SharedImageVersionTargetRegionArgs.Builder]*):
        com.pulumi.azure.compute.SharedImageVersionArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.SharedImageVersionTargetRegionArgs.builder
      builder.targetRegions(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.SharedImageVersionArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.compute.CapacityReservationArgs.Builder)
    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.compute.inputs.CapacityReservationSkuArgs.Builder]):
        com.pulumi.azure.compute.CapacityReservationArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.CapacityReservationSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.compute.CapacityReservationArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages a Standby Pool for Virtual Machine Scale Sets.
   *  &gt; **Note:** please follow the prerequisites mentioned in this [article](https://learn.microsoft.com/azure/virtual-machine-scale-sets/standby-pools-create?tabs=portal#prerequisites) before using this resource.
   */
  def ScaleSetStandbyPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.compute.ScaleSetStandbyPoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.ScaleSetStandbyPoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.compute.ScaleSetStandbyPool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
