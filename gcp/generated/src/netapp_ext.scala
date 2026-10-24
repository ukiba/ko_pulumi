package jp.ukiba.ko_pulumi
package gcp

object netapp_ext:
  extension (builder: com.pulumi.gcp.netapp.BackupArgs.Builder)
    /**
     * @param ontapSource Details of the ONTAP source volume and snapshot.
     * Structure is documented below.
     * @return builder
     */
    def ontapSource(args: Endofunction[com.pulumi.gcp.netapp.inputs.BackupOntapSourceArgs.Builder]):
        com.pulumi.gcp.netapp.BackupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.BackupOntapSourceArgs.builder
      builder.ontapSource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.netapp.BackupVaultArgs.Builder)
    /**
     * @param backupRetentionPolicy Backup retention policy defining the retention of the backups.
     * Structure is documented below.
     * @return builder
     */
    def backupRetentionPolicy(args: Endofunction[com.pulumi.gcp.netapp.inputs.BackupVaultBackupRetentionPolicyArgs.Builder]):
        com.pulumi.gcp.netapp.BackupVaultArgs.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.BackupVaultBackupRetentionPolicyArgs.builder
      builder.backupRetentionPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.netapp.VolumeArgs.Builder)
    /**
     * @param backupConfig Backup configuration for the volume.
     * Structure is documented below.
     * @return builder
     */
    def backupConfig(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeBackupConfigArgs.Builder]):
        com.pulumi.gcp.netapp.VolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeBackupConfigArgs.builder
      builder.backupConfig(args(argsBuilder).build)

    /**
     * @param blockDevices Block device represents the device(s) which are stored in the block volume.
     * Currently, only one block device is permitted per Volume.
     * Structure is documented below.
     * @return builder
     */
    def blockDevices(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeBlockDeviceArgs.Builder]*):
        com.pulumi.gcp.netapp.VolumeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeBlockDeviceArgs.builder
      builder.blockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param cacheParameters Cache parameters for the volume.
     * Structure is documented below.
     * @return builder
     */
    def cacheParameters(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeCacheParametersArgs.Builder]):
        com.pulumi.gcp.netapp.VolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeCacheParametersArgs.builder
      builder.cacheParameters(args(argsBuilder).build)

    /**
     * @param exportPolicy Export policy of the volume for NFSV3 and/or NFSV4.1 access.
     * Structure is documented below.
     * @return builder
     */
    def exportPolicy(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeExportPolicyArgs.Builder]):
        com.pulumi.gcp.netapp.VolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeExportPolicyArgs.builder
      builder.exportPolicy(args(argsBuilder).build)

    /**
     * @param hybridReplicationParameters [Volume migration](https://docs.cloud.google.com/netapp/volumes/docs/migrate/ontap/overview) and
     * [external replication](https://docs.cloud.google.com/netapp/volumes/docs/protect-data/replicate-ontap/overview)
     * are two types of Hybrid Replication. This parameter block specifies the parameters for a hybrid replication.
     * Structure is documented below.
     * @return builder
     */
    def hybridReplicationParameters(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeHybridReplicationParametersArgs.Builder]):
        com.pulumi.gcp.netapp.VolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeHybridReplicationParametersArgs.builder
      builder.hybridReplicationParameters(args(argsBuilder).build)

    /**
     * @param largeCapacityConfig Configuration for a Large Capacity Volume. A Large Capacity Volume
     * supports sizes ranging from 12 TiB to 20 PiB, it is composed of multiple
     * internal constituents, and must be created in a large capacity pool.
     * Structure is documented below.
     * @return builder
     */
    def largeCapacityConfig(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeLargeCapacityConfigArgs.Builder]):
        com.pulumi.gcp.netapp.VolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeLargeCapacityConfigArgs.builder
      builder.largeCapacityConfig(args(argsBuilder).build)

    /**
     * @param restoreParameters Used to create this volume from a snapshot (= cloning) or an backup.
     * Structure is documented below.
     * @return builder
     */
    def restoreParameters(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeRestoreParametersArgs.Builder]):
        com.pulumi.gcp.netapp.VolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeRestoreParametersArgs.builder
      builder.restoreParameters(args(argsBuilder).build)

    /**
     * @param snapshotPolicy Snapshot policy defines the schedule for automatic snapshot creation.
     * To disable automatic snapshot creation you have to remove the whole snapshotPolicy block.
     * Structure is documented below.
     * @return builder
     */
    def snapshotPolicy(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeSnapshotPolicyArgs.Builder]):
        com.pulumi.gcp.netapp.VolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeSnapshotPolicyArgs.builder
      builder.snapshotPolicy(args(argsBuilder).build)

    /**
     * @param tieringPolicy Tiering policy for the volume.
     * Structure is documented below.
     * @return builder
     */
    def tieringPolicy(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeTieringPolicyArgs.Builder]):
        com.pulumi.gcp.netapp.VolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeTieringPolicyArgs.builder
      builder.tieringPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.netapp.VolumeReplicationArgs.Builder)
    /**
     * @param destinationVolumeParameters Destination volume parameters.
     * Structure is documented below.
     * @return builder
     */
    def destinationVolumeParameters(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeReplicationDestinationVolumeParametersArgs.Builder]):
        com.pulumi.gcp.netapp.VolumeReplicationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeReplicationDestinationVolumeParametersArgs.builder
      builder.destinationVolumeParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.netapp.inputs.BackupState.Builder)
    /**
     * @param ontapSource Details of the ONTAP source volume and snapshot.
     * Structure is documented below.
     * @return builder
     */
    def ontapSource(args: Endofunction[com.pulumi.gcp.netapp.inputs.BackupOntapSourceArgs.Builder]):
        com.pulumi.gcp.netapp.inputs.BackupState.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.BackupOntapSourceArgs.builder
      builder.ontapSource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.netapp.inputs.BackupVaultState.Builder)
    /**
     * @param backupRetentionPolicy Backup retention policy defining the retention of the backups.
     * Structure is documented below.
     * @return builder
     */
    def backupRetentionPolicy(args: Endofunction[com.pulumi.gcp.netapp.inputs.BackupVaultBackupRetentionPolicyArgs.Builder]):
        com.pulumi.gcp.netapp.inputs.BackupVaultState.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.BackupVaultBackupRetentionPolicyArgs.builder
      builder.backupRetentionPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.netapp.inputs.VolumeCacheParametersArgs.Builder)
    /**
     * @param cacheConfig Optional. Configuration of the cache volume.
     * Structure is documented below.
     * @return builder
     */
    def cacheConfig(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeCacheParametersCacheConfigArgs.Builder]):
        com.pulumi.gcp.netapp.inputs.VolumeCacheParametersArgs.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeCacheParametersCacheConfigArgs.builder
      builder.cacheConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.netapp.inputs.VolumeExportPolicyArgs.Builder)
    /**
     * @param rules Export rules (up to 5) control NFS volume access.
     * Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeExportPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.netapp.inputs.VolumeExportPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeExportPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.netapp.inputs.VolumeReplicationDestinationVolumeParametersArgs.Builder)
    /**
     * @param tieringPolicy Tiering policy for the volume.
     * Structure is documented below.
     * @return builder
     */
    def tieringPolicy(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeReplicationDestinationVolumeParametersTieringPolicyArgs.Builder]):
        com.pulumi.gcp.netapp.inputs.VolumeReplicationDestinationVolumeParametersArgs.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeReplicationDestinationVolumeParametersTieringPolicyArgs.builder
      builder.tieringPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.netapp.inputs.VolumeReplicationState.Builder)
    /**
     * @param destinationVolumeParameters Destination volume parameters.
     * Structure is documented below.
     * @return builder
     */
    def destinationVolumeParameters(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeReplicationDestinationVolumeParametersArgs.Builder]):
        com.pulumi.gcp.netapp.inputs.VolumeReplicationState.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeReplicationDestinationVolumeParametersArgs.builder
      builder.destinationVolumeParameters(args(argsBuilder).build)

    /**
     * @param hybridPeeringDetails HybridPeeringDetails contains details about the hybrid peering.
     * Structure is documented below.
     * @return builder
     */
    def hybridPeeringDetails(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeReplicationHybridPeeringDetailArgs.Builder]*):
        com.pulumi.gcp.netapp.inputs.VolumeReplicationState.Builder =
      def argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeReplicationHybridPeeringDetailArgs.builder
      builder.hybridPeeringDetails(args.map(_(argsBuilder).build)*)

    /**
     * @param hybridReplicationUserCommands Copy pastable snapmirror commands to be executed on onprem cluster by the customer.
     * Structure is documented below.
     * @return builder
     */
    def hybridReplicationUserCommands(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeReplicationHybridReplicationUserCommandArgs.Builder]*):
        com.pulumi.gcp.netapp.inputs.VolumeReplicationState.Builder =
      def argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeReplicationHybridReplicationUserCommandArgs.builder
      builder.hybridReplicationUserCommands(args.map(_(argsBuilder).build)*)

    /**
     * @param transferStats Replication transfer statistics. All statistics are updated every 5 minutes.
     * Structure is documented below.
     * @return builder
     */
    def transferStats(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeReplicationTransferStatArgs.Builder]*):
        com.pulumi.gcp.netapp.inputs.VolumeReplicationState.Builder =
      def argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeReplicationTransferStatArgs.builder
      builder.transferStats(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.netapp.inputs.VolumeSnapshotPolicyArgs.Builder)
    /**
     * @param dailySchedule Daily schedule policy.
     * Structure is documented below.
     * @return builder
     */
    def dailySchedule(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeSnapshotPolicyDailyScheduleArgs.Builder]):
        com.pulumi.gcp.netapp.inputs.VolumeSnapshotPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeSnapshotPolicyDailyScheduleArgs.builder
      builder.dailySchedule(args(argsBuilder).build)

    /**
     * @param hourlySchedule Hourly schedule policy.
     * Structure is documented below.
     * @return builder
     */
    def hourlySchedule(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeSnapshotPolicyHourlyScheduleArgs.Builder]):
        com.pulumi.gcp.netapp.inputs.VolumeSnapshotPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeSnapshotPolicyHourlyScheduleArgs.builder
      builder.hourlySchedule(args(argsBuilder).build)

    /**
     * @param monthlySchedule Monthly schedule policy.
     * Structure is documented below.
     * @return builder
     */
    def monthlySchedule(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeSnapshotPolicyMonthlyScheduleArgs.Builder]):
        com.pulumi.gcp.netapp.inputs.VolumeSnapshotPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeSnapshotPolicyMonthlyScheduleArgs.builder
      builder.monthlySchedule(args(argsBuilder).build)

    /**
     * @param weeklySchedule Weekly schedule policy.
     * Structure is documented below.
     * @return builder
     */
    def weeklySchedule(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeSnapshotPolicyWeeklyScheduleArgs.Builder]):
        com.pulumi.gcp.netapp.inputs.VolumeSnapshotPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeSnapshotPolicyWeeklyScheduleArgs.builder
      builder.weeklySchedule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.netapp.inputs.VolumeState.Builder)
    /**
     * @param backupConfig Backup configuration for the volume.
     * Structure is documented below.
     * @return builder
     */
    def backupConfig(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeBackupConfigArgs.Builder]):
        com.pulumi.gcp.netapp.inputs.VolumeState.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeBackupConfigArgs.builder
      builder.backupConfig(args(argsBuilder).build)

    /**
     * @param blockDevices Block device represents the device(s) which are stored in the block volume.
     * Currently, only one block device is permitted per Volume.
     * Structure is documented below.
     * @return builder
     */
    def blockDevices(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeBlockDeviceArgs.Builder]*):
        com.pulumi.gcp.netapp.inputs.VolumeState.Builder =
      def argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeBlockDeviceArgs.builder
      builder.blockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param cacheParameters Cache parameters for the volume.
     * Structure is documented below.
     * @return builder
     */
    def cacheParameters(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeCacheParametersArgs.Builder]):
        com.pulumi.gcp.netapp.inputs.VolumeState.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeCacheParametersArgs.builder
      builder.cacheParameters(args(argsBuilder).build)

    /**
     * @param exportPolicy Export policy of the volume for NFSV3 and/or NFSV4.1 access.
     * Structure is documented below.
     * @return builder
     */
    def exportPolicy(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeExportPolicyArgs.Builder]):
        com.pulumi.gcp.netapp.inputs.VolumeState.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeExportPolicyArgs.builder
      builder.exportPolicy(args(argsBuilder).build)

    /**
     * @param hybridReplicationParameters [Volume migration](https://docs.cloud.google.com/netapp/volumes/docs/migrate/ontap/overview) and
     * [external replication](https://docs.cloud.google.com/netapp/volumes/docs/protect-data/replicate-ontap/overview)
     * are two types of Hybrid Replication. This parameter block specifies the parameters for a hybrid replication.
     * Structure is documented below.
     * @return builder
     */
    def hybridReplicationParameters(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeHybridReplicationParametersArgs.Builder]):
        com.pulumi.gcp.netapp.inputs.VolumeState.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeHybridReplicationParametersArgs.builder
      builder.hybridReplicationParameters(args(argsBuilder).build)

    /**
     * @param largeCapacityConfig Configuration for a Large Capacity Volume. A Large Capacity Volume
     * supports sizes ranging from 12 TiB to 20 PiB, it is composed of multiple
     * internal constituents, and must be created in a large capacity pool.
     * Structure is documented below.
     * @return builder
     */
    def largeCapacityConfig(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeLargeCapacityConfigArgs.Builder]):
        com.pulumi.gcp.netapp.inputs.VolumeState.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeLargeCapacityConfigArgs.builder
      builder.largeCapacityConfig(args(argsBuilder).build)

    /**
     * @param mountOptions Reports mount instructions for this volume.
     * Structure is documented below.
     * @return builder
     */
    def mountOptions(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeMountOptionArgs.Builder]*):
        com.pulumi.gcp.netapp.inputs.VolumeState.Builder =
      def argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeMountOptionArgs.builder
      builder.mountOptions(args.map(_(argsBuilder).build)*)

    /**
     * @param restoreParameters Used to create this volume from a snapshot (= cloning) or an backup.
     * Structure is documented below.
     * @return builder
     */
    def restoreParameters(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeRestoreParametersArgs.Builder]):
        com.pulumi.gcp.netapp.inputs.VolumeState.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeRestoreParametersArgs.builder
      builder.restoreParameters(args(argsBuilder).build)

    /**
     * @param snapshotPolicy Snapshot policy defines the schedule for automatic snapshot creation.
     * To disable automatic snapshot creation you have to remove the whole snapshotPolicy block.
     * Structure is documented below.
     * @return builder
     */
    def snapshotPolicy(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeSnapshotPolicyArgs.Builder]):
        com.pulumi.gcp.netapp.inputs.VolumeState.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeSnapshotPolicyArgs.builder
      builder.snapshotPolicy(args(argsBuilder).build)

    /**
     * @param tieringPolicy Tiering policy for the volume.
     * Structure is documented below.
     * @return builder
     */
    def tieringPolicy(args: Endofunction[com.pulumi.gcp.netapp.inputs.VolumeTieringPolicyArgs.Builder]):
        com.pulumi.gcp.netapp.inputs.VolumeState.Builder =
      val argsBuilder = com.pulumi.gcp.netapp.inputs.VolumeTieringPolicyArgs.builder
      builder.tieringPolicy(args(argsBuilder).build)
