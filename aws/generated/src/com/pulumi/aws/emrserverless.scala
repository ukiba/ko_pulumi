package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object emrserverless:
  /** Manages an EMR Serverless Application. */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.emrserverless.ApplicationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.emrserverless.ApplicationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.emrserverless.Application(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.emrserverless.ApplicationArgs.Builder)
    /**
     * @param autoStartConfiguration The configuration for an application to automatically start on job submission.
     * @return builder
     */
    def autoStartConfiguration(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationAutoStartConfigurationArgs.Builder]):
        com.pulumi.aws.emrserverless.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationAutoStartConfigurationArgs.builder
      builder.autoStartConfiguration(args(argsBuilder).build)

    /**
     * @param autoStopConfiguration The configuration for an application to automatically stop after a certain amount of time being idle.
     * @return builder
     */
    def autoStopConfiguration(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationAutoStopConfigurationArgs.Builder]):
        com.pulumi.aws.emrserverless.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationAutoStopConfigurationArgs.builder
      builder.autoStopConfiguration(args(argsBuilder).build)

    /**
     * @param imageConfiguration The image configuration applied to all worker types.
     * @return builder
     */
    def imageConfiguration(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationImageConfigurationArgs.Builder]):
        com.pulumi.aws.emrserverless.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationImageConfigurationArgs.builder
      builder.imageConfiguration(args(argsBuilder).build)

    /**
     * @param initialCapacities The capacity to initialize when the application is created.
     * @return builder
     */
    def initialCapacities(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationInitialCapacityArgs.Builder]*):
        com.pulumi.aws.emrserverless.ApplicationArgs.Builder =
      def argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationInitialCapacityArgs.builder
      builder.initialCapacities(args.map(_(argsBuilder).build)*)

    /**
     * @param interactiveConfiguration Enables the interactive use cases to use when running an application.
     * @return builder
     */
    def interactiveConfiguration(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationInteractiveConfigurationArgs.Builder]):
        com.pulumi.aws.emrserverless.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationInteractiveConfigurationArgs.builder
      builder.interactiveConfiguration(args(argsBuilder).build)

    /**
     * @param maximumCapacity The maximum capacity to allocate when the application is created. This is cumulative across all workers at any given point in time, not just when an application is created. No new resources will be created once any one of the defined limits is hit.
     * @return builder
     */
    def maximumCapacity(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationMaximumCapacityArgs.Builder]):
        com.pulumi.aws.emrserverless.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationMaximumCapacityArgs.builder
      builder.maximumCapacity(args(argsBuilder).build)

    /**
     * @param monitoringConfiguration The configuration setting for monitoring.
     * @return builder
     */
    def monitoringConfiguration(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationMonitoringConfigurationArgs.Builder]):
        com.pulumi.aws.emrserverless.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationMonitoringConfigurationArgs.builder
      builder.monitoringConfiguration(args(argsBuilder).build)

    /**
     * @param networkConfiguration The network configuration for customer VPC connectivity.
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.emrserverless.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param runtimeConfigurations A configuration specification to be used when provisioning an application. A configuration consists of a classification, properties, and optional nested configurations. A classification refers to an application-specific configuration file. Properties are the settings you want to change in that file.
     * @return builder
     */
    def runtimeConfigurations(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationRuntimeConfigurationArgs.Builder]*):
        com.pulumi.aws.emrserverless.ApplicationArgs.Builder =
      def argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationRuntimeConfigurationArgs.builder
      builder.runtimeConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param schedulerConfiguration Scheduler configuration for batch and streaming jobs running on this application. Supported with release labels `emr-7.0.0` and above. See schedulerConfiguration Arguments below.
     * @return builder
     */
    def schedulerConfiguration(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationSchedulerConfigurationArgs.Builder]):
        com.pulumi.aws.emrserverless.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationSchedulerConfigurationArgs.builder
      builder.schedulerConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrserverless.inputs.ApplicationMonitoringConfigurationArgs.Builder)
    /**
     * @param cloudwatchLoggingConfiguration The Amazon CloudWatch configuration for monitoring logs.
     * @return builder
     */
    def cloudwatchLoggingConfiguration(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationMonitoringConfigurationCloudwatchLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.emrserverless.inputs.ApplicationMonitoringConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationMonitoringConfigurationCloudwatchLoggingConfigurationArgs.builder
      builder.cloudwatchLoggingConfiguration(args(argsBuilder).build)

    /**
     * @param managedPersistenceMonitoringConfiguration The managed log persistence configuration for monitoring logs.
     * @return builder
     */
    def managedPersistenceMonitoringConfiguration(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationMonitoringConfigurationManagedPersistenceMonitoringConfigurationArgs.Builder]):
        com.pulumi.aws.emrserverless.inputs.ApplicationMonitoringConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationMonitoringConfigurationManagedPersistenceMonitoringConfigurationArgs.builder
      builder.managedPersistenceMonitoringConfiguration(args(argsBuilder).build)

    /**
     * @param prometheusMonitoringConfiguration The Prometheus configuration for monitoring metrics.
     * @return builder
     */
    def prometheusMonitoringConfiguration(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationMonitoringConfigurationPrometheusMonitoringConfigurationArgs.Builder]):
        com.pulumi.aws.emrserverless.inputs.ApplicationMonitoringConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationMonitoringConfigurationPrometheusMonitoringConfigurationArgs.builder
      builder.prometheusMonitoringConfiguration(args(argsBuilder).build)

    /**
     * @param s3MonitoringConfiguration The Amazon S3 configuration for monitoring log publishing.
     * @return builder
     */
    def s3MonitoringConfiguration(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationMonitoringConfigurationS3MonitoringConfigurationArgs.Builder]):
        com.pulumi.aws.emrserverless.inputs.ApplicationMonitoringConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationMonitoringConfigurationS3MonitoringConfigurationArgs.builder
      builder.s3MonitoringConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrserverless.inputs.ApplicationInitialCapacityInitialCapacityConfigArgs.Builder)
    /**
     * @param workerConfiguration The resource configuration of the initial capacity configuration.
     * @return builder
     */
    def workerConfiguration(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationInitialCapacityInitialCapacityConfigWorkerConfigurationArgs.Builder]):
        com.pulumi.aws.emrserverless.inputs.ApplicationInitialCapacityInitialCapacityConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationInitialCapacityInitialCapacityConfigWorkerConfigurationArgs.builder
      builder.workerConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrserverless.inputs.ApplicationMonitoringConfigurationCloudwatchLoggingConfigurationArgs.Builder)
    /**
     * @param logTypes The types of logs that you want to publish to CloudWatch. If you don&#39;t specify any log types, driver STDOUT and STDERR logs will be published to CloudWatch Logs by default. See logTypes for more details.
     * @return builder
     */
    def logTypes(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationMonitoringConfigurationCloudwatchLoggingConfigurationLogTypeArgs.Builder]*):
        com.pulumi.aws.emrserverless.inputs.ApplicationMonitoringConfigurationCloudwatchLoggingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationMonitoringConfigurationCloudwatchLoggingConfigurationLogTypeArgs.builder
      builder.logTypes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.emrserverless.inputs.ApplicationState.Builder)
    /**
     * @param autoStartConfiguration The configuration for an application to automatically start on job submission.
     * @return builder
     */
    def autoStartConfiguration(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationAutoStartConfigurationArgs.Builder]):
        com.pulumi.aws.emrserverless.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationAutoStartConfigurationArgs.builder
      builder.autoStartConfiguration(args(argsBuilder).build)

    /**
     * @param autoStopConfiguration The configuration for an application to automatically stop after a certain amount of time being idle.
     * @return builder
     */
    def autoStopConfiguration(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationAutoStopConfigurationArgs.Builder]):
        com.pulumi.aws.emrserverless.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationAutoStopConfigurationArgs.builder
      builder.autoStopConfiguration(args(argsBuilder).build)

    /**
     * @param imageConfiguration The image configuration applied to all worker types.
     * @return builder
     */
    def imageConfiguration(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationImageConfigurationArgs.Builder]):
        com.pulumi.aws.emrserverless.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationImageConfigurationArgs.builder
      builder.imageConfiguration(args(argsBuilder).build)

    /**
     * @param initialCapacities The capacity to initialize when the application is created.
     * @return builder
     */
    def initialCapacities(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationInitialCapacityArgs.Builder]*):
        com.pulumi.aws.emrserverless.inputs.ApplicationState.Builder =
      def argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationInitialCapacityArgs.builder
      builder.initialCapacities(args.map(_(argsBuilder).build)*)

    /**
     * @param interactiveConfiguration Enables the interactive use cases to use when running an application.
     * @return builder
     */
    def interactiveConfiguration(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationInteractiveConfigurationArgs.Builder]):
        com.pulumi.aws.emrserverless.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationInteractiveConfigurationArgs.builder
      builder.interactiveConfiguration(args(argsBuilder).build)

    /**
     * @param maximumCapacity The maximum capacity to allocate when the application is created. This is cumulative across all workers at any given point in time, not just when an application is created. No new resources will be created once any one of the defined limits is hit.
     * @return builder
     */
    def maximumCapacity(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationMaximumCapacityArgs.Builder]):
        com.pulumi.aws.emrserverless.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationMaximumCapacityArgs.builder
      builder.maximumCapacity(args(argsBuilder).build)

    /**
     * @param monitoringConfiguration The configuration setting for monitoring.
     * @return builder
     */
    def monitoringConfiguration(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationMonitoringConfigurationArgs.Builder]):
        com.pulumi.aws.emrserverless.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationMonitoringConfigurationArgs.builder
      builder.monitoringConfiguration(args(argsBuilder).build)

    /**
     * @param networkConfiguration The network configuration for customer VPC connectivity.
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.emrserverless.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param runtimeConfigurations A configuration specification to be used when provisioning an application. A configuration consists of a classification, properties, and optional nested configurations. A classification refers to an application-specific configuration file. Properties are the settings you want to change in that file.
     * @return builder
     */
    def runtimeConfigurations(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationRuntimeConfigurationArgs.Builder]*):
        com.pulumi.aws.emrserverless.inputs.ApplicationState.Builder =
      def argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationRuntimeConfigurationArgs.builder
      builder.runtimeConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param schedulerConfiguration Scheduler configuration for batch and streaming jobs running on this application. Supported with release labels `emr-7.0.0` and above. See schedulerConfiguration Arguments below.
     * @return builder
     */
    def schedulerConfiguration(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationSchedulerConfigurationArgs.Builder]):
        com.pulumi.aws.emrserverless.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationSchedulerConfigurationArgs.builder
      builder.schedulerConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emrserverless.inputs.ApplicationInitialCapacityArgs.Builder)
    /**
     * @param initialCapacityConfig The initial capacity configuration per worker.
     * @return builder
     */
    def initialCapacityConfig(args: Endofunction[com.pulumi.aws.emrserverless.inputs.ApplicationInitialCapacityInitialCapacityConfigArgs.Builder]):
        com.pulumi.aws.emrserverless.inputs.ApplicationInitialCapacityArgs.Builder =
      val argsBuilder = com.pulumi.aws.emrserverless.inputs.ApplicationInitialCapacityInitialCapacityConfigArgs.builder
      builder.initialCapacityConfig(args(argsBuilder).build)
