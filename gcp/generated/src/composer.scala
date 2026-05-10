package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object composer:
  /**
   * An environment for running orchestration tasks.
   * 
   *  Environments run Apache Airflow software on Google infrastructure.
   * 
   *  To get more information about Environments, see:
   * 
   *  * [Cloud Composer documentation](https://cloud.google.com/composer/docs)
   *  * [Cloud Composer API documentation](https://cloud.google.com/composer/docs/reference/rest/v1beta1/projects.locations.environments)
   *  * How-to Guides (Cloud Composer 2)
   *    * [Creating environments](https://cloud.google.com/composer/docs/composer-2/create-environments)
   *    * [Scaling environments](https://cloud.google.com/composer/docs/composer-2/scale-environments)
   *    * [Configuring Shared VPC for Composer Environments](https://cloud.google.com/composer/docs/composer-2/configure-shared-vpc)
   *  * How-to Guides (Cloud Composer 3)
   *    * [Creating environments](https://cloud.google.com/composer/docs/composer-3/create-environments)
   *    * [Scaling environments](https://cloud.google.com/composer/docs/composer-3/scale-environments)
   *    * [Change environment networking type (Private or Public IP)](https://cloud.google.com/composer/docs/composer-3/change-networking-type)
   *    * [Connect an environment to a VPC network](https://cloud.google.com/composer/docs/composer-3/connect-vpc-network)
   *  * [Apache Airflow Documentation](http://airflow.apache.org/)
   * 
   *  &gt; **Note**
   *    Cloud Composer 1 is in the post-maintenance mode. Google does
   *    not release any further updates to Cloud Composer 1, including new versions
   *    of Airflow, bugfixes, and security updates. We recommend using
   *    Cloud Composer 2 or Cloud Composer 3 instead.
   * 
   *  We **STRONGLY** recommend you read the [GCP
   *  guides](https://cloud.google.com/composer/docs/how-to) as the Environment resource requires a long
   *  deployment process and involves several layers of GCP infrastructure, including a Kubernetes Engine
   *  cluster, Cloud Storage, and Compute networking resources. Due to limitations of the API, Pulumi
   *  will not be able to find or manage many of these underlying resources automatically. In particular:
   *  * Creating or updating an environment resource can take up to one hour. In addition, GCP may only
   *    detect some errors in the configuration when they are used (e.g., ~40-50 minutes into the creation
   *    process), and is prone to limited error reporting. If you encounter confusing or uninformative
   *    errors, please verify your configuration is valid against GCP Cloud Composer before filing bugs
   *    against the provider.
   *  * **Environments create Google Cloud Storage buckets that are not automatically cleaned up**
   *    on environment deletion. [More about Composer&#39;s use of Cloud
   *    Storage](https://cloud.google.com/composer/docs/concepts/cloud-storage).
   *  * Please review the [known
   *    issues](https://cloud.google.com/composer/docs/known-issues) for Composer if you are having
   *    problems.
   */
  def Environment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.composer.EnvironmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.composer.EnvironmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.composer.Environment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type ComposerFunctions = com.pulumi.gcp.composer.ComposerFunctions
  object ComposerFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.composer.ComposerFunctions.*
  extension (self: ComposerFunctions.type)
    /**
     * Provides access to Cloud Composer environment configuration in a region for a given project.
     * 
     *  To get more information about Composer Environment, see:
     * 
     *  * [API documentation](https://cloud.google.com/composer/docs/reference/rest/v1/projects.locations.environments)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/composer/docs/concepts/overview)
     */
    def getEnvironment(args: Endofunction[com.pulumi.gcp.composer.inputs.GetEnvironmentArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.composer.outputs.GetEnvironmentResult] =
      val argsBuilder = com.pulumi.gcp.composer.inputs.GetEnvironmentArgs.builder
      com.pulumi.gcp.composer.ComposerFunctions.getEnvironment(args(argsBuilder).build)

    /**
     * Provides access to Cloud Composer environment configuration in a region for a given project.
     * 
     *  To get more information about Composer Environment, see:
     * 
     *  * [API documentation](https://cloud.google.com/composer/docs/reference/rest/v1/projects.locations.environments)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/composer/docs/concepts/overview)
     */
    def getEnvironmentPlain(args: Endofunction[com.pulumi.gcp.composer.inputs.GetEnvironmentPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.composer.outputs.GetEnvironmentResult] =
      val argsBuilder = com.pulumi.gcp.composer.inputs.GetEnvironmentPlainArgs.builder
      com.pulumi.gcp.composer.ComposerFunctions.getEnvironmentPlain(args(argsBuilder).build)

    /**
     * Provides access to available Cloud Composer versions in a region for a given project.
     * 
     *  To get more information about Composer Image Versions, see:
     * 
     *  * [API documentation](https://cloud.google.com/composer/docs/reference/rest/v1/projects.locations.imageVersions)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/composer/docs/concepts/overview)
     */
    def getImageVersions(args: Endofunction[com.pulumi.gcp.composer.inputs.GetImageVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.composer.outputs.GetImageVersionsResult] =
      val argsBuilder = com.pulumi.gcp.composer.inputs.GetImageVersionsArgs.builder
      com.pulumi.gcp.composer.ComposerFunctions.getImageVersions(args(argsBuilder).build)

    /**
     * Provides access to available Cloud Composer versions in a region for a given project.
     * 
     *  To get more information about Composer Image Versions, see:
     * 
     *  * [API documentation](https://cloud.google.com/composer/docs/reference/rest/v1/projects.locations.imageVersions)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/composer/docs/concepts/overview)
     */
    def getImageVersionsPlain(args: Endofunction[com.pulumi.gcp.composer.inputs.GetImageVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.composer.outputs.GetImageVersionsResult] =
      val argsBuilder = com.pulumi.gcp.composer.inputs.GetImageVersionsPlainArgs.builder
      com.pulumi.gcp.composer.ComposerFunctions.getImageVersionsPlain(args(argsBuilder).build)

    /**
     * Provides access to Kubernetes ConfigMap configuration for a given project, region and Composer Environment.
     * 
     *  To get more information about Composer User Workloads Config Map, see:
     * 
     *  * [API documentation](https://cloud.google.com/composer/docs/reference/rest/v1/projects.locations.environments.userWorkloadsConfigMaps)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/composer/docs/concepts/overview)
     */
    def getUserWorkloadsConfigMap(args: Endofunction[com.pulumi.gcp.composer.inputs.GetUserWorkloadsConfigMapArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.composer.outputs.GetUserWorkloadsConfigMapResult] =
      val argsBuilder = com.pulumi.gcp.composer.inputs.GetUserWorkloadsConfigMapArgs.builder
      com.pulumi.gcp.composer.ComposerFunctions.getUserWorkloadsConfigMap(args(argsBuilder).build)

    /**
     * Provides access to Kubernetes ConfigMap configuration for a given project, region and Composer Environment.
     * 
     *  To get more information about Composer User Workloads Config Map, see:
     * 
     *  * [API documentation](https://cloud.google.com/composer/docs/reference/rest/v1/projects.locations.environments.userWorkloadsConfigMaps)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/composer/docs/concepts/overview)
     */
    def getUserWorkloadsConfigMapPlain(args: Endofunction[com.pulumi.gcp.composer.inputs.GetUserWorkloadsConfigMapPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.composer.outputs.GetUserWorkloadsConfigMapResult] =
      val argsBuilder = com.pulumi.gcp.composer.inputs.GetUserWorkloadsConfigMapPlainArgs.builder
      com.pulumi.gcp.composer.ComposerFunctions.getUserWorkloadsConfigMapPlain(args(argsBuilder).build)

    /**
     * Provides access to Kubernetes Secret configuration for a given project, region and Composer Environment.
     * 
     *  To get more information about Composer User Workloads Secrets, see:
     * 
     *  * [API documentation](https://cloud.google.com/composer/docs/reference/rest/v1/projects.locations.environments.userWorkloadsSecrets)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/artifact-registry/docs/overview)
     */
    def getUserWorkloadsSecret(args: Endofunction[com.pulumi.gcp.composer.inputs.GetUserWorkloadsSecretArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.composer.outputs.GetUserWorkloadsSecretResult] =
      val argsBuilder = com.pulumi.gcp.composer.inputs.GetUserWorkloadsSecretArgs.builder
      com.pulumi.gcp.composer.ComposerFunctions.getUserWorkloadsSecret(args(argsBuilder).build)

    /**
     * Provides access to Kubernetes Secret configuration for a given project, region and Composer Environment.
     * 
     *  To get more information about Composer User Workloads Secrets, see:
     * 
     *  * [API documentation](https://cloud.google.com/composer/docs/reference/rest/v1/projects.locations.environments.userWorkloadsSecrets)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/artifact-registry/docs/overview)
     */
    def getUserWorkloadsSecretPlain(args: Endofunction[com.pulumi.gcp.composer.inputs.GetUserWorkloadsSecretPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.composer.outputs.GetUserWorkloadsSecretResult] =
      val argsBuilder = com.pulumi.gcp.composer.inputs.GetUserWorkloadsSecretPlainArgs.builder
      com.pulumi.gcp.composer.ComposerFunctions.getUserWorkloadsSecretPlain(args(argsBuilder).build)

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

  /**
   * User workloads Secret used by Airflow tasks that run with Kubernetes Executor or KubernetesPodOperator.
   *  Intended for Composer 3 Environments.
   */
  def UserWorkloadsSecret(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.composer.UserWorkloadsSecretArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.composer.UserWorkloadsSecretArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.composer.UserWorkloadsSecret(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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

  extension (builder: com.pulumi.gcp.composer.inputs.EnvironmentConfigMasterAuthorizedNetworksConfigArgs.Builder)
    /**
     * @param cidrBlocks cidr_blocks define up to 50 external networks that could access Kubernetes master through HTTPS.
     * @return builder
     */
    def cidrBlocks(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs.Builder]*):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigMasterAuthorizedNetworksConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs.builder
      builder.cidrBlocks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.composer.inputs.EnvironmentConfigSoftwareConfigArgs.Builder)
    /**
     * @param cloudDataLineageIntegration The configuration for Cloud Data Lineage integration. Supported for Cloud Composer environments in versions composer-2.1.2-airflow-*.*.* and newer
     * @return builder
     */
    def cloudDataLineageIntegration(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigSoftwareConfigCloudDataLineageIntegrationArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigSoftwareConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigSoftwareConfigCloudDataLineageIntegrationArgs.builder
      builder.cloudDataLineageIntegration(args(argsBuilder).build)

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

  extension (builder: com.pulumi.gcp.composer.inputs.EnvironmentConfigNodeConfigArgs.Builder)
    /**
     * @param ipAllocationPolicy Configuration for controlling how IPs are allocated in the GKE cluster. Cannot be updated.
     * @return builder
     */
    def ipAllocationPolicy(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigNodeConfigIpAllocationPolicyArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigNodeConfigIpAllocationPolicyArgs.builder
      builder.ipAllocationPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.composer.inputs.EnvironmentConfigRecoveryConfigArgs.Builder)
    /**
     * @param scheduledSnapshotsConfig The configuration settings for scheduled snapshots.
     * @return builder
     */
    def scheduledSnapshotsConfig(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigRecoveryConfigScheduledSnapshotsConfigArgs.Builder]):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigRecoveryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigRecoveryConfigScheduledSnapshotsConfigArgs.builder
      builder.scheduledSnapshotsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.composer.inputs.EnvironmentConfigWebServerNetworkAccessControlArgs.Builder)
    /**
     * @param allowedIpRanges A collection of allowed IP ranges with descriptions.
     * @return builder
     */
    def allowedIpRanges(args: Endofunction[com.pulumi.gcp.composer.inputs.EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeArgs.Builder]*):
        com.pulumi.gcp.composer.inputs.EnvironmentConfigWebServerNetworkAccessControlArgs.Builder =
      def argsBuilder = com.pulumi.gcp.composer.inputs.EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeArgs.builder
      builder.allowedIpRanges(args.map(_(argsBuilder).build)*)

  /**
   * User workloads ConfigMap used by Airflow tasks that run with Kubernetes Executor or KubernetesPodOperator.
   *  Intended for Composer 3 Environments.
   * 
   *  To get more information about UserWorkloadsConfigMap, see:
   * 
   *  * [API documentation](https://cloud.google.com/composer/docs/reference/rest/v1/projects.locations.environments.userWorkloadsConfigMaps)
   */
  def UserWorkloadsConfigMap(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.composer.UserWorkloadsConfigMapArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.composer.UserWorkloadsConfigMapArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.composer.UserWorkloadsConfigMap(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
