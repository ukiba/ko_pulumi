package jp.ukiba.ko_pulumi
package aws

object emrcontainers_ext:
  extension (builder: com.pulumi.aws.emrcontainers.JobTemplateArgs.Builder)
    /**
     * @param jobTemplateData The job template data which holds values of StartJobRun API request.
     * @return builder
     */
    inline def jobTemplateData(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataArgs.Builder]):
        com.pulumi.aws.emrcontainers.JobTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataArgs.builder
      builder.jobTemplateData(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrcontainers.VirtualClusterArgs.Builder)
    /**
     * @param containerProvider Configuration block for the container provider associated with your cluster.
     * @return builder
     */
    inline def containerProvider(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderArgs.Builder]):
        com.pulumi.aws.emrcontainers.VirtualClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderArgs.builder
      builder.containerProvider(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataArgs.Builder)
    /**
     * @param configurationOverrides The configuration settings that are used to override defaults configuration.
     * @return builder
     */
    inline def configurationOverrides(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesArgs.builder
      builder.configurationOverrides(args(argsBuilder).build)

    /**
     * @param jobDriver Specify the driver that the job runs on. Exactly one of the two available job drivers is required, either sparkSqlJobDriver or sparkSubmitJobDriver.
     * @return builder
     */
    inline def jobDriver(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataJobDriverArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataJobDriverArgs.builder
      builder.jobDriver(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesApplicationConfigurationArgs.Builder)
    /**
     * @param configurations A list of additional configurations to apply within a configuration object.
     * @return builder
     */
    inline def configurations(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesApplicationConfigurationConfigurationArgs.Builder]*):
        com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesApplicationConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesApplicationConfigurationConfigurationArgs.builder
      builder.configurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesArgs.Builder)
    /**
     * @param applicationConfigurations The configurations for the application running by the job run.
     * @return builder
     */
    inline def applicationConfigurations(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesApplicationConfigurationArgs.Builder]*):
        com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesArgs.Builder =
      def argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesApplicationConfigurationArgs.builder
      builder.applicationConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param monitoringConfiguration The configurations for monitoring.
     * @return builder
     */
    inline def monitoringConfiguration(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationArgs.builder
      builder.monitoringConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationArgs.Builder)
    /**
     * @param cloudWatchMonitoringConfiguration Monitoring configurations for CloudWatch.
     * @return builder
     */
    inline def cloudWatchMonitoringConfiguration(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationCloudWatchMonitoringConfigurationArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationCloudWatchMonitoringConfigurationArgs.builder
      builder.cloudWatchMonitoringConfiguration(args(argsBuilder).build)

    /**
     * @param s3MonitoringConfiguration Amazon S3 configuration for monitoring log publishing.
     * @return builder
     */
    inline def s3MonitoringConfiguration(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationS3MonitoringConfigurationArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationS3MonitoringConfigurationArgs.builder
      builder.s3MonitoringConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataJobDriverArgs.Builder)
    /**
     * @param sparkSqlJobDriver The job driver for job type.
     * @return builder
     */
    inline def sparkSqlJobDriver(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataJobDriverSparkSqlJobDriverArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataJobDriverArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataJobDriverSparkSqlJobDriverArgs.builder
      builder.sparkSqlJobDriver(args(argsBuilder).build)

    /**
     * @param sparkSubmitJobDriver The job driver parameters specified for spark submit.
     * @return builder
     */
    inline def sparkSubmitJobDriver(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataJobDriverSparkSubmitJobDriverArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataJobDriverArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataJobDriverSparkSubmitJobDriverArgs.builder
      builder.sparkSubmitJobDriver(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrcontainers.inputs.JobTemplateState.Builder)
    /**
     * @param jobTemplateData The job template data which holds values of StartJobRun API request.
     * @return builder
     */
    inline def jobTemplateData(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.JobTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataArgs.builder
      builder.jobTemplateData(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderArgs.Builder)
    /**
     * @param info Nested list containing information about the configuration of the container provider
     * @return builder
     */
    inline def info(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderInfoArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderInfoArgs.builder
      builder.info(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderInfoArgs.Builder)
    /**
     * @param eksInfo Nested list containing EKS-specific information about the cluster where the EMR Containers cluster is running
     * @return builder
     */
    inline def eksInfo(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderInfoEksInfoArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderInfoEksInfoArgs.builder
      builder.eksInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrcontainers.inputs.VirtualClusterState.Builder)
    /**
     * @param containerProvider Configuration block for the container provider associated with your cluster.
     * @return builder
     */
    inline def containerProvider(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.VirtualClusterState.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderArgs.builder
      builder.containerProvider(args(argsBuilder).build)
