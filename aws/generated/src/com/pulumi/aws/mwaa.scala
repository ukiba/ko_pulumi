package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object mwaa:
  /** Creates a MWAA Environment resource. */
  def Environment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.mwaa.EnvironmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.mwaa.EnvironmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.mwaa.Environment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.mwaa.EnvironmentArgs.Builder)
    /**
     * @param loggingConfiguration The Apache Airflow logs you want to send to Amazon CloudWatch Logs. See `loggingConfiguration` Block for details.
     * @return builder
     */
    def loggingConfiguration(args: Endofunction[com.pulumi.aws.mwaa.inputs.EnvironmentLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.mwaa.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.mwaa.inputs.EnvironmentLoggingConfigurationArgs.builder
      builder.loggingConfiguration(args(argsBuilder).build)

    /**
     * @param networkConfiguration Specifies the network configuration for your Apache Airflow Environment. This includes two private subnets as well as security groups for the Airflow environment. Each subnet requires internet connection, otherwise the deployment will fail. See `networkConfiguration` Block for details.
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.mwaa.inputs.EnvironmentNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.mwaa.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.mwaa.inputs.EnvironmentNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mwaa.inputs.EnvironmentLoggingConfigurationArgs.Builder)
    /**
     * @param dagProcessingLogs (Optional) Log configuration options for processing DAGs. See Module logging configuration for more information. Disabled by default.
     * @return builder
     */
    def dagProcessingLogs(args: Endofunction[com.pulumi.aws.mwaa.inputs.EnvironmentLoggingConfigurationDagProcessingLogsArgs.Builder]):
        com.pulumi.aws.mwaa.inputs.EnvironmentLoggingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.mwaa.inputs.EnvironmentLoggingConfigurationDagProcessingLogsArgs.builder
      builder.dagProcessingLogs(args(argsBuilder).build)

    /**
     * @param schedulerLogs Log configuration options for the schedulers. See Module logging configuration for more information. Disabled by default.
     * @return builder
     */
    def schedulerLogs(args: Endofunction[com.pulumi.aws.mwaa.inputs.EnvironmentLoggingConfigurationSchedulerLogsArgs.Builder]):
        com.pulumi.aws.mwaa.inputs.EnvironmentLoggingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.mwaa.inputs.EnvironmentLoggingConfigurationSchedulerLogsArgs.builder
      builder.schedulerLogs(args(argsBuilder).build)

    /**
     * @param taskLogs Log configuration options for DAG tasks. See Module logging configuration for more information. Enabled by default with `INFO` log level.
     * @return builder
     */
    def taskLogs(args: Endofunction[com.pulumi.aws.mwaa.inputs.EnvironmentLoggingConfigurationTaskLogsArgs.Builder]):
        com.pulumi.aws.mwaa.inputs.EnvironmentLoggingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.mwaa.inputs.EnvironmentLoggingConfigurationTaskLogsArgs.builder
      builder.taskLogs(args(argsBuilder).build)

    /**
     * @param webserverLogs Log configuration options for the webservers. See Module logging configuration for more information. Disabled by default.
     * @return builder
     */
    def webserverLogs(args: Endofunction[com.pulumi.aws.mwaa.inputs.EnvironmentLoggingConfigurationWebserverLogsArgs.Builder]):
        com.pulumi.aws.mwaa.inputs.EnvironmentLoggingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.mwaa.inputs.EnvironmentLoggingConfigurationWebserverLogsArgs.builder
      builder.webserverLogs(args(argsBuilder).build)

    /**
     * @param workerLogs Log configuration options for the workers. See Module logging configuration for more information. Disabled by default.
     * @return builder
     */
    def workerLogs(args: Endofunction[com.pulumi.aws.mwaa.inputs.EnvironmentLoggingConfigurationWorkerLogsArgs.Builder]):
        com.pulumi.aws.mwaa.inputs.EnvironmentLoggingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.mwaa.inputs.EnvironmentLoggingConfigurationWorkerLogsArgs.builder
      builder.workerLogs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mwaa.inputs.EnvironmentLastUpdatedArgs.Builder)
    def errors(args: Endofunction[com.pulumi.aws.mwaa.inputs.EnvironmentLastUpdatedErrorArgs.Builder]*):
        com.pulumi.aws.mwaa.inputs.EnvironmentLastUpdatedArgs.Builder =
      def argsBuilder = com.pulumi.aws.mwaa.inputs.EnvironmentLastUpdatedErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.mwaa.inputs.EnvironmentState.Builder)
    def lastUpdateds(args: Endofunction[com.pulumi.aws.mwaa.inputs.EnvironmentLastUpdatedArgs.Builder]*):
        com.pulumi.aws.mwaa.inputs.EnvironmentState.Builder =
      def argsBuilder = com.pulumi.aws.mwaa.inputs.EnvironmentLastUpdatedArgs.builder
      builder.lastUpdateds(args.map(_(argsBuilder).build)*)

    /**
     * @param loggingConfiguration The Apache Airflow logs you want to send to Amazon CloudWatch Logs. See `loggingConfiguration` Block for details.
     * @return builder
     */
    def loggingConfiguration(args: Endofunction[com.pulumi.aws.mwaa.inputs.EnvironmentLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.mwaa.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.aws.mwaa.inputs.EnvironmentLoggingConfigurationArgs.builder
      builder.loggingConfiguration(args(argsBuilder).build)

    /**
     * @param networkConfiguration Specifies the network configuration for your Apache Airflow Environment. This includes two private subnets as well as security groups for the Airflow environment. Each subnet requires internet connection, otherwise the deployment will fail. See `networkConfiguration` Block for details.
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.mwaa.inputs.EnvironmentNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.mwaa.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.aws.mwaa.inputs.EnvironmentNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)
