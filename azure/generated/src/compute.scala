package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object compute:
  /** Manages a Virtual Machine Automanage Configuration Profile Assignment. */
  def AutomanageConfigurationAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.AutomanageConfigurationAssignmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.compute.AutomanageConfigurationAssignmentArgs.builder
    com.pulumi.azure.compute.AutomanageConfigurationAssignment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Availability Set for Virtual Machines. */
  def AvailabilitySet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.AvailabilitySetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.AvailabilitySetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.AvailabilitySet(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Bastion Host. */
  def BastionHost(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.BastionHostArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.BastionHostArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.BastionHost(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Capacity Reservation within a Capacity Reservation Group. */
  def CapacityReservation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.CapacityReservationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.CapacityReservationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.CapacityReservation(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Capacity Reservation Group. */
  def CapacityReservationGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.CapacityReservationGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.CapacityReservationGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.CapacityReservationGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object ComputeFunctions:
    /** Use this data source to access information about an existing Availability Set. */
    inline def getAvailabilitySet(args: Endofunction[com.pulumi.azure.compute.inputs.GetAvailabilitySetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetAvailabilitySetResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetAvailabilitySetArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getAvailabilitySet(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Availability Set. */
    inline def getAvailabilitySetPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetAvailabilitySetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetAvailabilitySetResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetAvailabilitySetPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getAvailabilitySetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Bastion Host. */
    inline def getBastionHost(args: Endofunction[com.pulumi.azure.compute.inputs.GetBastionHostArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetBastionHostResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetBastionHostArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getBastionHost(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Bastion Host. */
    inline def getBastionHostPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetBastionHostPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetBastionHostResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetBastionHostPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getBastionHostPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Gets information about an existing Confidential Ledger. */
    inline def getConfidentialLedger(args: Endofunction[com.pulumi.azure.compute.inputs.GetConfidentialLedgerArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetConfidentialLedgerResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetConfidentialLedgerArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getConfidentialLedger(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Gets information about an existing Confidential Ledger. */
    inline def getConfidentialLedgerPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetConfidentialLedgerPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetConfidentialLedgerResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetConfidentialLedgerPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getConfidentialLedgerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Dedicated Host. */
    inline def getDedicatedHost(args: Endofunction[com.pulumi.azure.compute.inputs.GetDedicatedHostArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetDedicatedHostResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetDedicatedHostArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getDedicatedHost(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Dedicated Host. */
    inline def getDedicatedHostPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetDedicatedHostPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetDedicatedHostResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetDedicatedHostPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getDedicatedHostPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Dedicated Host Group. */
    inline def getDedicatedHostGroup(args: Endofunction[com.pulumi.azure.compute.inputs.GetDedicatedHostGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetDedicatedHostGroupResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetDedicatedHostGroupArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getDedicatedHostGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Dedicated Host Group. */
    inline def getDedicatedHostGroupPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetDedicatedHostGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetDedicatedHostGroupResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetDedicatedHostGroupPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getDedicatedHostGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Disk Access. */
    inline def getDiskAccess(args: Endofunction[com.pulumi.azure.compute.inputs.GetDiskAccessArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetDiskAccessResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetDiskAccessArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getDiskAccess(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Disk Access. */
    inline def getDiskAccessPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetDiskAccessPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetDiskAccessResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetDiskAccessPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getDiskAccessPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Disk Encryption Set. */
    inline def getDiskEncryptionSet(args: Endofunction[com.pulumi.azure.compute.inputs.GetDiskEncryptionSetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetDiskEncryptionSetResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetDiskEncryptionSetArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getDiskEncryptionSet(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Disk Encryption Set. */
    inline def getDiskEncryptionSetPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetDiskEncryptionSetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetDiskEncryptionSetResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetDiskEncryptionSetPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getDiskEncryptionSetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Image. */
    inline def getImage(args: Endofunction[com.pulumi.azure.compute.inputs.GetImageArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetImageArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getImage(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Image. */
    inline def getImagePlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetImagePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetImagePlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getImagePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about existing Images within a Resource Group. */
    inline def getImages(args: Endofunction[com.pulumi.azure.compute.inputs.GetImagesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetImagesResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetImagesArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getImages(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about existing Images within a Resource Group. */
    inline def getImagesPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetImagesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetImagesResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetImagesPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getImagesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Managed Disk. */
    inline def getManagedDisk(args: Endofunction[com.pulumi.azure.compute.inputs.GetManagedDiskArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetManagedDiskResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetManagedDiskArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getManagedDisk(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Managed Disk. */
    inline def getManagedDiskPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetManagedDiskPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetManagedDiskResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetManagedDiskPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getManagedDiskPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Managed Disk. */
    inline def getManagedDisks(args: Endofunction[com.pulumi.azure.compute.inputs.GetManagedDisksArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetManagedDisksResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetManagedDisksArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getManagedDisks(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Managed Disk. */
    inline def getManagedDisksPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetManagedDisksPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetManagedDisksResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetManagedDisksPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getManagedDisksPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Orchestrated Virtual Machine Scale Set. */
    inline def getOrchestratedVirtualMachineScaleSet(args: Endofunction[com.pulumi.azure.compute.inputs.GetOrchestratedVirtualMachineScaleSetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetOrchestratedVirtualMachineScaleSetResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetOrchestratedVirtualMachineScaleSetArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getOrchestratedVirtualMachineScaleSet(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Orchestrated Virtual Machine Scale Set. */
    inline def getOrchestratedVirtualMachineScaleSetPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetOrchestratedVirtualMachineScaleSetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetOrchestratedVirtualMachineScaleSetResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetOrchestratedVirtualMachineScaleSetPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getOrchestratedVirtualMachineScaleSetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about a Platform Image. */
    inline def getPlatformImage(args: Endofunction[com.pulumi.azure.compute.inputs.GetPlatformImageArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetPlatformImageResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetPlatformImageArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getPlatformImage(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about a Platform Image. */
    inline def getPlatformImagePlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetPlatformImagePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetPlatformImageResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetPlatformImagePlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getPlatformImagePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Shared Image within a Shared Image Gallery. */
    inline def getSharedImage(args: Endofunction[com.pulumi.azure.compute.inputs.GetSharedImageArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetSharedImageResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSharedImageArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSharedImage(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Shared Image within a Shared Image Gallery. */
    inline def getSharedImagePlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetSharedImagePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetSharedImageResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSharedImagePlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSharedImagePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Shared Image Gallery. */
    inline def getSharedImageGallery(args: Endofunction[com.pulumi.azure.compute.inputs.GetSharedImageGalleryArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetSharedImageGalleryResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSharedImageGalleryArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSharedImageGallery(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Shared Image Gallery. */
    inline def getSharedImageGalleryPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetSharedImageGalleryPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetSharedImageGalleryResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSharedImageGalleryPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSharedImageGalleryPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Version of a Shared Image within a Shared Image Gallery. */
    inline def getSharedImageVersion(args: Endofunction[com.pulumi.azure.compute.inputs.GetSharedImageVersionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetSharedImageVersionResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSharedImageVersionArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSharedImageVersion(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Version of a Shared Image within a Shared Image Gallery. */
    inline def getSharedImageVersionPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetSharedImageVersionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetSharedImageVersionResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSharedImageVersionPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSharedImageVersionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about existing Versions of a Shared Image within a Shared Image Gallery. */
    inline def getSharedImageVersions(args: Endofunction[com.pulumi.azure.compute.inputs.GetSharedImageVersionsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetSharedImageVersionsResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSharedImageVersionsArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSharedImageVersions(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about existing Versions of a Shared Image within a Shared Image Gallery. */
    inline def getSharedImageVersionsPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetSharedImageVersionsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetSharedImageVersionsResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSharedImageVersionsPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSharedImageVersionsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Snapshot. */
    inline def getSnapshot(args: Endofunction[com.pulumi.azure.compute.inputs.GetSnapshotArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetSnapshotResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSnapshotArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSnapshot(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Snapshot. */
    inline def getSnapshotPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetSnapshotPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetSnapshotResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSnapshotPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSnapshotPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing SSH Public Key. */
    inline def getSshPublicKey(args: Endofunction[com.pulumi.azure.compute.inputs.GetSshPublicKeyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetSshPublicKeyResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSshPublicKeyArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSshPublicKey(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing SSH Public Key. */
    inline def getSshPublicKeyPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetSshPublicKeyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetSshPublicKeyResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetSshPublicKeyPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getSshPublicKeyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Virtual Machine. */
    inline def getVirtualMachine(args: Endofunction[com.pulumi.azure.compute.inputs.GetVirtualMachineArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetVirtualMachineResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetVirtualMachineArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getVirtualMachine(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Virtual Machine. */
    inline def getVirtualMachinePlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetVirtualMachinePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetVirtualMachineResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetVirtualMachinePlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getVirtualMachinePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Virtual Machine Scale Set. */
    inline def getVirtualMachineScaleSet(args: Endofunction[com.pulumi.azure.compute.inputs.GetVirtualMachineScaleSetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.compute.outputs.GetVirtualMachineScaleSetResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetVirtualMachineScaleSetArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getVirtualMachineScaleSet(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Virtual Machine Scale Set. */
    inline def getVirtualMachineScaleSetPlain(args: Endofunction[com.pulumi.azure.compute.inputs.GetVirtualMachineScaleSetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.compute.outputs.GetVirtualMachineScaleSetResult] =
      val argsBuilder = com.pulumi.azure.compute.inputs.GetVirtualMachineScaleSetPlainArgs.builder
      com.pulumi.azure.compute.ComputeFunctions.getVirtualMachineScaleSetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Manages attaching a Disk to a Virtual Machine.
   * 
   * &gt; **NOTE:** Data Disks can be attached either directly on the `azure.compute.VirtualMachine` resource, or using the `azure.compute.DataDiskAttachment` resource - but the two cannot be used together. If both are used against the same Virtual Machine, spurious changes will occur.
   * 
   * &gt; **Please Note:** only Managed Disks are supported via this separate resource, Unmanaged Disks can be attached using the `storageDataDisk` block in the `azure.compute.VirtualMachine` resource.
   */
  def DataDiskAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.DataDiskAttachmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.compute.DataDiskAttachmentArgs.builder
    com.pulumi.azure.compute.DataDiskAttachment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manage a Dedicated Host within a Dedicated Host Group. */
  def DedicatedHost(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.DedicatedHostArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.DedicatedHostArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.DedicatedHost(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manage a Dedicated Host Group. */
  def DedicatedHostGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.DedicatedHostGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.DedicatedHostGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.DedicatedHostGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Disk Access. */
  def DiskAccess(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.DiskAccessArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.DiskAccessArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.DiskAccess(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Disk Encryption Set.
   * 
   * &gt; **NOTE:** At this time the Key Vault used to store the Active Key for this Disk Encryption Set must have both Soft Delete &amp; Purge Protection enabled - which are not yet supported by this provider.
   */
  def DiskEncryptionSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.DiskEncryptionSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.DiskEncryptionSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.DiskEncryptionSet(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Virtual Machine Extension to provide post deployment configuration
   * and run automated tasks.
   * 
   * &gt; **Note:** Custom Script Extensions for Linux &amp; Windows require that the `commandToExecute` returns a `0` exit code to be classified as successfully deployed. You can achieve this by appending `exit 0` to the end of your `commandToExecute`.
   * 
   * &gt; **Note:** Custom Script Extensions require that the Azure Virtual Machine Guest Agent is running on the Virtual Machine.
   */
  def Extension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.ExtensionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.ExtensionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.Extension(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Gallery Application. */
  def GalleryApplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.GalleryApplicationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.GalleryApplicationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.GalleryApplication(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Virtual Machine Gallery Application Assignment.
   * 
   * &gt; **Note:** Gallery Application Assignments can be defined either directly on `azure.compute.LinuxVirtualMachine` and `azure.compute.WindowsVirtualMachine` resources, or using the `azure.compute.GalleryApplicationAssignment` resource - but the two approaches cannot be used together. If both are used with the same Virtual Machine, spurious changes will occur. It&#39;s recommended to use `ignoreChanges` for the `galleryApplication` block on the associated virtual machine resources, to avoid a persistent diff when using this resource.
   */
  def GalleryApplicationAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.GalleryApplicationAssignmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.compute.GalleryApplicationAssignmentArgs.builder
    com.pulumi.azure.compute.GalleryApplicationAssignment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Gallery Application Version. */
  def GalleryApplicationVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.GalleryApplicationVersionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.GalleryApplicationVersionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.GalleryApplicationVersion(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a custom virtual machine image that can be used to create virtual machines. */
  def Image(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.ImageArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.ImageArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.Image(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an implicit Data Disk of a Virtual Machine.
   * 
   * &gt; **Note:** The Implicit Data Disk will be deleted instantly after this resource is destroyed. If you want to detach this disk only, you may set `detachImplicitDataDiskOnDeletion` field to `true` within the `virtualMachine` block in the provider `features` block.
   */
  def ImplicitDataDiskFromSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.ImplicitDataDiskFromSourceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.ImplicitDataDiskFromSourceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.compute.ImplicitDataDiskFromSource(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Linux Virtual Machine.
   * 
   * ## Disclaimers
   * 
   * &gt; **Note** This provider will automatically remove the OS Disk by default - this behaviour can be configured using the `features` configuration within the Provider configuration block.
   * 
   * &gt; **Note** All arguments including the administrator login and password will be stored in the raw state as plain-text.
   * 
   * &gt; **Note** This resource does not support Unmanaged Disks. If you need to use Unmanaged Disks you can continue to use the `azure.compute.VirtualMachine` resource instead.
   * 
   * &gt; **Note** This resource does not support attaching existing OS Disks. You can instead capture an image of the OS Disk or continue to use the `azure.compute.VirtualMachine` resource instead.
   * 
   * &gt; In this release there&#39;s a known issue where the `publicIpAddress` and `publicIpAddresses` fields may not be fully populated for Dynamic Public IP&#39;s.
   */
  def LinuxVirtualMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.LinuxVirtualMachineArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.LinuxVirtualMachineArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.LinuxVirtualMachine(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Linux Virtual Machine Scale Set.
   * 
   * ## Disclaimers
   * 
   * &gt; **Note:** As of the **v2.86.0** (November 19, 2021) release of the provider this resource will only create Virtual Machine Scale Sets with the **Uniform** Orchestration Mode. For Virtual Machine Scale Sets with **Flexible** orchestration mode, use `azure.compute.OrchestratedVirtualMachineScaleSet`. Flexible orchestration mode is recommended for workloads on Azure.
   */
  def LinuxVirtualMachineScaleSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.LinuxVirtualMachineScaleSet(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a managed disk. */
  def ManagedDisk(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.ManagedDiskArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.ManagedDiskArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.ManagedDisk(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Disk SAS Token.
   * 
   * Use this resource to obtain a Shared Access Signature (SAS Token) for an existing Managed Disk.
   * 
   * Shared access signatures allow fine-grained, ephemeral access control to various aspects of Managed Disk similar to blob/storage account container.
   * 
   * With the help of this resource, data from the disk can be copied from managed disk to a storage blob or to some other system without the need of azcopy.
   */
  def ManagedDiskSasToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.ManagedDiskSasTokenArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.compute.ManagedDiskSasTokenArgs.builder
    com.pulumi.azure.compute.ManagedDiskSasToken(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Orchestrated Virtual Machine Scale Set in Flexible Orchestration Mode.
   * 
   * ## Disclaimers
   * 
   * &gt; **Note:** As of the **v2.86.0** (November 19, 2021) release of the provider this resource will only create Virtual Machine Scale Sets with the **Flexible** Orchestration Mode.
   * 
   * &gt; **Note:** All arguments including the administrator login and password will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
   */
  def OrchestratedVirtualMachineScaleSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSet(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Configures Network Packet Capturing against a Virtual Machine using a Network Watcher. */
  def PacketCapture(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.PacketCaptureArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.PacketCaptureArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.compute.PacketCapture(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Virtual Machine Restore Point. */
  def RestorePoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.RestorePointArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.RestorePointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.compute.RestorePoint(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Virtual Machine Restore Point Collection. */
  def RestorePointCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.RestorePointCollectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.RestorePointCollectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.RestorePointCollection(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Virtual Machine Run Command. */
  def RunCommand(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.RunCommandArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.RunCommandArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.RunCommand(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a virtual machine scale set. */
  def ScaleSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.ScaleSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.ScaleSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.ScaleSet(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Configures Network Packet Capturing against a Virtual Machine Scale Set using a Network Watcher. */
  def ScaleSetPacketCapture(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.ScaleSetPacketCaptureArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.ScaleSetPacketCaptureArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.compute.ScaleSetPacketCapture(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Standby Pool for Virtual Machine Scale Sets.
   * &gt; **Note:** please follow the prerequisites mentioned in this [article](https://learn.microsoft.com/azure/virtual-machine-scale-sets/standby-pools-create?tabs=portal#prerequisites) before using this resource.
   */
  def ScaleSetStandbyPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.ScaleSetStandbyPoolArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.ScaleSetStandbyPoolArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.ScaleSetStandbyPool(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Shared Image within a Shared Image Gallery. */
  def SharedImage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.SharedImageArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.SharedImageArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.SharedImage(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Shared Image Gallery. */
  def SharedImageGallery(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.SharedImageGalleryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.SharedImageGalleryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.SharedImageGallery(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Version of a Shared Image within a Shared Image Gallery. */
  def SharedImageVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.SharedImageVersionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.SharedImageVersionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.SharedImageVersion(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Disk Snapshot. */
  def Snapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.SnapshotArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.SnapshotArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.Snapshot(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a SSH Public Key. */
  def SshPublicKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.SshPublicKeyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.SshPublicKeyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.SshPublicKey(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Virtual Machine.
   * 
   * ## Disclaimers
   * 
   * &gt; **Note:** The `azure.compute.VirtualMachine` resource has been superseded by the `azure.compute.LinuxVirtualMachine` and `azure.compute.WindowsVirtualMachine` resources. The existing `azure.compute.VirtualMachine` resource will continue to be available throughout the 2.x releases however is in a feature-frozen state to maintain compatibility - new functionality will instead be added to the `azure.compute.LinuxVirtualMachine` and `azure.compute.WindowsVirtualMachine` resources.
   * 
   * &gt; **Note:** Data Disks can be attached either directly on the `azure.compute.VirtualMachine` resource, or using the `azure.compute.DataDiskAttachment` resource - but the two cannot be used together. If both are used against the same Virtual Machine, spurious changes will occur.
   */
  def VirtualMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.VirtualMachineArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.VirtualMachineArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.VirtualMachine(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Extension for a Virtual Machine Scale Set.
   * 
   * &gt; **Note:** This resource is not intended to be used with the `azure.compute.ScaleSet` resource - instead it&#39;s intended for this to be used with the `azure.compute.LinuxVirtualMachineScaleSet` and `azure.compute.WindowsVirtualMachineScaleSet` resources.
   */
  def VirtualMachineScaleSetExtension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.VirtualMachineScaleSetExtensionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.VirtualMachineScaleSetExtensionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.compute.VirtualMachineScaleSetExtension(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Windows Virtual Machine.
   * 
   * ## Disclaimers
   * 
   * &gt; **Note** This provider will automatically remove the OS Disk by default - this behaviour can be configured using the `features` setting within the Provider block.
   * 
   * &gt; **Note** All arguments including the administrator login and password will be stored in the raw state as plain-text.
   * 
   * &gt; **Note** This resource does not support Unmanaged Disks. If you need to use Unmanaged Disks you can continue to use the `azure.compute.VirtualMachine` resource instead.
   * 
   * &gt; **Note** This resource does not support attaching existing OS Disks. You can instead capture an image of the OS Disk or continue to use the `azure.compute.VirtualMachine` resource instead.
   * 
   * &gt; In this release there&#39;s a known issue where the `publicIpAddress` and `publicIpAddresses` fields may not be fully populated for Dynamic Public IP&#39;s.
   */
  def WindowsVirtualMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.WindowsVirtualMachineArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.WindowsVirtualMachineArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.WindowsVirtualMachine(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Windows Virtual Machine Scale Set.
   * 
   * ## Disclaimers
   * 
   * &gt; **Note:** This resource will only create Virtual Machine Scale Sets with the **Uniform** Orchestration Mode. For Virtual Machine Scale Sets with **Flexible** orchestration mode, use `azure.compute.OrchestratedVirtualMachineScaleSet`. Flexible orchestration mode is recommended for workloads on Azure.
   * 
   * &gt; **Note:** All arguments including the administrator login and password will be stored in the raw state as plain-text. Read more about [sensitive data](https://www.terraform.io/docs/state/sensitive-data.html) in state.
   * 
   * &gt; **Note:** This provider will automatically update &amp; reimage the nodes in the Scale Set (if Required) during an Update - this behaviour can be configured using the `features` setting within the Provider block.
   * 
   * &gt; **Note:** This resource does not support Unmanaged Disks. If you need to use Unmanaged Disks you can continue to use the `azure.compute.ScaleSet` resource instead.
   */
  def WindowsVirtualMachineScaleSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.compute.WindowsVirtualMachineScaleSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.compute.WindowsVirtualMachineScaleSet(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
