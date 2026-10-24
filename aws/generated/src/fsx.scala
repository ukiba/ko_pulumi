package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object fsx:
  /** Provides a FSx Backup resource. */
  def Backup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.BackupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.BackupArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.fsx.Backup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a FSx for Lustre Data Repository Association. See [Linking your file system to an S3 bucket](https://docs.aws.amazon.com/fsx/latest/LustreGuide/create-dra-linked-data-repo.html) for more information.
   * 
   * &gt; **NOTE:** Data Repository Associations are only compatible with AWS FSx for Lustre File Systems and `PERSISTENT_2` deployment type.
   */
  def DataRepositoryAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.DataRepositoryAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.DataRepositoryAssociationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.fsx.DataRepositoryAssociation(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for managing an Amazon File Cache cache.
   * See the [Create File Cache](https://docs.aws.amazon.com/fsx/latest/APIReference/API_CreateFileCache.html) for more information.
   */
  def FileCache(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.FileCacheArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.FileCacheArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.fsx.FileCache(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object FsxFunctions:
    /** Retrieve information on FSx ONTAP File System. */
    inline def getOntapFileSystem(args: Endofunction[com.pulumi.aws.fsx.inputs.GetOntapFileSystemArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.fsx.outputs.GetOntapFileSystemResult] =
      val argsBuilder = com.pulumi.aws.fsx.inputs.GetOntapFileSystemArgs.builder
      com.pulumi.aws.fsx.FsxFunctions.getOntapFileSystem(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieve information on FSx ONTAP File System. */
    inline def getOntapFileSystemPlain(args: Endofunction[com.pulumi.aws.fsx.inputs.GetOntapFileSystemPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.fsx.outputs.GetOntapFileSystemResult] =
      val argsBuilder = com.pulumi.aws.fsx.inputs.GetOntapFileSystemPlainArgs.builder
      com.pulumi.aws.fsx.FsxFunctions.getOntapFileSystemPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Retrieve information on FSx ONTAP Storage Virtual Machine (SVM).
     * 
     * The arguments of this data source act as filters for querying the available ONTAP Storage Virtual Machines in the current region. The given filters must match exactly one Storage Virtual Machine whose data will be exported as attributes.
     */
    inline def getOntapStorageVirtualMachine(args: Endofunction[com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachineArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.fsx.outputs.GetOntapStorageVirtualMachineResult] =
      val argsBuilder = com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachineArgs.builder
      com.pulumi.aws.fsx.FsxFunctions.getOntapStorageVirtualMachine(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Retrieve information on FSx ONTAP Storage Virtual Machine (SVM).
     * 
     * The arguments of this data source act as filters for querying the available ONTAP Storage Virtual Machines in the current region. The given filters must match exactly one Storage Virtual Machine whose data will be exported as attributes.
     */
    inline def getOntapStorageVirtualMachinePlain(args: Endofunction[com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachinePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.fsx.outputs.GetOntapStorageVirtualMachineResult] =
      val argsBuilder = com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachinePlainArgs.builder
      com.pulumi.aws.fsx.FsxFunctions.getOntapStorageVirtualMachinePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** This resource can be useful for getting back a set of FSx ONTAP Storage Virtual Machine (SVM) IDs. */
    inline def getOntapStorageVirtualMachines(args: Endofunction[com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachinesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.fsx.outputs.GetOntapStorageVirtualMachinesResult] =
      val argsBuilder = com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachinesArgs.builder
      com.pulumi.aws.fsx.FsxFunctions.getOntapStorageVirtualMachines(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** This resource can be useful for getting back a set of FSx ONTAP Storage Virtual Machine (SVM) IDs. */
    inline def getOntapStorageVirtualMachinesPlain(args: Endofunction[com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachinesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.fsx.outputs.GetOntapStorageVirtualMachinesResult] =
      val argsBuilder = com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachinesPlainArgs.builder
      com.pulumi.aws.fsx.FsxFunctions.getOntapStorageVirtualMachinesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information about an Amazon FSx for OpenZFS Snapshot for use when provisioning new Volumes. */
    inline def getOpenZfsSnapshot(args: Endofunction[com.pulumi.aws.fsx.inputs.GetOpenZfsSnapshotArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.fsx.outputs.GetOpenZfsSnapshotResult] =
      val argsBuilder = com.pulumi.aws.fsx.inputs.GetOpenZfsSnapshotArgs.builder
      com.pulumi.aws.fsx.FsxFunctions.getOpenZfsSnapshot(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information about an Amazon FSx for OpenZFS Snapshot for use when provisioning new Volumes. */
    inline def getOpenZfsSnapshotPlain(args: Endofunction[com.pulumi.aws.fsx.inputs.GetOpenZfsSnapshotPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.fsx.outputs.GetOpenZfsSnapshotResult] =
      val argsBuilder = com.pulumi.aws.fsx.inputs.GetOpenZfsSnapshotPlainArgs.builder
      com.pulumi.aws.fsx.FsxFunctions.getOpenZfsSnapshotPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieve information on FSx Windows File System. */
    inline def getWindowsFileSystem(args: Endofunction[com.pulumi.aws.fsx.inputs.GetWindowsFileSystemArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.fsx.outputs.GetWindowsFileSystemResult] =
      val argsBuilder = com.pulumi.aws.fsx.inputs.GetWindowsFileSystemArgs.builder
      com.pulumi.aws.fsx.FsxFunctions.getWindowsFileSystem(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieve information on FSx Windows File System. */
    inline def getWindowsFileSystemPlain(args: Endofunction[com.pulumi.aws.fsx.inputs.GetWindowsFileSystemPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.fsx.outputs.GetWindowsFileSystemResult] =
      val argsBuilder = com.pulumi.aws.fsx.inputs.GetWindowsFileSystemPlainArgs.builder
      com.pulumi.aws.fsx.FsxFunctions.getWindowsFileSystemPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Manages a FSx Lustre File System. See the [FSx Lustre Guide](https://docs.aws.amazon.com/fsx/latest/LustreGuide/what-is.html) for more information.
   * 
   * &gt; **NOTE:** `autoImportPolicy`, `exportPath`, `importPath` and `importedFileChunkSize` are not supported with the `PERSISTENT_2` deployment type. Use `aws.fsx.DataRepositoryAssociation` instead.
   */
  def LustreFileSystem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.LustreFileSystemArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.LustreFileSystemArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.fsx.LustreFileSystem(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Amazon FSx for NetApp ONTAP file system.
   * See the [FSx ONTAP User Guide](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/what-is-fsx-ontap.html) for more information.
   */
  def OntapFileSystem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.OntapFileSystemArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.OntapFileSystemArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.fsx.OntapFileSystem(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a FSx Storage Virtual Machine.
   * See the [FSx ONTAP User Guide](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html) for more information.
   */
  def OntapStorageVirtualMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.OntapStorageVirtualMachineArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.OntapStorageVirtualMachineArgs.builder
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
    com.pulumi.aws.fsx.OntapStorageVirtualMachine(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a FSx ONTAP Volume.
   * See the [FSx ONTAP User Guide](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-volumes.html) for more information.
   */
  def OntapVolume(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.OntapVolumeArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.OntapVolumeArgs.builder
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
    com.pulumi.aws.fsx.OntapVolume(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Amazon FSx for OpenZFS file system.
   * See the [FSx OpenZFS User Guide](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/what-is-fsx.html) for more information.
   */
  def OpenZfsFileSystem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.OpenZfsFileSystemArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.OpenZfsFileSystemArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.fsx.OpenZfsFileSystem(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Amazon FSx for OpenZFS volume.
   * See the [FSx OpenZFS User Guide](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/what-is-fsx.html) for more information.
   */
  def OpenZfsSnapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.OpenZfsSnapshotArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.OpenZfsSnapshotArgs.builder
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
    com.pulumi.aws.fsx.OpenZfsSnapshot(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Amazon FSx for OpenZFS volume.
   * See the [FSx OpenZFS User Guide](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/what-is-fsx.html) for more information.
   */
  def OpenZfsVolume(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.OpenZfsVolumeArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.OpenZfsVolumeArgs.builder
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
    com.pulumi.aws.fsx.OpenZfsVolume(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Amazon FSx S3 Access Point attachment. */
  def S3AccessPointAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.S3AccessPointAttachmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.S3AccessPointAttachmentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.fsx.S3AccessPointAttachment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a FSx Windows File System. See the [FSx Windows Guide](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/what-is.html) for more information.
   * 
   * &gt; **NOTE:** Either the `activeDirectoryId` argument or `selfManagedActiveDirectory` configuration block must be specified.
   */
  def WindowsFileSystem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.WindowsFileSystemArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.WindowsFileSystemArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.fsx.WindowsFileSystem(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
