package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object evidently:
  /**
   * Provides a CloudWatch Evidently Launch resource.
   *  
   *  &gt; **Warning:** This resource is deprecated. Use [AWS AppConfig feature flags](https://aws.amazon.com/blogs/mt/using-aws-appconfig-feature-flags/) instead.
   */
  def Launch(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.evidently.LaunchArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.evidently.LaunchArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.evidently.Launch(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a CloudWatch Evidently Segment resource.
   *  
   *  &gt; **Warning:** This resource is deprecated. Use [AWS AppConfig feature flags](https://aws.amazon.com/blogs/mt/using-aws-appconfig-feature-flags/) instead.
   */
  def Segment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.evidently.SegmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.evidently.SegmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.evidently.Segment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.evidently.ProjectArgs.Builder)
    /**
     * @param dataDelivery A block that contains information about where Evidently is to store evaluation events for longer term storage, if you choose to do so. If you choose not to store these events, Evidently deletes them after using them to produce metrics and other experiment results that you can view. See below.
     * @return builder
     */
    def dataDelivery(args: Endofunction[com.pulumi.aws.evidently.inputs.ProjectDataDeliveryArgs.Builder]):
        com.pulumi.aws.evidently.ProjectArgs.Builder =
      val argsBuilder = com.pulumi.aws.evidently.inputs.ProjectDataDeliveryArgs.builder
      builder.dataDelivery(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.evidently.FeatureArgs.Builder)
    /**
     * @param variations One or more blocks that contain the configuration of the feature&#39;s different variations. Detailed below
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.evidently.inputs.FeatureVariationArgs.Builder]*):
        com.pulumi.aws.evidently.FeatureArgs.Builder =
      def argsBuilder = com.pulumi.aws.evidently.inputs.FeatureVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  /**
   * Provides a CloudWatch Evidently Project resource.
   *  
   *  &gt; **Warning:** This resource is deprecated. Use [AWS AppConfig feature flags](https://aws.amazon.com/blogs/mt/using-aws-appconfig-feature-flags/) instead.
   */
  def Project(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.evidently.ProjectArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.evidently.ProjectArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.evidently.Project(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.evidently.LaunchArgs.Builder)
    /**
     * @param groups One or up to five blocks that contain the feature and variations that are to be used for the launch. Detailed below.
     * @return builder
     */
    def groups(args: Endofunction[com.pulumi.aws.evidently.inputs.LaunchGroupArgs.Builder]*):
        com.pulumi.aws.evidently.LaunchArgs.Builder =
      def argsBuilder = com.pulumi.aws.evidently.inputs.LaunchGroupArgs.builder
      builder.groups(args.map(_(argsBuilder).build)*)

    /**
     * @param metricMonitors One or up to three blocks that define the metrics that will be used to monitor the launch performance. Detailed below.
     * @return builder
     */
    def metricMonitors(args: Endofunction[com.pulumi.aws.evidently.inputs.LaunchMetricMonitorArgs.Builder]*):
        com.pulumi.aws.evidently.LaunchArgs.Builder =
      def argsBuilder = com.pulumi.aws.evidently.inputs.LaunchMetricMonitorArgs.builder
      builder.metricMonitors(args.map(_(argsBuilder).build)*)

    /**
     * @param scheduledSplitsConfig A block that defines the traffic allocation percentages among the feature variations during each step of the launch. Detailed below.
     * @return builder
     */
    def scheduledSplitsConfig(args: Endofunction[com.pulumi.aws.evidently.inputs.LaunchScheduledSplitsConfigArgs.Builder]):
        com.pulumi.aws.evidently.LaunchArgs.Builder =
      val argsBuilder = com.pulumi.aws.evidently.inputs.LaunchScheduledSplitsConfigArgs.builder
      builder.scheduledSplitsConfig(args(argsBuilder).build)

  /**
   * Provides a CloudWatch Evidently Feature resource.
   *  
   *  &gt; **Warning:** This resource is deprecated. Use [AWS AppConfig feature flags](https://aws.amazon.com/blogs/mt/using-aws-appconfig-feature-flags/) instead.
   */
  def Feature(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.evidently.FeatureArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.evidently.FeatureArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.evidently.Feature(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.evidently.inputs.LaunchScheduledSplitsConfigArgs.Builder)
    /**
     * @param steps One or up to six blocks that define the traffic allocation percentages among the feature variations during each step of the launch. This also defines the start time of each step. Detailed below.
     * @return builder
     */
    def steps(args: Endofunction[com.pulumi.aws.evidently.inputs.LaunchScheduledSplitsConfigStepArgs.Builder]*):
        com.pulumi.aws.evidently.inputs.LaunchScheduledSplitsConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.evidently.inputs.LaunchScheduledSplitsConfigStepArgs.builder
      builder.steps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.evidently.inputs.LaunchScheduledSplitsConfigStepArgs.Builder)
    /**
     * @param segmentOverrides One or up to six blocks that specify different traffic splits for one or more audience segments. A segment is a portion of your audience that share one or more characteristics. Examples could be Chrome browser users, users in Europe, or Firefox browser users in Europe who also fit other criteria that your application collects, such as age. Detailed below.
     * @return builder
     */
    def segmentOverrides(args: Endofunction[com.pulumi.aws.evidently.inputs.LaunchScheduledSplitsConfigStepSegmentOverrideArgs.Builder]*):
        com.pulumi.aws.evidently.inputs.LaunchScheduledSplitsConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.evidently.inputs.LaunchScheduledSplitsConfigStepSegmentOverrideArgs.builder
      builder.segmentOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.evidently.inputs.ProjectState.Builder)
    /**
     * @param dataDelivery A block that contains information about where Evidently is to store evaluation events for longer term storage, if you choose to do so. If you choose not to store these events, Evidently deletes them after using them to produce metrics and other experiment results that you can view. See below.
     * @return builder
     */
    def dataDelivery(args: Endofunction[com.pulumi.aws.evidently.inputs.ProjectDataDeliveryArgs.Builder]):
        com.pulumi.aws.evidently.inputs.ProjectState.Builder =
      val argsBuilder = com.pulumi.aws.evidently.inputs.ProjectDataDeliveryArgs.builder
      builder.dataDelivery(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.evidently.inputs.LaunchState.Builder)
    /**
     * @param executions A block that contains information about the start and end times of the launch. Detailed below
     * @return builder
     */
    def executions(args: Endofunction[com.pulumi.aws.evidently.inputs.LaunchExecutionArgs.Builder]*):
        com.pulumi.aws.evidently.inputs.LaunchState.Builder =
      def argsBuilder = com.pulumi.aws.evidently.inputs.LaunchExecutionArgs.builder
      builder.executions(args.map(_(argsBuilder).build)*)

    /**
     * @param groups One or up to five blocks that contain the feature and variations that are to be used for the launch. Detailed below.
     * @return builder
     */
    def groups(args: Endofunction[com.pulumi.aws.evidently.inputs.LaunchGroupArgs.Builder]*):
        com.pulumi.aws.evidently.inputs.LaunchState.Builder =
      def argsBuilder = com.pulumi.aws.evidently.inputs.LaunchGroupArgs.builder
      builder.groups(args.map(_(argsBuilder).build)*)

    /**
     * @param metricMonitors One or up to three blocks that define the metrics that will be used to monitor the launch performance. Detailed below.
     * @return builder
     */
    def metricMonitors(args: Endofunction[com.pulumi.aws.evidently.inputs.LaunchMetricMonitorArgs.Builder]*):
        com.pulumi.aws.evidently.inputs.LaunchState.Builder =
      def argsBuilder = com.pulumi.aws.evidently.inputs.LaunchMetricMonitorArgs.builder
      builder.metricMonitors(args.map(_(argsBuilder).build)*)

    /**
     * @param scheduledSplitsConfig A block that defines the traffic allocation percentages among the feature variations during each step of the launch. Detailed below.
     * @return builder
     */
    def scheduledSplitsConfig(args: Endofunction[com.pulumi.aws.evidently.inputs.LaunchScheduledSplitsConfigArgs.Builder]):
        com.pulumi.aws.evidently.inputs.LaunchState.Builder =
      val argsBuilder = com.pulumi.aws.evidently.inputs.LaunchScheduledSplitsConfigArgs.builder
      builder.scheduledSplitsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.evidently.inputs.FeatureVariationArgs.Builder)
    /**
     * @param value A block that specifies the value assigned to this variation. Detailed below
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.evidently.inputs.FeatureVariationValueArgs.Builder]):
        com.pulumi.aws.evidently.inputs.FeatureVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.evidently.inputs.FeatureVariationValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.evidently.inputs.FeatureState.Builder)
    /**
     * @param evaluationRules One or more blocks that define the evaluation rules for the feature. Detailed below
     * @return builder
     */
    def evaluationRules(args: Endofunction[com.pulumi.aws.evidently.inputs.FeatureEvaluationRuleArgs.Builder]*):
        com.pulumi.aws.evidently.inputs.FeatureState.Builder =
      def argsBuilder = com.pulumi.aws.evidently.inputs.FeatureEvaluationRuleArgs.builder
      builder.evaluationRules(args.map(_(argsBuilder).build)*)

    /**
     * @param variations One or more blocks that contain the configuration of the feature&#39;s different variations. Detailed below
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.evidently.inputs.FeatureVariationArgs.Builder]*):
        com.pulumi.aws.evidently.inputs.FeatureState.Builder =
      def argsBuilder = com.pulumi.aws.evidently.inputs.FeatureVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.evidently.inputs.ProjectDataDeliveryArgs.Builder)
    /**
     * @param cloudwatchLogs A block that defines the CloudWatch Log Group that stores the evaluation events. See below.
     * @return builder
     */
    def cloudwatchLogs(args: Endofunction[com.pulumi.aws.evidently.inputs.ProjectDataDeliveryCloudwatchLogsArgs.Builder]):
        com.pulumi.aws.evidently.inputs.ProjectDataDeliveryArgs.Builder =
      val argsBuilder = com.pulumi.aws.evidently.inputs.ProjectDataDeliveryCloudwatchLogsArgs.builder
      builder.cloudwatchLogs(args(argsBuilder).build)

    /**
     * @param s3Destination A block that defines the S3 bucket and prefix that stores the evaluation events. See below.
     * @return builder
     */
    def s3Destination(args: Endofunction[com.pulumi.aws.evidently.inputs.ProjectDataDeliveryS3DestinationArgs.Builder]):
        com.pulumi.aws.evidently.inputs.ProjectDataDeliveryArgs.Builder =
      val argsBuilder = com.pulumi.aws.evidently.inputs.ProjectDataDeliveryS3DestinationArgs.builder
      builder.s3Destination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.evidently.inputs.LaunchMetricMonitorArgs.Builder)
    /**
     * @param metricDefinition A block that defines the metric. Detailed below.
     * @return builder
     */
    def metricDefinition(args: Endofunction[com.pulumi.aws.evidently.inputs.LaunchMetricMonitorMetricDefinitionArgs.Builder]):
        com.pulumi.aws.evidently.inputs.LaunchMetricMonitorArgs.Builder =
      val argsBuilder = com.pulumi.aws.evidently.inputs.LaunchMetricMonitorMetricDefinitionArgs.builder
      builder.metricDefinition(args(argsBuilder).build)
