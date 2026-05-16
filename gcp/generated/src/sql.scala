package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object sql:
  /**
   * Creates a new Google SQL SSL Cert on a Google SQL Instance. For more information, see the [official documentation](https://cloud.google.com/sql/), or the [JSON API](https://cloud.google.com/sql/docs/mysql/admin-api/v1beta4/sslCerts).
   * 
   *  Read more about sensitive data in state.
   */
  def SslCert(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.sql.SslCertArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.sql.SslCertArgs.builder
    com.pulumi.gcp.sql.SslCert(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Executes a SQL script to provision in-database resources on a Cloud SQL Instance. For more information, see the [Cloud SQL official documentation](https://cloud.google.com/sql/docs/postgres/executesql-instance), or the [JSON API](https://cloud.google.com/sql/docs/admin-api/v1beta4/instances/executeSql).
   * 
   *  &gt; **Warning:** The SQL script and its execution response might transit through intermediate locations between your client and the location of the target instance.
   * 
   *  &gt; **Note:** Terraform connects to the instance via [IAM database authentication](https://cloud.google.com/sql/docs/mysql/authentication) to execute the script, so the identity account used to apply your Terraform config must exist as an IAM user or IAM service account in the instance. You also need to grant roles or privileges to this IAM user or IAM service account so it has permission to execute statements in your provision scripts. See the example below.
   */
  def ProvisionScript(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.sql.ProvisionScriptArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.sql.ProvisionScriptArgs.builder
    com.pulumi.gcp.sql.ProvisionScript(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.sql.UserArgs.Builder)
    def passwordPolicy(args: Endofunction[com.pulumi.gcp.sql.inputs.UserPasswordPolicyArgs.Builder]):
        com.pulumi.gcp.sql.UserArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.UserPasswordPolicyArgs.builder
      builder.passwordPolicy(args(argsBuilder).build)

  /**
   * Creates a new Google SQL Database Instance. For more information, see the [official documentation](https://cloud.google.com/sql/docs/mysql/create-instance),
   *  or the [JSON API](https://cloud.google.com/sql/docs/admin-api/v1beta4/instances).
   * 
   *  &gt; **NOTE on `gcp.sql.DatabaseInstance`:** - Second-generation instances include a
   *  default &#39;root&#39;{@literal @}&#39;%&#39; user with no password. This user will be deleted by the provider on
   *  instance creation. You should use `gcp.sql.User` to define a custom user with
   *  a restricted host and strong password.
   * 
   *  &gt; **Note**: On newer versions of the provider, you must explicitly set `deletion_protection=false`
   *  (and run `pulumi update` to write the field to state) in order to destroy an instance.
   *  It is recommended to not set this field (or set it to true) until you&#39;re ready to destroy the instance and its databases.
   */
  def DatabaseInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.sql.DatabaseInstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.sql.DatabaseInstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.sql.DatabaseInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a SQL database inside the Cloud SQL instance, hosted in
   *  Google&#39;s cloud.
   */
  def Database(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.sql.DatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.sql.DatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.sql.Database(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Creates a new Google SQL User on a Google SQL User Instance. For more information, see the [official documentation](https://cloud.google.com/sql/), or the [JSON API](https://cloud.google.com/sql/docs/admin-api/v1beta4/users).
   * 
   *  Read more about sensitive data in state. Passwords will not be retrieved when running
   *  &#34;terraform import&#34;.
   * 
   *  &gt; **Note:** Write-Only argument `passwordWo` is available to use in place of `password`. Write-Only arguments are supported in HashiCorp Terraform 1.11.0 and later. Learn more.
   */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.sql.UserArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.sql.UserArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.sql.User(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.sql.DatabaseInstanceArgs.Builder)
    /**
     * @param clone The context needed to create this instance as a clone of another instance. When this field is set during
     *  resource creation, this provider will attempt to clone another instance as indicated in the context. The
     *  configuration is detailed below.
     * @return builder
     */
    def clone_(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceCloneArgs.Builder]):
        com.pulumi.gcp.sql.DatabaseInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceCloneArgs.builder
      builder.clone_(args(argsBuilder).build)

    /**
     * @param pointInTimeRestoreContext The pointInTimeRestoreContext needed for performing a point-in-time recovery of an instance managed by Google Cloud Backup and Disaster Recovery. This field will
     *  cause Terraform to trigger the database to restore to a point in time indicated. The configuration is detailed below.
     *  **NOTE:** Restoring from a backup is an imperative action and not recommended via this provider. Adding or modifying this
     *  block during resource creation/update will trigger the restore action after the resource is created/updated.
     * @return builder
     */
    def pointInTimeRestoreContext(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstancePointInTimeRestoreContextArgs.Builder]):
        com.pulumi.gcp.sql.DatabaseInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstancePointInTimeRestoreContextArgs.builder
      builder.pointInTimeRestoreContext(args(argsBuilder).build)

    /**
     * @param replicaConfiguration The configuration for replication. The
     *  configuration is detailed below.
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
     *  cause the provider to trigger the database to restore from the backup run indicated. The configuration is detailed below.
     *  **NOTE:** Restoring from a backup is an imperative action and not recommended via this provider. Adding or modifying this
     *  block during resource creation/update will trigger the restore action after the resource is created/updated.
     * @return builder
     */
    def restoreBackupContext(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceRestoreBackupContextArgs.Builder]):
        com.pulumi.gcp.sql.DatabaseInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceRestoreBackupContextArgs.builder
      builder.restoreBackupContext(args(argsBuilder).build)

    /**
     * @param settings The settings to use for the database. The
     *  configuration is detailed below. Required if `clone` is not set.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder]):
        com.pulumi.gcp.sql.DatabaseInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  /**
   * A source representation instance is a Cloud SQL instance that represents
   *  the source database server to the Cloud SQL replica. It is visible in the
   *  Cloud Console and appears the same as a regular Cloud SQL instance, but it
   *  contains no data, requires no configuration or maintenance, and does not
   *  affect billing. You cannot update the source representation instance.
   */
  def SourceRepresentationInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.sql.SourceRepresentationInstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.sql.SourceRepresentationInstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.sql.SourceRepresentationInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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

  extension (builder: com.pulumi.gcp.sql.inputs.UserPasswordPolicyArgs.Builder)
    def statuses(args: Endofunction[com.pulumi.gcp.sql.inputs.UserPasswordPolicyStatusArgs.Builder]*):
        com.pulumi.gcp.sql.inputs.UserPasswordPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.sql.inputs.UserPasswordPolicyStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.sql.inputs.DatabaseInstanceState.Builder)
    /**
     * @param clone The context needed to create this instance as a clone of another instance. When this field is set during
     *  resource creation, this provider will attempt to clone another instance as indicated in the context. The
     *  configuration is detailed below.
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
     *  cause Terraform to trigger the database to restore to a point in time indicated. The configuration is detailed below.
     *  **NOTE:** Restoring from a backup is an imperative action and not recommended via this provider. Adding or modifying this
     *  block during resource creation/update will trigger the restore action after the resource is created/updated.
     * @return builder
     */
    def pointInTimeRestoreContext(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstancePointInTimeRestoreContextArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstancePointInTimeRestoreContextArgs.builder
      builder.pointInTimeRestoreContext(args(argsBuilder).build)

    /**
     * @param replicaConfiguration The configuration for replication. The
     *  configuration is detailed below.
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
     *  cause the provider to trigger the database to restore from the backup run indicated. The configuration is detailed below.
     *  **NOTE:** Restoring from a backup is an imperative action and not recommended via this provider. Adding or modifying this
     *  block during resource creation/update will trigger the restore action after the resource is created/updated.
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
     *  configuration is detailed below. Required if `clone` is not set.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.Builder]):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsReadPoolAutoScaleConfigArgs.Builder)
    /**
     * @param targetMetrics Target metrics for Read Pool Auto Scale. Must specify `target_metrics.metric` and `target_metrics.target_value` in subblock.
     * @return builder
     */
    def targetMetrics(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsReadPoolAutoScaleConfigTargetMetricArgs.Builder]*):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsReadPoolAutoScaleConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsReadPoolAutoScaleConfigTargetMetricArgs.builder
      builder.targetMetrics(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.gcp.sql.inputs.UserState.Builder)
    def passwordPolicy(args: Endofunction[com.pulumi.gcp.sql.inputs.UserPasswordPolicyArgs.Builder]):
        com.pulumi.gcp.sql.inputs.UserState.Builder =
      val argsBuilder = com.pulumi.gcp.sql.inputs.UserPasswordPolicyArgs.builder
      builder.passwordPolicy(args(argsBuilder).build)

    def sqlServerUserDetails(args: Endofunction[com.pulumi.gcp.sql.inputs.UserSqlServerUserDetailArgs.Builder]*):
        com.pulumi.gcp.sql.inputs.UserState.Builder =
      def argsBuilder = com.pulumi.gcp.sql.inputs.UserSqlServerUserDetailArgs.builder
      builder.sqlServerUserDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationPscConfigArgs.Builder)
    /**
     * @param pscAutoConnections A comma-separated list of networks or a comma-separated list of network-project pairs. Each project in this list is represented by a project number (numeric) or by a project ID (alphanumeric). This allows Private Service Connect connections to be created automatically for the specified networks.
     * @return builder
     */
    def pscAutoConnections(args: Endofunction[com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationPscConfigPscAutoConnectionArgs.Builder]*):
        com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationPscConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationPscConfigPscAutoConnectionArgs.builder
      builder.pscAutoConnections(args.map(_(argsBuilder).build)*)

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

  object SqlFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to get information about a Cloud SQL instance backup run. */
    inline def getBackupRun(args: Endofunction[com.pulumi.gcp.sql.inputs.GetBackupRunArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.sql.outputs.GetBackupRunResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetBackupRunArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getBackupRun(args(argsBuilder).build)

    /** Use this data source to get information about a Cloud SQL instance backup run. */
    inline def getBackupRunPlain(args: Endofunction[com.pulumi.gcp.sql.inputs.GetBackupRunPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.sql.outputs.GetBackupRunResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetBackupRunPlainArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getBackupRunPlain(args(argsBuilder).build)

    /**
     * Get all of the trusted Certificate Authorities (CAs) for the specified SQL database instance. For more information see the
     *  [official documentation](https://cloud.google.com/sql/)
     *  and
     *  [API](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/instances/listServerCas).
     */
    inline def getCaCerts(args: Endofunction[com.pulumi.gcp.sql.inputs.GetCaCertsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.sql.outputs.GetCaCertsResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetCaCertsArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getCaCerts(args(argsBuilder).build)

    /**
     * Get all of the trusted Certificate Authorities (CAs) for the specified SQL database instance. For more information see the
     *  [official documentation](https://cloud.google.com/sql/)
     *  and
     *  [API](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/instances/listServerCas).
     */
    inline def getCaCertsPlain(args: Endofunction[com.pulumi.gcp.sql.inputs.GetCaCertsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.sql.outputs.GetCaCertsResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetCaCertsPlainArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getCaCertsPlain(args(argsBuilder).build)

    /** Use this data source to get information about a database in a Cloud SQL instance. */
    inline def getDatabase(args: Endofunction[com.pulumi.gcp.sql.inputs.GetDatabaseArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.sql.outputs.GetDatabaseResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetDatabaseArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getDatabase(args(argsBuilder).build)

    /** Use this data source to get information about a database in a Cloud SQL instance. */
    inline def getDatabasePlain(args: Endofunction[com.pulumi.gcp.sql.inputs.GetDatabasePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.sql.outputs.GetDatabaseResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetDatabasePlainArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getDatabasePlain(args(argsBuilder).build)

    /** Use this data source to get information about a Cloud SQL instance. */
    inline def getDatabaseInstance(args: Endofunction[com.pulumi.gcp.sql.inputs.GetDatabaseInstanceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.sql.outputs.GetDatabaseInstanceResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetDatabaseInstanceArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getDatabaseInstance(args(argsBuilder).build)

    /** Use this data source to get information about a Cloud SQL instance. */
    inline def getDatabaseInstancePlain(args: Endofunction[com.pulumi.gcp.sql.inputs.GetDatabaseInstancePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.sql.outputs.GetDatabaseInstanceResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetDatabaseInstancePlainArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getDatabaseInstancePlain(args(argsBuilder).build)

    /**
     * Get Latest Recovery Time for a given instance. For more information see the
     *  [official documentation](https://cloud.google.com/sql/)
     *  and
     *  [API](https://cloud.google.com/sql/docs/postgres/backup-recovery/pitr#get-the-latest-recovery-time).
     */
    inline def getDatabaseInstanceLatestRecoveryTime(args: Endofunction[com.pulumi.gcp.sql.inputs.GetDatabaseInstanceLatestRecoveryTimeArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.sql.outputs.GetDatabaseInstanceLatestRecoveryTimeResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetDatabaseInstanceLatestRecoveryTimeArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getDatabaseInstanceLatestRecoveryTime(args(argsBuilder).build)

    /**
     * Get Latest Recovery Time for a given instance. For more information see the
     *  [official documentation](https://cloud.google.com/sql/)
     *  and
     *  [API](https://cloud.google.com/sql/docs/postgres/backup-recovery/pitr#get-the-latest-recovery-time).
     */
    inline def getDatabaseInstanceLatestRecoveryTimePlain(args: Endofunction[com.pulumi.gcp.sql.inputs.GetDatabaseInstanceLatestRecoveryTimePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.sql.outputs.GetDatabaseInstanceLatestRecoveryTimeResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetDatabaseInstanceLatestRecoveryTimePlainArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getDatabaseInstanceLatestRecoveryTimePlain(args(argsBuilder).build)

    /** Use this data source to get information about a list of Cloud SQL instances in a project. You can also apply some filters over this list to get a more filtered list of Cloud SQL instances. */
    inline def getDatabaseInstances(args: Endofunction[com.pulumi.gcp.sql.inputs.GetDatabaseInstancesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.sql.outputs.GetDatabaseInstancesResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetDatabaseInstancesArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getDatabaseInstances(args(argsBuilder).build)

    /** Use this data source to get information about a list of Cloud SQL instances in a project. You can also apply some filters over this list to get a more filtered list of Cloud SQL instances. */
    inline def getDatabaseInstancesPlain(args: Endofunction[com.pulumi.gcp.sql.inputs.GetDatabaseInstancesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.sql.outputs.GetDatabaseInstancesResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetDatabaseInstancesPlainArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getDatabaseInstancesPlain(args(argsBuilder).build)

    /** Use this data source to get information about a list of databases in a Cloud SQL instance. */
    inline def getDatabases(args: Endofunction[com.pulumi.gcp.sql.inputs.GetDatabasesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.sql.outputs.GetDatabasesResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetDatabasesArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getDatabases(args(argsBuilder).build)

    /** Use this data source to get information about a list of databases in a Cloud SQL instance. */
    inline def getDatabasesPlain(args: Endofunction[com.pulumi.gcp.sql.inputs.GetDatabasesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.sql.outputs.GetDatabasesResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetDatabasesPlainArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getDatabasesPlain(args(argsBuilder).build)

    /**
     * Get all available machine types (tiers) for a project, for example, db-custom-1-3840. For more information see the
     *  [official documentation](https://cloud.google.com/sql/)
     *  and
     *  [API](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/tiers/list).
     */
    inline def getTiers(args: Endofunction[com.pulumi.gcp.sql.inputs.GetTiersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.sql.outputs.GetTiersResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetTiersArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getTiers(args(argsBuilder).build)

    /**
     * Get all available machine types (tiers) for a project, for example, db-custom-1-3840. For more information see the
     *  [official documentation](https://cloud.google.com/sql/)
     *  and
     *  [API](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/tiers/list).
     */
    inline def getTiersPlain(args: Endofunction[com.pulumi.gcp.sql.inputs.GetTiersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.sql.outputs.GetTiersResult] =
      val argsBuilder = com.pulumi.gcp.sql.inputs.GetTiersPlainArgs.builder
      com.pulumi.gcp.sql.SqlFunctions.getTiersPlain(args(argsBuilder).build)
