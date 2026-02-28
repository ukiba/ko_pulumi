package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object fsx:
  extension (builder: com.pulumi.aws.fsx.OntapVolumeArgs.Builder)
    /**
     * @param aggregateConfiguration The Aggregate configuration only applies to `FLEXGROUP` volumes. See [`aggregateConfiguration` Block] for details.
     * @return builder
     */
    def aggregateConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapVolumeAggregateConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.OntapVolumeArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OntapVolumeAggregateConfigurationArgs.builder
      builder.aggregateConfiguration(args(argsBuilder).build)

    /**
     * @param snaplockConfiguration The SnapLock configuration for an FSx for ONTAP volume. See `snaplockConfiguration` Block for details.
     * @return builder
     */
    def snaplockConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapVolumeSnaplockConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.OntapVolumeArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OntapVolumeSnaplockConfigurationArgs.builder
      builder.snaplockConfiguration(args(argsBuilder).build)

    /**
     * @param tieringPolicy The data tiering policy for an FSx for ONTAP volume. See `tieringPolicy` Block for details.
     * @return builder
     */
    def tieringPolicy(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapVolumeTieringPolicyArgs.Builder]):
        com.pulumi.aws.fsx.OntapVolumeArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OntapVolumeTieringPolicyArgs.builder
      builder.tieringPolicy(args(argsBuilder).build)

  /**
   * Manages a FSx Storage Virtual Machine.
   *  See the [FSx ONTAP User Guide](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html) for more information.
   */
  def OntapStorageVirtualMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.OntapStorageVirtualMachineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.OntapStorageVirtualMachineArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.fsx.OntapStorageVirtualMachine(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.fsx.OpenZfsVolumeArgs.Builder)
    /**
     * @param nfsExports NFS export configuration for the root volume. Exactly 1 item. See `nfsExports` Block Below for details.
     * @return builder
     */
    def nfsExports(args: Endofunction[com.pulumi.aws.fsx.inputs.OpenZfsVolumeNfsExportsArgs.Builder]):
        com.pulumi.aws.fsx.OpenZfsVolumeArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OpenZfsVolumeNfsExportsArgs.builder
      builder.nfsExports(args(argsBuilder).build)

    /**
     * @param originSnapshot Specifies the configuration to use when creating the OpenZFS volume. See `originSnapshot` Block below for details.
     * @return builder
     */
    def originSnapshot(args: Endofunction[com.pulumi.aws.fsx.inputs.OpenZfsVolumeOriginSnapshotArgs.Builder]):
        com.pulumi.aws.fsx.OpenZfsVolumeArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OpenZfsVolumeOriginSnapshotArgs.builder
      builder.originSnapshot(args(argsBuilder).build)

    /**
     * @param userAndGroupQuotas Specify how much storage users or groups can use on the volume. Maximum number of items defined by [FSx for OpenZFS Resource quota](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/limits.html#limits-openzfs-resources-file-system). See `userAndGroupQuotas` Block Below.
     * @return builder
     */
    def userAndGroupQuotas(args: Endofunction[com.pulumi.aws.fsx.inputs.OpenZfsVolumeUserAndGroupQuotaArgs.Builder]*):
        com.pulumi.aws.fsx.OpenZfsVolumeArgs.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.OpenZfsVolumeUserAndGroupQuotaArgs.builder
      builder.userAndGroupQuotas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fsx.OntapStorageVirtualMachineArgs.Builder)
    /**
     * @param activeDirectoryConfiguration Configuration block that Amazon FSx uses to join the FSx ONTAP Storage Virtual Machine(SVM) to your Microsoft Active Directory (AD) directory. Detailed below.
     * @return builder
     */
    def activeDirectoryConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineActiveDirectoryConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.OntapStorageVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineActiveDirectoryConfigurationArgs.builder
      builder.activeDirectoryConfiguration(args(argsBuilder).build)

  /**
   * Manages an Amazon FSx for NetApp ONTAP file system.
   *  See the [FSx ONTAP User Guide](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/what-is-fsx-ontap.html) for more information.
   */
  def OntapFileSystem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.OntapFileSystemArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.OntapFileSystemArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.fsx.OntapFileSystem(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Amazon FSx for OpenZFS file system.
   *  See the [FSx OpenZFS User Guide](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/what-is-fsx.html) for more information.
   */
  def OpenZfsFileSystem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.OpenZfsFileSystemArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.OpenZfsFileSystemArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.fsx.OpenZfsFileSystem(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Amazon FSx for OpenZFS volume.
   *  See the [FSx OpenZFS User Guide](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/what-is-fsx.html) for more information.
   */
  def OpenZfsVolume(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.OpenZfsVolumeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.OpenZfsVolumeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.fsx.OpenZfsVolume(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.fsx.LustreFileSystemArgs.Builder)
    def dataReadCacheConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.LustreFileSystemDataReadCacheConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.LustreFileSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.LustreFileSystemDataReadCacheConfigurationArgs.builder
      builder.dataReadCacheConfiguration(args(argsBuilder).build)

    /**
     * @param logConfiguration The Lustre logging configuration used when creating an Amazon FSx for Lustre file system. When logging is enabled, Lustre logs error and warning events for data repositories associated with your file system to Amazon CloudWatch Logs. See `logConfiguration` Block for details.
     * @return builder
     */
    def logConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.LustreFileSystemLogConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.LustreFileSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.LustreFileSystemLogConfigurationArgs.builder
      builder.logConfiguration(args(argsBuilder).build)

    /**
     * @param metadataConfiguration The Lustre metadata configuration used when creating an Amazon FSx for Lustre file system. This can be used to specify a user provisioned metadata scale. This is only supported when `deploymentType` is set to `PERSISTENT_2`. See `metadataConfiguration` Block for details.
     * @return builder
     */
    def metadataConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.LustreFileSystemMetadataConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.LustreFileSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.LustreFileSystemMetadataConfigurationArgs.builder
      builder.metadataConfiguration(args(argsBuilder).build)

    /**
     * @param rootSquashConfiguration The Lustre root squash configuration used when creating an Amazon FSx for Lustre file system. When enabled, root squash restricts root-level access from clients that try to access your file system as a root user. See `rootSquashConfiguration` Block for details.
     * @return builder
     */
    def rootSquashConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.LustreFileSystemRootSquashConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.LustreFileSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.LustreFileSystemRootSquashConfigurationArgs.builder
      builder.rootSquashConfiguration(args(argsBuilder).build)

  /**
   * Manages a FSx Lustre File System. See the [FSx Lustre Guide](https://docs.aws.amazon.com/fsx/latest/LustreGuide/what-is.html) for more information.
   *  
   *  &gt; **NOTE:** `autoImportPolicy`, `exportPath`, `importPath` and `importedFileChunkSize` are not supported with the `PERSISTENT_2` deployment type. Use `aws.fsx.DataRepositoryAssociation` instead.
   */
  def LustreFileSystem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.LustreFileSystemArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.LustreFileSystemArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.fsx.LustreFileSystem(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for managing an Amazon File Cache cache.
   *  See the [Create File Cache](https://docs.aws.amazon.com/fsx/latest/APIReference/API_CreateFileCache.html) for more information.
   */
  def FileCache(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.FileCacheArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.FileCacheArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.fsx.FileCache(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type FsxFunctions = com.pulumi.aws.fsx.FsxFunctions
  object FsxFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.fsx.FsxFunctions.*
  extension (self: FsxFunctions.type)
    /** Retrieve information on FSx ONTAP File System. */
    def getOntapFileSystem(args: Endofunction[com.pulumi.aws.fsx.inputs.GetOntapFileSystemArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.fsx.outputs.GetOntapFileSystemResult] =
      val argsBuilder = com.pulumi.aws.fsx.inputs.GetOntapFileSystemArgs.builder
      com.pulumi.aws.fsx.FsxFunctions.getOntapFileSystem(args(argsBuilder).build)

    /** Retrieve information on FSx ONTAP File System. */
    def getOntapFileSystemPlain(args: Endofunction[com.pulumi.aws.fsx.inputs.GetOntapFileSystemPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.fsx.outputs.GetOntapFileSystemResult] =
      val argsBuilder = com.pulumi.aws.fsx.inputs.GetOntapFileSystemPlainArgs.builder
      com.pulumi.aws.fsx.FsxFunctions.getOntapFileSystemPlain(args(argsBuilder).build)

    /** Retrieve information on FSx ONTAP Storage Virtual Machine (SVM). */
    def getOntapStorageVirtualMachine(args: Endofunction[com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachineArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.fsx.outputs.GetOntapStorageVirtualMachineResult] =
      val argsBuilder = com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachineArgs.builder
      com.pulumi.aws.fsx.FsxFunctions.getOntapStorageVirtualMachine(args(argsBuilder).build)

    /** Retrieve information on FSx ONTAP Storage Virtual Machine (SVM). */
    def getOntapStorageVirtualMachinePlain(args: Endofunction[com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachinePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.fsx.outputs.GetOntapStorageVirtualMachineResult] =
      val argsBuilder = com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachinePlainArgs.builder
      com.pulumi.aws.fsx.FsxFunctions.getOntapStorageVirtualMachinePlain(args(argsBuilder).build)

    /** This resource can be useful for getting back a set of FSx ONTAP Storage Virtual Machine (SVM) IDs. */
    def getOntapStorageVirtualMachines(args: Endofunction[com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachinesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.fsx.outputs.GetOntapStorageVirtualMachinesResult] =
      val argsBuilder = com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachinesArgs.builder
      com.pulumi.aws.fsx.FsxFunctions.getOntapStorageVirtualMachines(args(argsBuilder).build)

    /** This resource can be useful for getting back a set of FSx ONTAP Storage Virtual Machine (SVM) IDs. */
    def getOntapStorageVirtualMachinesPlain(args: Endofunction[com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachinesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.fsx.outputs.GetOntapStorageVirtualMachinesResult] =
      val argsBuilder = com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachinesPlainArgs.builder
      com.pulumi.aws.fsx.FsxFunctions.getOntapStorageVirtualMachinesPlain(args(argsBuilder).build)

    /** Use this data source to get information about an Amazon FSx for OpenZFS Snapshot for use when provisioning new Volumes. */
    def getOpenZfsSnapshot(args: Endofunction[com.pulumi.aws.fsx.inputs.GetOpenZfsSnapshotArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.fsx.outputs.GetOpenZfsSnapshotResult] =
      val argsBuilder = com.pulumi.aws.fsx.inputs.GetOpenZfsSnapshotArgs.builder
      com.pulumi.aws.fsx.FsxFunctions.getOpenZfsSnapshot(args(argsBuilder).build)

    /** Use this data source to get information about an Amazon FSx for OpenZFS Snapshot for use when provisioning new Volumes. */
    def getOpenZfsSnapshotPlain(args: Endofunction[com.pulumi.aws.fsx.inputs.GetOpenZfsSnapshotPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.fsx.outputs.GetOpenZfsSnapshotResult] =
      val argsBuilder = com.pulumi.aws.fsx.inputs.GetOpenZfsSnapshotPlainArgs.builder
      com.pulumi.aws.fsx.FsxFunctions.getOpenZfsSnapshotPlain(args(argsBuilder).build)

    /** Retrieve information on FSx Windows File System. */
    def getWindowsFileSystem(args: Endofunction[com.pulumi.aws.fsx.inputs.GetWindowsFileSystemArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.fsx.outputs.GetWindowsFileSystemResult] =
      val argsBuilder = com.pulumi.aws.fsx.inputs.GetWindowsFileSystemArgs.builder
      com.pulumi.aws.fsx.FsxFunctions.getWindowsFileSystem(args(argsBuilder).build)

    /** Retrieve information on FSx Windows File System. */
    def getWindowsFileSystemPlain(args: Endofunction[com.pulumi.aws.fsx.inputs.GetWindowsFileSystemPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.fsx.outputs.GetWindowsFileSystemResult] =
      val argsBuilder = com.pulumi.aws.fsx.inputs.GetWindowsFileSystemPlainArgs.builder
      com.pulumi.aws.fsx.FsxFunctions.getWindowsFileSystemPlain(args(argsBuilder).build)

  /**
   * Manages an Amazon FSx for OpenZFS volume.
   *  See the [FSx OpenZFS User Guide](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/what-is-fsx.html) for more information.
   */
  def OpenZfsSnapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.OpenZfsSnapshotArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.OpenZfsSnapshotArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.fsx.OpenZfsSnapshot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.fsx.FileCacheArgs.Builder)
    /**
     * @param dataRepositoryAssociations See the `dataRepositoryAssociation` configuration block. Max of 8.
     *  A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation. The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository that supports the NFSv3 protocol. The DRA configurations must meet the following requirements: 1) All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can&#39;t link to different data repository types at the same time. 2) An NFS DRA must link to an NFS file system that supports the NFSv3 protocol. DRA automatic import and automatic export is not supported.
     * @return builder
     */
    def dataRepositoryAssociations(args: Endofunction[com.pulumi.aws.fsx.inputs.FileCacheDataRepositoryAssociationArgs.Builder]*):
        com.pulumi.aws.fsx.FileCacheArgs.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.FileCacheDataRepositoryAssociationArgs.builder
      builder.dataRepositoryAssociations(args.map(_(argsBuilder).build)*)

    /**
     * @param lustreConfigurations See the `lustreConfiguration` block. Required when `fileCacheType` is `LUSTRE`.
     * @return builder
     */
    def lustreConfigurations(args: Endofunction[com.pulumi.aws.fsx.inputs.FileCacheLustreConfigurationArgs.Builder]*):
        com.pulumi.aws.fsx.FileCacheArgs.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.FileCacheLustreConfigurationArgs.builder
      builder.lustreConfigurations(args.map(_(argsBuilder).build)*)

  /**
   * Manages a FSx for Lustre Data Repository Association. See [Linking your file system to an S3 bucket](https://docs.aws.amazon.com/fsx/latest/LustreGuide/create-dra-linked-data-repo.html) for more information.
   *  
   *  &gt; **NOTE:** Data Repository Associations are only compatible with AWS FSx for Lustre File Systems and `PERSISTENT_2` deployment type.
   */
  def DataRepositoryAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.DataRepositoryAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.DataRepositoryAssociationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.fsx.DataRepositoryAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a FSx Windows File System. See the [FSx Windows Guide](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/what-is.html) for more information.
   *  
   *  &gt; **NOTE:** Either the `activeDirectoryId` argument or `selfManagedActiveDirectory` configuration block must be specified.
   */
  def WindowsFileSystem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.WindowsFileSystemArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.WindowsFileSystemArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.fsx.WindowsFileSystem(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.fsx.OpenZfsFileSystemArgs.Builder)
    /**
     * @param diskIopsConfiguration The SSD IOPS configuration for the Amazon FSx for OpenZFS file system. See `diskIopsConfiguration` Block for details.
     * @return builder
     */
    def diskIopsConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.OpenZfsFileSystemDiskIopsConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.OpenZfsFileSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OpenZfsFileSystemDiskIopsConfigurationArgs.builder
      builder.diskIopsConfiguration(args(argsBuilder).build)

    /**
     * @param readCacheConfiguration Configuration block for optional provisioned SSD read cache on file systems that use the Intelligent-Tiering storage class. Required when `storageType` is set to `INTELLIGENT_TIERING`. See `readCacheConfiguration` Block for details.
     * @return builder
     */
    def readCacheConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.OpenZfsFileSystemReadCacheConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.OpenZfsFileSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OpenZfsFileSystemReadCacheConfigurationArgs.builder
      builder.readCacheConfiguration(args(argsBuilder).build)

    /**
     * @param rootVolumeConfiguration The configuration for the root volume of the file system. All other volumes are children or the root volume. See `rootVolumeConfiguration` Block for details.
     * @return builder
     */
    def rootVolumeConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.OpenZfsFileSystemRootVolumeConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.OpenZfsFileSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OpenZfsFileSystemRootVolumeConfigurationArgs.builder
      builder.rootVolumeConfiguration(args(argsBuilder).build)

  /** Manages an Amazon FSx S3 Access Point attachment. */
  def S3AccessPointAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.S3AccessPointAttachmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.S3AccessPointAttachmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.fsx.S3AccessPointAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a FSx ONTAP Volume.
   *  See the [FSx ONTAP User Guide](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-volumes.html) for more information.
   */
  def OntapVolume(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.OntapVolumeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.OntapVolumeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.fsx.OntapVolume(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a FSx Backup resource.
   *  
   *  ## Lustre Example
   *  
   *  <pre>
   *  {@code
   *  package generated_program;
   *  
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.aws.fsx.LustreFileSystem;
   *  import com.pulumi.aws.fsx.LustreFileSystemArgs;
   *  import com.pulumi.aws.fsx.Backup;
   *  import com.pulumi.aws.fsx.BackupArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   *  
   *  public class App {
   *      public static void main(String[] args) {
   *          Pulumi.run(App::stack);
   *      }
   *  
   *      public static void stack(Context ctx) {
   *          var exampleLustreFileSystem = new LustreFileSystem("exampleLustreFileSystem", LustreFileSystemArgs.builder()
   *              .storageCapacity(1200)
   *              .subnetIds(exampleAwsSubnet.id())
   *              .deploymentType("PERSISTENT_1")
   *              .perUnitStorageThroughput(50)
   *              .build());
   *  
   *          var example = new Backup("example", BackupArgs.builder()
   *              .fileSystemId(exampleLustreFileSystem.id())
   *              .build());
   *  
   *      }
   *  }
   *  }
   *  </pre>
   *  
   *  ## Windows Example
   *  
   *  <pre>
   *  {@code
   *  package generated_program;
   *  
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.aws.fsx.WindowsFileSystem;
   *  import com.pulumi.aws.fsx.WindowsFileSystemArgs;
   *  import com.pulumi.aws.fsx.Backup;
   *  import com.pulumi.aws.fsx.BackupArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   *  
   *  public class App {
   *      public static void main(String[] args) {
   *          Pulumi.run(App::stack);
   *      }
   *  
   *      public static void stack(Context ctx) {
   *          var exampleWindowsFileSystem = new WindowsFileSystem("exampleWindowsFileSystem", WindowsFileSystemArgs.builder()
   *              .activeDirectoryId(eample.id())
   *              .skipFinalBackup(true)
   *              .storageCapacity(32)
   *              .subnetIds(example1.id())
   *              .throughputCapacity(8)
   *              .build());
   *  
   *          var example = new Backup("example", BackupArgs.builder()
   *              .fileSystemId(exampleWindowsFileSystem.id())
   *              .build());
   *  
   *      }
   *  }
   *  }
   *  </pre>
   *  
   *  ## ONTAP Example
   *  
   *  <pre>
   *  {@code
   *  package generated_program;
   *  
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.aws.fsx.OntapVolume;
   *  import com.pulumi.aws.fsx.OntapVolumeArgs;
   *  import com.pulumi.aws.fsx.Backup;
   *  import com.pulumi.aws.fsx.BackupArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   *  
   *  public class App {
   *      public static void main(String[] args) {
   *          Pulumi.run(App::stack);
   *      }
   *  
   *      public static void stack(Context ctx) {
   *          var exampleOntapVolume = new OntapVolume("exampleOntapVolume", OntapVolumeArgs.builder()
   *              .name("example")
   *              .junctionPath("/example")
   *              .sizeInMegabytes(1024)
   *              .storageEfficiencyEnabled(true)
   *              .storageVirtualMachineId(test.id())
   *              .build());
   *  
   *          var example = new Backup("example", BackupArgs.builder()
   *              .volumeId(exampleOntapVolume.id())
   *              .build());
   *  
   *      }
   *  }
   *  }
   *  </pre>
   *  
   *  ## OpenZFS Example
   *  
   *  <pre>
   *  {@code
   *  package generated_program;
   *  
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.aws.fsx.OpenZfsFileSystem;
   *  import com.pulumi.aws.fsx.OpenZfsFileSystemArgs;
   *  import com.pulumi.aws.fsx.Backup;
   *  import com.pulumi.aws.fsx.BackupArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   *  
   *  public class App {
   *      public static void main(String[] args) {
   *          Pulumi.run(App::stack);
   *      }
   *  
   *      public static void stack(Context ctx) {
   *          var exampleOpenZfsFileSystem = new OpenZfsFileSystem("exampleOpenZfsFileSystem", OpenZfsFileSystemArgs.builder()
   *              .storageCapacity(64)
   *              .subnetIds(exampleAwsSubnet.id())
   *              .deploymentType("SINGLE_AZ_1")
   *              .throughputCapacity(64)
   *              .build());
   *  
   *          var example = new Backup("example", BackupArgs.builder()
   *              .fileSystemId(exampleOpenZfsFileSystem.id())
   *              .build());
   *  
   *      }
   *  }
   *  }
   *  </pre>
   *  
   *  ## Import
   *  
   *  Using `pulumi import`, import FSx Backups using the `id`. For example:
   *  
   *  ```sh
   *  $ pulumi import aws:fsx/backup:Backup example fs-543ab12b1ca672f33
   *  ```
   */
  def Backup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fsx.BackupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fsx.BackupArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.fsx.Backup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.fsx.WindowsFileSystemArgs.Builder)
    /**
     * @param auditLogConfiguration The configuration that Amazon FSx for Windows File Server uses to audit and log user accesses of files, folders, and file shares on the Amazon FSx for Windows File Server file system. See `auditLogConfiguration` Block for details.
     * @return builder
     */
    def auditLogConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.WindowsFileSystemAuditLogConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.WindowsFileSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.WindowsFileSystemAuditLogConfigurationArgs.builder
      builder.auditLogConfiguration(args(argsBuilder).build)

    /**
     * @param diskIopsConfiguration The SSD IOPS configuration for the Amazon FSx for Windows File Server file system. See `diskIopsConfiguration` Block for details.
     * @return builder
     */
    def diskIopsConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.WindowsFileSystemDiskIopsConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.WindowsFileSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.WindowsFileSystemDiskIopsConfigurationArgs.builder
      builder.diskIopsConfiguration(args(argsBuilder).build)

    /**
     * @param selfManagedActiveDirectory Configuration block that Amazon FSx uses to join the Windows File Server instance to your self-managed (including on-premises) Microsoft Active Directory (AD) directory. Cannot be specified with `activeDirectoryId`. See `selfManagedActiveDirectory` Block for details.
     * @return builder
     */
    def selfManagedActiveDirectory(args: Endofunction[com.pulumi.aws.fsx.inputs.WindowsFileSystemSelfManagedActiveDirectoryArgs.Builder]):
        com.pulumi.aws.fsx.WindowsFileSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.WindowsFileSystemSelfManagedActiveDirectoryArgs.builder
      builder.selfManagedActiveDirectory(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fsx.S3AccessPointAttachmentArgs.Builder)
    /**
     * @param openzfsConfiguration Configuration to use when creating and attaching an S3 access point to an FSx for OpenZFS volume. See `openzfsConfiguration` Block for details.
     * @return builder
     */
    def openzfsConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentOpenzfsConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.S3AccessPointAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentOpenzfsConfigurationArgs.builder
      builder.openzfsConfiguration(args(argsBuilder).build)

    /**
     * @param s3AccessPoint S3 access point configuration. See `s3AccessPoint` Block for details.
     * @return builder
     */
    def s3AccessPoint(args: Endofunction[com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentS3AccessPointArgs.Builder]):
        com.pulumi.aws.fsx.S3AccessPointAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentS3AccessPointArgs.builder
      builder.s3AccessPoint(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentTimeoutsArgs.Builder]):
        com.pulumi.aws.fsx.S3AccessPointAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentS3AccessPointArgs.Builder)
    /**
     * @param vpcConfiguration Amazon S3 restricts access to the S3 access point to requests made from the specified VPC. See `vpcConfiguration` Block for details.
     * @return builder
     */
    def vpcConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentS3AccessPointVpcConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentS3AccessPointArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentS3AccessPointVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fsx.inputs.OntapVolumeSnaplockConfigurationArgs.Builder)
    /**
     * @param autocommitPeriod The configuration object for setting the autocommit period of files in an FSx for ONTAP SnapLock volume. See `autocommitPeriod` Block for details.
     * @return builder
     */
    def autocommitPeriod(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapVolumeSnaplockConfigurationAutocommitPeriodArgs.Builder]):
        com.pulumi.aws.fsx.inputs.OntapVolumeSnaplockConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OntapVolumeSnaplockConfigurationAutocommitPeriodArgs.builder
      builder.autocommitPeriod(args(argsBuilder).build)

    /**
     * @param retentionPeriod The retention period of an FSx for ONTAP SnapLock volume. See `retentionPeriod` Block for details.
     * @return builder
     */
    def retentionPeriod(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapVolumeSnaplockConfigurationRetentionPeriodArgs.Builder]):
        com.pulumi.aws.fsx.inputs.OntapVolumeSnaplockConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OntapVolumeSnaplockConfigurationRetentionPeriodArgs.builder
      builder.retentionPeriod(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentOpenzfsConfigurationArgs.Builder)
    /**
     * @param fileSystemIdentity File system user identity to use for authorizing file read and write requests that are made using the S3 access point. See `fileSystemIdentity` Block for details.
     * @return builder
     */
    def fileSystemIdentity(args: Endofunction[com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentOpenzfsConfigurationFileSystemIdentityArgs.Builder]):
        com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentOpenzfsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentOpenzfsConfigurationFileSystemIdentityArgs.builder
      builder.fileSystemIdentity(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fsx.inputs.WindowsFileSystemState.Builder)
    /**
     * @param auditLogConfiguration The configuration that Amazon FSx for Windows File Server uses to audit and log user accesses of files, folders, and file shares on the Amazon FSx for Windows File Server file system. See `auditLogConfiguration` Block for details.
     * @return builder
     */
    def auditLogConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.WindowsFileSystemAuditLogConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.inputs.WindowsFileSystemState.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.WindowsFileSystemAuditLogConfigurationArgs.builder
      builder.auditLogConfiguration(args(argsBuilder).build)

    /**
     * @param diskIopsConfiguration The SSD IOPS configuration for the Amazon FSx for Windows File Server file system. See `diskIopsConfiguration` Block for details.
     * @return builder
     */
    def diskIopsConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.WindowsFileSystemDiskIopsConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.inputs.WindowsFileSystemState.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.WindowsFileSystemDiskIopsConfigurationArgs.builder
      builder.diskIopsConfiguration(args(argsBuilder).build)

    /**
     * @param selfManagedActiveDirectory Configuration block that Amazon FSx uses to join the Windows File Server instance to your self-managed (including on-premises) Microsoft Active Directory (AD) directory. Cannot be specified with `activeDirectoryId`. See `selfManagedActiveDirectory` Block for details.
     * @return builder
     */
    def selfManagedActiveDirectory(args: Endofunction[com.pulumi.aws.fsx.inputs.WindowsFileSystemSelfManagedActiveDirectoryArgs.Builder]):
        com.pulumi.aws.fsx.inputs.WindowsFileSystemState.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.WindowsFileSystemSelfManagedActiveDirectoryArgs.builder
      builder.selfManagedActiveDirectory(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fsx.inputs.DataRepositoryAssociationS3Args.Builder)
    /**
     * @param autoExportPolicy Specifies the type of updated objects that will be automatically exported from your file system to the linked S3 bucket. See the `events` configuration block.
     * @return builder
     */
    def autoExportPolicy(args: Endofunction[com.pulumi.aws.fsx.inputs.DataRepositoryAssociationS3AutoExportPolicyArgs.Builder]):
        com.pulumi.aws.fsx.inputs.DataRepositoryAssociationS3Args.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.DataRepositoryAssociationS3AutoExportPolicyArgs.builder
      builder.autoExportPolicy(args(argsBuilder).build)

    /**
     * @param autoImportPolicy Specifies the type of updated objects that will be automatically imported from the linked S3 bucket to your file system. See the `events` configuration block.
     * @return builder
     */
    def autoImportPolicy(args: Endofunction[com.pulumi.aws.fsx.inputs.DataRepositoryAssociationS3AutoImportPolicyArgs.Builder]):
        com.pulumi.aws.fsx.inputs.DataRepositoryAssociationS3Args.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.DataRepositoryAssociationS3AutoImportPolicyArgs.builder
      builder.autoImportPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachinesArgs.Builder)
    /**
     * @param filters Configuration block. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachinesFilterArgs.Builder]*):
        com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachinesArgs.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachinesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fsx.inputs.OpenZfsVolumeNfsExportsArgs.Builder)
    /**
     * @param clientConfigurations A list of configuration objects that contain the client and options for mounting the OpenZFS file system. Maximum of 25 items. See `clientConfigurations` Block below for details.
     * @return builder
     */
    def clientConfigurations(args: Endofunction[com.pulumi.aws.fsx.inputs.OpenZfsVolumeNfsExportsClientConfigurationArgs.Builder]*):
        com.pulumi.aws.fsx.inputs.OpenZfsVolumeNfsExportsArgs.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.OpenZfsVolumeNfsExportsClientConfigurationArgs.builder
      builder.clientConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineState.Builder)
    /**
     * @param activeDirectoryConfiguration Configuration block that Amazon FSx uses to join the FSx ONTAP Storage Virtual Machine(SVM) to your Microsoft Active Directory (AD) directory. Detailed below.
     * @return builder
     */
    def activeDirectoryConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineActiveDirectoryConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineActiveDirectoryConfigurationArgs.builder
      builder.activeDirectoryConfiguration(args(argsBuilder).build)

    /**
     * @param endpoints The endpoints that are used to access data or to manage the storage virtual machine using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror. See Endpoints below.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointArgs.Builder]*):
        com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineState.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachineArgs.Builder)
    /**
     * @param filters Configuration block. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachineFilterArgs.Builder]*):
        com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.GetOntapStorageVirtualMachineFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fsx.inputs.LustreFileSystemState.Builder)
    def dataReadCacheConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.LustreFileSystemDataReadCacheConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.inputs.LustreFileSystemState.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.LustreFileSystemDataReadCacheConfigurationArgs.builder
      builder.dataReadCacheConfiguration(args(argsBuilder).build)

    /**
     * @param logConfiguration The Lustre logging configuration used when creating an Amazon FSx for Lustre file system. When logging is enabled, Lustre logs error and warning events for data repositories associated with your file system to Amazon CloudWatch Logs. See `logConfiguration` Block for details.
     * @return builder
     */
    def logConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.LustreFileSystemLogConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.inputs.LustreFileSystemState.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.LustreFileSystemLogConfigurationArgs.builder
      builder.logConfiguration(args(argsBuilder).build)

    /**
     * @param metadataConfiguration The Lustre metadata configuration used when creating an Amazon FSx for Lustre file system. This can be used to specify a user provisioned metadata scale. This is only supported when `deploymentType` is set to `PERSISTENT_2`. See `metadataConfiguration` Block for details.
     * @return builder
     */
    def metadataConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.LustreFileSystemMetadataConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.inputs.LustreFileSystemState.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.LustreFileSystemMetadataConfigurationArgs.builder
      builder.metadataConfiguration(args(argsBuilder).build)

    /**
     * @param rootSquashConfiguration The Lustre root squash configuration used when creating an Amazon FSx for Lustre file system. When enabled, root squash restricts root-level access from clients that try to access your file system as a root user. See `rootSquashConfiguration` Block for details.
     * @return builder
     */
    def rootSquashConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.LustreFileSystemRootSquashConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.inputs.LustreFileSystemState.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.LustreFileSystemRootSquashConfigurationArgs.builder
      builder.rootSquashConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fsx.inputs.OntapFileSystemEndpointArgs.Builder)
    /**
     * @param interclusters An endpoint for managing your file system by setting up NetApp SnapMirror with other ONTAP systems. See Endpoint.
     * @return builder
     */
    def interclusters(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapFileSystemEndpointInterclusterArgs.Builder]*):
        com.pulumi.aws.fsx.inputs.OntapFileSystemEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.OntapFileSystemEndpointInterclusterArgs.builder
      builder.interclusters(args.map(_(argsBuilder).build)*)

    /**
     * @param managements An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API. See Endpoint.
     * @return builder
     */
    def managements(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapFileSystemEndpointManagementArgs.Builder]*):
        com.pulumi.aws.fsx.inputs.OntapFileSystemEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.OntapFileSystemEndpointManagementArgs.builder
      builder.managements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineActiveDirectoryConfigurationArgs.Builder)
    def selfManagedActiveDirectoryConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineActiveDirectoryConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfigurationArgs.builder
      builder.selfManagedActiveDirectoryConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointArgs.Builder)
    /**
     * @param iscsis An endpoint for accessing data on your storage virtual machine via iSCSI protocol. See Endpoint.
     * @return builder
     */
    def iscsis(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointIscsiArgs.Builder]*):
        com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointIscsiArgs.builder
      builder.iscsis(args.map(_(argsBuilder).build)*)

    /**
     * @param managements An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API. See Endpoint.
     * @return builder
     */
    def managements(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointManagementArgs.Builder]*):
        com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointManagementArgs.builder
      builder.managements(args.map(_(argsBuilder).build)*)

    /**
     * @param nfs An endpoint for accessing data on your storage virtual machine via NFS protocol. See Endpoint.
     * @return builder
     */
    def nfs(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointNfArgs.Builder]*):
        com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointNfArgs.builder
      builder.nfs(args.map(_(argsBuilder).build)*)

    /**
     * @param smbs An endpoint for accessing data on your storage virtual machine via SMB protocol. This is only set if an activeDirectoryConfiguration has been set. See Endpoint.
     * @return builder
     */
    def smbs(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointSmbArgs.Builder]*):
        com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointSmbArgs.builder
      builder.smbs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentOpenzfsConfigurationFileSystemIdentityArgs.Builder)
    /**
     * @param posixUser UID and GIDs of the file system POSIX user. See `posixUser` Block for details.
     * @return builder
     */
    def posixUser(args: Endofunction[com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentOpenzfsConfigurationFileSystemIdentityPosixUserArgs.Builder]):
        com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentOpenzfsConfigurationFileSystemIdentityArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentOpenzfsConfigurationFileSystemIdentityPosixUserArgs.builder
      builder.posixUser(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fsx.inputs.OpenZfsFileSystemRootVolumeConfigurationArgs.Builder)
    /**
     * @param nfsExports NFS export configuration for the root volume. Exactly 1 item. See `nfsExports` Block for details.
     * @return builder
     */
    def nfsExports(args: Endofunction[com.pulumi.aws.fsx.inputs.OpenZfsFileSystemRootVolumeConfigurationNfsExportsArgs.Builder]):
        com.pulumi.aws.fsx.inputs.OpenZfsFileSystemRootVolumeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OpenZfsFileSystemRootVolumeConfigurationNfsExportsArgs.builder
      builder.nfsExports(args(argsBuilder).build)

    /**
     * @param userAndGroupQuotas Specify how much storage users or groups can use on the volume. Maximum of 100 items. See `userAndGroupQuotas` Block for details.
     * @return builder
     */
    def userAndGroupQuotas(args: Endofunction[com.pulumi.aws.fsx.inputs.OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuotaArgs.Builder]*):
        com.pulumi.aws.fsx.inputs.OpenZfsFileSystemRootVolumeConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuotaArgs.builder
      builder.userAndGroupQuotas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fsx.inputs.OntapVolumeSnaplockConfigurationRetentionPeriodArgs.Builder)
    /**
     * @param defaultRetention The retention period assigned to a write once, read many (WORM) file by default if an explicit retention period is not set for an FSx for ONTAP SnapLock volume. The default retention period must be greater than or equal to the minimum retention period and less than or equal to the maximum retention period. See `defaultRetention` Block for details.
     * @return builder
     */
    def defaultRetention(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapVolumeSnaplockConfigurationRetentionPeriodDefaultRetentionArgs.Builder]):
        com.pulumi.aws.fsx.inputs.OntapVolumeSnaplockConfigurationRetentionPeriodArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OntapVolumeSnaplockConfigurationRetentionPeriodDefaultRetentionArgs.builder
      builder.defaultRetention(args(argsBuilder).build)

    /**
     * @param maximumRetention The longest retention period that can be assigned to a WORM file on an FSx for ONTAP SnapLock volume. See `maximumRetention` Block for details.
     * @return builder
     */
    def maximumRetention(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapVolumeSnaplockConfigurationRetentionPeriodMaximumRetentionArgs.Builder]):
        com.pulumi.aws.fsx.inputs.OntapVolumeSnaplockConfigurationRetentionPeriodArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OntapVolumeSnaplockConfigurationRetentionPeriodMaximumRetentionArgs.builder
      builder.maximumRetention(args(argsBuilder).build)

    /**
     * @param minimumRetention The shortest retention period that can be assigned to a WORM file on an FSx for ONTAP SnapLock volume. See `minimumRetention` Block for details.
     * @return builder
     */
    def minimumRetention(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapVolumeSnaplockConfigurationRetentionPeriodMinimumRetentionArgs.Builder]):
        com.pulumi.aws.fsx.inputs.OntapVolumeSnaplockConfigurationRetentionPeriodArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OntapVolumeSnaplockConfigurationRetentionPeriodMinimumRetentionArgs.builder
      builder.minimumRetention(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentState.Builder)
    /**
     * @param openzfsConfiguration Configuration to use when creating and attaching an S3 access point to an FSx for OpenZFS volume. See `openzfsConfiguration` Block for details.
     * @return builder
     */
    def openzfsConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentOpenzfsConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentState.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentOpenzfsConfigurationArgs.builder
      builder.openzfsConfiguration(args(argsBuilder).build)

    /**
     * @param s3AccessPoint S3 access point configuration. See `s3AccessPoint` Block for details.
     * @return builder
     */
    def s3AccessPoint(args: Endofunction[com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentS3AccessPointArgs.Builder]):
        com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentState.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentS3AccessPointArgs.builder
      builder.s3AccessPoint(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentTimeoutsArgs.Builder]):
        com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentState.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.S3AccessPointAttachmentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fsx.inputs.DataRepositoryAssociationState.Builder)
    /**
     * @param s3 See the `s3` configuration block. Max of 1.
     *  The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system with a data repository association. The configuration defines which file events (new, changed, or deleted files or directories) are automatically imported from the linked data repository to the file system or automatically exported from the file system to the data repository.
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.fsx.inputs.DataRepositoryAssociationS3Args.Builder]):
        com.pulumi.aws.fsx.inputs.DataRepositoryAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.DataRepositoryAssociationS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fsx.inputs.OpenZfsFileSystemRootVolumeConfigurationNfsExportsArgs.Builder)
    /**
     * @param clientConfigurations A list of configuration objects that contain the client and options for mounting the OpenZFS file system. Maximum of 25 items. See `clientConfigurations` Block for details.
     * @return builder
     */
    def clientConfigurations(args: Endofunction[com.pulumi.aws.fsx.inputs.OpenZfsFileSystemRootVolumeConfigurationNfsExportsClientConfigurationArgs.Builder]*):
        com.pulumi.aws.fsx.inputs.OpenZfsFileSystemRootVolumeConfigurationNfsExportsArgs.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.OpenZfsFileSystemRootVolumeConfigurationNfsExportsClientConfigurationArgs.builder
      builder.clientConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fsx.inputs.FileCacheState.Builder)
    /**
     * @param dataRepositoryAssociations See the `dataRepositoryAssociation` configuration block. Max of 8.
     *  A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation. The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository that supports the NFSv3 protocol. The DRA configurations must meet the following requirements: 1) All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can&#39;t link to different data repository types at the same time. 2) An NFS DRA must link to an NFS file system that supports the NFSv3 protocol. DRA automatic import and automatic export is not supported.
     * @return builder
     */
    def dataRepositoryAssociations(args: Endofunction[com.pulumi.aws.fsx.inputs.FileCacheDataRepositoryAssociationArgs.Builder]*):
        com.pulumi.aws.fsx.inputs.FileCacheState.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.FileCacheDataRepositoryAssociationArgs.builder
      builder.dataRepositoryAssociations(args.map(_(argsBuilder).build)*)

    /**
     * @param lustreConfigurations See the `lustreConfiguration` block. Required when `fileCacheType` is `LUSTRE`.
     * @return builder
     */
    def lustreConfigurations(args: Endofunction[com.pulumi.aws.fsx.inputs.FileCacheLustreConfigurationArgs.Builder]*):
        com.pulumi.aws.fsx.inputs.FileCacheState.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.FileCacheLustreConfigurationArgs.builder
      builder.lustreConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fsx.inputs.OpenZfsFileSystemState.Builder)
    /**
     * @param diskIopsConfiguration The SSD IOPS configuration for the Amazon FSx for OpenZFS file system. See `diskIopsConfiguration` Block for details.
     * @return builder
     */
    def diskIopsConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.OpenZfsFileSystemDiskIopsConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.inputs.OpenZfsFileSystemState.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OpenZfsFileSystemDiskIopsConfigurationArgs.builder
      builder.diskIopsConfiguration(args(argsBuilder).build)

    /**
     * @param readCacheConfiguration Configuration block for optional provisioned SSD read cache on file systems that use the Intelligent-Tiering storage class. Required when `storageType` is set to `INTELLIGENT_TIERING`. See `readCacheConfiguration` Block for details.
     * @return builder
     */
    def readCacheConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.OpenZfsFileSystemReadCacheConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.inputs.OpenZfsFileSystemState.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OpenZfsFileSystemReadCacheConfigurationArgs.builder
      builder.readCacheConfiguration(args(argsBuilder).build)

    /**
     * @param rootVolumeConfiguration The configuration for the root volume of the file system. All other volumes are children or the root volume. See `rootVolumeConfiguration` Block for details.
     * @return builder
     */
    def rootVolumeConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.OpenZfsFileSystemRootVolumeConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.inputs.OpenZfsFileSystemState.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OpenZfsFileSystemRootVolumeConfigurationArgs.builder
      builder.rootVolumeConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fsx.inputs.FileCacheLustreConfigurationArgs.Builder)
    def logConfigurations(args: Endofunction[com.pulumi.aws.fsx.inputs.FileCacheLustreConfigurationLogConfigurationArgs.Builder]*):
        com.pulumi.aws.fsx.inputs.FileCacheLustreConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.FileCacheLustreConfigurationLogConfigurationArgs.builder
      builder.logConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param metadataConfigurations The configuration for a Lustre MDT (Metadata Target) storage volume. See the `metadataConfiguration` block.
     * @return builder
     */
    def metadataConfigurations(args: Endofunction[com.pulumi.aws.fsx.inputs.FileCacheLustreConfigurationMetadataConfigurationArgs.Builder]*):
        com.pulumi.aws.fsx.inputs.FileCacheLustreConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.FileCacheLustreConfigurationMetadataConfigurationArgs.builder
      builder.metadataConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fsx.inputs.OntapVolumeState.Builder)
    /**
     * @param aggregateConfiguration The Aggregate configuration only applies to `FLEXGROUP` volumes. See [`aggregateConfiguration` Block] for details.
     * @return builder
     */
    def aggregateConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapVolumeAggregateConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.inputs.OntapVolumeState.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OntapVolumeAggregateConfigurationArgs.builder
      builder.aggregateConfiguration(args(argsBuilder).build)

    /**
     * @param snaplockConfiguration The SnapLock configuration for an FSx for ONTAP volume. See `snaplockConfiguration` Block for details.
     * @return builder
     */
    def snaplockConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapVolumeSnaplockConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.inputs.OntapVolumeState.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OntapVolumeSnaplockConfigurationArgs.builder
      builder.snaplockConfiguration(args(argsBuilder).build)

    /**
     * @param tieringPolicy The data tiering policy for an FSx for ONTAP volume. See `tieringPolicy` Block for details.
     * @return builder
     */
    def tieringPolicy(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapVolumeTieringPolicyArgs.Builder]):
        com.pulumi.aws.fsx.inputs.OntapVolumeState.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OntapVolumeTieringPolicyArgs.builder
      builder.tieringPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fsx.inputs.OntapFileSystemState.Builder)
    /**
     * @param diskIopsConfiguration The SSD IOPS configuration for the Amazon FSx for NetApp ONTAP file system. See Disk Iops Configuration below.
     * @return builder
     */
    def diskIopsConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapFileSystemDiskIopsConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.inputs.OntapFileSystemState.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OntapFileSystemDiskIopsConfigurationArgs.builder
      builder.diskIopsConfiguration(args(argsBuilder).build)

    /**
     * @param endpoints The endpoints that are used to access data or to manage the file system using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror. See Endpoints below.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapFileSystemEndpointArgs.Builder]*):
        com.pulumi.aws.fsx.inputs.OntapFileSystemState.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.OntapFileSystemEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fsx.inputs.FileCacheDataRepositoryAssociationArgs.Builder)
    /**
     * @param nfs (Optional) See the `nfs` configuration block.
     * @return builder
     */
    def nfs(args: Endofunction[com.pulumi.aws.fsx.inputs.FileCacheDataRepositoryAssociationNfArgs.Builder]*):
        com.pulumi.aws.fsx.inputs.FileCacheDataRepositoryAssociationArgs.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.FileCacheDataRepositoryAssociationNfArgs.builder
      builder.nfs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fsx.inputs.OpenZfsVolumeState.Builder)
    /**
     * @param nfsExports NFS export configuration for the root volume. Exactly 1 item. See `nfsExports` Block Below for details.
     * @return builder
     */
    def nfsExports(args: Endofunction[com.pulumi.aws.fsx.inputs.OpenZfsVolumeNfsExportsArgs.Builder]):
        com.pulumi.aws.fsx.inputs.OpenZfsVolumeState.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OpenZfsVolumeNfsExportsArgs.builder
      builder.nfsExports(args(argsBuilder).build)

    /**
     * @param originSnapshot Specifies the configuration to use when creating the OpenZFS volume. See `originSnapshot` Block below for details.
     * @return builder
     */
    def originSnapshot(args: Endofunction[com.pulumi.aws.fsx.inputs.OpenZfsVolumeOriginSnapshotArgs.Builder]):
        com.pulumi.aws.fsx.inputs.OpenZfsVolumeState.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OpenZfsVolumeOriginSnapshotArgs.builder
      builder.originSnapshot(args(argsBuilder).build)

    /**
     * @param userAndGroupQuotas Specify how much storage users or groups can use on the volume. Maximum number of items defined by [FSx for OpenZFS Resource quota](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/limits.html#limits-openzfs-resources-file-system). See `userAndGroupQuotas` Block Below.
     * @return builder
     */
    def userAndGroupQuotas(args: Endofunction[com.pulumi.aws.fsx.inputs.OpenZfsVolumeUserAndGroupQuotaArgs.Builder]*):
        com.pulumi.aws.fsx.inputs.OpenZfsVolumeState.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.OpenZfsVolumeUserAndGroupQuotaArgs.builder
      builder.userAndGroupQuotas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fsx.inputs.GetOpenZfsSnapshotArgs.Builder)
    /**
     * @param filters One or more name/value pairs to filter off of. The
     *  supported names are file-system-id or volume-id.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.fsx.inputs.GetOpenZfsSnapshotFilterArgs.Builder]*):
        com.pulumi.aws.fsx.inputs.GetOpenZfsSnapshotArgs.Builder =
      def argsBuilder = com.pulumi.aws.fsx.inputs.GetOpenZfsSnapshotFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fsx.DataRepositoryAssociationArgs.Builder)
    /**
     * @param s3 See the `s3` configuration block. Max of 1.
     *  The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system with a data repository association. The configuration defines which file events (new, changed, or deleted files or directories) are automatically imported from the linked data repository to the file system or automatically exported from the file system to the data repository.
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.fsx.inputs.DataRepositoryAssociationS3Args.Builder]):
        com.pulumi.aws.fsx.DataRepositoryAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.DataRepositoryAssociationS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fsx.OntapFileSystemArgs.Builder)
    /**
     * @param diskIopsConfiguration The SSD IOPS configuration for the Amazon FSx for NetApp ONTAP file system. See Disk Iops Configuration below.
     * @return builder
     */
    def diskIopsConfiguration(args: Endofunction[com.pulumi.aws.fsx.inputs.OntapFileSystemDiskIopsConfigurationArgs.Builder]):
        com.pulumi.aws.fsx.OntapFileSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.fsx.inputs.OntapFileSystemDiskIopsConfigurationArgs.builder
      builder.diskIopsConfiguration(args(argsBuilder).build)
