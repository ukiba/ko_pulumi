package jp.ukiba.ko_pulumi
package aws

object cloudwatch_ext:
  extension (builder: com.pulumi.aws.cloudwatch.AlarmMuteRuleArgs.Builder)
    /**
     * @param muteTargets Alarms to mute. See `muteTargets` block below for details.
     * @return builder
     */
    inline def muteTargets(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.AlarmMuteRuleMuteTargetsArgs.Builder]):
        com.pulumi.aws.cloudwatch.AlarmMuteRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.AlarmMuteRuleMuteTargetsArgs.builder
      builder.muteTargets(args(argsBuilder).build)

    /**
     * @param rule Rule definition for the mute rule. See `rule` block below for details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def rule(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.AlarmMuteRuleRuleArgs.Builder]):
        com.pulumi.aws.cloudwatch.AlarmMuteRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.AlarmMuteRuleRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.CompositeAlarmArgs.Builder)
    /**
     * @param actionsSuppressor Actions will be suppressed if the suppressor alarm is in the ALARM state.
     * @return builder
     */
    inline def actionsSuppressor(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.CompositeAlarmActionsSuppressorArgs.Builder]):
        com.pulumi.aws.cloudwatch.CompositeAlarmArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.CompositeAlarmActionsSuppressorArgs.builder
      builder.actionsSuppressor(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.EventBusArgs.Builder)
    /**
     * @param deadLetterConfig Configuration details of the Amazon SQS queue for EventBridge to use as a dead-letter queue (DLQ). This block supports the following arguments:
     * @return builder
     */
    inline def deadLetterConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventBusDeadLetterConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventBusArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventBusDeadLetterConfigArgs.builder
      builder.deadLetterConfig(args(argsBuilder).build)

    /**
     * @param logConfig Block for logging configuration settings for the event bus.
     * @return builder
     */
    inline def logConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventBusLogConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventBusArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventBusLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.EventConnectionArgs.Builder)
    /**
     * @param authParameters Parameters used for authorization. A maximum of 1 are allowed. Documented below.
     * @return builder
     */
    inline def authParameters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs.builder
      builder.authParameters(args(argsBuilder).build)

    /**
     * @param invocationConnectivityParameters Parameters to use for invoking a private API. Documented below.
     * @return builder
     */
    inline def invocationConnectivityParameters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionInvocationConnectivityParametersArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionInvocationConnectivityParametersArgs.builder
      builder.invocationConnectivityParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.EventEndpointArgs.Builder)
    /**
     * @param eventBuses The event buses to use. The names of the event buses must be identical in each Region. Exactly two event buses are required. Documented below.
     * @return builder
     */
    inline def eventBuses(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventEndpointEventBusArgs.Builder]*):
        com.pulumi.aws.cloudwatch.EventEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventEndpointEventBusArgs.builder
      builder.eventBuses(args.map(_(argsBuilder).build)*)

    /**
     * @param replicationConfig Parameters used for replication. Documented below.
     * @return builder
     */
    inline def replicationConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventEndpointReplicationConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventEndpointReplicationConfigArgs.builder
      builder.replicationConfig(args(argsBuilder).build)

    /**
     * @param routingConfig Parameters used for routing, including the health check and secondary Region. Documented below.
     * @return builder
     */
    inline def routingConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigArgs.builder
      builder.routingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.EventPermissionArgs.Builder)
    /**
     * @param condition Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventPermissionConditionArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventPermissionArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventPermissionConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.EventTargetArgs.Builder)
    /**
     * @param appsyncTarget Parameters used when you are using the rule to invoke an AppSync GraphQL API mutation. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    inline def appsyncTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetAppsyncTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetAppsyncTargetArgs.builder
      builder.appsyncTarget(args(argsBuilder).build)

    /**
     * @param batchTarget Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    inline def batchTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetBatchTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetBatchTargetArgs.builder
      builder.batchTarget(args(argsBuilder).build)

    /**
     * @param deadLetterConfig Parameters used when you are providing a dead letter config. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    inline def deadLetterConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetDeadLetterConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetDeadLetterConfigArgs.builder
      builder.deadLetterConfig(args(argsBuilder).build)

    /**
     * @param ecsTarget Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    inline def ecsTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetArgs.builder
      builder.ecsTarget(args(argsBuilder).build)

    /**
     * @param httpTarget Parameters used when you are using the rule to invoke an API Gateway REST endpoint. Documented below. A maximum of 1 is allowed.
     * @return builder
     */
    inline def httpTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetHttpTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetHttpTargetArgs.builder
      builder.httpTarget(args(argsBuilder).build)

    /**
     * @param inputTransformer Parameters used when you are providing a custom input to a target based on certain event data. Conflicts with `input` and `inputPath`.
     * @return builder
     */
    inline def inputTransformer(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetInputTransformerArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetInputTransformerArgs.builder
      builder.inputTransformer(args(argsBuilder).build)

    /**
     * @param kinesisTarget Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    inline def kinesisTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetKinesisTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetKinesisTargetArgs.builder
      builder.kinesisTarget(args(argsBuilder).build)

    /**
     * @param redshiftTarget Parameters used when you are using the rule to invoke an Amazon Redshift Statement. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    inline def redshiftTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetRedshiftTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetRedshiftTargetArgs.builder
      builder.redshiftTarget(args(argsBuilder).build)

    /**
     * @param retryPolicy Parameters used when you are providing retry policies. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    inline def retryPolicy(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetRetryPolicyArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param runCommandTargets Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
     * @return builder
     */
    inline def runCommandTargets(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetRunCommandTargetArgs.Builder]*):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetRunCommandTargetArgs.builder
      builder.runCommandTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param sagemakerPipelineTarget Parameters used when you are using the rule to invoke an Amazon SageMaker AI Pipeline. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    inline def sagemakerPipelineTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetSagemakerPipelineTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetSagemakerPipelineTargetArgs.builder
      builder.sagemakerPipelineTarget(args(argsBuilder).build)

    /**
     * @param sqsTarget Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    inline def sqsTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetSqsTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetSqsTargetArgs.builder
      builder.sqsTarget(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.InternetMonitorArgs.Builder)
    /**
     * @param healthEventsConfig Health event thresholds. A health event threshold percentage, for performance and availability, determines when Internet Monitor creates a health event when there&#39;s an internet issue that affects your application end users. See Health Events Config below.
     * @return builder
     */
    inline def healthEventsConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.InternetMonitorHealthEventsConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.InternetMonitorArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.InternetMonitorHealthEventsConfigArgs.builder
      builder.healthEventsConfig(args(argsBuilder).build)

    /**
     * @param internetMeasurementsLogDelivery Publish internet measurements for Internet Monitor to an Amazon S3 bucket in addition to CloudWatch Logs.
     * @return builder
     */
    inline def internetMeasurementsLogDelivery(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.InternetMonitorInternetMeasurementsLogDeliveryArgs.Builder]):
        com.pulumi.aws.cloudwatch.InternetMonitorArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.InternetMonitorInternetMeasurementsLogDeliveryArgs.builder
      builder.internetMeasurementsLogDelivery(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.LogDeliveryArgs.Builder)
    /**
     * @param s3DeliveryConfigurations Parameters that are valid only when the delivery&#39;s delivery destination is an S3 bucket.
     * @return builder
     */
    inline def s3DeliveryConfigurations(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogDeliveryS3DeliveryConfigurationArgs.Builder]*):
        com.pulumi.aws.cloudwatch.LogDeliveryArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogDeliveryS3DeliveryConfigurationArgs.builder
      builder.s3DeliveryConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.LogDeliveryDestinationArgs.Builder)
    /**
     * @param deliveryDestinationConfiguration The AWS resource that will receive the logs. Required for CloudWatch Logs, Amazon S3, and Firehose destinations. Not required for X-Ray trace delivery destinations.
     * @return builder
     */
    inline def deliveryDestinationConfiguration(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogDeliveryDestinationDeliveryDestinationConfigurationArgs.Builder]):
        com.pulumi.aws.cloudwatch.LogDeliveryDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogDeliveryDestinationDeliveryDestinationConfigurationArgs.builder
      builder.deliveryDestinationConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.LogMetricFilterArgs.Builder)
    /**
     * @param metricTransformation A block defining collection of information needed to define how metric data gets emitted. See below.
     * @return builder
     */
    inline def metricTransformation(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogMetricFilterMetricTransformationArgs.Builder]):
        com.pulumi.aws.cloudwatch.LogMetricFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogMetricFilterMetricTransformationArgs.builder
      builder.metricTransformation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.LogResourcePolicyArgs.Builder)
    /**
     * @param policyDocument Details of the resource policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. Maximum length of 5120 characters.
     * @return builder
     */
    inline def policyDocument(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.cloudwatch.LogResourcePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.PolicyDocumentArgs.builder
      builder.policyDocument(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.LogS3TableIntegrationSourceArgs.Builder)
    /**
     * @param dataSource Data source to associate with the S3 Table Integration. See `dataSource` Block below.
     * @return builder
     */
    inline def dataSource(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogS3TableIntegrationSourceDataSourceArgs.Builder]):
        com.pulumi.aws.cloudwatch.LogS3TableIntegrationSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogS3TableIntegrationSourceDataSourceArgs.builder
      builder.dataSource(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogS3TableIntegrationSourceTimeoutsArgs.Builder]):
        com.pulumi.aws.cloudwatch.LogS3TableIntegrationSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogS3TableIntegrationSourceTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.LogTransformerArgs.Builder)
    /**
     * @param transformerConfigs Specifies the configuration of the transformer. You must include at least one configuration, and 20 at most. See `transformerConfig` below for details.
     * @return builder
     */
    inline def transformerConfigs(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder]*):
        com.pulumi.aws.cloudwatch.LogTransformerArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.builder
      builder.transformerConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.MetricAlarmArgs.Builder)
    /**
     * @param evaluationCriteria The evaluation criteria for PromQL alarms. Cannot be used with traditional metric alarm parameters.
     * @return builder
     */
    inline def evaluationCriteria(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricAlarmEvaluationCriteriaArgs.Builder]):
        com.pulumi.aws.cloudwatch.MetricAlarmArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricAlarmEvaluationCriteriaArgs.builder
      builder.evaluationCriteria(args(argsBuilder).build)

    /**
     * @param evaluationWindow Configures the alarm to use a wall clock evaluation window instead of the default sliding window. Not supported for alarms that use `evaluationCriteria`. See `evaluationWindow` below.
     * @return builder
     */
    inline def evaluationWindow(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricAlarmEvaluationWindowArgs.Builder]):
        com.pulumi.aws.cloudwatch.MetricAlarmArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricAlarmEvaluationWindowArgs.builder
      builder.evaluationWindow(args(argsBuilder).build)

    /**
     * @param metricQueries Enables you to create an alarm based on a metric math expression. You may specify at most 20.
     * @return builder
     */
    inline def metricQueries(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricAlarmMetricQueryArgs.Builder]*):
        com.pulumi.aws.cloudwatch.MetricAlarmArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricAlarmMetricQueryArgs.builder
      builder.metricQueries(args.map(_(argsBuilder).build)*)

    /**
     * @param warmUpConfiguration Warm-up period that delays alarm evaluation after the alarm is created. During the warm-up period the alarm stays in `INSUFFICIENT_DATA` and does not perform alarm actions. See `warmUpConfiguration` below.
     * @return builder
     */
    inline def warmUpConfiguration(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricAlarmWarmUpConfigurationArgs.Builder]):
        com.pulumi.aws.cloudwatch.MetricAlarmArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricAlarmWarmUpConfigurationArgs.builder
      builder.warmUpConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.MetricStreamArgs.Builder)
    /**
     * @param excludeFilters List of exclusive metric filters. If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces and the conditional metric names that you specify here. If you don&#39;t specify metric names or provide empty metric names whole metric namespace is excluded. Conflicts with `includeFilter`.
     * @return builder
     */
    inline def excludeFilters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricStreamExcludeFilterArgs.Builder]*):
        com.pulumi.aws.cloudwatch.MetricStreamArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricStreamExcludeFilterArgs.builder
      builder.excludeFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param includeFilters List of inclusive metric filters. If you specify this parameter, the stream sends only the conditional metric names from the metric namespaces that you specify here. If you don&#39;t specify metric names or provide empty metric names whole metric namespace is included. Conflicts with `excludeFilter`.
     * @return builder
     */
    inline def includeFilters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricStreamIncludeFilterArgs.Builder]*):
        com.pulumi.aws.cloudwatch.MetricStreamArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricStreamIncludeFilterArgs.builder
      builder.includeFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param statisticsConfigurations For each entry in this array, you specify one or more metrics and the list of additional statistics to stream for those metrics. The additional statistics that you can stream depend on the stream&#39;s `outputFormat`. If the OutputFormat is `json`, you can stream any additional statistic that is supported by CloudWatch, listed in [CloudWatch statistics definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html.html). If the OutputFormat is `opentelemetry0.7` or `opentelemetry1.0`, you can stream percentile statistics (p99 etc.). See details below.
     * @return builder
     */
    inline def statisticsConfigurations(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricStreamStatisticsConfigurationArgs.Builder]*):
        com.pulumi.aws.cloudwatch.MetricStreamArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricStreamStatisticsConfigurationArgs.builder
      builder.statisticsConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.OtelEnrichmentArgs.Builder)
    /**
     * @param excludeFilters Namespaces and metric names to leave unenriched. See below.
     * @return builder
     */
    inline def excludeFilters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.OtelEnrichmentExcludeFilterArgs.Builder]*):
        com.pulumi.aws.cloudwatch.OtelEnrichmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.OtelEnrichmentExcludeFilterArgs.builder
      builder.excludeFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param includeFilters Namespaces and metric names to enrich. See below.
     * @return builder
     */
    inline def includeFilters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.OtelEnrichmentIncludeFilterArgs.Builder]*):
        com.pulumi.aws.cloudwatch.OtelEnrichmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.OtelEnrichmentIncludeFilterArgs.builder
      builder.includeFilters(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.OtelEnrichmentTimeoutsArgs.Builder]):
        com.pulumi.aws.cloudwatch.OtelEnrichmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.OtelEnrichmentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.ResourceMetricsConfigurationArgs.Builder)
    /**
     * @param metricSelection Configuration block that limits which metrics CloudWatch collects. At most one block is supported. When omitted, CloudWatch collects all available detailed metrics for the resource. See `metricSelection` below.
     * @return builder
     */
    inline def metricSelection(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.ResourceMetricsConfigurationMetricSelectionArgs.Builder]):
        com.pulumi.aws.cloudwatch.ResourceMetricsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.ResourceMetricsConfigurationMetricSelectionArgs.builder
      builder.metricSelection(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.AlarmMuteRuleRuleArgs.Builder)
    /**
     * @param schedule Schedule for the mute rule. See `schedule` block below for details.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.AlarmMuteRuleRuleScheduleArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.AlarmMuteRuleRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.AlarmMuteRuleRuleScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.AlarmMuteRuleState.Builder)
    /**
     * @param muteTargets Alarms to mute. See `muteTargets` block below for details.
     * @return builder
     */
    inline def muteTargets(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.AlarmMuteRuleMuteTargetsArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.AlarmMuteRuleState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.AlarmMuteRuleMuteTargetsArgs.builder
      builder.muteTargets(args(argsBuilder).build)

    /**
     * @param rule Rule definition for the mute rule. See `rule` block below for details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def rule(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.AlarmMuteRuleRuleArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.AlarmMuteRuleState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.AlarmMuteRuleRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.CompositeAlarmState.Builder)
    /**
     * @param actionsSuppressor Actions will be suppressed if the suppressor alarm is in the ALARM state.
     * @return builder
     */
    inline def actionsSuppressor(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.CompositeAlarmActionsSuppressorArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.CompositeAlarmState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.CompositeAlarmActionsSuppressorArgs.builder
      builder.actionsSuppressor(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventBusState.Builder)
    /**
     * @param deadLetterConfig Configuration details of the Amazon SQS queue for EventBridge to use as a dead-letter queue (DLQ). This block supports the following arguments:
     * @return builder
     */
    inline def deadLetterConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventBusDeadLetterConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventBusState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventBusDeadLetterConfigArgs.builder
      builder.deadLetterConfig(args(argsBuilder).build)

    /**
     * @param logConfig Block for logging configuration settings for the event bus.
     * @return builder
     */
    inline def logConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventBusLogConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventBusState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventBusLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs.Builder)
    /**
     * @param apiKey Parameters used for API_KEY authorization. An API key to include in the header for each authentication request. A maximum of 1 are allowed. Conflicts with `basic` and `oauth`. Documented below.
     * @return builder
     */
    inline def apiKey(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersApiKeyArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersApiKeyArgs.builder
      builder.apiKey(args(argsBuilder).build)

    /**
     * @param basic Parameters used for BASIC authorization. A maximum of 1 are allowed. Conflicts with `apiKey` and `oauth`. Documented below.
     * @return builder
     */
    inline def basic(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersBasicArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersBasicArgs.builder
      builder.basic(args(argsBuilder).build)

    /**
     * @param connectivityParameters Parameters used for `oauth` with private API. Documented below.
     * @return builder
     */
    inline def connectivityParameters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersConnectivityParametersArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersConnectivityParametersArgs.builder
      builder.connectivityParameters(args(argsBuilder).build)

    /**
     * @param invocationHttpParameters Invocation HTTP Parameters are additional credentials used to sign each Invocation of the ApiDestination created from this Connection. If the ApiDestination Rule Target has additional HttpParameters, the values will be merged together, with the Connection Invocation HTTP Parameters taking precedence. Secret values are stored and managed by AWS Secrets Manager. A maximum of 1 are allowed. Documented below.
     * @return builder
     */
    inline def invocationHttpParameters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersArgs.builder
      builder.invocationHttpParameters(args(argsBuilder).build)

    /**
     * @param oauth Parameters used for OAUTH_CLIENT_CREDENTIALS authorization. A maximum of 1 are allowed. Conflicts with `basic` and `apiKey`. Documented below.
     * @return builder
     */
    inline def oauth(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthArgs.builder
      builder.oauth(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersConnectivityParametersArgs.Builder)
    /**
     * @param resourceParameters The parameters for EventBridge to use when invoking the authentication endpoint. Documented below.
     * @return builder
     */
    inline def resourceParameters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersConnectivityParametersResourceParametersArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersConnectivityParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersConnectivityParametersResourceParametersArgs.builder
      builder.resourceParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersArgs.Builder)
    /**
     * @param bodies Contains additional body string parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * @return builder
     */
    inline def bodies(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersBodyArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersBodyArgs.builder
      builder.bodies(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Contains additional header parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersHeaderArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryStrings Contains additional query string parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * @return builder
     */
    inline def queryStrings(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersQueryStringArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersQueryStringArgs.builder
      builder.queryStrings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthArgs.Builder)
    /**
     * @param clientParameters Contains the client parameters for OAuth authorization. Contains the following two parameters.
     * @return builder
     */
    inline def clientParameters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthClientParametersArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthClientParametersArgs.builder
      builder.clientParameters(args(argsBuilder).build)

    /**
     * @param oauthHttpParameters OAuth HTTP Parameters are additional credentials used to sign the request to the authorization endpoint to exchange the OAuth Client information for an access token. Secret values are stored and managed by AWS Secrets Manager. A maximum of 1 are allowed. Documented below.
     * @return builder
     */
    inline def oauthHttpParameters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersArgs.builder
      builder.oauthHttpParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersArgs.Builder)
    /**
     * @param bodies Contains additional body string parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * @return builder
     */
    inline def bodies(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs.builder
      builder.bodies(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Contains additional header parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryStrings Contains additional query string parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * @return builder
     */
    inline def queryStrings(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersQueryStringArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersQueryStringArgs.builder
      builder.queryStrings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventConnectionInvocationConnectivityParametersArgs.Builder)
    /**
     * @param resourceParameters The parameters for EventBridge to use when invoking the resource endpoint. Documented below.
     * @return builder
     */
    inline def resourceParameters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionInvocationConnectivityParametersResourceParametersArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionInvocationConnectivityParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionInvocationConnectivityParametersResourceParametersArgs.builder
      builder.resourceParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventConnectionState.Builder)
    /**
     * @param authParameters Parameters used for authorization. A maximum of 1 are allowed. Documented below.
     * @return builder
     */
    inline def authParameters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs.builder
      builder.authParameters(args(argsBuilder).build)

    /**
     * @param invocationConnectivityParameters Parameters to use for invoking a private API. Documented below.
     * @return builder
     */
    inline def invocationConnectivityParameters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionInvocationConnectivityParametersArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionInvocationConnectivityParametersArgs.builder
      builder.invocationConnectivityParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigArgs.Builder)
    /**
     * @param failoverConfig Parameters used for failover. This includes what triggers failover and what happens when it&#39;s triggered. Documented below.
     * @return builder
     */
    inline def failoverConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigArgs.builder
      builder.failoverConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigArgs.Builder)
    /**
     * @param primary Parameters used for the primary Region. Documented below.
     * @return builder
     */
    inline def primary(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigPrimaryArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigPrimaryArgs.builder
      builder.primary(args(argsBuilder).build)

    /**
     * @param secondary Parameters used for the secondary Region, the Region that events are routed to when failover is triggered or event replication is enabled. Documented below.
     * @return builder
     */
    inline def secondary(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigSecondaryArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigSecondaryArgs.builder
      builder.secondary(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventEndpointState.Builder)
    /**
     * @param eventBuses The event buses to use. The names of the event buses must be identical in each Region. Exactly two event buses are required. Documented below.
     * @return builder
     */
    inline def eventBuses(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventEndpointEventBusArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventEndpointState.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventEndpointEventBusArgs.builder
      builder.eventBuses(args.map(_(argsBuilder).build)*)

    /**
     * @param replicationConfig Parameters used for replication. Documented below.
     * @return builder
     */
    inline def replicationConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventEndpointReplicationConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventEndpointState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventEndpointReplicationConfigArgs.builder
      builder.replicationConfig(args(argsBuilder).build)

    /**
     * @param routingConfig Parameters used for routing, including the health check and secondary Region. Documented below.
     * @return builder
     */
    inline def routingConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventEndpointState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigArgs.builder
      builder.routingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventPermissionState.Builder)
    /**
     * @param condition Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventPermissionConditionArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventPermissionState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventPermissionConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetArgs.Builder)
    /**
     * @param capacityProviderStrategies The capacity provider strategy to use for the task. If a `capacityProviderStrategy` specified, the `launchType` parameter must be omitted. If no `capacityProviderStrategy` or `launchType` is specified, the default capacity provider strategy for the cluster is used. Can be one or more. See below.
     * @return builder
     */
    inline def capacityProviderStrategies(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetCapacityProviderStrategyArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetCapacityProviderStrategyArgs.builder
      builder.capacityProviderStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfiguration Use this if the ECS task uses the awsvpc network mode. This specifies the VPC subnets and security groups associated with the task, and whether a public IP address is to be used. Required if `launchType` is `FARGATE` because the awsvpc mode is required for Fargate tasks.
     * @return builder
     */
    inline def networkConfiguration(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param orderedPlacementStrategies An array of placement strategy objects to use for the task. You can specify a maximum of five strategy rules per task.
     * @return builder
     */
    inline def orderedPlacementStrategies(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetOrderedPlacementStrategyArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetOrderedPlacementStrategyArgs.builder
      builder.orderedPlacementStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param placementConstraints An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task (including constraints in the task definition and those specified at runtime). See Below.
     * @return builder
     */
    inline def placementConstraints(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetPlacementConstraintArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetPlacementConstraintArgs.builder
      builder.placementConstraints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventTargetSagemakerPipelineTargetArgs.Builder)
    /**
     * @param pipelineParameterLists List of Parameter names and values for SageMaker AI Model Building Pipeline execution.
     * @return builder
     */
    inline def pipelineParameterLists(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetSagemakerPipelineTargetPipelineParameterListArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventTargetSagemakerPipelineTargetArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetSagemakerPipelineTargetPipelineParameterListArgs.builder
      builder.pipelineParameterLists(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder)
    /**
     * @param appsyncTarget Parameters used when you are using the rule to invoke an AppSync GraphQL API mutation. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    inline def appsyncTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetAppsyncTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetAppsyncTargetArgs.builder
      builder.appsyncTarget(args(argsBuilder).build)

    /**
     * @param batchTarget Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    inline def batchTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetBatchTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetBatchTargetArgs.builder
      builder.batchTarget(args(argsBuilder).build)

    /**
     * @param deadLetterConfig Parameters used when you are providing a dead letter config. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    inline def deadLetterConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetDeadLetterConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetDeadLetterConfigArgs.builder
      builder.deadLetterConfig(args(argsBuilder).build)

    /**
     * @param ecsTarget Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    inline def ecsTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetArgs.builder
      builder.ecsTarget(args(argsBuilder).build)

    /**
     * @param httpTarget Parameters used when you are using the rule to invoke an API Gateway REST endpoint. Documented below. A maximum of 1 is allowed.
     * @return builder
     */
    inline def httpTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetHttpTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetHttpTargetArgs.builder
      builder.httpTarget(args(argsBuilder).build)

    /**
     * @param inputTransformer Parameters used when you are providing a custom input to a target based on certain event data. Conflicts with `input` and `inputPath`.
     * @return builder
     */
    inline def inputTransformer(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetInputTransformerArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetInputTransformerArgs.builder
      builder.inputTransformer(args(argsBuilder).build)

    /**
     * @param kinesisTarget Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    inline def kinesisTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetKinesisTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetKinesisTargetArgs.builder
      builder.kinesisTarget(args(argsBuilder).build)

    /**
     * @param redshiftTarget Parameters used when you are using the rule to invoke an Amazon Redshift Statement. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    inline def redshiftTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetRedshiftTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetRedshiftTargetArgs.builder
      builder.redshiftTarget(args(argsBuilder).build)

    /**
     * @param retryPolicy Parameters used when you are providing retry policies. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    inline def retryPolicy(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetRetryPolicyArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param runCommandTargets Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
     * @return builder
     */
    inline def runCommandTargets(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetRunCommandTargetArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetRunCommandTargetArgs.builder
      builder.runCommandTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param sagemakerPipelineTarget Parameters used when you are using the rule to invoke an Amazon SageMaker AI Pipeline. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    inline def sagemakerPipelineTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetSagemakerPipelineTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetSagemakerPipelineTargetArgs.builder
      builder.sagemakerPipelineTarget(args(argsBuilder).build)

    /**
     * @param sqsTarget Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    inline def sqsTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetSqsTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetSqsTargetArgs.builder
      builder.sqsTarget(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentArgs.Builder)
    inline def configuration(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentConfigurationArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param statements Configures the data protection policy.
     * 
     * &gt; There must be exactly two statements: the first with an `audit` operation, and the second with a `deidentify` operation.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def statements(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementArgs.builder
      builder.statements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentConfiguration.Builder)
    /**
     * @param customDataIdentifiers Configures custom regular expressions to detect sensitive data. Read more in [Custom data identifiers](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-custom-data-identifiers.html).
     * @return builder
     */
    inline def customDataIdentifiers(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentConfigurationCustomDataIdentifier.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentConfiguration.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentConfigurationCustomDataIdentifier.builder
      builder.customDataIdentifiers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentConfigurationArgs.Builder)
    /**
     * @param customDataIdentifiers Configures custom regular expressions to detect sensitive data. Read more in [Custom data identifiers](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-custom-data-identifiers.html).
     * @return builder
     */
    inline def customDataIdentifiers(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentConfigurationCustomDataIdentifierArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentConfigurationCustomDataIdentifierArgs.builder
      builder.customDataIdentifiers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentPlainArgs.Builder)
    inline def configuration(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentConfiguration.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentPlainArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentConfiguration.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param statements Configures the data protection policy.
     * 
     * &gt; There must be exactly two statements: the first with an `audit` operation, and the second with a `deidentify` operation.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def statements(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatement.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatement.builder
      builder.statements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatement.Builder)
    /**
     * @param operation Configures the data protection operation applied by this statement.
     * @return builder
     */
    inline def operation(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperation.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatement.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperation.builder
      builder.operation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementArgs.Builder)
    /**
     * @param operation Configures the data protection operation applied by this statement.
     * @return builder
     */
    inline def operation(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationArgs.builder
      builder.operation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperation.Builder)
    /**
     * @param audit Configures the detection of sensitive data.
     * @return builder
     */
    inline def audit(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAudit.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperation.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAudit.builder
      builder.audit(args(argsBuilder).build)

    /**
     * @param deidentify Configures the masking of sensitive data.
     * 
     * &gt; Every policy statement must specify exactly one operation.
     * @return builder
     */
    inline def deidentify(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationDeidentify.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperation.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationDeidentify.builder
      builder.deidentify(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationArgs.Builder)
    /**
     * @param audit Configures the detection of sensitive data.
     * @return builder
     */
    inline def audit(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditArgs.builder
      builder.audit(args(argsBuilder).build)

    /**
     * @param deidentify Configures the masking of sensitive data.
     * 
     * &gt; Every policy statement must specify exactly one operation.
     * @return builder
     */
    inline def deidentify(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationDeidentifyArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationDeidentifyArgs.builder
      builder.deidentify(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAudit.Builder)
    /**
     * @param findingsDestination Configures destinations to send audit findings to.
     * @return builder
     */
    inline def findingsDestination(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestination.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAudit.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestination.builder
      builder.findingsDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditArgs.Builder)
    /**
     * @param findingsDestination Configures destinations to send audit findings to.
     * @return builder
     */
    inline def findingsDestination(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationArgs.builder
      builder.findingsDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestination.Builder)
    /**
     * @param cloudwatchLogs Configures CloudWatch Logs as a findings destination.
     * @return builder
     */
    inline def cloudwatchLogs(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationCloudwatchLogs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestination.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationCloudwatchLogs.builder
      builder.cloudwatchLogs(args(argsBuilder).build)

    /**
     * @param firehose Configures Kinesis Firehose as a findings destination.
     * @return builder
     */
    inline def firehose(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationFirehose.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestination.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationFirehose.builder
      builder.firehose(args(argsBuilder).build)

    /**
     * @param s3 Configures S3 as a findings destination.
     * @return builder
     */
    inline def s3(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationS3.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestination.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationS3.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationArgs.Builder)
    /**
     * @param cloudwatchLogs Configures CloudWatch Logs as a findings destination.
     * @return builder
     */
    inline def cloudwatchLogs(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationCloudwatchLogsArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationCloudwatchLogsArgs.builder
      builder.cloudwatchLogs(args(argsBuilder).build)

    /**
     * @param firehose Configures Kinesis Firehose as a findings destination.
     * @return builder
     */
    inline def firehose(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationFirehoseArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationFirehoseArgs.builder
      builder.firehose(args(argsBuilder).build)

    /**
     * @param s3 Configures S3 as a findings destination.
     * @return builder
     */
    inline def s3(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationS3Args.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationDeidentify.Builder)
    /**
     * @param maskConfig An empty object that configures masking.
     * @return builder
     */
    inline def maskConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationDeidentifyMaskConfig.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationDeidentify.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationDeidentifyMaskConfig.builder
      builder.maskConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationDeidentifyArgs.Builder)
    /**
     * @param maskConfig An empty object that configures masking.
     * @return builder
     */
    inline def maskConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationDeidentifyMaskConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationDeidentifyArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationDeidentifyMaskConfigArgs.builder
      builder.maskConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.InternetMonitorInternetMeasurementsLogDeliveryArgs.Builder)
    inline def s3Config(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.InternetMonitorInternetMeasurementsLogDeliveryS3ConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.InternetMonitorInternetMeasurementsLogDeliveryArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.InternetMonitorInternetMeasurementsLogDeliveryS3ConfigArgs.builder
      builder.s3Config(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.InternetMonitorState.Builder)
    /**
     * @param healthEventsConfig Health event thresholds. A health event threshold percentage, for performance and availability, determines when Internet Monitor creates a health event when there&#39;s an internet issue that affects your application end users. See Health Events Config below.
     * @return builder
     */
    inline def healthEventsConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.InternetMonitorHealthEventsConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.InternetMonitorState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.InternetMonitorHealthEventsConfigArgs.builder
      builder.healthEventsConfig(args(argsBuilder).build)

    /**
     * @param internetMeasurementsLogDelivery Publish internet measurements for Internet Monitor to an Amazon S3 bucket in addition to CloudWatch Logs.
     * @return builder
     */
    inline def internetMeasurementsLogDelivery(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.InternetMonitorInternetMeasurementsLogDeliveryArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.InternetMonitorState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.InternetMonitorInternetMeasurementsLogDeliveryArgs.builder
      builder.internetMeasurementsLogDelivery(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogDeliveryDestinationState.Builder)
    /**
     * @param deliveryDestinationConfiguration The AWS resource that will receive the logs. Required for CloudWatch Logs, Amazon S3, and Firehose destinations. Not required for X-Ray trace delivery destinations.
     * @return builder
     */
    inline def deliveryDestinationConfiguration(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogDeliveryDestinationDeliveryDestinationConfigurationArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogDeliveryDestinationState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogDeliveryDestinationDeliveryDestinationConfigurationArgs.builder
      builder.deliveryDestinationConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogDeliveryState.Builder)
    /**
     * @param s3DeliveryConfigurations Parameters that are valid only when the delivery&#39;s delivery destination is an S3 bucket.
     * @return builder
     */
    inline def s3DeliveryConfigurations(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogDeliveryS3DeliveryConfigurationArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogDeliveryState.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogDeliveryS3DeliveryConfigurationArgs.builder
      builder.s3DeliveryConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogMetricFilterState.Builder)
    /**
     * @param metricTransformation A block defining collection of information needed to define how metric data gets emitted. See below.
     * @return builder
     */
    inline def metricTransformation(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogMetricFilterMetricTransformationArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogMetricFilterState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogMetricFilterMetricTransformationArgs.builder
      builder.metricTransformation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogResourcePolicyState.Builder)
    /**
     * @param policyDocument Details of the resource policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. Maximum length of 5120 characters.
     * @return builder
     */
    inline def policyDocument(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogResourcePolicyState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.PolicyDocumentArgs.builder
      builder.policyDocument(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogS3TableIntegrationSourceState.Builder)
    /**
     * @param dataSource Data source to associate with the S3 Table Integration. See `dataSource` Block below.
     * @return builder
     */
    inline def dataSource(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogS3TableIntegrationSourceDataSourceArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogS3TableIntegrationSourceState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogS3TableIntegrationSourceDataSourceArgs.builder
      builder.dataSource(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogS3TableIntegrationSourceTimeoutsArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogS3TableIntegrationSourceState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogS3TableIntegrationSourceTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogTransformerState.Builder)
    /**
     * @param transformerConfigs Specifies the configuration of the transformer. You must include at least one configuration, and 20 at most. See `transformerConfig` below for details.
     * @return builder
     */
    inline def transformerConfigs(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerState.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.builder
      builder.transformerConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigAddKeysArgs.Builder)
    /**
     * @param entries Objects containing the information about the keys to add to the log event. You must include at least one entry, and five at most. See `addKeys` `entry` below for details.
     * @return builder
     */
    inline def entries(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigAddKeysEntryArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigAddKeysArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigAddKeysEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder)
    /**
     * @param addKeys Adds new key-value pairs to the log event. See `addKeys` below for details.
     * @return builder
     */
    inline def addKeys(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigAddKeysArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigAddKeysArgs.builder
      builder.addKeys(args(argsBuilder).build)

    /**
     * @param copyValue Copies values within a log event. See `copyValue` below for details.
     * @return builder
     */
    inline def copyValue(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigCopyValueArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigCopyValueArgs.builder
      builder.copyValue(args(argsBuilder).build)

    /**
     * @param csvs Parses comma-separated values (CSV) from the log events into columns. See `csv` below for details.
     * @return builder
     */
    inline def csvs(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigCsvArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigCsvArgs.builder
      builder.csvs(args.map(_(argsBuilder).build)*)

    /**
     * @param dateTimeConverters Converts a datetime string into a format that you specify. See `dateTimeConverter` below for details.
     * @return builder
     */
    inline def dateTimeConverters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigDateTimeConverterArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigDateTimeConverterArgs.builder
      builder.dateTimeConverters(args.map(_(argsBuilder).build)*)

    /**
     * @param deleteKeys Deletes entry from a log event. See `deleteKeys` below for details.
     * @return builder
     */
    inline def deleteKeys(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigDeleteKeyArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigDeleteKeyArgs.builder
      builder.deleteKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param grok Parses and structures unstructured data by using pattern matching. See `grok` below for details.
     * @return builder
     */
    inline def grok(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigGrokArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigGrokArgs.builder
      builder.grok(args(argsBuilder).build)

    /**
     * @param listToMaps Converts list of objects that contain key fields into a map of target keys. See `listToMap` below for details.
     * @return builder
     */
    inline def listToMaps(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigListToMapArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigListToMapArgs.builder
      builder.listToMaps(args.map(_(argsBuilder).build)*)

    /**
     * @param lowerCaseStrings Converts a string to lowercase. See `lowerCaseString` below for details.
     * @return builder
     */
    inline def lowerCaseStrings(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigLowerCaseStringArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigLowerCaseStringArgs.builder
      builder.lowerCaseStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param moveKeys Moves a key from one field to another. See `moveKeys` below for details.
     * @return builder
     */
    inline def moveKeys(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigMoveKeyArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigMoveKeyArgs.builder
      builder.moveKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param parseCloudfront Parses CloudFront vended logs, extracts fields, and converts them into JSON format. See `parseCloudfront` below for details.
     * @return builder
     */
    inline def parseCloudfront(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseCloudfrontArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseCloudfrontArgs.builder
      builder.parseCloudfront(args(argsBuilder).build)

    /**
     * @param parseJsons Parses log events that are in JSON format. See `parseJson` below for details.
     * @return builder
     */
    inline def parseJsons(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseJsonArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseJsonArgs.builder
      builder.parseJsons(args.map(_(argsBuilder).build)*)

    /**
     * @param parseKeyValues Parses a specified field in the original log event into key-value pairs. See `parseKeyValue` below for details.
     * @return builder
     */
    inline def parseKeyValues(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseKeyValueArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseKeyValueArgs.builder
      builder.parseKeyValues(args.map(_(argsBuilder).build)*)

    /**
     * @param parsePostgres Parses RDS for PostgreSQL vended logs, extracts fields, and and convert them into a JSON format. See `parsePostgres` below for details.
     * @return builder
     */
    inline def parsePostgres(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParsePostgresArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParsePostgresArgs.builder
      builder.parsePostgres(args(argsBuilder).build)

    /**
     * @param parseRoute53 Parses Route 53 vended logs, extracts fields, and converts them into JSON format. See `parseRoute53` below for details.
     * @return builder
     */
    inline def parseRoute53(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseRoute53Args.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseRoute53Args.builder
      builder.parseRoute53(args(argsBuilder).build)

    /**
     * @param parseToOcsf Parses logs events and converts them into Open Cybersecurity Schema Framework (OCSF) events. See `parseToOcsf` below for details.
     * @return builder
     */
    inline def parseToOcsf(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseToOcsfArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseToOcsfArgs.builder
      builder.parseToOcsf(args(argsBuilder).build)

    /**
     * @param parseVpc Parses Amazon VPC vended logs, extracts fields, and converts them into JSON format. See `parseVpc` below for details.
     * @return builder
     */
    inline def parseVpc(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseVpcArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseVpcArgs.builder
      builder.parseVpc(args(argsBuilder).build)

    /**
     * @param parseWaf Parses AWS WAF vended logs, extracts fields, and converts them into JSON format. See `parseWaf` below for details.
     * @return builder
     */
    inline def parseWaf(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseWafArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseWafArgs.builder
      builder.parseWaf(args(argsBuilder).build)

    /**
     * @param renameKeys Renames keys in a log event. See `renameKeys` below for details.
     * @return builder
     */
    inline def renameKeys(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigRenameKeyArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigRenameKeyArgs.builder
      builder.renameKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param splitStrings Splits a field into an array of strings using a delimiting character. See `splitString` below for details.
     * @return builder
     */
    inline def splitStrings(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSplitStringArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSplitStringArgs.builder
      builder.splitStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param substituteStrings Matches a key\u2019s value against a regular expression and replaces all matches with a replacement string. See `substituteString` below for details.
     * @return builder
     */
    inline def substituteStrings(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSubstituteStringArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSubstituteStringArgs.builder
      builder.substituteStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param trimStrings Removes leading and trailing whitespace from a string. See `trimString` below for details.
     * @return builder
     */
    inline def trimStrings(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigTrimStringArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigTrimStringArgs.builder
      builder.trimStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param typeConverters Converts a value type associated with the specified key to the specified type. See `typeConverter` below for details.
     * @return builder
     */
    inline def typeConverters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigTypeConverterArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigTypeConverterArgs.builder
      builder.typeConverters(args.map(_(argsBuilder).build)*)

    /**
     * @param upperCaseStrings Converts a string to uppercase. See `upperCaseString` below for details.
     * @return builder
     */
    inline def upperCaseStrings(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigUpperCaseStringArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigUpperCaseStringArgs.builder
      builder.upperCaseStrings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigCopyValueArgs.Builder)
    /**
     * @param entries Objects containing the information about the values to copy to the log event. You must include at least one entry, and five at most. See `copyValue` `entry` below for details.
     * @return builder
     */
    inline def entries(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigCopyValueEntryArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigCopyValueArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigCopyValueEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigMoveKeyArgs.Builder)
    /**
     * @param entries Objects containing the information about the keys to move to the log event. You must include at least one entry, and five at most. See `moveKeys` `entry` below for details.
     * @return builder
     */
    inline def entries(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigMoveKeyEntryArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigMoveKeyArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigMoveKeyEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigRenameKeyArgs.Builder)
    /**
     * @param entries Objects containing the information about the keys to rename. You must include at least one entry, and five at most. See `renameKeys` `entry` below for details.
     * @return builder
     */
    inline def entries(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigRenameKeyEntryArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigRenameKeyArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigRenameKeyEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSplitStringArgs.Builder)
    /**
     * @param entries Objects containing the information about the fields to split. You must include at least one entry, and ten at most. See `splitString` `entry` below for details.
     * @return builder
     */
    inline def entries(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSplitStringEntryArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSplitStringArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSplitStringEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSubstituteStringArgs.Builder)
    /**
     * @param entries Objects containing the information about the fields to substitute. You must include at least one entry, and ten at most. See `substituteString` `entry` below for details.
     * @return builder
     */
    inline def entries(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSubstituteStringEntryArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSubstituteStringArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSubstituteStringEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigTypeConverterArgs.Builder)
    /**
     * @param entries Objects containing the information about the fields to change the type of. You must include at least one entry, and five at most. See `typeConverter` `entry` below for details.
     * @return builder
     */
    inline def entries(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigTypeConverterEntryArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigTypeConverterArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigTypeConverterEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.MetricAlarmEvaluationCriteriaArgs.Builder)
    /**
     * @param promqlCriteria The PromQL criteria for the alarm evaluation.
     * @return builder
     */
    inline def promqlCriteria(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricAlarmEvaluationCriteriaPromqlCriteriaArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.MetricAlarmEvaluationCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricAlarmEvaluationCriteriaPromqlCriteriaArgs.builder
      builder.promqlCriteria(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.MetricAlarmEvaluationWindowArgs.Builder)
    /**
     * @param wallClockWindow Aligns the evaluated range to fixed clock boundaries that match the alarm&#39;s `period` (for example the top of the hour, midnight, or the start of the calendar week), instead of the default rolling sliding window. Only alarms with a `period` of `60`, `300`, `3600`, `86400`, or `604800` seconds support a wall clock window. See `wallClockWindow` below.
     * @return builder
     */
    inline def wallClockWindow(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricAlarmEvaluationWindowWallClockWindowArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.MetricAlarmEvaluationWindowArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricAlarmEvaluationWindowWallClockWindowArgs.builder
      builder.wallClockWindow(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.MetricAlarmMetricQueryArgs.Builder)
    /**
     * @param metric The metric to be returned, along with statistics, period, and units. Use this parameter only if this object is retrieving a metric and not performing a math expression on returned data.
     * @return builder
     */
    inline def metric(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricAlarmMetricQueryMetricArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.MetricAlarmMetricQueryArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricAlarmMetricQueryMetricArgs.builder
      builder.metric(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.MetricAlarmState.Builder)
    /**
     * @param evaluationCriteria The evaluation criteria for PromQL alarms. Cannot be used with traditional metric alarm parameters.
     * @return builder
     */
    inline def evaluationCriteria(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricAlarmEvaluationCriteriaArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.MetricAlarmState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricAlarmEvaluationCriteriaArgs.builder
      builder.evaluationCriteria(args(argsBuilder).build)

    /**
     * @param evaluationWindow Configures the alarm to use a wall clock evaluation window instead of the default sliding window. Not supported for alarms that use `evaluationCriteria`. See `evaluationWindow` below.
     * @return builder
     */
    inline def evaluationWindow(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricAlarmEvaluationWindowArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.MetricAlarmState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricAlarmEvaluationWindowArgs.builder
      builder.evaluationWindow(args(argsBuilder).build)

    /**
     * @param metricQueries Enables you to create an alarm based on a metric math expression. You may specify at most 20.
     * @return builder
     */
    inline def metricQueries(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricAlarmMetricQueryArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.MetricAlarmState.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricAlarmMetricQueryArgs.builder
      builder.metricQueries(args.map(_(argsBuilder).build)*)

    /**
     * @param warmUpConfiguration Warm-up period that delays alarm evaluation after the alarm is created. During the warm-up period the alarm stays in `INSUFFICIENT_DATA` and does not perform alarm actions. See `warmUpConfiguration` below.
     * @return builder
     */
    inline def warmUpConfiguration(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricAlarmWarmUpConfigurationArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.MetricAlarmState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricAlarmWarmUpConfigurationArgs.builder
      builder.warmUpConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.MetricStreamState.Builder)
    /**
     * @param excludeFilters List of exclusive metric filters. If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces and the conditional metric names that you specify here. If you don&#39;t specify metric names or provide empty metric names whole metric namespace is excluded. Conflicts with `includeFilter`.
     * @return builder
     */
    inline def excludeFilters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricStreamExcludeFilterArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.MetricStreamState.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricStreamExcludeFilterArgs.builder
      builder.excludeFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param includeFilters List of inclusive metric filters. If you specify this parameter, the stream sends only the conditional metric names from the metric namespaces that you specify here. If you don&#39;t specify metric names or provide empty metric names whole metric namespace is included. Conflicts with `excludeFilter`.
     * @return builder
     */
    inline def includeFilters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricStreamIncludeFilterArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.MetricStreamState.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricStreamIncludeFilterArgs.builder
      builder.includeFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param statisticsConfigurations For each entry in this array, you specify one or more metrics and the list of additional statistics to stream for those metrics. The additional statistics that you can stream depend on the stream&#39;s `outputFormat`. If the OutputFormat is `json`, you can stream any additional statistic that is supported by CloudWatch, listed in [CloudWatch statistics definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html.html). If the OutputFormat is `opentelemetry0.7` or `opentelemetry1.0`, you can stream percentile statistics (p99 etc.). See details below.
     * @return builder
     */
    inline def statisticsConfigurations(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricStreamStatisticsConfigurationArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.MetricStreamState.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricStreamStatisticsConfigurationArgs.builder
      builder.statisticsConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.MetricStreamStatisticsConfigurationArgs.Builder)
    /**
     * @param includeMetrics An array that defines the metrics that are to have additional statistics streamed. See details below.
     * @return builder
     */
    inline def includeMetrics(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricStreamStatisticsConfigurationIncludeMetricArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.MetricStreamStatisticsConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricStreamStatisticsConfigurationIncludeMetricArgs.builder
      builder.includeMetrics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.OtelEnrichmentState.Builder)
    /**
     * @param excludeFilters Namespaces and metric names to leave unenriched. See below.
     * @return builder
     */
    inline def excludeFilters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.OtelEnrichmentExcludeFilterArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.OtelEnrichmentState.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.OtelEnrichmentExcludeFilterArgs.builder
      builder.excludeFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param includeFilters Namespaces and metric names to enrich. See below.
     * @return builder
     */
    inline def includeFilters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.OtelEnrichmentIncludeFilterArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.OtelEnrichmentState.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.OtelEnrichmentIncludeFilterArgs.builder
      builder.includeFilters(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.OtelEnrichmentTimeoutsArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.OtelEnrichmentState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.OtelEnrichmentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.PolicyDocumentArgs.Builder)
    inline def Statement(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyStatementArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.PolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.PolicyStatementArgs.builder
      builder.Statement(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.ResourceMetricsConfigurationState.Builder)
    /**
     * @param metricSelection Configuration block that limits which metrics CloudWatch collects. At most one block is supported. When omitted, CloudWatch collects all available detailed metrics for the resource. See `metricSelection` below.
     * @return builder
     */
    inline def metricSelection(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.ResourceMetricsConfigurationMetricSelectionArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.ResourceMetricsConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.ResourceMetricsConfigurationMetricSelectionArgs.builder
      builder.metricSelection(args(argsBuilder).build)
