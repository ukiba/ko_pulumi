package jp.ukiba.ko_pulumi
package gcp

object sql_ext:
  extension (builder: com.pulumi.gcp.sql.DatabaseInstanceArgs.Builder)
    /**
     * @param blueGreenDeployment The configuration for a Cloud SQL Blue-Green Deployment on this instance. The configuration is detailed below.
     * &gt; **WARNING:** Because `blueGreenDeployment` is authoritatively managed by Terraform on the primary instance resource, if a Blue-Green Deployment is created on this instance outside of Terraform (for example, via `gcloud` or the Cloud Console) and the `blueGreenDeployment` block is not present in your Terraform configuration, running `pulumi up` will delete the out-of-band Blue-Green Deployment along with its green target instance.
     * @return builder
     */
    def blueGreenDeployment(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceBlueGreenDeploymentArgs.Builder]):
        com.pulumi.gcp.sql.DatabaseInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceBlueGreenDeploymentArgs.builder
      builder.blueGreenDeployment(args(argsBuilder).build)

    /**
     * @param clone The context needed to create this instance as a clone of another instance. When this field is set during
     * resource creation, this provider will attempt to clone another instance as indicated in the context. The
     * configuration is detailed below.
     * @return builder
     */
    def clone_(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceCloneArgs.Builder]):
        com.pulumi.gcp.sql.DatabaseInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceCloneArgs.builder
      builder.clone_(args(argsBuilder).build)

    /**
     * @param pointInTimeRestoreContext The pointInTimeRestoreContext needed for performing a point-in-time recovery of an instance managed by Google Cloud Backup and Disaster Recovery. This field will
     * cause Terraform to trigger the database to restore to a point in time indicated. The configuration is detailed below.
     * **NOTE:** Restoring from a backup is an imperative action and not recommended via this provider. Adding or modifying this
     * block during resource creation/update will trigger the restore action after the resource is created/updated.
     * @return builder
     */
    def pointInTimeRestoreContext(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstancePointInTimeRestoreContextArgs.Builder]):
        com.pulumi.gcp.sql.DatabaseInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstancePointInTimeRestoreContextArgs.builder
      builder.pointInTimeRestoreContext(args(argsBuilder).build)

    /**
     * @param replicaConfiguration The configuration for replication. The
     * configuration is detailed below.
     * @return builder
     */
    def replicaConfiguration(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceReplicaConfigurationArgs.Builder]):
        com.pulumi.gcp.sql.DatabaseInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceReplicaConfigurationArgs.builder
      builder.replicaConfiguration(args(argsBuilder).build)

    /**
     * @param replicationCluster A primary instance and disaster recovery replica pair. Applicable to MySQL and PostgreSQL. This field can be set if the primary has psaWriteEndpoint set or both the primary and replica are created.
     * @return builder
     */
    def replicationCluster(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceReplicationClusterArgs.Builder]):
        com.pulumi.gcp.sql.DatabaseInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceReplicationClusterArgs.builder
      builder.replicationCluster(args(argsBuilder).build)

    /**
     * @param restoreBackupContext The context needed to restore the database to a backup run. This field will
     * cause the provider to trigger the database to restore from the backup run indicated. The configuration is detailed below.
     * **NOTE:** Restoring from a backup is an imperative action and not recommended via this provider. Adding or modifying this
     * block during resource creation/update will trigger the restore action after the resource is created/updated.
     * @return builder
     */
    def restoreBackupContext(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceRestoreBackupContextArgs.Builder]):
        com.pulumi.gcp.sql.DatabaseInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceRestoreBackupContextArgs.builder
      builder.restoreBackupContext(args(argsBuilder).build)

    /**
     * @param settings The settings to use for the database. The
     * configuration is detailed below. Required if `clone` is not set.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder]):
        com.pulumi.gcp.sql.DatabaseInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.sql.UserArgs.Builder)
    def passwordPolicy(args: Endofunction[com.pulumi.gcp.sql.inputs.UserPasswordPolicyArgs.Builder]):
        com.pulumi.gcp.sql.UserArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.UserPasswordPolicyArgs.builder
      builder.passwordPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.sql.inputs.DatabaseInstanceBlueGreenDeploymentArgs.Builder)
    /**
     * @param targetInstanceIpAddresses The IP addresses assigned to the green (target) instance. Structure is documented below.
     * @return builder
     */
    def targetInstanceIpAddresses(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceBlueGreenDeploymentTargetInstanceIpAddressArgs.Builder]*):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceBlueGreenDeploymentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceBlueGreenDeploymentTargetInstanceIpAddressArgs.builder
      builder.targetInstanceIpAddresses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder)
    def activeDirectoryConfig(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsActiveDirectoryConfigArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsActiveDirectoryConfigArgs.builder
      builder.activeDirectoryConfig(args(argsBuilder).build)

    def advancedMachineFeatures(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsAdvancedMachineFeaturesArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsAdvancedMachineFeaturesArgs.builder
      builder.advancedMachineFeatures(args(argsBuilder).build)

    def backupConfiguration(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsBackupConfigurationArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsBackupConfigurationArgs.builder
      builder.backupConfiguration(args(argsBuilder).build)

    /**
     * @param connectionPoolConfigs The managed connection pool setting for a Cloud SQL instance.
     * @return builder
     */
    def connectionPoolConfigs(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsConnectionPoolConfigArgs.Builder]*):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsConnectionPoolConfigArgs.builder
      builder.connectionPoolConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param dataCacheConfig Data cache configurations.
     * @return builder
     */
    def dataCacheConfig(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsDataCacheConfigArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsDataCacheConfigArgs.builder
      builder.dataCacheConfig(args(argsBuilder).build)

    def databaseFlags(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsDatabaseFlagArgs.Builder]*):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsDatabaseFlagArgs.builder
      builder.databaseFlags(args.map(_(argsBuilder).build)*)

    def denyMaintenancePeriod(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsDenyMaintenancePeriodArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsDenyMaintenancePeriodArgs.builder
      builder.denyMaintenancePeriod(args(argsBuilder).build)

    /**
     * @param entraidConfig The Microsoft Entra ID configuration for the SQL Server instance.
     * @return builder
     */
    def entraidConfig(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsEntraidConfigArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsEntraidConfigArgs.builder
      builder.entraidConfig(args(argsBuilder).build)

    /**
     * @param finalBackupConfig Config used to determine the final backup settings for the instance
     * @return builder
     */
    def finalBackupConfig(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsFinalBackupConfigArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsFinalBackupConfigArgs.builder
      builder.finalBackupConfig(args(argsBuilder).build)

    /**
     * @param insightsConfig Configuration of Query Insights.
     * @return builder
     */
    def insightsConfig(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsInsightsConfigArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsInsightsConfigArgs.builder
      builder.insightsConfig(args(argsBuilder).build)

    def ipConfiguration(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationArgs.builder
      builder.ipConfiguration(args(argsBuilder).build)

    def locationPreference(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsLocationPreferenceArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsLocationPreferenceArgs.builder
      builder.locationPreference(args(argsBuilder).build)

    /**
     * @param maintenanceWindow Declares a one-hour maintenance window when an Instance can automatically restart to apply updates. The maintenance window is specified in UTC time.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsMaintenanceWindowArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    def passwordValidationPolicy(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsPasswordValidationPolicyArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsPasswordValidationPolicyArgs.builder
      builder.passwordValidationPolicy(args(argsBuilder).build)

    /**
     * @param performanceCaptureConfig Configuration of Performance Capture.
     * @return builder
     */
    def performanceCaptureConfig(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsPerformanceCaptureConfigArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsPerformanceCaptureConfigArgs.builder
      builder.performanceCaptureConfig(args(argsBuilder).build)

    /**
     * @param readPoolAutoScaleConfig Configuration of Read Pool Auto Scale.
     * @return builder
     */
    def readPoolAutoScaleConfig(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsReadPoolAutoScaleConfigArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsReadPoolAutoScaleConfigArgs.builder
      builder.readPoolAutoScaleConfig(args(argsBuilder).build)

    def sqlServerAuditConfig(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsSqlServerAuditConfigArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsSqlServerAuditConfigArgs.builder
      builder.sqlServerAuditConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsBackupConfigurationArgs.Builder)
    /**
     * @param backupRetentionSettings Backup retention settings. The configuration is detailed below.
     * @return builder
     */
    def backupRetentionSettings(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsBackupConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs.builder
      builder.backupRetentionSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsConnectionPoolConfigArgs.Builder)
    /**
     * @param flags List of connection pool configuration flags
     * @return builder
     */
    def flags(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsConnectionPoolConfigFlagArgs.Builder]*):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsConnectionPoolConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsConnectionPoolConfigFlagArgs.builder
      builder.flags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationArgs.Builder)
    def authorizedNetworks(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs.Builder]*):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs.builder
      builder.authorizedNetworks(args.map(_(argsBuilder).build)*)

    /**
     * @param pscConfigs PSC settings for a Cloud SQL instance.
     * @return builder
     */
    def pscConfigs(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationPscConfigArgs.Builder]*):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationPscConfigArgs.builder
      builder.pscConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationPscConfigArgs.Builder)
    /**
     * @param pscAutoConnections A comma-separated list of networks or a comma-separated list of network-project pairs. Each project in this list is represented by a project number (numeric) or by a project ID (alphanumeric). This allows Private Service Connect connections to be created automatically for the specified networks.
     * @return builder
     */
    def pscAutoConnections(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationPscConfigPscAutoConnectionArgs.Builder]*):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationPscConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationPscConfigPscAutoConnectionArgs.builder
      builder.pscAutoConnections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsReadPoolAutoScaleConfigArgs.Builder)
    /**
     * @param targetMetrics Target metrics for Read Pool Auto Scale. Must specify `target_metrics.metric` and `target_metrics.target_value` in subblock.
     * @return builder
     */
    def targetMetrics(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsReadPoolAutoScaleConfigTargetMetricArgs.Builder]*):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsReadPoolAutoScaleConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsReadPoolAutoScaleConfigTargetMetricArgs.builder
      builder.targetMetrics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.sql.inputs.DatabaseInstanceState.Builder)
    /**
     * @param blueGreenDeployment The configuration for a Cloud SQL Blue-Green Deployment on this instance. The configuration is detailed below.
     * &gt; **WARNING:** Because `blueGreenDeployment` is authoritatively managed by Terraform on the primary instance resource, if a Blue-Green Deployment is created on this instance outside of Terraform (for example, via `gcloud` or the Cloud Console) and the `blueGreenDeployment` block is not present in your Terraform configuration, running `pulumi up` will delete the out-of-band Blue-Green Deployment along with its green target instance.
     * @return builder
     */
    def blueGreenDeployment(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceBlueGreenDeploymentArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceBlueGreenDeploymentArgs.builder
      builder.blueGreenDeployment(args(argsBuilder).build)

    /**
     * @param clone The context needed to create this instance as a clone of another instance. When this field is set during
     * resource creation, this provider will attempt to clone another instance as indicated in the context. The
     * configuration is detailed below.
     * @return builder
     */
    def clone_(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceCloneArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceCloneArgs.builder
      builder.clone_(args(argsBuilder).build)

    /**
     * @param dnsNames The list of DNS names used by this instance. Different connection types for an instance may have different DNS names. DNS names can apply to an individual instance or a cluster of instances.
     * @return builder
     */
    def dnsNames(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceDnsNameArgs.Builder]*):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceDnsNameArgs.builder
      builder.dnsNames(args.map(_(argsBuilder).build)*)

    def ipAddresses(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceIpAddressArgs.Builder]*):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceIpAddressArgs.builder
      builder.ipAddresses(args.map(_(argsBuilder).build)*)

    /**
     * @param pointInTimeRestoreContext The pointInTimeRestoreContext needed for performing a point-in-time recovery of an instance managed by Google Cloud Backup and Disaster Recovery. This field will
     * cause Terraform to trigger the database to restore to a point in time indicated. The configuration is detailed below.
     * **NOTE:** Restoring from a backup is an imperative action and not recommended via this provider. Adding or modifying this
     * block during resource creation/update will trigger the restore action after the resource is created/updated.
     * @return builder
     */
    def pointInTimeRestoreContext(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstancePointInTimeRestoreContextArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstancePointInTimeRestoreContextArgs.builder
      builder.pointInTimeRestoreContext(args(argsBuilder).build)

    /**
     * @param replicaConfiguration The configuration for replication. The
     * configuration is detailed below.
     * @return builder
     */
    def replicaConfiguration(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceReplicaConfigurationArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceReplicaConfigurationArgs.builder
      builder.replicaConfiguration(args(argsBuilder).build)

    /**
     * @param replicationCluster A primary instance and disaster recovery replica pair. Applicable to MySQL and PostgreSQL. This field can be set if the primary has psaWriteEndpoint set or both the primary and replica are created.
     * @return builder
     */
    def replicationCluster(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceReplicationClusterArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceReplicationClusterArgs.builder
      builder.replicationCluster(args(argsBuilder).build)

    /**
     * @param restoreBackupContext The context needed to restore the database to a backup run. This field will
     * cause the provider to trigger the database to restore from the backup run indicated. The configuration is detailed below.
     * **NOTE:** Restoring from a backup is an imperative action and not recommended via this provider. Adding or modifying this
     * block during resource creation/update will trigger the restore action after the resource is created/updated.
     * @return builder
     */
    def restoreBackupContext(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceRestoreBackupContextArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceRestoreBackupContextArgs.builder
      builder.restoreBackupContext(args(argsBuilder).build)

    def serverCaCerts(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceServerCaCertArgs.Builder]*):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceServerCaCertArgs.builder
      builder.serverCaCerts(args.map(_(argsBuilder).build)*)

    /**
     * @param settings The settings to use for the database. The
     * configuration is detailed below. Required if `clone` is not set.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.sql.inputs.UserPasswordPolicyArgs.Builder)
    def statuses(args: Endofunction[com.pulumi.gcp.sql.inputs.UserPasswordPolicyStatusArgs.Builder]*):
        com.pulumi.gcp.sql.inputs.UserPasswordPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.sql.inputs.UserPasswordPolicyStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.sql.inputs.UserState.Builder)
    def passwordPolicy(args: Endofunction[com.pulumi.gcp.sql.inputs.UserPasswordPolicyArgs.Builder]):
        com.pulumi.gcp.sql.inputs.UserState.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.UserPasswordPolicyArgs.builder
      builder.passwordPolicy(args(argsBuilder).build)

    def sqlServerUserDetails(args: Endofunction[com.pulumi.gcp.sql.inputs.UserSqlServerUserDetailArgs.Builder]*):
        com.pulumi.gcp.sql.inputs.UserState.Builder =
      def argsBuilder = com.pulumi.gcp.sql.inputs.UserSqlServerUserDetailArgs.builder
      builder.sqlServerUserDetails(args.map(_(argsBuilder).build)*)
