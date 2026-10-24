package jp.ukiba.ko_pulumi
package gcp

object dataproc_ext:
  extension (builder: com.pulumi.gcp.dataproc.AutoscalingPolicyArgs.Builder)
    /**
     * @param basicAlgorithm Basic algorithm for autoscaling.
     * Structure is documented below.
     * @return builder
     */
    def basicAlgorithm(args: Endofunction[com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyBasicAlgorithmArgs.Builder]):
        com.pulumi.gcp.dataproc.AutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyBasicAlgorithmArgs.builder
      builder.basicAlgorithm(args(argsBuilder).build)

    /**
     * @param secondaryWorkerConfig Describes how the autoscaler will operate for secondary workers.
     * Structure is documented below.
     * @return builder
     */
    def secondaryWorkerConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.AutoscalingPolicySecondaryWorkerConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.AutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.AutoscalingPolicySecondaryWorkerConfigArgs.builder
      builder.secondaryWorkerConfig(args(argsBuilder).build)

    /**
     * @param workerConfig Describes how the autoscaler will operate for primary workers.
     * Structure is documented below.
     * @return builder
     */
    def workerConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyWorkerConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.AutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyWorkerConfigArgs.builder
      builder.workerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.AutoscalingPolicyIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.AutoscalingPolicyIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.AutoscalingPolicyIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.AutoscalingPolicyIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.BatchArgs.Builder)
    /**
     * @param environmentConfig Environment configuration for the batch execution.
     * Structure is documented below.
     * @return builder
     */
    def environmentConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.BatchEnvironmentConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.BatchArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.BatchEnvironmentConfigArgs.builder
      builder.environmentConfig(args(argsBuilder).build)

    /**
     * @param pysparkBatch PySpark batch config.
     * Structure is documented below.
     * @return builder
     */
    def pysparkBatch(args: Endofunction[com.pulumi.gcp.dataproc.inputs.BatchPysparkBatchArgs.Builder]):
        com.pulumi.gcp.dataproc.BatchArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.BatchPysparkBatchArgs.builder
      builder.pysparkBatch(args(argsBuilder).build)

    /**
     * @param runtimeConfig Runtime configuration for the batch execution.
     * Structure is documented below.
     * @return builder
     */
    def runtimeConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.BatchRuntimeConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.BatchArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.BatchRuntimeConfigArgs.builder
      builder.runtimeConfig(args(argsBuilder).build)

    /**
     * @param sparkBatch Spark batch config.
     * Structure is documented below.
     * @return builder
     */
    def sparkBatch(args: Endofunction[com.pulumi.gcp.dataproc.inputs.BatchSparkBatchArgs.Builder]):
        com.pulumi.gcp.dataproc.BatchArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.BatchSparkBatchArgs.builder
      builder.sparkBatch(args(argsBuilder).build)

    /**
     * @param sparkRBatch SparkR batch config.
     * Structure is documented below.
     * @return builder
     */
    def sparkRBatch(args: Endofunction[com.pulumi.gcp.dataproc.inputs.BatchSparkRBatchArgs.Builder]):
        com.pulumi.gcp.dataproc.BatchArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.BatchSparkRBatchArgs.builder
      builder.sparkRBatch(args(argsBuilder).build)

    /**
     * @param sparkSqlBatch Spark SQL batch config.
     * Structure is documented below.
     * @return builder
     */
    def sparkSqlBatch(args: Endofunction[com.pulumi.gcp.dataproc.inputs.BatchSparkSqlBatchArgs.Builder]):
        com.pulumi.gcp.dataproc.BatchArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.BatchSparkSqlBatchArgs.builder
      builder.sparkSqlBatch(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.ClusterArgs.Builder)
    /**
     * @param clusterConfig Allows you to configure various aspects of the cluster.
     * Structure defined below.
     * @return builder
     */
    def clusterConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigArgs.builder
      builder.clusterConfig(args(argsBuilder).build)

    /**
     * @param virtualClusterConfig Allows you to configure a virtual Dataproc on GKE cluster.
     * Structure defined below.
     * @return builder
     */
    def virtualClusterConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigArgs.builder
      builder.virtualClusterConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.ClusterIAMBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.ClusterIAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.ClusterIAMMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.ClusterIAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.GdcApplicationEnvironmentArgs.Builder)
    /**
     * @param sparkApplicationEnvironmentConfig Represents the SparkApplicationEnvironmentConfig.
     * Structure is documented below.
     * @return builder
     */
    def sparkApplicationEnvironmentConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GdcApplicationEnvironmentSparkApplicationEnvironmentConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.GdcApplicationEnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GdcApplicationEnvironmentSparkApplicationEnvironmentConfigArgs.builder
      builder.sparkApplicationEnvironmentConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.GdcServiceInstanceArgs.Builder)
    /**
     * @param gdceCluster Gdce cluster information.
     * Structure is documented below.
     * @return builder
     */
    def gdceCluster(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GdcServiceInstanceGdceClusterArgs.Builder]):
        com.pulumi.gcp.dataproc.GdcServiceInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GdcServiceInstanceGdceClusterArgs.builder
      builder.gdceCluster(args(argsBuilder).build)

    /**
     * @param sparkServiceInstanceConfig Spark-specific service instance configuration.
     * @return builder
     */
    def sparkServiceInstanceConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GdcServiceInstanceSparkServiceInstanceConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.GdcServiceInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GdcServiceInstanceSparkServiceInstanceConfigArgs.builder
      builder.sparkServiceInstanceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.GdcSparkApplicationArgs.Builder)
    /**
     * @param pysparkApplicationConfig Represents the PySparkApplicationConfig.
     * Structure is documented below.
     * @return builder
     */
    def pysparkApplicationConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationPysparkApplicationConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.GdcSparkApplicationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationPysparkApplicationConfigArgs.builder
      builder.pysparkApplicationConfig(args(argsBuilder).build)

    /**
     * @param sparkApplicationConfig Represents the SparkApplicationConfig.
     * Structure is documented below.
     * @return builder
     */
    def sparkApplicationConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkApplicationConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.GdcSparkApplicationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkApplicationConfigArgs.builder
      builder.sparkApplicationConfig(args(argsBuilder).build)

    /**
     * @param sparkRApplicationConfig Represents the SparkRApplicationConfig.
     * Structure is documented below.
     * @return builder
     */
    def sparkRApplicationConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkRApplicationConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.GdcSparkApplicationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkRApplicationConfigArgs.builder
      builder.sparkRApplicationConfig(args(argsBuilder).build)

    /**
     * @param sparkSqlApplicationConfig Represents the SparkRApplicationConfig.
     * Structure is documented below.
     * @return builder
     */
    def sparkSqlApplicationConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkSqlApplicationConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.GdcSparkApplicationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkSqlApplicationConfigArgs.builder
      builder.sparkSqlApplicationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.JobArgs.Builder)
    /**
     * @param hadoopConfig The config of Hadoop job
     * @return builder
     */
    def hadoopConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobHadoopConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobHadoopConfigArgs.builder
      builder.hadoopConfig(args(argsBuilder).build)

    /**
     * @param hiveConfig The config of hive job
     * @return builder
     */
    def hiveConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobHiveConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobHiveConfigArgs.builder
      builder.hiveConfig(args(argsBuilder).build)

    /**
     * @param pigConfig The config of pag job.
     * @return builder
     */
    def pigConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobPigConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobPigConfigArgs.builder
      builder.pigConfig(args(argsBuilder).build)

    /**
     * @param placement The config of job placement.
     * @return builder
     */
    def placement(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobPlacementArgs.Builder]):
        com.pulumi.gcp.dataproc.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobPlacementArgs.builder
      builder.placement(args(argsBuilder).build)

    /**
     * @param prestoConfig The config of presto job
     * @return builder
     */
    def prestoConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobPrestoConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobPrestoConfigArgs.builder
      builder.prestoConfig(args(argsBuilder).build)

    /**
     * @param pysparkConfig The config of pySpark job.
     * @return builder
     */
    def pysparkConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobPysparkConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobPysparkConfigArgs.builder
      builder.pysparkConfig(args(argsBuilder).build)

    /**
     * @param reference The reference of the job
     * @return builder
     */
    def reference(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobReferenceArgs.Builder]):
        com.pulumi.gcp.dataproc.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobReferenceArgs.builder
      builder.reference(args(argsBuilder).build)

    /**
     * @param scheduling Optional. Job scheduling configuration.
     * @return builder
     */
    def scheduling(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobSchedulingArgs.Builder]):
        com.pulumi.gcp.dataproc.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobSchedulingArgs.builder
      builder.scheduling(args(argsBuilder).build)

    /**
     * @param sparkConfig The config of the Spark job.
     * @return builder
     */
    def sparkConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobSparkConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobSparkConfigArgs.builder
      builder.sparkConfig(args(argsBuilder).build)

    /**
     * @param sparksqlConfig The config of SparkSql job
     * @return builder
     */
    def sparksqlConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobSparksqlConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobSparksqlConfigArgs.builder
      builder.sparksqlConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.JobIAMBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.JobIAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.JobIAMMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.JobIAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.MetastoreDatabaseIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreDatabaseIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.MetastoreDatabaseIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreDatabaseIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.MetastoreDatabaseIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreDatabaseIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.MetastoreDatabaseIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreDatabaseIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.MetastoreFederationArgs.Builder)
    /**
     * @param backendMetastores A map from BackendMetastore rank to BackendMetastores from which the federation service serves metadata at query time. The map key represents the order in which BackendMetastores should be evaluated to resolve database names at query time and should be greater than or equal to zero. A BackendMetastore with a lower number will be evaluated before a BackendMetastore with a higher number.
     * Structure is documented below.
     * @return builder
     */
    def backendMetastores(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreFederationBackendMetastoreArgs.Builder]*):
        com.pulumi.gcp.dataproc.MetastoreFederationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreFederationBackendMetastoreArgs.builder
      builder.backendMetastores(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.MetastoreFederationIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreFederationIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.MetastoreFederationIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreFederationIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.MetastoreFederationIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreFederationIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.MetastoreFederationIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreFederationIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.MetastoreServiceArgs.Builder)
    /**
     * @param encryptionConfig Information used to configure the Dataproc Metastore service to encrypt
     * customer data at rest.
     * Structure is documented below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.MetastoreServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param hiveMetastoreConfig Configuration information specific to running Hive metastore software as the metastore service.
     * Structure is documented below.
     * @return builder
     */
    def hiveMetastoreConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceHiveMetastoreConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.MetastoreServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceHiveMetastoreConfigArgs.builder
      builder.hiveMetastoreConfig(args(argsBuilder).build)

    /**
     * @param maintenanceWindow The one hour maintenance window of the metastore service.
     * This specifies when the service can be restarted for maintenance purposes in UTC time.
     * Maintenance window is not needed for services with the `SPANNER` database type.
     * Structure is documented below.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceMaintenanceWindowArgs.Builder]):
        com.pulumi.gcp.dataproc.MetastoreServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    /**
     * @param metadataIntegration The setting that defines how metastore metadata should be integrated with external services and systems.
     * Structure is documented below.
     * @return builder
     */
    def metadataIntegration(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceMetadataIntegrationArgs.Builder]):
        com.pulumi.gcp.dataproc.MetastoreServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceMetadataIntegrationArgs.builder
      builder.metadataIntegration(args(argsBuilder).build)

    /**
     * @param networkConfig The configuration specifying the network settings for the Dataproc Metastore service.
     * Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceNetworkConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.MetastoreServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param scalingConfig Represents the scaling configuration of a metastore service.
     * Structure is documented below.
     * @return builder
     */
    def scalingConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceScalingConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.MetastoreServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceScalingConfigArgs.builder
      builder.scalingConfig(args(argsBuilder).build)

    /**
     * @param scheduledBackup The configuration of scheduled backup for the metastore service.
     * Structure is documented below.
     * @return builder
     */
    def scheduledBackup(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceScheduledBackupArgs.Builder]):
        com.pulumi.gcp.dataproc.MetastoreServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceScheduledBackupArgs.builder
      builder.scheduledBackup(args(argsBuilder).build)

    /**
     * @param telemetryConfig The configuration specifying telemetry settings for the Dataproc Metastore service. If unspecified defaults to JSON.
     * Structure is documented below.
     * @return builder
     */
    def telemetryConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceTelemetryConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.MetastoreServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceTelemetryConfigArgs.builder
      builder.telemetryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.MetastoreServiceIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.MetastoreServiceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.MetastoreServiceIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.MetastoreServiceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.MetastoreTableIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreTableIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.MetastoreTableIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreTableIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.MetastoreTableIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreTableIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.MetastoreTableIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreTableIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.SessionTemplateArgs.Builder)
    /**
     * @param environmentConfig Environment configuration for the session execution.
     * Structure is documented below.
     * @return builder
     */
    def environmentConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.SessionTemplateEnvironmentConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.SessionTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.SessionTemplateEnvironmentConfigArgs.builder
      builder.environmentConfig(args(argsBuilder).build)

    /**
     * @param jupyterSession Jupyter configuration for an interactive session.
     * Structure is documented below.
     * @return builder
     */
    def jupyterSession(args: Endofunction[com.pulumi.gcp.dataproc.inputs.SessionTemplateJupyterSessionArgs.Builder]):
        com.pulumi.gcp.dataproc.SessionTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.SessionTemplateJupyterSessionArgs.builder
      builder.jupyterSession(args(argsBuilder).build)

    /**
     * @param runtimeConfig Runtime configuration for the session template.
     * Structure is documented below.
     * @return builder
     */
    def runtimeConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.SessionTemplateRuntimeConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.SessionTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.SessionTemplateRuntimeConfigArgs.builder
      builder.runtimeConfig(args(argsBuilder).build)

    /**
     * @param sparkConnectSession Spark connect configuration for an interactive session.
     * @return builder
     */
    def sparkConnectSession(args: Endofunction[com.pulumi.gcp.dataproc.inputs.SessionTemplateSparkConnectSessionArgs.Builder]):
        com.pulumi.gcp.dataproc.SessionTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.SessionTemplateSparkConnectSessionArgs.builder
      builder.sparkConnectSession(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.WorkflowTemplateArgs.Builder)
    /**
     * @param encryptionConfig Encryption settings for encrypting workflow template job arguments. Structure is documented below
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.WorkflowTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param jobs (Required) The Directed Acyclic Graph of Jobs to submit. Structure is documented below
     * @return builder
     */
    def jobs(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobArgs.Builder]*):
        com.pulumi.gcp.dataproc.WorkflowTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobArgs.builder
      builder.jobs(args.map(_(argsBuilder).build)*)

    /**
     * @param parameters Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided when the template is instantiated.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterArgs.Builder]*):
        com.pulumi.gcp.dataproc.WorkflowTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

    /**
     * @param placement WorkflowTemplate scheduling information. Structure is documented below.
     * @return builder
     */
    def placement(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementArgs.Builder]):
        com.pulumi.gcp.dataproc.WorkflowTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementArgs.builder
      builder.placement(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyBasicAlgorithmArgs.Builder)
    /**
     * @param yarnConfig YARN autoscaling configuration.
     * Structure is documented below.
     * @return builder
     */
    def yarnConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyBasicAlgorithmYarnConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyBasicAlgorithmArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyBasicAlgorithmYarnConfigArgs.builder
      builder.yarnConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyState.Builder)
    /**
     * @param basicAlgorithm Basic algorithm for autoscaling.
     * Structure is documented below.
     * @return builder
     */
    def basicAlgorithm(args: Endofunction[com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyBasicAlgorithmArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyBasicAlgorithmArgs.builder
      builder.basicAlgorithm(args(argsBuilder).build)

    /**
     * @param secondaryWorkerConfig Describes how the autoscaler will operate for secondary workers.
     * Structure is documented below.
     * @return builder
     */
    def secondaryWorkerConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.AutoscalingPolicySecondaryWorkerConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.AutoscalingPolicySecondaryWorkerConfigArgs.builder
      builder.secondaryWorkerConfig(args(argsBuilder).build)

    /**
     * @param workerConfig Describes how the autoscaler will operate for primary workers.
     * Structure is documented below.
     * @return builder
     */
    def workerConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyWorkerConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyWorkerConfigArgs.builder
      builder.workerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.BatchEnvironmentConfigArgs.Builder)
    /**
     * @param executionConfig Execution configuration for a workload.
     * Structure is documented below.
     * @return builder
     */
    def executionConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.BatchEnvironmentConfigExecutionConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.BatchEnvironmentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.BatchEnvironmentConfigExecutionConfigArgs.builder
      builder.executionConfig(args(argsBuilder).build)

    /**
     * @param peripheralsConfig Peripherals configuration that workload has access to.
     * Structure is documented below.
     * @return builder
     */
    def peripheralsConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.BatchEnvironmentConfigPeripheralsConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.BatchEnvironmentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.BatchEnvironmentConfigPeripheralsConfigArgs.builder
      builder.peripheralsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.BatchEnvironmentConfigExecutionConfigArgs.Builder)
    /**
     * @param authenticationConfig Authentication configuration for a workload is used to set the default identity for the workload execution.
     * Structure is documented below.
     * @return builder
     */
    def authenticationConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.BatchEnvironmentConfigExecutionConfigAuthenticationConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.BatchEnvironmentConfigExecutionConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.BatchEnvironmentConfigExecutionConfigAuthenticationConfigArgs.builder
      builder.authenticationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.BatchEnvironmentConfigPeripheralsConfigArgs.Builder)
    /**
     * @param sparkHistoryServerConfig The Spark History Server configuration for the workload.
     * Structure is documented below.
     * @return builder
     */
    def sparkHistoryServerConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.BatchEnvironmentConfigPeripheralsConfigSparkHistoryServerConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.BatchEnvironmentConfigPeripheralsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.BatchEnvironmentConfigPeripheralsConfigSparkHistoryServerConfigArgs.builder
      builder.sparkHistoryServerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.BatchRuntimeConfigArgs.Builder)
    /**
     * @param autotuningConfig Optional. Autotuning configuration of the workload.
     * Structure is documented below.
     * @return builder
     */
    def autotuningConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.BatchRuntimeConfigAutotuningConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.BatchRuntimeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.BatchRuntimeConfigAutotuningConfigArgs.builder
      builder.autotuningConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.BatchRuntimeInfoArgs.Builder)
    /**
     * @param approximateUsages (Output)
     * Approximate workload resource usage, calculated when the workload completes(see [Dataproc Serverless pricing](https://cloud.google.com/dataproc-serverless/pricing))
     * Structure is documented below.
     * @return builder
     */
    def approximateUsages(args: Endofunction[com.pulumi.gcp.dataproc.inputs.BatchRuntimeInfoApproximateUsageArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.BatchRuntimeInfoArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.BatchRuntimeInfoApproximateUsageArgs.builder
      builder.approximateUsages(args.map(_(argsBuilder).build)*)

    /**
     * @param currentUsages (Output)
     * Snapshot of current workload resource usage(see [Dataproc Serverless pricing](https://cloud.google.com/dataproc-serverless/pricing))
     * Structure is documented below.
     * @return builder
     */
    def currentUsages(args: Endofunction[com.pulumi.gcp.dataproc.inputs.BatchRuntimeInfoCurrentUsageArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.BatchRuntimeInfoArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.BatchRuntimeInfoCurrentUsageArgs.builder
      builder.currentUsages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.BatchState.Builder)
    /**
     * @param environmentConfig Environment configuration for the batch execution.
     * Structure is documented below.
     * @return builder
     */
    def environmentConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.BatchEnvironmentConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.BatchState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.BatchEnvironmentConfigArgs.builder
      builder.environmentConfig(args(argsBuilder).build)

    /**
     * @param pysparkBatch PySpark batch config.
     * Structure is documented below.
     * @return builder
     */
    def pysparkBatch(args: Endofunction[com.pulumi.gcp.dataproc.inputs.BatchPysparkBatchArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.BatchState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.BatchPysparkBatchArgs.builder
      builder.pysparkBatch(args(argsBuilder).build)

    /**
     * @param runtimeConfig Runtime configuration for the batch execution.
     * Structure is documented below.
     * @return builder
     */
    def runtimeConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.BatchRuntimeConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.BatchState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.BatchRuntimeConfigArgs.builder
      builder.runtimeConfig(args(argsBuilder).build)

    /**
     * @param runtimeInfos Runtime information about batch execution.
     * Structure is documented below.
     * @return builder
     */
    def runtimeInfos(args: Endofunction[com.pulumi.gcp.dataproc.inputs.BatchRuntimeInfoArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.BatchState.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.BatchRuntimeInfoArgs.builder
      builder.runtimeInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param sparkBatch Spark batch config.
     * Structure is documented below.
     * @return builder
     */
    def sparkBatch(args: Endofunction[com.pulumi.gcp.dataproc.inputs.BatchSparkBatchArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.BatchState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.BatchSparkBatchArgs.builder
      builder.sparkBatch(args(argsBuilder).build)

    /**
     * @param sparkRBatch SparkR batch config.
     * Structure is documented below.
     * @return builder
     */
    def sparkRBatch(args: Endofunction[com.pulumi.gcp.dataproc.inputs.BatchSparkRBatchArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.BatchState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.BatchSparkRBatchArgs.builder
      builder.sparkRBatch(args(argsBuilder).build)

    /**
     * @param sparkSqlBatch Spark SQL batch config.
     * Structure is documented below.
     * @return builder
     */
    def sparkSqlBatch(args: Endofunction[com.pulumi.gcp.dataproc.inputs.BatchSparkSqlBatchArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.BatchState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.BatchSparkSqlBatchArgs.builder
      builder.sparkSqlBatch(args(argsBuilder).build)

    /**
     * @param stateHistories Historical state information for the batch.
     * Structure is documented below.
     * @return builder
     */
    def stateHistories(args: Endofunction[com.pulumi.gcp.dataproc.inputs.BatchStateHistoryArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.BatchState.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.BatchStateHistoryArgs.builder
      builder.stateHistories(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigArgs.Builder)
    /**
     * @param autoscalingConfig The autoscaling policy config associated with the cluster.
     * Note that once set, if `autoscalingConfig` is the only field set in `clusterConfig`, it can
     * only be removed by setting `policyUri = &#34;&#34;`, rather than removing the whole block.
     * Structure defined below.
     * @return builder
     */
    def autoscalingConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAutoscalingConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAutoscalingConfigArgs.builder
      builder.autoscalingConfig(args(argsBuilder).build)

    /**
     * @param auxiliaryNodeGroups A Dataproc NodeGroup resource is a group of Dataproc cluster nodes that execute an assigned role.
     * Structure defined below.
     * @return builder
     */
    def auxiliaryNodeGroups(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAuxiliaryNodeGroupArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAuxiliaryNodeGroupArgs.builder
      builder.auxiliaryNodeGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param dataprocMetricConfig The Compute Engine accelerator (GPU) configuration for these instances. Can be specified multiple times.
     * Structure defined below.
     * @return builder
     */
    def dataprocMetricConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigDataprocMetricConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigDataprocMetricConfigArgs.builder
      builder.dataprocMetricConfig(args(argsBuilder).build)

    /**
     * @param encryptionConfig The Customer managed encryption keys settings for the cluster.
     * Structure defined below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param endpointConfig The config settings for port access on the cluster.
     * Structure defined below.
     * @return builder
     */
    def endpointConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigEndpointConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigEndpointConfigArgs.builder
      builder.endpointConfig(args(argsBuilder).build)

    /**
     * @param gceClusterConfig Common config settings for resources of Google Compute Engine cluster
     * instances, applicable to all instances in the cluster. Structure defined below.
     * @return builder
     */
    def gceClusterConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigGceClusterConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigGceClusterConfigArgs.builder
      builder.gceClusterConfig(args(argsBuilder).build)

    /**
     * @param initializationActions Commands to execute on each node after config is completed.
     * You can specify multiple versions of these. Structure defined below.
     * @return builder
     */
    def initializationActions(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigInitializationActionArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigInitializationActionArgs.builder
      builder.initializationActions(args.map(_(argsBuilder).build)*)

    /**
     * @param lifecycleConfig The settings for auto deletion cluster schedule.
     * Structure defined below.
     * @return builder
     */
    def lifecycleConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigLifecycleConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigLifecycleConfigArgs.builder
      builder.lifecycleConfig(args(argsBuilder).build)

    /**
     * @param masterConfig The Google Compute Engine config settings for the master instances
     * in a cluster. Structure defined below.
     * @return builder
     */
    def masterConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigArgs.builder
      builder.masterConfig(args(argsBuilder).build)

    /**
     * @param metastoreConfig The config setting for metastore service with the cluster.
     * Structure defined below.
     * ***
     * @return builder
     */
    def metastoreConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMetastoreConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMetastoreConfigArgs.builder
      builder.metastoreConfig(args(argsBuilder).build)

    /**
     * @param preemptibleWorkerConfig The Google Compute Engine config settings for the additional
     * instances in a cluster. Structure defined below.
     * * **NOTE** : `preemptibleWorkerConfig` is
     *   an alias for the api&#39;s [secondaryWorkerConfig](https://cloud.google.com/dataproc/docs/reference/rest/v1/ClusterConfig#InstanceGroupConfig). The name doesn&#39;t necessarily mean it is preemptible and is named as
     *   such for legacy/compatibility reasons.
     * @return builder
     */
    def preemptibleWorkerConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigArgs.builder
      builder.preemptibleWorkerConfig(args(argsBuilder).build)

    /**
     * @param securityConfig Security related configuration. Structure defined below.
     * @return builder
     */
    def securityConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigSecurityConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigSecurityConfigArgs.builder
      builder.securityConfig(args(argsBuilder).build)

    /**
     * @param softwareConfig The config settings for software inside the cluster.
     * Structure defined below.
     * @return builder
     */
    def softwareConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigSoftwareConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigSoftwareConfigArgs.builder
      builder.softwareConfig(args(argsBuilder).build)

    /**
     * @param workerConfig The Google Compute Engine config settings for the worker instances
     * in a cluster. Structure defined below.
     * @return builder
     */
    def workerConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigArgs.builder
      builder.workerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAuxiliaryNodeGroupArgs.Builder)
    /**
     * @param nodeGroups Node group configuration.
     * @return builder
     */
    def nodeGroups(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroupArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAuxiliaryNodeGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroupArgs.builder
      builder.nodeGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroupArgs.Builder)
    /**
     * @param nodeGroupConfig The node group instance group configuration.
     * @return builder
     */
    def nodeGroupConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroupNodeGroupConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroupNodeGroupConfigArgs.builder
      builder.nodeGroupConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroupNodeGroupConfigArgs.Builder)
    /**
     * @param accelerators The Compute Engine accelerator (GPU) configuration for these instances. Can be specified
     * multiple times.
     * @return builder
     */
    def accelerators(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroupNodeGroupConfigAcceleratorArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroupNodeGroupConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroupNodeGroupConfigAcceleratorArgs.builder
      builder.accelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param diskConfig Disk Config
     * @return builder
     */
    def diskConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroupNodeGroupConfigDiskConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroupNodeGroupConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroupNodeGroupConfigDiskConfigArgs.builder
      builder.diskConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigDataprocMetricConfigArgs.Builder)
    /**
     * @param metrics Metrics sources to enable.
     * @return builder
     */
    def metrics(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigDataprocMetricConfigMetricArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigDataprocMetricConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigDataprocMetricConfigMetricArgs.builder
      builder.metrics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigGceClusterConfigArgs.Builder)
    /**
     * @param confidentialInstanceConfig Confidential Instance Config for clusters using [Confidential VMs](https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/confidential-compute)
     * @return builder
     */
    def confidentialInstanceConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigGceClusterConfigConfidentialInstanceConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigGceClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigGceClusterConfigConfidentialInstanceConfigArgs.builder
      builder.confidentialInstanceConfig(args(argsBuilder).build)

    /**
     * @param nodeGroupAffinity Node Group Affinity for sole-tenant clusters.
     * @return builder
     */
    def nodeGroupAffinity(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigGceClusterConfigNodeGroupAffinityArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigGceClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigGceClusterConfigNodeGroupAffinityArgs.builder
      builder.nodeGroupAffinity(args(argsBuilder).build)

    /**
     * @param reservationAffinity Reservation Affinity for consuming zonal reservation.
     * @return builder
     */
    def reservationAffinity(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigGceClusterConfigReservationAffinityArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigGceClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigGceClusterConfigReservationAffinityArgs.builder
      builder.reservationAffinity(args(argsBuilder).build)

    /**
     * @param shieldedInstanceConfig Shielded Instance Config for clusters using [Compute Engine Shielded VMs](https://cloud.google.com/security/shielded-cloud/shielded-vm).
     * 
     * ***
     * @return builder
     */
    def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigGceClusterConfigShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigGceClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigGceClusterConfigShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigArgs.Builder)
    /**
     * @param accelerators The Compute Engine accelerator (GPU) configuration for these instances. Can be specified multiple times.
     * @return builder
     */
    def accelerators(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigAcceleratorArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigAcceleratorArgs.builder
      builder.accelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param diskConfig Disk Config
     * @return builder
     */
    def diskConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigDiskConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigDiskConfigArgs.builder
      builder.diskConfig(args(argsBuilder).build)

    /**
     * @param instanceFlexibilityPolicy Instance flexibility Policy allowing a mixture of VM shapes.
     * @return builder
     */
    def instanceFlexibilityPolicy(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigInstanceFlexibilityPolicyArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigInstanceFlexibilityPolicyArgs.builder
      builder.instanceFlexibilityPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigDiskConfigArgs.Builder)
    /**
     * @param attachedDiskConfigs Optional. Attached disk configuration.
     * @return builder
     */
    def attachedDiskConfigs(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigDiskConfigAttachedDiskConfigArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigDiskConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigDiskConfigAttachedDiskConfigArgs.builder
      builder.attachedDiskConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigInstanceFlexibilityPolicyArgs.Builder)
    /**
     * @param instanceSelectionLists List of instance selection options that the group will use when creating new VMs.
     * @return builder
     */
    def instanceSelectionLists(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigInstanceFlexibilityPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.builder
      builder.instanceSelectionLists(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceSelectionResults A list of instance selection results in the group.
     * @return builder
     */
    def instanceSelectionResults(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionResultArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigInstanceFlexibilityPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionResultArgs.builder
      builder.instanceSelectionResults(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.Builder)
    /**
     * @param diskConfig Disk configuration to apply to the instances in this instance selection.
     * @return builder
     */
    def diskConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.builder
      builder.diskConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.Builder)
    /**
     * @param attachedDiskConfigs Attached disk configuration.
     * @return builder
     */
    def attachedDiskConfigs(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigAttachedDiskConfigArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigAttachedDiskConfigArgs.builder
      builder.attachedDiskConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigArgs.Builder)
    /**
     * @param diskConfig Disk Config
     * @return builder
     */
    def diskConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigDiskConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigDiskConfigArgs.builder
      builder.diskConfig(args(argsBuilder).build)

    /**
     * @param instanceFlexibilityPolicy Instance flexibility Policy allowing a mixture of VM shapes and provisioning models.
     * @return builder
     */
    def instanceFlexibilityPolicy(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyArgs.builder
      builder.instanceFlexibilityPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigDiskConfigArgs.Builder)
    /**
     * @param attachedDiskConfigs Optional. Attached disk configuration.
     * @return builder
     */
    def attachedDiskConfigs(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigDiskConfigAttachedDiskConfigArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigDiskConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigDiskConfigAttachedDiskConfigArgs.builder
      builder.attachedDiskConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyArgs.Builder)
    /**
     * @param instanceSelectionLists List of instance selection options that the group will use when creating new VMs.
     * @return builder
     */
    def instanceSelectionLists(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.builder
      builder.instanceSelectionLists(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceSelectionResults A list of instance selection results in the group.
     * @return builder
     */
    def instanceSelectionResults(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionResultArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionResultArgs.builder
      builder.instanceSelectionResults(args.map(_(argsBuilder).build)*)

    /**
     * @param provisioningModelMix Defines how the Group selects the provisioning model to ensure required reliability.
     * @return builder
     */
    def provisioningModelMix(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyProvisioningModelMixArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyProvisioningModelMixArgs.builder
      builder.provisioningModelMix(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.Builder)
    /**
     * @param diskConfig Optional. Disk configuration to apply to the instances in this instance selection.
     * @return builder
     */
    def diskConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.builder
      builder.diskConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.Builder)
    /**
     * @param attachedDiskConfigs Optional. Attached disk configuration.
     * @return builder
     */
    def attachedDiskConfigs(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigAttachedDiskConfigArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigAttachedDiskConfigArgs.builder
      builder.attachedDiskConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigSecurityConfigArgs.Builder)
    /**
     * @param identityConfig Identity Configuration. At least one of `identityConfig`
     * or `kerberosConfig` is required.
     * @return builder
     */
    def identityConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigSecurityConfigIdentityConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigSecurityConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigSecurityConfigIdentityConfigArgs.builder
      builder.identityConfig(args(argsBuilder).build)

    /**
     * @param kerberosConfig Kerberos Configuration. At least one of `identityConfig`
     * or `kerberosConfig` is required.
     * @return builder
     */
    def kerberosConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigSecurityConfigKerberosConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigSecurityConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigSecurityConfigKerberosConfigArgs.builder
      builder.kerberosConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigArgs.Builder)
    /**
     * @param accelerators The Compute Engine accelerator configuration for these instances. Can be specified multiple times.
     * @return builder
     */
    def accelerators(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigAcceleratorArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigAcceleratorArgs.builder
      builder.accelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param diskConfig Disk Config
     * @return builder
     */
    def diskConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigDiskConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigDiskConfigArgs.builder
      builder.diskConfig(args(argsBuilder).build)

    /**
     * @param instanceFlexibilityPolicy Instance flexibility Policy allowing a mixture of VM shapes.
     * @return builder
     */
    def instanceFlexibilityPolicy(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigInstanceFlexibilityPolicyArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigInstanceFlexibilityPolicyArgs.builder
      builder.instanceFlexibilityPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigDiskConfigArgs.Builder)
    /**
     * @param attachedDiskConfigs Attached disk configuration.
     * @return builder
     */
    def attachedDiskConfigs(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigDiskConfigAttachedDiskConfigArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigDiskConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigDiskConfigAttachedDiskConfigArgs.builder
      builder.attachedDiskConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigInstanceFlexibilityPolicyArgs.Builder)
    /**
     * @param instanceSelectionLists List of instance selection options that the group will use when creating new VMs.
     * @return builder
     */
    def instanceSelectionLists(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigInstanceFlexibilityPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.builder
      builder.instanceSelectionLists(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceSelectionResults A list of instance selection results in the group.
     * @return builder
     */
    def instanceSelectionResults(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionResultArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigInstanceFlexibilityPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionResultArgs.builder
      builder.instanceSelectionResults(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.Builder)
    /**
     * @param diskConfig Disk configuration to apply to the instances in this instance selection.
     * @return builder
     */
    def diskConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.builder
      builder.diskConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.Builder)
    /**
     * @param attachedDiskConfigs Attached disk configuration.
     * @return builder
     */
    def attachedDiskConfigs(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigAttachedDiskConfigArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigAttachedDiskConfigArgs.builder
      builder.attachedDiskConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterIAMBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterIAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterIAMMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterIAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterState.Builder)
    /**
     * @param clusterConfig Allows you to configure various aspects of the cluster.
     * Structure defined below.
     * @return builder
     */
    def clusterConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigArgs.builder
      builder.clusterConfig(args(argsBuilder).build)

    /**
     * @param virtualClusterConfig Allows you to configure a virtual Dataproc on GKE cluster.
     * Structure defined below.
     * @return builder
     */
    def virtualClusterConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigArgs.builder
      builder.virtualClusterConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigArgs.Builder)
    /**
     * @param auxiliaryServicesConfig Configuration of auxiliary services used by this cluster.
     * Structure defined below.
     * @return builder
     */
    def auxiliaryServicesConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigAuxiliaryServicesConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigAuxiliaryServicesConfigArgs.builder
      builder.auxiliaryServicesConfig(args(argsBuilder).build)

    /**
     * @param kubernetesClusterConfig The configuration for running the Dataproc cluster on Kubernetes.
     * Structure defined below.
     * ***
     * @return builder
     */
    def kubernetesClusterConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigArgs.builder
      builder.kubernetesClusterConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigAuxiliaryServicesConfigArgs.Builder)
    /**
     * @param metastoreConfig The Hive Metastore configuration for this workload.
     * @return builder
     */
    def metastoreConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigAuxiliaryServicesConfigMetastoreConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigAuxiliaryServicesConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigAuxiliaryServicesConfigMetastoreConfigArgs.builder
      builder.metastoreConfig(args(argsBuilder).build)

    /**
     * @param sparkHistoryServerConfig The Spark History Server configuration for the workload.
     * @return builder
     */
    def sparkHistoryServerConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigAuxiliaryServicesConfigSparkHistoryServerConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigAuxiliaryServicesConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigAuxiliaryServicesConfigSparkHistoryServerConfigArgs.builder
      builder.sparkHistoryServerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigArgs.Builder)
    /**
     * @param gkeClusterConfig The configuration for running the Dataproc cluster on GKE.
     * @return builder
     */
    def gkeClusterConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigArgs.builder
      builder.gkeClusterConfig(args(argsBuilder).build)

    /**
     * @param kubernetesSoftwareConfig The software configuration for this Dataproc cluster running on Kubernetes.
     * @return builder
     */
    def kubernetesSoftwareConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigKubernetesSoftwareConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigKubernetesSoftwareConfigArgs.builder
      builder.kubernetesSoftwareConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigArgs.Builder)
    /**
     * @param nodePoolTargets GKE node pools where workloads will be scheduled. At least one node pool must be assigned the `DEFAULT`
     * GkeNodePoolTarget.Role. If a GkeNodePoolTarget is not specified, Dataproc constructs a `DEFAULT` GkeNodePoolTarget.
     * Each role can be given to only one GkeNodePoolTarget. All node pools must have the same location settings.
     * @return builder
     */
    def nodePoolTargets(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetArgs.builder
      builder.nodePoolTargets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetArgs.Builder)
    /**
     * @param nodePoolConfig The configuration for the GKE node pool.
     * If specified, Dataproc attempts to create a node pool with the specified shape.
     * If one with the same name already exists, it is verified against all specified fields.
     * If a field differs, the virtual cluster creation will fail.
     * @return builder
     */
    def nodePoolConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetNodePoolConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetNodePoolConfigArgs.builder
      builder.nodePoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetNodePoolConfigArgs.Builder)
    /**
     * @param autoscaling The autoscaler configuration for this node pool.
     * The autoscaler is enabled only when a valid configuration is present.
     * @return builder
     */
    def autoscaling(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetNodePoolConfigAutoscalingArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetNodePoolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetNodePoolConfigAutoscalingArgs.builder
      builder.autoscaling(args(argsBuilder).build)

    /**
     * @param config The node pool configuration.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetNodePoolConfigConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetNodePoolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetNodePoolConfigConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.GdcApplicationEnvironmentState.Builder)
    /**
     * @param sparkApplicationEnvironmentConfig Represents the SparkApplicationEnvironmentConfig.
     * Structure is documented below.
     * @return builder
     */
    def sparkApplicationEnvironmentConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GdcApplicationEnvironmentSparkApplicationEnvironmentConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.GdcApplicationEnvironmentState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GdcApplicationEnvironmentSparkApplicationEnvironmentConfigArgs.builder
      builder.sparkApplicationEnvironmentConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.GdcServiceInstanceState.Builder)
    /**
     * @param gdceCluster Gdce cluster information.
     * Structure is documented below.
     * @return builder
     */
    def gdceCluster(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GdcServiceInstanceGdceClusterArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.GdcServiceInstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GdcServiceInstanceGdceClusterArgs.builder
      builder.gdceCluster(args(argsBuilder).build)

    /**
     * @param sparkServiceInstanceConfig Spark-specific service instance configuration.
     * @return builder
     */
    def sparkServiceInstanceConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GdcServiceInstanceSparkServiceInstanceConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.GdcServiceInstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GdcServiceInstanceSparkServiceInstanceConfigArgs.builder
      builder.sparkServiceInstanceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkSqlApplicationConfigArgs.Builder)
    /**
     * @param queryList Represents a list of queries.
     * Structure is documented below.
     * @return builder
     */
    def queryList(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkSqlApplicationConfigQueryListArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkSqlApplicationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkSqlApplicationConfigQueryListArgs.builder
      builder.queryList(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationState.Builder)
    /**
     * @param pysparkApplicationConfig Represents the PySparkApplicationConfig.
     * Structure is documented below.
     * @return builder
     */
    def pysparkApplicationConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationPysparkApplicationConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationPysparkApplicationConfigArgs.builder
      builder.pysparkApplicationConfig(args(argsBuilder).build)

    /**
     * @param sparkApplicationConfig Represents the SparkApplicationConfig.
     * Structure is documented below.
     * @return builder
     */
    def sparkApplicationConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkApplicationConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkApplicationConfigArgs.builder
      builder.sparkApplicationConfig(args(argsBuilder).build)

    /**
     * @param sparkRApplicationConfig Represents the SparkRApplicationConfig.
     * Structure is documented below.
     * @return builder
     */
    def sparkRApplicationConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkRApplicationConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkRApplicationConfigArgs.builder
      builder.sparkRApplicationConfig(args(argsBuilder).build)

    /**
     * @param sparkSqlApplicationConfig Represents the SparkRApplicationConfig.
     * Structure is documented below.
     * @return builder
     */
    def sparkSqlApplicationConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkSqlApplicationConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkSqlApplicationConfigArgs.builder
      builder.sparkSqlApplicationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.JobHadoopConfigArgs.Builder)
    /**
     * @param loggingConfig The runtime logging config of the job
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobHadoopConfigLoggingConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.JobHadoopConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobHadoopConfigLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.JobIAMBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.JobIAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.JobIAMMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.JobIAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.JobPigConfigArgs.Builder)
    /**
     * @param loggingConfig The runtime logging config of the job
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobPigConfigLoggingConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.JobPigConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobPigConfigLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.JobPrestoConfigArgs.Builder)
    /**
     * @param loggingConfig The runtime logging config of the job
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobPrestoConfigLoggingConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.JobPrestoConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobPrestoConfigLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.JobPysparkConfigArgs.Builder)
    /**
     * @param loggingConfig The runtime logging config of the job
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobPysparkConfigLoggingConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.JobPysparkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobPysparkConfigLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.JobSparkConfigArgs.Builder)
    /**
     * @param loggingConfig The runtime logging config of the job
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobSparkConfigLoggingConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.JobSparkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobSparkConfigLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.JobSparksqlConfigArgs.Builder)
    /**
     * @param loggingConfig The runtime logging config of the job
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobSparksqlConfigLoggingConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.JobSparksqlConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobSparksqlConfigLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.JobState.Builder)
    /**
     * @param hadoopConfig The config of Hadoop job
     * @return builder
     */
    def hadoopConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobHadoopConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobHadoopConfigArgs.builder
      builder.hadoopConfig(args(argsBuilder).build)

    /**
     * @param hiveConfig The config of hive job
     * @return builder
     */
    def hiveConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobHiveConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobHiveConfigArgs.builder
      builder.hiveConfig(args(argsBuilder).build)

    /**
     * @param pigConfig The config of pag job.
     * @return builder
     */
    def pigConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobPigConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobPigConfigArgs.builder
      builder.pigConfig(args(argsBuilder).build)

    /**
     * @param placement The config of job placement.
     * @return builder
     */
    def placement(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobPlacementArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobPlacementArgs.builder
      builder.placement(args(argsBuilder).build)

    /**
     * @param prestoConfig The config of presto job
     * @return builder
     */
    def prestoConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobPrestoConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobPrestoConfigArgs.builder
      builder.prestoConfig(args(argsBuilder).build)

    /**
     * @param pysparkConfig The config of pySpark job.
     * @return builder
     */
    def pysparkConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobPysparkConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobPysparkConfigArgs.builder
      builder.pysparkConfig(args(argsBuilder).build)

    /**
     * @param reference The reference of the job
     * @return builder
     */
    def reference(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobReferenceArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobReferenceArgs.builder
      builder.reference(args(argsBuilder).build)

    /**
     * @param scheduling Optional. Job scheduling configuration.
     * @return builder
     */
    def scheduling(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobSchedulingArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobSchedulingArgs.builder
      builder.scheduling(args(argsBuilder).build)

    /**
     * @param sparkConfig The config of the Spark job.
     * @return builder
     */
    def sparkConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobSparkConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobSparkConfigArgs.builder
      builder.sparkConfig(args(argsBuilder).build)

    /**
     * @param sparksqlConfig The config of SparkSql job
     * @return builder
     */
    def sparksqlConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobSparksqlConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.JobSparksqlConfigArgs.builder
      builder.sparksqlConfig(args(argsBuilder).build)

    /**
     * @param statuses The status of the job.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.gcp.dataproc.inputs.JobStatusArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.JobState.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.JobStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.MetastoreDatabaseIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreDatabaseIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.MetastoreDatabaseIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreDatabaseIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.MetastoreDatabaseIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreDatabaseIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.MetastoreDatabaseIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreDatabaseIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.MetastoreFederationIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreFederationIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.MetastoreFederationIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreFederationIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.MetastoreFederationIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreFederationIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.MetastoreFederationIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreFederationIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.MetastoreFederationState.Builder)
    /**
     * @param backendMetastores A map from BackendMetastore rank to BackendMetastores from which the federation service serves metadata at query time. The map key represents the order in which BackendMetastores should be evaluated to resolve database names at query time and should be greater than or equal to zero. A BackendMetastore with a lower number will be evaluated before a BackendMetastore with a higher number.
     * Structure is documented below.
     * @return builder
     */
    def backendMetastores(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreFederationBackendMetastoreArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.MetastoreFederationState.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreFederationBackendMetastoreArgs.builder
      builder.backendMetastores(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.MetastoreServiceHiveMetastoreConfigArgs.Builder)
    /**
     * @param auxiliaryVersions A mapping of Hive metastore version to the auxiliary version configuration.
     * When specified, a secondary Hive metastore service is created along with the primary service.
     * All auxiliary versions must be less than the service&#39;s primary version.
     * The key is the auxiliary service name and it must match the regular expression a-z?.
     * This means that the first character must be a lowercase letter, and all the following characters must be hyphens, lowercase letters, or digits, except the last character, which cannot be a hyphen.
     * Structure is documented below.
     * @return builder
     */
    def auxiliaryVersions(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceHiveMetastoreConfigAuxiliaryVersionArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.MetastoreServiceHiveMetastoreConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceHiveMetastoreConfigAuxiliaryVersionArgs.builder
      builder.auxiliaryVersions(args.map(_(argsBuilder).build)*)

    /**
     * @param kerberosConfig Information used to configure the Hive metastore service as a service principal in a Kerberos realm.
     * Structure is documented below.
     * @return builder
     */
    def kerberosConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceHiveMetastoreConfigKerberosConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.MetastoreServiceHiveMetastoreConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceHiveMetastoreConfigKerberosConfigArgs.builder
      builder.kerberosConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.MetastoreServiceHiveMetastoreConfigKerberosConfigArgs.Builder)
    /**
     * @param keytab A Kerberos keytab file that can be used to authenticate a service principal with a Kerberos Key Distribution Center (KDC).
     * Structure is documented below.
     * @return builder
     */
    def keytab(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.MetastoreServiceHiveMetastoreConfigKerberosConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabArgs.builder
      builder.keytab(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.MetastoreServiceIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.MetastoreServiceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.MetastoreServiceIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.MetastoreServiceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.MetastoreServiceMetadataIntegrationArgs.Builder)
    /**
     * @param dataCatalogConfig The integration config for the Data Catalog service.
     * Structure is documented below.
     * @return builder
     */
    def dataCatalogConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceMetadataIntegrationDataCatalogConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.MetastoreServiceMetadataIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceMetadataIntegrationDataCatalogConfigArgs.builder
      builder.dataCatalogConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.MetastoreServiceNetworkConfigArgs.Builder)
    /**
     * @param consumers The consumer-side network configuration for the Dataproc Metastore instance.
     * Structure is documented below.
     * @return builder
     */
    def consumers(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceNetworkConfigConsumerArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.MetastoreServiceNetworkConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceNetworkConfigConsumerArgs.builder
      builder.consumers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.MetastoreServiceScalingConfigArgs.Builder)
    /**
     * @param autoscalingConfig Represents the autoscaling configuration of a metastore service.
     * Structure is documented below.
     * @return builder
     */
    def autoscalingConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceScalingConfigAutoscalingConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.MetastoreServiceScalingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceScalingConfigAutoscalingConfigArgs.builder
      builder.autoscalingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.MetastoreServiceScalingConfigAutoscalingConfigArgs.Builder)
    /**
     * @param limitConfig Represents the limit configuration of a metastore service.
     * Structure is documented below.
     * @return builder
     */
    def limitConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceScalingConfigAutoscalingConfigLimitConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.MetastoreServiceScalingConfigAutoscalingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceScalingConfigAutoscalingConfigLimitConfigArgs.builder
      builder.limitConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.MetastoreServiceState.Builder)
    /**
     * @param encryptionConfig Information used to configure the Dataproc Metastore service to encrypt
     * customer data at rest.
     * Structure is documented below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.MetastoreServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param hiveMetastoreConfig Configuration information specific to running Hive metastore software as the metastore service.
     * Structure is documented below.
     * @return builder
     */
    def hiveMetastoreConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceHiveMetastoreConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.MetastoreServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceHiveMetastoreConfigArgs.builder
      builder.hiveMetastoreConfig(args(argsBuilder).build)

    /**
     * @param maintenanceWindow The one hour maintenance window of the metastore service.
     * This specifies when the service can be restarted for maintenance purposes in UTC time.
     * Maintenance window is not needed for services with the `SPANNER` database type.
     * Structure is documented below.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceMaintenanceWindowArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.MetastoreServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    /**
     * @param metadataIntegration The setting that defines how metastore metadata should be integrated with external services and systems.
     * Structure is documented below.
     * @return builder
     */
    def metadataIntegration(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceMetadataIntegrationArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.MetastoreServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceMetadataIntegrationArgs.builder
      builder.metadataIntegration(args(argsBuilder).build)

    /**
     * @param networkConfig The configuration specifying the network settings for the Dataproc Metastore service.
     * Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceNetworkConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.MetastoreServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param scalingConfig Represents the scaling configuration of a metastore service.
     * Structure is documented below.
     * @return builder
     */
    def scalingConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceScalingConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.MetastoreServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceScalingConfigArgs.builder
      builder.scalingConfig(args(argsBuilder).build)

    /**
     * @param scheduledBackup The configuration of scheduled backup for the metastore service.
     * Structure is documented below.
     * @return builder
     */
    def scheduledBackup(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceScheduledBackupArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.MetastoreServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceScheduledBackupArgs.builder
      builder.scheduledBackup(args(argsBuilder).build)

    /**
     * @param telemetryConfig The configuration specifying telemetry settings for the Dataproc Metastore service. If unspecified defaults to JSON.
     * Structure is documented below.
     * @return builder
     */
    def telemetryConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreServiceTelemetryConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.MetastoreServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreServiceTelemetryConfigArgs.builder
      builder.telemetryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.MetastoreTableIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreTableIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.MetastoreTableIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreTableIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.MetastoreTableIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataproc.inputs.MetastoreTableIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.MetastoreTableIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.MetastoreTableIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.SessionTemplateEnvironmentConfigArgs.Builder)
    /**
     * @param executionConfig Execution configuration for a workload.
     * Structure is documented below.
     * @return builder
     */
    def executionConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.SessionTemplateEnvironmentConfigExecutionConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.SessionTemplateEnvironmentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.SessionTemplateEnvironmentConfigExecutionConfigArgs.builder
      builder.executionConfig(args(argsBuilder).build)

    /**
     * @param peripheralsConfig Peripherals configuration that workload has access to.
     * Structure is documented below.
     * @return builder
     */
    def peripheralsConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.SessionTemplateEnvironmentConfigPeripheralsConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.SessionTemplateEnvironmentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.SessionTemplateEnvironmentConfigPeripheralsConfigArgs.builder
      builder.peripheralsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.SessionTemplateEnvironmentConfigExecutionConfigArgs.Builder)
    /**
     * @param authenticationConfig Authentication configuration for a workload is used to set the default identity for the workload execution.
     * Structure is documented below.
     * @return builder
     */
    def authenticationConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.SessionTemplateEnvironmentConfigExecutionConfigAuthenticationConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.SessionTemplateEnvironmentConfigExecutionConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.SessionTemplateEnvironmentConfigExecutionConfigAuthenticationConfigArgs.builder
      builder.authenticationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.SessionTemplateEnvironmentConfigPeripheralsConfigArgs.Builder)
    /**
     * @param sparkHistoryServerConfig The Spark History Server configuration for the workload.
     * Structure is documented below.
     * @return builder
     */
    def sparkHistoryServerConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.SessionTemplateEnvironmentConfigPeripheralsConfigSparkHistoryServerConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.SessionTemplateEnvironmentConfigPeripheralsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.SessionTemplateEnvironmentConfigPeripheralsConfigSparkHistoryServerConfigArgs.builder
      builder.sparkHistoryServerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.SessionTemplateState.Builder)
    /**
     * @param environmentConfig Environment configuration for the session execution.
     * Structure is documented below.
     * @return builder
     */
    def environmentConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.SessionTemplateEnvironmentConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.SessionTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.SessionTemplateEnvironmentConfigArgs.builder
      builder.environmentConfig(args(argsBuilder).build)

    /**
     * @param jupyterSession Jupyter configuration for an interactive session.
     * Structure is documented below.
     * @return builder
     */
    def jupyterSession(args: Endofunction[com.pulumi.gcp.dataproc.inputs.SessionTemplateJupyterSessionArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.SessionTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.SessionTemplateJupyterSessionArgs.builder
      builder.jupyterSession(args(argsBuilder).build)

    /**
     * @param runtimeConfig Runtime configuration for the session template.
     * Structure is documented below.
     * @return builder
     */
    def runtimeConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.SessionTemplateRuntimeConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.SessionTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.SessionTemplateRuntimeConfigArgs.builder
      builder.runtimeConfig(args(argsBuilder).build)

    /**
     * @param sparkConnectSession Spark connect configuration for an interactive session.
     * @return builder
     */
    def sparkConnectSession(args: Endofunction[com.pulumi.gcp.dataproc.inputs.SessionTemplateSparkConnectSessionArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.SessionTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.SessionTemplateSparkConnectSessionArgs.builder
      builder.sparkConnectSession(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobArgs.Builder)
    /**
     * @param hadoopJob Job is a Hadoop job.
     * @return builder
     */
    def hadoopJob(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobHadoopJobArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobHadoopJobArgs.builder
      builder.hadoopJob(args(argsBuilder).build)

    /**
     * @param hiveJob Job is a Hive job.
     * @return builder
     */
    def hiveJob(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobHiveJobArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobHiveJobArgs.builder
      builder.hiveJob(args(argsBuilder).build)

    /**
     * @param pigJob Job is a Pig job.
     * @return builder
     */
    def pigJob(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPigJobArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPigJobArgs.builder
      builder.pigJob(args(argsBuilder).build)

    /**
     * @param prestoJob Job is a Presto job.
     * @return builder
     */
    def prestoJob(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPrestoJobArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPrestoJobArgs.builder
      builder.prestoJob(args(argsBuilder).build)

    /**
     * @param pysparkJob Job is a PySpark job.
     * @return builder
     */
    def pysparkJob(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPysparkJobArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPysparkJobArgs.builder
      builder.pysparkJob(args(argsBuilder).build)

    /**
     * @param scheduling Job scheduling configuration.
     * @return builder
     */
    def scheduling(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSchedulingArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSchedulingArgs.builder
      builder.scheduling(args(argsBuilder).build)

    /**
     * @param sparkJob Job is a Spark job.
     * @return builder
     */
    def sparkJob(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkJobArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkJobArgs.builder
      builder.sparkJob(args(argsBuilder).build)

    /**
     * @param sparkRJob Job is a SparkR job.
     * @return builder
     */
    def sparkRJob(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkRJobArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkRJobArgs.builder
      builder.sparkRJob(args(argsBuilder).build)

    /**
     * @param sparkSqlJob Job is a SparkSql job.
     * @return builder
     */
    def sparkSqlJob(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkSqlJobArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkSqlJobArgs.builder
      builder.sparkSqlJob(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobHadoopJobArgs.Builder)
    /**
     * @param loggingConfig The runtime log config for job execution.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobHadoopJobLoggingConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobHadoopJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobHadoopJobLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobHiveJobArgs.Builder)
    /**
     * @param queryList A list of queries.
     * @return builder
     */
    def queryList(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobHiveJobQueryListArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobHiveJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobHiveJobQueryListArgs.builder
      builder.queryList(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPigJobArgs.Builder)
    /**
     * @param loggingConfig The runtime log config for job execution.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPigJobLoggingConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPigJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPigJobLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param queryList A list of queries.
     * @return builder
     */
    def queryList(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPigJobQueryListArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPigJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPigJobQueryListArgs.builder
      builder.queryList(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPrestoJobArgs.Builder)
    /**
     * @param loggingConfig The runtime log config for job execution.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPrestoJobLoggingConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPrestoJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPrestoJobLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param queryList A list of queries.
     * @return builder
     */
    def queryList(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPrestoJobQueryListArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPrestoJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPrestoJobQueryListArgs.builder
      builder.queryList(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPysparkJobArgs.Builder)
    /**
     * @param loggingConfig The runtime log config for job execution.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPysparkJobLoggingConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPysparkJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPysparkJobLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkJobArgs.Builder)
    /**
     * @param loggingConfig The runtime log config for job execution.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkJobLoggingConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkJobLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkRJobArgs.Builder)
    /**
     * @param loggingConfig The runtime log config for job execution.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkRJobLoggingConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkRJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkRJobLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkSqlJobArgs.Builder)
    /**
     * @param loggingConfig The runtime log config for job execution.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkSqlJobLoggingConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkSqlJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkSqlJobLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param queryList A list of queries.
     * @return builder
     */
    def queryList(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkSqlJobQueryListArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkSqlJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkSqlJobQueryListArgs.builder
      builder.queryList(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterArgs.Builder)
    /**
     * @param validation Validation rules to be applied to this parameter&#39;s value.
     * @return builder
     */
    def validation(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterValidationArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterValidationArgs.builder
      builder.validation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterValidationArgs.Builder)
    /**
     * @param regex Validation based on regular expressions.
     * @return builder
     */
    def regex(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterValidationRegexArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterValidationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterValidationRegexArgs.builder
      builder.regex(args(argsBuilder).build)

    /**
     * @param values Validation based on a list of allowed values.
     * @return builder
     */
    def values(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterValidationValuesArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterValidationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterValidationValuesArgs.builder
      builder.values(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementArgs.Builder)
    /**
     * @param clusterSelector A selector that chooses target cluster for jobs based on metadata. The selector is evaluated at the time each job is submitted. Structure is documented below.
     * @return builder
     */
    def clusterSelector(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementClusterSelectorArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementClusterSelectorArgs.builder
      builder.clusterSelector(args(argsBuilder).build)

    /**
     * @param managedCluster A cluster that is managed by the workflow. Structure is documented below.
     * @return builder
     */
    def managedCluster(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterArgs.builder
      builder.managedCluster(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterArgs.Builder)
    /**
     * @param config Required. The cluster configuration. Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigArgs.Builder)
    /**
     * @param autoscalingConfig Autoscaling config for the policy associated with the cluster. Cluster does not autoscale if this field is unset.
     * @return builder
     */
    def autoscalingConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfigArgs.builder
      builder.autoscalingConfig(args(argsBuilder).build)

    /**
     * @param encryptionConfig Encryption settings for the cluster.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param endpointConfig Port/endpoint configuration for this cluster
     * @return builder
     */
    def endpointConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigEndpointConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigEndpointConfigArgs.builder
      builder.endpointConfig(args(argsBuilder).build)

    /**
     * @param gceClusterConfig The shared Compute Engine config settings for all instances in a cluster.
     * @return builder
     */
    def gceClusterConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigArgs.builder
      builder.gceClusterConfig(args(argsBuilder).build)

    /**
     * @param gkeClusterConfig The Kubernetes Engine config for Dataproc clusters deployed to Kubernetes. Setting this is considered mutually exclusive with Compute Engine-based options such as `gceClusterConfig`, `masterConfig`, `workerConfig`, `secondaryWorkerConfig`, and `autoscalingConfig`.
     * @return builder
     */
    def gkeClusterConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigArgs.builder
      builder.gkeClusterConfig(args(argsBuilder).build)

    /**
     * @param initializationActions Commands to execute on each node after config is completed. By default, executables are run on master and all worker nodes. You can test a node&#39;s `role` metadata to run an executable on a master or worker node, as shown below using `curl` (you can also use `wget`): ROLE=\$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1/instance/attributes/dataproc-role) if ; then ... master specific actions ... else ... worker specific actions ... fi
     * @return builder
     */
    def initializationActions(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigInitializationActionArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigInitializationActionArgs.builder
      builder.initializationActions(args.map(_(argsBuilder).build)*)

    /**
     * @param lifecycleConfig Lifecycle setting for the cluster.
     * @return builder
     */
    def lifecycleConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigArgs.builder
      builder.lifecycleConfig(args(argsBuilder).build)

    /**
     * @param masterConfig The Compute Engine config settings for additional worker instances in a cluster. Structure is documented below.
     * @return builder
     */
    def masterConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigArgs.builder
      builder.masterConfig(args(argsBuilder).build)

    /**
     * @param metastoreConfig Metastore configuration.
     * @return builder
     */
    def metastoreConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMetastoreConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMetastoreConfigArgs.builder
      builder.metastoreConfig(args(argsBuilder).build)

    /**
     * @param secondaryWorkerConfig The Compute Engine config settings for additional worker instances in a cluster. Structure is documented below.
     * @return builder
     */
    def secondaryWorkerConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigArgs.builder
      builder.secondaryWorkerConfig(args(argsBuilder).build)

    /**
     * @param securityConfig Security settings for the cluster.
     * @return builder
     */
    def securityConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecurityConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecurityConfigArgs.builder
      builder.securityConfig(args(argsBuilder).build)

    /**
     * @param softwareConfig The config settings for software inside the cluster.
     * @return builder
     */
    def softwareConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigArgs.builder
      builder.softwareConfig(args(argsBuilder).build)

    /**
     * @param workerConfig The Compute Engine config settings for additional worker instances in a cluster. Structure is documented below.
     * 
     * ***
     * @return builder
     */
    def workerConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs.builder
      builder.workerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigArgs.Builder)
    /**
     * @param nodeGroupAffinity Node Group Affinity for sole-tenant clusters.
     * @return builder
     */
    def nodeGroupAffinity(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs.builder
      builder.nodeGroupAffinity(args(argsBuilder).build)

    /**
     * @param reservationAffinity Reservation Affinity for consuming Zonal reservation.
     * @return builder
     */
    def reservationAffinity(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityArgs.builder
      builder.reservationAffinity(args(argsBuilder).build)

    /**
     * @param shieldedInstanceConfig Shielded Instance Config for clusters using [Compute Engine Shielded VMs](https://docs.cloud.google.com/security/shielded-cloud/shielded-vm). Structure defined below.
     * @return builder
     */
    def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigArgs.Builder)
    /**
     * @param namespacedGkeDeploymentTarget A target for the deployment.
     * @return builder
     */
    def namespacedGkeDeploymentTarget(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTargetArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTargetArgs.builder
      builder.namespacedGkeDeploymentTarget(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigArgs.Builder)
    /**
     * @param accelerators The Compute Engine accelerator configuration for these instances. Structure is documented below.
     * @return builder
     */
    def accelerators(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigAcceleratorArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigAcceleratorArgs.builder
      builder.accelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param diskConfig Disk option config settings. Structure is documented below.
     * @return builder
     */
    def diskConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs.builder
      builder.diskConfig(args(argsBuilder).build)

    /**
     * @param instanceFlexibilityPolicy Instance flexibility Policy allowing a mixture of VM shapes and provisioning models. Supported on `masterConfig`, `workerConfig`, and `secondaryWorkerConfig` (provisioning models are supported exclusively on `secondaryWorkerConfig`). Structure is documented below.
     * @return builder
     */
    def instanceFlexibilityPolicy(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigInstanceFlexibilityPolicyArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigInstanceFlexibilityPolicyArgs.builder
      builder.instanceFlexibilityPolicy(args(argsBuilder).build)

    /**
     * @param managedGroupConfigs Output only. The config for Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups.
     * @return builder
     */
    def managedGroupConfigs(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfigArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfigArgs.builder
      builder.managedGroupConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs.Builder)
    /**
     * @param attachedDiskConfigs Optional. Attached disk configuration. Structure is documented below.
     * @return builder
     */
    def attachedDiskConfigs(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigAttachedDiskConfigArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigAttachedDiskConfigArgs.builder
      builder.attachedDiskConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigInstanceFlexibilityPolicyArgs.Builder)
    /**
     * @param instanceSelectionLists List of instance selection options that the group will use when creating new VMs. Structure is documented below.
     * @return builder
     */
    def instanceSelectionLists(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigInstanceFlexibilityPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.builder
      builder.instanceSelectionLists(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceSelectionResults Output only. A list of instance selection results that were successfully allocated. Structure is documented below.
     * @return builder
     */
    def instanceSelectionResults(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionResultArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigInstanceFlexibilityPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionResultArgs.builder
      builder.instanceSelectionResults(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.Builder)
    /**
     * @param diskConfig Disk option for the instance group. Structure is documented above.
     * @return builder
     */
    def diskConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.builder
      builder.diskConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.Builder)
    /**
     * @param attachedDiskConfigs Optional. Attached disk configuration. Structure is documented below.
     * @return builder
     */
    def attachedDiskConfigs(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigAttachedDiskConfigArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigAttachedDiskConfigArgs.builder
      builder.attachedDiskConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigArgs.Builder)
    /**
     * @param accelerators The Compute Engine accelerator configuration for these instances. Structure is documented below.
     * @return builder
     */
    def accelerators(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigAcceleratorArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigAcceleratorArgs.builder
      builder.accelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param diskConfig Disk option config settings. Structure is documented below.
     * @return builder
     */
    def diskConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigDiskConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigDiskConfigArgs.builder
      builder.diskConfig(args(argsBuilder).build)

    /**
     * @param instanceFlexibilityPolicy Instance flexibility Policy allowing a mixture of VM shapes and provisioning models. Structure is documented below.
     * @return builder
     */
    def instanceFlexibilityPolicy(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigInstanceFlexibilityPolicyArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigInstanceFlexibilityPolicyArgs.builder
      builder.instanceFlexibilityPolicy(args(argsBuilder).build)

    /**
     * @param managedGroupConfigs Output only. The config for Compute Engine Instance Group Manager that manages this group.
     * @return builder
     */
    def managedGroupConfigs(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigManagedGroupConfigArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigManagedGroupConfigArgs.builder
      builder.managedGroupConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigDiskConfigArgs.Builder)
    /**
     * @param attachedDiskConfigs Optional. Attached disk configuration. Structure is documented below.
     * @return builder
     */
    def attachedDiskConfigs(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigDiskConfigAttachedDiskConfigArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigDiskConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigDiskConfigAttachedDiskConfigArgs.builder
      builder.attachedDiskConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigInstanceFlexibilityPolicyArgs.Builder)
    /**
     * @param instanceSelectionLists List of instance selection options that the group will use when creating new VMs. Structure is documented below.
     * @return builder
     */
    def instanceSelectionLists(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigInstanceFlexibilityPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.builder
      builder.instanceSelectionLists(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceSelectionResults Output only. A list of instance selection results that were successfully allocated. Structure is documented below.
     * @return builder
     */
    def instanceSelectionResults(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigInstanceFlexibilityPolicyInstanceSelectionResultArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigInstanceFlexibilityPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigInstanceFlexibilityPolicyInstanceSelectionResultArgs.builder
      builder.instanceSelectionResults(args.map(_(argsBuilder).build)*)

    /**
     * @param provisioningModelMix Strategy for provisioning model mix for secondary worker instances. Supported only for `secondaryWorkerConfig`. Structure is documented below.
     * @return builder
     */
    def provisioningModelMix(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigInstanceFlexibilityPolicyProvisioningModelMixArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigInstanceFlexibilityPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigInstanceFlexibilityPolicyProvisioningModelMixArgs.builder
      builder.provisioningModelMix(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.Builder)
    /**
     * @param diskConfig Disk option for the instance group. Structure is documented above.
     * @return builder
     */
    def diskConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.builder
      builder.diskConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.Builder)
    /**
     * @param attachedDiskConfigs Optional. Attached disk configuration. Structure is documented below.
     * @return builder
     */
    def attachedDiskConfigs(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigAttachedDiskConfigArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigAttachedDiskConfigArgs.builder
      builder.attachedDiskConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecurityConfigArgs.Builder)
    /**
     * @param kerberosConfig Kerberos related configuration.
     * @return builder
     */
    def kerberosConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecurityConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs.builder
      builder.kerberosConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs.Builder)
    /**
     * @param accelerators The Compute Engine accelerator configuration for these instances. Structure is documented below.
     * @return builder
     */
    def accelerators(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs.builder
      builder.accelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param diskConfig Disk option config settings. Structure is documented below.
     * @return builder
     */
    def diskConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs.builder
      builder.diskConfig(args(argsBuilder).build)

    /**
     * @param instanceFlexibilityPolicy Instance flexibility Policy allowing a mixture of VM shapes. Structure is documented below.
     * @return builder
     */
    def instanceFlexibilityPolicy(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigInstanceFlexibilityPolicyArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigInstanceFlexibilityPolicyArgs.builder
      builder.instanceFlexibilityPolicy(args(argsBuilder).build)

    /**
     * @param managedGroupConfigs Output only. The config for Compute Engine Instance Group Manager that manages this group.
     * @return builder
     */
    def managedGroupConfigs(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs.builder
      builder.managedGroupConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs.Builder)
    /**
     * @param attachedDiskConfigs Optional. Attached disk configuration. Structure is documented below.
     * @return builder
     */
    def attachedDiskConfigs(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigAttachedDiskConfigArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigAttachedDiskConfigArgs.builder
      builder.attachedDiskConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigInstanceFlexibilityPolicyArgs.Builder)
    /**
     * @param instanceSelectionLists List of instance selection options that the group will use when creating new VMs. Structure is documented below.
     * @return builder
     */
    def instanceSelectionLists(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigInstanceFlexibilityPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.builder
      builder.instanceSelectionLists(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceSelectionResults Output only. A list of instance selection results that were successfully allocated. Structure is documented below.
     * @return builder
     */
    def instanceSelectionResults(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionResultArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigInstanceFlexibilityPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionResultArgs.builder
      builder.instanceSelectionResults(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.Builder)
    /**
     * @param diskConfig Disk option for the instance group. Structure is documented above.
     * @return builder
     */
    def diskConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.builder
      builder.diskConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.Builder)
    /**
     * @param attachedDiskConfigs Optional. Attached disk configuration. Structure is documented below.
     * @return builder
     */
    def attachedDiskConfigs(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigAttachedDiskConfigArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigInstanceFlexibilityPolicyInstanceSelectionListDiskConfigAttachedDiskConfigArgs.builder
      builder.attachedDiskConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataproc.inputs.WorkflowTemplateState.Builder)
    /**
     * @param encryptionConfig Encryption settings for encrypting workflow template job arguments. Structure is documented below
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param jobs (Required) The Directed Acyclic Graph of Jobs to submit. Structure is documented below
     * @return builder
     */
    def jobs(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateState.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobArgs.builder
      builder.jobs(args.map(_(argsBuilder).build)*)

    /**
     * @param parameters Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided when the template is instantiated.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterArgs.Builder]*):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateState.Builder =
      def argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

    /**
     * @param placement WorkflowTemplate scheduling information. Structure is documented below.
     * @return builder
     */
    def placement(args: Endofunction[com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementArgs.Builder]):
        com.pulumi.gcp.dataproc.inputs.WorkflowTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementArgs.builder
      builder.placement(args(argsBuilder).build)
