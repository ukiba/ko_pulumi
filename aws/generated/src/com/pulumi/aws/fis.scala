package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object fis:
  type FisFunctions = com.pulumi.aws.fis.FisFunctions
  object FisFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.fis.FisFunctions.*
  extension (self: FisFunctions.type)
    /** This resource can be useful for getting back a set of FIS experiment template IDs. */
    def getExperimentTemplates(args: Endofunction[com.pulumi.aws.fis.inputs.GetExperimentTemplatesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.fis.outputs.GetExperimentTemplatesResult] =
      val argsBuilder = com.pulumi.aws.fis.inputs.GetExperimentTemplatesArgs.builder
      com.pulumi.aws.fis.FisFunctions.getExperimentTemplates(args(argsBuilder).build)

    /** This resource can be useful for getting back a set of FIS experiment template IDs. */
    def getExperimentTemplatesPlain(args: Endofunction[com.pulumi.aws.fis.inputs.GetExperimentTemplatesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.fis.outputs.GetExperimentTemplatesResult] =
      val argsBuilder = com.pulumi.aws.fis.inputs.GetExperimentTemplatesPlainArgs.builder
      com.pulumi.aws.fis.FisFunctions.getExperimentTemplatesPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fis.ExperimentTemplateArgs.Builder)
    /**
     * @param actions Action to be performed during an experiment. See below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateActionArgs.Builder]*):
        com.pulumi.aws.fis.ExperimentTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param experimentOptions The experiment options for the experiment template. See experimentOptions below for more details!
     * @return builder
     */
    def experimentOptions(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentOptionsArgs.Builder]):
        com.pulumi.aws.fis.ExperimentTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentOptionsArgs.builder
      builder.experimentOptions(args(argsBuilder).build)

    /**
     * @param experimentReportConfiguration The configuration for [experiment reporting](https://docs.aws.amazon.com/fis/latest/userguide/experiment-report-configuration.html). See below.
     * @return builder
     */
    def experimentReportConfiguration(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationArgs.Builder]):
        com.pulumi.aws.fis.ExperimentTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationArgs.builder
      builder.experimentReportConfiguration(args(argsBuilder).build)

    /**
     * @param logConfiguration The configuration for experiment logging. See below.
     * @return builder
     */
    def logConfiguration(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationArgs.Builder]):
        com.pulumi.aws.fis.ExperimentTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationArgs.builder
      builder.logConfiguration(args(argsBuilder).build)

    /**
     * @param stopConditions When an ongoing experiment should be stopped. See below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def stopConditions(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateStopConditionArgs.Builder]*):
        com.pulumi.aws.fis.ExperimentTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateStopConditionArgs.builder
      builder.stopConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param targets Target of an action. See below.
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateTargetArgs.Builder]*):
        com.pulumi.aws.fis.ExperimentTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  /** Manages an AWS FIS (Fault Injection Simulator) Target Account Configuration. */
  def TargetAccountConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fis.TargetAccountConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.fis.TargetAccountConfigurationArgs.builder
    
    com.pulumi.aws.fis.TargetAccountConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an FIS Experiment Template, which can be used to run an experiment.
   *  An experiment template contains one or more actions to run on specified targets during an experiment.
   *  It also contains the stop conditions that prevent the experiment from going out of bounds.
   *  See [Amazon Fault Injection Simulator](https://docs.aws.amazon.com/fis/index.html)
   *  for more information.
   */
  def ExperimentTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fis.ExperimentTemplateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fis.ExperimentTemplateArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.fis.ExperimentTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.fis.inputs.ExperimentTemplateActionArgs.Builder)
    /**
     * @param parameters Parameter(s) for the action, if applicable. See below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateActionParameterArgs.Builder]*):
        com.pulumi.aws.fis.inputs.ExperimentTemplateActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateActionParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

    /**
     * @param target Action&#39;s target, if applicable. See below.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateActionTargetArgs.Builder]):
        com.pulumi.aws.fis.inputs.ExperimentTemplateActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateActionTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fis.inputs.ExperimentTemplateState.Builder)
    /**
     * @param actions Action to be performed during an experiment. See below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateActionArgs.Builder]*):
        com.pulumi.aws.fis.inputs.ExperimentTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param experimentOptions The experiment options for the experiment template. See experimentOptions below for more details!
     * @return builder
     */
    def experimentOptions(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentOptionsArgs.Builder]):
        com.pulumi.aws.fis.inputs.ExperimentTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentOptionsArgs.builder
      builder.experimentOptions(args(argsBuilder).build)

    /**
     * @param experimentReportConfiguration The configuration for [experiment reporting](https://docs.aws.amazon.com/fis/latest/userguide/experiment-report-configuration.html). See below.
     * @return builder
     */
    def experimentReportConfiguration(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationArgs.Builder]):
        com.pulumi.aws.fis.inputs.ExperimentTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationArgs.builder
      builder.experimentReportConfiguration(args(argsBuilder).build)

    /**
     * @param logConfiguration The configuration for experiment logging. See below.
     * @return builder
     */
    def logConfiguration(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationArgs.Builder]):
        com.pulumi.aws.fis.inputs.ExperimentTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationArgs.builder
      builder.logConfiguration(args(argsBuilder).build)

    /**
     * @param stopConditions When an ongoing experiment should be stopped. See below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def stopConditions(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateStopConditionArgs.Builder]*):
        com.pulumi.aws.fis.inputs.ExperimentTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateStopConditionArgs.builder
      builder.stopConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param targets Target of an action. See below.
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateTargetArgs.Builder]*):
        com.pulumi.aws.fis.inputs.ExperimentTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationArgs.Builder)
    /**
     * @param dataSources The data sources for the experiment report. See below.
     * @return builder
     */
    def dataSources(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationDataSourcesArgs.Builder]):
        com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationDataSourcesArgs.builder
      builder.dataSources(args(argsBuilder).build)

    /**
     * @param outputs The outputs for the experiment report. See below.
     * @return builder
     */
    def outputs(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationOutputsArgs.Builder]):
        com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationOutputsArgs.builder
      builder.outputs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationDataSourcesArgs.Builder)
    /**
     * @param cloudwatchDashboards The data sources for the experiment report. See below.
     * @return builder
     */
    def cloudwatchDashboards(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationDataSourcesCloudwatchDashboardArgs.Builder]*):
        com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationDataSourcesArgs.Builder =
      def argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationDataSourcesCloudwatchDashboardArgs.builder
      builder.cloudwatchDashboards(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fis.inputs.ExperimentTemplateTargetArgs.Builder)
    /**
     * @param filters Filter(s) for the target. Filters can be used to select resources based on specific attributes returned by the respective describe action of the resource type. For more information, see [Targets for AWS FIS](https://docs.aws.amazon.com/fis/latest/userguide/targets.html#target-filters). See below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateTargetFilterArgs.Builder]*):
        com.pulumi.aws.fis.inputs.ExperimentTemplateTargetArgs.Builder =
      def argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateTargetFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceTags Tag(s) the resources need to have to be considered a valid target for an action. Conflicts with `resourceArns`. See below.
     * @return builder
     */
    def resourceTags(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateTargetResourceTagArgs.Builder]*):
        com.pulumi.aws.fis.inputs.ExperimentTemplateTargetArgs.Builder =
      def argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateTargetResourceTagArgs.builder
      builder.resourceTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationOutputsArgs.Builder)
    /**
     * @param s3Configuration The data sources for the experiment report. See below.
     * @return builder
     */
    def s3Configuration(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationOutputsS3ConfigurationArgs.Builder]):
        com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationOutputsArgs.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateExperimentReportConfigurationOutputsS3ConfigurationArgs.builder
      builder.s3Configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationArgs.Builder)
    /**
     * @param cloudwatchLogsConfiguration The configuration for experiment logging to Amazon CloudWatch Logs. See below.
     * @return builder
     */
    def cloudwatchLogsConfiguration(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationCloudwatchLogsConfigurationArgs.Builder]):
        com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationCloudwatchLogsConfigurationArgs.builder
      builder.cloudwatchLogsConfiguration(args(argsBuilder).build)

    /**
     * @param s3Configuration The configuration for experiment logging to Amazon S3. See below.
     * @return builder
     */
    def s3Configuration(args: Endofunction[com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationS3ConfigurationArgs.Builder]):
        com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.fis.inputs.ExperimentTemplateLogConfigurationS3ConfigurationArgs.builder
      builder.s3Configuration(args(argsBuilder).build)
