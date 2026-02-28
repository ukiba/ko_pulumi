package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object ebs:
  /** Creates a Snapshot of a snapshot. */
  def SnapshotCopy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ebs.SnapshotCopyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ebs.SnapshotCopyArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ebs.SnapshotCopy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ebs.FastSnapshotRestoreArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ebs.inputs.FastSnapshotRestoreTimeoutsArgs.Builder]):
        com.pulumi.aws.ebs.FastSnapshotRestoreArgs.Builder =
      val argsBuilder = com.pulumi.aws.ebs.inputs.FastSnapshotRestoreTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Provides a resource to manage the default customer master key (CMK) that your AWS account uses to encrypt EBS volumes.
   *  
   *  Your AWS account has an AWS-managed default CMK that is used for encrypting an EBS volume when no CMK is specified in the API call that creates the volume.
   *  By using the `aws.ebs.DefaultKmsKey` resource, you can specify a customer-managed CMK to use in place of the AWS-managed default CMK.
   *  
   *  &gt; **NOTE:** Creating an `aws.ebs.DefaultKmsKey` resource does not enable default EBS encryption. Use the `aws.ebs.EncryptionByDefault` to enable default EBS encryption.
   *  
   *  &gt; **NOTE:** Destroying this resource will reset the default CMK to the account&#39;s AWS-managed default CMK for EBS.
   */
  def DefaultKmsKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ebs.DefaultKmsKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ebs.DefaultKmsKeyArgs.builder
    
    com.pulumi.aws.ebs.DefaultKmsKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an EBS (Elastic Block Storage) Fast Snapshot Restore. */
  def FastSnapshotRestore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ebs.FastSnapshotRestoreArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ebs.FastSnapshotRestoreArgs.builder
    
    com.pulumi.aws.ebs.FastSnapshotRestore(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ebs.SnapshotImportArgs.Builder)
    /**
     * @param clientData The client-specific data. Detailed below.
     * @return builder
     */
    def clientData(args: Endofunction[com.pulumi.aws.ebs.inputs.SnapshotImportClientDataArgs.Builder]):
        com.pulumi.aws.ebs.SnapshotImportArgs.Builder =
      val argsBuilder = com.pulumi.aws.ebs.inputs.SnapshotImportClientDataArgs.builder
      builder.clientData(args(argsBuilder).build)

    /**
     * @param diskContainer Information about the disk container. Detailed below.
     * @return builder
     */
    def diskContainer(args: Endofunction[com.pulumi.aws.ebs.inputs.SnapshotImportDiskContainerArgs.Builder]):
        com.pulumi.aws.ebs.SnapshotImportArgs.Builder =
      val argsBuilder = com.pulumi.aws.ebs.inputs.SnapshotImportDiskContainerArgs.builder
      builder.diskContainer(args(argsBuilder).build)

  /**
   * Provides a resource to manage whether default EBS encryption is enabled for your AWS account in the current AWS region. To manage the default KMS key for the region, see the `aws.ebs.DefaultKmsKey` resource.
   *  
   *  &gt; **NOTE:** Removing this resource disables default EBS encryption.
   */
  def EncryptionByDefault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ebs.EncryptionByDefaultArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ebs.EncryptionByDefaultArgs.builder
    
    com.pulumi.aws.ebs.EncryptionByDefault(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates a Snapshot of an EBS Volume. */
  def Snapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ebs.SnapshotArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ebs.SnapshotArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ebs.Snapshot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * 
   */
  def SnapshotBlockPublicAccess(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ebs.SnapshotBlockPublicAccessArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ebs.SnapshotBlockPublicAccessArgs.builder
    
    com.pulumi.aws.ebs.SnapshotBlockPublicAccess(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type EbsFunctions = com.pulumi.aws.ebs.EbsFunctions
  object EbsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.ebs.EbsFunctions.*
  extension (self: EbsFunctions.type)
    /** Use this data source to get the default EBS encryption KMS key in the current region. */
    def getDefaultKmsKey(args: Endofunction[com.pulumi.aws.ebs.inputs.GetDefaultKmsKeyArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ebs.outputs.GetDefaultKmsKeyResult] =
      val argsBuilder = com.pulumi.aws.ebs.inputs.GetDefaultKmsKeyArgs.builder
      com.pulumi.aws.ebs.EbsFunctions.getDefaultKmsKey(args(argsBuilder).build)

    /** Use this data source to get the default EBS encryption KMS key in the current region. */
    def getDefaultKmsKeyPlain(args: Endofunction[com.pulumi.aws.ebs.inputs.GetDefaultKmsKeyPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ebs.outputs.GetDefaultKmsKeyResult] =
      val argsBuilder = com.pulumi.aws.ebs.inputs.GetDefaultKmsKeyPlainArgs.builder
      com.pulumi.aws.ebs.EbsFunctions.getDefaultKmsKeyPlain(args(argsBuilder).build)

    /**
     * `aws.ebs.getEbsVolumes` provides identifying information for EBS volumes matching given criteria.
     *  
     *  This data source can be useful for getting a list of volume IDs with (for example) matching tags.
     */
    def getEbsVolumes(args: Endofunction[com.pulumi.aws.ebs.inputs.GetEbsVolumesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ebs.outputs.GetEbsVolumesResult] =
      val argsBuilder = com.pulumi.aws.ebs.inputs.GetEbsVolumesArgs.builder
      com.pulumi.aws.ebs.EbsFunctions.getEbsVolumes(args(argsBuilder).build)

    /**
     * `aws.ebs.getEbsVolumes` provides identifying information for EBS volumes matching given criteria.
     *  
     *  This data source can be useful for getting a list of volume IDs with (for example) matching tags.
     */
    def getEbsVolumesPlain(args: Endofunction[com.pulumi.aws.ebs.inputs.GetEbsVolumesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ebs.outputs.GetEbsVolumesResult] =
      val argsBuilder = com.pulumi.aws.ebs.inputs.GetEbsVolumesPlainArgs.builder
      com.pulumi.aws.ebs.EbsFunctions.getEbsVolumesPlain(args(argsBuilder).build)

    /** Provides a way to check whether default EBS encryption is enabled for your AWS account in the current AWS region. */
    def getEncryptionByDefault(args: Endofunction[com.pulumi.aws.ebs.inputs.GetEncryptionByDefaultArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ebs.outputs.GetEncryptionByDefaultResult] =
      val argsBuilder = com.pulumi.aws.ebs.inputs.GetEncryptionByDefaultArgs.builder
      com.pulumi.aws.ebs.EbsFunctions.getEncryptionByDefault(args(argsBuilder).build)

    /** Provides a way to check whether default EBS encryption is enabled for your AWS account in the current AWS region. */
    def getEncryptionByDefaultPlain(args: Endofunction[com.pulumi.aws.ebs.inputs.GetEncryptionByDefaultPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ebs.outputs.GetEncryptionByDefaultResult] =
      val argsBuilder = com.pulumi.aws.ebs.inputs.GetEncryptionByDefaultPlainArgs.builder
      com.pulumi.aws.ebs.EbsFunctions.getEncryptionByDefaultPlain(args(argsBuilder).build)

    /** Use this data source to get information about an EBS Snapshot for use when provisioning EBS Volumes */
    def getSnapshot(args: Endofunction[com.pulumi.aws.ebs.inputs.GetSnapshotArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ebs.outputs.GetSnapshotResult] =
      val argsBuilder = com.pulumi.aws.ebs.inputs.GetSnapshotArgs.builder
      com.pulumi.aws.ebs.EbsFunctions.getSnapshot(args(argsBuilder).build)

    /** Use this data source to get information about an EBS Snapshot for use when provisioning EBS Volumes */
    def getSnapshotPlain(args: Endofunction[com.pulumi.aws.ebs.inputs.GetSnapshotPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ebs.outputs.GetSnapshotResult] =
      val argsBuilder = com.pulumi.aws.ebs.inputs.GetSnapshotPlainArgs.builder
      com.pulumi.aws.ebs.EbsFunctions.getSnapshotPlain(args(argsBuilder).build)

    /**
     * Use this data source to get a list of EBS Snapshot IDs matching the specified
     *  criteria.
     */
    def getSnapshotIds(args: Endofunction[com.pulumi.aws.ebs.inputs.GetSnapshotIdsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ebs.outputs.GetSnapshotIdsResult] =
      val argsBuilder = com.pulumi.aws.ebs.inputs.GetSnapshotIdsArgs.builder
      com.pulumi.aws.ebs.EbsFunctions.getSnapshotIds(args(argsBuilder).build)

    /**
     * Use this data source to get a list of EBS Snapshot IDs matching the specified
     *  criteria.
     */
    def getSnapshotIdsPlain(args: Endofunction[com.pulumi.aws.ebs.inputs.GetSnapshotIdsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ebs.outputs.GetSnapshotIdsResult] =
      val argsBuilder = com.pulumi.aws.ebs.inputs.GetSnapshotIdsPlainArgs.builder
      com.pulumi.aws.ebs.EbsFunctions.getSnapshotIdsPlain(args(argsBuilder).build)

    /**
     * Use this data source to get information about an EBS volume for use in other
     *  resources.
     */
    def getVolume(args: Endofunction[com.pulumi.aws.ebs.inputs.GetVolumeArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ebs.outputs.GetVolumeResult] =
      val argsBuilder = com.pulumi.aws.ebs.inputs.GetVolumeArgs.builder
      com.pulumi.aws.ebs.EbsFunctions.getVolume(args(argsBuilder).build)

    /**
     * Use this data source to get information about an EBS volume for use in other
     *  resources.
     */
    def getVolumePlain(args: Endofunction[com.pulumi.aws.ebs.inputs.GetVolumePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ebs.outputs.GetVolumeResult] =
      val argsBuilder = com.pulumi.aws.ebs.inputs.GetVolumePlainArgs.builder
      com.pulumi.aws.ebs.EbsFunctions.getVolumePlain(args(argsBuilder).build)

  /** Imports a disk image from S3 as a Snapshot. */
  def SnapshotImport(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ebs.SnapshotImportArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ebs.SnapshotImportArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ebs.SnapshotImport(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a single EBS volume. */
  def Volume(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ebs.VolumeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ebs.VolumeArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ebs.Volume(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ebs.inputs.SnapshotImportDiskContainerArgs.Builder)
    /**
     * @param userBucket The Amazon S3 bucket for the disk image. One of `url` or `userBucket` must be set. Detailed below.
     * @return builder
     */
    def userBucket(args: Endofunction[com.pulumi.aws.ebs.inputs.SnapshotImportDiskContainerUserBucketArgs.Builder]):
        com.pulumi.aws.ebs.inputs.SnapshotImportDiskContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.ebs.inputs.SnapshotImportDiskContainerUserBucketArgs.builder
      builder.userBucket(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ebs.inputs.GetSnapshotArgs.Builder)
    /**
     * @param filters One or more name/value pairs to filter off of. There are several valid keys, for a full reference, check out [describe-snapshots in the AWS CLI reference][1].
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ebs.inputs.GetSnapshotFilterArgs.Builder]*):
        com.pulumi.aws.ebs.inputs.GetSnapshotArgs.Builder =
      def argsBuilder = com.pulumi.aws.ebs.inputs.GetSnapshotFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ebs.inputs.GetVolumeArgs.Builder)
    /**
     * @param filters One or more name/value pairs to filter off of. There are
     *  several valid keys, for a full reference, check out
     *  [describe-volumes in the AWS CLI reference][1].
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ebs.inputs.GetVolumeFilterArgs.Builder]*):
        com.pulumi.aws.ebs.inputs.GetVolumeArgs.Builder =
      def argsBuilder = com.pulumi.aws.ebs.inputs.GetVolumeFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ebs.inputs.SnapshotImportState.Builder)
    /**
     * @param clientData The client-specific data. Detailed below.
     * @return builder
     */
    def clientData(args: Endofunction[com.pulumi.aws.ebs.inputs.SnapshotImportClientDataArgs.Builder]):
        com.pulumi.aws.ebs.inputs.SnapshotImportState.Builder =
      val argsBuilder = com.pulumi.aws.ebs.inputs.SnapshotImportClientDataArgs.builder
      builder.clientData(args(argsBuilder).build)

    /**
     * @param diskContainer Information about the disk container. Detailed below.
     * @return builder
     */
    def diskContainer(args: Endofunction[com.pulumi.aws.ebs.inputs.SnapshotImportDiskContainerArgs.Builder]):
        com.pulumi.aws.ebs.inputs.SnapshotImportState.Builder =
      val argsBuilder = com.pulumi.aws.ebs.inputs.SnapshotImportDiskContainerArgs.builder
      builder.diskContainer(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ebs.inputs.GetEbsVolumesArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ebs.inputs.GetEbsVolumesFilterArgs.Builder]*):
        com.pulumi.aws.ebs.inputs.GetEbsVolumesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ebs.inputs.GetEbsVolumesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ebs.inputs.FastSnapshotRestoreState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ebs.inputs.FastSnapshotRestoreTimeoutsArgs.Builder]):
        com.pulumi.aws.ebs.inputs.FastSnapshotRestoreState.Builder =
      val argsBuilder = com.pulumi.aws.ebs.inputs.FastSnapshotRestoreTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ebs.inputs.GetSnapshotIdsArgs.Builder)
    /**
     * @param filters One or more name/value pairs to filter off of. There are several valid keys, for a full reference, check out [describe-volumes in the AWS CLI reference][1].
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ebs.inputs.GetSnapshotIdsFilterArgs.Builder]*):
        com.pulumi.aws.ebs.inputs.GetSnapshotIdsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ebs.inputs.GetSnapshotIdsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)
