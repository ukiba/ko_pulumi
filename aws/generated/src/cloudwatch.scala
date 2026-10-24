package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object cloudwatch:
  /** Manages an AWS CloudWatch Alarm Mute Rule. */
  inline def AlarmMuteRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.AlarmMuteRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.AlarmMuteRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cloudwatch.AlarmMuteRule(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object CloudwatchFunctions:
    /** Data source for managing an AWS CloudWatch Contributor Managed Insight Rules. */
    inline def getContributorManagedInsightRules(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetContributorManagedInsightRulesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetContributorManagedInsightRulesResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetContributorManagedInsightRulesArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getContributorManagedInsightRules(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS CloudWatch Contributor Managed Insight Rules. */
    inline def getContributorManagedInsightRulesPlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetContributorManagedInsightRulesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetContributorManagedInsightRulesResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetContributorManagedInsightRulesPlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getContributorManagedInsightRulesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * This data source can be used to fetch information about a specific
     * EventBridge event bus. Use this data source to compute the ARN of
     * an event bus, given the name of the bus.
     */
    inline def getEventBus(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventBusArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetEventBusResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventBusArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventBus(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * This data source can be used to fetch information about a specific
     * EventBridge event bus. Use this data source to compute the ARN of
     * an event bus, given the name of the bus.
     */
    inline def getEventBusPlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventBusPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetEventBusResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventBusPlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventBusPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS EventBridge Event Buses. */
    inline def getEventBuses(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventBusesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetEventBusesResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventBusesArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventBuses(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS EventBridge Event Buses. */
    inline def getEventBusesPlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventBusesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetEventBusesResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventBusesPlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventBusesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to retrieve information about an EventBridge connection.
     * 
     * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
     */
    inline def getEventConnection(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventConnectionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetEventConnectionResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventConnectionArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventConnection(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to retrieve information about an EventBridge connection.
     * 
     * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
     */
    inline def getEventConnectionPlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventConnectionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetEventConnectionResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventConnectionPlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventConnectionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to get information about an EventBridge Partner Event Source. This data source will only return one partner event source. An error will be returned if multiple sources match the same name prefix.
     * 
     * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
     */
    inline def getEventSource(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventSourceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetEventSourceResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventSourceArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventSource(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get information about an EventBridge Partner Event Source. This data source will only return one partner event source. An error will be returned if multiple sources match the same name prefix.
     * 
     * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
     */
    inline def getEventSourcePlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventSourcePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetEventSourceResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventSourcePlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventSourcePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Generates a CloudWatch Log Group Data Protection Policy document in JSON format for use with the `aws.cloudwatch.LogDataProtectionPolicy` resource.
     * 
     * &gt; For more information about data protection policies, see the [Help protect sensitive log data with masking](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html).
     */
    inline def getLogDataProtectionPolicyDocument(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetLogDataProtectionPolicyDocumentResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getLogDataProtectionPolicyDocument(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Generates a CloudWatch Log Group Data Protection Policy document in JSON format for use with the `aws.cloudwatch.LogDataProtectionPolicy` resource.
     * 
     * &gt; For more information about data protection policies, see the [Help protect sensitive log data with masking](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html).
     */
    inline def getLogDataProtectionPolicyDocumentPlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetLogDataProtectionPolicyDocumentResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentPlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getLogDataProtectionPolicyDocumentPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information about an AWS CloudWatch Log Group */
    inline def getLogGroup(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetLogGroupResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogGroupArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getLogGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information about an AWS CloudWatch Log Group */
    inline def getLogGroupPlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetLogGroupResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogGroupPlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getLogGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get a list of AWS CloudWatch Log Groups */
    inline def getLogGroups(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogGroupsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetLogGroupsResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogGroupsArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getLogGroups(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get a list of AWS CloudWatch Log Groups */
    inline def getLogGroupsPlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogGroupsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetLogGroupsResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogGroupsPlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getLogGroupsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Provides a CloudWatch Composite Alarm resource.
   * 
   * &gt; **NOTE:** An alarm (composite or metric) cannot be destroyed when there are other composite alarms depending on it. This can lead to a cyclical dependency on update, as the provider will unsuccessfully attempt to destroy alarms before updating the rule. Consider using `dependsOn`, references to alarm names, and two-stage updates.
   */
  inline def CompositeAlarm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.CompositeAlarmArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.CompositeAlarmArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cloudwatch.CompositeAlarm(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS CloudWatch Contributor Insight Rule. */
  inline def ContributorInsightRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.ContributorInsightRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.ContributorInsightRuleArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cloudwatch.ContributorInsightRule(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS CloudWatch Contributor Managed Insight Rule. */
  inline def ContributorManagedInsightRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.ContributorManagedInsightRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.ContributorManagedInsightRuleArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cloudwatch.ContributorManagedInsightRule(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CloudWatch Dashboard resource. */
  inline def Dashboard(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.DashboardArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.DashboardArgs.builder
    com.pulumi.aws.cloudwatch.Dashboard(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an EventBridge event API Destination resource.
   * 
   * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  inline def EventApiDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventApiDestinationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.EventApiDestinationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudwatch.EventApiDestination(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an EventBridge event archive resource.
   * 
   * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  inline def EventArchive(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventArchiveArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.EventArchiveArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudwatch.EventArchive(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an EventBridge event bus resource.
   * 
   * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  inline def EventBus(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventBusArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.EventBusArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cloudwatch.EventBus(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a resource to create an EventBridge resource policy to support cross-account events.
   * 
   * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   * 
   * &gt; **Note:** The EventBridge bus policy resource  (`aws.cloudwatch.EventBusPolicy`) is incompatible with the EventBridge permission resource (`aws.cloudwatch.EventPermission`) and will overwrite permissions.
   */
  inline def EventBusPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventBusPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.EventBusPolicyArgs.builder
    com.pulumi.aws.cloudwatch.EventBusPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an EventBridge connection resource.
   * 
   * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  inline def EventConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.EventConnectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudwatch.EventConnection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a resource to create an EventBridge Global Endpoint.
   * 
   * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  inline def EventEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventEndpointArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.EventEndpointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudwatch.EventEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a resource to create an EventBridge permission to support cross-account events in the current account default event bus.
   * 
   * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   * 
   * &gt; **Note:** The EventBridge bus policy resource  (`aws.cloudwatch.EventBusPolicy`) is incompatible with the EventBridge permission resource (`aws.cloudwatch.EventPermission`) and will overwrite permissions.
   */
  inline def EventPermission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventPermissionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.EventPermissionArgs.builder
    com.pulumi.aws.cloudwatch.EventPermission(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an EventBridge Rule resource.
   * 
   * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  inline def EventRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.EventRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cloudwatch.EventRule(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an EventBridge Target resource.
   * 
   * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   * 
   * &gt; **Note:** In order to be able to have your AWS Lambda function or
   *    SNS topic invoked by an EventBridge rule, you must set up the right permissions
   *    using `aws.lambda.Permission`
   *    or `aws.sns.TopicPolicy`.
   *    More info [here](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-use-resource-based.html).
   */
  inline def EventTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventTargetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.EventTargetArgs.builder
    com.pulumi.aws.cloudwatch.EventTarget(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Internet Monitor Monitor resource. */
  inline def InternetMonitor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.InternetMonitorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.InternetMonitorArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cloudwatch.InternetMonitor(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CloudWatch Log Account Policy resource. */
  inline def LogAccountPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogAccountPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogAccountPolicyArgs.builder
    com.pulumi.aws.cloudwatch.LogAccountPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS CloudWatch Logs Log Anomaly Detector. */
  inline def LogAnomalyDetector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogAnomalyDetectorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.LogAnomalyDetectorArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cloudwatch.LogAnomalyDetector(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a CloudWatch Log Data Protection Policy resource.
   * 
   * Read more about protecting sensitive user data in the [User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html).
   */
  inline def LogDataProtectionPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogDataProtectionPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogDataProtectionPolicyArgs.builder
    com.pulumi.aws.cloudwatch.LogDataProtectionPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS CloudWatch Logs Delivery. A delivery is a connection between an `aws.cloudwatch.LogDeliverySource` and an `aws.cloudwatch.LogDeliveryDestination`. */
  inline def LogDelivery(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogDeliveryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.LogDeliveryArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cloudwatch.LogDelivery(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS CloudWatch Logs Delivery Destination. */
  inline def LogDeliveryDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogDeliveryDestinationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.LogDeliveryDestinationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cloudwatch.LogDeliveryDestination(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS CloudWatch Logs Delivery Destination Policy. */
  inline def LogDeliveryDestinationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogDeliveryDestinationPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogDeliveryDestinationPolicyArgs.builder
    com.pulumi.aws.cloudwatch.LogDeliveryDestinationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS CloudWatch Logs Delivery Source. */
  inline def LogDeliverySource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogDeliverySourceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.LogDeliverySourceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cloudwatch.LogDeliverySource(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CloudWatch Logs destination resource. */
  inline def LogDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogDestinationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.LogDestinationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cloudwatch.LogDestination(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CloudWatch Logs destination policy resource. */
  inline def LogDestinationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogDestinationPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogDestinationPolicyArgs.builder
    com.pulumi.aws.cloudwatch.LogDestinationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CloudWatch Log Group resource. */
  inline def LogGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.LogGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cloudwatch.LogGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS CloudWatch Logs Index Policy. */
  inline def LogIndexPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogIndexPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogIndexPolicyArgs.builder
    com.pulumi.aws.cloudwatch.LogIndexPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CloudWatch Log Metric Filter resource. */
  inline def LogMetricFilter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogMetricFilterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.LogMetricFilterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudwatch.LogMetricFilter(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a resource to manage a CloudWatch log resource policy. */
  inline def LogResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogResourcePolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogResourcePolicyArgs.builder
    com.pulumi.aws.cloudwatch.LogResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a CloudWatch Logs S3 Table Integration data source association.
   * This resource associates a data source (such as a CloudWatch log type) with an S3 Table Integration, enabling CloudWatch logs to be automatically written to S3 Tables for analytics.
   * 
   * For more information, see the [CloudWatch Logs S3 Tables integration documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/s3-tables-integration.html).
   */
  inline def LogS3TableIntegrationSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogS3TableIntegrationSourceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogS3TableIntegrationSourceArgs.builder
    com.pulumi.aws.cloudwatch.LogS3TableIntegrationSource(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a CloudWatch Logs account-level storage tier policy. When set to `INTELLIGENT_TIERING`, CloudWatch Logs automatically moves log data to the most cost-effective storage tier based on access frequency.
   * 
   * &gt; Deletion of this resource will reset the storage tier policy to `STANDARD` (the default state).
   */
  inline def LogStorageTierPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogStorageTierPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogStorageTierPolicyArgs.builder
    com.pulumi.aws.cloudwatch.LogStorageTierPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CloudWatch Log Stream resource. */
  inline def LogStream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogStreamArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.LogStreamArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudwatch.LogStream(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CloudWatch Logs subscription filter resource. */
  inline def LogSubscriptionFilter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogSubscriptionFilterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.LogSubscriptionFilterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudwatch.LogSubscriptionFilter(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS CloudWatch Logs Transformer. */
  inline def LogTransformer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogTransformerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogTransformerArgs.builder
    com.pulumi.aws.cloudwatch.LogTransformer(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CloudWatch Metric Alarm resource. */
  inline def MetricAlarm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.MetricAlarmArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.MetricAlarmArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cloudwatch.MetricAlarm(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CloudWatch Metric Stream resource. */
  inline def MetricStream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.MetricStreamArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.MetricStreamArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cloudwatch.MetricStream(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages AWS CloudWatch OTel enrichment. This is a singleton resource that enables OTel enrichment at the account level.
   * 
   * &gt; **NOTE:** This resource requires the `aws.observabilityadmin.TelemetryEnrichment` resource to be configured first. Without telemetry enrichment enabled, OTel enrichment will not function properly even if the API accepts the configuration.
   * 
   * &gt; **NOTE:** Creating this Terraform resource starts AWS CloudWatch OTel enrichment and deleting this Terraform resource stops AWS CloudWatch OTel enrichment.
   * 
   * Filters are evaluated as follows. `includeFilter` is applied first, then the `excludeFilter` match set is subtracted from the result. Exclusion always wins, so a metric matched by both is not enriched. An inactive direction is permissive: with no `includeFilter`, every supported namespace is in scope, and with no `excludeFilter`, nothing is removed. Namespaces and metric names are matched exactly and case-sensitively, with no wildcards or prefixes, so `AWS/EC2` matches only `AWS/EC2`. At most 100 selectors are allowed across `includeFilter` and `excludeFilter` **combined**. Two lists of 60 selectors each satisfy the per-list limit but are rejected together.
   */
  inline def OtelEnrichment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.OtelEnrichmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.OtelEnrichmentArgs.builder
    com.pulumi.aws.cloudwatch.OtelEnrichment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CloudWatch Logs query definition resource. */
  inline def QueryDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.QueryDefinitionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.QueryDefinitionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudwatch.QueryDefinition(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a CloudWatch resource metrics configuration. Creating a configuration makes CloudWatch collect detailed metrics for the targeted AWS resource.
   * 
   * Each AWS resource can have at most one resource metrics configuration. Detailed metrics incur charges, so limit collection with `metricSelection` when you only need a subset of metrics. See [Amazon CloudWatch pricing](https://aws.amazon.com/cloudwatch/pricing/) for details.
   * 
   * &gt; **Note:** Not every AWS resource type is eligible for detailed metrics. At the time of writing, only Amazon ElastiCache replication groups are supported. Targeting any other resource type, including ElastiCache serverless caches and cache clusters, returns a `ValidationError` with the message `Unsupported resource type`.
   */
  inline def ResourceMetricsConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.ResourceMetricsConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.ResourceMetricsConfigurationArgs.builder
    com.pulumi.aws.cloudwatch.ResourceMetricsConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
