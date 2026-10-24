package jp.ukiba.ko_pulumi
package aws

object ebs_ext:
  extension (builder: com.pulumi.aws.ebs.FastSnapshotRestoreArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ebs.inputs.FastSnapshotRestoreTimeoutsArgs.Builder]):
        com.pulumi.aws.ebs.FastSnapshotRestoreArgs.Builder =
      val argsBuilder = com.pulumi.aws.ebs.inputs.FastSnapshotRestoreTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ebs.SnapshotImportArgs.Builder)
    /**
     * @param clientData The client-specific data. Detailed below.
     * @return builder
     */
    inline def clientData(args: Endofunction[com.pulumi.aws.ebs.inputs.SnapshotImportClientDataArgs.Builder]):
        com.pulumi.aws.ebs.SnapshotImportArgs.Builder =
      val argsBuilder = com.pulumi.aws.ebs.inputs.SnapshotImportClientDataArgs.builder
      builder.clientData(args(argsBuilder).build)

    /**
     * @param diskContainer Information about the disk container. Detailed below.
     * @return builder
     */
    inline def diskContainer(args: Endofunction[com.pulumi.aws.ebs.inputs.SnapshotImportDiskContainerArgs.Builder]):
        com.pulumi.aws.ebs.SnapshotImportArgs.Builder =
      val argsBuilder = com.pulumi.aws.ebs.inputs.SnapshotImportDiskContainerArgs.builder
      builder.diskContainer(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ebs.VolumeCopyArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ebs.inputs.VolumeCopyTimeoutsArgs.Builder]):
        com.pulumi.aws.ebs.VolumeCopyArgs.Builder =
      val argsBuilder = com.pulumi.aws.ebs.inputs.VolumeCopyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ebs.inputs.FastSnapshotRestoreState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ebs.inputs.FastSnapshotRestoreTimeoutsArgs.Builder]):
        com.pulumi.aws.ebs.inputs.FastSnapshotRestoreState.Builder =
      val argsBuilder = com.pulumi.aws.ebs.inputs.FastSnapshotRestoreTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ebs.inputs.GetEbsVolumesArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ebs.inputs.GetEbsVolumesFilterArgs.Builder]*):
        com.pulumi.aws.ebs.inputs.GetEbsVolumesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ebs.inputs.GetEbsVolumesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ebs.inputs.GetEbsVolumesPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ebs.inputs.GetEbsVolumesFilter.Builder]*):
        com.pulumi.aws.ebs.inputs.GetEbsVolumesPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ebs.inputs.GetEbsVolumesFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ebs.inputs.GetSnapshotArgs.Builder)
    /**
     * @param filters One or more name/value pairs to filter off of. There are several valid keys, for a full reference, check out [describe-snapshots in the AWS CLI reference](http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-snapshots.html).
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ebs.inputs.GetSnapshotFilterArgs.Builder]*):
        com.pulumi.aws.ebs.inputs.GetSnapshotArgs.Builder =
      def argsBuilder = com.pulumi.aws.ebs.inputs.GetSnapshotFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ebs.inputs.GetSnapshotIdsArgs.Builder)
    /**
     * @param filters One or more name/value pairs to filter off of. There are several valid keys, for a full reference, check out [describe-volumes in the AWS CLI reference](http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-snapshots.html).
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ebs.inputs.GetSnapshotIdsFilterArgs.Builder]*):
        com.pulumi.aws.ebs.inputs.GetSnapshotIdsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ebs.inputs.GetSnapshotIdsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ebs.inputs.GetSnapshotIdsPlainArgs.Builder)
    /**
     * @param filters One or more name/value pairs to filter off of. There are several valid keys, for a full reference, check out [describe-volumes in the AWS CLI reference](http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-snapshots.html).
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ebs.inputs.GetSnapshotIdsFilter.Builder]*):
        com.pulumi.aws.ebs.inputs.GetSnapshotIdsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ebs.inputs.GetSnapshotIdsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ebs.inputs.GetSnapshotPlainArgs.Builder)
    /**
     * @param filters One or more name/value pairs to filter off of. There are several valid keys, for a full reference, check out [describe-snapshots in the AWS CLI reference](http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-snapshots.html).
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ebs.inputs.GetSnapshotFilter.Builder]*):
        com.pulumi.aws.ebs.inputs.GetSnapshotPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ebs.inputs.GetSnapshotFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ebs.inputs.GetVolumeArgs.Builder)
    /**
     * @param filters One or more name/value pairs to filter off of. There are
     * several valid keys, for a full reference, check out
     * [describe-volumes in the AWS CLI reference](http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-volumes.html).
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ebs.inputs.GetVolumeFilterArgs.Builder]*):
        com.pulumi.aws.ebs.inputs.GetVolumeArgs.Builder =
      def argsBuilder = com.pulumi.aws.ebs.inputs.GetVolumeFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ebs.inputs.GetVolumePlainArgs.Builder)
    /**
     * @param filters One or more name/value pairs to filter off of. There are
     * several valid keys, for a full reference, check out
     * [describe-volumes in the AWS CLI reference](http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-volumes.html).
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ebs.inputs.GetVolumeFilter.Builder]*):
        com.pulumi.aws.ebs.inputs.GetVolumePlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ebs.inputs.GetVolumeFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ebs.inputs.SnapshotImportDiskContainerArgs.Builder)
    /**
     * @param userBucket The Amazon S3 bucket for the disk image. One of `url` or `userBucket` must be set. Detailed below.
     * @return builder
     */
    inline def userBucket(args: Endofunction[com.pulumi.aws.ebs.inputs.SnapshotImportDiskContainerUserBucketArgs.Builder]):
        com.pulumi.aws.ebs.inputs.SnapshotImportDiskContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.ebs.inputs.SnapshotImportDiskContainerUserBucketArgs.builder
      builder.userBucket(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ebs.inputs.SnapshotImportState.Builder)
    /**
     * @param clientData The client-specific data. Detailed below.
     * @return builder
     */
    inline def clientData(args: Endofunction[com.pulumi.aws.ebs.inputs.SnapshotImportClientDataArgs.Builder]):
        com.pulumi.aws.ebs.inputs.SnapshotImportState.Builder =
      val argsBuilder = com.pulumi.aws.ebs.inputs.SnapshotImportClientDataArgs.builder
      builder.clientData(args(argsBuilder).build)

    /**
     * @param diskContainer Information about the disk container. Detailed below.
     * @return builder
     */
    inline def diskContainer(args: Endofunction[com.pulumi.aws.ebs.inputs.SnapshotImportDiskContainerArgs.Builder]):
        com.pulumi.aws.ebs.inputs.SnapshotImportState.Builder =
      val argsBuilder = com.pulumi.aws.ebs.inputs.SnapshotImportDiskContainerArgs.builder
      builder.diskContainer(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ebs.inputs.VolumeCopyState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ebs.inputs.VolumeCopyTimeoutsArgs.Builder]):
        com.pulumi.aws.ebs.inputs.VolumeCopyState.Builder =
      val argsBuilder = com.pulumi.aws.ebs.inputs.VolumeCopyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
