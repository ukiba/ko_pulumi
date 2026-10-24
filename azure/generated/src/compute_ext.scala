package jp.ukiba.ko_pulumi
package azure

object compute_ext:
  extension (builder: com.pulumi.azure.compute.BastionHostArgs.Builder)
    /**
     * @param ipConfiguration A `ipConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def ipConfiguration(args: Endofunction[com.pulumi.azure.compute.inputs.BastionHostIpConfigurationArgs.Builder]):
        com.pulumi.azure.compute.BastionHostArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.BastionHostIpConfigurationArgs.builder
      builder.ipConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.CapacityReservationArgs.Builder)
    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.compute.inputs.CapacityReservationSkuArgs.Builder]):
        com.pulumi.azure.compute.CapacityReservationArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.CapacityReservationSkuArgs.builder
      builder.sku(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.DiskEncryptionSetArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.compute.inputs.DiskEncryptionSetIdentityArgs.Builder]):
        com.pulumi.azure.compute.DiskEncryptionSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.DiskEncryptionSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.ExtensionArgs.Builder)
    /**
     * @param protectedSettingsFromKeyVault A `protectedSettingsFromKeyVault` block as defined below.
     * 
     * &gt; **Note:** `protectedSettingsFromKeyVault` cannot be used with `protectedSettings`
     * @return builder
     */
    inline def protectedSettingsFromKeyVault(args: Endofunction[com.pulumi.azure.compute.inputs.ExtensionProtectedSettingsFromKeyVaultArgs.Builder]):
        com.pulumi.azure.compute.ExtensionArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ExtensionProtectedSettingsFromKeyVaultArgs.builder
      builder.protectedSettingsFromKeyVault(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.GalleryApplicationVersionArgs.Builder)
    /**
     * @param manageAction A `manageAction` block as defined below.
     * @return builder
     */
    inline def manageAction(args: Endofunction[com.pulumi.azure.compute.inputs.GalleryApplicationVersionManageActionArgs.Builder]):
        com.pulumi.azure.compute.GalleryApplicationVersionArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.GalleryApplicationVersionManageActionArgs.builder
      builder.manageAction(args(argsBuilder).build)

    /**
     * @param source A `source` block as defined below.
     * @return builder
     */
    inline def source(args: Endofunction[com.pulumi.azure.compute.inputs.GalleryApplicationVersionSourceArgs.Builder]):
        com.pulumi.azure.compute.GalleryApplicationVersionArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.GalleryApplicationVersionSourceArgs.builder
      builder.source(args(argsBuilder).build)

    /**
     * @param targetRegions One or more `targetRegion` blocks as defined below.
     * @return builder
     */
    inline def targetRegions(args: Endofunction[com.pulumi.azure.compute.inputs.GalleryApplicationVersionTargetRegionArgs.Builder]*):
        com.pulumi.azure.compute.GalleryApplicationVersionArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.GalleryApplicationVersionTargetRegionArgs.builder
      builder.targetRegions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.ImageArgs.Builder)
    /**
     * @param dataDisks One or more `dataDisk` blocks as defined below.
     * 
     * &gt; **Note:** `dataDisk` cannot be set together with `sourceVirtualMachineId`.
     * @return builder
     */
    inline def dataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.ImageDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.ImageArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ImageDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param osDisk One or more `osDisk` blocks as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `osDisk` cannot be set together with `sourceVirtualMachineId`.
     * @return builder
     */
    inline def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.ImageOsDiskArgs.Builder]):
        com.pulumi.azure.compute.ImageArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ImageOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder)
    /**
     * @param additionalCapabilities A `additionalCapabilities` block as defined below.
     * @return builder
     */
    inline def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param adminSshKeys One or more `adminSshKey` blocks as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** One of either `adminPassword` or `adminSshKey` must be specified.
     * @return builder
     */
    inline def adminSshKeys(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineAdminSshKeyArgs.Builder]*):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineAdminSshKeyArgs.builder
      builder.adminSshKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    inline def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param galleryApplications One or more `galleryApplication` blocks as defined below.
     * 
     * &gt; **Note** Gallery Application Assignments can be defined either directly on `azure.compute.LinuxVirtualMachine` resource, or using the `azure.compute.GalleryApplicationAssignment` resource - but the two approaches cannot be used together. If both are used with the same Virtual Machine, spurious changes will occur. If `azure.compute.GalleryApplicationAssignment` is used, it&#39;s recommended to use `ignoreChanges` for the `galleryApplication` block on the corresponding `azure.compute.LinuxVirtualMachine` resource, to avoid a persistent diff when using this resource.
     * @return builder
     */
    inline def galleryApplications(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineGalleryApplicationArgs.Builder]*):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineGalleryApplicationArgs.builder
      builder.galleryApplications(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineIdentityArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param osDisk A `osDisk` block as defined below.
     * @return builder
     */
    inline def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsDiskArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    /**
     * @param osImageNotification A `osImageNotification` block as defined below.
     * @return builder
     */
    inline def osImageNotification(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsImageNotificationArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsImageNotificationArgs.builder
      builder.osImageNotification(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def plan(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachinePlanArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachinePlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param secrets One or more `secret` blocks as defined below.
     * @return builder
     */
    inline def secrets(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineSecretArgs.Builder]*):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceImageReference A `sourceImageReference` block as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** One of either `sourceImageId` or `sourceImageReference` must be set.
     * @return builder
     */
    inline def sourceImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineSourceImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineSourceImageReferenceArgs.builder
      builder.sourceImageReference(args(argsBuilder).build)

    /**
     * @param terminationNotification A `terminationNotification` block as defined below.
     * @return builder
     */
    inline def terminationNotification(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineTerminationNotificationArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineTerminationNotificationArgs.builder
      builder.terminationNotification(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder)
    /**
     * @param additionalCapabilities An `additionalCapabilities` block as defined below.
     * @return builder
     */
    inline def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param adminSshKeys One or more `adminSshKey` blocks as defined below.
     * 
     * &gt; **Note:** One of either `adminPassword` or `adminSshKey` must be specified.
     * @return builder
     */
    inline def adminSshKeys(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAdminSshKeyArgs.Builder]*):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAdminSshKeyArgs.builder
      builder.adminSshKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param automaticInstanceRepair An `automaticInstanceRepair` block as defined below. To enable the automatic instance repair, this Virtual Machine Scale Set must have a valid `healthProbeId` or an [Application Health Extension](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-health-extension).
     * 
     * &gt; **Note:** For more information about Automatic Instance Repair, please refer to the [product documentation](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-automatic-instance-repairs).
     * @return builder
     */
    inline def automaticInstanceRepair(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAutomaticInstanceRepairArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAutomaticInstanceRepairArgs.builder
      builder.automaticInstanceRepair(args(argsBuilder).build)

    /**
     * @param automaticOsUpgradePolicy An `automaticOsUpgradePolicy` block as defined below. This can only be specified when `upgradeMode` is set to either `Automatic` or `Rolling`.
     * @return builder
     */
    inline def automaticOsUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAutomaticOsUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAutomaticOsUpgradePolicyArgs.builder
      builder.automaticOsUpgradePolicy(args(argsBuilder).build)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    inline def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param dataDisks One or more `dataDisk` blocks as defined below.
     * @return builder
     */
    inline def dataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param extensions One or more `extension` blocks as defined below
     * @return builder
     */
    inline def extensions(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetExtensionArgs.Builder]*):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param galleryApplications One or more `galleryApplication` blocks as defined below.
     * @return builder
     */
    inline def galleryApplications(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetGalleryApplicationArgs.Builder]*):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetGalleryApplicationArgs.builder
      builder.galleryApplications(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetIdentityArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkInterfaces One or more `networkInterface` blocks as defined below.
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param osDisk An `osDisk` block as defined below.
     * @return builder
     */
    inline def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetOsDiskArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** When using an image from Azure Marketplace a `plan` must be specified.
     * @return builder
     */
    inline def plan(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetPlanArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param rollingUpgradePolicy A `rollingUpgradePolicy` block as defined below. This is Required and can only be specified when `upgradeMode` is set to `Automatic` or `Rolling`. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def rollingUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetRollingUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetRollingUpgradePolicyArgs.builder
      builder.rollingUpgradePolicy(args(argsBuilder).build)

    /**
     * @param scaleIn A `scaleIn` block as defined below.
     * @return builder
     */
    inline def scaleIn(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetScaleInArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetScaleInArgs.builder
      builder.scaleIn(args(argsBuilder).build)

    /**
     * @param secrets One or more `secret` blocks as defined below.
     * @return builder
     */
    inline def secrets(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSecretArgs.Builder]*):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceImageReference A `sourceImageReference` block as defined below.
     * 
     * &gt; **Note:** One of either `sourceImageId` or `sourceImageReference` must be set.
     * @return builder
     */
    inline def sourceImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSourceImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSourceImageReferenceArgs.builder
      builder.sourceImageReference(args(argsBuilder).build)

    /**
     * @param spotRestore A `spotRestore` block as defined below.
     * @return builder
     */
    inline def spotRestore(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSpotRestoreArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSpotRestoreArgs.builder
      builder.spotRestore(args(argsBuilder).build)

    /**
     * @param terminationNotification A `terminationNotification` block as defined below.
     * @return builder
     */
    inline def terminationNotification(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetTerminationNotificationArgs.Builder]):
        com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetTerminationNotificationArgs.builder
      builder.terminationNotification(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.ManagedDiskArgs.Builder)
    /**
     * @param encryptionSettings A `encryptionSettings` block as defined below.
     * 
     * &gt; **NOTE:** Removing `encryptionSettings` forces a new resource to be created.
     * @return builder
     */
    inline def encryptionSettings(args: Endofunction[com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsArgs.Builder]):
        com.pulumi.azure.compute.ManagedDiskArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsArgs.builder
      builder.encryptionSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder)
    /**
     * @param additionalCapabilities An `additionalCapabilities` block as defined below.
     * @return builder
     */
    inline def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param automaticInstanceRepair An `automaticInstanceRepair` block as defined below.
     * 
     * &gt; **Note:** To enable the `automaticInstanceRepair`, the Orchestrated Virtual Machine Scale Set must have a valid [Application Health Extension](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-health-extension).
     * @return builder
     */
    inline def automaticInstanceRepair(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs.builder
      builder.automaticInstanceRepair(args(argsBuilder).build)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    inline def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param dataDisks One or more `dataDisk` blocks as defined below.
     * @return builder
     */
    inline def dataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param extensions One or more `extension` blocks as defined below
     * @return builder
     */
    inline def extensions(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetExtensionArgs.Builder]*):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetIdentityArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkInterfaces One or more `networkInterface` blocks as defined below.
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param osDisk An `osDisk` block as defined below.
     * @return builder
     */
    inline def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsDiskArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    /**
     * @param osProfile An `osProfile` block as defined below.
     * @return builder
     */
    inline def osProfile(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileArgs.builder
      builder.osProfile(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def plan(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetPlanArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param priorityMix A `priorityMix` block as defined below.
     * 
     * &gt; **Note:** `priorityMix` can only be specified when `priority` is set to `Spot`.
     * @return builder
     */
    inline def priorityMix(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetPriorityMixArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetPriorityMixArgs.builder
      builder.priorityMix(args(argsBuilder).build)

    /**
     * @param rollingUpgradePolicy A `rollingUpgradePolicy` block as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `rollingUpgradePolicy` is required when `upgradeMode` is set to `Rolling`, cannot be specified when `upgradeMode` is set to `Manual`, and requires a valid application health extension when `upgradeMode` is set to `Rolling`.
     * @return builder
     */
    inline def rollingUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetRollingUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetRollingUpgradePolicyArgs.builder
      builder.rollingUpgradePolicy(args(argsBuilder).build)

    /**
     * @param skuProfile A `skuProfile` block as defined below.
     * 
     * &gt; **Note:** `skuProfile` can only be specified when `skuName` is set to `Mix`, and `skuProfile` must be configured when `skuName` is set to `Mix`.
     * 
     * &gt; **Note:** The `skuProfile` feature may be subject to Azure service limitations for particular regions and VM size combinations. While `skuProfile` can be updated after deployment, it cannot be removed. Removing `skuProfile` from the configuration after deployment triggers the creation of a new resource. Additionally, modifying `skuProfile` settings may result in instance disruption, as changes to allocation strategies or VM sizes can require Azure to redistribute or recreate instances.
     * @return builder
     */
    inline def skuProfile(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetSkuProfileArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetSkuProfileArgs.builder
      builder.skuProfile(args(argsBuilder).build)

    /**
     * @param sourceImageReference A `sourceImageReference` block as defined below.
     * 
     * &gt; **Note:** `sourceImageId` and `sourceImageReference` are mutually exclusive and only one of them may be specified.
     * @return builder
     */
    inline def sourceImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetSourceImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetSourceImageReferenceArgs.builder
      builder.sourceImageReference(args(argsBuilder).build)

    /**
     * @param terminationNotification A `terminationNotification` block as defined below.
     * @return builder
     */
    inline def terminationNotification(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetTerminationNotificationArgs.Builder]):
        com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetTerminationNotificationArgs.builder
      builder.terminationNotification(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.PacketCaptureArgs.Builder)
    /**
     * @param filters One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.azure.compute.inputs.PacketCaptureFilterArgs.Builder]*):
        com.pulumi.azure.compute.PacketCaptureArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.PacketCaptureFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

    /**
     * @param storageLocation A `storageLocation` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def storageLocation(args: Endofunction[com.pulumi.azure.compute.inputs.PacketCaptureStorageLocationArgs.Builder]):
        com.pulumi.azure.compute.PacketCaptureArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.PacketCaptureStorageLocationArgs.builder
      builder.storageLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.RunCommandArgs.Builder)
    /**
     * @param errorBlobManagedIdentity An `errorBlobManagedIdentity` block as defined below. User-assigned managed Identity that has access to errorBlobUri storage blob.
     * @return builder
     */
    inline def errorBlobManagedIdentity(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandErrorBlobManagedIdentityArgs.Builder]):
        com.pulumi.azure.compute.RunCommandArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.RunCommandErrorBlobManagedIdentityArgs.builder
      builder.errorBlobManagedIdentity(args(argsBuilder).build)

    /**
     * @param outputBlobManagedIdentity An `outputBlobManagedIdentity` block as defined below. User-assigned managed Identity that has access to outputBlobUri storage blob.
     * @return builder
     */
    inline def outputBlobManagedIdentity(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandOutputBlobManagedIdentityArgs.Builder]):
        com.pulumi.azure.compute.RunCommandArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.RunCommandOutputBlobManagedIdentityArgs.builder
      builder.outputBlobManagedIdentity(args(argsBuilder).build)

    /**
     * @param parameters A list of `parameter` blocks as defined below. The parameters used by the script.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandParameterArgs.Builder]*):
        com.pulumi.azure.compute.RunCommandArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.RunCommandParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

    /**
     * @param protectedParameters A list of `protectedParameter` blocks as defined below. The protected parameters used by the script.
     * @return builder
     */
    inline def protectedParameters(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandProtectedParameterArgs.Builder]*):
        com.pulumi.azure.compute.RunCommandArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.RunCommandProtectedParameterArgs.builder
      builder.protectedParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param source A `source` block as defined below. The source of the run command script.
     * @return builder
     */
    inline def source(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandSourceArgs.Builder]):
        com.pulumi.azure.compute.RunCommandArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.RunCommandSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.ScaleSetArgs.Builder)
    /**
     * @param bootDiagnostics A `bootDiagnostics` block as referenced below.
     * @return builder
     */
    inline def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param extensions Can be specified multiple times to add extension profiles to the scale set. Each `extension` block supports the fields documented below.
     * @return builder
     */
    inline def extensions(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetExtensionArgs.Builder]*):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetIdentityArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkProfiles A collection of `networkProfile` blocks as documented below.
     * @return builder
     */
    inline def networkProfiles(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileArgs.Builder]*):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileArgs.builder
      builder.networkProfiles(args.map(_(argsBuilder).build)*)

    /**
     * @param osProfile A `osProfile` block as documented below.
     * @return builder
     */
    inline def osProfile(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileArgs.builder
      builder.osProfile(args(argsBuilder).build)

    /**
     * @param osProfileLinuxConfig A `osProfileLinuxConfig` block as documented below.
     * @return builder
     */
    inline def osProfileLinuxConfig(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileLinuxConfigArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileLinuxConfigArgs.builder
      builder.osProfileLinuxConfig(args(argsBuilder).build)

    /**
     * @param osProfileSecrets A collection of `osProfileSecrets` blocks as documented below.
     * @return builder
     */
    inline def osProfileSecrets(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileSecretArgs.Builder]*):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileSecretArgs.builder
      builder.osProfileSecrets(args.map(_(argsBuilder).build)*)

    /**
     * @param osProfileWindowsConfig A `osProfileWindowsConfig` block as documented below.
     * @return builder
     */
    inline def osProfileWindowsConfig(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigArgs.builder
      builder.osProfileWindowsConfig(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as documented below.
     * @return builder
     */
    inline def plan(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetPlanArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param rollingUpgradePolicy A `rollingUpgradePolicy` block as defined below. This is only applicable when the `upgradePolicyMode` is `Rolling`.
     * @return builder
     */
    inline def rollingUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetRollingUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetRollingUpgradePolicyArgs.builder
      builder.rollingUpgradePolicy(args(argsBuilder).build)

    /**
     * @param sku A `sku` block as documented below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetSkuArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    /**
     * @param storageProfileDataDisks A `storageProfileDataDisk` block as documented below.
     * @return builder
     */
    inline def storageProfileDataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetStorageProfileDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetStorageProfileDataDiskArgs.builder
      builder.storageProfileDataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param storageProfileImageReference A `storageProfileImageReference` block as documented below.
     * @return builder
     */
    inline def storageProfileImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetStorageProfileImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetStorageProfileImageReferenceArgs.builder
      builder.storageProfileImageReference(args(argsBuilder).build)

    /**
     * @param storageProfileOsDisk A `storageProfileOsDisk` block as documented below.
     * @return builder
     */
    inline def storageProfileOsDisk(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetStorageProfileOsDiskArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetStorageProfileOsDiskArgs.builder
      builder.storageProfileOsDisk(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.ScaleSetPacketCaptureArgs.Builder)
    /**
     * @param filters One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureFilterArgs.Builder]*):
        com.pulumi.azure.compute.ScaleSetPacketCaptureArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

    /**
     * @param machineScope A `machineScope` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def machineScope(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureMachineScopeArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetPacketCaptureArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureMachineScopeArgs.builder
      builder.machineScope(args(argsBuilder).build)

    /**
     * @param storageLocation A `storageLocation` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def storageLocation(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureStorageLocationArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetPacketCaptureArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureStorageLocationArgs.builder
      builder.storageLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.ScaleSetStandbyPoolArgs.Builder)
    /**
     * @param elasticityProfile An `elasticityProfile` block as defined below.
     * @return builder
     */
    inline def elasticityProfile(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetStandbyPoolElasticityProfileArgs.Builder]):
        com.pulumi.azure.compute.ScaleSetStandbyPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetStandbyPoolElasticityProfileArgs.builder
      builder.elasticityProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.SharedImageArgs.Builder)
    /**
     * @param identifier An `identifier` block as defined below.
     * @return builder
     */
    inline def identifier(args: Endofunction[com.pulumi.azure.compute.inputs.SharedImageIdentifierArgs.Builder]):
        com.pulumi.azure.compute.SharedImageArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SharedImageIdentifierArgs.builder
      builder.identifier(args(argsBuilder).build)

    /**
     * @param purchasePlan A `purchasePlan` block as defined below.
     * @return builder
     */
    inline def purchasePlan(args: Endofunction[com.pulumi.azure.compute.inputs.SharedImagePurchasePlanArgs.Builder]):
        com.pulumi.azure.compute.SharedImageArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SharedImagePurchasePlanArgs.builder
      builder.purchasePlan(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.SharedImageGalleryArgs.Builder)
    /**
     * @param sharing A `sharing` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def sharing(args: Endofunction[com.pulumi.azure.compute.inputs.SharedImageGallerySharingArgs.Builder]):
        com.pulumi.azure.compute.SharedImageGalleryArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SharedImageGallerySharingArgs.builder
      builder.sharing(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.SharedImageVersionArgs.Builder)
    /**
     * @param targetRegions One or more `targetRegion` blocks as documented below.
     * @return builder
     */
    inline def targetRegions(args: Endofunction[com.pulumi.azure.compute.inputs.SharedImageVersionTargetRegionArgs.Builder]*):
        com.pulumi.azure.compute.SharedImageVersionArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.SharedImageVersionTargetRegionArgs.builder
      builder.targetRegions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.SnapshotArgs.Builder)
    /**
     * @param encryptionSettings A `encryptionSettings` block as defined below.
     * 
     * &gt; **Note:** Removing `encryptionSettings` forces a new resource to be created.
     * @return builder
     */
    inline def encryptionSettings(args: Endofunction[com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsArgs.Builder]):
        com.pulumi.azure.compute.SnapshotArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsArgs.builder
      builder.encryptionSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.VirtualMachineArgs.Builder)
    /**
     * @param additionalCapabilities An `additionalCapabilities` block as defined below.
     * @return builder
     */
    inline def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    inline def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineIdentityArgs.Builder]):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param osProfile An `osProfile` block as defined below. Required when `createOption` in the `storageOsDisk` block is set to `FromImage`.
     * @return builder
     */
    inline def osProfile(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileArgs.Builder]):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileArgs.builder
      builder.osProfile(args(argsBuilder).build)

    /**
     * @param osProfileLinuxConfig (Required, when a Linux machine) An `osProfileLinuxConfig` block as defined below.
     * @return builder
     */
    inline def osProfileLinuxConfig(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileLinuxConfigArgs.Builder]):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileLinuxConfigArgs.builder
      builder.osProfileLinuxConfig(args(argsBuilder).build)

    /**
     * @param osProfileSecrets One or more `osProfileSecrets` blocks as defined below.
     * @return builder
     */
    inline def osProfileSecrets(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileSecretArgs.Builder]*):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileSecretArgs.builder
      builder.osProfileSecrets(args.map(_(argsBuilder).build)*)

    /**
     * @param osProfileWindowsConfig (Required, when a Windows machine) An `osProfileWindowsConfig` block as defined below.
     * @return builder
     */
    inline def osProfileWindowsConfig(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigArgs.Builder]):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigArgs.builder
      builder.osProfileWindowsConfig(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below.
     * @return builder
     */
    inline def plan(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachinePlanArgs.Builder]):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachinePlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param storageDataDisks One or more `storageDataDisk` blocks as defined below.
     * 
     * &gt; **Please Note:** Data Disks can also be attached either using this block or the `azure.compute.DataDiskAttachment` resource - but not both.
     * @return builder
     */
    inline def storageDataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineStorageDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineStorageDataDiskArgs.builder
      builder.storageDataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param storageImageReference A `storageImageReference` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def storageImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineStorageImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineStorageImageReferenceArgs.builder
      builder.storageImageReference(args(argsBuilder).build)

    /**
     * @param storageOsDisk A `storageOsDisk` block as defined below.
     * @return builder
     */
    inline def storageOsDisk(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineStorageOsDiskArgs.Builder]):
        com.pulumi.azure.compute.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineStorageOsDiskArgs.builder
      builder.storageOsDisk(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.VirtualMachineScaleSetExtensionArgs.Builder)
    /**
     * @param protectedSettingsFromKeyVault A `protectedSettingsFromKeyVault` block as defined below.
     * 
     * &gt; **Note:** `protectedSettingsFromKeyVault` cannot be used with `protectedSettings`
     * @return builder
     */
    inline def protectedSettingsFromKeyVault(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineScaleSetExtensionProtectedSettingsFromKeyVaultArgs.Builder]):
        com.pulumi.azure.compute.VirtualMachineScaleSetExtensionArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineScaleSetExtensionProtectedSettingsFromKeyVaultArgs.builder
      builder.protectedSettingsFromKeyVault(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder)
    /**
     * @param additionalCapabilities A `additionalCapabilities` block as defined below.
     * @return builder
     */
    inline def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param additionalUnattendContents One or more `additionalUnattendContent` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def additionalUnattendContents(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineAdditionalUnattendContentArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineAdditionalUnattendContentArgs.builder
      builder.additionalUnattendContents(args.map(_(argsBuilder).build)*)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    inline def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param galleryApplications One or more `galleryApplication` blocks as defined below.
     * 
     * &gt; **Note** Gallery Application Assignments can be defined either directly on `azure.compute.WindowsVirtualMachine` resource, or using the `azure.compute.GalleryApplicationAssignment` resource - but the two approaches cannot be used together. If both are used with the same Virtual Machine, spurious changes will occur. If `azure.compute.GalleryApplicationAssignment` is used, it&#39;s recommended to use `ignoreChanges` for the `galleryApplication` block on the corresponding `azure.compute.WindowsVirtualMachine` resource, to avoid a persistent diff when using this resource.
     * @return builder
     */
    inline def galleryApplications(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineGalleryApplicationArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineGalleryApplicationArgs.builder
      builder.galleryApplications(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineIdentityArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param osDisk An `osDisk` block as defined below.
     * @return builder
     */
    inline def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsDiskArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    /**
     * @param osImageNotification A `osImageNotification` block as defined below.
     * @return builder
     */
    inline def osImageNotification(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsImageNotificationArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsImageNotificationArgs.builder
      builder.osImageNotification(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def plan(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachinePlanArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachinePlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param secrets One or more `secret` blocks as defined below.
     * @return builder
     */
    inline def secrets(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineSecretArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceImageReference A `sourceImageReference` block as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** One of either `sourceImageId` or `sourceImageReference` must be set.
     * @return builder
     */
    inline def sourceImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineSourceImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineSourceImageReferenceArgs.builder
      builder.sourceImageReference(args(argsBuilder).build)

    /**
     * @param terminationNotification A `terminationNotification` block as defined below.
     * @return builder
     */
    inline def terminationNotification(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineTerminationNotificationArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineTerminationNotificationArgs.builder
      builder.terminationNotification(args(argsBuilder).build)

    /**
     * @param winrmListeners One or more `winrmListener` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def winrmListeners(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineWinrmListenerArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineWinrmListenerArgs.builder
      builder.winrmListeners(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder)
    /**
     * @param additionalCapabilities An `additionalCapabilities` block as defined below.
     * @return builder
     */
    inline def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param additionalUnattendContents One or more `additionalUnattendContent` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def additionalUnattendContents(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAdditionalUnattendContentArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAdditionalUnattendContentArgs.builder
      builder.additionalUnattendContents(args.map(_(argsBuilder).build)*)

    /**
     * @param automaticInstanceRepair An `automaticInstanceRepair` block as defined below. To enable the automatic instance repair, this Virtual Machine Scale Set must have a valid `healthProbeId` or an [Application Health Extension](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-health-extension).
     * 
     * &gt; **Note:** For more information about Automatic Instance Repair, please refer to [this doc](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-automatic-instance-repairs).
     * @return builder
     */
    inline def automaticInstanceRepair(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAutomaticInstanceRepairArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAutomaticInstanceRepairArgs.builder
      builder.automaticInstanceRepair(args(argsBuilder).build)

    /**
     * @param automaticOsUpgradePolicy An `automaticOsUpgradePolicy` block as defined below. This can only be specified when `upgradeMode` is set to either `Automatic` or `Rolling`.
     * @return builder
     */
    inline def automaticOsUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAutomaticOsUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAutomaticOsUpgradePolicyArgs.builder
      builder.automaticOsUpgradePolicy(args(argsBuilder).build)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    inline def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param dataDisks One or more `dataDisk` blocks as defined below.
     * @return builder
     */
    inline def dataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param extensions One or more `extension` blocks as defined below
     * @return builder
     */
    inline def extensions(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetExtensionArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param galleryApplications One or more `galleryApplication` blocks as defined below.
     * @return builder
     */
    inline def galleryApplications(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetGalleryApplicationArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetGalleryApplicationArgs.builder
      builder.galleryApplications(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetIdentityArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkInterfaces One or more `networkInterface` blocks as defined below.
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param osDisk An `osDisk` block as defined below.
     * @return builder
     */
    inline def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetOsDiskArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** When using an image from Azure Marketplace a `plan` must be specified.
     * @return builder
     */
    inline def plan(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetPlanArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param rollingUpgradePolicy A `rollingUpgradePolicy` block as defined below. This is Required and can only be specified when `upgradeMode` is set to `Automatic` or `Rolling`. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def rollingUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetRollingUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetRollingUpgradePolicyArgs.builder
      builder.rollingUpgradePolicy(args(argsBuilder).build)

    /**
     * @param scaleIn A `scaleIn` block as defined below.
     * @return builder
     */
    inline def scaleIn(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetScaleInArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetScaleInArgs.builder
      builder.scaleIn(args(argsBuilder).build)

    /**
     * @param secrets One or more `secret` blocks as defined below.
     * @return builder
     */
    inline def secrets(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSecretArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceImageReference A `sourceImageReference` block as defined below.
     * 
     * &gt; **Note:** One of either `sourceImageId` or `sourceImageReference` must be set.
     * @return builder
     */
    inline def sourceImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSourceImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSourceImageReferenceArgs.builder
      builder.sourceImageReference(args(argsBuilder).build)

    /**
     * @param spotRestore A `spotRestore` block as defined below.
     * @return builder
     */
    inline def spotRestore(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSpotRestoreArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSpotRestoreArgs.builder
      builder.spotRestore(args(argsBuilder).build)

    /**
     * @param terminationNotification A `terminationNotification` block as defined below.
     * @return builder
     */
    inline def terminationNotification(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetTerminationNotificationArgs.Builder]):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetTerminationNotificationArgs.builder
      builder.terminationNotification(args(argsBuilder).build)

    /**
     * @param winrmListeners One or more `winrmListener` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def winrmListeners(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetWinrmListenerArgs.Builder]*):
        com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetWinrmListenerArgs.builder
      builder.winrmListeners(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.BastionHostState.Builder)
    /**
     * @param ipConfiguration A `ipConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def ipConfiguration(args: Endofunction[com.pulumi.azure.compute.inputs.BastionHostIpConfigurationArgs.Builder]):
        com.pulumi.azure.compute.inputs.BastionHostState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.BastionHostIpConfigurationArgs.builder
      builder.ipConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.CapacityReservationState.Builder)
    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.compute.inputs.CapacityReservationSkuArgs.Builder]):
        com.pulumi.azure.compute.inputs.CapacityReservationState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.CapacityReservationSkuArgs.builder
      builder.sku(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.DiskEncryptionSetState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.compute.inputs.DiskEncryptionSetIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.DiskEncryptionSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.DiskEncryptionSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.ExtensionState.Builder)
    /**
     * @param protectedSettingsFromKeyVault A `protectedSettingsFromKeyVault` block as defined below.
     * 
     * &gt; **Note:** `protectedSettingsFromKeyVault` cannot be used with `protectedSettings`
     * @return builder
     */
    inline def protectedSettingsFromKeyVault(args: Endofunction[com.pulumi.azure.compute.inputs.ExtensionProtectedSettingsFromKeyVaultArgs.Builder]):
        com.pulumi.azure.compute.inputs.ExtensionState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ExtensionProtectedSettingsFromKeyVaultArgs.builder
      builder.protectedSettingsFromKeyVault(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.GalleryApplicationVersionState.Builder)
    /**
     * @param manageAction A `manageAction` block as defined below.
     * @return builder
     */
    inline def manageAction(args: Endofunction[com.pulumi.azure.compute.inputs.GalleryApplicationVersionManageActionArgs.Builder]):
        com.pulumi.azure.compute.inputs.GalleryApplicationVersionState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.GalleryApplicationVersionManageActionArgs.builder
      builder.manageAction(args(argsBuilder).build)

    /**
     * @param source A `source` block as defined below.
     * @return builder
     */
    inline def source(args: Endofunction[com.pulumi.azure.compute.inputs.GalleryApplicationVersionSourceArgs.Builder]):
        com.pulumi.azure.compute.inputs.GalleryApplicationVersionState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.GalleryApplicationVersionSourceArgs.builder
      builder.source(args(argsBuilder).build)

    /**
     * @param targetRegions One or more `targetRegion` blocks as defined below.
     * @return builder
     */
    inline def targetRegions(args: Endofunction[com.pulumi.azure.compute.inputs.GalleryApplicationVersionTargetRegionArgs.Builder]*):
        com.pulumi.azure.compute.inputs.GalleryApplicationVersionState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.GalleryApplicationVersionTargetRegionArgs.builder
      builder.targetRegions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.ImageState.Builder)
    /**
     * @param dataDisks One or more `dataDisk` blocks as defined below.
     * 
     * &gt; **Note:** `dataDisk` cannot be set together with `sourceVirtualMachineId`.
     * @return builder
     */
    inline def dataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.ImageDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ImageState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ImageDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param osDisk One or more `osDisk` blocks as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `osDisk` cannot be set together with `sourceVirtualMachineId`.
     * @return builder
     */
    inline def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.ImageOsDiskArgs.Builder]):
        com.pulumi.azure.compute.inputs.ImageState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ImageOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsDiskArgs.Builder)
    /**
     * @param diffDiskSettings A `diffDiskSettings` block as defined above. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** `diffDiskSettings` can only be set when `caching` is set to `ReadOnly`. More information can be found [here](https://docs.microsoft.com/azure/virtual-machines/ephemeral-os-disks-deploy#vm-template-deployment). Additionally, this property cannot be set when an existing Managed Disk is used to create the Virtual Machine by setting `osManagedDiskId`.
     * @return builder
     */
    inline def diffDiskSettings(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsDiskDiffDiskSettingsArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsDiskArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsDiskDiffDiskSettingsArgs.builder
      builder.diffDiskSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetExtensionArgs.Builder)
    /**
     * @param protectedSettingsFromKeyVault A `protectedSettingsFromKeyVault` block as defined below.
     * 
     * &gt; **Note:** `protectedSettingsFromKeyVault` cannot be used with `protectedSettings`
     * @return builder
     */
    inline def protectedSettingsFromKeyVault(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetExtensionProtectedSettingsFromKeyVaultArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetExtensionArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetExtensionProtectedSettingsFromKeyVaultArgs.builder
      builder.protectedSettingsFromKeyVault(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceArgs.Builder)
    /**
     * @param ipConfigurations One or more `ipConfiguration` blocks as defined above.
     * @return builder
     */
    inline def ipConfigurations(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.Builder)
    /**
     * @param publicIpAddresses A `publicIpAddress` block as defined below.
     * @return builder
     */
    inline def publicIpAddresses(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.builder
      builder.publicIpAddresses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.Builder)
    /**
     * @param ipTags One or more `ipTag` blocks as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def ipTags(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs.builder
      builder.ipTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetOsDiskArgs.Builder)
    /**
     * @param diffDiskSettings A `diffDiskSettings` block as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def diffDiskSettings(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetOsDiskArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs.builder
      builder.diffDiskSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSecretArgs.Builder)
    /**
     * @param certificates One or more `certificate` blocks as defined above.
     * @return builder
     */
    inline def certificates(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSecretCertificateArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSecretArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSecretCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder)
    /**
     * @param additionalCapabilities An `additionalCapabilities` block as defined below.
     * @return builder
     */
    inline def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param adminSshKeys One or more `adminSshKey` blocks as defined below.
     * 
     * &gt; **Note:** One of either `adminPassword` or `adminSshKey` must be specified.
     * @return builder
     */
    inline def adminSshKeys(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAdminSshKeyArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAdminSshKeyArgs.builder
      builder.adminSshKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param automaticInstanceRepair An `automaticInstanceRepair` block as defined below. To enable the automatic instance repair, this Virtual Machine Scale Set must have a valid `healthProbeId` or an [Application Health Extension](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-health-extension).
     * 
     * &gt; **Note:** For more information about Automatic Instance Repair, please refer to the [product documentation](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-automatic-instance-repairs).
     * @return builder
     */
    inline def automaticInstanceRepair(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAutomaticInstanceRepairArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAutomaticInstanceRepairArgs.builder
      builder.automaticInstanceRepair(args(argsBuilder).build)

    /**
     * @param automaticOsUpgradePolicy An `automaticOsUpgradePolicy` block as defined below. This can only be specified when `upgradeMode` is set to either `Automatic` or `Rolling`.
     * @return builder
     */
    inline def automaticOsUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAutomaticOsUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetAutomaticOsUpgradePolicyArgs.builder
      builder.automaticOsUpgradePolicy(args(argsBuilder).build)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    inline def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param dataDisks One or more `dataDisk` blocks as defined below.
     * @return builder
     */
    inline def dataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param extensions One or more `extension` blocks as defined below
     * @return builder
     */
    inline def extensions(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetExtensionArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param galleryApplications One or more `galleryApplication` blocks as defined below.
     * @return builder
     */
    inline def galleryApplications(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetGalleryApplicationArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetGalleryApplicationArgs.builder
      builder.galleryApplications(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkInterfaces One or more `networkInterface` blocks as defined below.
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param osDisk An `osDisk` block as defined below.
     * @return builder
     */
    inline def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetOsDiskArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** When using an image from Azure Marketplace a `plan` must be specified.
     * @return builder
     */
    inline def plan(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetPlanArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param rollingUpgradePolicy A `rollingUpgradePolicy` block as defined below. This is Required and can only be specified when `upgradeMode` is set to `Automatic` or `Rolling`. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def rollingUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetRollingUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetRollingUpgradePolicyArgs.builder
      builder.rollingUpgradePolicy(args(argsBuilder).build)

    /**
     * @param scaleIn A `scaleIn` block as defined below.
     * @return builder
     */
    inline def scaleIn(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetScaleInArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetScaleInArgs.builder
      builder.scaleIn(args(argsBuilder).build)

    /**
     * @param secrets One or more `secret` blocks as defined below.
     * @return builder
     */
    inline def secrets(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSecretArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceImageReference A `sourceImageReference` block as defined below.
     * 
     * &gt; **Note:** One of either `sourceImageId` or `sourceImageReference` must be set.
     * @return builder
     */
    inline def sourceImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSourceImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSourceImageReferenceArgs.builder
      builder.sourceImageReference(args(argsBuilder).build)

    /**
     * @param spotRestore A `spotRestore` block as defined below.
     * @return builder
     */
    inline def spotRestore(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSpotRestoreArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSpotRestoreArgs.builder
      builder.spotRestore(args(argsBuilder).build)

    /**
     * @param terminationNotification A `terminationNotification` block as defined below.
     * @return builder
     */
    inline def terminationNotification(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetTerminationNotificationArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetTerminationNotificationArgs.builder
      builder.terminationNotification(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.LinuxVirtualMachineSecretArgs.Builder)
    /**
     * @param certificates One or more `certificate` blocks as defined above.
     * @return builder
     */
    inline def certificates(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineSecretCertificateArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineSecretArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineSecretCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder)
    /**
     * @param additionalCapabilities A `additionalCapabilities` block as defined below.
     * @return builder
     */
    inline def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param adminSshKeys One or more `adminSshKey` blocks as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** One of either `adminPassword` or `adminSshKey` must be specified.
     * @return builder
     */
    inline def adminSshKeys(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineAdminSshKeyArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineAdminSshKeyArgs.builder
      builder.adminSshKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    inline def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param galleryApplications One or more `galleryApplication` blocks as defined below.
     * 
     * &gt; **Note** Gallery Application Assignments can be defined either directly on `azure.compute.LinuxVirtualMachine` resource, or using the `azure.compute.GalleryApplicationAssignment` resource - but the two approaches cannot be used together. If both are used with the same Virtual Machine, spurious changes will occur. If `azure.compute.GalleryApplicationAssignment` is used, it&#39;s recommended to use `ignoreChanges` for the `galleryApplication` block on the corresponding `azure.compute.LinuxVirtualMachine` resource, to avoid a persistent diff when using this resource.
     * @return builder
     */
    inline def galleryApplications(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineGalleryApplicationArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineGalleryApplicationArgs.builder
      builder.galleryApplications(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param osDisk A `osDisk` block as defined below.
     * @return builder
     */
    inline def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsDiskArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    /**
     * @param osImageNotification A `osImageNotification` block as defined below.
     * @return builder
     */
    inline def osImageNotification(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsImageNotificationArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsImageNotificationArgs.builder
      builder.osImageNotification(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def plan(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachinePlanArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachinePlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param secrets One or more `secret` blocks as defined below.
     * @return builder
     */
    inline def secrets(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineSecretArgs.Builder]*):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceImageReference A `sourceImageReference` block as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** One of either `sourceImageId` or `sourceImageReference` must be set.
     * @return builder
     */
    inline def sourceImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineSourceImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineSourceImageReferenceArgs.builder
      builder.sourceImageReference(args(argsBuilder).build)

    /**
     * @param terminationNotification A `terminationNotification` block as defined below.
     * @return builder
     */
    inline def terminationNotification(args: Endofunction[com.pulumi.azure.compute.inputs.LinuxVirtualMachineTerminationNotificationArgs.Builder]):
        com.pulumi.azure.compute.inputs.LinuxVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.LinuxVirtualMachineTerminationNotificationArgs.builder
      builder.terminationNotification(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsArgs.Builder)
    /**
     * @param diskEncryptionKey A `diskEncryptionKey` block as defined above.
     * @return builder
     */
    inline def diskEncryptionKey(args: Endofunction[com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsDiskEncryptionKeyArgs.Builder]):
        com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsDiskEncryptionKeyArgs.builder
      builder.diskEncryptionKey(args(argsBuilder).build)

    /**
     * @param keyEncryptionKey A `keyEncryptionKey` block as defined below.
     * @return builder
     */
    inline def keyEncryptionKey(args: Endofunction[com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsKeyEncryptionKeyArgs.Builder]):
        com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsKeyEncryptionKeyArgs.builder
      builder.keyEncryptionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.ManagedDiskState.Builder)
    /**
     * @param encryptionSettings A `encryptionSettings` block as defined below.
     * 
     * &gt; **NOTE:** Removing `encryptionSettings` forces a new resource to be created.
     * @return builder
     */
    inline def encryptionSettings(args: Endofunction[com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsArgs.Builder]):
        com.pulumi.azure.compute.inputs.ManagedDiskState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ManagedDiskEncryptionSettingsArgs.builder
      builder.encryptionSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetExtensionArgs.Builder)
    /**
     * @param protectedSettingsFromKeyVault A `protectedSettingsFromKeyVault` block as defined below.
     * 
     * &gt; **Note:** `protectedSettingsFromKeyVault` cannot be used with `protectedSettings`.
     * @return builder
     */
    inline def protectedSettingsFromKeyVault(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetExtensionProtectedSettingsFromKeyVaultArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetExtensionArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetExtensionProtectedSettingsFromKeyVaultArgs.builder
      builder.protectedSettingsFromKeyVault(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceArgs.Builder)
    /**
     * @param ipConfigurations One or more `ipConfiguration` blocks as defined above.
     * @return builder
     */
    inline def ipConfigurations(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.Builder)
    /**
     * @param publicIpAddresses A `publicIpAddress` block as defined below.
     * @return builder
     */
    inline def publicIpAddresses(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.builder
      builder.publicIpAddresses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.Builder)
    /**
     * @param ipTags One or more `ipTag` blocks as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def ipTags(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs.builder
      builder.ipTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsDiskArgs.Builder)
    /**
     * @param diffDiskSettings A `diffDiskSettings` block as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def diffDiskSettings(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsDiskArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs.builder
      builder.diffDiskSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileArgs.Builder)
    /**
     * @param linuxConfiguration A `linuxConfiguration` block as defined above.
     * @return builder
     */
    inline def linuxConfiguration(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationArgs.builder
      builder.linuxConfiguration(args(argsBuilder).build)

    /**
     * @param windowsConfiguration A `windowsConfiguration` block as defined below.
     * @return builder
     */
    inline def windowsConfiguration(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs.builder
      builder.windowsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationArgs.Builder)
    /**
     * @param adminSshKeys An `adminSshKey` block as defined above.
     * @return builder
     */
    inline def adminSshKeys(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationAdminSshKeyArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationAdminSshKeyArgs.builder
      builder.adminSshKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param secrets One or more `secret` blocks as defined below.
     * @return builder
     */
    inline def secrets(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretArgs.Builder)
    /**
     * @param certificates One or more `certificate` blocks as defined above.
     * @return builder
     */
    inline def certificates(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretCertificateArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs.Builder)
    /**
     * @param additionalUnattendContents One or more `additionalUnattendContent` blocks as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def additionalUnattendContents(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationAdditionalUnattendContentArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationAdditionalUnattendContentArgs.builder
      builder.additionalUnattendContents(args.map(_(argsBuilder).build)*)

    /**
     * @param secrets One or more `secret` blocks as defined above.
     * @return builder
     */
    inline def secrets(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param winrmListeners One or more `winrmListener` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def winrmListeners(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationWinrmListenerArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationWinrmListenerArgs.builder
      builder.winrmListeners(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretArgs.Builder)
    /**
     * @param certificates One or more `certificate` blocks as defined above.
     * @return builder
     */
    inline def certificates(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretCertificateArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetSkuProfileArgs.Builder)
    /**
     * @param virtualMachineSizes One or more `virtualMachineSize` blocks as defined below.
     * 
     * &gt; **Note:** When `allocationStrategy` is set to `Prioritized`, you must use the `virtualMachineSize` block to specify rank values.
     * @return builder
     */
    inline def virtualMachineSizes(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetSkuProfileVirtualMachineSizeArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetSkuProfileArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetSkuProfileVirtualMachineSizeArgs.builder
      builder.virtualMachineSizes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder)
    /**
     * @param additionalCapabilities An `additionalCapabilities` block as defined below.
     * @return builder
     */
    inline def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param automaticInstanceRepair An `automaticInstanceRepair` block as defined below.
     * 
     * &gt; **Note:** To enable the `automaticInstanceRepair`, the Orchestrated Virtual Machine Scale Set must have a valid [Application Health Extension](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-health-extension).
     * @return builder
     */
    inline def automaticInstanceRepair(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs.builder
      builder.automaticInstanceRepair(args(argsBuilder).build)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    inline def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param dataDisks One or more `dataDisk` blocks as defined below.
     * @return builder
     */
    inline def dataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param extensions One or more `extension` blocks as defined below
     * @return builder
     */
    inline def extensions(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetExtensionArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkInterfaces One or more `networkInterface` blocks as defined below.
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param osDisk An `osDisk` block as defined below.
     * @return builder
     */
    inline def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsDiskArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    /**
     * @param osProfile An `osProfile` block as defined below.
     * @return builder
     */
    inline def osProfile(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileArgs.builder
      builder.osProfile(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def plan(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetPlanArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param priorityMix A `priorityMix` block as defined below.
     * 
     * &gt; **Note:** `priorityMix` can only be specified when `priority` is set to `Spot`.
     * @return builder
     */
    inline def priorityMix(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetPriorityMixArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetPriorityMixArgs.builder
      builder.priorityMix(args(argsBuilder).build)

    /**
     * @param rollingUpgradePolicy A `rollingUpgradePolicy` block as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `rollingUpgradePolicy` is required when `upgradeMode` is set to `Rolling`, cannot be specified when `upgradeMode` is set to `Manual`, and requires a valid application health extension when `upgradeMode` is set to `Rolling`.
     * @return builder
     */
    inline def rollingUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetRollingUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetRollingUpgradePolicyArgs.builder
      builder.rollingUpgradePolicy(args(argsBuilder).build)

    /**
     * @param skuProfile A `skuProfile` block as defined below.
     * 
     * &gt; **Note:** `skuProfile` can only be specified when `skuName` is set to `Mix`, and `skuProfile` must be configured when `skuName` is set to `Mix`.
     * 
     * &gt; **Note:** The `skuProfile` feature may be subject to Azure service limitations for particular regions and VM size combinations. While `skuProfile` can be updated after deployment, it cannot be removed. Removing `skuProfile` from the configuration after deployment triggers the creation of a new resource. Additionally, modifying `skuProfile` settings may result in instance disruption, as changes to allocation strategies or VM sizes can require Azure to redistribute or recreate instances.
     * @return builder
     */
    inline def skuProfile(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetSkuProfileArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetSkuProfileArgs.builder
      builder.skuProfile(args(argsBuilder).build)

    /**
     * @param sourceImageReference A `sourceImageReference` block as defined below.
     * 
     * &gt; **Note:** `sourceImageId` and `sourceImageReference` are mutually exclusive and only one of them may be specified.
     * @return builder
     */
    inline def sourceImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetSourceImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetSourceImageReferenceArgs.builder
      builder.sourceImageReference(args(argsBuilder).build)

    /**
     * @param terminationNotification A `terminationNotification` block as defined below.
     * @return builder
     */
    inline def terminationNotification(args: Endofunction[com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetTerminationNotificationArgs.Builder]):
        com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetTerminationNotificationArgs.builder
      builder.terminationNotification(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.PacketCaptureState.Builder)
    /**
     * @param filters One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.azure.compute.inputs.PacketCaptureFilterArgs.Builder]*):
        com.pulumi.azure.compute.inputs.PacketCaptureState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.PacketCaptureFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

    /**
     * @param storageLocation A `storageLocation` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def storageLocation(args: Endofunction[com.pulumi.azure.compute.inputs.PacketCaptureStorageLocationArgs.Builder]):
        com.pulumi.azure.compute.inputs.PacketCaptureState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.PacketCaptureStorageLocationArgs.builder
      builder.storageLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.RunCommandSourceArgs.Builder)
    /**
     * @param scriptUriManagedIdentity A `scriptUriManagedIdentity` block as defined above.
     * @return builder
     */
    inline def scriptUriManagedIdentity(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandSourceScriptUriManagedIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.RunCommandSourceArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.RunCommandSourceScriptUriManagedIdentityArgs.builder
      builder.scriptUriManagedIdentity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.RunCommandState.Builder)
    /**
     * @param errorBlobManagedIdentity An `errorBlobManagedIdentity` block as defined below. User-assigned managed Identity that has access to errorBlobUri storage blob.
     * @return builder
     */
    inline def errorBlobManagedIdentity(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandErrorBlobManagedIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.RunCommandState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.RunCommandErrorBlobManagedIdentityArgs.builder
      builder.errorBlobManagedIdentity(args(argsBuilder).build)

    inline def instanceViews(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandInstanceViewArgs.Builder]*):
        com.pulumi.azure.compute.inputs.RunCommandState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.RunCommandInstanceViewArgs.builder
      builder.instanceViews(args.map(_(argsBuilder).build)*)

    /**
     * @param outputBlobManagedIdentity An `outputBlobManagedIdentity` block as defined below. User-assigned managed Identity that has access to outputBlobUri storage blob.
     * @return builder
     */
    inline def outputBlobManagedIdentity(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandOutputBlobManagedIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.RunCommandState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.RunCommandOutputBlobManagedIdentityArgs.builder
      builder.outputBlobManagedIdentity(args(argsBuilder).build)

    /**
     * @param parameters A list of `parameter` blocks as defined below. The parameters used by the script.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandParameterArgs.Builder]*):
        com.pulumi.azure.compute.inputs.RunCommandState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.RunCommandParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

    /**
     * @param protectedParameters A list of `protectedParameter` blocks as defined below. The protected parameters used by the script.
     * @return builder
     */
    inline def protectedParameters(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandProtectedParameterArgs.Builder]*):
        com.pulumi.azure.compute.inputs.RunCommandState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.RunCommandProtectedParameterArgs.builder
      builder.protectedParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param source A `source` block as defined below. The source of the run command script.
     * @return builder
     */
    inline def source(args: Endofunction[com.pulumi.azure.compute.inputs.RunCommandSourceArgs.Builder]):
        com.pulumi.azure.compute.inputs.RunCommandState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.RunCommandSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileArgs.Builder)
    /**
     * @param dnsSettings A `dnsSettings` block as documented below.
     * @return builder
     */
    inline def dnsSettings(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileDnsSettingsArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileDnsSettingsArgs.builder
      builder.dnsSettings(args(argsBuilder).build)

    /**
     * @param ipConfigurations An `ipConfiguration` block as documented below.
     * @return builder
     */
    inline def ipConfigurations(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileIpConfigurationArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileIpConfigurationArgs.Builder)
    /**
     * @param publicIpAddressConfiguration Describes a virtual machines scale set IP Configuration&#39;s PublicIPAddress configuration. The `publicIpAddressConfiguration` block is documented below.
     * @return builder
     */
    inline def publicIpAddressConfiguration(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileIpConfigurationPublicIpAddressConfigurationArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileIpConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileIpConfigurationPublicIpAddressConfigurationArgs.builder
      builder.publicIpAddressConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.ScaleSetOsProfileLinuxConfigArgs.Builder)
    /**
     * @param sshKeys One or more `sshKeys` blocks as defined below.
     * 
     * &gt; **Note:** Please note that the only allowed `path` is `/home/&lt;username&gt;/.ssh/authorized_keys` due to a limitation of Azure.
     * 
     * &gt; **NOTE:** At least one `sshKeys` block is required if `disablePasswordAuthentication` is set to `true`.
     * @return builder
     */
    inline def sshKeys(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileLinuxConfigSshKeyArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ScaleSetOsProfileLinuxConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileLinuxConfigSshKeyArgs.builder
      builder.sshKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.ScaleSetOsProfileSecretArgs.Builder)
    /**
     * @param vaultCertificates (Required, on Windows machines) One or more `vaultCertificates` blocks as defined below.
     * @return builder
     */
    inline def vaultCertificates(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileSecretVaultCertificateArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ScaleSetOsProfileSecretArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileSecretVaultCertificateArgs.builder
      builder.vaultCertificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigArgs.Builder)
    /**
     * @param additionalUnattendConfigs An `additionalUnattendConfig` block as documented below.
     * @return builder
     */
    inline def additionalUnattendConfigs(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigAdditionalUnattendConfigArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigAdditionalUnattendConfigArgs.builder
      builder.additionalUnattendConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param winrms A collection of `winrm` blocks as documented below.
     * @return builder
     */
    inline def winrms(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigWinrmArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigWinrmArgs.builder
      builder.winrms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureState.Builder)
    /**
     * @param filters One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureFilterArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

    /**
     * @param machineScope A `machineScope` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def machineScope(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureMachineScopeArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureMachineScopeArgs.builder
      builder.machineScope(args(argsBuilder).build)

    /**
     * @param storageLocation A `storageLocation` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def storageLocation(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureStorageLocationArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureStorageLocationArgs.builder
      builder.storageLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.ScaleSetStandbyPoolState.Builder)
    /**
     * @param elasticityProfile An `elasticityProfile` block as defined below.
     * @return builder
     */
    inline def elasticityProfile(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetStandbyPoolElasticityProfileArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetStandbyPoolState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetStandbyPoolElasticityProfileArgs.builder
      builder.elasticityProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.ScaleSetState.Builder)
    /**
     * @param bootDiagnostics A `bootDiagnostics` block as referenced below.
     * @return builder
     */
    inline def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param extensions Can be specified multiple times to add extension profiles to the scale set. Each `extension` block supports the fields documented below.
     * @return builder
     */
    inline def extensions(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetExtensionArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkProfiles A collection of `networkProfile` blocks as documented below.
     * @return builder
     */
    inline def networkProfiles(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileArgs.builder
      builder.networkProfiles(args.map(_(argsBuilder).build)*)

    /**
     * @param osProfile A `osProfile` block as documented below.
     * @return builder
     */
    inline def osProfile(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileArgs.builder
      builder.osProfile(args(argsBuilder).build)

    /**
     * @param osProfileLinuxConfig A `osProfileLinuxConfig` block as documented below.
     * @return builder
     */
    inline def osProfileLinuxConfig(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileLinuxConfigArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileLinuxConfigArgs.builder
      builder.osProfileLinuxConfig(args(argsBuilder).build)

    /**
     * @param osProfileSecrets A collection of `osProfileSecrets` blocks as documented below.
     * @return builder
     */
    inline def osProfileSecrets(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileSecretArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileSecretArgs.builder
      builder.osProfileSecrets(args.map(_(argsBuilder).build)*)

    /**
     * @param osProfileWindowsConfig A `osProfileWindowsConfig` block as documented below.
     * @return builder
     */
    inline def osProfileWindowsConfig(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetOsProfileWindowsConfigArgs.builder
      builder.osProfileWindowsConfig(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as documented below.
     * @return builder
     */
    inline def plan(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetPlanArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param rollingUpgradePolicy A `rollingUpgradePolicy` block as defined below. This is only applicable when the `upgradePolicyMode` is `Rolling`.
     * @return builder
     */
    inline def rollingUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetRollingUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetRollingUpgradePolicyArgs.builder
      builder.rollingUpgradePolicy(args(argsBuilder).build)

    /**
     * @param sku A `sku` block as documented below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetSkuArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    /**
     * @param storageProfileDataDisks A `storageProfileDataDisk` block as documented below.
     * @return builder
     */
    inline def storageProfileDataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetStorageProfileDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetStorageProfileDataDiskArgs.builder
      builder.storageProfileDataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param storageProfileImageReference A `storageProfileImageReference` block as documented below.
     * @return builder
     */
    inline def storageProfileImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetStorageProfileImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetStorageProfileImageReferenceArgs.builder
      builder.storageProfileImageReference(args(argsBuilder).build)

    /**
     * @param storageProfileOsDisk A `storageProfileOsDisk` block as documented below.
     * @return builder
     */
    inline def storageProfileOsDisk(args: Endofunction[com.pulumi.azure.compute.inputs.ScaleSetStorageProfileOsDiskArgs.Builder]):
        com.pulumi.azure.compute.inputs.ScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.ScaleSetStorageProfileOsDiskArgs.builder
      builder.storageProfileOsDisk(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.SharedImageGallerySharingArgs.Builder)
    /**
     * @param communityGallery A `communityGallery` block as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `communityGallery` must be set when `permission` is set to `Community`.
     * @return builder
     */
    inline def communityGallery(args: Endofunction[com.pulumi.azure.compute.inputs.SharedImageGallerySharingCommunityGalleryArgs.Builder]):
        com.pulumi.azure.compute.inputs.SharedImageGallerySharingArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SharedImageGallerySharingCommunityGalleryArgs.builder
      builder.communityGallery(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.SharedImageGalleryState.Builder)
    /**
     * @param sharing A `sharing` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def sharing(args: Endofunction[com.pulumi.azure.compute.inputs.SharedImageGallerySharingArgs.Builder]):
        com.pulumi.azure.compute.inputs.SharedImageGalleryState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SharedImageGallerySharingArgs.builder
      builder.sharing(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.SharedImageState.Builder)
    /**
     * @param identifier An `identifier` block as defined below.
     * @return builder
     */
    inline def identifier(args: Endofunction[com.pulumi.azure.compute.inputs.SharedImageIdentifierArgs.Builder]):
        com.pulumi.azure.compute.inputs.SharedImageState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SharedImageIdentifierArgs.builder
      builder.identifier(args(argsBuilder).build)

    /**
     * @param purchasePlan A `purchasePlan` block as defined below.
     * @return builder
     */
    inline def purchasePlan(args: Endofunction[com.pulumi.azure.compute.inputs.SharedImagePurchasePlanArgs.Builder]):
        com.pulumi.azure.compute.inputs.SharedImageState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SharedImagePurchasePlanArgs.builder
      builder.purchasePlan(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.SharedImageVersionState.Builder)
    /**
     * @param targetRegions One or more `targetRegion` blocks as documented below.
     * @return builder
     */
    inline def targetRegions(args: Endofunction[com.pulumi.azure.compute.inputs.SharedImageVersionTargetRegionArgs.Builder]*):
        com.pulumi.azure.compute.inputs.SharedImageVersionState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.SharedImageVersionTargetRegionArgs.builder
      builder.targetRegions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsArgs.Builder)
    /**
     * @param diskEncryptionKey A `diskEncryptionKey` block as defined below.
     * @return builder
     */
    inline def diskEncryptionKey(args: Endofunction[com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsDiskEncryptionKeyArgs.Builder]):
        com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsDiskEncryptionKeyArgs.builder
      builder.diskEncryptionKey(args(argsBuilder).build)

    /**
     * @param keyEncryptionKey A `keyEncryptionKey` block as defined below.
     * @return builder
     */
    inline def keyEncryptionKey(args: Endofunction[com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsKeyEncryptionKeyArgs.Builder]):
        com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsKeyEncryptionKeyArgs.builder
      builder.keyEncryptionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.SnapshotState.Builder)
    /**
     * @param encryptionSettings A `encryptionSettings` block as defined below.
     * 
     * &gt; **Note:** Removing `encryptionSettings` forces a new resource to be created.
     * @return builder
     */
    inline def encryptionSettings(args: Endofunction[com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsArgs.Builder]):
        com.pulumi.azure.compute.inputs.SnapshotState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsArgs.builder
      builder.encryptionSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.VirtualMachineOsProfileLinuxConfigArgs.Builder)
    /**
     * @param sshKeys One or more `sshKeys` blocks as defined below. This field is required if `disablePasswordAuthentication` is set to `true`.
     * @return builder
     */
    inline def sshKeys(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileLinuxConfigSshKeyArgs.Builder]*):
        com.pulumi.azure.compute.inputs.VirtualMachineOsProfileLinuxConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileLinuxConfigSshKeyArgs.builder
      builder.sshKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.VirtualMachineOsProfileSecretArgs.Builder)
    /**
     * @param vaultCertificates One or more `vaultCertificates` blocks as defined below.
     * @return builder
     */
    inline def vaultCertificates(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileSecretVaultCertificateArgs.Builder]*):
        com.pulumi.azure.compute.inputs.VirtualMachineOsProfileSecretArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileSecretVaultCertificateArgs.builder
      builder.vaultCertificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigArgs.Builder)
    /**
     * @param additionalUnattendConfigs An `additionalUnattendConfig` block as defined below.
     * @return builder
     */
    inline def additionalUnattendConfigs(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigAdditionalUnattendConfigArgs.Builder]*):
        com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigAdditionalUnattendConfigArgs.builder
      builder.additionalUnattendConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param winrms One or more `winrm` blocks as defined below.
     * @return builder
     */
    inline def winrms(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigWinrmArgs.Builder]*):
        com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigWinrmArgs.builder
      builder.winrms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.VirtualMachineScaleSetExtensionState.Builder)
    /**
     * @param protectedSettingsFromKeyVault A `protectedSettingsFromKeyVault` block as defined below.
     * 
     * &gt; **Note:** `protectedSettingsFromKeyVault` cannot be used with `protectedSettings`
     * @return builder
     */
    inline def protectedSettingsFromKeyVault(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineScaleSetExtensionProtectedSettingsFromKeyVaultArgs.Builder]):
        com.pulumi.azure.compute.inputs.VirtualMachineScaleSetExtensionState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineScaleSetExtensionProtectedSettingsFromKeyVaultArgs.builder
      builder.protectedSettingsFromKeyVault(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.VirtualMachineState.Builder)
    /**
     * @param additionalCapabilities An `additionalCapabilities` block as defined below.
     * @return builder
     */
    inline def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    inline def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param osProfile An `osProfile` block as defined below. Required when `createOption` in the `storageOsDisk` block is set to `FromImage`.
     * @return builder
     */
    inline def osProfile(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileArgs.Builder]):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileArgs.builder
      builder.osProfile(args(argsBuilder).build)

    /**
     * @param osProfileLinuxConfig (Required, when a Linux machine) An `osProfileLinuxConfig` block as defined below.
     * @return builder
     */
    inline def osProfileLinuxConfig(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileLinuxConfigArgs.Builder]):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileLinuxConfigArgs.builder
      builder.osProfileLinuxConfig(args(argsBuilder).build)

    /**
     * @param osProfileSecrets One or more `osProfileSecrets` blocks as defined below.
     * @return builder
     */
    inline def osProfileSecrets(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileSecretArgs.Builder]*):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileSecretArgs.builder
      builder.osProfileSecrets(args.map(_(argsBuilder).build)*)

    /**
     * @param osProfileWindowsConfig (Required, when a Windows machine) An `osProfileWindowsConfig` block as defined below.
     * @return builder
     */
    inline def osProfileWindowsConfig(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigArgs.Builder]):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineOsProfileWindowsConfigArgs.builder
      builder.osProfileWindowsConfig(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below.
     * @return builder
     */
    inline def plan(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachinePlanArgs.Builder]):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachinePlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param storageDataDisks One or more `storageDataDisk` blocks as defined below.
     * 
     * &gt; **Please Note:** Data Disks can also be attached either using this block or the `azure.compute.DataDiskAttachment` resource - but not both.
     * @return builder
     */
    inline def storageDataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineStorageDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineStorageDataDiskArgs.builder
      builder.storageDataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param storageImageReference A `storageImageReference` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def storageImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineStorageImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineStorageImageReferenceArgs.builder
      builder.storageImageReference(args(argsBuilder).build)

    /**
     * @param storageOsDisk A `storageOsDisk` block as defined below.
     * @return builder
     */
    inline def storageOsDisk(args: Endofunction[com.pulumi.azure.compute.inputs.VirtualMachineStorageOsDiskArgs.Builder]):
        com.pulumi.azure.compute.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.VirtualMachineStorageOsDiskArgs.builder
      builder.storageOsDisk(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsDiskArgs.Builder)
    /**
     * @param diffDiskSettings A `diffDiskSettings` block as defined above. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** `diffDiskSettings` can only be set when `caching` is set to `ReadOnly`. More information can be found [here](https://docs.microsoft.com/azure/virtual-machines/ephemeral-os-disks-deploy#vm-template-deployment). Additionally, this property cannot be set when an existing Managed Disk is used to create the Virtual Machine by setting `osManagedDiskId`.
     * @return builder
     */
    inline def diffDiskSettings(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsDiskDiffDiskSettingsArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsDiskArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsDiskDiffDiskSettingsArgs.builder
      builder.diffDiskSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetExtensionArgs.Builder)
    /**
     * @param protectedSettingsFromKeyVault A `protectedSettingsFromKeyVault` block as defined below.
     * 
     * &gt; **Note:** `protectedSettingsFromKeyVault` cannot be used with `protectedSettings`
     * @return builder
     */
    inline def protectedSettingsFromKeyVault(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetExtensionProtectedSettingsFromKeyVaultArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetExtensionArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetExtensionProtectedSettingsFromKeyVaultArgs.builder
      builder.protectedSettingsFromKeyVault(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceArgs.Builder)
    /**
     * @param ipConfigurations One or more `ipConfiguration` blocks as defined above.
     * @return builder
     */
    inline def ipConfigurations(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.builder
      builder.ipConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.Builder)
    /**
     * @param publicIpAddresses A `publicIpAddress` block as defined below.
     * @return builder
     */
    inline def publicIpAddresses(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.builder
      builder.publicIpAddresses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.Builder)
    /**
     * @param ipTags One or more `ipTag` blocks as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def ipTags(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs.builder
      builder.ipTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetOsDiskArgs.Builder)
    /**
     * @param diffDiskSettings A `diffDiskSettings` block as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def diffDiskSettings(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetOsDiskArgs.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs.builder
      builder.diffDiskSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSecretArgs.Builder)
    /**
     * @param certificates One or more `certificate` blocks as defined above.
     * @return builder
     */
    inline def certificates(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSecretCertificateArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSecretArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSecretCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder)
    /**
     * @param additionalCapabilities An `additionalCapabilities` block as defined below.
     * @return builder
     */
    inline def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param additionalUnattendContents One or more `additionalUnattendContent` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def additionalUnattendContents(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAdditionalUnattendContentArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAdditionalUnattendContentArgs.builder
      builder.additionalUnattendContents(args.map(_(argsBuilder).build)*)

    /**
     * @param automaticInstanceRepair An `automaticInstanceRepair` block as defined below. To enable the automatic instance repair, this Virtual Machine Scale Set must have a valid `healthProbeId` or an [Application Health Extension](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-health-extension).
     * 
     * &gt; **Note:** For more information about Automatic Instance Repair, please refer to [this doc](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-automatic-instance-repairs).
     * @return builder
     */
    inline def automaticInstanceRepair(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAutomaticInstanceRepairArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAutomaticInstanceRepairArgs.builder
      builder.automaticInstanceRepair(args(argsBuilder).build)

    /**
     * @param automaticOsUpgradePolicy An `automaticOsUpgradePolicy` block as defined below. This can only be specified when `upgradeMode` is set to either `Automatic` or `Rolling`.
     * @return builder
     */
    inline def automaticOsUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAutomaticOsUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetAutomaticOsUpgradePolicyArgs.builder
      builder.automaticOsUpgradePolicy(args(argsBuilder).build)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    inline def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param dataDisks One or more `dataDisk` blocks as defined below.
     * @return builder
     */
    inline def dataDisks(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetDataDiskArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param extensions One or more `extension` blocks as defined below
     * @return builder
     */
    inline def extensions(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetExtensionArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param galleryApplications One or more `galleryApplication` blocks as defined below.
     * @return builder
     */
    inline def galleryApplications(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetGalleryApplicationArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetGalleryApplicationArgs.builder
      builder.galleryApplications(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkInterfaces One or more `networkInterface` blocks as defined below.
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param osDisk An `osDisk` block as defined below.
     * @return builder
     */
    inline def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetOsDiskArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** When using an image from Azure Marketplace a `plan` must be specified.
     * @return builder
     */
    inline def plan(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetPlanArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param rollingUpgradePolicy A `rollingUpgradePolicy` block as defined below. This is Required and can only be specified when `upgradeMode` is set to `Automatic` or `Rolling`. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def rollingUpgradePolicy(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetRollingUpgradePolicyArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetRollingUpgradePolicyArgs.builder
      builder.rollingUpgradePolicy(args(argsBuilder).build)

    /**
     * @param scaleIn A `scaleIn` block as defined below.
     * @return builder
     */
    inline def scaleIn(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetScaleInArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetScaleInArgs.builder
      builder.scaleIn(args(argsBuilder).build)

    /**
     * @param secrets One or more `secret` blocks as defined below.
     * @return builder
     */
    inline def secrets(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSecretArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceImageReference A `sourceImageReference` block as defined below.
     * 
     * &gt; **Note:** One of either `sourceImageId` or `sourceImageReference` must be set.
     * @return builder
     */
    inline def sourceImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSourceImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSourceImageReferenceArgs.builder
      builder.sourceImageReference(args(argsBuilder).build)

    /**
     * @param spotRestore A `spotRestore` block as defined below.
     * @return builder
     */
    inline def spotRestore(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSpotRestoreArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetSpotRestoreArgs.builder
      builder.spotRestore(args(argsBuilder).build)

    /**
     * @param terminationNotification A `terminationNotification` block as defined below.
     * @return builder
     */
    inline def terminationNotification(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetTerminationNotificationArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetTerminationNotificationArgs.builder
      builder.terminationNotification(args(argsBuilder).build)

    /**
     * @param winrmListeners One or more `winrmListener` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def winrmListeners(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetWinrmListenerArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetWinrmListenerArgs.builder
      builder.winrmListeners(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.WindowsVirtualMachineSecretArgs.Builder)
    /**
     * @param certificates One or more `certificate` blocks as defined above.
     * @return builder
     */
    inline def certificates(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineSecretCertificateArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineSecretArgs.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineSecretCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder)
    /**
     * @param additionalCapabilities A `additionalCapabilities` block as defined below.
     * @return builder
     */
    inline def additionalCapabilities(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineAdditionalCapabilitiesArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineAdditionalCapabilitiesArgs.builder
      builder.additionalCapabilities(args(argsBuilder).build)

    /**
     * @param additionalUnattendContents One or more `additionalUnattendContent` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def additionalUnattendContents(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineAdditionalUnattendContentArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineAdditionalUnattendContentArgs.builder
      builder.additionalUnattendContents(args.map(_(argsBuilder).build)*)

    /**
     * @param bootDiagnostics A `bootDiagnostics` block as defined below.
     * @return builder
     */
    inline def bootDiagnostics(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineBootDiagnosticsArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineBootDiagnosticsArgs.builder
      builder.bootDiagnostics(args(argsBuilder).build)

    /**
     * @param galleryApplications One or more `galleryApplication` blocks as defined below.
     * 
     * &gt; **Note** Gallery Application Assignments can be defined either directly on `azure.compute.WindowsVirtualMachine` resource, or using the `azure.compute.GalleryApplicationAssignment` resource - but the two approaches cannot be used together. If both are used with the same Virtual Machine, spurious changes will occur. If `azure.compute.GalleryApplicationAssignment` is used, it&#39;s recommended to use `ignoreChanges` for the `galleryApplication` block on the corresponding `azure.compute.WindowsVirtualMachine` resource, to avoid a persistent diff when using this resource.
     * @return builder
     */
    inline def galleryApplications(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineGalleryApplicationArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineGalleryApplicationArgs.builder
      builder.galleryApplications(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineIdentityArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param osDisk An `osDisk` block as defined below.
     * @return builder
     */
    inline def osDisk(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsDiskArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsDiskArgs.builder
      builder.osDisk(args(argsBuilder).build)

    /**
     * @param osImageNotification A `osImageNotification` block as defined below.
     * @return builder
     */
    inline def osImageNotification(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsImageNotificationArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsImageNotificationArgs.builder
      builder.osImageNotification(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def plan(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachinePlanArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachinePlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param secrets One or more `secret` blocks as defined below.
     * @return builder
     */
    inline def secrets(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineSecretArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceImageReference A `sourceImageReference` block as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** One of either `sourceImageId` or `sourceImageReference` must be set.
     * @return builder
     */
    inline def sourceImageReference(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineSourceImageReferenceArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineSourceImageReferenceArgs.builder
      builder.sourceImageReference(args(argsBuilder).build)

    /**
     * @param terminationNotification A `terminationNotification` block as defined below.
     * @return builder
     */
    inline def terminationNotification(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineTerminationNotificationArgs.Builder]):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineTerminationNotificationArgs.builder
      builder.terminationNotification(args(argsBuilder).build)

    /**
     * @param winrmListeners One or more `winrmListener` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def winrmListeners(args: Endofunction[com.pulumi.azure.compute.inputs.WindowsVirtualMachineWinrmListenerArgs.Builder]*):
        com.pulumi.azure.compute.inputs.WindowsVirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.compute.inputs.WindowsVirtualMachineWinrmListenerArgs.builder
      builder.winrmListeners(args.map(_(argsBuilder).build)*)
