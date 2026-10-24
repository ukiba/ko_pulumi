package jp.ukiba.ko_pulumi
package gcp

object composer_ext:
  extension (builder: com.pulumi.gcp.composer.EnvironmentArgs.Builder)
    /**
     * @param config Configuration parameters for this environment.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigArgs.Builder]):
        com.pulumi.gcp.composer.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param storageConfig Configuration options for storage used by Composer environment.
     * @return builder
     */
    def storageConfig(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentStorageConfigArgs.Builder]):
        com.pulumi.gcp.composer.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentStorageConfigArgs.builder
      builder.storageConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.composer.inputs.EnvironmentConfigArgs.Builder)
    /**
     * @param dataRetentionConfig The configuration setting for Airflow data retention mechanism. This field is supported for Cloud Composer environments in versions composer-2.0.32-airflow-2.1.4. or newer
     * @return builder
     */
    def dataRetentionConfig(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigDataRetentionConfigArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigDataRetentionConfigArgs.builder
      builder.dataRetentionConfig(args(argsBuilder).build)

    /**
     * @param databaseConfig The configuration of Cloud SQL instance that is used by the Apache Airflow software. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * @return builder
     */
    def databaseConfig(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigDatabaseConfigArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigDatabaseConfigArgs.builder
      builder.databaseConfig(args(argsBuilder).build)

    /**
     * @param encryptionConfig The encryption options for the Composer environment and its dependencies.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param maintenanceWindow The configuration for Cloud Composer maintenance window.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigMaintenanceWindowArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    /**
     * @param masterAuthorizedNetworksConfig Configuration options for the master authorized networks feature. Enabled master authorized networks will disallow all external traffic to access Kubernetes master through HTTPS except traffic from the given CIDR blocks, Google Compute Engine Public IPs and Google Prod IPs.
     * @return builder
     */
    def masterAuthorizedNetworksConfig(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigMasterAuthorizedNetworksConfigArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigMasterAuthorizedNetworksConfigArgs.builder
      builder.masterAuthorizedNetworksConfig(args(argsBuilder).build)

    /**
     * @param nodeConfig The configuration used for the Kubernetes Engine cluster.
     * @return builder
     */
    def nodeConfig(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigNodeConfigArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)

    /**
     * @param privateEnvironmentConfig The configuration used for the Private IP Cloud Composer environment.
     * @return builder
     */
    def privateEnvironmentConfig(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigPrivateEnvironmentConfigArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigPrivateEnvironmentConfigArgs.builder
      builder.privateEnvironmentConfig(args(argsBuilder).build)

    /**
     * @param recoveryConfig The recovery configuration settings for the Cloud Composer environment
     * @return builder
     */
    def recoveryConfig(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigRecoveryConfigArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigRecoveryConfigArgs.builder
      builder.recoveryConfig(args(argsBuilder).build)

    /**
     * @param softwareConfig The configuration settings for software inside the environment.
     * @return builder
     */
    def softwareConfig(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigSoftwareConfigArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigSoftwareConfigArgs.builder
      builder.softwareConfig(args(argsBuilder).build)

    /**
     * @param webServerConfig The configuration settings for the Airflow web server App Engine instance. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * @return builder
     */
    def webServerConfig(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigWebServerConfigArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigWebServerConfigArgs.builder
      builder.webServerConfig(args(argsBuilder).build)

    /**
     * @param webServerNetworkAccessControl Network-level access control policy for the Airflow web server.
     * @return builder
     */
    def webServerNetworkAccessControl(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigWebServerNetworkAccessControlArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigWebServerNetworkAccessControlArgs.builder
      builder.webServerNetworkAccessControl(args(argsBuilder).build)

    /**
     * @param workloadsConfig The workloads configuration settings for the GKE cluster associated with the Cloud Composer environment. Supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * @return builder
     */
    def workloadsConfig(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigArgs.builder
      builder.workloadsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.composer.inputs.EnvironmentConfigDataRetentionConfigArgs.Builder)
    /**
     * @param airflowMetadataRetentionConfigs Optional. The policy for airflow metadata database retention.
     * @return builder
     */
    def airflowMetadataRetentionConfigs(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigDataRetentionConfigAirflowMetadataRetentionConfigArgs.Builder]*):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigDataRetentionConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigDataRetentionConfigAirflowMetadataRetentionConfigArgs.builder
      builder.airflowMetadataRetentionConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param taskLogsRetentionConfigs Optional. The configuration setting for Task Logs.
     * @return builder
     */
    def taskLogsRetentionConfigs(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigDataRetentionConfigTaskLogsRetentionConfigArgs.Builder]*):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigDataRetentionConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigDataRetentionConfigTaskLogsRetentionConfigArgs.builder
      builder.taskLogsRetentionConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.composer.inputs.EnvironmentConfigMasterAuthorizedNetworksConfigArgs.Builder)
    /**
     * @param cidrBlocks cidr_blocks define up to 50 external networks that could access Kubernetes master through HTTPS.
     * @return builder
     */
    def cidrBlocks(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs.Builder]*):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigMasterAuthorizedNetworksConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs.builder
      builder.cidrBlocks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.composer.inputs.EnvironmentConfigNodeConfigArgs.Builder)
    /**
     * @param ipAllocationPolicy Configuration for controlling how IPs are allocated in the GKE cluster. Cannot be updated.
     * @return builder
     */
    def ipAllocationPolicy(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigNodeConfigIpAllocationPolicyArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigNodeConfigIpAllocationPolicyArgs.builder
      builder.ipAllocationPolicy(args(argsBuilder).build)

    /**
     * @param trafficRoutingConfig Traffic routing configuration for Cloud Composer environment.
     * @return builder
     */
    def trafficRoutingConfig(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigNodeConfigTrafficRoutingConfigArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigNodeConfigTrafficRoutingConfigArgs.builder
      builder.trafficRoutingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.composer.inputs.EnvironmentConfigRecoveryConfigArgs.Builder)
    /**
     * @param scheduledSnapshotsConfig The configuration settings for scheduled snapshots.
     * @return builder
     */
    def scheduledSnapshotsConfig(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigRecoveryConfigScheduledSnapshotsConfigArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigRecoveryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigRecoveryConfigScheduledSnapshotsConfigArgs.builder
      builder.scheduledSnapshotsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.composer.inputs.EnvironmentConfigSoftwareConfigArgs.Builder)
    /**
     * @param cloudDataLineageIntegration The configuration for Cloud Data Lineage integration. Supported for Cloud Composer environments in versions composer-2.1.2-airflow-*.*.* and newer
     * @return builder
     */
    def cloudDataLineageIntegration(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigSoftwareConfigCloudDataLineageIntegrationArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigSoftwareConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigSoftwareConfigCloudDataLineageIntegrationArgs.builder
      builder.cloudDataLineageIntegration(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.composer.inputs.EnvironmentConfigWebServerNetworkAccessControlArgs.Builder)
    /**
     * @param allowedIpRanges A collection of allowed IP ranges with descriptions.
     * @return builder
     */
    def allowedIpRanges(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeArgs.Builder]*):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigWebServerNetworkAccessControlArgs.Builder =
      def argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeArgs.builder
      builder.allowedIpRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigArgs.Builder)
    /**
     * @param dagProcessor Configuration for resources used by DAG processor.
     * @return builder
     */
    def dagProcessor(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigDagProcessorArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigDagProcessorArgs.builder
      builder.dagProcessor(args(argsBuilder).build)

    /**
     * @param scheduler Configuration for resources used by Airflow schedulers.
     * @return builder
     */
    def scheduler(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigSchedulerArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigSchedulerArgs.builder
      builder.scheduler(args(argsBuilder).build)

    /**
     * @param triggerer Configuration for resources used by Airflow triggerers.
     * @return builder
     */
    def triggerer(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigTriggererArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigTriggererArgs.builder
      builder.triggerer(args(argsBuilder).build)

    /**
     * @param webServer Configuration for resources used by Airflow web server.
     * @return builder
     */
    def webServer(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigWebServerArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigWebServerArgs.builder
      builder.webServer(args(argsBuilder).build)

    /**
     * @param worker Configuration for resources used by Airflow workers.
     * @return builder
     */
    def worker(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigWorkerArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigWorkerArgs.builder
      builder.worker(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.composer.inputs.EnvironmentState.Builder)
    /**
     * @param config Configuration parameters for this environment.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param storageConfig Configuration options for storage used by Composer environment.
     * @return builder
     */
    def storageConfig(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentStorageConfigArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentStorageConfigArgs.builder
      builder.storageConfig(args(argsBuilder).build)
