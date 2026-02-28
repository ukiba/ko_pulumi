package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object efs:
  /** Provides an Elastic File System (EFS) access point. */
  def AccessPoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.efs.AccessPointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.efs.AccessPointArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.efs.AccessPoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.efs.AccessPointArgs.Builder)
    /**
     * @param posixUser Operating system user and group applied to all file system requests made using the access point. Detailed below.
     * @return builder
     */
    def posixUser(args: Endofunction[com.pulumi.aws.efs.inputs.AccessPointPosixUserArgs.Builder]):
        com.pulumi.aws.efs.AccessPointArgs.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.AccessPointPosixUserArgs.builder
      builder.posixUser(args(argsBuilder).build)

    /**
     * @param rootDirectory Directory on the Amazon EFS file system that the access point provides access to. Detailed below.
     * @return builder
     */
    def rootDirectory(args: Endofunction[com.pulumi.aws.efs.inputs.AccessPointRootDirectoryArgs.Builder]):
        com.pulumi.aws.efs.AccessPointArgs.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.AccessPointRootDirectoryArgs.builder
      builder.rootDirectory(args(argsBuilder).build)

  /** Provides an Elastic File System (EFS) File System resource. */
  def FileSystem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.efs.FileSystemArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.efs.FileSystemArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.efs.FileSystem(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type EfsFunctions = com.pulumi.aws.efs.EfsFunctions
  object EfsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.efs.EfsFunctions.*
  extension (self: EfsFunctions.type)
    /** Provides information about an Elastic File System (EFS) Access Point. */
    def getAccessPoint(args: Endofunction[com.pulumi.aws.efs.inputs.GetAccessPointArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.efs.outputs.GetAccessPointResult] =
      val argsBuilder = com.pulumi.aws.efs.inputs.GetAccessPointArgs.builder
      com.pulumi.aws.efs.EfsFunctions.getAccessPoint(args(argsBuilder).build)

    /** Provides information about an Elastic File System (EFS) Access Point. */
    def getAccessPointPlain(args: Endofunction[com.pulumi.aws.efs.inputs.GetAccessPointPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.efs.outputs.GetAccessPointResult] =
      val argsBuilder = com.pulumi.aws.efs.inputs.GetAccessPointPlainArgs.builder
      com.pulumi.aws.efs.EfsFunctions.getAccessPointPlain(args(argsBuilder).build)

    /** Provides information about multiple Elastic File System (EFS) Access Points. */
    def getAccessPoints(args: Endofunction[com.pulumi.aws.efs.inputs.GetAccessPointsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.efs.outputs.GetAccessPointsResult] =
      val argsBuilder = com.pulumi.aws.efs.inputs.GetAccessPointsArgs.builder
      com.pulumi.aws.efs.EfsFunctions.getAccessPoints(args(argsBuilder).build)

    /** Provides information about multiple Elastic File System (EFS) Access Points. */
    def getAccessPointsPlain(args: Endofunction[com.pulumi.aws.efs.inputs.GetAccessPointsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.efs.outputs.GetAccessPointsResult] =
      val argsBuilder = com.pulumi.aws.efs.inputs.GetAccessPointsPlainArgs.builder
      com.pulumi.aws.efs.EfsFunctions.getAccessPointsPlain(args(argsBuilder).build)

    /** Provides information about an Elastic File System (EFS) File System. */
    def getFileSystem(args: Endofunction[com.pulumi.aws.efs.inputs.GetFileSystemArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.efs.outputs.GetFileSystemResult] =
      val argsBuilder = com.pulumi.aws.efs.inputs.GetFileSystemArgs.builder
      com.pulumi.aws.efs.EfsFunctions.getFileSystem(args(argsBuilder).build)

    /** Provides information about an Elastic File System (EFS) File System. */
    def getFileSystemPlain(args: Endofunction[com.pulumi.aws.efs.inputs.GetFileSystemPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.efs.outputs.GetFileSystemResult] =
      val argsBuilder = com.pulumi.aws.efs.inputs.GetFileSystemPlainArgs.builder
      com.pulumi.aws.efs.EfsFunctions.getFileSystemPlain(args(argsBuilder).build)

    /** Provides information about an Elastic File System Mount Target (EFS). */
    def getMountTarget(args: Endofunction[com.pulumi.aws.efs.inputs.GetMountTargetArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.efs.outputs.GetMountTargetResult] =
      val argsBuilder = com.pulumi.aws.efs.inputs.GetMountTargetArgs.builder
      com.pulumi.aws.efs.EfsFunctions.getMountTarget(args(argsBuilder).build)

    /** Provides information about an Elastic File System Mount Target (EFS). */
    def getMountTargetPlain(args: Endofunction[com.pulumi.aws.efs.inputs.GetMountTargetPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.efs.outputs.GetMountTargetResult] =
      val argsBuilder = com.pulumi.aws.efs.inputs.GetMountTargetPlainArgs.builder
      com.pulumi.aws.efs.EfsFunctions.getMountTargetPlain(args(argsBuilder).build)

  /** Provides an Elastic File System (EFS) File System Policy resource. */
  def FileSystemPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.efs.FileSystemPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.efs.FileSystemPolicyArgs.builder
    
    com.pulumi.aws.efs.FileSystemPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Elastic File System (EFS) Backup Policy resource.
   *  Backup policies turn automatic backups on or off for an existing file system.
   */
  def BackupPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.efs.BackupPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.efs.BackupPolicyArgs.builder
    
    com.pulumi.aws.efs.BackupPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.efs.BackupPolicyArgs.Builder)
    /**
     * @param backupPolicy A backupPolicy object (documented below).
     * @return builder
     */
    def backupPolicy(args: Endofunction[com.pulumi.aws.efs.inputs.BackupPolicyBackupPolicyArgs.Builder]):
        com.pulumi.aws.efs.BackupPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.BackupPolicyBackupPolicyArgs.builder
      builder.backupPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.efs.FileSystemArgs.Builder)
    /**
     * @param lifecyclePolicies A file system [lifecycle policy](https://docs.aws.amazon.com/efs/latest/ug/API_LifecyclePolicy.html) object. See `lifecyclePolicy` block below for details.
     * @return builder
     */
    def lifecyclePolicies(args: Endofunction[com.pulumi.aws.efs.inputs.FileSystemLifecyclePolicyArgs.Builder]*):
        com.pulumi.aws.efs.FileSystemArgs.Builder =
      def argsBuilder = com.pulumi.aws.efs.inputs.FileSystemLifecyclePolicyArgs.builder
      builder.lifecyclePolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param protection A file system [protection](https://docs.aws.amazon.com/efs/latest/ug/API_FileSystemProtectionDescription.html) object. See `protection` block below for details.
     * @return builder
     */
    def protection(args: Endofunction[com.pulumi.aws.efs.inputs.FileSystemProtectionArgs.Builder]):
        com.pulumi.aws.efs.FileSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.FileSystemProtectionArgs.builder
      builder.protection(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.efs.ReplicationConfigurationArgs.Builder)
    /**
     * @param destination A destination configuration block (documented below).
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.aws.efs.inputs.ReplicationConfigurationDestinationArgs.Builder]):
        com.pulumi.aws.efs.ReplicationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.ReplicationConfigurationDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

  /**
   * Creates a replica of an existing EFS file system in the same or another region. Creating this resource causes the source EFS file system to be replicated to a new read-only destination EFS file system (unless using the `destination.file_system_id` attribute). Deleting this resource will cause the replication from source to destination to stop and the destination file system will no longer be read only.
   *  
   *  &gt; **NOTE:** Deleting this resource does **not** delete the destination file system that was created.
   */
  def ReplicationConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.efs.ReplicationConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.efs.ReplicationConfigurationArgs.builder
    
    com.pulumi.aws.efs.ReplicationConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an Elastic File System (EFS) mount target. */
  def MountTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.efs.MountTargetArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.efs.MountTargetArgs.builder
    
    com.pulumi.aws.efs.MountTarget(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.efs.inputs.AccessPointState.Builder)
    /**
     * @param posixUser Operating system user and group applied to all file system requests made using the access point. Detailed below.
     * @return builder
     */
    def posixUser(args: Endofunction[com.pulumi.aws.efs.inputs.AccessPointPosixUserArgs.Builder]):
        com.pulumi.aws.efs.inputs.AccessPointState.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.AccessPointPosixUserArgs.builder
      builder.posixUser(args(argsBuilder).build)

    /**
     * @param rootDirectory Directory on the Amazon EFS file system that the access point provides access to. Detailed below.
     * @return builder
     */
    def rootDirectory(args: Endofunction[com.pulumi.aws.efs.inputs.AccessPointRootDirectoryArgs.Builder]):
        com.pulumi.aws.efs.inputs.AccessPointState.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.AccessPointRootDirectoryArgs.builder
      builder.rootDirectory(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.efs.inputs.BackupPolicyState.Builder)
    /**
     * @param backupPolicy A backupPolicy object (documented below).
     * @return builder
     */
    def backupPolicy(args: Endofunction[com.pulumi.aws.efs.inputs.BackupPolicyBackupPolicyArgs.Builder]):
        com.pulumi.aws.efs.inputs.BackupPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.BackupPolicyBackupPolicyArgs.builder
      builder.backupPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.efs.inputs.ReplicationConfigurationState.Builder)
    /**
     * @param destination A destination configuration block (documented below).
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.aws.efs.inputs.ReplicationConfigurationDestinationArgs.Builder]):
        com.pulumi.aws.efs.inputs.ReplicationConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.ReplicationConfigurationDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.efs.inputs.AccessPointRootDirectoryArgs.Builder)
    /**
     * @param creationInfo POSIX IDs and permissions to apply to the access point&#39;s Root Directory. See Creation Info below.
     * @return builder
     */
    def creationInfo(args: Endofunction[com.pulumi.aws.efs.inputs.AccessPointRootDirectoryCreationInfoArgs.Builder]):
        com.pulumi.aws.efs.inputs.AccessPointRootDirectoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.AccessPointRootDirectoryCreationInfoArgs.builder
      builder.creationInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.efs.inputs.FileSystemState.Builder)
    /**
     * @param lifecyclePolicies A file system [lifecycle policy](https://docs.aws.amazon.com/efs/latest/ug/API_LifecyclePolicy.html) object. See `lifecyclePolicy` block below for details.
     * @return builder
     */
    def lifecyclePolicies(args: Endofunction[com.pulumi.aws.efs.inputs.FileSystemLifecyclePolicyArgs.Builder]*):
        com.pulumi.aws.efs.inputs.FileSystemState.Builder =
      def argsBuilder = com.pulumi.aws.efs.inputs.FileSystemLifecyclePolicyArgs.builder
      builder.lifecyclePolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param protection A file system [protection](https://docs.aws.amazon.com/efs/latest/ug/API_FileSystemProtectionDescription.html) object. See `protection` block below for details.
     * @return builder
     */
    def protection(args: Endofunction[com.pulumi.aws.efs.inputs.FileSystemProtectionArgs.Builder]):
        com.pulumi.aws.efs.inputs.FileSystemState.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.FileSystemProtectionArgs.builder
      builder.protection(args(argsBuilder).build)

    /**
     * @param sizeInBytes The latest known metered size (in bytes) of data stored in the file system, the value is not the exact size that the file system was at any point in time. See Size In Bytes.
     * @return builder
     */
    def sizeInBytes(args: Endofunction[com.pulumi.aws.efs.inputs.FileSystemSizeInByteArgs.Builder]*):
        com.pulumi.aws.efs.inputs.FileSystemState.Builder =
      def argsBuilder = com.pulumi.aws.efs.inputs.FileSystemSizeInByteArgs.builder
      builder.sizeInBytes(args.map(_(argsBuilder).build)*)
