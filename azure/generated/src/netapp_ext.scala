package jp.ukiba.ko_pulumi
package azure

object netapp_ext:
  extension (builder: com.pulumi.azure.netapp.AccountArgs.Builder)
    /**
     * @param activeDirectory A `activeDirectory` block as defined below.
     * @return builder
     */
    inline def activeDirectory(args: Endofunction[com.pulumi.azure.netapp.inputs.AccountActiveDirectoryArgs.Builder]):
        com.pulumi.azure.netapp.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.AccountActiveDirectoryArgs.builder
      builder.activeDirectory(args(argsBuilder).build)

    /**
     * @param identity The `identity` block where it is used when customer managed keys based encryption will be enabled as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.netapp.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.netapp.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.netapp.SnapshotPolicyArgs.Builder)
    /**
     * @param dailySchedule Sets a daily snapshot schedule. A `dailySchedule` block as defined below.
     * @return builder
     */
    inline def dailySchedule(args: Endofunction[com.pulumi.azure.netapp.inputs.SnapshotPolicyDailyScheduleArgs.Builder]):
        com.pulumi.azure.netapp.SnapshotPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.SnapshotPolicyDailyScheduleArgs.builder
      builder.dailySchedule(args(argsBuilder).build)

    /**
     * @param hourlySchedule Sets an hourly snapshot schedule. A `hourlySchedule` block as defined below.
     * @return builder
     */
    inline def hourlySchedule(args: Endofunction[com.pulumi.azure.netapp.inputs.SnapshotPolicyHourlyScheduleArgs.Builder]):
        com.pulumi.azure.netapp.SnapshotPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.SnapshotPolicyHourlyScheduleArgs.builder
      builder.hourlySchedule(args(argsBuilder).build)

    /**
     * @param monthlySchedule Sets a monthly snapshot schedule. A `monthlySchedule` block as defined below.
     * @return builder
     */
    inline def monthlySchedule(args: Endofunction[com.pulumi.azure.netapp.inputs.SnapshotPolicyMonthlyScheduleArgs.Builder]):
        com.pulumi.azure.netapp.SnapshotPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.SnapshotPolicyMonthlyScheduleArgs.builder
      builder.monthlySchedule(args(argsBuilder).build)

    /**
     * @param weeklySchedule Sets a weekly snapshot schedule. A `weeklySchedule` block as defined below.
     * @return builder
     */
    inline def weeklySchedule(args: Endofunction[com.pulumi.azure.netapp.inputs.SnapshotPolicyWeeklyScheduleArgs.Builder]):
        com.pulumi.azure.netapp.SnapshotPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.SnapshotPolicyWeeklyScheduleArgs.builder
      builder.weeklySchedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.netapp.VolumeArgs.Builder)
    /**
     * @param coolAccess A `coolAccess` block as defined below.
     * @return builder
     */
    inline def coolAccess(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeCoolAccessArgs.Builder]):
        com.pulumi.azure.netapp.VolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeCoolAccessArgs.builder
      builder.coolAccess(args(argsBuilder).build)

    /**
     * @param dataProtectionAdvancedRansomware A `dataProtectionAdvancedRansomware` block as defined below.
     * @return builder
     */
    inline def dataProtectionAdvancedRansomware(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeDataProtectionAdvancedRansomwareArgs.Builder]):
        com.pulumi.azure.netapp.VolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeDataProtectionAdvancedRansomwareArgs.builder
      builder.dataProtectionAdvancedRansomware(args(argsBuilder).build)

    /**
     * @param dataProtectionBackupPolicy A `dataProtectionBackupPolicy` block as defined below.
     * @return builder
     */
    inline def dataProtectionBackupPolicy(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeDataProtectionBackupPolicyArgs.Builder]):
        com.pulumi.azure.netapp.VolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeDataProtectionBackupPolicyArgs.builder
      builder.dataProtectionBackupPolicy(args(argsBuilder).build)

    /**
     * @param dataProtectionReplication A `dataProtectionReplication` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def dataProtectionReplication(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeDataProtectionReplicationArgs.Builder]):
        com.pulumi.azure.netapp.VolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeDataProtectionReplicationArgs.builder
      builder.dataProtectionReplication(args(argsBuilder).build)

    /**
     * @param dataProtectionSnapshotPolicy A `dataProtectionSnapshotPolicy` block as defined below.
     * @return builder
     */
    inline def dataProtectionSnapshotPolicy(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeDataProtectionSnapshotPolicyArgs.Builder]):
        com.pulumi.azure.netapp.VolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeDataProtectionSnapshotPolicyArgs.builder
      builder.dataProtectionSnapshotPolicy(args(argsBuilder).build)

    /**
     * @param exportPolicyRules One or more `exportPolicyRule` block defined below.
     * @return builder
     */
    inline def exportPolicyRules(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeExportPolicyRuleArgs.Builder]*):
        com.pulumi.azure.netapp.VolumeArgs.Builder =
      def argsBuilder = com.pulumi.azure.netapp.inputs.VolumeExportPolicyRuleArgs.builder
      builder.exportPolicyRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.netapp.VolumeBucketArgs.Builder)
    /**
     * @param fileSystemNfsUser A `fileSystemNfsUser` block as defined below. Exactly one of `fileSystemNfsUser` or `fileSystemCifsUsername` must be specified.
     * @return builder
     */
    inline def fileSystemNfsUser(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeBucketFileSystemNfsUserArgs.Builder]):
        com.pulumi.azure.netapp.VolumeBucketArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeBucketFileSystemNfsUserArgs.builder
      builder.fileSystemNfsUser(args(argsBuilder).build)

    /**
     * @param keyVault A `keyVault` block as defined below. Used to store the generated bucket credentials in Azure Key Vault.
     * @return builder
     */
    inline def keyVault(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeBucketKeyVaultArgs.Builder]):
        com.pulumi.azure.netapp.VolumeBucketArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeBucketKeyVaultArgs.builder
      builder.keyVault(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.netapp.VolumeBucketWithServerArgs.Builder)
    /**
     * @param fileSystemNfsUser A `fileSystemNfsUser` block as defined below. Exactly one of `fileSystemNfsUser` or `fileSystemCifsUsername` must be specified.
     * @return builder
     */
    inline def fileSystemNfsUser(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeBucketWithServerFileSystemNfsUserArgs.Builder]):
        com.pulumi.azure.netapp.VolumeBucketWithServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeBucketWithServerFileSystemNfsUserArgs.builder
      builder.fileSystemNfsUser(args(argsBuilder).build)

    /**
     * @param keyVault A `keyVault` block as defined below. Used to source the server certificate and to store generated credentials in Azure Key Vault. Mutually exclusive with `server.0.certificate_pem`.
     * @return builder
     */
    inline def keyVault(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeBucketWithServerKeyVaultArgs.Builder]):
        com.pulumi.azure.netapp.VolumeBucketWithServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeBucketWithServerKeyVaultArgs.builder
      builder.keyVault(args(argsBuilder).build)

    /**
     * @param server A `server` block as defined below. Used to provide the bucket server FQDN and a directly uploaded PEM certificate. The certificate source (`server.0.certificate_pem`) is mutually exclusive with `keyVault`.
     * @return builder
     */
    inline def server(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeBucketWithServerServerArgs.Builder]):
        com.pulumi.azure.netapp.VolumeBucketWithServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeBucketWithServerServerArgs.builder
      builder.server(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.netapp.VolumeGroupOracleArgs.Builder)
    /**
     * @param volumes One or more `volume` blocks as defined below.
     * @return builder
     */
    inline def volumes(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeArgs.Builder]*):
        com.pulumi.azure.netapp.VolumeGroupOracleArgs.Builder =
      def argsBuilder = com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.netapp.VolumeGroupSapHanaArgs.Builder)
    /**
     * @param volumes One or more `volume` blocks as defined below.
     * @return builder
     */
    inline def volumes(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeArgs.Builder]*):
        com.pulumi.azure.netapp.VolumeGroupSapHanaArgs.Builder =
      def argsBuilder = com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.netapp.inputs.AccountState.Builder)
    /**
     * @param activeDirectory A `activeDirectory` block as defined below.
     * @return builder
     */
    inline def activeDirectory(args: Endofunction[com.pulumi.azure.netapp.inputs.AccountActiveDirectoryArgs.Builder]):
        com.pulumi.azure.netapp.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.AccountActiveDirectoryArgs.builder
      builder.activeDirectory(args(argsBuilder).build)

    /**
     * @param identity The `identity` block where it is used when customer managed keys based encryption will be enabled as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.netapp.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.netapp.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.netapp.inputs.GetAccountArgs.Builder)
    inline def identity(args: Endofunction[com.pulumi.azure.netapp.inputs.GetAccountIdentityArgs.Builder]):
        com.pulumi.azure.netapp.inputs.GetAccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetAccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.netapp.inputs.GetAccountPlainArgs.Builder)
    inline def identity(args: Endofunction[com.pulumi.azure.netapp.inputs.GetAccountIdentity.Builder]):
        com.pulumi.azure.netapp.inputs.GetAccountPlainArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetAccountIdentity.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.netapp.inputs.SnapshotPolicyState.Builder)
    /**
     * @param dailySchedule Sets a daily snapshot schedule. A `dailySchedule` block as defined below.
     * @return builder
     */
    inline def dailySchedule(args: Endofunction[com.pulumi.azure.netapp.inputs.SnapshotPolicyDailyScheduleArgs.Builder]):
        com.pulumi.azure.netapp.inputs.SnapshotPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.SnapshotPolicyDailyScheduleArgs.builder
      builder.dailySchedule(args(argsBuilder).build)

    /**
     * @param hourlySchedule Sets an hourly snapshot schedule. A `hourlySchedule` block as defined below.
     * @return builder
     */
    inline def hourlySchedule(args: Endofunction[com.pulumi.azure.netapp.inputs.SnapshotPolicyHourlyScheduleArgs.Builder]):
        com.pulumi.azure.netapp.inputs.SnapshotPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.SnapshotPolicyHourlyScheduleArgs.builder
      builder.hourlySchedule(args(argsBuilder).build)

    /**
     * @param monthlySchedule Sets a monthly snapshot schedule. A `monthlySchedule` block as defined below.
     * @return builder
     */
    inline def monthlySchedule(args: Endofunction[com.pulumi.azure.netapp.inputs.SnapshotPolicyMonthlyScheduleArgs.Builder]):
        com.pulumi.azure.netapp.inputs.SnapshotPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.SnapshotPolicyMonthlyScheduleArgs.builder
      builder.monthlySchedule(args(argsBuilder).build)

    /**
     * @param weeklySchedule Sets a weekly snapshot schedule. A `weeklySchedule` block as defined below.
     * @return builder
     */
    inline def weeklySchedule(args: Endofunction[com.pulumi.azure.netapp.inputs.SnapshotPolicyWeeklyScheduleArgs.Builder]):
        com.pulumi.azure.netapp.inputs.SnapshotPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.SnapshotPolicyWeeklyScheduleArgs.builder
      builder.weeklySchedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.netapp.inputs.VolumeBucketState.Builder)
    /**
     * @param fileSystemNfsUser A `fileSystemNfsUser` block as defined below. Exactly one of `fileSystemNfsUser` or `fileSystemCifsUsername` must be specified.
     * @return builder
     */
    inline def fileSystemNfsUser(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeBucketFileSystemNfsUserArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeBucketState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeBucketFileSystemNfsUserArgs.builder
      builder.fileSystemNfsUser(args(argsBuilder).build)

    /**
     * @param keyVault A `keyVault` block as defined below. Used to store the generated bucket credentials in Azure Key Vault.
     * @return builder
     */
    inline def keyVault(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeBucketKeyVaultArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeBucketState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeBucketKeyVaultArgs.builder
      builder.keyVault(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.netapp.inputs.VolumeBucketWithServerState.Builder)
    /**
     * @param fileSystemNfsUser A `fileSystemNfsUser` block as defined below. Exactly one of `fileSystemNfsUser` or `fileSystemCifsUsername` must be specified.
     * @return builder
     */
    inline def fileSystemNfsUser(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeBucketWithServerFileSystemNfsUserArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeBucketWithServerState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeBucketWithServerFileSystemNfsUserArgs.builder
      builder.fileSystemNfsUser(args(argsBuilder).build)

    /**
     * @param keyVault A `keyVault` block as defined below. Used to source the server certificate and to store generated credentials in Azure Key Vault. Mutually exclusive with `server.0.certificate_pem`.
     * @return builder
     */
    inline def keyVault(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeBucketWithServerKeyVaultArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeBucketWithServerState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeBucketWithServerKeyVaultArgs.builder
      builder.keyVault(args(argsBuilder).build)

    /**
     * @param server A `server` block as defined below. Used to provide the bucket server FQDN and a directly uploaded PEM certificate. The certificate source (`server.0.certificate_pem`) is mutually exclusive with `keyVault`.
     * @return builder
     */
    inline def server(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeBucketWithServerServerArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeBucketWithServerState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeBucketWithServerServerArgs.builder
      builder.server(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.netapp.inputs.VolumeGroupOracleState.Builder)
    /**
     * @param volumes One or more `volume` blocks as defined below.
     * @return builder
     */
    inline def volumes(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeArgs.Builder]*):
        com.pulumi.azure.netapp.inputs.VolumeGroupOracleState.Builder =
      def argsBuilder = com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeArgs.Builder)
    /**
     * @param dataProtectionReplication A `dataProtectionReplication` block as defined below. Changing this forces a new Application Volume Group to be created and data will be lost.
     * @return builder
     */
    inline def dataProtectionReplication(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeDataProtectionReplicationArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeDataProtectionReplicationArgs.builder
      builder.dataProtectionReplication(args(argsBuilder).build)

    /**
     * @param dataProtectionSnapshotPolicy A `dataProtectionSnapshotPolicy` block as defined below.
     * @return builder
     */
    inline def dataProtectionSnapshotPolicy(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeDataProtectionSnapshotPolicyArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeDataProtectionSnapshotPolicyArgs.builder
      builder.dataProtectionSnapshotPolicy(args(argsBuilder).build)

    /**
     * @param exportPolicyRules One or more `exportPolicyRule` blocks as defined below.
     * @return builder
     */
    inline def exportPolicyRules(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeExportPolicyRuleArgs.Builder]*):
        com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeArgs.Builder =
      def argsBuilder = com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeExportPolicyRuleArgs.builder
      builder.exportPolicyRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaState.Builder)
    /**
     * @param volumes One or more `volume` blocks as defined below.
     * @return builder
     */
    inline def volumes(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeArgs.Builder]*):
        com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaState.Builder =
      def argsBuilder = com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeArgs.Builder)
    /**
     * @param dataProtectionReplication A `dataProtectionReplication` block as defined below. Changing this forces a new Application Volume Group to be created and data will be lost.
     * @return builder
     */
    inline def dataProtectionReplication(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeDataProtectionReplicationArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeDataProtectionReplicationArgs.builder
      builder.dataProtectionReplication(args(argsBuilder).build)

    /**
     * @param dataProtectionSnapshotPolicy A `dataProtectionSnapshotPolicy` block as defined below.
     * @return builder
     */
    inline def dataProtectionSnapshotPolicy(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeDataProtectionSnapshotPolicyArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeDataProtectionSnapshotPolicyArgs.builder
      builder.dataProtectionSnapshotPolicy(args(argsBuilder).build)

    /**
     * @param exportPolicyRules One or more `exportPolicyRule` blocks as defined below.
     * @return builder
     */
    inline def exportPolicyRules(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeExportPolicyRuleArgs.Builder]*):
        com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeArgs.Builder =
      def argsBuilder = com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeExportPolicyRuleArgs.builder
      builder.exportPolicyRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.netapp.inputs.VolumeState.Builder)
    /**
     * @param coolAccess A `coolAccess` block as defined below.
     * @return builder
     */
    inline def coolAccess(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeCoolAccessArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeCoolAccessArgs.builder
      builder.coolAccess(args(argsBuilder).build)

    /**
     * @param dataProtectionAdvancedRansomware A `dataProtectionAdvancedRansomware` block as defined below.
     * @return builder
     */
    inline def dataProtectionAdvancedRansomware(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeDataProtectionAdvancedRansomwareArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeDataProtectionAdvancedRansomwareArgs.builder
      builder.dataProtectionAdvancedRansomware(args(argsBuilder).build)

    /**
     * @param dataProtectionBackupPolicy A `dataProtectionBackupPolicy` block as defined below.
     * @return builder
     */
    inline def dataProtectionBackupPolicy(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeDataProtectionBackupPolicyArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeDataProtectionBackupPolicyArgs.builder
      builder.dataProtectionBackupPolicy(args(argsBuilder).build)

    /**
     * @param dataProtectionReplication A `dataProtectionReplication` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def dataProtectionReplication(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeDataProtectionReplicationArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeDataProtectionReplicationArgs.builder
      builder.dataProtectionReplication(args(argsBuilder).build)

    /**
     * @param dataProtectionSnapshotPolicy A `dataProtectionSnapshotPolicy` block as defined below.
     * @return builder
     */
    inline def dataProtectionSnapshotPolicy(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeDataProtectionSnapshotPolicyArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeDataProtectionSnapshotPolicyArgs.builder
      builder.dataProtectionSnapshotPolicy(args(argsBuilder).build)

    /**
     * @param exportPolicyRules One or more `exportPolicyRule` block defined below.
     * @return builder
     */
    inline def exportPolicyRules(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeExportPolicyRuleArgs.Builder]*):
        com.pulumi.azure.netapp.inputs.VolumeState.Builder =
      def argsBuilder = com.pulumi.azure.netapp.inputs.VolumeExportPolicyRuleArgs.builder
      builder.exportPolicyRules(args.map(_(argsBuilder).build)*)
