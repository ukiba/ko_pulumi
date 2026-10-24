package jp.ukiba.ko_pulumi
package aws

object efs_ext:
  extension (builder: com.pulumi.aws.efs.AccessPointArgs.Builder)
    /**
     * @param posixUser Operating system user and group applied to all file system requests made using the access point. Detailed below.
     * @return builder
     */
    inline def posixUser(args: Endofunction[com.pulumi.aws.efs.inputs.AccessPointPosixUserArgs.Builder]):
        com.pulumi.aws.efs.AccessPointArgs.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.AccessPointPosixUserArgs.builder
      builder.posixUser(args(argsBuilder).build)

    /**
     * @param rootDirectory Directory on the Amazon EFS file system that the access point provides access to. Detailed below.
     * @return builder
     */
    inline def rootDirectory(args: Endofunction[com.pulumi.aws.efs.inputs.AccessPointRootDirectoryArgs.Builder]):
        com.pulumi.aws.efs.AccessPointArgs.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.AccessPointRootDirectoryArgs.builder
      builder.rootDirectory(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.efs.BackupPolicyArgs.Builder)
    /**
     * @param backupPolicy A backupPolicy object (documented below).
     * @return builder
     */
    inline def backupPolicy(args: Endofunction[com.pulumi.aws.efs.inputs.BackupPolicyBackupPolicyArgs.Builder]):
        com.pulumi.aws.efs.BackupPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.BackupPolicyBackupPolicyArgs.builder
      builder.backupPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.efs.FileSystemArgs.Builder)
    /**
     * @param lifecyclePolicies A file system [lifecycle policy](https://docs.aws.amazon.com/efs/latest/ug/API_LifecyclePolicy.html) object. See `lifecyclePolicy` block below for details.
     * @return builder
     */
    inline def lifecyclePolicies(args: Endofunction[com.pulumi.aws.efs.inputs.FileSystemLifecyclePolicyArgs.Builder]*):
        com.pulumi.aws.efs.FileSystemArgs.Builder =
      def argsBuilder = com.pulumi.aws.efs.inputs.FileSystemLifecyclePolicyArgs.builder
      builder.lifecyclePolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param protection A file system [protection](https://docs.aws.amazon.com/efs/latest/ug/API_FileSystemProtectionDescription.html) object. See `protection` block below for details.
     * @return builder
     */
    inline def protection(args: Endofunction[com.pulumi.aws.efs.inputs.FileSystemProtectionArgs.Builder]):
        com.pulumi.aws.efs.FileSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.FileSystemProtectionArgs.builder
      builder.protection(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.efs.ReplicationConfigurationArgs.Builder)
    /**
     * @param destination A destination configuration block (documented below).
     * @return builder
     */
    inline def destination(args: Endofunction[com.pulumi.aws.efs.inputs.ReplicationConfigurationDestinationArgs.Builder]):
        com.pulumi.aws.efs.ReplicationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.ReplicationConfigurationDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.efs.inputs.AccessPointRootDirectoryArgs.Builder)
    /**
     * @param creationInfo POSIX IDs and permissions to apply to the access point&#39;s Root Directory. See Creation Info below.
     * @return builder
     */
    inline def creationInfo(args: Endofunction[com.pulumi.aws.efs.inputs.AccessPointRootDirectoryCreationInfoArgs.Builder]):
        com.pulumi.aws.efs.inputs.AccessPointRootDirectoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.AccessPointRootDirectoryCreationInfoArgs.builder
      builder.creationInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.efs.inputs.AccessPointState.Builder)
    /**
     * @param posixUser Operating system user and group applied to all file system requests made using the access point. Detailed below.
     * @return builder
     */
    inline def posixUser(args: Endofunction[com.pulumi.aws.efs.inputs.AccessPointPosixUserArgs.Builder]):
        com.pulumi.aws.efs.inputs.AccessPointState.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.AccessPointPosixUserArgs.builder
      builder.posixUser(args(argsBuilder).build)

    /**
     * @param rootDirectory Directory on the Amazon EFS file system that the access point provides access to. Detailed below.
     * @return builder
     */
    inline def rootDirectory(args: Endofunction[com.pulumi.aws.efs.inputs.AccessPointRootDirectoryArgs.Builder]):
        com.pulumi.aws.efs.inputs.AccessPointState.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.AccessPointRootDirectoryArgs.builder
      builder.rootDirectory(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.efs.inputs.BackupPolicyState.Builder)
    /**
     * @param backupPolicy A backupPolicy object (documented below).
     * @return builder
     */
    inline def backupPolicy(args: Endofunction[com.pulumi.aws.efs.inputs.BackupPolicyBackupPolicyArgs.Builder]):
        com.pulumi.aws.efs.inputs.BackupPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.BackupPolicyBackupPolicyArgs.builder
      builder.backupPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.efs.inputs.FileSystemState.Builder)
    /**
     * @param lifecyclePolicies A file system [lifecycle policy](https://docs.aws.amazon.com/efs/latest/ug/API_LifecyclePolicy.html) object. See `lifecyclePolicy` block below for details.
     * @return builder
     */
    inline def lifecyclePolicies(args: Endofunction[com.pulumi.aws.efs.inputs.FileSystemLifecyclePolicyArgs.Builder]*):
        com.pulumi.aws.efs.inputs.FileSystemState.Builder =
      def argsBuilder = com.pulumi.aws.efs.inputs.FileSystemLifecyclePolicyArgs.builder
      builder.lifecyclePolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param protection A file system [protection](https://docs.aws.amazon.com/efs/latest/ug/API_FileSystemProtectionDescription.html) object. See `protection` block below for details.
     * @return builder
     */
    inline def protection(args: Endofunction[com.pulumi.aws.efs.inputs.FileSystemProtectionArgs.Builder]):
        com.pulumi.aws.efs.inputs.FileSystemState.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.FileSystemProtectionArgs.builder
      builder.protection(args(argsBuilder).build)

    /**
     * @param sizeInBytes The latest known metered size (in bytes) of data stored in the file system, the value is not the exact size that the file system was at any point in time. See Size In Bytes.
     * @return builder
     */
    inline def sizeInBytes(args: Endofunction[com.pulumi.aws.efs.inputs.FileSystemSizeInByteArgs.Builder]*):
        com.pulumi.aws.efs.inputs.FileSystemState.Builder =
      def argsBuilder = com.pulumi.aws.efs.inputs.FileSystemSizeInByteArgs.builder
      builder.sizeInBytes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.efs.inputs.ReplicationConfigurationState.Builder)
    /**
     * @param destination A destination configuration block (documented below).
     * @return builder
     */
    inline def destination(args: Endofunction[com.pulumi.aws.efs.inputs.ReplicationConfigurationDestinationArgs.Builder]):
        com.pulumi.aws.efs.inputs.ReplicationConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.efs.inputs.ReplicationConfigurationDestinationArgs.builder
      builder.destination(args(argsBuilder).build)
