package jp.ukiba.ko_pulumi
package aws

object fis_ext:
  extension (builder: com.pulumi.aws.fis.ExperimentTemplateArgs.Builder)
    /**
     * @param actions Action to be performed during an experiment. See below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateActionArgs.Builder]*):
        com.pulumi.aws.fis.ExperimentTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param experimentOptions Experiment options for the experiment template. See experimentOptions below for more details!
     * @return builder
     */
    inline def experimentOptions(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentOptionsArgs.Builder]):
        com.pulumi.aws.fis.ExperimentTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentOptionsArgs.builder
      builder.experimentOptions(args(argsBuilder).build)

    /**
     * @param experimentReportConfiguration Configuration for [experiment reporting](https://docs.aws.amazon.com/fis/latest/userguide/experiment-report-configuration.html). See below.
     * @return builder
     */
    inline def experimentReportConfiguration(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationArgs.Builder]):
        com.pulumi.aws.fis.ExperimentTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationArgs.builder
      builder.experimentReportConfiguration(args(argsBuilder).build)

    /**
     * @param logConfiguration Configuration for experiment logging. See below.
     * @return builder
     */
    inline def logConfiguration(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationArgs.Builder]):
        com.pulumi.aws.fis.ExperimentTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationArgs.builder
      builder.logConfiguration(args(argsBuilder).build)

    /**
     * @param stopConditions When an ongoing experiment should be stopped. See below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def stopConditions(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateStopConditionArgs.Builder]*):
        com.pulumi.aws.fis.ExperimentTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateStopConditionArgs.builder
      builder.stopConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param targets Target of an action. See below.
     * @return builder
     */
    inline def targets(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateTargetArgs.Builder]*):
        com.pulumi.aws.fis.ExperimentTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fis.SafetyLeverStateArgs.Builder)
    /**
     * @param state State of the safety lever. See below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def state(args: Endofunction[com.pulumi.aws.fis.inputs.SafetyLeverStateStateArgs.Builder]):
        com.pulumi.aws.fis.SafetyLeverStateArgs.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.SafetyLeverStateStateArgs.builder
      builder.state(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.fis.inputs.SafetyLeverStateTimeoutsArgs.Builder]):
        com.pulumi.aws.fis.SafetyLeverStateArgs.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.SafetyLeverStateTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fis.inputs.ExperimentTemplateActionArgs.Builder)
    /**
     * @param parameters Parameter(s) for the action, if applicable. See below.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateActionParameterArgs.Builder]*):
        com.pulumi.aws.fis.inputs.ExperimentTemplateActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateActionParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

    /**
     * @param target Action&#39;s target, if applicable. See below.
     * @return builder
     */
    inline def target(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateActionTargetArgs.Builder]):
        com.pulumi.aws.fis.inputs.ExperimentTemplateActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateActionTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationArgs.Builder)
    /**
     * @param dataSources Data sources for the experiment report. See below.
     * @return builder
     */
    inline def dataSources(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationDataSourcesArgs.Builder]):
        com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationDataSourcesArgs.builder
      builder.dataSources(args(argsBuilder).build)

    /**
     * @param outputs Outputs for the experiment report. See below.
     * @return builder
     */
    inline def outputs(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationOutputsArgs.Builder]):
        com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationOutputsArgs.builder
      builder.outputs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationDataSourcesArgs.Builder)
    /**
     * @param cloudwatchDashboards Data sources for the experiment report. See below.
     * @return builder
     */
    inline def cloudwatchDashboards(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationDataSourcesCloudwatchDashboardArgs.Builder]*):
        com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationDataSourcesArgs.Builder =
      def argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationDataSourcesCloudwatchDashboardArgs.builder
      builder.cloudwatchDashboards(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationOutputsArgs.Builder)
    /**
     * @param s3Configuration Data sources for the experiment report. See below.
     * @return builder
     */
    inline def s3Configuration(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationOutputsS3ConfigurationArgs.Builder]):
        com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationOutputsArgs.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationOutputsS3ConfigurationArgs.builder
      builder.s3Configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationArgs.Builder)
    /**
     * @param cloudwatchLogsConfiguration Configuration for experiment logging to Amazon CloudWatch Logs. See below.
     * @return builder
     */
    inline def cloudwatchLogsConfiguration(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationCloudwatchLogsConfigurationArgs.Builder]):
        com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationCloudwatchLogsConfigurationArgs.builder
      builder.cloudwatchLogsConfiguration(args(argsBuilder).build)

    /**
     * @param s3Configuration Configuration for experiment logging to Amazon S3. See below.
     * @return builder
     */
    inline def s3Configuration(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationS3ConfigurationArgs.Builder]):
        com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationS3ConfigurationArgs.builder
      builder.s3Configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fis.inputs.ExperimentTemplateState.Builder)
    /**
     * @param actions Action to be performed during an experiment. See below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateActionArgs.Builder]*):
        com.pulumi.aws.fis.inputs.ExperimentTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param experimentOptions Experiment options for the experiment template. See experimentOptions below for more details!
     * @return builder
     */
    inline def experimentOptions(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentOptionsArgs.Builder]):
        com.pulumi.aws.fis.inputs.ExperimentTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentOptionsArgs.builder
      builder.experimentOptions(args(argsBuilder).build)

    /**
     * @param experimentReportConfiguration Configuration for [experiment reporting](https://docs.aws.amazon.com/fis/latest/userguide/experiment-report-configuration.html). See below.
     * @return builder
     */
    inline def experimentReportConfiguration(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationArgs.Builder]):
        com.pulumi.aws.fis.inputs.ExperimentTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationArgs.builder
      builder.experimentReportConfiguration(args(argsBuilder).build)

    /**
     * @param logConfiguration Configuration for experiment logging. See below.
     * @return builder
     */
    inline def logConfiguration(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationArgs.Builder]):
        com.pulumi.aws.fis.inputs.ExperimentTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationArgs.builder
      builder.logConfiguration(args(argsBuilder).build)

    /**
     * @param stopConditions When an ongoing experiment should be stopped. See below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def stopConditions(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateStopConditionArgs.Builder]*):
        com.pulumi.aws.fis.inputs.ExperimentTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateStopConditionArgs.builder
      builder.stopConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param targets Target of an action. See below.
     * @return builder
     */
    inline def targets(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateTargetArgs.Builder]*):
        com.pulumi.aws.fis.inputs.ExperimentTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fis.inputs.ExperimentTemplateTargetArgs.Builder)
    /**
     * @param filters Filter(s) for the target. Filters can be used to select resources based on specific attributes returned by the respective describe action of the resource type. For more information, see [Targets for AWS FIS](https://docs.aws.amazon.com/fis/latest/userguide/targets.html#target-filters). See below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateTargetFilterArgs.Builder]*):
        com.pulumi.aws.fis.inputs.ExperimentTemplateTargetArgs.Builder =
      def argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateTargetFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceTags Tag(s) the resources need to have to be considered a valid target for an action. Conflicts with `resourceArns`. See below.
     * @return builder
     */
    inline def resourceTags(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateTargetResourceTagArgs.Builder]*):
        com.pulumi.aws.fis.inputs.ExperimentTemplateTargetArgs.Builder =
      def argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateTargetResourceTagArgs.builder
      builder.resourceTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fis.inputs.SafetyLeverStateState.Builder)
    /**
     * @param state State of the safety lever. See below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def state(args: Endofunction[com.pulumi.aws.fis.inputs.SafetyLeverStateStateArgs.Builder]):
        com.pulumi.aws.fis.inputs.SafetyLeverStateState.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.SafetyLeverStateStateArgs.builder
      builder.state(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.fis.inputs.SafetyLeverStateTimeoutsArgs.Builder]):
        com.pulumi.aws.fis.inputs.SafetyLeverStateState.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.SafetyLeverStateTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
