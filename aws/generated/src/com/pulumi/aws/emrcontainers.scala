package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object emrcontainers:
  /** Manages an EMR Containers (EMR on EKS) Virtual Cluster. */
  def VirtualCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.emrcontainers.VirtualClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.emrcontainers.VirtualClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.emrcontainers.VirtualCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.emrcontainers.JobTemplateArgs.Builder)
    /**
     * @param jobTemplateData The job template data which holds values of StartJobRun API request.
     * @return builder
     */
    def jobTemplateData(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataArgs.Builder]):
        com.pulumi.aws.emrcontainers.JobTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataArgs.builder
      builder.jobTemplateData(args(argsBuilder).build)

  /** Manages an EMR Containers (EMR on EKS) Job Template. */
  def JobTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.emrcontainers.JobTemplateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.emrcontainers.JobTemplateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.emrcontainers.JobTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type EmrcontainersFunctions = com.pulumi.aws.emrcontainers.EmrcontainersFunctions
  object EmrcontainersFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.emrcontainers.EmrcontainersFunctions.*
  extension (self: EmrcontainersFunctions.type)
    /** Retrieve information about an EMR Containers (EMR on EKS) Virtual Cluster. */
    def getVirtualCluster(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.GetVirtualClusterArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.emrcontainers.outputs.GetVirtualClusterResult] =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.GetVirtualClusterArgs.builder
      com.pulumi.aws.emrcontainers.EmrcontainersFunctions.getVirtualCluster(args(argsBuilder).build)

    /** Retrieve information about an EMR Containers (EMR on EKS) Virtual Cluster. */
    def getVirtualClusterPlain(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.GetVirtualClusterPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.emrcontainers.outputs.GetVirtualClusterResult] =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.GetVirtualClusterPlainArgs.builder
      com.pulumi.aws.emrcontainers.EmrcontainersFunctions.getVirtualClusterPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrcontainers.VirtualClusterArgs.Builder)
    /**
     * @param containerProvider Configuration block for the container provider associated with your cluster.
     * @return builder
     */
    def containerProvider(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderArgs.Builder]):
        com.pulumi.aws.emrcontainers.VirtualClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderArgs.builder
      builder.containerProvider(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataJobDriverArgs.Builder)
    /**
     * @param sparkSqlJobDriver The job driver for job type.
     * @return builder
     */
    def sparkSqlJobDriver(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataJobDriverSparkSqlJobDriverArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataJobDriverArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataJobDriverSparkSqlJobDriverArgs.builder
      builder.sparkSqlJobDriver(args(argsBuilder).build)

    /**
     * @param sparkSubmitJobDriver The job driver parameters specified for spark submit.
     * @return builder
     */
    def sparkSubmitJobDriver(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataJobDriverSparkSubmitJobDriverArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataJobDriverArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataJobDriverSparkSubmitJobDriverArgs.builder
      builder.sparkSubmitJobDriver(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesArgs.Builder)
    /**
     * @param applicationConfigurations The configurations for the application running by the job run.
     * @return builder
     */
    def applicationConfigurations(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesApplicationConfigurationArgs.Builder]*):
        com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesArgs.Builder =
      def argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesApplicationConfigurationArgs.builder
      builder.applicationConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param monitoringConfiguration The configurations for monitoring.
     * @return builder
     */
    def monitoringConfiguration(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationArgs.builder
      builder.monitoringConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesApplicationConfigurationArgs.Builder)
    /**
     * @param configurations A list of additional configurations to apply within a configuration object.
     * @return builder
     */
    def configurations(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesApplicationConfigurationConfigurationArgs.Builder]*):
        com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesApplicationConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesApplicationConfigurationConfigurationArgs.builder
      builder.configurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataArgs.Builder)
    /**
     * @param configurationOverrides The configuration settings that are used to override defaults configuration.
     * @return builder
     */
    def configurationOverrides(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesArgs.builder
      builder.configurationOverrides(args(argsBuilder).build)

    /**
     * @param jobDriver Specify the driver that the job runs on. Exactly one of the two available job drivers is required, either sparkSqlJobDriver or sparkSubmitJobDriver.
     * @return builder
     */
    def jobDriver(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataJobDriverArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataJobDriverArgs.builder
      builder.jobDriver(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrcontainers.inputs.VirtualClusterState.Builder)
    /**
     * @param containerProvider Configuration block for the container provider associated with your cluster.
     * @return builder
     */
    def containerProvider(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.VirtualClusterState.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderArgs.builder
      builder.containerProvider(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderArgs.Builder)
    /**
     * @param info Nested list containing information about the configuration of the container provider
     * @return builder
     */
    def info(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderInfoArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderInfoArgs.builder
      builder.info(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrcontainers.inputs.JobTemplateState.Builder)
    /**
     * @param jobTemplateData The job template data which holds values of StartJobRun API request.
     * @return builder
     */
    def jobTemplateData(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.JobTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataArgs.builder
      builder.jobTemplateData(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderInfoArgs.Builder)
    /**
     * @param eksInfo Nested list containing EKS-specific information about the cluster where the EMR Containers cluster is running
     * @return builder
     */
    def eksInfo(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderInfoEksInfoArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderInfoEksInfoArgs.builder
      builder.eksInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationArgs.Builder)
    /**
     * @param cloudWatchMonitoringConfiguration Monitoring configurations for CloudWatch.
     * @return builder
     */
    def cloudWatchMonitoringConfiguration(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationCloudWatchMonitoringConfigurationArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationCloudWatchMonitoringConfigurationArgs.builder
      builder.cloudWatchMonitoringConfiguration(args(argsBuilder).build)

    /**
     * @param s3MonitoringConfiguration Amazon S3 configuration for monitoring log publishing.
     * @return builder
     */
    def s3MonitoringConfiguration(args: Endofunction[com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationS3MonitoringConfigurationArgs.Builder]):
        com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrcontainers.inputs.JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationS3MonitoringConfigurationArgs.builder
      builder.s3MonitoringConfiguration(args(argsBuilder).build)
