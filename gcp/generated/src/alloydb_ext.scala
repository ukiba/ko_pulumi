package jp.ukiba.ko_pulumi
package gcp

object alloydb_ext:
  extension (builder: com.pulumi.gcp.alloydb.BackupArgs.Builder)
    /**
     * @param encryptionConfig EncryptionConfig describes the encryption config of a cluster or a backup that is encrypted with a CMEK (customer-managed encryption key).
     * Structure is documented below.
     * @return builder
     */
    inline def encryptionConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.BackupEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.BackupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.BackupEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.alloydb.ClusterArgs.Builder)
    /**
     * @param automatedBackupPolicy The automated backup policy for this cluster. AutomatedBackupPolicy is disabled by default.
     * Structure is documented below.
     * @return builder
     */
    inline def automatedBackupPolicy(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyArgs.Builder]):
        com.pulumi.gcp.alloydb.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyArgs.builder
      builder.automatedBackupPolicy(args(argsBuilder).build)

    /**
     * @param continuousBackupConfig The continuous backup config for this cluster.
     * If no policy is provided then the default policy will be used. The default policy takes one backup a day and retains backups for 14 days.
     * Structure is documented below.
     * @return builder
     */
    inline def continuousBackupConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterContinuousBackupConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterContinuousBackupConfigArgs.builder
      builder.continuousBackupConfig(args(argsBuilder).build)

    /**
     * @param dataplexConfig Configuration for Dataplex integration. This is an optional field. If not set, Dataplex integration will be enabled by default.
     * Structure is documented below.
     * @return builder
     */
    inline def dataplexConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterDataplexConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterDataplexConfigArgs.builder
      builder.dataplexConfig(args(argsBuilder).build)

    /**
     * @param encryptionConfig EncryptionConfig describes the encryption config of a cluster or a backup that is encrypted with a CMEK (customer-managed encryption key).
     * Structure is documented below.
     * @return builder
     */
    inline def encryptionConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param initialUser Initial user to setup during cluster creation. If unset for new Clusters, a postgres role with null password is created. You will need to create additional users or set the password in order to log in.
     * Structure is documented below.
     * @return builder
     */
    inline def initialUser(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterInitialUserArgs.Builder]):
        com.pulumi.gcp.alloydb.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterInitialUserArgs.builder
      builder.initialUser(args(argsBuilder).build)

    /**
     * @param maintenanceUpdatePolicy MaintenanceUpdatePolicy defines the policy for system updates.
     * Structure is documented below.
     * @return builder
     */
    inline def maintenanceUpdatePolicy(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterMaintenanceUpdatePolicyArgs.Builder]):
        com.pulumi.gcp.alloydb.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterMaintenanceUpdatePolicyArgs.builder
      builder.maintenanceUpdatePolicy(args(argsBuilder).build)

    /**
     * @param networkConfig Metadata related to network configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def networkConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterNetworkConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param pscConfig Configuration for Private Service Connect (PSC) for the cluster.
     * Structure is documented below.
     * @return builder
     */
    inline def pscConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterPscConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterPscConfigArgs.builder
      builder.pscConfig(args(argsBuilder).build)

    /**
     * @param restoreBackupSource The source when restoring from a backup. Conflicts with &#39;restore_continuous_backup_source&#39;, &#39;restore_backupdr_backup_source&#39; and &#39;restore_backupdr_pitr_source&#39;, they can&#39;t be set together.
     * Structure is documented below.
     * @return builder
     */
    inline def restoreBackupSource(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterRestoreBackupSourceArgs.Builder]):
        com.pulumi.gcp.alloydb.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterRestoreBackupSourceArgs.builder
      builder.restoreBackupSource(args(argsBuilder).build)

    /**
     * @param restoreBackupdrBackupSource The source when restoring from a backup. Conflicts with &#39;restore_continuous_backup_source&#39;,  &#39;restore_backup_source&#39; and &#39;restore_backupdr_pitr_source&#39;, they can&#39;t be set together.
     * Structure is documented below.
     * @return builder
     */
    inline def restoreBackupdrBackupSource(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterRestoreBackupdrBackupSourceArgs.Builder]):
        com.pulumi.gcp.alloydb.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterRestoreBackupdrBackupSourceArgs.builder
      builder.restoreBackupdrBackupSource(args(argsBuilder).build)

    /**
     * @param restoreBackupdrPitrSource The BackupDR source used for point in time recovery. Conflicts with &#39;restore_backupdr_backup_source&#39;, &#39;restore_continuous_backup_source&#39; and &#39;restore_backupdr_backup_source&#39;, they can&#39;t be set togeter.
     * Structure is documented below.
     * @return builder
     */
    inline def restoreBackupdrPitrSource(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterRestoreBackupdrPitrSourceArgs.Builder]):
        com.pulumi.gcp.alloydb.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterRestoreBackupdrPitrSourceArgs.builder
      builder.restoreBackupdrPitrSource(args(argsBuilder).build)

    /**
     * @param restoreContinuousBackupSource The source when restoring via point in time recovery (PITR). Conflicts with &#39;restore_backup_source&#39;, &#39;restore_backupdr_backup_source&#39; and &#39;restore_backupdr_pitr_source&#39;, they can&#39;t be set together.
     * Structure is documented below.
     * @return builder
     */
    inline def restoreContinuousBackupSource(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterRestoreContinuousBackupSourceArgs.Builder]):
        com.pulumi.gcp.alloydb.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterRestoreContinuousBackupSourceArgs.builder
      builder.restoreContinuousBackupSource(args(argsBuilder).build)

    /**
     * @param secondaryConfig Configuration of the secondary cluster for Cross Region Replication. This should be set if and only if the cluster is of type SECONDARY.
     * Structure is documented below.
     * @return builder
     */
    inline def secondaryConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterSecondaryConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterSecondaryConfigArgs.builder
      builder.secondaryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.alloydb.InstanceArgs.Builder)
    /**
     * @param clientConnectionConfig Client connection specific configurations.
     * Structure is documented below.
     * @return builder
     */
    inline def clientConnectionConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.InstanceClientConnectionConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.InstanceClientConnectionConfigArgs.builder
      builder.clientConnectionConfig(args(argsBuilder).build)

    /**
     * @param connectionPoolConfig Configuration for Managed Connection Pool.
     * Structure is documented below.
     * @return builder
     */
    inline def connectionPoolConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.InstanceConnectionPoolConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.InstanceConnectionPoolConfigArgs.builder
      builder.connectionPoolConfig(args(argsBuilder).build)

    /**
     * @param machineConfig Configurations for the machines that host the underlying database engine.
     * Structure is documented below.
     * @return builder
     */
    inline def machineConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.InstanceMachineConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.InstanceMachineConfigArgs.builder
      builder.machineConfig(args(argsBuilder).build)

    /**
     * @param networkConfig Instance level network configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def networkConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.InstanceNetworkConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.InstanceNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param observabilityConfig (Optional, Beta)
     * Configuration for enhanced query insights.
     * Structure is documented below.
     * @return builder
     */
    inline def observabilityConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.InstanceObservabilityConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.InstanceObservabilityConfigArgs.builder
      builder.observabilityConfig(args(argsBuilder).build)

    /**
     * @param pscInstanceConfig Configuration for Private Service Connect (PSC) for the instance.
     * Structure is documented below.
     * @return builder
     */
    inline def pscInstanceConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.InstancePscInstanceConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.InstancePscInstanceConfigArgs.builder
      builder.pscInstanceConfig(args(argsBuilder).build)

    /**
     * @param queryInsightsConfig Configuration for query insights.
     * Structure is documented below.
     * @return builder
     */
    inline def queryInsightsConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.InstanceQueryInsightsConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.InstanceQueryInsightsConfigArgs.builder
      builder.queryInsightsConfig(args(argsBuilder).build)

    /**
     * @param readPoolConfig Read pool specific config. If the instance type is READ_POOL, this configuration must be provided.
     * Structure is documented below.
     * @return builder
     */
    inline def readPoolConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.InstanceReadPoolConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.InstanceReadPoolConfigArgs.builder
      builder.readPoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.alloydb.inputs.BackupState.Builder)
    /**
     * @param encryptionConfig EncryptionConfig describes the encryption config of a cluster or a backup that is encrypted with a CMEK (customer-managed encryption key).
     * Structure is documented below.
     * @return builder
     */
    inline def encryptionConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.BackupEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.BackupState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.BackupEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param encryptionInfos EncryptionInfo describes the encryption information of a cluster or a backup.
     * Structure is documented below.
     * @return builder
     */
    inline def encryptionInfos(args: Endofunction[com.pulumi.gcp.alloydb.inputs.BackupEncryptionInfoArgs.Builder]*):
        com.pulumi.gcp.alloydb.inputs.BackupState.Builder =
      def argsBuilder = com.pulumi.gcp.alloydb.inputs.BackupEncryptionInfoArgs.builder
      builder.encryptionInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param expiryQuantities Output only. The QuantityBasedExpiry of the backup, specified by the backup&#39;s retention policy.
     * Once the expiry quantity is over retention, the backup is eligible to be garbage collected.
     * Structure is documented below.
     * @return builder
     */
    inline def expiryQuantities(args: Endofunction[com.pulumi.gcp.alloydb.inputs.BackupExpiryQuantityArgs.Builder]*):
        com.pulumi.gcp.alloydb.inputs.BackupState.Builder =
      def argsBuilder = com.pulumi.gcp.alloydb.inputs.BackupExpiryQuantityArgs.builder
      builder.expiryQuantities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyArgs.Builder)
    /**
     * @param encryptionConfig EncryptionConfig describes the encryption config of a cluster or a backup that is encrypted with a CMEK (customer-managed encryption key).
     * Structure is documented below.
     * @return builder
     */
    inline def encryptionConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param quantityBasedRetention Quantity-based Backup retention policy to retain recent backups. Conflicts with &#39;time_based_retention&#39;, both can&#39;t be set together.
     * Structure is documented below.
     * @return builder
     */
    inline def quantityBasedRetention(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyQuantityBasedRetentionArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyQuantityBasedRetentionArgs.builder
      builder.quantityBasedRetention(args(argsBuilder).build)

    /**
     * @param timeBasedRetention Time-based Backup retention policy. Conflicts with &#39;quantity_based_retention&#39;, both can&#39;t be set together.
     * Structure is documented below.
     * @return builder
     */
    inline def timeBasedRetention(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyTimeBasedRetentionArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyTimeBasedRetentionArgs.builder
      builder.timeBasedRetention(args(argsBuilder).build)

    /**
     * @param weeklySchedule Weekly schedule for the Backup.
     * Structure is documented below.
     * @return builder
     */
    inline def weeklySchedule(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyWeeklyScheduleArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyWeeklyScheduleArgs.builder
      builder.weeklySchedule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyWeeklyScheduleArgs.Builder)
    /**
     * @param startTimes The times during the day to start a backup. At least one start time must be provided. The start times are assumed to be in UTC and to be an exact hour (e.g., 04:00:00).
     * Structure is documented below.
     * @return builder
     */
    inline def startTimes(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyWeeklyScheduleStartTimeArgs.Builder]*):
        com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyWeeklyScheduleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyWeeklyScheduleStartTimeArgs.builder
      builder.startTimes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.alloydb.inputs.ClusterContinuousBackupConfigArgs.Builder)
    /**
     * @param encryptionConfig EncryptionConfig describes the encryption config of a cluster or a backup that is encrypted with a CMEK (customer-managed encryption key).
     * Structure is documented below.
     * @return builder
     */
    inline def encryptionConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterContinuousBackupConfigEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.ClusterContinuousBackupConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterContinuousBackupConfigEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.alloydb.inputs.ClusterContinuousBackupInfoArgs.Builder)
    /**
     * @param encryptionInfos (Output)
     * Output only. The encryption information for the WALs and backups required for ContinuousBackup.
     * Structure is documented below.
     * @return builder
     */
    inline def encryptionInfos(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterContinuousBackupInfoEncryptionInfoArgs.Builder]*):
        com.pulumi.gcp.alloydb.inputs.ClusterContinuousBackupInfoArgs.Builder =
      def argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterContinuousBackupInfoEncryptionInfoArgs.builder
      builder.encryptionInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.alloydb.inputs.ClusterMaintenanceUpdatePolicyArgs.Builder)
    /**
     * @param maintenanceWindows Preferred windows to perform maintenance. Currently limited to 1.
     * Structure is documented below.
     * @return builder
     */
    inline def maintenanceWindows(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterMaintenanceUpdatePolicyMaintenanceWindowArgs.Builder]*):
        com.pulumi.gcp.alloydb.inputs.ClusterMaintenanceUpdatePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterMaintenanceUpdatePolicyMaintenanceWindowArgs.builder
      builder.maintenanceWindows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.alloydb.inputs.ClusterMaintenanceUpdatePolicyMaintenanceWindowArgs.Builder)
    /**
     * @param startTime Preferred time to start the maintenance operation on the specified day. Maintenance will start within 1 hour of this time.
     * Structure is documented below.
     * @return builder
     */
    inline def startTime(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterMaintenanceUpdatePolicyMaintenanceWindowStartTimeArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.ClusterMaintenanceUpdatePolicyMaintenanceWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterMaintenanceUpdatePolicyMaintenanceWindowStartTimeArgs.builder
      builder.startTime(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.alloydb.inputs.ClusterState.Builder)
    /**
     * @param automatedBackupPolicy The automated backup policy for this cluster. AutomatedBackupPolicy is disabled by default.
     * Structure is documented below.
     * @return builder
     */
    inline def automatedBackupPolicy(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyArgs.builder
      builder.automatedBackupPolicy(args(argsBuilder).build)

    /**
     * @param backupSources Cluster created from backup.
     * Structure is documented below.
     * @return builder
     */
    inline def backupSources(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterBackupSourceArgs.Builder]*):
        com.pulumi.gcp.alloydb.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterBackupSourceArgs.builder
      builder.backupSources(args.map(_(argsBuilder).build)*)

    /**
     * @param backupdrBackupSources Cluster created from a BackupDR backup.
     * Structure is documented below.
     * @return builder
     */
    inline def backupdrBackupSources(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterBackupdrBackupSourceArgs.Builder]*):
        com.pulumi.gcp.alloydb.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterBackupdrBackupSourceArgs.builder
      builder.backupdrBackupSources(args.map(_(argsBuilder).build)*)

    /**
     * @param continuousBackupConfig The continuous backup config for this cluster.
     * If no policy is provided then the default policy will be used. The default policy takes one backup a day and retains backups for 14 days.
     * Structure is documented below.
     * @return builder
     */
    inline def continuousBackupConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterContinuousBackupConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterContinuousBackupConfigArgs.builder
      builder.continuousBackupConfig(args(argsBuilder).build)

    /**
     * @param continuousBackupInfos ContinuousBackupInfo describes the continuous backup properties of a cluster.
     * Structure is documented below.
     * @return builder
     */
    inline def continuousBackupInfos(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterContinuousBackupInfoArgs.Builder]*):
        com.pulumi.gcp.alloydb.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterContinuousBackupInfoArgs.builder
      builder.continuousBackupInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param dataplexConfig Configuration for Dataplex integration. This is an optional field. If not set, Dataplex integration will be enabled by default.
     * Structure is documented below.
     * @return builder
     */
    inline def dataplexConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterDataplexConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterDataplexConfigArgs.builder
      builder.dataplexConfig(args(argsBuilder).build)

    /**
     * @param encryptionConfig EncryptionConfig describes the encryption config of a cluster or a backup that is encrypted with a CMEK (customer-managed encryption key).
     * Structure is documented below.
     * @return builder
     */
    inline def encryptionConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param encryptionInfos (Output)
     * Output only. The encryption information for the WALs and backups required for ContinuousBackup.
     * Structure is documented below.
     * @return builder
     */
    inline def encryptionInfos(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterEncryptionInfoArgs.Builder]*):
        com.pulumi.gcp.alloydb.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterEncryptionInfoArgs.builder
      builder.encryptionInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param initialUser Initial user to setup during cluster creation. If unset for new Clusters, a postgres role with null password is created. You will need to create additional users or set the password in order to log in.
     * Structure is documented below.
     * @return builder
     */
    inline def initialUser(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterInitialUserArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterInitialUserArgs.builder
      builder.initialUser(args(argsBuilder).build)

    /**
     * @param maintenanceUpdatePolicy MaintenanceUpdatePolicy defines the policy for system updates.
     * Structure is documented below.
     * @return builder
     */
    inline def maintenanceUpdatePolicy(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterMaintenanceUpdatePolicyArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterMaintenanceUpdatePolicyArgs.builder
      builder.maintenanceUpdatePolicy(args(argsBuilder).build)

    /**
     * @param migrationSources Cluster created via DMS migration.
     * Structure is documented below.
     * @return builder
     */
    inline def migrationSources(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterMigrationSourceArgs.Builder]*):
        com.pulumi.gcp.alloydb.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterMigrationSourceArgs.builder
      builder.migrationSources(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfig Metadata related to network configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def networkConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterNetworkConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param pscConfig Configuration for Private Service Connect (PSC) for the cluster.
     * Structure is documented below.
     * @return builder
     */
    inline def pscConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterPscConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterPscConfigArgs.builder
      builder.pscConfig(args(argsBuilder).build)

    /**
     * @param restoreBackupSource The source when restoring from a backup. Conflicts with &#39;restore_continuous_backup_source&#39;, &#39;restore_backupdr_backup_source&#39; and &#39;restore_backupdr_pitr_source&#39;, they can&#39;t be set together.
     * Structure is documented below.
     * @return builder
     */
    inline def restoreBackupSource(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterRestoreBackupSourceArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterRestoreBackupSourceArgs.builder
      builder.restoreBackupSource(args(argsBuilder).build)

    /**
     * @param restoreBackupdrBackupSource The source when restoring from a backup. Conflicts with &#39;restore_continuous_backup_source&#39;,  &#39;restore_backup_source&#39; and &#39;restore_backupdr_pitr_source&#39;, they can&#39;t be set together.
     * Structure is documented below.
     * @return builder
     */
    inline def restoreBackupdrBackupSource(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterRestoreBackupdrBackupSourceArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterRestoreBackupdrBackupSourceArgs.builder
      builder.restoreBackupdrBackupSource(args(argsBuilder).build)

    /**
     * @param restoreBackupdrPitrSource The BackupDR source used for point in time recovery. Conflicts with &#39;restore_backupdr_backup_source&#39;, &#39;restore_continuous_backup_source&#39; and &#39;restore_backupdr_backup_source&#39;, they can&#39;t be set togeter.
     * Structure is documented below.
     * @return builder
     */
    inline def restoreBackupdrPitrSource(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterRestoreBackupdrPitrSourceArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterRestoreBackupdrPitrSourceArgs.builder
      builder.restoreBackupdrPitrSource(args(argsBuilder).build)

    /**
     * @param restoreContinuousBackupSource The source when restoring via point in time recovery (PITR). Conflicts with &#39;restore_backup_source&#39;, &#39;restore_backupdr_backup_source&#39; and &#39;restore_backupdr_pitr_source&#39;, they can&#39;t be set together.
     * Structure is documented below.
     * @return builder
     */
    inline def restoreContinuousBackupSource(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterRestoreContinuousBackupSourceArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterRestoreContinuousBackupSourceArgs.builder
      builder.restoreContinuousBackupSource(args(argsBuilder).build)

    /**
     * @param secondaryConfig Configuration of the secondary cluster for Cross Region Replication. This should be set if and only if the cluster is of type SECONDARY.
     * Structure is documented below.
     * @return builder
     */
    inline def secondaryConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterSecondaryConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterSecondaryConfigArgs.builder
      builder.secondaryConfig(args(argsBuilder).build)

    /**
     * @param trialMetadatas Contains information and all metadata related to TRIAL clusters.
     * Structure is documented below.
     * @return builder
     */
    inline def trialMetadatas(args: Endofunction[com.pulumi.gcp.alloydb.inputs.ClusterTrialMetadataArgs.Builder]*):
        com.pulumi.gcp.alloydb.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.alloydb.inputs.ClusterTrialMetadataArgs.builder
      builder.trialMetadatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.alloydb.inputs.InstanceClientConnectionConfigArgs.Builder)
    /**
     * @param sslConfig SSL config option for this instance.
     * Structure is documented below.
     * @return builder
     */
    inline def sslConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.InstanceClientConnectionConfigSslConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.InstanceClientConnectionConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.InstanceClientConnectionConfigSslConfigArgs.builder
      builder.sslConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.alloydb.inputs.InstanceNetworkConfigArgs.Builder)
    /**
     * @param authorizedExternalNetworks A list of external networks authorized to access this instance. This
     * field is only allowed to be set when `enablePublicIp` is set to
     * true.
     * Structure is documented below.
     * @return builder
     */
    inline def authorizedExternalNetworks(args: Endofunction[com.pulumi.gcp.alloydb.inputs.InstanceNetworkConfigAuthorizedExternalNetworkArgs.Builder]*):
        com.pulumi.gcp.alloydb.inputs.InstanceNetworkConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.alloydb.inputs.InstanceNetworkConfigAuthorizedExternalNetworkArgs.builder
      builder.authorizedExternalNetworks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.alloydb.inputs.InstancePscInstanceConfigArgs.Builder)
    /**
     * @param pscAutoConnections Configurations for setting up PSC service automation.
     * Structure is documented below.
     * @return builder
     */
    inline def pscAutoConnections(args: Endofunction[com.pulumi.gcp.alloydb.inputs.InstancePscInstanceConfigPscAutoConnectionArgs.Builder]*):
        com.pulumi.gcp.alloydb.inputs.InstancePscInstanceConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.alloydb.inputs.InstancePscInstanceConfigPscAutoConnectionArgs.builder
      builder.pscAutoConnections(args.map(_(argsBuilder).build)*)

    /**
     * @param pscInterfaceConfigs Configurations for setting up PSC interfaces attached to the instance
     * which are used for outbound connectivity. Currently, AlloyDB supports only 0 or 1 PSC interface.
     * Structure is documented below.
     * @return builder
     */
    inline def pscInterfaceConfigs(args: Endofunction[com.pulumi.gcp.alloydb.inputs.InstancePscInstanceConfigPscInterfaceConfigArgs.Builder]*):
        com.pulumi.gcp.alloydb.inputs.InstancePscInstanceConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.alloydb.inputs.InstancePscInstanceConfigPscInterfaceConfigArgs.builder
      builder.pscInterfaceConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.alloydb.inputs.InstanceState.Builder)
    /**
     * @param clientConnectionConfig Client connection specific configurations.
     * Structure is documented below.
     * @return builder
     */
    inline def clientConnectionConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.InstanceClientConnectionConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.InstanceClientConnectionConfigArgs.builder
      builder.clientConnectionConfig(args(argsBuilder).build)

    /**
     * @param connectionPoolConfig Configuration for Managed Connection Pool.
     * Structure is documented below.
     * @return builder
     */
    inline def connectionPoolConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.InstanceConnectionPoolConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.InstanceConnectionPoolConfigArgs.builder
      builder.connectionPoolConfig(args(argsBuilder).build)

    /**
     * @param machineConfig Configurations for the machines that host the underlying database engine.
     * Structure is documented below.
     * @return builder
     */
    inline def machineConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.InstanceMachineConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.InstanceMachineConfigArgs.builder
      builder.machineConfig(args(argsBuilder).build)

    /**
     * @param networkConfig Instance level network configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def networkConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.InstanceNetworkConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.InstanceNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param observabilityConfig (Optional, Beta)
     * Configuration for enhanced query insights.
     * Structure is documented below.
     * @return builder
     */
    inline def observabilityConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.InstanceObservabilityConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.InstanceObservabilityConfigArgs.builder
      builder.observabilityConfig(args(argsBuilder).build)

    /**
     * @param pscInstanceConfig Configuration for Private Service Connect (PSC) for the instance.
     * Structure is documented below.
     * @return builder
     */
    inline def pscInstanceConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.InstancePscInstanceConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.InstancePscInstanceConfigArgs.builder
      builder.pscInstanceConfig(args(argsBuilder).build)

    /**
     * @param queryInsightsConfig Configuration for query insights.
     * Structure is documented below.
     * @return builder
     */
    inline def queryInsightsConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.InstanceQueryInsightsConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.InstanceQueryInsightsConfigArgs.builder
      builder.queryInsightsConfig(args(argsBuilder).build)

    /**
     * @param readPoolConfig Read pool specific config. If the instance type is READ_POOL, this configuration must be provided.
     * Structure is documented below.
     * @return builder
     */
    inline def readPoolConfig(args: Endofunction[com.pulumi.gcp.alloydb.inputs.InstanceReadPoolConfigArgs.Builder]):
        com.pulumi.gcp.alloydb.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.alloydb.inputs.InstanceReadPoolConfigArgs.builder
      builder.readPoolConfig(args(argsBuilder).build)
