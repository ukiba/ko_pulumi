package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object cloudwatch:
  extension (builder: com.pulumi.aws.cloudwatch.LogDeliveryDestinationArgs.Builder)
    /**
     * @param deliveryDestinationConfiguration The AWS resource that will receive the logs. Required for CloudWatch Logs, Amazon S3, and Firehose destinations. Not required for X-Ray trace delivery destinations.
     * @return builder
     */
    def deliveryDestinationConfiguration(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogDeliveryDestinationDeliveryDestinationConfigurationArgs.Builder]):
        com.pulumi.aws.cloudwatch.LogDeliveryDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogDeliveryDestinationDeliveryDestinationConfigurationArgs.builder
      builder.deliveryDestinationConfiguration(args(argsBuilder).build)

  /** Resource for managing an AWS CloudWatch Logs Delivery. A delivery is a connection between an `aws.cloudwatch.LogDeliverySource` and an `aws.cloudwatch.LogDeliveryDestination`. */
  def LogDelivery(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogDeliveryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.LogDeliveryArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloudwatch.LogDelivery(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a CloudWatch Metric Stream resource. */
  def MetricStream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.MetricStreamArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.MetricStreamArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloudwatch.MetricStream(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cloudwatch.EventEndpointArgs.Builder)
    /**
     * @param eventBuses The event buses to use. The names of the event buses must be identical in each Region. Exactly two event buses are required. Documented below.
     * @return builder
     */
    def eventBuses(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventEndpointEventBusArgs.Builder]*):
        com.pulumi.aws.cloudwatch.EventEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventEndpointEventBusArgs.builder
      builder.eventBuses(args.map(_(argsBuilder).build)*)

    /**
     * @param replicationConfig Parameters used for replication. Documented below.
     * @return builder
     */
    def replicationConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventEndpointReplicationConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventEndpointReplicationConfigArgs.builder
      builder.replicationConfig(args(argsBuilder).build)

    /**
     * @param routingConfig Parameters used for routing, including the health check and secondary Region. Documented below.
     * @return builder
     */
    def routingConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigArgs.builder
      builder.routingConfig(args(argsBuilder).build)

  /** Provides a CloudWatch Log Stream resource. */
  def LogStream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogStreamArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.LogStreamArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cloudwatch.LogStream(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an EventBridge Rule resource.
   *  
   *  &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  def EventRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.EventRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloudwatch.EventRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS CloudWatch Logs Index Policy. */
  def LogIndexPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogIndexPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogIndexPolicyArgs.builder
    
    com.pulumi.aws.cloudwatch.LogIndexPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an EventBridge event bus resource.
   *  
   *  &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  def EventBus(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventBusArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.EventBusArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloudwatch.EventBus(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cloudwatch.CompositeAlarmArgs.Builder)
    /**
     * @param actionsSuppressor Actions will be suppressed if the suppressor alarm is in the ALARM state.
     * @return builder
     */
    def actionsSuppressor(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.CompositeAlarmActionsSuppressorArgs.Builder]):
        com.pulumi.aws.cloudwatch.CompositeAlarmArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.CompositeAlarmActionsSuppressorArgs.builder
      builder.actionsSuppressor(args(argsBuilder).build)

  /** Provides a CloudWatch Logs destination policy resource. */
  def LogDestinationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogDestinationPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogDestinationPolicyArgs.builder
    
    com.pulumi.aws.cloudwatch.LogDestinationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cloudwatch.InternetMonitorArgs.Builder)
    /**
     * @param healthEventsConfig Health event thresholds. A health event threshold percentage, for performance and availability, determines when Internet Monitor creates a health event when there&#39;s an internet issue that affects your application end users. See Health Events Config below.
     * @return builder
     */
    def healthEventsConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.InternetMonitorHealthEventsConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.InternetMonitorArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.InternetMonitorHealthEventsConfigArgs.builder
      builder.healthEventsConfig(args(argsBuilder).build)

    /**
     * @param internetMeasurementsLogDelivery Publish internet measurements for Internet Monitor to an Amazon S3 bucket in addition to CloudWatch Logs.
     * @return builder
     */
    def internetMeasurementsLogDelivery(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.InternetMonitorInternetMeasurementsLogDeliveryArgs.Builder]):
        com.pulumi.aws.cloudwatch.InternetMonitorArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.InternetMonitorInternetMeasurementsLogDeliveryArgs.builder
      builder.internetMeasurementsLogDelivery(args(argsBuilder).build)

  /** Resource for managing an AWS CloudWatch Contributor Insight Rule. */
  def ContributorInsightRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.ContributorInsightRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.ContributorInsightRuleArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloudwatch.ContributorInsightRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an EventBridge connection resource.
   *  
   *  &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  def EventConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.EventConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cloudwatch.EventConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a CloudWatch Composite Alarm resource.
   *  
   *  &gt; **NOTE:** An alarm (composite or metric) cannot be destroyed when there are other composite alarms depending on it. This can lead to a cyclical dependency on update, as the provider will unsuccessfully attempt to destroy alarms before updating the rule. Consider using `dependsOn`, references to alarm names, and two-stage updates.
   */
  def CompositeAlarm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.CompositeAlarmArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.CompositeAlarmArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloudwatch.CompositeAlarm(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cloudwatch.LogDeliveryArgs.Builder)
    /**
     * @param s3DeliveryConfigurations Parameters that are valid only when the delivery&#39;s delivery destination is an S3 bucket.
     * @return builder
     */
    def s3DeliveryConfigurations(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogDeliveryS3DeliveryConfigurationArgs.Builder]*):
        com.pulumi.aws.cloudwatch.LogDeliveryArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogDeliveryS3DeliveryConfigurationArgs.builder
      builder.s3DeliveryConfigurations(args.map(_(argsBuilder).build)*)

  /** Provides a CloudWatch Logs subscription filter resource. */
  def LogSubscriptionFilter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogSubscriptionFilterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.LogSubscriptionFilterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cloudwatch.LogSubscriptionFilter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a CloudWatch Log Metric Filter resource. */
  def LogMetricFilter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogMetricFilterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.LogMetricFilterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cloudwatch.LogMetricFilter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS CloudWatch Logs Delivery Source. */
  def LogDeliverySource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogDeliverySourceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.LogDeliverySourceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloudwatch.LogDeliverySource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an EventBridge event API Destination resource.
   *  
   *  &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  def EventApiDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventApiDestinationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.EventApiDestinationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cloudwatch.EventApiDestination(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to create an EventBridge permission to support cross-account events in the current account default event bus.
   *  
   *  &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   *  
   *  &gt; **Note:** The EventBridge bus policy resource  (`aws.cloudwatch.EventBusPolicy`) is incompatible with the EventBridge permission resource (`aws.cloudwatch.EventPermission`) and will overwrite permissions.
   */
  def EventPermission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventPermissionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudwatch.EventPermissionArgs.builder
    
    com.pulumi.aws.cloudwatch.EventPermission(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to manage a CloudWatch log resource policy. */
  def LogResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogResourcePolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogResourcePolicyArgs.builder
    
    com.pulumi.aws.cloudwatch.LogResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a CloudWatch Dashboard resource. */
  def Dashboard(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.DashboardArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudwatch.DashboardArgs.builder
    
    com.pulumi.aws.cloudwatch.Dashboard(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS CloudWatch Logs Log Anomaly Detector. */
  def LogAnomalyDetector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogAnomalyDetectorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.LogAnomalyDetectorArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloudwatch.LogAnomalyDetector(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a CloudWatch Metric Alarm resource. */
  def MetricAlarm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.MetricAlarmArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.MetricAlarmArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloudwatch.MetricAlarm(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cloudwatch.EventBusArgs.Builder)
    /**
     * @param deadLetterConfig Configuration details of the Amazon SQS queue for EventBridge to use as a dead-letter queue (DLQ). This block supports the following arguments:
     * @return builder
     */
    def deadLetterConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventBusDeadLetterConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventBusArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventBusDeadLetterConfigArgs.builder
      builder.deadLetterConfig(args(argsBuilder).build)

    /**
     * @param logConfig Block for logging configuration settings for the event bus.
     * @return builder
     */
    def logConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventBusLogConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventBusArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventBusLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

  /** Provides a CloudWatch Logs query definition resource. */
  def QueryDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.QueryDefinitionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.QueryDefinitionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cloudwatch.QueryDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Internet Monitor Monitor resource. */
  def InternetMonitor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.InternetMonitorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.InternetMonitorArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloudwatch.InternetMonitor(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an EventBridge event archive resource.
   *  
   *  &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  def EventArchive(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventArchiveArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.EventArchiveArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cloudwatch.EventArchive(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a CloudWatch Log Data Protection Policy resource.
   *  
   *  Read more about protecting sensitive user data in the [User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html).
   */
  def LogDataProtectionPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogDataProtectionPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogDataProtectionPolicyArgs.builder
    
    com.pulumi.aws.cloudwatch.LogDataProtectionPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cloudwatch.EventConnectionArgs.Builder)
    /**
     * @param authParameters Parameters used for authorization. A maximum of 1 are allowed. Documented below.
     * @return builder
     */
    def authParameters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs.builder
      builder.authParameters(args(argsBuilder).build)

    /**
     * @param invocationConnectivityParameters Parameters to use for invoking a private API. Documented below.
     * @return builder
     */
    def invocationConnectivityParameters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionInvocationConnectivityParametersArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionInvocationConnectivityParametersArgs.builder
      builder.invocationConnectivityParameters(args(argsBuilder).build)

  /**
   * Provides a resource to create an EventBridge Global Endpoint.
   *  
   *  &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  def EventEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.EventEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cloudwatch.EventEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a CloudWatch Log Group resource. */
  def LogGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.LogGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloudwatch.LogGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS CloudWatch Logs Delivery Destination Policy. */
  def LogDeliveryDestinationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogDeliveryDestinationPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogDeliveryDestinationPolicyArgs.builder
    
    com.pulumi.aws.cloudwatch.LogDeliveryDestinationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cloudwatch.LogResourcePolicyArgs.Builder)
    /**
     * @param policyDocument Details of the resource policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. Maximum length of 5120 characters.
     * @return builder
     */
    def policyDocument(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.cloudwatch.LogResourcePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.PolicyDocumentArgs.builder
      builder.policyDocument(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.MetricAlarmArgs.Builder)
    /**
     * @param metricQueries Enables you to create an alarm based on a metric math expression. You may specify at most 20.
     * @return builder
     */
    def metricQueries(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricAlarmMetricQueryArgs.Builder]*):
        com.pulumi.aws.cloudwatch.MetricAlarmArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricAlarmMetricQueryArgs.builder
      builder.metricQueries(args.map(_(argsBuilder).build)*)

  /**
   * Provides a resource to create an EventBridge resource policy to support cross-account events.
   *  
   *  &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   *  
   *  &gt; **Note:** The EventBridge bus policy resource  (`aws.cloudwatch.EventBusPolicy`) is incompatible with the EventBridge permission resource (`aws.cloudwatch.EventPermission`) and will overwrite permissions.
   */
  def EventBusPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventBusPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudwatch.EventBusPolicyArgs.builder
    
    com.pulumi.aws.cloudwatch.EventBusPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type CloudwatchFunctions = com.pulumi.aws.cloudwatch.CloudwatchFunctions
  object CloudwatchFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.cloudwatch.CloudwatchFunctions.*
  extension (self: CloudwatchFunctions.type)
    /** Data source for managing an AWS CloudWatch Contributor Managed Insight Rules. */
    def getContributorManagedInsightRules(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetContributorManagedInsightRulesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetContributorManagedInsightRulesResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetContributorManagedInsightRulesArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getContributorManagedInsightRules(args(argsBuilder).build)

    /** Data source for managing an AWS CloudWatch Contributor Managed Insight Rules. */
    def getContributorManagedInsightRulesPlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetContributorManagedInsightRulesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetContributorManagedInsightRulesResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetContributorManagedInsightRulesPlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getContributorManagedInsightRulesPlain(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about a specific
     *  EventBridge event bus. Use this data source to compute the ARN of
     *  an event bus, given the name of the bus.
     */
    def getEventBus(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventBusArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetEventBusResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventBusArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventBus(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about a specific
     *  EventBridge event bus. Use this data source to compute the ARN of
     *  an event bus, given the name of the bus.
     */
    def getEventBusPlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventBusPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetEventBusResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventBusPlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventBusPlain(args(argsBuilder).build)

    /** Data source for managing an AWS EventBridge Event Buses. */
    def getEventBuses(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventBusesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetEventBusesResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventBusesArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventBuses(args(argsBuilder).build)

    /** Data source for managing an AWS EventBridge Event Buses. */
    def getEventBusesPlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventBusesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetEventBusesResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventBusesPlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventBusesPlain(args(argsBuilder).build)

    /**
     * Use this data source to retrieve information about an EventBridge connection.
     *  
     *  &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
     */
    def getEventConnection(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventConnectionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetEventConnectionResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventConnectionArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventConnection(args(argsBuilder).build)

    /**
     * Use this data source to retrieve information about an EventBridge connection.
     *  
     *  &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
     */
    def getEventConnectionPlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventConnectionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetEventConnectionResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventConnectionPlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventConnectionPlain(args(argsBuilder).build)

    /**
     * Use this data source to get information about an EventBridge Partner Event Source. This data source will only return one partner event source. An error will be returned if multiple sources match the same name prefix.
     *  
     *  &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
     */
    def getEventSource(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventSourceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetEventSourceResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventSourceArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventSource(args(argsBuilder).build)

    /**
     * Use this data source to get information about an EventBridge Partner Event Source. This data source will only return one partner event source. An error will be returned if multiple sources match the same name prefix.
     *  
     *  &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
     */
    def getEventSourcePlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventSourcePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetEventSourceResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventSourcePlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventSourcePlain(args(argsBuilder).build)

    /**
     * Generates a CloudWatch Log Group Data Protection Policy document in JSON format for use with the `aws.cloudwatch.LogDataProtectionPolicy` resource.
     *  
     *  &gt; For more information about data protection policies, see the [Help protect sensitive log data with masking](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html).
     */
    def getLogDataProtectionPolicyDocument(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetLogDataProtectionPolicyDocumentResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getLogDataProtectionPolicyDocument(args(argsBuilder).build)

    /**
     * Generates a CloudWatch Log Group Data Protection Policy document in JSON format for use with the `aws.cloudwatch.LogDataProtectionPolicy` resource.
     *  
     *  &gt; For more information about data protection policies, see the [Help protect sensitive log data with masking](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html).
     */
    def getLogDataProtectionPolicyDocumentPlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetLogDataProtectionPolicyDocumentResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentPlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getLogDataProtectionPolicyDocumentPlain(args(argsBuilder).build)

    /** Use this data source to get information about an AWS Cloudwatch Log Group */
    def getLogGroup(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetLogGroupResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogGroupArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getLogGroup(args(argsBuilder).build)

    /** Use this data source to get information about an AWS Cloudwatch Log Group */
    def getLogGroupPlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetLogGroupResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogGroupPlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getLogGroupPlain(args(argsBuilder).build)

    /** Use this data source to get a list of AWS Cloudwatch Log Groups */
    def getLogGroups(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogGroupsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetLogGroupsResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogGroupsArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getLogGroups(args(argsBuilder).build)

    /** Use this data source to get a list of AWS Cloudwatch Log Groups */
    def getLogGroupsPlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogGroupsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetLogGroupsResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogGroupsPlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getLogGroupsPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.EventTargetArgs.Builder)
    /**
     * @param appsyncTarget Parameters used when you are using the rule to invoke an AppSync GraphQL API mutation. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    def appsyncTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetAppsyncTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetAppsyncTargetArgs.builder
      builder.appsyncTarget(args(argsBuilder).build)

    /**
     * @param batchTarget Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    def batchTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetBatchTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetBatchTargetArgs.builder
      builder.batchTarget(args(argsBuilder).build)

    /**
     * @param deadLetterConfig Parameters used when you are providing a dead letter config. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    def deadLetterConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetDeadLetterConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetDeadLetterConfigArgs.builder
      builder.deadLetterConfig(args(argsBuilder).build)

    /**
     * @param ecsTarget Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    def ecsTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetArgs.builder
      builder.ecsTarget(args(argsBuilder).build)

    /**
     * @param httpTarget Parameters used when you are using the rule to invoke an API Gateway REST endpoint. Documented below. A maximum of 1 is allowed.
     * @return builder
     */
    def httpTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetHttpTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetHttpTargetArgs.builder
      builder.httpTarget(args(argsBuilder).build)

    /**
     * @param inputTransformer Parameters used when you are providing a custom input to a target based on certain event data. Conflicts with `input` and `inputPath`.
     * @return builder
     */
    def inputTransformer(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetInputTransformerArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetInputTransformerArgs.builder
      builder.inputTransformer(args(argsBuilder).build)

    /**
     * @param kinesisTarget Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    def kinesisTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetKinesisTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetKinesisTargetArgs.builder
      builder.kinesisTarget(args(argsBuilder).build)

    /**
     * @param redshiftTarget Parameters used when you are using the rule to invoke an Amazon Redshift Statement. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    def redshiftTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetRedshiftTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetRedshiftTargetArgs.builder
      builder.redshiftTarget(args(argsBuilder).build)

    /**
     * @param retryPolicy Parameters used when you are providing retry policies. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetRetryPolicyArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param runCommandTargets Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
     * @return builder
     */
    def runCommandTargets(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetRunCommandTargetArgs.Builder]*):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetRunCommandTargetArgs.builder
      builder.runCommandTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param sagemakerPipelineTarget Parameters used when you are using the rule to invoke an Amazon SageMaker AI Pipeline. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    def sagemakerPipelineTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetSagemakerPipelineTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetSagemakerPipelineTargetArgs.builder
      builder.sagemakerPipelineTarget(args(argsBuilder).build)

    /**
     * @param sqsTarget Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    def sqsTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetSqsTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetSqsTargetArgs.builder
      builder.sqsTarget(args(argsBuilder).build)

  /** Resource for managing an AWS CloudWatch Logs Delivery Destination. */
  def LogDeliveryDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogDeliveryDestinationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.LogDeliveryDestinationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloudwatch.LogDeliveryDestination(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a CloudWatch Logs destination resource. */
  def LogDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogDestinationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.LogDestinationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloudwatch.LogDestination(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an EventBridge Target resource.
   *  
   *  &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   *  
   *  &gt; **Note:** In order to be able to have your AWS Lambda function or
   *     SNS topic invoked by an EventBridge rule, you must set up the right permissions
   *     using `aws.lambda.Permission`
   *     or `aws.sns.TopicPolicy`.
   *     More info [here](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-use-resource-based.html).
   */
  def EventTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventTargetArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudwatch.EventTargetArgs.builder
    
    com.pulumi.aws.cloudwatch.EventTarget(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cloudwatch.LogMetricFilterArgs.Builder)
    /**
     * @param metricTransformation A block defining collection of information needed to define how metric data gets emitted. See below.
     * @return builder
     */
    def metricTransformation(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogMetricFilterMetricTransformationArgs.Builder]):
        com.pulumi.aws.cloudwatch.LogMetricFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogMetricFilterMetricTransformationArgs.builder
      builder.metricTransformation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.MetricStreamArgs.Builder)
    /**
     * @param excludeFilters List of exclusive metric filters. If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces and the conditional metric names that you specify here. If you don&#39;t specify metric names or provide empty metric names whole metric namespace is excluded. Conflicts with `includeFilter`.
     * @return builder
     */
    def excludeFilters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricStreamExcludeFilterArgs.Builder]*):
        com.pulumi.aws.cloudwatch.MetricStreamArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricStreamExcludeFilterArgs.builder
      builder.excludeFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param includeFilters List of inclusive metric filters. If you specify this parameter, the stream sends only the conditional metric names from the metric namespaces that you specify here. If you don&#39;t specify metric names or provide empty metric names whole metric namespace is included. Conflicts with `excludeFilter`.
     * @return builder
     */
    def includeFilters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricStreamIncludeFilterArgs.Builder]*):
        com.pulumi.aws.cloudwatch.MetricStreamArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricStreamIncludeFilterArgs.builder
      builder.includeFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param statisticsConfigurations For each entry in this array, you specify one or more metrics and the list of additional statistics to stream for those metrics. The additional statistics that you can stream depend on the stream&#39;s `outputFormat`. If the OutputFormat is `json`, you can stream any additional statistic that is supported by CloudWatch, listed in [CloudWatch statistics definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html.html). If the OutputFormat is `opentelemetry0.7` or `opentelemetry1.0`, you can stream percentile statistics (p99 etc.). See details below.
     * @return builder
     */
    def statisticsConfigurations(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricStreamStatisticsConfigurationArgs.Builder]*):
        com.pulumi.aws.cloudwatch.MetricStreamArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricStreamStatisticsConfigurationArgs.builder
      builder.statisticsConfigurations(args.map(_(argsBuilder).build)*)

  /** Provides a CloudWatch Log Account Policy resource. */
  def LogAccountPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogAccountPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogAccountPolicyArgs.builder
    
    com.pulumi.aws.cloudwatch.LogAccountPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cloudwatch.LogTransformerArgs.Builder)
    /**
     * @param transformerConfigs Specifies the configuration of the transformer. You must include at least one configuration, and 20 at most. See `transformerConfig` below for details.
     * @return builder
     */
    def transformerConfigs(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder]*):
        com.pulumi.aws.cloudwatch.LogTransformerArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.builder
      builder.transformerConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.EventPermissionArgs.Builder)
    /**
     * @param condition Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventPermissionConditionArgs.Builder]):
        com.pulumi.aws.cloudwatch.EventPermissionArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventPermissionConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /** Resource for managing an AWS CloudWatch Logs Transformer. */
  def LogTransformer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogTransformerArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogTransformerArgs.builder
    
    com.pulumi.aws.cloudwatch.LogTransformer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS CloudWatch Contributor Managed Insight Rule. */
  def ContributorManagedInsightRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.ContributorManagedInsightRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.ContributorManagedInsightRuleArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloudwatch.ContributorManagedInsightRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventEndpointState.Builder)
    /**
     * @param eventBuses The event buses to use. The names of the event buses must be identical in each Region. Exactly two event buses are required. Documented below.
     * @return builder
     */
    def eventBuses(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventEndpointEventBusArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventEndpointState.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventEndpointEventBusArgs.builder
      builder.eventBuses(args.map(_(argsBuilder).build)*)

    /**
     * @param replicationConfig Parameters used for replication. Documented below.
     * @return builder
     */
    def replicationConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventEndpointReplicationConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventEndpointState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventEndpointReplicationConfigArgs.builder
      builder.replicationConfig(args(argsBuilder).build)

    /**
     * @param routingConfig Parameters used for routing, including the health check and secondary Region. Documented below.
     * @return builder
     */
    def routingConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventEndpointState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigArgs.builder
      builder.routingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogMetricFilterState.Builder)
    /**
     * @param metricTransformation A block defining collection of information needed to define how metric data gets emitted. See below.
     * @return builder
     */
    def metricTransformation(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogMetricFilterMetricTransformationArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogMetricFilterState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogMetricFilterMetricTransformationArgs.builder
      builder.metricTransformation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSubstituteStringArgs.Builder)
    /**
     * @param entries Objects containing the information about the fields to substitute. You must include at least one entry, and ten at most. See `substituteString` `entry` below for details.
     * @return builder
     */
    def entries(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSubstituteStringEntryArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSubstituteStringArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSubstituteStringEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventPermissionState.Builder)
    /**
     * @param condition Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventPermissionConditionArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventPermissionState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventPermissionConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationDeidentifyArgs.Builder)
    /**
     * @param maskConfig An empty object that configures masking.
     * @return builder
     */
    def maskConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationDeidentifyMaskConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationDeidentifyArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationDeidentifyMaskConfigArgs.builder
      builder.maskConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder)
    /**
     * @param addKeys Adds new key-value pairs to the log event. See `addKeys` below for details.
     * @return builder
     */
    def addKeys(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigAddKeysArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigAddKeysArgs.builder
      builder.addKeys(args(argsBuilder).build)

    /**
     * @param copyValue Copies values within a log event. See `copyValue` below for details.
     * @return builder
     */
    def copyValue(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigCopyValueArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigCopyValueArgs.builder
      builder.copyValue(args(argsBuilder).build)

    /**
     * @param csvs Parses comma-separated values (CSV) from the log events into columns. See `csv` below for details.
     * @return builder
     */
    def csvs(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigCsvArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigCsvArgs.builder
      builder.csvs(args.map(_(argsBuilder).build)*)

    /**
     * @param dateTimeConverters Converts a datetime string into a format that you specify. See `dateTimeConverter` below for details.
     * @return builder
     */
    def dateTimeConverters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigDateTimeConverterArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigDateTimeConverterArgs.builder
      builder.dateTimeConverters(args.map(_(argsBuilder).build)*)

    /**
     * @param deleteKeys Deletes entry from a log event. See `deleteKeys` below for details.
     * @return builder
     */
    def deleteKeys(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigDeleteKeyArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigDeleteKeyArgs.builder
      builder.deleteKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param grok Parses and structures unstructured data by using pattern matching. See `grok` below for details.
     * @return builder
     */
    def grok(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigGrokArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigGrokArgs.builder
      builder.grok(args(argsBuilder).build)

    /**
     * @param listToMaps Converts list of objects that contain key fields into a map of target keys. See `listToMap` below for details.
     * @return builder
     */
    def listToMaps(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigListToMapArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigListToMapArgs.builder
      builder.listToMaps(args.map(_(argsBuilder).build)*)

    /**
     * @param lowerCaseStrings Converts a string to lowercase. See `lowerCaseString` below for details.
     * @return builder
     */
    def lowerCaseStrings(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigLowerCaseStringArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigLowerCaseStringArgs.builder
      builder.lowerCaseStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param moveKeys Moves a key from one field to another. See `moveKeys` below for details.
     * @return builder
     */
    def moveKeys(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigMoveKeyArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigMoveKeyArgs.builder
      builder.moveKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param parseCloudfront Parses CloudFront vended logs, extracts fields, and converts them into JSON format. See `parseCloudfront` below for details.
     * @return builder
     */
    def parseCloudfront(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseCloudfrontArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseCloudfrontArgs.builder
      builder.parseCloudfront(args(argsBuilder).build)

    /**
     * @param parseJsons Parses log events that are in JSON format. See `parseJson` below for details.
     * @return builder
     */
    def parseJsons(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseJsonArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseJsonArgs.builder
      builder.parseJsons(args.map(_(argsBuilder).build)*)

    /**
     * @param parseKeyValues Parses a specified field in the original log event into key-value pairs. See `parseKeyValue` below for details.
     * @return builder
     */
    def parseKeyValues(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseKeyValueArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseKeyValueArgs.builder
      builder.parseKeyValues(args.map(_(argsBuilder).build)*)

    /**
     * @param parsePostgres Parses RDS for PostgreSQL vended logs, extracts fields, and and convert them into a JSON format. See `parsePostgres` below for details.
     * @return builder
     */
    def parsePostgres(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParsePostgresArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParsePostgresArgs.builder
      builder.parsePostgres(args(argsBuilder).build)

    /**
     * @param parseRoute53 Parses Route 53 vended logs, extracts fields, and converts them into JSON format. See `parseRoute53` below for details.
     * @return builder
     */
    def parseRoute53(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseRoute53Args.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseRoute53Args.builder
      builder.parseRoute53(args(argsBuilder).build)

    /**
     * @param parseToOcsf Parses logs events and converts them into Open Cybersecurity Schema Framework (OCSF) events. See `parseToOcsf` below for details.
     * @return builder
     */
    def parseToOcsf(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseToOcsfArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseToOcsfArgs.builder
      builder.parseToOcsf(args(argsBuilder).build)

    /**
     * @param parseVpc Parses Amazon VPC vended logs, extracts fields, and converts them into JSON format. See `parseVpc` below for details.
     * @return builder
     */
    def parseVpc(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseVpcArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseVpcArgs.builder
      builder.parseVpc(args(argsBuilder).build)

    /**
     * @param parseWaf Parses AWS WAF vended logs, extracts fields, and converts them into JSON format. See `parseWaf` below for details.
     * @return builder
     */
    def parseWaf(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseWafArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigParseWafArgs.builder
      builder.parseWaf(args(argsBuilder).build)

    /**
     * @param renameKeys Renames keys in a log event. See `renameKeys` below for details.
     * @return builder
     */
    def renameKeys(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigRenameKeyArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigRenameKeyArgs.builder
      builder.renameKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param splitStrings Splits a field into an array of strings using a delimiting character. See `splitString` below for details.
     * @return builder
     */
    def splitStrings(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSplitStringArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSplitStringArgs.builder
      builder.splitStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param substituteStrings Matches a key\u2019s value against a regular expression and replaces all matches with a replacement string. See `substituteString` below for details.
     * @return builder
     */
    def substituteStrings(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSubstituteStringArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSubstituteStringArgs.builder
      builder.substituteStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param trimStrings Removes leading and trailing whitespace from a string. See `trimString` below for details.
     * @return builder
     */
    def trimStrings(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigTrimStringArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigTrimStringArgs.builder
      builder.trimStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param typeConverters Converts a value type associated with the specified key to the specified type. See `typeConverter` below for details.
     * @return builder
     */
    def typeConverters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigTypeConverterArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigTypeConverterArgs.builder
      builder.typeConverters(args.map(_(argsBuilder).build)*)

    /**
     * @param upperCaseStrings Converts a string to uppercase. See `upperCaseString` below for details.
     * @return builder
     */
    def upperCaseStrings(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigUpperCaseStringArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigUpperCaseStringArgs.builder
      builder.upperCaseStrings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventTargetSagemakerPipelineTargetArgs.Builder)
    /**
     * @param pipelineParameterLists List of Parameter names and values for SageMaker AI Model Building Pipeline execution.
     * @return builder
     */
    def pipelineParameterLists(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetSagemakerPipelineTargetPipelineParameterListArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventTargetSagemakerPipelineTargetArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetSagemakerPipelineTargetPipelineParameterListArgs.builder
      builder.pipelineParameterLists(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentConfigurationArgs.Builder)
    /**
     * @param customDataIdentifiers Configures custom regular expressions to detect sensitive data. Read more in [Custom data identifiers](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-custom-data-identifiers.html).
     * @return builder
     */
    def customDataIdentifiers(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentConfigurationCustomDataIdentifierArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentConfigurationCustomDataIdentifierArgs.builder
      builder.customDataIdentifiers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.InternetMonitorInternetMeasurementsLogDeliveryArgs.Builder)
    def s3Config(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.InternetMonitorInternetMeasurementsLogDeliveryS3ConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.InternetMonitorInternetMeasurementsLogDeliveryArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.InternetMonitorInternetMeasurementsLogDeliveryS3ConfigArgs.builder
      builder.s3Config(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogDeliveryState.Builder)
    /**
     * @param s3DeliveryConfigurations Parameters that are valid only when the delivery&#39;s delivery destination is an S3 bucket.
     * @return builder
     */
    def s3DeliveryConfigurations(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogDeliveryS3DeliveryConfigurationArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogDeliveryState.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogDeliveryS3DeliveryConfigurationArgs.builder
      builder.s3DeliveryConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder)
    /**
     * @param appsyncTarget Parameters used when you are using the rule to invoke an AppSync GraphQL API mutation. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    def appsyncTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetAppsyncTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetAppsyncTargetArgs.builder
      builder.appsyncTarget(args(argsBuilder).build)

    /**
     * @param batchTarget Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    def batchTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetBatchTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetBatchTargetArgs.builder
      builder.batchTarget(args(argsBuilder).build)

    /**
     * @param deadLetterConfig Parameters used when you are providing a dead letter config. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    def deadLetterConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetDeadLetterConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetDeadLetterConfigArgs.builder
      builder.deadLetterConfig(args(argsBuilder).build)

    /**
     * @param ecsTarget Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    def ecsTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetArgs.builder
      builder.ecsTarget(args(argsBuilder).build)

    /**
     * @param httpTarget Parameters used when you are using the rule to invoke an API Gateway REST endpoint. Documented below. A maximum of 1 is allowed.
     * @return builder
     */
    def httpTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetHttpTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetHttpTargetArgs.builder
      builder.httpTarget(args(argsBuilder).build)

    /**
     * @param inputTransformer Parameters used when you are providing a custom input to a target based on certain event data. Conflicts with `input` and `inputPath`.
     * @return builder
     */
    def inputTransformer(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetInputTransformerArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetInputTransformerArgs.builder
      builder.inputTransformer(args(argsBuilder).build)

    /**
     * @param kinesisTarget Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    def kinesisTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetKinesisTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetKinesisTargetArgs.builder
      builder.kinesisTarget(args(argsBuilder).build)

    /**
     * @param redshiftTarget Parameters used when you are using the rule to invoke an Amazon Redshift Statement. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    def redshiftTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetRedshiftTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetRedshiftTargetArgs.builder
      builder.redshiftTarget(args(argsBuilder).build)

    /**
     * @param retryPolicy Parameters used when you are providing retry policies. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetRetryPolicyArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param runCommandTargets Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
     * @return builder
     */
    def runCommandTargets(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetRunCommandTargetArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetRunCommandTargetArgs.builder
      builder.runCommandTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param sagemakerPipelineTarget Parameters used when you are using the rule to invoke an Amazon SageMaker AI Pipeline. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    def sagemakerPipelineTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetSagemakerPipelineTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetSagemakerPipelineTargetArgs.builder
      builder.sagemakerPipelineTarget(args(argsBuilder).build)

    /**
     * @param sqsTarget Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
     * @return builder
     */
    def sqsTarget(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetSqsTargetArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetSqsTargetArgs.builder
      builder.sqsTarget(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventConnectionInvocationConnectivityParametersArgs.Builder)
    /**
     * @param resourceParameters The parameters for EventBridge to use when invoking the resource endpoint. Documented below.
     * @return builder
     */
    def resourceParameters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionInvocationConnectivityParametersResourceParametersArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionInvocationConnectivityParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionInvocationConnectivityParametersResourceParametersArgs.builder
      builder.resourceParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetArgs.Builder)
    /**
     * @param capacityProviderStrategies The capacity provider strategy to use for the task. If a `capacityProviderStrategy` specified, the `launchType` parameter must be omitted. If no `capacityProviderStrategy` or `launchType` is specified, the default capacity provider strategy for the cluster is used. Can be one or more. See below.
     * @return builder
     */
    def capacityProviderStrategies(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetCapacityProviderStrategyArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetCapacityProviderStrategyArgs.builder
      builder.capacityProviderStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfiguration Use this if the ECS task uses the awsvpc network mode. This specifies the VPC subnets and security groups associated with the task, and whether a public IP address is to be used. Required if `launchType` is `FARGATE` because the awsvpc mode is required for Fargate tasks.
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param orderedPlacementStrategies An array of placement strategy objects to use for the task. You can specify a maximum of five strategy rules per task.
     * @return builder
     */
    def orderedPlacementStrategies(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetOrderedPlacementStrategyArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetOrderedPlacementStrategyArgs.builder
      builder.orderedPlacementStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param placementConstraints An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task (including constraints in the task definition and those specified at runtime). See Below.
     * @return builder
     */
    def placementConstraints(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetPlacementConstraintArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetPlacementConstraintArgs.builder
      builder.placementConstraints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigAddKeysArgs.Builder)
    /**
     * @param entries Objects containing the information about the keys to add to the log event. You must include at least one entry, and five at most. See `addKeys` `entry` below for details.
     * @return builder
     */
    def entries(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigAddKeysEntryArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigAddKeysArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigAddKeysEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigRenameKeyArgs.Builder)
    /**
     * @param entries Objects containing the information about the keys to rename. You must include at least one entry, and five at most. See `renameKeys` `entry` below for details.
     * @return builder
     */
    def entries(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigRenameKeyEntryArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigRenameKeyArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigRenameKeyEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditArgs.Builder)
    /**
     * @param findingsDestination Configures destinations to send audit findings to.
     * @return builder
     */
    def findingsDestination(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationArgs.builder
      builder.findingsDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigCopyValueArgs.Builder)
    /**
     * @param entries Objects containing the information about the values to copy to the log event. You must include at least one entry, and five at most. See `copyValue` `entry` below for details.
     * @return builder
     */
    def entries(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigCopyValueEntryArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigCopyValueArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigCopyValueEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigMoveKeyArgs.Builder)
    /**
     * @param entries Objects containing the information about the keys to move to the log event. You must include at least one entry, and five at most. See `moveKeys` `entry` below for details.
     * @return builder
     */
    def entries(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigMoveKeyEntryArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigMoveKeyArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigMoveKeyEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogResourcePolicyState.Builder)
    /**
     * @param policyDocument Details of the resource policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. Maximum length of 5120 characters.
     * @return builder
     */
    def policyDocument(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogResourcePolicyState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.PolicyDocumentArgs.builder
      builder.policyDocument(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventBusState.Builder)
    /**
     * @param deadLetterConfig Configuration details of the Amazon SQS queue for EventBridge to use as a dead-letter queue (DLQ). This block supports the following arguments:
     * @return builder
     */
    def deadLetterConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventBusDeadLetterConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventBusState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventBusDeadLetterConfigArgs.builder
      builder.deadLetterConfig(args(argsBuilder).build)

    /**
     * @param logConfig Block for logging configuration settings for the event bus.
     * @return builder
     */
    def logConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventBusLogConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventBusState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventBusLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.CompositeAlarmState.Builder)
    /**
     * @param actionsSuppressor Actions will be suppressed if the suppressor alarm is in the ALARM state.
     * @return builder
     */
    def actionsSuppressor(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.CompositeAlarmActionsSuppressorArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.CompositeAlarmState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.CompositeAlarmActionsSuppressorArgs.builder
      builder.actionsSuppressor(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigArgs.Builder)
    /**
     * @param failoverConfig Parameters used for failover. This includes what triggers failover and what happens when it&#39;s triggered. Documented below.
     * @return builder
     */
    def failoverConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigArgs.builder
      builder.failoverConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.MetricStreamStatisticsConfigurationArgs.Builder)
    /**
     * @param includeMetrics An array that defines the metrics that are to have additional statistics streamed. See details below.
     * @return builder
     */
    def includeMetrics(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricStreamStatisticsConfigurationIncludeMetricArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.MetricStreamStatisticsConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricStreamStatisticsConfigurationIncludeMetricArgs.builder
      builder.includeMetrics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.MetricStreamState.Builder)
    /**
     * @param excludeFilters List of exclusive metric filters. If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces and the conditional metric names that you specify here. If you don&#39;t specify metric names or provide empty metric names whole metric namespace is excluded. Conflicts with `includeFilter`.
     * @return builder
     */
    def excludeFilters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricStreamExcludeFilterArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.MetricStreamState.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricStreamExcludeFilterArgs.builder
      builder.excludeFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param includeFilters List of inclusive metric filters. If you specify this parameter, the stream sends only the conditional metric names from the metric namespaces that you specify here. If you don&#39;t specify metric names or provide empty metric names whole metric namespace is included. Conflicts with `excludeFilter`.
     * @return builder
     */
    def includeFilters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricStreamIncludeFilterArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.MetricStreamState.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricStreamIncludeFilterArgs.builder
      builder.includeFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param statisticsConfigurations For each entry in this array, you specify one or more metrics and the list of additional statistics to stream for those metrics. The additional statistics that you can stream depend on the stream&#39;s `outputFormat`. If the OutputFormat is `json`, you can stream any additional statistic that is supported by CloudWatch, listed in [CloudWatch statistics definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html.html). If the OutputFormat is `opentelemetry0.7` or `opentelemetry1.0`, you can stream percentile statistics (p99 etc.). See details below.
     * @return builder
     */
    def statisticsConfigurations(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricStreamStatisticsConfigurationArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.MetricStreamState.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricStreamStatisticsConfigurationArgs.builder
      builder.statisticsConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogTransformerState.Builder)
    /**
     * @param transformerConfigs Specifies the configuration of the transformer. You must include at least one configuration, and 20 at most. See `transformerConfig` below for details.
     * @return builder
     */
    def transformerConfigs(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerState.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigArgs.builder
      builder.transformerConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigArgs.Builder)
    /**
     * @param primary Parameters used for the primary Region. Documented below.
     * @return builder
     */
    def primary(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigPrimaryArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigPrimaryArgs.builder
      builder.primary(args(argsBuilder).build)

    /**
     * @param secondary Parameters used for the secondary Region, the Region that events are routed to when failover is triggered or event replication is enabled. Documented below.
     * @return builder
     */
    def secondary(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigSecondaryArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigSecondaryArgs.builder
      builder.secondary(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthArgs.Builder)
    /**
     * @param clientParameters Contains the client parameters for OAuth authorization. Contains the following two parameters.
     * @return builder
     */
    def clientParameters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthClientParametersArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthClientParametersArgs.builder
      builder.clientParameters(args(argsBuilder).build)

    /**
     * @param oauthHttpParameters OAuth Http Parameters are additional credentials used to sign the request to the authorization endpoint to exchange the OAuth Client information for an access token. Secret values are stored and managed by AWS Secrets Manager. A maximum of 1 are allowed. Documented below.
     * @return builder
     */
    def oauthHttpParameters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersArgs.builder
      builder.oauthHttpParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationArgs.Builder)
    /**
     * @param audit Configures the detection of sensitive data.
     * @return builder
     */
    def audit(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditArgs.builder
      builder.audit(args(argsBuilder).build)

    /**
     * @param deidentify Configures the masking of sensitive data.
     *  
     *  &gt; Every policy statement must specify exactly one operation.
     * @return builder
     */
    def deidentify(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationDeidentifyArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationDeidentifyArgs.builder
      builder.deidentify(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogDeliveryDestinationState.Builder)
    /**
     * @param deliveryDestinationConfiguration The AWS resource that will receive the logs. Required for CloudWatch Logs, Amazon S3, and Firehose destinations. Not required for X-Ray trace delivery destinations.
     * @return builder
     */
    def deliveryDestinationConfiguration(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogDeliveryDestinationDeliveryDestinationConfigurationArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.LogDeliveryDestinationState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogDeliveryDestinationDeliveryDestinationConfigurationArgs.builder
      builder.deliveryDestinationConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersArgs.Builder)
    /**
     * @param bodies Contains additional body string parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * @return builder
     */
    def bodies(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersBodyArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersBodyArgs.builder
      builder.bodies(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Contains additional header parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersHeaderArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryStrings Contains additional query string parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * @return builder
     */
    def queryStrings(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersQueryStringArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersQueryStringArgs.builder
      builder.queryStrings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.InternetMonitorState.Builder)
    /**
     * @param healthEventsConfig Health event thresholds. A health event threshold percentage, for performance and availability, determines when Internet Monitor creates a health event when there&#39;s an internet issue that affects your application end users. See Health Events Config below.
     * @return builder
     */
    def healthEventsConfig(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.InternetMonitorHealthEventsConfigArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.InternetMonitorState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.InternetMonitorHealthEventsConfigArgs.builder
      builder.healthEventsConfig(args(argsBuilder).build)

    /**
     * @param internetMeasurementsLogDelivery Publish internet measurements for Internet Monitor to an Amazon S3 bucket in addition to CloudWatch Logs.
     * @return builder
     */
    def internetMeasurementsLogDelivery(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.InternetMonitorInternetMeasurementsLogDeliveryArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.InternetMonitorState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.InternetMonitorInternetMeasurementsLogDeliveryArgs.builder
      builder.internetMeasurementsLogDelivery(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationArgs.Builder)
    /**
     * @param cloudwatchLogs Configures CloudWatch Logs as a findings destination.
     * @return builder
     */
    def cloudwatchLogs(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationCloudwatchLogsArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationCloudwatchLogsArgs.builder
      builder.cloudwatchLogs(args(argsBuilder).build)

    /**
     * @param firehose Configures Kinesis Firehose as a findings destination.
     * @return builder
     */
    def firehose(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationFirehoseArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationFirehoseArgs.builder
      builder.firehose(args(argsBuilder).build)

    /**
     * @param s3 Configures S3 as a findings destination.
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationS3Args.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditFindingsDestinationS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.MetricAlarmState.Builder)
    /**
     * @param metricQueries Enables you to create an alarm based on a metric math expression. You may specify at most 20.
     * @return builder
     */
    def metricQueries(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricAlarmMetricQueryArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.MetricAlarmState.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricAlarmMetricQueryArgs.builder
      builder.metricQueries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentArgs.Builder)
    def configuration(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentConfigurationArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param statements Configures the data protection policy.
     *  
     *  &gt; There must be exactly two statements: the first with an `audit` operation, and the second with a `deidentify` operation.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def statements(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementArgs.builder
      builder.statements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersArgs.Builder)
    /**
     * @param bodies Contains additional body string parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * @return builder
     */
    def bodies(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs.builder
      builder.bodies(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Contains additional header parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param queryStrings Contains additional query string parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * @return builder
     */
    def queryStrings(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersQueryStringArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersQueryStringArgs.builder
      builder.queryStrings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs.Builder)
    /**
     * @param apiKey Parameters used for API_KEY authorization. An API key to include in the header for each authentication request. A maximum of 1 are allowed. Conflicts with `basic` and `oauth`. Documented below.
     * @return builder
     */
    def apiKey(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersApiKeyArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersApiKeyArgs.builder
      builder.apiKey(args(argsBuilder).build)

    /**
     * @param basic Parameters used for BASIC authorization. A maximum of 1 are allowed. Conflicts with `apiKey` and `oauth`. Documented below.
     * @return builder
     */
    def basic(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersBasicArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersBasicArgs.builder
      builder.basic(args(argsBuilder).build)

    /**
     * @param invocationHttpParameters Invocation Http Parameters are additional credentials used to sign each Invocation of the ApiDestination created from this Connection. If the ApiDestination Rule Target has additional HttpParameters, the values will be merged together, with the Connection Invocation Http Parameters taking precedence. Secret values are stored and managed by AWS Secrets Manager. A maximum of 1 are allowed. Documented below.
     * @return builder
     */
    def invocationHttpParameters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersArgs.builder
      builder.invocationHttpParameters(args(argsBuilder).build)

    /**
     * @param oauth Parameters used for OAUTH_CLIENT_CREDENTIALS authorization. A maximum of 1 are allowed. Conflicts with `basic` and `apiKey`. Documented below.
     * @return builder
     */
    def oauth(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthArgs.builder
      builder.oauth(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.PolicyDocumentArgs.Builder)
    def Statement(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyStatementArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.PolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.PolicyStatementArgs.builder
      builder.Statement(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSplitStringArgs.Builder)
    /**
     * @param entries Objects containing the information about the fields to split. You must include at least one entry, and ten at most. See `splitString` `entry` below for details.
     * @return builder
     */
    def entries(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSplitStringEntryArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSplitStringArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigSplitStringEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.MetricAlarmMetricQueryArgs.Builder)
    /**
     * @param metric The metric to be returned, along with statistics, period, and units. Use this parameter only if this object is retrieving a metric and not performing a math expression on returned data.
     * @return builder
     */
    def metric(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.MetricAlarmMetricQueryMetricArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.MetricAlarmMetricQueryArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.MetricAlarmMetricQueryMetricArgs.builder
      builder.metric(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigTypeConverterArgs.Builder)
    /**
     * @param entries Objects containing the information about the fields to change the type of. You must include at least one entry, and five at most. See `typeConverter` `entry` below for details.
     * @return builder
     */
    def entries(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigTypeConverterEntryArgs.Builder]*):
        com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigTypeConverterArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatch.inputs.LogTransformerTransformerConfigTypeConverterEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementArgs.Builder)
    /**
     * @param operation Configures the data protection operation applied by this statement.
     * @return builder
     */
    def operation(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationArgs.builder
      builder.operation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatch.inputs.EventConnectionState.Builder)
    /**
     * @param authParameters Parameters used for authorization. A maximum of 1 are allowed. Documented below.
     * @return builder
     */
    def authParameters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs.builder
      builder.authParameters(args(argsBuilder).build)

    /**
     * @param invocationConnectivityParameters Parameters to use for invoking a private API. Documented below.
     * @return builder
     */
    def invocationConnectivityParameters(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.EventConnectionInvocationConnectivityParametersArgs.Builder]):
        com.pulumi.aws.cloudwatch.inputs.EventConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.EventConnectionInvocationConnectivityParametersArgs.builder
      builder.invocationConnectivityParameters(args(argsBuilder).build)
